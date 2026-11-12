package com.tencent.connect.auth;

import com.tencent.tauth.IUiListener;
import java.util.HashMap;

/* JADX INFO: loaded from: classes20.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f30889a = null;
    static final /* synthetic */ boolean d = true;
    private static int e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap<String, a> f30890b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f30891c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public IUiListener f30892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public com.tencent.connect.auth.a f30893b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f30894c;
    }

    public static b a() {
        if (f30889a == null) {
            f30889a = new b();
        }
        return f30889a;
    }

    public static int b() {
        int i = e + 1;
        e = i;
        return i;
    }

    public String a(a aVar) {
        int iB = b();
        try {
            this.f30890b.put("" + iB, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return "" + iB;
    }

    public String c() {
        int iCeil = (int) Math.ceil((Math.random() * 20.0d) + 3.0d);
        char[] charArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        int length = charArray.length;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iCeil; i++) {
            stringBuffer.append(charArray[(int) (Math.random() * ((double) length))]);
        }
        return stringBuffer.toString();
    }
}
