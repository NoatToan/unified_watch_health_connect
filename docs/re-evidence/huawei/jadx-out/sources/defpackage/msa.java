package defpackage;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class msa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f42333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f42334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f42335c;
    public static final String d;

    static {
        String str = a() + File.separator + "cache" + File.separator + "contacts_sync" + File.separator;
        f42335c = str;
        f42333a = str + File.separator + "vcard" + File.separator;
        d = str + File.separator + "compressed" + File.separator;
        f42334b = str + File.separator + "csv" + File.separator;
    }

    private static String a() {
        try {
            File filesDir = BaseApplication.getContext().getFilesDir();
            if (filesDir != null) {
                return filesDir.getCanonicalPath();
            }
            return "";
        } catch (IOException unused) {
            LogUtil.e("ContactSync", "getSourcePath catch IOException");
            return "";
        }
    }
}
