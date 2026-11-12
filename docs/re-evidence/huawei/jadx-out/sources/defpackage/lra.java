package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwlogsmodel.common.LogConfig;
import health.compact.a.CommonUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes10.dex */
public class lra {
    private static lra d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ExecutorService f40703a = Executors.newSingleThreadExecutor();
    private static final Object e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f40702b = LogConfig.k() + "app_config_value.txt";

    private lra() {
    }

    public static lra d() {
        lra lraVar;
        synchronized (e) {
            if (d == null) {
                d = new lra();
            }
            lraVar = d;
        }
        return lraVar;
    }

    public void e(final String str, final String str2) {
        if (this.f40703a == null) {
            this.f40703a = Executors.newSingleThreadExecutor();
        }
        this.f40703a.execute(new Runnable() { // from class: lra.4
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                FileOutputStream fileOutputStream;
                LogUtil.a("Util_ConfigUserSetValue", " button status key : ", str, "button status values :", str2);
                FileOutputStream fileOutputStream2 = null;
                try {
                    try {
                        String strC = CommonUtil.c(lra.f40702b);
                        if (TextUtils.isEmpty(strC)) {
                            LogUtil.a("Util_ConfigUserSetValue", "configStatus safePath is empty");
                            return;
                        }
                        File file = new File(strC);
                        if (!file.getParentFile().exists()) {
                            LogUtil.a("Util_ConfigUserSetValue", "is mkdir parent file : " + file.getParentFile().mkdirs());
                        }
                        if (!file.isFile()) {
                            LogUtil.a("Util_ConfigUserSetValue", "is create new file : " + file.createNewFile());
                        }
                        fileOutputStream = new FileOutputStream(file, true);
                        try {
                            String str3 = str + " : " + str2 + ";" + System.lineSeparator();
                            fileOutputStream.write(str3.getBytes("UTF-8"), 0, str3.length());
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                                LogUtil.e("Util_ConfigUserSetValue", "close io exception");
                            }
                        } catch (IOException unused2) {
                            fileOutputStream2 = fileOutputStream;
                            LogUtil.a("Util_ConfigUserSetValue", "create file io execption ");
                            if (fileOutputStream2 != null) {
                                try {
                                    fileOutputStream2.close();
                                } catch (IOException unused3) {
                                    LogUtil.e("Util_ConfigUserSetValue", "close io exception");
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused4) {
                                    LogUtil.e("Util_ConfigUserSetValue", "close io exception");
                                }
                            }
                            throw th;
                        }
                    } catch (IOException unused5) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                }
            }
        });
    }

    public void a() {
        File file = new File(f40702b);
        if (file.exists()) {
            LogUtil.a("Util_ConfigUserSetValue", "is delete file : " + file.delete());
        }
    }
}
