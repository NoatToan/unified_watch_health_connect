package v2;

import android.view.inputmethod.CursorAnchorInfo;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv2/a0;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a0 {
    static {
        new a0();
    }

    private a0() {
    }

    public static final void a(CursorAnchorInfo.Builder builder, s5.q0 q0Var, n4.d dVar) {
        if (dVar.l()) {
            return;
        }
        s5.o oVar = q0Var.f157281b;
        int i14 = oVar.f157257f - 1;
        if (i14 < 0) {
            i14 = 0;
        }
        int iE = j23.t.e(oVar.e(dVar.f123548b), 0, i14);
        int iE2 = j23.t.e(oVar.e(dVar.f123550d), 0, i14);
        if (iE > iE2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(q0Var.g(iE), oVar.f(iE), q0Var.h(iE), oVar.b(iE));
            if (iE == iE2) {
                return;
            } else {
                iE++;
            }
        }
    }
}
