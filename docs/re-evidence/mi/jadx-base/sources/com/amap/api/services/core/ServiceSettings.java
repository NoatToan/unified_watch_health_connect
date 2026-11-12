package com.amap.api.services.core;

import android.content.Context;
import com.amap.api.col.p0003sl.iu;
import com.miui.tsmclient.model.ErrorCode;
import defpackage.ays;
import defpackage.f0t;
import defpackage.k0t;
import defpackage.wts;
import defpackage.xts;

/* JADX INFO: loaded from: classes4.dex */
public class ServiceSettings {
    public static final String CHINESE = "zh-CN";
    public static final String ENGLISH = "en";
    public static final int HTTP = 1;
    public static final int HTTPS = 2;
    private static ServiceSettings c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6543a = "zh-CN";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6544b = 1;
    private int d = ErrorCode.ERROR_CODE_INVALID_PARAM;
    private int e = ErrorCode.ERROR_CODE_INVALID_PARAM;

    private ServiceSettings() {
    }

    public static ServiceSettings getInstance() {
        if (c == null) {
            c = new ServiceSettings();
        }
        return c;
    }

    public static synchronized void updatePrivacyAgree(Context context, boolean z) {
        iu.i(context, z, wts.a(false));
    }

    public static synchronized void updatePrivacyShow(Context context, boolean z, boolean z2) {
        iu.j(context, z, z2, wts.a(false));
    }

    public void destroyInnerAsynThreadPool() {
        try {
            ays.c();
        } catch (Throwable th) {
            xts.i(th, "ServiceSettings", "destroyInnerAsynThreadPool");
        }
    }

    public int getConnectionTimeOut() {
        return this.d;
    }

    public String getLanguage() {
        return this.f6543a;
    }

    public int getProtocol() {
        return this.f6544b;
    }

    public int getSoTimeOut() {
        return this.e;
    }

    public void setApiKey(String str) {
        f0t.a(str);
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

    public void setLanguage(String str) {
        this.f6543a = str;
    }

    public void setProtocol(int i) {
        this.f6544b = i;
        k0t.a().e(this.f6544b == 2);
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
}
