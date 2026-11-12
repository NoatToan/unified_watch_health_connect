package defpackage;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DeviceDownloadSourceInfo;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadResultCallBack;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginmgr.filedownload.PullHealthBiListener;
import com.huawei.pluginmgr.filedownload.PullListener;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public class dko {
    private DownloadDeviceInfoCallBack d;
    private List<String> n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f31885b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f31884a = new Object();
    private static final Object e = new Object();
    private volatile List<String> m = new ArrayList(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<edx> f31886c = new ArrayList(16);
    private List<edx> i = new ArrayList(16);
    private volatile List<edx> j = new ArrayList(16);
    private int l = 0;
    private int h = 0;
    private volatile int o = 0;
    private int k = 0;
    private int f = 0;
    private ExtendHandler g = HandlerCenter.b(new a(), "DownloadSeriesResourceManager");

    class a implements Handler.Callback {
        private a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            ReleaseLogUtil.d("R_DownloadSeriesResourceManager", "message status:", Integer.valueOf(message.what));
            switch (message.what) {
                case 101:
                    dko.this.s();
                    return true;
                case 102:
                default:
                    LogUtil.j("DownloadSeriesResourceManager", "other message");
                    return false;
                case 103:
                    if (message.obj instanceof Integer) {
                        synchronized (dko.e) {
                            dko.this.c(((Integer) message.obj).intValue());
                            break;
                        }
                    }
                    return true;
                case 104:
                    dko.this.d(message);
                    return true;
                case 105:
                    HandlerExecutor.b(new Runnable() { // from class: dkt
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f31906b.b();
                        }
                    });
                    dko.this.k();
                    return true;
                case 106:
                    HandlerExecutor.b(new Runnable() { // from class: dks
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f31905a.d();
                        }
                    });
                    dko.this.k();
                    pil.d(edf.f32777a, BaseApplication.getContext().getFilesDir().getPath(), "plugin.zip");
                    return true;
            }
        }

        /* synthetic */ void d() {
            dko.this.q();
        }

        /* synthetic */ void b() {
            dko.this.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final Message message) {
        ReleaseLogUtil.d("R_DownloadSeriesResourceManager", "downloadErrorProcess");
        new Handler(BaseApplication.getContext().getMainLooper()).post(new Runnable() { // from class: dkq
            @Override // java.lang.Runnable
            public final void run() {
                this.d.c(message);
            }
        });
        m();
        k();
    }

    /* synthetic */ void c(Message message) {
        Object obj = message.obj;
        if (obj instanceof Integer) {
            e(((Integer) obj).intValue());
        } else {
            ReleaseLogUtil.d("R_DownloadSeriesResourceManager", "downloadErrorProcess obj:", obj);
            e(-1);
        }
    }

    public dko(List<String> list, DownloadDeviceInfoCallBack downloadDeviceInfoCallBack) {
        this.n = new ArrayList(16);
        this.n = list;
        this.d = downloadDeviceInfoCallBack;
    }

    private boolean c(String str) {
        boolean z = (lvi.a(str) == null && lvi.c(str, false) == null && lvi.c(str, true) == null) ? false : true;
        LogUtil.a("DownloadSeriesResourceManager", "isHasDevice is ", Boolean.valueOf(z));
        return z;
    }

    public void a() {
        if (this.d == null) {
            LogUtil.j("DownloadSeriesResourceManager", "mCallBack is null");
            return;
        }
        m();
        List<String> list = this.n;
        if (list == null || list.isEmpty()) {
            LogUtil.j("DownloadSeriesResourceManager", "uuidList is empty");
            d(-1);
            return;
        }
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            Iterator<String> it = this.n.iterator();
            while (it.hasNext()) {
                if (!c(it.next())) {
                    if (dku.c()) {
                        break;
                    }
                    n();
                    return;
                }
            }
            o();
            return;
        }
        j();
        this.f31886c.clear();
        this.i.clear();
        this.f = 0;
        Message messageObtain = Message.obtain();
        messageObtain.what = 101;
        this.g.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        if ((this.n.contains("96cea4f7-9a5e-4db4-9dda-244885c5446f") || this.n.contains("69a968a4-5db8-4d1e-a390-762cb8039784") || this.n.contains("c7d28238-fec2-4985-b2a4-f29c96637ac4") || this.n.contains("f5195256-bc1c-44b8-a4b7-52866f623d11")) && !this.n.contains("6ed99f86-c6b4-43e2-8339-52b2d72a9168")) {
            this.n.add("6ed99f86-c6b4-43e2-8339-52b2d72a9168");
        }
        for (String str : this.n) {
            if (lvi.c(str, false) == null) {
                a(str);
            }
        }
        if (njy.e(this.m)) {
            o();
        } else {
            f();
        }
    }

    private void f() {
        final dkr dkrVarD = dkr.d();
        dkrVarD.b(new DownloadResultCallBack() { // from class: dko.4
            @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadResultCallBack
            public void setDownloadStatus(int i, int i2) {
                if (i == 0) {
                    return;
                }
                LogUtil.a("DownloadSeriesResourceManager", "downloadDeviceIndexFile status", Integer.valueOf(i));
                dko.this.p();
                if (dkrVarD != null) {
                    LogUtil.a("DownloadSeriesResourceManager", "downloadDeviceIndexFile removeCallBack");
                    dkrVarD.d(this);
                    dkrVarD.a();
                }
            }
        });
        dkrVarD.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        dkz.d().b(new PullListener() { // from class: dko.3
            @Override // com.huawei.pluginmgr.filedownload.PullListener
            public void onPullingChange(pis pisVar, pit pitVar) {
                if (pitVar == null) {
                    LogUtil.j("DownloadSeriesResourceManager", "downloadDeviceIndexFile result is null.");
                    dko.this.d(-1);
                    return;
                }
                int iF = pitVar.f();
                LogUtil.a("DownloadSeriesResourceManager", "downloadDeviceIndexFile fetchStatus: ", Integer.valueOf(iF));
                if (iF == 1 || iF == -11) {
                    dkz.d().a();
                    dko.this.a(iF);
                } else if (iF == 0) {
                    LogUtil.a("DownloadSeriesResourceManager", "downloadDeviceIndexFile is downloading.");
                } else if (iF == -9) {
                    dko.this.d(-3);
                } else {
                    dko.this.d(-1);
                }
            }
        });
    }

    private void e(int i) {
        DownloadDeviceInfoCallBack downloadDeviceInfoCallBack = this.d;
        if (downloadDeviceInfoCallBack != null) {
            downloadDeviceInfoCallBack.onFailure(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        DownloadDeviceInfoCallBack downloadDeviceInfoCallBack = this.d;
        if (downloadDeviceInfoCallBack != null) {
            downloadDeviceInfoCallBack.onSuccess();
        } else {
            ReleaseLogUtil.d("R_DownloadSeriesResourceManager", "mCallBack is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        DownloadDeviceInfoCallBack downloadDeviceInfoCallBack = this.d;
        if (downloadDeviceInfoCallBack != null) {
            downloadDeviceInfoCallBack.netWorkError();
        }
    }

    private int g() {
        int size;
        synchronized (f31885b) {
            size = this.m.size();
        }
        return size;
    }

    private void j() {
        synchronized (f31885b) {
            this.m.clear();
        }
    }

    private void a(String str) {
        synchronized (f31885b) {
            if (!this.m.contains(str)) {
                this.m.add(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        synchronized (f31885b) {
            if (this.m.contains(str)) {
                this.m.remove(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        List<edx> listB = dkz.d().b();
        if (listB == null || listB.isEmpty()) {
            LogUtil.j("DownloadSeriesResourceManager", "checkTargetIndex indexInfoList is empty.");
            d(-1);
            if (i == -11) {
                dkl.d().e();
                return;
            }
            return;
        }
        Iterator<edx> it = listB.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        if (njy.e(this.f31886c)) {
            LogUtil.j("DownloadSeriesResourceManager", "mDevicePluginList is empty");
            d(-1);
        } else {
            r();
        }
    }

    private void a(edx edxVar) {
        if (!CommonUtil.bu() && (TextUtils.equals(edxVar.g(), "SMART_WATCH") || TextUtils.equals(edxVar.g(), "SMART_BAND"))) {
            LogUtil.d("DownloadSeriesResourceManager", "not release add...");
            this.f31886c.add(edxVar);
        } else {
            if (Utils.o()) {
                if (TextUtils.equals(edxVar.f(), "2") || TextUtils.equals(edxVar.f(), "3")) {
                    this.f31886c.add(edxVar);
                    return;
                }
                return;
            }
            if (TextUtils.equals(edxVar.f(), "1") || TextUtils.equals(edxVar.f(), "3")) {
                this.f31886c.add(edxVar);
            }
        }
    }

    private void r() {
        for (edx edxVar : this.f31886c) {
            if (this.m.contains(edxVar.b()) && !TextUtils.isEmpty(edxVar.c())) {
                LogUtil.a("DownloadSeriesResourceManager", "updateNeedDownloadIndex, oobeid ", edxVar.c());
                a(edxVar.c());
            }
        }
        for (edx edxVar2 : this.f31886c) {
            if (this.m.contains(edxVar2.b())) {
                this.i.add(edxVar2);
            }
        }
        LogUtil.a("DownloadSeriesResourceManager", "mEzPlugins.size(): ", Integer.valueOf(this.i.size()), " mWearPlugins.size(): ", Integer.valueOf(this.m.size()));
        if (this.i.size() == this.m.size()) {
            c();
            return;
        }
        xjt.o("updateNeedDownloadIndex not support.");
        LogUtil.j("DownloadSeriesResourceManager", "updateNeedDownloadIndex not support");
        d(-1);
    }

    private void c() {
        this.j.clear();
        LogUtil.a("DownloadSeriesResourceManager", "enter checkIsNeedUpdate");
        for (final edx edxVar : this.i) {
            if (dkz.d().j(edxVar.b())) {
                dkz.d().d(edxVar.b(), new PullListener() { // from class: dko.2
                    @Override // com.huawei.pluginmgr.filedownload.PullListener
                    public void onPullingChange(pis pisVar, pit pitVar) {
                        if (pitVar == null) {
                            LogUtil.j("DownloadSeriesResourceManager", "onPullingChange result is null");
                            return;
                        }
                        int iF = pitVar.f();
                        LogUtil.d("DownloadSeriesResourceManager", "enter checkIsNeedUpdate: ", Integer.valueOf(iF), " ", edxVar.b());
                        if (pitVar.f() == 1) {
                            if (lvi.a(edxVar.b()) == null) {
                                dko.this.i(edxVar.b());
                            }
                            dko.this.c(edxVar);
                            dko.this.e(edxVar.b());
                        }
                    }
                });
            }
        }
        if (g() > 0) {
            t();
        } else {
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(String str) {
        lvi.b(dkz.d().b(str));
    }

    private edx b(String str) {
        for (edx edxVar : dkz.d().b()) {
            if (edxVar.b().equals(str)) {
                return edxVar;
            }
        }
        return null;
    }

    private void t() {
        LogUtil.a("DownloadSeriesResourceManager", "enter updateDescriptionForWear: ", Integer.valueOf(this.m.size()));
        synchronized (e) {
            this.l = 0;
            this.h = 0;
        }
        for (String str : this.m) {
            edx edxVarB = b(str);
            DeviceDownloadSourceInfo deviceDownloadSourceInfoD = edxVarB != null ? edxVarB.d() : null;
            if (deviceDownloadSourceInfoD != null && deviceDownloadSourceInfoD.getSite() == 1) {
                LogUtil.a("DownloadSeriesResourceManager", "DownloadHealthCloudManager downloadSourceInfo");
                b(edxVarB, deviceDownloadSourceInfoD, str);
            } else {
                dkz.d().a(str, new PullListener() { // from class: dko.1
                    @Override // com.huawei.pluginmgr.filedownload.PullListener
                    public void onPullingChange(pis pisVar, pit pitVar) {
                        dko.this.e(pisVar, pitVar);
                    }
                });
            }
        }
    }

    private void b(edx edxVar, final DeviceDownloadSourceInfo deviceDownloadSourceInfo, final String str) {
        final String strE = edxVar.e();
        dki.a().b(deviceDownloadSourceInfo, edxVar.b(), new PullListener() { // from class: dko.9
            @Override // com.huawei.pluginmgr.filedownload.PullListener
            public void onPullingChange(pis pisVar, pit pitVar) {
                String strB;
                dko.this.e(pisVar, pitVar);
                edl edlVarB = dkz.d().b(str);
                if (edlVarB == null) {
                    strB = "";
                } else {
                    strB = edlVarB.b();
                }
                LogUtil.a("DownloadSeriesResourceManager", "onPullingChange localVersion:", strE, "cacheVersion:", strB);
                dxz.c(eek.d(deviceDownloadSourceInfo), strE, strB, pitVar, pisVar);
            }
        }, new PullHealthBiListener() { // from class: dko.10
            @Override // com.huawei.pluginmgr.filedownload.PullHealthBiListener
            public void onPullHealthBiCalling(int i, String str2, pis pisVar) {
                LogUtil.a("DownloadSeriesResourceManager", "updatePluginDescription onPullHealthBiCalling");
                dxz.b(i, str2, pisVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(pis pisVar, pit pitVar) {
        if (pisVar == null || pitVar == null) {
            LogUtil.j("DownloadSeriesResourceManager", "onPullingChange task or result is null");
            d(-1);
            return;
        }
        LogUtil.d("DownloadSeriesResourceManager", "updateDescriptionForWear status: ", Integer.valueOf(pitVar.f()));
        if (pitVar.f() == 1) {
            synchronized (e) {
                this.l += pitVar.g();
                this.h++;
                if (this.h == g()) {
                    LogUtil.a("DownloadSeriesResourceManager", "Updated successfully. The total size of the resource:", Integer.valueOf(this.l));
                    h();
                }
            }
            return;
        }
        if (pitVar.f() == -9) {
            d(-3);
        } else {
            d(-1);
        }
    }

    private void h() {
        if (this.m.size() <= this.f) {
            LogUtil.a("DownloadSeriesResourceManager", "downloadTargetPlugin mWearPlugins is null");
            return;
        }
        final String str = this.m.get(this.f);
        edx edxVarB = b(str);
        DeviceDownloadSourceInfo deviceDownloadSourceInfoD = edxVarB != null ? edxVarB.d() : null;
        if (deviceDownloadSourceInfoD != null && deviceDownloadSourceInfoD.getSite() == 1) {
            LogUtil.a("DownloadSeriesResourceManager", "downloadTargetPlugin DownloadHealthCloudManager");
            dki.a().c(deviceDownloadSourceInfoD, str, new PullListener() { // from class: dko.6
                @Override // com.huawei.pluginmgr.filedownload.PullListener
                public void onPullingChange(pis pisVar, pit pitVar) {
                    LogUtil.d("DownloadSeriesResourceManager", "downloadCloudPlugin onPullingChange result:", Integer.valueOf(pitVar.f()));
                    dko.this.e(pitVar, str);
                }
            }, new PullHealthBiListener() { // from class: dko.8
                @Override // com.huawei.pluginmgr.filedownload.PullHealthBiListener
                public void onPullHealthBiCalling(int i, String str2, pis pisVar) {
                    LogUtil.a("DownloadSeriesResourceManager", "downloadCloudPlugin onPullHealthBiCalling");
                    dxz.b(i, str2, pisVar);
                }
            });
        } else {
            dkz.d().c(str, new PullListener() { // from class: dko.7
                @Override // com.huawei.pluginmgr.filedownload.PullListener
                public void onPullingChange(pis pisVar, pit pitVar) {
                    dko.this.e(pitVar, str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(pit pitVar, String str) {
        if (pitVar == null) {
            LogUtil.j("DownloadSeriesResourceManager", "downloadTargetPlugin result is null.");
            d(-1);
            return;
        }
        int iF = pitVar.f();
        if (iF == 1) {
            ReleaseLogUtil.d("R_DownloadSeriesResourceManager", "parseZipResult success");
            synchronized (f31884a) {
                this.o += pitVar.g();
            }
            lvi.b(dkz.d().c(str));
            d(str);
            d();
            return;
        }
        if (iF == 0) {
            int iD = pitVar.d();
            Message messageObtain = Message.obtain();
            messageObtain.what = 103;
            messageObtain.obj = Integer.valueOf(iD);
            this.g.sendMessage(messageObtain);
            return;
        }
        if (iF == -9) {
            xjt.o("parseZipResult PULL_STORAGE_NOT_ENOUGH.");
            ReleaseLogUtil.d("R_DownloadSeriesResourceManager", "parseZipResult PULL_STORAGE_NOT_ENOUGH");
            d(-3);
        } else {
            xjt.o("parseZipResult error.");
            ReleaseLogUtil.d("R_DownloadSeriesResourceManager", "parseZipResult error");
            d(-1);
        }
    }

    private void d() {
        int iG = g();
        int i = this.f + 1;
        this.f = i;
        if (i < iG) {
            h();
        } else {
            LogUtil.a("DownloadSeriesResourceManager", "Succeeded in downloading all the resource files");
            o();
        }
    }

    private void d(String str) {
        synchronized (f31885b) {
            edx edxVarD = dkz.d().d(str);
            if (edxVarD == null) {
                d(-1);
                return;
            }
            String str2 = edxVarD.b() + "_version";
            String strE = edxVarD.e();
            StorageParams storageParams = new StorageParams();
            storageParams.e(0);
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(1003), str2, strE, storageParams);
            c(edxVarD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(edx edxVar) {
        synchronized (f31885b) {
            this.j.add(edxVar);
        }
    }

    private void n() {
        Message messageObtain = Message.obtain();
        messageObtain.what = 105;
        this.g.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 104;
        messageObtain.obj = Integer.valueOf(i);
        this.g.sendMessage(messageObtain);
    }

    private void o() {
        Message messageObtain = Message.obtain();
        messageObtain.what = 106;
        this.g.sendMessage(messageObtain);
    }

    private void e() {
        LogUtil.a("DownloadSeriesResourceManager", "mHasDownloadedPlugins size: ", Integer.valueOf(this.j.size()));
        for (edx edxVar : i()) {
            if (!this.j.contains(edxVar)) {
                dkz.d().a(edxVar.b());
            }
        }
    }

    private List<edx> i() {
        ArrayList arrayList = new ArrayList(16);
        synchronized (f31885b) {
            Iterator<edx> it = this.i.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        final int i2;
        if (this.l == 0) {
            LogUtil.a("DownloadSeriesResourceManager", "showDownloadProgress, mTotalSize is zero");
            i2 = 0;
        } else {
            i2 = ((i + this.o) * 100) / this.l;
            if (i2 > 99) {
                i2 = 99;
            }
            if (this.k != i2) {
                this.k = i2;
                if (i2 % 10 == 0) {
                    LogUtil.a("DownloadSeriesResourceManager", "showDownloadProgress downloaded,mTempProgressBar: ", Integer.valueOf(this.o), " total : ", Integer.valueOf(this.l), " showDownloadProgress progress:", Integer.valueOf(this.k));
                }
            }
        }
        new Handler(BaseApplication.getContext().getMainLooper()).post(new Runnable() { // from class: dko.5
            @Override // java.lang.Runnable
            public void run() {
                if (dko.this.d != null) {
                    dko.this.d.onDownload(i2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        ExtendHandler extendHandler = this.g;
        if (extendHandler != null) {
            extendHandler.quit(false);
        }
        e();
    }

    private void m() {
        for (pis pisVar : piu.c().b()) {
            if (pisVar != null && this.n.contains(pisVar.b())) {
                dkz.d().d(pisVar);
            }
        }
    }
}
