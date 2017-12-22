
import javax.swing.*;
import java.sql.*;
import java.util.*;
import java.util.Date;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Home.java
 *
 * Created on Oct 22, 2013, 10:19:07 AM
 */
/**
 *
 * @author User1
 */
public class Home extends javax.swing.JFrame {

    String pic, p;
    String price;
    Connection con;
    ResultSet rs;
    Statement st;
    String area;
    //method for action next back selection

    public void actionbtn(String m) {
        if (m.equals("Swat")) {
            background.setIcon(new ImageIcon("D:/Games1/action/swat.jpg"));
            p = "D:/Games1/action/swat.jpg";
            jLabel100.setText("Rs 599");
        }
        if (m.equals("Total Overdose")) {
            background.setIcon(new ImageIcon("D:/Games1/action/totaloverdose.jpg"));
            acarea.setText("Total Overdose : A Gunslinger's Tale in Mexico as it is known in the US is an open world action/adventure third-person \n shooter video game that was developed by Deadline Games and published by Sci Entertainment in Europe and by Eidos \nin North America. It contains a demo for Tomb Raider: Legend on thePlayStation 2 and Xbox versions. \nChili Con Carnage, a PlayStation Portable game using some of the original characters but following a \ndifferent plotline than Total Overdose, was released on February 13, 2007.");
            p = "D:/Games1/action/totaloverdose.jpg";
            jLabel100.setText("Rs 599");
        }
        if (m.equals("Halo")) {
            background.setIcon(new ImageIcon("D:/Games1/action/halo2.jpg"));
            p = "D:/Games1/action/halo2.jpg";
            acarea.setText("Halo is a 2004 first-person shooter video game developed by Bungie Studios. \nThe game is the second installment in the Halo franchise and the sequel\n to 2001's critically acclaimedHalo: Combat Evolved. The player alternately\n assumes the roles of the human Master Chief and the alien Arbiter in a\n 26th-century conflict between the human United Nations Space Command and\n genocidal Covenant");
            jLabel100.setText("Rs 599");
        }
        if (m.equals("Max Payne")) {
            background.setIcon(new ImageIcon("D:/Games1/action/max payne 2.jpg"));
            p = "D:/Games1/action/max payne 2.jpg";
            acarea.setText("Max Payne is a third-person shooter video game developed by\n Finnish developers Remedy Entertainment and published by Gathering \nin North America and 3D Realms in Europe on July 2001 . There were plans for a \nDreamcast version of Max Payne, but they were canceled due to the discontinuation \nof the console. The game was re-released on April 27, 2009 as a downloadable \ngame in the Xbox Originals program for the Xbox 360.");
            jLabel100.setText("Rs 899");
        }

        if (m.equals("James Bond")) {
            background.setIcon(new ImageIcon("D:/Games1/action/James Bond.jpg"));
            p = "D:/Games1/action/James Bond.jpg";
            acarea.setText("007 Legends is a first-person shooter video game featuring the\n character of British secret agent James Bond. It is developed by \nEurocom and released in October 2012. The game is available as \nphysical optical disc media. Although this is moot in this game's \ncase as it was removed off all other digital stores without warning.");
            jLabel100.setText("Rs 999");
        }
        if (m.equals("MetalSlug")) {
            background.setIcon(new ImageIcon("D:/Games1/action/MetalSlug.jpg"));
            p = "D:/Games1/action/MetalSlug.jpg";
            acarea.setText("Metal Slug  is a series of run and gun video games first released \non Neo-Geo arcade machines and game consoles created by SNK.\n It was also ported to other consoles, such as the Sega Saturn,\n the PlayStation, the Neo-Geo Pocket Color and more recently, \nthe Game Boy Advance, PlayStation 2, PlayStation 3, PlayStation Portable, \nXbox, Xbox 360 andNintendo DS. ");
            jLabel100.setText("Rs 199");
        }
        if (m.equals("Project IGI")) {
            background.setIcon(new ImageIcon("D:/Games1/action/projectigi.jpg"));
            p = "D:/Games1/action/projectigi.jpg";
            acarea.setText("Project I.G.I.: I'm Going In is a tacticalfirst-person shooter developed \nby Innerloop Studios and released on December 15, 2000 by Eidos \nInteractive. Upon release the game garnered mixed reviews due to a number\n of shortcoming. However it was praised for its superb sound design and graphics, \nthanks in part to its use of a proprietary game engine that was previously \nused in Innerloop's Joint Strike Fighter.");
            jLabel100.setText("Rs 899");
        }
        if (m.equals("AssassinsCreed")) {
            background.setIcon(new ImageIcon("D:/Games1/action/AssassinsCreed.jpg"));
            acarea.setText("Assassin's Creed is a historical fiction action-adventure open \nworld stealth video gameseries that consists of six main games\n and a number of supporting materials, as of 2013. The main games \nin the franchise were developed by Ubisoft Montreal for the single player and Ubisoft Annecy\n for the multiplayer. The series has been well received by the public \nand critics, and has sold over 55 million copies as of March,\n 2013. ");
            p = "D:/Games1/action/AssassinsCreed.jpg";
            jLabel100.setText("Rs 1999");
        }
        if (m.equals("Bloody Roar")) {
            background.setIcon(new ImageIcon("D:/Games1/action/BloodyRoar2.jpg"));
            acarea.setText("Bloody Roar known as Bloody Roar: Hyper Beast Duel in\n Europe, is a fighting video game originally developed by Raizing as an \narcade game. It was later adapted for the PlayStation by Hudson Soft andpublished by \nSony Computer Entertainment for the PlayStation. The arcade version was released on July 7, 1997 and was titled \nBeastorizer in North America. ");
            p = "D:/Games1/action/BloodyRoar2.jpg";
            jLabel100.setText("Rs 299");
        }

        if (m.equals("WWE RAW")) {
            background.setIcon(new ImageIcon("D:/Games1/action/raw.jpg"));
            p = "D:/Games1/action/raw.jpg";
            acarea.setText("WWE is a professional wrestling video game developed by Yuke's \nand published by THQ . It is the first game in the WWEseries and the fourteenth \noverall in the combined series. It is the sequel to WWE SmackDown vs. Raw 2011 and succeeded by WWE '13. It is also the first \ngame in the series developed exclusively for current generation home \nconsoles. ");
            jLabel100.setText("Rs 499");
        }

        if (m.equals(" Desert Storm")) {
            background.setIcon(new ImageIcon("D:/Games1/action/desertstorm.jpg"));
            p = "D:/Games1/action/desertstorm.jpg";
            jLabel100.setText("Rs 999");
            acarea.setText("A video game based on The Gulf War codenamed Operation \nDesert Storm was a war waged by a U.N.-authorized coalition \nforce from 34 nations led by the United States against Iraq in response to Iraq's invasion and annexation \nof Kuwait. ");
        }
        if (m.equals("Call Of Duty")) {
            background.setIcon(new ImageIcon("D:/Games1/action/COD.jpg"));
            p = "D:/Games1/action/COD.jpg";
            acarea.setText("Call of Duty is a first-person shooter video game, \nIt was developed by Activision and published by Konami in Japan and \nActivision in the rest of the world. The game was released on October 25, 2005 for Microsoft Windows PCs and on November 22, 2005 as a \nlaunch game for the Xbox 360 in Europe, Australia and South America, and \nlater in Japan. ");
            jLabel100.setText("Rs 2199");
        }
    }

    // Coding for adventure next , back buttons.
    public void AdventureBtn(String n) {
        if (n.equals("GTA")) {
            Adback.setIcon(new ImageIcon("D:/Games1/adventure/GTAV.jpg"));
            p = "D:/Games1/adventure/GTAV.jpg";
            adarea.setText("Grand Theft Auto, abbreviated to GTA, is a video game \nseries created by David Jones and Mike Dailly, and game designer \nZachary Clarke. It is primarily developed by Rockstar North in the United Kingdom, and published by Rockstar Games. The name of the series is \nderived from grand theft auto, a term referring to motor vehicle theft");
            jLabel102.setText("Rs 999");
        }
        if (n.equals("Gun")) {
            Adback.setIcon(new ImageIcon("D:/Games1/adventure/Gunwall.jpg"));
            adarea.setText("");
            p = "D:/Games1/adventure/Gunwall.jpg";
            jLabel102.setText("Rs 1099");
        }
        if (n.equals("Black Mirror III")) {
            Adback.setIcon(new ImageIcon("D:/Games1/adventure/Black Mirror11.jpg"));
            adarea.setText("");
            p = "D:/Games1/adventure/PrinceofPersia.jpg";
            jLabel102.setText("Rs 499");
        }
        if (n.equals("Ages Of Pirates")) {
            Adback.setIcon(new ImageIcon("D:/Games1/adventure/agesofpirates.jpg"));
            p = "D:/Games1/adventure/agesofpirates.jpg";
            adarea.setText("");
            jLabel102.setText("Rs 499");
        }
        if (n.equals("Batman Arkham Asylum")) {
            Adback.setIcon(new ImageIcon("D:/Games1/adventure/Batman1.jpg"));
            p = "D:/Games1/adventure/Batman1.jpg";
            adarea.setText("Batman: Arkham Origins is a 2013 action-adventure video game developed\n by. Based on the DC Comics superhero Batman, it is the successor to the 2011 \nvideo game Batman: Arkham City, and the third installment in the Batman: Arkham series. \nIt was released worldwide on October 25, 2013");
            jLabel102.setText("Rs 999");
        }
        if (n.equals("Ironman")) {
            Adback.setIcon(new ImageIcon("D:/Games1/adventure/IronMan.jpg"));
            p = "D:/Games1/adventure/40.jpg";
            adarea.setText("Iron Man is a 2008 video game based on the film of the same name as well as the \nclassic iterations of the character. It was released on May 2, 2008 to coincide with the \nrelease of the film in cinemas. The game is published by Sega, and was released\n on PlayStation 3, Xbox 360 , PlayStation 2, PlayStation Portable, Nintendo DS, \nWii, PC  andMobile Platforms.The enemies are Advanced Idea Mechanics, \nthe Maggia and the Ten Rings terrorist group. \nThe super villains in the game includes Blacklash, Controller, Titanium Man,Melter, and \nIron Monger. ");
            jLabel102.setText("Rs 1099");
        }
        if (n.equals("Wolverine")) {
            Adback.setIcon(new ImageIcon("D:/Games1/adventure/XMenorigins.jpg"));
            p = "D:/Games1/adventure/XMenorigins.jpg";
            adarea.setText("X-Men Origins: Wolverine is a 2009 hack and slash action-adventure \ngame loosely based on the film of the same name. The game release \ncoincided with the release of the film on May 1. The game was developed\n primarily by Raven Software, who used Unreal engine technology to develop the game.  ");
            jLabel102.setText("Rs 999");
        }
        if (n.equals("superman")) {
            Adback.setIcon(new ImageIcon("D:/Games1/adventure/superman.jpg"));
            p = "D:/Games1/adventure/superman.jpg";
            adarea.setText("The game was released on Xbox 360, PlayStation 2 and Xbox.\nThe story begins with Metropolis suffering a devastating meteor shower. \nSuperman uses his full array of powers, including his strength, freeze\n breath, and heat vision to destroy the deadly rocks before they can strike \nthe city.");
            jLabel102.setText("Rs 799");
        }
        if (n.equals("Hulk")) {
            Adback.setIcon(new ImageIcon("D:/Games1/adventure/Hulk.jpg"));
            p = "D:/Games1/adventure/Hulk.jpg";
            adarea.setText("Hulk is a video game sequel based on the 2003 movie of the same name. \nIt was developed by Radical Entertainment and published by Vivendi Universal Games &\n Universal Interactive. A signature feature has Eric Bana \nreprises his role of Bruce Banner");
            jLabel102.setText("Rs 899");
        }
        if (n.equals("Spiderman")) {
            Adback.setIcon(new ImageIcon("D:/Games1/adventure/41.jpg"));
            adarea.setText("Spider-Man is an action game loosely based on the Spider-Man \nfilm and released for the Game Boy Advance, Microsoft Windows, Xbox 360, \nPlayStation 2, Nintendo DS, Wii, PlayStation 3 and PlayStation Portable. There was also going to be a GameCube release of the game but it got cancelled\n due to its discontinuation along with Shrek the Third (video game).");
            p = "D:/Games1/adventure/41.jpg";
            jLabel102.setText("Rs 599");
        }

        if (n.equals("Krrish")) {
            Adback.setIcon(new ImageIcon("D:/Games1/adventure/krissh.jpg"));
            p = "D:/Games1/adventure/krissh.jpg";
            jLabel102.setText("Rs 399");
        }
        if (n.equals("PrinceofPersia")) {
            Adback.setIcon(new ImageIcon("D:/Games1/adventure/PrinceofPersia.jpg"));
            p = "D:/Games1/adventure/PrinceofPersia.jpg";
            jLabel102.setText("Rs 1299");
            adarea.setText("");
        }
    }

