package cg1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.t2;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.segments.presentation.SegmentDetailsActivity;
import gg1.o0;
import java.util.Arrays;
import l72.x0;
import p005kotlin.Unit;
import p3.p1;
import p3.x1;
import p3.y3;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f27167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f27168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f27169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f27170e;

    public /* synthetic */ n(double d14, p1 p1Var, double d15, p1 p1Var2) {
        this.f27166a = 2;
        this.f27167b = d14;
        this.f27169d = p1Var;
        this.f27168c = d15;
        this.f27170e = p1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strA0;
        String strA1;
        t2 t2Var;
        p3.m mVar;
        int i14 = this.f27166a;
        double d14 = this.f27168c;
        double d15 = this.f27167b;
        Object obj4 = this.f27170e;
        Object obj5 = this.f27169d;
        switch (i14) {
            case 0:
                o0 o0Var = (o0) obj5;
                SegmentDetailsActivity segmentDetailsActivity = (SegmentDetailsActivity) obj4;
                t2 t2Var2 = (t2) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                SegmentDetailsActivity.a aVar = SegmentDetailsActivity.Z;
                t2Var2.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar2.B(t2Var2) ? 4 : 2;
                }
                int i15 = iIntValue;
                if (mVar2.n(i15 & 1, (i15 & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    l3.a aVar2 = l3.f23124b;
                    y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                    Context context = (Context) mVar2.A(y3Var);
                    aVar2.getClass();
                    String strG1 = l3.a.G1(context, o0Var);
                    Context context2 = (Context) mVar2.A(y3Var);
                    Object objQ = mVar2.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new e(8);
                        mVar2.K(objQ);
                    }
                    String strA = oi0.d.a(context2, strG1, (oi0.f) objQ);
                    double d16 = this.f27167b;
                    if (Double.isNaN(d16)) {
                        mVar2.C(414029422);
                        mVar2.f();
                        strA0 = segmentDetailsActivity.f41404o;
                    } else {
                        mVar2.C(414110611);
                        strA0 = l3.a.a0((Context) mVar2.A(y3Var), d16, o0Var, false, false);
                        mVar2.f();
                    }
                    String str = strA0;
                    double d17 = this.f27168c;
                    if (Double.isNaN(d17)) {
                        mVar2.C(414550222);
                        mVar2.f();
                        strA1 = segmentDetailsActivity.f41404o;
                    } else {
                        mVar2.C(414631411);
                        strA1 = l3.a.a0((Context) mVar2.A(y3Var), d17, o0Var, false, false);
                        mVar2.f();
                    }
                    x0 x0Var = x0.f111346a;
                    String str2 = str == null ? "" : str;
                    String strQ = gl1.y.Q(mVar2, R.string.lbl_minimum);
                    p005kotlin.jvm.internal.x0 x0Var2 = p005kotlin.jvm.internal.x0.f105818a;
                    b92.a aVarA = wz1.a.a(String.format("%s %s %s", Arrays.copyOf(new Object[]{str, segmentDetailsActivity.getString(R.string.lbl_minimum), strA}, 3)));
                    int i16 = i15 & 14;
                    int i17 = b92.a.f16960b;
                    int i18 = i16 | (x0.f111348c << 24);
                    x0Var.a(i18, 52, aVarA, t2Var2, null, null, str2, strQ, strG1, null, mVar2);
                    x0Var.a(i18, 52, wz1.a.a(String.format("%s %s %s", Arrays.copyOf(new Object[]{strA1, segmentDetailsActivity.getString(R.string.lbl_maximum), strA}, 3))), t2Var2, null, null, strA1 == null ? "" : strA1, gl1.y.Q(mVar2, R.string.lbl_maximum), strG1, null, mVar2);
                } else {
                    mVar2.e();
                }
                break;
            case 1:
                a10.a aVar3 = (a10.a) obj5;
                l22.a aVar4 = aVar3.f242a;
                String str3 = (String) obj4;
                t2 t2Var3 = (t2) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                t2Var3.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar3.B(t2Var3) ? 4 : 2;
                }
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    x0 x0Var3 = x0.f111346a;
                    String strB = me1.c.b(aVar3, Double.valueOf(d15));
                    String string = aVar4.getString(R.string.lbl_sleep_avg);
                    String str4 = me1.c.d(Double.valueOf(d15)) ? str3 : null;
                    int i19 = (iIntValue2 & 14) | (x0.f111348c << 24);
                    x0Var3.a(i19, 116, null, t2Var3, null, null, strB, string, str4, null, mVar3);
                    x0Var3.a(i19, 116, null, t2Var3, null, null, me1.c.b(aVar3, Double.valueOf(d14)), aVar4.getString(R.string.lbl_awake_avg), me1.c.d(Double.valueOf(d14)) ? str3 : null, null, mVar3);
                } else {
                    mVar3.e();
                }
                break;
            default:
                p1 p1Var = (p1) obj5;
                p1 p1Var2 = (p1) obj4;
                t2 t2Var4 = (t2) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                t2Var4.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar4.B(t2Var4) ? 4 : 2;
                }
                int i24 = iIntValue3;
                if (mVar4.n(i24 & 1, (i24 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    if (Double.isNaN(d15)) {
                        t2Var = t2Var4;
                        mVar = mVar4;
                        mVar.C(1451641637);
                        mVar.f();
                    } else {
                        mVar4.C(1451290872);
                        t2Var = t2Var4;
                        x0.f111346a.a((i24 & 14) | (x0.f111348c << 24), 120, null, t2Var, null, null, String.valueOf((float) d15), gl1.y.Q(mVar4, R.string.activity_aerobic_label), null, new x0.a(((o4.d0) p1Var.getF182175a()).f128833a, null), mVar4);
                        mVar = mVar4;
                        mVar.f();
                    }
                    if (Double.isNaN(d14)) {
                        mVar.C(1452065221);
                        mVar.f();
                    } else {
                        mVar.C(1451708690);
                        x0.f111346a.a((i24 & 14) | (x0.f111348c << 24), 120, null, t2Var, null, null, String.valueOf((float) d14), gl1.y.Q(mVar, R.string.activity_anaerobic_label), null, new x0.a(((o4.d0) p1Var2.getF182175a()).f128833a, null), mVar);
                        mVar.f();
                    }
                } else {
                    mVar4.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ n(Object obj, double d14, Object obj2, double d15, int i14) {
        this.f27166a = i14;
        this.f27169d = obj;
        this.f27167b = d14;
        this.f27170e = obj2;
        this.f27168c = d15;
    }
}
