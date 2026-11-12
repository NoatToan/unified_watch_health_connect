package com.huawei.phoneservice.faq.base.network;

import android.app.Application;
import com.huawei.hms.framework.network.restclient.hwhttp.HttpClientGlobalInstance;
import defpackage.zcm;
import kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes13.dex */
public final class SdkAppInfo {
    public static final c Companion = new c(null);
    private static volatile SdkAppInfo INSTANCE;

    @JvmStatic
    public static final SdkAppInfo initAppInfo(Application application) {
        return Companion.a(application);
    }

    public static final class c {
        @JvmStatic
        public final SdkAppInfo a(Application application) {
            if (SdkAppInfo.INSTANCE == null) {
                SdkAppInfo.INSTANCE = new SdkAppInfo(application, null);
                com.huawei.phoneservice.faq.base.util.g.e(application);
            }
            return SdkAppInfo.INSTANCE;
        }

        public /* synthetic */ c(zcm zcmVar) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ SdkAppInfo(Application application, zcm zcmVar) {
        this(application);
    }

    private SdkAppInfo(Application application) {
        HttpClientGlobalInstance.getInstance().init(application);
        com.huawei.phoneservice.faq.base.tracker.b.d(application, false);
    }
}
