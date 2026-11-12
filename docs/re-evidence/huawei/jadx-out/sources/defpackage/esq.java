package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.huawei.ecologydevice.R;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.api.HonourDeviceConstantsApi;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginmgr.filedownload.PullListener;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.dialog.CustomProgressDialog;
import health.compact.a.CommonUtil;
import health.compact.a.EzPluginManager;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class esq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f33422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f33423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CustomProgressDialog f33424c;
    private Activity d;
    private CustomProgressDialog.Builder e;
    private int f;
    private long g;
    private est h;
    private long i;
    private long l;
    private CommonDialog21 n;
    private List<phz> s = new ArrayList(10);
    private final List<phz> p = new ArrayList(10);
    private HashMap<String, List> t = new HashMap<>(16);
    private HashMap<String, List> r = new HashMap<>(16);
    private List<phz> m = new ArrayList(10);
    private boolean o = false;
    private PullListener j = new PullListener() { // from class: esq.3
        @Override // com.huawei.pluginmgr.filedownload.PullListener
        public void onPullingChange(pis pisVar, pit pitVar) {
            int iF = pitVar.f();
            LogUtil.a("DownloadDeviceResourceTool", "download index file status = ", Integer.valueOf(iF));
            if (iF == 1) {
                esq.this.k();
                if ((!Utils.o() || CommonUtil.cl()) && pip.f45449c.containsKey(esq.this.f33423b)) {
                    EzPluginManager.b().g(esq.this.f33423b);
                } else {
                    EzPluginManager.b().e();
                }
                Message messageObtain = Message.obtain();
                messageObtain.what = 99;
                esq.this.k.sendMessage(messageObtain);
                return;
            }
            if (iF == -11) {
                esq.this.k();
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 99;
                esq.this.k.sendMessage(messageObtain2);
                return;
            }
            if (iF != 0) {
                esq.this.k();
                Message messageObtain3 = Message.obtain();
                messageObtain3.what = 101;
                esq.this.k.sendMessage(messageObtain3);
                return;
            }
            LogUtil.a("DownloadDeviceResourceTool", "download index file status = ", Integer.valueOf(iF));
        }
    };
    private Handler k = new Handler(Looper.getMainLooper()) { // from class: esq.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (esq.this.d != null) {
                LogUtil.d("DownloadDeviceResourceTool", " handleMessage message what = ", Integer.valueOf(message.what));
                int i = message.what;
                if (i != 1) {
                    switch (i) {
                        case Constants.DEFAULT_PRO_BOT_MARGIN_PAD /* 98 */:
                            esq.this.c(message);
                            break;
                        case 99:
                            esq esqVar = esq.this;
                            esqVar.b(esqVar.f33423b);
                            break;
                        case 100:
                            esq.this.e();
                            esq.this.g();
                            break;
                        case 101:
                            esq.this.o();
                            esq.this.f();
                            break;
                        case 102:
                            esq.this.m();
                            break;
                        case 103:
                            esq.this.e(message.arg1);
                            break;
                        case 104:
                            esq.this.q();
                            break;
                        case 105:
                            esq.this.q();
                            esq.this.o();
                            break;
                        case 106:
                            esq.this.l();
                            break;
                        case 107:
                            esq.this.i();
                            break;
                    }
                    return;
                }
                esq.this.d(message);
            }
        }
    };

    public esq(Activity activity, String str, int i, est estVar) {
        this.f = 1;
        this.f33422a = null;
        if (activity == null || TextUtils.isEmpty(str) || estVar == null) {
            return;
        }
        this.d = activity;
        this.f33423b = str;
        this.f = i;
        this.h = estVar;
        this.f33422a = phr.d(activity, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Message message) {
        if (this.f == 1) {
            this.h.onRefresh(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f == 2) {
            this.h.onSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f == 2) {
            this.h.onFailure(101);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Message message) {
        Object obj = message.obj;
        if (obj == null || !(obj instanceof phz)) {
            return;
        }
        this.p.add((phz) obj);
    }

    public void d(HashMap<String, List> map, HashMap<String, List> map2) {
        if (map != null) {
            this.t = map;
        }
        if (map2 != null) {
            this.r = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (lql.a(this.d)) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: esy
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.d();
                }
            });
        }
    }

    /* synthetic */ void d() {
        lql.b(this.d, 2);
    }

    public void a() {
        String str;
        if (this.d == null || TextUtils.isEmpty(this.f33423b) || this.h == null) {
            return;
        }
        e(this.f33423b, true);
        if ((!Utils.o() || CommonUtil.cl()) && pip.f45449c.containsKey(this.f33423b)) {
            if (CommonUtil.bu()) {
                str = pip.e.get(this.f33423b);
            } else {
                str = pip.f45448b.get(this.f33423b);
            }
            EzPluginManager.b().e(this.f33423b, str, this.j);
        } else {
            EzPluginManager.b().c(this.j);
        }
        if (lql.a(this.d)) {
            Message messageObtainMessage = this.k.obtainMessage();
            messageObtainMessage.what = 107;
            this.k.sendMessage(messageObtainMessage);
        }
    }

    private void e(String str, boolean z) {
        List<phz> listC;
        if ((!Utils.o() || CommonUtil.cl()) && pip.f45449c.containsKey(str)) {
            listC = EzPluginManager.b().c(str);
        } else {
            listC = EzPluginManager.b().d();
        }
        if (listC != null && !listC.isEmpty()) {
            LogUtil.a("DownloadDeviceResourceTool", "checkLocalDeviceResourceExists indexInfosCache.size > 0");
            a(listC, z, str);
        } else if (z) {
            LogUtil.a("DownloadDeviceResourceTool", "checkLocalDeviceResourceExists indexInfosCache.size = 0");
            p();
        }
    }

    private boolean e(String str) {
        if (EzPluginManager.b().j(str)) {
            c(ResourceManager.c().d(str));
            return true;
        }
        LogUtil.a("DownloadDeviceResourceTool", "isCheckLocalDeviceResourceExists device not available");
        return false;
    }

    private void a(List<phz> list, boolean z, String str) {
        this.o = false;
        HonourDeviceConstantsApi honourDeviceConstantsApi = (HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class);
        for (phz phzVar : list) {
            if (phzVar.k() != null && TextUtils.equals(phzVar.k(), str)) {
                LogUtil.a("DownloadDeviceResourceTool", "checkLocalDeviceResourceExists has band plugin info from cache, uuid :", phzVar.a());
                if (eev.d(phzVar.f())) {
                    if (honourDeviceConstantsApi.isDualModeProduct(phzVar.a()) && !honourDeviceConstantsApi.isSupportWifiDevice()) {
                        LogUtil.j("DownloadDeviceResourceTool", "buildNeedUpdateDownLoadDeviceList has no cloud and is hagride device");
                    } else {
                        String strO = phzVar.o();
                        String strI = phzVar.i();
                        if ("10".equals(strI)) {
                            e(strO, phzVar);
                        } else {
                            e(strI, phzVar);
                        }
                    }
                }
            }
        }
        if (this.o || !z) {
            return;
        }
        LogUtil.a("DownloadDeviceResourceTool", "checkLocalDeviceResourceExists have not done file");
        p();
    }

    private void e(String str, phz phzVar) {
        if (Utils.o()) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if ("3".equals(str) || "2".equals(str) || "4".equals(str)) {
                this.o = e(phzVar.a());
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if ("3".equals(str) || "1".equals(str) || "4".equals(str)) {
            this.o = e(phzVar.a());
        }
    }

    private void p() {
        CustomProgressDialog customProgressDialog = this.f33424c;
        if (customProgressDialog != null && customProgressDialog.isShowing()) {
            LogUtil.a("DownloadDeviceResourceTool", "startLoading progress dialog exists");
            return;
        }
        if (this.n == null) {
            LogUtil.a("DownloadDeviceResourceTool", "startLoading is domestic app");
            new CommonDialog21(this.d, R.style.app_update_dialogActivity);
            this.n = CommonDialog21.b(this.d);
        }
        this.n.b(this.d.getString(R.string.IDS_device_plugin_download_loading));
        this.n.c();
        this.k.sendEmptyMessageDelayed(105, 8000L);
    }

    private void c(elh elhVar) {
        if (elhVar == null) {
            LogUtil.j("DownloadDeviceResourceTool", "handlerToRefresh productInfo is null");
            return;
        }
        String strT = elhVar.t();
        ResourceManager.c().j(strT);
        if (((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).isCorrectProductId(strT)) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = elhVar;
            this.k.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        Message messageObtain = Message.obtain();
        messageObtain.what = 104;
        this.k.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.f == 1) {
            this.h.onShowErrorLayout();
        }
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        List<phz> listC;
        this.s.clear();
        if ((!Utils.o() || CommonUtil.cl()) && pip.f45449c.containsKey(str)) {
            listC = EzPluginManager.b().c(str);
        } else {
            listC = EzPluginManager.b().d();
        }
        if (listC == null || listC.isEmpty()) {
            LogUtil.a("DownloadDeviceResourceTool", "getAllDeviceInfoFromIndexFile no index info");
            return;
        }
        c(str);
        if (this.s.isEmpty()) {
            d(str);
            return;
        }
        d(esu.d(this.s));
        if (CommonUtil.br()) {
            return;
        }
        e(this.s);
    }

    public void c() {
        c(this.f33423b);
        if (this.s.isEmpty()) {
            d(this.f33423b);
        } else {
            d(esu.d(this.s));
        }
    }

    private void d(String str) {
        if (this.f == 2) {
            this.h.onSuccess();
            return;
        }
        LogUtil.a("DownloadDeviceResourceTool", "getAllDeviceInfoFromIndexFile no current device type devices");
        if (Utils.o() && CommonUtil.cj()) {
            d(esu.d(this.s));
        } else if (Utils.o()) {
            d((List<String>) this.r.get(str));
        } else {
            d((List<String>) this.t.get(str));
        }
    }

    private void d(List<String> list) {
        if (list != null) {
            for (String str : list) {
                LogUtil.d("DownloadDeviceResourceTool", "showPreSetDevice product id", str);
                c(ResourceManager.c().d(str));
            }
        }
    }

    private void c(String str) {
        List<phz> listC;
        if ((!Utils.o() || CommonUtil.cl()) && pip.f45449c.containsKey(str)) {
            listC = EzPluginManager.b().c(str);
        } else {
            listC = EzPluginManager.b().d();
        }
        if (listC == null) {
            LogUtil.j("DownloadDeviceResourceTool", "buildDeviceListFromIndexFile deviceList == null");
            return;
        }
        HonourDeviceConstantsApi honourDeviceConstantsApi = (HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class);
        LogUtil.a("DownloadDeviceResourceTool", "buildDeviceListFromIndexFile deviceList.size() = ", Integer.valueOf(listC.size()));
        for (phz phzVar : listC) {
            if (phzVar.k() != null && TextUtils.equals(phzVar.k(), str) && eev.d(phzVar.f())) {
                if (honourDeviceConstantsApi.isDualModeProduct(phzVar.a()) && !honourDeviceConstantsApi.isSupportWifiDevice()) {
                    LogUtil.j("DownloadDeviceResourceTool", "buildNeedUpdateDownLoadDeviceList has no cloud and is hagride device");
                } else {
                    String strI = phzVar.i();
                    String strJ = phzVar.j();
                    if ("2".equals(strI) || "1".equals(strI) || "3".equals(strI)) {
                        b(phzVar);
                    } else if (TextUtils.isEmpty(strJ) || "0".equals(strJ)) {
                        b(phzVar);
                    } else {
                        a(phzVar, strJ);
                    }
                }
            }
        }
    }

    private void a(phz phzVar, String str) {
        if ("1".equals(str)) {
            String strO = phzVar.o();
            if (Utils.o()) {
                if (TextUtils.isEmpty(strO)) {
                    return;
                }
                if ("3".equals(strO) || "2".equals(strO) || "4".equals(strO)) {
                    this.s.add(phzVar);
                    return;
                }
                return;
            }
            if (TextUtils.isEmpty(strO)) {
                return;
            }
            if ("3".equals(strO) || "1".equals(strO) || "4".equals(strO)) {
                this.s.add(phzVar);
            }
        }
    }

    private void b(phz phzVar) {
        if (Utils.o()) {
            if (TextUtils.equals(phzVar.i(), "2") || TextUtils.equals(phzVar.i(), "3")) {
                this.s.add(phzVar);
                return;
            }
            return;
        }
        if (TextUtils.equals(phzVar.i(), "1") || TextUtils.equals(phzVar.i(), "3")) {
            this.s.add(phzVar);
        }
    }

    private void e(List<phz> list) {
        LogUtil.a("DownloadDeviceResourceTool", "buildNeedUpdateDownLoadDeviceList enter ");
        this.p.clear();
        if (list.isEmpty()) {
            LogUtil.a("DownloadDeviceResourceTool", "buildNeedUpdateDownLoadDeviceList uuidList.isEmpty()");
            n();
            return;
        }
        final String strA = list.get(list.size() - 1).a();
        for (final phz phzVar : list) {
            if (EzPluginManager.b().j(phzVar.a())) {
                EzPluginManager.b().e(phzVar.a(), new PullListener() { // from class: esv
                    @Override // com.huawei.pluginmgr.filedownload.PullListener
                    public final void onPullingChange(pis pisVar, pit pitVar) {
                        this.e.a(phzVar, strA, pisVar, pitVar);
                    }
                });
            } else if (strA.equals(phzVar.a())) {
                LogUtil.a("DownloadDeviceResourceTool", "buildNeedUpdateDownLoadDeviceList finish checking");
                n();
            }
        }
    }

    /* synthetic */ void a(phz phzVar, String str, pis pisVar, pit pitVar) {
        LogUtil.a("DownloadDeviceResourceTool", "buildNeedUpdateDownLoadDeviceList result status = ", Integer.valueOf(pitVar.f()));
        c(pitVar, phzVar, str);
    }

    private void c(pit pitVar, phz phzVar, String str) {
        if (pitVar == null || phzVar == null || str == null) {
            LogUtil.j("DownloadDeviceResourceTool", "pullResultToOperation result ezPluginIndexInfo lastDeviceUuid null");
            Message messageObtain = Message.obtain();
            messageObtain.what = 101;
            this.k.sendMessage(messageObtain);
        }
        if (pitVar != null && pitVar.f() == 1) {
            LogUtil.a("DownloadDeviceResourceTool", "buildNeedUpdateDownLoadDeviceList is already new");
            Message messageObtain2 = Message.obtain();
            messageObtain2.obj = phzVar;
            messageObtain2.what = 98;
            this.k.sendMessage(messageObtain2);
        }
        if (str == null || phzVar == null || !str.equals(phzVar.a())) {
            return;
        }
        LogUtil.a("DownloadDeviceResourceTool", "buildNeedUpdateDownLoadDeviceList finish downloading last device");
        n();
    }

    private void n() {
        Message messageObtain = Message.obtain();
        messageObtain.what = 106;
        messageObtain.obj = this.p;
        this.k.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        CustomProgressDialog customProgressDialog = this.f33424c;
        if (customProgressDialog != null && customProgressDialog.isShowing()) {
            LogUtil.a("DownloadDeviceResourceTool", "startDownLoadProgress exists");
            return;
        }
        this.f33424c = new CustomProgressDialog(this.d);
        CustomProgressDialog.Builder builder = new CustomProgressDialog.Builder(this.d);
        this.e = builder;
        builder.e(this.d.getString(R.string.IDS_app_update_updating)).e(new View.OnClickListener() { // from class: esq.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("DownloadDeviceResourceTool", "startDownLoadProgress onclick cancel");
                esq.this.j();
            }
        });
        CustomProgressDialog customProgressDialogC = this.e.c();
        this.f33424c = customProgressDialogC;
        customProgressDialogC.setCanceledOnTouchOutside(false);
        if (!this.d.isFinishing()) {
            this.f33424c.show();
            this.e.b(0);
            this.e.b(UnitUtil.e(0.0d, 2, 0));
        }
        LogUtil.a("DownloadDeviceResourceTool", "mCustomProgressDialog.show()");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        CustomProgressDialog customProgressDialog = this.f33424c;
        if (customProgressDialog == null || !customProgressDialog.isShowing()) {
            return;
        }
        long j = this.l;
        if (j != 0) {
            long j2 = i;
            LogUtil.d("DownloadDeviceResourceTool", "showDownloadProgress downloaded", Long.valueOf(this.g + j2), "total", Long.valueOf(j));
            long j3 = ((j2 + this.g) * 100) / this.l;
            if (j3 > 99) {
                j3 = 99;
            }
            this.e.b((int) j3);
            String strE = UnitUtil.e(j3, 2, 0);
            this.e.b(strE);
            LogUtil.d("DownloadDeviceResourceTool", "showDownloadProgress percentNum", strE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        LogUtil.a("DownloadDeviceResourceTool", "enter handleCancel");
        if (njy.e(this.s)) {
            return;
        }
        Iterator<phz> it = this.s.iterator();
        while (it.hasNext()) {
            pis pisVarE = piu.c().e(it.next().a());
            if (pisVarE != null) {
                EzPluginManager.b().c(pisVarE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        this.s.removeAll(this.p);
        if (this.s.size() > 0) {
            a(this.s);
        } else {
            if (this.f == 2) {
                this.h.onSuccess();
                return;
            }
            LogUtil.a("DownloadDeviceResourceTool", "mDownLoadMode == " + this.f);
        }
    }

    private void a(List<phz> list) {
        LogUtil.a("DownloadDeviceResourceTool", "downLoadDescriptionJsonFile enter");
        q();
        Message messageObtain = Message.obtain();
        messageObtain.what = 102;
        this.k.sendMessage(messageObtain);
        this.l = 0L;
        this.i = 0L;
        for (final phz phzVar : list) {
            LogUtil.a("DownloadDeviceResourceTool", "downLoadDescriptionJsonFile for circle uuid:", phzVar.a());
            EzPluginManager.b().a(phzVar.a(), this.f33422a, new PullListener() { // from class: esp
                @Override // com.huawei.pluginmgr.filedownload.PullListener
                public final void onPullingChange(pis pisVar, pit pitVar) {
                    this.f33421c.d(phzVar, pisVar, pitVar);
                }
            });
        }
    }

    /* synthetic */ void d(phz phzVar, pis pisVar, pit pitVar) {
        LogUtil.a("DownloadDeviceResourceTool", "downLoadDescriptionJsonFile onPullingChange uuid:", phzVar.a(), ", result:", Integer.valueOf(pitVar.f()), ", Looper = ", Boolean.valueOf(Looper.getMainLooper() == Looper.myLooper()));
        d(pitVar, pisVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        if (this.d == null) {
            LogUtil.a("DownloadDeviceResourceTool", "stopLoading mActivity == null");
            return;
        }
        CommonDialog21 commonDialog21 = this.n;
        if (commonDialog21 != null && commonDialog21.isShowing() && !this.d.isFinishing()) {
            this.n.dismiss();
            this.n = null;
        }
        this.k.removeMessages(105);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LogUtil.a("DownloadDeviceResourceTool", "enter closeProgress");
        CustomProgressDialog customProgressDialog = this.f33424c;
        if (customProgressDialog == null || !customProgressDialog.isShowing() || this.d.isFinishing()) {
            return;
        }
        this.f33424c.cancel();
        LogUtil.a("DownloadDeviceResourceTool", "enter closeProgress cancel");
    }

    private void d(pit pitVar, pis pisVar) {
        LogUtil.a("DownloadDeviceResourceTool", "handleAfterDownLoad total size is", Integer.valueOf(pitVar.g()), "pull size is ", Integer.valueOf(pitVar.d()), " and uuid is ", pisVar.o());
        if (pitVar.f() != 1) {
            LogUtil.a("DownloadDeviceResourceTool", "handleAfterDownLoad fail");
            Message messageObtain = Message.obtain();
            messageObtain.what = 101;
            this.k.sendMessage(messageObtain);
            return;
        }
        this.l += (long) pitVar.g();
        long j = this.i + 1;
        this.i = j;
        LogUtil.a("DownloadDeviceResourceTool", "handleAfterDownLoad has downloaded ", Long.valueOf(j), " description file");
        if (this.i == this.s.size()) {
            LogUtil.a("DownloadDeviceResourceTool", "handleAfterDownLoad completed and download byte = ", Long.valueOf(this.l));
            h();
        }
    }

    private void h() {
        LogUtil.a("DownloadDeviceResourceTool", "enter downloadZipFile size：", Integer.valueOf(this.s.size()));
        this.m.clear();
        if (this.s.size() > 0) {
            a(0);
        }
    }

    private void a(final int i) {
        LogUtil.a("DownloadDeviceResourceTool", "enter downloadOneZipFile index = ", Integer.valueOf(i));
        LogUtil.a("DownloadDeviceResourceTool", "enter downloadOneZipFile mNeedDownloadDevices.size() = ", Integer.valueOf(this.s.size()));
        if (i >= this.s.size()) {
            return;
        }
        final phz phzVar = this.s.get(i);
        LogUtil.a("DownloadDeviceResourceTool", "enter downloadOneZipFile uuid = ", phzVar.a(), ", mDeviceType =", this.f33423b);
        EzPluginManager.b().d(phzVar.a(), this.f33422a, new PullListener() { // from class: esr
            @Override // com.huawei.pluginmgr.filedownload.PullListener
            public final void onPullingChange(pis pisVar, pit pitVar) {
                this.f33429c.a(phzVar, i, pisVar, pitVar);
            }
        });
    }

    /* synthetic */ void a(phz phzVar, int i, pis pisVar, pit pitVar) {
        if (pisVar == null || pitVar == null) {
            LogUtil.a("DownloadDeviceResourceTool", "onPullingChange param is null");
            c(101);
            return;
        }
        int iF = pitVar.f();
        ReleaseLogUtil.d("DEVMGR_DownloadDeviceResourceTool", "downloadOneZipFile result status = ", Integer.valueOf(iF), ",and uuid = ", pisVar.o());
        if (iF != 1) {
            if (iF == 0) {
                LogUtil.a("DownloadDeviceResourceTool", "downloadOneZipFile pull in progress");
                Message messageObtain = Message.obtain();
                messageObtain.what = 103;
                messageObtain.arg1 = pitVar.d();
                this.k.sendMessage(messageObtain);
                return;
            }
            ReleaseLogUtil.a("DEVMGR_DownloadDeviceResourceTool", "downloadOneZipFile failed");
            c(101);
            return;
        }
        ReleaseLogUtil.d("DEVMGR_DownloadDeviceResourceTool", "downloadOneZipFile one zip succeed");
        c(ResourceManager.c().d(phzVar.a()));
        esu.c(phzVar);
        this.m.add(phzVar);
        this.g += (long) pitVar.g();
        int i2 = i + 1;
        if (i2 < this.s.size()) {
            LogUtil.a("DownloadDeviceResourceTool", "downloadOneZipFile all zip is loading");
            a(i2);
        } else {
            LogUtil.a("DownloadDeviceResourceTool", "downloadOneZipFile all zip succeed");
            c(100);
        }
    }

    private void c(int i) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        this.k.sendMessage(messageObtain);
    }

    public void b() {
        q();
        Handler handler = this.k;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        CustomProgressDialog customProgressDialog = this.f33424c;
        if (customProgressDialog != null) {
            if (customProgressDialog.isShowing()) {
                this.f33424c.dismiss();
            }
            this.f33424c = null;
        }
        CustomProgressDialog.Builder builder = this.e;
        if (builder != null) {
            builder.e((View.OnClickListener) null);
            this.e = null;
        }
        this.d = null;
        this.j = null;
    }
}
