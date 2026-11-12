package rw1;

import android.content.Context;
import android.os.Parcelable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.m;
import c2.x2;
import cn1.o;
import f12.l;
import h4.r;
import i3.ve;
import ob0.e;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import vb.h;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static final void a(m mVar, sw1.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, p3.m mVar2, int i14) {
        aVar2.getClass();
        o0 o0VarE = mVar2.E(-1429227246);
        int i15 = i14 | (o0VarE.r(mVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128) | (o0VarE.r(aVar3) ? 2048 : 1024) | (o0VarE.r(aVar4) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            ve.a(x2.f(r.S, 1.0f), null, h.f(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, f.c(650603735, new o(aVar, ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, LocalDate.now(), context, mVar, aVar3, aVar4, aVar2), o0VarE), o0VarE, 12582918, 122);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e((Object) mVar, (Parcelable) aVar, aVar2, aVar3, aVar4, i14, 23);
        }
    }
}
