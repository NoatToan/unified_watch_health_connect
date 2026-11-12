package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import defpackage.ghe;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class d<T> {
    public static final Executor h = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ghe f2869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.recyclerview.widget.c<T> f2870b;
    public Executor c;
    public List<T> e;
    public int g;
    public final List<b<T>> d = new CopyOnWriteArrayList();
    public List<T> f = Collections.emptyList();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f2871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f2872b;
        public final /* synthetic */ int c;
        public final /* synthetic */ Runnable d;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.d$a$a, reason: collision with other inner class name */
        public class C0068a extends h.b {
            public C0068a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.h.b
            public boolean areContentsTheSame(int i, int i2) {
                Object obj = a.this.f2871a.get(i);
                Object obj2 = a.this.f2872b.get(i2);
                if (obj != null && obj2 != null) {
                    return d.this.f2870b.b().areContentsTheSame(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.h.b
            public boolean areItemsTheSame(int i, int i2) {
                Object obj = a.this.f2871a.get(i);
                Object obj2 = a.this.f2872b.get(i2);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                }
                return d.this.f2870b.b().areItemsTheSame(obj, obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.h.b
            public Object getChangePayload(int i, int i2) {
                Object obj = a.this.f2871a.get(i);
                Object obj2 = a.this.f2872b.get(i2);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return d.this.f2870b.b().getChangePayload(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.h.b
            public int getNewListSize() {
                return a.this.f2872b.size();
            }

            @Override // androidx.recyclerview.widget.h.b
            public int getOldListSize() {
                return a.this.f2871a.size();
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h.e f2874a;

            public b(h.e eVar) {
                this.f2874a = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.g == aVar.c) {
                    dVar.c(aVar.f2872b, this.f2874a, aVar.d);
                }
            }
        }

        public a(List list, List list2, int i, Runnable runnable) {
            this.f2871a = list;
            this.f2872b = list2;
            this.c = i;
            this.d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.c.execute(new b(h.b(new C0068a())));
        }
    }

    public interface b<T> {
        void a(List<T> list, List<T> list2);
    }

    public static class c implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f2876a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f2876a.post(runnable);
        }
    }

    public d(ghe gheVar, androidx.recyclerview.widget.c<T> cVar) {
        this.f2869a = gheVar;
        this.f2870b = cVar;
        if (cVar.c() != null) {
            this.c = cVar.c();
        } else {
            this.c = h;
        }
    }

    public void a(b<T> bVar) {
        this.d.add(bVar);
    }

    public List<T> b() {
        return this.f;
    }

    public void c(List<T> list, h.e eVar, Runnable runnable) {
        List<T> list2 = this.f;
        this.e = list;
        this.f = Collections.unmodifiableList(list);
        eVar.c(this.f2869a);
        d(list2, runnable);
    }

    public final void d(List<T> list, Runnable runnable) {
        Iterator<b<T>> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().a(list, this.f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void e(List<T> list) {
        f(list, null);
    }

    public void f(List<T> list, Runnable runnable) {
        int i = this.g + 1;
        this.g = i;
        List<T> list2 = this.e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f;
        if (list == null) {
            int size = list2.size();
            this.e = null;
            this.f = Collections.emptyList();
            this.f2869a.onRemoved(0, size);
            d(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.f2870b.a().execute(new a(list2, list, i, runnable));
            return;
        }
        this.e = list;
        this.f = Collections.unmodifiableList(list);
        this.f2869a.onInserted(0, list.size());
        d(list3, runnable);
    }
}
