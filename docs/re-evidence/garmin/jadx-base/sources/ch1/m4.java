package ch1;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lch1/m4;", "Lxg1/r;", "", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m4 extends xg1.r<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n4 f27416a;

    public m4(n4 n4Var) {
        this.f27416a = n4Var;
    }

    @Override // xg1.r
    public final String a(Integer num) {
        Integer num2 = num;
        if (num2 == null) {
            int i14 = n4.f27422e;
            return this.f27416a.b(R.string.no_value);
        }
        return num2 + "%";
    }
}
