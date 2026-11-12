package l72;

import i3.mh;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110950a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b92.a f110951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f110952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f110953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f110954e;

    public /* synthetic */ d(b92.a aVar, boolean z14, String str, String str2) {
        this.f110951b = aVar;
        this.f110952c = z14;
        this.f110953d = str;
        this.f110954e = str2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005f  */
    /* JADX WARN: Code duplicated, block: B:22:0x00d5  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f110950a) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c2.t) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    l.j(0, this.f110951b, this.f110953d, this.f110954e, mVar, this.f110952c);
                } else {
                    mVar.e();
                }
                break;
            default:
                i53.d<String, String> dVar = this.f110951b.f16961a;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c2.c1) obj).getClass();
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    String str = dVar.get("title");
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB = d92.c.b(j92.f.f97932i, mVar2);
                    h4.r.a aVar = h4.r.S;
                    boolean zB = mVar2.B(str);
                    Object objQ = mVar2.q();
                    p3.m.a aVar2 = p3.m.f135153a;
                    if (zB) {
                        objQ = new y01.k(str, 21);
                        mVar2.K(objQ);
                    } else {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new y01.k(str, 21);
                            mVar2.K(objQ);
                        }
                    }
                    mh.c(this.f110953d, wz1.i.e(p5.v.c((e23.l) objQ, aVar, false), this.f110952c, new yp0.b(11), mVar2, 0), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 131068);
                    String str2 = this.f110954e;
                    if (str2 == null) {
                        mVar2.C(-812592233);
                        mVar2.f();
                    } else {
                        mVar2.C(-812592232);
                        String str3 = dVar.get("label_metadata");
                        s5.x0 x0VarF = d92.c.f(j92.f.f97935l, mVar2);
                        boolean zB2 = mVar2.B(str3);
                        Object objQ2 = mVar2.q();
                        if (zB2) {
                            objQ2 = new y01.k(str3, 22);
                            mVar2.K(objQ2);
                        } else {
                            aVar2.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new y01.k(str3, 22);
                                mVar2.K(objQ2);
                            }
                        }
                        mh.c(str2, p5.v.c((e23.l) objQ2, aVar, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar2, 0, 0, 131068);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d(String str, String str2, b92.a aVar, boolean z14) {
        this.f110953d = str;
        this.f110954e = str2;
        this.f110951b = aVar;
        this.f110952c = z14;
    }
}
