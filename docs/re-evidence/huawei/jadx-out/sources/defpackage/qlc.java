package defpackage;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes16.dex */
public class qlc {
    private qlb d;

    qlc(qlb qlbVar) {
        this.d = qlbVar;
    }

    public float b() {
        return (this.d.e() - this.d.j()) - this.d.a();
    }

    public float e() {
        return (this.d.i() - this.d.b()) - this.d.d();
    }

    public RectF a() {
        return new RectF(this.d.b(), this.d.j(), this.d.b() + e(), this.d.j() + b());
    }
}
