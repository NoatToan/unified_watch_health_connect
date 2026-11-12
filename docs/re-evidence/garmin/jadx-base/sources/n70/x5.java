package n70;

import com.garmin.android.gfdi.configuration.SupportedCapability;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Ln70/x5;", "", "Lzr1/a;", "getSyncStatusUseCase", "Llc0/f;", "getBluetoothStateUseCase", "Ln70/p1;", "getDevicesInfoUseCase", "Ln70/m7;", "triggerSyncNowUseCase", "Laz0/c;", "networkStateObserver", "Ll80/b;", "gdiDelegate", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/s0;", "dashboardPreferences", "<init>", "(Lzr1/a;Llc0/f;Ln70/p1;Ln70/m7;Laz0/c;Ll80/b;Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/s0;)V", "a", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x5 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f124743j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zr1.a f124744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lc0.f f124745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p1 f124746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m7 f124747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final az0.c f124748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l80.b f124749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0 f124750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r53.p2 f124751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r53.p2 f124752i;

    static {
        new a(null);
    }

    public x5(zr1.a aVar, lc0.f fVar, p1 p1Var, m7 m7Var, az0.c cVar, l80.b bVar, com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0 s0Var) {
        aVar.getClass();
        fVar.getClass();
        p1Var.getClass();
        m7Var.getClass();
        cVar.getClass();
        bVar.getClass();
        s0Var.getClass();
        this.f124744a = aVar;
        this.f124745b = fVar;
        this.f124746c = p1Var;
        this.f124747d = m7Var;
        this.f124748e = cVar;
        this.f124749f = bVar;
        this.f124750g = s0Var;
        Boolean bool = Boolean.FALSE;
        this.f124751h = r53.q2.a(bool);
        this.f124752i = r53.q2.a(bool);
    }

    public static final Object a(x5 x5Var, r53.j jVar, l7 l7Var, sd2.f fVar, Long l14, y5.a.C2397a c2397a) {
        x5Var.getClass();
        if (l7Var.f124397c && l7Var.f124399e == az0.c.a.Available && (((fVar != null && x5Var.f124749f.a(fVar.getUnitID())) || (fVar != null && zb0.u0.l(fVar.getProductNumber()))) && fVar != null)) {
            if (km2.a.e(new int[]{SupportedCapability.HOST_INITIATED_SYNC_REQUESTS.ordinal(), SupportedCapability.SYNC_2.ordinal()}, fVar.getUnitID())) {
                com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                aVar.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "GetSyncStateUseCase", "Sync not started, deviceUnitId: " + l14);
                Object objEmit = jVar.emit(o70.x.d.f130113a, c2397a);
                return objEmit == u13.a.COROUTINE_SUSPENDED ? objEmit : Unit.INSTANCE;
            }
        }
        com.garmin.android.apps.connectmobile.i2.a aVar2 = com.garmin.android.apps.connectmobile.i2.f36769a;
        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.GENERAL;
        aVar2.getClass();
        com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "GetSyncStateUseCase", "Sync not enabled, deviceUnitId: " + l14);
        Object objEmit2 = jVar.emit(o70.x.b.f130111a, c2397a);
        return objEmit2 == u13.a.COROUTINE_SUSPENDED ? objEmit2 : Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln70/x5$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
