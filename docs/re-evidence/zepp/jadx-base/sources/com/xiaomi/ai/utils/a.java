package com.xiaomi.ai.utils;

import org.cybergarage.http.HTTP;

/* JADX INFO: loaded from: classes18.dex */
public class a {
    private static String a(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append(HTTP.TAB);
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004f  */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x004f, please report this as an issue */
    public static String a(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (i > 0 && '\n' == stringBuffer.charAt(stringBuffer.length() - 1)) {
                stringBuffer.append(a(i));
            }
            if (cCharAt == ',') {
                stringBuffer.append(cCharAt + "\n");
            } else if (cCharAt == '[') {
                stringBuffer.append(cCharAt + "\n");
                i++;
            } else {
                if (cCharAt == ']') {
                    stringBuffer.append("\n");
                    i--;
                    stringBuffer.append(a(i));
                } else if (cCharAt == '{') {
                    stringBuffer.append(cCharAt + "\n");
                    i++;
                } else if (cCharAt == '}') {
                    stringBuffer.append("\n");
                    i--;
                    stringBuffer.append(a(i));
                }
                stringBuffer.append(cCharAt);
            }
        }
        return stringBuffer.toString();
    }
}
