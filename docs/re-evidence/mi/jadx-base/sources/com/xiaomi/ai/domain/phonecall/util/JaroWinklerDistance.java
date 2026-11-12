package com.xiaomi.ai.domain.phonecall.util;

import com.xiaomi.ai.nlp.contact.common.a;
import java.io.PrintStream;

/* JADX INFO: loaded from: classes7.dex */
public class JaroWinklerDistance {
    private float p = 0.15f;
    private final float MAX_P = 0.25f;
    private final int MAX_L = 10;
    private float scale = 0.5f;

    public static void main(String[] strArr) {
        String[] strArr2 = {"吴桂兵", "魏海珍", "刘志兵一兆韦德", "吉德范志成", "韦力元"};
        JaroWinklerDistance jaroWinklerDistance = new JaroWinklerDistance();
        for (int i = 0; i < 5; i++) {
            String str = strArr2[i];
            PrintStream printStream = System.out;
            printStream.println("字符串A(\"韦德刘志兵\")和字符串B(\"" + str + "\")：");
            StringBuilder sb = new StringBuilder();
            sb.append("Jaro-Winkler similarity:");
            sb.append(jaroWinklerDistance.getJaroWinklerDistance("韦德刘志兵", str));
            printStream.println(sb.toString());
        }
    }

    private int[] matches(CharSequence charSequence, CharSequence charSequence2) {
        CharSequence charSequence3;
        CharSequence charSequence4;
        if (charSequence.length() > charSequence2.length()) {
            charSequence4 = charSequence;
            charSequence3 = charSequence2;
        } else {
            charSequence3 = charSequence;
            charSequence4 = charSequence2;
        }
        int iMax = Math.max((charSequence4.length() / 2) - 1, 0);
        boolean[] zArr = new boolean[charSequence3.length()];
        boolean[] zArr2 = new boolean[charSequence4.length()];
        int i = 0;
        for (int i2 = 0; i2 < charSequence3.length(); i2++) {
            String strC = a.b().f(String.valueOf(charSequence3.charAt(i2)), false).get(0).c();
            for (int iMax2 = Math.max(i2 - iMax, 0); iMax2 < Math.min(i2 + iMax + 1, charSequence4.length()); iMax2++) {
                String strC2 = a.b().f(String.valueOf(charSequence4.charAt(iMax2)), false).get(0).c();
                if (!zArr2[iMax2] && strC.equals(strC2)) {
                    zArr2[iMax2] = true;
                    zArr[i2] = true;
                    i++;
                    break;
                }
            }
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < charSequence3.length(); i5++) {
            if (zArr[i5]) {
                while (!zArr2[i3]) {
                    i3++;
                }
                if (charSequence3.charAt(i5) != charSequence4.charAt(i3)) {
                    i4++;
                }
                i3++;
            }
        }
        int i6 = 0;
        for (int i7 = 0; i7 < charSequence3.length() && charSequence.charAt(i7) == charSequence2.charAt(i7); i7++) {
            i6++;
        }
        String string = new StringBuffer(charSequence).reverse().toString();
        String string2 = new StringBuffer(charSequence2).reverse().toString();
        int i8 = 0;
        for (int i9 = 0; i9 < charSequence3.length() && string.charAt(i9) == string2.charAt(i9); i9++) {
            i8++;
        }
        int[] iArr = new int[4];
        iArr[0] = i;
        iArr[1] = i4 / 2;
        if (i6 > 10) {
            i6 = 10;
        }
        iArr[2] = i6;
        if (i8 > 10) {
            i8 = 10;
        }
        iArr[3] = i8;
        return iArr;
    }

    private void setP(float f) {
        this.p = f;
    }

    public float getJaroDistance(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return 0.0f;
        }
        int[] iArrMatches = matches(charSequence, charSequence2);
        float f = iArrMatches[0];
        if (f == 0.0f) {
            return 0.0f;
        }
        return (((f / charSequence.length()) + (f / charSequence2.length())) + ((f - iArrMatches[1]) / f)) / 3.0f;
    }

    public float getJaroWinklerDistance(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return 0.0f;
        }
        int[] iArrMatches = matches(charSequence, charSequence2);
        float f = iArrMatches[0];
        if (f == 0.0f) {
            return 0.0f;
        }
        float length = (((f / charSequence.length()) + (f / charSequence2.length())) + 1.0f) / 3.0f;
        float f2 = 1.0f - length;
        float fMax = (this.scale * length) + (this.p * Math.max(iArrMatches[2], iArrMatches[3]) * f2);
        System.out.println(length + " " + (this.scale * length) + " " + (this.p * Math.max(iArrMatches[2], iArrMatches[3]) * f2));
        return fMax;
    }
}
