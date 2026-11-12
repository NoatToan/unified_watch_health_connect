package com.xiaomi.fitness.sport.view.widget;

import android.text.InputFilter;
import android.text.Spanned;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import com.xiaomi.fitness.statistics.StatConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sport/view/widget/NumberDecimalInputFilter;", "Landroid/text/InputFilter;", "<init>", "()V", "filter", "", "source", StatConstants.PARAM_START, "", StatConstants.PARAM_END, "dest", "Landroid/text/Spanned;", "dstart", "dend", "isValidNumber", "", RealNameWebViewActivity.NUMBER, "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NumberDecimalInputFilter implements InputFilter {
    private final boolean isValidNumber(String number) {
        try {
            Double.parseDouble(number);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    @Override // android.text.InputFilter
    @Nullable
    public CharSequence filter(@Nullable CharSequence source, int start, int end, @Nullable Spanned dest, int dstart, int dend) {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) dest);
        sb.append((Object) source);
        String string = sb.toString();
        int length = string.length();
        String str = "";
        for (int i = 0; i < length; i++) {
            char cCharAt = string.charAt(i);
            if ((Character.isDigit(cCharAt) || cCharAt == '.') && (cCharAt != '.' || (i != 0 && i != string.length() - 1))) {
                str = str + cCharAt;
            }
        }
        if (str.length() > 6) {
            return "";
        }
        if (isValidNumber(str)) {
            return str;
        }
        if (dest != null) {
            return dest.subSequence(dstart, dend);
        }
        return null;
    }
}
