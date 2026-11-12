package hk2;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.room.a0;
import dk2.e;
import dk2.h;
import e23.l;
import h62.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import o13.m;
import o13.p;
import o13.t;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import t13.g;
import v.e0;
import zy2.k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0012\u0013\u0014\u0015BQ\b\u0000\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0002¢\u0006\u0004\b\r\u0010\u000eB\u0013\b\u0010\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\r\u0010\u0011¨\u0006\u0016"}, d2 = {"Lhk2/b;", "", "Lkotlin/Function1;", "", "Landroid/content/SharedPreferences;", "sharedPrefsFactory", "Lt13/g;", "coroutineContext", "Lkotlin/Function0;", "", "currentMillis", "Ldk2/d;", "deviceFromJson", "<init>", "(Le23/l;Lt13/g;Le23/a;Le23/l;)V", "Landroid/content/Context;", "appContext", "(Landroid/content/Context;)V", "a", "c", "b", "d", "device-discovery_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f84221i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f84222j = 7;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final k f84223k = zy2.c.f207527a.a("DISC#DiscoveryProbeManager");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static b f84224l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<String, SharedPreferences> f84225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<Long> f84226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l<String, dk2.d> f84227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u53.d f84228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f84229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f84230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap<String, c> f84231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f84232h;

    /* JADX INFO: renamed from: hk2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhk2/b$b;", "Lhk2/a;", "", "address", "<init>", "(Lhk2/b;Ljava/lang/String;)V", "device-discovery_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class C1669b implements hk2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f84234b;

        public C1669b(b bVar, String str) {
            str.getClass();
            this.f84234b = bVar;
            this.f84233a = str;
        }

        @Override // hk2.a
        public final void a(dk2.d dVar) {
            e eVar;
            if ((dVar != null ? dVar.f60238b : null) != null && !this.f84233a.equals(dVar.f60238b)) {
                d(dVar.f60238b);
                return;
            }
            k kVar = b.f84223k;
            String str = dVar != null ? dVar.f60237a : null;
            Long l14 = dVar != null ? dVar.f60244h : null;
            kVar.debug("onGarminDevice(" + str + ", " + l14 + ", " + this.f84233a);
            b bVar = this.f84234b;
            synchronized (bVar.f84230f) {
                bVar.f84231g.put(this.f84233a, new c(true, dVar, bVar.b(dVar)));
                bVar.a(this.f84233a, dVar);
                eVar = bVar.f84232h;
                Unit unit = Unit.INSTANCE;
            }
            if (dVar == null || eVar == null) {
                return;
            }
            eVar.a(dVar);
        }

        @Override // hk2.a
        public final void b(String str) {
            if (!this.f84233a.equals(str)) {
                d(str);
                return;
            }
            b.f84223k.debug("onNonGarminDevice(" + str + ")");
            b bVar = this.f84234b;
            synchronized (bVar.f84230f) {
                bVar.f84231g.put(this.f84233a, new c(true, bVar.f84226b.invoke().longValue()));
                bVar.a(this.f84233a, null);
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // hk2.a
        public final void c(String str, String str2) {
            if (!this.f84233a.equals(str)) {
                d(str);
                return;
            }
            b.f84223k.a(null, e0.g("onDeviceConnectionFailed(", str, ", ", str2, ")"));
            b bVar = this.f84234b;
            synchronized (bVar.f84230f) {
                bVar.f84231g.remove(this.f84233a);
            }
        }

        public final void d(String str) {
            k kVar = b.f84223k;
            String str2 = this.f84233a;
            kVar.error(a0.j("Mac address mismatch between ", str2, " and ", str), null);
            c(str2, "Mac address mismatch");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(l<? super String, ? extends SharedPreferences> lVar, g gVar, e23.a<Long> aVar, l<? super String, dk2.d> lVar2) {
        Map<String, ?> all;
        lVar.getClass();
        gVar.getClass();
        aVar.getClass();
        lVar2.getClass();
        this.f84225a = lVar;
        this.f84226b = aVar;
        this.f84227c = lVar2;
        this.f84228d = zl.a.e("DiscoveryProbeManager", gVar.plus(ge1.b.h()));
        t tVarB = m.b(new j(this, 5));
        this.f84229e = tVarB;
        this.f84230f = new Object();
        this.f84231g = new HashMap<>();
        SharedPreferences sharedPreferences = (SharedPreferences) tVarB.getValue();
        if (sharedPreferences == null || (all = sharedPreferences.getAll()) == null) {
            return;
        }
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            String str = (String) entry.getValue();
            Long lJ = str != null ? d53.t.j(str) : null;
            k kVar = f84223k;
            if ((str == null || str.length() != 0) && lJ == null) {
                kVar.debug("Loading successful Garmin probe from cache for " + key);
                try {
                    l<String, dk2.d> lVar3 = this.f84227c;
                    str.getClass();
                    dk2.d dVarInvoke = lVar3.invoke(str);
                    if (dVarInvoke != null) {
                        this.f84231g.put(key, new c(true, dVarInvoke, b(dVarInvoke)));
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Exception unused) {
                    Unit unit2 = Unit.INSTANCE;
                }
            } else {
                kVar.debug("Loading completed non Garmin probe from cache for " + key);
                this.f84231g.put(key, new c(true, lJ != null ? lJ.longValue() : this.f84226b.invoke().longValue()));
                if (str.length() == 0) {
                    key.getClass();
                    a(key, null);
                }
            }
        }
    }

    public final void a(String str, h hVar) {
        SharedPreferences sharedPreferences;
        str.getClass();
        if ((hVar == null || (hVar instanceof dk2.d)) && (sharedPreferences = (SharedPreferences) this.f84229e.getValue()) != null) {
            synchronized (this.f84230f) {
                try {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    String strG = hVar != null ? ((dk2.d) hVar).g() : String.valueOf(this.f84226b.invoke().longValue());
                    f84223k.debug("Saving " + str + ":" + strG);
                    editorEdit.putString(str, strG);
                    editorEdit.apply();
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public final long b(h hVar) {
        Long l14;
        dk2.d dVar = hVar instanceof dk2.d ? (dk2.d) hVar : null;
        return (dVar == null || (l14 = dVar.f60248l) == null) ? this.f84226b.invoke().longValue() : l14.longValue();
    }

    @SuppressLint({"MissingPermission"})
    public final void c(Collection<String> collection, hk2.d dVar, e eVar) {
        ArrayList arrayList;
        collection.getClass();
        dVar.getClass();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
            f84223k.debug("BT not available, skipping probe");
            return;
        }
        Set<BluetoothDevice> bondedDevices = defaultAdapter.getBondedDevices();
        if (bondedDevices != null) {
            arrayList = new ArrayList();
            for (Object obj : bondedDevices) {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) obj;
                if (bluetoothDevice.getType() != 1 && !collection.contains(bluetoothDevice.getAddress())) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            f84223k.debug("No devices, skipping probe");
            return;
        }
        if (arrayList.size() >= f84222j) {
            f84223k.debug("Too many bonded devices (" + arrayList.size() + "), skipping probe");
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<dk2.d> arrayList3 = new ArrayList();
        synchronized (this.f84230f) {
            try {
                for (BluetoothDevice bluetoothDevice2 : h0.b1(arrayList)) {
                    c cVar = this.f84231g.get(bluetoothDevice2.getAddress());
                    if (cVar == null) {
                        d.f84238a.getClass();
                        arrayList2.add(new p((cVar == null || !cVar.f84235a) ? d.UNKNOWN : cVar.f84236b == null ? d.NON_GARMIN : d.GARMIN, bluetoothDevice2));
                        this.f84231g.put(bluetoothDevice2.getAddress(), new c(false, this.f84226b.invoke().longValue()));
                        f84223k.debug("No previous probe. Starting new for " + bluetoothDevice2.getAddress());
                    } else if (!cVar.f84235a) {
                        f84223k.debug("Probe in progress for " + bluetoothDevice2.getAddress());
                    } else if (cVar.f84236b != null) {
                        arrayList3.add(new dk2.d(cVar.f84236b, bluetoothDevice2));
                        f84223k.debug("Previous probe already complete for " + bluetoothDevice2.getAddress());
                    } else {
                        f84223k.debug("Ignoring non-Garmin device " + bluetoothDevice2.getAddress());
                    }
                }
                this.f84232h = eVar;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        for (dk2.d dVar2 : arrayList3) {
            if (eVar != null) {
                eVar.a(dVar2);
            }
        }
        ge1.b.T(this.f84228d, null, null, new hk2.c(arrayList2, dVar, this, null), 3);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lhk2/b$d;", "", "<init>", "(Ljava/lang/String;I)V", "a", "device-discovery_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum d {
        GARMIN,
        UNKNOWN,
        NON_GARMIN;


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f84238a = new a(null);

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhk2/b$d$a;", "", "<init>", "()V", "device-discovery_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lhk2/b$a;", "", "<init>", "()V", "Lzy2/k;", "LOGGER", "Lzy2/k;", "", "PROBE_PREFS_NAME", "Ljava/lang/String;", "Lhk2/b;", "instance", "Lhk2/b;", "device-discovery_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lhk2/b$c;", "", "", "isComplete", "Ldk2/h;", "device", "", "discoveryTimeMillis", "<init>", "(ZLdk2/h;J)V", "(ZJ)V", "device-discovery_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f84235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h f84236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f84237c;

        public c(boolean z14, h hVar, long j8) {
            this.f84235a = z14;
            this.f84236b = hVar;
            this.f84237c = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f84235a == cVar.f84235a && s.g(this.f84236b, cVar.f84236b) && this.f84237c == cVar.f84237c;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f84235a) * 31;
            h hVar = this.f84236b;
            return Long.hashCode(this.f84237c) + ((iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("ProbeResult(isComplete=");
            sb3.append(this.f84235a);
            sb3.append(", device=");
            sb3.append(this.f84236b);
            sb3.append(", discoveryTimeMillis=");
            return am.j.i(this.f84237c, ")", sb3);
        }

        public c(boolean z14, long j8) {
            this(z14, null, j8);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(l lVar, g gVar, e23.a aVar, l lVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 2) != 0) {
            x53.c cVar = s0.f129406a;
            gVar = x53.b.f189152a;
        }
        this(lVar, gVar, (i14 & 4) != 0 ? new ha0.a(14) : aVar, (i14 & 8) != 0 ? new ha0.b(16) : lVar2);
    }

    public b(Context context) {
        this(new a51.m(context, 14), null, null, null, 14, null);
    }
}
