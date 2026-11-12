package org.apache.commons.fileupload;

import com.alipay.sdk.m.n.a;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.fileupload.util.mime.MimeUtility;

/* JADX INFO: loaded from: classes23.dex */
public class ParameterParser {
    private char[] a = null;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int e = 0;
    private boolean f = false;

    private String a(boolean z) {
        while (true) {
            int i = this.d;
            if (i >= this.e || !Character.isWhitespace(this.a[i])) {
                break;
            }
            this.d++;
        }
        while (true) {
            int i2 = this.e;
            if (i2 <= this.d || !Character.isWhitespace(this.a[i2 - 1])) {
                break;
            }
            this.e--;
        }
        if (z) {
            int i3 = this.e;
            int i4 = this.d;
            if (i3 - i4 >= 2) {
                char[] cArr = this.a;
                if (cArr[i4] == '\"' && cArr[i3 - 1] == '\"') {
                    this.d = i4 + 1;
                    this.e = i3 - 1;
                }
            }
        }
        int i5 = this.e;
        int i6 = this.d;
        if (i5 > i6) {
            return new String(this.a, i6, i5 - i6);
        }
        return null;
    }

    private boolean b() {
        return this.b < this.c;
    }

    private boolean c(char c, char[] cArr) {
        for (char c2 : cArr) {
            if (c == c2) {
                return true;
            }
        }
        return false;
    }

    private String d(char[] cArr) {
        int i = this.b;
        this.d = i;
        this.e = i;
        boolean z = false;
        boolean z2 = false;
        while (b()) {
            char c = this.a[this.b];
            if (!z && c(c, cArr)) {
                break;
            }
            if (!z2 && c == '\"') {
                z = !z;
            }
            z2 = !z2 && c == '\\';
            this.e++;
            this.b++;
        }
        return a(true);
    }

    private String e(char[] cArr) {
        int i = this.b;
        this.d = i;
        this.e = i;
        while (b() && !c(this.a[this.b], cArr)) {
            this.e++;
            this.b++;
        }
        return a(false);
    }

    public boolean isLowerCaseNames() {
        return this.f;
    }

    public Map<String, String> parse(String str, char[] cArr) {
        if (cArr == null || cArr.length == 0) {
            return new HashMap();
        }
        char c = cArr[0];
        if (str != null) {
            int length = str.length();
            for (char c2 : cArr) {
                int iIndexOf = str.indexOf(c2);
                if (iIndexOf != -1 && iIndexOf < length) {
                    c = c2;
                    length = iIndexOf;
                }
            }
        }
        return parse(str, c);
    }

    public void setLowerCaseNames(boolean z) {
        this.f = z;
    }

    public Map<String, String> parse(String str, char c) {
        if (str == null) {
            return new HashMap();
        }
        return parse(str.toCharArray(), c);
    }

    public Map<String, String> parse(char[] cArr, char c) {
        if (cArr == null) {
            return new HashMap();
        }
        return parse(cArr, 0, cArr.length, c);
    }

    public Map<String, String> parse(char[] cArr, int i, int i2, char c) {
        if (cArr == null) {
            return new HashMap();
        }
        HashMap map = new HashMap();
        this.a = cArr;
        this.b = i;
        this.c = i2;
        while (b()) {
            String strE = e(new char[]{a.h, c});
            String strD = null;
            if (b()) {
                int i3 = this.b;
                if (cArr[i3] == '=') {
                    this.b = i3 + 1;
                    strD = d(new char[]{c});
                    if (strD != null) {
                        try {
                            strD = MimeUtility.decodeText(strD);
                        } catch (UnsupportedEncodingException unused) {
                        }
                    }
                }
            }
            if (b()) {
                int i4 = this.b;
                if (cArr[i4] == c) {
                    this.b = i4 + 1;
                }
            }
            if (strE != null && strE.length() > 0) {
                if (this.f) {
                    strE = strE.toLowerCase(Locale.ENGLISH);
                }
                map.put(strE, strD);
            }
        }
        return map;
    }
}
