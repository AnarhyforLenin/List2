package com.arhiser.todolist.screens.details;

public class Single {

    public static final Single INSTANCE = new Single();

    public Single() {
    }


    public static Single getInstance() {
        return INSTANCE;
    }

    int tag = 0;
}
