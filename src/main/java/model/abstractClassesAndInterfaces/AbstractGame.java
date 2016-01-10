package model.abstractClassesAndInterfaces;

import model.otherClasses.Field;

import java.util.List;

/**
 * Created by Dmitriy on 10.01.2016.
 */
public abstract class AbstractGame implements IGame {
    protected IPlayer firstPlayer;
    protected IPlayer secondPlayer;
    protected Field firstField;
    protected Field secondField;
    protected List<FirstPlayerFieldObserver> firstPlayerFieldObservers;
    protected List<SecondPlayerFieldObserver> secondPlayerFieldObservers;
    protected boolean isTheEnd;

    public AbstractGame() {
    }

    public AbstractGame(IPlayer firstPlayer, IPlayer secondPlayer, Field firstField, Field secondField) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        this.firstField = firstField;
        this.secondField = secondField;
    }

    public IPlayer getFirstPlayer() {
        return firstPlayer;
    }

    public void setFirstPlayer(IPlayer firstPlayer) {
        this.firstPlayer = firstPlayer;
    }

    public IPlayer getSecondPlayer() {
        return secondPlayer;
    }

    public void setSecondPlayer(IPlayer secondPlayer) {
        this.secondPlayer = secondPlayer;
    }

    public Field getFirstField() {
        return firstField;
    }

    public void setFirstField(Field firstField) {
        this.firstField = firstField;
    }

    public Field getSecondField() {
        return secondField;
    }

    public void setSecondField(Field secondField) {
        this.secondField = secondField;
    }

    @Override
    public String toString() {
        return "AbstractGame{" +
                "firstPlayer=" + firstPlayer +
                ", secondPlayer=" + secondPlayer +
                ", firstField=" + firstField +
                ", secondField=" + secondField +
                ", firstPlayerFieldObservers=" + firstPlayerFieldObservers +
                ", secondPlayerFieldObservers=" + secondPlayerFieldObservers +
                ", isTheEnd=" + isTheEnd +
                '}';
    }
}
