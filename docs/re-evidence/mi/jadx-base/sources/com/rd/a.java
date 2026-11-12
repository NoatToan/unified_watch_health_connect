package com.rd;

import defpackage.gnq;
import defpackage.h47;
import defpackage.mnq;
import defpackage.s7d;
import defpackage.sc1;

/* JADX INFO: loaded from: classes6.dex */
public class a implements mnq.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h47 f10452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sc1 f10453b;
    public InterfaceC0332a c;

    /* JADX INFO: renamed from: com.rd.a$a, reason: collision with other inner class name */
    public interface InterfaceC0332a {
        void a();
    }

    public a(InterfaceC0332a interfaceC0332a) {
        this.c = interfaceC0332a;
        h47 h47Var = new h47();
        this.f10452a = h47Var;
        this.f10453b = new sc1(h47Var.b(), this);
    }

    @Override // mnq.a
    public void a(gnq gnqVar) {
        this.f10452a.g(gnqVar);
        InterfaceC0332a interfaceC0332a = this.c;
        if (interfaceC0332a != null) {
            interfaceC0332a.a();
        }
    }

    public sc1 b() {
        return this.f10453b;
    }

    public h47 c() {
        return this.f10452a;
    }

    public s7d d() {
        return this.f10452a.b();
    }
}
