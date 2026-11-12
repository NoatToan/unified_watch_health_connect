package com.huawei.hms.common.size;

import com.huawei.hms.common.internal.Objects;

/* JADX INFO: loaded from: classes33.dex */
public class Size {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13087b;

    public Size(int i, int i2) {
        this.f13086a = i;
        this.f13087b = i2;
    }

    public static Size parseSize(String str) {
        try {
            int iIndexOf = str.indexOf("x");
            if (iIndexOf < 0) {
                iIndexOf = str.indexOf("*");
            }
            return new Size(Integer.parseInt(str.substring(0, iIndexOf)), Integer.parseInt(str.substring(iIndexOf + 1)));
        } catch (Exception unused) {
            throw new IllegalArgumentException("Size parses failed");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.f13086a == size.f13086a && this.f13087b == size.f13087b) {
                return true;
            }
        }
        return false;
    }

    public final int getHeight() {
        return this.f13087b;
    }

    public final int getWidth() {
        return this.f13086a;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(getWidth()), Integer.valueOf(getHeight()));
    }

    public final String toString() {
        return "Width is " + this.f13086a + " Height is " + this.f13087b;
    }
}