    public void SportsBtn(String o) {
        if (o.equals("Microprose Soccer ")) {
            slabel.setIcon(new ImageIcon("D:/Games1/sports/Microprose Soccer.jpg"));
            sparea.setText("Microprose Soccer is a soccer videogame published by\n Microprose in 1988.[1] The original Commodore \n64 version was developed by Sensible Software, with conversions carried \nout to other formats. It is the fore-runner of the 16-bit classic \nSensible Soccer. In the United States the game was released under a title \nKeith Van Eron's Pro Soccer.");
            p = "D:/Games1/sports/Microprose Soccer.jpg";
            jLabel106.setText("Rs 999");
        }
        if (o.equals("Cricket")) {
            slabel.setIcon(new ImageIcon("D:/Games1/sports/Cricket.jpg"));
            p = "D:/Games1/sports/Cricket.jpg";
            jLabel106.setText("Rs 699");
            sparea.setText("");

        }
        if (o.equals("FIFA 10 ")) {
            slabel.setIcon(new ImageIcon("D:/Games1/sports/fifa10.jpg"));
            sparea.setText("FIFA 10 is the 17th title in Electronic Arts' FIFAseries \nof football video games. Developed by EA Canada,\n it was published by Electronic Arts worldwide under the EA Sports label. \nIt was released on 2 October 2009 in Europe, 30 September in \nAustralia and 20 October 2009 in North America. ");
            p = "D:/Games1/sports/fifa10-pc-cover.jpg";
            jLabel106.setText("Rs 999");
        }
        if (o.equals("Player Manager")) {
            slabel.setIcon(new ImageIcon("D:/Games1/sports/PM.jpg"));
            sparea.setText("");
            p = "D:/Games1/sports/player_manager_01.jpg";
            jLabel106.setText("Rs 499");
        }

        if (o.equals("Street Cricket")) {
            slabel.setIcon(new ImageIcon("D:/Games1/sports/Street Cricket.jpg"));
            p = "D:/Games1/sports/Street Cricket.jpg";
            jLabel106.setText("Rs 999");
        }
        if (o.equals("Tennis")) {
            slabel.setIcon(new ImageIcon("D:/Games1/sports/Tennis.jpg"));
            p = "D:/Games1/sports/Street Cricket.jpg";
            jLabel106.setText("Rs 399");
            sparea.setText("");
        }
        if (o.equals("IPL")) {
            slabel.setIcon(new ImageIcon("D:/Games1/sports/IPL4.jpg"));
            sparea.setText("");
            p = "D:/Games1/sports/IPL4.jpg";
            jLabel106.setText("Rs 499");
        }
    }

    public void RacingBtn(String h) {
        if (h.equals("RoadRash")) {
            rlabel.setIcon(new ImageIcon("D:/Games1/racing/RoadRash.jpg"));
            p = "D:/Games1/racing/RoadRash.jpg";
            jLabel104.setText("Rs 199");
            raarea.setText("Road Rash is the name of a motorcycle-racing \nvideo game series by Electronic Arts in which the player \nparticipates in violent, illegal street races. The game was originally \nreleased for the Sega Mega Drive/Genesis but ported to \nseveral other systems. The game's title is based on the slang \nterm for the severe friction burns that can occur in a motorcycle fall where skin comes \ninto contact with the ground at high speed.");
        }
        if (h.equals("MidTown Madness")) {
            rlabel.setIcon(new ImageIcon("D:/Games1/racing/middown.jpg"));
            p = "D:/Games1/racing/middown.jpg";
            jLabel104.setText("Rs 299");
            raarea.setText("Road Rash is the name of a motorcycle-racing \nvideo game series by Electronic Arts in which the player \nparticipates in violent, illegal street races. The game was originally \nreleased for the Sega Mega Drive/Genesis but ported to \nseveral other systems. The game's title is based on the slang \nterm for the severe friction burns that can occur in a motorcycle fall where skin comes \ninto contact with the ground at high speed.");
        }

        if (h.equals("NFS MOSTWANTED")) {
            rlabel.setIcon(new ImageIcon("D:/Games1/racing/nfs.jpg"));
            p = "D:/Games1/racing/nfs.jpg";
            jLabel104.setText("Rs 999");
            raarea.setText("Need for Speed: Most Wanted is a 2012 racing video game with nonlinear \ngameplay, developed by Criterion Games and published by Electronic Arts. Announced on \n4 June 2012, and with a Wii U version following on 14 March 2013 under the title\n Need for Speed: Most Wanted U.  ");
        }
        if (h.equals("Formula1")) {
            rlabel.setIcon(new ImageIcon("D:/Games1/racing/formula23JPG.jpg"));
            p = "D:/Games1/racing/formula23JPG.jpg";
            jLabel104.setText("Rs 399");
            raarea.setText("");
        }
        if (h.equals("SuperTrucks")) {
            rlabel.setIcon(new ImageIcon("D:/Games1/racing/SuperTrucks.jpg"));
            p = "D:/Games1/racing/SuperTrucks.jpg";
            jLabel104.setText("Rs 699");
            raarea.setText("Super Trucks Racing is a truck racing video game for \nthe PlayStation 2. All drivers and sponsor information \nare based on 2002 season of the Super Trucks racing series. \nMost of the other songs in the game are considered to be techno \nmusic done to the tune of the souped up engines at more than 122.0 miles \nper hour (196.3 km/h). This makes the trucks slightly faster than their \nreal-life counterparts who are restricted to a maximum speed limit of \n100.0 miles per hour (160.9 km/h) for safety reasons.");
        }
        if (h.equals("Grand Prix Legends ")) {
            rlabel.setIcon(new ImageIcon("D:/Games1/racing/GrandPrix.jpg"));
            p = "D:/Games1/racing/GrandPrix.jpg";
            jLabel104.setText("Rs 599");
            raarea.setText("");
        }
        if (h.equals("NFS Carbon  ")) {
            rlabel.setIcon(new ImageIcon("D:/Games1/racing/nfs1.jpg"));
            p = "D:/Games1/racing/nfs1.jpg";
            jLabel104.setText("Rs 999");
            raarea.setText(" Need for Speed: Carbon is an Electronic Artsvideo game \nbelonging to the Need for Speed series. Released in 2006. \nThis was the first game to gain the PEGI Rating of 12 .. \nThe locations of both Most Wanted and Carbon  \nare featured in the 2010 MMO game, Need for Speed: World.");
        }
        if (h.equals("CRASH TIME ")) {
            rlabel.setIcon(new ImageIcon("D:/Games1/racing/crashtime.jpg"));
            p = "D:/Games1/racing/crashtime.jpg";
            jLabel104.setText("Rs 999");
            raarea.setText("");
        }
        if (h.equals("BurnOutRevengue")) {
            rlabel.setIcon(new ImageIcon("D:/Games1/racing/BOR.jpg"));
            p = "D:/Games1/racing/BurnOutRevengue .jpg";
            jLabel104.setText("Rs 1999");
            raarea.setText("Burnout Revenge is the fourth video game \nin the Burnout series of racing games. It was developed by\n Criterion Games and published by Electronic Arts. \nIt was released for the PlayStation 2 and Xbox on 13 September 2005 \nand Xbox 360 on 7 March 2006, alongside the PlayStation Portable \nand Nintendo DS title Burnout Legends.");
        }
        if (h.equals("GRID")) {
            rlabel.setIcon(new ImageIcon("D:/Games1/racing/GRID.jpg"));
            jLabel104.setText("Rs 999");
            p = "D:/Games1/racing/GRID.jpg";
            raarea.setText("");
        }
        if (h.equals("NFS Rivals ")) {
            rlabel.setIcon(new ImageIcon("D:/Games1/racing/needforspeedrivals.jpg"));
            p = "D:/Games1/racing/needforspeedrivals.jpg";
            jLabel104.setText("Rs 1999");
            raarea.setText("");
        }
        if (h.equals("Desert Monster")) {
            rlabel.setIcon(new ImageIcon("D:/Games1/racing/desertmonster.jpg"));
            p = "D:/Games1/racing/desertmonster.jpg";
            raarea.setText("");
            jLabel104.setText("Rs 199");
        }
    }

