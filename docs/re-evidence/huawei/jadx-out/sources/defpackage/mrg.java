package defpackage;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class mrg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f42254a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f42255c;

    static {
        String str = c() + File.separator + "cache" + File.separator + "calendar_sync" + File.separator;
        f42254a = str;
        f42255c = str + File.separator + "update" + File.separator;
    }

    private static String c() {
        try {
            File filesDir = BaseApplication.getContext().getFilesDir();
            if (filesDir != null) {
                return filesDir.getCanonicalPath();
            }
            return "";
        } catch (IOException unused) {
            LogUtil.e("CalendarSyncConstants", "getSourcePath catch IOException");
            return "";
        }
    }
}
