package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class d<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f10420h = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f10421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.recyclerview.widget.c<T> f10422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f10423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f10424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<T> f10425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<T> f10426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10427g;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f10428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f10429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f10430c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Runnable f10431d;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.d$a$a, reason: collision with other inner class name */
        public class C0145a extends o.b {
            public C0145a() {
            }

            @Override // androidx.recyclerview.widget.o.b
            public final boolean a(int i14, int i15) {
                a aVar = a.this;
                Object obj = aVar.f10428a.get(i14);
                Object obj2 = aVar.f10429b.get(i15);
                if (obj != null && obj2 != null) {
                    return d.this.f10422b.f10415c.a((T) obj, (T) obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                v.e0.l();
                return false;
            }

            @Override // androidx.recyclerview.widget.o.b
            public final boolean b(int i14, int i15) {
                a aVar = a.this;
                Object obj = aVar.f10428a.get(i14);
                Object obj2 = aVar.f10429b.get(i15);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                }
                return d.this.f10422b.f10415c.b((T) obj, (T) obj2);
            }

            @Override // androidx.recyclerview.widget.o.b
            public final Object c(int i14, int i15) {
                a aVar = a.this;
                Object obj = aVar.f10428a.get(i14);
                Object obj2 = aVar.f10429b.get(i15);
                if (obj != null && obj2 != null) {
                    return d.this.f10422b.f10415c.c((T) obj, (T) obj2);
                }
                v.e0.l();
                return null;
            }

            @Override // androidx.recyclerview.widget.o.b
            public final int d() {
                return a.this.f10429b.size();
            }

            @Override // androidx.recyclerview.widget.o.b
            public final int e() {
                return a.this.f10428a.size();
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ o.e f10434a;

            public b(o.e eVar) {
                this.f10434a = eVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.f10427g == aVar.f10430c) {
                    List<T> list = aVar.f10429b;
                    Runnable runnable = aVar.f10431d;
                    List<T> list2 = dVar.f10426f;
                    dVar.f10425e = list;
                    dVar.f10426f = Collections.unmodifiableList(list);
                    this.f10434a.b(dVar.f10421a);
                    dVar.a(list2, runnable);
                }
            }
        }

        public a(List list, List list2, int i14, Runnable runnable) {
            this.f10428a = list;
            this.f10429b = list2;
            this.f10430c = i14;
            this.f10431d = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d.this.f10423c.execute(new b(o.a(new C0145a())));
        }
    }

    public interface b<T> {
        void a();
    }

    public static class c implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f10436a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f10436a.post(runnable);
        }
    }

    public d(y yVar, androidx.recyclerview.widget.c<T> cVar) {
        this.f10424d = new CopyOnWriteArrayList();
        this.f10426f = Collections.EMPTY_LIST;
        this.f10421a = yVar;
        this.f10422b = cVar;
        Executor executor = cVar.f10413a;
        if (executor != null) {
            this.f10423c = executor;
        } else {
            this.f10423c = f10420h;
        }
    }

    public final void a(List<T> list, Runnable runnable) {
        Iterator it = this.f10424d.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void b(List<T> list, Runnable runnable) {
        int i14 = this.f10427g + 1;
        this.f10427g = i14;
        List<T> list2 = this.f10425e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f10426f;
        y yVar = this.f10421a;
        if (list == null) {
            int size = list2.size();
            this.f10425e = null;
            this.f10426f = Collections.EMPTY_LIST;
            yVar.a(0, size);
            a(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.f10422b.f10414b.execute(new a(list2, list, i14, runnable));
            return;
        }
        this.f10425e = list;
        this.f10426f = Collections.unmodifiableList(list);
        yVar.c(0, list.size());
        a(list3, runnable);
    }

    public d(RecyclerView.h hVar, o.f<T> fVar) {
        this(new androidx.recyclerview.widget.b(hVar), new androidx.recyclerview.widget.c.a(fVar).a());
    }
}
