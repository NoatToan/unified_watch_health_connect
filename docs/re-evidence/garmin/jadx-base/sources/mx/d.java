package mx;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.Iterator;
import kd0.h6;
import lc.u0;
import o53.s0;
import o70.n;
import p005kotlin.Metadata;
import p13.h0;
import p3.m;
import p3.o0;
import p3.p2;
import p3.x1;
import r53.s;
import r70.q;
import r70.r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmx/d;", "Lr70/r;", "Lnx/b;", "stateHolder", "<init>", "(Lnx/b;)V", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nx.b f121313a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f121314a;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.GENESIS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.VALID_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n.PROMPT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f121314a = iArr;
        }
    }

    public d(nx.b bVar) {
        bVar.getClass();
        this.f121313a = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, q qVar, m mVar, int i14) {
        int i15;
        n nVar;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, 448599915);
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
                gx.c cVar = this.f121313a.f128187a;
                objQ = s.A(new gx.d(cVar.f80020a, cVar), s0.f129406a);
                o0VarQ.K(objQ);
            }
            gx.b bVar = (gx.b) s9.c.b((r53.i) objQ, null, o0VarQ, 48).getF182175a();
            Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zR = o0VarQ.r(context);
            Object objQ2 = o0VarQ.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new l71.g(context, 6);
                o0VarQ.K(objQ2);
            }
            e23.a aVar = (e23.a) objQ2;
            if (bVar != null && ((bVar.f80018m && !bVar.f80019n) || !bVar.f80017l)) {
                nVar = n.GENESIS;
            } else if (bVar == null) {
                nVar = n.VALID_DATA;
            } else {
                Integer num = bVar.f80009d;
                if (num != null && num.intValue() >= 0) {
                    ArrayList arrayListZ = h0.Z(h0.C0(bVar.f80012g, bVar.f80013h));
                    if (!arrayListZ.isEmpty()) {
                        Iterator it = arrayListZ.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((Number) it.next()).intValue() >= 0) {
                                    nVar = n.VALID_DATA;
                                }
                            }
                        }
                    }
                }
                nVar = n.EMPTY;
            }
            int i16 = a.f121314a[nVar.ordinal()];
            if (i16 == 1) {
                o0VarQ.C(1607808929);
                g.b(rVar, bVar != null ? bVar.f80006a : null, aVar, o0VarQ, i15 & 14);
                o0VarQ.g0(false);
            } else if (i16 == 2) {
                o0VarQ.C(1607813824);
                g.c(rVar, bVar != null ? bVar.f80006a : null, aVar, o0VarQ, i15 & 14);
                o0VarQ.g0(false);
            } else if (i16 == 3) {
                o0VarQ.C(1607818832);
                g.a(rVar, bVar, aVar, o0VarQ, i15 & 14);
                o0VarQ.g0(false);
            } else {
                if (i16 != 4) {
                    throw kg.f.h(o0VarQ, 1607807069, false);
                }
                o0VarQ.C(-1697090923);
                o0VarQ.g0(false);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h6(this, rVar, qVar, i14, 28);
        }
    }
}
