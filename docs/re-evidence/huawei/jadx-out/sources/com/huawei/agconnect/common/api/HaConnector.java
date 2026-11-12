package com.huawei.agconnect.common.api;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.common.network.AccessNetworkManager;
import com.huawei.agconnect.credential.obs.a;
import com.huawei.agconnect.credential.obs.b;
import com.huawei.agconnect.credential.obs.c;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class HaConnector {
    private static final String HA_HTTP_HEADER = "com.huawei.agconnect";
    private static final String HA_SERVICE_TAG = "AGC_TAG";
    private static final HaConnector INSTANCE = new HaConnector();
    private static final String TAG = "HaConnector";
    private c hiAnalytics;
    private Handler mainHandler;

    public void syncOAID(final HaSyncCallBack haSyncCallBack) {
        if (this.hiAnalytics != null) {
            Logger.i(TAG, "start sync ha oaid");
            this.hiAnalytics.syncOaid(new a() { // from class: com.huawei.agconnect.common.api.HaConnector.2
                @Override // com.huawei.agconnect.credential.obs.a
                public void result(int i, String str) {
                    haSyncCallBack.syncCallBack(i, str);
                    Logger.i(HaConnector.TAG, "end sync ha oaid:code:--->" + i + ", msg---->" + str);
                }
            });
        }
    }

    public void setAnalyticsEnabled(boolean z) {
        c cVar = this.hiAnalytics;
        if (cVar != null) {
            cVar.a(z);
        }
    }

    public void onReport() {
        c cVar = this.hiAnalytics;
        if (cVar != null) {
            cVar.a();
        }
    }

    public void onEvent(String str, Bundle bundle) {
        c cVar = this.hiAnalytics;
        if (cVar != null) {
            cVar.a(str, bundle);
        }
    }

    public void init(Context context) {
        AccessNetworkManager.getInstance().addCallback(new AnonymousClass1(context));
    }

    public Map<String, String> getUserProfiles(boolean z) {
        HashMap map = new HashMap();
        c cVar = this.hiAnalytics;
        return cVar != null ? cVar.b(z) : map;
    }

    public boolean containHaInstance() {
        return this.hiAnalytics != null;
    }

    private boolean useOldHaInitFunction() {
        return TextUtils.isEmpty(AGConnectInstance.getInstance().getOptions().getString("/service/analytics/collector_url_ru")) || TextUtils.isEmpty(AGConnectInstance.getInstance().getOptions().getString("/service/analytics/collector_url_sg")) || TextUtils.isEmpty(AGConnectInstance.getInstance().getOptions().getString("/service/analytics/collector_url_de")) || TextUtils.isEmpty(AGConnectInstance.getInstance().getOptions().getString("/service/analytics/collector_url_cn"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initInMainThread(Context context) {
        initHiAnalytics(context);
    }

    private void initHiAnalytics(Context context) {
        try {
            c cVarA = useOldHaInitFunction() ? b.a(context, HA_SERVICE_TAG, HA_HTTP_HEADER) : b.a(context, HA_SERVICE_TAG, HA_HTTP_HEADER, AGConnectInstance.getInstance().getOptions().getRoutePolicy().getRouteName());
            this.hiAnalytics = cVarA;
            if (cVarA == null) {
                Logger.e(TAG, "init HiAnalyticsBridge SDK error, please make sure the project inherits HiAnalytics SDK correctlyor download the latest agconnect-services.json file and try again.");
            } else {
                Logger.i(TAG, "init HiAnalyticsBridge SDK end.");
            }
        } catch (Error e) {
            if (e instanceof NoSuchMethodError) {
                Logger.e(TAG, "please upgrade HiAnalytics SDK (com.huawei.hms:hianalytics) to the latest version");
            }
            throw e;
        }
    }

    public static HaConnector getInstance() {
        HaConnector haConnector;
        synchronized (HaConnector.class) {
            haConnector = INSTANCE;
        }
        return haConnector;
    }

    /* JADX INFO: renamed from: com.huawei.agconnect.common.api.HaConnector$1, reason: invalid class name */
    class AnonymousClass1 implements AccessNetworkManager.AccessNetworkCallback {
        final /* synthetic */ Context val$context;

        /* JADX INFO: renamed from: lambda$onNetWorkReady$0$com-huawei-agconnect-common-api-HaConnector$1, reason: not valid java name */
        /* synthetic */ void m806x8d4882c8(Context context) {
            HaConnector.this.initInMainThread(context);
        }

        /* JADX INFO: renamed from: lambda$onNetWorkReady$1$com-huawei-agconnect-common-api-HaConnector$1, reason: not valid java name */
        /* synthetic */ void m807x2c2a909() {
            if (HaConnector.this.hiAnalytics != null) {
                Logger.i(HaConnector.TAG, "Auto onReport");
                HaConnector.this.hiAnalytics.a();
            }
        }

        @Override // com.huawei.agconnect.common.network.AccessNetworkManager.AccessNetworkCallback
        public void onNetWorkReady() {
            if (HaConnector.this.mainHandler == null) {
                HaConnector.this.mainHandler = new Handler(Looper.getMainLooper());
            }
            Handler handler = HaConnector.this.mainHandler;
            final Context context = this.val$context;
            handler.post(new Runnable() { // from class: com.huawei.agconnect.common.api.HaConnector$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m806x8d4882c8(context);
                }
            });
            HaConnector.this.mainHandler.postDelayed(new Runnable() { // from class: com.huawei.agconnect.common.api.HaConnector$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m807x2c2a909();
                }
            }, 5000L);
        }

        AnonymousClass1(Context context) {
            this.val$context = context;
        }
    }

    private HaConnector() {
    }
}
