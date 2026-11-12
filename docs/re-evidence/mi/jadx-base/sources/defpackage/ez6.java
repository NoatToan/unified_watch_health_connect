package defpackage;

import android.content.res.Configuration;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes3.dex */
public class ez6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17212b;
    public int c;
    public int d;
    public float e;
    public float f;
    public float g;

    public ez6(DisplayMetrics displayMetrics) {
        int i = displayMetrics.densityDpi;
        this.c = i;
        this.d = i;
        float f = displayMetrics.density;
        this.e = f;
        float f2 = displayMetrics.scaledDensity;
        this.f = f2;
        this.g = f2 / f;
        this.f17211a = (int) ((displayMetrics.widthPixels / f) + 0.5f);
        this.f17212b = (int) ((displayMetrics.heightPixels / f) + 0.5f);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ez6)) {
            return false;
        }
        ez6 ez6Var = (ez6) obj;
        return Float.compare(this.e, ez6Var.e) == 0 && Float.compare(this.f, ez6Var.f) == 0 && Float.compare(this.g, ez6Var.g) == 0 && this.d == ez6Var.d && this.c == ez6Var.c;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return "{ densityDpi:" + this.d + ", density:" + this.e + ", windowWidthDp:" + this.f17211a + ", windowHeightDp: " + this.f17212b + ", scaledDensity:" + this.f + ", fontScale: " + this.g + ", defaultBitmapDensity:" + this.c + "}";
    }

    public ez6(Configuration configuration) {
        this.f17211a = configuration.screenWidthDp;
        this.f17212b = configuration.screenHeightDp;
        int i = configuration.densityDpi;
        this.c = i;
        this.d = i;
        float f = i * 0.00625f;
        this.e = f;
        float f2 = configuration.fontScale;
        this.g = f2;
        this.f = f * (f2 == 0.0f ? 1.0f : f2);
    }
}
