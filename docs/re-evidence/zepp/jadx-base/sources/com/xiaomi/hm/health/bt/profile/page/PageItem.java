package com.xiaomi.hm.health.bt.profile.page;

/* JADX INFO: loaded from: classes18.dex */
public class PageItem {
    public static final int FLAG_HIDE = 1;
    private int a;
    private int b;
    private int c;
    private int d;

    public PageItem() {
        this.b = 0;
        this.d = 255;
    }

    public int getCurrentType() {
        return this.c;
    }

    public int getFlag() {
        return this.b;
    }

    public int getIndex() {
        return this.a;
    }

    public int getParentType() {
        return this.d;
    }

    public void setCurrentType(int currentType) {
        this.c = currentType;
    }

    public void setFlag(int flag) {
        this.b = flag;
    }

    public void setIndex(int index) {
        this.a = index;
    }

    public void setParentType(int parentType) {
        this.d = parentType;
    }

    public String toString() {
        return "PageItem{index=" + this.a + ", flag=" + this.b + ", currentType=" + this.c + ", parentType=" + this.d + '}';
    }

    public PageItem(int index, int currentType, int parentType, boolean isHide) {
        this.b = 0;
        this.d = 255;
        this.a = index;
        this.c = currentType;
        this.d = parentType;
        this.b = isHide ? 0 | 1 : 0 & (-2);
    }

    public PageItem(int index, int flag, int currentType, int parentType) {
        this.b = 0;
        this.d = 255;
        this.a = index;
        this.b = flag;
        this.c = currentType;
        this.d = parentType;
    }
}
