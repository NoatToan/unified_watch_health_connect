package cn1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import lc.u0;
import p005kotlin.Metadata;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcn1/l;", "Lr70/r;", "Ldn1/c;", "stateHolder", "<init>", "(Ldn1/c;)V", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements r70.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dn1.c f28022a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28023a;

        static {
            int[] iArr = new int[o70.n.values().length];
            try {
                iArr[o70.n.GENESIS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o70.n.EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o70.n.VALID_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o70.n.PROMPT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f28023a = iArr;
        }
    }

    public l(dn1.c cVar) {
        cVar.getClass();
        this.f28022a = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, r70.q qVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, -810671961);
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
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = (r53.i) this.f28022a.f60533a.invoke();
                o0VarQ.K(objQ);
            }
            qm1.k kVar = (qm1.k) s9.c.b((r53.i) objQ, null, o0VarQ, 48).getF182175a();
            Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zR = o0VarQ.r(context);
            Object objQ2 = o0VarQ.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new a42.d(context, 23);
                o0VarQ.K(objQ2);
            }
            e23.a aVar = (e23.a) objQ2;
            int i16 = a.f28023a[qm1.l.c(kVar).ordinal()];
            if (i16 == 1) {
                o0VarQ.C(-1666654351);
                n.c(rVar, kVar != null ? kVar.f145620a : null, aVar, o0VarQ, i15 & 14);
                o0VarQ.g0(false);
            } else if (i16 == 2) {
                o0VarQ.C(-1666649840);
                n.d(rVar, kVar != null ? kVar.f145620a : null, aVar, o0VarQ, i15 & 14);
                o0VarQ.g0(false);
            } else if (i16 == 3) {
                o0VarQ.C(-1666645216);
                n.b(rVar, kVar, aVar, o0VarQ, i15 & 14);
                o0VarQ.g0(false);
            } else {
                if (i16 != 4) {
                    throw kg.f.h(o0VarQ, -1666656049, false);
                }
                o0VarQ.C(-126272839);
                o0VarQ.g0(false);
            }
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.f(this, rVar, qVar, i14, 28);
        }
    }
}
