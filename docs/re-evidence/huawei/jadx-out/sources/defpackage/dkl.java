package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DeviceDownloadSourceInfo;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadResultCallBack;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginmgr.filedownload.PullHealthBiListener;
import com.huawei.pluginmgr.filedownload.PullListener;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public class dkl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static dkl f31866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f31867c = new Object();
    private static final Object d = new Object();
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f31868a;
    private int i = 0;
    private volatile int k = 0;
    private volatile List<edx> l = new ArrayList(10);
    private boolean f = false;
    private boolean h = false;
    private volatile int m = 0;
    private int g = 0;
    private final c j = new c(BaseApplication.getContext().getMainLooper());

    private dkl(Context context) {
        this.f31868a = context;
    }

    public static dkl d() {
        dkl dklVar;
        synchronized (f31867c) {
            if (f31866b == null) {
                f31866b = new dkl(BaseApplication.getContext());
            }
            dklVar = f31866b;
        }
        return dklVar;
    }

    class c extends Handler {
        c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 10) {
                LogUtil.a("DownloadDeviceResourceManager", "RESET_PLUGIN_DOWN");
                dkl.this.c();
            } else if (i == 20) {
                dkl.this.e(-1);
            } else {
                LogUtil.a("DownloadDeviceResourceManager", "enter default branch");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        LogUtil.a("DownloadDeviceResourceManager", "resetDownloadingTag");
        this.f = false;
        this.j.removeMessages(10);
    }

    public void e() {
        String str = dkz.d().e((String) null, true) + ((LogUtil.e() || b()) ? "com.huawei.health_HwWear_deviceConfig" : "com.huawei.health_HwWear_deviceConfigBeta");
        LogUtil.d("DownloadDeviceResourceManager", "resetDownloadIndex downloadUrl:", str);
        piu.c().d(str, "");
        piu.c().a("plugin_index", "");
    }

    public void c(String str) {
        boolean z = this.f;
        if (!z) {
            this.f = true;
            this.j.sendEmptyMessageDelayed(10, 300000L);
            d(str);
            return;
        }
        LogUtil.a("DownloadDeviceResourceManager", "startDownloadPlugin", Boolean.valueOf(z));
    }

    public void a(String str) {
        dkv.d().a(str);
    }

    private void d(final String str) {
        final dkr dkrVarD = dkr.d();
        dkrVarD.b(new DownloadResultCallBack() { // from class: dkl.3
            @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadResultCallBack
            public void setDownloadStatus(int i, int i2) {
                if (i == 0) {
                    return;
                }
                LogUtil.a("DownloadDeviceResourceManager", "downloadDeviceIndexFile status", Integer.valueOf(i));
                dkl.this.e(str);
                if (dkrVarD != null) {
                    LogUtil.a("DownloadDeviceResourceManager", "downloadDeviceIndexFile removeCallBack");
                    dkrVarD.d(this);
                    dkrVarD.a();
                }
            }
        });
        dkrVarD.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final String str) {
        dkz.d().b(new PullListener() { // from class: dkl.4
            @Override // com.huawei.pluginmgr.filedownload.PullListener
            public void onPullingChange(pis pisVar, pit pitVar) {
                if (pitVar != null) {
                    dkl.this.j.removeMessages(20);
                    int iF = pitVar.f();
                    LogUtil.a("DownloadDeviceResourceManager", "update index file status:" + iF);
                    if (iF == 1 || iF == -11) {
                        dkz.d().a();
                        dkl.this.c(str, iF);
                        return;
                    }
                    if (iF == -1) {
                        LogUtil.a("DownloadDeviceResourceManager", "update index fail do not update UI");
                        dkl.this.c();
                        dkl.this.e(-1);
                        return;
                    } else {
                        if (iF == -5) {
                            LogUtil.a("DownloadDeviceResourceManager", "can not find service source");
                            dkl.this.c();
                            dkl.this.e(-1);
                            return;
                        }
                        LogUtil.a("DownloadDeviceResourceManager", "status is error");
                        return;
                    }
                }
                LogUtil.j("DownloadDeviceResourceManager", "status is error null");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x002d A[SYNTHETIC] */
    public void c(String str, int i) {
        this.l.clear();
        List<edx> listB = dkz.d().b();
        if (njy.e(listB)) {
            LogUtil.a("DownloadDeviceResourceManager", "have no index info");
            c();
            if (i == -11) {
                e();
                return;
            }
            return;
        }
        for (edx edxVar : listB) {
            if (!"SMART_ALL".equals(str)) {
                if (edxVar.g() == null || !TextUtils.equals(edxVar.g(), str)) {
                    LogUtil.a("DownloadDeviceResourceManager", "ezPluginIndexInfo wearKind is null");
                } else {
                    LogUtil.a("DownloadDeviceResourceManager", "has band plugin info, uuid :" + edxVar.b());
                    LogUtil.a("DownloadDeviceResourceManager", "publish mode :" + edxVar.f());
                    if (e(edxVar)) {
                        d(edxVar);
                    }
                }
            } else if (edxVar.g() == null || !b(edxVar.g())) {
                LogUtil.a("DownloadDeviceResourceManager", "ezPluginIndexInfo is not watchOrBand");
            } else {
                this.h = false;
                LogUtil.a("DownloadDeviceResourceManager", "has band plugin info, uuid :" + edxVar.b());
                LogUtil.a("DownloadDeviceResourceManager", "publish mode :" + edxVar.f());
                if (e(edxVar)) {
                    d(edxVar);
                }
            }
        }
        if (this.l.isEmpty()) {
            LogUtil.a("DownloadDeviceResourceManager", "have no band plugin info");
            if (this.h) {
                this.h = false;
                d("SMART_WATCH");
                return;
            } else {
                c();
                return;
            }
        }
        a(a());
    }

    private boolean b(String str) {
        return TextUtils.equals(str, "SMART_BAND") || TextUtils.equals(str, "SMART_WATCH");
    }

    private void d(edx edxVar) {
        if (Utils.o()) {
            if (TextUtils.equals(edxVar.f(), "2") || TextUtils.equals(edxVar.f(), "3")) {
                a(edxVar);
                return;
            }
            return;
        }
        if (TextUtils.equals(edxVar.f(), "1") || TextUtils.equals(edxVar.f(), "3")) {
            a(edxVar);
        }
    }

    private boolean e(edx edxVar) {
        if (!CommonUtil.ap()) {
            return false;
        }
        if (!edxVar.g().equals("SMART_WATCH") && !edxVar.g().equals("SMART_BAND")) {
            return false;
        }
        a(edxVar);
        return true;
    }

    private void a(List<edx> list) {
        LogUtil.a("DownloadDeviceResourceManager", "enter checkIsNeedUpdate");
        for (final edx edxVar : list) {
            if (dkz.d().j(edxVar.b())) {
                dkz.d().d(edxVar.b(), new PullListener() { // from class: dkl.2
                    @Override // com.huawei.pluginmgr.filedownload.PullListener
                    public void onPullingChange(pis pisVar, pit pitVar) {
                        LogUtil.a("DownloadDeviceResourceManager", "result status " + pitVar.f());
                        if (pitVar.f() == 1) {
                            LogUtil.a("DownloadDeviceResourceManager", "description file is not need update,do not update ui.");
                            dkl.this.b(edxVar);
                        }
                    }
                });
            }
        }
        if (a().size() > 0) {
            d(a());
        } else {
            c();
        }
    }

    private void d(List<edx> list) {
        LogUtil.a("DownloadDeviceResourceManager", "enter updateDescriptionForWear");
        this.i = 0;
        synchronized (e) {
            this.k = 0;
        }
        for (final edx edxVar : list) {
            final DeviceDownloadSourceInfo deviceDownloadSourceInfoD = edxVar.d();
            LogUtil.a("DownloadDeviceResourceManager", "updatePluginDescription :", deviceDownloadSourceInfoD == null ? Constants.NULL : deviceDownloadSourceInfoD.toString());
            final String strE = edxVar.e();
            if (deviceDownloadSourceInfoD != null && deviceDownloadSourceInfoD.getSite() == 1) {
                LogUtil.a("DownloadDeviceResourceManager", "DownloadHealthCloudManager downloadSourceInfo");
                dki.a().b(deviceDownloadSourceInfoD, edxVar.b(), new PullListener() { // from class: dkl.1
                    @Override // com.huawei.pluginmgr.filedownload.PullListener
                    public void onPullingChange(pis pisVar, pit pitVar) {
                        String strB;
                        LogUtil.a("DownloadDeviceResourceManager", "onPullingChange result:", Integer.valueOf(pitVar.f()));
                        dkl.this.b(edxVar, pitVar);
                        edl edlVarB = dkz.d().b(edxVar.b());
                        if (edlVarB == null) {
                            strB = "";
                        } else {
                            strB = edlVarB.b();
                        }
                        LogUtil.a("DownloadDeviceResourceManager", "onPullingChange localVersion:", strE, "cacheVersion:", strB);
                        dxz.c(eek.d(deviceDownloadSourceInfoD), strE, strB, pitVar, pisVar);
                    }
                }, new PullHealthBiListener() { // from class: dkl.5
                    @Override // com.huawei.pluginmgr.filedownload.PullHealthBiListener
                    public void onPullHealthBiCalling(int i, String str, pis pisVar) {
                        LogUtil.a("DownloadDeviceResourceManager", "updatePluginDescription onPullHealthBiCalling");
                        dxz.b(i, str, pisVar);
                    }
                });
            } else {
                dkz.d().a(edxVar.b(), new PullListener() { // from class: dkl.9
                    @Override // com.huawei.pluginmgr.filedownload.PullListener
                    public void onPullingChange(pis pisVar, pit pitVar) {
                        int iG = pitVar.g();
                        int iD = pitVar.d();
                        LogUtil.a("DownloadDeviceResourceManager", "update Description total size is :", Integer.valueOf(iG), "pull size is :", Integer.valueOf(iD), "uuid is :", pisVar.o());
                        dkl.this.b(edxVar, pitVar);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(edx edxVar, pit pitVar) {
        if (pitVar.f() == 1) {
            LogUtil.a("DownloadDeviceResourceManager", "updateDescriptionForWear success");
            this.i++;
            synchronized (e) {
                this.k += pitVar.g();
            }
            if (this.i == this.l.size()) {
                f();
                return;
            }
            return;
        }
        b(edxVar);
        LogUtil.a("DownloadDeviceResourceManager", "update index fail do not update UI");
    }

    private void f() {
        LogUtil.a("DownloadDeviceResourceManager", "enter updatePluginForWear size：", Integer.valueOf(this.l.size()));
        if (this.l.size() > 0) {
            DeviceDownloadSourceInfo deviceDownloadSourceInfoD = this.l.get(0).d();
            if (deviceDownloadSourceInfoD != null && deviceDownloadSourceInfoD.getSite() == 1) {
                c(deviceDownloadSourceInfoD, 0);
            } else {
                e(deviceDownloadSourceInfoD, 0);
            }
        }
    }

    private String b(int i) {
        String strB;
        if (i < this.l.size() && i >= 0) {
            strB = this.l.get(i).b();
        } else {
            strB = "";
        }
        LogUtil.a("DownloadDeviceResourceManager", "getFetchUuid size, index：", Integer.valueOf(this.l.size()), Integer.valueOf(i));
        return strB;
    }

    private void c(DeviceDownloadSourceInfo deviceDownloadSourceInfo, final int i) {
        LogUtil.a("DownloadDeviceResourceManager", "downloadCloudPlugin");
        String strB = b(i);
        if (TextUtils.isEmpty(strB)) {
            LogUtil.j("DownloadDeviceResourceManager", "downloadCloudPlugin fetchUuid empty");
        } else {
            dki.a().c(deviceDownloadSourceInfo, strB, new PullListener() { // from class: dkl.10
                @Override // com.huawei.pluginmgr.filedownload.PullListener
                public void onPullingChange(pis pisVar, pit pitVar) {
                    LogUtil.d("DownloadDeviceResourceManager", "downloadCloudPlugin onPullingChange result:", Integer.valueOf(pitVar.f()));
                    dkl.this.d(pitVar, i);
                }
            }, new PullHealthBiListener() { // from class: dkl.8
                @Override // com.huawei.pluginmgr.filedownload.PullHealthBiListener
                public void onPullHealthBiCalling(int i2, String str, pis pisVar) {
                    LogUtil.a("DownloadDeviceResourceManager", "downloadCloudPlugin onPullHealthBiCalling");
                    dxz.b(i2, str, pisVar);
                }
            });
        }
    }

    private void e(DeviceDownloadSourceInfo deviceDownloadSourceInfo, final int i) {
        String strB = b(i);
        if (TextUtils.isEmpty(strB)) {
            LogUtil.j("DownloadDeviceResourceManager", "downloadOnePlugin fetchUuid empty");
        } else {
            LogUtil.a("DownloadDeviceResourceManager", "enter downloadOnePlugin uuid:", strB);
            dkz.d().c(strB, new PullListener() { // from class: dkl.7
                @Override // com.huawei.pluginmgr.filedownload.PullListener
                public void onPullingChange(pis pisVar, pit pitVar) {
                    dkl.this.d(pitVar, i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(pit pitVar, int i) {
        if (pitVar.f() == 1) {
            LogUtil.a("DownloadDeviceResourceManager", "single file downloaded successfully");
            if (i > this.l.size() - 1 || i < 0) {
                LogUtil.a("DownloadDeviceResourceManager", "index is out wearPluginSize.");
                c();
                return;
            } else {
                lvi.b(dkz.d().b(this.l.get(i).b()));
                c(i, pitVar);
                return;
            }
        }
        if (pitVar.f() == 0) {
            e(d(pitVar.d()));
            return;
        }
        LogUtil.j("DownloadDeviceResourceManager", "downloadOnePlugin failed");
        synchronized (d) {
            this.m = 0;
        }
        e(-1);
    }

    private void c(int i, pit pitVar) {
        if (i > this.l.size() - 1 || i < 0) {
            LogUtil.a("DownloadDeviceResourceManager", "downloadOneData_index is out wearPluginSize.");
            return;
        }
        String str = this.l.get(i).b() + "_version";
        String strE = this.l.get(i).e();
        StorageParams storageParams = new StorageParams();
        storageParams.e(0);
        SharedPreferenceManager.e(this.f31868a, String.valueOf(1003), str, strE, storageParams);
        Object obj = d;
        synchronized (obj) {
            this.m += pitVar.g();
        }
        int i2 = i + 1;
        if (this.l.size() > i2) {
            DeviceDownloadSourceInfo deviceDownloadSourceInfoD = this.l.get(i2).d();
            if (deviceDownloadSourceInfoD != null && deviceDownloadSourceInfoD.getSite() == 1) {
                c(deviceDownloadSourceInfoD, i2);
                return;
            } else {
                e(deviceDownloadSourceInfoD, i2);
                return;
            }
        }
        if (this.h) {
            this.h = false;
            d("SMART_WATCH");
            return;
        }
        c();
        LogUtil.a("DownloadDeviceResourceManager", "multiple files downloaded successfully");
        synchronized (obj) {
            this.m = 0;
        }
        Intent intent = new Intent();
        intent.setAction("com.huawei.health.action.ACTION_BACKGROUND_DOWNLOAD_DEVICE");
        LocalBroadcastManager.getInstance().sendBroadcast(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        Intent intent = new Intent();
        intent.setAction("com.huawei.health.action.ACTION_DOWNLOAD_BACK_PROCESS");
        intent.putExtra("progress", i);
        LocalBroadcastManager.getInstance().sendBroadcast(intent);
    }

    private int d(int i) {
        if (this.k == 0) {
            return 0;
        }
        int i2 = ((this.m + i) * 100) / this.k;
        if (i2 > 99) {
            i2 = 99;
        }
        if (this.g != i2) {
            LogUtil.a("DownloadDeviceResourceManager", "showDownloadProgress downloaded : ", Integer.valueOf(this.m + i), " total : ", Integer.valueOf(this.k), " showDownloadProgress progress:", Integer.valueOf(i2));
            this.g = i2;
        }
        return i2;
    }

    private void a(edx edxVar) {
        List<DeviceInfo> listD = lvl.d();
        if (listD == null || listD.size() <= 0) {
            return;
        }
        HashMap map = new HashMap(10);
        for (DeviceInfo deviceInfo : listD) {
            map.put(Integer.valueOf(deviceInfo.getProductType()), deviceInfo);
            LogUtil.d("DownloadDeviceResourceManager", "updateStorageDevices mapValue:", deviceInfo.getDeviceName());
        }
        if (edg.b().get(edxVar.b()) != null) {
            Integer num = edg.b().get(edxVar.b());
            num.intValue();
            if (map.containsKey(num)) {
                this.l.add(edxVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(edx edxVar) {
        if (this.l.size() <= 0 || !this.l.contains(edxVar)) {
            return;
        }
        this.l.remove(edxVar);
    }

    private List<edx> a() {
        ArrayList arrayList = new ArrayList(10);
        Iterator<edx> it = this.l.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    private static boolean b() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "developeroptions", "developerswitch");
        String strE2 = SharedPreferenceManager.e(BaseApplication.getContext(), "APP_TEST_SITE", "app_test_site_type");
        LogUtil.a("DownloadDeviceResourceManager", "deviceSite:", strE2);
        return CommonUtil.ap() && "1".equals(strE) && "release".equals(strE2);
    }
}
