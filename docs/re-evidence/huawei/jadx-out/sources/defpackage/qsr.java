package defpackage;

import android.os.Build;
import android.text.TextUtils;
import com.huawei.common.util.Utils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class qsr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile qsr f46766a;

    private qsr() {
        f();
    }

    public static qsr c() {
        if (f46766a == null) {
            synchronized (qsr.class) {
                if (f46766a == null) {
                    f46766a = new qsr();
                }
            }
        }
        return f46766a;
    }

    public void f() {
        LogUtil.a("TemporaryConfigManager", "saveFileContentToSp: ");
        ThreadPoolManager.c().execute(new Runnable() { // from class: qsr.4
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                qsr.this.n();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() throws Throwable {
        String strQ = CommonUtil.q(l() + File.separator + "pageConfigs.json");
        LogUtil.a("TemporaryConfigManager", "temporaryConfigStr: ", strQ);
        SharedPreferenceManager.e(BaseApplication.getContext(), "SAVE_TEMPORARY_CONFIG_TO_SP_KEY", "SAVE_TEMPORARY_CONFIG_TO_SP_KEY", strQ, new StorageParams());
        qst.c("deviceTabConfig", strQ);
        qsv.b("NEW_HOME_FRAGMENT_CONFIG", strQ);
    }

    private String l() {
        try {
            return BaseApplication.getContext().getFilesDir().getCanonicalPath() + File.separator + Utils.SERVICE_HEALTH_CLOUD + File.separator + "com.huawei.health_common_config";
        } catch (IOException unused) {
            LogUtil.a("TemporaryConfigManager", "IOException");
            return "";
        }
    }

    public boolean j() {
        qss qssVar = (qss) HiJsonUtil.d(SharedPreferenceManager.e(BaseApplication.getContext(), "SAVE_TEMPORARY_CONFIG_TO_SP_KEY", "SAVE_TEMPORARY_CONFIG_TO_SP_KEY"), qss.class);
        if (qssVar == null) {
            ReleaseLogUtil.e("TemporaryConfigManager", "isOpenCourseNewStyle content == null");
            return true;
        }
        ReleaseLogUtil.d("TemporaryConfigManager", "isOpenCourseNewStyle:", Integer.valueOf(qssVar.a()));
        return qssVar.a() == 0;
    }

    public boolean h() {
        qss qssVar = (qss) HiJsonUtil.d(SharedPreferenceManager.e(BaseApplication.getContext(), "SAVE_TEMPORARY_CONFIG_TO_SP_KEY", "SAVE_TEMPORARY_CONFIG_TO_SP_KEY"), qss.class);
        if (qssVar == null) {
            ReleaseLogUtil.e("TemporaryConfigManager", "isOpenCourseNewStyle content == null");
            return true;
        }
        int iD = qssVar.d();
        ReleaseLogUtil.d("TemporaryConfigManager", "AfterProcessSwitch:", Integer.valueOf(iD));
        return iD == 0;
    }

    public boolean d() {
        if (health.compact.a.Utils.o()) {
            return false;
        }
        if (CommonUtil.ap()) {
            return true;
        }
        qss qssVar = (qss) HiJsonUtil.d(SharedPreferenceManager.e(BaseApplication.getContext(), "SAVE_TEMPORARY_CONFIG_TO_SP_KEY", "SAVE_TEMPORARY_CONFIG_TO_SP_KEY"), qss.class);
        if (qssVar == null) {
            ReleaseLogUtil.e("TemporaryConfigManager", "isOpenCourseNewStyle content == null");
            return false;
        }
        String strE = qssVar.e();
        ReleaseLogUtil.e("TemporaryConfigManager", "isOpenCourseNewStyle supportDevice: ", strE);
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        if ("AllDeviceType".equals(strE)) {
            return true;
        }
        if ("ThirdPartyType".equals(strE)) {
            return !CommonUtil.bh();
        }
        if (!"defineModelType".equals(strE)) {
            return false;
        }
        List<String> listJ = qssVar.j();
        if (njy.e(listJ)) {
            return false;
        }
        return listJ.contains(Build.MODEL);
    }

    public int b() {
        qss qssVar = (qss) HiJsonUtil.d(SharedPreferenceManager.e(BaseApplication.getContext(), "SAVE_TEMPORARY_CONFIG_TO_SP_KEY", "SAVE_TEMPORARY_CONFIG_TO_SP_KEY"), qss.class);
        if (qssVar == null) {
            ReleaseLogUtil.e("TemporaryConfigManager", "isOpenCourseNewStyle content == null");
            return 30;
        }
        int iB = qssVar.b();
        if (iB == 0) {
            return 30;
        }
        ReleaseLogUtil.d("TemporaryConfigManager", "abnormalStepTipsPeriod:", Integer.valueOf(iB));
        return iB;
    }

    public int a() {
        qss qssVar = (qss) HiJsonUtil.d(SharedPreferenceManager.e(BaseApplication.getContext(), "SAVE_TEMPORARY_CONFIG_TO_SP_KEY", "SAVE_TEMPORARY_CONFIG_TO_SP_KEY"), qss.class);
        if (qssVar == null) {
            ReleaseLogUtil.e("TemporaryConfigManager", "getAbnormalStepContinue content == null");
            return 2;
        }
        int iC = qssVar.c();
        if (iC == 0) {
            return 2;
        }
        ReleaseLogUtil.d("TemporaryConfigManager", "getAbnormalStepContinue:", Integer.valueOf(iC));
        return iC;
    }

    public List<String> e() {
        qss qssVar = (qss) HiJsonUtil.d(SharedPreferenceManager.e(BaseApplication.getContext(), "SAVE_TEMPORARY_CONFIG_TO_SP_KEY", "SAVE_TEMPORARY_CONFIG_TO_SP_KEY"), qss.class);
        if (qssVar == null) {
            ReleaseLogUtil.e("TemporaryConfigManager", "isOpenCourseNewStyle content == null");
            return null;
        }
        ReleaseLogUtil.d("TemporaryConfigManager", "isOpenCourseNewStyle:", Integer.valueOf(qssVar.a()));
        return qssVar.g();
    }

    public boolean g() {
        qss qssVar = (qss) HiJsonUtil.d(SharedPreferenceManager.e(BaseApplication.getContext(), "SAVE_TEMPORARY_CONFIG_TO_SP_KEY", "SAVE_TEMPORARY_CONFIG_TO_SP_KEY"), qss.class);
        if (qssVar != null) {
            return qssVar.f() == 0;
        }
        ReleaseLogUtil.e("TemporaryConfigManager", "isSupportHealthLife content == null");
        return true;
    }

    public boolean i() {
        if (!CommonUtil.af(BaseApplication.getContext())) {
            ReleaseLogUtil.e("TemporaryConfigManager", "isSupportNewRecipe is not release, switch new recipe");
            return true;
        }
        qss qssVar = (qss) HiJsonUtil.d(SharedPreferenceManager.e(BaseApplication.getContext(), "SAVE_TEMPORARY_CONFIG_TO_SP_KEY", "SAVE_TEMPORARY_CONFIG_TO_SP_KEY"), qss.class);
        if (qssVar != null) {
            return qssVar.i() != 0;
        }
        ReleaseLogUtil.e("TemporaryConfigManager", "isSupportNewRecipe content == null, default get false");
        return false;
    }

    public <T> T c(String str, String str2, Class<T> cls) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("TemporaryConfigManager", "configName is empty.");
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("TemporaryConfigManager", "arkuixConfigStr is empty.");
            return null;
        }
        LogUtil.a("TemporaryConfigManager", "getPageConfig arkuixConfigStr:", str2);
        try {
            JSONArray jSONArray = new JSONObject(str2).getJSONArray("arkuixConfigs");
            if (jSONArray.length() == 0) {
                LogUtil.j("TemporaryConfigManager", "config list is empty.");
                return null;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                LogUtil.e("TemporaryConfigManager", "configName：", str);
                if (jSONObject.getString("configName").equals(str)) {
                    return (T) HiJsonUtil.d(jSONObject.toString(), (Class) cls);
                }
            }
            LogUtil.j("TemporaryConfigManager", "not found config by name: ", str);
            return null;
        } catch (JSONException unused) {
            LogUtil.e("TemporaryConfigManager", "occur json error.");
        }
    }
}
