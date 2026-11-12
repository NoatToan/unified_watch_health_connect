package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.view.View;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hms.maps.internal.HmsUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginmgr.EzPluginType;
import com.huawei.pluginmgr.filedownload.PullListener;
import com.huawei.ui.commonui.dialog.CustomProgressDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import health.compact.a.CommonUtil;
import health.compact.a.GrsDownloadPluginUrl;
import health.compact.a.LogAnonymous;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class jae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f38283a = phs.d + "smart_coach_index" + File.separator;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomProgressDialog f38284b;
    private CustomProgressDialog.Builder d;
    private Activity e;
    private String m;
    private pia p = new pia(EzPluginType.SMART_COACH_RESOURCES_TYPE, null);
    private List<phz> n = new ArrayList(16);
    private List<fcw> j = new ArrayList();
    private List<String> h = new ArrayList();
    private long q = 0;
    private long f = 0;
    private long l = 0;
    private boolean k = false;
    private boolean o = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CountDownLatch f38285c = new CountDownLatch(1);
    private PullListener g = new PullListener() { // from class: jae.4
        @Override // com.huawei.pluginmgr.filedownload.PullListener
        public void onPullingChange(pis pisVar, pit pitVar) {
            if (pitVar == null) {
                LogUtil.e("Track_SmartCoachDownloadUtils", "result is null");
                return;
            }
            int iF = pitVar.f();
            LogUtil.a("Track_SmartCoachDownloadUtils", "mDownloadConfigFileListener index file status = ", Integer.valueOf(iF));
            if (iF == 1) {
                jae.this.a(BaseApplication.getContext());
            }
        }
    };
    private Handler i = new Handler(Looper.getMainLooper()) { // from class: jae.5
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.e("Track_SmartCoachDownloadUtils", "mHandler msg is null.");
                return;
            }
            super.handleMessage(message);
            if (jae.this.e != null) {
                int i = message.what;
                if (i == -1) {
                    jae.this.o();
                    qpx.e(jae.this.e, R.string.IDS_motiontrack_offlinemap_download_network_error);
                } else if (i == 100) {
                    jae.this.l();
                } else if (i == 102) {
                    jae.this.y();
                } else {
                    if (i != 103) {
                        return;
                    }
                    jae.this.q();
                }
            }
        }
    };

    private static JSONObject k() {
        String strA = pia.a(new File(CommonUtil.c(f38283a + File.separator + "smart_coach_index.json")));
        LogUtil.a("Track_SmartCoachDownloadUtils", "getCloudConfigScriptJsonObject jsonData", strA);
        if (TextUtils.isEmpty(strA)) {
            strA = e("local_smart_coach_index.json");
        }
        try {
            return new JSONObject(strA);
        } catch (JSONException unused) {
            LogUtil.e("Track_SmartCoachDownloadUtils", "getCloudConfigScriptJsonObject jsonException");
            return null;
        }
    }

    public void a(Context context) {
        if (context == null) {
            LogUtil.e("Track_SmartCoachDownloadUtils", "setMapConfig context is null.");
            return;
        }
        JSONObject jSONObjectK = k();
        if (jSONObjectK == null) {
            LogUtil.e("Track_SmartCoachDownloadUtils", "setMapConfig jsonData is null");
            SharedPreferenceManager.e(context, Integer.toString(20002), "hms_map_config_key", "false", new StorageParams());
            return;
        }
        try {
            String string = jSONObjectK.getString("hmsEnable");
            SharedPreferenceManager.e(context, Integer.toString(20002), "hms_forbidden_key", jSONObjectK.getJSONArray("noHmsCountries").toString(), new StorageParams());
            LogUtil.a("Track_SmartCoachDownloadUtils", "setMapConfig isForbiddenCountry", Boolean.valueOf(jaa.i()));
            LogUtil.a("Track_SmartCoachDownloadUtils", "setMapConfig hmsEnable: ", string);
            SharedPreferenceManager.e(context, Integer.toString(20002), "hms_map_config_key", string, new StorageParams());
        } catch (JSONException unused) {
            LogUtil.e("Track_SmartCoachDownloadUtils", "setMapConfig JSONException");
        } finally {
            CountDownLatch countDownLatch = this.f38285c;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }

    private static String e(String str) {
        try {
            return jdv.b(BaseApplication.getContext().getAssets().open(str));
        } catch (IOException unused) {
            LogUtil.e("Track_SmartCoachDownloadUtils", "getString IOException");
            return "";
        }
    }

    public void d(Activity activity, DownloadCallback downloadCallback) {
        if (activity == null || downloadCallback == null) {
            LogUtil.j("Track_SmartCoachDownloadUtils", "checkDownloadVoiceResource failed, activity or callback is null.");
            return;
        }
        this.e = activity;
        this.m = a();
        fdy.d(t(), "smart_coach_index", (DownloadCallback<File>) downloadCallback);
    }

    private fda t() {
        HashMap map = new HashMap();
        map.put("configType", "SmartCoach");
        return new fda("com.huawei.health_Sport_Common", map);
    }

    public void b(IBaseResponseCallback iBaseResponseCallback) {
        if (this.q == 0 || njy.e(this.n)) {
            long j = this.q;
            LogUtil.j("Track_SmartCoachDownloadUtils", "getResourcesFromIndexFile mNeedDownloadByte = ", Long.valueOf(j), " mIndexInfo = ", this.n);
        } else {
            this.f = 0L;
            this.l = 0L;
            this.k = false;
            this.o = false;
            this.h = new ArrayList();
            e(iBaseResponseCallback);
        }
    }

    private List<String> j() {
        ArrayList arrayList = new ArrayList();
        for (phz phzVar : this.n) {
            arrayList.add(phzVar.a());
            if (!njy.e(this.j)) {
                for (fcw fcwVar : this.j) {
                    if (phzVar.a().equals(fcwVar.c())) {
                        this.h.add(fcwVar.d());
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        try {
            File file = new File(str);
            if (!xjl.a(file, new File(phs.d).getCanonicalPath())) {
                LogUtil.j("Track_SmartCoachDownloadUtils", "removeAllResourceFiles isValidFile false path ", str);
            } else {
                ReleaseLogUtil.c("Track_SmartCoachDownloadUtils", "removeAllResourceFiles isDeleted ", Boolean.valueOf(c(file)));
            }
        } catch (IOException e) {
            ReleaseLogUtil.b("Track_SmartCoachDownloadUtils", "removeAllResourceFiles exception ", ExceptionUtils.c(e));
        }
    }

    private boolean c(File file) {
        File[] fileArrListFiles;
        if (file == null || !file.exists()) {
            LogUtil.a("Track_SmartCoachDownloadUtils", "deleteFiles, root == null or not exist");
            return false;
        }
        if (file.isFile()) {
            return file.delete();
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                c(file2);
            }
        }
        LogUtil.a("Track_SmartCoachDownloadUtils", "delete result= ", Boolean.valueOf(file.delete()));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: jae.1
                @Override // java.lang.Runnable
                public void run() {
                    jae.this.x();
                }
            });
            return;
        }
        LogUtil.a("Track_SmartCoachDownloadUtils", "updateIndexFile, queryStr = ", this.p.e(new GrsDownloadPluginUrl().getDownloadPluginUrl(null, true), (String) null));
        this.p.a(this.g);
    }

    public void h() {
        x();
    }

    private void e(IBaseResponseCallback iBaseResponseCallback) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 102;
        this.i.sendMessage(messageObtain);
        e(j(), iBaseResponseCallback);
    }

    public long c() {
        List<phz> listE = this.p.e();
        long jB = 0;
        if (njy.e(listE)) {
            LogUtil.j("Track_SmartCoachDownloadUtils", "indexInfo is null");
            return 0L;
        }
        Iterator<phz> it = listE.iterator();
        while (it.hasNext()) {
            jB += (long) it.next().b();
        }
        return jB;
    }

    private void e(List<String> list, final IBaseResponseCallback iBaseResponseCallback) {
        fdy.a(t(), "Track_SmartCoachDownloadUtils", list, new DownloadCallback<List<File>>() { // from class: jae.2
            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onFinish(List<File> list2) {
                if (njy.e(list2)) {
                    LogUtil.j("Track_SmartCoachDownloadUtils", "downloadBatchList finish, data is empty.");
                    return;
                }
                LogUtil.a("Track_SmartCoachDownloadUtils", "downloadBatchList finish, data is = ", list2.toString());
                jae jaeVar = jae.this;
                jaeVar.b(jaeVar.c("1.1.1"));
                jae.this.d(list2);
                jae.this.i.sendEmptyMessage(100);
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onProgress(long j, long j2, boolean z, String str) {
                LogUtil.a("Track_SmartCoachDownloadUtils", "downloadBatchList fileId = ", str, " downloadedBytes = ", Long.valueOf(j));
                if (j - jae.this.l > PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED || z) {
                    jae.this.l = j;
                    jae.this.f = j;
                    jae.this.i.sendEmptyMessage(103);
                }
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onFail(int i, Throwable th) {
                LogUtil.j("Track_SmartCoachDownloadUtils", "downloadBatchList failed, errCode = ", Integer.valueOf(i));
                if (jae.this.k || jae.this.o) {
                    return;
                }
                jae.this.o = true;
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(-1, null);
                }
                jae.this.i.sendEmptyMessage(-1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        CustomProgressDialog customProgressDialog = this.f38284b;
        if (customProgressDialog != null && customProgressDialog.isShowing() && !this.e.isFinishing()) {
            this.f38284b.cancel();
        }
        LogUtil.a("Track_SmartCoachDownloadUtils", "finish closeProgressDialog cancel");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<File> list) {
        final String strS = s();
        for (final File file : list) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: jag
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38295b.e(file, strS);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void e(File file, String str) {
        try {
            String canonicalPath = file.getCanonicalPath();
            String strSubstring = canonicalPath.substring(canonicalPath.lastIndexOf("/") + 1, canonicalPath.indexOf(".zip"));
            LogUtil.a("Track_SmartCoachDownloadUtils", "dealMoveAllResourcesFile filePath = ", canonicalPath, ", fileId = ", strSubstring);
            int iA = fek.a(canonicalPath, str);
            if (TextUtils.isEmpty(strSubstring) || iA == -1) {
                return;
            }
            a(c(strSubstring), str);
            FileUtils.b(new File(canonicalPath));
        } catch (IOException unused) {
            LogUtil.j("Track_SmartCoachDownloadUtils", "dealMoveAllResourcesFile exception.");
        }
    }

    private String s() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(phs.d);
        sb.append("smart_coach_res");
        sb.append(File.separator);
        return sb.toString();
    }

    public String c(String str) {
        return s() + str + File.separator;
    }

    public boolean g() {
        this.p.g();
        List<phz> listE = this.p.e();
        long jC = jem.c();
        long jC2 = c(listE);
        LogUtil.a("Track_SmartCoachDownloadUtils", "isNeedTriggerUpdate localExistFileCount = ", Long.valueOf(jC), " currentVersionFileCount = ", Long.valueOf(jC2));
        boolean z = d() || jC == 0 || jC < jC2;
        if (z) {
            this.q = c();
            this.n = listE;
            n();
        }
        return z;
    }

    public boolean i() {
        String strD = fdy.d("com.huawei.health_Sport_Common", "smart_coach_index", "json");
        if (TextUtils.isEmpty(strD)) {
            LogUtil.j("Track_SmartCoachDownloadUtils", "isIndexFileMoveFinish cloudFilePath is empty.");
            return false;
        }
        try {
            String indexFileSavePath = this.p.b().getIndexFileSavePath();
            FileUtils.d(new File(strD), new File(indexFileSavePath), true);
            LogUtil.a("Track_SmartCoachDownloadUtils", "moveFile success, fromPath = ", strD, " toPath = ", indexFileSavePath);
            return true;
        } catch (IOException unused) {
            LogUtil.j("Track_SmartCoachDownloadUtils", "isIndexFileMoveFinish moveFile failed.");
            return false;
        }
    }

    public boolean b() {
        boolean z = jem.c() <= 0;
        if (z) {
            this.q = c();
            this.n = this.p.e();
            n();
        }
        return z;
    }

    public void f() {
        b(f38283a);
    }

    private void a(String str, String str2) {
        File file = new File(str);
        if (!CommonUtil.e(file)) {
            LogUtil.e("Track_SmartCoachDownloadUtils", "file path not valid");
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        File file2 = new File(str2);
        if (!file2.exists()) {
            LogUtil.d("Track_SmartCoachDownloadUtils", "mkdirs result= ", Boolean.valueOf(file2.mkdirs()));
        }
        boolean zDelete = true;
        for (File file3 : fileArrListFiles) {
            if (file3.isDirectory()) {
                a(file3.getPath(), str2 + File.separator + file3.getName());
            }
            if (file3.isFile()) {
                StringBuilder sb = new StringBuilder(32);
                sb.append(file2);
                sb.append(File.separator);
                sb.append(file3.getName());
                zDelete &= file3.renameTo(new File(sb.toString()));
            }
            zDelete &= file3.delete();
        }
        LogUtil.a("Track_SmartCoachDownloadUtils", "fromDir, isFileDelete = ", Boolean.valueOf(file.delete() & zDelete));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        CustomProgressDialog customProgressDialog = this.f38284b;
        if (customProgressDialog != null && customProgressDialog.isShowing()) {
            LogUtil.e("Track_SmartCoachDownloadUtils", "startDownLoadProgress exists");
            return;
        }
        this.f38284b = new CustomProgressDialog(this.e);
        CustomProgressDialog.Builder builder = new CustomProgressDialog.Builder(this.e);
        this.d = builder;
        builder.e(this.e.getString(R.string.IDS_motiontrack_smart_coach_downloading_voice_resources)).e(new View.OnClickListener() { // from class: jae.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Track_SmartCoachDownloadUtils", "startDownLoadProgress onclick cancel");
                jae.this.k = true;
                jae.this.r();
            }
        });
        CustomProgressDialog customProgressDialogC = this.d.c();
        this.f38284b = customProgressDialogC;
        customProgressDialogC.setCanceledOnTouchOutside(false);
        if (!this.e.isFinishing()) {
            this.f38284b.show();
            this.d.b(0);
            this.d.b(UnitUtil.e(0.0d, 2, 0));
        }
        LogUtil.a("Track_SmartCoachDownloadUtils", "mCustomProgressDialog.show()");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        CustomProgressDialog customProgressDialog = this.f38284b;
        if (customProgressDialog == null || !customProgressDialog.isShowing()) {
            return;
        }
        long j = this.q;
        if (j != 0) {
            LogUtil.d("Track_SmartCoachDownloadUtils", "showDownloadProgress downloaded", Long.valueOf(this.f), "total", Long.valueOf(j));
            long j2 = (this.f * 100) / this.q;
            if (j2 > 99) {
                j2 = 99;
            }
            this.d.b((int) j2);
            String strE = UnitUtil.e(j2, 2, 0);
            this.d.b(strE);
            LogUtil.d("Track_SmartCoachDownloadUtils", "showDownloadProgress percentNum", strE);
        }
    }

    private void n() {
        if (njy.e(this.n)) {
            LogUtil.j("Track_SmartCoachDownloadUtils", "acquireFileList failed, mIndexInfo is empty.");
            this.j = new ArrayList();
            return;
        }
        fcz fczVarD = fdy.d(this.n.get(0).a(), t());
        if (fczVarD == null) {
            LogUtil.j("Track_SmartCoachDownloadUtils", "acquireFileList failed, response is null.");
            this.j = new ArrayList();
        } else {
            this.j = fczVarD.a();
            LogUtil.a("Track_SmartCoachDownloadUtils", "acquireFileList end.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        LogUtil.a("Track_SmartCoachDownloadUtils", "enter handleCancel");
        o();
        Iterator<String> it = this.h.iterator();
        while (it.hasNext()) {
            oet.d().b(it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        LogUtil.a("Track_SmartCoachDownloadUtils", "enter closeProgress");
        o();
        m();
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), "smart_coach_update_layout_count", String.valueOf(0), null);
        qpx.e(this.e, R.string.IDS_motiontrack_download_complete);
    }

    private void m() {
        LogUtil.a("Track_SmartCoachDownloadUtils", "enter closeSportTabDownloadResDialog()");
        Intent intent = new Intent();
        intent.setPackage(BaseApplication.getContext().getPackageName());
        intent.setAction("com.huawei.health.action_receive_data_notify");
        LocalBroadcastManager.getInstance().sendBroadcast(intent);
    }

    public void c(final Context context) {
        ThreadPoolManager.c().a("checkHmsUpdate", new Runnable() { // from class: jae.10
            @Override // java.lang.Runnable
            public void run() {
                jae.this.h();
                try {
                    if (jae.this.f38285c != null) {
                        LogUtil.a("Track_SmartCoachDownloadUtils", "has wait 5 seconds, isCountDown: ", Boolean.valueOf(jae.this.f38285c.await(5L, TimeUnit.SECONDS)));
                    }
                } catch (InterruptedException e) {
                    LogUtil.e("Track_SmartCoachDownloadUtils", LogAnonymous.b(e));
                }
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: jae.10.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (context != null && izt.d(context) && Utils.o() && jae.this.p()) {
                            if (CommonUtil.b(context)) {
                                LogUtil.a("Track_SmartCoachDownloadUtils", "HmsUtil status: ", Integer.valueOf(HmsUtil.isHmsAvailable(context)));
                                return;
                            }
                            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(context);
                            builder.b(R.string.IDS_hw_hms_install_alert).c(R.string.IDS_hw_hms_install_alert_ok, new View.OnClickListener(this) { // from class: jae.10.1.5
                                @Override // android.view.View.OnClickListener
                                public void onClick(View view) {
                                }
                            });
                            builder.c().show();
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p() {
        return (jaa.i() || jaa.h()) ? false : true;
    }

    public void d(IBaseResponseCallback iBaseResponseCallback) {
        if (CommonUtil.ah(BaseApplication.getContext())) {
            e(String.format(this.e.getResources().getString(R.string.IDS_motiontrack_smart_coach_download_tips), this.e.getString(R.string.IDS_device_upgrade_file_size_mb, new Object[]{Integer.valueOf(((int) this.q) / 1048576)})), iBaseResponseCallback);
            return;
        }
        b(iBaseResponseCallback);
    }

    private void e(final String str, final IBaseResponseCallback iBaseResponseCallback) {
        Activity activity;
        if (str == null || (activity = this.e) == null) {
            LogUtil.j("Track_SmartCoachDownloadUtils", "showSmartCoachDownloadTips text or mActivity is null.");
        } else {
            activity.runOnUiThread(new Runnable() { // from class: jae.7
                @Override // java.lang.Runnable
                public void run() {
                    new CustomTextAlertDialog.Builder(jae.this.e).a(R.string.IDS_motiontrack_show_remind).a(str).e(R.string.IDS_settings_button_cancal, new View.OnClickListener(this) { // from class: jae.7.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            LogUtil.d("Track_SmartCoachDownloadUtils", "showSmartCoachDownloadTips setNegativeButton onclick called String");
                        }
                    }).a(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: jae.7.3
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            LogUtil.d("Track_SmartCoachDownloadUtils", "setPositiveButton onclick called String");
                            jae.this.b(iBaseResponseCallback);
                        }
                    }).b().show();
                }
            });
        }
    }

    public long a(String str) {
        List<phz> listE = this.p.e();
        long jD = 0;
        if (njy.e(listE)) {
            LogUtil.j("Track_SmartCoachDownloadUtils", "indexInfo is null");
            return 0L;
        }
        for (phz phzVar : listE) {
            if (str.equals(phzVar.g())) {
                jD += phzVar.d();
            }
        }
        return jD;
    }

    public long c(List<phz> list) {
        long jD = 0;
        if (njy.e(list)) {
            LogUtil.j("Track_SmartCoachDownloadUtils", "indexInfo is null");
            return 0L;
        }
        Iterator<phz> it = list.iterator();
        while (it.hasNext()) {
            jD += it.next().d();
        }
        return jD;
    }

    public String a() {
        if (this.p.g()) {
            return this.p.c();
        }
        return "";
    }

    public boolean d() {
        if (TextUtils.isEmpty(this.m)) {
            return true;
        }
        this.p.g();
        String strC = this.p.c();
        LogUtil.a("Track_SmartCoachDownloadUtils", "isNeedUpdateNewVersion lastVersion = ", this.m, " currentIndexFileVersion = ", strC);
        if (TextUtils.isEmpty(strC)) {
            return false;
        }
        return c(this.m, strC);
    }

    private boolean c(String str, String str2) {
        int iJ;
        int iJ2;
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        if (strArrSplit.length < strArrSplit2.length) {
            return true;
        }
        if (strArrSplit.length > strArrSplit2.length) {
            return false;
        }
        for (int i = 0; i < strArrSplit.length && (iJ = CommonUtil.j(strArrSplit[i])) <= (iJ2 = CommonUtil.j(strArrSplit2[i])); i++) {
            if (iJ < iJ2) {
                return true;
            }
        }
        return false;
    }

    public static boolean e() {
        JSONObject jSONObjectK = k();
        if (jSONObjectK == null) {
            LogUtil.j("Track_SmartCoachDownloadUtils", "isSupportCurrentPhoneModule jsonData is null.");
            return false;
        }
        String str = Build.BRAND + " " + Build.MODEL;
        LogUtil.d("Track_SmartCoachDownloadUtils", "isSupportCurrentPhoneModule phoneMode = ", str);
        try {
            if (!jSONObjectK.has("smartCoachSupportPhoneModle")) {
                return true;
            }
            JSONArray jSONArray = jSONObjectK.getJSONArray("smartCoachSupportPhoneModle");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (str.contains(jSONArray.getString(i))) {
                    return true;
                }
            }
        } catch (JSONException unused) {
            LogUtil.e("Track_SmartCoachDownloadUtils", "isSupportCurrentPhoneModule JSONException");
        }
        return false;
    }
}
