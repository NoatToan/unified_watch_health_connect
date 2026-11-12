package org.apache.commons.fileupload.util.mime;

import com.twitter.sdk.android.core.internal.network.UrlUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public final class MimeUtility {
    private static final String a = "US-ASCII";
    private static final String b = "B";
    private static final String c = "Q";
    private static final String d = "=?";
    private static final String e = "?=";
    private static final String f = " \t\r\n";
    private static final Map<String, String> g;

    static {
        HashMap map = new HashMap();
        g = map;
        map.put("iso-2022-cn", "ISO2022CN");
        map.put("iso-2022-kr", "ISO2022KR");
        map.put("utf-8", UrlUtils.UTF8);
        map.put("utf8", UrlUtils.UTF8);
        map.put("ja_jp.iso2022-7", "ISO2022JP");
        map.put("ja_jp.eucjp", "EUCJIS");
        map.put("euc-kr", "KSC5601");
        map.put("euckr", "KSC5601");
        map.put("us-ascii", "ISO-8859-1");
        map.put("x-us-ascii", "ISO-8859-1");
    }

    private MimeUtility() {
    }

    private static String a(String str) throws b, UnsupportedEncodingException {
        if (!str.startsWith(d)) {
            throw new b("Invalid RFC 2047 encoded-word: " + str);
        }
        int iIndexOf = str.indexOf(63, 2);
        if (iIndexOf == -1) {
            throw new b("Missing charset in RFC 2047 encoded-word: " + str);
        }
        String lowerCase = str.substring(2, iIndexOf).toLowerCase();
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(63, i);
        if (iIndexOf2 == -1) {
            throw new b("Missing encoding in RFC 2047 encoded-word: " + str);
        }
        String strSubstring = str.substring(i, iIndexOf2);
        int i2 = iIndexOf2 + 1;
        int iIndexOf3 = str.indexOf(e, i2);
        if (iIndexOf3 == -1) {
            throw new b("Missing encoded text in RFC 2047 encoded-word: " + str);
        }
        String strSubstring2 = str.substring(i2, iIndexOf3);
        if (strSubstring2.length() == 0) {
            return "";
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(strSubstring2.length());
            byte[] bytes = strSubstring2.getBytes("US-ASCII");
            if (strSubstring.equals(b)) {
                a.a(bytes, byteArrayOutputStream);
            } else {
                if (!strSubstring.equals(c)) {
                    throw new UnsupportedEncodingException("Unknown RFC 2047 encoding: " + strSubstring);
                }
                c.a(bytes, byteArrayOutputStream);
            }
            return new String(byteArrayOutputStream.toByteArray(), b(lowerCase));
        } catch (IOException unused) {
            throw new UnsupportedEncodingException("Invalid RFC 2047 encoding");
        }
    }

    private static String b(String str) {
        if (str == null) {
            return null;
        }
        String str2 = g.get(str.toLowerCase(Locale.ENGLISH));
        return str2 == null ? str : str2;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0075  */
    public static String decodeText(String str) throws UnsupportedEncodingException {
        if (str.indexOf(d) < 0) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(str.length());
        int i = 0;
        boolean z = false;
        int i2 = -1;
        int i3 = -1;
        while (i < length) {
            if (f.indexOf(str.charAt(i)) != -1) {
                int i4 = i;
                while (true) {
                    if (i4 >= length) {
                        int i5 = i4;
                        i2 = i;
                        i = i5;
                        break;
                    }
                    if (f.indexOf(str.charAt(i4)) == -1) {
                        i3 = i4;
                        i2 = i;
                        i = i3;
                        break;
                    }
                    i4++;
                }
            } else {
                int i6 = i;
                while (i6 < length && f.indexOf(str.charAt(i6)) == -1) {
                    i6++;
                }
                String strSubstring = str.substring(i, i6);
                if (strSubstring.startsWith(d)) {
                    try {
                        String strA = a(strSubstring);
                        if (!z && i2 != -1) {
                            sb.append(str.substring(i2, i3));
                            i2 = -1;
                        }
                        sb.append(strA);
                        z = true;
                        i = i6;
                    } catch (b unused) {
                        if (i2 != -1) {
                            sb.append(str.substring(i2, i3));
                            i2 = -1;
                        }
                        sb.append(strSubstring);
                        i = i6;
                        z = false;
                    }
                }
                if (i2 != -1) {
                    sb.append(str.substring(i2, i3));
                    i2 = -1;
                }
                sb.append(strSubstring);
                i = i6;
                z = false;
            }
        }
        return sb.toString();
    }
}
