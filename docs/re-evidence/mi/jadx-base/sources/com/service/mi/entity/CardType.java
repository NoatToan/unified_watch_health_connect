package com.service.mi.entity;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class CardType {
    private List<Regexes> regexes;
    private int type;

    public class Regexes {
        private String regex;

        public Regexes() {
        }

        public String getRegex() {
            return this.regex;
        }

        public void setRegex(String str) {
            this.regex = str;
        }
    }

    public List<Regexes> getRegexes() {
        return this.regexes;
    }

    public int getType() {
        return this.type;
    }

    public void setRegexes(List<Regexes> list) {
        this.regexes = list;
    }

    public void setType(int i) {
        this.type = i;
    }
}
