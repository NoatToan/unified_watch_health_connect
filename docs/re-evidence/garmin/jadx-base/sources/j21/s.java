package j21;

import c2.t2;
import i3.mh;
import p005kotlin.Unit;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class s implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96709a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p f96710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f96711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0 f96712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f96713e;

    public /* synthetic */ s(e23.p pVar, String str, x0 x0Var, long j8) {
        this.f96710b = pVar;
        this.f96711c = str;
        this.f96712d = x0Var;
        this.f96713e = j8;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p3.m mVar;
        int i14 = this.f96709a;
        e23.p pVar = this.f96710b;
        switch (i14) {
            case 0:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((t2) obj).getClass();
                if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    String str = this.f96711c;
                    if (str != null) {
                        mVar2.C(969218815);
                        x0 x0VarA = x0.a(this.f96712d, this.f96713e, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                        d6.h.f57752b.getClass();
                        mh.c(str, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarA, mVar2, 0, 0, 130046);
                        mVar = mVar2;
                        mVar.f();
                    } else {
                        mVar = mVar2;
                        mVar.C(969310420);
                        mVar.f();
                    }
                    if (pVar == null) {
                        mVar.C(969336459);
                    } else {
                        mVar.C(31268918);
                        pVar.invoke(mVar, 0);
                    }
                    mVar.f();
                } else {
                    mVar2.e();
                }
                break;
            default:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((t2) obj).getClass();
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    if (pVar == null) {
                        mVar3.C(2097958385);
                    } else {
                        mVar3.C(-902155248);
                        pVar.invoke(mVar3, 0);
                    }
                    mVar3.f();
                    String str2 = this.f96711c;
                    if (str2 != null) {
                        mVar3.C(2098009381);
                        x0 x0VarA2 = x0.a(this.f96712d, this.f96713e, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                        d6.h.f57752b.getClass();
                        mh.c(str2, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarA2, mVar3, 0, 0, 130046);
                        mVar3.f();
                    } else {
                        mVar3.C(2098100986);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ s(String str, x0 x0Var, long j8, e23.p pVar) {
        this.f96711c = str;
        this.f96712d = x0Var;
        this.f96713e = j8;
        this.f96710b = pVar;
    }
}
