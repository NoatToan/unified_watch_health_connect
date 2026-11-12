package com.xiaomi.hm.health.bodyfat.utils;

import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.widget.TextView;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class HMCustomString {
    public static void dataFormatDisplay(int i, String str, TextView textView) {
        int iIndexOf = str.indexOf(String.format(Locale.getDefault(), "%1$d", Integer.valueOf(i)));
        SpannableString spannableString = new SpannableString(str);
        int length = spannableString.length();
        if (iIndexOf > 0 && iIndexOf < length) {
            int i2 = i > 9 ? iIndexOf + 2 : iIndexOf + 1;
            if (i2 <= length) {
                length = i2;
            }
            spannableString.setSpan(new RelativeSizeSpan(1.71f), iIndexOf, length, 33);
        }
        textView.setText(spannableString);
    }
}
