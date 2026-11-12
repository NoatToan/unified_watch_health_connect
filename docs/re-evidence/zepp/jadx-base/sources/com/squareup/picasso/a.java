package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes18.dex */
abstract class a<T> {
    public final Picasso a;
    public final Request b;
    public final WeakReference<T> c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final Drawable h;
    public final String i;
    public final Object j;
    public boolean k;
    public boolean l;

    /* JADX INFO: renamed from: com.squareup.picasso.a$a, reason: collision with other inner class name */
    public static class C0745a<M> extends WeakReference<M> {
        public final a a;

        public C0745a(a aVar, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.a = aVar;
        }
    }

    public a(Picasso picasso, T t, Request request, int i, int i2, int i3, Drawable drawable, String str, Object obj, boolean z) {
        this.a = picasso;
        this.b = request;
        this.c = t == null ? null : new C0745a(this, t, picasso.k);
        this.e = i;
        this.f = i2;
        this.d = z;
        this.g = i3;
        this.h = drawable;
        this.i = str;
        this.j = obj == null ? this : obj;
    }

    public void a() {
        this.l = true;
    }

    public abstract void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom);

    public abstract void c();

    public String d() {
        return this.i;
    }

    public int e() {
        return this.e;
    }

    public int f() {
        return this.f;
    }

    public Picasso g() {
        return this.a;
    }

    public Picasso.Priority h() {
        return this.b.priority;
    }

    public Request i() {
        return this.b;
    }

    public Object j() {
        return this.j;
    }

    public T k() {
        WeakReference<T> weakReference = this.c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public boolean l() {
        return this.l;
    }

    public boolean m() {
        return this.k;
    }
}
