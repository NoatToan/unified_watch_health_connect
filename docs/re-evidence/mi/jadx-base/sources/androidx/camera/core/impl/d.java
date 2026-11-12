package androidx.camera.core.impl;

import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.health.connect.client.records.metadata.DeviceTypes;
import com.mibi.sdk.common.CommonConstants;
import defpackage.g6i;
import defpackage.ue3;
import defpackage.zpe;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class d {
    public final int c;

    @GuardedBy("mLock")
    public int e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f1726a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1727b = new Object();

    @GuardedBy("mLock")
    public final Map<ue3, a> d = new HashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CameraInternal.State f1728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f1729b;
        public final b c;

        public a(CameraInternal.State state, Executor executor, b bVar) {
            this.f1728a = state;
            this.f1729b = executor;
            this.c = bVar;
        }

        public CameraInternal.State a() {
            return this.f1728a;
        }

        public void b() {
            try {
                Executor executor = this.f1729b;
                final b bVar = this.c;
                Objects.requireNonNull(bVar);
                executor.execute(new Runnable() { // from class: zh3
                    @Override // java.lang.Runnable
                    public final void run() {
                        bVar.a();
                    }
                });
            } catch (RejectedExecutionException e) {
                zpe.d("CameraStateRegistry", "Unable to notify camera.", e);
            }
        }

        public CameraInternal.State c(CameraInternal.State state) {
            CameraInternal.State state2 = this.f1728a;
            this.f1728a = state;
            return state2;
        }
    }

    public interface b {
        void a();
    }

    public d(int i) {
        this.c = i;
        synchronized ("mLock") {
            this.e = i;
        }
    }

    public static boolean b(CameraInternal.State state) {
        return state != null && state.holdsCameraSlot();
    }

    public boolean a() {
        synchronized (this.f1727b) {
            try {
                Iterator<Map.Entry<ue3, a>> it = this.d.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue().a() == CameraInternal.State.CLOSING) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(ue3 ue3Var, CameraInternal.State state, boolean z) {
        HashMap map;
        synchronized (this.f1727b) {
            try {
                int i = this.e;
                if ((state == CameraInternal.State.RELEASED ? g(ue3Var) : h(ue3Var, state)) == state) {
                    return;
                }
                if (i < 1 && this.e > 0) {
                    map = new HashMap();
                    for (Map.Entry<ue3, a> entry : this.d.entrySet()) {
                        if (entry.getValue().a() == CameraInternal.State.PENDING_OPEN) {
                            map.put(entry.getKey(), entry.getValue());
                        }
                    }
                } else if (state != CameraInternal.State.PENDING_OPEN || this.e <= 0) {
                    map = null;
                } else {
                    map = new HashMap();
                    map.put(ue3Var, this.d.get(ue3Var));
                }
                if (map != null && !z) {
                    map.remove(ue3Var);
                }
                if (map != null) {
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @GuardedBy("mLock")
    public final void d() {
        if (zpe.f("CameraStateRegistry")) {
            this.f1726a.setLength(0);
            this.f1726a.append("Recalculating open cameras:\n");
            this.f1726a.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.f1726a.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (Map.Entry<ue3, a> entry : this.d.entrySet()) {
            if (zpe.f("CameraStateRegistry")) {
                this.f1726a.append(String.format(Locale.US, "%-45s%-22s\n", entry.getKey().toString(), entry.getValue().a() != null ? entry.getValue().a().toString() : DeviceTypes.UNKNOWN));
            }
            if (b(entry.getValue().a())) {
                i++;
            }
        }
        if (zpe.f("CameraStateRegistry")) {
            this.f1726a.append("-------------------------------------------------------------------\n");
            this.f1726a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i), Integer.valueOf(this.c)));
            zpe.a("CameraStateRegistry", this.f1726a.toString());
        }
        this.e = Math.max(this.c - i, 0);
    }

    public void e(ue3 ue3Var, Executor executor, b bVar) {
        synchronized (this.f1727b) {
            g6i.j(!this.d.containsKey(ue3Var), "Camera is already registered: " + ue3Var);
            this.d.put(ue3Var, new a(null, executor, bVar));
        }
    }

    public boolean f(ue3 ue3Var) {
        boolean z;
        synchronized (this.f1727b) {
            try {
                a aVar = (a) g6i.h(this.d.get(ue3Var), "Camera must first be registered with registerCamera()");
                if (zpe.f("CameraStateRegistry")) {
                    this.f1726a.setLength(0);
                    this.f1726a.append(String.format(Locale.US, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]", ue3Var, Integer.valueOf(this.e), Boolean.valueOf(b(aVar.a())), aVar.a()));
                }
                if (this.e > 0 || b(aVar.a())) {
                    aVar.c(CameraInternal.State.OPENING);
                    z = true;
                } else {
                    z = false;
                }
                if (zpe.f("CameraStateRegistry")) {
                    StringBuilder sb = this.f1726a;
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[1];
                    objArr[0] = z ? "SUCCESS" : CommonConstants.Mgc.STATUS_FAIL;
                    sb.append(String.format(locale, " --> %s", objArr));
                    zpe.a("CameraStateRegistry", this.f1726a.toString());
                }
                if (z) {
                    d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @GuardedBy("mLock")
    public final CameraInternal.State g(ue3 ue3Var) {
        a aVarRemove = this.d.remove(ue3Var);
        if (aVarRemove == null) {
            return null;
        }
        d();
        return aVarRemove.a();
    }

    @GuardedBy("mLock")
    public final CameraInternal.State h(ue3 ue3Var, CameraInternal.State state) {
        CameraInternal.State stateC = ((a) g6i.h(this.d.get(ue3Var), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).c(state);
        CameraInternal.State state2 = CameraInternal.State.OPENING;
        if (state == state2) {
            g6i.j(b(state) || stateC == state2, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (stateC != state) {
            d();
        }
        return stateC;
    }
}
