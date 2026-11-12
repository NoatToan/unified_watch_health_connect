package ik2;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import dk2.f;
import dk2.h;
import e23.p;
import java.util.List;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.q;
import p13.j0;
import v13.i;
import zy2.k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\tB'\u0012\u001e\b\u0002\u0010\u0006\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lik2/a;", "Lik2/d;", "Lkotlin/Function2;", "Landroid/bluetooth/le/ScanResult;", "Lek2/a;", "Ldk2/h;", "parseScanResultFunc", "<init>", "(Le23/p;)V", "b", "device-discovery-scan_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k f93916g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p<ScanResult, ek2.a, h> f93917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dk2.a f93918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ek2.a f93919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public rj2.a f93920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u53.d f93921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f93922f;

    /* JADX INFO: renamed from: ik2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class C1793a extends q implements p<ScanResult, ek2.a, dk2.d> {
        public C1793a(Object obj) {
            super(2, obj, dk2.d.a.class, "fromScanResult", "fromScanResult(Landroid/bluetooth/le/ScanResult;Lcom/garmin/device/discovery/filter/DiscoveryCriteria;)Lcom/garmin/device/discovery/DiscoveredDevice;", 0);
        }

        @Override // e23.p
        public final dk2.d invoke(ScanResult scanResult, ek2.a aVar) {
            aVar.getClass();
            ((dk2.d.a) this.receiver).getClass();
            return dk2.d.a.a(scanResult, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ik2/a$c", "Landroid/bluetooth/le/ScanCallback;", "device-discovery-scan_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends ScanCallback {

        /* JADX INFO: renamed from: ik2.a$c$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.device.discovery.scan.DiscoveryScanner$scannerCallback$1$onScanResult$1", f = "DiscoveryScanner.kt", l = {}, m = "invokeSuspend")
        public static final class C1794a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a f93924a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScanResult f93925b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1794a(a aVar, ScanResult scanResult, t13.d<? super C1794a> dVar) {
                super(2, dVar);
                this.f93924a = aVar;
                this.f93925b = scanResult;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C1794a(this.f93924a, this.f93925b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C1794a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                h hVarInvoke;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                a aVar2 = this.f93924a;
                dk2.a aVar3 = aVar2.f93918b;
                if (aVar3 != null) {
                    p<ScanResult, ek2.a, h> pVar = aVar2.f93917a;
                    ek2.a aVar4 = aVar2.f93919c;
                    if (aVar4 != null && (hVarInvoke = pVar.invoke(this.f93925b, aVar4)) != null) {
                        aVar3.a(hVarInvoke);
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
        }

        public c() {
        }

        @Override // android.bluetooth.le.ScanCallback
        public final void onScanFailed(int i14) {
            f fVar;
            f.f60249b.getClass();
            f[] fVarArrValues = f.values();
            int length = fVarArrValues.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length) {
                    fVar = f.SCAN_FAILED_UNKNOWN_OS_CODE;
                    break;
                }
                fVar = fVarArrValues[i15];
                Integer num = fVar.f60255a;
                if (num != null && num.intValue() == i14) {
                    break;
                } else {
                    i15++;
                }
            }
            a.f93916g.error("onScanFailed: Error: " + fVar + " - " + i14, null);
            dk2.a aVar = a.this.f93918b;
            if (aVar != null) {
                aVar.b(fVar);
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        public final void onScanResult(int i14, ScanResult scanResult) {
            if (scanResult == null) {
                return;
            }
            a aVar = a.this;
            u53.d dVar = aVar.f93921e;
            x53.c cVar = s0.f129406a;
            ge1.b.T(dVar, x53.b.f189152a, null, new C1794a(aVar, scanResult, null), 2);
        }
    }

    static {
        new b(null);
        f93916g = zy2.c.f207527a.a("DISC#DiscoveryScanner");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(p<? super ScanResult, ? super ek2.a, ? extends h> pVar) {
        pVar.getClass();
        this.f93917a = pVar;
        x53.c cVar = s0.f129406a;
        this.f93921e = zl.a.e("DiscoveryScanner", x53.b.f189152a.plus(ge1.b.h()));
        this.f93922f = new c();
    }

    @Override // ik2.d
    public final void a(ek2.a aVar, dk2.a aVar2) {
        f93916g.debug("startScan");
        this.f93919c = aVar;
        this.f93918b = aVar2;
        rj2.a aVarC = c();
        if (aVarC == null) {
            aVar2.b(f.DISCOVERY_PRE_REQS_NOT_MET_BT);
            return;
        }
        List<ScanFilter> list = aVar.f64511b;
        ScanSettings scanSettingsBuild = new ScanSettings.Builder().setScanMode(aVar.f64512c).build();
        scanSettingsBuild.getClass();
        c cVar = this.f93922f;
        list.getClass();
        cVar.getClass();
        rj2.a.C2893a c2893a = new rj2.a.C2893a(cVar, list);
        synchronized (aVarC.f153006b) {
            aVarC.f153007c.put(cVar, c2893a);
            Unit unit = Unit.INSTANCE;
        }
        try {
            aVarC.f153005a.startScan(j0.f134944a, scanSettingsBuild, c2893a);
        } catch (NullPointerException e4) {
            aVarC.f153008d.warn("Suppressing NPE from Android stack", (Throwable) e4);
            cVar.onScanFailed(3);
        } catch (Exception e14) {
            aVarC.f153008d.warn("Suppressing exception from Android stack", (Throwable) e14);
            cVar.onScanFailed(3);
        }
    }

    @Override // ik2.d
    public final void b() {
        rj2.a.C2893a c2893a;
        f93916g.debug("stopScan");
        rj2.a aVarC = c();
        if (aVarC != null) {
            c cVar = this.f93922f;
            cVar.getClass();
            synchronized (aVarC.f153006b) {
                c2893a = aVarC.f153007c.get(cVar);
            }
            if (c2893a != null) {
                try {
                    aVarC.f153005a.stopScan(c2893a);
                } catch (NullPointerException e4) {
                    aVarC.f153008d.warn("Suppressing NPE from Android stack", (Throwable) e4);
                } catch (Exception e14) {
                    aVarC.f153008d.warn("Suppressing exception from Android stack", (Throwable) e14);
                }
            }
        }
        this.f93918b = null;
    }

    public final synchronized rj2.a c() {
        try {
            rj2.a aVar = this.f93920d;
            if (aVar != null) {
                return aVar;
            }
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            BluetoothLeScanner bluetoothLeScanner = defaultAdapter != null ? defaultAdapter.getBluetoothLeScanner() : null;
            if (bluetoothLeScanner == null) {
                f93916g.a(null, "Unable to getScanner");
                return null;
            }
            rj2.a aVar2 = new rj2.a(bluetoothLeScanner);
            this.f93920d = aVar2;
            return aVar2;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lik2/a$b;", "", "<init>", "()V", "Lzy2/k;", "LOGGER", "Lzy2/k;", "device-discovery-scan_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ a(p pVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? new C1793a(dk2.d.f60235m) : pVar);
    }
}
