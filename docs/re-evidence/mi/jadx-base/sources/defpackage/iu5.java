package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public class iu5 implements m47 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f22092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m47 f22093b;

    public iu5(Resources resources, m47 m47Var) {
        this.f22092a = resources;
        this.f22093b = m47Var;
    }

    public static boolean c(z14 z14Var) {
        return (z14Var.o() == 1 || z14Var.o() == 0) ? false : true;
    }

    public static boolean d(z14 z14Var) {
        return (z14Var.p() == 0 || z14Var.p() == -1) ? false : true;
    }

    @Override // defpackage.m47
    public Drawable a(u14 u14Var) {
        try {
            if (epa.d()) {
                epa.a("DefaultDrawableFactory#createDrawable");
            }
            if (u14Var instanceof z14) {
                z14 z14Var = (z14) u14Var;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f22092a, z14Var.d());
                return (d(z14Var) || c(z14Var)) ? new nch(bitmapDrawable, z14Var.p(), z14Var.o()) : bitmapDrawable;
            }
            m47 m47Var = this.f22093b;
            if (m47Var == null || !m47Var.b(u14Var)) {
            }
            return this.f22093b.a(u14Var);
        } finally {
            if (epa.d()) {
                epa.b();
            }
        }
    }

    @Override // defpackage.m47
    public boolean b(u14 u14Var) {
        return true;
    }
}
