package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import defpackage.c0b;
import defpackage.c6d;
import defpackage.jya;
import defpackage.lxq;
import defpackage.nj1;
import defpackage.ob8;
import defpackage.pok;
import defpackage.vok;
import defpackage.zzp;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class c extends ContextWrapper {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @VisibleForTesting
    public static final zzp<?, ?> f6943k = new jya();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj1 f6944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0b.b<Registry> f6945b;
    public final c6d c;
    public final a.InterfaceC0132a d;
    public final List<pok<Object>> e;
    public final Map<Class<?>, zzp<?, ?>> f;
    public final ob8 g;
    public final d h;
    public final int i;

    @GuardedBy("this")
    public vok j;

    public c(Context context, nj1 nj1Var, c0b.b<Registry> bVar, c6d c6dVar, a.InterfaceC0132a interfaceC0132a, Map<Class<?>, zzp<?, ?>> map, List<pok<Object>> list, ob8 ob8Var, d dVar, int i) {
        super(context.getApplicationContext());
        this.f6944a = nj1Var;
        this.c = c6dVar;
        this.d = interfaceC0132a;
        this.e = list;
        this.f = map;
        this.g = ob8Var;
        this.h = dVar;
        this.i = i;
        this.f6945b = c0b.a(bVar);
    }

    public <X> lxq<ImageView, X> a(ImageView imageView, Class<X> cls) {
        return this.c.a(imageView, cls);
    }

    public nj1 b() {
        return this.f6944a;
    }

    public List<pok<Object>> c() {
        return this.e;
    }

    public synchronized vok d() {
        try {
            if (this.j == null) {
                this.j = this.d.build().O();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.j;
    }

    public <T> zzp<?, T> e(Class<T> cls) {
        zzp<?, T> zzpVar = (zzp) this.f.get(cls);
        if (zzpVar == null) {
            for (Map.Entry<Class<?>, zzp<?, ?>> entry : this.f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    zzpVar = (zzp) entry.getValue();
                }
            }
        }
        return zzpVar == null ? (zzp<?, T>) f6943k : zzpVar;
    }

    public ob8 f() {
        return this.g;
    }

    public d g() {
        return this.h;
    }

    public int h() {
        return this.i;
    }

    public Registry i() {
        return this.f6945b.get();
    }
}
