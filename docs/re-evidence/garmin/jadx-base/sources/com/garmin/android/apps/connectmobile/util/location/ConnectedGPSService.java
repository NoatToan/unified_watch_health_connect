package com.garmin.android.apps.connectmobile.util.location;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Build;
import android.os.IBinder;
import c22.c1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.CoreProtobufRequestManager;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDICore;
import e23.p;
import h62.j;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import la2.h;
import o13.m;
import o13.r;
import o13.t;
import o53.b0;
import o53.m1;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import sz0.f;
import tn.k;
import v13.i;
import wr.g;
import z6.q;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/location/ConnectedGPSService;", "Landroid/app/Service;", "Lo53/b0;", "Lqw0/b$b;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ConnectedGPSService extends Service implements b0, qw0.b.InterfaceC2796b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f47257i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f47258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1 f47259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bu0.a f47260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f47261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public qw0.b f47262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f47263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f47264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArraySet f47265h;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/util/location/ConnectedGPSService$b", "Lla2/a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements la2.a {
        public b() {
        }

        @Override // la2.a
        public final void onDeviceConnected(la2.b bVar) {
        }

        @Override // la2.a
        public final void onDeviceConnectingFailure(la2.c cVar) {
        }

        @Override // la2.a
        public final void onDeviceDisconnected(h hVar) {
            long f92746j = hVar.f111673a.getF92746j();
            ConnectedGPSService connectedGPSService = ConnectedGPSService.this;
            g.w("connectionCallback called with unit id = ", f92746j, connectedGPSService.f47258a);
            if (connectedGPSService.f47265h.contains(Long.valueOf(f92746j))) {
                g.w("connectionCallback calling DeviceLocationSubscriptionManager.unsubscribe for device with unit id = ", f92746j, connectedGPSService.f47258a);
                com.garmin.android.apps.connectmobile.util.location.a.f47272a.getClass();
                com.garmin.android.apps.connectmobile.util.location.a.b(null, f92746j);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.util.location.ConnectedGPSService$onLocationChanged$1$1", f = "ConnectedGPSService.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i22.d f47268b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i22.d dVar, t13.d<? super c> dVar2) {
            super(2, dVar2);
            this.f47268b = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return ConnectedGPSService.this.new c(this.f47268b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            ConnectedGPSService connectedGPSService = ConnectedGPSService.this;
            Iterator it = connectedGPSService.f47265h.iterator();
            while (it.hasNext()) {
                long jLongValue = ((Number) it.next()).longValue();
                Logger logger = connectedGPSService.f47258a;
                StringBuilder sb3 = new StringBuilder("Sending location ");
                i22.d dVar = this.f47268b;
                sb3.append(dVar);
                sb3.append(" to device ");
                sb3.append(jLongValue);
                logger.debug(sb3.toString());
                CoreProtobufRequestManager.sendLocationUpdatedNotification(jLongValue, dVar);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public ConnectedGPSService() {
        int i14 = gt2.c.f79010a;
        this.f47258a = gt2.b.f79005a.h("ConnectedGPSService");
        this.f47259b = g8.i.c();
        this.f47260c = (bu0.a) KoinJavaComponent.get$default(bu0.a.class, null, null, 6, null);
        this.f47261d = m.b(new j(this, 28));
        this.f47264g = new b();
        this.f47265h = new CopyOnWriteArraySet();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0088  */
    /* JADX WARN: Code duplicated, block: B:23:0x0092  */
    /* JADX WARN: Code duplicated, block: B:25:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x009a  */
    /* JADX WARN: Code duplicated, block: B:27:0x009f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0088 -> B:21:0x008e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(com.garmin.android.apps.connectmobile.util.location.ConnectedGPSService r11, java.util.Set r12, rd2.f r13, v13.c r14) {
        /*
            r11.getClass()
            boolean r0 = r14 instanceof i22.a
            if (r0 == 0) goto L16
            r0 = r14
            i22.a r0 = (i22.a) r0
            int r1 = r0.f87384i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f87384i = r1
            goto L1b
        L16:
            i22.a r0 = new i22.a
            r0.<init>(r11, r14)
        L1b:
            java.lang.Object r11 = r0.f87382g
            u13.a r14 = u13.a.COROUTINE_SUSPENDED
            int r1 = r0.f87384i
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L44
            if (r1 != r2) goto L3e
            int r12 = r0.f87381f
            int r13 = r0.f87380e
            int r1 = r0.f87379d
            java.util.Iterator r4 = r0.f87378c
            java.util.Collection r5 = r0.f87377b
            java.util.Collection r5 = (java.util.Collection) r5
            rd2.f r6 = r0.f87376a
            o13.r.b(r11)
            r10 = r4
            r4 = r13
            r13 = r6
            r6 = r5
            r5 = r10
            goto L8e
        L3e:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r11)
            return r3
        L44:
            o13.r.b(r11)
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r12 = r12.iterator()
            r1 = 0
            r5 = r11
            r4 = r12
            r11 = r1
            r12 = r11
        L57:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto Laa
            java.lang.Object r6 = r4.next()
            java.lang.Number r6 = (java.lang.Number) r6
            long r6 = r6.longValue()
            x53.c r8 = o53.s0.f129406a
            x53.b r8 = x53.b.f189152a
            i22.b r9 = new i22.b
            r9.<init>(r13, r6, r3)
            r0.f87376a = r13
            r6 = r5
            java.util.Collection r6 = (java.util.Collection) r6
            r0.f87377b = r6
            r0.f87378c = r4
            r0.f87379d = r11
            r0.f87380e = r1
            r0.f87381f = r12
            r0.f87384i = r2
            java.lang.Object r6 = ge1.b.e0(r8, r9, r0)
            if (r6 != r14) goto L88
            return r14
        L88:
            r10 = r1
            r1 = r11
            r11 = r6
            r6 = r5
            r5 = r4
            r4 = r10
        L8e:
            sd2.f r11 = (sd2.f) r11
            if (r11 == 0) goto L98
            java.lang.String r7 = r11.getDisplayName()
            if (r7 != 0) goto La0
        L98:
            if (r11 == 0) goto L9f
            java.lang.String r7 = r11.getProductDisplayName()
            goto La0
        L9f:
            r7 = r3
        La0:
            if (r7 == 0) goto La5
            r6.add(r7)
        La5:
            r11 = r1
            r1 = r4
            r4 = r5
            r5 = r6
            goto L57
        Laa:
            java.util.List r5 = (java.util.List) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.util.location.ConnectedGPSService.a(com.garmin.android.apps.connectmobile.util.location.ConnectedGPSService, java.util.Set, rd2.f, v13.c):java.lang.Object");
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF136462d() {
        x53.c cVar = s0.f129406a;
        return x53.b.f189152a.plus(this.f47259b);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f47258a.debug("Service created");
        f.a aVar = f.f161394a;
        sz0.e eVar = sz0.e.S0;
        aVar.getClass();
        f.a.c(this, eVar);
        int i14 = Build.VERSION.SDK_INT;
        t tVar = this.f47261d;
        if (i14 >= 29) {
            startForeground(27, ((q) tVar.getValue()).c(), 16);
        } else {
            startForeground(27, ((q) tVar.getValue()).c());
        }
        if (!this.f47263f) {
            da2.d.b().f58886a.b(this.f47264g);
            this.f47263f = true;
        }
        qw0.b.a aVar2 = qw0.b.f148296j;
        qw0.g.b bVar = qw0.g.b.f148315c;
        qw0.f fVar = new qw0.f(1000L, bVar);
        aVar2.getClass();
        qw0.b bVar2 = new qw0.b(this, "ConnectedGPSService", null);
        Context context = bVar2.f148297a;
        if (c1.a(context) || c1.b(context)) {
            long j8 = fVar.f148311a;
            qw0.g gVar = fVar.f148312b;
            bVar2.f148304h = qw0.b.e(gVar, j8, 0.0f);
            if (s.g(bVar2.f148299c, Boolean.TRUE)) {
                bVar2.f148302f = new qw0.c(bVar2, this);
                bVar2.c();
            } else if (bVar2.f148305i != null) {
                bVar2.f148303g = new qw0.d(bVar2, this);
                bVar2.d(gVar.equals(bVar) ? "gps" : "network");
            }
        } else {
            a2 a2Var = a2.LOCATION;
            String strG = k.g(bVar2.f148298b, " connect: LocationService is disabled.");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "GCMBackgroundLocationClient", strG);
        }
        this.f47262e = bVar2;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f47258a.debug("Service destroyed, stopping location updates and cleaning up.");
        if (this.f47263f) {
            da2.d.b().f58886a.i(this.f47264g);
            this.f47263f = false;
        }
        qw0.b bVar = this.f47262e;
        if (bVar != null) {
            bVar.b();
        }
        this.f47259b.c(null);
        stopForeground(true);
        super.onDestroy();
    }

    @Override // qw0.b.InterfaceC2796b
    public final void onLocationChanged(Location location) {
        if (location != null) {
            ge1.b.T(this, null, null, new c(new i22.d(location, GDICore.LocationData.DataType.REALTIME_TRACKING), null), 3);
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i14, int i15) {
        long longExtra = intent != null ? intent.getLongExtra("DEVICE_ID_KEY", -1L) : -1L;
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("START_STOP_KEY", false) : false;
        Logger logger = this.f47258a;
        logger.debug("Start command received with deviceId=" + longExtra + ", start=" + booleanExtra);
        if (longExtra == -1) {
            return 1;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.f47265h;
        if (booleanExtra) {
            copyOnWriteArraySet.add(Long.valueOf(longExtra));
        } else {
            copyOnWriteArraySet.remove(Long.valueOf(longExtra));
        }
        logger.debug("Device list updated.   Now contains " + copyOnWriteArraySet.size() + " entries");
        if (!copyOnWriteArraySet.isEmpty()) {
            ge1.b.T(this, null, null, new i22.c(this, copyOnWriteArraySet, null), 3);
            return 1;
        }
        logger.debug("No more connected GPS devices. Stopping self.");
        stopSelf();
        return 1;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/location/ConnectedGPSService$a;", "", "<init>", "()V", "", "DEVICE_ID_KEY", "Ljava/lang/String;", "START_STOP_KEY", "TAG", "", "LOCATION_UPDATE_INTERVAL_MILLIS", "J", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
