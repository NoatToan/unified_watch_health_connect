package com.huawei.hms.framework.network.grs.f;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hihealth.HiDataFilter;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13298a = "e";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<String> f13299b = Collections.unmodifiableSet(new a(16));

    public static String b(Context context, com.huawei.hms.framework.network.grs.e.a aVar, String str, GrsBaseInfo grsBaseInfo, boolean z) {
        if (TextUtils.isEmpty(str)) {
            Logger.w(f13298a, "routeBy must be not empty string or null.");
            return null;
        }
        if (!"no_route".equals(str) && !"unconditional".equals(str)) {
            return a(context, aVar, str, grsBaseInfo, z);
        }
        Logger.v(f13298a, "routeBy equals NO_ROUTE_POLICY");
        return "no_route_country";
    }

    class a extends HashSet<String> {
        a(int i) {
            super(i);
            add("ser_country");
            add("reg_country");
            add("issue_country");
            add("geo_ip");
        }
    }

    private static String a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, String str, GrsBaseInfo grsBaseInfo, boolean z) {
        String serCountry = grsBaseInfo.getSerCountry();
        String regCountry = grsBaseInfo.getRegCountry();
        String issueCountry = grsBaseInfo.getIssueCountry();
        for (String str2 : str.split(HiDataFilter.DataFilterExpression.BIGGER_THAN)) {
            if (f13299b.contains(str2.trim())) {
                if ("ser_country".equals(str2.trim()) && !TextUtils.isEmpty(serCountry) && !"UNKNOWN".equals(serCountry)) {
                    Logger.i(f13298a, "current route_by is serCountry and routerCountry is: " + serCountry);
                    return serCountry;
                }
                if ("reg_country".equals(str2.trim()) && !TextUtils.isEmpty(regCountry) && !"UNKNOWN".equals(regCountry)) {
                    Logger.i(f13298a, "current route_by is regCountry and routerCountry is: " + regCountry);
                    return regCountry;
                }
                if ("issue_country".equals(str2.trim()) && !TextUtils.isEmpty(issueCountry) && !"UNKNOWN".equals(issueCountry)) {
                    Logger.i(f13298a, "current route_by is issueCountry and routerCountry is: " + issueCountry);
                    return issueCountry;
                }
                if ("geo_ip".equals(str2.trim())) {
                    String strA = new com.huawei.hms.framework.network.grs.g.b(context, aVar, grsBaseInfo).a(z);
                    Logger.i(f13298a, "current route_by is geo_ip and routerCountry is: " + strA);
                    return strA;
                }
            }
        }
        return "";
    }
}
