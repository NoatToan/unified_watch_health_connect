package com.huawei.hianalytics;

import com.huawei.hianalytics.core.common.EnvUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11538a;

    public g() {
        try {
            this.f11538a = EnvUtils.getAppContext().getFilesDir().getCanonicalPath() + File.separator;
        } catch (IOException unused) {
            HiLog.e("ComponentManager", "get fileRootDirectory error");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
    
        if (r1.createNewFile() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, String str2) throws Throwable {
        File file = new File(this.f11538a + "/hianalytics_/component/".replace("component", str));
        File file2 = new File(this.f11538a + "/hianalytics_/component/".replace("component", str), "hianalytics_".concat(str));
        if (!file.exists() && file.mkdirs()) {
            HiLog.i("ComponentManager", "file directory is mkdirs");
        }
        if (!file2.exists()) {
            try {
            } catch (IOException unused) {
                HiLog.e("ComponentManager", "create new file error");
            }
        }
        w0.a(file2, str2);
        return;
        HiLog.w("ComponentManager", "file is not found, file is create failed");
    }

    public static void a() {
        File file;
        try {
            file = new File(EnvUtils.getAppContext().getFilesDir().getCanonicalPath() + File.separator + "/hianalytics_");
        } catch (IOException unused) {
            HiLog.e("ComponentManager", "delete component file error");
            file = null;
        }
        a(file);
    }

    public static boolean a(File file) {
        File[] fileArrListFiles;
        if (file == null || !file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length == 0) {
            return false;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isFile()) {
                if (!file2.delete()) {
                    HiLog.i("ComponentManager", "delete file failed: " + file2.getName());
                }
            } else if (file2.isDirectory()) {
                a(file2);
            }
        }
        return file.delete();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        if (r1.createNewFile() != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(String str) throws Throwable {
        File file = new File(this.f11538a + "/hianalytics_/component/".replace("component", str), "hianalytics_".concat(str));
        if (!file.exists()) {
            try {
            } catch (IOException unused) {
                HiLog.e("ComponentManager", "create new file error");
            }
        }
        return w0.a(file);
        String strGenerateSecureRandomStr = EncryptUtil.generateSecureRandomStr(128);
        w0.a(file, strGenerateSecureRandomStr);
        return strGenerateSecureRandomStr;
    }
}
