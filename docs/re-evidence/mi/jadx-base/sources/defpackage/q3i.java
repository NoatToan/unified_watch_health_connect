package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class q3i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v63 f31045b;

    public q3i(v63 v63Var) {
        this(v63Var, 16384);
    }

    public long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = this.f31045b.get(this.f31044a);
        long j = 0;
        while (true) {
            try {
                int i = inputStream.read(bArr, 0, this.f31044a);
                if (i == -1) {
                    this.f31045b.release(bArr);
                    return j;
                }
                outputStream.write(bArr, 0, i);
                j += (long) i;
            } catch (Throwable th) {
                this.f31045b.release(bArr);
                throw th;
            }
        }
    }

    public q3i(v63 v63Var, int i) {
        b6i.b(i > 0);
        this.f31044a = i;
        this.f31045b = v63Var;
    }
}
