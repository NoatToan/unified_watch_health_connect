package com.xiaomi.hm.health.reminder;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes21.dex */
class b {
    private String a;
    private int b;
    private int c;
    private ArrayList<String> d = new ArrayList<>();

    public b(String startAt) {
        this.a = startAt;
        Matcher matcher = Pattern.compile("(?<=cron\\()[^\\)]+").matcher(startAt);
        while (matcher.find()) {
            this.d.add(matcher.group());
        }
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public void d(int disabled) {
        this.c = disabled;
    }

    public void e(int expireInSeconds) {
        this.b = expireInSeconds;
    }

    public void f(String startAt) {
        this.a = startAt;
    }
}
