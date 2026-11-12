package com.huawei.watchface;

import com.huawei.watchface.flavor.FlavorConfig;
import java.util.HashMap;

/* JADX INFO: loaded from: classes20.dex */
public abstract class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f30635a;

    static {
        HashMap map = new HashMap();
        f30635a = map;
        map.put("watchFace", FlavorConfig.SERVICE_WATCH_FACE);
        map.put("watchFaceH5", FlavorConfig.SERVICE_WATCH_FACE);
        map.put("hianalyticsV3", FlavorConfig.SERVICE_WATCH_FACE);
        map.put("campaign", FlavorConfig.SERVICE_WATCH_FACE);
        map.put("privacyV2", FlavorConfig.SERVICE_WATCH_FACE);
    }

    public static String a(String str) {
        return (String) f30635a.get(str);
    }
}
