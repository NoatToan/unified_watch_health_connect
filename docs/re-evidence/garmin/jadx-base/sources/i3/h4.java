package i3;

import com.garmin.android.apps.connectmobile.R;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class h4 implements e23.r<f2.r, Integer, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j23.l f88286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l3.e0 f88287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f88288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f88289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l<Integer, Unit> f88290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bc f88291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b3 f88292g;

    /* JADX WARN: Multi-variable type inference failed */
    public h4(j23.l lVar, l3.e0 e0Var, int i14, int i15, e23.l<? super Integer, Unit> lVar2, bc bcVar, b3 b3Var) {
        this.f88286a = lVar;
        this.f88287b = e0Var;
        this.f88288c = i14;
        this.f88289d = i15;
        this.f88290e = lVar2;
        this.f88291f = bcVar;
        this.f88292g = b3Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    @Override // e23.r
    public final Unit invoke(f2.r rVar, Integer num, p3.m mVar, Integer num2) {
        int iIntValue = num.intValue();
        p3.m mVar2 = mVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= mVar2.k(iIntValue) ? 32 : 16;
        }
        if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
            p3.x1 x1Var = p3.n.f135158a;
            int i14 = iIntValue + this.f88286a.f96796a;
            String strA = j1.a(i14, 7, this.f88287b.f109226a);
            h4.r.a aVar = h4.r.S;
            n3.n.f123126a.getClass();
            h4.r rVarN = c2.x2.n(aVar, n3.n.E, n3.n.D);
            boolean z14 = i14 == this.f88288c;
            boolean z15 = i14 == this.f88289d;
            e23.l<Integer, Unit> lVar = this.f88290e;
            boolean zB = mVar2.B(lVar) | mVar2.k(i14);
            Object objQ = mVar2.q();
            if (zB) {
                objQ = new au0.m(lVar, i14, 12);
                mVar2.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new au0.m(lVar, i14, 12);
                    mVar2.K(objQ);
                }
            }
            this.f88291f.getClass();
            int i15 = l3.n1.f109367b;
            x3.m(strA, rVarN, z14, z15, (e23.a) objQ, true, String.format(l3.k.h(mVar2, R.string.m3c_date_picker_navigate_to_year_description), Arrays.copyOf(new Object[]{strA}, 1)), this.f88292g, mVar2, 48);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
