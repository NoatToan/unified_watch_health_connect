package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lch1/g;", "Lxg1/r;", "", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends xg1.r<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f27348a;

    public g(e eVar) {
        this.f27348a = eVar;
    }

    @Override // xg1.r
    public final String a(Integer num) {
        Integer num2 = num;
        e eVar = this.f27348a;
        if (num2 == null || num2.intValue() < 0 || num2.intValue() >= eVar.f27327g.size()) {
            int i14 = e.f27324h;
            return eVar.b(R.string.no_value);
        }
        String str = eVar.f27327g.get(num2.intValue());
        str.getClass();
        return i3.e5.g(str, StringUtils.SPACE, eVar.f70343a.getString(R.string.lbl_bpm));
    }

    @Override // xg1.r
    public final String b(Context context, Integer num) {
        context.getClass();
        return oi0.c.A(context, new f(0), super.b(context, num));
    }
}
