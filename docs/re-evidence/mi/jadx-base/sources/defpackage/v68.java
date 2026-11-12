package defpackage;

import android.content.Context;
import android.graphics.Color;

/* JADX INFO: loaded from: classes5.dex */
public class v68 {
    public static final int f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36539b;
    public final int c;
    public final int d;
    public final float e;

    public v68(Context context) {
        this(e8f.b(context, pii.w, false), i8f.b(context, pii.v, 0), i8f.b(context, pii.u, 0), i8f.b(context, pii.s, 0), context.getResources().getDisplayMetrics().density);
    }

    public float a(float f2) {
        float f3 = this.e;
        if (f3 <= 0.0f || f2 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f2 / f3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i, float f2) {
        int i2;
        float fA = a(f2);
        int iAlpha = Color.alpha(i);
        int iH = i8f.h(z44.p(i, 255), this.f36539b, fA);
        if (fA > 0.0f && (i2 = this.c) != 0) {
            iH = i8f.g(iH, z44.p(i2, f));
        }
        return z44.p(iH, iAlpha);
    }

    public int c(int i, float f2) {
        return (this.f36538a && f(i)) ? b(i, f2) : i;
    }

    public int d(float f2) {
        return c(this.d, f2);
    }

    public boolean e() {
        return this.f36538a;
    }

    public final boolean f(int i) {
        return z44.p(i, 255) == this.d;
    }

    public v68(boolean z, int i, int i2, int i3, float f2) {
        this.f36538a = z;
        this.f36539b = i;
        this.c = i2;
        this.d = i3;
        this.e = f2;
    }
}
