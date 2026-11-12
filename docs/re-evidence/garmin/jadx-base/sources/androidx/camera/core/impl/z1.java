package androidx.camera.core.impl;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface z1<T> {

    public interface a<T> {
        void a(T t7);

        void onError(Throwable th3);
    }

    ListenableFuture<T> b();

    void c(a<? super T> aVar);

    void d(Executor executor, a<? super T> aVar);
}
