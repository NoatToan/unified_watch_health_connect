package com.huawei.hms.scankit.p;

import android.text.TextUtils;
import com.huawei.hms.ml.scan.HmsScan;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes34.dex */
public final class t2 extends t6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f16333b = Pattern.compile("(?:MATMSG:TO:|mailto:|SMTP:)([\\s\\S]+)", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f16334c = Pattern.compile("mailto:([\\s\\S]+)\\?subject=([\\s\\S]+)&body=([\\s\\S]+)", 2);
    private static final Pattern d = Pattern.compile("MATMSG:TO:([\\s\\S]+);SUB:([\\s\\S]+);BODY:([\\s\\S]+)", 2);
    private static final Pattern e = Pattern.compile("SMTP:([\\s\\S]+):([\\s\\S]+):([\\s\\S]+)", 2);

    @Override // com.huawei.hms.scankit.p.t6
    public HmsScan b(s6 s6Var) {
        String strGroup;
        String str;
        String strGroup2;
        String strGroup3;
        String strA = t6.a(s6Var);
        if (TextUtils.isEmpty(strA) || !f16333b.matcher(strA).matches()) {
            return null;
        }
        try {
            Matcher matcher = f16334c.matcher(strA);
            Matcher matcher2 = d.matcher(strA);
            Matcher matcher3 = e.matcher(strA);
            if (matcher.matches()) {
                strGroup3 = matcher.group(1);
                strGroup = matcher.group(2);
                strGroup2 = matcher.group(3);
            } else {
                if (matcher2.matches()) {
                    strGroup3 = matcher2.group(1);
                    String strGroup4 = matcher2.group(2);
                    String strGroup5 = matcher2.group(3);
                    strGroup = strGroup4;
                    strGroup2 = strGroup5;
                } else {
                    if (matcher3.matches()) {
                        String strGroup6 = matcher3.group(1);
                        strGroup = matcher3.group(2);
                        str = strGroup6;
                        strGroup2 = matcher3.group(3);
                    }
                    return null;
                }
                return new HmsScan(s6Var.k(), t6.a(s6Var.c()), str, HmsScan.EMAIL_CONTENT_FORM, s6Var.i(), t6.a(s6Var.j()), null, new z6(new HmsScan.EmailContent(str, c(strGroup), c(strGroup2), HmsScan.EmailContent.OTHER_USE_TYPE)));
            }
            str = strGroup3;
            return new HmsScan(s6Var.k(), t6.a(s6Var.c()), str, HmsScan.EMAIL_CONTENT_FORM, s6Var.i(), t6.a(s6Var.j()), null, new z6(new HmsScan.EmailContent(str, c(strGroup), c(strGroup2), HmsScan.EmailContent.OTHER_USE_TYPE)));
        } catch (RuntimeException | Exception unused) {
        }
    }

    static String c(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }
}
