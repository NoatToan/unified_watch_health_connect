package com.bumptech.glide.integration.okhttp3;

import aj.h;
import aj.o;
import aj.p;
import aj.s;
import java.io.InputStream;
import okhttp3.Call;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes7.dex */
public class b implements o<h, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Call.Factory f28499a;

    public b(Call.Factory factory) {
        this.f28499a = factory;
    }

    @Override // aj.o
    public final o.a<InputStream> a(h hVar, int i14, int i15, ui.h hVar2) {
        h hVar3 = hVar;
        return new o.a<>(hVar3, new ti.a(this.f28499a, hVar3));
    }

    @Override // aj.o
    public final /* bridge */ /* synthetic */ boolean b(h hVar) {
        return true;
    }

    public static class a implements p<h, InputStream> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static volatile OkHttpClient f28500b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Call.Factory f28501a;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a() {
            this(f28500b);
            if (f28500b == null) {
                synchronized (a.class) {
                    try {
                        if (f28500b == null) {
                            f28500b = new OkHttpClient();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }

        @Override // aj.p
        public final o<h, InputStream> d(s sVar) {
            return new b(this.f28501a);
        }

        public a(Call.Factory factory) {
            this.f28501a = factory;
        }
    }
}
