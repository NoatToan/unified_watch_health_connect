package m3;

import c2.x2;
import i3.ua;
import l3.x0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class h implements e23.q<Boolean, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f116248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f116249b;

    public h(long j8, r rVar) {
        this.f116248a = j8;
        this.f116249b = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    @Override // e23.q
    public final Unit invoke(Boolean bool, p3.m mVar, Integer num) {
        boolean zBooleanValue = bool.booleanValue();
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar2.h(zBooleanValue) ? 4 : 2;
        }
        if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            if (zBooleanValue) {
                mVar2.C(-499784343);
                ua.a(l.f116265a, 0.0f, 0, 390, 56, this.f116248a, 0L, x2.q(h4.r.S, l.f116267c), mVar2);
                mVar2.f();
            } else {
                mVar2.C(-499540745);
                final r rVar = this.f116249b;
                boolean zB = mVar2.B(rVar);
                Object objQ = mVar2.q();
                if (zB) {
                    objQ = new x0() { // from class: m3.g
                        @Override // l3.x0
                        public final float invoke() {
                            return rVar.b();
                        }
                    };
                    mVar2.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new x0() { // from class: m3.g
                            @Override // l3.x0
                            public final float invoke() {
                                return rVar.b();
                            }
                        };
                        mVar2.K(objQ);
                    }
                }
                l.a((x0) objQ, this.f116248a, mVar2, 0);
                mVar2.f();
            }
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
