package r11;

import b63.o;
import b63.q;
import b63.z;
import i3.c5;
import i3.d5;
import java.util.ArrayList;
import p13.x;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c5 f149373b;

    public /* synthetic */ e(d5 d5Var, int i14) {
        this.f149372a = i14;
        this.f149373b = d5Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f149372a) {
            case 0:
                c5 c5Var = this.f149373b;
                Long lK = c5Var.k();
                if (lK != null) {
                    long jLongValue = lK.longValue();
                    Long lI = c5Var.i();
                    if (lI != null) {
                        long jLongValue2 = lI.longValue();
                        b63.l.INSTANCE.getClass();
                        b63.l lVarA = b63.l.Companion.a(jLongValue);
                        z.INSTANCE.getClass();
                        b63.k kVar = z.f16226b;
                        o oVarB = b63.b.d(lVarA, kVar).b();
                        o oVarB2 = b63.b.d(b63.l.Companion.a(jLongValue2), kVar).b();
                        ArrayList arrayListM = x.m(oVarB);
                        while (oVarB.compareTo(oVarB2) < 0) {
                            b63.i.INSTANCE.getClass();
                            oVarB = q.e(oVarB, 1, b63.i.f16190d);
                            arrayListM.add(oVarB);
                        }
                        return i53.a.j(arrayListM);
                    }
                }
                return null;
            case 1:
                return this.f149373b.k();
            default:
                return this.f149373b.i();
        }
    }
}
