package com.bumptech.glide;

import android.content.Context;
import androidx.collection.ArrayMap;
import defpackage.a0b;
import defpackage.b0b;
import defpackage.bf4;
import defpackage.cq2;
import defpackage.dq2;
import defpackage.du5;
import defpackage.fpf;
import defpackage.fy6;
import defpackage.hg1;
import defpackage.nj1;
import defpackage.ob8;
import defpackage.pok;
import defpackage.qpf;
import defpackage.tve;
import defpackage.uve;
import defpackage.vok;
import defpackage.wed;
import defpackage.zve;
import defpackage.zzp;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public ob8 c;
    public cq2 d;
    public nj1 e;
    public fpf f;
    public a0b g;
    public a0b h;
    public fy6.a i;
    public qpf j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public bf4 f6941k;
    public com.bumptech.glide.manager.b.InterfaceC0141b n;
    public a0b o;
    public boolean p;
    public List<pok<Object>> q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, zzp<?, ?>> f6939a = new ArrayMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d.a f6940b = new d.a();
    public int l = 4;
    public com.bumptech.glide.a.InterfaceC0132a m = new a();

    public class a implements com.bumptech.glide.a.InterfaceC0132a {
        public a() {
        }

        @Override // com.bumptech.glide.a.InterfaceC0132a
        public vok build() {
            return new vok();
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.b$b, reason: collision with other inner class name */
    public static final class C0133b {
    }

    public static final class c {
    }

    public com.bumptech.glide.a a(Context context, List<b0b> list, hg1 hg1Var) {
        if (this.g == null) {
            this.g = a0b.h();
        }
        if (this.h == null) {
            this.h = a0b.f();
        }
        if (this.o == null) {
            this.o = a0b.d();
        }
        if (this.j == null) {
            this.j = new qpf.a(context).a();
        }
        if (this.f6941k == null) {
            this.f6941k = new du5();
        }
        if (this.d == null) {
            int iB = this.j.b();
            if (iB > 0) {
                this.d = new uve(iB);
            } else {
                this.d = new dq2();
            }
        }
        if (this.e == null) {
            this.e = new tve(this.j.a());
        }
        if (this.f == null) {
            this.f = new zve(this.j.d());
        }
        if (this.i == null) {
            this.i = new wed(context);
        }
        if (this.c == null) {
            this.c = new ob8(this.f, this.i, this.h, this.g, a0b.i(), this.o, this.p);
        }
        List<pok<Object>> list2 = this.q;
        if (list2 == null) {
            this.q = Collections.emptyList();
        } else {
            this.q = Collections.unmodifiableList(list2);
        }
        return new com.bumptech.glide.a(context, this.c, this.f, this.d, this.e, new com.bumptech.glide.manager.b(this.n), this.f6941k, this.l, this.m, this.f6939a, this.q, list, hg1Var, this.f6940b.b());
    }

    public void b(com.bumptech.glide.manager.b.InterfaceC0141b interfaceC0141b) {
        this.n = interfaceC0141b;
    }
}
