package defpackage;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;

/* JADX INFO: loaded from: classes4.dex */
public final class wrq {
    public static final wrq e = new wrq(0, 0);
    public static final j63<wrq> f = new ph8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @IntRange(from = 0)
    public final int f38295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @IntRange(from = 0)
    public final int f38296b;

    @IntRange(from = 0, to = 359)
    public final int c;

    @FloatRange(from = 0.0d, fromInclusive = false)
    public final float d;

    public wrq(@IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
        this(i, i2, 0, 1.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrq)) {
            return false;
        }
        wrq wrqVar = (wrq) obj;
        return this.f38295a == wrqVar.f38295a && this.f38296b == wrqVar.f38296b && this.c == wrqVar.c && this.d == wrqVar.d;
    }

    public int hashCode() {
        return ((((((217 + this.f38295a) * 31) + this.f38296b) * 31) + this.c) * 31) + Float.floatToRawIntBits(this.d);
    }

    public wrq(@IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0, to = 359) int i3, @FloatRange(from = 0.0d, fromInclusive = false) float f2) {
        this.f38295a = i;
        this.f38296b = i2;
        this.c = i3;
        this.d = f2;
    }
}
