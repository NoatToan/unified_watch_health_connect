package com.bumptech.glide.load.data;

import defpackage.a6i;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.bumptech.glide.load.data.a.InterfaceC0136a<?> f6966b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, com.bumptech.glide.load.data.a.InterfaceC0136a<?>> f6967a = new HashMap();

    public class a implements com.bumptech.glide.load.data.a.InterfaceC0136a<Object> {
        @Override // com.bumptech.glide.load.data.a.InterfaceC0136a
        public Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0136a
        public com.bumptech.glide.load.data.a<Object> b(Object obj) {
            return new C0137b(obj);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.b$b, reason: collision with other inner class name */
    public static final class C0137b implements com.bumptech.glide.load.data.a<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f6968a;

        public C0137b(Object obj) {
            this.f6968a = obj;
        }

        @Override // com.bumptech.glide.load.data.a
        public Object a() {
            return this.f6968a;
        }

        @Override // com.bumptech.glide.load.data.a
        public void b() {
        }
    }

    public synchronized <T> com.bumptech.glide.load.data.a<T> a(T t) {
        com.bumptech.glide.load.data.a.InterfaceC0136a<?> interfaceC0136a;
        try {
            a6i.d(t);
            interfaceC0136a = this.f6967a.get(t.getClass());
            if (interfaceC0136a == null) {
                for (com.bumptech.glide.load.data.a.InterfaceC0136a<?> interfaceC0136a2 : this.f6967a.values()) {
                    if (interfaceC0136a2.a().isAssignableFrom(t.getClass())) {
                        interfaceC0136a = interfaceC0136a2;
                        break;
                    }
                }
            }
            if (interfaceC0136a == null) {
                interfaceC0136a = f6966b;
            }
        } catch (Throwable th) {
            throw th;
        }
        return (com.bumptech.glide.load.data.a<T>) interfaceC0136a.b(t);
    }

    public synchronized void b(com.bumptech.glide.load.data.a.InterfaceC0136a<?> interfaceC0136a) {
        this.f6967a.put(interfaceC0136a.a(), interfaceC0136a);
    }
}
