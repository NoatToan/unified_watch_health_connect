package a31;

import c2.t2;
import e23.q;
import i3.mh;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f920c;

    public /* synthetic */ c(String str, x0 x0Var, int i14) {
        this.f918a = i14;
        this.f919b = str;
        this.f920c = x0Var;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f918a;
        x0 x0Var = this.f920c;
        String str = this.f919b;
        switch (i14) {
            case 0:
                float fFloatValue = ((Float) obj).floatValue();
                m mVar = (m) obj2;
                ((Integer) obj3).intValue();
                d dVar = d.f921a;
                mVar.C(1023392441);
                x1 x1Var = n.f135158a;
                float fA = g.a(str, x0Var, fFloatValue, mVar);
                mVar.f();
                return g6.f.a(fA);
            case 1:
                float fFloatValue2 = ((Float) obj).floatValue();
                m mVar2 = (m) obj2;
                ((Integer) obj3).intValue();
                d dVar2 = d.f921a;
                mVar2.C(763564922);
                x1 x1Var2 = n.f135158a;
                float fA2 = g.a(str, x0Var, fFloatValue2, mVar2);
                mVar2.f();
                return g6.f.a(fA2);
            case 2:
                float fFloatValue3 = ((Float) obj).floatValue();
                m mVar3 = (m) obj2;
                ((Integer) obj3).intValue();
                d dVar3 = d.f921a;
                mVar3.C(503737403);
                x1 x1Var3 = n.f135158a;
                float fA3 = g.a(str, x0Var, fFloatValue3, mVar3);
                mVar3.f();
                return g6.f.a(fA3);
            default:
                m mVar4 = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((t2) obj).getClass();
                if (mVar4.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var4 = n.f135158a;
                    mh.c(this.f919b, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, this.f920c, mVar4, 0, 0, 131070);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
        }
    }
}
