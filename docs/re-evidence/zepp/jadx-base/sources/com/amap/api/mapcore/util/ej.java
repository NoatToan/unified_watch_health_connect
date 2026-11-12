package com.amap.api.mapcore.util;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.material.timepicker.TimeModel;
import java.util.Locale;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class ej {
    private static String a = "0123456789";

    public static class a {
        private String a;
        private int b;
        private int c;

        public a(String str, int i) {
            this.b = 1103515245;
            this.c = 12345;
            this.a = a(str, i, str.length());
        }

        private int a(int i) {
            return (int) (((((long) i) * ((long) this.b)) + ((long) this.c)) & ParserMinimalBase.MAX_INT_L);
        }

        private String a(String str, int i, int i2) {
            StringBuffer stringBuffer = new StringBuffer(str);
            int length = str.length();
            for (int i3 = 0; i3 < i2; i3++) {
                int iA = a(i);
                int i4 = iA % length;
                i = a(iA);
                int i5 = i % length;
                char cCharAt = stringBuffer.charAt(i4);
                stringBuffer.setCharAt(i4, stringBuffer.charAt(i5));
                stringBuffer.setCharAt(i5, cCharAt);
            }
            return stringBuffer.toString();
        }

        public a() {
            this((byte) 0);
        }

        private a(byte b) {
            this("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 11);
        }

        public final String a(int i, String str) {
            StringBuilder sb = new StringBuilder();
            int length = this.a.length();
            int length2 = str.length();
            for (int i2 = 0; i2 < length2; i2++) {
                char cCharAt = str.charAt(i2);
                this.a.length();
                int iIndexOf = this.a.indexOf(cCharAt);
                if (iIndexOf < 0) {
                    break;
                }
                this.a.length();
                sb.append(this.a.charAt(((iIndexOf + i) + i2) % length));
            }
            if (sb.length() == length2) {
                return sb.toString();
            }
            return null;
        }
    }

    public static String a() {
        Random random = new Random();
        int iNextInt = random.nextInt(10);
        Locale locale = Locale.US;
        String str = String.format(locale, "%05d", Integer.valueOf(iNextInt));
        int iNextInt2 = random.nextInt(10);
        int iNextInt3 = random.nextInt(100);
        return new a(a, iNextInt3).a(iNextInt2, str) + String.format(locale, "%01d", Integer.valueOf(iNextInt2)) + String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(iNextInt3));
    }
}
