package defpackage;

/* JADX INFO: loaded from: classes10.dex */
public interface tgc {
    void onComplete();

    void onError(String str);

    default void onProgress(int i) {
    }
}
