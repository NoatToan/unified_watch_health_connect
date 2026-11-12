package com.huawei.hms.network.embedded;

import com.huawei.operation.utils.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
public final class ob {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f15156a = Logger.getLogger(ob.class.getName());

    public static zb c(File file) throws FileNotFoundException {
        if (file != null) {
            return a(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static za c(Socket socket) {
        return new d(socket);
    }

    public static zb b(Path path, OpenOption... openOptionArr) throws IOException {
        if (path != null) {
            return a(Files.newInputStream(path, openOptionArr));
        }
        throw new IllegalArgumentException("path == null");
    }

    public static zb b(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        za zaVarC = c(socket);
        return zaVarC.a(a(socket.getInputStream(), zaVarC));
    }

    public static yb b(File file) throws FileNotFoundException {
        if (file != null) {
            return a(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static zb a(InputStream inputStream, ac acVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (acVar != null) {
            return new b(acVar, inputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    public static zb a(InputStream inputStream) {
        return a(inputStream, new ac());
    }

    public static yb a(Path path, OpenOption... openOptionArr) throws IOException {
        if (path != null) {
            return a(Files.newOutputStream(path, openOptionArr));
        }
        throw new IllegalArgumentException("path == null");
    }

    public static yb a(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getOutputStream() == null) {
            throw new IOException("socket's output stream == null");
        }
        za zaVarC = c(socket);
        return zaVarC.a(a(socket.getOutputStream(), zaVarC));
    }

    public static yb a(OutputStream outputStream, ac acVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (acVar != null) {
            return new a(acVar, outputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    public final class a implements yb {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ac f15157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ OutputStream f15158b;

        @Override // com.huawei.hms.network.embedded.yb
        public void write(bb bbVar, long j) throws IOException {
            cc.a(bbVar.f14653b, 0L, j);
            while (j > 0) {
                this.f15157a.throwIfReached();
                vb vbVar = bbVar.f14652a;
                int iMin = (int) Math.min(j, vbVar.f15548c - vbVar.f15547b);
                this.f15158b.write(vbVar.f15546a, vbVar.f15547b, iMin);
                vbVar.f15547b += iMin;
                long j2 = iMin;
                j -= j2;
                bbVar.f14653b -= j2;
                if (vbVar.f15547b == vbVar.f15548c) {
                    bbVar.f14652a = vbVar.b();
                    wb.a(vbVar);
                }
            }
        }

        public String toString() {
            return "sink(" + this.f15158b + Constants.RIGHT_BRACKET_ONLY;
        }

        @Override // com.huawei.hms.network.embedded.yb
        public ac timeout() {
            return this.f15157a;
        }

        @Override // com.huawei.hms.network.embedded.yb, java.io.Flushable
        public void flush() throws IOException {
            this.f15158b.flush();
        }

        @Override // com.huawei.hms.network.embedded.yb, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() throws IOException {
            this.f15158b.close();
        }

        public a(ac acVar, OutputStream outputStream) {
            this.f15157a = acVar;
            this.f15158b = outputStream;
        }
    }

    public static yb a(OutputStream outputStream) {
        return a(outputStream, new ac());
    }

    public final class b implements zb {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ac f15159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InputStream f15160b;

        public String toString() {
            return "source(" + this.f15160b + Constants.RIGHT_BRACKET_ONLY;
        }

        @Override // com.huawei.hms.network.embedded.zb, com.huawei.hms.network.embedded.yb
        public ac timeout() {
            return this.f15159a;
        }

        @Override // com.huawei.hms.network.embedded.zb
        public long read(bb bbVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (j == 0) {
                return 0L;
            }
            try {
                this.f15159a.throwIfReached();
                vb vbVarE = bbVar.e(1);
                int i = this.f15160b.read(vbVarE.f15546a, vbVarE.f15548c, (int) Math.min(j, 8192 - vbVarE.f15548c));
                if (i != -1) {
                    vbVarE.f15548c += i;
                    long j2 = i;
                    bbVar.f14653b += j2;
                    return j2;
                }
                if (vbVarE.f15547b != vbVarE.f15548c) {
                    return -1L;
                }
                bbVar.f14652a = vbVarE.b();
                wb.a(vbVarE);
                return -1L;
            } catch (AssertionError e) {
                if (ob.a(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        }

        @Override // com.huawei.hms.network.embedded.zb, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, com.huawei.hms.network.embedded.yb
        public void close() throws IOException {
            this.f15160b.close();
        }

        public b(ac acVar, InputStream inputStream) {
            this.f15159a = acVar;
            this.f15160b = inputStream;
        }
    }

    public final class c implements yb {
        @Override // com.huawei.hms.network.embedded.yb, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() throws IOException {
        }

        @Override // com.huawei.hms.network.embedded.yb, java.io.Flushable
        public void flush() throws IOException {
        }

        @Override // com.huawei.hms.network.embedded.yb
        public void write(bb bbVar, long j) throws IOException {
            bbVar.skip(j);
        }

        @Override // com.huawei.hms.network.embedded.yb
        public ac timeout() {
            return ac.d;
        }
    }

    public static yb a(File file) throws FileNotFoundException {
        if (file != null) {
            return a(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static yb a() {
        return new c();
    }

    public final class d extends za {
        public final /* synthetic */ Socket l;

        @Override // com.huawei.hms.network.embedded.za
        public void timedOut() {
            Level level;
            StringBuilder sb;
            Logger logger;
            Throwable th;
            try {
                this.l.close();
            } catch (AssertionError e) {
                if (!ob.a(e)) {
                    throw e;
                }
                Logger logger2 = ob.f15156a;
                level = Level.WARNING;
                sb = new StringBuilder("Failed to close timed out socket ");
                th = e;
                logger = logger2;
                sb.append(this.l);
                logger.log(level, sb.toString(), th);
            } catch (Exception e2) {
                Logger logger3 = ob.f15156a;
                level = Level.WARNING;
                sb = new StringBuilder("Failed to close timed out socket ");
                th = e2;
                logger = logger3;
                sb.append(this.l);
                logger.log(level, sb.toString(), th);
            }
        }

        @Override // com.huawei.hms.network.embedded.za
        public IOException newTimeoutException(@Nullable IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public d(Socket socket) {
            this.l = socket;
        }
    }

    public static db a(zb zbVar) {
        return new ub(zbVar);
    }

    public static cb a(yb ybVar) {
        return new tb(ybVar);
    }
}
