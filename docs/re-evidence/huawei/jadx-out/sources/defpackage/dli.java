package defpackage;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.widget.Toast;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.configresource.R;
import com.huawei.health.configresource.downloaddevicemanager.DownloadPullerCallback;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DeviceDownloadSourceInfo;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginmgr.filedownload.PullHealthBiListener;
import com.huawei.pluginmgr.filedownload.PullListener;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import health.compact.a.CommonUtil;
import health.compact.a.IoUtils;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes26.dex */
class dli {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f31947a = new Object();
    private static dli d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f31948c = BaseApplication.getContext();

    private dli() {
    }

    public static dli c() {
        dli dliVar;
        synchronized (f31947a) {
            if (d == null) {
                d = new dli();
            }
            dliVar = d;
        }
        return dliVar;
    }

    public void b(pis pisVar) {
        piu.c().a(pisVar);
    }

    public void d(String str, dky dkyVar, String str2, boolean z, PullListener pullListener) {
        LogUtil.a("ResourceHandlePuller", "pullIndexFile pull json task");
        pis pisVarE = e(str, dkyVar, str2, z, pullListener);
        pisVarE.g(e(str, pisVarE, true));
        if (pip.f45447a.containsValue(str) || "device_index_all".equals(str) || "plugin_index".equals(str) || "index_sport_intensity".equals(pisVarE.b())) {
            a(str, dkyVar, pisVarE);
            pisVarE.j("GET");
        }
        piu.c().e(pisVarE);
    }

    private pis e(String str, dky dkyVar, String str2, boolean z, PullListener pullListener) {
        pis pisVar = new pis();
        pisVar.a(str2);
        pisVar.i(dkyVar.d());
        pisVar.d(dkyVar.a());
        pisVar.b(pullListener);
        pisVar.e(0);
        pisVar.d(z);
        pisVar.c(str);
        return pisVar;
    }

    private void a(String str, dky dkyVar, pis pisVar) {
        String strD = dkyVar.d();
        if ("device_index_all".equals(str)) {
            strD = dkyVar.d() + "device_index_all";
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(1003), strD);
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        pisVar.e(strE);
    }

    private void c(String str, String str2, String str3, String str4, PullListener pullListener) {
        LogUtil.a("ResourceHandlePuller", "pullDescriptionFile pull description task");
        pis pisVar = new pis();
        pisVar.g(e(a(str, str2, str3, pullListener, pisVar), pisVar, false));
        pisVar.d(str4);
        piu.c().e(pisVar);
    }

    private String a(String str, String str2, String str3, PullListener pullListener, pis pisVar) {
        pisVar.a(str3);
        pisVar.i(str2);
        pisVar.b(pullListener);
        pisVar.e(0);
        String str4 = str + "_description";
        pisVar.c(str4);
        return str4;
    }

