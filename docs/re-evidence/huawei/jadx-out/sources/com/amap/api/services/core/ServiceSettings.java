package com.amap.api.services.core;

import android.content.Context;
import com.amap.api.col.p0003sl.ft;
import com.amap.api.col.p0003sl.fu;
import com.amap.api.col.p0003sl.he;
import com.amap.api.col.p0003sl.in;
import com.amap.api.col.p0003sl.ir;
import com.amap.api.col.p0003sl.iu;

/* JADX INFO: loaded from: classes4.dex */
public class ServiceSettings {
    public static final String CHINESE = "zh-CN";
    public static final String ENGLISH = "en";
    public static final int HTTP = 1;
    public static final int HTTPS = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ServiceSettings f3547c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3548a = "zh-CN";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3549b = 1;
    private int d = 20000;
    private int e = 20000;

    public int getConnectionTimeOut() {
        return this.d;
    }

    public int getSoTimeOut() {
        return this.e;
    }

    public void setConnectionTimeOut(int i) {
        if (i < 5000) {
            this.d = 5000;
        } else if (i > 30000) {
            this.d = 30000;
        } else {
            this.d = i;
        }
    }

    public void setSoTimeOut(int i) {
        if (i < 5000) {
            this.e = 5000;
        } else if (i > 30000) {
            this.e = 30000;
        } else {
            this.e = i;
        }
    }

    private ServiceSettings() {
    }

    public static ServiceSettings getInstance() {
        if (f3547c == null) {
            f3547c = new ServiceSettings();
        }
        return f3547c;
    }

    public void setLanguage(String str) {
        this.f3548a = str;
    }

    public void setProtocol(int i) {
        this.f3549b = i;
        ir.a().a(this.f3549b == 2);
    }

    public String getLanguage() {
        return this.f3548a;
    }

    public int getProtocol() {
        return this.f3549b;
    }

    public void setApiKey(String str) {
        in.a(str);
    }

    public void destroyInnerAsynThreadPool() {
        try {
            he.b();
        } catch (Throwable th) {
            fu.a(th, "ServiceSettings", "destroyInnerAsynThreadPool");
        }
    }

    public static void updatePrivacyShow(Context context, boolean z, boolean z2) {
        synchronized (ServiceSettings.class) {
            iu.a(context, z, z2, ft.a(false));
        }
    }

    public static void updatePrivacyAgree(Context context, boolean z) {
        synchronized (ServiceSettings.class) {
            iu.a(context, z, ft.a(false));
        }
    }
}
