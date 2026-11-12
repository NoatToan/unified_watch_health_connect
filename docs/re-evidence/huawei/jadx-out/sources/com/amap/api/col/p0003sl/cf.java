package com.amap.api.col.p0003sl;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public abstract class cf implements cj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f2308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected bb f2309b;

    public cf(int i, bb bbVar) {
        this.f2308a = i;
        this.f2309b = bbVar;
    }

    public final int b() {
        return this.f2308a;
    }

    public final boolean a(cf cfVar) {
        return cfVar.b() == b();
    }

    public final void b(cf cfVar) {
        b();
        cfVar.b();
        Objects.toString(getClass());
        Objects.toString(cfVar.getClass());
    }

    public void c() {
        b();
        Objects.toString(getClass());
    }

    public void d() {
        b();
        Objects.toString(getClass());
    }

    public void e() {
        b();
        Objects.toString(getClass());
    }

    public void a() {
        b();
        Objects.toString(getClass());
    }

    public void a(int i) {
        b();
        Objects.toString(getClass());
    }

    public void f() {
        b();
        Objects.toString(getClass());
    }

    public void g() {
        b();
        Objects.toString(getClass());
    }
}
