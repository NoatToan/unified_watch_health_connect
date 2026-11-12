package com.bumptech.glide.load.data;

import dj.y;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements e<InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f28556a;

    public static final class a implements e.a<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi.b f28557a;

        public a(xi.b bVar) {
            this.f28557a = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public final Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public final e<InputStream> b(InputStream inputStream) {
            return new k(inputStream, this.f28557a);
        }
    }

    public k(InputStream inputStream, xi.b bVar) {
        y yVar = new y(inputStream, bVar);
        this.f28556a = yVar;
        yVar.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.e
    public final InputStream a() {
        y yVar = this.f28556a;
        yVar.reset();
        return yVar;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cleanup() {
        this.f28556a.release();
    }
}
