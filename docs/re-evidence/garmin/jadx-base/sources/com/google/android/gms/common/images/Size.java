package com.google.android.gms.common.images;

import am.j;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class Size {
    private final int zaa;
    private final int zab;

    public Size(int i14, int i15) {
        this.zaa = i14;
        this.zab = i15;
    }

    public static Size parseSize(String str) {
        if (str == null) {
            h.s("string must not be null");
            return null;
        }
        int iIndexOf = str.indexOf(42);
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(120);
        }
        if (iIndexOf < 0) {
            throw zaa(str);
        }
        try {
            return new Size(Integer.parseInt(str.substring(0, iIndexOf)), Integer.parseInt(str.substring(iIndexOf + 1)));
        } catch (NumberFormatException unused) {
            throw zaa(str);
        }
    }

    private static NumberFormatException zaa(String str) {
        throw new NumberFormatException(j.m("Invalid Size: \"", str, "\""));
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
            if (this.zaa == size.zaa && this.zab == size.zab) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.zab;
    }

    public int getWidth() {
        return this.zaa;
    }

    public int hashCode() {
        int i14 = this.zaa;
        return ((i14 >>> 16) | (i14 << 16)) ^ this.zab;
    }

    public String toString() {
        return this.zaa + "x" + this.zab;
    }
}
