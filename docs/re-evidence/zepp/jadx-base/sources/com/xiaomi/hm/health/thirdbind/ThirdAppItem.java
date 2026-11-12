package com.xiaomi.hm.health.thirdbind;

/* JADX INFO: loaded from: classes21.dex */
public class ThirdAppItem {
    private String a;
    private String b;
    private int c;

    public ThirdAppItem() {
    }

    public int getIconResId() {
        return this.c;
    }

    public String getId() {
        return this.a;
    }

    public String getTitle() {
        return this.b;
    }

    public void setIconResId(int iconResId) {
        this.c = iconResId;
    }

    public void setId(String id) {
        this.a = id;
    }

    public void setTitle(String title) {
        this.b = title;
    }

    public ThirdAppItem(String id, String title, int iconResId) {
        this.a = id;
        this.b = title;
        this.c = iconResId;
    }
}
