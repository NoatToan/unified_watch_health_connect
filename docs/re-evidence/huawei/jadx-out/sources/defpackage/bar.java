package defpackage;

import android.text.TextUtils;
import com.huawei.haf.common.os.FileLockHelper;
import com.huawei.haf.common.os.FileUtils;
import health.compact.a.LogUtil;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* JADX INFO: loaded from: classes22.dex */
final class bar implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileLockHelper f904a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f905c;

    bar(File file) throws IOException {
        this.f905c = new File(file, "version.info");
        this.f904a = FileLockHelper.d(new File(file, "version.lock"));
    }

    public bao b() {
        if (!this.f904a.b()) {
            throw new IllegalStateException("ModuleInfoVersionDataStorage was closed");
        }
        return b(this.f905c);
    }

    public boolean e(bao baoVar) {
        if (!this.f904a.b()) {
            throw new IllegalStateException("ModuleInfoVersionDataStorage was closed");
        }
        if (baoVar == null) {
            throw new IllegalArgumentException("versionData == null");
        }
        return a(this.f905c, baoVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f904a.close();
    }

    private static bao b(File file) throws Throwable {
        FileInputStream fileInputStream;
        String property;
        String property2;
        FileInputStream fileInputStream2 = null;
        if (!file.exists() || file.length() == 0 || file.canWrite()) {
            return null;
        }
        for (int i = 0; i < 3; i++) {
            Properties properties = new Properties();
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        properties.load(fileInputStream);
                        property = properties.getProperty("oldVersion");
                        try {
                            property2 = properties.getProperty("newVersion");
                            FileUtils.a(fileInputStream);
                        } catch (IOException e) {
                            e = e;
                            LogUtil.d("Bundle_ModuleInfoVersionDataStorage", "read property failed, ex=", LogUtil.c(e));
                            FileUtils.a(fileInputStream);
                            property2 = null;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        property = null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    FileUtils.a(fileInputStream2);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                fileInputStream = null;
                property = null;
            } catch (Throwable th2) {
                th = th2;
            }
            if (!TextUtils.isEmpty(property) && !TextUtils.isEmpty(property2)) {
                return new bao(property, property2);
            }
        }
        return null;
    }

    private boolean a(File file, bao baoVar) throws Throwable {
        FileOutputStream fileOutputStream;
        LogUtil.b("Bundle_ModuleInfoVersionDataStorage", "updateVersionDataProperties: ", baoVar.toString());
        FileUtils.c(file.getParentFile());
        for (int i = 0; i < 3; i++) {
            Properties properties = new Properties();
            properties.put("oldVersion", baoVar.b());
            properties.put("newVersion", baoVar.c());
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    FileUtils.b(file);
                    fileOutputStream = new FileOutputStream(file, false);
                    try {
                        properties.store(fileOutputStream, "from old version:" + baoVar.b() + " to new version:" + baoVar.c());
                        FileUtils.a(fileOutputStream);
                    } catch (IOException e) {
                        e = e;
                        fileOutputStream2 = fileOutputStream;
                        LogUtil.d("Bundle_ModuleInfoVersionDataStorage", "write property failed, ex=", LogUtil.c(e));
                        FileUtils.a(fileOutputStream2);
                    } catch (Throwable th) {
                        th = th;
                        FileUtils.a(fileOutputStream);
                        FileUtils.f(file);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                }
            } catch (IOException e2) {
                e = e2;
            }
            FileUtils.f(file);
            if (baoVar.equals(b(file))) {
                return true;
            }
            FileUtils.b(file);
        }
        return false;
    }
}
