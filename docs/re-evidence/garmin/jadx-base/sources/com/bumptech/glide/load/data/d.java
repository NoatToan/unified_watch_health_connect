package com.bumptech.glide.load.data;

/* JADX INFO: loaded from: classes7.dex */
public interface d<T> {

    public interface a<T> {
        void c(T t7);

        void e(Exception exc);
    }

    Class<T> a();

    ui.a b();

    void cancel();

    void cleanup();

    void d(com.bumptech.glide.g gVar, a<? super T> aVar);
}
