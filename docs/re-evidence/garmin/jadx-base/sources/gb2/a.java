package gb2;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.i2;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import pi2.g;
import pi2.h;
import pi2.i;
import pi2.k;
import wb2.j;

/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f76761c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f76762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f76763b;

    /* JADX INFO: renamed from: gb2.a$a, reason: collision with other inner class name */
    public class C1546a extends xf0.b {
        public C1546a() {
        }

        @Override // xf0.b
        public final void deviceConnected(g gVar) {
            a.this.getClass();
        }

        @Override // xf0.b
        public final void deviceDisconnected(h hVar) {
            d dVar;
            Bundle eventData = hVar.getEventData();
            a aVar = a.this;
            ConcurrentHashMap concurrentHashMap = aVar.f76762a;
            if (eventData == null || (dVar = (d) concurrentHashMap.get(Long.valueOf(eventData.getLong("GCM_extra_device_connected_unit_id", 0L)))) == null) {
                return;
            }
            if (dVar.f76775g != null) {
                dVar.f76771c = false;
                dVar.f76772d = 100.0f;
                dVar.f76774f = 3;
                dVar.f76775g = null;
                i2.d("SyncStateManager", "Device disconnected with an active delayed sync finish timer - completing sync");
                dVar.a();
                aVar.c(dVar);
            } else if (dVar.f76774f != 3) {
                dVar.f76771c = false;
                dVar.f76774f = 4;
                i2.d("SyncStateManager", "Device disconnected");
                dVar.a();
                aVar.c(dVar);
            }
            concurrentHashMap.remove(Long.valueOf(dVar.f76769a));
        }
    }

    public class b extends wf0.a {
        public b() {
        }

        @Override // wf0.a
        public final void deviceSyncFinished(i iVar) {
            j jVarA;
            Bundle eventData = iVar.getEventData();
            a aVar = a.this;
            ConcurrentHashMap concurrentHashMap = aVar.f76762a;
            if (eventData == null || (jVarA = j.a(eventData.getString("com.garmin.android.lib.connectdevicesync.EXTRA_PROGRESS_VISIBILITY"), j.ALWAYS_SHOW_PROGRESS)) == j.INVISIBLE) {
                return;
            }
            long j8 = eventData.getLong("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_ID", -1L);
            String string = eventData.getString("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_FULL_NAME");
            int i14 = eventData.getInt("com.garmin.android.lib.connectdevicesync.EXTRA_OVERALL_STATUS", 1);
            d dVar = (d) concurrentHashMap.get(Long.valueOf(j8));
            if (dVar == null) {
                dVar = new d();
                dVar.f76769a = j8;
            }
            dVar.f76771c = true;
            dVar.f76770b = string;
            dVar.f76772d = 90.0f;
            dVar.f76773e = jVarA;
            if (i14 == 0) {
                dVar.f76774f = 2;
                Timer timer = new Timer();
                dVar.f76775g = timer;
                timer.schedule(aVar.new c(j8, 3), 5000L);
            } else {
                dVar.f76774f = 4;
                dVar.f76772d = 100.0f;
            }
            concurrentHashMap.put(Long.valueOf(j8), dVar);
            i2.d("SyncStateManager", "handleSyncFinished:");
            dVar.a();
            aVar.c(dVar);
        }

        @Override // wf0.a
        public final void deviceSyncStarted(pi2.j jVar) {
            j jVarA;
            Bundle eventData = jVar.getEventData();
            a aVar = a.this;
            ConcurrentHashMap concurrentHashMap = aVar.f76762a;
            if (eventData == null || (jVarA = j.a(eventData.getString("com.garmin.android.lib.connectdevicesync.EXTRA_PROGRESS_VISIBILITY"), j.ALWAYS_SHOW_PROGRESS)) == j.INVISIBLE) {
                return;
            }
            long j8 = eventData.getLong("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_ID", -1L);
            String string = eventData.getString("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_FULL_NAME");
            d dVar = (d) concurrentHashMap.get(Long.valueOf(j8));
            if (dVar == null) {
                dVar = new d();
                dVar.f76769a = j8;
            }
            dVar.f76771c = true;
            dVar.f76773e = jVarA;
            dVar.f76770b = string;
            dVar.f76774f = 1;
            dVar.f76772d = 10.0f;
            concurrentHashMap.put(Long.valueOf(j8), dVar);
            i2.d("SyncStateManager", "handleSyncStarted:");
            dVar.a();
            aVar.c(dVar);
        }

        @Override // wf0.a
        public final void deviceSyncTransferProgressUpdated(k kVar) {
            j jVarA;
            Bundle eventData = kVar.getEventData();
            a aVar = a.this;
            ConcurrentHashMap concurrentHashMap = aVar.f76762a;
            if (eventData == null || (jVarA = j.a(eventData.getString("com.garmin.android.lib.connectdevicesync.EXTRA_PROGRESS_VISIBILITY"), j.ALWAYS_SHOW_PROGRESS)) == j.INVISIBLE) {
                return;
            }
            long j8 = eventData.getLong("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_ID", -1L);
            String string = eventData.getString("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_FULL_NAME");
            float f14 = eventData.getFloat("com.garmin.android.lib.connectdevicesync.EXTRA_TOTAL_PROGRESS_BY_FILE_SIZE", 0.0f);
            d dVar = (d) concurrentHashMap.get(Long.valueOf(j8));
            if (dVar == null) {
                dVar = new d();
                dVar.f76769a = j8;
            }
            dVar.f76771c = true;
            dVar.f76773e = jVarA;
            dVar.f76770b = string;
            dVar.f76774f = 2;
            dVar.f76772d = (f14 * 0.8f) + 10.0f;
            concurrentHashMap.put(Long.valueOf(j8), dVar);
            i2.d("SyncStateManager", "handleSyncProgress:");
            dVar.a();
            aVar.c(dVar);
        }
    }

    public class c extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f76766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f76767b;

        public c(long j8, int i14) {
            this.f76766a = j8;
            this.f76767b = i14;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            d dVar = (d) aVar.f76762a.get(Long.valueOf(this.f76766a));
            if (dVar == null) {
                return;
            }
            dVar.f76771c = false;
            dVar.f76772d = 100.0f;
            dVar.f76774f = this.f76767b;
            dVar.f76775g = null;
            i2.d("SyncStateManager", "Completing sync");
            dVar.a();
            aVar.c(dVar);
            aVar.f76762a.remove(Long.valueOf(dVar.f76769a));
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f76769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f76770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f76771c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f76772d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public j f76773e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f76774f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Timer f76775g = null;

        public final void a() {
            i2.d("SyncStateManager", "========================================================");
            i2.d("SyncStateManager", "deviceUnitID: " + this.f76769a);
            if (this.f76770b != null) {
                i2.d("SyncStateManager", "deviceName: " + this.f76770b);
            }
            i2.d("SyncStateManager", "syncInProgress: ".concat(this.f76771c ? "Yes" : "No"));
            i2.d("SyncStateManager", "syncProgress: " + this.f76772d);
            if (this.f76773e != null) {
                i2.d("SyncStateManager", "visibility: " + this.f76773e.name());
            }
            i2.d("SyncStateManager", "status: " + this.f76774f);
            i2.d("SyncStateManager", "========================================================");
        }
    }

    public interface e {
        void b(d dVar);
    }

    private a() {
        C1546a c1546a = new C1546a();
        b bVar = new b();
        this.f76762a = new ConcurrentHashMap();
        this.f76763b = new CopyOnWriteArrayList();
        oi2.a.f132270a.getClass();
        oi2.a.C2513a.b(c1546a);
        oi2.a.C2513a.b(bVar);
    }

    public static a b() {
        if (f76761c == null) {
            f76761c = new a();
        }
        return f76761c;
    }

    public final void a(e eVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f76763b;
        if (copyOnWriteArrayList.contains(eVar)) {
            return;
        }
        copyOnWriteArrayList.add(eVar);
        ConcurrentHashMap concurrentHashMap = this.f76762a;
        if (concurrentHashMap.size() > 0) {
            Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                eVar.b((d) ((Map.Entry) it.next()).getValue());
            }
        }
    }

    public final void c(d dVar) {
        Iterator it = this.f76763b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).b(dVar);
        }
    }
}
