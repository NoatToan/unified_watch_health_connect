package com.huawei.openalliance.ad;

/* JADX INFO: loaded from: classes12.dex */
public class hx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ib f18931a = ic.a();
    private String d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f18932b = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f18933c = null;
    private boolean e = false;

    public void b(int i, String str, String str2) {
        if (a(i)) {
            String str3 = "HiAdSDK." + str;
            f18931a.a(c(i, str3, str2), i, str3);
        }
    }

    public boolean a(int i) {
        Integer num = this.f18933c;
        if (num == null) {
            return this.e && i >= this.f18932b;
        }
        return this.e && i >= num.intValue();
    }

    public void a(String str, String str2) {
        f18931a.a(c(4, str, str2), 4, str);
    }

    public void a(Integer num) {
        this.f18933c = num;
    }

    public void a(int i, String str, Throwable th) {
        if (th != null) {
            a(i);
        }
    }

    public void a(int i, String str, String str2, Throwable th) {
        if (th != null) {
            a(i);
        }
    }

    public void a(int i, String str, String str2) {
        this.f18932b = i;
        this.d = str2;
        f18931a.a(str, "HiAdSDKLog");
        this.e = true;
    }

    private id c(int i, String str, String str2) {
        id idVar = new id(this.d, i, str);
        idVar.a(str2);
        return idVar;
    }
}
