package io.reactivex;

import io.reactivex.annotations.NonNull;

/* JADX INFO: loaded from: classes22.dex */
public interface ObservableOnSubscribe<T> {
    void subscribe(@NonNull ObservableEmitter<T> observableEmitter) throws Exception;
}
