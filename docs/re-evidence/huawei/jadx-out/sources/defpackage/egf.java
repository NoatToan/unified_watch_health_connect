package defpackage;

import android.content.Context;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginmgr.EzPluginPullerCallback;
import com.huawei.pluginmgr.filedownload.PullHealthBiListener;
import com.huawei.pluginmgr.filedownload.PullListener;
import com.huawei.pluginmgr.hwwear.bean.DeviceDownloadSourceInfo;
import health.compact.a.CommonUtil;
import health.compact.a.EzPluginManager;
import health.compact.a.IoUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class egf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static egf f32928a;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f32929b = BaseApplication.getContext();

    private egf() {
    }

    public static egf b() {
        egf egfVar;
        synchronized (e) {
            if (f32928a == null) {
                f32928a = new egf();
            }
            egfVar = f32928a;
        }
        return egfVar;
    }

    public void e(DeviceDownloadSourceInfo deviceDownloadSourceInfo, String str, final DownloadCallback<fcz> downloadCallback, final PullHealthBiListener pullHealthBiListener) {
        if (deviceDownloadSourceInfo == null || downloadCallback == null) {
            LogUtil.a("HealthCloudDownloadPuller", "downloadSourceInfo or ezPluginFileInfo or callback is null");
            return;
        }
        LogUtil.a("HealthCloudDownloadPuller", "pullIndexFile begin");
        String configurationPoint = deviceDownloadSourceInfo.getConfigurationPoint();
        String indexName = deviceDownloadSourceInfo.getIndexName();
        fda fdaVar = new fda(configurationPoint, new HashMap());
        fdy.c(new fdc.b().b(fdaVar).b(indexName).a(str).e(true).a(new DownloadCallback<fcz>() { // from class: egf.3
            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onFinish(fcz fczVar) {
                downloadCallback.onFinish(fczVar);
                egf.this.c(pullHealthBiListener, fczVar.c(), fczVar.c(), new pis());
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onProgress(long j, long j2, boolean z, String str2) {
                downloadCallback.onProgress(j, j2, z, str2);
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onFail(int i, Throwable th) {
                egf.this.c(pullHealthBiListener, i, i, new pis());
                downloadCallback.onFail(i, th);
            }
        }).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(PullHealthBiListener pullHealthBiListener, int i, int i2, pis pisVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resultCode", i2);
        } catch (JSONException unused) {
            LogUtil.e("HealthCloudDownloadPuller", "healthCloudBiCallback JSONException");
        }
        if (pullHealthBiListener != null) {
            pullHealthBiListener.onPullHealthBiCalling(i, jSONObject.toString(), pisVar);
        }
    }

    private String e(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ts", System.currentTimeMillis());
            jSONObject.put("configId", str);
        } catch (JSONException unused) {
            LogUtil.e("HealthCloudDownloadPuller", "getDownloadParam JSONException");
        }
        return jSONObject.toString().trim();
    }

    public void b(phy phyVar, PullListener pullListener, EzPluginPullerCallback ezPluginPullerCallback, PullHealthBiListener pullHealthBiListener) {
        if (pullListener == null || ezPluginPullerCallback == null) {
            LogUtil.a("HealthCloudDownloadPuller", "downloadDescription callback or ezPluginHealthCloudCallback is null");
        } else {
            a(phyVar, pullListener, ezPluginPullerCallback, pullHealthBiListener);
        }
    }

    private void a(final phy phyVar, final PullListener pullListener, final EzPluginPullerCallback ezPluginPullerCallback, final PullHealthBiListener pullHealthBiListener) {
        final pis pisVar = new pis();
        final pit pitVar = new pit();
        pisVar.h(phyVar.b());
        pisVar.b(pullListener);
        DeviceDownloadSourceInfo deviceDownloadSourceInfoE = phyVar.e();
        if (deviceDownloadSourceInfoE == null) {
            pitVar.e(1002);
            pullListener.onPullingChange(pisVar, pitVar);
            return;
        }
        pisVar.g(e(deviceDownloadSourceInfoE.getConfigurationPoint()));
        if (deviceDownloadSourceInfoE.getSite() == 1) {
            pisVar.d(pullHealthBiListener);
        }
        String str = phyVar.b() + "_description";
        fda fdaVar = new fda(deviceDownloadSourceInfoE.getConfigurationPoint(), new HashMap());
        final String strB = egk.b(phyVar.b());
        fdy.c(new fdc.b().b(fdaVar).b(str).a(strB).a(new DownloadCallback<fcz>() { // from class: egf.1
            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onProgress(long j, long j2, boolean z, String str2) {
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onFinish(fcz fczVar) throws Throwable {
                egf.this.c(pullHealthBiListener, fczVar.c(), fczVar.c(), pisVar);
                pitVar.b(egf.this.d(strB, phyVar.b(), ezPluginPullerCallback).a());
                pitVar.e(1);
                pullListener.onPullingChange(pisVar, pitVar);
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onFail(int i, Throwable th) {
                egf.this.c(pullHealthBiListener, i, i, pisVar);
                pitVar.e(i);
                pullListener.onPullingChange(pisVar, pitVar);
            }
        }).a());
    }

    public void b(final String str, phy phyVar, final PullListener pullListener, PullHealthBiListener pullHealthBiListener) {
        e(phyVar, pullHealthBiListener, new PullListener() { // from class: egg
            @Override // com.huawei.pluginmgr.filedownload.PullListener
            public final void onPullingChange(pis pisVar, pit pitVar) throws Throwable {
                this.e.a(str, pullListener, pisVar, pitVar);
            }
        });
    }

    /* synthetic */ void a(String str, PullListener pullListener, pis pisVar, pit pitVar) throws Throwable {
        if (pitVar == null || pitVar.f() != 1) {
            if (pullListener != null) {
                pullListener.onPullingChange(pisVar, pitVar);
            }
        } else {
            LogUtil.a("HealthCloudDownloadPuller", "onPullingChange onResult is 200");
            String strA = pisVar.a();
            if ("6d5416d9-2167-41df-ab10-c492e152b44f".equals(str)) {
                strA = egk.d(str);
            }
            c(strA, pullListener, pisVar, pitVar);
        }
    }

    private void e(phy phyVar, PullHealthBiListener pullHealthBiListener, PullListener pullListener) {
        pis pisVar = new pis();
        DeviceDownloadSourceInfo deviceDownloadSourceInfoE = phyVar.e();
        if (deviceDownloadSourceInfoE != null && deviceDownloadSourceInfoE.getSite() == 1) {
            pisVar.g(e(deviceDownloadSourceInfoE.getConfigurationPoint()));
            pisVar.d(pullHealthBiListener);
        }
        pisVar.a(egk.d(phyVar.b()));
        pisVar.b(pullListener);
        pisVar.h(phyVar.b());
        b(phyVar, pullListener, pullHealthBiListener, pisVar, phyVar.c());
    }

    private void b(phy phyVar, final PullListener pullListener, final PullHealthBiListener pullHealthBiListener, final pis pisVar, final pic picVar) {
        final pit pitVar = new pit();
        if (egk.c() <= picVar.a()) {
            LogUtil.a("HealthCloudDownloadPuller", "storage is not enough");
            pitVar.e(-9);
            pullListener.onPullingChange(pisVar, pitVar);
            return;
        }
        fda fdaVar = new fda(phyVar.e().getConfigurationPoint(), new HashMap());
        String str = phyVar.b() + "_new_v1.1";
        final String strC = egk.c(phyVar.j(), phyVar.b());
        fdy.c(new fdc.b().b(fdaVar).b(str).a(strC).a(new DownloadCallback<fcz>() { // from class: egf.4
            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onFinish(fcz fczVar) {
                pitVar.e(1);
                if (piu.b(picVar.c(), strC)) {
                    if ((CommonUtil.n(egf.this.f32929b, picVar.d()) & 2) != 0) {
                        if (pil.e(strC, pisVar.a()) <= 0) {
                            LogUtil.a("HealthCloudDownloadPuller", "onFinish: unzip failure");
                            pitVar.e(-6);
                        }
                        egk.a(strC, "unzip deleteFile is = ");
                    }
                    egf.this.c(pullHealthBiListener, fczVar.c(), fczVar.c(), pisVar);
                    pullListener.onPullingChange(pisVar, pitVar);
                    return;
                }
                pitVar.e(-6);
                pullListener.onPullingChange(pisVar, pitVar);
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onProgress(long j, long j2, boolean z, String str2) {
                pitVar.e(0);
                pitVar.c((int) j);
                pullListener.onPullingChange(pisVar, pitVar);
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onFail(int i, Throwable th) {
                egf.this.c(pullHealthBiListener, i, i, pisVar);
                pitVar.e(i);
                pullListener.onPullingChange(pisVar, pitVar);
            }
        }).a());
    }

    private String c(Context context, String str) throws Throwable {
        FileInputStream fileInputStream;
        LogUtil.a("HealthCloudDownloadPuller", "enter readFileToData: filePath = ", str);
        if (str == null || context == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(1024);
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(new File(str));
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        sb.append(new String(bArr, 0, i, "UTF-8"));
                    }
                    IoUtils.c(fileInputStream);
                } catch (IOException unused) {
                    fileInputStream2 = fileInputStream;
                    LogUtil.e("HealthCloudDownloadPuller", "readFileToData IOException");
                    IoUtils.c(fileInputStream2);
                } catch (Throwable th) {
                    th = th;
                    IoUtils.c(fileInputStream);
                    throw th;
                }
            } catch (IOException unused2) {
            }
            return sb.toString();
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = fileInputStream2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public pic d(String str, String str2, EzPluginPullerCallback ezPluginPullerCallback) throws Throwable {
        String strC = c(this.f32929b, str);
        LogUtil.d("HealthCloudDownloadPuller", "downloadDescriptionFile descriptionJson success");
        pic picVarA = phw.a(strC);
        if (ezPluginPullerCallback == null) {
            EzPluginManager.b().d(picVarA, str2);
            return picVarA;
        }
        ezPluginPullerCallback.setEzPluginInfoCache(picVarA, str2);
        return picVarA;
    }

    private void c(String str, PullListener pullListener, pis pisVar, pit pitVar) throws Throwable {
        FileOutputStream fileOutputStream;
        LogUtil.a("HealthCloudDownloadPuller", "createDoneMarkFile enter create done file, path is ", str);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                File file = new File(str + File.separator + "done");
                if (!file.getParentFile().exists()) {
                    LogUtil.a("HealthCloudDownloadPuller", "createDoneMarkFile isDirMade is ", Boolean.valueOf(file.mkdir()));
                }
                if (!file.exists()) {
                    LogUtil.a("HealthCloudDownloadPuller", "createDoneMarkFile isNewFileCreated is ", Boolean.valueOf(file.createNewFile()));
                }
                String strValueOf = String.valueOf(new Date().getTime() / 1000);
                LogUtil.a("HealthCloudDownloadPuller", "createDoneMarkFile timeStamp is =", strValueOf);
                fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bytes = strValueOf.getBytes("UTF-8");
                    fileOutputStream.write(bytes, 0, bytes.length);
                    if (pullListener != null) {
                        pullListener.onPullingChange(pisVar, pitVar);
                    }
                    IoUtils.c(fileOutputStream);
                } catch (IOException unused) {
                    fileOutputStream2 = fileOutputStream;
                    LogUtil.e("HealthCloudDownloadPuller", "createDoneMarkFile createDoneFile IOException");
                    pitVar.e(-1);
                    if (pullListener != null) {
                        pullListener.onPullingChange(pisVar, pitVar);
                    }
                    IoUtils.c(fileOutputStream2);
                } catch (Throwable th) {
                    th = th;
                    IoUtils.c(fileOutputStream);
                    throw th;
                }
            } catch (IOException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = fileOutputStream2;
        }
    }
}
