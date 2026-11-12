package com.huawei.phoneservice.faq.base.util;

import android.text.InputFilter;
import android.text.Spanned;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes13.dex */
public class e implements InputFilter {
    private final Pattern d = Pattern.compile("[\\u0733\\u0734\\u0736\\u0737]");

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.d.matcher(charSequence).find()) {
            return "";
        }
        return null;
    }
}
