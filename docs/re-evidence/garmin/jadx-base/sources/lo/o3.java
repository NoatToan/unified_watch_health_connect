package lo;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public class o3 implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f113931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f113932b;

    public o3(int i14, int i15) {
        this.f113931a = i14;
        this.f113932b = i15;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i14, int i15, Spanned spanned, int i16, int i17) {
        boolean z14 = true;
        int i18 = this.f113931a;
        if (i18 <= 0 && i14 == 0 && i15 == 1) {
            try {
                if ("-".equals(charSequence.toString()) && TextUtils.isEmpty(spanned)) {
                    return charSequence;
                }
            } catch (NumberFormatException unused) {
                return "";
            }
        }
        String strConcat = spanned.toString().substring(0, i16).concat(spanned.toString().substring(i17, spanned.toString().length()));
        int i19 = Integer.parseInt(strConcat.substring(0, i16) + charSequence.toString() + strConcat.substring(i16, strConcat.length()));
        int i24 = this.f113932b;
        if (i24 <= i18 ? i19 < i24 || i19 > i18 : i19 < i18 || i19 > i24) {
            z14 = false;
        }
        if (z14) {
            return null;
        }
        return "";
    }
}
