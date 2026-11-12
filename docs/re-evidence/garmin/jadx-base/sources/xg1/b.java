package xg1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import ig1.l0;

/* JADX INFO: loaded from: classes10.dex */
public class b extends r<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f190875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f190876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f190877c = 30;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f190878d = 250;

    public b(Context context) {
        this.f190875a = context;
        this.f190876b = context.getString(R.string.no_value);
    }

    @Override // xg1.r
    public final String a(Integer num) {
        Integer num2 = num;
        String strValueOf = this.f190876b;
        if (num2 == null) {
            return strValueOf;
        }
        int iIntValue = num2.intValue();
        if (iIntValue >= this.f190877c && iIntValue <= this.f190878d) {
            strValueOf = String.valueOf(num2);
        }
        return this.f190875a.getString(R.string.lbl_heart_rate_zone_bpm, strValueOf);
    }

    @Override // xg1.r
    public final String b(Context context, Integer num) {
        return oi0.d.a(context, super.b(context, num), new l0(15));
    }

    @Override // xg1.r
    public final int c(Integer num) {
        int iIntValue;
        Integer num2 = num;
        return (num2 == null || (iIntValue = num2.intValue()) < this.f190877c || iIntValue > this.f190878d) ? R.color.gcm_text_danger_action : R.color.gcm_text_secondary;
    }
}
