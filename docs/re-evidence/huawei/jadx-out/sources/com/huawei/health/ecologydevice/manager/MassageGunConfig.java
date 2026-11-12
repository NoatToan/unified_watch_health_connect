package com.huawei.health.ecologydevice.manager;

import android.os.Handler;
import android.text.TextUtils;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import defpackage.lqb;
import defpackage.lsy;
import health.compact.a.CommonUtil;
import health.compact.a.EzPluginManager;
import health.compact.a.GRSManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class MassageGunConfig {
    private static final String e = File.separator + "third" + File.separator + "massage_gun_course_recommend.json";
    private String d;

    public interface MassageGunCallback {
        void onMassageGunCallback(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() throws Throwable {
        String str;
        String noCheckUrl = GRSManager.c(BaseApplication.getContext()).getNoCheckUrl("getNewBatchPluginUrl", GRSManager.c(BaseApplication.getContext()).getCommonCountryCode());
        if (TextUtils.isEmpty(noCheckUrl)) {
            LogUtil.j("MassageGunConfig", "updateMassageGunConfig url is empty");
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(noCheckUrl);
        sb.append(CommonUtil.af(BaseApplication.getContext()) ? "com.huawei.health_FasciaGun_deviceConfig" : "com.huawei.health_FasciaGun_deviceConfigBeta");
        String strC = lqb.c(sb.toString(), "deviceType=courseRecommendMonitor");
        if (TextUtils.isEmpty(strC) || Constants.NULL.equalsIgnoreCase(strC)) {
            LogUtil.j("MassageGunConfig", "updateMassageGunConfig jsonResult is empty");
            return false;
        }
        String strB = b(strC);
        if (TextUtils.isEmpty(strB)) {
            LogUtil.j("MassageGunConfig", "updateMassageGunConfig downloadUrl is empty");
            return false;
        }
        try {
            str = BaseApplication.getContext().getFilesDir().getCanonicalPath() + e;
        } catch (IOException unused) {
            LogUtil.e("MassageGunConfig", "updateMassageGunConfig getCanonicalPath IOException");
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("MassageGunConfig", "updateMassageGunConfig filePath is empty");
            return false;
        }
        boolean zD = lqb.d(strB, str);
        LogUtil.a("MassageGunConfig", "updateMassageGunConfig isDownloadSuccess = ", Boolean.valueOf(zD));
        if (!zD) {
            return false;
        }
        boolean zA = a(str);
        LogUtil.a("MassageGunConfig", "updateMassageGunConfig isParseSuccess = ", Boolean.valueOf(zA));
        if (zA) {
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(PrebakedEffectId.RT_WIND), "massage_gun_config_last_update_time", Long.toString(System.currentTimeMillis()), new StorageParams());
        }
        return zA;
    }

    private String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if ("massage_gun_course_recommend".equals(jSONObject.getString(RecommendConstants.FILE_ID))) {
                    return jSONObject.getString(RecommendConstants.DOWNLOAD_URL);
                }
            }
            return "";
        } catch (JSONException unused) {
            LogUtil.e("MassageGunConfig", "parseJsonString JSONException");
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("MassageGunConfig", "parseJsonFile filePath is empty");
            return false;
        }
        EzPluginManager.b();
        JSONObject jSONObjectC = EzPluginManager.c(new File(str));
        if (jSONObjectC != null) {
            this.d = jSONObjectC.toString();
        } else {
            LogUtil.a("MassageGunConfig", "read file error, file content is empty");
        }
        return TextUtils.isEmpty(this.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        return System.currentTimeMillis() - CommonUtil.i(SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(PrebakedEffectId.RT_WIND), "massage_gun_config_last_update_time")) > 86400000;
    }

    void d(Handler handler, MassageGunCallback massageGunCallback) {
        lsy.a(new a(handler, massageGunCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a() throws Throwable {
        LogUtil.a("MassageGunConfig", "getDefaultCountry");
        a(BaseApplication.getContext().getFilesDir().getAbsolutePath() + e);
        String str = this.d;
        return str == null ? "" : str;
    }

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private MassageGunCallback f6546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f6547c;
        private WeakReference<MassageGunConfig> d;

        private a(MassageGunConfig massageGunConfig, Handler handler, MassageGunCallback massageGunCallback) {
            this.d = new WeakReference<>(massageGunConfig);
            this.f6547c = handler;
            this.f6546b = massageGunCallback;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            MassageGunConfig massageGunConfig = this.d.get();
            if (massageGunConfig == null) {
                return;
            }
            if (massageGunConfig.b()) {
                massageGunConfig.d = massageGunConfig.e() ? massageGunConfig.d : massageGunConfig.a();
            } else {
                LogUtil.a("MassageGunConfig", "isNeedUpdateGrsConfig isNeedUpdate = false");
                if (massageGunConfig.d == null) {
                    massageGunConfig.a(BaseApplication.getContext().getFilesDir().getAbsolutePath() + MassageGunConfig.e);
                }
            }
            Handler handler = this.f6547c;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ekz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f33094b.e();
                    }
                });
            }
        }

        public /* synthetic */ void e() {
            if (this.d.get() != null) {
                this.f6546b.onMassageGunCallback(this.d.get().d);
            }
        }
    }
}
