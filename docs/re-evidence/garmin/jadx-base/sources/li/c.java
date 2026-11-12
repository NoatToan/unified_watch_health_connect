package li;

import java.io.Closeable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import o53.d1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lli/c;", "Ljava/io/Closeable;", "Lokio/Closeable;", "<init>", "()V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class c implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f112564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1 f112565b;

    public c() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.getClass();
        this.f112565b = new d1(executorServiceNewSingleThreadExecutor);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f112564a) {
            return;
        }
        this.f112565b.close();
        this.f112564a = true;
    }
}
