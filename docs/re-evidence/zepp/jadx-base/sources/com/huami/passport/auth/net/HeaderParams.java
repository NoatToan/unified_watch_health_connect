package com.huami.passport.auth.net;

import android.content.Context;
import com.huami.passport.Configs;
import com.huami.passport.utils.Utils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes12.dex */
public class HeaderParams {
    public static final String APP_PLATFORM = "appplatform";
    public static final String APP_TOKEN = "apptoken";
    public static final String CALL_ID = "callid";
    public static final String COUNTRY = "country";
    public static final String LANG = "lang";
    public static final String TIMEZONE = "timezone";
    public static final String VERSION = "v";
    private static long mLastCallId;

    public static Map<String, String> get(Context context) {
        HashMap map = new HashMap(10);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = mLastCallId;
        if (j >= jCurrentTimeMillis) {
            jCurrentTimeMillis = 1 + j;
        }
        mLastCallId = jCurrentTimeMillis;
        map.put("callid", String.valueOf(jCurrentTimeMillis));
        map.put("country", Locale.getDefault().getCountry());
        map.put("timezone", TimeZone.getDefault().getID());
        map.put("appplatform", Utils.getDeviceInfo(context).getDeviceModel());
        map.put("v", Configs.SDK_VERSION);
        map.put("lang", Locale.getDefault().toString());
        return map;
    }
}
