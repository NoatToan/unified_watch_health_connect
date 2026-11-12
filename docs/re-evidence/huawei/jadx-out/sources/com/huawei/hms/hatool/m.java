package com.huawei.hms.hatool;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static m f13462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f13463c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f13464a;

    public void a(String str) {
        v.a("hmsSdk", "HiAnalyticsDataManager.setAppid(String appid) is execute.");
        Context context = this.f13464a;
        if (context == null) {
            v.e("hmsSdk", "sdk is not init");
        } else {
            s.c().b().i(e1.a("appID", str, "[a-zA-Z0-9_][a-zA-Z0-9. _-]{0,255}", context.getPackageName()));
        }
    }

    public void a(Context context) {
        synchronized (f13463c) {
            if (this.f13464a != null) {
                v.f("hmsSdk", "DataManager already initialized.");
                return;
            }
            this.f13464a = context;
            s.c().b().a(this.f13464a);
            s.c().b().j(context.getPackageName());
            j.a().a(context);
        }
    }

    private static void b() {
        synchronized (m.class) {
            if (f13462b == null) {
                f13462b = new m();
            }
        }
    }

    public static m a() {
        if (f13462b == null) {
            b();
        }
        return f13462b;
    }

    private m() {
    }
}
