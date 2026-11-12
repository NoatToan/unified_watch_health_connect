package cn.bingoogolapple.bgabanner;

/* JADX INFO: loaded from: classes2.dex */
public class BGALocalImageSize {
    private int a;
    private int b;
    private float c;
    private float d;

    public BGALocalImageSize(int i, int i2, float f, float f2) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
    }

    public int getMaxHeight() {
        return this.b;
    }

    public int getMaxWidth() {
        return this.a;
    }

    public float getMinHeight() {
        return this.d;
    }

    public float getMinWidth() {
        return this.c;
    }

    public void setMaxHeight(int i) {
        this.b = i;
    }

    public void setMaxWidth(int i) {
        this.a = i;
    }

    public void setMinHeight(float f) {
        this.d = f;
    }

    public void setMinWidth(float f) {
        this.c = f;
    }
}
