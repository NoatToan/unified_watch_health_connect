package com.xiaomi.onetrack.util;

import com.miui.tsmclient.util.Constants;
import com.xiaomi.onetrack.Configuration;
import com.xiaomi.onetrack.OneTrack;

/* JADX INFO: loaded from: classes11.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13998a = "custom_open";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f13999b = "custom_close";
    private static final String c = "exprience_open";
    private static final String d = "exprience_close";
    private static final String e = "PrivacyManager";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f14000k = 900000;
    private OneTrack.IEventHook f;
    private Configuration g;
    private boolean h;
    private boolean i;
    private long j = 0;

    public v(Configuration configuration) {
        this.g = configuration;
        this.h = aa.k(r.a(configuration));
    }

    private boolean b(String str) {
        return "onetrack_dau".equals(str) || com.xiaomi.onetrack.api.b.g.equals(str);
    }

    private boolean c(String str) {
        OneTrack.IEventHook iEventHook = this.f;
        return iEventHook != null && iEventHook.isRecommendEvent(str);
    }

    private boolean d(String str) {
        OneTrack.IEventHook iEventHook = this.f;
        return iEventHook != null && iEventHook.isCustomDauEvent(str);
    }

    public boolean a(String str) {
        boolean zB;
        boolean zIsUseCustomPrivacyPolicy = this.g.isUseCustomPrivacyPolicy();
        String str2 = Constants.EXTRA_CLOSE_TAI;
        if (zIsUseCustomPrivacyPolicy) {
            StringBuilder sb = new StringBuilder();
            sb.append("use custom privacy policy, the policy is ");
            if (this.h) {
                str2 = "open";
            }
            sb.append(str2);
            p.a(e, sb.toString());
            zB = this.h;
        } else {
            zB = b();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("use system experience plan, the policy is ");
            if (zB) {
                str2 = "open";
            }
            sb2.append(str2);
            p.a(e, sb2.toString());
        }
        if (zB) {
            return zB;
        }
        boolean zB2 = b(str);
        boolean zC = c(str);
        boolean zD = d(str);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("This event ");
        sb3.append(str);
        sb3.append(zB2 ? " is " : " is not ");
        sb3.append("basic event and ");
        sb3.append(zC ? "is" : "is not");
        sb3.append(" recommend event and ");
        sb3.append(zD ? "is" : "is not");
        sb3.append(" custom dau event");
        p.a(e, sb3.toString());
        return zB2 || zC || zD;
    }

    private boolean b() {
        if (Math.abs(System.currentTimeMillis() - this.j) > 900000) {
            this.j = System.currentTimeMillis();
            this.i = q.a(com.xiaomi.onetrack.f.a.b());
        }
        return this.i;
    }

    public void a(OneTrack.IEventHook iEventHook) {
        this.f = iEventHook;
    }

    public void a(boolean z) {
        this.h = z;
    }

    public String a() {
        if (this.g.isUseCustomPrivacyPolicy()) {
            if (this.h) {
                return f13998a;
            }
            return f13999b;
        }
        if (b()) {
            return c;
        }
        return d;
    }
}
