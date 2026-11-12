package b82;

import com.garmin.android.apps.connectmobile.R;
import i3.d8;
import i3.e7;
import i3.f7;
import i3.h7;
import i3.p7;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class w implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f16865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f16866c;

    public /* synthetic */ w(int i14, e23.a aVar, h4.r rVar) {
        this.f16864a = i14;
        this.f16865b = rVar;
        this.f16866c = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x017c  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f16864a;
        e23.a aVar = this.f16866c;
        h4.r rVar = this.f16865b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                t0 t0Var = t0.f16792a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    f7.f88085a.getClass();
                    e7 e7VarA = f7.a(mVar);
                    d92.b.f58623a.getClass();
                    e7 e7VarA2 = e7.a(e7VarA, 0L, o4.d0.c(0.5f, d92.b.a(mVar).f().d(), 14), 7);
                    f5.p pVar = p7.f89279a;
                    h4.r rVarThen = rVar.then(d8.f87832a);
                    boolean zB = mVar.B(aVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new as.n(aVar, 17);
                        mVar.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new as.n(aVar, 17);
                            mVar.K(objQ);
                        }
                    }
                    h7.a((e23.a) objQ, rVarThen, true, e7VarA2, null, z3.f.c(-621149697, new as0.b((byte) 0, 28), mVar), mVar, 1572864, 48);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                jg.b.b(p3.p0.t(1), aVar, rVar, (p3.m) obj);
                break;
            case 2:
                ((Integer) obj2).getClass();
                fo.d.g(p3.p0.t(49), aVar, rVar, (p3.m) obj);
                break;
            case 3:
                ((Integer) obj2).getClass();
                n62.b.c(p3.p0.t(1), aVar, rVar, (p3.m) obj);
                break;
            case 4:
                ((Integer) obj2).getClass();
                r40.b.a(p3.p0.t(7), aVar, rVar, (p3.m) obj);
                break;
            case 5:
                ((Integer) obj2).getClass();
                s70.i0.a(p3.p0.t(1), aVar, rVar, (p3.m) obj);
                break;
            case 6:
                ((Integer) obj2).getClass();
                s70.l0.a(p3.p0.t(1), aVar, rVar, (p3.m) obj);
                break;
            case 7:
                ((Integer) obj2).getClass();
                s70.w0.a(p3.p0.t(1), aVar, rVar, (p3.m) obj);
                break;
            case 8:
                ((Integer) obj2).getClass();
                s70.d1.a(p3.p0.t(1), aVar, rVar, (p3.m) obj);
                break;
            case 9:
                ((Integer) obj2).getClass();
                si1.s.a(p3.p0.t(1), aVar, rVar, (p3.m) obj);
                break;
            case 10:
                ((Integer) obj2).getClass();
                t21.p0.c(p3.p0.t(1), aVar, rVar, (p3.m) obj);
                break;
            case 11:
                ((Integer) obj2).getClass();
                vb1.i.b(p3.p0.t(1), aVar, rVar, (p3.m) obj);
                break;
            case 12:
                ((Integer) obj2).getClass();
                wv0.i.a(p3.p0.t(1), aVar, rVar, (p3.m) obj);
                break;
            case 13:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    l72.f0.a.f111000a.m(gl1.y.Q(mVar2, R.string.lbl_replay), this.f16865b, false, this.f16866c, mVar2, 0, 4);
                } else {
                    mVar2.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                yt.f0.b(p3.p0.t(1), aVar, rVar, (p3.m) obj);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ w(e23.a aVar, h4.r rVar, int i14, int i15) {
        this.f16864a = i15;
        this.f16866c = aVar;
        this.f16865b = rVar;
    }

    public /* synthetic */ w(h4.r rVar, e23.a aVar, int i14, int i15) {
        this.f16864a = i15;
        this.f16865b = rVar;
        this.f16866c = aVar;
    }
}
