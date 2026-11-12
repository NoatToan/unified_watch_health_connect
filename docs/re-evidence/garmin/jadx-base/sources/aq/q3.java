package aq;

import android.icu.text.DecimalFormatSymbols;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Laq/q3;", "Landroid/text/InputFilter;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q3 implements InputFilter {
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i14, int i15, Spanned spanned, int i16, int i17) {
        StringBuilder sbReplace;
        int length;
        charSequence.getClass();
        spanned.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            return null;
        }
        if ((TextUtils.isEmpty(spanned) && charSequence.length() > 5) || (length = (sbReplace = new StringBuilder(spanned).replace(i16, i17, charSequence.subSequence(i14, i15).toString())).length()) == 0) {
            return null;
        }
        char decimalSeparator = DecimalFormatSymbols.getInstance().getDecimalSeparator();
        int i18 = -1;
        for (int i19 = 0; i19 < length; i19++) {
            if (sbReplace.charAt(i19) == decimalSeparator) {
                i18 = i19;
            }
        }
        if (i18 == 0) {
            return "";
        }
        if (i18 > 0) {
            if (length <= 5 && length - i18 <= 2) {
                return null;
            }
            return "";
        }
        if (length > 1 && d53.u.y(sbReplace.toString(), "0", false)) {
            return "";
        }
        try {
            Double.parseDouble(sbReplace.toString());
            if (length > 3) {
                return "";
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
