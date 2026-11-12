package com.sina.weibo.sdk.auth;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class b {
    private Map<String, WbAuthListener> e;

    public static class a {
        private static final b f = new b(0);
    }

    public /* synthetic */ b(byte b) {
        this();
    }

    public static synchronized b d() {
        return a.f;
    }

    public final synchronized void a(String str, WbAuthListener wbAuthListener) {
        if (!TextUtils.isEmpty(str) && wbAuthListener != null) {
            this.e.put(str, wbAuthListener);
        }
    }

    public final synchronized WbAuthListener b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.e.get(str);
    }

    public final synchronized void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.e.remove(str);
    }

    private b() {
        this.e = new HashMap();
    }
}
