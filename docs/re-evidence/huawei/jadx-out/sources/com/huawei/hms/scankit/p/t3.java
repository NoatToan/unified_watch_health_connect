package com.huawei.hms.scankit.p;

import com.huawei.hms.ml.scan.HmsScan;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes34.dex */
public final class t3 extends t6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f16335b = Pattern.compile("(?:http:|http//|https://)([\\s\\S]+)", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f16336c = Pattern.compile("(?:http:/?(?!/)|http//)([\\s\\S]+)", 2);

    @Override // com.huawei.hms.scankit.p.t6
    public HmsScan b(s6 s6Var) {
        String strA = t6.a(s6Var);
        if (!f16335b.matcher(strA).matches()) {
            return null;
        }
        Matcher matcher = f16336c.matcher(strA);
        if (matcher.matches()) {
            strA = strA.substring(0, 4) + "://" + matcher.group(1);
        }
        String strA2 = t6.a(strA);
        if (strA2.length() == 7) {
            return null;
        }
        return new HmsScan(s6Var.k(), t6.a(s6Var.c()), strA2, HmsScan.URL_FORM, s6Var.i(), t6.a(s6Var.j()), null, new z6(new HmsScan.LinkUrl("", strA2)));
    }
}
