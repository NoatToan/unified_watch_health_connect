package com.facebook.jni;

import defpackage.d8i;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static Thread d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static d f7137b = new d(null);
    public static ReferenceQueue c = new ReferenceQueue();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c f7136a = new c();

    /* JADX INFO: renamed from: com.facebook.jni.a$a, reason: collision with other inner class name */
    public class C0151a extends Thread {
        public C0151a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    b bVar = (b) a.c.remove();
                    bVar.e();
                    if (bVar.f7139b == null) {
                        a.f7137b.b();
                    }
                    c.b(bVar);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public static abstract class b extends PhantomReference<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f7138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b f7139b;

        public /* synthetic */ b(C0151a c0151a) {
            this();
        }

        public abstract void e();

        public b(Object obj) {
            super(obj, a.c);
            a.f7137b.a(this);
        }

        public b() {
            super(null, a.c);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f7140a;

        public c() {
            C0151a c0151a = null;
            e eVar = new e(c0151a);
            this.f7140a = eVar;
            eVar.f7138a = new e(c0151a);
            this.f7140a.f7138a.f7139b = this.f7140a;
        }

        public static void b(b bVar) {
            bVar.f7138a.f7139b = bVar.f7139b;
            bVar.f7139b.f7138a = bVar.f7138a;
        }

        public void c(b bVar) {
            bVar.f7138a = this.f7140a.f7138a;
            this.f7140a.f7138a = bVar;
            bVar.f7138a.f7139b = bVar;
            bVar.f7139b = this.f7140a;
        }
    }

    public static class e extends b {
        public e() {
            super((C0151a) null);
        }

        @Override // com.facebook.jni.a.b
        public void e() {
            throw new IllegalStateException("Cannot destroy Terminus Destructor.");
        }

        public /* synthetic */ e(C0151a c0151a) {
            this();
        }
    }

    static {
        C0151a c0151a = new C0151a("HybridData DestructorThread");
        d = c0151a;
        c0151a.start();
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AtomicReference<b> f7141a;

        public d() {
            this.f7141a = new AtomicReference<>();
        }

        public void a(b bVar) {
            b bVar2;
            do {
                bVar2 = this.f7141a.get();
                bVar.f7138a = bVar2;
            } while (!d8i.a(this.f7141a, bVar2, bVar));
        }

        public void b() {
            b andSet = this.f7141a.getAndSet(null);
            while (andSet != null) {
                b bVar = andSet.f7138a;
                a.f7136a.c(andSet);
                andSet = bVar;
            }
        }

        public /* synthetic */ d(C0151a c0151a) {
            this();
        }
    }
}
