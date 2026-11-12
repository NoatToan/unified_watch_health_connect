package defpackage;

import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface m4h<T> {

    public interface a<T> {
        void a(T t);

        void onError(Throwable th);
    }

    void a(a<? super T> aVar);

    void b(Executor executor, a<? super T> aVar);
}
