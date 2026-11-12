package defpackage;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DeviceDownloadSourceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class egk {
    public static String d(String str) {
        if ("6d5416d9-2167-41df-ab10-c492e152b44f".equals(str)) {
            return phs.e;
        }
        return phs.d + str;
    }

    public static String c(String str) {
        return phs.d + "index" + File.separator + str + ".json";
    }

    public static String b(String str) {
        return phs.d + str + File.separator + "description.json";
    }

    public static String c(String str, String str2) {
        try {
            String str3 = BaseApplication.getContext().getDir("cache", 0).getCanonicalPath() + File.pathSeparator;
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(lsp.b(BaseApplication.getContext(), str + str2));
            return sb.toString();
        } catch (IOException e) {
            LogUtil.e("HealthCloudDownloadUtil", "getPathName:getCanonicalPath ex= ", ExceptionUtils.c(e));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(File.pathSeparator);
            sb2.append(lsp.b(BaseApplication.getContext(), str + str2));
            return sb2.toString();
        }
    }

    public static long c() {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            return 0L;
        }
        try {
            StatFs statFs = new StatFs(CommonUtil.f((Context) null).getPath());
            return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        } catch (IllegalArgumentException unused) {
            LogUtil.e("HealthCloudDownloadUtil", "getAvailCount Exception");
            return -1L;
        }
    }

    public static void a(String str, String str2) {
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            LogUtil.a("HealthCloudDownloadUtil", str2, Boolean.valueOf(file.delete()));
        }
    }

    public static DeviceDownloadSourceInfo c(com.huawei.pluginmgr.hwwear.bean.DeviceDownloadSourceInfo deviceDownloadSourceInfo) {
        if (deviceDownloadSourceInfo == null) {
            return null;
        }
        DeviceDownloadSourceInfo deviceDownloadSourceInfo2 = new DeviceDownloadSourceInfo(null);
        deviceDownloadSourceInfo2.setConfigurationPoint(deviceDownloadSourceInfo.getConfigurationPoint());
        deviceDownloadSourceInfo2.setIndexName(deviceDownloadSourceInfo.getIndexName());
        deviceDownloadSourceInfo2.setSite(deviceDownloadSourceInfo.getSite());
        return deviceDownloadSourceInfo2;
    }
}
