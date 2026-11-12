package com.github.mikephil.charting.formatter;

import com.nimbusds.jose.jwk.JWKParameterNames;
import fb1.c;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes13.dex */
public class LargeValueFormatter extends ValueFormatter {
    private DecimalFormat mFormat;
    private int mMaxLength;
    private String[] mSuffix;
    private String mText;

    public LargeValueFormatter() {
        this.mSuffix = new String[]{"", JWKParameterNames.OCT_KEY_VALUE, "m", "b", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT};
        this.mMaxLength = 5;
        this.mText = "";
        this.mFormat = new DecimalFormat("###E00");
    }

    private String makePretty(double d14) {
        String str = this.mFormat.format(d14);
        int numericValue = Character.getNumericValue(str.charAt(str.length() - 1));
        String strReplaceAll = str.replaceAll("E[0-9][0-9]", this.mSuffix[Integer.valueOf(Character.getNumericValue(str.charAt(str.length() - 2)) + "" + numericValue).intValue() / 3]);
        while (true) {
            if (strReplaceAll.length() <= this.mMaxLength && !strReplaceAll.matches("[0-9]+\\.[a-z]")) {
                return strReplaceAll;
            }
            strReplaceAll = c.m(2, 0, strReplaceAll).concat(strReplaceAll.substring(strReplaceAll.length() - 1));
        }
    }

    public int getDecimalDigits() {
        return 0;
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public String getFormattedValue(float f14) {
        return makePretty(f14) + this.mText;
    }

    public void setAppendix(String str) {
        this.mText = str;
    }

    public void setMaxLength(int i14) {
        this.mMaxLength = i14;
    }

    public void setSuffix(String[] strArr) {
        this.mSuffix = strArr;
    }

    public LargeValueFormatter(String str) {
        this();
        this.mText = str;
    }
}
