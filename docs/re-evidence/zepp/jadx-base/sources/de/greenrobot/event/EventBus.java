package de.greenrobot.event;

import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes22.dex */
public class EventBus {
    public static String TAG = "Event";
    public static volatile EventBus p;
    private static final EventBusBuilder q = new EventBusBuilder();
    private static final Map<Class<?>, List<Class<?>>> r = new HashMap();
    private final Map<Class<?>, CopyOnWriteArrayList<h>> a;
    private final Map<Object, List<Class<?>>> b;
    private final Map<Class<?>, Object> c;
    private final ThreadLocal<d> d;
    private final de.greenrobot.event.c e;
    private final de.greenrobot.event.b f;
    private final de.greenrobot.event.a g;
    private final g h;
    private final ExecutorService i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;

    public class a extends ThreadLocal<d> {
        public a() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d initialValue() {
            return new d();
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            a = iArr;
            try {
                iArr[ThreadMode.PostThread.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ThreadMode.MainThread.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ThreadMode.BackgroundThread.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ThreadMode.Async.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface c {
        void a(List<SubscriberExceptionEvent> list);
    }

    public static final class d {
        public final List<Object> a = new ArrayList();
        public boolean b;
        public boolean c;
        public h d;
        public Object e;
        public boolean f;
    }

    public EventBus() {
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

    public static EventBusBuilder builder() {
        return new EventBusBuilder();
    }

    private void c(h hVar, Object obj, Throwable th) {
        if (!(obj instanceof SubscriberExceptionEvent)) {
            if (this.j) {
                throw new EventBusException("Invoking subscriber failed", th);
            }
            if (this.k) {
                Log.e(TAG, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + hVar.a.getClass(), th);
            }
            if (this.m) {
                post(new SubscriberExceptionEvent(this, th, obj, hVar.a));
                return;
            }
            return;
        }
        if (this.k) {
            Log.e(TAG, "SubscriberExceptionEvent subscriber " + hVar.a.getClass() + " threw an exception", th);
            SubscriberExceptionEvent subscriberExceptionEvent = (SubscriberExceptionEvent) obj;
            Log.e(TAG, "Initial event " + subscriberExceptionEvent.causingEvent + " caused exception in " + subscriberExceptionEvent.causingSubscriber, subscriberExceptionEvent.throwable);
        }
    }

    public static void clearCaches() {
        g.a();
        r.clear();
    }

    private List<Class<?>> f(Class<?> cls) {
        List<Class<?>> arrayList;
        Map<Class<?>, List<Class<?>>> map = r;
        synchronized (map) {
            arrayList = map.get(cls);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                    arrayList.add(superclass);
                    a(arrayList, superclass.getInterfaces());
                }
                r.put(cls, arrayList);
            }
        }
        return arrayList;
    }

    private void g(Object obj, d dVar) throws Error {
        boolean zH;
        Class<?> cls = obj.getClass();
        if (this.o) {
            List<Class<?>> listF = f(cls);
            int size = listF.size();
            zH = false;
            for (int i = 0; i < size; i++) {
                zH |= h(obj, dVar, listF.get(i));
            }
        } else {
            zH = h(obj, dVar, cls);
        }
        if (zH) {
            return;
        }
        if (this.l) {
            Log.d(TAG, "No subscribers registered for event " + cls);
        }
        if (!this.n || cls == NoSubscriberEvent.class || cls == SubscriberExceptionEvent.class) {
            return;
        }
        post(new NoSubscriberEvent(this, obj));
    }

    public static EventBus getDefault() {
        if (p == null) {
            synchronized (EventBus.class) {
                if (p == null) {
                    p = new EventBus();
                }
            }
        }
        return p;
    }

    private boolean h(Object obj, d dVar, Class<?> cls) {
        CopyOnWriteArrayList<h> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (h hVar : copyOnWriteArrayList) {
            dVar.e = obj;
            dVar.d = hVar;
            try {
                i(hVar, obj, dVar.c);
                boolean z = dVar.f;
                dVar.e = null;
                dVar.d = null;
                dVar.f = false;
                if (z) {
                    return true;
                }
            } catch (Throwable th) {
                dVar.e = null;
                dVar.d = null;
                dVar.f = false;
                throw th;
            }
        }
        return true;
    }

    private void i(h hVar, Object obj, boolean z) {
        int i = b.a[hVar.b.b.ordinal()];
        if (i == 1) {
            e(hVar, obj);
            return;
        }
        if (i == 2) {
            if (z) {
                e(hVar, obj);
                return;
            } else {
                this.e.a(hVar, obj);
                return;
            }
        }
        if (i == 3) {
            if (z) {
                this.f.a(hVar, obj);
                return;
            } else {
                e(hVar, obj);
                return;
            }
        }
        if (i == 4) {
            this.g.a(hVar, obj);
            return;
        }
        throw new IllegalStateException("Unknown thread mode: " + hVar.b.b);
    }

    private synchronized void j(Object obj, boolean z, int i) {
        Iterator<f> it2 = this.h.b(obj.getClass()).iterator();
        while (it2.hasNext()) {
            k(obj, it2.next(), z, i);
        }
    }

    private void k(Object obj, f fVar, boolean z, int i) {
        Object obj2;
        Class<?> cls = fVar.c;
        CopyOnWriteArrayList<h> copyOnWriteArrayList = this.a.get(cls);
        h hVar = new h(obj, fVar, i);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.a.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(hVar)) {
            throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i2 = 0; i2 <= size; i2++) {
            if (i2 == size || hVar.c > copyOnWriteArrayList.get(i2).c) {
                copyOnWriteArrayList.add(i2, hVar);
                break;
            }
        }
        List<Class<?>> arrayList = this.b.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.b.put(obj, arrayList);
        }
        arrayList.add(cls);
        if (z) {
            synchronized (this.c) {
                obj2 = this.c.get(cls);
            }
            if (obj2 != null) {
                i(hVar, obj2, Looper.getMainLooper() == Looper.myLooper());
            }
        }
    }

