package am;

import com.garmin.android.apps.connectmobile.activities.ActivityPoolLengthActivity;
import java.util.ArrayList;
import lo.l3;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements r22.e.b, ActivityPoolLengthActivity.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActivityPoolLengthActivity f4006a;

    @Override // r22.e.b
    public void a(int i14, int i15, String str, l3 l3Var) {
        ActivityPoolLengthActivity activityPoolLengthActivity = this.f4006a;
        activityPoolLengthActivity.f28772g = i14;
        int iOrdinal = l3Var.ordinal();
        int iOrdinal2 = l3.METER.ordinal();
        ArrayList arrayList = activityPoolLengthActivity.f28770e;
        activityPoolLengthActivity.f28777l = iOrdinal == iOrdinal2 ? (String) arrayList.get(1) : (String) arrayList.get(0);
        activityPoolLengthActivity.f28775j = l3Var;
        int i16 = activityPoolLengthActivity.f28772g;
        int i17 = activityPoolLengthActivity.f28773h;
        c22.l3.f23124b.getClass();
        activityPoolLengthActivity.f28768c.setButtonRightLabel(c22.l3.d(true, activityPoolLengthActivity.f28777l, ((double) ((i16 * 10) + i17)) / 10.0d));
    }
}