    private String e(String str, pis pisVar, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!c(jSONObject, pisVar, z, true)) {
                jSONObject.put(RecommendConstants.FILE_ID, str);
                jSONObject.put(RecommendConstants.VER, "0");
            }
        } catch (JSONException unused) {
            LogUtil.e("ResourceHandlePuller", "getDownloadParam JSONException");
        }
        return jSONObject.toString().trim();
    }

    private boolean c(JSONObject jSONObject, pis pisVar, boolean z, boolean z2) throws JSONException {
        int iIndexOf;
        String strJ = pisVar.j();
        if (TextUtils.isEmpty(strJ) || (iIndexOf = strJ.indexOf("/commonAbility/configCenter/")) == -1) {
            return false;
        }
        pisVar.c(iIndexOf > 0);
        if (!z || !pisVar.f()) {
            return false;
        }
        pisVar.j("POST");
        e(jSONObject, pisVar, strJ, iIndexOf, z2);
        b(jSONObject);
        return true;
    }

    private void e(JSONObject jSONObject, pis pisVar, String str, int i, boolean z) throws JSONException {
        jSONObject.put("ts", System.currentTimeMillis());
        jSONObject.put("source", 1);
        int i2 = i + 28;
        pisVar.i(str.substring(0, i2) + "getConfigInfo");
        int iIndexOf = str.indexOf("?", i2);
        if (iIndexOf > 0) {
            jSONObject.put("configId", str.substring(i2, iIndexOf));
            if (z) {
                b(jSONObject, str.substring(iIndexOf + 1));
                return;
            }
            return;
        }
        jSONObject.put("configId", str.substring(i2));
    }

    private void b(JSONObject jSONObject, String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String[] strArrSplit = str.split("=");
        if (strArrSplit.length == 0 || strArrSplit.length % 2 != 0) {
            LogUtil.j("ResourceHandlePuller", "not support queryString=\"", str, "\"");
            return;
        }
        HashMap map = new HashMap(strArrSplit.length / 2);
        for (int i = 0; i < strArrSplit.length; i += 2) {
            map.put(strArrSplit[i], strArrSplit[i + 1]);
        }
        jSONObject.put("matchRules", new JSONObject(map));
    }

    private void b(JSONObject jSONObject) throws JSONException {
        String strE = piu.e();
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        HashMap map = new HashMap(1);
        map.put("Device-ID", strE);
        jSONObject.put("greyRules", new JSONObject(map));
    }

    public void d(pis pisVar, PullListener pullListener) {
        pisVar.b(pullListener);
        pisVar.e(2);
        pisVar.g(e(pisVar.b(), pisVar, false));
        piu.c().e(pisVar);
    }

    public void c(String str, String str2, String str3, edl edlVar, PullListener pullListener) {
        LogUtil.a("ResourceHandlePuller", "fileUrlJson is ", str3);
        b(str, new dky(str, str2, str3, edlVar), (String) null, pullListener);
    }

    public void e(final String str, dky dkyVar, final PullListener pullListener, PullHealthBiListener pullHealthBiListener) {
        d(str, dkyVar, pullHealthBiListener, new PullListener() { // from class: dli.5
            @Override // com.huawei.pluginmgr.filedownload.PullListener
            public void onPullingChange(pis pisVar, pit pitVar) throws Throwable {
                if (pitVar != null && pitVar.f() == 1) {
                    LogUtil.a("ResourceHandlePuller", "onPullingChange onResult is 200");
                    String strA = pisVar.a();
                    if ("6d5416d9-2167-41df-ab10-c492e152b44f".equals(str)) {
                        strA = dli.this.d(str);
                    }
                    dli.this.c(strA, pullListener, pisVar, pitVar);
                    return;
                }
                PullListener pullListener2 = pullListener;
                if (pullListener2 != null) {
                    pullListener2.onPullingChange(pisVar, pitVar);
                }
            }
        });
    }

    private void d(String str, dky dkyVar, PullHealthBiListener pullHealthBiListener, PullListener pullListener) {
        pis pisVar = new pis();
        DeviceDownloadSourceInfo deviceDownloadSourceInfoC = dkyVar.c();
        if (deviceDownloadSourceInfoC != null && deviceDownloadSourceInfoC.getSite() == 1) {
            pisVar.d(pullHealthBiListener);
        }
        pisVar.i(dkyVar.g());
        pisVar.g(e(dkyVar.c().getConfigurationPoint()));
        pisVar.c(str);
        String strD = d(dkyVar.b());
        if (TextUtils.isEmpty(strD)) {
            strD = d(dkyVar.b());
        }
        pisVar.a(strD);
        pisVar.b(pullListener);
        pisVar.h(dkyVar.b());
        edl edlVarE = dkyVar.e();
        pisVar.e(CommonUtil.n(this.f31948c, edlVarE.a()));
        if (e() <= edlVarE.d()) {
            LogUtil.a("ResourceHandlePuller", "storage is not enough");
            pit pitVar = new pit();
            pitVar.e(-9);
            pullListener.onPullingChange(pisVar, pitVar);
            return;
        }
        d(pullHealthBiListener, pullListener, edlVarE, dkyVar, pisVar);
    }

    private String e(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ts", System.currentTimeMillis());
            jSONObject.put("configId", str);
        } catch (JSONException unused) {
            LogUtil.e("ResourceHandlePuller", "getDownloadParam JSONException");
        }
        return jSONObject.toString().trim();
    }

    private void d(PullHealthBiListener pullHealthBiListener, PullListener pullListener, edl edlVar, dky dkyVar, pis pisVar) {
        pit pitVar = new pit();
        String strA = a(pisVar);
        LogUtil.a("ResourceHandlePuller", "execHealthTask downloadCachePath", strA);
        d(new AnonymousClass4(pitVar, pullListener, pisVar, edlVar, strA, pullHealthBiListener), dkyVar, pisVar, strA);
    }

    /* JADX INFO: renamed from: dli$4, reason: invalid class name */
    class AnonymousClass4 implements DownloadCallback<fcz> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ PullListener f31958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PullHealthBiListener f31959b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ edl f31960c;
        final /* synthetic */ String e;
        final /* synthetic */ pit g;
        final /* synthetic */ pis j;

        AnonymousClass4(pit pitVar, PullListener pullListener, pis pisVar, edl edlVar, String str, PullHealthBiListener pullHealthBiListener) {
            this.g = pitVar;
            this.f31958a = pullListener;
            this.j = pisVar;
            this.f31960c = edlVar;
            this.e = str;
            this.f31959b = pullHealthBiListener;
        }

        @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onFinish(fcz fczVar) {
            this.g.e(1);
            if (!fczVar.b()) {
                LogUtil.a("ResourceHandlePuller", "execHealthTask getIsFromCloud", Boolean.valueOf(fczVar.b()));
                this.f31958a.onPullingChange(this.j, this.g);
                return;
            }
            if (piu.b(this.f31960c.e(), this.e)) {
                if ((CommonUtil.n(dli.this.f31948c, this.f31960c.a()) & 2) != 0) {
                    if (pil.e(this.e, this.j.a()) <= 0) {
                        LogUtil.a("ResourceHandlePuller", "onFinish: unzip failure");
                        this.g.e(-6);
                    }
                    dli.this.c(this.e);
                }
                dli.this.c(this.f31959b, fczVar.c(), fczVar.c(), this.j);
                this.f31958a.onPullingChange(this.j, this.g);
                return;
            }
            LogUtil.a("ResourceHandlePuller", this.f31960c.c() + " onFinish verifyHashCode fail", -6);
            this.f31958a.onPullingChange(this.j, this.g);
        }

        @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
        public void onProgress(long j, long j2, boolean z, String str) {
            this.g.e(0);
            this.g.c((int) j);
            this.f31958a.onPullingChange(this.j, this.g);
        }

        @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
        public void onFail(int i, Throwable th) {
            ReleaseLogUtil.a("R_ResourceHandlePuller", "execHealthTask on Fail: ", th.getMessage());
            if (i == 1005 && !CommonUtil.bu()) {
                HandlerExecutor.c(new Runnable() { // from class: dlj
                    @Override // java.lang.Runnable
                    public final void run() {
                        Toast.makeText(BaseApplication.getContext(), R.string.IDS_download_error_tips, 1).show();
                    }
                });
            }
            dli.this.c(this.f31959b, i, i, this.j);
            this.g.e(i);
            this.f31958a.onPullingChange(this.j, this.g);
        }
    }

    private void d(DownloadCallback downloadCallback, dky dkyVar, pis pisVar, String str) {
        String[] list;
        File file = new File(pisVar.a() + File.separator + dkyVar.b());
        LogUtil.a("ResourceHandlePuller", "downloadFileResponse file: ", file.getPath());
        if (!file.exists()) {
            LogUtil.a("ResourceHandlePuller", "downloadFileResponse file not exists");
            fdy.c(d(dkyVar, pisVar.b(), downloadCallback, str, false), true);
        } else if (file.exists() && file.isDirectory() && ((list = file.list()) == null || list.length == 0)) {
            LogUtil.a("ResourceHandlePuller", "downloadFileResponse file directory empty");
            fdy.c(d(dkyVar, pisVar.b(), downloadCallback, str, false), true);
        } else {
            fdy.c(d(dkyVar, pisVar.b(), downloadCallback, str, true), true);
        }
    }

    private fdc d(dky dkyVar, String str, DownloadCallback downloadCallback, String str2, boolean z) {
        return new fdc.b().b(new fda(dkyVar.c().getConfigurationPoint(), new HashMap())).b(str).a(str2).e(z).a(downloadCallback).a();
    }

    private String a(pis pisVar) {
        if ((pisVar.g() & 6) != 0) {
            try {
                String str = this.f31948c.getDir("cache", 0).getCanonicalPath() + File.pathSeparator;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(lsp.b(this.f31948c, pisVar.j() + pisVar.o()));
                return sb.toString();
            } catch (IOException e) {
                LogUtil.e("ResourceHandlePuller", "getFilePathName:getCanonicalPath ex=", ExceptionUtils.c(e));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(File.pathSeparator);
                sb2.append(lsp.b(this.f31948c, pisVar.j() + pisVar.o()));
                return sb2.toString();
            }
        }
        return pisVar.a() + ".tmp";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(PullHealthBiListener pullHealthBiListener, int i, int i2, pis pisVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resultCode", i2);
        } catch (JSONException unused) {
            LogUtil.e("ResourceHandlePuller", "healthCloudBiCallback JSONException");
        }
        if (pullHealthBiListener != null) {
            pullHealthBiListener.onPullHealthBiCalling(i, jSONObject.toString(), pisVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            LogUtil.a("ResourceHandlePuller", "deleteDownloadFile", str, Boolean.valueOf(file.delete()));
        }
    }

    private void b(final String str, dky dkyVar, String str2, final PullListener pullListener) {
        e(str, dkyVar, str2, new PullListener() { // from class: dli.2
            @Override // com.huawei.pluginmgr.filedownload.PullListener
            public void onPullingChange(pis pisVar, pit pitVar) throws Throwable {
                if (pitVar != null && pitVar.f() == 1) {
                    LogUtil.a("ResourceHandlePuller", "onPullingChange onResult is 200");
                    String strA = pisVar.a();
                    if ("6d5416d9-2167-41df-ab10-c492e152b44f".equals(str)) {
                        strA = dli.this.d(str);
                    }
                    dli.this.c(strA, pullListener, pisVar, pitVar);
                    return;
                }
                PullListener pullListener2 = pullListener;
                if (pullListener2 != null) {
                    pullListener2.onPullingChange(pisVar, pitVar);
                }
            }
        });
    }

    private void e(String str, dky dkyVar, String str2, PullListener pullListener) {
        pis pisVar = new pis();
        edl edlVarE = dkyVar.e();
        pisVar.i(dkyVar.g());
        pisVar.d(dkyVar.a());
        if ("6d5416d9-2167-41df-ab10-c492e152b44f".equals(str)) {
            String str3 = str + "_new_v1.1";
            pisVar.g(e(str3, pisVar, false));
            pisVar.a(edf.e);
            pisVar.c(str3);
        } else {
            pisVar.g(e(str, pisVar, false));
            pisVar.c(str);
        }
        d(dkyVar, str2, pullListener, pisVar, edlVarE);
    }

    private void d(dky dkyVar, String str, PullListener pullListener, pis pisVar, edl edlVar) {
        if (TextUtils.isEmpty(str)) {
            str = d(dkyVar.b());
        }
        pisVar.a(str);
        pisVar.b(edlVar.e());
        pisVar.b(pullListener);
        pisVar.e(CommonUtil.n(this.f31948c, edlVar.a()));
        pisVar.a(edlVar.d());
        pisVar.h(dkyVar.b());
        if (e() > edlVar.d()) {
            LogUtil.a("ResourceHandlePuller", "addTask plugin task");
            piu.c().e(pisVar);
        } else {
            LogUtil.a("ResourceHandlePuller", "addTask this torage is not enough");
            pit pitVar = new pit();
            pitVar.e(-9);
            pullListener.onPullingChange(pisVar, pitVar);
        }
    }

    public void c(String str, String str2, PullListener pullListener, String str3) {
        LogUtil.d("ResourceHandlePuller", "downloadDescription eneter downlodDescription.fileUrlJson is ", str3);
        a(str, str2, edf.f32777a + str + File.separator + "description.json", str3, pullListener);
    }

    public void b(dky dkyVar, PullListener pullListener, DownloadPullerCallback downloadPullerCallback, PullHealthBiListener pullHealthBiListener) {
        if (pullListener == null || downloadPullerCallback == null) {
            LogUtil.a("ResourceHandlePuller", "downloadDescription callback or ezPluginHealthCloudCallback is null");
        } else {
            a(dkyVar, pullListener, downloadPullerCallback, pullHealthBiListener);
        }
    }

    private void a(dky dkyVar, final PullListener pullListener, final DownloadPullerCallback downloadPullerCallback, PullHealthBiListener pullHealthBiListener) {
        final String str = edf.f32777a + dkyVar.b() + File.separator + "description.json";
        a(dkyVar, str, pullHealthBiListener, new PullListener() { // from class: dli.3
            @Override // com.huawei.pluginmgr.filedownload.PullListener
            public void onPullingChange(pis pisVar, pit pitVar) throws Throwable {
                dli.this.d(pisVar, pitVar, str, pullListener, downloadPullerCallback);
            }
        });
    }

    private void a(dky dkyVar, String str, PullHealthBiListener pullHealthBiListener, PullListener pullListener) {
        LogUtil.a("ResourceHandlePuller", "pullDescriptionFile pull description task");
        pis pisVar = new pis();
        DeviceDownloadSourceInfo deviceDownloadSourceInfoC = dkyVar.c();
        if (deviceDownloadSourceInfoC != null && deviceDownloadSourceInfoC.getSite() == 1) {
            pisVar.d(pullHealthBiListener);
        }
        a(dkyVar.b(), dkyVar.d(), str, pullListener, pisVar);
        pisVar.g(e(dkyVar.c().getConfigurationPoint()));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(pullHealthBiListener, pisVar, new pit(), pullListener);
        fdc fdcVarD = d(dkyVar, pisVar.b(), (DownloadCallback) anonymousClass1, str, true);
        if (!new File(str).exists()) {
            fdcVarD = d(dkyVar, pisVar.b(), (DownloadCallback) anonymousClass1, str, false);
        }
        fdy.c(fdcVarD, true);
    }

    /* JADX INFO: renamed from: dli$1, reason: invalid class name */
    class AnonymousClass1 implements DownloadCallback<fcz> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ pis f31950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PullListener f31951c;
        final /* synthetic */ pit d;
        final /* synthetic */ PullHealthBiListener e;

        AnonymousClass1(PullHealthBiListener pullHealthBiListener, pis pisVar, pit pitVar, PullListener pullListener) {
            this.e = pullHealthBiListener;
            this.f31950b = pisVar;
            this.d = pitVar;
            this.f31951c = pullListener;
        }

        @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onFinish(fcz fczVar) {
            LogUtil.a("ResourceHandlePuller", "pullDescriptionFile onFinish, data is: ", fczVar.toString());
            dli.this.c(this.e, fczVar.c(), fczVar.c(), this.f31950b);
            this.d.e(1);
            this.f31951c.onPullingChange(this.f31950b, this.d);
        }

        @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
        public void onProgress(long j, long j2, boolean z, String str) {
            LogUtil.a("ResourceHandlePuller", "pullDescriptionFile onProgress, handleBytes: ", Long.valueOf(j), ", contentLength: ", Long.valueOf(j2), ", isDone: ", Boolean.valueOf(z), ", fileId: ", str);
        }

        @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
        public void onFail(int i, Throwable th) {
            dli.this.c(this.e, i, i, this.f31950b);
            ReleaseLogUtil.a("R_ResourceHandlePuller", "pullDescriptionFile on Fail: ", th.getMessage());
            if (i == 1005 && !CommonUtil.bu()) {
                LogUtil.a("ResourceHandlePuller", "pullDescriptionFile toast");
                HandlerExecutor.c(new Runnable() { // from class: dlh
                    @Override // java.lang.Runnable
                    public final void run() {
                        Toast.makeText(BaseApplication.getContext(), R.string.IDS_download_error_tips, 1).show();
                    }
                });
            }
            this.d.e(i);
            this.f31951c.onPullingChange(this.f31950b, this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(pis pisVar, pit pitVar, String str, PullListener pullListener, DownloadPullerCallback downloadPullerCallback) throws Throwable {
        if (pitVar == null) {
            LogUtil.j("ResourceHandlePuller", "downloadDescriptionFile onPullingChange result is null");
            pullListener.onPullingChange(pisVar, null);
            return;
        }
        int iF = pitVar.f();
        if (iF != 1) {
            if (iF == 0) {
                return;
            }
            pullListener.onPullingChange(pisVar, pitVar);
            return;
        }
        String strE = e(this.f31948c, str);
        LogUtil.d("ResourceHandlePuller", "downloadDescriptionFile descriptionJson success");
        edl edlVarB = dlb.b(strE);
        String strO = pisVar.o();
        if (downloadPullerCallback == null) {
            dkz.d().b(edlVarB, strO);
        } else {
            downloadPullerCallback.setDescriptionInfoCache(edlVarB, strO);
        }
        pitVar.b(edlVarB.d());
        pullListener.onPullingChange(pisVar, pitVar);
    }

    public void a(String str, String str2, final String str3, String str4, final PullListener pullListener) {
        c(str, str2, str3, str4, new PullListener() { // from class: dli.9
            @Override // com.huawei.pluginmgr.filedownload.PullListener
            public void onPullingChange(pis pisVar, pit pitVar) throws Throwable {
                dli.this.a(pisVar, pitVar, str3, pullListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(pis pisVar, pit pitVar, String str, PullListener pullListener) throws Throwable {
        if (pitVar == null) {
            LogUtil.j("ResourceHandlePuller", "downloadDescriptionFile onPullingChange result is null");
            pullListener.onPullingChange(pisVar, null);
            return;
        }
        int iF = pitVar.f();
        if (iF != 1) {
            if (iF == 0) {
                return;
            }
            pullListener.onPullingChange(pisVar, pitVar);
            return;
        }
        String strE = e(this.f31948c, str);
        LogUtil.d("ResourceHandlePuller", "downloadDescriptionFile descriptionJson success");
        edl edlVarB = dlb.b(strE);
        dkz.d().b(edlVarB, pisVar.o());
        pitVar.b(edlVarB.d());
        pullListener.onPullingChange(pisVar, pitVar);
    }

    private String e(Context context, String str) throws Throwable {
        FileInputStream fileInputStream;
        LogUtil.a("ResourceHandlePuller", "enter readFileToData: filePath = ", str);
        FileInputStream fileInputStream2 = null;
        if (str == null || context == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(1024);
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
                    LogUtil.e("ResourceHandlePuller", "readFileToData IOException");
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

    public String d(String str) {
        if ("6d5416d9-2167-41df-ab10-c492e152b44f".equals(str)) {
            return edf.e;
        }
        return edf.f32777a + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, PullListener pullListener, pis pisVar, pit pitVar) throws Throwable {
        FileOutputStream fileOutputStream;
        LogUtil.a("ResourceHandlePuller", "createDoneMarkFile enter create done file, path is ", str);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                File file = new File(str + File.separator + "done");
                if (!file.getParentFile().exists()) {
                    LogUtil.a("ResourceHandlePuller", "createDoneMarkFile isDirMade is ", Boolean.valueOf(file.mkdir()));
                }
                if (!file.exists()) {
                    LogUtil.a("ResourceHandlePuller", "createDoneMarkFile isNewFileCreated is ", Boolean.valueOf(file.createNewFile()));
                }
                String strValueOf = String.valueOf(new Date().getTime() / 1000);
                LogUtil.a("ResourceHandlePuller", "createDoneMarkFile timeStamp is =", strValueOf);
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
                    LogUtil.e("ResourceHandlePuller", "createDoneMarkFile createDoneFile IOException");
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

    public static long e() {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            return 0L;
        }
        try {
            StatFs statFs = new StatFs(CommonUtil.f((Context) null).getPath());
            return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        } catch (IllegalArgumentException unused) {
            LogUtil.e("ResourceHandlePuller", "getAvailCount Exception");
            return -1L;
        }
    }
}
