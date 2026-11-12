package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.api.BacklogManagerApi;
import com.huawei.health.device.callback.BackLogCallback;
import com.huawei.health.device.callback.JumpToPageCallback;
import com.huawei.health.device.callback.NewVersionCallback;
import com.huawei.health.device.callback.QueryLatestVersionCallback;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.homehealth.backlog.BackLogManagerJump;
import health.compact.a.Utils;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = BacklogManagerApi.class)
@Singleton
public class rhk implements BacklogManagerApi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final riq f47337b = new riq();

    @Override // com.huawei.health.device.api.BacklogManagerApi
    public void checkNewVersion(DeviceInfo deviceInfo, NewVersionCallback newVersionCallback) {
        Context contextB = BaseApplication.b();
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        boolean zD = eey.d(deviceInfo, 58);
        boolean zD2 = eey.d(deviceInfo, 108);
        LogUtil.a("BackLogManagerImpl", "checkNewVersion isSupportDetect:", Boolean.valueOf(zD), " , isSupportOtaUpgrade:", Boolean.valueOf(zD2));
        DeviceCapability deviceCapabilityE = DeviceSettingsInteractors.e(contextB).e(deviceIdentify);
        if ((deviceCapabilityE != null && deviceCapabilityE.isOtaUpdate()) || zD || zD2) {
            boolean zO = HwVersionManager.b(contextB).o(deviceIdentify);
            LogUtil.a("BackLogManagerImpl", "checkNewVersion isNewVersion:", Boolean.valueOf(zO));
            if (zO) {
                newVersionCallback.onResponse(true);
                return;
            } else if (eey.d(deviceInfo, 108) && !Utils.k()) {
                e(deviceInfo, newVersionCallback);
                return;
            }
        }
        if (newVersionCallback != null) {
            newVersionCallback.onResponse(false);
        }
    }

    private void e(final DeviceInfo deviceInfo, final NewVersionCallback newVersionCallback) {
        LogUtil.a("BackLogManagerImpl", "enter getNewVersion");
        if (deviceInfo == null) {
            LogUtil.j("BackLogManagerImpl", "getNewVersion deviceInfo is null");
            if (newVersionCallback != null) {
                newVersionCallback.onResponse(false);
                return;
            }
            return;
        }
        if (!dad.c().isPluginAvaiable()) {
            LogUtil.j("BackLogManagerImpl", "getNewVersion ota Plugin Unavailable");
            if (newVersionCallback != null) {
                newVersionCallback.onResponse(false);
            }
            ThreadPoolManager.c().a("BackLogManagerImpl", new Runnable() { // from class: rhl
                @Override // java.lang.Runnable
                public final void run() {
                    HwOtaUpgradeManager.d().e(deviceInfo, new HwOtaUpgradeManager.RefreshLittleRedListener() { // from class: rhg
                        @Override // com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.RefreshLittleRedListener
                        public final void refreshLittleRed() {
                            LogUtil.a("BackLogManagerImpl", "getNewVersion HwOtaUpgradeManagerHwOta UpgradeManager");
                        }
                    });
                }
            });
            return;
        }
        final String deviceIdentify = deviceInfo.getDeviceIdentify();
        HwOtaUpgradeManager.d().e(deviceInfo, new HwOtaUpgradeManager.RefreshLittleRedListener() { // from class: rhp
            @Override // com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.RefreshLittleRedListener
            public final void refreshLittleRed() {
                rhk.e(deviceIdentify, newVersionCallback);
            }
        });
    }

    static /* synthetic */ void e(String str, NewVersionCallback newVersionCallback) {
        boolean zO = HwVersionManager.b(BaseApplication.b()).o(str);
        LogUtil.a("BackLogManagerImpl", "getNewVersion isNewVersion:", Boolean.valueOf(zO));
        newVersionCallback.onResponse(zO);
    }

    @Override // com.huawei.health.device.api.BacklogManagerApi
    public void queryLatestVersion(final String str, final QueryLatestVersionCallback queryLatestVersionCallback) {
        final DeviceInfo deviceInfoC = mgg.c(str, "BackLogManagerImpl");
        checkNewVersion(deviceInfoC, new NewVersionCallback() { // from class: rhk.4
            @Override // com.huawei.health.device.callback.NewVersionCallback
            public void onResponse(boolean z) {
                if (z) {
                    boolean zD = eey.d(deviceInfoC, 58);
                    boolean zD2 = eey.d(deviceInfoC, 108);
                    LogUtil.a("BackLogManagerImpl", "checkNewVersion isSupportDetect:", Boolean.valueOf(zD), " , isSupportOtaUpgrade:", Boolean.valueOf(zD2));
                    rhk.this.d(str, zD, zD2, queryLatestVersionCallback);
                    return;
                }
                QueryLatestVersionCallback queryLatestVersionCallback2 = queryLatestVersionCallback;
                if (queryLatestVersionCallback2 != null) {
                    queryLatestVersionCallback2.onSuccess(null);
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    public void d(String str, boolean z, boolean z2, QueryLatestVersionCallback queryLatestVersionCallback) {
        String strC;
        long jLongValue;
        dsi dsiVar;
        Context contextB = BaseApplication.b();
        String strJ = HwVersionManager.b(contextB).j(str);
        LogUtil.j("BackLogManagerImpl", "hasLatestVersion newVersion:", strJ);
        boolean z3 = z2 && Utils.k();
        if (z || z3) {
            String strG = nvd.g(contextB, strJ, str);
            strC = nvd.c(contextB, strJ, str);
            if (z) {
                strG = nvd.a(contextB, strJ, str);
                strC = nvd.b(contextB, strJ, str);
            }
            try {
                jLongValue = Long.valueOf(strG).longValue();
            } catch (NumberFormatException unused) {
                LogUtil.j("BackLogManagerImpl", "checkNewVersion NumberFormatException");
                jLongValue = 0;
            }
            if (queryLatestVersionCallback != null) {
                dsiVar = new dsi();
                dsiVar.d(strJ);
                if (jLongValue > 0) {
                    dsiVar.c(jLongValue);
                }
                if (!TextUtils.isEmpty(strC)) {
                    dsiVar.b(strC);
                }
                queryLatestVersionCallback.onSuccess(dsiVar);
            }
        }
        strC = strJ;
        jLongValue = 0;
        if (queryLatestVersionCallback != null) {
            dsiVar = new dsi();
            dsiVar.d(strJ);
            if (jLongValue > 0) {
                dsiVar.c(jLongValue);
            }
            if (!TextUtils.isEmpty(strC)) {
                dsiVar.b(strC);
            }
            queryLatestVersionCallback.onSuccess(dsiVar);
        }
    }

    @Override // com.huawei.health.device.api.BacklogManagerApi
    public void onActivityResult(int i, int i2, Intent intent) {
        ruy.b(i, i2, intent);
    }

    @Override // com.huawei.health.device.api.BacklogManagerApi
    public void queryBacklogList(final BackLogCallback<List<dse>> backLogCallback) {
        if (riq.a() == null) {
            backLogCallback.onFailure(-1, "deviceId is empty");
        } else {
            this.f47337b.a(riq.a(), new BackLogCallback<List<dse>>() { // from class: rhk.2
                @Override // com.huawei.health.device.callback.BackLogCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<dse> list) {
                    backLogCallback.onSuccess(list);
                }

                @Override // com.huawei.health.device.callback.BackLogCallback
                public void onFailure(int i, String str) {
                    backLogCallback.onFailure(-1, "deviceId is empty");
                }
            });
        }
    }

    @Override // com.huawei.health.device.api.BacklogManagerApi
    public void updateVisitedStatus(String str, boolean z, BackLogCallback<Boolean> backLogCallback) {
        if (riq.a() == null) {
            backLogCallback.onFailure(-1, "deviceId is empty");
        } else {
            this.f47337b.b(riq.a(), str, backLogCallback);
            backLogCallback.onSuccess(true);
        }
    }

    @Override // com.huawei.health.device.api.BacklogManagerApi
    public void updateRemindStatus(String str, BackLogCallback<Boolean> backLogCallback) {
        if (riq.a() == null) {
            backLogCallback.onFailure(-1, "deviceId is empty");
        } else {
            this.f47337b.c(riq.a(), str, backLogCallback);
        }
    }

    @Override // com.huawei.health.device.api.BacklogManagerApi
    public void doEventClickAction(String str, final String str2, final BackLogCallback<Integer> backLogCallback) {
        if (this.f47337b.d(str2)) {
            this.f47337b.b(str, str2, backLogCallback);
        } else {
            BackLogManagerJump.jumpToPage(str2, str, new JumpToPageCallback() { // from class: rhk.5
                @Override // com.huawei.health.device.callback.JumpToPageCallback
                public void onSuccess() {
                    LogUtil.a("BackLogManagerImpl", "jumpToPage onSuccess tag:", str2);
                    backLogCallback.onSuccess(0);
                }

                @Override // com.huawei.health.device.callback.JumpToPageCallback
                public void onFail(String str3) {
                    LogUtil.a("BackLogManagerImpl", "jumpToPage onFailure tag:", str2);
                    backLogCallback.onFailure(-1, str3);
                }
            });
        }
    }

    @Override // com.huawei.health.device.api.BacklogManagerApi
    public void deleteBackLogCache(String str) {
        this.f47337b.a(str);
    }
}
