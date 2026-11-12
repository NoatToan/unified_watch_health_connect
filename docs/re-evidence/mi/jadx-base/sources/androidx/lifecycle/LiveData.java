package androidx.lifecycle;

import defpackage.bj1;
import defpackage.d9l;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData<T> {
    static final Object NOT_SET = new Object();
    static final int START_VERSION = -1;
    int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private d9l<Observer<? super T>, LiveData<T>.c> mObservers;
    volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    public class LifecycleBoundObserver extends LiveData<T>.c implements LifecycleEventObserver {
        public final LifecycleOwner e;

        public LifecycleBoundObserver(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
            super(observer);
            this.e = lifecycleOwner;
        }

        @Override // androidx.lifecycle.LiveData.c
        public void b() {
            this.e.getLifecycle().removeObserver(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean c(LifecycleOwner lifecycleOwner) {
            return this.e == lifecycleOwner;
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean d() {
            return this.e.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Lifecycle.State currentState = this.e.getLifecycle().getCurrentState();
            if (currentState == Lifecycle.State.DESTROYED) {
                LiveData.this.removeObserver(this.f2576a);
                return;
            }
            Lifecycle.State state = null;
            while (state != currentState) {
                a(d());
                state = currentState;
                currentState = this.e.getLifecycle().getCurrentState();
            }
        }
    }

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.mDataLock) {
                obj = LiveData.this.mPendingData;
                LiveData.this.mPendingData = LiveData.NOT_SET;
            }
            LiveData.this.setValue(obj);
        }
    }

    public class b extends LiveData<T>.c {
        public b(Observer<? super T> observer) {
            super(observer);
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean d() {
            return true;
        }
    }

    public abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Observer<? super T> f2576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2577b;
        public int c = -1;

        public c(Observer<? super T> observer) {
            this.f2576a = observer;
        }

        public void a(boolean z) {
            if (z == this.f2577b) {
                return;
            }
            this.f2577b = z;
            LiveData.this.changeActiveCounter(z ? 1 : -1);
            if (this.f2577b) {
                LiveData.this.dispatchingValue(this);
            }
        }

        public void b() {
        }

        public boolean c(LifecycleOwner lifecycleOwner) {
            return false;
        }

        public abstract boolean d();
    }

    public LiveData(T t) {
        this.mDataLock = new Object();
        this.mObservers = new d9l<>();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new a();
        this.mData = t;
        this.mVersion = 0;
    }

    public static void assertMainThread(String str) {
        if (bj1.h().c()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void considerNotify(LiveData<T>.c cVar) {
        if (cVar.f2577b) {
            if (!cVar.d()) {
                cVar.a(false);
                return;
            }
            int i = cVar.c;
            int i2 = this.mVersion;
            if (i >= i2) {
                return;
            }
            cVar.c = i2;
            cVar.f2576a.onChanged((Object) this.mData);
        }
    }

    public void changeActiveCounter(int i) {
        int i2 = this.mActiveCount;
        this.mActiveCount = i + i2;
        if (this.mChangingActiveState) {
            return;
        }
        this.mChangingActiveState = true;
        while (true) {
            try {
                int i3 = this.mActiveCount;
                if (i2 == i3) {
                    this.mChangingActiveState = false;
                    return;
                }
                boolean z = i2 == 0 && i3 > 0;
                boolean z2 = i2 > 0 && i3 == 0;
                if (z) {
                    onActive();
                } else if (z2) {
                    onInactive();
                }
                i2 = i3;
            } catch (Throwable th) {
                this.mChangingActiveState = false;
                throw th;
            }
        }
    }

    public void dispatchingValue(LiveData<T>.c cVar) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (cVar != null) {
                considerNotify(cVar);
                cVar = null;
            } else {
                d9l<Observer<? super T>, LiveData<T>.c>.d dVarG = this.mObservers.g();
                while (dVarG.hasNext()) {
                    considerNotify((c) dVarG.next().getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public T getValue() {
        T t = (T) this.mData;
        if (t != NOT_SET) {
            return t;
        }
        return null;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        return this.mObservers.size() > 0;
    }

    public boolean isInitialized() {
        return this.mData != NOT_SET;
    }

    public void observe(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
        assertMainThread("observe");
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(lifecycleOwner, observer);
        LiveData<T>.c cVarJ = this.mObservers.j(observer, lifecycleBoundObserver);
        if (cVarJ != null && !cVarJ.c(lifecycleOwner)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVarJ != null) {
            return;
        }
        lifecycleOwner.getLifecycle().addObserver(lifecycleBoundObserver);
    }

    public void observeForever(Observer<? super T> observer) {
        assertMainThread("observeForever");
        b bVar = new b(observer);
        LiveData<T>.c cVarJ = this.mObservers.j(observer, bVar);
        if (cVarJ instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVarJ != null) {
            return;
        }
        bVar.a(true);
    }

    public void onActive() {
    }

    public void onInactive() {
    }

    public void postValue(T t) {
        boolean z;
        synchronized (this.mDataLock) {
            z = this.mPendingData == NOT_SET;
            this.mPendingData = t;
        }
        if (z) {
            bj1.h().d(this.mPostValueRunnable);
        }
    }

    public void removeObserver(Observer<? super T> observer) {
        assertMainThread("removeObserver");
        LiveData<T>.c cVarK = this.mObservers.k(observer);
        if (cVarK == null) {
            return;
        }
        cVarK.b();
        cVarK.a(false);
    }

    public void removeObservers(LifecycleOwner lifecycleOwner) {
        assertMainThread("removeObservers");
        for (Map.Entry<Observer<? super T>, LiveData<T>.c> entry : this.mObservers) {
            if (entry.getValue().c(lifecycleOwner)) {
                removeObserver(entry.getKey());
            }
        }
    }

    public void setValue(T t) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t;
        dispatchingValue(null);
    }

    public LiveData() {
        this.mDataLock = new Object();
        this.mObservers = new d9l<>();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new a();
        this.mData = obj;
        this.mVersion = -1;
    }
}
