package defpackage;

import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.BuildConfigProperties;
import health.compact.a.IoUtils;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes26.dex */
public class dku {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<String> f31907b = Collections.unmodifiableSet(new HashSet<String>() { // from class: dku.4
        private static final long serialVersionUID = -5972676969371795713L;

        {
            add("f6f6eb8d-6168-4d42-ae08-27da0efda3a9");
            add("8df8e0d8-e4bf-42f0-b0f3-0e11bf16caff");
            add("c7d28238-fec2-4985-b2a4-f29c96637ac4");
        }
    });

    public static boolean c() {
        boolean zA = BuildConfigProperties.a("IS_HTY_VERSION", false);
        ReleaseLogUtil.d("R_HtyUtils", "isHtyVersion: ", Boolean.valueOf(zA));
        return zA;
    }

    public static void e() {
        for (String str : f31907b) {
            a(str);
            d(str);
        }
        SharedPreferenceManager.a(Integer.toString(10008), "resource_Preset_Hty", true);
        ReleaseLogUtil.d("R_HtyUtils", "presetDeviceResourceHty end");
    }

    public static void b() {
        e("index_all.json", eek.a());
        ReleaseLogUtil.d("R_HtyUtils", "presetIndexAll end");
    }

    public static void a() {
        e("index.json", dll.d());
        ReleaseLogUtil.d("R_HtyUtils", "presetIndex end");
    }

    public static void b(edm edmVar) {
        d("img_index_all", eek.d("img_index_all") + edmVar.a());
        ReleaseLogUtil.d("R_HtyUtils", "presetImgIndexAll end");
    }

    public static void d(edm edmVar) {
        d("lang_index_all", eek.d("lang_index_all") + edmVar.b());
        ReleaseLogUtil.d("R_HtyUtils", "presetLongIndexAll end");
    }

    private static void a(String str) throws Throwable {
        d(str, dli.c().d(str));
        e(str);
    }

    private static void d(String str) throws Throwable {
        String pluginIndexOobe = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginIndexOobe(str);
        if (TextUtils.isEmpty(pluginIndexOobe)) {
            return;
        }
        d(pluginIndexOobe, dli.c().d(pluginIndexOobe));
        e(pluginIndexOobe);
    }

    private static void d(String str, String str2) {
        try {
            String[] list = BaseApplication.getContext().getAssets().list(str);
            if (list.length > 0) {
                for (String str3 : list) {
                    d(str + File.separator + str3, str2 + File.separator + str3);
                }
                return;
            }
            e(str, str2);
        } catch (IOException e) {
            ReleaseLogUtil.a("R_HtyUtils", "addResourceLangByUuid IOException: ", ExceptionUtils.c(e));
        }
    }

    private static void e(String str) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                File file = new File(dli.c().d(str) + File.separator + "done");
                if (!file.getParentFile().exists()) {
                    LogUtil.a("HtyUtils", "createDoneMarkFile isDirMade is ", Boolean.valueOf(file.mkdir()));
                }
                if (!file.exists()) {
                    LogUtil.a("HtyUtils", "createDoneMarkFile isNewFileCreated is ", Boolean.valueOf(file.createNewFile()));
                }
                String strValueOf = String.valueOf(new Date().getTime() / 1000);
                LogUtil.a("HtyUtils", "createDoneMarkFile timeStamp is =", strValueOf);
                fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bytes = strValueOf.getBytes(StandardCharsets.UTF_8);
                    fileOutputStream.write(bytes, 0, bytes.length);
                    IoUtils.c(fileOutputStream);
                } catch (IOException e) {
                    e = e;
                    fileOutputStream2 = fileOutputStream;
                    ReleaseLogUtil.a("R_HtyUtils", "addDoneForResource IOException: ", ExceptionUtils.c(e));
                    IoUtils.c(fileOutputStream2);
                } catch (Throwable th) {
                    th = th;
                    IoUtils.c(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    private static void e(String str, String str2) {
        try {
            InputStream inputStreamOpen = BaseApplication.getContext().getAssets().open(str);
            File file = new File(str2);
            File file2 = new File(file.getPath().replace(file.getName(), ""));
            if (!file2.exists()) {
                LogUtil.a("HtyUtils", "copyFile mkdir isSuccess: ", Boolean.valueOf(file2.mkdirs()), ", destPath: ", str2);
            }
            FileUtils.a(inputStreamOpen, new FileOutputStream(file));
        } catch (IOException e) {
            ReleaseLogUtil.a("R_HtyUtils", "copyFile IOException: ", ExceptionUtils.c(e));
        }
    }
}
