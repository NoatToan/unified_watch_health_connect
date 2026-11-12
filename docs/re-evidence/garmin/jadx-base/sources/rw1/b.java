package rw1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import fy1.i;
import h4.r;
import i3.ve;
import j23.g;
import mg2.o;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import pw1.j;
import tn.k;
import tw1.m;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static final void a(m mVar, int i14, p3.m mVar2, int i15) {
        o0 o0VarE = mVar2.E(-482311917);
        int i16 = (o0VarE.r(mVar) ? 4 : 2) | i15 | (o0VarE.k(i14) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            ve.a(x2.f(r.S, 1.0f), null, k.b(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, f.c(-813058536, new o(mVar, i14, (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)), o0VarE), o0VarE, 12582918, 122);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j(mVar, i14, i15, 2);
        }
    }

    public static final String b(g<LocalDate> gVar, Context context) {
        i.a aVar = i.f73924a;
        DateTime dateTimeAtStartOfDay = ((LocalDate) gVar.getStart()).toDateTimeAtStartOfDay();
        dateTimeAtStartOfDay.getClass();
        DateTime dateTimeAtStartOfDay2 = ((LocalDate) gVar.b()).toDateTimeAtStartOfDay();
        dateTimeAtStartOfDay2.getClass();
        aVar.getClass();
        return i.a.j(context, dateTimeAtStartOfDay, dateTimeAtStartOfDay2);
    }
}
