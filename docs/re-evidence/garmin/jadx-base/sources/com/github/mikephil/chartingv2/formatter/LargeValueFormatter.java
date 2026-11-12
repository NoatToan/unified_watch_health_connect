package com.github.mikephil.chartingv2.formatter;

import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import com.nimbusds.jose.jwk.JWKParameterNames;
import fb1.c;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class LargeValueFormatter implements ValueFormatter, YAxisValueFormatter {
    private static final int MAX_LENGTH = 4;
    private static String[] SUFFIX = {"", JWKParameterNames.OCT_KEY_VALUE, "m", "b", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT};
    private DecimalFormat mFormat;
    private String mText;

    public LargeValueFormatter() {
        this.mText = "";
        this.mFormat = new DecimalFormat("###E0");
    }

    private String makePretty(double d14) {
        String str = this.mFormat.format(d14);
        String strReplaceAll = str.replaceAll("E[0-9]", SUFFIX[Character.getNumericValue(str.charAt(str.length() - 1)) / 3]);
        while (true) {
            if (strReplaceAll.length() <= 4 && !strReplaceAll.matches("[0-9]+\\.[a-z]")) {
                return strReplaceAll;
            }
            strReplaceAll = c.m(2, 0, strReplaceAll).concat(strReplaceAll.substring(strReplaceAll.length() - 1));
        }
    }

    @Override // com.github.mikephil.chartingv2.formatter.ValueFormatter
    public String getFormattedValue(float f14, Entry entry, int i14, ViewPortHandler viewPortHandler) {
        return makePretty(f14) + this.mText;
    }

    public void setAppendix(String str) {
        this.mText = str;
    }

    public void setSuffix(String[] strArr) {
        if (strArr.length == 5) {
            SUFFIX = strArr;
        }
    }

    public LargeValueFormatter(String str) {
        this();
        this.mText = str;
    }

    @Override // com.github.mikephil.chartingv2.formatter.YAxisValueFormatter
    public String getFormattedValue(float f14, YAxis yAxis) {
        return makePretty(f14) + this.mText;
    }
}
