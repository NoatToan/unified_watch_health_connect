package cg1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.t2;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.segments.model.SegmentDetailsDTO;
import com.garmin.android.apps.connectmobile.segments.presentation.SegmentDetailsActivity;
import gg1.o0;
import java.util.Arrays;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.x0;
import p3.x1;
import p3.y3;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27162a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SegmentDetailsDTO f27163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SegmentDetailsActivity f27164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f27165d;

    public /* synthetic */ m(SegmentDetailsDTO segmentDetailsDTO, SegmentDetailsActivity segmentDetailsActivity, String str) {
        this.f27163b = segmentDetailsDTO;
        this.f27164c = segmentDetailsActivity;
        this.f27165d = str;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        int i14 = this.f27162a;
        p3.m.a aVar = p3.m.f135153a;
        SegmentDetailsActivity segmentDetailsActivity = this.f27164c;
        SegmentDetailsDTO segmentDetailsDTO = this.f27163b;
        switch (i14) {
            case 0:
                t2 t2Var = (t2) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                SegmentDetailsActivity.a aVar2 = SegmentDetailsActivity.Z;
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    x0 x0Var = x0.f105818a;
                    String string = segmentDetailsActivity.getString(R.string.lbl_distance);
                    String str2 = this.f27165d;
                    String str3 = String.format("%s (%s)", Arrays.copyOf(new Object[]{string, str2}, 2));
                    y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                    Context context = (Context) mVar.A(y3Var);
                    Object objQ = mVar.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new e(4);
                        mVar.K(objQ);
                    }
                    String strA = oi0.d.a(context, str3, (oi0.f) objQ);
                    Context context2 = (Context) mVar.A(y3Var);
                    String strO = segmentDetailsActivity.f41404o;
                    strO.getClass();
                    context2.getClass();
                    if (segmentDetailsDTO != null) {
                        l3.a aVar3 = l3.f23124b;
                        double d14 = segmentDetailsDTO.f17842g;
                        m3 m3Var = m3.KILOMETER;
                        m3 m3Var2 = m3.METER;
                        aVar3.getClass();
                        double dG = l3.a.g(d14, m3Var, m3Var2);
                        if (!((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y()) {
                            m3Var = m3.MILE;
                        }
                        strO = l3.a.O(context2, dG, m3Var, l3.f23129g, false);
                    }
                    l72.x0 x0Var2 = l72.x0.f111346a;
                    String strQ = gl1.y.Q(mVar, R.string.lbl_distance);
                    b92.a aVarA = wz1.a.a(String.format("%s (%s)", Arrays.copyOf(new Object[]{strO, strA}, 2)));
                    int i15 = b92.a.f16960b;
                    int i16 = (iIntValue & 14) | (l72.x0.f111348c << 24);
                    x0Var2.a(i16, 52, aVarA, t2Var, null, null, strO, strQ, str2, null, mVar);
                    Context context3 = (Context) mVar.A(y3Var);
                    String str4 = segmentDetailsActivity.f41404o;
                    str4.getClass();
                    context3.getClass();
                    if (segmentDetailsDTO != null) {
                        l3.a aVar4 = l3.f23124b;
                        double d15 = segmentDetailsDTO.f41279r;
                        aVar4.getClass();
                        String strA0 = l3.a.A0(context3, d15, 2);
                        if (strA0 == null) {
                            str4 = "";
                            str = str4;
                        } else {
                            str = strA0;
                        }
                    } else {
                        str = str4;
                    }
                    String strQ2 = gl1.y.Q(mVar, R.string.lbl_avg_grade);
                    Context context4 = (Context) mVar.A(y3Var);
                    Object objQ2 = mVar.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new e(5);
                        mVar.K(objQ2);
                    }
                    x0Var2.a(i16, 60, wz1.a.a(String.format("%s %s", Arrays.copyOf(new Object[]{str, oi0.d.a(context4, strQ2, (oi0.f) objQ2)}, 2))), t2Var, null, null, str, strQ2, null, null, mVar);
                } else {
                    mVar.e();
                }
                break;
            default:
                t2 t2Var2 = (t2) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                SegmentDetailsActivity.a aVar5 = SegmentDetailsActivity.Z;
                t2Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(t2Var2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    y3 y3Var2 = AndroidCompositionLocals_androidKt.f6042b;
                    Context context5 = (Context) mVar2.A(y3Var2);
                    String strA1 = segmentDetailsActivity.f41404o;
                    strA1.getClass();
                    context5.getClass();
                    if (segmentDetailsDTO != null) {
                        f12.l lVar = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
                        l3.a aVar6 = l3.f23124b;
                        double d16 = segmentDetailsDTO.f41277p;
                        o0 o0VarG = lVar.g();
                        aVar6.getClass();
                        strA1 = l3.a.a0(context5, d16, o0VarG, false, false);
                    }
                    String strQ3 = gl1.y.Q(mVar2, R.string.lbl_total_ascent);
                    Context context6 = (Context) mVar2.A(y3Var2);
                    Object objQ3 = mVar2.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ3 == c2565a2) {
                        objQ3 = new e(6);
                        mVar2.K(objQ3);
                    }
                    String strA2 = oi0.d.a(context6, strQ3, (oi0.f) objQ3);
                    l72.x0 x0Var3 = l72.x0.f111346a;
                    x0 x0Var4 = x0.f105818a;
                    b92.a aVarA2 = wz1.a.a(String.format("%s (%s)", Arrays.copyOf(new Object[]{strA1, strA2}, 2)));
                    int i17 = b92.a.f16960b;
                    int i18 = (iIntValue2 & 14) | (l72.x0.f111348c << 24);
                    String str5 = this.f27165d;
                    x0Var3.a(i18, 52, aVarA2, t2Var2, null, null, strA1, strQ3, str5, null, mVar2);
                    Context context7 = (Context) mVar2.A(y3Var2);
                    String strA3 = segmentDetailsActivity.f41404o;
                    strA3.getClass();
                    context7.getClass();
                    if (segmentDetailsDTO != null) {
                        f12.l lVar2 = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
                        l3.a aVar7 = l3.f23124b;
                        double d17 = segmentDetailsDTO.f41278q;
                        o0 o0VarG2 = lVar2.g();
                        aVar7.getClass();
                        strA3 = l3.a.a0(context7, d17, o0VarG2, false, false);
                    }
                    String strQ4 = gl1.y.Q(mVar2, R.string.lbl_total_descent);
                    Context context8 = (Context) mVar2.A(y3Var2);
                    Object objQ4 = mVar2.q();
                    if (objQ4 == c2565a2) {
                        objQ4 = new e(7);
                        mVar2.K(objQ4);
                    }
                    x0Var3.a(i18, 52, wz1.a.a(String.format("%s (%s)", Arrays.copyOf(new Object[]{strA3, oi0.d.a(context8, strQ4, (oi0.f) objQ4)}, 2))), t2Var2, null, null, strA3, strQ4, str5, null, mVar2);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ m(SegmentDetailsActivity segmentDetailsActivity, String str, SegmentDetailsDTO segmentDetailsDTO) {
        this.f27164c = segmentDetailsActivity;
        this.f27165d = str;
        this.f27163b = segmentDetailsDTO;
    }
}
