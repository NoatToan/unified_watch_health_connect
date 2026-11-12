package com.huawei.watchface;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.api.HwWatchFaceManager;
import com.huawei.watchface.mvp.model.crypt.PversionSdUtils;
import com.huawei.watchface.mvp.model.datatype.DownloadQueryBean;
import com.huawei.watchface.mvp.model.datatype.InstallWatchFaceBean;
import com.huawei.watchface.mvp.model.datatype.WatchFaceInfo;
import com.huawei.watchface.mvp.model.datatype.WatchResourcesInfo;
import com.huawei.watchface.mvp.model.filedownload.FilePuller;
import com.huawei.watchface.mvp.model.filedownload.PullListenerInterface;
import com.huawei.watchface.mvp.model.filedownload.PullResult;
import com.huawei.watchface.mvp.model.filedownload.PullTask;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.callback.OperateWatchFaceCallback;
import com.huawei.watchface.utils.callback.OperationCallback;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class f2 {
    public static final String j = "f2";
    public static f2 k;
    public Context e;
    public String f;
    public OperateWatchFaceCallback g;
    public OperateWatchFaceCallback h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinkedHashMap f30145a = new LinkedHashMap(32);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConcurrentHashMap f30146b = new ConcurrentHashMap(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ConcurrentHashMap f30147c = new ConcurrentHashMap(32);
    public ConcurrentHashMap d = new ConcurrentHashMap(32);
    public final Type i = new a(this).getType();

    public class a extends TypeToken<List<PullTask>> {
        public a(f2 f2Var) {
        }
    }

    public class b implements OperationCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30149b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f30150c;
        public final /* synthetic */ String d;
        public final /* synthetic */ InstallWatchFaceBean e;

        public b(String str, String str2, int i, String str3, InstallWatchFaceBean installWatchFaceBean) {
            this.f30148a = str;
            this.f30149b = str2;
            this.f30150c = i;
            this.d = str3;
            this.e = installWatchFaceBean;
        }

        @Override // com.huawei.watchface.utils.callback.OperationCallback
        public void operationResult(int i) {
            f2.this.a(this.f30148a, 0);
            if (i != 0 || f2.this.g == null) {
                return;
            }
            HwLog.i(f2.j, "continueDownloadWatchFace, operationResult");
            f2.this.g.transmitDownloadWatchFaceResult(this.f30148a, this.f30149b, this.f30150c == 1 ? 3 : 4);
            if (this.f30150c == 2) {
                if (!StringUtils.strEquals(this.d, this.f30148a)) {
                    this.e.setWatchFaceHiTopId(this.f30148a);
                }
                HwWatchFaceManager.getInstance(f2.this.e).installWatchFace(this.e);
            }
            OperateWatchFaceCallback operateWatchFaceCallback = f2.this.h;
            if (operateWatchFaceCallback != null) {
                operateWatchFaceCallback.transmitDownloadWatchFaceResult(this.f30148a, this.f30149b, this.f30150c == 1 ? 3 : 4);
            }
        }
    }

    /* JADX INFO: loaded from: classes45.dex */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DownloadQueryBean f30151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InstallWatchFaceBean f30152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f30153c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                HwLog.i(f2.j, "sendContinueDownloadWatchFace -- start install WatchFace");
                c cVar = c.this;
                f2.this.a(cVar.d, cVar.e, cVar.f30153c, cVar.f30152b);
            }
        }

        public c(DownloadQueryBean downloadQueryBean, InstallWatchFaceBean installWatchFaceBean, int i, String str, String str2) {
            this.f30151a = downloadQueryBean;
            this.f30152b = installWatchFaceBean;
            this.f30153c = i;
            this.d = str;
            this.e = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            int iA = z1.c().a(this.f30151a, this.f30152b);
            if (iA == 1) {
                if (this.f30153c != 1 && TextUtils.isEmpty(k2.a().a(this.d, this.e))) {
                    k2.a().a(this.d, this.e, 0, this.f30152b.isVipFreeWatchFace());
                }
                BackgroundTaskUtils.postInMainThread(new a());
                return;
            }
            HwLog.e(f2.j, "sendContinueDownloadWatchFace -- return a non-zero value, resultCode==" + iA);
            f2.this.a(this.f30152b, iA);
        }
    }

    public f2(Context context) {
        this.e = context;
        StringBuilder sb = new StringBuilder();
        sb.append(this.e.getFilesDir().getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append("watchface");
        sb.append(str);
        this.f = sb.toString();
    }

    public static f2 a(Context context) {
        if (k == null) {
            synchronized (f2.class) {
                if (k == null) {
                    k = new f2(context.getApplicationContext());
                }
            }
        }
        return k;
    }

    public static void g() {
        synchronized (f2.class) {
            if (k != null) {
                k = null;
            }
        }
    }

    public void b() {
        if (q()) {
            String currentInstallWatchFaceHiTopId = HwWatchFaceManager.getInstance(this.e).getCurrentInstallWatchFaceHiTopId();
            HwWatchFaceManager.getInstance(this.e).cancelInstallWatchFace(currentInstallWatchFaceHiTopId, HwWatchFaceManager.getInstance(this.e).getCurrentInstallWatchFaceVersion());
            a(this.e).e(currentInstallWatchFaceHiTopId);
        }
    }

    public final boolean c(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        return str.length() > str2.length() ? str.endsWith(str2) : str2.endsWith(str);
    }

    public void d() {
        HwLog.i(j, "clearInstallTask");
        this.f30145a.clear();
        this.f30146b.clear();
    }

    public void e(String str, String str2) {
        if (str == null || str2 == null) {
            HwLog.w(j, "hiTopId or version is null");
        } else {
            this.f30145a.put(str, str2);
        }
    }

    public void f() {
        g();
    }

    public void h() {
        String str;
        LinkedHashMap<String, String> linkedHashMapN = a(this.e).n();
        String str2 = j;
        HwLog.i(str2, "deviceConnectRestartTask, map:" + linkedHashMapN.size());
        if (linkedHashMapN.isEmpty()) {
            HwLog.w(str2, "deviceConnectRestartTask, map is empty");
            return;
        }
        FilePuller.getInstance(this.e).notifyMapTaskPause(linkedHashMapN, 5);
        OperateWatchFaceCallback operateWatchFaceCallback = this.g;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.transmitRefreshPullData();
        }
        OperateWatchFaceCallback operateWatchFaceCallback2 = this.h;
        if (operateWatchFaceCallback2 != null) {
            operateWatchFaceCallback2.transmitRefreshPullData();
        }
        Iterator<Map.Entry<String, String>> it = linkedHashMapN.entrySet().iterator();
        String key = null;
        loop0: while (true) {
            str = key;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                key = it.next().getKey();
                String str3 = linkedHashMapN.get(key);
                if (!s0.a().b(key + "_" + str3)) {
                    HwLog.i(j, "deviceConnectRestartTask file not exist hitopId:" + key);
                    it.remove();
                    a(this.e).k().remove(key);
                    FilePuller.getInstance(this.e).notifyDownloadStatus(key + "_" + str3, 3);
                    OperateWatchFaceCallback operateWatchFaceCallback3 = this.g;
                    if (operateWatchFaceCallback3 != null) {
                        operateWatchFaceCallback3.transmitDownloadWatchFaceResult(key, str3, 3);
                    }
                    OperateWatchFaceCallback operateWatchFaceCallback4 = this.h;
                    if (operateWatchFaceCallback4 != null) {
                        operateWatchFaceCallback4.transmitDownloadWatchFaceResult(key, str3, 3);
                    }
                } else if (TextUtils.isEmpty(str)) {
                    break;
                }
            }
        }
        HwLog.i(j, "deviceConnectRestartTask nextStartHitopId:" + str);
        if (TextUtils.isEmpty(str) || linkedHashMapN.get(str) == null) {
            return;
        }
        HwWatchFaceManager.getInstance(this.e).applyWatchFace(str, linkedHashMapN.get(str), 1, "", true);
    }

    public final String i() {
        return HwWatchFaceApi.getInstance(this.e).getDeviceIdentify();
    }

    public ConcurrentHashMap j() {
        return this.f30147c;
    }

    public ConcurrentHashMap k() {
        return this.f30146b;
    }

    public final String l() {
        Context context = this.e;
        if (context == null) {
            HwLog.w(j, "getSharedPreferencesDownloadDeviceId() mContext is null.");
            return null;
        }
        String strA = k5.a(context.getSharedPreferences("watchFaceDownload", 0).getString("downloadDeviceId", null), "savePw");
        String str = j;
        HwLog.d(str, "getSharedPreferencesDownloadDeviceId() completed.");
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        HwLog.d(str, "getSharedPreferencesDownloadDeviceId() deviceId is empty.");
        return null;
    }

    public String m() {
        Context context = this.e;
        if (context == null) {
            HwLog.e(j, "getSharedPreferencesDownloadTask() mContext is null.");
            return null;
        }
        String string = context.getSharedPreferences("watchFaceDownload", 0).getString("downloadWatchFaceData", null);
        HwLog.d(j, "getSharedPreferencesDownloadTask() completed.");
        return string;
    }

    public LinkedHashMap n() {
        return this.f30145a;
    }

    public String o() {
        String str = j;
        HwLog.d(str, "getWatchFaceDownloadData() enter.");
        JSONArray jSONArray = new JSONArray();
        ConcurrentHashMap<String, PullTask> downloadTaskList = FilePuller.getInstance(this.e).getDownloadTaskList();
        if (downloadTaskList.isEmpty()) {
            HwLog.w(str, "getWatchFaceDownloadData() downloadList is empty.");
            return jSONArray.toString();
        }
        for (Map.Entry<String, PullTask> entry : downloadTaskList.entrySet()) {
            String[] strArrSplit = entry.getKey().split("_");
            if (strArrSplit.length >= 2) {
                String str2 = strArrSplit[0];
                String str3 = strArrSplit[1];
                String str4 = str2 + "_" + str3;
                int iFetchStatus = entry.getValue().fetchStatus();
                if (b(str2, str3)) {
                    HwLog.d(j, "getWatchFaceDownloadData() remove taskId: " + str4);
                    FilePuller.getInstance(this.e).cancelTask(str2, str3, false);
                    this.f30145a.remove(str2);
                } else {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", str2);
                        jSONObject.put("version", str3);
                        jSONObject.put("status", iFetchStatus);
                    } catch (Exception e) {
                        HwLog.e(j, "getWatchFaceDownloadData() Exception." + HwLog.printException(e));
                    }
                    jSONArray.put(jSONObject);
                }
            }
        }
        return jSONArray.toString();
    }

    public int p() {
        HwLog.i(j, "getWatchFaceDownloadItemNum");
        return FilePuller.getInstance(this.e).getDownloadTaskList().size();
    }

    public boolean q() {
        return (TextUtils.isEmpty(HwWatchFaceManager.getInstance(this.e).getCurrentInstallWatchFaceHiTopId()) || TextUtils.isEmpty(HwWatchFaceManager.getInstance(this.e).getCurrentInstallWatchFaceVersion())) ? false : true;
    }

    public boolean r() {
        String strL = l();
        if (TextUtils.isEmpty(strL)) {
            HwLog.w(j, "isNeedInstallTask() sharedPreferencesDeviceId is empty.");
            return true;
        }
        String strI = i();
        if (TextUtils.isEmpty(strI)) {
            HwLog.w(j, "isNeedInstallTask() deviceId is empty.");
            e();
            FilePuller.getInstance(this.e).clearTask();
            d();
            return false;
        }
        if (strL.equals(strI)) {
            return true;
        }
        HwLog.w(j, "isNeedInstallTask() sharedPreferencesDeviceId diff");
        e();
        FilePuller.getInstance(this.e).clearTask();
        d();
        return false;
    }

    public void s() {
        HwLog.i(j, "enter saveCurrentDeviceId");
        f(k5.c(i(), "savePw"));
    }

    public final void f(String str) {
        if (this.e == null) {
            HwLog.w(j, "saveDownloadDeviceId() mContext is null");
        } else if (TextUtils.isEmpty(str)) {
            HwLog.w(j, "saveDownloadDeviceId() deviceId is empty.");
        } else {
            this.e.getSharedPreferences("watchFaceDownload", 0).edit().putString("downloadDeviceId", str).apply();
            HwLog.i(j, "saveDownloadDeviceId() completed.");
        }
    }

    public void e() {
        Context context = this.e;
        if (context == null) {
            HwLog.w(j, "clearSharedPreferencesData, mContext is null");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("watchFaceDownload", 0).edit();
        editorEdit.clear();
        editorEdit.apply();
        HwLog.i(j, "clearSharedPreferencesData completed");
    }

    public boolean d(String str) {
        ConcurrentHashMap<String, PullTask> downloadTaskList = FilePuller.getInstance(this.e).getDownloadTaskList();
        if (downloadTaskList.isEmpty()) {
            HwLog.w(j, "getDownloadTaskList is empty.");
            return false;
        }
        Iterator<Map.Entry<String, PullTask>> it = downloadTaskList.entrySet().iterator();
        while (it.hasNext()) {
            String[] strArrSplit = it.next().getKey().split("_");
            if (strArrSplit.length >= 2 && strArrSplit[0].equals(str)) {
                HwLog.w(j, "hiTopId is in download task list.");
                return true;
            }
        }
        return false;
    }

    public boolean c() {
        String str = j;
        HwLog.i(str, "clearAllInstallTasks -- enter");
        if (!q() && FilePuller.getInstance(this.e).getDownloadTaskList().isEmpty()) {
            HwLog.i(str, "clearAllInstallTasks -- there is no task to clear");
            return false;
        }
        b();
        a();
        d();
        return true;
    }

    public final boolean b(String str, String str2) {
        String str3 = j;
        HwLog.i(str3, "isDeviceContain() hiTopId: " + str + ", version: " + str2);
        ArrayList<WatchResourcesInfo> allWatchInfo = HwWatchFaceBtManager.getInstance(this.e).getAllWatchInfo();
        boolean z = false;
        if (ArrayUtils.isEmpty(allWatchInfo)) {
            HwLog.e(str3, "isDeviceContain() allWatchFaceInfo is null.");
            return false;
        }
        for (WatchResourcesInfo watchResourcesInfo : allWatchInfo) {
            if (watchResourcesInfo.getWatchInfoId().equals(str) && watchResourcesInfo.getWatchInfoVersion().equals(str2)) {
                z = true;
                break;
            }
        }
        HwLog.i(j, "isDeviceContain() isDeviceContain: " + z);
        return z;
    }

    public void a(OperateWatchFaceCallback operateWatchFaceCallback, boolean z) {
        if (z) {
            this.g = operateWatchFaceCallback;
            this.h = null;
        } else {
            this.h = operateWatchFaceCallback;
        }
    }

    public void e(String str) {
        if (str == null || !this.d.containsKey(str)) {
            return;
        }
        this.d.remove(str);
    }

    public void a(String str, String str2, int i, InstallWatchFaceBean installWatchFaceBean) {
        String strE = n.e().e(str);
        String strF = n.e().f(str);
        String strBuildTaskId = FilePuller.getInstance(this.e).buildTaskId(strF, str2);
        String str3 = j;
        HwLog.i(str3, "continueDownloadWatchFace, taskId:" + strBuildTaskId + " ,operationCode:" + i + " ,hiTopId:" + str + " ,version:" + str2 + " ,deviceHitopId:" + strE + " ,h5HitopId:" + strF);
        if (!this.f30145a.containsKey(strE) && !this.f30146b.containsKey(strE)) {
            HwLog.w(str3, "mWaitInstallMap or mPauseInstallMap not contains key");
            FilePuller.getInstance(this.e).operationDownloadTask(strF, str2, i, new b(strF, str2, i, str, installWatchFaceBean));
            return;
        }
        HwLog.i(str3, "continueDownloadWatchFace, mWaitInstallMap contain hiTopId");
        if (i == 1) {
            HwLog.i(str3, "continueDownloadWatchFace, PAUSE_TASK");
            this.f30145a.remove(strE);
            this.f30146b.put(strE, str2);
            FilePuller.getInstance(this.e).notifyDownloadStatus(strBuildTaskId, 3);
            OperateWatchFaceCallback operateWatchFaceCallback = this.g;
            if (operateWatchFaceCallback != null) {
                operateWatchFaceCallback.transmitDownloadWatchFaceResult(strF, str2, 3);
            }
            OperateWatchFaceCallback operateWatchFaceCallback2 = this.h;
            if (operateWatchFaceCallback2 != null) {
                operateWatchFaceCallback2.transmitDownloadWatchFaceResult(strF, str2, 3);
                return;
            }
            return;
        }
        HwLog.i(str3, "continueDownloadWatchFace, RESTART_TASK");
        this.f30146b.remove(strE);
        if (!this.f30145a.containsKey(strE) && !this.f30146b.containsKey(strE)) {
            FilePuller.getInstance(this.e).notifyDownloadStatus(strBuildTaskId, -8);
        } else {
            FilePuller.getInstance(this.e).notifyDownloadStatus(strBuildTaskId, 5);
        }
        HwWatchFaceManager.getInstance(this.e).applyWatchFace(strE, str2, 1, installWatchFaceBean.getWatchScreen(), installWatchFaceBean.getInstallationType(), true);
        OperateWatchFaceCallback operateWatchFaceCallback3 = this.g;
        if (operateWatchFaceCallback3 != null) {
            operateWatchFaceCallback3.transmitDownloadWatchFaceResult(strF, str2, 4);
        }
        OperateWatchFaceCallback operateWatchFaceCallback4 = this.h;
        if (operateWatchFaceCallback4 != null) {
            operateWatchFaceCallback4.transmitDownloadWatchFaceResult(strF, str2, 4);
        }
    }

    public String c(String str) {
        return this.f + str;
    }

    public int b(String str) {
        if (str != null && this.d.containsKey(str)) {
            return ((Integer) this.d.get(str)).intValue();
        }
        return -1;
    }

    public void a(String str, String str2) {
        if (str != null && str2 != null) {
            this.f30145a.put(str, str2);
        }
        HwLog.i(j, "deviceDisconnectedPauseTask() hiTopId: " + str + ", version: " + str2 + ", mWaitInstallMap size: " + this.f30145a.size());
        FilePuller.getInstance(this.e).notifyMapTaskPause(this.f30145a, 3);
        OperateWatchFaceCallback operateWatchFaceCallback = this.g;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.transmitRefreshPullData();
        }
        OperateWatchFaceCallback operateWatchFaceCallback2 = this.h;
        if (operateWatchFaceCallback2 != null) {
            operateWatchFaceCallback2.transmitRefreshPullData();
        }
    }

    public void a(boolean z) {
        if (HwWatchFaceBtManager.getInstance(this.e).getConnectWatchDeviceInfo() == null) {
            HwLog.w(j, "syncDownloadData, current device info is null");
            return;
        }
        String deviceIdentify = HwWatchFaceApi.getInstance(this.e).getDeviceIdentify();
        if (TextUtils.isEmpty(deviceIdentify)) {
            HwLog.w(j, "syncDownloadData, deviceId is null");
            return;
        }
        if (c(l(), deviceIdentify) && !z) {
            if (m() != null && FilePuller.getInstance(this.e).getDownloadTaskList().isEmpty()) {
                HwLog.i(j, "syncDownloadData, setDownloadTaskList");
                return;
            } else {
                HwLog.i(j, "syncDownloadData, don't sync data");
                return;
            }
        }
        HwLog.i(j, "syncDownloadData, deviceImei diff");
        e();
        d();
        FilePuller.getInstance(this.e).clearTask();
        f(k5.c(deviceIdentify, "savePw"));
    }

    public void a() {
        ConcurrentHashMap<String, PullTask> downloadTaskList = FilePuller.getInstance(this.e).getDownloadTaskList();
        if (downloadTaskList.isEmpty()) {
            HwLog.w(j, "getDownloadTaskList is empty.");
            return;
        }
        Iterator<Map.Entry<String, PullTask>> it = downloadTaskList.entrySet().iterator();
        while (it.hasNext()) {
            String[] strArrSplit = it.next().getKey().split("_");
            if (strArrSplit.length >= 2) {
                HwWatchFaceManager.getInstance(this.e).cancelInstallWatchFace(strArrSplit[0], strArrSplit[1]);
            }
        }
    }

    public String a(int i, DownloadQueryBean downloadQueryBean) {
        String str = j;
        HwLog.i(str, "sendContinueDownloadWatchFace enter.");
        final String hitopId = downloadQueryBean.getHitopId();
        final String version = downloadQueryBean.getVersion();
        final InstallWatchFaceBean installWatchFaceBean = new InstallWatchFaceBean();
        installWatchFaceBean.setWatchFaceHiTopId(hitopId);
        installWatchFaceBean.setVersion(version);
        installWatchFaceBean.setFileSize(downloadQueryBean.getFileSize());
        installWatchFaceBean.setWatchScreen(downloadQueryBean.getScreen());
        installWatchFaceBean.setProductId(downloadQueryBean.getProductId());
        installWatchFaceBean.setUpdate(downloadQueryBean.isUpdate());
        installWatchFaceBean.setOneClick(downloadQueryBean.isOneClick());
        installWatchFaceBean.setZip(downloadQueryBean.isZip());
        installWatchFaceBean.setInstallationType(2);
        installWatchFaceBean.setVipFreeWatchFace(HwWatchFaceManager.getInstance(this.e).isVipFreeWatchFaceContain(downloadQueryBean.getHitopId()));
        if (j2.g().m(hitopId, version)) {
            HwLog.i(str, "sendContinueDownloadWatchFace -- isWaitTryOutWatchFaceId");
            HashMap mapF = j2.g().f(hitopId, version);
            if (ArrayUtils.a(mapF)) {
                HwLog.e(str, "sendContinueDownloadWatchFace -- tryOutDownUrlHashcode is empty");
                return "1";
            }
            if (i != 1 && TextUtils.isEmpty(k2.a().a(hitopId, version))) {
                BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.f2$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        k2.a().a(hitopId, version, 1, false);
                    }
                });
            }
            installWatchFaceBean.setInstallationType(1);
            installWatchFaceBean.setFileUrl((String) mapF.get(RecommendConstants.DOWNLOAD_URL));
            installWatchFaceBean.setHashCode((String) mapF.get(WatchFaceConstant.HASHCODE));
            a(hitopId, version, i, installWatchFaceBean);
            return "0";
        }
        HashMap mapB = z1.c().b(hitopId, version);
        if (!ArrayUtils.a(mapB)) {
            String str2 = (String) mapB.get(RecommendConstants.DOWNLOAD_URL);
            installWatchFaceBean.setHashCode((String) mapB.get(WatchFaceConstant.HASHCODE));
            installWatchFaceBean.setFileUrl(str2);
            if (i != 1 && TextUtils.isEmpty(k2.a().a(hitopId, version))) {
                BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.f2$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        k2.a().a(hitopId, version, 0, installWatchFaceBean.isVipFreeWatchFace());
                    }
                });
            }
            a(hitopId, version, i, installWatchFaceBean);
            return "0";
        }
        BackgroundTaskUtils.submit(new c(downloadQueryBean, installWatchFaceBean, i, hitopId, version));
        return "0";
    }

    public final void a(InstallWatchFaceBean installWatchFaceBean, int i) {
        Context context = this.e;
        if (context == null) {
            return;
        }
        f analyticsDownloadEvent = HwWatchFaceManager.getInstance(context).getAnalyticsDownloadEvent(installWatchFaceBean);
        analyticsDownloadEvent.f(installWatchFaceBean.getMsg());
        analyticsDownloadEvent.a(String.valueOf(i));
        analyticsDownloadEvent.j();
    }

    public void a(String str, String str2, String str3, WatchFaceInfo watchFaceInfo, boolean z, boolean z2, PullListenerInterface pullListenerInterface) {
        PullTask pullTask = new PullTask();
        if (TextUtils.isEmpty(str3)) {
            str3 = c(str);
        }
        pullTask.configDestPath(str3);
        pullTask.configHttpUrl(str2);
        pullTask.configFileUrlJson(null);
        pullTask.configListener(pullListenerInterface);
        pullTask.configOption(CommonUtils.k(watchFaceInfo.fetchFileType()));
        pullTask.configTotalSize(watchFaceInfo.fetchFileSize());
        pullTask.configParam(a((String) null));
        pullTask.configUUID(str);
        pullTask.configFiledID(null);
        pullTask.configDigest(watchFaceInfo.fetchDigest());
        pullTask.configZip(z);
        pullTask.setInstallationType(watchFaceInfo.getInstallationType());
        pullTask.configOneCLick(z2);
        if (PversionSdUtils.a() > watchFaceInfo.fetchFileSize() + FilePuller.getInstance(this.e).getDownloadingMapTotalSize()) {
            HwLog.i(j, "addDownloadTask() pull plugin task.");
            FilePuller.getInstance(this.e).addTask(pullTask);
            if (str != null) {
                a(str.split("_")[0], 0);
                return;
            }
            return;
        }
        HwLog.w(j, "addDownloadTask() this storage is not enough.");
        PullResult pullResult = new PullResult();
        pullResult.configStatus(-9);
        pullResult.setInstallationType(watchFaceInfo.getInstallationType());
        pullListenerInterface.onPullingChange(pullTask, pullResult);
    }

    public final String a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(RecommendConstants.FILE_ID, str);
            jSONObject.put(RecommendConstants.VER, "0");
        } catch (JSONException unused) {
            HwLog.e(j, "JSONException");
        }
        return jSONObject.toString();
    }

    public void a(String str, int i) {
        HwLog.i(j, "setProgressMap hiTopId :" + str);
        this.d.put(str, Integer.valueOf(i));
    }
}