    private void l(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<h> copyOnWriteArrayList = this.a.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i = 0;
            while (i < size) {
                h hVar = copyOnWriteArrayList.get(i);
                if (hVar.a == obj) {
                    hVar.d = false;
                    copyOnWriteArrayList.remove(i);
                    i--;
                    size--;
                }
                i++;
            }
        }
    }

    public ExecutorService b() {
        return this.i;
    }

    public void cancelEventDelivery(Object obj) {
        d dVar = this.d.get();
        if (!dVar.b) {
            throw new EventBusException("This method may only be called from inside event handling methods on the posting thread");
        }
        if (obj == null) {
            throw new EventBusException("Event may not be null");
        }
        if (dVar.e != obj) {
            throw new EventBusException("Only the currently handled event may be aborted");
        }
        if (dVar.d.b.b != ThreadMode.PostThread) {
            throw new EventBusException(" event handlers may only abort the incoming event");
        }
        dVar.f = true;
    }

    public void d(de.greenrobot.event.d dVar) {
        Object obj = dVar.a;
        h hVar = dVar.b;
        de.greenrobot.event.d.b(dVar);
        if (hVar.d) {
            e(hVar, obj);
        }
    }

    public void e(h hVar, Object obj) {
        try {
            hVar.b.a.invoke(hVar.a, obj);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unexpected exception", e);
        } catch (InvocationTargetException e2) {
            c(hVar, obj, e2.getCause());
        }
    }

    public <T> T getStickyEvent(Class<T> cls) {
        T tCast;
        synchronized (this.c) {
            tCast = cls.cast(this.c.get(cls));
        }
        return tCast;
    }

    public boolean hasSubscriberForEvent(Class<?> cls) {
        CopyOnWriteArrayList<h> copyOnWriteArrayList;
        List<Class<?>> listF = f(cls);
        if (listF != null) {
            int size = listF.size();
            for (int i = 0; i < size; i++) {
                Class<?> cls2 = listF.get(i);
                synchronized (this) {
                    copyOnWriteArrayList = this.a.get(cls2);
                }
                if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public synchronized boolean isRegistered(Object obj) {
        return this.b.containsKey(obj);
    }

    public void post(Object obj) {
        d dVar = this.d.get();
        List<Object> list = dVar.a;
        list.add(obj);
        if (dVar.b) {
            return;
        }
        dVar.c = Looper.getMainLooper() == Looper.myLooper();
        dVar.b = true;
        if (dVar.f) {
            throw new EventBusException("Internal error. Abort state was not reset");
        }
        while (!list.isEmpty()) {
            try {
                g(list.remove(0), dVar);
            } catch (Throwable th) {
                dVar.b = false;
                dVar.c = false;
                throw th;
            }
        }
        dVar.b = false;
        dVar.c = false;
    }

    public void postSticky(Object obj) {
        synchronized (this.c) {
            this.c.put(obj.getClass(), obj);
        }
        post(obj);
    }

    public void register(Object obj) {
        j(obj, false, 0);
    }

    public void registerSticky(Object obj) {
        j(obj, true, 0);
    }

    public void removeAllStickyEvents() {
        synchronized (this.c) {
            this.c.clear();
        }
    }

    public <T> T removeStickyEvent(Class<T> cls) {
        T tCast;
        synchronized (this.c) {
            tCast = cls.cast(this.c.remove(cls));
        }
        return tCast;
    }

    public synchronized void unregister(Object obj) {
        List<Class<?>> list = this.b.get(obj);
        if (list != null) {
            Iterator<Class<?>> it2 = list.iterator();
            while (it2.hasNext()) {
                l(obj, it2.next());
            }
            this.b.remove(obj);
        } else {
            Log.w(TAG, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    public EventBus(EventBusBuilder eventBusBuilder) {
        this.d = new a();
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new ConcurrentHashMap();
        this.e = new de.greenrobot.event.c(this, Looper.getMainLooper(), 10);
        this.f = new de.greenrobot.event.b(this);
        this.g = new de.greenrobot.event.a(this);
        this.h = new g(eventBusBuilder.h);
        this.k = eventBusBuilder.a;
        this.l = eventBusBuilder.b;
        this.m = eventBusBuilder.c;
        this.n = eventBusBuilder.d;
        this.j = eventBusBuilder.e;
        this.o = eventBusBuilder.f;
        this.i = eventBusBuilder.g;
    }

    public void register(Object obj, int i) {
        j(obj, false, i);
    }

    public void registerSticky(Object obj, int i) {
        j(obj, true, i);
    }

    public boolean removeStickyEvent(Object obj) {
        synchronized (this.c) {
            Class<?> cls = obj.getClass();
            if (!obj.equals(this.c.get(cls))) {
                return false;
            }
            this.c.remove(cls);
            return true;
        }
    }
}
