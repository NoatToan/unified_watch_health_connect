package com.bumptech.glide.load.data;

import defpackage.fak;
import defpackage.nj1;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements com.bumptech.glide.load.data.a<InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fak f6969a;

    public static final class a implements com.bumptech.glide.load.data.a.InterfaceC0136a<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final nj1 f6970a;

        public a(nj1 nj1Var) {
            this.f6970a = nj1Var;
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0136a
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0136a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public com.bumptech.glide.load.data.a<InputStream> b(InputStream inputStream) {
            return new c(inputStream, this.f6970a);
        }
    }

    public c(InputStream inputStream, nj1 nj1Var) {
        fak fakVar = new fak(inputStream, nj1Var);
        this.f6969a = fakVar;
        fakVar.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.a
    public void b() {
        this.f6969a.c();
    }

    public void c() {
        this.f6969a.b();
    }

    @Override // com.bumptech.glide.load.data.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream a() throws IOException {
        this.f6969a.reset();
        return this.f6969a;
    }
}
