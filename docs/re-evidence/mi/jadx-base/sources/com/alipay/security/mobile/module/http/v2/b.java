package com.alipay.security.mobile.module.http.v2;

import android.content.Context;
import com.alipay.security.mobile.module.http.d;
import com.alipay.security.mobile.module.http.model.c;

/* JADX INFO: loaded from: classes.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f5944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static com.alipay.security.mobile.module.http.a f5945b;

    public static a b(Context context, String str) {
        if (context == null) {
            return null;
        }
        if (f5944a == null) {
            f5945b = d.a(context, str);
            f5944a = new b();
        }
        return f5944a;
    }

    @Override // com.alipay.security.mobile.module.http.v2.a
    public c a(com.alipay.security.mobile.module.http.model.d dVar) {
        return com.alipay.security.mobile.module.http.model.b.a(f5945b.a(com.alipay.security.mobile.module.http.model.b.b(dVar)));
    }

    @Override // com.alipay.security.mobile.module.http.v2.a
    public boolean a(String str) {
        return f5945b.a(str);
    }
}
