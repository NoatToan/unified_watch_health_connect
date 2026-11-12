package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginmgr.filedownload.PullListener;
import com.huawei.pluginmgr.hwwear.bean.DeviceDownloadSourceInfo;
import health.compact.a.CommonUtil;
import health.compact.a.EzPluginManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class esw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f33431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f33433c;
    private String d;
    private String e;
    private DeviceDownloadSourceInfo f;
    private est g;
    private long i;
    private long j;
    private String l;
    private String n;
    private String p;
    private long t;
    private int v;
    private List<String> w;
    private boolean r = false;
    private List<phz> s = new ArrayList(10);
    private final List<phz> q = new ArrayList(10);
    private List<phz> o = new ArrayList(10);
    private PullListener h = new PullListener() { // from class: esw.1
        @Override // com.huawei.pluginmgr.filedownload.PullListener
        public void onPullingChange(pis pisVar, pit pitVar) {
            int iF = pitVar.f();
            LogUtil.a("EcologyDevice_DownloadSingleDeviceResourceTool", "download index file status = ", Integer.valueOf(iF));
            if (iF == 1) {
                esw.this.e();
                return;
            }
            if (iF == -11) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 99;
                esw.this.m.sendMessage(messageObtain);
            } else {
                if (iF == 0) {
                    LogUtil.a("EcologyDevice_DownloadSingleDeviceResourceTool", "download index file status = ", Integer.valueOf(iF));
                    return;
                }
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 101;
                esw.this.m.sendMessage(messageObtain2);
            }
        }
    };
    private DownloadCallback<fcz> k = new DownloadCallback<fcz>() { // from class: esw.2
        @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onFinish(fcz fczVar) {
            LogUtil.a("EcologyDevice_DownloadSingleDeviceResourceTool", "Index File Download Finish.");
            esw.this.e();
        }

        @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
        public void onProgress(long j, long j2, boolean z, String str) {
            LogUtil.a("EcologyDevice_DownloadSingleDeviceResourceTool", "Index File Download onProgress");
        }

        @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
        public void onFail(int i, Throwable th) {
            ReleaseLogUtil.a("DEVMGR_EcologyDevice_DownloadSingleDeviceResourceTool", "Index File Download Fail, errCode:", Integer.valueOf(i), "errMsg:", th.getMessage());
            Message messageObtain = Message.obtain();
            messageObtain.what = 101;
            esw.this.m.sendMessage(messageObtain);
        }
    };
    private Handler m = new Handler(Looper.getMainLooper()) { // from class: esw.4
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (esw.this.f33433c != null) {
                LogUtil.d("EcologyDevice_DownloadSingleDeviceResourceTool", " handleMessage message what = ", Integer.valueOf(message.what));
                switch (message.what) {
                    case Constants.DEFAULT_PRO_BOT_MARGIN_PAD /* 98 */:
                        esw.this.d(message);
                        break;
                    case 99:
                        esw eswVar = esw.this;
                        eswVar.b(eswVar.d);
                        break;
                    case 100:
                        esw.this.h();
                        break;
                    case 101:
                        esw.this.a(10);
                        break;
                    case 102:
                        esw.this.c(0);
                        break;
                    case 103:
                        if (esw.this.t != 0) {
                            esw eswVar2 = esw.this;
                            eswVar2.c(eswVar2.e(message.arg1));
                        }
                        break;
                    case 106:
                        esw.this.j();
                        break;
                    case 107:
                        esw.this.i();
                        break;
                }
            }
        }
    };

    public esw(Context context, String str, int i, List<String> list, est estVar) {
        this.f33432b = 1;
        this.f33431a = null;
        if (context == null || TextUtils.isEmpty(str) || estVar == null) {
            return;
        }
        this.f33433c = context;
        this.d = str;
        this.f33432b = i;
        this.g = estVar;
        this.f33431a = phr.d(context, str);
        this.w = list;
    }

    public void e(DeviceDownloadSourceInfo deviceDownloadSourceInfo) {
        LogUtil.a("EcologyDevice_DownloadSingleDeviceResourceTool", "setDownloadSource");
        if (deviceDownloadSourceInfo == null) {
            LogUtil.j("EcologyDevice_DownloadSingleDeviceResourceTool", "setDownloadSource downloadSourceInfo is null");
            return;
        }
        this.f = deviceDownloadSourceInfo.m1659clone();
        this.r = true;
        this.v = deviceDownloadSourceInfo.getSite();
        this.p = deviceDownloadSourceInfo.getIndexName();
        String configurationPoint = deviceDownloadSourceInfo.getConfigurationPoint();
        this.e = configurationPoint;
        if (this.v != 1) {
            configurationPoint = phr.d(configurationPoint, this.d);
        }
        this.f33431a = configurationPoint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if ((!Utils.o() || CommonUtil.cl()) && pip.f45449c.containsKey(this.d)) {
            if (!this.r) {
                EzPluginManager.b().g(this.d);
            } else {
                efz.b().a(this.p);
            }
        } else {
            EzPluginManager.b().e();
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 99;
        this.m.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        est estVar = this.g;
        if (estVar != null) {
            estVar.onSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        est estVar = this.g;
        if (estVar != null) {
            estVar.onFailure(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        est estVar = this.g;
        if (estVar != null) {
            estVar.onDownload(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Message message) {
        Object obj = message.obj;
        if (obj instanceof phz) {
            this.q.add((phz) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (lql.a(this.f33433c)) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: esz
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.c();
                }
            });
        }
    }

    /* synthetic */ void c() {
        lql.b(this.f33433c, 2);
    }

    public void b() {
        String str;
        if (this.f33433c == null || TextUtils.isEmpty(this.d) || this.g == null) {
            return;
        }
        ReleaseLogUtil.d("EcologyDevice_DownloadSingleDeviceResourceTool", "start downloadIndexFile");
        if ((!Utils.o() || CommonUtil.cl()) && pip.f45449c.containsKey(this.d)) {
            if (CommonUtil.bu()) {
                str = pip.e.get(this.d);
            } else {
                str = pip.f45448b.get(this.d);
            }
            if (!this.r) {
                EzPluginManager.b().e(this.d, str, this.h);
            } else {
                efz.b().c(this.f, this.k, new etc());
            }
        } else {
            EzPluginManager.b().c(this.h);
        }
        if (lql.a(this.f33433c)) {
            Message messageObtainMessage = this.m.obtainMessage();
            messageObtainMessage.what = 107;
            this.m.sendMessage(messageObtainMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        List<phz> listE;
        phz phzVarB;
        LogUtil.a("EcologyDevice_DownloadSingleDeviceResourceTool", "getAllDeviceInfoFromIndexFile deviceType : ", str);
        this.s.clear();
        if ((!Utils.o() || CommonUtil.cl()) && pip.f45449c.containsKey(str)) {
            if (!this.r) {
                listE = EzPluginManager.b().c(str);
            } else {
                listE = efz.b().e(this.p);
            }
        } else {
            listE = EzPluginManager.b().d();
        }
        if (listE == null || listE.isEmpty()) {
            LogUtil.a("EcologyDevice_DownloadSingleDeviceResourceTool", "getAllDeviceInfoFromIndexFile no index info");
            return;
        }
        if (coq.d(this.w)) {
            a(10);
            return;
        }
        for (String str2 : this.w) {
            if (!this.r) {
                phzVarB = EzPluginManager.b().e(str2);
            } else {
                phzVarB = efz.b().b(this.p, str2);
            }
            if (phzVarB != null) {
                this.s.add(phzVarB);
            }
        }
        if (this.s.isEmpty()) {
            a(11);
        } else {
            d(this.s);
        }
    }

    private void d(List<phz> list) {
        boolean zE;
        LogUtil.a("EcologyDevice_DownloadSingleDeviceResourceTool", "buildNeedUpdateDownLoadDeviceList enter ");
        this.q.clear();
        final String strA = list.get(list.size() - 1).a();
        for (final phz phzVar : list) {
            if (!eev.d(phzVar.f()) && ResourceManager.c().d(phzVar.a()) != null) {
                pit pitVar = new pit();
                pitVar.e(1);
                d(pitVar, phzVar, strA);
            } else {
                if (!this.r) {
                    zE = EzPluginManager.b().j(phzVar.a());
                } else {
                    zE = efz.b().e(this.p, phzVar.a());
                }
                if (zE) {
                    if (!this.r) {
                        EzPluginManager.b().e(phzVar.a(), new PullListener() { // from class: etf
                            @Override // com.huawei.pluginmgr.filedownload.PullListener
                            public final void onPullingChange(pis pisVar, pit pitVar2) {
                                this.f33447c.c(phzVar, strA, pisVar, pitVar2);
                            }
                        });
                    } else {
                        efz.b().a(this.p, phzVar.a(), new PullListener() { // from class: eth
                            @Override // com.huawei.pluginmgr.filedownload.PullListener
                            public final void onPullingChange(pis pisVar, pit pitVar2) {
                                this.f33451b.b(phzVar, strA, pisVar, pitVar2);
                            }
                        });
                    }
                } else if (strA.equals(phzVar.a())) {
                    LogUtil.a("EcologyDevice_DownloadSingleDeviceResourceTool", "buildNeedUpdateDownLoadDeviceList finish checking");
                    g();
                }
            }
        }
    }

    /* synthetic */ void c(phz phzVar, String str, pis pisVar, pit pitVar) {
        d(pitVar, phzVar, str);
    }

    /* synthetic */ void b(phz phzVar, String str, pis pisVar, pit pitVar) {
        d(pitVar, phzVar, str);
    }

    private void d(pit pitVar, phz phzVar, String str) {
        if (pitVar == null || phzVar == null || str == null) {
            LogUtil.j("EcologyDevice_DownloadSingleDeviceResourceTool", "pullResultToOperation result ezPluginIndexInfo lastDeviceUuid null");
            Message messageObtain = Message.obtain();
            messageObtain.what = 101;
            this.m.sendMessage(messageObtain);
        }
        if (pitVar != null && pitVar.f() == 1) {
            LogUtil.a("EcologyDevice_DownloadSingleDeviceResourceTool", "buildNeedUpdateDownLoadDeviceList is already new");
            Message messageObtain2 = Message.obtain();
            messageObtain2.obj = phzVar;
            messageObtain2.what = 98;
            this.m.sendMessage(messageObtain2);
        }
        if (str == null || phzVar == null || !str.equals(phzVar.a())) {
            return;
        }
        LogUtil.a("EcologyDevice_DownloadSingleDeviceResourceTool", "buildNeedUpdateDownLoadDeviceList finish downloading last device");
        g();
    }

    private void g() {
        Message messageObtain = Message.obtain();
        messageObtain.what = 106;
        messageObtain.obj = this.q;
        this.m.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int e(int i) {
        long j = ((((long) i) + this.j) * 100) / this.t;
        if (j > 99) {
            j = 99;
        }
        return (int) j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.s.removeAll(this.q);
        if (this.s.size() > 0) {
            e(this.s);
            return;
        }
        LogUtil.a("EcologyDevice_DownloadSingleDeviceResourceTool", "mDownLoadMode == " + this.f33432b);
        h();
    }

    private void e(List<phz> list) {
        ReleaseLogUtil.d("EcologyDevice_DownloadSingleDeviceResourceTool", "downLoadDescriptionJsonFile enter");
        Message messageObtain = Message.obtain();
        messageObtain.what = 102;
        this.m.sendMessage(messageObtain);
        this.t = 0L;
        this.i = 0L;
        for (final phz phzVar : list) {
            LogUtil.a("EcologyDevice_DownloadSingleDeviceResourceTool", "downLoadDescriptionJsonFile for circle uuid:", phzVar.a());
            if (!this.r) {
                EzPluginManager.b().a(phzVar.a(), this.f33431a, new PullListener() { // from class: esx
                    @Override // com.huawei.pluginmgr.filedownload.PullListener
                    public final void onPullingChange(pis pisVar, pit pitVar) {
                        this.f33435a.a(phzVar, pisVar, pitVar);
                    }
                });
            } else {
                a(phzVar);
            }
        }
    }

    /* synthetic */ void a(phz phzVar, pis pisVar, pit pitVar) {
        LogUtil.a("EcologyDevice_DownloadSingleDeviceResourceTool", "downLoadDescriptionJsonFile onPullingChange uuid:", phzVar.a(), ", result:", Integer.valueOf(pitVar.f()), ", Looper = ", Boolean.valueOf(Looper.getMainLooper() == Looper.myLooper()));
        a(pitVar, pisVar);
    }

    private void a(phz phzVar) {
        final String strA = phzVar.a();
        if (this.f.getSite() == 1) {
            String indexName = this.f.getIndexName();
            phz phzVarB = efz.b().b(indexName, strA);
            pic picVarA = efz.b().a(indexName, strA);
            if (phzVarB != null) {
                this.l = phzVarB.g();
            }
            if (picVarA != null) {
                this.n = picVarA.g();
            }
        }
        this.f.setConfigurationPoint(this.f33431a);
        efz.b().b(this.f, phzVar.a(), new PullListener() { // from class: etb
            @Override // com.huawei.pluginmgr.filedownload.PullListener
            public final void onPullingChange(pis pisVar, pit pitVar) {
                this.f33442b.c(strA, pisVar, pitVar);
            }
        }, new etc());
    }

    /* synthetic */ void c(String str, pis pisVar, pit pitVar) {
        LogUtil.a("EcologyDevice_DownloadSingleDeviceResourceTool", "updateDescriptionForThirdDevice uuid: ", str, ", result: ", Integer.valueOf(pitVar.f()));
        a(pitVar, pisVar);
        dxz.c(this.f, this.l, this.n, pitVar, pisVar);
    }

    private void a(pit pitVar, pis pisVar) {
        LogUtil.a("EcologyDevice_DownloadSingleDeviceResourceTool", "handleAfterDownLoad total size is", Integer.valueOf(pitVar.g()), "pull size is ", Integer.valueOf(pitVar.d()), " and uuid is ", pisVar.o());
        if (pitVar.f() != 1) {
            LogUtil.a("EcologyDevice_DownloadSingleDeviceResourceTool", "handleAfterDownLoad fail");
            Message messageObtain = Message.obtain();
            messageObtain.what = 101;
            this.m.sendMessage(messageObtain);
            return;
        }
        long jG = this.t + ((long) pitVar.g());
        this.t = jG;
        if (jG == 0) {
            ReleaseLogUtil.d("DEVMGR_EcologyDevice_DownloadSingleDeviceResourceTool", "handleAfterDownLoad mNeedDownloadByte is 0");
            d(101);
            return;
        }
        long j = this.i + 1;
        this.i = j;
        LogUtil.a("EcologyDevice_DownloadSingleDeviceResourceTool", "handleAfterDownLoad has downloaded ", Long.valueOf(j), " description file");
        if (this.i == this.s.size()) {
            LogUtil.a("EcologyDevice_DownloadSingleDeviceResourceTool", "handleAfterDownLoad completed and download byte = ", Long.valueOf(this.t));
            d();
        }
    }

    private void d() {
        LogUtil.a("EcologyDevice_DownloadSingleDeviceResourceTool", "enter downloadZipFile size：", Integer.valueOf(this.s.size()));
        this.o.clear();
        if (this.s.size() > 0) {
            b(0);
        }
    }

    private void b(final int i) {
        final phz phzVar = this.s.get(i);
        LogUtil.a("EcologyDevice_DownloadSingleDeviceResourceTool", "enter downloadOneZipFile uuid = ", phzVar.a(), ", mDeviceType =", this.d);
        if (!this.r) {
            EzPluginManager.b().d(phzVar.a(), this.f33431a, new PullListener() { // from class: eta
                @Override // com.huawei.pluginmgr.filedownload.PullListener
                public final void onPullingChange(pis pisVar, pit pitVar) {
                    this.e.e(i, phzVar, pisVar, pitVar);
                }
            });
        } else {
            efz.b().a(this.f, phzVar.a(), new PullListener() { // from class: etd
                @Override // com.huawei.pluginmgr.filedownload.PullListener
                public final void onPullingChange(pis pisVar, pit pitVar) {
                    this.e.a(i, phzVar, pisVar, pitVar);
                }
            }, new etc());
        }
    }

    /* synthetic */ void a(int i, phz phzVar, pis pisVar, pit pitVar) {
        e(i, phzVar, pisVar, pitVar);
        dxz.c(this.f, this.l, this.n, pitVar, pisVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void e(int i, phz phzVar, pis pisVar, pit pitVar) {
        if (pisVar == null || pitVar == null) {
            LogUtil.a("EcologyDevice_DownloadSingleDeviceResourceTool", "onPullingChange param is null");
            d(101);
            return;
        }
        int iF = pitVar.f();
        LogUtil.a("EcologyDevice_DownloadSingleDeviceResourceTool", "downloadOneZipFile result status = ", Integer.valueOf(iF), ",and uuid = ", pisVar.o());
        if (iF != 1) {
            if (iF == 0) {
                LogUtil.a("EcologyDevice_DownloadSingleDeviceResourceTool", "downloadOneZipFile pull in progress");
                Message messageObtain = Message.obtain();
                messageObtain.what = 103;
                messageObtain.arg1 = pitVar.d();
                this.m.sendMessage(messageObtain);
                return;
            }
            LogUtil.a("EcologyDevice_DownloadSingleDeviceResourceTool", "downloadOneZipFile failed");
            d(101);
            return;
        }
        ReleaseLogUtil.d("EcologyDevice_DownloadSingleDeviceResourceTool", "downloadOneZipFile one zip succeed");
        esu.c(phzVar);
        ResourceManager.c().j(pisVar.o());
        this.o.add(phzVar);
        this.j += (long) pitVar.g();
        int i2 = i + 1;
        if (i2 < this.s.size()) {
            LogUtil.a("EcologyDevice_DownloadSingleDeviceResourceTool", "downloadOneZipFile all zip is loading");
            b(i2);
        } else {
            ReleaseLogUtil.d("EcologyDevice_DownloadSingleDeviceResourceTool", "downloadOneZipFile all zip succeed");
            d(100);
        }
    }

    private void d(int i) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        this.m.sendMessage(messageObtain);
    }

    public void a() {
        Handler handler = this.m;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f33433c = null;
        this.g = null;
    }
}
