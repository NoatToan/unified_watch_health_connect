package com.xiaomi.hm.health.databases.model;

/* JADX INFO: loaded from: classes20.dex */
public class WatchSkin {
    private int a;
    private String b;
    private String c;
    private boolean d;
    private float e;
    private boolean f;
    private int g;
    private boolean h;
    private String i;
    private String j;

    public WatchSkin(int i, String str, String str2, boolean z, float f, boolean z2, int i2, boolean z3, String str3, String str4) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = f;
        this.f = z2;
        this.g = i2;
        this.h = z3;
        this.i = str3;
        this.j = str4;
    }

    public boolean getCustomizable() {
        return this.h;
    }

    public String getDescription() {
        return this.c;
    }

    public String getDownloadUrl() {
        return this.j;
    }

    public boolean getDownloadable() {
        return this.f;
    }

    public int getId() {
        return this.a;
    }

    public String getImage() {
        return this.i;
    }

    public boolean getIsFree() {
        return this.d;
    }

    public String getName() {
        return this.b;
    }

    public float getPrice() {
        return this.e;
    }

    public int getSize() {
        return this.g;
    }

    public void setCustomizable(boolean z) {
        this.h = z;
    }

    public void setDescription(String str) {
        this.c = str;
    }

    public void setDownloadUrl(String str) {
        this.j = str;
    }

    public void setDownloadable(boolean z) {
        this.f = z;
    }

    public void setId(int i) {
        this.a = i;
    }

    public void setImage(String str) {
        this.i = str;
    }

    public void setIsFree(boolean z) {
        this.d = z;
    }

    public void setName(String str) {
        this.b = str;
    }

    public void setPrice(float f) {
        this.e = f;
    }

    public void setSize(int i) {
        this.g = i;
    }

    public WatchSkin() {
    }
}
