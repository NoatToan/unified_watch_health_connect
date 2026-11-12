package ohos.ace.adapter.capability.web;

/* JADX INFO: loaded from: classes46.dex */
public class AceWebScrollObject {
    private int contentHeight;
    private int contentWidth;
    private int height;
    private int l;
    private int t;
    private int width;

    public AceWebScrollObject(int i, int i2) {
        this.l = i;
        this.t = i2;
    }

    public AceWebScrollObject(int i, int i2, int i3, int i4, int i5, int i6) {
        this.l = i;
        this.t = i2;
        this.contentWidth = i3;
        this.contentHeight = i4;
        this.width = i5;
        this.height = i6;
    }

    public int getX() {
        return this.l;
    }

    public int getY() {
        return this.t;
    }

    public int getContentWidth() {
        return this.contentWidth;
    }

    public int getContentHeight() {
        return this.contentHeight;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }
}
