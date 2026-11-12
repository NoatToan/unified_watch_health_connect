package defpackage;

import com.huawei.hwidauth.h.b;

/* JADX INFO: loaded from: classes3.dex */
public final class noc extends b {
    private static noc u;

    private noc() {
    }

    public static noc o() {
        noc nocVar;
        synchronized (noc.class) {
            if (u == null) {
                u = new noc();
            }
            nocVar = u;
        }
        return nocVar;
    }

    private void s() {
        this.q = this.e + "/CAS/remoteLogin";
        this.f17592b = this.e + "/CAS/mobile/standard/welcome.html";
        this.f17591a = this.e + "/CAS/mobile/standard/wapLogin.html";
        this.f17593c = this.e + "/AMW/portal/userCenter/index.html";
        this.d = this.e + "/AMW/mobile/userCenter/oauth/appList.html";
        this.h = this.e + "/CAS/atRemoteLogin";
        this.i = this.e + "/CAS/weixin/codeAuthorize";
        this.k = this.e + "/CAS/mobile/qrLogin.html?";
        this.g = this.f + "/oauth2/v3/authorize?";
        this.l = this.e + "/CAS/mobile/chkUserPwd.html?";
        this.m = this.j + "/AccountServer/IUserDeviceMng/getDevAuthCode";
        this.n = this.e + "/CAS/mobile/atRemoteLogin.html?";
        this.o = this.e + "/AMW/portal/userCenter/wap_userinfo.html";
        this.p = this.e + "/AMW/mobile/userCenter/privacyCenter/index.html";
        this.r = this.e + "/RealNameW/userCenter/realNameStatus.html";
        this.s = this.e + "/AMW/mobile/children/childInfo.html";
    }

    @Override // com.huawei.hwidauth.h.b
    public void a(String str, String str2, String str3) {
        this.e = str;
        this.j = str2;
        this.f = str3;
        s();
    }

    @Override // com.huawei.hwidauth.h.b
    public String b() {
        return this.f17591a;
    }

    @Override // com.huawei.hwidauth.h.b
    public String k() {
        return this.r;
    }

    @Override // com.huawei.hwidauth.h.b
    public String l() {
        return this.s;
    }

    @Override // com.huawei.hwidauth.h.b
    public String c() {
        return this.f17593c;
    }

    @Override // com.huawei.hwidauth.h.b
    public String d() {
        return this.d;
    }

    @Override // com.huawei.hwidauth.h.b
    public String e() {
        return this.h;
    }

    @Override // com.huawei.hwidauth.h.b
    public String f() {
        return this.g;
    }

    @Override // com.huawei.hwidauth.h.b
    public String g() {
        return this.i;
    }

    public String q() {
        return this.j;
    }

    @Override // com.huawei.hwidauth.h.b
    public String h() {
        return this.k;
    }

    @Override // com.huawei.hwidauth.h.b
    public String i() {
        return this.l;
    }

    @Override // com.huawei.hwidauth.h.b
    public String j() {
        return this.n;
    }

    @Override // com.huawei.hwidauth.h.b
    public String m() {
        return this.o;
    }

    @Override // com.huawei.hwidauth.h.b
    public String n() {
        return this.p;
    }
}
