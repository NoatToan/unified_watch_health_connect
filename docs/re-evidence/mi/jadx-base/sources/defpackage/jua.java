package defpackage;

import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface jua<V> {
    void onFailure(Throwable th);

    void onSuccess(V v);
}
