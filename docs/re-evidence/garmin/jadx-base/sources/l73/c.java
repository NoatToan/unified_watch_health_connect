package l73;

import android.os.Looper;
import androidx.room.a0;
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
public class c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile c f111414q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f111415r = new d();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final HashMap f111416s = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f111417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f111418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f111419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f111420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f111421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f111422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l73.b f111423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l73.a f111424h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n f111425i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ExecutorService f111426j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f111427k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f111428l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f111429m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f111430n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f111431o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f111432p;

    public class a extends ThreadLocal<C2128c> {
        public a(c cVar) {
        }

        @Override // java.lang.ThreadLocal
        public final C2128c initialValue() {
            return new C2128c();
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f111433a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f111433a = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f111433a[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f111433a[ThreadMode.MAIN_ORDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f111433a[ThreadMode.BACKGROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f111433a[ThreadMode.ASYNC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: l73.c$c, reason: collision with other inner class name */
    public static final class C2128c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f111434a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f111435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f111436c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f111437d;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public c(d dVar) {
        Looper mainLooper;
        f aVar;
        Looper mainLooper2;
        g gVar;
        this.f111420d = new a(this);
        dVar.getClass();
        if (m73.a.f117129b) {
            try {
                mainLooper = Looper.getMainLooper();
            } catch (RuntimeException unused) {
                mainLooper = null;
            }
            if (mainLooper != null) {
                aVar = new m73.a("EventBus");
            } else {
                aVar = new f.a();
            }
        } else {
            aVar = new f.a();
        }
        this.f111432p = aVar;
        this.f111417a = new HashMap();
        this.f111418b = new HashMap();
        this.f111419c = new ConcurrentHashMap();
        if (m73.a.f117129b) {
            try {
                mainLooper2 = Looper.getMainLooper();
            } catch (RuntimeException unused2) {
                mainLooper2 = null;
            }
            if (mainLooper2 == null) {
                gVar = null;
            } else {
                gVar = new g(mainLooper2);
            }
        } else {
            gVar = null;
        }
        this.f111421e = gVar;
        this.f111422f = gVar != null ? new e(this, gVar.f111444a, 10) : null;
        this.f111423g = new l73.b(this);
        this.f111424h = new l73.a(this);
        this.f111425i = new n(null, false, false);
        this.f111427k = true;
        this.f111428l = true;
        this.f111429m = true;
        this.f111430n = true;
        this.f111431o = true;
        this.f111426j = dVar.f111439a;
    }

    public static void a(ArrayList arrayList, Class[] clsArr) {
        for (Class cls : clsArr) {
            if (!arrayList.contains(cls)) {
                arrayList.add(cls);
                a(arrayList, cls.getInterfaces());
            }
        }
    }

    public static c b() {
        c cVar;
        c cVar2 = f111414q;
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (c.class) {
            try {
                cVar = f111414q;
                if (cVar == null) {
                    cVar = new c();
                    f111414q = cVar;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return cVar;
    }

    public final void c(Object obj, o oVar) {
        try {
            oVar.f111473b.f111455a.invoke(oVar.f111472a, obj);
        } catch (IllegalAccessException e4) {
            com.airbnb.lottie.animation.keyframe.a.x("Unexpected exception", e4);
        } catch (InvocationTargetException e14) {
            Throwable cause = e14.getCause();
            boolean z14 = obj instanceof l;
            f fVar = this.f111432p;
            boolean z15 = this.f111427k;
            if (!z14) {
                if (z15) {
                    fVar.a(Level.SEVERE, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + oVar.f111472a.getClass(), cause);
                }
                if (this.f111429m) {
                    e(new l(this, cause, obj, oVar.f111472a));
                    return;
                }
                return;
            }
            if (z15) {
                Level level = Level.SEVERE;
                fVar.a(level, "SubscriberExceptionEvent subscriber " + oVar.f111472a.getClass() + " threw an exception", cause);
                l lVar = (l) obj;
                fVar.a(level, "Initial event " + lVar.f111453b + " caused exception in " + lVar.f111454c, lVar.f111452a);
            }
        }
    }

    public final void d(i iVar) {
        Object obj = iVar.f111447a;
        o oVar = iVar.f111448b;
        iVar.f111447a = null;
        iVar.f111448b = null;
        iVar.f111449c = null;
        ArrayList arrayList = i.f111446d;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 10000) {
                    arrayList.add(iVar);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (oVar.f111474c) {
            c(obj, oVar);
        }
    }

    public final void e(Object obj) {
        C2128c c2128c = this.f111420d.get();
        ArrayList arrayList = c2128c.f111434a;
        arrayList.add(obj);
        if (c2128c.f111435b) {
            return;
        }
        g gVar = this.f111421e;
        c2128c.f111436c = gVar == null || gVar.f111444a == Looper.myLooper();
        c2128c.f111435b = true;
        while (!arrayList.isEmpty()) {
            try {
                f(arrayList.remove(0), c2128c);
            } catch (Throwable th3) {
                c2128c.f111435b = false;
                c2128c.f111436c = false;
                throw th3;
            }
        }
        c2128c.f111435b = false;
        c2128c.f111436c = false;
    }

    public final void f(Object obj, C2128c c2128c) {
        boolean zG;
        List list;
        Class<?> cls = obj.getClass();
        if (this.f111431o) {
            HashMap map = f111416s;
            synchronized (map) {
                try {
                    List list2 = (List) map.get(cls);
                    list = list2;
                    if (list2 == null) {
                        ArrayList arrayList = new ArrayList();
                        for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                            arrayList.add(superclass);
                            a(arrayList, superclass.getInterfaces());
                        }
                        f111416s.put(cls, arrayList);
                        list = arrayList;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            int size = list.size();
            zG = false;
            for (int i14 = 0; i14 < size; i14++) {
                zG |= g(obj, c2128c, (Class) list.get(i14));
            }
        } else {
            zG = g(obj, c2128c, cls);
        }
        if (zG) {
            return;
        }
        if (this.f111428l) {
            this.f111432p.b(Level.FINE, "No subscribers registered for event " + cls);
        }
        if (!this.f111430n || cls == h.class || cls == l.class) {
            return;
        }
        e(new h(this, obj));
    }

    public final boolean g(Object obj, C2128c c2128c, Class<?> cls) {
        CopyOnWriteArrayList<o> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = (CopyOnWriteArrayList) this.f111417a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (o oVar : copyOnWriteArrayList) {
            c2128c.f111437d = obj;
            h(oVar, obj, c2128c.f111436c);
        }
        return true;
    }

    public final void h(o oVar, Object obj, boolean z14) {
        e eVar = this.f111422f;
        int i14 = b.f111433a[oVar.f111473b.f111456b.ordinal()];
        if (i14 == 1) {
            c(obj, oVar);
            return;
        }
        if (i14 == 2) {
            if (z14) {
                c(obj, oVar);
                return;
            } else {
                eVar.a(obj, oVar);
                return;
            }
        }
        if (i14 == 3) {
            if (eVar != null) {
                eVar.a(obj, oVar);
                return;
            } else {
                c(obj, oVar);
                return;
            }
        }
        if (i14 != 4) {
            if (i14 != 5) {
                a0.s(oVar.f111473b.f111456b, "Unknown thread mode: ");
                return;
            }
            l73.a aVar = this.f111424h;
            aVar.getClass();
            aVar.f111409a.a(i.a(obj, oVar));
            aVar.f111410b.f111426j.execute(aVar);
            return;
        }
        if (!z14) {
            c(obj, oVar);
            return;
        }
        l73.b bVar = this.f111423g;
        bVar.getClass();
        i iVarA = i.a(obj, oVar);
        synchronized (bVar) {
            try {
                bVar.f111411a.a(iVarA);
                if (!bVar.f111413c) {
                    bVar.f111413c = true;
                    bVar.f111412b.f111426j.execute(bVar);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void i(Object obj) {
        ArrayList arrayListB;
        Class<?> cls = obj.getClass();
        n nVar = this.f111425i;
        nVar.getClass();
        ConcurrentHashMap concurrentHashMap = n.f111461d;
        List list = (List) concurrentHashMap.get(cls);
        if (list == null) {
            if (nVar.f111465c) {
                n.a aVarC = n.c();
                aVarC.f111470e = cls;
                aVarC.f111471f = false;
                while (aVarC.f111470e != null) {
                    nVar.a(aVarC);
                    aVarC.b();
                }
                arrayListB = n.b(aVarC);
            } else {
                n.a aVarC2 = n.c();
                aVarC2.f111470e = cls;
                aVarC2.f111471f = false;
                while (aVarC2.f111470e != null) {
                    List<n73.b> list2 = nVar.f111463a;
                    if (list2 != null) {
                        Iterator<n73.b> it = list2.iterator();
                        while (it.hasNext()) {
                            it.next().a();
                        }
                    }
                    nVar.a(aVarC2);
                    aVarC2.b();
                }
                arrayListB = n.b(aVarC2);
            }
            list = arrayListB;
            if (list.isEmpty()) {
                throw new EventBusException(androidx.core.view.j.i(cls, "Subscriber ", " and its super classes have no public methods with the @Subscribe annotation"));
            }
            concurrentHashMap.put(cls, list);
        }
        synchronized (this) {
            try {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    j(obj, (m) it3.next());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void j(Object obj, m mVar) {
        Object value;
        Class<?> cls = mVar.f111457c;
        o oVar = new o(obj, mVar);
        HashMap map = this.f111417a;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) map.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            map.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(oVar)) {
            throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i14 = 0; i14 <= size; i14++) {
            if (i14 == size || mVar.f111458d > ((o) copyOnWriteArrayList.get(i14)).f111473b.f111458d) {
                copyOnWriteArrayList.add(i14, oVar);
                break;
            }
        }
        HashMap map2 = this.f111418b;
        List arrayList = (List) map2.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map2.put(obj, arrayList);
        }
        arrayList.add(cls);
        if (mVar.f111459e) {
            g gVar = this.f111421e;
            boolean z14 = this.f111431o;
            ConcurrentHashMap concurrentHashMap = this.f111419c;
            if (!z14) {
                Object obj2 = concurrentHashMap.get(cls);
                if (obj2 != null) {
                    h(oVar, obj2, gVar == null || gVar.f111444a == Looper.myLooper());
                    return;
                }
                return;
            }
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                if (cls.isAssignableFrom((Class) entry.getKey()) && (value = entry.getValue()) != null) {
                    h(oVar, value, gVar == null || gVar.f111444a == Looper.myLooper());
                }
            }
        }
    }

    public final synchronized void k(Object obj) {
        try {
            List list = (List) this.f111418b.get(obj);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    List list2 = (List) this.f111417a.get((Class) it.next());
                    if (list2 != null) {
                        int size = list2.size();
                        int i14 = 0;
                        while (i14 < size) {
                            o oVar = (o) list2.get(i14);
                            if (oVar.f111472a == obj) {
                                oVar.f111474c = false;
                                list2.remove(i14);
                                i14--;
                                size--;
                            }
                            i14++;
                        }
                    }
                }
                this.f111418b.remove(obj);
            } else {
                this.f111432p.b(Level.WARNING, "Subscriber to unregister was not registered before: " + obj.getClass());
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final String toString() {
        return hb.a.k(new StringBuilder("EventBus[indexCount=0, eventInheritance="), this.f111431o, "]");
    }

    public c() {
        this(f111415r);
    }
}
