package cw1;

import c2.x2;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import i3.mh;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55995a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f55996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f55997c;

    public /* synthetic */ c0(double d14, String str) {
        this.f55996b = d14;
        this.f55997c = str;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f55995a;
        Object obj3 = this.f55997c;
        double d14 = this.f55996b;
        switch (i14) {
            case 0:
                String str = (String) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    l3.f23124b.getClass();
                    String strP = gl1.y.P(R.string.lbl_course_elevation_value_limits, new Object[]{e5.g(l3.f23131i.format(d14), StringUtils.SPACE, str)}, mVar);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strP, rVarF, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, mVar), mVar, 48, 0, 131068);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.m(d14, (e23.l) obj3, (p3.m) obj, p3.p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c0(int i14, double d14, e23.l lVar) {
        this.f55996b = d14;
        this.f55997c = lVar;
    }
}
