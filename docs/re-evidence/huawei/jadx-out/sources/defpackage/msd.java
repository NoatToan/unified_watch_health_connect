package defpackage;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class msd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f42343b = e() + File.separator + "cache" + File.separator + "sportContacts_sync" + File.separator;

    private static String e() {
        try {
            File filesDir = BaseApplication.getContext().getFilesDir();
            if (filesDir != null) {
                return filesDir.getCanonicalPath();
            }
            return "";
        } catch (IOException unused) {
            LogUtil.e("SportContactsSyncConstants", "getSourcePath catch IOException");
            return "";
        }
    }
}
