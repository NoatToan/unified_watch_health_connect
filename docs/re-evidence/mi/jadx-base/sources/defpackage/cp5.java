package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public interface cp5<T> {
    boolean a();

    Throwable b();

    void c(mp5<T> mp5Var, Executor executor);

    boolean close();

    boolean d();

    float getProgress();

    T getResult();

    boolean hasResult();
}
