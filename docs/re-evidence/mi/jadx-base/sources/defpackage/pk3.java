package defpackage;

import android.hardware.camera2.CameraDevice;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class pk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f30479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f30480b = new Object();

    @GuardedBy("mLock")
    public final Set<wuo> c = new LinkedHashSet();

    @GuardedBy("mLock")
    public final Set<wuo> d = new LinkedHashSet();

    @GuardedBy("mLock")
    public final Set<wuo> e = new LinkedHashSet();
    public final CameraDevice.StateCallback f = new a();

    public class a extends CameraDevice.StateCallback {
        public a() {
        }

        public final void b() {
            List<wuo> listG;
            synchronized (pk3.this.f30480b) {
                listG = pk3.this.g();
                pk3.this.e.clear();
                pk3.this.c.clear();
                pk3.this.d.clear();
            }
            Iterator<wuo> it = listG.iterator();
            while (it.hasNext()) {
                it.next().i();
            }
        }

        public final void c() {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (pk3.this.f30480b) {
                linkedHashSet.addAll(pk3.this.e);
                linkedHashSet.addAll(pk3.this.c);
            }
            pk3.this.f30479a.execute(new Runnable() { // from class: ok3
                @Override // java.lang.Runnable
                public final void run() {
                    pk3.b(linkedHashSet);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            c();
            b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            c();
            b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    public pk3(Executor executor) {
        this.f30479a = executor;
    }

    public static void b(Set<wuo> set) {
        for (wuo wuoVar : set) {
            wuoVar.b().o(wuoVar);
        }
    }

    public final void a(wuo wuoVar) {
        wuo next;
        Iterator<wuo> it = g().iterator();
        while (it.hasNext() && (next = it.next()) != wuoVar) {
            next.i();
        }
    }

    public CameraDevice.StateCallback c() {
        return this.f;
    }

    public List<wuo> d() {
        ArrayList arrayList;
        synchronized (this.f30480b) {
            arrayList = new ArrayList(this.c);
        }
        return arrayList;
    }

    public List<wuo> e() {
        ArrayList arrayList;
        synchronized (this.f30480b) {
            arrayList = new ArrayList(this.d);
        }
        return arrayList;
    }

    public List<wuo> f() {
        ArrayList arrayList;
        synchronized (this.f30480b) {
            arrayList = new ArrayList(this.e);
        }
        return arrayList;
    }

    public List<wuo> g() {
        ArrayList arrayList;
        synchronized (this.f30480b) {
            arrayList = new ArrayList();
            arrayList.addAll(d());
            arrayList.addAll(f());
        }
        return arrayList;
    }

    public void h(wuo wuoVar) {
        synchronized (this.f30480b) {
            this.c.remove(wuoVar);
            this.d.remove(wuoVar);
        }
    }

    public void i(wuo wuoVar) {
        synchronized (this.f30480b) {
            this.d.add(wuoVar);
        }
    }

    public void j(wuo wuoVar) {
        a(wuoVar);
        synchronized (this.f30480b) {
            this.e.remove(wuoVar);
        }
    }

    public void k(wuo wuoVar) {
        synchronized (this.f30480b) {
            this.c.add(wuoVar);
            this.e.remove(wuoVar);
        }
        a(wuoVar);
    }

    public void l(wuo wuoVar) {
        synchronized (this.f30480b) {
            this.e.add(wuoVar);
        }
    }
}
