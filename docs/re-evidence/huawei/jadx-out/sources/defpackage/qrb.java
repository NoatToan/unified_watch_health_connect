package defpackage;

import android.content.Context;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.ui.commonui.utils.ResInfo;
import health.compact.a.GRSManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.util.LogUtil;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class qrb {
    private static final String e = File.separator + "picture" + File.separator;

    public static List<String> a(Context context, String str, ResInfo.Location location) {
        return e(context, str, location, false);
    }

    private static List<String> e(Context context, String str, ResInfo.Location location, boolean z) {
        ArrayList arrayList = new ArrayList();
        String location2 = location.getLocation();
        try {
            String str2 = context.getFilesDir().getCanonicalPath() + File.separator + location2 + e;
            qqi qqiVarA = a(lqb.c(GRSManager.c(context).getNoCheckUrl("getNewBatchPluginUrl", GRSManager.c(context).getCommonCountryCode()) + "com.huawei.health_common_config", "resources=" + location2 + "_resources"), str);
            String str3 = str2 + str;
            if (qqiVarA == null) {
                a(str3, str, arrayList);
                return arrayList;
            }
            String str4 = str3 + ".zip";
            String strD = qqiVarA.d();
            String strB = SharedPreferenceManager.b("picture_resources_module", str, "");
            if (z || !strB.equals(strD)) {
                if (!lqb.d(qqiVarA.c(), str4)) {
                    LogUtil.c("PicResUtils", "fetchAnimHeader for animResName = ", str, "failed!");
                    a(str3, str, arrayList);
                    return arrayList;
                }
                SharedPreferenceManager.c("picture_resources_module", str, strD);
            }
            c(str4, str3);
            a(str3, str, arrayList);
            return arrayList;
        } catch (IOException e2) {
            LogUtil.c("PicResUtils", "fetchAnimation failed, cause exception: ", e2.getMessage(), ", cause: ", e2.getCause());
            return arrayList;
        }
    }

    private static void c(String str, String str2) {
        if (new File(str).exists()) {
            if (qrt.b(str, str2 + File.separator) != -1) {
                FileUtils.b(new File(str));
            } else {
                LogUtil.c("PicResUtils", "unzipAndParseFile failed!");
            }
        }
    }

    private static void a(String str, String str2, List<String> list) {
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            LogUtil.c("PicResUtils", "unzipAndParseFile for ", str2, ", picResName failed! cause picDir not exists or not dir");
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            LogUtil.c("PicResUtils", "unzipAndParseFile for ", str2, ", picResName failed! cause files is null!");
            return;
        }
        Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: qrb.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compare(File file2, File file3) {
                if (file2 == null || file3 == null) {
                    return 0;
                }
                String name = file2.getName();
                String name2 = file3.getName();
                if (name == null || name2 == null) {
                    return 0;
                }
                return name.compareTo(name2);
            }
        });
        for (File file2 : fileArrListFiles) {
            if (file2 != null) {
                try {
                    list.add(file2.getCanonicalPath());
                } catch (IOException e2) {
                    LogUtil.c("PicResUtils", "unzipAndParseFile for ", str2, ", picResName failed! cause exception happened = ", e2.getMessage(), ", cause = ", e2.getCause());
                }
            }
        }
    }

    private static qqi a(String str, String str2) {
        String strA;
        qqi qqiVar = null;
        try {
            List<qqi> list = (List) qqt.c(str, new TypeToken<ArrayList<qqi>>() { // from class: com.huawei.ui.commonui.utils.PicResUtils$2
            }.getType());
            if (list == null) {
                LogUtil.c("PicResUtils", "extractAnimDownloadUrls failed, configEntityList is null!");
                return null;
            }
            for (qqi qqiVar2 : list) {
                if (qqiVar2 != null && (strA = qqiVar2.a()) != null && strA.equals(str2)) {
                    qqiVar = qqiVar2;
                }
            }
            return qqiVar;
        } catch (JsonSyntaxException e2) {
            LogUtil.c("PicResUtils", "extractConfigEntity JsonSyntaxException", e2.getMessage());
            return null;
        }
    }
}
