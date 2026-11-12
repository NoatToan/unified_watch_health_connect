package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: loaded from: classes14.dex */
class MaxInputValidator implements InputFilter {
    private int max;

    public MaxInputValidator(int i14) {
        this.max = i14;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i14, int i15, Spanned spanned, int i16, int i17) {
        try {
            StringBuilder sb3 = new StringBuilder(spanned);
            sb3.replace(i16, i17, charSequence.subSequence(i14, i15).toString());
            if (Integer.parseInt(sb3.toString()) <= this.max) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }

    public int getMax() {
        return this.max;
    }

    public void setMax(int i14) {
        this.max = i14;
    }
}
