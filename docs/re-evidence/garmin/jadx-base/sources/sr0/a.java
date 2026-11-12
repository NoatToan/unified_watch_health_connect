package sr0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import lc.u0;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import r53.i;
import r70.q;
import r70.r;
import s9.c;
import zz1.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsr0/a;", "Lr70/r;", "Ltr0/a;", "stateHolder", "<init>", "(Ltr0/a;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tr0.a f160591a;

    public a(tr0.a aVar) {
        aVar.getClass();
        this.f160591a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, q qVar, m mVar, int i14) {
        int i15;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, -357820304);
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 131) != 130)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarQ.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = (i) this.f160591a.f166120a.invoke();
                o0VarQ.K(objQ);
            }
            d dVar = (d) c.b((i) objQ, null, o0VarQ, 48).getF182175a();
            Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zR = o0VarQ.r(context);
            Object objQ2 = o0VarQ.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new s70.r(context, 12);
                o0VarQ.K(objQ2);
            }
            e23.a aVar = (e23.a) objQ2;
            boolean zR2 = o0VarQ.r(context);
            Object objQ3 = o0VarQ.q();
            if (zR2 || objQ3 == c2565a) {
                objQ3 = new s70.r(context, 13);
                o0VarQ.K(objQ3);
            }
            e23.a aVar2 = (e23.a) objQ3;
            boolean zR3 = o0VarQ.r(context);
            Object objQ4 = o0VarQ.q();
            int i16 = 14;
            if (zR3 || objQ4 == c2565a) {
                objQ4 = new s70.r(context, i16);
                o0VarQ.K(objQ4);
            }
            zz1.c.b(rVar, dVar, new zz1.a(aVar, aVar2, (e23.a) objQ4), o0VarQ, i15 & 14);
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s70.n(this, rVar, qVar, i14, 24);
        }
    }
}
