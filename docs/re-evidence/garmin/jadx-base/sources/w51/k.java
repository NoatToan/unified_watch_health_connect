package w51;

import com.garmin.android.apps.connectmobile.c3;
import i3.fe;
import l72.d3;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fe f182282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c3 f182283c;

    public /* synthetic */ k(fe feVar, c3 c3Var, int i14) {
        this.f182281a = i14;
        this.f182282b = feVar;
        this.f182283c = c3Var;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        float f14;
        float f15;
        int i14 = this.f182281a;
        c3 c3Var = this.f182283c;
        fe feVar = this.f182282b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    if (c3Var.isStatusBannerDisplayingError()) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f14 = j92.b.f97899b.f97921f;
                    } else {
                        f14 = 0;
                        g6.f.a aVar2 = g6.f.f75994b;
                    }
                    d3.b(feVar, c2.l.C(aVar, 0.0f, 0.0f, 0.0f, f14, 7), mVar, 6, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    if (c3Var.isStatusBannerDisplayingError()) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f15 = j92.b.f97899b.f97921f;
                    } else {
                        f15 = 0;
                        g6.f.a aVar4 = g6.f.f75994b;
                    }
                    d3.b(feVar, c2.l.C(aVar3, 0.0f, 0.0f, 0.0f, f15, 7), mVar, 6, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
