package com.huawei.hms.hatool;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f13422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f13423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f13424c;
    private String d;
    private String e;
    private List<b1> f;

    @Override // java.lang.Runnable
    public void run() {
        v.a("hmsSdk", "send data running");
        int iB = a(a()).b();
        if (iB != 200) {
            b();
            return;
        }
        v.b("hmsSdk", "events PostRequest sendevent TYPE : %s, TAG : %s, resultCode: %d ,reqID:" + this.d, this.e, this.f13424c, Integer.valueOf(iB));
    }

    private void b() {
        b0.c().a(new d1(this.f, this.f13424c, this.d, this.e));
    }

    private Map<String, String> a() {
        return k.b(this.f13424c, this.e, this.d);
    }

    private n0 a(Map<String, String> map) {
        return w.a(this.f13423b, this.f13422a, map);
    }

    public f(byte[] bArr, String str, String str2, String str3, String str4, List<b1> list) {
        this.f13422a = (byte[]) bArr.clone();
        this.f13423b = str;
        this.f13424c = str2;
        this.e = str3;
        this.d = str4;
        this.f = list;
    }
}
