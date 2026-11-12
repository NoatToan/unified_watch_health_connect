package defpackage;

import android.text.TextUtils;
import com.huawei.haf.bundle.AppBundleBuildConfig;
import com.huawei.haf.common.os.FileUtils;
import health.compact.a.LogUtil;
import health.compact.a.ProcessUtil;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes22.dex */
final class bap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f900b = AppBundleBuildConfig.e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f901c = new File(bbf.a().c(), "module_info_version");

    bap() throws Throwable {
        d();
    }

    private void d() throws Throwable {
        bao baoVarC = c();
        if (baoVarC == null) {
            LogUtil.b("Bundle_InfoVersionMgr", "No new module info version, just use default version.");
            this.f899a = this.f900b;
            return;
        }
        String strB = baoVarC.b();
        if (TextUtils.isEmpty(strB)) {
            LogUtil.e("Bundle_InfoVersionMgr", "No old module info version, just use default version.");
            strB = this.f900b;
        }
        String strC = baoVarC.c();
        if (strB.equals(strC)) {
            LogUtil.b("Bundle_InfoVersionMgr", "Module have been updated, so we use new module info version ", strC);
            this.f899a = strC;
        } else {
            if (ProcessUtil.b()) {
                if (b(new bao(strC, strC))) {
                    this.f899a = strC;
                    ProcessUtil.a();
                    LogUtil.b("Bundle_InfoVersionMgr", "Module have been updated, start to kill other processes!");
                    return;
                } else {
                    this.f899a = strB;
                    LogUtil.e("Bundle_InfoVersionMgr", "Failed to update new module info version:", strC);
                    return;
                }
            }
            this.f899a = strB;
        }
    }

    private boolean b(bao baoVar) throws Throwable {
        bar barVar;
        bar barVar2 = null;
        try {
            try {
                barVar = new bar(this.f901c);
                try {
                    boolean zE = barVar.e(baoVar);
                    FileUtils.a(barVar);
                    return zE;
                } catch (IOException e) {
                    e = e;
                    barVar2 = barVar;
                    LogUtil.d("Bundle_InfoVersionMgr", "updateVersionData ex=", LogUtil.c(e));
                    FileUtils.a(barVar2);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    FileUtils.a(barVar);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
            barVar = barVar2;
        }
    }

    private bao c() throws Throwable {
        IOException e;
        bar barVar;
        bar barVar2 = null;
        if (this.f901c.exists()) {
            try {
                barVar = new bar(this.f901c);
                try {
                    try {
                        bao baoVarB = barVar.b();
                        FileUtils.a(barVar);
                        return baoVarB;
                    } catch (IOException e2) {
                        e = e2;
                        LogUtil.d("Bundle_InfoVersionMgr", "readVersionData ex=", LogUtil.c(e));
                        FileUtils.a(barVar);
                        return null;
                    }
                } catch (Throwable th) {
                    barVar2 = barVar;
                    th = th;
                    FileUtils.a(barVar2);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                barVar = null;
            } catch (Throwable th2) {
                th = th2;
                FileUtils.a(barVar2);
                throw th;
            }
        }
        return null;
    }

    boolean e(String str, File file) {
        if (!this.f901c.exists() && !this.f901c.mkdirs()) {
            LogUtil.e("Bundle_InfoVersionMgr", "Failed to make dir for module info file!");
            return false;
        }
        File file2 = new File(this.f901c, "bundle_" + str + ".json");
        try {
            FileUtils.b(file2);
            FileUtils.e(file, file2);
            FileUtils.f(file2);
            FileUtils.b(file);
            if (b(new bao(this.f899a, str))) {
                LogUtil.b("Bundle_InfoVersionMgr", "Success to update module info version, current version ", this.f899a, ", new version ", str);
                return true;
            }
        } catch (IOException e) {
            LogUtil.d("Bundle_InfoVersionMgr", "Failed to rename file:", file.getPath(), ", ex=", LogUtil.c(e));
        }
        return false;
    }

    String a() {
        return this.f900b;
    }

    String e() {
        return this.f899a;
    }

    File b() {
        return this.f901c;
    }
}
