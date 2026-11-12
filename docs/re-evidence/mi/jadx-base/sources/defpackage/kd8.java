package defpackage;

import android.os.Looper;
import de.greenrobot.event.EventBusException;
import de.greenrobot.event.ThreadMode;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class kd8 {
    public static volatile kd8 p;
    public static final nd8 q = new nd8();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Map<Class<?>, List<Class<?>>> f23741r = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, CopyOnWriteArrayList<loo>> f23742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Object, List<Class<?>>> f23743b;
    public final Map<Class<?>, Object> c;
    public final ThreadLocal<c> d;
    public final pkb e;
    public final dx1 f;
    public final ml1 g;
    public final goo h;
    public final ExecutorService i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f23744k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    public class a extends ThreadLocal<c> {
        public a() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c initialValue() {
            return new c();
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23746a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f23746a = iArr;
            try {
                iArr[ThreadMode.PostThread.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23746a[ThreadMode.MainThread.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23746a[ThreadMode.BackgroundThread.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23746a[ThreadMode.Async.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Object> f23747a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f23748b;
        public boolean c;
        public loo d;
        public Object e;
        public boolean f;
    }

    public kd8() {
        this(q);
    }

    public static void a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    public static kd8 b() {
        if (p == null) {
            synchronized (kd8.class) {
                try {
                    if (p == null) {
                        p = new kd8();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return p;
    }

    public ExecutorService c() {
        return this.i;
    }

    public final void d(loo looVar, Object obj, Throwable th) {
        if (!(obj instanceof aoo)) {
            if (this.j) {
                throw new EventBusException("Invoking subscriber failed", th);
            }
            if (this.f23744k) {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not dispatch event: ");
                sb.append(obj.getClass());
                sb.append(" to subscribing class ");
                sb.append(looVar.f25282a.getClass());
            }
            if (this.m) {
                h(new aoo(this, th, obj, looVar.f25282a));
                return;
            }
            return;
        }
        if (this.f23744k) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SubscriberExceptionEvent subscriber ");
            sb2.append(looVar.f25282a.getClass());
            sb2.append(" threw an exception");
            aoo aooVar = (aoo) obj;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Initial event ");
            sb3.append(aooVar.c);
            sb3.append(" caused exception in ");
            sb3.append(aooVar.d);
        }
    }

    public void e(oqh oqhVar) {
        Object obj = oqhVar.f29388a;
        loo looVar = oqhVar.f29389b;
        oqh.b(oqhVar);
        if (looVar.c) {
            f(looVar, obj);
        }
    }

    public void f(loo looVar, Object obj) {
        try {
            looVar.f25283b.f16890a.invoke(looVar.f25282a, obj);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unexpected exception", e);
        } catch (InvocationTargetException e2) {
            d(looVar, obj, e2.getCause());
        }
    }

    public final List<Class<?>> g(Class<?> cls) {
        List<Class<?>> arrayList;
        Map<Class<?>, List<Class<?>>> map = f23741r;
        synchronized (map) {
            try {
                arrayList = map.get(cls);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                        arrayList.add(superclass);
                        a(arrayList, superclass.getInterfaces());
                    }
                    f23741r.put(cls, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public void h(Object obj) {
        c cVar = this.d.get();
        List<Object> list = cVar.f23747a;
        list.add(obj);
        if (cVar.f23748b) {
            return;
        }
        cVar.c = Looper.getMainLooper() == Looper.myLooper();
        cVar.f23748b = true;
        if (cVar.f) {
            throw new EventBusException("Internal error. Abort state was not reset");
        }
        while (!list.isEmpty()) {
            try {
                i(list.remove(0), cVar);
            } catch (Throwable th) {
                cVar.f23748b = false;
                cVar.c = false;
                throw th;
            }
        }
        cVar.f23748b = false;
        cVar.c = false;
    }

    public final void i(Object obj, c cVar) throws Error {
        boolean zJ;
        Class<?> cls = obj.getClass();
        if (this.o) {
            List<Class<?>> listG = g(cls);
            int size = listG.size();
            zJ = false;
            for (int i = 0; i < size; i++) {
                zJ |= j(obj, cVar, listG.get(i));
            }
        } else {
            zJ = j(obj, cVar, cls);
        }
        if (zJ) {
            return;
        }
        if (this.l) {
            StringBuilder sb = new StringBuilder();
            sb.append("No subscribers registered for event ");
            sb.append(cls);
        }
        if (!this.n || cls == mvg.class || cls == aoo.class) {
            return;
        }
        h(new mvg(this, obj));
    }

    public final boolean j(Object obj, c cVar, Class<?> cls) {
        CopyOnWriteArrayList<loo> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.f23742a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (loo looVar : copyOnWriteArrayList) {
            cVar.e = obj;
            cVar.d = looVar;
            try {
                k(looVar, obj, cVar.c);
                boolean z = cVar.f;
                cVar.e = null;
                cVar.d = null;
                cVar.f = false;
                if (z) {
                    return true;
                }
            } catch (Throwable th) {
                cVar.e = null;
                cVar.d = null;
                cVar.f = false;
                throw th;
            }
        }
        return true;
    }

    public final void k(loo looVar, Object obj, boolean z) {
        int i = b.f23746a[looVar.f25283b.f16891b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        this.g.a(looVar, obj);
                        return;
                    }
                    throw new IllegalStateException("Unknown thread mode: " + looVar.f25283b.f16891b);
                }
                if (z) {
                    this.f.a(looVar, obj);
                    return;
                }
            } else if (!z) {
                this.e.a(looVar, obj);
                return;
            }
        }
        f(looVar, obj);
    }

    public synchronized void l(Object obj) {
        try {
            List<Class<?>> list = this.f23743b.get(obj);
            if (list != null) {
                Iterator<Class<?>> it = list.iterator();
                while (it.hasNext()) {
                    m(obj, it.next());
                }
                this.f23743b.remove(obj);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Subscriber to unregister was not registered before: ");
                sb.append(obj.getClass());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void m(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<loo> copyOnWriteArrayList = this.f23742a.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i = 0;
            while (i < size) {
                loo looVar = copyOnWriteArrayList.get(i);
                if (looVar.f25282a == obj) {
                    looVar.c = false;
                    copyOnWriteArrayList.remove(i);
                    i--;
                    size--;
                }
                i++;
            }
        }
    }

    public kd8(nd8 nd8Var) {
        this.d = new a();
        this.f23742a = new HashMap();
        this.f23743b = new HashMap();
        this.c = new ConcurrentHashMap();
        this.e = new pkb(this, Looper.getMainLooper(), 10);
        this.f = new dx1(this);
        this.g = new ml1(this);
        this.h = new goo(nd8Var.h);
        this.f23744k = nd8Var.f27807a;
        this.l = nd8Var.f27808b;
        this.m = nd8Var.c;
        this.n = nd8Var.d;
        this.j = nd8Var.e;
        this.o = nd8Var.f;
        this.i = nd8Var.g;
    }
}
