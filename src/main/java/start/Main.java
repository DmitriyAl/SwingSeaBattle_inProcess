package start;

import controller.IStartMenuViewController;
import model.abstractClassesAndInterfaces.AbstractGame;
import model.abstractClassesAndInterfaces.IGame;
import model.abstractClassesAndInterfaces.IPlayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import view.StartMenuView;

/**
 * Created by Dmitriy on 11.01.2016.
 */
public class Main {

    public static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"springContext.xml"});
//        IGame game = context.getBean("gameWithComputer", IGame.class);
//        game.start(10);
//        IStartMenuViewController controller = context.getBean("startMenuController", IStartMenuViewController.class);
        StartMenuView startMenuView = context.getBean("startMenuView", StartMenuView.class);
        startMenuView.start();
    }
}
