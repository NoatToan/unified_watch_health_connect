package defpackage;

import android.graphics.Point;
import miuix.appcompat.app.AppCompatActivity;

/* JADX INFO: loaded from: classes3.dex */
public class oz9 extends rzo {
    public oz9(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    @Override // defpackage.rzo
    public void N() {
        if (ty9.f()) {
            return;
        }
        if (Y()) {
            ty9.a(this.f33105a);
        } else if (ty9.h(this.f33105a) >= 0) {
            ty9.c(this.f33105a);
        }
    }

    @Override // defpackage.s72
    public boolean h() {
        rkr rkrVarI = tc8.i(this.f33105a);
        if (tc8.g(this.f33105a) < 600) {
            return false;
        }
        int i = rkrVarI.g;
        if (i == 8195 || !pgl.b(i)) {
            return true;
        }
        Point point = rkrVarI.d;
        return point.y >= 747 && point.x > 670;
    }
}
