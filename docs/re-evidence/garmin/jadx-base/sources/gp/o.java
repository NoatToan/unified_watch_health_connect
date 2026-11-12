package gp;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import r1.c0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgp/o;", "Lr70/r;", "Lhp/d;", "stateHolder", "<init>", "(Lhp/d;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o implements r70.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hp.d f78399a;

    public o(hp.d dVar) {
        dVar.getClass();
        this.f78399a = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(final h4.r rVar, final r70.q qVar, p3.m mVar, final int i14) {
        int i15;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, 620116947);
        if ((i14 & 384) == 0) {
            i15 = (o0VarQ.r(this) ? 256 : 128) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 129) != 128)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarQ.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = this.f78399a.f84922a;
                o0VarQ.K(objQ);
            }
            Integer num = (Integer) s9.c.b((r53.i) objQ, null, o0VarQ, 48).getF182175a();
            if (num != null) {
                int iIntValue = num.intValue();
                Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
                boolean z14 = iIntValue > 0;
                xz1.a.f192853a.getClass();
                c0.e(z14, null, xz1.a.a(o0VarQ), xz1.a.b(o0VarQ), "PendingActivityBannerCard", z3.f.c(755144363, new af1.l(context, iIntValue, 4), o0VarQ), o0VarQ, 221184, 2);
            } else {
                p2VarI0 = o0VarQ.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i16 = 0;
                pVar = new e23.p(this) { // from class: gp.n

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ o f78395b;

                    {
                        this.f78395b = this;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int i17 = i16;
                        p3.m mVar2 = (p3.m) obj;
                        ((Integer) obj2).getClass();
                        switch (i17) {
                            case 0:
                                this.f78395b.a(rVar, qVar, mVar2, p0.t(i14 | 1));
                                break;
                            default:
                                this.f78395b.a(rVar, qVar, mVar2, p0.t(i14 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            }
            p2VarI0.f135219d = pVar;
        }
        o0VarQ.e();
        p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            final int i17 = 1;
            pVar = new e23.p(this) { // from class: gp.n

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o f78395b;

                {
                    this.f78395b = this;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i18 = i17;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    switch (i18) {
                        case 0:
                            this.f78395b.a(rVar, qVar, mVar2, p0.t(i14 | 1));
                            break;
                        default:
                            this.f78395b.a(rVar, qVar, mVar2, p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}
