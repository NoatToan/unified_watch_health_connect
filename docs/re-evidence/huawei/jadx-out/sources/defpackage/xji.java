package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.Normalizer;

/* JADX INFO: loaded from: classes20.dex */
public class xji {
    public static void a(String str, String str2, int i) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("FileSetSecurityLabelUtil", "setFileSecurityLevel filePath or riskLevel is empty.");
            return;
        }
        try {
            try {
                try {
                    try {
                        Class<?> cls = Class.forName("com.huawei.fileprotect.HwSfpPolicyManager");
                        Object objInvoke = cls.getMethod("setLabel", Context.class, String.class, String.class, String.class, Integer.TYPE).invoke(cls.getMethod("getDefault", new Class[0]).invoke(cls, new Object[0]), BaseApplication.getContext(), str, "SecurityLevel", str2, Integer.valueOf(i));
                        int iIntValue = objInvoke instanceof Integer ? ((Integer) objInvoke).intValue() : -1;
                        if (iIntValue == 0) {
                            LogUtil.a("FileSetSecurityLabelUtil", "setFileSecurityLevel success!");
                        } else {
                            LogUtil.a("FileSetSecurityLabelUtil", "setFileSecurityLevel failed! result = ", Integer.valueOf(iIntValue));
                        }
                    } catch (NoSuchMethodException unused) {
                        LogUtil.e("FileSetSecurityLabelUtil", "setFileSecurityLevel NoSuchMethodException");
                        LogUtil.a("FileSetSecurityLabelUtil", "setFileSecurityLevel failed! result = ", -1);
                    }
                } catch (SecurityException unused2) {
                    LogUtil.e("FileSetSecurityLabelUtil", "setFileSecurityLevel SecurityException");
                    LogUtil.a("FileSetSecurityLabelUtil", "setFileSecurityLevel failed! result = ", -1);
                }
            } catch (ClassNotFoundException unused3) {
                LogUtil.e("FileSetSecurityLabelUtil", "setFileSecurityLevel ClassNotFoundException");
                LogUtil.a("FileSetSecurityLabelUtil", "setFileSecurityLevel failed! result = ", -1);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused4) {
                LogUtil.e("FileSetSecurityLabelUtil", "setFileSecurityLevel other Exception");
                LogUtil.a("FileSetSecurityLabelUtil", "setFileSecurityLevel failed! result = ", -1);
            }
        } catch (Throwable th) {
            LogUtil.a("FileSetSecurityLabelUtil", "setFileSecurityLevel failed! result = ", -1);
            throw th;
        }
    }

    public static boolean b(File file, String str) throws IOException {
        if (file == null) {
            LogUtil.a("FileSetSecurityLabelUtil", "validateFilename", "file is null");
            return false;
        }
        if (file.getCanonicalPath().startsWith(Normalizer.normalize(new File(str).getCanonicalPath(), Normalizer.Form.NFKC))) {
            return true;
        }
        LogUtil.e("FileSetSecurityLabelUtil", "File is outside extraction target directory.");
        return false;
    }
}
