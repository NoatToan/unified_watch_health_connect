package miuix.appcompat.app.strategy;

import defpackage.od0;
import defpackage.pgl;
import defpackage.wc0;
import defpackage.woc;
import defpackage.yc0;

/* JADX INFO: loaded from: classes3.dex */
public class CommonActionBarStrategy implements woc {
    @Override // defpackage.woc
    public yc0 config(wc0 wc0Var, od0 od0Var) {
        if (wc0Var == null || od0Var == null) {
            return null;
        }
        yc0 yc0Var = new yc0();
        int i = od0Var.i;
        if (od0Var.p || i >= 960) {
            yc0Var.f40030b = 0;
            yc0Var.c = false;
            yc0Var.e = 3;
            return yc0Var;
        }
        float f = i;
        int i2 = od0Var.d;
        if (f < i2 * 0.8f) {
            if ((od0Var.f29022a != 2 || i2 <= 640) && i <= 410) {
                yc0Var.c = true;
                yc0Var.e = 2;
                return yc0Var;
            }
            yc0Var.f40030b = 0;
            yc0Var.c = false;
            if (i < 410) {
                yc0Var.e = 2;
                return yc0Var;
            }
            yc0Var.e = 3;
            return yc0Var;
        }
        int i3 = od0Var.f29022a;
        if ((i3 == 2 && i2 > 640) || ((i3 == 1 && i2 > od0Var.f) || (((i3 == 3 || i3 == 4) && Math.min(i2, od0Var.f) <= 550 && od0Var.d > od0Var.f) || (od0Var.f29022a == 4 && Math.min(od0Var.d, od0Var.f) <= 330)))) {
            yc0Var.f40030b = 0;
            yc0Var.c = false;
        } else if (!pgl.c(od0Var.f29023b) || od0Var.f29022a == 2) {
            yc0Var.c = true;
        } else if (od0Var.f / od0Var.d < 1.7f) {
            yc0Var.f40030b = 0;
            yc0Var.c = false;
        }
        yc0Var.e = 3;
        return yc0Var;
    }
}
