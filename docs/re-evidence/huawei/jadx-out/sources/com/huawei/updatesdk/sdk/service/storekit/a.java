package com.huawei.updatesdk.sdk.service.storekit;

import com.huawei.updatesdk.sdk.service.storekit.bean.d;
import com.huawei.updatesdk.service.appmgr.bean.e;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Class> f29919a;

    public static d a(String str) throws InstantiationException {
        Class cls = f29919a.get(str);
        if (cls != null) {
            return (d) cls.newInstance();
        }
        throw new InstantiationException("ResponseBean class not found, method:" + str);
    }

    static {
        HashMap map = new HashMap();
        f29919a = map;
        map.put(com.huawei.updatesdk.service.appmgr.bean.d.APIMETHOD, e.class);
        map.put("client.getMarketInfo", com.huawei.updatesdk.service.appmgr.bean.b.class);
    }
}
