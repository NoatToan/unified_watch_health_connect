package com.loc;

import android.text.TextUtils;
import java.net.Proxy;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public abstract class au {
    public int c = 20000;
    public int d = 20000;
    public Proxy e = null;

    private String a(String str) {
        Map<String, String> mapB_;
        byte[] bArrE = e();
        if (bArrE == null || bArrE.length == 0 || (mapB_ = b_()) == null) {
            return str;
        }
        String strA = as.a(mapB_);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append("?");
        stringBuffer.append(strA);
        return stringBuffer.toString();
    }

    public final void a(int i) {
        this.c = i;
    }

    public final void a(Proxy proxy) {
        this.e = proxy;
    }

    public abstract Map<String, String> b();

    public final void b(int i) {
        this.d = i;
    }

    public abstract Map<String, String> b_();

    public abstract String c();

    public String d() {
        return c();
    }

    public byte[] e() {
        return null;
    }

    public String h() {
        return "";
    }

    public boolean i() {
        return false;
    }

    public final String m() {
        return a(c());
    }

    public final String n() {
        return a(d());
    }

    public final boolean o() {
        return !TextUtils.isEmpty(h());
    }
}
