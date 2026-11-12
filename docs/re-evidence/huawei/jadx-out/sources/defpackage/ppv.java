package defpackage;

import android.content.Context;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import com.huawei.pluginfitnessadvice.h5pro.SeriesCourseH5Repository;
import com.huawei.pluginsport.ftp.FtpCloudFactory;
import health.compact.a.GRSManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class ppv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ppv f45786a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f45787b = 4;
    private static final Object d = new Object();
    private final FtpCloudFactory e = new FtpCloudFactory(BaseApplication.b());

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f45797a = 105;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f45798b = 120;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f45799c = 90;
        public static int d = 0;
        public static int e = 150;
        public static int f = 500;
        public static int h = 55;
        public static int i = 75;
    }

    private ppv() {
    }

    public static ppv d() {
        if (f45786a == null) {
            synchronized (d) {
                ppv ppvVar = new ppv();
                f45786a = ppvVar;
                LogUtil.a("FtpDataManager", "FtpDataManager instance hashcode: ", Integer.valueOf(ppvVar.hashCode()));
            }
        }
        return f45786a;
    }

    public void e(final UiCallback<ppz> uiCallback) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("900200036");
        qhq.b("9002", arrayList, new HiDataReadResultListener() { // from class: ppv.4
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                ReleaseLogUtil.d("R_FtpDataManager", npt.d("onResult errorCode: ", Integer.valueOf(i), ", data: ", obj));
                if (ppv.this.e(obj)) {
                    String configData = ((HiSampleConfig) ((List) obj).get(0)).getConfigData();
                    ReleaseLogUtil.d("R_FtpDataManager", npt.d("onResult json: ", configData));
                    uiCallback.onSuccess((ppz) qqt.e(configData, ppz.class));
                    return;
                }
                uiCallback.onSuccess(null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(Object obj) {
        if (!njy.b(obj, HiSampleConfig.class)) {
            ReleaseLogUtil.e("R_FtpDataManager", "list getSampleConfigData isListTypeMatch false ");
            return false;
        }
        if (!njy.e((List) obj)) {
            return true;
        }
        ReleaseLogUtil.e("R_FtpDataManager", "list getSampleConfigData list is empty ");
        return false;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void d(final ResultCallback<pqd> resultCallback) {
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: pqb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45816c.d(resultCallback);
                }
            });
            return;
        }
        String str = GRSManager.c(BaseApplication.b()).getUrl("achievementUrl") + "/achievement/v1/ftp:refresh";
        ReleaseLogUtil.d("R_FtpDataManager", "getFtpRecord url:", str);
        oet.d().c(str, this.e.getHeaders(), ofe.c(this.e.getBody(null)), pqd.class, new ResultCallback<pqd>() { // from class: ppv.3
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(pqd pqdVar) {
                ReleaseLogUtil.d("R_FtpDataManager", "getFtpRecord data:", pqdVar);
                resultCallback.onSuccess(pqdVar);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.a("R_FtpDataManager", "getFtpRecord onFailure:", ExceptionUtils.c(th));
                resultCallback.onFailure(th);
            }
        });
    }

    public void b(final UiCallback<pqc> uiCallback, final boolean z) {
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: pqa
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.d(uiCallback, z);
                }
            });
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("900200037");
        qhq.b("9002", arrayList, new HiDataReadResultListener() { // from class: ppv.2
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                ReleaseLogUtil.d("R_FtpDataManager", npt.d("onResult errorCode: ", Integer.valueOf(i), ", data: ", obj));
                ppv.this.e(obj, uiCallback, z);
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
                ReleaseLogUtil.d("R_FtpDataManager", "onResultIntent getFtpConfig");
            }
        });
    }

    /* synthetic */ void d(UiCallback uiCallback, boolean z) {
        b((UiCallback<pqc>) uiCallback, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Object obj, UiCallback<pqc> uiCallback, boolean z) {
        if (e(obj)) {
            pqc pqcVar = (pqc) qqt.e(((HiSampleConfig) ((List) obj).get(0)).getConfigData(), pqc.class);
            if (pqcVar == null) {
                c(uiCallback, z);
                return;
            } else if (pqcVar.e() == 0) {
                uiCallback.onSuccess(pqcVar);
                return;
            } else {
                c(uiCallback, z);
                return;
            }
        }
        c(uiCallback, z);
    }

    private void c(final UiCallback<pqc> uiCallback, final boolean z) {
        d(new ResultCallback<pqd>() { // from class: ppv.1
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(pqd pqdVar) {
                ReleaseLogUtil.d("R_FtpDataManager", "getFtpRecord:", pqdVar);
                pqe pqeVarD = pqdVar.d();
                if (pqeVarD == null) {
                    ReleaseLogUtil.d("R_FtpDataManager", "ftpRecord == null");
                    uiCallback.onSuccess(null);
                    return;
                }
                pqc pqcVar = new pqc();
                pqcVar.c((int) Math.round(pqeVarD.d()));
                pqcVar.e(DateFormatUtil.d(pqeVarD.b()));
                pqcVar.e(1);
                pqcVar.d(0);
                if (z) {
                    ppv.this.d(pqcVar.d(), qqt.b(pqcVar), "900200037");
                }
                uiCallback.onSuccess(pqcVar);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.e("R_FtpDataManager", "getFtpRecord onFailure", ExceptionUtils.c(th));
            }
        });
    }

    public static ppz a(double d2) {
        return new ppz.e().c(b.d, 0).b(b.h, c(d2, b.h)).d(b.i, c(d2, b.i)).a(b.f45799c, c(d2, b.f45799c)).e(b.f45797a, c(d2, b.f45797a)).j(b.f45798b, c(d2, b.f45798b)).g(b.e, c(d2, b.e)).f(b.f, c(d2, b.f)).a();
    }

    public static ppz e(int i, ppz ppzVar) {
        if (ppzVar == null) {
            LogUtil.a("FtpDataManager", "updatePowerZoneConfig config == null");
            return a(i);
        }
        double d2 = i;
        return new ppz.e().c(ppzVar.a(), c(d2, ppzVar.a())).b(ppzVar.d(), c(d2, ppzVar.d())).d(ppzVar.b(), c(d2, ppzVar.b())).a(ppzVar.c(), c(d2, ppzVar.c())).e(ppzVar.e(), c(d2, ppzVar.e())).j(ppzVar.g(), c(d2, ppzVar.g())).g(ppzVar.f(), c(d2, ppzVar.f())).f(ppzVar.h(), c(d2, ppzVar.h())).a();
    }

    private static int c(double d2, int i) {
        return (int) Math.round((((long) d2) * ((long) i)) / 100.0d);
    }

    public void a() {
        ReleaseLogUtil.d("R_FtpDataManager", "sendFtpAndPowerZone");
        if (!eey.d(ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "FtpDataManager"), OldToNewMotionPath.SPORT_TYPE_OPEN_AREA_SWIM)) {
            ReleaseLogUtil.d("R_FtpDataManager", "sendFtpAndPowerZone no checkSupportCapability");
        } else {
            b(new UiCallback<pqc>() { // from class: ppv.5
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onSuccess(pqc pqcVar) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add("900200036");
                    ppv.this.a(pqcVar, arrayList);
                }
            }, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final pqc pqcVar, List<String> list) {
        if (pqcVar == null) {
            ReleaseLogUtil.e("R_FtpDataManager", "ftpConfig == null");
        } else {
            qhq.b("9002", list, new HiDataReadResultListener() { // from class: ppv.8
                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResultIntent(int i, Object obj, int i2, int i3) {
                }

                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResult(Object obj, int i, int i2) {
                    ReleaseLogUtil.d("R_FtpDataManager", npt.d("dealPowerZone errorCode: ", Integer.valueOf(i), ", data: ", obj));
                    ppv.this.a(obj, pqcVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj, pqc pqcVar) {
        if (e(obj)) {
            String configData = ((HiSampleConfig) ((List) obj).get(0)).getConfigData();
            ReleaseLogUtil.d("R_FtpDataManager", npt.d("onResult json: ", configData));
            ppz ppzVar = (ppz) qqt.e(configData, ppz.class);
            if (ppzVar != null) {
                d(pqcVar.d(), qqt.b(e(pqcVar.b(), ppzVar)), "900200036");
                return;
            } else {
                d(pqcVar.d(), qqt.b(a(pqcVar.b())), "900200036");
                return;
            }
        }
        d(pqcVar.d(), qqt.b(a(pqcVar.b())), "900200036");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(long j, String str, final String str2) {
        qhq.d("9002", str2, str, new HiDataOperateListener() { // from class: ppx
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i, Object obj) {
                ReleaseLogUtil.d("FtpDataManager", "sendPowerZoneForCloud errorCode:", Integer.valueOf(i), "configId:", str2);
            }
        }, j);
    }

    public static void e(Context context, int i) {
        ddv.b().initH5Pro();
        ddv ddvVarB = ddv.b();
        H5ProLaunchOption.Builder forceDarkMode = new H5ProLaunchOption.Builder().addPath("#/ftp?entrance=" + i).setImmerse().showStatusBar().setStatusBarTextBlack(true).setForceDarkMode(1);
        SeriesCourseH5Repository.registerService();
        ddvVarB.loadH5ProApp(context, "com.huawei.health.h5.cycle", forceDarkMode);
    }

    public static void e() {
        HashMap map = new HashMap(16);
        map.put("event", 0);
        map.put("isHaveData", true);
        map.put("dataType", Integer.valueOf(f45787b));
        lmf.d().c(BaseApplication.b(), AnalyticsValue.SPORT_RECORD_ATHLETIC_ABILITY_CARD_2040191.value(), map, 0);
    }
}
