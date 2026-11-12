package defpackage;

import android.text.TextUtils;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.health.util.BloodSugarCallback;
import com.huawei.ui.main.stories.health.util.UpDataFileListener;
import health.compact.a.Utils;
import io.jsonwebtoken.Header;
import java.io.File;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class vcy {
    public void b(UpDataFileListener upDataFileListener) {
        LogUtil.a("Health_BloodSugar_DownloadUtils", "startDownload");
        HashMap map = new HashMap();
        map.put("configType", "bloodsugar");
        fdy.d(new fda("com.huawei.health_Sport_Common", map), "blood_sugar_suggestion", 7, new a(upDataFileListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d() {
        return fdy.d("com.huawei.health_Sport_Common", "blood_sugar_suggestion", Header.COMPRESSION_ALGORITHM);
    }

    public String b() {
        String strD = d();
        if (TextUtils.isEmpty(strD)) {
            return "";
        }
        File file = new File(strD);
        if (!file.exists()) {
            return "";
        }
        return file.getParent() + File.separator + "blood_sugar_suggestions" + File.separator;
    }

    public void a(final BloodSugarCallback bloodSugarCallback) {
        lsy.a(new Runnable() { // from class: vda
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f50953a.d(bloodSugarCallback);
            }
        });
    }

    /* synthetic */ void d(BloodSugarCallback bloodSugarCallback) throws Throwable {
        String strC = Utils.c(b() + "sugar_food_config.json");
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("Health_BloodSugar_DownloadUtils", "getSugarFoodList json is null");
            bloodSugarCallback.result(1, null);
        } else {
            try {
                bloodSugarCallback.result(0, new JSONObject(strC));
            } catch (JSONException unused) {
                LogUtil.e("Health_BloodSugar_DownloadUtils", "getTaskCardPathList JSONException");
                bloodSugarCallback.result(1, null);
            }
        }
    }

    public void e(final BloodSugarCallback bloodSugarCallback) {
        lsy.a(new Runnable() { // from class: vcx
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f50949c.c(bloodSugarCallback);
            }
        });
    }

    /* synthetic */ void c(BloodSugarCallback bloodSugarCallback) throws Throwable {
        String strC = Utils.c(b() + "sugar_suggestion_config.json");
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("Health_BloodSugar_DownloadUtils", "getBloodSuggestionStr read json is null");
            bloodSugarCallback.result(1, null);
        } else {
            try {
                bloodSugarCallback.result(0, new JSONObject(strC));
            } catch (JSONException unused) {
                LogUtil.e("Health_BloodSugar_DownloadUtils", "getBloodSuggestionStr JSONException");
                bloodSugarCallback.result(1, null);
            }
        }
    }

    public File a() {
        File file = new File(b(), "BloodSugarAnalyze.js");
        if (file.exists()) {
            return file;
        }
        LogUtil.j("Health_BloodSugar_DownloadUtils", "BloodSugarAnalyze is not exists");
        return null;
    }

    static class a implements DownloadCallback<File> {
        private final UpDataFileListener e;

        @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
        public void onProgress(long j, long j2, boolean z, String str) {
        }

        a(UpDataFileListener upDataFileListener) {
            this.e = upDataFileListener;
        }

        @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onFinish(File file) throws Throwable {
            if (file == null || !file.exists()) {
                LogUtil.j("Health_BloodSugar_DownloadUtils", "updateIndexFile onFinish data is: file is null");
                return;
            }
            LogUtil.a("Health_BloodSugar_DownloadUtils", "download success");
            pil.e(vcy.d(), file.getParent());
            UpDataFileListener upDataFileListener = this.e;
            if (upDataFileListener == null) {
                LogUtil.j("Health_BloodSugar_DownloadUtils", "upDataFileListener is null");
            } else {
                upDataFileListener.onFinish();
            }
        }

        @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
        public void onFail(int i, Throwable th) {
            LogUtil.e("Health_BloodSugar_DownloadUtils", "updateIndexFile onFail: ", th == null ? "throwable is null" : th.getMessage());
        }
    }
}
