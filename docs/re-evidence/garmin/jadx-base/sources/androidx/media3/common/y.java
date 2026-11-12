package androidx.media3.common;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f8583d = new y(1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8586c;

    static {
        fa.z.H(0);
        fa.z.H(1);
    }

    public y(float f14, float f15) {
        fa.a.a(f14 > 0.0f);
        fa.a.a(f15 > 0.0f);
        this.f8584a = f14;
        this.f8585b = f15;
        this.f8586c = Math.round(f14 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y.class == obj.getClass()) {
            y yVar = (y) obj;
            if (this.f8584a == yVar.f8584a && this.f8585b == yVar.f8585b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f8585b) + ((Float.floatToRawIntBits(this.f8584a) + 527) * 31);
    }

    public final String toString() {
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f8584a), Float.valueOf(this.f8585b));
    }

    public y(float f14) {
        this(f14, 1.0f);
    }
}
