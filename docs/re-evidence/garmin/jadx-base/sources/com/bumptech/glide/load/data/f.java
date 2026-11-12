package com.bumptech.glide.load.data;

import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f28542b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f28543a = new HashMap();

    public class a implements e.a<Object> {
        @Override // com.bumptech.glide.load.data.e.a
        public final Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.e.a
        public final e<Object> b(Object obj) {
            return new b(obj);
        }
    }

    public static final class b implements e<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f28544a;

        public b(Object obj) {
            this.f28544a = obj;
        }

        @Override // com.bumptech.glide.load.data.e
        public final Object a() {
            return this.f28544a;
        }

        @Override // com.bumptech.glide.load.data.e
        public final void cleanup() {
        }
    }
}
