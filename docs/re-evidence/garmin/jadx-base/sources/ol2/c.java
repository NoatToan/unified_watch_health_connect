package ol2;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import ml2.r;
import ml2.s;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f132876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OutputStream f132877b;

    private c(InputStream inputStream, OutputStream outputStream) {
        this.f132876a = inputStream;
        this.f132877b = outputStream;
    }

    public static /* synthetic */ c a(a aVar, r rVar) {
        rVar.d(aVar);
        return new c(aVar, new b((s) rVar));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f132876a.close();
        this.f132877b.close();
    }
}