    /** Creates new form Home */
    public Home() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JFrame();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        existinguser = new javax.swing.JButton();
        help1 = new javax.swing.JLabel();
        newuser = new javax.swing.JLabel();
        His = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        history = new javax.swing.JFrame();
        jLabel13 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        help = new javax.swing.JFrame();
        jLabel55 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        pass = new javax.swing.JFrame();
        name = new javax.swing.JTextField();
        passsign = new javax.swing.JButton();
        psd = new javax.swing.JPasswordField();
        jLabel96 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pass1 = new javax.swing.JFrame();
        jLabel19 = new javax.swing.JLabel();
        psd1 = new javax.swing.JPasswordField();
        name1 = new javax.swing.JTextField();
        save1 = new javax.swing.JButton();
        jLabel97 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        type = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        acbutton = new javax.swing.JButton();
        adbutton = new javax.swing.JButton();
        spbutton = new javax.swing.JButton();
        rabutton = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        Action = new javax.swing.JFrame();
        acnext = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        acback = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        backac = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        acarea = new javax.swing.JTextArea();
        jLabel100 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        Adventure = new javax.swing.JFrame();
        Adback = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        adback1 = new javax.swing.JLabel();
        adnext = new javax.swing.JLabel();
        adpre = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        backad = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        adarea = new javax.swing.JTextArea();
        jLabel51 = new javax.swing.JLabel();
        Racing = new javax.swing.JFrame();
        raback = new javax.swing.JLabel();
        ranext = new javax.swing.JLabel();
        rapre = new javax.swing.JLabel();
        rlabel = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        raarea = new javax.swing.JTextArea();
        jLabel50 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        Sports = new javax.swing.JFrame();
        slabel = new javax.swing.JLabel();
        spback = new javax.swing.JLabel();
        rapre1 = new javax.swing.JLabel();
        spnext = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        sparea = new javax.swing.JTextArea();
        jLabel62 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        Purchase = new javax.swing.JFrame();
        jLabel16 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        nam = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        Pin = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        add = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        State = new javax.swing.JTextField();
        City = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cash = new javax.swing.JRadioButton();
        visa = new javax.swing.JRadioButton();
        debit = new javax.swing.JRadioButton();
        jLabel93 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        detail = new javax.swing.JFrame();
        jLabel12 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        purchasefield = new javax.swing.JTextArea();
        jLabel32 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        purchase = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        backmain = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        thankyou = new javax.swing.JFrame();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        shop = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        main.setMinimumSize(new java.awt.Dimension(891, 712));
        main.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                mainWindowOpened(evt);
            }
        });
        main.getContentPane().setLayout(null);

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 51));
        jLabel44.setText(" EXCITING GAMES WITH ITS  RATINGS");
        main.getContentPane().add(jLabel44);
        jLabel44.setBounds(190, 360, 460, 20);

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 51));
        jLabel45.setText(" A USER FRIENDLY SITE");
        main.getContentPane().add(jLabel45);
        jLabel45.setBounds(210, 400, 400, 30);

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 51));
        jLabel46.setText(" EASY TO BUY GAMES");
        main.getContentPane().add(jLabel46);
        jLabel46.setBounds(210, 450, 380, 30);

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 51));
        jLabel47.setText(" RETURNABLE WITHIN FIXED PERIOD");
        main.getContentPane().add(jLabel47);
        jLabel47.setBounds(210, 490, 460, 50);

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 51));
        jLabel48.setText(" BIG GAMES WITH LOW PRICE");
        main.getContentPane().add(jLabel48);
        jLabel48.setBounds(210, 550, 420, 30);

        existinguser.setBackground(new java.awt.Color(255, 153, 153));
        existinguser.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        existinguser.setForeground(new java.awt.Color(0, 0, 255));
        existinguser.setText("EXISTING USER");
        existinguser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                existinguserActionPerformed(evt);
            }
        });
        main.getContentPane().add(existinguser);
        existinguser.setBounds(50, 70, 290, 40);

        help1.setBackground(new java.awt.Color(255, 102, 102));
        help1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/symbols/330.jpg"))); // NOI18N
        help1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                help1MouseClicked(evt);
            }
        });
        main.getContentPane().add(help1);
        help1.setBounds(620, 190, 120, 120);

        newuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/symbols/13.jpg"))); // NOI18N
        newuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newuserMouseClicked(evt);
            }
        });
        main.getContentPane().add(newuser);
        newuser.setBounds(410, 40, 110, 90);

        His.setIcon(new javax.swing.ImageIcon(getClass().getResource("/symbols/history_logo.jpg"))); // NOI18N
        His.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HisMouseClicked(evt);
            }
        });
        main.getContentPane().add(His);
        His.setBounds(30, 199, 120, 111);
        main.getContentPane().add(jLabel22);
        jLabel22.setBounds(670, 530, 90, 80);

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 204, 51));
        jLabel41.setText("NEW USER");
        main.getContentPane().add(jLabel41);
        jLabel41.setBounds(430, 140, 80, 20);

        jLabel89.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(0, 204, 0));
        jLabel89.setText("#");
        main.getContentPane().add(jLabel89);
        jLabel89.setBounds(190, 550, 15, 25);

        jLabel90.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(0, 204, 0));
        jLabel90.setText("#");
        main.getContentPane().add(jLabel90);
        jLabel90.setBounds(190, 500, 15, 25);

        jLabel91.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(0, 204, 0));
        jLabel91.setText("#");
        main.getContentPane().add(jLabel91);
        jLabel91.setBounds(190, 450, 15, 25);

        jLabel88.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(0, 204, 0));
        jLabel88.setText("#");
        main.getContentPane().add(jLabel88);
        jLabel88.setBounds(190, 360, 15, 25);

        jLabel92.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(0, 204, 0));
        jLabel92.setText("#");
        main.getContentPane().add(jLabel92);
        jLabel92.setBounds(190, 400, 15, 25);

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/umesh/hd-wallpapers-blue-lightning-wallpaper-projects-services-1280x1024-wallpaper.jpg"))); // NOI18N
        main.getContentPane().add(jLabel56);
        jLabel56.setBounds(0, 0, 890, 710);

        history.setMinimumSize(new java.awt.Dimension(891, 712));
        history.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                historyWindowOpened(evt);
            }
        });
        history.getContentPane().setLayout(null);

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 255));
        jLabel13.setText("HISTORY");
        history.getContentPane().add(jLabel13);
        jLabel13.setBounds(110, 10, 200, 50);

        jLabel63.setBackground(new java.awt.Color(255, 0, 102));
        jLabel63.setFont(new java.awt.Font("ITC Bookman Light", 3, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(51, 255, 51));
        history.getContentPane().add(jLabel63);
        jLabel63.setBounds(110, 110, 680, 30);

        jLabel64.setBackground(new java.awt.Color(255, 0, 102));
        jLabel64.setFont(new java.awt.Font("ITC Bookman Light", 3, 18)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(51, 255, 51));
        history.getContentPane().add(jLabel64);
        jLabel64.setBounds(110, 140, 680, 30);

        jLabel65.setBackground(new java.awt.Color(255, 51, 51));
        jLabel65.setFont(new java.awt.Font("ITC Bookman Light", 3, 18)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(51, 255, 51));
        history.getContentPane().add(jLabel65);
        jLabel65.setBounds(110, 170, 700, 30);

        jLabel66.setBackground(new java.awt.Color(255, 0, 102));
        jLabel66.setFont(new java.awt.Font("ITC Bookman Light", 3, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(51, 255, 51));
        history.getContentPane().add(jLabel66);
        jLabel66.setBounds(110, 210, 740, 30);

        jLabel67.setBackground(new java.awt.Color(255, 0, 102));
        jLabel67.setFont(new java.awt.Font("ITC Bookman Light", 3, 18)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(51, 255, 51));
        history.getContentPane().add(jLabel67);
        jLabel67.setBounds(100, 250, 690, 30);

        jLabel68.setBackground(new java.awt.Color(255, 0, 102));
        jLabel68.setFont(new java.awt.Font("ITC Bookman Light", 3, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(51, 255, 51));
        history.getContentPane().add(jLabel68);
        jLabel68.setBounds(110, 280, 680, 30);

        jLabel69.setBackground(new java.awt.Color(255, 0, 102));
        jLabel69.setFont(new java.awt.Font("ITC Bookman Light", 3, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(51, 255, 51));
        history.getContentPane().add(jLabel69);
        jLabel69.setBounds(110, 320, 680, 30);

        jLabel70.setBackground(new java.awt.Color(255, 0, 102));
        jLabel70.setFont(new java.awt.Font("ITC Bookman Light", 3, 18)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(51, 255, 51));
        history.getContentPane().add(jLabel70);
        jLabel70.setBounds(110, 360, 680, 30);

        jLabel71.setBackground(new java.awt.Color(255, 0, 102));
        jLabel71.setFont(new java.awt.Font("ITC Bookman Light", 3, 18)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(51, 255, 51));
        history.getContentPane().add(jLabel71);
        jLabel71.setBounds(100, 400, 680, 30);

        jLabel73.setBackground(new java.awt.Color(255, 0, 102));
        jLabel73.setFont(new java.awt.Font("ITC Bookman Light", 3, 18)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(51, 255, 51));
        history.getContentPane().add(jLabel73);
        jLabel73.setBounds(100, 440, 680, 30);

        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/symbols/back.button.jpg"))); // NOI18N
        jLabel94.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel94MouseClicked(evt);
            }
        });
        history.getContentPane().add(jLabel94);
        jLabel94.setBounds(30, 580, 80, 80);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/symbols/hd-wallpapers-blue-lightning-wallpaper-projects-services-1280x1024-wallpaper.jpg"))); // NOI18N
        history.getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 0, 891, 710);

        help.setMinimumSize(new java.awt.Dimension(891, 712));
        help.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                helpWindowOpened(evt);
            }
        });
        help.getContentPane().setLayout(null);

        jLabel55.setFont(new java.awt.Font("Albertus Medium", 3, 48)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(51, 255, 51));
        jLabel55.setText("STEPS TO BE FOLLOWED");
        help.getContentPane().add(jLabel55);
        jLabel55.setBounds(120, 40, 610, 70);

        jLabel72.setFont(new java.awt.Font("Albertus", 3, 20)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 102, 51));
        jLabel72.setText("  Your game will be delivered after 2 days after of Transaction.");
        help.getContentPane().add(jLabel72);
        jLabel72.setBounds(60, 410, 700, 80);

        jLabel74.setFont(new java.awt.Font("Albertus", 3, 20)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 102, 51));
        jLabel74.setText("   If you are a new user select New user so to make a new Account.");
        help.getContentPane().add(jLabel74);
        jLabel74.setBounds(60, 170, 700, 80);

        jLabel75.setFont(new java.awt.Font("Albertus", 3, 20)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 102, 51));
        jLabel75.setText("  If being a old user select Exising user so to enter in your Account.");
        help.getContentPane().add(jLabel75);
        jLabel75.setBounds(60, 210, 700, 80);

        jLabel76.setFont(new java.awt.Font("Albertus", 3, 20)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 102, 51));
        jLabel76.setText("  On clicking the \"CLICK TO SHOP\" you will be next step.");
        help.getContentPane().add(jLabel76);
        jLabel76.setBounds(60, 130, 700, 80);

        jLabel77.setFont(new java.awt.Font("Albertus", 3, 20)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 102, 51));
        jLabel77.setText("  Clicking on the Game Poster you will required to give your necessary details.");
        help.getContentPane().add(jLabel77);
        jLabel77.setBounds(60, 290, 730, 80);

        jLabel78.setFont(new java.awt.Font("Albertus", 3, 20)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 102, 51));
        jLabel78.setText("  After this you will select the type of Game you want to buy.");
        help.getContentPane().add(jLabel78);
        jLabel78.setBounds(60, 250, 700, 80);

        jLabel79.setFont(new java.awt.Font("Albertus", 3, 20)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 102, 51));
        jLabel79.setText("  After filling your Details , Clicking on \"CHECK\"  button will show your Bill.");
        help.getContentPane().add(jLabel79);
        jLabel79.setBounds(60, 330, 740, 80);

        jLabel80.setFont(new java.awt.Font("Albertus", 3, 20)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 102, 51));
        jLabel80.setText("  Check your bill carefully, Finally click on purchase . ");
        help.getContentPane().add(jLabel80);
        jLabel80.setBounds(60, 370, 700, 80);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 204, 0));
        jLabel17.setText("#");
        help.getContentPane().add(jLabel17);
        jLabel17.setBounds(50, 400, 15, 25);

        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(0, 204, 0));
        jLabel81.setText("#");
        help.getContentPane().add(jLabel81);
        jLabel81.setBounds(50, 360, 20, 25);

        jLabel82.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(0, 204, 0));
        jLabel82.setText("#");
        help.getContentPane().add(jLabel82);
        jLabel82.setBounds(50, 280, 15, 25);

        jLabel83.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(0, 204, 0));
        jLabel83.setText("#");
        help.getContentPane().add(jLabel83);
        jLabel83.setBounds(50, 240, 15, 25);

        jLabel84.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(0, 204, 0));
        jLabel84.setText("#");
        help.getContentPane().add(jLabel84);
        jLabel84.setBounds(50, 200, 15, 25);

        jLabel85.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(0, 204, 0));
        jLabel85.setText("#");
        help.getContentPane().add(jLabel85);
        jLabel85.setBounds(50, 320, 15, 25);

        jLabel86.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(0, 204, 0));
        jLabel86.setText("#");
        help.getContentPane().add(jLabel86);
        jLabel86.setBounds(50, 440, 15, 25);

        jLabel87.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(0, 204, 0));
        jLabel87.setText("#");
        help.getContentPane().add(jLabel87);
        jLabel87.setBounds(50, 160, 15, 25);

        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/symbols/back.button.jpg"))); // NOI18N
        jLabel95.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel95MouseClicked(evt);
            }
        });
        help.getContentPane().add(jLabel95);
        jLabel95.setBounds(30, 580, 80, 80);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/symbols/hd-wallpapers-blue-lightning-wallpaper-projects-services-1280x1024-wallpaper.jpg"))); // NOI18N
        help.getContentPane().add(jLabel35);
        jLabel35.setBounds(0, 0, 891, 710);

        pass.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        pass.setMinimumSize(new java.awt.Dimension(871, 731));
        pass.getContentPane().setLayout(null);

        name.setFont(new java.awt.Font("Albertus", 1, 36)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        pass.getContentPane().add(name);
        name.setBounds(350, 140, 200, 40);

        passsign.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passsign.setText("SIGN IN");
        passsign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passsignActionPerformed(evt);
            }
        });
        pass.getContentPane().add(passsign);
        passsign.setBounds(320, 480, 250, 40);
        pass.getContentPane().add(psd);
        psd.setBounds(350, 330, 200, 30);

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/symbols/back.button.jpg"))); // NOI18N
        jLabel96.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel96MouseClicked(evt);
            }
        });
        pass.getContentPane().add(jLabel96);
        jLabel96.setBounds(30, 580, 80, 80);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 255, 51));
        jLabel20.setText("EXISTING USER");
        pass.getContentPane().add(jLabel20);
        jLabel20.setBounds(260, 50, 270, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/ra.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(822, 500));
        jLabel2.setMinimumSize(new java.awt.Dimension(822, 500));
        jLabel2.setName(""); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(822, 722));
        pass.getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 890, 730);

        pass1.setMinimumSize(new java.awt.Dimension(850, 730));
        pass1.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                pass1WindowOpened(evt);
            }
        });
        pass1.getContentPane().setLayout(null);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 255, 51));
        jLabel19.setText("NEW USER");
        pass1.getContentPane().add(jLabel19);
        jLabel19.setBounds(300, 50, 180, 40);
        pass1.getContentPane().add(psd1);
        psd1.setBounds(350, 320, 280, 40);

        name1.setFont(new java.awt.Font("Albertus", 1, 36)); // NOI18N
        name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name1ActionPerformed(evt);
            }
        });
        pass1.getContentPane().add(name1);
        name1.setBounds(350, 140, 280, 40);

        save1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        save1.setForeground(new java.awt.Color(51, 51, 255));
        save1.setText("SAVE");
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });
        pass1.getContentPane().add(save1);
        save1.setBounds(340, 480, 79, 25);

        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/symbols/back.button.jpg"))); // NOI18N
        jLabel97.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel97MouseClicked(evt);
            }
        });
        pass1.getContentPane().add(jLabel97);
        jLabel97.setBounds(30, 580, 80, 80);

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/ra.jpg"))); // NOI18N
        pass1.getContentPane().add(jLabel36);
        jLabel36.setBounds(0, 0, 865, 730);

        type.setMinimumSize(new java.awt.Dimension(891, 712));
        type.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                typeWindowOpened(evt);
            }
        });
        type.getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 42)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 102, 255));
        jLabel4.setText("SELECT THE TYPE OF GAME");
        type.getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 20, 670, 50);

        acbutton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        acbutton.setText("ACTION GAMES");
        acbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acbuttonActionPerformed(evt);
            }
        });
        type.getContentPane().add(acbutton);
        acbutton.setBounds(40, 120, 210, 40);

        adbutton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        adbutton.setText("ADVENTURE GAMES");
        adbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adbuttonActionPerformed(evt);
            }
        });
        type.getContentPane().add(adbutton);
        adbutton.setBounds(40, 180, 280, 37);

        spbutton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        spbutton.setText("SPORTS GAMES");
        spbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spbuttonActionPerformed(evt);
            }
        });
        type.getContentPane().add(spbutton);
        spbutton.setBounds(40, 240, 220, 40);

        rabutton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rabutton.setText("RACING GAMES");
        rabutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rabuttonActionPerformed(evt);
            }
        });
        type.getContentPane().add(rabutton);
        rabutton.setBounds(30, 310, 210, 40);

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JB.jpg"))); // NOI18N
        type.getContentPane().add(jLabel53);
        jLabel53.setBounds(580, 270, 285, 400);

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/action/Halo-combat-evolved.jpg"))); // NOI18N
        type.getContentPane().add(jLabel54);
        jLabel54.setBounds(10, 410, 330, 250);

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/umesh/hd-wallpapers-blue-lightning-wallpaper-projects-services-1280x1024-wallpaper.jpg"))); // NOI18N
        type.getContentPane().add(jLabel37);
        jLabel37.setBounds(0, 0, 890, 710);

        Action.setMinimumSize(new java.awt.Dimension(891, 712));
        Action.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                ActionWindowOpened(evt);
            }
        });
        Action.getContentPane().setLayout(null);

        acnext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/symbols/stock-photo-125242-3d-blue-glass-next-button.jpg"))); // NOI18N
        acnext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acnextMouseClicked(evt);
            }
        });
        Action.getContentPane().add(acnext);
        acnext.setBounds(780, 260, 50, 30);

        background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backgroundMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backgroundMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backgroundMouseExited(evt);
            }
        });
        Action.getContentPane().add(background);
        background.setBounds(200, 30, 550, 510);
        Action.getContentPane().add(jLabel11);
        jLabel11.setBounds(640, 10, 0, 60);

        acback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/symbols/stock-photo-125241-3d-blue-glass-back-button.jpg"))); // NOI18N
        acback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acbackMouseClicked(evt);
            }
        });
        Action.getContentPane().add(acback);
        acback.setBounds(130, 260, 50, 40);

        jTextField1.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 153, 255));
        Action.getContentPane().add(jTextField1);
        jTextField1.setBounds(30, 30, 160, 30);

        jLabel57.setFont(new java.awt.Font("Albertus Extra Bold", 3, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 0, 51));
        jLabel57.setText("CLICK TO BUY");
        Action.getContentPane().add(jLabel57);
        jLabel57.setBounds(40, 130, 140, 23);

        backac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/symbols/back.button.jpg"))); // NOI18N
        backac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backacMouseClicked(evt);
            }
        });
        Action.getContentPane().add(backac);
        backac.setBounds(20, 560, 80, 80);

        jLabel99.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(0, 204, 204));
        jLabel99.setText("Price");
        Action.getContentPane().add(jLabel99);
        jLabel99.setBounds(30, 80, 40, 20);

        acarea.setColumns(20);
        acarea.setRows(5);
        jScrollPane3.setViewportView(acarea);

        Action.getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(120, 540, 680, 110);

        jLabel100.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(51, 255, 255));
        Action.getContentPane().add(jLabel100);
        jLabel100.setBounds(80, 80, 60, 20);

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/umesh/hd-wallpapers-blue-lightning-wallpaper-projects-services-1280x1024-wallpaper.jpg"))); // NOI18N
        Action.getContentPane().add(jLabel52);
        jLabel52.setBounds(0, 0, 900, 710);

        Adventure.setMinimumSize(new java.awt.Dimension(891, 712));
        Adventure.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                AdventureWindowOpened(evt);
            }
        });
        Adventure.getContentPane().setLayout(null);

        Adback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdbackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AdbackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AdbackMouseExited(evt);
            }
        });
        Adventure.getContentPane().add(Adback);
        Adback.setBounds(200, 80, 490, 470);

        jLabel5.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 255, 0));
        jLabel5.setText("SPIDERMAN");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        Adventure.getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 30, 210, 40);

        adback1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/symbols/stock-photo-125241-3d-blue-glass-back-button.jpg"))); // NOI18N
        adback1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adback1MouseClicked(evt);
            }
        });
        Adventure.getContentPane().add(adback1);
        adback1.setBounds(60, 280, 50, 40);

        adnext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/symbols/stock-photo-125242-3d-blue-glass-next-button.jpg"))); // NOI18N
        adnext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adnextMouseClicked(evt);
            }
        });
        Adventure.getContentPane().add(adnext);
        adnext.setBounds(780, 270, 50, 30);

        adpre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adpreMouseClicked(evt);
            }
        });
        Adventure.getContentPane().add(adpre);
        adpre.setBounds(60, 600, 50, 50);

        jLabel61.setFont(new java.awt.Font("Albertus Extra Bold", 3, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 0, 51));
        jLabel61.setText("CLICK TO BUY");
        jLabel61.setRequestFocusEnabled(false);
        jLabel61.setVerifyInputWhenFocusTarget(false);
        Adventure.getContentPane().add(jLabel61);
        jLabel61.setBounds(40, 130, 140, 23);

        jLabel102.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(51, 255, 255));
        Adventure.getContentPane().add(jLabel102);
        jLabel102.setBounds(80, 80, 60, 20);

        backad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/symbols/back.button.jpg"))); // NOI18N
        backad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backadMouseClicked(evt);
            }
        });
        Adventure.getContentPane().add(backad);
        backad.setBounds(80, 590, 80, 80);

        jLabel101.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(0, 204, 204));
        jLabel101.setText("Price");
        Adventure.getContentPane().add(jLabel101);
        jLabel101.setBounds(30, 80, 40, 20);

        adarea.setColumns(20);
        adarea.setRows(5);
        jScrollPane4.setViewportView(adarea);

        Adventure.getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(240, 570, 490, 110);

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hd-wallpapers-blue-lightning-wallpaper-projects-services-1280x1024-wallpaper.jpg"))); // NOI18N
        Adventure.getContentPane().add(jLabel51);
        jLabel51.setBounds(0, 0, 890, 710);

        Racing.setMinimumSize(new java.awt.Dimension(891, 712));
        Racing.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                RacingWindowOpened(evt);
            }
        });
        Racing.getContentPane().setLayout(null);

        raback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/symbols/stock-photo-125241-3d-blue-glass-back-button.jpg"))); // NOI18N
        raback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rabackMouseClicked(evt);
            }
        });
        Racing.getContentPane().add(raback);
        raback.setBounds(170, 270, 50, 40);

        ranext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/symbols/stock-photo-125242-3d-blue-glass-next-button.jpg"))); // NOI18N
        ranext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ranextMouseClicked(evt);
            }
        });
        Racing.getContentPane().add(ranext);
        ranext.setBounds(770, 290, 50, 30);

        rapre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/symbols/back.button.jpg"))); // NOI18N
        rapre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rapreMouseClicked(evt);
            }
        });
        Racing.getContentPane().add(rapre);
        rapre.setBounds(50, 580, 80, 80);

        rlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rlabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rlabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rlabelMouseExited(evt);
            }
        });
        Racing.getContentPane().add(rlabel);
        rlabel.setBounds(230, 20, 530, 520);

        jLabel58.setFont(new java.awt.Font("Albertus Extra Bold", 3, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 0, 51));
        jLabel58.setText("CLICK TO BUY");
        Racing.getContentPane().add(jLabel58);
        jLabel58.setBounds(40, 130, 140, 23);

        jLabel60.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(153, 255, 51));
        jLabel60.setText("MOST WANTED");
        Racing.getContentPane().add(jLabel60);
        jLabel60.setBounds(10, 20, 220, 50);

        jLabel104.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(51, 255, 255));
        Racing.getContentPane().add(jLabel104);
        jLabel104.setBounds(80, 80, 60, 20);

        jLabel103.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(0, 204, 204));
        jLabel103.setText("Price");
        Racing.getContentPane().add(jLabel103);
        jLabel103.setBounds(30, 80, 40, 20);

        raarea.setColumns(20);
        raarea.setRows(5);
        jScrollPane5.setViewportView(raarea);

        Racing.getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(240, 570, 490, 110);

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hd-wallpapers-blue-lightning-wallpaper-projects-services-1280x1024-wallpaper.jpg"))); // NOI18N
        Racing.getContentPane().add(jLabel50);
        jLabel50.setBounds(0, 0, 900, 700);

        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/symbols/back.button.jpg"))); // NOI18N
        Racing.getContentPane().add(jLabel98);
        jLabel98.setBounds(60, 580, 80, 80);

        Sports.setMinimumSize(new java.awt.Dimension(891, 712));
        Sports.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                SportsWindowOpened(evt);
            }
        });
        Sports.getContentPane().setLayout(null);

        slabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                slabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                slabelMouseExited(evt);
            }
        });
        Sports.getContentPane().add(slabel);
        slabel.setBounds(220, 70, 470, 430);

        spback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/symbols/stock-photo-125241-3d-blue-glass-back-button.jpg"))); // NOI18N
        spback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spbackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                spbackMouseEntered(evt);
            }
        });
        Sports.getContentPane().add(spback);
        spback.setBounds(140, 250, 50, 40);

        rapre1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/symbols/back.button.jpg"))); // NOI18N
        rapre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rapre1MouseClicked(evt);
            }
        });
        Sports.getContentPane().add(rapre1);
        rapre1.setBounds(50, 550, 80, 80);

        spnext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/symbols/stock-photo-125242-3d-blue-glass-next-button.jpg"))); // NOI18N
        spnext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spnextMouseClicked(evt);
            }
        });
        Sports.getContentPane().add(spnext);
        spnext.setBounds(730, 250, 50, 40);

        sparea.setColumns(20);
        sparea.setRows(5);
        jScrollPane6.setViewportView(sparea);

        Sports.getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(230, 530, 490, 110);

        jLabel62.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(51, 255, 51));
        jLabel62.setText("Street Cricket");
        Sports.getContentPane().add(jLabel62);
        jLabel62.setBounds(30, 30, 180, 40);

        jLabel105.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(0, 204, 204));
        jLabel105.setText("Price");
        Sports.getContentPane().add(jLabel105);
        jLabel105.setBounds(30, 80, 40, 20);

        jLabel106.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(51, 255, 255));
        Sports.getContentPane().add(jLabel106);
        jLabel106.setBounds(80, 80, 60, 20);

        jLabel59.setFont(new java.awt.Font("Albertus Extra Bold", 3, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 0, 51));
        jLabel59.setText("CLICK TO BUY");
        Sports.getContentPane().add(jLabel59);
        jLabel59.setBounds(40, 130, 140, 23);

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hd-wallpapers-blue-lightning-wallpaper-projects-services-1280x1024-wallpaper.jpg"))); // NOI18N
        Sports.getContentPane().add(jLabel49);
        jLabel49.setBounds(0, 0, 800, 690);

        Purchase.setMinimumSize(new java.awt.Dimension(872, 712));
        Purchase.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                PurchaseWindowOpened(evt);
            }
        });
        Purchase.getContentPane().setLayout(null);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 102, 255));
        jLabel16.setText("Name *");
        Purchase.getContentPane().add(jLabel16);
        jLabel16.setBounds(140, 100, 60, 17);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 102, 255));
        jLabel23.setText("Date Of Birth ");
        Purchase.getContentPane().add(jLabel23);
        jLabel23.setBounds(110, 130, 100, 17);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Purchase.getContentPane().add(jComboBox1);
        jComboBox1.setBounds(220, 130, 40, 20);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Januray", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", " " }));
        Purchase.getContentPane().add(jComboBox2);
        jComboBox2.setBounds(270, 130, 77, 20);
        Purchase.getContentPane().add(nam);
        nam.setBounds(220, 100, 140, 20);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007" }));
        Purchase.getContentPane().add(jComboBox3);
        jComboBox3.setBounds(360, 130, 70, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 255));
        jLabel15.setText("Pincode");
        Purchase.getContentPane().add(jLabel15);
        jLabel15.setBounds(140, 170, 70, 17);
        Purchase.getContentPane().add(Pin);
        Pin.setBounds(220, 170, 140, 20);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 102, 255));
        jLabel24.setText("Email_ID *");
        Purchase.getContentPane().add(jLabel24);
        jLabel24.setBounds(135, 210, 75, 17);
        Purchase.getContentPane().add(Email);
        Email.setBounds(220, 210, 140, 20);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 102, 255));
        jLabel25.setText("Address *");
        Purchase.getContentPane().add(jLabel25);
        jLabel25.setBounds(120, 270, 70, 17);

        add.setColumns(20);
        add.setRows(5);
        jScrollPane1.setViewportView(add);

        Purchase.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(220, 260, 250, 130);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 102, 255));
        jLabel26.setText("City *");
        Purchase.getContentPane().add(jLabel26);
        jLabel26.setBounds(510, 450, 60, 17);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 102, 255));
        jLabel27.setText("State *");
        Purchase.getContentPane().add(jLabel27);
        jLabel27.setBounds(310, 450, 60, 17);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "India", "Indonesia", "North America", "Brazil", "SriLanka", "Pakistan", "Banglashdesh", "Myanmar", " ", " " }));
        Purchase.getContentPane().add(jComboBox5);
        jComboBox5.setBounds(170, 450, 110, 20);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 102, 255));
        jLabel28.setText("Country *");
        Purchase.getContentPane().add(jLabel28);
        jLabel28.setBounds(90, 450, 70, 20);
        Purchase.getContentPane().add(State);
        State.setBounds(380, 450, 80, 20);
        Purchase.getContentPane().add(City);
        City.setBounds(560, 450, 70, 20);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 102, 255));
        jLabel30.setText("Ph. No. *");
        Purchase.getContentPane().add(jLabel30);
        jLabel30.setBounds(380, 190, 70, 17);
        Purchase.getContentPane().add(phone);
        phone.setBounds(460, 190, 120, 20);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setText("*  Details should not left unfilled");
        Purchase.getContentPane().add(jLabel39);
        jLabel39.setBounds(480, 530, 230, 17);

        save.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        save.setText("SUBMIT");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        Purchase.getContentPane().add(save);
        save.setBounds(260, 580, 110, 30);

        jButton10.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton10.setText("CLEAR");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        Purchase.getContentPane().add(jButton10);
        jButton10.setBounds(420, 580, 100, 31);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/symbols/back.button.jpg"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        Purchase.getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 580, 80, 80);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 102, 255));
        jLabel7.setText("Mode of Payment");
        Purchase.getContentPane().add(jLabel7);
        jLabel7.setBounds(510, 250, 130, 17);

        cash.setBackground(new java.awt.Color(12, 36, 74));
        buttonGroup1.add(cash);
        cash.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cash.setForeground(new java.awt.Color(51, 102, 255));
        cash.setText("CASH ON DELIVERY");
        Purchase.getContentPane().add(cash);
        cash.setBounds(510, 290, 180, 25);

        visa.setBackground(new java.awt.Color(13, 43, 87));
        buttonGroup1.add(visa);
        visa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        visa.setForeground(new java.awt.Color(51, 102, 255));
        visa.setText("VISA");
        Purchase.getContentPane().add(visa);
        visa.setBounds(510, 340, 70, 25);

        debit.setBackground(new java.awt.Color(17, 41, 78));
        buttonGroup1.add(debit);
        debit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        debit.setForeground(new java.awt.Color(51, 102, 255));
        debit.setText("DEBIT CARD");
        debit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debitActionPerformed(evt);
            }
        });
        Purchase.getContentPane().add(debit);
        debit.setBounds(510, 390, 120, 30);

        jLabel93.setFont(new java.awt.Font("Albertus", 3, 36)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(51, 255, 51));
        jLabel93.setText("FILL YOUR DETAILS");
        Purchase.getContentPane().add(jLabel93);
        jLabel93.setBounds(300, 20, 370, 30);

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(204, 0, 0));
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hd-wallpapers-blue-lightning-wallpaper-projects-services-1280x1024-wallpaper.jpg"))); // NOI18N
        Purchase.getContentPane().add(jLabel42);
        jLabel42.setBounds(-20, 0, 880, 700);

        detail.setMinimumSize(new java.awt.Dimension(891, 712));
        detail.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                detailWindowOpened(evt);
            }
        });
        detail.getContentPane().setLayout(null);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/action/0101ccd1.jpg"))); // NOI18N
        detail.getContentPane().add(jLabel12);
        jLabel12.setBounds(330, 50, 560, 560);

        jLabel31.setFont(new java.awt.Font("Albertus Extra Bold", 3, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 153, 255));
        jLabel31.setText("GAMING ZONE");
        detail.getContentPane().add(jLabel31);
        jLabel31.setBounds(100, 90, 150, 23);

        jLabel29.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 255, 51));
        jLabel29.setText("BILL");
        detail.getContentPane().add(jLabel29);
        jLabel29.setBounds(390, 10, 120, 40);

        purchasefield.setColumns(20);
        purchasefield.setRows(5);
        jScrollPane2.setViewportView(purchasefield);

        detail.getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 70, 770, 540);

        jLabel32.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 255, 0));
        jLabel32.setText("Amount to be paid");
        detail.getContentPane().add(jLabel32);
        jLabel32.setBounds(200, 640, 129, 20);
        detail.getContentPane().add(total);
        total.setBounds(340, 630, 100, 30);

        purchase.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        purchase.setText("CONFIRM");
        purchase.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 255)));
        purchase.setFocusPainted(false);
        purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseActionPerformed(evt);
            }
        });
        detail.getContentPane().add(purchase);
        purchase.setBounds(530, 630, 180, 40);
        detail.getContentPane().add(jLabel34);
        jLabel34.setBounds(340, 60, 300, 440);

        Time.setForeground(new java.awt.Color(102, 255, 102));
        detail.getContentPane().add(Time);
        Time.setBounds(20, 10, 90, 20);

        jLabel18.setForeground(new java.awt.Color(102, 255, 102));
        detail.getContentPane().add(jLabel18);
        jLabel18.setBounds(20, 40, 180, 20);

        backmain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/symbols/back.button.jpg"))); // NOI18N
        backmain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backmainMouseClicked(evt);
            }
        });
        detail.getContentPane().add(backmain);
        backmain.setBounds(50, 620, 80, 70);

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hd-wallpapers-blue-lightning-wallpaper-projects-services-1280x1024-wallpaper.jpg"))); // NOI18N
        detail.getContentPane().add(jLabel40);
        jLabel40.setBounds(0, 0, 890, 710);

        thankyou.setMinimumSize(new java.awt.Dimension(891, 775));
        thankyou.getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        thankyou.getContentPane().add(jButton1);
        jButton1.setBounds(770, 660, 90, 30);

        jLabel9.setBackground(new java.awt.Color(255, 51, 0));
        jLabel9.setFont(new java.awt.Font("Albertus", 3, 56)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 0));
        jLabel9.setText("THANK YOU ");
        thankyou.getContentPane().add(jLabel9);
        jLabel9.setBounds(140, 190, 390, 90);

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hd-wallpapers-blue-lightning-wallpaper-projects-services-1280x1024-wallpaper.jpg"))); // NOI18N
        thankyou.getContentPane().add(jLabel38);
        jLabel38.setBounds(0, 0, 890, 710);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 620));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        shop.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        shop.setForeground(new java.awt.Color(255, 255, 0));
        shop.setText("CLICK HERE TO SHOP");
        shop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shopMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                shopMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                shopMouseExited(evt);
            }
        });
        getContentPane().add(shop);
        shop.setBounds(100, 450, 540, 70);

        jLabel8.setFont(new java.awt.Font("Albertus Medium", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 0));
        jLabel8.setText("A PROJECT MADE BY ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(770, 360, 280, 40);

        jLabel3.setFont(new java.awt.Font("Albertus", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("ZONE");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 100, 120, 50);

        jLabel21.setFont(new java.awt.Font("Albertus Medium", 3, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(84, 214, 29));
        jLabel21.setText("HRUSHIKESH WAHADANE");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(720, 400, 240, 40);

        jLabel33.setFont(new java.awt.Font("Albertus", 3, 36)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(153, 153, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("d");
        getContentPane().add(jLabel33);
        jLabel33.setBounds(10, 30, 440, 50);

        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homepic.jpg"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1020, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passsignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passsignActionPerformed

        String z = name.getText();
        String x = new String(psd.getPassword());
        if (x.equals("") || z.equals("") == true) {
            JOptionPane.showMessageDialog(null, "Please fill the complete information", "Error", 0);
        } else if (x.equals("Umesh") == true) {
            JOptionPane.showMessageDialog(null, "Welcome   " + name.getText() + "  You have gained access to GAME ZONE ");
            type.setVisible(true);
            pass.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(null, "  Oops!!!!  Password is wrong", "ERROR", 3);
        }
}//GEN-LAST:event_passsignActionPerformed

    private void acbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acbuttonActionPerformed
        type.setVisible(false);
        Action.setVisible(true);
}//GEN-LAST:event_acbuttonActionPerformed

    private void adbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adbuttonActionPerformed
        Adventure.setVisible(true);
        type.setVisible(false);
}//GEN-LAST:event_adbuttonActionPerformed

    private void ActionWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_ActionWindowOpened
        try {
            Class.forName("java.sql.Driver");
            String url = "jdbc:mysql://localhost:3306/umesh";
            con = DriverManager.getConnection(url, "root", "asd");
            st = con.createStatement();
            rs = st.executeQuery("Select * from Action;");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        try {
            rs.first();
            jTextField1.setText(rs.getString("Game"));
            background.setIcon(new ImageIcon("D:/Games1/action/totaloverdose.jpg"));
            acarea.setText("Total Overdose : A Gunslinger's Tale in Mexico as it is known in the US is an open world action/adventure third-person \n shooter video game that was developed by Deadline Games and published by Sci Entertainment in Europe and by Eidos \nin North America. It contains a demo for Tomb Raider: Legend on thePlayStation 2 and Xbox versions. \nChili Con Carnage, a PlayStation Portable game using some of the original characters but following a \ndifferent plotline than Total Overdose, was released on February 13, 2007.");
            p = "D:/Games1/action/totaloverdose.jpg";
            acarea.setEditable(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

}//GEN-LAST:event_ActionWindowOpened

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
    }//GEN-LAST:event_jLabel1MouseClicked

    private void typeWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_typeWindowOpened
}//GEN-LAST:event_typeWindowOpened

    private void spbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spbuttonActionPerformed
        Sports.setVisible(true);
        type.setVisible(false);
}//GEN-LAST:event_spbuttonActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void RacingWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_RacingWindowOpened
        try {
            Class.forName("java.sql.Driver");
            String url = "jdbc:mysql://localhost:3306/umesh";
            con = DriverManager.getConnection(url, "root", "asd");
            st = con.createStatement();
            rs = st.executeQuery("Select * from Racing;");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "HI");
        try {
            rs.first();
            jLabel60.setText(rs.getString("Game"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
        String x = jLabel60.getText();

        if (x.equals("RoadRash")) {
            rlabel.setIcon(new ImageIcon("D:/Games1/racing/roadrash.jpg"));
            pic = x;
        }
    }//GEN-LAST:event_RacingWindowOpened

    private void backgroundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseClicked
        String a = jTextField1.getText();
        int ans = JOptionPane.showConfirmDialog(null, "Do You Want To Buy " + a);
        if (ans == JOptionPane.YES_OPTION) {
            Purchase.setVisible(true);
            Action.setVisible(false);
        }
        if (ans == JOptionPane.NO_OPTION) {
            Action.setVisible(true);
        }
        if (ans == JOptionPane.CANCEL_OPTION) {
            Action.setVisible(true);
        }
    }//GEN-LAST:event_backgroundMouseClicked

    private void shopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shopMouseClicked
        main.setVisible(true);
        this.dispose();

}//GEN-LAST:event_shopMouseClicked

    private void name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name1ActionPerformed

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed

        try {
            String name = name1.getText();
            String pass = psd1.getText();
            // insert into login values('hrushikesh','Ram');
            st.executeUpdate("Insert into login values('" + name + "','" + pass + "');");
            JOptionPane.showMessageDialog(null, "YOUR NAME AND PASSWORD SAVED IN DATABASE");

            type.setVisible(true);
            pass1.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
}//GEN-LAST:event_save1ActionPerformed

    private void AdventureWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_AdventureWindowOpened
        try {
            Class.forName("java.sql.Driver");
            String url = "jdbc:mysql://localhost:3306/umesh";
            con = DriverManager.getConnection(url, "root", "asd");
            st = con.createStatement();
            rs = st.executeQuery("select * from adventure;");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        try {
            rs.first();
            jLabel5.setText(rs.getString("Game"));
            String x = jLabel5.getText();

            if (x.equals("Spiderman")) {
                Adback.setIcon(new ImageIcon("D:/Games1/adventure/40.jpg"));
                adarea.setText("Spider-Man is an action game loosely based on the Spider-Man \n film and released for the Game Boy Advance, Microsoft Windows, Xbox 360, \nPlayStation 2, Nintendo DS, Wii, PlayStation 3 and PlayStation Portable. There\n was also going to be a GameCube release of the game but it got cancelled\n due to its discontinuation along with Shrek the Third (video game).");
                pic = x;
                adarea.setEditable(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_AdventureWindowOpened

    private void SportsWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_SportsWindowOpened
        try {
            Class.forName("java.sql.Driver");
            String url = "jdbc:mysql://localhost:3306/umesh";
            con = DriverManager.getConnection(url, "root", "asd");
            st = con.createStatement();
            rs = st.executeQuery("Select * from Sports;");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        try {
            rs.first();
            jLabel62.setText(rs.getString("Game"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
        String x = jLabel62.getText();

        if (x.equals("Cricket")) {
            slabel.setIcon(new ImageIcon("D:/Games1/sports/Cricket.jpg"));
            pic = x;
            sparea.setEditable(false);
        }
    }//GEN-LAST:event_SportsWindowOpened

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try {
            String name = nam.getText();

            int date = Integer.parseInt(jComboBox1.getSelectedItem().toString());

            String month = jComboBox2.getSelectedItem().toString();
            int year = Integer.parseInt(jComboBox3.getSelectedItem().toString());
            int pinno = Integer.parseInt(Pin.getText());

            int phoneno = Integer.parseInt(phone.getText());
            String Eid = Email.getText();
            String ads = add.getText();
            String ct = City.getText();
            String stat = State.getText();
            String country = jComboBox5.getSelectedItem().toString();

            double discount = 0;
            if (cash.isSelected() == true) {
                discount = 0.05;
            } else if (visa.isSelected() == true) {
                discount = 0.1;
            }
            if (debit.isSelected() == true) {
                discount = 0.2;
            }
            st.executeUpdate("Insert into customerdetails values( '" + name + "'," + date + ",'" + month + "'," + year + "," + pinno + "," + phoneno + ",'" + Eid + "','" + ads + "','" + ct + "','" + stat + "','" + country + "'," + discount + ");");

            JOptionPane.showMessageDialog(null, "YOUR DETAILS SAVED IN DATABASE");
            detail.setVisible(true);
            Purchase.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_saveActionPerformed

    private void help1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_help1MouseClicked
        help.setVisible(true);
}//GEN-LAST:event_help1MouseClicked

    private void newuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newuserMouseClicked
        pass1.setVisible(true);
        main.dispose();
}//GEN-LAST:event_newuserMouseClicked

    private void HisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HisMouseClicked
        history.setVisible(true);
}//GEN-LAST:event_HisMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Purchase.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        Email.setText("");
        State.setText("");
        nam.setText("");
        phone.setText("");
        Pin.setText("");
        add.setText("");
        psd1.setText("");
        City.setText("");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void purchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseActionPerformed
        int ans = JOptionPane.showConfirmDialog(null, "DO YOU WANT TO BUY SURELY");
        if (ans == JOptionPane.YES_OPTION) {
            thankyou.setVisible(true);
            detail.setVisible(false);
            JOptionPane.showMessageDialog(null, "YOUR GAME WILL BE DELIVERED IN 2 DAYS ");
            JOptionPane.showMessageDialog(null, "THANK YOU FOR BUYING FROM GAMEZONE");
        }
        if (ans == JOptionPane.NO_OPTION) {
            detail.setVisible(true);
        }
        if (ans == JOptionPane.CANCEL_OPTION) {
            detail.setVisible(true);
        }
}//GEN-LAST:event_purchaseActionPerformed

    private void detailWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_detailWindowOpened
        try {
            Class.forName("java.sql.Driver");
            String url = "jdbc:mysql://localhost:3306/umesh";
            con = DriverManager.getConnection(url, "root", "asd");
            st = con.createStatement();
            rs = st.executeQuery("Select * from customerdetails;");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        try {
            rs.next();
            purchasefield.append("\n");
            purchasefield.append("\n");
            purchasefield.append("\n");
            purchasefield.append("\n");
            purchasefield.append("          Your Name =  ");
            purchasefield.append(rs.getString("Name"));
            purchasefield.append("\n");
            purchasefield.append("\n");
            purchasefield.append("          DOB=  ");
            purchasefield.append(rs.getString("Date"));
            purchasefield.append("\t");
            purchasefield.append(rs.getString("Month"));
            purchasefield.append("\t");
            purchasefield.append(rs.getString("Year"));
            purchasefield.append("\n");
            purchasefield.append("\n");
            purchasefield.append("           Pincode no=  ");
            purchasefield.append(rs.getString("PinNo"));
            purchasefield.append("\n");
            purchasefield.append("\n");
            purchasefield.append("           Phone no =  ");
            purchasefield.append(rs.getString("PhoneNo"));
            purchasefield.append("\n");
            purchasefield.append("\n");
            purchasefield.append("           E-mail ID =  ");
            purchasefield.append(rs.getString("Eid"));
            purchasefield.append("\n");
            purchasefield.append("\n");
            purchasefield.append("           Address =  ");
            purchasefield.append(rs.getString("ads"));
            purchasefield.append("\n");
            purchasefield.append("\n");
            purchasefield.append("           City =  ");
            purchasefield.append(rs.getString("City"));
            purchasefield.append("\n");
            purchasefield.append("\n");
            purchasefield.append("           State =  ");
            purchasefield.append(rs.getString("State"));
            purchasefield.append("\n");
            purchasefield.append("\n");
            purchasefield.append("           Country =  ");
            purchasefield.append(rs.getString("Country"));
            purchasefield.append("\n");
            purchasefield.append("\n");
            double dis = 0;
            int price2 = 0;
            if (cash.isSelected() == true) {
                price2 = 999;
                dis = 0.05;
            } else if (visa.isSelected() == true) {
                price2 = 899;
                dis = 0.1;
            }
            if (debit.isSelected() == true) {
                price2 = 950;
                dis = 0.20;
            }
            purchasefield.append("           Discount in % =  " + dis);
            double totalamt = price2 - (price2 * dis);
            total.setText("" + totalamt);
        } catch (Exception e) {
        }
        Date m = new Date();
        Calendar c = Calendar.getInstance();
        int month = m.getMonth();
        int day = m.getDay();
        String months = null, days = null;
        switch (month) {
            case 0:
                months = "January";
                break;
            case 1:
                months = "February";
                break;
            case 2:
                months = "March";
                break;
            case 3:
                months = "April";
                break;
            case 4:
                months = "May";
                break;
            case 5:
                months = "June";
                break;
            case 6:
                months = "July";
                break;
            case 7:
                months = "August";
                break;
            case 8:
                months = "September";
                break;
            case 9:
                months = "October";
                break;
            case 10:
                months = "November";
                break;
            case 11:
                months = "December";
                break;
        }
        switch (day) {
            case 0:
                days = "Sunday";
                break;
            case 1:
                days = "Monday";
                break;
            case 2:
                days = "Tuesday";
                break;
            case 3:
                days = "Wednesday";
                break;
            case 4:
                days = "Thursday";
                break;
            case 5:
                days = "Friday";
                break;
            case 6:
                days = "Saturday";
        }
        Time.setText(days);
        jLabel18.setText("" + m.getDate() + "/" + months + "/" + c.get(Calendar.YEAR));
        jLabel12.setIcon(new ImageIcon(p));

    }//GEN-LAST:event_detailWindowOpened

    private void existinguserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_existinguserActionPerformed
        pass.setVisible(true);
        main.dispose();
}//GEN-LAST:event_existinguserActionPerformed

    private void rabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rabuttonActionPerformed
        Racing.setVisible(true);
        type.dispose();
}//GEN-LAST:event_rabuttonActionPerformed

    private void adback1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adback1MouseClicked
        try {
            rs.previous();
            jLabel5.setText(rs.getString("Games"));
            AdventureBtn(jLabel5.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
}//GEN-LAST:event_adback1MouseClicked

    private void adnextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adnextMouseClicked
        try {
            rs.next();
            jLabel5.setText(rs.getString("Games"));
            AdventureBtn(jLabel5.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
}//GEN-LAST:event_adnextMouseClicked

    private void adpreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adpreMouseClicked
        type.setVisible(true);
        Adventure.setVisible(false);
}//GEN-LAST:event_adpreMouseClicked

    private void rabackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rabackMouseClicked
        try {
            rs.previous();
            jLabel60.setText(rs.getString("Game"));
            RacingBtn(jLabel60.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
}//GEN-LAST:event_rabackMouseClicked

    private void rapreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rapreMouseClicked
        Racing.setVisible(false);
        type.setVisible(true);
}//GEN-LAST:event_rapreMouseClicked

    private void ranextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ranextMouseClicked
        try {
            rs.next();
            jLabel60.setText(rs.getString("Game"));
            RacingBtn(jLabel60.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
}//GEN-LAST:event_ranextMouseClicked

    private void spbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spbackMouseClicked
        try {
            rs.previous();
            jLabel62.setText(rs.getString("Game"));
            SportsBtn(jLabel62.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
}//GEN-LAST:event_spbackMouseClicked

    private void rapre1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rapre1MouseClicked
        Sports.setVisible(false);
        type.setVisible(true);
    }//GEN-LAST:event_rapre1MouseClicked

    private void spnextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spnextMouseClicked
        try {
            rs.next();
            jLabel62.setText(rs.getString("Game"));
            SportsBtn(jLabel62.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
}//GEN-LAST:event_spnextMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        JOptionPane.showMessageDialog(null, "DO YOU WANT DO TO GAME MENU");
        type.setVisible(true);
        Purchase.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void PurchaseWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_PurchaseWindowOpened
        try {
            Class.forName("java.sql.Driver");
            String url = "jdbc:mysql://localhost:3306/HRUSHIKESH";
            con = DriverManager.getConnection(url, "root", "asd");
            st = con.createStatement();
            rs = st.executeQuery("Select * from customerdetails");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        if (cash.isSelected() == true) {
            price = price;
        }
        if (visa.isSelected() == true) {
            price = "Rs 999";
        }
        if (debit.isSelected() == true) {
            price = "Rs 899";
        }
    }//GEN-LAST:event_PurchaseWindowOpened

    private void acbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acbackMouseClicked
        try {
            rs.previous();
            jTextField1.setText(rs.getString("Game"));
            actionbtn(jTextField1.getText());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
}//GEN-LAST:event_acbackMouseClicked

    private void acnextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acnextMouseClicked
        try {
            rs.next();
            jTextField1.setText(rs.getString("Game"));
            actionbtn(jTextField1.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_acnextMouseClicked

    private void helpWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_helpWindowOpened
    }//GEN-LAST:event_helpWindowOpened

    private void shopMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shopMouseEntered
        shop.setFont(new java.awt.Font("Algerian", 1, 40));
}//GEN-LAST:event_shopMouseEntered

    private void pass1WindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_pass1WindowOpened
        try {
            Class.forName("java.sql.Driver");
            String url = "jdbc:mysql://localhost:3306/umesh";
            con = DriverManager.getConnection(url, "root", "asd");
            st = con.createStatement();
            rs = st.executeQuery("Select * from login");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_pass1WindowOpened

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    }//GEN-LAST:event_formWindowOpened

    private void historyWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_historyWindowOpened

        jLabel63.setText("Gaming Zone is a game selling company which includes the website");

        jLabel64.setText("'www.umeshgames.com' , which was launched in 2010 and is known");
        jLabel65.setText("for having a large and varied collection of games.It was started");
        jLabel66.setText("in 2007 by Umesh Patole on a on a budget of £40,000.");
        jLabel67.setText("As of 2011, the company has been valued at over £200 million, having");
        jLabel68.setText("been profitable for six of its seven years, with turnovers exceeding ");
        jLabel69.setText("£20 million in the past two years alone.Awards  are  ");
        jLabel70.setText("earned by performing actions on the website, such as achieving ");
        jLabel71.setText("high scores in games.Once awards are won they are displayed in a ");
        jLabel73.setText("player's league andare displayed on a user's Profile Page.");
    }//GEN-LAST:event_historyWindowOpened

    private void backgroundMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseEntered
        jLabel57.setVisible(true);
    }//GEN-LAST:event_backgroundMouseEntered

    private void backgroundMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseExited
        jLabel57.setVisible(false);
    }//GEN-LAST:event_backgroundMouseExited

    private void rlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rlabelMouseClicked
        String y = jLabel60.getText();

        int ans = JOptionPane.showConfirmDialog(null, "Do You Want To Buy " + y);
        if (ans == JOptionPane.YES_OPTION) {
            Purchase.setVisible(true);
            Racing.setVisible(false);
        }
        if (ans == JOptionPane.NO_OPTION) {
            Racing.setVisible(true);
        }
        if (ans == JOptionPane.CANCEL_OPTION) {
            Racing.setVisible(true);
        }
    }//GEN-LAST:event_rlabelMouseClicked

    private void rlabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rlabelMouseEntered
        jLabel58.setVisible(true);
    }//GEN-LAST:event_rlabelMouseEntered

    private void rlabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rlabelMouseExited
        jLabel58.setVisible(false);
    }//GEN-LAST:event_rlabelMouseExited

    private void slabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slabelMouseClicked
        String z = jLabel62.getText();

        int ans = JOptionPane.showConfirmDialog(null, "Do You Want To Buy " + z);
        if (ans == JOptionPane.YES_OPTION) {
            Purchase.setVisible(true);
            Sports.setVisible(false);
        }
        if (ans == JOptionPane.NO_OPTION) {
            Sports.setVisible(true);
        }
        if (ans == JOptionPane.CANCEL_OPTION) {
            Sports.setVisible(true);

        }

    }//GEN-LAST:event_slabelMouseClicked

    private void slabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slabelMouseEntered
        jLabel59.setVisible(true);
    }//GEN-LAST:event_slabelMouseEntered

    private void slabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slabelMouseExited
        jLabel59.setVisible(false);
    }//GEN-LAST:event_slabelMouseExited

    private void debitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debitActionPerformed
}//GEN-LAST:event_debitActionPerformed

    private void jLabel94MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel94MouseClicked
        main.setVisible(true);
        history.setVisible(false);
    }//GEN-LAST:event_jLabel94MouseClicked

    private void jLabel95MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel95MouseClicked
        main.setVisible(true);
        help.setVisible(false);
    }//GEN-LAST:event_jLabel95MouseClicked

    private void jLabel96MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel96MouseClicked
        main.setVisible(true);
        pass.setVisible(false);
    }//GEN-LAST:event_jLabel96MouseClicked

    private void jLabel97MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel97MouseClicked
        main.setVisible(true);
        pass1.setVisible(false);
    }//GEN-LAST:event_jLabel97MouseClicked

    private void shopMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shopMouseExited
        shop.setFont(new java.awt.Font("Tahoma 36 Bold Italic", 1, 36));
    }//GEN-LAST:event_shopMouseExited

    private void backacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backacMouseClicked
        Action.dispose();
        type.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_backacMouseClicked

    private void spbackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spbackMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_spbackMouseEntered

    private void mainWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_mainWindowOpened
        try {
            Class.forName("java.sql.Driver");
            String url = "jdbc:mysql://localhost:3306/umesh";
            con = DriverManager.getConnection(url, "root", "asd");
            st = con.createStatement();
            st.executeUpdate("delete from customerdetails;");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_mainWindowOpened

    private void backmainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backmainMouseClicked

        int ans = JOptionPane.showConfirmDialog(null, "Do You Want To Go Main GAME Menu");
        if (ans == JOptionPane.YES_OPTION) {
            type.setVisible(true);
            detail.setVisible(false);
        }
        if (ans == JOptionPane.NO_OPTION) {
            detail.setVisible(true);
        }
        if (ans == JOptionPane.CANCEL_OPTION) {
            detail.setVisible(true);
        }
}//GEN-LAST:event_backmainMouseClicked

    private void backadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backadMouseClicked
        type.setVisible(true);
        Adventure.setVisible(false);
}//GEN-LAST:event_backadMouseClicked

    private void AdbackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdbackMouseExited
        jLabel61.setVisible(false);
}//GEN-LAST:event_AdbackMouseExited

    private void AdbackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdbackMouseEntered
        jLabel61.setVisible(true);
}//GEN-LAST:event_AdbackMouseEntered

    private void AdbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdbackMouseClicked

        String f = jLabel5.getText();

        int ans = JOptionPane.showConfirmDialog(null, "Do You Want To Purchase " + f);
        if (ans == JOptionPane.YES_OPTION) {
            Purchase.setVisible(true);
            Adventure.setVisible(false);
        }
        if (ans == JOptionPane.NO_OPTION) {
            Adventure.setVisible(true);
        }
        if (ans == JOptionPane.CANCEL_OPTION) {
            Adventure.setVisible(true);
        }
}//GEN-LAST:event_AdbackMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Action;
    private javax.swing.JLabel Adback;
    private javax.swing.JFrame Adventure;
    private javax.swing.JTextField City;
    private javax.swing.JTextField Email;
    private javax.swing.JLabel His;
    private javax.swing.JTextField Pin;
    private javax.swing.JFrame Purchase;
    private javax.swing.JFrame Racing;
    private javax.swing.JFrame Sports;
    private javax.swing.JTextField State;
    private javax.swing.JLabel Time;
    private javax.swing.JTextArea acarea;
    private javax.swing.JLabel acback;
    private javax.swing.JButton acbutton;
    private javax.swing.JLabel acnext;
    private javax.swing.JTextArea adarea;
    private javax.swing.JLabel adback1;
    private javax.swing.JButton adbutton;
    private javax.swing.JTextArea add;
    private javax.swing.JLabel adnext;
    private javax.swing.JLabel adpre;
    private javax.swing.JLabel backac;
    private javax.swing.JLabel backad;
    private javax.swing.JLabel background;
    private javax.swing.JLabel backmain;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cash;
    private javax.swing.JRadioButton debit;
    private javax.swing.JFrame detail;
    private javax.swing.JButton existinguser;
    private javax.swing.JFrame help;
    private javax.swing.JLabel help1;
    private javax.swing.JFrame history;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel jTextField1;
    private javax.swing.JFrame main;
    private javax.swing.JTextField nam;
    private javax.swing.JTextField name;
    private javax.swing.JTextField name1;
    private javax.swing.JLabel newuser;
    private javax.swing.JFrame pass;
    private javax.swing.JFrame pass1;
    private javax.swing.JButton passsign;
    private javax.swing.JTextField phone;
    private javax.swing.JPasswordField psd;
    private javax.swing.JPasswordField psd1;
    private javax.swing.JButton purchase;
    private javax.swing.JTextArea purchasefield;
    private javax.swing.JTextArea raarea;
    private javax.swing.JLabel raback;
    private javax.swing.JButton rabutton;
    private javax.swing.JLabel ranext;
    private javax.swing.JLabel rapre;
    private javax.swing.JLabel rapre1;
    private javax.swing.JLabel rlabel;
    private javax.swing.JButton save;
    private javax.swing.JButton save1;
    private javax.swing.JLabel shop;
    private javax.swing.JLabel slabel;
    private javax.swing.JTextArea sparea;
    private javax.swing.JLabel spback;
    private javax.swing.JButton spbutton;
    private javax.swing.JLabel spnext;
    private javax.swing.JFrame thankyou;
    private javax.swing.JTextField total;
    private javax.swing.JFrame type;
    private javax.swing.JRadioButton visa;
    // End of variables declaration//GEN-END:variables
}
