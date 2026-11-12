package e52;

import android.content.Context;
import c2.t2;
import com.garmin.android.apps.connectmobile.R;
import e23.q;
import gl1.y;
import l72.x0;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63081a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f63082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d52.e f63083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f63084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f63085e;

    public /* synthetic */ e(String str, d52.e eVar, String str2, String str3) {
        this.f63082b = str;
        this.f63083c = eVar;
        this.f63084d = str2;
        this.f63085e = str3;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f63081a;
        d52.e eVar = this.f63083c;
        switch (i14) {
            case 0:
                t2 t2Var = (t2) obj;
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = n.f135158a;
                    x0 x0Var = x0.f111346a;
                    String strQ = y.Q(mVar, R.string.lbl_distance);
                    eVar.getClass();
                    Context context = eVar.f57568a;
                    String str = this.f63082b;
                    String string = context.getString(R.string.lbl_distance_value, xy2.b.O(context, str));
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(string);
                    String str2 = this.f63084d;
                    sb3.append(str2);
                    b92.a aVarA = wz1.a.a(sb3.toString());
                    int i15 = b92.a.f16960b;
                    int i16 = (iIntValue & 14) | (x0.f111348c << 24);
                    x0Var.a(i16, 52, aVarA, t2Var, null, null, str, strQ, str2, null, mVar);
                    String strQ2 = y.Q(mVar, R.string.lbl_calories);
                    String str3 = this.f63085e;
                    x0Var.a(i16, 60, wz1.a.a(context.getString(R.string.lbl_calories_word_value, xy2.b.O(context, str3))), t2Var, null, null, str3, strQ2, null, null, mVar);
                } else {
                    mVar.e();
                }
                break;
            default:
                t2 t2Var2 = (t2) obj;
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(t2Var2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    int i17 = iIntValue2;
                    x0 x0Var2 = x0.f111346a;
                    String strQ3 = y.Q(mVar2, R.string.lbl_total_pushes);
                    String strQ4 = y.Q(mVar2, R.string.lbl_total_pushes);
                    int i18 = d52.e.f57567c;
                    String str4 = this.f63082b;
                    b92.a aVarH = eVar.h(str4, strQ4, null);
                    int i19 = b92.a.f16960b;
                    int i24 = (i17 & 14) | (x0.f111348c << 24);
                    x0Var2.a(i24, 60, aVarH, t2Var2, null, null, str4, strQ3, null, null, mVar2);
                    String strQ5 = y.Q(mVar2, R.string.lbl_total_distance_steps);
                    String strQ6 = y.Q(mVar2, R.string.lbl_total_distance_steps);
                    String str5 = this.f63084d;
                    String str6 = this.f63085e;
                    x0Var2.a(i24, 52, eVar.h(str5, strQ6, str6), t2Var2, null, null, str5, strQ5, str6, null, mVar2);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ e(String str, String str2, d52.e eVar, String str3) {
        this.f63082b = str;
        this.f63084d = str2;
        this.f63083c = eVar;
        this.f63085e = str3;
    }
}
