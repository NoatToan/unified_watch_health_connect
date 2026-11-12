package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class l<T> implements d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f28559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContentResolver f28560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T f28561d;

    public l(ContentResolver contentResolver, Uri uri, boolean z14) {
        this.f28560c = contentResolver;
        this.f28559b = uri;
        this.f28558a = z14;
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
        T t7 = this.f28561d;
        if (t7 != null) {
            try {
                c(t7);
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.Object] */
    @Override // com.bumptech.glide.load.data.d
    public final void d(com.bumptech.glide.g gVar, d.a<? super T> aVar) {
        try {
            ?? r14 = (T) e(this.f28560c, this.f28559b);
            this.f28561d = r14;
            aVar.c(r14);
        } catch (FileNotFoundException e4) {
            aVar.e(e4);
        }
    }

    public abstract Object e(ContentResolver contentResolver, Uri uri);

    public l(ContentResolver contentResolver, Uri uri) {
        this(contentResolver, uri, false);
    }
}
