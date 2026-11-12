package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lch1/d;", "Lxg1/r;", "", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends xg1.r<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f27315a;

    public d(h hVar) {
        this.f27315a = hVar;
    }

    @Override // xg1.r
    public final String a(Integer num) {
        String str;
        Integer num2 = num;
        h hVar = this.f27315a;
        if (num2 != null) {
            str = hVar.f27358e.get(num2.intValue());
        } else {
            str = null;
        }
        if (str == null) {
            int i14 = h.f27357f;
            return hVar.b(R.string.no_value);
        }
        String str2 = hVar.f27358e.get(num2.intValue());
        return ((Object) str2) + StringUtils.SPACE + hVar.f70343a.getString(R.string.lbl_bpm);
    }

    @Override // xg1.r
    public final String b(Context context, Integer num) {
        context.getClass();
        return oi0.c.A(context, new ca0.d2(29), super.b(context, num));
    }
}
