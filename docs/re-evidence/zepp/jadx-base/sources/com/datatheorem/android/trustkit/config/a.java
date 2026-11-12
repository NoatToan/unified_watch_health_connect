package com.datatheorem.android.trustkit.config;

import com.alipay.sdk.m.u.i;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
class a implements Serializable {
    private static final long serialVersionUID = -8832409930574867162L;
    private final Pattern[] a;

    public a(String str) {
        this(str, true);
    }

    public boolean a(String str) {
        if (str == null) {
            return false;
        }
        int i = 0;
        while (true) {
            Pattern[] patternArr = this.a;
            if (i >= patternArr.length) {
                return false;
            }
            if (patternArr[i].matcher(str).matches()) {
                return true;
            }
            i++;
        }
    }

    public String[] b(String str) {
        if (str == null) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            Pattern[] patternArr = this.a;
            if (i2 >= patternArr.length) {
                return null;
            }
            Matcher matcher = patternArr[i2].matcher(str);
            if (matcher.matches()) {
                int iGroupCount = matcher.groupCount();
                String[] strArr = new String[iGroupCount];
                while (i < iGroupCount) {
                    int i3 = i + 1;
                    strArr[i] = matcher.group(i3);
                    i = i3;
                }
                return strArr;
            }
            i2++;
        }
    }

    public String c(String str) {
        if (str == null) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            Pattern[] patternArr = this.a;
            if (i2 >= patternArr.length) {
                return null;
            }
            Matcher matcher = patternArr[i2].matcher(str);
            if (matcher.matches()) {
                int iGroupCount = matcher.groupCount();
                if (iGroupCount == 1) {
                    return matcher.group(1);
                }
                StringBuilder sb = new StringBuilder();
                while (i < iGroupCount) {
                    i++;
                    String strGroup = matcher.group(i);
                    if (strGroup != null) {
                        sb.append(strGroup);
                    }
                }
                return sb.toString();
            }
            i2++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RegexValidator{");
        for (int i = 0; i < this.a.length; i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append(this.a[i].pattern());
        }
        sb.append(i.d);
        return sb.toString();
    }

    public a(String str, boolean z) {
        this(new String[]{str}, z);
    }

    public a(String[] strArr) {
        this(strArr, true);
    }

    public a(String[] strArr, boolean z) {
        if (strArr != null && strArr.length != 0) {
            this.a = new Pattern[strArr.length];
            int i = z ? 0 : 2;
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (strArr[i2] != null && strArr[i2].length() != 0) {
                    this.a[i2] = Pattern.compile(strArr[i2], i);
                } else {
                    throw new IllegalArgumentException("Regular expression[" + i2 + "] is missing");
                }
            }
            return;
        }
        throw new IllegalArgumentException("Regular expressions are missing");
    }
}
