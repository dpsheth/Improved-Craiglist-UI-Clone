package com.example;
import org.omg.CORBA.VM_CUSTOM;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CraigslistFinal2 extends Application {
public static void main(String[] args) {
launch(args);
}

@Override
public void start(Stage primaryStage) {
  primaryStage.setTitle("Craigslist");

  Button community = new Button(" Community ");
  Button housing = new Button(" Housing ");
  Button jobs = new Button(" Jobs ");
  Button services = new Button(" Services ");
  Button forSale = new Button(" For Sale ");
  Button discussionForum = new Button(" Discussion Forums ");
  Button gigs = new Button(" Gigs ");
  Button resumes = new Button(" Resumes ");
  Button posting = new Button(" Create a Posting ");

  community.setOnMouseEntered(event -> {
    community.setStyle("-fx-text-fill: blueviolet");
  });
  community.setOnMouseExited(event -> {
    community.setStyle("-fx-text-fill: blue");
  });

  housing.setOnMouseEntered(event -> {
    housing.setStyle("-fx-text-fill: blueviolet");
  });
  housing.setOnMouseExited(event -> {
    housing.setStyle("-fx-text-fill: blue");
  });

  jobs.setOnMouseEntered(event -> {
    jobs.setStyle("-fx-text-fill: blueviolet");
  });
  jobs.setOnMouseExited(event -> {
    jobs.setStyle("-fx-text-fill: blue");
  });

  services.setOnMouseEntered(event -> {
    services.setStyle("-fx-text-fill: blueviolet");
  });
  services.setOnMouseExited(event -> {
    services.setStyle("-fx-text-fill: blue");
  });

  forSale.setOnMouseEntered(event -> {
    forSale.setStyle("-fx-text-fill: blueviolet");
  });
  forSale.setOnMouseExited(event -> {
    forSale.setStyle("-fx-text-fill: blue");
  });

  discussionForum.setOnMouseEntered(event -> {
    discussionForum.setStyle("-fx-text-fill: blueviolet");
  });
  discussionForum.setOnMouseExited(event -> {
    discussionForum.setStyle("-fx-text-fill: blue");
  });

  gigs.setOnMouseEntered(event -> {
    gigs.setStyle("-fx-text-fill: blueviolet");
  });
  gigs.setOnMouseExited(event -> {
    gigs.setStyle("-fx-text-fill: blue");
  });

  resumes.setOnMouseEntered(event -> {
    resumes.setStyle("-fx-text-fill: blueviolet");
  });
  resumes.setOnMouseExited(event -> {
    resumes.setStyle("-fx-text-fill: blue");
  });

  posting.setOnMouseEntered(event -> {
    posting.setStyle("-fx-text-fill: blueviolet");
  });
  posting.setOnMouseExited(event -> {
    posting.setStyle("-fx-text-fill: blue");
  });

  Label welcome = new Label("Welcome to Craigslist!");
  Label welcome2 = new Label("Please select one of the categories!");
  welcome.setStyle("-fx-font-size: 30pt; -fx-text-fill: blue");
  welcome2.setStyle("-fx-font-size: 30pt; -fx-text-fill: blue");

  VBox welcomelabels = new VBox(welcome, welcome2);
  HBox box1 = new HBox(20, community, housing, jobs);
  HBox box2 = new HBox(20, services, forSale, gigs);
  HBox box3 = new HBox(20, discussionForum, resumes);
  welcomelabels.setAlignment(Pos.CENTER);
  box1.setAlignment(Pos.CENTER);
  box2.setAlignment(Pos.CENTER);
  box3.setAlignment(Pos.CENTER);

  VBox main = new VBox(20, welcomelabels, box1, box2, box3, posting);
  main.setAlignment(Pos.CENTER);

  MenuBar menubar = new MenuBar();
  Menu home = new Menu("Home");
  MenuItem home2 = new MenuItem("Home");
  MenuItem community2 = new MenuItem("Community");
  MenuItem housing2 = new MenuItem("Housing");
  MenuItem jobs2 = new MenuItem("Jobs");
  MenuItem services2 = new MenuItem("Services");
  MenuItem forSale2 = new MenuItem("For Sale");
  MenuItem discussionForum2 = new MenuItem("Discussion Forum");
  MenuItem gigs2 = new MenuItem("Gigs");
  MenuItem resumes2 = new MenuItem("Resumes");
  MenuItem posting2 = new MenuItem("Create a Posting");
  home.getItems().addAll(home2, community2, housing2, jobs2, services2, forSale2, discussionForum2, gigs2, resumes2, posting2);

  Menu help = new Menu("Help");
  MenuItem submitIssues = new MenuItem("Submit Issues");
  help.getItems().addAll(submitIssues);

  Image craigslistIcon = new Image(this.getClass().getResource("cl_logo.png").toExternalForm());
  ImageView cl = new ImageView(craigslistIcon);

  ImageView icon = new ImageView();
  icon.setImage(new Image("file:./res/account.png"));
  icon.setFitHeight(31);
  icon.setFitWidth(31);

  Menu craigslist = new Menu("", cl);
  Menu account = new Menu("Account", icon);
  MenuItem logIn = new MenuItem("Log In");
  MenuItem createAccount = new MenuItem("Create Account");
  account.getItems().addAll(logIn, createAccount);

  BorderPane borderpane = new BorderPane(main);

  menubar.getMenus().addAll(craigslist, home, help, account);

  borderpane.setTop(menubar);

  Scene scene = new Scene(borderpane);
  scene.getStylesheets().add(this.getClass().getResource("final.css").toExternalForm());
  primaryStage.setScene(scene);
  primaryStage.setMaximized(true);
  primaryStage.show();

  //Create a posting page
  Label createposting = new Label("Create a Posting:");
  createposting.setStyle("-fx-font-size: 20pt");
  TextField postName = new TextField();
  postName.setPromptText("Enter title for post");
  Label postNameLabel = new Label("Posting Title:	");
  HBox postingbox = new HBox(40, postNameLabel, postName);

  Label descriptionlabel = new Label("Item Description:");
  TextArea description = new TextArea();
  description.setPromptText("Enter description of item");
  HBox descriptionbox = new HBox(40, descriptionlabel, description);

  Label categoriesLabel = new Label("Choose Category:");
  ComboBox<String> categories = new ComboBox<>();
  categories.getItems().addAll("Community", "Housing", "Jobs", "Services", "For Sale", "Gigs", "Resumes");
  HBox categoriesBox = new HBox(40, categoriesLabel, categories);

  Label subcategoriesLabel = new Label("Choose Subcategory:");
  ComboBox<String> subcategories = new ComboBox<>();
  subcategories.getItems().addAll("Antiques", "Appliances", "Arts + Crafts", "Auto Parts", "Baby + Kid", "Barter", "Beauty + Health", "Bikes/Motorcycles + Parts", "Boats + Parts", "Books", "Business", "Cars", "CDs/VHS/DVDs", "Cell Phones", "Clothes + Accessories/Jewelery");
  HBox subcategoriesBox = new HBox(40, subcategoriesLabel, subcategories);

  Label citieslabel = new Label("Choose City:");
  ComboBox<String> cities = new ComboBox<>();
  cities.getItems().addAll("Westside-Southbay-310", "San Fernando Valley", "Central LA 213/323", "San Gabriel Valley", "Long Beach/562", "Antelope Valley");
  HBox citiesbox = new HBox(40, citieslabel, cities);

  Label pricelabel = new Label("Price:");
  TextField price = new TextField();
  price.setPromptText("Enter price of item");
  HBox pricebox = new HBox(40, pricelabel, price);

  Button cancelPost = new Button("Cancel");

  Button post = new Button("Post Item");
  Button cancel = new Button("Cancel");
  HBox postCancel = new HBox(25, post, cancelPost);
  postCancel.setAlignment(Pos.CENTER);

  VBox postings = new VBox(15, postingbox, descriptionbox, categoriesBox, subcategoriesBox, citiesbox, pricebox);
  postings.setPadding(new Insets(0, 0, 0, 375));
  VBox postingpage = new VBox(40, createposting, postings, postCancel);
  postingpage.setAlignment(Pos.CENTER);
  BorderPane borderpaneposting = new BorderPane(postingpage);
  Scene postingscene = new Scene(borderpaneposting);
  postingscene.getStylesheets().add(this.getClass().getResource("post.css").toExternalForm());
    
  posting.setOnAction(event -> {
    borderpaneposting.setTop(menubar);
    primaryStage.setScene(postingscene);
    primaryStage.setMaximized(true);
  });

  cancelPost.setOnAction(event -> {
    borderpane.setTop(menubar);
    primaryStage.setScene(scene);
    primaryStage.setMaximized(true);
  });

    //For sale page 1
    Button antiques = new Button(" Antiques ");
    Button appliances = new Button(" Appliances ");
    Button artscrafts = new Button(" Arts + Crafts ");
    Button auto = new Button(" Auto Parts ");
    Button baby = new Button(" Baby + Kid ");
    Button barter = new Button(" Barter ");
    Button beauty = new Button(" Beauty + Health ");
    Button bikes = new Button(" Bikes/Motorcycles + Parts ");
    Button boats = new Button(" Boats + Parts ");
    Button books = new Button(" Books ");
    Button business = new Button(" Business ");
    Button cars = new Button(" Cars ");
    Button cds = new Button(" CDs/VHS/DVDs ");
    Button cellphone = new Button(" Cell Phones ");
    Button clothes = new Button(" Clothes + Accessories/Jewelery ");
    Button collectibles = new Button(" Collectibles ");
    Button electronics = new Button(" Electronics/Computers + Parts ");
    Button farm = new Button(" Farm + Garden ");
    Button free = new Button(" Free ");
    Button furniture = new Button(" Furniture ");
    Button general = new Button(" General ");
    Button household = new Button(" Household ");
    Button materials = new Button(" Materials ");
    Button instruments = new Button(" Musical Instruments ");
    Button sports = new Button(" Sports ");
    Button tools = new Button(" Tools ");
    Button toys = new Button(" Toys + Games ");

    Label forSaleWelcome = new Label("For Sale");
    Label forSaleWelcome2 = new Label("Please select one of the categories!\n");
    forSaleWelcome.setStyle("-fx-font-size: 30pt; -fx-text-fill: blue");
    forSaleWelcome2.setStyle("-fx-font-size: 30pt; -fx-text-fill: blue");

    ImageView cl2 = new ImageView(craigslistIcon);

    VBox forSaleWelcomeLabels = new VBox(forSaleWelcome, forSaleWelcome2);
    HBox forSaleBox1 = new HBox(20, antiques, appliances, artscrafts, auto, baby, barter);
    HBox forSaleBox2 = new HBox(20, beauty, bikes, boats, books, business);
    HBox forSaleBox3 = new HBox(20, cars, cds, cellphone, clothes, collectibles);
    HBox forSaleBox4 = new HBox(20, electronics, farm, free, furniture, general);
    HBox forSaleBox5 = new HBox(20, household, materials, instruments, sports, tools, toys);
    forSaleWelcomeLabels.setAlignment(Pos.CENTER);
    forSaleBox1.setAlignment(Pos.CENTER);
    forSaleBox2.setAlignment(Pos.CENTER);
    forSaleBox3.setAlignment(Pos.CENTER);
    forSaleBox4.setAlignment(Pos.CENTER);
    forSaleBox5.setAlignment(Pos.CENTER);

    Button forSaleBack = new Button(" << Back ");

    VBox forSaleBox = new VBox(20, cl2, forSaleWelcomeLabels, forSaleBox1, forSaleBox2, forSaleBox3, forSaleBox4, forSaleBox5, forSaleBack);
    forSaleBox.setAlignment(Pos.CENTER);

    BorderPane forsalePane = new BorderPane(forSaleBox);

    //End for sale page 1


    //Start of for sale page 2 demo
    
    ScrollPane appScrollPane = new ScrollPane();

    appScrollPane.pannableProperty().set(true);
    appScrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
    appScrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);

    BorderPane appPane1 = new BorderPane();
    appPane1.setPrefSize(350, 450);
    appPane1.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    appPane1.setPadding(new Insets(20, 20, 20, 20));

    BorderPane appPane2 = new BorderPane();
    appPane2.setPrefSize(350, 450);
    appPane2.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    appPane2.setPadding(new Insets(20, 20, 20, 20));

    BorderPane appPane3 = new BorderPane();
    appPane3.setPrefSize(350, 450);
    appPane3.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    appPane3.setPadding(new Insets(20, 20, 20, 20));

    BorderPane appPane4 = new BorderPane();
    appPane4.setPrefSize(350, 450);
    appPane4.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    appPane4.setPadding(new Insets(20, 20, 20, 20));

    BorderPane appPane5 = new BorderPane();
    appPane5.setPrefSize(350, 450);
    appPane5.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    appPane5.setPadding(new Insets(20, 20, 20, 20));

    BorderPane appPane6 = new BorderPane();
    appPane6.setPrefSize(350, 450);
    appPane6.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    appPane6.setPadding(new Insets(20, 20, 20, 20));

    BorderPane appPane7 = new BorderPane();
    appPane7.setPrefSize(350, 450);
    appPane7.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    appPane7.setPadding(new Insets(20, 20, 20, 20));

    BorderPane appPane8 = new BorderPane();
    appPane8.setPrefSize(350, 450);
    appPane8.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    appPane8.setPadding(new Insets(20, 20, 20, 20));

    BorderPane appPane9 = new BorderPane();
    appPane9.setPrefSize(350, 450);
    appPane9.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    appPane9.setPadding(new Insets(20, 20, 20, 20));

    BorderPane appPane10 = new BorderPane();
    appPane10.setPrefSize(350, 450);
    appPane10.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    appPane10.setPadding(new Insets(20, 20, 20, 20));

    Label price1 = new Label("$75");
    price1.setStyle("-fx-font-size: 30pt; -fx-text-fill: green");

    Label price2 = new Label("$100");
    price2.setStyle("-fx-font-size: 30pt; -fx-text-fill: green");

    Label price3 = new Label("$160");
    price3.setStyle("-fx-font-size: 30pt; -fx-text-fill: green");

    Label price4 = new Label("$180");
    price4.setStyle("-fx-font-size: 30pt; -fx-text-fill: green");

    Label price5 = new Label("$200");
    price5.setStyle("-fx-font-size: 30pt; -fx-text-fill: green");

    Label price6 = new Label("$260");
    price6.setStyle("-fx-font-size: 30pt; -fx-text-fill: green");

    Label price7 = new Label("$300");
    price7.setStyle("-fx-font-size: 30pt; -fx-text-fill: green");

    Label price8 = new Label("$375");
    price8.setStyle("-fx-font-size: 30pt; -fx-text-fill: green");

    Label price9 = new Label("$400");
    price9.setStyle("-fx-font-size: 30pt; -fx-text-fill: green");

    Label price10 = new Label("$500");
    price10.setStyle("-fx-font-size: 30pt; -fx-text-fill: green");

    Label name1 = new Label("\nBarrel smoker bbq grill {Barton}");
    name1.setStyle("-fx-font-size: 15pt; -fx-text-fill: blue");
    Label date1 = new Label("5h ago");
    date1.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    Label place1 = new Label("Pomona, CA");
    place1.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    HBox bottom1 = new HBox(15, date1, place1);
    VBox bot1 = new VBox(10, name1, bottom1);
    
    Label name2 = new Label("\nDouble glass window");
    name2.setStyle("-fx-font-size: 15pt; -fx-text-fill: blue");
    Label date2 = new Label("2h ago");
    date2.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    Label place2 = new Label("Walnut, CA");
    place2.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    HBox bottom2 = new HBox(15, date2, place2);
    VBox bot2 = new VBox(10, name2, bottom2);

    Label name3 = new Label("\nwasher and dryer");
    name3.setStyle("-fx-font-size: 15pt; -fx-text-fill: blue");
    Label date3 = new Label("4h ago");
    date3.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    Label place3 = new Label("Hemet, CA");
    place3.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    HBox bottom3 = new HBox(15, date3, place3);
    VBox bot3 = new VBox(10, name3, bottom3);

    Label name4 = new Label("\nrefrigerator stainless steel");
    name4.setStyle("-fx-font-size: 15pt; -fx-text-fill: blue");
    Label date4 = new Label("3d ago");
    date4.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    Label place4 = new Label("Pomona, CA");
    place4.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    HBox bottom4 = new HBox(15, date4, place4);
    VBox bot4 = new VBox(10, name4, bottom4);

    Label name5 = new Label("\nChest Freezer for garage!");
    name5.setStyle("-fx-font-size: 15pt; -fx-text-fill: blue");
    Label date5 = new Label("12h ago");
    date5.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    Label place5 = new Label("Ontario, CA");
    place5.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    HBox bottom5 = new HBox(15, date5, place5);
    VBox bot5 = new VBox(10, name5, bottom5);

    Label name6 = new Label("\nApartment Size Refrigerator And Freezer");
    name6.setStyle("-fx-font-size: 15pt; -fx-text-fill: blue");
    Label date6 = new Label("2d ago");
    date6.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    Label place6 = new Label("Walnut, CA");
    place6.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    HBox bottom6 = new HBox(15, date6, place6);
    VBox bot6 = new VBox(10, name6, bottom6);

    Label name7 = new Label("\nwasher and dryer");
    name7.setStyle("-fx-font-size: 15pt; -fx-text-fill: blue");
    Label date7 = new Label("2h ago");
    date7.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    Label place7 = new Label("Pomona, CA");
    place7.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    HBox bottom7 = new HBox(15, date7, place7);
    VBox bot7 = new VBox(10, name7, bottom7);

    Label name8 = new Label("\nSamsung washer and dryer");
    name8.setStyle("-fx-font-size: 15pt; -fx-text-fill: blue");
    Label date8 = new Label("6h ago");
    date8.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    Label place8 = new Label("Hesperia, CA");
    place8.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    HBox bottom8 = new HBox(15, date8, place8);
    VBox bot8 = new VBox(10, name8, bottom8);

    Label name9 = new Label("\nKenmore Coldspot");
    name9.setStyle("-fx-font-size: 15pt; -fx-text-fill: blue");
    Label date9 = new Label("3h ago");
    date9.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    Label place9 = new Label("Moreno Valley, CA");
    place9.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    HBox bottom9 = new HBox(15, date9, place9);
    VBox bot9 = new VBox(10, name9, bottom9);

    Label name10 = new Label("\ttoaster");
    name10.setStyle("-fx-font-size: 15pt; -fx-text-fill: blue");
    Label date10 = new Label("Just now");
    date10.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    Label place10 = new Label("Long Beach, CA");
    place10.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    HBox bottom10 = new HBox(15, date10, place10);
    VBox bot10 = new VBox(10, name10, bottom10);

    Image star1 = new Image(this.getClass().getResource("1star.png").toExternalForm());
    Image star2 = new Image(this.getClass().getResource("2stars.png").toExternalForm());
    Image star3 = new Image(this.getClass().getResource("3stars.png").toExternalForm());
    Image star4 = new Image(this.getClass().getResource("4stars.png").toExternalForm());
    Image star5 = new Image(this.getClass().getResource("5stars.png").toExternalForm());

    ImageView s1 = new ImageView(star5);
    ImageView s2 = new ImageView(star3);
    ImageView s3 = new ImageView(star5);
    ImageView s4 = new ImageView(star2);
    ImageView s5 = new ImageView(star4);
    ImageView s6 = new ImageView(star1);
    ImageView s7 = new ImageView(star3);
    ImageView s8 = new ImageView(star4);
    ImageView s9 = new ImageView(star5);
    ImageView s10 = new ImageView(star5);

    VBox top1 = new VBox(10, price1, s1);
    top1.setPadding(new Insets(0, 0, 20, 0));

    VBox top2 = new VBox(10, price2, s2);
    top2.setPadding(new Insets(0, 0, 20, 0));

    VBox top3 = new VBox(10, price3, s3);
    top3.setPadding(new Insets(0, 0, 20, 0));

    VBox top4 = new VBox(10, price4, s4);
    top4.setPadding(new Insets(0, 0, 20, 0));

    VBox top5 = new VBox(10, price5, s5);
    top5.setPadding(new Insets(0, 0, 20, 0));

    VBox top6 = new VBox(10, price6, s6);
    top6.setPadding(new Insets(0, 0, 20, 0));

    VBox top7 = new VBox(10, price7, s7);
    top7.setPadding(new Insets(0, 0, 20, 0));

    VBox top8 = new VBox(10, price8, s8);
    top8.setPadding(new Insets(0, 0, 20, 0));

    VBox top9 = new VBox(10, price9, s9);
    top9.setPadding(new Insets(0, 0, 20, 0));

    VBox top10 = new VBox(10, price10, s10);
    top10.setPadding(new Insets(0, 0, 20, 0));

    
    Image app1 = new Image(this.getClass().getResource("Listing1.png").toExternalForm());
    ImageView a1 = new ImageView(app1);
    appPane1.setCenter(a1);
    appPane1.setTop(top1);
    appPane1.setBottom(bot1);

    Image app2 = new Image(this.getClass().getResource("Listing2.png").toExternalForm());
    ImageView a2 = new ImageView(app2);
    appPane2.setCenter(a2);
    appPane2.setTop(top2);
    appPane2.setBottom(bot2);

    Image app3 = new Image(this.getClass().getResource("Listing3.png").toExternalForm());
    ImageView a3 = new ImageView(app3);
    appPane3.setCenter(a3);
    appPane3.setTop(top3);
    appPane3.setBottom(bot3);

    Image app4 = new Image(this.getClass().getResource("Listing4.png").toExternalForm());
    ImageView a4 = new ImageView(app4);
    appPane4.setCenter(a4);
    appPane4.setTop(top4);
    appPane4.setBottom(bot4);

    Image app5 = new Image(this.getClass().getResource("Listing5.png").toExternalForm());
    ImageView a5 = new ImageView(app5);
    appPane5.setCenter(a5);
    appPane5.setTop(top5);
    appPane5.setBottom(bot5);

    Image app6 = new Image(this.getClass().getResource("Listing6.png").toExternalForm());
    ImageView a6 = new ImageView(app6);
    appPane6.setCenter(a6);
    appPane6.setTop(top6);
    appPane6.setBottom(bot6);

    Image app7 = new Image(this.getClass().getResource("Listing7.png").toExternalForm());
    ImageView a7 = new ImageView(app7);
    appPane7.setCenter(a7);
    appPane7.setTop(top7);
    appPane7.setBottom(bot7);

    Image app8 = new Image(this.getClass().getResource("Listing8.png").toExternalForm());
    ImageView a8 = new ImageView(app8);
    appPane8.setCenter(a8);
    appPane8.setTop(top8);
    appPane8.setBottom(bot8);

    Image app9 = new Image(this.getClass().getResource("Listing9.png").toExternalForm());
    ImageView a9 = new ImageView(app9);
    appPane9.setCenter(a9);
    appPane9.setTop(top9);
    appPane9.setBottom(bot9);

    Image app10 = new Image(this.getClass().getResource("Listing10.png").toExternalForm());
    ImageView a10 = new ImageView(app10);
    appPane10.setCenter(a10);
    appPane10.setTop(top10);
    appPane10.setBottom(bot10);

    GridPane appGrid = new GridPane();
    appGrid.add(appPane1, 0, 0);
    appGrid.add(appPane2, 1, 0);
    appGrid.add(appPane3, 2, 0);
    appGrid.add(appPane4, 0, 1);
    appGrid.add(appPane5, 1, 1);
    appGrid.add(appPane6, 2, 1);
    appGrid.add(appPane7, 0, 2);
    appGrid.add(appPane8, 1, 2);
    appGrid.add(appPane9, 2, 2);

    appGrid.setHgap(30);
    appGrid.setVgap(30);
    appGrid.setPadding(new Insets(30, 30, 30, 30));
    
    BorderPane appFinalPane = new BorderPane();

    Button appBack = new Button(" << Back ");

    Label sideAppliances = new Label("Appliances\n\n");
    sideAppliances.setStyle("-fx-font-size: 20pt; -fx-text-fill: blue");

    VBox sidebarTop = new VBox(5, appBack, sideAppliances);
    sidebarTop.setAlignment(Pos.CENTER);

    Label sidePriceLabel = new Label("Price\n\n");
    sidePriceLabel.setStyle("-fx-font-size: 20pt;");
    Label sp0 = new Label("Any");
    Label sp1 = new Label("Free");
    Label sp2 = new Label("$1 - $20");
    Label sp3 = new Label("$20 - $50");
    Label sp4 = new Label("$50 - $100");
    Label sp5 = new Label("$100 - $200");
    Label sp6 = new Label("$200 - $300");
    Label sp7 = new Label("$300 - $500");
    Label sp8 = new Label("$500+");


    Label sideRatingLabel = new Label("Seller Rating\n\n");
    sideRatingLabel.setStyle("-fx-font-size: 20pt;");

    Image ms1 = new Image(this.getClass().getResource("m1star.png").toExternalForm());
    Image ms2 = new Image(this.getClass().getResource("m2stars.png").toExternalForm());
    Image ms3 = new Image(this.getClass().getResource("m3stars.png").toExternalForm());
    Image ms4 = new Image(this.getClass().getResource("m4stars.png").toExternalForm());
    Image ms5 = new Image(this.getClass().getResource("m5stars.png").toExternalForm());

    ImageView ss1 = new ImageView(ms1);
    ImageView ss2 = new ImageView(ms2);
    ImageView ss3 = new ImageView(ms3);
    ImageView ss4 = new ImageView(ms4);
    ImageView ss5 = new ImageView(ms5);

    Label sl1 = new Label("1+ stars");
    Label sl2 = new Label("2+ stars");
    Label sl3 = new Label("3+ stars");
    Label sl4 = new Label("4+ stars");
    Label sl5 = new Label("5 stars");

    HBox sBox1 = new HBox(10, ss1, sl1);
    HBox sBox2 = new HBox(10, ss2, sl2);
    HBox sBox3 = new HBox(10, ss3, sl3);
    HBox sBox4 = new HBox(10, ss4, sl4);
    HBox sBox5 = new HBox(10, ss5, sl5);

    VBox sidePrice = new VBox(10, sidePriceLabel, sp0, sp1, sp2, sp3, sp4, sp5, sp6, sp7, sp8);
    VBox sideRating = new VBox(10, sideRatingLabel, sBox1, sBox2, sBox3, sBox4, sBox5);

    VBox appSidebar = new VBox(20, sidebarTop, sidePrice, sideRating);
    appSidebar.setPrefWidth(200);
    appSidebar.setPadding(new Insets(0, 30, 30, 30));

    TextField searchBar = new TextField();
    searchBar.setPromptText("     Search appliances");
    searchBar.setPrefHeight(30);
    searchBar.setPrefWidth(1200);

    Image searchImage = new Image(this.getClass().getResource("search.png").toExternalForm());
    ImageView search = new ImageView(searchImage);
    Button appSearch = new Button();
    appSearch.setGraphic(search);

    Image craigslistIcon1 = new Image(this.getClass().getResource("cl_logo.png").toExternalForm());
    ImageView icon1 = new ImageView(craigslistIcon1);

    HBox appSearchBar = new HBox(30, icon1, searchBar, appSearch);
    appSearchBar.setPrefHeight(100);
    appSearchBar.setPadding(new Insets(30, 20, 20, 10));
    appSearchBar.setAlignment(Pos.BASELINE_CENTER);

    appScrollPane.setContent(appGrid);
    appFinalPane.setCenter(appScrollPane);
    appFinalPane.setLeft(appSidebar);
    appFinalPane.setTop(appSearchBar);
    appFinalPane.setPrefWidth(scene.getWidth());

    BorderPane appFinalOuterPane = new BorderPane();

    post.setOnAction(event -> {
        appGrid.add(appPane10, 0, 3);
    }); 
    
    icon1.setOnMouseClicked(event -> {
        borderpane.setTop(menubar);
        scene.setRoot(borderpane);
        primaryStage.setMaximized(true);
    });

    sp0.setOnMouseClicked(event -> {
        appGrid.getChildren().removeAll(appPane1, appPane2, appPane3, appPane4, appPane5, appPane6, appPane7, appPane8, appPane9, appPane10);
        appGrid.add(appPane1, 0, 0);
        appGrid.add(appPane2, 1, 0);
        appGrid.add(appPane3, 2, 0);
        appGrid.add(appPane4, 0, 1);
        appGrid.add(appPane5, 1, 1);
        appGrid.add(appPane6, 2, 1);
        appGrid.add(appPane7, 0, 2);
        appGrid.add(appPane8, 1, 2);
        appGrid.add(appPane9, 2, 2);
        appGrid.add(appPane10, 0, 3);
    });
    
    sp5.setOnMouseClicked(event -> {
        appGrid.getChildren().removeAll(appPane1, appPane2, appPane3, appPane4, appPane5, appPane6, appPane7, appPane8, appPane9, appPane10);
        appGrid.add(appPane2, 0, 0);
        appGrid.add(appPane3, 1, 0);
        appGrid.add(appPane4, 2, 0);
        appGrid.add(appPane5, 0, 1);
    });

    sp7.setOnMouseClicked(event -> {
        appGrid.getChildren().removeAll(appPane1, appPane2, appPane3, appPane4, appPane5, appPane6, appPane7, appPane8, appPane9, appPane10);
        appGrid.add(appPane7, 0, 0);
        appGrid.add(appPane8, 1, 0);
        appGrid.add(appPane9, 2, 0);
        appGrid.add(appPane10, 0, 1);
    });

    sp8.setOnMouseClicked(event -> {
        appGrid.getChildren().removeAll(appPane1, appPane2, appPane3, appPane4, appPane5, appPane6, appPane7, appPane8, appPane9, appPane10);
        appGrid.add(appPane10, 0, 0);
    });
    
    sBox1.setOnMouseClicked(event -> {
        appGrid.getChildren().removeAll(appPane1, appPane2, appPane3, appPane4, appPane5, appPane6, appPane7, appPane8, appPane9, appPane10);
        appGrid.add(appPane1, 0, 0);
        appGrid.add(appPane2, 1, 0);
        appGrid.add(appPane3, 2, 0);
        appGrid.add(appPane4, 0, 1);
        appGrid.add(appPane5, 1, 1);
        appGrid.add(appPane6, 2, 1);
        appGrid.add(appPane7, 0, 2);
        appGrid.add(appPane8, 1, 2);
        appGrid.add(appPane9, 2, 2);
        appGrid.add(appPane10, 0, 3);
    });
    
    sBox5.setOnMouseClicked(event -> {
        appGrid.getChildren().removeAll(appPane1, appPane2, appPane3, appPane4, appPane5, appPane6, appPane7, appPane8, appPane9, appPane10); 
        appGrid.add(appPane1, 0, 0);
        appGrid.add(appPane3, 1, 0);
        appGrid.add(appPane9, 2, 0);
        appGrid.add(appPane10, 0, 1);
    });

    forSaleBack.setOnAction(event -> {
        borderpane.setTop(menubar);
        scene.setRoot(borderpane);
        primaryStage.setMaximized(true);
    }); 
    
    appBack.setOnAction(event -> {
        forsalePane.setTop(menubar);
        scene.setRoot(forsalePane);
        primaryStage.setMaximized(true);
    }); 
    
    appliances.setOnAction(event -> {
        appFinalOuterPane.setTop(menubar);
        appFinalOuterPane.setCenter(appFinalPane);
        scene.setRoot(appFinalOuterPane);
        primaryStage.setMaximized(true);
    });    

    //End of for sale page 2 demo

    //Housing page 1
    Button housingbutton2 = new Button(" Apts/Housing ");
    Button housingswap = new Button(" Housing Swap ");
    Button housingwanted = new Button(" Housing Wanted ");
    Button office = new Button(" Office/Commercial ");
    Button parking = new Button(" Parking/Storage ");
    Button realestate = new Button(" Real Estate for Sale ");
    Button roomsshared = new Button(" Rooms/Shared ");
    Button roomswanted = new Button(" Rooms Wanted ");
    Button sublets = new Button(" Sublets/Temporary ");
    Button vacation = new Button(" Vacation Rentals ");
    

    Label housingWelcome = new Label("Housing");
    Label housingWelcome2 = new Label("Please select one of the categories!\n");
    housingWelcome.setStyle("-fx-font-size: 30pt; -fx-text-fill: blue");
    housingWelcome2.setStyle("-fx-font-size: 30pt; -fx-text-fill: blue");

    ImageView cl3 = new ImageView(craigslistIcon);

    VBox housingWelcomeLabels = new VBox(housingWelcome, housingWelcome2);
    HBox housingBox1 = new HBox(20, housingbutton2, housingswap, housingwanted, office);
    HBox housingBox2 = new HBox(20, parking, realestate, roomsshared);
    HBox housingBox3 = new HBox(20, roomswanted, sublets, vacation);
    housingWelcomeLabels.setAlignment(Pos.CENTER);
    housingBox1.setAlignment(Pos.CENTER);
    housingBox2.setAlignment(Pos.CENTER);
    housingBox3.setAlignment(Pos.CENTER);

    Button house1Back = new Button(" << Back ");

    VBox housingBox = new VBox(20, cl3, housingWelcomeLabels, housingBox1, housingBox2, housingBox3, house1Back);
    housingBox.setAlignment(Pos.CENTER);

    BorderPane housingPane = new BorderPane(housingBox);

    //End for housing page 1
    
    //Start of housing page 2 demo
    
    ScrollPane houseScrollPane = new ScrollPane();

    houseScrollPane.pannableProperty().set(true);
    houseScrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
    houseScrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);

    BorderPane housePane1 = new BorderPane();
    housePane1.setPrefSize(350, 450);
    housePane1.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    housePane1.setPadding(new Insets(20, 20, 20, 20));

    BorderPane housePane2 = new BorderPane();
    housePane2.setPrefSize(350, 450);
    housePane2.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    housePane2.setPadding(new Insets(20, 20, 20, 20));

    BorderPane housePane3 = new BorderPane();
    housePane3.setPrefSize(350, 450);
    housePane3.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    housePane3.setPadding(new Insets(20, 20, 20, 20));

    BorderPane housePane4 = new BorderPane();
    housePane4.setPrefSize(350, 450);
    housePane4.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    housePane4.setPadding(new Insets(20, 20, 20, 20));

    BorderPane housePane5 = new BorderPane();
    housePane5.setPrefSize(350, 450);
    housePane5.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    housePane5.setPadding(new Insets(20, 20, 20, 20));

    BorderPane housePane6 = new BorderPane();
    housePane6.setPrefSize(350, 450);
    housePane6.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    housePane6.setPadding(new Insets(20, 20, 20, 20));

    BorderPane housePane7 = new BorderPane();
    housePane7.setPrefSize(350, 450);
    housePane7.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    housePane7.setPadding(new Insets(20, 20, 20, 20));

    BorderPane housePane8 = new BorderPane();
    housePane8.setPrefSize(350, 450);
    housePane8.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    housePane8.setPadding(new Insets(20, 20, 20, 20));

    BorderPane housePane9 = new BorderPane();
    housePane9.setPrefSize(350, 450);
    housePane9.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    housePane9.setPadding(new Insets(20, 20, 20, 20));

    BorderPane housePane10 = new BorderPane();
    housePane10.setPrefSize(350, 450);
    housePane10.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    housePane10.setPadding(new Insets(20, 20, 20, 20));

    Label hprice1 = new Label("$1850");
    hprice1.setStyle("-fx-font-size: 30pt; -fx-text-fill: green");

    Label hprice2 = new Label("$1920");
    hprice2.setStyle("-fx-font-size: 30pt; -fx-text-fill: green");

    Label hprice3 = new Label("$2100");
    hprice3.setStyle("-fx-font-size: 30pt; -fx-text-fill: green");

    Label hprice4 = new Label("$2300");
    hprice4.setStyle("-fx-font-size: 30pt; -fx-text-fill: green");

    Label hprice5 = new Label("$2350");
    hprice5.setStyle("-fx-font-size: 30pt; -fx-text-fill: green");

    Label hprice6 = new Label("$2600");
    hprice6.setStyle("-fx-font-size: 30pt; -fx-text-fill: green");

    Label hprice7 = new Label("$2775");
    hprice7.setStyle("-fx-font-size: 30pt; -fx-text-fill: green");

    Label hprice8 = new Label("$3125");
    hprice8.setStyle("-fx-font-size: 30pt; -fx-text-fill: green");

    Label hprice9 = new Label("$3500");
    hprice9.setStyle("-fx-font-size: 30pt; -fx-text-fill: green");

    Label hprice10 = new Label("$3990");
    hprice10.setStyle("-fx-font-size: 30pt; -fx-text-fill: green");

    Label hname1 = new Label("\nSimply beautiful 1 bed / 1 bath");
    hname1.setStyle("-fx-font-size: 15pt; -fx-text-fill: blue");
    Label hdate1 = new Label("5h ago");
    hdate1.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    Label hplace1 = new Label("Pomona, CA");
    hplace1.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    HBox hbottom1 = new HBox(15, hdate1, hplace1);
    VBox hbot1 = new VBox(10, hname1, hbottom1);
    
    Label hname2 = new Label("\nThe home you've always wanted");
    hname2.setStyle("-fx-font-size: 15pt; -fx-text-fill: blue");
    Label hdate2 = new Label("2h ago");
    hdate2.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    Label hplace2 = new Label("Walnut, CA");
    hplace2.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    HBox hbottom2 = new HBox(15, hdate2, hplace2);
    VBox hbot2 = new VBox(10, hname2, hbottom2);

    Label hname3 = new Label("\nLooking For Convenience? Well, Look No Further!");
    hname3.setStyle("-fx-font-size: 15pt; -fx-text-fill: blue");
    Label hdate3 = new Label("4h ago");
    hdate3.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    Label hplace3 = new Label("Hemet, CA");
    hplace3.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    HBox hbottom3 = new HBox(15, hdate3, hplace3);
    VBox hbot3 = new VBox(10, hname3, hbottom3);

    Label hname4 = new Label("\nOh Yes We DID!!! 2 BD 2.5 BA");
    hname4.setStyle("-fx-font-size: 15pt; -fx-text-fill: blue");
    Label hdate4 = new Label("3d ago");
    hdate4.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    Label hplace4 = new Label("Pomona, CA");
    hplace4.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    HBox hbottom4 = new HBox(15, hdate4, hplace4);
    VBox hbot4 = new VBox(10, hname4, hbottom4);

    Label hname5 = new Label("\nStainless Appliances, Brushed Nickel Hardware");
    hname5.setStyle("-fx-font-size: 15pt; -fx-text-fill: blue");
    Label hdate5 = new Label("12h ago");
    hdate5.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    Label hplace5 = new Label("Ontario, CA");
    hplace5.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    HBox hbottom5 = new HBox(15, hdate5, hplace5);
    VBox hbot5 = new VBox(10, hname5, hbottom5);

    Label hname6 = new Label("\nNeed a fresh start? Check out our welcoming spaces.");
    hname6.setStyle("-fx-font-size: 15pt; -fx-text-fill: blue");
    Label hdate6 = new Label("2d ago");
    hdate6.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    Label hplace6 = new Label("Walnut, CA");
    hplace6.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    HBox hbottom6 = new HBox(15, hdate6, hplace6);
    VBox hbot6 = new VBox(10, hname6, hbottom6);

    Label hname7 = new Label("\nYour journey to comfort begins: 2 BR, 2 BA");
    hname7.setStyle("-fx-font-size: 15pt; -fx-text-fill: blue");
    Label hdate7 = new Label("2h ago");
    hdate7.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    Label hplace7 = new Label("Pomona, CA");
    hplace7.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    HBox hbottom7 = new HBox(15, hdate7, hplace7);
    VBox hbot7 = new VBox(10, hname7, hbottom7);

    Label hname8 = new Label("\nBEAUTIFUL SPACIOUS APARTMENT HOMES!!");
    hname8.setStyle("-fx-font-size: 15pt; -fx-text-fill: blue");
    Label hdate8 = new Label("6h ago");
    hdate8.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    Label hplace8 = new Label("Hesperia, CA");
    hplace8.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    HBox hbottom8 = new HBox(15, hdate8, hplace8);
    VBox hbot8 = new VBox(10, hname8, hbottom8);

    Label hname9 = new Label("\nSpacious Modern Living!! FIRST MONTH FREE!!");
    hname9.setStyle("-fx-font-size: 15pt; -fx-text-fill: blue");
    Label hdate9 = new Label("3h ago");
    hdate9.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    Label hplace9 = new Label("Moreno Valley, CA");
    hplace9.setStyle("-fx-font-size: 10pt; -fx-text-fill: grey");
    HBox hbottom9 = new HBox(15, hdate9, hplace9);
    VBox hbot9 = new VBox(10, hname9, hbottom9);

    Image hstar1 = new Image(this.getClass().getResource("1star.png").toExternalForm());
    Image hstar2 = new Image(this.getClass().getResource("2stars.png").toExternalForm());
    Image hstar3 = new Image(this.getClass().getResource("3stars.png").toExternalForm());
    Image hstar4 = new Image(this.getClass().getResource("4stars.png").toExternalForm());
    Image hstar5 = new Image(this.getClass().getResource("5stars.png").toExternalForm());

    ImageView hs1 = new ImageView(hstar5);
    ImageView hs2 = new ImageView(hstar3);
    ImageView hs3 = new ImageView(hstar5);
    ImageView hs4 = new ImageView(hstar2);
    ImageView hs5 = new ImageView(hstar4);
    ImageView hs6 = new ImageView(hstar1);
    ImageView hs7 = new ImageView(hstar3);
    ImageView hs8 = new ImageView(hstar4);
    ImageView hs9 = new ImageView(hstar5);

    VBox htop1 = new VBox(10, hprice1, hs1);
    htop1.setPadding(new Insets(0, 0, 20, 0));

    VBox htop2 = new VBox(10, hprice2, hs2);
    htop2.setPadding(new Insets(0, 0, 20, 0));

    VBox htop3 = new VBox(10, hprice3, hs3);
    htop3.setPadding(new Insets(0, 0, 20, 0));

    VBox htop4 = new VBox(10, hprice4, hs4);
    htop4.setPadding(new Insets(0, 0, 20, 0));

    VBox htop5 = new VBox(10, hprice5, hs5);
    htop5.setPadding(new Insets(0, 0, 20, 0));

    VBox htop6 = new VBox(10, hprice6, hs6);
    htop6.setPadding(new Insets(0, 0, 20, 0));

    VBox htop7 = new VBox(10, hprice7, hs7);
    htop7.setPadding(new Insets(0, 0, 20, 0));

    VBox htop8 = new VBox(10, hprice8, hs8);
    htop8.setPadding(new Insets(0, 0, 20, 0));

    VBox htop9 = new VBox(10, hprice9, hs9);
    htop9.setPadding(new Insets(0, 0, 20, 0));
    
    Image happ1 = new Image(this.getClass().getResource("HListing1.png").toExternalForm());
    ImageView ha1 = new ImageView(happ1);
    housePane1.setCenter(ha1);
    housePane1.setTop(htop1);
    housePane1.setBottom(hbot1);

    Image happ2 = new Image(this.getClass().getResource("HListing2.png").toExternalForm());
    ImageView ha2 = new ImageView(happ2);
    housePane2.setCenter(ha2);
    housePane2.setTop(htop2);
    housePane2.setBottom(hbot2);

    Image happ3 = new Image(this.getClass().getResource("HListing3.png").toExternalForm());
    ImageView ha3 = new ImageView(happ3);
    housePane3.setCenter(ha3);
    housePane3.setTop(htop3);
    housePane3.setBottom(hbot3);

    Image happ4 = new Image(this.getClass().getResource("HListing4.png").toExternalForm());
    ImageView ha4 = new ImageView(happ4);
    housePane4.setCenter(ha4);
    housePane4.setTop(htop4);
    housePane4.setBottom(hbot4);

    Image happ5 = new Image(this.getClass().getResource("HListing5.png").toExternalForm());
    ImageView ha5 = new ImageView(happ5);
    housePane5.setCenter(ha5);
    housePane5.setTop(htop5);
    housePane5.setBottom(hbot5);

    Image happ6 = new Image(this.getClass().getResource("HListing6.png").toExternalForm());
    ImageView ha6 = new ImageView(happ6);
    housePane6.setCenter(ha6);
    housePane6.setTop(htop6);
    housePane6.setBottom(hbot6);

    Image happ7 = new Image(this.getClass().getResource("HListing7.png").toExternalForm());
    ImageView ha7 = new ImageView(happ7);
    housePane7.setCenter(ha7);
    housePane7.setTop(htop7);
    housePane7.setBottom(hbot7);

    Image happ8 = new Image(this.getClass().getResource("HListing8.png").toExternalForm());
    ImageView ha8 = new ImageView(happ8);
    housePane8.setCenter(ha8);
    housePane8.setTop(htop8);
    housePane8.setBottom(hbot8);

    Image happ9 = new Image(this.getClass().getResource("HListing9.png").toExternalForm());
    ImageView ha9 = new ImageView(happ9);
    housePane9.setCenter(ha9);
    housePane9.setTop(htop9);
    housePane9.setBottom(hbot9);

    GridPane houseGrid = new GridPane();
    houseGrid.add(housePane1, 0, 0);
    houseGrid.add(housePane2, 1, 0);
    houseGrid.add(housePane3, 2, 0);
    houseGrid.add(housePane4, 0, 1);
    houseGrid.add(housePane5, 1, 1);
    houseGrid.add(housePane6, 2, 1);
    houseGrid.add(housePane7, 0, 2);
    houseGrid.add(housePane8, 1, 2);
    houseGrid.add(housePane9, 2, 2);

    houseGrid.setHgap(30);
    houseGrid.setVgap(30);
    houseGrid.setPadding(new Insets(30, 30, 30, 30));
    
    BorderPane houseFinalPane = new BorderPane();

    Button house2Back = new Button(" << Back ");

    Label sideHousing = new Label("Housing for Rent\n\n");
    sideHousing.setStyle("-fx-font-size: 20pt; -fx-text-fill: blue");

    VBox hsidebarTop = new VBox(5, house2Back, sideHousing);
    hsidebarTop.setAlignment(Pos.CENTER);

    Label hsidePriceLabel = new Label("Rent\n\n");
    hsidePriceLabel.setStyle("-fx-font-size: 20pt;");
    Label hsp0 = new Label("Any");
    Label hsp1 = new Label("Free");
    Label hsp2 = new Label("$1 - $500");
    Label hsp3 = new Label("$500 - $1000");
    Label hsp4 = new Label("$1000 - $2000");
    Label hsp5 = new Label("$2000 - $3000");
    Label hsp6 = new Label("$3000 - $4000");
    Label hsp7 = new Label("$4000+");


    Label hsideRatingLabel = new Label("Seller Rating\n\n");
    hsideRatingLabel.setStyle("-fx-font-size: 20pt;");

    Image hms1 = new Image(this.getClass().getResource("m1star.png").toExternalForm());
    Image hms2 = new Image(this.getClass().getResource("m2stars.png").toExternalForm());
    Image hms3 = new Image(this.getClass().getResource("m3stars.png").toExternalForm());
    Image hms4 = new Image(this.getClass().getResource("m4stars.png").toExternalForm());
    Image hms5 = new Image(this.getClass().getResource("m5stars.png").toExternalForm());

    ImageView hss1 = new ImageView(hms1);
    ImageView hss2 = new ImageView(hms2);
    ImageView hss3 = new ImageView(hms3);
    ImageView hss4 = new ImageView(hms4);
    ImageView hss5 = new ImageView(hms5);

    Label hsl1 = new Label("1+ stars");
    Label hsl2 = new Label("2+ stars");
    Label hsl3 = new Label("3+ stars");
    Label hsl4 = new Label("4+ stars");
    Label hsl5 = new Label("5 stars");

    HBox hsBox1 = new HBox(10, hss1, hsl1);
    HBox hsBox2 = new HBox(10, hss2, hsl2);
    HBox hsBox3 = new HBox(10, hss3, hsl3);
    HBox hsBox4 = new HBox(10, hss4, hsl4);
    HBox hsBox5 = new HBox(10, hss5, hsl5);

    VBox hsidePrice = new VBox(10, hsidePriceLabel, hsp0, hsp1, hsp2, hsp3, hsp4, hsp5, hsp6, hsp7);
    VBox hsideRating = new VBox(10, hsideRatingLabel, hsBox1, hsBox2, hsBox3, hsBox4, hsBox5);

    VBox happSidebar = new VBox(20, hsidebarTop, hsidePrice, hsideRating);
    happSidebar.setPrefWidth(200);
    happSidebar.setPadding(new Insets(0, 30, 30, 30));

    TextField hsearchBar = new TextField();
    hsearchBar.setPromptText("     Search housing");
    hsearchBar.setPrefHeight(30);
    hsearchBar.setPrefWidth(1200);

    Image hsearchImage = new Image(this.getClass().getResource("search.png").toExternalForm());
    ImageView hsearch = new ImageView(hsearchImage);
    Button houseSearch = new Button();
    houseSearch.setGraphic(hsearch);

    Image hcraigslistIcon = new Image(this.getClass().getResource("cl_logo.png").toExternalForm());
    ImageView hicon1 = new ImageView(hcraigslistIcon);

    HBox houseSearchBar = new HBox(30, hicon1, hsearchBar, houseSearch);
    houseSearchBar.setPrefHeight(100);
    houseSearchBar.setPadding(new Insets(30, 20, 20, 10));
    houseSearchBar.setAlignment(Pos.BASELINE_CENTER);

    houseScrollPane.setContent(houseGrid);
    houseFinalPane.setCenter(houseScrollPane);
    houseFinalPane.setLeft(happSidebar);
    houseFinalPane.setTop(houseSearchBar);
    houseFinalPane.setPrefWidth(scene.getWidth());

    BorderPane houseFinalOuterPane = new BorderPane();

    
    hicon1.setOnMouseClicked(event -> {
        borderpane.setTop(menubar);
        scene.setRoot(borderpane);
        primaryStage.setMaximized(true);
    });

    hsp0.setOnMouseClicked(event -> {
        houseGrid.getChildren().removeAll(housePane1, housePane2, housePane3, housePane4, housePane5, housePane6, housePane7, housePane8, housePane9, housePane10);
        houseGrid.add(housePane1, 0, 0);
        houseGrid.add(housePane2, 1, 0);
        houseGrid.add(housePane3, 2, 0);
        houseGrid.add(housePane4, 0, 1);
        houseGrid.add(housePane5, 1, 1);
        houseGrid.add(housePane6, 2, 1);
        houseGrid.add(housePane7, 0, 2);
        houseGrid.add(housePane8, 1, 2);
        houseGrid.add(housePane9, 2, 2);
    });
    
    hsp4.setOnMouseClicked(event -> {
        houseGrid.getChildren().removeAll(housePane1, housePane2, housePane3, housePane4, housePane5, housePane6, housePane7, housePane8, housePane9, housePane10);
        houseGrid.add(housePane1, 0, 0);
        houseGrid.add(housePane2, 1, 0);
        houseGrid.add(housePane3, 2, 0);
    });

    hsp6.setOnMouseClicked(event -> {
        houseGrid.getChildren().removeAll(housePane1, housePane2, housePane3, housePane4, housePane5, housePane6, housePane7, housePane8, housePane9, housePane10);
        houseGrid.add(housePane8, 1, 0);
        houseGrid.add(housePane9, 2, 0);
    });
    
    hsBox1.setOnMouseClicked(event -> {
        houseGrid.getChildren().removeAll(housePane1, housePane2, housePane3, housePane4, housePane5, housePane6, housePane7, housePane8, housePane9, housePane10);
        houseGrid.add(housePane1, 0, 0);
        houseGrid.add(housePane2, 1, 0);
        houseGrid.add(housePane3, 2, 0);
        houseGrid.add(housePane4, 0, 1);
        houseGrid.add(housePane5, 1, 1);
        houseGrid.add(housePane6, 2, 1);
        houseGrid.add(housePane7, 0, 2);
        houseGrid.add(housePane8, 1, 2);
        houseGrid.add(housePane9, 2, 2);
    });
    
    hsBox5.setOnMouseClicked(event -> {
        houseGrid.getChildren().removeAll(housePane1, housePane2, housePane3, housePane4, housePane5, housePane6, housePane7, housePane8, housePane9, housePane10); 
        houseGrid.add(housePane1, 0, 0);
        houseGrid.add(housePane3, 1, 0);
        houseGrid.add(housePane9, 2, 0);
    });

    house1Back.setOnAction(event -> {
        borderpane.setTop(menubar);
        scene.setRoot(borderpane);
        primaryStage.setMaximized(true);
    }); 
    
    house2Back.setOnAction(event -> {
        housingPane.setTop(menubar);
        scene.setRoot(housingPane);
        primaryStage.setMaximized(true);
    }); 
    
    housingbutton2.setOnAction(event -> {
        houseFinalOuterPane.setTop(menubar);
        houseFinalOuterPane.setCenter(houseFinalPane);
        scene.setRoot(houseFinalOuterPane);
        primaryStage.setMaximized(true);
    });    

    //End of housing page 2 demo

  
    borderpane.setTop(menubar);
    borderpane.getStylesheets().add(this.getClass().getResource("final.css").toExternalForm());
  
    primaryStage.setScene(scene);
    primaryStage.setMaximized(true);
    primaryStage.show();
  
    home2.setOnAction(event -> {
      scene.setRoot(borderpane);
      borderpane.setTop(menubar);
    });
  
  
  
    //Help scene
    Label issuesLabel = new Label("Have any issues or complaints that have come up?");
    issuesLabel.setStyle("-fx-font-size: 20pt");
    TextArea issuesTextArea = new TextArea();
    issuesTextArea.setPromptText("Write your complaint");
    Button submitButton = new Button("Submit");
    Button backToHome = new Button("Back to Home");
    Label feedbackLabel = new Label();
    VBox helpbox = new VBox(20, issuesLabel, issuesTextArea, feedbackLabel, submitButton, backToHome);
    helpbox.setPadding(new Insets(30, 30, 30, 30));
    BorderPane helpscene = new BorderPane(helpbox);
    helpscene.getStylesheets().add(this.getClass().getResource("final.css").toExternalForm());
  
    submitIssues.setOnAction(event -> {
      scene.setRoot(helpscene);
      helpscene.setTop(menubar);
  
    });
  
    submitButton.setOnAction(event -> {
      String issuesText = issuesTextArea.getText();
          if (issuesText.trim().isEmpty()) {
              feedbackLabel.setText("Write your complaint");
              feedbackLabel.setStyle("-fx-text-fill: red;");
          } else {
              feedbackLabel.setText("Submitted");
              feedbackLabel.setStyle("-fx-text-fill: green;");
          }
    });
  
  

  //Account

  Label logInLabel = new Label("Log In");
  logInLabel.setStyle("-fx-font-size: 30pt");
  Label enterUser = new Label("Please enter username: ");
  enterUser.setStyle("-fx-font-size: 20pt");
  TextField userName = new TextField();
  HBox user = new HBox(20, enterUser, userName);
  Label password = new Label("Please enter password: ");
  password.setStyle("-fx-font-size: 20pt");
  TextField passwordfield = new TextField();
  Button enter = new Button("Submit");
  enter.setStyle("-fx-font-size: 18pt");
  Label successful = new Label("");
  successful.setStyle("-fx-font-size: 17pt");
  HBox passwordbox = new HBox(20, password, passwordfield);
  VBox logInBox = new VBox(20, logInLabel, user, passwordbox, enter, successful);
  logInBox.setPadding(new Insets(300, 100, 200, 100));
  BorderPane logInPane = new BorderPane(logInBox);
  logInPane.getStylesheets().add(this.getClass().getResource("final.css").toExternalForm());

  logIn.setOnAction(event -> {
    logInPane.setTop(menubar);
    scene.setRoot(logInPane);
  });
  enter.setOnAction(event -> {
    successful.setText("You have successfully logged in!");
  });

  Label createAccountLabel = new Label("Create Account");
  createAccountLabel.setStyle("-fx-font-size: 30pt");
  Label createUserName = new Label("Create Username: ");
  createUserName.setStyle("-fx-font-size: 20pt");
  TextField createUserNameField = new TextField();
  HBox userNameCreate = new HBox(20, createUserName, createUserNameField);
  Label createPassword = new Label("Create Password: ");
  createPassword.setStyle("-fx-font-size: 20pt");
  TextField createPasswordField = new TextField();
  HBox passwordCreate = new HBox(20, createPassword, createPasswordField);
  Button enterCreate = new Button("Create");
  enter.setStyle("-fx-font-size: 18pt");
  successful.setText("");
  successful.setStyle("-fx-font-size: 17pt");
  VBox createAccountBox = new VBox(20, createAccountLabel, userNameCreate, passwordCreate, enterCreate, successful);
  createAccountBox.setPadding(new Insets(300, 100, 200, 100));
  BorderPane createAccountPane = new BorderPane(createAccountBox);
  createAccountPane.getStylesheets().add(this.getClass().getResource("final.css").toExternalForm());

  createAccount.setOnAction(event -> {
    createAccountPane.setTop(menubar);
    scene.setRoot(createAccountPane);
  });
  enterCreate.setOnAction(event -> {
      successful.setText("You have successfully created an account!");
  });

 
 
    forSale.setOnAction(event -> {
        forsalePane.setTop(menubar);
        scene.setRoot(forsalePane);
        primaryStage.setMaximized(true);
    });

    housing.setOnAction(event -> {
        housingPane.setTop(menubar);
        scene.setRoot(housingPane);
        primaryStage.setMaximized(true);
    });
    
    posting.setOnAction(event -> {
        borderpaneposting.setTop(menubar);
        primaryStage.setScene(postingscene);
        primaryStage.setMaximized(true);
      });
    
      cancel.setOnAction(event -> {
        borderpane.setTop(menubar);
        primaryStage.setScene(scene);
        primaryStage.setMaximized(true);
      });


  //Create discussion forum
  ListView<String> topicsListView = new ListView<>(FXCollections.observableArrayList(
            "Topic 1", "Topic 2", "Topic 3")); // Add your topics
    Button viewThreadsButton = new Button("View Threads");
    Button goBackHome = new Button("Back to home");
    VBox discussionForumBox = createStyledVBox(new Label("Select a Topic:"), topicsListView, viewThreadsButton, goBackHome);
    BorderPane discussionForumborderpane = new BorderPane(discussionForumBox);

    discussionForumborderpane.getStylesheets().add("discuss.css");

    goBackHome.setOnAction(event -> {
        scene.setRoot(borderpane);
        borderpane.setTop(menubar);
    });
    discussionForum.setOnAction(event -> {
      discussionForumborderpane.setTop(menubar);
        scene.setRoot(discussionForumborderpane);
    });
    discussionForum2.setOnAction(event -> {
      discussionForumborderpane.setTop(menubar);
        scene.setRoot(discussionForumborderpane);
    });

    // Create Threads Scene
    ListView<String> threadsListView = new ListView<>(FXCollections.observableArrayList(
            "Thread 1", "Thread 2", "Thread 3")); // Add your threads
    Button viewThreadButton = new Button("View Thread");
    Button backButtonToTopics = new Button("Back to Topics");
    VBox threadsBox = createStyledVBox(new Label("Select a Thread:"), threadsListView, viewThreadButton, backButtonToTopics);

    backButtonToTopics.setOnAction(event -> {
        discussionForumborderpane.setTop(menubar);
        scene.setRoot(discussionForumborderpane);
    });
    BorderPane threadborderpane = new BorderPane(threadsBox);
    threadborderpane.getStylesheets().add("discuss.css");

    viewThreadsButton.setOnAction(event -> {
        threadborderpane.setTop(menubar);
        scene.setRoot(threadborderpane);
    });

    Label threadTitleLabel = new Label("Thread Title: Your Thread Title");
    threadTitleLabel.setFont(Font.font("Verdana", 20));
    Label threadDescriptionLabel = new Label("Thread Description: Description by the poster goes here.");
    TextArea commentsTextArea = new TextArea();
    commentsTextArea.setPromptText("Type your comment here...");
    Button postCommentButton = new Button("Post Comment");
    Button backButtonToThreads = new Button("Back to Threads");
    VBox threadBox = createStyledVBox(threadTitleLabel, threadDescriptionLabel, new Label("Comments:"), commentsTextArea, postCommentButton, backButtonToThreads);

    backButtonToThreads.setOnAction(event -> {
        threadborderpane.setTop(menubar);
        scene.setRoot(threadborderpane);
    });
    BorderPane commentsborderpane = new BorderPane(threadBox);

    commentsborderpane.getStylesheets().add("discuss.css");

    viewThreadButton.setOnAction(event -> {
        commentsborderpane.setTop(menubar);
        scene.setRoot(commentsborderpane);
    });

    // Back Button
    Button backButton = new Button("Back");
    backButton.setOnAction(event -> {
        borderpane.setTop(menubar);
        scene.setRoot(borderpane);
    });





    //Create community page

    Label communitylabel = new Label("Community");
    communitylabel.setStyle("-fx-font-size: 22pt");
    ListView<String> communityList = new ListView<>();
    communityList.getItems().addAll("Looking for a pet-sitter for 2 dogs", "Tutoring - Math Lessons for High School Students", "Need Volunteers for Research Study", "Holiday Market at Local Playhouse!", "Movie Night at the Park!");
      Button communityButton = new Button("Enter");
  
      VBox communityBox = createStyledVBox(communitylabel, communityList, communityButton, cancel);
      communityBox.setPadding(new Insets(20, 20, 20, 20));
    BorderPane borderpanecommunity = new BorderPane(communityBox);
    borderpanecommunity.getStylesheets().add(this.getClass().getResource("post.css").toExternalForm());
  
    Label communityTopic = new Label();
    Label descriptionTopic = new Label();
    communityTopic.setStyle("-fx-font-size: 22pt");
    descriptionTopic.setStyle("-fx-font-size: 18pt");
    Button goBackToCommunity = new Button("Go Back");
  
      communityButton.setOnAction(event -> {
        int index = communityList.getSelectionModel().getSelectedIndex();
        if(index == 0) {
          communityTopic.setText(communityList.getSelectionModel().getSelectedItem());
          descriptionTopic.setText("I am looking for a pet-sitter for my 2 dogs! One is a labrador and the other is a dalmation. \nThey are very easy to take care of and are very friendly. \nPlease contact me at (123) 456-7890 for more information!");
        } else if(index == 1) {
          communityTopic.setText(communityList.getSelectionModel().getSelectedItem());
          descriptionTopic.setText("Hello! My name is Chloe Kim and I am a college student who is available for math tutoring for \nhigh school students. I have a flexible schedule and am available from Mondays - Thursdays.\n Please contact me at (111) 111-1111 for more information!");
        } else if(index == 2) {
          communityTopic.setText(communityList.getSelectionModel().getSelectedItem());
          descriptionTopic.setText("Hello! My name is Chloe Kim and I am currently running a research study on the effects of different levels of caffeine. \nI need volunteers to help my study and it will be a 3 week trial.\nPlease contact me at (222) 222-2222 for more information!");
        } else if(index == 3) {
          communityTopic.setText(communityList.getSelectionModel().getSelectedItem());
          descriptionTopic.setText("Happy Holidays!\nWe are excited for our winter holidays coming up and will be holding a a festive market at our local playhouse!\nAll proceeds will be donated to multiple charities!\nWe will be open from 9 AM - 3 PM.\nIf you have any questions, please email us at holidaymarket@gmail.com.");
        } else if(index == 4) {
          communityTopic.setText(communityList.getSelectionModel().getSelectedItem());
          descriptionTopic.setText("Come join us at our winter wonderland, movie experience at the park! We will have food trucks available on site with \na variety of cuisines and arts & crafts available as well!\nPlease bring blankets, chairs, and any food or drinks!\nThe movie night will take place at Pomona Park and start at 6 PM! We can't wait to see you there!");
        }
        VBox communityTopicBox = new VBox(20, communityTopic, descriptionTopic, goBackToCommunity);
        communityTopicBox.setPadding(new Insets(30, 30, 30, 30));
        BorderPane borderpaneCommunityTopic = new BorderPane(communityTopicBox);
        borderpaneCommunityTopic.getStylesheets().add(this.getClass().getResource("final.css").toExternalForm());
        borderpaneCommunityTopic.setTop(menubar);
        scene.setRoot(borderpaneCommunityTopic);
      });
  
      goBackToCommunity.setOnAction(event -> {
        borderpanecommunity.setTop(menubar);
        scene.setRoot(borderpanecommunity);
      });
  
    community.setOnAction(event -> {
      borderpanecommunity.setTop(menubar);
      scene.setRoot(borderpanecommunity);
    });
  
    community2.setOnAction(event -> {
      borderpanecommunity.setTop(menubar);
      scene.setRoot(borderpanecommunity);
    });
  
  

  //Jobs page

  Label jobLabel = new Label("Jobs");
  jobLabel.setStyle("-fx-font-size: 22pt");
  ListView<String> jobList = new ListView<>();
  jobList.getItems().addAll("Have fun teaching kids chess!", "Store Security Service", "Leasing Consultants");
  Button jobButton = new Button("Enter");
  Button cancel3 = new Button("Go back");

  VBox jobBox = createStyledVBox(jobLabel, jobList, jobButton, cancel3);
    jobBox.setPadding(new Insets(20, 20, 20, 20));
  BorderPane borderpanejob = new BorderPane(jobBox);
  borderpanejob.getStylesheets().add(this.getClass().getResource("post.css").toExternalForm());

  Label jobTopic = new Label();
  Label jobDescriptionTopic = new Label();
  jobTopic.setStyle("-fx-font-size: 22pt");
  jobDescriptionTopic.setStyle("-fx-font-size: 18pt");
  Button goBackToJob = new Button("Go Back");

  jobButton.setOnAction(event -> {
      int index1 = jobList.getSelectionModel().getSelectedIndex();
      if(index1 == 0) {
        jobTopic.setText(jobList.getSelectionModel().getSelectedItem());
        jobDescriptionTopic.setText("We are an organization that teaches children the rules, discipline, and strategy of chess\n in school. We are using the game of chess to reshape students' lives!\nRequirements:\nBachelor's Degree (preferred, but not required)\nBackground check (Required)");
      } else if(index1 == 1) {
        jobTopic.setText(jobList.getSelectionModel().getSelectedItem());
        jobDescriptionTopic.setText("We are looking for employees who are able to work 4-8 hour shifts, 4 days a week. \nYou will be expected to keep an eye on customers and stop anyone who is suspicious.\nFor more information, contact us at (000) 000-0000.");
      } else if(index1 == 2) {
        jobTopic.setText(jobList.getSelectionModel().getSelectedItem());
        jobDescriptionTopic.setText("Our staffing agency is looking for Leasing Consultants to start ASAP with at least 1 year of experience.\nRate of Pay is $17-$18 per hour\nFor more information, please call us at (444) 444-4444.");
      }
      VBox communityJobBox = new VBox(20, jobTopic, jobDescriptionTopic, goBackToJob);
      communityJobBox.setPadding(new Insets(30, 30, 30, 30));
      BorderPane jobCommunityTopic = new BorderPane(communityJobBox);
      jobCommunityTopic.getStylesheets().add(this.getClass().getResource("final.css").toExternalForm());
      jobCommunityTopic.setTop(menubar);
      scene.setRoot(jobCommunityTopic);
    });

    goBackToJob.setOnAction(event -> {
      borderpanejob.setTop(menubar);
      scene.setRoot(borderpanejob);
    });

  jobs.setOnAction(event -> {
    borderpanejob.setTop(menubar);
    scene.setRoot(borderpanejob);
  });

  jobs2.setOnAction(event -> {
    borderpanejob.setTop(menubar);
    scene.setRoot(borderpanejob);
  });

  cancel3.setOnAction(event -> {
    borderpane.setTop(menubar);
        scene.setRoot(borderpane);
  });




  //Gigs page

  Label gigsLabel = new Label("Gigs");
  gigsLabel.setStyle("-fx-font-size: 22pt");
  ListView<String> gigsList = new ListView<>();
  gigsList.getItems().addAll("Need a photographer for a party", "Cleaning lady needed", "Actors Needed!");
  Button gigsButton = new Button("Enter");
  Button cancel4 = new Button("Go back");

  VBox gigsBox = createStyledVBox(gigsLabel, gigsList, gigsButton, cancel4);
    gigsBox.setPadding(new Insets(20, 20, 20, 20));
  BorderPane borderpanegigs = new BorderPane(gigsBox);
  borderpanegigs.getStylesheets().add(this.getClass().getResource("post.css").toExternalForm());

  Label gigsTopic = new Label();
  Label gigsDescriptionTopic = new Label();
  gigsTopic.setStyle("-fx-font-size: 22pt");
  gigsDescriptionTopic.setStyle("-fx-font-size: 18pt");
  Button goBackToGigs = new Button("Go Back");

  gigsButton.setOnAction(event -> {
      int index2 = gigsList.getSelectionModel().getSelectedIndex();
      if(index2 == 0) {
        gigsTopic.setText(gigsList.getSelectionModel().getSelectedItem());
        gigsDescriptionTopic.setText("Hello!\nMy friend is having a big party next week and needs a photographer ASAP!!\nPrices are negotiable and the photographer needs to stay from 7 PM - 9 PM.\nFood will be provided and they are welcome to enjoy the party after 9 PM.\nIf you are interested, please give me a call at (987) 654-3210.");
      } else if(index2 == 1) {
        gigsTopic.setText(gigsList.getSelectionModel().getSelectedItem());
        gigsDescriptionTopic.setText("Hello!\nI currently rent out an apartment for AirBNB and it got completely trashed. I am looking for anyone who is willing to clean large messes.\nPrices are negotiable and need services right away!\nIf anyone is interested, please call me at (888) 888-8888.");
      } else if(index2 == 2) {
        gigsTopic.setText(gigsList.getSelectionModel().getSelectedItem());
        gigsDescriptionTopic.setText("I am a creative arts director and need actors for my short film. I am holding auditions in LA (location TBD) and\nwelcome all talent! If you are interested or want more information, please call (555) 555-5555.");
      }
      VBox communityGigsBox = new VBox(20, gigsTopic, gigsDescriptionTopic, goBackToGigs);
      communityGigsBox.setPadding(new Insets(30, 30, 30, 30));
      BorderPane gigsCommunityTopic = new BorderPane(communityGigsBox);
      gigsCommunityTopic.getStylesheets().add(this.getClass().getResource("final.css").toExternalForm());
      gigsCommunityTopic.setTop(menubar);
      scene.setRoot(gigsCommunityTopic);
    });

    goBackToGigs.setOnAction(event -> {
      borderpanegigs.setTop(menubar);
      scene.setRoot(borderpanegigs);
    });

  gigs.setOnAction(event -> {
    borderpanegigs.setTop(menubar);
    scene.setRoot(borderpanegigs);
  });

  gigs2.setOnAction(event -> {
    borderpanegigs.setTop(menubar);
    scene.setRoot(borderpanegigs);
  });

  cancel4.setOnAction(event -> {
    borderpane.setTop(menubar);
        scene.setRoot(borderpane);
  });



  //Services page
  Label servicesLabel = new Label("Services");
  servicesLabel.setStyle("-fx-font-size: 22pt");
  ListView<String> servicesList = new ListView<>();
  servicesList.getItems().addAll("Graphic Designer", "Electrician", "Tattoo Artist");
  Button servicesButton = new Button("Enter");
  Button cancel5 = new Button("Go back");

  VBox servicesBox = createStyledVBox(servicesLabel, servicesList, servicesButton, cancel5);
    servicesBox.setPadding(new Insets(20, 20, 20, 20));
  BorderPane borderpaneservices = new BorderPane(servicesBox);
  borderpaneservices.getStylesheets().add(this.getClass().getResource("post.css").toExternalForm());

  Label servicesTopic = new Label();
  Label servicesDescriptionTopic = new Label();
  servicesTopic.setStyle("-fx-font-size: 22pt");
  servicesDescriptionTopic.setStyle("-fx-font-size: 18pt");
  Button goBackToServices = new Button("Go Back");

  servicesButton.setOnAction(event -> {
      int index3 = servicesList.getSelectionModel().getSelectedIndex();
      if(index3 == 0) {
        servicesTopic.setText(servicesList.getSelectionModel().getSelectedItem());
        servicesDescriptionTopic.setText("Hello, \nmy name is Chloe Kim and I am an experienced graphic designer. I design in all different styles and have\nworked with over 100 different clients on different projects. I am able to transform\nyour thoughts into images and create art. \nIf you are looking for a Graphic Designer, please give me a call at (314) 314-5892!");
      } else if(index3 == 1) {
        servicesTopic.setText(servicesList.getSelectionModel().getSelectedItem());
        servicesDescriptionTopic.setText("Hello! \nI am a licensed electrician who is able to travel to assist you! I am available 7 days a week from 7 AM - 7 PM \nand my schedule is extremely flexible. I do offer discounts and can change prices to best fit your budget. \nPlease contact me at (192) 982-5782 if you are in need of an electrician.");
      } else if(index3 == 2) {
        servicesTopic.setText(servicesList.getSelectionModel().getSelectedItem());
        servicesDescriptionTopic.setText("Hey everyone! \nI started tattooing about a year ago, but don't have many clients at the moment. If you are interested in getting\na tattoo at a discounted price, hit me up! I am able to do house calls for an extra fee, but am able to do any size tattoo.\nIf this is something you're interested in, please call me at (348) 983-8757.");
      }
      VBox communityServicesBox = new VBox(20, servicesTopic, servicesDescriptionTopic, goBackToServices);
      communityServicesBox.setPadding(new Insets(30, 30, 30, 30));
      BorderPane servicesCommunityTopic = new BorderPane(communityServicesBox);
      servicesCommunityTopic.getStylesheets().add("final.css");
      servicesCommunityTopic.setTop(menubar);
      scene.setRoot(servicesCommunityTopic);
    });

    goBackToServices.setOnAction(event -> {
      borderpaneservices.setTop(menubar);
      scene.setRoot(borderpaneservices);
    });

  services.setOnAction(event -> {
    borderpaneservices.setTop(menubar);
    scene.setRoot(borderpaneservices);
  });

  services2.setOnAction(event -> {
    borderpaneservices.setTop(menubar);
    scene.setRoot(borderpaneservices);
  });

  cancel5.setOnAction(event -> {
    borderpane.setTop(menubar);
        scene.setRoot(borderpane);
  });

  //Resumes page
  Label resumesLabel = new Label("Resumes Section");
    resumesLabel.setStyle("-fx-font-size: 20pt");

    ListView<String> resumesListView = new ListView<>(FXCollections.observableArrayList(
            "Resume 1", "Resume 2", "Resume 3")); // You can fetch real data here

    Button viewResumeButton = new Button("View Resume");
    Button backButtonToHomeFromResume = new Button("Back to Home");

    VBox resumesBox = createStyledVBox(resumesLabel, resumesListView, viewResumeButton, backButtonToHomeFromResume);
    BorderPane resumesBorderPane = new BorderPane(resumesBox);
    resumesBorderPane.getStylesheets().add("discuss.css");

    resumes.setOnAction(event -> {
        resumesBorderPane.setTop(menubar);
        scene.setRoot(resumesBorderPane);
    });

    backButtonToHomeFromResume.setOnAction(event -> {
      borderpane.setTop(menubar);
        scene.setRoot(borderpane);
    });
 
      // View Resume Scene
    Label resumeTitleLabel = new Label("Resume Title: Sample Resume");
    resumeTitleLabel.setFont(Font.font("Verdana", 20));

    TextArea resumeContentTextArea = new TextArea();
    resumeContentTextArea.setEditable(false);
    resumeContentTextArea.setText("This is a sample resume content.");

    Button backButtonToResumes = new Button("Back to Resumes");
    VBox viewResumeBox = createStyledVBox(resumeTitleLabel, new Label("Resume Content:"), resumeContentTextArea, backButtonToResumes);
    BorderPane viewResumeBorderPane = new BorderPane(viewResumeBox);
    viewResumeBorderPane.getStylesheets().add(this.getClass().getResource("discuss.css").toExternalForm());

    viewResumeButton.setOnAction(event -> {
        viewResumeBorderPane.setTop(menubar);
        scene.setRoot(viewResumeBorderPane);
    });

    backButtonToResumes.setOnAction(event -> {
        resumesBorderPane.setTop(menubar);
        scene.setRoot(resumesBorderPane);
    });

    }

    private VBox createStyledVBox(Node... nodes) {
    VBox vBox = new VBox(10, nodes);
    vBox.setAlignment(Pos.CENTER);
    vBox.setPadding(new Insets(20));
    vBox.setStyle("-fx-background-color: #f0f0f0;");
    return vBox;
  }
}  
