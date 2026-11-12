package c83;

import okhttp3.Request;

/* JADX INFO: loaded from: classes11.dex */
public interface d<T> extends Cloneable {
    void cancel();

    d<T> clone();

    a0<T> execute();

    boolean isCanceled();

    void q0(f<T> fVar);

    Request request();
}
