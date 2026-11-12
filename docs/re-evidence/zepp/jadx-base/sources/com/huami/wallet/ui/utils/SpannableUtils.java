package com.huami.wallet.ui.utils;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import androidx.annotation.StyleRes;

/* JADX INFO: loaded from: classes16.dex */
public class SpannableUtils {
    public static SpannableString stylizePartialString(Context context, String str, String str2, @StyleRes int i) {
        int iIndexOf = str.indexOf(str2);
        int length = str2.length() + iIndexOf;
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new TextAppearanceSpan(context, i), iIndexOf, length, 18);
        return spannableString;
    }
}
