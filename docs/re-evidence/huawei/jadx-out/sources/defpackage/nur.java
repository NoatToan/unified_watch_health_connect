package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.manager.OverseaAppUpdateConfig;
import health.compact.a.CommonUtil;
import health.compact.a.IoUtils;
import health.compact.a.SharedPreferenceManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes11.dex */
public class nur {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f43768c = "";

    static {
        b();
    }

    private static void b() {
        int i;
        Context context = BaseApplication.getContext();
        String strE = SharedPreferenceManager.e(context, Integer.toString(10000), "latestversioncode");
        if (TextUtils.isEmpty(strE)) {
            LogUtil.a("OverseaAppUpdateManager", "isOverseaAppUpdate initialized: service not open");
            return;
        }
        try {
            i = Integer.parseInt(strE);
        } catch (NumberFormatException unused) {
            LogUtil.e("OverseaAppUpdateManager", "init latestVersionCode Exception");
            i = -1;
        }
        int iE = CommonUtil.e(context);
        LogUtil.d("OverseaAppUpdateManager", "latestVersionCode is: ", Integer.valueOf(i));
        if (i > iE) {
            f43768c = SharedPreferenceManager.e(context, Integer.toString(10000), "overseaappupdateurl");
        }
        LogUtil.a("OverseaAppUpdateManager", "isOverseaAppUpdate initialized: ", Boolean.valueOf(c()));
    }

    public static boolean c() {
        return !TextUtils.isEmpty(f43768c);
    }

    public static void b(int i) throws Throwable {
        Context context = BaseApplication.getContext();
        if (i == 0) {
            LogUtil.d("OverseaAppUpdateManager", "configFile download success, ready to init");
            e(context);
            b(context, "oversea_app_update", "1");
        } else {
            LogUtil.j("OverseaAppUpdateManager", "configFile download fail");
            b(context, "oversea_app_update", "0");
        }
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00fa: MOVE (r3 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:36:0x00f9 */
    private static void e(Context context) throws Throwable {
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        JsonReader jsonReader = null;
        try {
            try {
                inputStreamReader = new InputStreamReader(new FileInputStream(context.getFilesDir().getCanonicalPath() + File.separator + "lightcloud" + File.separator + "oversea_app_update" + File.separator + "oversea_app_update.json"), "UTF-8");
                try {
                    JsonReader jsonReader2 = new JsonReader(inputStreamReader);
                    try {
                        OverseaAppUpdateConfig overseaAppUpdateConfig = (OverseaAppUpdateConfig) new Gson().fromJson(jsonReader2, OverseaAppUpdateConfig.class);
                        if (overseaAppUpdateConfig == null || !overseaAppUpdateConfig.getIsUpdateOpen()) {
                            f43768c = "";
                            LogUtil.a("OverseaAppUpdateManager", "update service not open.");
                            a(context);
                        } else {
                            int versionCode = overseaAppUpdateConfig.getVersionCode();
                            int iE = CommonUtil.e(context);
                            boolean z = versionCode > iE;
                            LogUtil.d("OverseaAppUpdateManager", "cloudVersionCode: ", Integer.valueOf(versionCode), " currentVersionCode: ", Integer.valueOf(iE), " isOverseaUpdateOpen: ", Boolean.valueOf(overseaAppUpdateConfig.getIsUpdateOpen()));
                            if (z) {
                                f43768c = overseaAppUpdateConfig.getUrl();
                                b(context, "latestversioncode", String.valueOf(versionCode));
                            } else {
                                f43768c = "";
                            }
                            a(context);
                            LogUtil.a("OverseaAppUpdateManager", "openEntry: ", Boolean.valueOf(z));
                        }
                        IoUtils.c(jsonReader2);
                    } catch (JsonSyntaxException unused) {
                        jsonReader = jsonReader2;
                        LogUtil.e("OverseaAppUpdateManager", "initUpdateEntry JsonSyntaxException");
                        IoUtils.c(jsonReader);
                    } catch (IOException unused2) {
                        jsonReader = jsonReader2;
                        LogUtil.e("OverseaAppUpdateManager", "initUpdateEntry InvalidFile");
                        IoUtils.c(jsonReader);
                    } catch (Throwable th) {
                        th = th;
                        jsonReader = jsonReader2;
                        IoUtils.c(jsonReader);
                        IoUtils.c(inputStreamReader);
                        throw th;
                    }
                } catch (JsonSyntaxException unused3) {
                } catch (IOException unused4) {
                }
            } catch (Throwable th2) {
                th = th2;
                inputStreamReader = inputStreamReader2;
                jsonReader = null;
            }
        } catch (JsonSyntaxException unused5) {
            inputStreamReader = null;
        } catch (IOException unused6) {
            inputStreamReader = null;
        } catch (Throwable th3) {
            th = th3;
            inputStreamReader = null;
        }
        IoUtils.c(inputStreamReader);
    }

    private static void a(Context context) {
        b(context, "overseaappupdateurl", f43768c);
        LogUtil.d("OverseaAppUpdateManager", "SharedPreference updated");
    }

    private static void b(Context context, String str, String str2) {
        SharedPreferenceManager.e(context, String.valueOf(10000), str, str2, null);
    }
}
