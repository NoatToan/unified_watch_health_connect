package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b<T> implements d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AssetManager f28536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f28537c;

    public b(AssetManager assetManager, String str) {
        this.f28536b = assetManager;
        this.f28535a = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public final ui.a b() {
        return ui.a.LOCAL;
    }

    public abstract void c(T t7);

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cleanup() {
        T t7 = this.f28537c;
        if (t7 == null) {
            return;
        }
        try {
            c(t7);
        } catch (IOException unused) {
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void d(com.bumptech.glide.g gVar, d.a<? super T> aVar) {
        try {
            T tE = e(this.f28536b, this.f28535a);
            this.f28537c = tE;
            aVar.c(tE);
        } catch (IOException e4) {
            aVar.e(e4);
        }
    }

    public abstract T e(AssetManager assetManager, String str);
}
