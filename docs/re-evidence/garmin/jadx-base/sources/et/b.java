package et;

import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h82.r;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f65234b;

    public /* synthetic */ b(c cVar, int i14) {
        this.f65233a = i14;
        this.f65234b = cVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f65233a;
        c cVar = this.f65234b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                c.a aVar = c.f65235g;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    cVar.g(mVar, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                r rVar = (r) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                c.a aVar2 = c.f65235g;
                rVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    int i15 = (iIntValue2 << 6) & 896;
                    rVar.E(y.Q(mVar2, R.string.lbl_activity_recording), mVar2, i15);
                    String str = cVar.f65236f;
                    if (str == null) {
                        s.m("deviceName");
                        throw null;
                    }
                    rVar.m(i15, 2, y.P(R.string.help_activity_recording_first_key_feature, new Object[]{str, str, str}, mVar2), null, mVar2);
                    rVar.m(i15, 2, y.Q(mVar2, R.string.help_activity_recording_second_key_feature), null, mVar2);
                    String str2 = cVar.f65236f;
                    if (str2 == null) {
                        s.m("deviceName");
                        throw null;
                    }
                    rVar.m(i15, 2, y.P(R.string.help_activity_recording_third_key_feature, new Object[]{str2, str2}, mVar2), null, mVar2);
                    rVar.s(i15, 2, y.Q(mVar2, R.string.lbl_how_it_works_capitalized), null, mVar2);
                    String str3 = cVar.f65236f;
                    if (str3 == null) {
                        s.m("deviceName");
                        throw null;
                    }
                    int i16 = (iIntValue2 << 3) & 112;
                    rVar.q(y.P(R.string.help_activity_recording_first_paragraph, new Object[]{str3}, mVar2), mVar2, i16);
                    String str4 = cVar.f65236f;
                    if (str4 == null) {
                        s.m("deviceName");
                        throw null;
                    }
                    rVar.q(y.P(R.string.help_activity_recording_second_paragraph, new Object[]{str4, str4}, mVar2), mVar2, i16);
                    String str5 = cVar.f65236f;
                    if (str5 == null) {
                        s.m("deviceName");
                        throw null;
                    }
                    rVar.q(y.P(R.string.help_activity_recording_third_paragraph, new Object[]{str5, str5}, mVar2), mVar2, i16);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
