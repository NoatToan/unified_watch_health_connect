package defpackage;

import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadResultCallBack;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginmgr.filedownload.PullListener;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes26.dex */
public class dkr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static dkr f31899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f31900b = new Object();
    private static final Object d = new Object();
    private static final Object e = new Object();
    private volatile int j = 0;
    private volatile int n = 0;
    private volatile int g = 0;
    private boolean h = false;
    private int m = 0;
    private List<edo> i = new CopyOnWriteArrayList();
    private edm f = new edm();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<DownloadResultCallBack> f31901c = new CopyOnWriteArrayList();

    static /* synthetic */ int d(dkr dkrVar) {
        int i = dkrVar.g;
        dkrVar.g = i + 1;
        return i;
    }

    private dkr() {
    }

    public static dkr d() {
        dkr dkrVar;
        synchronized (f31900b) {
            if (f31899a == null) {
                f31899a = new dkr();
            }
            dkrVar = f31899a;
        }
        return dkrVar;
    }

    public void e() {
        l();
        dkh.e().e(new ResponseCallback() { // from class: dkp
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                dkr.c(i, (List) obj);
            }
        });
    }

    static /* synthetic */ void c(final int i, List list) {
        if (i != 0 || njy.e(list)) {
            ReleaseLogUtil.a("R_DownloadIndexAllManager", "downloadCountryCodeListConfig error:", Integer.valueOf(i));
            dkh.e().e(new ResponseCallback() { // from class: dkn
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i2, Object obj) {
                    ReleaseLogUtil.d("R_DownloadIndexAllManager", "downloadCountryCodeListConfig retry. status: " + i);
                }
            });
        } else {
            LogUtil.a("DownloadIndexAllManager", "downloadCountryCodeListConfig exist config.");
        }
    }

    public void b(DownloadResultCallBack downloadResultCallBack) {
        synchronized (e) {
            List<DownloadResultCallBack> list = this.f31901c;
            if (list != null && !list.contains(downloadResultCallBack)) {
                this.f31901c.add(downloadResultCallBack);
            }
        }
    }

    public void d(DownloadResultCallBack downloadResultCallBack) {
        synchronized (e) {
            List<DownloadResultCallBack> list = this.f31901c;
            if (list != null && list.contains(downloadResultCallBack)) {
                this.f31901c.remove(downloadResultCallBack);
            }
        }
    }

    private void l() {
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            if (dku.c()) {
                f();
                return;
            }
            this.h = false;
            synchronized (e) {
                List<DownloadResultCallBack> list = this.f31901c;
                if (list == null) {
                    return;
                }
                Iterator<DownloadResultCallBack> it = list.iterator();
                while (it.hasNext()) {
                    it.next().setDownloadStatus(-2, 0);
                }
                return;
            }
        }
        if (this.h) {
            return;
        }
        this.h = true;
        this.i.clear();
        this.g = 0;
        this.j = 0;
        this.m = 0;
        String strA = eek.a();
        dkz.d().c("device_index_all", b(), strA, new PullListener() { // from class: dkr.3
            @Override // com.huawei.pluginmgr.filedownload.PullListener
            public void onPullingChange(pis pisVar, pit pitVar) {
                if (pitVar == null) {
                    LogUtil.j("DownloadIndexAllManager", "downloadDeviceIndexFile result is null.");
                    return;
                }
                int iF = pitVar.f();
                if (iF == 1 || iF == -11) {
                    ReleaseLogUtil.d("R_DownloadIndexAllManager", "download file:", pitVar.toString());
                    dkr.this.e(pisVar);
                } else {
                    if (iF == 0) {
                        LogUtil.d("DownloadIndexAllManager", "downloadDeviceIndexFile is downloading.");
                        return;
                    }
                    if (iF == -9) {
                        xjt.o("downloadDeviceIndexFile storage is not enough.");
                        dkr.this.a(-3);
                    } else {
                        xjt.o("downloadDeviceIndexFile is error.");
                        dkr.this.a(-1);
                        ReleaseLogUtil.e("R_DownloadIndexAllManager", "downloadDeviceIndexFile is error.");
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(pis pisVar) {
        File file = new File(eek.a());
        boolean zExists = file.exists();
        LogUtil.a("DownloadIndexAllManager", "updateIndexCacheForWear isExistThisIndex is = ", Boolean.valueOf(zExists));
        if (zExists) {
            e(file);
            if (this.f == null) {
                e(eek.a());
                b(pisVar);
                a(-1);
                LogUtil.j("DownloadIndexAllManager", "updateIndexCacheForWear, indexAllBean is null");
                return;
            }
            ReleaseLogUtil.d("R_DownloadIndexAllManager", "updateIndexCacheForWear mIndexAll version");
            if (p()) {
                xjt.o("updateIndexCacheForWear, zip path is null");
                e(eek.a());
                b(pisVar);
                a(-1);
                LogUtil.j("DownloadIndexAllManager", "updateIndexCacheForWear, zip path is null");
                return;
            }
            m();
            return;
        }
        xjt.o("index file is not exists");
        b(pisVar);
        a(-1);
        LogUtil.j("DownloadIndexAllManager", "index file is not exists");
    }

    private void b(pis pisVar) {
        piu.c().d(pisVar.j() + "device_index_all", "");
        piu.c().a("device_index_all", "");
    }

    private void m() {
        ReleaseLogUtil.d("R_DownloadIndexAllManager", "checkZipResource to enter");
        if (h()) {
            i();
            g();
            j();
        } else {
            ReleaseLogUtil.d("R_DownloadIndexAllManager", "checkZipResource done file is not exists");
            x();
        }
    }

    private void i() {
        LogUtil.a("DownloadIndexAllManager", "checkImageResource");
        String strA = this.f.a();
        boolean zA = a("img_index_all", strA);
        boolean zE = e("img_index_all", strA);
        if (zA || zE) {
            List<edo> listD = this.f.d();
            this.i.addAll(listD);
            e(listD);
            return;
        }
        LogUtil.a("DownloadIndexAllManager", "image resource is exists");
    }

    private void e(List<edo> list) {
        Iterator<edo> it = list.iterator();
        while (it.hasNext()) {
            this.m += it.next().b();
        }
        ReleaseLogUtil.d("R_DownloadIndexAllManager", "setTotalSize total size");
    }

    private void g() {
        LogUtil.a("DownloadIndexAllManager", "checkLangResource");
        String strB = this.f.b();
        boolean zA = a("lang_index_all", strB);
        boolean zE = e("lang_index_all", strB);
        if (zA || zE) {
            List<edo> listC = this.f.c();
            this.i.addAll(listC);
            e(listC);
            return;
        }
        LogUtil.a("DownloadIndexAllManager", "lang resource is exists");
    }

    private void j() {
        LogUtil.a("DownloadIndexAllManager", "checkResource");
        if (!this.i.isEmpty()) {
            e(eek.e());
            o();
        } else {
            r();
            a();
            LogUtil.j("DownloadIndexAllManager", "checkResource, mDownLoadResourceList is empty");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        LogUtil.a("DownloadIndexAllManager", "downLoadResource");
        String str = eek.d("img_index_all") + this.f.a() + File.separator;
        if (this.g < 0 || this.g >= this.i.size()) {
            LogUtil.j("DownloadIndexAllManager", "downLoadResource, mIndex is out of bounds");
            a(-1);
            return;
        }
        edo edoVar = this.i.get(this.g);
        if (edoVar == null || edoVar.d() == null) {
            xjt.o("downLoadResource info or config is null.");
            a(-1);
            return;
        }
        if (edoVar.d().contains("lang")) {
            LogUtil.a("DownloadIndexAllManager", "start download lang resource");
            str = eek.d("lang_index_all") + this.f.b() + File.separator;
        }
        int iB = edoVar.b();
        if (dli.e() > iB) {
            b(edoVar, str);
            return;
        }
        xjt.o("downLoadResource Insufficient storage, availCount: " + dli.e() + ", size: " + iB);
        a(-3);
        LogUtil.j("DownloadIndexAllManager", "Insufficient storage: ", Long.valueOf(dli.e()), " ", Integer.valueOf(iB));
    }

    private void x() {
        LogUtil.a("DownloadIndexAllManager", "startDownload");
        this.i.clear();
        b("img_index_all");
        b("lang_index_all");
        List<edo> listD = this.f.d();
        this.i.addAll(listD);
        e(listD);
        List<edo> listC = this.f.c();
        this.i.addAll(listC);
        if (njy.e(this.i)) {
            xjt.o("mDownLoadResourceList is empty.");
            a(-1);
        } else {
            e(listC);
            LogUtil.a("DownloadIndexAllManager", "mDownLoadResourceList size: ", Integer.valueOf(this.i.size()));
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public edm e(File file) {
        String strF;
        String strE = dla.e(file);
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("DownloadIndexAllManager", "parseVersionIndexFile indexJson is null");
            return this.f;
        }
        dkg.d().c(strE);
        try {
            edm edmVar = this.f;
            if (edmVar == null) {
                strF = "";
            } else {
                strF = edmVar.f();
            }
            if (TextUtils.isEmpty(strF)) {
                edm edmVarE = dkx.e(strE);
                this.f = edmVarE;
                return edmVarE;
            }
            if (!strF.equals(new JSONObject(strE).optString("version"))) {
                this.f = dkx.e(strE);
            }
            return this.f;
        } catch (JSONException unused) {
            LogUtil.e("DownloadIndexAllManager", "getIndexBean JSONException");
        }
    }

    private boolean p() {
        List<edo> listD = this.f.d();
        List<edo> listC = this.f.c();
        return listD == null || listD.isEmpty() || listC == null || listC.isEmpty();
    }

    private boolean a(String str, String str2) {
        File file = new File(eek.d(str) + str2 + File.separator);
        if (file.exists() && file.isDirectory()) {
            String[] list = file.list();
            if (list == null || list.length == 0) {
                return true;
            }
            LogUtil.j("DownloadIndexAllManager", "downloadLangFile() file exists");
            return false;
        }
        b(str);
        return true;
    }

    private boolean e(String str, String str2) {
        String str3 = str + "_version";
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(1003), str3);
        LogUtil.a("DownloadIndexAllManager", "checkSharePrefsZip,key: ", str3, " version: ", str2, " spVersion: ", strE);
        return TextUtils.isEmpty(strE) || !TextUtils.equals(str2, strE);
    }

    private boolean h() {
        return new File(eek.e()).exists();
    }

    private void b(edo edoVar, String str) {
        String strB = b();
        String strE = dkz.d().e((String) null, true);
        if (!TextUtils.isEmpty(strE)) {
            c(edoVar, strE + strB, str);
            return;
        }
        xjt.o("downloadLangFile() baseDownloadUrl is empty");
        a(-1);
        LogUtil.j("DownloadIndexAllManager", "downloadLangFile() baseDownloadUrl is empty");
    }

    private void c(edo edoVar, String str, String str2) {
        pis pisVar = new pis();
        pisVar.a(str2);
        pisVar.i(str);
        pisVar.b(edoVar.a());
        pisVar.c(edoVar.d());
        pisVar.a(edoVar.b());
        d(pisVar);
    }

    private void d(pis pisVar) {
        dli.c().d(pisVar, new PullListener() { // from class: dkr.5
            @Override // com.huawei.pluginmgr.filedownload.PullListener
            public void onPullingChange(pis pisVar2, pit pitVar) {
                if (pitVar == null) {
                    LogUtil.j("DownloadIndexAllManager", "downloadZipFile result is null.");
                    return;
                }
                int iF = pitVar.f();
                if (iF == 1 || iF == -11) {
                    synchronized (dkr.d) {
                        dkr.this.j += pisVar2.l();
                        dkr.d(dkr.this);
                        if (dkr.this.g >= dkr.this.i.size()) {
                            dkr.this.k();
                            dkr.this.q();
                            dkr.this.r();
                            return;
                        } else {
                            dkr.this.o();
                            ReleaseLogUtil.d("R_DownloadIndexAllManager", "downloadZipFile success");
                            return;
                        }
                    }
                }
                if (iF == 0) {
                    dkr.this.d(pitVar);
                    return;
                }
                if (iF == -9) {
                    xjt.o("downloadZipFile zip storage not enough.");
                    dkr.this.e(pisVar2.a());
                    dkr.this.a(-3);
                    LogUtil.a("DownloadIndexAllManager", "downloadZipFile zip error");
                    return;
                }
                xjt.o("downloadZipFile zip error.");
                dkr.this.e(pisVar2.a());
                dkr.this.a(-1);
                ReleaseLogUtil.d("R_DownloadIndexAllManager", "downloadZipFile zip error");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(pit pitVar) {
        int iB = b(pitVar.d());
        synchronized (e) {
            List<DownloadResultCallBack> list = this.f31901c;
            if (list == null) {
                return;
            }
            Iterator<DownloadResultCallBack> it = list.iterator();
            while (it.hasNext()) {
                it.next().setDownloadStatus(0, iB);
            }
        }
    }

    private int b(int i) {
        if (this.m == 0) {
            return 0;
        }
        int i2 = ((this.j + i) * 100) / this.m;
        if (i2 > 99) {
            i2 = 99;
        }
        if (this.n != i2) {
            this.n = i2;
            if (this.n % 10 == 0) {
                ReleaseLogUtil.d("DownloadIndexAllManager", "showDownloadProgress downloaded ：", Integer.valueOf(this.j + i), " total : ", Integer.valueOf(this.m), " showDownloadProgress progress:", Integer.valueOf(this.n));
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        y();
        this.h = false;
        synchronized (e) {
            List<DownloadResultCallBack> list = this.f31901c;
            if (list == null) {
                return;
            }
            Iterator<DownloadResultCallBack> it = list.iterator();
            while (it.hasNext()) {
                it.next().setDownloadStatus(1, 100);
            }
            a();
            ReleaseLogUtil.d("R_DownloadIndexAllManager", "setDownloadSuccess download all file is success");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        this.h = false;
        synchronized (e) {
            List<DownloadResultCallBack> list = this.f31901c;
            if (list == null) {
                return;
            }
            Iterator<DownloadResultCallBack> it = list.iterator();
            while (it.hasNext()) {
                it.next().setDownloadStatus(i, -1);
            }
            LogUtil.j("DownloadIndexAllManager", "updateIndexCacheForWear, indexAllBean is null");
        }
    }

    private void y() {
        dkg.d().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        String strA = this.f.a();
        String strB = this.f.b();
        StorageParams storageParams = new StorageParams();
        storageParams.e(0);
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(1003), "img_index_all_version", strA, storageParams);
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(1003), "lang_index_all_version", strB, storageParams);
        LogUtil.a("DownloadIndexAllManager", "imageKey is ", "img_index_all_version", ",imageVersion is ", strA, ",langKey: ", "lang_index_all_version", ",langVersion: ", strB);
        ReleaseLogUtil.d("R_DownloadIndexAllManager", "setZipSharedVersion");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        eek.e(new File(str));
    }

    private void b(String str) {
        eek.e(new File(eek.d(str)));
    }

    protected String b() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), "key_download_config");
        if (!TextUtils.isEmpty(strE)) {
            return strE;
        }
        if (CommonUtil.af(BaseApplication.getContext()) || CommonUtil.ca() || t()) {
            return "com.huawei.health_HwWear_deviceConfig";
        }
        return "com.huawei.health_HwWear_deviceConfigBeta";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        eek.b(eek.e());
    }

    public void a() {
        s();
        this.h = false;
        n();
        this.f31901c = null;
    }

    private static void n() {
        synchronized (f31900b) {
            f31899a = null;
        }
    }

    private void s() {
        for (pis pisVar : piu.c().b()) {
            if (pisVar != null && a(pisVar)) {
                dkz.d().d(pisVar);
            }
        }
    }

    private boolean a(pis pisVar) {
        String strB = pisVar.b();
        if (TextUtils.equals("device_index_all", strB)) {
            return true;
        }
        for (edo edoVar : this.i) {
            if (edoVar != null && TextUtils.equals(strB, edoVar.d())) {
                return true;
            }
        }
        return false;
    }

    private static boolean t() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "developeroptions", "developerswitch");
        String strE2 = SharedPreferenceManager.e(BaseApplication.getContext(), "APP_TEST_SITE", "app_test_site_type");
        LogUtil.a("DownloadIndexAllManager", "deviceSite:", strE2);
        return CommonUtil.ap() && "1".equals(strE) && "release".equals(strE2);
    }

    private void f() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: dkr.4
            @Override // java.lang.Runnable
            public void run() {
                dku.b();
                File file = new File(eek.a());
                boolean zExists = file.exists();
                LogUtil.a("DownloadIndexAllManager", "downLoadIndex: ", Boolean.valueOf(zExists));
                if (zExists) {
                    dkr.this.e(file);
                }
                if (dkr.this.f != null) {
                    dku.b(dkr.this.f);
                    dku.d(dkr.this.f);
                    dkr.this.k();
                    dkr.this.q();
                    dkr.this.r();
                    dku.a();
                }
                lvi.l();
            }
        });
    }
}
