package com.huawei.hwcloudjs.core.a;

import android.text.TextUtils;
import com.huawei.hwcloudjs.annotation.JSMethod;
import com.huawei.hwcloudjs.core.JSRequest;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f17053a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, a> f17054b = new HashMap();

    public void b(String str) {
        if (this.f17054b.containsKey(str)) {
            this.f17054b.remove(str);
        }
    }

    public void a(Class<? extends JSRequest> cls) {
        for (Method method : cls.getMethods()) {
            if (method.isAnnotationPresent(JSMethod.class)) {
                String strName = ((JSMethod) method.getAnnotation(JSMethod.class)).name();
                if (TextUtils.isEmpty(strName)) {
                    strName = method.getName();
                }
                this.f17054b.put(strName, new a(method));
            }
        }
    }

    public a a(String str) {
        return this.f17054b.get(str);
    }

    public static b a() {
        return f17053a;
    }
}
