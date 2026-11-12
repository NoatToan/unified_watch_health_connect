package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.common.os.FileFilterUtils;
import com.huawei.haf.common.os.FileLockHelper;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.common.security.SecurityUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.dynamic.DynamicApkValidator;
import health.compact.a.LogUtil;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import ohos.ace.plugin.taskmanagerplugin.EventType;

/* JADX INFO: loaded from: classes22.dex */
final class baz implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileLockHelper f923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f924b;
    private final File d;

    baz(File file, File file2) throws IOException {
        this.d = file2;
        this.f924b = file;
        this.f923a = FileLockHelper.d(new File(file, "ModuleCopier.lock"));
    }

    boolean c(Context context, baj bajVar, boolean z) throws IOException {
        if (!this.f923a.b()) {
            throw new IllegalStateException("FileCheckerAndCopier was closed");
        }
        if (bajVar.n()) {
            d(context, bajVar, z);
            return true;
        }
        if (this.d.exists()) {
            LogUtil.a("Bundle_Preprocessor", "module ", bajVar.f(), " is downloaded");
            return e(context, bajVar, z);
        }
        LogUtil.a("Bundle_Preprocessor", "module ", bajVar.f(), " is not downloaded");
        return false;
    }

    private void d(Context context, baj bajVar, boolean z) throws IOException {
        if (!this.d.exists()) {
            a(context, bajVar, z);
        } else {
            if (e(context, bajVar, z)) {
                return;
            }
            a(context, bajVar, z);
        }
    }

    private void a(Context context, baj bajVar, boolean z) throws IOException {
        if (bajVar.j().startsWith("assets://")) {
            e(context, bajVar);
        }
        if (!e(context, bajVar, z)) {
            throw new IOException(String.format(Locale.ENGLISH, "Failed to check built-in module %s, it may be corrupted", bajVar.f()));
        }
    }

    private boolean e(Context context, baj bajVar, boolean z) {
        boolean zA = FileUtils.a(this.d);
        if (z) {
            zA = DynamicApkValidator.d(context, this.d, bajVar.f());
        }
        if (zA) {
            zA = e(bajVar);
        }
        if (!zA) {
            LogUtil.e("Bundle_Preprocessor", "Oops! Failed to check module ", bajVar.f(), " signature and/or sha-256");
            a();
        }
        return zA;
    }

    private boolean e(baj bajVar) {
        if (bajVar.g() != this.d.length()) {
            return false;
        }
        String strD = SecurityUtils.d(this.d);
        if (TextUtils.isEmpty(strD)) {
            LogUtil.e("Bundle_Preprocessor", "checkModuleSha256, get ", bajVar.f(), " sha-256 fail.");
            return true;
        }
        return bajVar.i().equals(strD);
    }

    private void a() {
        File[] fileArrListFiles = this.f924b.listFiles(new FileFilterUtils.FileNotEqualsCollectFilter("ModuleCopier.lock"));
        if (CollectionUtils.d(fileArrListFiles)) {
            return;
        }
        for (File file : fileArrListFiles) {
            FileUtils.e(file);
        }
    }

    private void e(Context context, baj bajVar) throws IOException {
        String str = "bundle_plugins/" + bajVar.f() + ".zip";
        File fileCreateTempFile = File.createTempFile("tmp-" + bajVar.f(), ".apk", bbf.a().e());
        boolean z = false;
        int i = 0;
        while (!z && i < 3) {
            i++;
            try {
                InputStream inputStreamOpen = context.getAssets().open(str);
                try {
                    FileUtils.d(inputStreamOpen, fileCreateTempFile);
                    if (fileCreateTempFile.renameTo(this.d)) {
                        z = true;
                    } else {
                        LogUtil.e("Bundle_Preprocessor", "Failed to rename ", bbf.a(fileCreateTempFile), " to ", bbf.a(this.d));
                    }
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                } catch (Throwable th) {
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException unused) {
                LogUtil.e("Bundle_Preprocessor", "Failed to copy built-in module apk, attempts times : ", Integer.valueOf(i));
            }
            LogUtil.b("Bundle_Preprocessor", "Copy built-in module ", z ? "succeeded" : EventType.FAILED, " '", bbf.a(this.d), "': length=", Long.valueOf(this.d.length()));
            if (!z) {
                FileUtils.j(this.d);
                if (this.d.exists()) {
                    LogUtil.e("Bundle_Preprocessor", "Failed to delete copied module apk which has been corrupted ", bbf.a(this.d));
                }
            }
        }
        FileUtils.j(fileCreateTempFile);
        if (!z) {
            throw new IOException(String.format(Locale.ENGLISH, "Failed to copy built-in file %s to path %s", str, bbf.a(this.d)));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f923a.close();
    }
}
