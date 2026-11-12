package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class oy6 implements fy6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f29808b;
    public final long c;
    public my6 e;
    public final ky6 d = new ky6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e9l f29807a = new e9l();

    @Deprecated
    public oy6(File file, long j) {
        this.f29808b = file;
        this.c = j;
    }

    public static fy6 c(File file, long j) {
        return new oy6(file, j);
    }

    @Override // defpackage.fy6
    public File a(pzd pzdVar) {
        String strB = this.f29807a.b(pzdVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Get: Obtained: ");
            sb.append(strB);
            sb.append(" for for Key: ");
            sb.append(pzdVar);
        }
        try {
            my6.e eVarN = d().N(strB);
            if (eVarN != null) {
                return eVarN.a(0);
            }
            return null;
        } catch (IOException unused) {
            Log.isLoggable("DiskLruCacheWrapper", 5);
            return null;
        }
    }

    @Override // defpackage.fy6
    public void b(pzd pzdVar, fy6.b bVar) {
        String strB = this.f29807a.b(pzdVar);
        this.d.a(strB);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Put: Obtained: ");
                sb.append(strB);
                sb.append(" for for Key: ");
                sb.append(pzdVar);
            }
            try {
                my6 my6VarD = d();
                if (my6VarD.N(strB) != null) {
                    this.d.b(strB);
                    return;
                }
                my6.c cVarJ = my6VarD.J(strB);
                if (cVarJ == null) {
                    throw new IllegalStateException("Had two simultaneous puts for: " + strB);
                }
                try {
                    if (bVar.a(cVarJ.f(0))) {
                        cVarJ.e();
                    }
                    cVarJ.b();
                    this.d.b(strB);
                } catch (Throwable th) {
                    cVarJ.b();
                    throw th;
                }
            } catch (IOException unused) {
                Log.isLoggable("DiskLruCacheWrapper", 5);
            }
        } catch (Throwable th2) {
            this.d.b(strB);
            throw th2;
        }
    }

    @Override // defpackage.fy6
    public synchronized void clear() {
        try {
            try {
                d().D();
            } catch (IOException unused) {
                Log.isLoggable("DiskLruCacheWrapper", 5);
            }
            e();
        } catch (Throwable th) {
            e();
            throw th;
        }
    }

    public final synchronized my6 d() throws IOException {
        try {
            if (this.e == null) {
                this.e = my6.P(this.f29808b, 1, 1, this.c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.e;
    }

    public final synchronized void e() {
        this.e = null;
    }
}
