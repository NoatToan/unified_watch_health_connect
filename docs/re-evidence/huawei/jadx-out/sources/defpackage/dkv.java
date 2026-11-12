package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DeviceDownloadSourceInfo;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadResultCallBack;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginmgr.filedownload.PullHealthBiListener;
import com.huawei.pluginmgr.filedownload.PullListener;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public class dkv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f31908a = new Object();
    private static dkv e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f31910c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private edx f31909b = null;
    private int j = 0;
    private int d = 0;

    private dkv() {
        this.f31910c = null;
        this.f31910c = new Handler(BaseApplication.getContext().getMainLooper());
    }

    public static dkv d() {
        dkv dkvVar;
        synchronized (f31908a) {
            if (e == null) {
                e = new dkv();
            }
            dkvVar = e;
        }
        return dkvVar;
    }

    private void a() {
        LogUtil.a("DownloadSingleResourceManager", "Enter destroy.");
        if (this.f31909b != null) {
            this.f31909b = null;
        }
        Handler handler = this.f31910c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        b();
    }

    private static void b() {
        synchronized (f31908a) {
            e = null;
        }
    }

    public void a(final String str) {
        ReleaseLogUtil.d("R_DownloadSingleResourceManager", "startDownloadTargetPlugin enter.");
        if (dku.c()) {
            return;
        }
        Handler handler = this.f31910c;
        if (handler == null) {
            LogUtil.j("DownloadSingleResourceManager", "startDownloadTargetPlugin mHandler is null.");
            e(str);
            return;
        }
        if (handler.hasMessages(30000)) {
            this.f31910c.removeMessages(30000);
        }
        c(str);
        this.f31910c.postDelayed(new Runnable() { // from class: dkv.4
            @Override // java.lang.Runnable
            public void run() {
                ReleaseLogUtil.d("R_DownloadSingleResourceManager", "startDownloadTargetPlugin timeout.");
                dkv.this.e(str);
            }
        }, 30000L);
        d(str, -1);
    }

    public void a(int i) {
        if (dku.c()) {
            return;
        }
        Handler handler = this.f31910c;
        if (handler == null) {
            LogUtil.j("DownloadSingleResourceManager", "startDownloadTargetPlugin mHandler is null.");
            e((String) null);
        } else {
            if (handler.hasMessages(30000)) {
                this.f31910c.removeMessages(30000);
            }
            this.f31910c.postDelayed(new Runnable() { // from class: dkv.2
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.a("DownloadSingleResourceManager", "startDownloadTargetPlugin timeout.");
                    dkv.this.e((String) null);
                }
            }, 30000L);
            d((String) null, i);
        }
    }

    private void c(String str) {
        pis pisVarE;
        if (TextUtils.isEmpty(str) || (pisVarE = piu.c().e(str)) == null) {
            return;
        }
        LogUtil.a("DownloadSingleResourceManager", "cancelDownloading uuid:", str);
        dli.c().b(pisVarE);
    }

    private void d(final String str, final int i) {
        if (TextUtils.isEmpty(str) && i == -1) {
            LogUtil.j("DownloadSingleResourceManager", "downloadDeviceIndexFile uuid is empty.");
            e(str);
        } else {
            final dkr dkrVarD = dkr.d();
            dkrVarD.b(new DownloadResultCallBack() { // from class: dkv.5
                @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadResultCallBack
                public void setDownloadStatus(int i2, int i3) {
                    int i4;
                    if (i2 == 0) {
                        return;
                    }
                    String strD = str;
                    if (TextUtils.isEmpty(strD) && (i4 = i) != -1) {
                        strD = lvi.d(i4);
                    }
                    if (TextUtils.isEmpty(strD)) {
                        LogUtil.j("DownloadSingleResourceManager", "downloadDeviceIndexFile uuid is empty.");
                        dkv.this.e(strD);
                        return;
                    }
                    LogUtil.a("DownloadSingleResourceManager", "downloadDeviceIndexFile status", Integer.valueOf(i2));
                    dkv.this.g(strD);
                    if (dkrVarD != null) {
                        LogUtil.a("DownloadSingleResourceManager", "downloadDeviceIndexFile removeCallBack");
                        dkrVarD.d(this);
                        dkrVarD.a();
                    }
                }
            });
            dkrVarD.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(final String str) {
        dkz.d().b(new PullListener() { // from class: dkv.10
            @Override // com.huawei.pluginmgr.filedownload.PullListener
            public void onPullingChange(pis pisVar, pit pitVar) {
                if (pitVar == null) {
                    LogUtil.j("DownloadSingleResourceManager", "downloadDeviceIndexFile result is null.");
                    dkv.this.e(str);
                    return;
                }
                int iF = pitVar.f();
                LogUtil.a("DownloadSingleResourceManager", "downloadDeviceIndexFile fetchStatus: ", Integer.valueOf(iF));
                if (iF == 1 || iF == -11) {
                    dkz.d().a();
                    dkv.this.c(str, iF);
                } else if (iF != 0) {
                    dkv.this.e(str);
                } else {
                    LogUtil.a("DownloadSingleResourceManager", "downloadDeviceIndexFile is downloading.");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, int i) {
        List<edx> listB = dkz.d().b();
        if (listB == null || listB.isEmpty()) {
            LogUtil.j("DownloadSingleResourceManager", "checkTargetIndex indexInfoList is empty.");
            e(str);
            if (i == -11) {
                dkl.d().e();
                return;
            }
            return;
        }
        for (edx edxVar : listB) {
            if (str.equals(edxVar.b())) {
                LogUtil.a("DownloadSingleResourceManager", "checkTargetIndex exist target index.");
                e(edxVar);
                break;
            }
        }
        edx edxVar2 = this.f31909b;
        if (edxVar2 == null) {
            d(str);
        } else {
            b(edxVar2);
        }
    }

    private void b(edx edxVar) {
        final String strB = edxVar.b();
        if (TextUtils.isEmpty(strB)) {
            LogUtil.a("DownloadSingleResourceManager", "checkPluginDescription uuid is empty.");
            e(strB);
            return;
        }
        if (dkz.d().j(strB)) {
            dkz.d().d(strB, new PullListener() { // from class: dkv.9
                @Override // com.huawei.pluginmgr.filedownload.PullListener
                public void onPullingChange(pis pisVar, pit pitVar) {
                    if (pitVar == null) {
                        LogUtil.j("DownloadSingleResourceManager", "updatePluginDescriptionInfo result is null.");
                        dkv.this.e(strB);
                        return;
                    }
                    int iF = pitVar.f();
                    LogUtil.a("DownloadSingleResourceManager", "result status :", Integer.valueOf(iF));
                    if (iF == 1) {
                        dkv.this.f31909b = null;
                    }
                }
            });
        }
        if (this.f31909b != null) {
            f(edxVar);
        } else {
            b(strB);
            d(strB);
        }
    }

    private void b(String str) {
        if (lvi.a(str) == null) {
            LogUtil.a("DownloadSingleResourceManager", "updateDeviceInfo uuid: ", str);
            lvi.b(dkz.d().b(str));
        }
    }

    private void f(final edx edxVar) {
        final DeviceDownloadSourceInfo deviceDownloadSourceInfoD = edxVar.d();
        LogUtil.a("DownloadSingleResourceManager", "updatePluginDescription :", deviceDownloadSourceInfoD == null ? Constants.NULL : deviceDownloadSourceInfoD.toString());
        if (deviceDownloadSourceInfoD != null && deviceDownloadSourceInfoD.getSite() == 1) {
            LogUtil.a("DownloadSingleResourceManager", "DownloadHealthCloudManager downloadSourceInfo");
            dki.a().b(deviceDownloadSourceInfoD, edxVar.b(), new PullListener() { // from class: dkv.7
                @Override // com.huawei.pluginmgr.filedownload.PullListener
                public void onPullingChange(pis pisVar, pit pitVar) {
                    String strB;
                    ReleaseLogUtil.d("R_DownloadSingleResourceManager", "onPullingChange result:", Integer.valueOf(pitVar.f()));
                    dkv.this.e(edxVar, pitVar);
                    edl edlVarB = dkz.d().b(edxVar.b());
                    if (edlVarB == null) {
                        strB = "";
                    } else {
                        strB = edlVarB.b();
                    }
                    LogUtil.a("DownloadSingleResourceManager", "onPullingChange localVersion:", edxVar.e(), "cacheVersion:", strB);
                    dxz.c(eek.d(deviceDownloadSourceInfoD), edxVar.e(), strB, pitVar, pisVar);
                }
            }, new PullHealthBiListener() { // from class: dkv.6
                @Override // com.huawei.pluginmgr.filedownload.PullHealthBiListener
                public void onPullHealthBiCalling(int i, String str, pis pisVar) {
                    LogUtil.a("DownloadSingleResourceManager", "updatePluginDescription onPullHealthBiCalling");
                    dxz.b(i, str, pisVar);
                }
            });
        } else {
            dkz.d().a(edxVar.b(), new PullListener() { // from class: dkv.8
                @Override // com.huawei.pluginmgr.filedownload.PullListener
                public void onPullingChange(pis pisVar, pit pitVar) {
                    dkv.this.e(edxVar, pitVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(edx edxVar, pit pitVar) {
        if (pitVar == null) {
            LogUtil.j("DownloadSingleResourceManager", "updatePluginDescription result is null.");
            b(-1);
            return;
        }
        LogUtil.a("DownloadSingleResourceManager", "updatePluginDescription totalSize :", Integer.valueOf(pitVar.g()), ", pullSize :", Integer.valueOf(pitVar.d()));
        if (pitVar.f() == 1) {
            this.j = pitVar.g();
            DeviceDownloadSourceInfo deviceDownloadSourceInfoD = edxVar.d();
            if (deviceDownloadSourceInfoD != null && deviceDownloadSourceInfoD.getSite() == 1) {
                a(edxVar);
                return;
            } else {
                d(edxVar);
                return;
            }
        }
        e(edxVar.b());
    }

    private void a(final edx edxVar) {
        LogUtil.a("DownloadSingleResourceManager", "downloadCloudPlugin");
        dki.a().c(edxVar.d(), edxVar.b(), new PullListener() { // from class: dkv.11
            @Override // com.huawei.pluginmgr.filedownload.PullListener
            public void onPullingChange(pis pisVar, pit pitVar) {
                LogUtil.d("DownloadSingleResourceManager", "downloadCloudPlugin onPullingChange result:", Integer.valueOf(pitVar.f()));
                dkv.this.a(edxVar, pitVar);
            }
        }, new PullHealthBiListener() { // from class: dkv.3
            @Override // com.huawei.pluginmgr.filedownload.PullHealthBiListener
            public void onPullHealthBiCalling(int i, String str, pis pisVar) {
                LogUtil.a("DownloadSingleResourceManager", "downloadCloudPlugin onPullHealthBiCalling");
                dxz.b(i, str, pisVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(edx edxVar, pit pitVar) {
        if (pitVar == null) {
            LogUtil.j("DownloadSingleResourceManager", "downloadTargetPlugin result is null.");
            e(edxVar.b());
            return;
        }
        int iF = pitVar.f();
        ReleaseLogUtil.d("R_DownloadSingleResourceManager", "downloadTargetPlugin status :", Integer.valueOf(iF));
        if (iF == 1) {
            lvi.b(dkz.d().b(edxVar.b()));
            c(edxVar);
            d(edxVar.b());
        } else if (iF == 0) {
            b(e(pitVar.d()));
        } else {
            e(edxVar.b());
        }
    }

    private void d(final edx edxVar) {
        dkz.d().c(edxVar.b(), new PullListener() { // from class: dkv.1
            @Override // com.huawei.pluginmgr.filedownload.PullListener
            public void onPullingChange(pis pisVar, pit pitVar) {
                dkv.this.a(edxVar, pitVar);
            }
        });
    }

    private void c(edx edxVar) {
        String str = edxVar.b() + "_version";
        String strE = edxVar.e();
        StorageParams storageParams = new StorageParams();
        storageParams.e(0);
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(1003), str, strE, storageParams);
        LogUtil.a("DownloadSingleResourceManager", "saveFetchVersionInfo fetchVersionKey: ", str, ", fetchVersion: ", strE);
    }

    private void e(edx edxVar) {
        if (CommonUtil.ap() && (TextUtils.equals(edxVar.g(), "SMART_WATCH") || TextUtils.equals(edxVar.g(), "SMART_BAND"))) {
            this.f31909b = edxVar;
        }
        if (Utils.o()) {
            if (TextUtils.equals(edxVar.f(), "2") || TextUtils.equals(edxVar.f(), "3")) {
                this.f31909b = edxVar;
                return;
            }
            return;
        }
        if (TextUtils.equals(edxVar.f(), "1") || TextUtils.equals(edxVar.f(), "3")) {
            this.f31909b = edxVar;
        }
    }

    private int e(int i) {
        int i2 = this.j;
        if (i2 == 0) {
            return 0;
        }
        int i3 = (i * 100) / i2;
        if (i3 > 99) {
            i3 = 99;
        }
        if (this.d != i3) {
            LogUtil.a("DownloadSingleResourceManager", "calculateProgress downloaded :", Integer.valueOf(i), ", mTotalSize :", Integer.valueOf(i2), ", progress:", Integer.valueOf(i3));
            this.d = i3;
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        b(-1);
        c(str);
        a();
    }

    private void d(String str) {
        String pluginIndexOobe = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginIndexOobe(str);
        LogUtil.a("DownloadSingleResourceManager", "sendDownloadDoneBroadcast: ", pluginIndexOobe);
        if (!TextUtils.isEmpty(pluginIndexOobe)) {
            a(pluginIndexOobe);
            return;
        }
        if (dkz.d().j(str)) {
            Intent intent = new Intent();
            intent.setAction("com.huawei.health.action.ACTION_BACKGROUND_DOWNLOAD_DEVICE");
            LocalBroadcastManager.getInstance().sendBroadcast(intent);
            pil.d(edf.f32777a, BaseApplication.getContext().getFilesDir().getPath(), "plugin.zip");
        } else {
            e(str);
        }
        a();
    }

    private void b(int i) {
        Intent intent = new Intent();
        intent.setAction("com.huawei.health.action.DOWNLOAD_SINGLE_DEVICE_PROCESS");
        intent.putExtra("progress", i);
        LocalBroadcastManager.getInstance().sendBroadcast(intent);
    }
}
