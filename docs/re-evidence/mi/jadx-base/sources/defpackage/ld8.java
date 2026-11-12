package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import org.greenrobot.eventbus.EventBusException;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes3.dex */
public class ld8 {
    public static volatile ld8 s;
    public static final md8 t = new md8();
    public static final Map<Class<?>, List<Class<?>>> u = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, CopyOnWriteArrayList<ioo>> f24926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Object, List<Class<?>>> f24927b;
    public final Map<Class<?>, Object> c;
    public final ThreadLocal<c> d;
    public final b2f e;
    public final z4i f;
    public final cx1 g;
    public final ll1 h;
    public final foo i;
    public final ExecutorService j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f24928k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ype f24929r;

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
        public static final /* synthetic */ int[] f24931a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f24931a = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24931a[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24931a[ThreadMode.MAIN_ORDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24931a[ThreadMode.BACKGROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24931a[ThreadMode.ASYNC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Object> f24932a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f24933b;
        public boolean c;
        public ioo d;
        public Object e;
        public boolean f;
    }

    public ld8() {
        this(t);
    }

    public static void a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    public static ld8 c() {
        if (s == null) {
            synchronized (ld8.class) {
                try {
                    if (s == null) {
                        s = new ld8();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return s;
    }

    public static List<Class<?>> k(Class<?> cls) {
        List<Class<?>> arrayList;
        Map<Class<?>, List<Class<?>>> map = u;
        synchronized (map) {
            try {
                arrayList = map.get(cls);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                        arrayList.add(superclass);
                        a(arrayList, superclass.getInterfaces());
                    }
                    u.put(cls, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public final void b(ioo iooVar, Object obj) {
        if (obj != null) {
            o(iooVar, obj, i());
        }
    }

    public ExecutorService d() {
        return this.j;
    }

    public ype e() {
        return this.f24929r;
    }

    public final void f(ioo iooVar, Object obj, Throwable th) {
        if (!(obj instanceof zno)) {
            if (this.f24928k) {
                throw new EventBusException("Invoking subscriber failed", th);
            }
            if (this.l) {
                this.f24929r.b(Level.SEVERE, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + iooVar.f21953a.getClass(), th);
            }
            if (this.n) {
                l(new zno(this, th, obj, iooVar.f21953a));
                return;
            }
            return;
        }
        if (this.l) {
            ype ypeVar = this.f24929r;
            Level level = Level.SEVERE;
            ypeVar.b(level, "SubscriberExceptionEvent subscriber " + iooVar.f21953a.getClass() + " threw an exception", th);
            zno znoVar = (zno) obj;
            this.f24929r.b(level, "Initial event " + znoVar.c + " caused exception in " + znoVar.d, znoVar.f41501b);
        }
    }

    public void g(nqh nqhVar) {
        Object obj = nqhVar.f28260a;
        ioo iooVar = nqhVar.f28261b;
        nqh.b(nqhVar);
        if (iooVar.c) {
            h(iooVar, obj);
        }
    }

    public void h(ioo iooVar, Object obj) {
        try {
            iooVar.f21954b.f15747a.invoke(iooVar.f21953a, obj);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unexpected exception", e);
        } catch (InvocationTargetException e2) {
            f(iooVar, obj, e2.getCause());
        }
    }

    public final boolean i() {
        b2f b2fVar = this.e;
        if (b2fVar != null) {
            return b2fVar.a();
        }
        return true;
    }

    public synchronized boolean j(Object obj) {
        return this.f24927b.containsKey(obj);
    }

    public void l(Object obj) {
        c cVar = this.d.get();
        List<Object> list = cVar.f24932a;
        list.add(obj);
        if (cVar.f24933b) {
            return;
        }
        cVar.c = i();
        cVar.f24933b = true;
        if (cVar.f) {
            throw new EventBusException("Internal error. Abort state was not reset");
        }
        while (!list.isEmpty()) {
            try {
                m(list.remove(0), cVar);
            } catch (Throwable th) {
                cVar.f24933b = false;
                cVar.c = false;
                throw th;
            }
        }
        cVar.f24933b = false;
        cVar.c = false;
    }

    public final void m(Object obj, c cVar) throws Error {
        boolean zN;
        Class<?> cls = obj.getClass();
        if (this.p) {
            List<Class<?>> listK = k(cls);
            int size = listK.size();
            zN = false;
            for (int i = 0; i < size; i++) {
                zN |= n(obj, cVar, listK.get(i));
            }
        } else {
            zN = n(obj, cVar, cls);
        }
        if (zN) {
            return;
        }
        if (this.m) {
            this.f24929r.a(Level.FINE, "No subscribers registered for event " + cls);
        }
        if (!this.o || cls == lvg.class || cls == zno.class) {
            return;
        }
        l(new lvg(this, obj));
    }

    public final boolean n(Object obj, c cVar, Class<?> cls) {
        CopyOnWriteArrayList<ioo> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.f24926a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (ioo iooVar : copyOnWriteArrayList) {
            cVar.e = obj;
            cVar.d = iooVar;
            try {
                o(iooVar, obj, cVar.c);
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

    public final void o(ioo iooVar, Object obj, boolean z) {
        int i = b.f24931a[iooVar.f21954b.f15748b.ordinal()];
        if (i == 1) {
            h(iooVar, obj);
            return;
        }
        if (i == 2) {
            if (z) {
                h(iooVar, obj);
                return;
            } else {
                this.f.a(iooVar, obj);
                return;
            }
        }
        if (i == 3) {
            z4i z4iVar = this.f;
            if (z4iVar != null) {
                z4iVar.a(iooVar, obj);
                return;
            } else {
                h(iooVar, obj);
                return;
            }
        }
        if (i == 4) {
            if (z) {
                this.g.a(iooVar, obj);
                return;
            } else {
                h(iooVar, obj);
                return;
            }
        }
        if (i == 5) {
            this.h.a(iooVar, obj);
            return;
        }
        throw new IllegalStateException("Unknown thread mode: " + iooVar.f21954b.f15748b);
    }

    public void p(Object obj) {
        List<doo> listA = this.i.a(obj.getClass());
        synchronized (this) {
            try {
                Iterator<doo> it = listA.iterator();
                while (it.hasNext()) {
                    q(obj, it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q(Object obj, doo dooVar) {
        Class<?> cls = dooVar.c;
        ioo iooVar = new ioo(obj, dooVar);
        CopyOnWriteArrayList<ioo> copyOnWriteArrayList = this.f24926a.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f24926a.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(iooVar)) {
            throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i = 0; i <= size; i++) {
            if (i == size || dooVar.d > copyOnWriteArrayList.get(i).f21954b.d) {
                copyOnWriteArrayList.add(i, iooVar);
                break;
            }
        }
        List<Class<?>> arrayList = this.f24927b.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f24927b.put(obj, arrayList);
        }
        arrayList.add(cls);
        if (dooVar.e) {
            if (!this.p) {
                b(iooVar, this.c.get(cls));
                return;
            }
            for (Map.Entry<Class<?>, Object> entry : this.c.entrySet()) {
                if (cls.isAssignableFrom(entry.getKey())) {
                    b(iooVar, entry.getValue());
                }
            }
        }
    }

    public synchronized void r(Object obj) {
        try {
            List<Class<?>> list = this.f24927b.get(obj);
            if (list != null) {
                Iterator<Class<?>> it = list.iterator();
                while (it.hasNext()) {
                    s(obj, it.next());
                }
                this.f24927b.remove(obj);
            } else {
                this.f24929r.a(Level.WARNING, "Subscriber to unregister was not registered before: " + obj.getClass());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void s(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<ioo> copyOnWriteArrayList = this.f24926a.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i = 0;
            while (i < size) {
                ioo iooVar = copyOnWriteArrayList.get(i);
                if (iooVar.f21953a == obj) {
                    iooVar.c = false;
                    copyOnWriteArrayList.remove(i);
                    i--;
                    size--;
                }
                i++;
            }
        }
    }

    public String toString() {
        return "EventBus[indexCount=" + this.q + ", eventInheritance=" + this.p + "]";
    }

    public ld8(md8 md8Var) {
        this.d = new a();
        this.f24929r = md8Var.b();
        this.f24926a = new HashMap();
        this.f24927b = new HashMap();
        this.c = new ConcurrentHashMap();
        b2f b2fVarC = md8Var.c();
        this.e = b2fVarC;
        this.f = b2fVarC != null ? b2fVarC.b(this) : null;
        this.g = new cx1(this);
        this.h = new ll1(this);
        List<coo> list = md8Var.j;
        this.q = list != null ? list.size() : 0;
        this.i = new foo(md8Var.j, md8Var.h, md8Var.g);
        this.l = md8Var.f26032a;
        this.m = md8Var.f26033b;
        this.n = md8Var.c;
        this.o = md8Var.d;
        this.f24928k = md8Var.e;
        this.p = md8Var.f;
        this.j = md8Var.i;
    }
}
