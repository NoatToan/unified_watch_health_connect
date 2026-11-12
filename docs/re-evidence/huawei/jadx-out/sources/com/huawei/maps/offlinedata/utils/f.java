package com.huawei.maps.offlinedata.utils;

import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f18024a = new a();

    class a extends HashMap {
        a() {
            put("iw", "he");
            put("in", "id");
            put("fil", "tl");
        }
    }

    public static String a(String str) {
        Map map = f18024a;
        return map.containsKey(str) ? (String) map.get(str) : str;
    }

    public static String a() {
        Locale locale = Locale.getDefault();
        String strA = a(locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getScript())) {
            strA = strA + Constants.LINK + locale.getScript();
        }
        g.c("LanguageUtil", "systemLanguage is: " + strA);
        return strA;
    }
}
