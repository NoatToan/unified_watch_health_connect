package com.xiaomi.ai.edge.resourcesmanager;

import android.content.Context;
import defpackage.dio;
import defpackage.pzc;

/* JADX INFO: loaded from: classes7.dex */
public class EdgeResourcesDownloadManager {
    public static volatile EdgeResourcesDownloadManager d;
    public static String e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f11037a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public pzc f11038b;
    public static final String[] c = {"hot_query_json_v3"};
    public static volatile boolean f = false;

    public enum Env {
        STAGING,
        PREVIEW,
        PRODUCTION
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11039a;

        static {
            int[] iArr = new int[Env.values().length];
            f11039a = iArr;
            try {
                iArr[Env.STAGING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11039a[Env.PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11039a[Env.PRODUCTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public EdgeResourcesDownloadManager() {
        c(null);
    }

    public static EdgeResourcesDownloadManager a() {
        if (d == null) {
            synchronized (EdgeResourcesDownloadManager.class) {
                try {
                    if (d == null) {
                        d = new EdgeResourcesDownloadManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public pzc b(Context context) {
        if (this.f11038b == null) {
            this.f11038b = new dio(context);
        }
        return this.f11038b;
    }

    public void c(Env env) {
        if (env == null) {
            env = Env.PRODUCTION;
        }
        int i = a.f11039a[env.ordinal()];
        if (i == 1) {
            e = "http://gray.config-staging.ai.srv/api/appCheckFiles";
        } else if (i == 2) {
            e = "https://grayconfig-preview.ai.xiaomi.com/api/appCheckFiles";
        } else {
            if (i != 3) {
                return;
            }
            e = "https://grayconfig.ai.xiaomi.com/api/appCheckFiles";
        }
    }
}
