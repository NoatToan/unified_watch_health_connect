package defpackage;

import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.common.file.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public class f77 implements py6 {
    public static final Class<?> f = f77.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tpo<File> f17487b;
    public final String c;
    public final CacheErrorLogger d;
    public volatile a e = new a(null, null);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final py6 f17488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final File f17489b;

        public a(File file, py6 py6Var) {
            this.f17488a = py6Var;
            this.f17489b = file;
        }
    }

    public f77(int i, tpo<File> tpoVar, String str, CacheErrorLogger cacheErrorLogger) {
        this.f17486a = i;
        this.d = cacheErrorLogger;
        this.f17487b = tpoVar;
        this.c = str;
    }

    @Override // defpackage.py6
    public long a(py6.a aVar) throws IOException {
        return j().a(aVar);
    }

    @Override // defpackage.py6
    public py6.b b(String str, Object obj) throws IOException {
        return j().b(str, obj);
    }

    @Override // defpackage.py6
    public boolean c(String str, Object obj) throws IOException {
        return j().c(str, obj);
    }

    @Override // defpackage.py6
    public void clearAll() throws IOException {
        j().clearAll();
    }

    @Override // defpackage.py6
    public void d() {
        try {
            j().d();
        } catch (IOException e) {
            cm8.f(f, "purgeUnexpectedResources", e);
        }
    }

    @Override // defpackage.py6
    public ej2 e(String str, Object obj) throws IOException {
        return j().e(str, obj);
    }

    @Override // defpackage.py6
    public Collection<py6.a> f() throws IOException {
        return j().f();
    }

    public void g(File file) throws IOException {
        try {
            FileUtils.a(file);
            cm8.a(f, "Created cache directory %s", file.getAbsolutePath());
        } catch (FileUtils.CreateDirectoryException e) {
            this.d.a(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR, f, "createRootDirectoryIfNecessary", e);
            throw e;
        }
    }

    public final void h() throws IOException {
        File file = new File(this.f17487b.get(), this.c);
        g(file);
        this.e = new a(file, new hu5(file, this.f17486a, this.d));
    }

    public void i() {
        if (this.e.f17488a == null || this.e.f17489b == null) {
            return;
        }
        dm9.b(this.e.f17489b);
    }

    @Override // defpackage.py6
    public boolean isExternal() {
        try {
            return j().isExternal();
        } catch (IOException unused) {
            return false;
        }
    }

    public synchronized py6 j() throws IOException {
        try {
            if (k()) {
                i();
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (py6) b6i.g(this.e.f17488a);
    }

    public final boolean k() {
        File file;
        a aVar = this.e;
        return aVar.f17488a == null || (file = aVar.f17489b) == null || !file.exists();
    }

    @Override // defpackage.py6
    public long remove(String str) throws IOException {
        return j().remove(str);
    }
}
