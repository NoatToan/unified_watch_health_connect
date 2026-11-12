package com.mapbox.bindgen;

/* JADX INFO: loaded from: classes2.dex */
public class Size {
    private final int height;
    private final int width;

    public Size(int i14, int i15) {
        this.width = i14;
        this.height = i15;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.width == size.width && this.height == size.height) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i14 = this.height;
        int i15 = this.width;
        return i14 ^ ((i15 >>> 16) | (i15 << 16));
    }

    public String toString() {
        return this.width + "x" + this.height;
    }
}
