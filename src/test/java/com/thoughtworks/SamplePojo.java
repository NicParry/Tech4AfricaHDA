package com.thoughtworks;

import java.util.List;

public class SamplePojo {

    private String stuff;

    private List<Field> things;

    public List<Field> getThings() {
        return things;
    }

    public void setThings(List<Field> things) {
        this.things = things;
    }

    public String getStuff() {
        return stuff;
    }

    public void setStuff(String stuff) {
        this.stuff = stuff;
    }

    static class Field {
        private String foo;
        private String bar;

        //Getters and setters for those 2

        public String getFoo() {
            return foo;
        }

        public void setFoo(String foo) {
            this.foo = foo;
        }

        public String getBar() {
            return bar;
        }

        public void setBar(String bar) {
            this.bar = bar;
        }
    }
}
