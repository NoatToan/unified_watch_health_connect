package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class z8g extends iwq {
    public static e4h<z8g> i;

    static {
        e4h<z8g> e4hVarA = e4h.a(2, new z8g(null, 0.0f, 0.0f, null, null));
        i = e4hVarA;
        e4hVarA.g(0.5f);
    }

    public z8g(hwq hwqVar, float f, float f2, ryp rypVar, View view) {
        super(hwqVar, f, f2, rypVar, view);
    }

    public static z8g b(hwq hwqVar, float f, float f2, ryp rypVar, View view) {
        z8g z8gVar = (z8g) i.b();
        z8gVar.d = hwqVar;
        z8gVar.e = f;
        z8gVar.f = f2;
        z8gVar.g = rypVar;
        z8gVar.h = view;
        return z8gVar;
    }

    public static void c(z8g z8gVar) {
        i.c(z8gVar);
    }

    @Override // e4h.a
    public e4h.a a() {
        return new z8g(this.d, this.e, this.f, this.g, this.h);
    }

    @Override // java.lang.Runnable
    public void run() {
        float[] fArr = this.c;
        fArr[0] = this.e;
        fArr[1] = this.f;
        this.g.k(fArr);
        this.d.e(this.c, this.h);
        c(this);
    }
}
