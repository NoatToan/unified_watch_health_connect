package com.huawei.health.h5pro.load.expression;

import android.text.TextUtils;
import com.huawei.health.h5pro.core.a;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class RouteFunctions {
    @ExpressionFunction(alias = "getKeyByRoute")
    public String getKeyByRoute(H5ProInstance h5ProInstance, String str) {
        LogUtil.i("H5PRO_RouteFunctions", a.a("getKeyByRoute: paramName -> ", str));
        String strE = h5ProInstance != null ? e(h5ProInstance.getPath(), str) : "";
        LogUtil.i("H5PRO_RouteFunctions", a.a("getKeyByRoute: paramValue -> ", strE));
        return strE;
    }

    @ExpressionFunction(alias = "getUrlByRoute")
    public String getUrlByRoute(H5ProInstance h5ProInstance, String str) {
        LogUtil.i("H5PRO_RouteFunctions", a.a("getUrlByRoute: cloudPath -> ", str));
        Matcher matcher = Pattern.compile("\\{\\{(.*?)\\}\\}").matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group();
            str = str.replace(strGroup, e(h5ProInstance.getPath(), strGroup.replace("{{", "").replace("}}", "")));
        }
        LogUtil.i("H5PRO_RouteFunctions", a.a("getUrlByRoute: cloudPath(end) -> ", str));
        return str;
    }

    private String e(String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || !str.contains("?")) {
            LogUtil.w("H5PRO_RouteFunctions", "getParamValue: return,empty");
            return "";
        }
        for (String str3 : str.substring(str.indexOf("?")).replace("?", "").split("&")) {
            String[] strArrSplit = str3.split("=");
            if (strArrSplit.length == 2 && strArrSplit[0].equals(str2)) {
                return strArrSplit[1];
            }
        }
        return "";
    }
}
