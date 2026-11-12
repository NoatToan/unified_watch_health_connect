package com.huawei.health.ecologydevice.hearratecontrol;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ProgressListener;
import defpackage.ehu;
import defpackage.fcw;
import defpackage.fcz;
import defpackage.fda;
import defpackage.fdy;
import defpackage.fek;
import defpackage.ffw;
import defpackage.fgf;
import defpackage.njy;
import defpackage.oet;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import io.jsonwebtoken.Header;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Vector;

/* JADX INFO: loaded from: classes7.dex */
public class HeartRateControlConfigHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<DownloadCallBack<ffw>> f6516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<DownloadCallBack<fgf>> f6517b;
    private Handler d;

    public interface DownloadCallBack<T> {
        void onDownloadFail(int i, String str);

        void onDownloadFinish(T t);
    }

    private HeartRateControlConfigHelper() {
        this.f6517b = new Vector();
        this.f6516a = new Vector();
        this.d = new Handler(Looper.getMainLooper());
    }

    static class b {
        private static final HeartRateControlConfigHelper e = new HeartRateControlConfigHelper();
    }

    public void c(DownloadCallBack<ffw> downloadCallBack) {
        this.f6516a.add(downloadCallBack);
    }

    public void d(DownloadCallBack<fgf> downloadCallBack) {
        this.f6517b.add(downloadCallBack);
    }

    public static HeartRateControlConfigHelper e() {
        return b.e;
    }

    public void e(final int i) {
        LogUtil.a("HeartRateControlConfigHelper", "getHeartRateConfig");
        final String strB = b(i);
        if (TextUtils.isEmpty("heart_rate_control_configuration") || TextUtils.isEmpty(strB)) {
            LogUtil.j("HeartRateControlConfigHelper", "downloadFile, fileId or configId is empty");
            d(1, " fileId or configId is empty");
        } else {
            final fda fdaVarA = a(i);
            final String str = "heart_rate_control_configuration";
            ThreadPoolManager.c().execute(new Runnable() { // from class: ehy
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.d(i, strB, str, fdaVarA);
                }
            });
        }
    }

    public /* synthetic */ void d(int i, String str, String str2, fda fdaVar) {
        ffw ffwVarA = ehu.a(i, str, str2);
        fgf fgfVarD = ehu.d(i, str, str2);
        if (e(ffwVarA, fgfVarD, i)) {
            LogUtil.a("HeartRateControlConfigHelper", "enter downloadFile");
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str);
            List<fcw> listB = b(str2, fdaVar);
            if (njy.e(listB)) {
                LogUtil.j("HeartRateControlConfigHelper", "downloadFile, fileListSingles is null");
                a(ffwVarA, fgfVarD);
                return;
            }
            String strE = e(listB, str2);
            LogUtil.a("HeartRateControlConfigHelper", "version = ", strE);
            String strC = c(listB, str2);
            if (TextUtils.isEmpty(strE) || TextUtils.isEmpty(strC)) {
                LogUtil.j("HeartRateControlConfigHelper", "downloadFile, version or downloadUrl is null");
                a(ffwVarA, fgfVarD);
            } else if (ffwVarA == null || ffwVarA.getVersion() < qrs.f(strE)) {
                b(i, str, str2, strC);
            } else {
                fdy.c(System.currentTimeMillis(), h(i));
                a(ffwVarA, fgfVarD);
            }
        }
    }

    private String h(int i) {
        if (i == 264) {
            return "INDOOR_BIKE_CONFIG_RESOURCE";
        }
        if (i == 265) {
            return "TREADMILL_CONFIG_RESOURCE";
        }
        return "";
    }

    private fda a(int i) {
        HashMap map = new HashMap();
        map.put("deviceType", "heartRateControlMonitor");
        return new fda(b(i), map);
    }

    private boolean e(ffw ffwVar, fgf fgfVar, int i) {
        if (ffwVar == null || fgfVar == null) {
            return true;
        }
        long jC = fdy.c(h(i));
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.a("HeartRateControlConfigHelper", "lastUpdateTime ", Long.valueOf(jC), " currentTime ", Long.valueOf(jCurrentTimeMillis));
        long j = jCurrentTimeMillis - jC;
        if (j >= 86400000 || j <= 0) {
            return true;
        }
        LogUtil.a("HeartRateControlConfigHelper", "downloadFiles, no need to update.");
        a(ffwVar, fgfVar);
        return false;
    }

    private void a(final ffw ffwVar, final fgf fgfVar) {
        this.d.post(new Runnable() { // from class: ehv
            @Override // java.lang.Runnable
            public final void run() {
                this.f32998a.e(fgfVar, ffwVar);
            }
        });
    }

    public /* synthetic */ void e(fgf fgfVar, ffw ffwVar) {
        Iterator<DownloadCallBack<fgf>> it = this.f6517b.iterator();
        while (it.hasNext()) {
            it.next().onDownloadFinish(fgfVar);
            it.remove();
        }
        Iterator<DownloadCallBack<ffw>> it2 = this.f6516a.iterator();
        while (it2.hasNext()) {
            it2.next().onDownloadFinish(ffwVar);
            it2.remove();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final int i, final String str) {
        this.d.post(new Runnable() { // from class: ehw
            @Override // java.lang.Runnable
            public final void run() {
                this.f33002b.a(i, str);
            }
        });
    }

    public /* synthetic */ void a(int i, String str) {
        Iterator<DownloadCallBack<fgf>> it = this.f6517b.iterator();
        while (it.hasNext()) {
            it.next().onDownloadFail(i, str);
            it.remove();
        }
        Iterator<DownloadCallBack<ffw>> it2 = this.f6516a.iterator();
        while (it2.hasNext()) {
            it2.next().onDownloadFail(i, str);
            it2.remove();
        }
    }

    private static String e(List<fcw> list, String str) {
        LogUtil.a("HeartRateControlConfigHelper", "enter getVersion");
        for (fcw fcwVar : list) {
            if (str.equals(fcwVar.c())) {
                return fcwVar.e();
            }
        }
        return null;
    }

    private static String c(List<fcw> list, String str) {
        LogUtil.a("HeartRateControlConfigHelper", "enter getDownloadUrl");
        for (fcw fcwVar : list) {
            if (str.equals(fcwVar.c())) {
                return fcwVar.d();
            }
        }
        return null;
    }

    private static List<fcw> b(String str, fda fdaVar) {
        LogUtil.a("HeartRateControlConfigHelper", "enter getResponse");
        String strC = c();
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("HeartRateControlConfigHelper", "getResponse getUrl is null");
            return null;
        }
        fcz fczVar = (fcz) oet.d().e(strC, d(fdaVar.b() + str), HiJsonUtil.d(fdaVar), fcz.class);
        if (fczVar == null) {
            LogUtil.j("HeartRateControlConfigHelper", "response is null");
            return null;
        }
        return fczVar.a();
    }

    private static Map<String, String> d(String str) {
        HashMap map = new HashMap(1);
        map.put("x-version", CommonUtil.c(BaseApplication.getContext()));
        map.put("Content-Type", "application/json; charset=utf-8");
        map.put("traceId", str);
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (!TextUtils.isEmpty(accountInfo)) {
            map.put("x-huid", accountInfo);
        }
        return map;
    }

    private static String c() {
        LogUtil.a("HeartRateControlConfigHelper", "enter getUrl");
        String noCheckUrl = GRSManager.c(BaseApplication.getContext()).getNoCheckUrl("domainHealthCloudCommon", GRSManager.c(BaseApplication.getContext()).getCommonCountryCode());
        if (TextUtils.isEmpty(noCheckUrl)) {
            LogUtil.e("HeartRateControlConfigHelper", "getUrl is empty or null.");
            return null;
        }
        return noCheckUrl + "/commonAbility/configCenter/getConfigInfo";
    }

    private void b(final int i, final String str, final String str2, String str3) {
        LogUtil.a("HeartRateControlConfigHelper", "downLoadZip");
        fdy.b(str3, fdy.d(str, str2, str3), new ProgressListener<File>() { // from class: com.huawei.health.ecologydevice.hearratecontrol.HeartRateControlConfigHelper.2
            @Override // com.huawei.networkclient.ProgressListener
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onFinish(File file) {
                LogUtil.a("HeartRateControlConfigHelper", "onFinish, data = ", file);
                HeartRateControlConfigHelper.this.d(i, str, str2, fdy.d(str, str2, Header.COMPRESSION_ALGORITHM));
            }

            @Override // com.huawei.networkclient.ProgressListener
            public void onProgress(long j, long j2, boolean z) {
                LogUtil.d("HeartRateControlConfigHelper", "read = ", Long.valueOf(j), " total = ", Long.valueOf(j2), " isDone = ", Boolean.valueOf(z));
            }

            @Override // com.huawei.networkclient.ProgressListener
            public void onFail(Throwable th) {
                LogUtil.e("HeartRateControlConfigHelper", "downLoadZip on Fail: ", th.getMessage());
                HeartRateControlConfigHelper.this.c(fdy.d(str, str2, Header.COMPRESSION_ALGORITHM));
                HeartRateControlConfigHelper.this.d(2, th.getMessage());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, String str, String str2, String str3) {
        String str4 = fdy.d(str, str2, (String) null) + File.separator;
        LogUtil.a("HeartRateControlConfigHelper", "filePostProcess");
        if (fek.a(str3, str4) != -1) {
            LogUtil.a("HeartRateControlConfigHelper", "filePostProcess unzipFile is suc");
            c(str3);
            ffw ffwVarA = ehu.a(i, str, str2);
            fgf fgfVarD = ehu.d(i, str, str2);
            if (ffwVarA == null || fgfVarD == null) {
                LogUtil.j("HeartRateControlConfigHelper", "rateControlInfo or speedControlConfigInfo is null");
                d(3, "rateControlInfo or speedControlConfigInfo is null");
                return;
            } else {
                fdy.c(System.currentTimeMillis(), h(i));
                a(ffwVarA, fgfVarD);
                return;
            }
        }
        LogUtil.j("HeartRateControlConfigHelper", "filePostProcess unzipFile is fail");
        d(4, " unzipFile is fail");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        File file = new File(str);
        if (!file.exists() && !file.isDirectory()) {
            LogUtil.j("HeartRateControlConfigHelper", "this file is not exists");
            return false;
        }
        return a(file);
    }

    private boolean a(File file) {
        if (file == null || !file.exists()) {
            LogUtil.a("HeartRateControlConfigHelper", "deleteFiles, root == null or not exist");
            return false;
        }
        if (file.isFile()) {
            return file.delete();
        }
        if (!file.isDirectory()) {
            LogUtil.j("HeartRateControlConfigHelper", "root not deleteFile or directory");
        } else {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file2 : fileArrListFiles) {
                    a(file2);
                }
            }
        }
        boolean zDelete = file.delete();
        LogUtil.a("HeartRateControlConfigHelper", "delete result= ", Boolean.valueOf(zDelete));
        return zDelete;
    }

    public String b(int i) {
        if (i == 264) {
            return CommonUtil.af(BaseApplication.getContext()) ? "com.huawei.health_TreadmillFour_deviceConfig" : "com.huawei.health_TreadmillFour_deviceConfigBeta";
        }
        if (i != 265) {
            return "";
        }
        return CommonUtil.af(BaseApplication.getContext()) ? "com.huawei.health_ExerciseBikeTwo_deviceConfig" : "com.huawei.health_ExerciseBikeTwo_deviceConfigBeta";
    }

    public String c(int i) {
        if (i == 264) {
            return "TREADMILL_COURSE_MAP_KEY";
        }
        if (i == 265) {
            return "INDOOR_BIKE_COURSE_MAP_KEY";
        }
        return "";
    }

    public String d(int i) {
        if (i == 264) {
            return "TREADMILL_SPEED_MAP_KEY";
        }
        if (i == 265) {
            return "INDOOR_BIKE_RESISTANCE_MAP_KEY";
        }
        return "";
    }
}
