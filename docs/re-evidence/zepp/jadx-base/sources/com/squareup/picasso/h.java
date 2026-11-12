package com.squareup.picasso;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes18.dex */
class h extends a<Object> {
    private final Object m;
    private Callback n;

    public h(Picasso picasso, Request request, int i, int i2, Object obj, String str, Callback callback) {
        super(picasso, null, request, i, i2, 0, null, str, obj, false);
        this.m = new Object();
        this.n = callback;
    }

    @Override // com.squareup.picasso.a
    public void a() {
        super.a();
        this.n = null;
    }

    @Override // com.squareup.picasso.a
    public void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        Callback callback = this.n;
        if (callback != null) {
            callback.onSuccess();
        }
    }

    @Override // com.squareup.picasso.a
    public void c() {
        Callback callback = this.n;
        if (callback != null) {
            callback.onError();
        }
    }

    @Override // com.squareup.picasso.a
    public Object k() {
        return this.m;
    }
}
