package mw0;

import p005kotlin.Unit;
import p3.p0;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kw0.f f121256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f121257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f121258d;

    public /* synthetic */ e(kw0.f fVar, p1 p1Var, String str, int i14) {
        this.f121255a = 2;
        this.f121256b = fVar;
        this.f121257c = p1Var;
        this.f121258d = str;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f121255a;
        String str = this.f121258d;
        p1 p1Var = this.f121257c;
        kw0.f fVar = this.f121256b;
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                int iIntValue = num.intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    if (gl1.d.E(fVar)) {
                        mVar.C(136846360);
                        g.c(p1Var, str, mVar, 6);
                        mVar.f();
                    } else {
                        mVar.C(136926123);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    j.h(fVar, p1Var, str, mVar, 48);
                } else {
                    mVar.e();
                }
                break;
            default:
                num.getClass();
                j.h(fVar, p1Var, str, mVar, p0.t(49));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ e(kw0.f fVar, p1 p1Var, String str, int i14, byte b14) {
        this.f121255a = i14;
        this.f121256b = fVar;
        this.f121257c = p1Var;
        this.f121258d = str;
    }
}
