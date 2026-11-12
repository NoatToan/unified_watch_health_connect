package androidx.camera.lifecycle;

import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.core.s;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.c;
import defpackage.g6i;
import defpackage.gwq;
import defpackage.nfe;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class LifecycleCameraRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1829a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("mLock")
    public final Map<a, LifecycleCamera> f1830b = new HashMap();

    @GuardedBy("mLock")
    public final Map<LifecycleCameraRepositoryObserver, Set<a>> c = new HashMap();

    @GuardedBy("mLock")
    public final ArrayDeque<LifecycleOwner> d = new ArrayDeque<>();

    public static class LifecycleCameraRepositoryObserver implements nfe {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LifecycleCameraRepository f1831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LifecycleOwner f1832b;

        public LifecycleCameraRepositoryObserver(LifecycleOwner lifecycleOwner, LifecycleCameraRepository lifecycleCameraRepository) {
            this.f1832b = lifecycleOwner;
            this.f1831a = lifecycleCameraRepository;
        }

        public LifecycleOwner a() {
            return this.f1832b;
        }

        @c(Lifecycle.Event.ON_DESTROY)
        public void onDestroy(LifecycleOwner lifecycleOwner) {
            this.f1831a.l(lifecycleOwner);
        }

        @c(Lifecycle.Event.ON_START)
        public void onStart(LifecycleOwner lifecycleOwner) {
            this.f1831a.h(lifecycleOwner);
        }

        @c(Lifecycle.Event.ON_STOP)
        public void onStop(LifecycleOwner lifecycleOwner) {
            this.f1831a.i(lifecycleOwner);
        }
    }

    public static abstract class a {
        public static a a(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter.a aVar) {
            return new androidx.camera.lifecycle.a(lifecycleOwner, aVar);
        }

        public abstract CameraUseCaseAdapter.a b();

        public abstract LifecycleOwner c();
    }

    public void a(LifecycleCamera lifecycleCamera, gwq gwqVar, Collection<s> collection) {
        synchronized (this.f1829a) {
            g6i.a(!collection.isEmpty());
            LifecycleOwner lifecycleOwnerK = lifecycleCamera.k();
            Iterator<a> it = this.c.get(d(lifecycleOwnerK)).iterator();
            while (it.hasNext()) {
                LifecycleCamera lifecycleCamera2 = (LifecycleCamera) g6i.g(this.f1830b.get(it.next()));
                if (!lifecycleCamera2.equals(lifecycleCamera) && !lifecycleCamera2.l().isEmpty()) {
                    throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                }
            }
            try {
                lifecycleCamera.f().H(gwqVar);
                lifecycleCamera.b(collection);
                if (lifecycleOwnerK.getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
                    h(lifecycleOwnerK);
                }
            } catch (CameraUseCaseAdapter.CameraException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }
    }

    public LifecycleCamera b(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter cameraUseCaseAdapter) {
        LifecycleCamera lifecycleCamera;
        synchronized (this.f1829a) {
            try {
                g6i.b(this.f1830b.get(a.a(lifecycleOwner, cameraUseCaseAdapter.v())) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                if (lifecycleOwner.getLifecycle().getState() == Lifecycle.State.DESTROYED) {
                    throw new IllegalArgumentException("Trying to create LifecycleCamera with destroyed lifecycle.");
                }
                lifecycleCamera = new LifecycleCamera(lifecycleOwner, cameraUseCaseAdapter);
                if (cameraUseCaseAdapter.x().isEmpty()) {
                    lifecycleCamera.n();
                }
                g(lifecycleCamera);
            } catch (Throwable th) {
                throw th;
            }
        }
        return lifecycleCamera;
    }

    public LifecycleCamera c(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter.a aVar) {
        LifecycleCamera lifecycleCamera;
        synchronized (this.f1829a) {
            lifecycleCamera = this.f1830b.get(a.a(lifecycleOwner, aVar));
        }
        return lifecycleCamera;
    }

    public final LifecycleCameraRepositoryObserver d(LifecycleOwner lifecycleOwner) {
        synchronized (this.f1829a) {
            try {
                for (LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : this.c.keySet()) {
                    if (lifecycleOwner.equals(lifecycleCameraRepositoryObserver.a())) {
                        return lifecycleCameraRepositoryObserver;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Collection<LifecycleCamera> e() {
        Collection<LifecycleCamera> collectionUnmodifiableCollection;
        synchronized (this.f1829a) {
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.f1830b.values());
        }
        return collectionUnmodifiableCollection;
    }

    public final boolean f(LifecycleOwner lifecycleOwner) {
        synchronized (this.f1829a) {
            try {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserverD = d(lifecycleOwner);
                if (lifecycleCameraRepositoryObserverD == null) {
                    return false;
                }
                Iterator<a> it = this.c.get(lifecycleCameraRepositoryObserverD).iterator();
                while (it.hasNext()) {
                    if (!((LifecycleCamera) g6i.g(this.f1830b.get(it.next()))).l().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(LifecycleCamera lifecycleCamera) {
        synchronized (this.f1829a) {
            try {
                LifecycleOwner lifecycleOwnerK = lifecycleCamera.k();
                a aVarA = a.a(lifecycleOwnerK, lifecycleCamera.f().v());
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserverD = d(lifecycleOwnerK);
                Set<a> hashSet = lifecycleCameraRepositoryObserverD != null ? this.c.get(lifecycleCameraRepositoryObserverD) : new HashSet<>();
                hashSet.add(aVarA);
                this.f1830b.put(aVarA, lifecycleCamera);
                if (lifecycleCameraRepositoryObserverD == null) {
                    LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = new LifecycleCameraRepositoryObserver(lifecycleOwnerK, this);
                    this.c.put(lifecycleCameraRepositoryObserver, hashSet);
                    lifecycleOwnerK.getLifecycle().addObserver(lifecycleCameraRepositoryObserver);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void h(LifecycleOwner lifecycleOwner) {
        synchronized (this.f1829a) {
            try {
                if (f(lifecycleOwner)) {
                    if (this.d.isEmpty()) {
                        this.d.push(lifecycleOwner);
                    } else {
                        LifecycleOwner lifecycleOwnerPeek = this.d.peek();
                        if (!lifecycleOwner.equals(lifecycleOwnerPeek)) {
                            j(lifecycleOwnerPeek);
                            this.d.remove(lifecycleOwner);
                            this.d.push(lifecycleOwner);
                        }
                    }
                    m(lifecycleOwner);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i(LifecycleOwner lifecycleOwner) {
        synchronized (this.f1829a) {
            try {
                this.d.remove(lifecycleOwner);
                j(lifecycleOwner);
                if (!this.d.isEmpty()) {
                    m(this.d.peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(LifecycleOwner lifecycleOwner) {
        synchronized (this.f1829a) {
            try {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserverD = d(lifecycleOwner);
                if (lifecycleCameraRepositoryObserverD == null) {
                    return;
                }
                Iterator<a> it = this.c.get(lifecycleCameraRepositoryObserverD).iterator();
                while (it.hasNext()) {
                    ((LifecycleCamera) g6i.g(this.f1830b.get(it.next()))).n();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k() {
        synchronized (this.f1829a) {
            try {
                Iterator<a> it = this.f1830b.keySet().iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = this.f1830b.get(it.next());
                    lifecycleCamera.o();
                    i(lifecycleCamera.k());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l(LifecycleOwner lifecycleOwner) {
        synchronized (this.f1829a) {
            try {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserverD = d(lifecycleOwner);
                if (lifecycleCameraRepositoryObserverD == null) {
                    return;
                }
                i(lifecycleOwner);
                Iterator<a> it = this.c.get(lifecycleCameraRepositoryObserverD).iterator();
                while (it.hasNext()) {
                    this.f1830b.remove(it.next());
                }
                this.c.remove(lifecycleCameraRepositoryObserverD);
                lifecycleCameraRepositoryObserverD.a().getLifecycle().removeObserver(lifecycleCameraRepositoryObserverD);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(LifecycleOwner lifecycleOwner) {
        synchronized (this.f1829a) {
            try {
                Iterator<a> it = this.c.get(d(lifecycleOwner)).iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = this.f1830b.get(it.next());
                    if (!((LifecycleCamera) g6i.g(lifecycleCamera)).l().isEmpty()) {
                        lifecycleCamera.p();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
