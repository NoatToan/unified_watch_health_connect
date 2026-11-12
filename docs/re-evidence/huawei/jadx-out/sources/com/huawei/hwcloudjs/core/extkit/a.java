package com.huawei.hwcloudjs.core.extkit;

import com.huawei.hwcloudjs.f.d;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes37.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f17059a = "AuthResponseBean";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<String, Class<? extends IExtKit>> f17060b = new HashMap();

    public static void b(String str, Class<? extends IExtKit> cls) {
        f17060b.put(str, cls);
    }

    public static <U, R extends Class> U a(String str, R r) {
        String str2;
        try {
            U u = (U) f17060b.get(str).newInstance();
            if (r.isInstance(u)) {
                return u;
            }
            return null;
        } catch (IllegalAccessException unused) {
            str2 = "IllegalAccessException";
            d.b(f17059a, str2, true);
            return null;
        } catch (InstantiationException unused2) {
            str2 = "InstantiationException";
            d.b(f17059a, str2, true);
            return null;
        }
    }
}
