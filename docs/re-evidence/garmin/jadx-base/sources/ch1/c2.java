package ch1;

import com.garmin.android.apps.connectmobile.R;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes10.dex */
public class c2 extends xg1.r<Double> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d2 f27310a;

    public c2(d2 d2Var) {
        this.f27310a = d2Var;
    }

    @Override // xg1.r
    public final String a(Double d14) {
        Double d15 = d14;
        d2 d2Var = this.f27310a;
        if (d15 == null) {
            int i14 = d2.f27318g;
            return d2Var.b(R.string.no_value);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(Integer.toString(d15.intValue()));
        sb3.append(StringUtils.SPACE);
        int i15 = d2.f27318g;
        sb3.append(d2Var.b(R.string.lbl_goal));
        return sb3.toString();
    }
}
