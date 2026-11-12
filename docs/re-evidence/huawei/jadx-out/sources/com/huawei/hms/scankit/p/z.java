package com.huawei.hms.scankit.p;

import android.text.TextUtils;
import com.huawei.hms.ml.scan.HmsScan;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes34.dex */
public final class z extends t6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f16441b = Pattern.compile("(?:MEBKM:)([\\s\\S]+)", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f16442c = Pattern.compile("(?:http:/?(?!/)|http//)([\\s\\S]+)", 2);

    @Override // com.huawei.hms.scankit.p.t6
    public HmsScan b(s6 s6Var) {
        String strA = t6.a(s6Var);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        Matcher matcher = f16441b.matcher(strA);
        if (!matcher.matches()) {
            return null;
        }
        String[] strArrSplit = matcher.group(1).split("(?<=(?<!\\\\)(?:\\\\\\\\){0,100});");
        String strA2 = a(strArrSplit, "TITLE:");
        String strA3 = t6.a(a(strArrSplit, "URL:"));
        if (strA3.length() == 0) {
            return null;
        }
        Matcher matcher2 = f16442c.matcher(strA3);
        if (matcher2.matches()) {
            strA3 = strA3.substring(0, 4) + "://" + matcher2.group(1);
        }
        String str = strA3;
        return new HmsScan(s6Var.k(), t6.a(s6Var.c()), str, HmsScan.URL_FORM, s6Var.i(), t6.a(s6Var.j()), null, new z6(new HmsScan.LinkUrl(strA2, str)));
    }

    private static String a(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.startsWith(str)) {
                return t6.b(str2.substring(str.length()));
            }
        }
        return "";
    }
}
