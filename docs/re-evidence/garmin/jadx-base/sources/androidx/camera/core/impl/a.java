package androidx.camera.core.impl;

import androidx.camera.core.CameraUnavailableException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements z1<List<b0.q>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f5478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<b0.q> f5479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f5480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5481e;

    /* JADX INFO: renamed from: androidx.camera.core.impl.a$a, reason: collision with other inner class name */
    public static class C0077a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f5482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final z1.a<? super List<b0.q>> f5483b;

        public C0077a(Executor executor, z1.a<? super List<b0.q>> aVar) {
            this.f5482a = executor;
            this.f5483b = aVar;
        }
    }

    public a(List<String> list) {
        this.f5477a = new Object();
        this.f5478b = new CopyOnWriteArrayList();
        this.f5480d = null;
        this.f5481e = false;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            b0.q.f14044c.getClass();
            str.getClass();
            arrayList.add(b0.q.a.a(str, null, null));
        }
        this.f5479c = arrayList;
    }

    public abstract void a();

    @Override // androidx.camera.core.impl.z1
    public final void c(z1.a<? super List<b0.q>> aVar) {
        C0077a c0077a;
        aVar.getClass();
        Iterator it = this.f5478b.iterator();
        do {
            if (!it.hasNext()) {
                c0077a = null;
                break;
            }
            c0077a = (C0077a) it.next();
        } while (!c0077a.f5483b.equals(aVar));
        if (c0077a != null) {
            this.f5478b.remove(c0077a);
        }
        synchronized (this.f5477a) {
            try {
                if (this.f5481e && this.f5478b.isEmpty()) {
                    this.f5481e = false;
                    f();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.camera.core.impl.z1
    public final void d(Executor executor, z1.a<? super List<b0.q>> aVar) {
        List listUnmodifiableList;
        Throwable th3;
        executor.getClass();
        aVar.getClass();
        this.f5478b.add(new C0077a(executor, aVar));
        synchronized (this.f5477a) {
            try {
                if (!this.f5481e && !this.f5478b.isEmpty()) {
                    this.f5481e = true;
                    a();
                }
                listUnmodifiableList = Collections.unmodifiableList(this.f5479c);
                th3 = this.f5480d;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        C0077a c0077a = new C0077a(executor, aVar);
        c0077a.f5482a.execute(new a8.d(th3, 2, c0077a, listUnmodifiableList));
    }

    public abstract void f();

    public final void g(ArrayList arrayList, CameraUnavailableException cameraUnavailableException) {
        boolean z14;
        List listUnmodifiableList;
        Throwable th3;
        synchronized (this.f5477a) {
            z14 = true;
            try {
                if (cameraUnavailableException != null) {
                    if (this.f5480d != null && this.f5479c.isEmpty()) {
                        z14 = false;
                    }
                    this.f5480d = cameraUnavailableException;
                    this.f5479c = Collections.EMPTY_LIST;
                } else {
                    arrayList.getClass();
                    if (this.f5480d == null && this.f5479c.equals(arrayList)) {
                        z14 = false;
                    }
                    this.f5480d = null;
                    this.f5479c = arrayList;
                }
                listUnmodifiableList = Collections.unmodifiableList(this.f5479c);
                th3 = this.f5480d;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (z14) {
            this.f5478b.size();
            for (C0077a c0077a : this.f5478b) {
                c0077a.f5482a.execute(new a8.d(th3, 2, c0077a, listUnmodifiableList));
            }
        }
    }

    public a() {
        this(Collections.EMPTY_LIST);
    }
}
