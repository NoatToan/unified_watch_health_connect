package u20;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes8.dex */
public class f implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f167884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f167885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f167886c;

    public f(double d14, double d15, String str) {
        this.f167884a = d14;
        this.f167885b = d15;
        this.f167886c = str;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i14, int i15, Spanned spanned, int i16, int i17) {
        StringBuilder sb3 = new StringBuilder(spanned);
        sb3.replace(i16, i17, charSequence.subSequence(i14, i15).toString());
        try {
            String string = sb3.toString();
            if (!TextUtils.isEmpty(null)) {
                string = string.replace((CharSequence) null, "");
            }
            double d14 = this.f167884a;
            double d15 = this.f167885b;
            double d16 = Double.parseDouble(string);
            boolean z14 = false;
            if (d15 > d14) {
                if (d16 >= d14 && d16 <= d15) {
                    z14 = true;
                }
            } else if (d16 >= d15 && d16 <= d14) {
                z14 = true;
            }
            if (z14 && string.matches(this.f167886c)) {
                return null;
            }
            return charSequence.length() == 0 ? spanned.subSequence(i16, i17) : "";
        } catch (NumberFormatException e4) {
            i2.a(a2.COURSES, "InputFilterDoubleMinMax", "Invalid number format: " + e4.getMessage());
            return "";
        }
    }
}
