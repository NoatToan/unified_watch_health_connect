package org.cybergarage.xml;

import com.alipay.sdk.m.s.a;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes23.dex */
public class XML {
    public static final String CHARSET_UTF8 = "utf-8";
    public static final String DEFAULT_CONTENT_LANGUAGE = "en";
    public static final String DEFAULT_CONTENT_TYPE = "text/xml; charset=\"utf-8\"";

    /* JADX WARN: Code duplicated, block: B:23:0x003c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x003e  */
    private static final String escapeXMLChars(String str, boolean z) {
        if (str == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        char[] cArr = new char[length];
        str.getChars(0, length, cArr, 0);
        String str2 = null;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char c = cArr[i2];
            if (c == '\"') {
                if (z) {
                    str2 = "&quot;";
                }
            } else if (c == '<') {
                str2 = "&lt;";
            } else if (c == '>') {
                str2 = "&gt;";
            } else if (c == '&') {
                str2 = "&amp;";
            } else if (c == '\'') {
                if (z) {
                    str2 = "&apos;";
                } else if (z) {
                    str2 = "&quot;";
                }
            }
            if (str2 != null) {
                stringBuffer.append(cArr, i, i2 - i);
                stringBuffer.append(str2);
                i = i2 + 1;
                str2 = null;
            }
        }
        if (i == 0) {
            return str;
        }
        stringBuffer.append(cArr, i, length - i);
        return stringBuffer.toString();
    }

    public static final String unescapeXMLChars(String str) {
        if (str == null) {
            return null;
        }
        return str.replace("&amp;", a.l).replace("&lt;", SearchCriteria.LT).replace("&gt;", SearchCriteria.GT).replace("&apos;", "'").replace("&quot;", "\"");
    }

    public static final String escapeXMLChars(String str) {
        return escapeXMLChars(str, true);
    }
}
