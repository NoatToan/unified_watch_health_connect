package defpackage;

import com.huawei.haf.bundle.AppBundleBuildConfig;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.common.security.SecurityUtils;
import java.io.File;

/* JADX INFO: loaded from: classes22.dex */
public final class bbf {
    private static final bbf d = new bbf(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f935c;

    bbf(File file) {
        if (file == null) {
            File dir = AppBundleBuildConfig.a().getDir("bundle", 0);
            file = new File(dir, c(dir));
        }
        this.f935c = file;
    }

    public static bbf a() {
        return d;
    }

    public File c() {
        return FileUtils.c(this.f935c);
    }

    public static String a(File file) {
        String path = file.getPath();
        String path2 = a().f935c.getPath();
        return path.startsWith(path2) ? path.substring(path2.length()) : path;
    }

    public File i(baj bajVar) {
        return FileUtils.c(j(bajVar));
    }

    public File c(baj bajVar) {
        return FileUtils.c(g(bajVar));
    }

    public File f(baj bajVar) {
        return new File(c(bajVar), bajVar.f() + ".tmp");
    }

    public File d(baj bajVar) {
        return new File(c(bajVar), bajVar.f() + ".apk");
    }

    public File a(baj bajVar) {
        return new File(c(bajVar), bajVar.i());
    }

    public File h(baj bajVar) {
        return new File(i(bajVar), bajVar.i() + "_uninstall");
    }

    public File e(baj bajVar) {
        File file = new File(g(bajVar), "oat");
        if (!file.exists() && file.mkdirs()) {
            file.setWritable(true);
            file.setReadable(true);
        }
        return file;
    }

    public File b(baj bajVar) {
        return FileUtils.c(new File(g(bajVar), "nativeLib" + File.separator + bajVar.b().a()));
    }

    public File e() {
        return FileUtils.c(new File(this.f935c, "tmp"));
    }

    private File j(baj bajVar) {
        return new File(this.f935c, bajVar.f());
    }

    private File g(baj bajVar) {
        return new File(j(bajVar), bajVar.h());
    }

    private String c(File file) {
        long jAbs = Math.abs(AppBundleBuildConfig.c() - e(file));
        StringBuilder sb = new StringBuilder(64);
        sb.append(AppBundleBuildConfig.d());
        sb.append('_');
        sb.append(jAbs);
        String strB = SecurityUtils.b(sb.toString());
        sb.delete(0, sb.length());
        if (strB.length() > 24) {
            sb.append(AppBundleBuildConfig.m());
            sb.append('_');
            sb.append(strB.substring(strB.length() - 24));
        } else {
            sb.append(AppBundleBuildConfig.d());
            sb.append('_');
            sb.append(Long.toHexString(jAbs));
        }
        return sb.toString();
    }

    private long e(File file) {
        File file2 = new File(file, "done.lock");
        FileUtils.d(file2, true);
        return file2.lastModified();
    }
}
