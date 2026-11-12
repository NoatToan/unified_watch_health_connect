package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.model.enums.RandomAccessFileMode;
import net.lingala.zip4j.progress.ProgressMonitor;
import net.lingala.zip4j.tasks.AsyncZipTask;

/* JADX INFO: loaded from: classes20.dex */
public class zom implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Charset f54394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private zoz f54395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f54396c;
    private ExecutorService d;
    private List<InputStream> e;
    private ProgressMonitor f;
    private boolean g;
    private char[] h;
    private ThreadFactory i;
    private boolean j;
    private File l;
    private zqh n;

    public zom(File file) {
        this(file, null);
    }

    public zom(File file, char[] cArr) {
        this.f54395b = new zoz();
        this.f54394a = null;
        this.f54396c = 4096;
        this.e = new ArrayList();
        this.j = true;
        if (file == null) {
            throw new IllegalArgumentException("input zip file parameter is null");
        }
        this.l = file;
        this.h = cArr;
        this.g = false;
        this.f = new ProgressMonitor();
    }

    public void d(File file, ZipParameters zipParameters, boolean z, long j) throws ZipException {
        if (file == null) {
            throw new ZipException("folderToAdd is null, cannot create zip file from folder");
        }
        if (zipParameters == null) {
            throw new ZipException("input parameters are null, cannot create zip file from folder");
        }
        if (this.l.exists()) {
            throw new ZipException("zip file: " + this.l + " already exists. To add files to existing zip file use addFolder method");
        }
        b();
        this.n.b(z);
        if (z) {
            this.n.d(j);
        }
        e(file, zipParameters, false);
    }

    private void e(File file, ZipParameters zipParameters, boolean z) throws ZipException {
        e();
        zqh zqhVar = this.n;
        if (zqhVar == null) {
            throw new ZipException("internal error: zip model is null");
        }
        if (z && zqhVar.i()) {
            throw new ZipException("This is a split archive. Zip file format does not allow updating split/spanned files");
        }
        new zqe(this.n, this.h, this.f54395b, c()).execute(new zqe.c(file, zipParameters, a()));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Iterator<InputStream> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().close();
        }
        this.e.clear();
    }

    private void e() throws ZipException {
        if (this.n != null) {
            return;
        }
        if (!this.l.exists()) {
            b();
            return;
        }
        if (!this.l.canRead()) {
            throw new ZipException("no read access for the input zip file");
        }
        try {
            RandomAccessFile randomAccessFileD = d();
            try {
                zqh zqhVarA = new zow().a(randomAccessFileD, a());
                this.n = zqhVarA;
                zqhVarA.d(this.l);
                if (randomAccessFileD != null) {
                    randomAccessFileD.close();
                }
            } catch (Throwable th) {
                if (randomAccessFileD != null) {
                    try {
                        randomAccessFileD.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (ZipException e) {
            throw e;
        } catch (IOException e2) {
            throw new ZipException(e2);
        }
    }

    private void b() {
        zqh zqhVar = new zqh();
        this.n = zqhVar;
        zqhVar.d(this.l);
    }

    private RandomAccessFile d() throws IOException {
        if (zqk.b(this.l)) {
            zpc zpcVar = new zpc(this.l, RandomAccessFileMode.READ.getValue(), zqk.a(this.l));
            zpcVar.b();
            return zpcVar;
        }
        return new RandomAccessFile(this.l, RandomAccessFileMode.READ.getValue());
    }

    private AsyncZipTask.e c() {
        if (this.g) {
            if (this.i == null) {
                this.i = Executors.defaultThreadFactory();
            }
            this.d = Executors.newSingleThreadExecutor(this.i);
        }
        return new AsyncZipTask.e(this.d, this.g, this.f);
    }

    public String toString() {
        return this.l.toString();
    }

    private zqc a() {
        return new zqc(this.f54394a, this.f54396c, this.j);
    }
}
