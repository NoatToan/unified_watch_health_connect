package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public interface z5h<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(jz6 jz6Var);
}
