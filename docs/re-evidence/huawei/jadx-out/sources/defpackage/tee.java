package defpackage;

import android.content.Intent;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.HuaweiHealth;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Utils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class tee {
    public static void a() {
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            LogUtil.a("ColdStartUtils", "no net to HealthCloud");
            return;
        }
        d();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add("airule");
        arrayList.add("dict_config");
        arrayList.add("pageConfigs");
        HashMap map = new HashMap(1);
        map.put("configType", "coldStart");
        fda fdaVar = new fda("com.huawei.health_common_config", map);
        DownloadCallback<List<File>> downloadCallbackE = e("coldStart");
        fdy.a(fdaVar, "coldStart", arrayList, downloadCallbackE);
        if (!Utils.o()) {
            fdy.b(fdaVar, "coldStart", 1, (List<String>) Collections.singletonList("shortcuts"), downloadCallbackE);
        }
        fej.d((DownloadCallback<File>) null);
        feb.c().d((DownloadCallback<File>) null);
        if (Utils.o()) {
            return;
        }
        mwi.a().b();
    }

    private static void d() {
        HashMap map = new HashMap(1);
        map.put("configType", "commonFeature");
        fda fdaVar = new fda("com.huawei.health_common_config", map);
        fdy.b(fdaVar, "commonFeature", 1, (List<String>) Collections.singletonList("commonFeatureConfig"), e("commonFeature"));
        ReleaseLogUtil.c("R_ColdStartUtils", "initCommonFeatureConfig requestBody ", fdaVar, " matchRuleMap ", map);
    }

    private static DownloadCallback<List<File>> e(final String str) {
        return new DownloadCallback<List<File>>() { // from class: tee.5
            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onFinish(List<File> list) throws Throwable {
                tee.b(list, str);
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onProgress(long j, long j2, boolean z, String str2) {
                LogUtil.a("ColdStartUtils", "initHealthCloud onProgress, isDone is: ", Boolean.valueOf(z), ", fileId is: ", str2);
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onFail(int i, Throwable th) throws Throwable {
                ReleaseLogUtil.d("R_ColdStartUtils", "getDownloadCallback onFail errorCode ", Integer.valueOf(i), " throwable ", ExceptionUtils.c(th));
                wnh.e(BaseApplication.getContext(), -1, null);
                pvb.a(BaseApplication.getContext(), -1, (String) null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    public static void b(List<File> list, String str) throws Throwable {
        byte b2;
        if (list == null) {
            LogUtil.j("ColdStartUtils", "initHealthCloud onFinish: No file has been download");
            return;
        }
        LogUtil.a("ColdStartUtils", "initHealthCloud onFinish, data is: ", list.toString());
        for (int i = 0; i < list.size(); i++) {
            File file = list.get(i);
            String name = file.getName();
            try {
                String canonicalPath = file.getCanonicalPath();
                name.hashCode();
                switch (name) {
                    case "airule.zip":
                        b2 = 0;
                        break;
                    case "commonFeatureConfig.json":
                        b2 = 1;
                        break;
                    case "dict_config.txt":
                        b2 = 2;
                        break;
                    case "shortcuts.zip":
                        b2 = 3;
                        break;
                    case "pageConfigs.json":
                        b2 = 4;
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                if (b2 == 0) {
                    e(str, canonicalPath);
                } else if (b2 == 1) {
                    fdy.a();
                } else if (b2 == 2) {
                    e();
                } else if (b2 == 3) {
                    a(str, canonicalPath);
                } else if (b2 != 4) {
                    LogUtil.a("ColdStartUtils", "no post-process, path is: ", canonicalPath);
                } else {
                    qsr.c().f();
                }
            } catch (IOException e) {
                LogUtil.e("ColdStartUtils", "initHealthCloud, exception is: ", e.getMessage());
                return;
            }
        }
    }

    private static void e() {
        HiHealthDictManager.a(HuaweiHealth.a()).c(true);
        Intent intent = new Intent("com.huawei.health.action.DATA_DICTIONARY_SHOULD_RELOAD");
        intent.setPackage(BaseApplication.getAppPackage());
        BaseApplication.getContext().sendBroadcast(intent);
    }

    private static void e(String str, String str2) throws Throwable {
        if (fek.a(str2, fdy.d("com.huawei.health_common_config", (String) null, (String) null)) != -1) {
            FileUtils.b(new File(str2));
            wnh.e(BaseApplication.getContext(), 0, fdy.d("com.huawei.health_common_config", "airule", "json"));
            return;
        }
        fdy.c(0L, str);
    }

    private static void a(String str, String str2) {
        if (fek.a(str2, fdy.d("com.huawei.health_common_config", (String) null, (String) null)) != -1) {
            FileUtils.b(new File(str2));
            pvb.a(BaseApplication.getContext(), 0, fdy.d("com.huawei.health_common_config", "shortcuts", "json"));
            return;
        }
        fdy.c(0L, str);
    }
}
