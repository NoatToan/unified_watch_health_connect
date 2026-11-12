package r22;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import lo.n3;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes10.dex */
public class h2 extends a2 {
    public static final /* synthetic */ int U0 = 0;
    public n3 S0;
    public ps.z1 T0;

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        double d14 = arguments.getDouble("extra_volume");
        ps.z1 z1Var = (ps.z1) arguments.getParcelable("extra_unit");
        this.T0 = z1Var;
        if (z1Var == null) {
            this.T0 = new ps.z1(null, null, (am.j.z(f12.l.f68084a) ? qs.y.UNIT_VOLUME_LITER : qs.y.UNIT_VOLUME_CUBIC_FOOT).f147239a);
        }
        C6(0, 99, true);
        int i14 = (int) d14;
        A6(i14);
        this.f149568n = true;
        H6(0, 99, false);
        E6((int) Math.round((d14 - ((double) i14)) * 100.0d));
        this.f149569o = true;
        J6(0, 1, false);
        String[] strArr = {getString(R.string.common_abbrev_liter_string), getString(R.string.common_abbrev_cubic_feet_string)};
        this.f149569o = true;
        this.B = true;
        this.f149566l = strArr;
        I6(!qs.y.UNIT_VOLUME_LITER.equals(this.T0.h()) ? 1 : 0);
        this.T = new a(this, 6);
    }

    @Override // r22.a2
    public final String v6(String str, int i14, int i15, String str2, String str3, int i16) {
        return j20.x.d(str, ".", str2, StringUtils.SPACE, str3);
    }
}
