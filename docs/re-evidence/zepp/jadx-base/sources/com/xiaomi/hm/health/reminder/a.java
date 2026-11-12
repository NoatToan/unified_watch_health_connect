package com.xiaomi.hm.health.reminder;

/* JADX INFO: loaded from: classes21.dex */
class a {
    private String a;
    private String b;

    public a() {
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public void c(String body) {
        this.b = body;
    }

    public void d(String title) {
        this.a = title;
    }

    public String toString() {
        return "Text{title='" + this.a + "', body='" + this.b + "'}";
    }

    public a(String title, String body) {
        this.a = title;
        this.b = body;
    }
}
