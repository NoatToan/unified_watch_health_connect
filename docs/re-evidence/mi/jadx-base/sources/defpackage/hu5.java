package defpackage;

import android.os.Environment;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.common.file.FileUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class hu5 implements py6 {
    public static final Class<?> f = hu5.class;
    public static final long g = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f20448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20449b;
    public final File c;
    public final CacheErrorLogger d;
    public final e14 e;

    public class b implements em9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<py6.a> f20450a;

        public b() {
            this.f20450a = new ArrayList();
        }

        @Override // defpackage.em9
        public void a(File file) {
            d dVarS = hu5.this.s(file);
            if (dVarS == null || dVarS.f20454a != ".cnt") {
                return;
            }
            this.f20450a.add(new c(dVarS.f20455b, file));
        }

        @Override // defpackage.em9
        public void b(File file) {
        }

        @Override // defpackage.em9
        public void c(File file) {
        }

        public List<py6.a> d() {
            return Collections.unmodifiableList(this.f20450a);
        }
    }

    public static class c implements py6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f20452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final jl9 f20453b;
        public long c;
        public long d;

        public jl9 a() {
            return this.f20453b;
        }

        @Override // py6.a
        public String getId() {
            return this.f20452a;
        }

        @Override // py6.a
        public long getSize() {
            if (this.c < 0) {
                this.c = this.f20453b.size();
            }
            return this.c;
        }

        @Override // py6.a
        public long getTimestamp() {
            if (this.d < 0) {
                this.d = this.f20453b.c().lastModified();
            }
            return this.d;
        }

        public c(String str, File file) {
            b6i.g(file);
            this.f20452a = (String) b6i.g(str);
            this.f20453b = jl9.b(file);
            this.c = -1L;
            this.d = -1L;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f20454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f20455b;

        public static d b(File file) {
            String strQ;
            String name = file.getName();
            int iLastIndexOf = name.lastIndexOf(46);
            if (iLastIndexOf <= 0 || (strQ = hu5.q(name.substring(iLastIndexOf))) == null) {
                return null;
            }
            String strSubstring = name.substring(0, iLastIndexOf);
            if (strQ.equals(".tmp")) {
                int iLastIndexOf2 = strSubstring.lastIndexOf(46);
                if (iLastIndexOf2 <= 0) {
                    return null;
                }
                strSubstring = strSubstring.substring(0, iLastIndexOf2);
            }
            return new d(strQ, strSubstring);
        }

        public File a(File file) throws IOException {
            return File.createTempFile(this.f20455b + ".", ".tmp", file);
        }

        public String c(String str) {
            return str + File.separator + this.f20455b + this.f20454a;
        }

        public String toString() {
            return this.f20454a + "(" + this.f20455b + ")";
        }

        public d(String str, String str2) {
            this.f20454a = str;
            this.f20455b = str2;
        }
    }

    public static class e extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f20456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f20457b;

        public e(long j, long j2) {
            super("File was not written completely. Expected: " + j + ", found: " + j2);
            this.f20456a = j;
            this.f20457b = j2;
        }
    }

    public class f implements py6.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f20458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final File f20459b;

        public f(String str, File file) {
            this.f20458a = str;
            this.f20459b = file;
        }

        @Override // py6.b
        public boolean a() {
            return !this.f20459b.exists() || this.f20459b.delete();
        }

        @Override // py6.b
        public ej2 b(Object obj) throws IOException {
            CacheErrorLogger.CacheErrorCategory cacheErrorCategory;
            File fileO = hu5.this.o(this.f20458a);
            try {
                FileUtils.b(this.f20459b, fileO);
                if (fileO.exists()) {
                    fileO.setLastModified(hu5.this.e.now());
                }
                return jl9.b(fileO);
            } catch (FileUtils.RenameException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_OTHER;
                } else if (cause instanceof FileUtils.ParentDirNotFoundException) {
                    cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND;
                } else {
                    cacheErrorCategory = cause instanceof FileNotFoundException ? CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND : CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_OTHER;
                }
                hu5.this.d.a(cacheErrorCategory, hu5.f, "commit", e);
                throw e;
            }
        }

        @Override // py6.b
        public void c(gpr gprVar, Object obj) throws IOException {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f20459b);
                try {
                    am4 am4Var = new am4(fileOutputStream);
                    gprVar.a(am4Var);
                    am4Var.flush();
                    long jA = am4Var.a();
                    fileOutputStream.close();
                    if (this.f20459b.length() != jA) {
                        throw new e(jA, this.f20459b.length());
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e) {
                hu5.this.d.a(CacheErrorLogger.CacheErrorCategory.WRITE_UPDATE_FILE_NOT_FOUND, hu5.f, "updateResource", e);
                throw e;
            }
        }
    }

    public class g implements em9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f20460a;

        public g() {
        }

        @Override // defpackage.em9
        public void a(File file) {
            if (this.f20460a && d(file)) {
                return;
            }
            file.delete();
        }

        @Override // defpackage.em9
        public void b(File file) {
            if (!hu5.this.f20448a.equals(file) && !this.f20460a) {
                file.delete();
            }
            if (this.f20460a && file.equals(hu5.this.c)) {
                this.f20460a = false;
            }
        }

        @Override // defpackage.em9
        public void c(File file) {
            if (this.f20460a || !file.equals(hu5.this.c)) {
                return;
            }
            this.f20460a = true;
        }

        public final boolean d(File file) {
            d dVarS = hu5.this.s(file);
            if (dVarS == null) {
                return false;
            }
            String str = dVarS.f20454a;
            if (str == ".tmp") {
                return e(file);
            }
            b6i.i(str == ".cnt");
            return true;
        }

        public final boolean e(File file) {
            return file.lastModified() > hu5.this.e.now() - hu5.g;
        }
    }

    public hu5(File file, int i, CacheErrorLogger cacheErrorLogger) {
        b6i.g(file);
        this.f20448a = file;
        this.f20449b = w(file, cacheErrorLogger);
        this.c = new File(file, v(i));
        this.d = cacheErrorLogger;
        z();
        this.e = tvo.a();
    }

    public static String q(String str) {
        if (".cnt".equals(str)) {
            return ".cnt";
        }
        if (".tmp".equals(str)) {
            return ".tmp";
        }
        return null;
    }

    public static String v(int i) {
        return String.format(null, "%s.ols%d.%d", "v2", 100, Integer.valueOf(i));
    }

    public static boolean w(File file, CacheErrorLogger cacheErrorLogger) {
        String canonicalPath;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return false;
            }
            String string = externalStorageDirectory.toString();
            try {
                canonicalPath = file.getCanonicalPath();
                try {
                    return canonicalPath.contains(string);
                } catch (IOException e2) {
                    e = e2;
                    cacheErrorLogger.a(CacheErrorLogger.CacheErrorCategory.OTHER, f, "failed to read folder to check if external: " + canonicalPath, e);
                    return false;
                }
            } catch (IOException e3) {
                e = e3;
                canonicalPath = null;
            }
        } catch (Exception e4) {
            cacheErrorLogger.a(CacheErrorLogger.CacheErrorCategory.OTHER, f, "failed to get the external storage directory!", e4);
            return false;
        }
    }

    @Override // defpackage.py6
    public long a(py6.a aVar) {
        return n(((c) aVar).a().c());
    }

    @Override // defpackage.py6
    public py6.b b(String str, Object obj) throws IOException {
        d dVar = new d(".tmp", str);
        File fileT = t(dVar.f20455b);
        if (!fileT.exists()) {
            x(fileT, "insert");
        }
        try {
            return new f(str, dVar.a(fileT));
        } catch (IOException e2) {
            this.d.a(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_TEMPFILE, f, "insert", e2);
            throw e2;
        }
    }

    @Override // defpackage.py6
    public boolean c(String str, Object obj) {
        return y(str, false);
    }

    @Override // defpackage.py6
    public void clearAll() {
        dm9.a(this.f20448a);
    }

    @Override // defpackage.py6
    public void d() {
        dm9.c(this.f20448a, new g());
    }

    @Override // defpackage.py6
    public ej2 e(String str, Object obj) {
        File fileO = o(str);
        if (!fileO.exists()) {
            return null;
        }
        fileO.setLastModified(this.e.now());
        return jl9.b(fileO);
    }

    @Override // defpackage.py6
    public boolean isExternal() {
        return this.f20449b;
    }

    public final long n(File file) {
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1L;
    }

    public File o(String str) {
        return new File(r(str));
    }

    @Override // defpackage.py6
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public List<py6.a> f() throws IOException {
        b bVar = new b();
        dm9.c(this.c, bVar);
        return bVar.d();
    }

    public final String r(String str) {
        d dVar = new d(".cnt", str);
        return dVar.c(u(dVar.f20455b));
    }

    @Override // defpackage.py6
    public long remove(String str) {
        return n(o(str));
    }

    public final d s(File file) {
        d dVarB = d.b(file);
        if (dVarB != null && t(dVarB.f20455b).equals(file.getParentFile())) {
            return dVarB;
        }
        return null;
    }

    public final File t(String str) {
        return new File(u(str));
    }

    public final String u(String str) {
        return this.c + File.separator + String.valueOf(Math.abs(str.hashCode() % 100));
    }

    public final void x(File file, String str) throws IOException {
        try {
            FileUtils.a(file);
        } catch (FileUtils.CreateDirectoryException e2) {
            this.d.a(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR, f, str, e2);
            throw e2;
        }
    }

    public final boolean y(String str, boolean z) {
        File fileO = o(str);
        boolean zExists = fileO.exists();
        if (z && zExists) {
            fileO.setLastModified(this.e.now());
        }
        return zExists;
    }

    public final void z() {
        if (this.f20448a.exists()) {
            if (this.c.exists()) {
                return;
            } else {
                dm9.b(this.f20448a);
            }
        }
        try {
            FileUtils.a(this.c);
        } catch (FileUtils.CreateDirectoryException unused) {
            this.d.a(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR, f, "version directory could not be created: " + this.c, null);
        }
    }
}
