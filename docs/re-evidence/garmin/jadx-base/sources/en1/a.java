package en1;

import e23.l;
import h2.j0;
import o53.b0;
import p005kotlin.Unit;
import r53.p2;
import rn1.k;
import sm1.a0;
import sm1.s;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f64722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f64723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f64724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0 f64725d;

    public /* synthetic */ a(b0 b0Var, s sVar, h2.b bVar, int i14) {
        this.f64722a = i14;
        this.f64723b = b0Var;
        this.f64724c = sVar;
        this.f64725d = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0068  */
    @Override // e23.l
    public final Object invoke(Object obj) {
        k kVar;
        s sVar;
        p2 p2Var;
        Object value;
        switch (this.f64722a) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                Object obj2 = null;
                ge1.b.T(this.f64723b, null, null, new b.a(this.f64725d, iIntValue, null), 3);
                for (Object obj3 : c.f64736e) {
                    if (((c) obj3).f64737a == iIntValue) {
                        obj2 = obj3;
                        this.f64724c.D4((c) obj2);
                        break;
                    }
                }
                this.f64724c.D4((c) obj2);
                break;
            default:
                int iIntValue2 = ((Integer) obj).intValue();
                Object obj4 = null;
                ge1.b.T(this.f64723b, null, null, new qn1.a.C2746a(this.f64725d, iIntValue2, null), 3);
                for (Object obj5 : k.f153656e) {
                    if (((k) obj5).f153657a == iIntValue2) {
                        obj4 = obj5;
                        kVar = (k) obj4;
                        sVar = this.f64724c;
                        if (kVar != null) {
                            p2Var = sVar.f160187g;
                            do {
                                value = p2Var.getValue();
                            } while (!p2Var.b(value, a0.a((a0) value, false, false, null, null, null, 0, null, false, false, false, false, false, null, false, kVar, null, 245759)));
                        } else {
                            sVar.getClass();
                        }
                        break;
                    }
                }
                kVar = (k) obj4;
                sVar = this.f64724c;
                if (kVar != null) {
                    p2Var = sVar.f160187g;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, a0.a((a0) value, false, false, null, null, null, 0, null, false, false, false, false, false, null, false, kVar, null, 245759)));
                } else {
                    sVar.getClass();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
