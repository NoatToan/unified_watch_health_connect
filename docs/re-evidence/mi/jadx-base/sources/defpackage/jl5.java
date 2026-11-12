package defpackage;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* JADX INFO: loaded from: classes4.dex */
public interface jl5<T> {

    public interface a<T> {
        void e(T t);

        void f(Exception exc);
    }

    Class<T> a();

    void b();

    void c(Priority priority, a<? super T> aVar);

    void cancel();

    DataSource d();
}
