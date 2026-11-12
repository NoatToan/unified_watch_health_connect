package s70;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls70/b2;", "Lr70/r;", "Ly70/w;", "stateHolder", "<init>", "(Ly70/w;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b2 implements r70.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y70.w f157656a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f157657a;

        static {
            int[] iArr = new int[x70.h.values().length];
            try {
                iArr[x70.h.USER_WITH_DEVICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x70.h.NO_DEVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f157657a = iArr;
        }
    }

    public b2(y70.w wVar) {
        wVar.getClass();
        this.f157656a = wVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(final h4.r rVar, final r70.q qVar, p3.m mVar, final int i14) {
        int i15;
        b2 b2Var;
        h4.r rVar2;
        r70.q qVar2;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        String strL;
        e23.a dVar;
        String strL2;
        p3.o0 o0VarQ = lc.u0.q(rVar, qVar, mVar, -217353036);
        int i16 = 2;
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarQ.r(qVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarQ.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = this.f157656a.f194686a;
                o0VarQ.K(objQ);
            }
            o70.e0 e0Var = (o70.e0) s9.c.b((r53.i) objQ, null, o0VarQ, 48).getF182175a();
            if (e0Var == null) {
                p2VarI0 = o0VarQ.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i17 = 0;
                pVar = new e23.p(this) { // from class: s70.a2

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b2 f157650b;

                    {
                        this.f157650b = this;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int i18 = i17;
                        p3.m mVar2 = (p3.m) obj;
                        ((Integer) obj2).getClass();
                        switch (i18) {
                            case 0:
                                this.f157650b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                break;
                            default:
                                this.f157650b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                b2Var = this;
                rVar2 = rVar;
                qVar2 = qVar;
                if (e0Var.f129965b) {
                    e0Var = null;
                }
                if (e0Var == null) {
                    o0VarQ.C(1646703372);
                    o0VarQ.g0(false);
                } else {
                    o0VarQ.C(1646703373);
                    x70.h hVar = e0Var.f129964a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarY = c2.l.y(rVar2, j92.b.f97899b.f97920e);
                    String strQ = gl1.y.Q(o0VarQ, hVar.f189414a);
                    String strQ2 = gl1.y.Q(o0VarQ, hVar.f189415b);
                    Integer num = hVar.f189416c;
                    if (num == null) {
                        o0VarQ.C(-1700632347);
                        o0VarQ.g0(false);
                        strL = null;
                    } else {
                        strL = lc.u0.l(o0VarQ, -1700632346, num, o0VarQ, false);
                    }
                    boolean zR = o0VarQ.r(qVar2);
                    Object objQ2 = o0VarQ.q();
                    if (zR || objQ2 == c2565a) {
                        objQ2 = new if2.b(qVar2, 1);
                        o0VarQ.K(objQ2);
                    }
                    e23.l lVar = (e23.l) objQ2;
                    int[] iArr = a.f157657a;
                    int i18 = iArr[hVar.ordinal()];
                    if (i18 != 1) {
                        dVar = i18 != 2 ? null : new j1(i16, b2Var, context);
                    } else {
                        dVar = new me2.d(lVar, 28);
                    }
                    Integer num2 = hVar.f189417d;
                    if (num2 == null) {
                        o0VarQ.C(-1700411131);
                        o0VarQ.g0(false);
                        strL2 = null;
                    } else {
                        strL2 = lc.u0.l(o0VarQ, -1700411130, num2, o0VarQ, false);
                    }
                    x70.g.a(rVarY, strQ, strQ2, strL, dVar, strL2, iArr[hVar.ordinal()] == 2 ? new r(context, 7) : null, o0VarQ, 0);
                    o0VarQ.g0(false);
                }
            }
            p2VarI0.f135219d = pVar;
        }
        b2Var = this;
        rVar2 = rVar;
        qVar2 = qVar;
        o0VarQ.e();
        p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            final int i19 = 1;
            final b2 b2Var2 = b2Var;
            final h4.r rVar3 = rVar2;
            final r70.q qVar3 = qVar2;
            pVar = new e23.p(b2Var2) { // from class: s70.a2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b2 f157650b;

                {
                    this.f157650b = b2Var2;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i110 = i19;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    switch (i110) {
                        case 0:
                            this.f157650b.a(rVar3, qVar3, mVar2, p3.p0.t(i14 | 1));
                            break;
                        default:
                            this.f157650b.a(rVar3, qVar3, mVar2, p3.p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}
