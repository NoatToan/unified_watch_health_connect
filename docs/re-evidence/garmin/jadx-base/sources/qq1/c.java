package qq1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import lc.u0;
import nq1.k;
import o70.n;
import p005kotlin.Metadata;
import p3.m;
import p3.o0;
import p3.p2;
import p3.x1;
import r70.q;
import r70.r;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqq1/c;", "Lr70/r;", "Lrq1/c;", "stateHolder", "<init>", "(Lrq1/c;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rq1.c f146053a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f146054a;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.VALID_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.GENESIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n.PROMPT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f146054a = iArr;
        }
    }

    public c(rq1.c cVar) {
        cVar.getClass();
        this.f146053a = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, q qVar, m mVar, int i14) {
        int i15;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, 375455159);
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
            Object objQ = o0VarQ.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = (r53.i) this.f146053a.f154133a.invoke();
                o0VarQ.K(objQ);
            }
            k kVar = (k) s9.c.b((r53.i) objQ, null, o0VarQ, 48).getF182175a();
            Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zR = o0VarQ.r(kVar) | o0VarQ.r(context);
            Object objQ2 = o0VarQ.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new o72.f(kVar, context);
                o0VarQ.K(objQ2);
            }
            e23.a aVar = (e23.a) objQ2;
            int i16 = a.f146054a[(((kVar != null ? kVar.f126951b : null) == null || kVar.f126951b.doubleValue() <= 0.0d) ? n.EMPTY : n.VALID_DATA).ordinal()];
            if (i16 == 1) {
                o0VarQ.C(35181680);
                h.c(rVar, kVar, aVar, o0VarQ, i15 & 14);
                o0VarQ.g0(false);
            } else if (i16 == 2) {
                o0VarQ.C(35185654);
                h.d(rVar, kVar, aVar, o0VarQ, i15 & 14);
                o0VarQ.g0(false);
            } else {
                if (i16 != 3 && i16 != 4) {
                    throw kg.f.h(o0VarQ, 35179772, false);
                }
                o0VarQ.C(1090904169);
                o0VarQ.g0(false);
            }
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mx.h(this, rVar, qVar, i14, 13);
        }
    }
}
