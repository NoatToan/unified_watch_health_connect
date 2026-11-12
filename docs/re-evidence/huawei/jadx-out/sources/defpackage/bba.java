package defpackage;

import android.content.Context;
import com.huawei.haf.bundle.extension.BundleExtension;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.common.security.SecurityUtils;
import com.huawei.haf.dynamic.DynamicApkValidator;
import health.compact.a.LogUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class bba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f925a;
    private final Context e;

    bba(Context context, boolean z) {
        this.e = context;
        this.f925a = z;
    }

    public c d(boolean z, baj bajVar) throws a {
        File fileF = bbf.a().f(bajVar);
        try {
            File fileD = bbf.a().d(bajVar);
            File fileA = bbf.a().a(bajVar);
            if (!bajVar.n() && !fileA.exists() && FileUtils.a(fileF) && !fileD.exists() && !fileF.renameTo(fileD)) {
                LogUtil.e("Bundle_Installer", "Failed to rename ", bbf.a(fileF), " to ", bbf.a(fileD));
            }
            return c(z, bajVar, fileD, fileA);
        } finally {
            FileUtils.b(fileF);
        }
    }

    private c c(boolean z, baj bajVar, File file, File file2) throws a {
        b(file, bajVar);
        long jLastModified = file2.exists() ? file2.lastModified() : System.currentTimeMillis();
        file.setLastModified(jLastModified);
        ArrayList arrayList = null;
        File fileE = bajVar.o() ? e(bajVar, file, jLastModified) : null;
        if (bajVar.m()) {
            arrayList = new ArrayList();
            arrayList.add(file.getAbsolutePath());
        }
        if (arrayList != null) {
            bat.e(bajVar, arrayList, fileE, z);
        }
        a(bajVar, file2, jLastModified);
        return new c(bajVar.f(), file, arrayList);
    }

    public void d(baj bajVar) throws a {
        File fileH = bbf.a().h(bajVar);
        if (fileH.exists()) {
            return;
        }
        try {
            if (bbf.a().a(bajVar).exists()) {
                FileUtils.a(fileH, false);
            }
            String strF = bajVar.f();
            BundleExtension.d().updateModuleState(this.e, strF, false);
            BundleExtension.d().setAllowDownloadModule(this.e, strF, false);
        } catch (IOException e) {
            throw new a(-15, e);
        }
    }

    public void b(File file, baj bajVar) throws a {
        try {
            if (!FileUtils.a(file)) {
                throw new a(-11, new FileNotFoundException("Module apk " + bbf.a(file) + " is illegal!"));
            }
            FileUtils.f(file);
            if (this.f925a) {
                e(file, bajVar.f());
            }
            d(file, bajVar);
        } catch (a e) {
            FileUtils.b(file);
            throw e;
        }
    }

    private void e(File file, String str) throws a {
        if (DynamicApkValidator.d(this.e, file, str)) {
            return;
        }
        throw new a(-12, new SignatureException("Failed to check module apk " + bbf.a(file) + " signature!"));
    }

    private void d(File file, baj bajVar) throws a {
        long length = file.length();
        if (length != bajVar.g()) {
            throw new a(-13, new IOException("Failed to check module apk size, expect " + bajVar.g() + " but " + length));
        }
        String strD = SecurityUtils.d(file);
        if (bajVar.i().equals(strD)) {
            return;
        }
        throw new a(-13, new IOException("Failed to check module apk sha-256, expect " + bajVar.i() + " but " + strD));
    }

    private File e(baj bajVar, File file, long j) throws a {
        try {
            File fileB = bbf.a().b(bajVar);
            bbd bbdVar = new bbd(file, fileB);
            try {
                try {
                    Iterator<File> it = bbdVar.c(bajVar, false).iterator();
                    while (it.hasNext()) {
                        it.next().setLastModified(j);
                    }
                    FileUtils.a(bbdVar);
                    return fileB;
                } catch (IOException e) {
                    LogUtil.e("Bundle_Installer", "Failed to load or extract lib files, ex=", LogUtil.c(e));
                    throw new a(-14, e);
                }
            } catch (Throwable th) {
                FileUtils.a(bbdVar);
                throw th;
            }
        } catch (IOException e2) {
            throw new a(-14, e2);
        }
    }

    private void a(baj bajVar, File file, long j) throws a {
        if (!file.exists()) {
            try {
                FileUtils.a(file, true);
            } catch (IOException e) {
                throw new a(-15, e);
            }
        }
        file.setLastModified(j);
        BundleExtension.d().updateModuleState(this.e, bajVar.f(), true);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<String> f927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final File f928b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f929c;

        c(String str, File file, List<String> list) {
            this.f929c = str;
            this.f928b = file;
            this.f927a = list;
        }
    }

    public static final class a extends Exception {
        private static final long serialVersionUID = 6587079876353699025L;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f926c;

        a(int i, Throwable th) {
            super("Module Install Error: " + i, th);
            this.f926c = i;
        }

        public int b() {
            return this.f926c;
        }
    }
}
