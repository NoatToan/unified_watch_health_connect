package ch.qos.logback.core.pattern.util;

import am.j;
import org.apache.commons.lang3.CharUtils;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public class RegularEscapeUtil implements IEscapeUtil {
    public static String basicEscape(String str) {
        int length = str.length();
        StringBuilder sb3 = new StringBuilder(length);
        int i14 = 0;
        while (i14 < length) {
            int i15 = i14 + 1;
            char cCharAt = str.charAt(i14);
            if (cCharAt == '\\') {
                i14 += 2;
                cCharAt = str.charAt(i15);
                if (cCharAt == 'n') {
                    cCharAt = '\n';
                } else if (cCharAt == 'r') {
                    cCharAt = CharUtils.CR;
                } else if (cCharAt == 't') {
                    cCharAt = '\t';
                } else if (cCharAt == 'f') {
                    cCharAt = '\f';
                }
            } else {
                i14 = i15;
            }
            sb3.append(cCharAt);
        }
        return sb3.toString();
    }

    @Override // ch.qos.logback.core.pattern.util.IEscapeUtil
    public void escape(String str, StringBuffer stringBuffer, char c14, int i14) {
        if (str.indexOf(c14) >= 0) {
            stringBuffer.append(c14);
            return;
        }
        if (c14 == '\\') {
            stringBuffer.append(c14);
            return;
        }
        if (c14 != '_') {
            if (c14 == 'n') {
                stringBuffer.append('\n');
                return;
            }
            if (c14 == 'r') {
                stringBuffer.append(CharUtils.CR);
                return;
            }
            if (c14 == 't') {
                stringBuffer.append('\t');
                return;
            }
            String escapeCharsForListing = formatEscapeCharsForListing(str);
            StringBuilder sb3 = new StringBuilder("Illegal char '");
            sb3.append(c14);
            sb3.append(" at column ");
            sb3.append(i14);
            sb3.append(". Only \\\\, \\_");
            h.s(j.o(escapeCharsForListing, ", \\t, \\n, \\r combinations are allowed as escape characters.", sb3));
        }
    }

    public String formatEscapeCharsForListing(String str) {
        StringBuilder sb3 = new StringBuilder();
        for (int i14 = 0; i14 < str.length(); i14++) {
            sb3.append(", \\");
            sb3.append(str.charAt(i14));
        }
        return sb3.toString();
    }
}
