package com.huawei.haf.router;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.huawei.hihealth.dictionary.model.HealthDataMergePolicy;
import health.compact.a.LogUtil;
import health.compact.a.ProcessUtil;

/* JADX INFO: loaded from: classes2.dex */
public class AppRouterResultReceiver implements NaviPluginCallback, NaviCallback {
    private final NaviCallback d;

    public AppRouterResultReceiver() {
        this(null);
    }

    private AppRouterResultReceiver(NaviCallback naviCallback) {
        this.d = naviCallback;
    }

    public static void c(Context context, Bundle bundle) {
        Guidepost guidepostE = Guidepost.e(bundle);
        if (guidepostE == null) {
            LogUtil.e("HAF_AppRouterResult", "guidepost == null, bundle=", bundle);
            return;
        }
        String strD = d(bundle);
        if (!ProcessUtil.c().equals(strD)) {
            LogUtil.b("HAF_AppRouterResult", "remote navigate, path=", guidepostE.l(), ", source=", strD);
        }
        guidepostE.a(context, c(bundle));
    }

    public static Bundle e(Guidepost guidepost, NaviCallback naviCallback) {
        Bundle bundleD = d(guidepost);
        c(bundleD, naviCallback);
        return bundleD;
    }

    @Override // com.huawei.haf.router.NaviPluginCallback
    public void onPluginNone(Guidepost guidepost) {
        e(guidepost, 0, null);
    }

    @Override // com.huawei.haf.router.NaviPluginCallback
    public void onPluginFound(Guidepost guidepost, String str) {
        e(guidepost, 1, str);
    }

    @Override // com.huawei.haf.router.NaviPluginCallback
    public void onPluginLost(Guidepost guidepost, String str) {
        e(guidepost, 2, str);
    }

    @Override // com.huawei.haf.router.NaviCallback
    public void onFound(Guidepost guidepost) {
        NaviCallback naviCallback = this.d;
        if (naviCallback != null) {
            naviCallback.onFound(guidepost);
        } else {
            a(guidepost, 10);
        }
    }

    @Override // com.huawei.haf.router.NaviCallback
    public void onLost(Guidepost guidepost) {
        NaviCallback naviCallback = this.d;
        if (naviCallback != null) {
            naviCallback.onLost(guidepost);
        } else {
            a(guidepost, 11);
        }
    }

    @Override // com.huawei.haf.router.NaviCallback
    public void onArrival(Guidepost guidepost) {
        NaviCallback naviCallback = this.d;
        if (naviCallback != null) {
            naviCallback.onArrival(guidepost);
        } else {
            a(guidepost, 12);
        }
    }

    @Override // com.huawei.haf.router.NaviCallback
    public void onInterrupt(Guidepost guidepost) {
        NaviCallback naviCallback = this.d;
        if (naviCallback != null) {
            naviCallback.onInterrupt(guidepost);
        } else {
            a(guidepost, 13);
        }
    }

    protected void e(Guidepost guidepost, int i, String str) {
        LogUtil.b("HAF_AppRouterResult", "onPluginResult, result=", d(i), ", pluginName=", str);
    }

    protected void a(Guidepost guidepost, int i) {
        LogUtil.b("HAF_AppRouterResult", "onRouteResult, result=", a(i));
    }

    protected static String d(int i) {
        if (i == 1) {
            return "FOUND";
        }
        if (i == 2) {
            return "LOST";
        }
        return HealthDataMergePolicy.NONE;
    }

    protected static String a(int i) {
        switch (i) {
            case 10:
                return "FOUND";
            case 11:
                return "LOST";
            case 12:
                return "ARRIVAL";
            case 13:
                return "INTERRUPT";
            default:
                return HealthDataMergePolicy.NONE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle d(Guidepost guidepost) {
        Bundle bundleA = Guidepost.a(guidepost);
        e(bundleA);
        return bundleA;
    }

    private static void c(Bundle bundle, NaviCallback naviCallback) {
        AppRouterResultReceiver appRouterResultReceiver;
        if (naviCallback instanceof AppRouterResultReceiver) {
            appRouterResultReceiver = (AppRouterResultReceiver) naviCallback;
        } else {
            appRouterResultReceiver = naviCallback != null ? new AppRouterResultReceiver(naviCallback) : null;
        }
        if (appRouterResultReceiver != null) {
            bundle.putParcelable("ResultReceiver", new MyResultReceiver(appRouterResultReceiver));
        }
    }

    private static NaviCallback c(Bundle bundle) {
        ResultReceiver resultReceiver = (ResultReceiver) bundle.getParcelable("ResultReceiver");
        if (resultReceiver != null) {
            return new MyNaviCallback(resultReceiver);
        }
        return null;
    }

    private static void e(Bundle bundle) {
        bundle.putString("runningProcess", ProcessUtil.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(Bundle bundle) {
        return bundle.getString("runningProcess");
    }

    static class MyResultReceiver extends ResultReceiver {
        private final AppRouterResultReceiver mResultReceiver;

        MyResultReceiver(AppRouterResultReceiver appRouterResultReceiver) {
            super(null);
            this.mResultReceiver = appRouterResultReceiver;
        }

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int i, Bundle bundle) {
            Guidepost guidepostE = Guidepost.e(bundle);
            String strA = AppRouterResultReceiver.a(i);
            if (guidepostE == null) {
                LogUtil.e("HAF_AppRouterResult", "guidepost == null, bundle=", bundle, ", result=", strA);
            }
            LogUtil.b("HAF_AppRouterResult", "onReceiveResult, path=", guidepostE.l(), ", result=", strA, ", source=", AppRouterResultReceiver.d(bundle));
            switch (i) {
                case 10:
                    this.mResultReceiver.onFound(guidepostE);
                    break;
                case 11:
                    this.mResultReceiver.onLost(guidepostE);
                    break;
                case 12:
                    this.mResultReceiver.onArrival(guidepostE);
                    break;
                case 13:
                    this.mResultReceiver.onInterrupt(guidepostE);
                    break;
            }
        }
    }

    static class MyNaviCallback implements NaviCallback {
        private final ResultReceiver d;

        MyNaviCallback(ResultReceiver resultReceiver) {
            this.d = resultReceiver;
        }

        @Override // com.huawei.haf.router.NaviCallback
        public void onFound(Guidepost guidepost) {
            this.d.send(10, AppRouterResultReceiver.d(guidepost));
        }

        @Override // com.huawei.haf.router.NaviCallback
        public void onLost(Guidepost guidepost) {
            this.d.send(11, AppRouterResultReceiver.d(guidepost));
        }

        @Override // com.huawei.haf.router.NaviCallback
        public void onArrival(Guidepost guidepost) {
            this.d.send(12, AppRouterResultReceiver.d(guidepost));
        }

        @Override // com.huawei.haf.router.NaviCallback
        public void onInterrupt(Guidepost guidepost) {
            this.d.send(13, AppRouterResultReceiver.d(guidepost));
        }
    }
}
