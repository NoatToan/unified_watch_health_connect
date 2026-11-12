package defpackage;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import io.jsonwebtoken.Header;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class rek {
    public static void a(final String str) {
        LogUtil.a("HealthCloudWearDeviceUtils", "checkUpdate ruleValue: ", str);
        ThreadPoolManager.c().execute(new Runnable() { // from class: rek.4
            @Override // java.lang.Runnable
            public void run() {
                fcz fczVarD = fdy.d("f69b5b90-83db-4cd1-a5c8-19708adaf3f3_new_v1.1", rek.j(str));
                if (fczVarD == null) {
                    LogUtil.j("HealthCloudWearDeviceUtils", "checkUpdate response is null.");
                    return;
                }
                List<fcw> listA = fczVarD.a();
                if (listA != null && listA.size() != 0) {
                    int iF = rek.f(str);
                    for (fcw fcwVar : listA) {
                        String strC = fcwVar.c();
                        int i = Integer.parseInt(fcwVar.e());
                        if ("f69b5b90-83db-4cd1-a5c8-19708adaf3f3_new_v1.1".equalsIgnoreCase(strC) && i > iF) {
                            rek.b(str, i);
                        }
                    }
                    return;
                }
                LogUtil.j("HealthCloudWearDeviceUtils", "checkUpdate fileList is empty.");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, int i) {
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "com.huawei.health_wearDevice_config" + str, String.valueOf(i), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int f(String str) {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "com.huawei.health_wearDevice_config" + str);
        int i = !TextUtils.isEmpty(strE) ? Integer.parseInt(strE) : 0;
        LogUtil.a("HealthCloudWearDeviceUtils", "getResourceVersion fileVersion: ", Integer.valueOf(i));
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final String str, final int i) {
        LogUtil.a("HealthCloudWearDeviceUtils", "Enter downloadResource.");
        fdy.d(j(str), "f69b5b90-83db-4cd1-a5c8-19708adaf3f3_new_v1.1", new DownloadCallback<File>() { // from class: rek.1
            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onProgress(long j, long j2, boolean z, String str2) {
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onFinish(File file) {
                LogUtil.a("HealthCloudWearDeviceUtils", "downloadResource onFinish.");
                if ("autoSwitch".equalsIgnoreCase(str)) {
                    rek.a();
                }
                rek.c(str, i);
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onFail(int i2, Throwable th) {
                LogUtil.a("HealthCloudWearDeviceUtils", "downloadResource onFail errCode: ", Integer.valueOf(i2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a() {
        String strD = fdy.d("com.huawei.health_wearDevice_config", "f69b5b90-83db-4cd1-a5c8-19708adaf3f3_new_v1.1", Header.COMPRESSION_ALGORITHM);
        String str = fdy.d("com.huawei.health_wearDevice_config", "f69b5b90-83db-4cd1-a5c8-19708adaf3f3_new_v1.1", (String) null) + File.separator;
        fek.a(strD, str);
        if (fek.a(strD, str) != -1) {
            LogUtil.a("HealthCloudWearDeviceUtils", "unzipFile success.");
            FileUtils.b(new File(strD));
        } else {
            LogUtil.a("HealthCloudWearDeviceUtils", "unzip failure.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static fda j(String str) {
        HashMap map = new HashMap();
        map.put("configType", str);
        return new fda("com.huawei.health_wearDevice_config", map);
    }

    public static boolean b(String str) {
        String str2;
        LogUtil.a("HealthCloudWearDeviceUtils", "isExistResource ruleValue: ", str);
        if (!"autoSwitch".equalsIgnoreCase(str)) {
            str2 = "";
        } else {
            str2 = fdy.d("com.huawei.health_wearDevice_config", "f69b5b90-83db-4cd1-a5c8-19708adaf3f3_new_v1.1", (String) null) + File.separator + "f69b5b90-83db-4cd1-a5c8-19708adaf3f3_new_v1.1" + File.separator + "f69b5b90-83db-4cd1-a5c8-19708adaf3f3" + File.separator + "img";
        }
        LogUtil.a("HealthCloudWearDeviceUtils", "isExistResource filePath: ", str2);
        return new File(str2).exists();
    }

    public static ArrayList<Bitmap> e(String str) {
        LogUtil.a("HealthCloudWearDeviceUtils", "getBitmapList ruleValue: ", str);
        ArrayList<Bitmap> arrayList = new ArrayList<>();
        File[] fileArrListFiles = new File(!"autoSwitch".equalsIgnoreCase(str) ? "" : fdy.d("com.huawei.health_wearDevice_config", "f69b5b90-83db-4cd1-a5c8-19708adaf3f3_new_v1.1", (String) null) + File.separator + "f69b5b90-83db-4cd1-a5c8-19708adaf3f3_new_v1.1" + File.separator + "f69b5b90-83db-4cd1-a5c8-19708adaf3f3" + File.separator + "img" + File.separator).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            LogUtil.j("HealthCloudWearDeviceUtils", "getBitmapList imageFiles is empty.");
            return arrayList;
        }
        Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: rek.5
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compare(File file, File file2) {
                return file.getName().compareTo(file2.getName());
            }
        });
        LogUtil.a("HealthCloudWearDeviceUtils", "getBitmapList imageFiles size: ", Integer.valueOf(fileArrListFiles.length));
        for (File file : fileArrListFiles) {
            try {
                String canonicalPath = file.getCanonicalPath();
                LogUtil.d("HealthCloudWearDeviceUtils", " filename: ", file.getName());
                arrayList.add(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImagePath(canonicalPath));
            } catch (IOException unused) {
                LogUtil.j("HealthCloudWearDeviceUtils", "getBitmapList occur IOException.");
            }
        }
        return arrayList;
    }
}
