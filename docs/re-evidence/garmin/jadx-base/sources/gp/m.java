package gp;

import am.x0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import f21.a0;
import gl1.y;
import java.util.List;
import java.util.Locale;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p13.w;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lgp/m;", "Lr70/r;", "Lhp/c;", "liveActivityCardStateHolder", "<init>", "(Lhp/c;)V", "Lau0/t;", "cardData", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m implements r70.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hp.c f78393a;

    public m(hp.c cVar) {
        cVar.getClass();
        this.f78393a = cVar;
    }

    @Override // r70.r
    public final void a(h4.r rVar, r70.q qVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, 1499069167);
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 131) != 130)) {
            x1 x1Var = p3.n.f135158a;
            b(rVar, o0VarQ, ((i15 >> 3) & 112) | (i15 & 14));
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a0((r70.r) this, rVar, qVar, i14, 24);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ed  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void b(h4.r rVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-2077547584);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(this) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            au0.t tVar = (au0.t) s9.c.c(this.f78393a.f84904i, o0VarE).getF182175a();
            if (tVar == null) {
                o0VarE.C(-1741124877);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1741124876);
                Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                x0 x0Var = tVar.f12987b;
                String strQ = y.Q(o0VarE, R.string.lbl_live);
                String strT = tVar.f12989d;
                if (strT == null) {
                    strT = tVar.f12988c;
                }
                if (strT == null) {
                    o0VarE.C(21922557);
                    strT = gl1.d.T(x0Var.f4360c, o0VarE, 0);
                } else {
                    o0VarE.C(21921224);
                }
                o0VarE.g0(false);
                a2 a2Var = a2.SUBSCRIPTIONS;
                String strValueOf = String.valueOf(tVar);
                i2.f36769a.getClass();
                i2.a.b(a2Var, "LiveActivityCardComposable", strValueOf);
                int i16 = i15;
                u4.d dVar = x0Var.f4362e;
                f02.h.f67736a.getClass();
                long jA = f02.h.a(o0VarE);
                long jA2 = n5.a.a(o0VarE, x0Var.f4366i);
                String upperCase = strQ.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                List listC = w.c(upperCase);
                float f14 = 18;
                g6.f.a aVar = g6.f.f75994b;
                float f15 = 1;
                String str = tVar.f12990e;
                String str2 = tVar.f12991f;
                String str3 = tVar.f12992g;
                String strH = com.nimbusds.jose.shaded.gson.internal.a.h(strT, StringUtils.SPACE, strQ, ".");
                boolean zR = o0VarE.r(context);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new cy1.a(context, 28);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new cy1.a(context, 28);
                        o0VarE.K(objQ);
                    }
                }
                an.c.a(rVar, false, dVar, jA, jA2, listC, f14, f15, strT, str, str2, str3, strH, null, null, null, null, false, false, false, false, (e23.a) objQ, o0VarE, (i16 & 14) | 14155776, 0, 0, 2088962);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f2.o(this, rVar, i14, 13);
        }
    }
}
