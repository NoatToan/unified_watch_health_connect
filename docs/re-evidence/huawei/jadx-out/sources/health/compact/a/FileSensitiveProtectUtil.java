package health.compact.a;

import android.content.Context;
import com.huawei.hwcommonmodel.application.BaseApplication;
import java.io.File;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public class FileSensitiveProtectUtil {
    public static void e() {
        File databasePath = BaseApplication.getContext().getDatabasePath("sensitive");
        if (databasePath.exists()) {
            return;
        }
        BaseApplication.getContext().getDatabasePath(new File(databasePath, "hihealth_sensitive.db").getPath());
        if (b()) {
            b(databasePath.getPath());
        }
    }

    public static String d(String str) {
        return BaseApplication.getContext().getDatabasePath(str).getParent() + File.separatorChar + "sensitive" + File.separatorChar + str;
    }

    private static void b(String str) {
        try {
            try {
                try {
                    try {
                        Class<?> cls = Class.forName("com.huawei.fileprotect.HwSfpPolicyManager");
                        cls.getMethod("setSecePolicy", Context.class, String.class).invoke(cls.getMethod("getDefault", new Class[0]).invoke(cls, new Object[0]), BaseApplication.getContext(), str);
                        com.huawei.hwlogsmodel.LogUtil.a("FileSensitiveProtectUtil", "setDirectorySecurityLevel SECE end!");
                    } catch (SecurityException e) {
                        com.huawei.hwlogsmodel.LogUtil.e("FileSensitiveProtectUtil", "SecurityException e: ", e.getMessage());
                        com.huawei.hwlogsmodel.LogUtil.a("FileSensitiveProtectUtil", "setDirectorySecurityLevel SECE end!");
                    }
                } catch (NoSuchMethodException e2) {
                    com.huawei.hwlogsmodel.LogUtil.e("FileSensitiveProtectUtil", "NoSuchMethodException e: ", e2.getMessage());
                    com.huawei.hwlogsmodel.LogUtil.a("FileSensitiveProtectUtil", "setDirectorySecurityLevel SECE end!");
                }
            } catch (ClassNotFoundException e3) {
                com.huawei.hwlogsmodel.LogUtil.e("FileSensitiveProtectUtil", "ClassNotFoundException e: ", e3.getMessage());
                com.huawei.hwlogsmodel.LogUtil.a("FileSensitiveProtectUtil", "setDirectorySecurityLevel SECE end!");
            } catch (IllegalAccessException e4) {
                e = e4;
                com.huawei.hwlogsmodel.LogUtil.e("FileSensitiveProtectUtil", "Exception e: ", e.getMessage());
                com.huawei.hwlogsmodel.LogUtil.a("FileSensitiveProtectUtil", "setDirectorySecurityLevel SECE end!");
            } catch (IllegalArgumentException e5) {
                e = e5;
                com.huawei.hwlogsmodel.LogUtil.e("FileSensitiveProtectUtil", "Exception e: ", e.getMessage());
                com.huawei.hwlogsmodel.LogUtil.a("FileSensitiveProtectUtil", "setDirectorySecurityLevel SECE end!");
            } catch (InvocationTargetException e6) {
                e = e6;
                com.huawei.hwlogsmodel.LogUtil.e("FileSensitiveProtectUtil", "Exception e: ", e.getMessage());
                com.huawei.hwlogsmodel.LogUtil.a("FileSensitiveProtectUtil", "setDirectorySecurityLevel SECE end!");
            }
        } catch (Throwable th) {
            com.huawei.hwlogsmodel.LogUtil.a("FileSensitiveProtectUtil", "setDirectorySecurityLevel SECE end!");
            throw th;
        }
    }

    public static boolean b() {
        try {
            Object objE = ReflectionUtils.e(Class.forName("com.huawei.fileprotect.HwSfpPolicyManager"), "isSupportIudf");
            if (objE instanceof Boolean) {
                return ((Boolean) objE).booleanValue();
            }
            return false;
        } catch (ClassNotFoundException e) {
            com.huawei.hwlogsmodel.LogUtil.e("FileSensitiveProtectUtil", "ClassNotFoundException e: ", e.getMessage());
        } catch (IllegalArgumentException e2) {
            com.huawei.hwlogsmodel.LogUtil.e("FileSensitiveProtectUtil", "Exception e: ", e2.getMessage());
        } finally {
            com.huawei.hwlogsmodel.LogUtil.a("FileSensitiveProtectUtil", "isSupport end!");
        }
    }
}
