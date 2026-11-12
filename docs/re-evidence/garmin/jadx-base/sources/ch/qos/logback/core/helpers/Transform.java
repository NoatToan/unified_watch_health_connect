package ch.qos.logback.core.helpers;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class Transform {
    private static final String CDATA_EMBEDED_END = "]]>]]&gt;<![CDATA[";
    private static final String CDATA_END = "]]>";
    private static final int CDATA_END_LEN = 3;
    private static final String CDATA_PSEUDO_END = "]]&gt;";
    private static final String CDATA_START = "<![CDATA[";
    private static final Pattern UNSAFE_XML_CHARS = Pattern.compile("[\u0000-\b\u000b\f\u000e-\u001f<>&'\"]");

    public static void appendEscapingCDATA(StringBuilder sb3, String str) {
        if (str == null) {
            return;
        }
        int iIndexOf = str.indexOf(CDATA_END);
        if (iIndexOf < 0) {
            sb3.append(str);
            return;
        }
        int i14 = 0;
        while (iIndexOf > -1) {
            sb3.append(str.substring(i14, iIndexOf));
            sb3.append(CDATA_EMBEDED_END);
            i14 = CDATA_END_LEN + iIndexOf;
            if (i14 >= str.length()) {
                return;
            } else {
                iIndexOf = str.indexOf(CDATA_END, i14);
            }
        }
        sb3.append(str.substring(i14));
    }

    public static String escapeTags(StringBuffer stringBuffer) {
        int i14;
        String str;
        for (int i15 = 0; i15 < stringBuffer.length(); i15++) {
            char cCharAt = stringBuffer.charAt(i15);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r') {
                if (cCharAt == '\"') {
                    i14 = i15 + 1;
                    str = "&quot;";
                } else if (cCharAt == '<') {
                    i14 = i15 + 1;
                    str = "&lt;";
                } else if (cCharAt == '>') {
                    i14 = i15 + 1;
                    str = "&gt;";
                } else if (cCharAt == '&') {
                    i14 = i15 + 1;
                    str = "&amp;";
                } else if (cCharAt == '\'') {
                    i14 = i15 + 1;
                    str = "&#39;";
                } else if (cCharAt < ' ') {
                    i14 = i15 + 1;
                    str = "�";
                }
                stringBuffer.replace(i15, i14, str);
            }
        }
        return stringBuffer.toString();
    }

    public static String escapeTags(String str) {
        return (str == null || str.length() == 0 || !UNSAFE_XML_CHARS.matcher(str).find()) ? str : escapeTags(new StringBuffer(str));
    }
}
