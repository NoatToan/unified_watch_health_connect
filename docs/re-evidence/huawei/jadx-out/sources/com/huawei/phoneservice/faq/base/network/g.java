package com.huawei.phoneservice.faq.base.network;

import android.app.Activity;
import com.huawei.hms.framework.network.restclient.hwhttp.Submit;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes41.dex */
class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<String, List<Submit>> f21572b = new HashMap();

    public static void a(Activity activity) {
        String name = activity.getClass().getName();
        List<Submit> list = f21572b.get(name);
        if (list != null) {
            for (Submit submit : list) {
                if (!submit.isCanceled()) {
                    submit.cancel();
                }
            }
            f21572b.put(name, null);
        }
    }
}
