package defpackage;

import android.annotation.SuppressLint;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public class p47 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29983a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f29984b = false;
    public ColorFilter c = null;
    public int d = -1;
    public int e = -1;

    @SuppressLint({"Range"})
    public void a(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        int i = this.f29983a;
        if (i != -1) {
            drawable.setAlpha(i);
        }
        if (this.f29984b) {
            drawable.setColorFilter(this.c);
        }
        int i2 = this.d;
        if (i2 != -1) {
            drawable.setDither(i2 != 0);
        }
        int i3 = this.e;
        if (i3 != -1) {
            drawable.setFilterBitmap(i3 != 0);
        }
    }

    public void b(int i) {
        this.f29983a = i;
    }

    public void c(ColorFilter colorFilter) {
        this.c = colorFilter;
        this.f29984b = true;
    }

    public void d(boolean z) {
        this.d = z ? 1 : 0;
    }

    public void e(boolean z) {
        this.e = z ? 1 : 0;
    }
}
