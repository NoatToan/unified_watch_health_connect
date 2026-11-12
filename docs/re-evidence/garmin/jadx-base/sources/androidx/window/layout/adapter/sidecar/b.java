package androidx.window.layout.adapter.sidecar;

import android.app.Activity;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import oe.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.j0;
import r0.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0013\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/window/layout/adapter/sidecar/b;", "Lpe/a;", "Landroidx/window/layout/adapter/sidecar/a;", "windowExtension", "<init>", "(Landroidx/window/layout/adapter/sidecar/a;)V", "b", "c", "a", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements pe.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile b f11413d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.window.layout.adapter.sidecar.a f11415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<c> f11416b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f11412c = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ReentrantLock f11414e = new ReentrantLock();

    /* JADX INFO: renamed from: androidx.window.layout.adapter.sidecar.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/window/layout/adapter/sidecar/b$b;", "Landroidx/window/layout/adapter/sidecar/a$a;", "<init>", "(Landroidx/window/layout/adapter/sidecar/b;)V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class C0162b implements androidx.window.layout.adapter.sidecar.a.InterfaceC0161a {
        public C0162b() {
        }

        @Override // androidx.window.layout.adapter.sidecar.a.InterfaceC0161a
        public final void a(Activity activity, l lVar) {
            activity.getClass();
            Iterator<c> it = b.this.f11416b.iterator();
            it.getClass();
            while (it.hasNext()) {
                c next = it.next();
                if (next.f11418a.equals(activity)) {
                    next.f11421d = lVar;
                    next.f11419b.execute(new h(4, next, lVar));
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/window/layout/adapter/sidecar/b$c;", "", "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Lk7/b;", "Loe/l;", "callback", "<init>", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Lk7/b;)V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f11418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f11419b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k7.b<l> f11420c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public l f11421d;

        public c(Activity activity, Executor executor, k7.b<l> bVar) {
            activity.getClass();
            executor.getClass();
            bVar.getClass();
            this.f11418a = activity;
            this.f11419b = executor;
            this.f11420c = bVar;
        }
    }

    public b(androidx.window.layout.adapter.sidecar.a aVar) {
        this.f11415a = aVar;
        if (aVar != null) {
            aVar.a(new C0162b());
        }
    }

    @Override // pe.a
    public final void a(Context context, Executor executor, k7.b<l> bVar) {
        c next;
        context.getClass();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            bVar.accept(new l(j0.f134944a));
            return;
        }
        ReentrantLock reentrantLock = f11414e;
        reentrantLock.lock();
        try {
            androidx.window.layout.adapter.sidecar.a aVar = this.f11415a;
            if (aVar == null) {
                bVar.accept(new l(j0.f134944a));
                reentrantLock.unlock();
                return;
            }
            CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f11416b;
            boolean z14 = false;
            if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                Iterator<c> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().f11418a.equals(activity)) {
                        z14 = true;
                        break;
                    }
                }
            }
            c cVar = new c(activity, executor, bVar);
            copyOnWriteArrayList.add(cVar);
            if (z14) {
                Iterator<c> it3 = copyOnWriteArrayList.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!activity.equals(next.f11418a));
                c cVar2 = next;
                l lVar = cVar2 != null ? cVar2.f11421d : null;
                if (lVar != null) {
                    cVar.f11421d = lVar;
                    cVar.f11419b.execute(new h(4, cVar, lVar));
                }
            } else {
                aVar.c(activity);
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    @Override // pe.a
    public final void b(k7.b<l> bVar) {
        synchronized (f11414e) {
            try {
                if (this.f11415a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator<c> it = this.f11416b.iterator();
                it.getClass();
                while (it.hasNext()) {
                    c next = it.next();
                    if (next.f11420c == bVar) {
                        arrayList.add(next);
                    }
                }
                this.f11416b.removeAll(arrayList);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Activity activity = ((c) it3.next()).f11418a;
                    CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f11416b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator<c> it4 = copyOnWriteArrayList.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (it4.next().f11418a.equals(activity)) {
                                }
                            }
                        }
                    }
                    androidx.window.layout.adapter.sidecar.a aVar = this.f11415a;
                    if (aVar != null) {
                        aVar.b(activity);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/window/layout/adapter/sidecar/b$a;", "", "<init>", "()V", "", "DEBUG", "Z", "Landroidx/window/layout/adapter/sidecar/b;", "globalInstance", "Landroidx/window/layout/adapter/sidecar/b;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "TAG", "Ljava/lang/String;", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
