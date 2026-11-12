package com.huawei.hms.framework.network.grs;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, c> f13283a = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f13284b = new Object();

    public static c a(GrsBaseInfo grsBaseInfo, Context context) {
        c cVar;
        String str;
        synchronized (f13284b) {
            int iUniqueCode = grsBaseInfo.uniqueCode();
            Map<String, c> map = f13283a;
            cVar = map.get(context.getPackageName() + iUniqueCode);
            if (cVar == null) {
                Logger.i("GrsClientManager", "grsClientImpl == null, and new GrsClientImpl");
                cVar = new c(context, grsBaseInfo);
                str = context.getPackageName() + iUniqueCode;
            } else if (cVar.a((Object) new c(grsBaseInfo))) {
                Logger.i("GrsClientManager", "grsClientImpl already exists");
            } else {
                Logger.i("GrsClientManager", "The app_name, ser_country, reg_country and issue_country is equal, but other not.");
                cVar = new c(context, grsBaseInfo);
                str = context.getPackageName() + iUniqueCode;
            }
            map.put(str, cVar);
        }
        return cVar;
    }
}
