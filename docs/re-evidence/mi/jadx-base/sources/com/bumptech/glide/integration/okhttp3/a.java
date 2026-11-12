package com.bumptech.glide.integration.okhttp3;

import defpackage.cch;
import defpackage.d7g;
import defpackage.e0b;
import defpackage.e7g;
import defpackage.iag;
import defpackage.k7h;
import java.io.InputStream;
import okhttp3.Call;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes4.dex */
public class a implements d7g<e0b, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Call.Factory f6950a;

    /* JADX INFO: renamed from: com.bumptech.glide.integration.okhttp3.a$a, reason: collision with other inner class name */
    public static class C0134a implements e7g<e0b, InputStream> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static volatile Call.Factory f6951b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Call.Factory f6952a;

        public C0134a() {
            this(a());
        }

        public static Call.Factory a() {
            if (f6951b == null) {
                synchronized (C0134a.class) {
                    try {
                        if (f6951b == null) {
                            f6951b = new OkHttpClient();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return f6951b;
        }

        @Override // defpackage.e7g
        public void c() {
        }

        @Override // defpackage.e7g
        public d7g<e0b, InputStream> d(iag iagVar) {
            return new a(this.f6952a);
        }

        public C0134a(Call.Factory factory) {
            this.f6952a = factory;
        }
    }

    public a(Call.Factory factory) {
        this.f6950a = factory;
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d7g.a<InputStream> b(e0b e0bVar, int i, int i2, cch cchVar) {
        return new d7g.a<>(e0bVar, new k7h(this.f6950a, e0bVar));
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(e0b e0bVar) {
        return true;
    }
}
