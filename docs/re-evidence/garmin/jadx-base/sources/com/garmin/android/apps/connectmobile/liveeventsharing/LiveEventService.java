package com.garmin.android.apps.connectmobile.liveeventsharing;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.liveeventsharing.ui.LiveEventSharingActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.proto.generated.GDIDeviceStatus;
import com.garmin.proto.generated.GDIDeviceStatusExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.GeneratedMessage;
import e23.p;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import la2.h;
import o13.m;
import o13.t;
import o53.b0;
import o53.e2;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.m0;
import sz0.f;
import t13.g;
import v13.e;
import v13.i;
import z6.o;
import z6.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/liveeventsharing/LiveEventService;", "Landroid/app/Service;", "Lo53/b0;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LiveEventService extends Service implements b0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f38482h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f38484b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f38483a = new Intent("LIVE_EVENT_SHARING_SESSION_EXPIRED");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Timer f38485c = new Timer();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e2 f38486d = ge1.b.h();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f38487e = m.b(new com.google.accompanist.drawablepainter.a(11));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f38488f = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f38489g = new c();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/liveeventsharing/LiveEventService$b", "Lwm2/b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements wm2.b {
        public b() {
        }

        @Override // wm2.b
        public final void onResponseFailed(int i14) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "LiveEventService", "We failed to get the activity status from the device. Timer will be turning off in 1hr.");
        }

        @Override // wm2.b
        public final void onResponseReceived(int i14, GDISmartProto.Smart smart) {
            GDIDeviceStatus.GetCurrentActivityStatusResponse activityStatusResponse;
            smart.getClass();
            GDIDeviceStatus.DeviceStatusService deviceStatusService = (GDIDeviceStatus.DeviceStatusService) smart.getExtension((GeneratedMessage.GeneratedExtension) GDIDeviceStatusExtension.deviceStatusService);
            if ((deviceStatusService == null || (activityStatusResponse = deviceStatusService.getActivityStatusResponse()) == null) ? false : activityStatusResponse.hasActivityStatus()) {
                GDIDeviceStatus.GetCurrentActivityStatusResponse.ActivityStatus activityStatus = deviceStatusService.getActivityStatusResponse().getActivityStatus();
                if (!(activityStatus == GDIDeviceStatus.GetCurrentActivityStatusResponse.ActivityStatus.OFF)) {
                    i2.a aVar = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar.getClass();
                    i2.a.b(a2Var, "LiveEventService", "ActivityStatus: " + activityStatus + ". We will turn off the feature in 1hr.");
                    return;
                }
                i2.a aVar2 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var2, "LiveEventService", "ActivityStatus: " + activityStatus + ". There is no activity currently going so turning off live event sharing.");
                LiveEventService.b(LiveEventService.this);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/liveeventsharing/LiveEventService$c", "Lla2/a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements la2.a {
        public c() {
        }

        @Override // la2.a
        public final void onDeviceConnected(la2.b bVar) {
            Long lValueOf = Long.valueOf(bVar.f111632a.getF172494b());
            LiveEventService liveEventService = LiveEventService.this;
            liveEventService.getClass();
            i2.f36769a.getClass();
            i2.a.b(a2.LIVE_EVENT_SHARING, "LiveEventService", "Device reconnected " + lValueOf);
            ge1.b.T(liveEventService, null, null, new cu0.d(liveEventService, lValueOf, null), 3);
        }

        @Override // la2.a
        public final void onDeviceConnectingFailure(la2.c cVar) {
        }

        @Override // la2.a
        public final void onDeviceDisconnected(h hVar) {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.liveeventsharing.LiveEventService$onStartCommand$1", f = "LiveEventService.kt", l = {153}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f38492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public m0 f38493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public LiveEventService f38494c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Iterator f38495d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f38496e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f38497f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f38498g;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = LiveEventService.this.new d(dVar);
            dVar2.f38498g = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0074  */
        /* JADX WARN: Code duplicated, block: B:24:0x0096 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x009d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:28:0x009f  */
        /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:31:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:33:0x00af  */
        /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:38:0x00c4  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0094 -> B:25:0x0097). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 255
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.liveeventsharing.LiveEventService.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new a(null);
    }

    public static final ju0.e a(LiveEventService liveEventService) {
        return (ju0.e) liveEventService.f38487e.getValue();
    }

    public static final void b(LiveEventService liveEventService) {
        liveEventService.getClass();
        ge1.b.T(liveEventService, null, null, new cu0.e(liveEventService, null), 3);
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final g getF136462d() {
        x53.c cVar = s0.f129406a;
        return x53.b.f189152a.plus(this.f38486d);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "LiveEventService", "Starting the live event sharing service");
        f.a aVar2 = f.f161394a;
        sz0.e eVar = sz0.e.A;
        aVar2.getClass();
        f.a.c(this, eVar);
        Intent intent = new Intent(this, (Class<?>) LiveEventSharingActivity.class);
        intent.setFlags(536870912);
        String string = getString(R.string.live_event_sharing_notification_description);
        string.getClass();
        q qVar = new q(this, eVar.f161386a);
        qVar.N.icon = 2131232010;
        qVar.f202683e = q.e(getString(R.string.live_event_sharing_title));
        qVar.f202684f = q.e(string);
        qVar.i(2, true);
        qVar.i(16, false);
        qVar.B = "service";
        qVar.f202691m = 2;
        qVar.E = 1;
        qVar.D = a7.b.getColor(this, R.color.gcm_text_primary_action);
        o oVar = new o();
        oVar.f202664e = q.e(string);
        qVar.l(oVar);
        qVar.a(2131232010, getString(R.string.common_turn_off), PendingIntent.getActivity(this, 0, intent, 335544320));
        if (Build.VERSION.SDK_INT >= 29) {
            startForeground(25, qVar.c(), 16);
        } else {
            startForeground(25, qVar.c());
        }
        i2.a.b(a2Var, "LiveEventService", "Scheduling timers for live event sharing");
        ge1.b.T(this, null, null, new cu0.c(this, GCMSettingManager.r(fd0.d.LIVE_EVENT_SHARING, null), null), 3);
        if (this.f38484b) {
            return;
        }
        da2.d.b().f58886a.b(this.f38489g);
        this.f38484b = true;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "LiveEventService", "Destroying the Live Event Service");
        if (this.f38484b) {
            da2.d.b().f58886a.i(this.f38489g);
            this.f38484b = false;
        }
        Timer timer = this.f38485c;
        timer.cancel();
        timer.purge();
        stopForeground(true);
        this.f38486d.c(null);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i14, int i15) {
        if (!(intent != null ? intent.getBooleanExtra("LIVE_EVENT_REFRESH_CACHE_SETTINGS", false) : false)) {
            return 1;
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "LiveEventService", "Refreshing the cache for les settings");
        ge1.b.T(this, null, null, new d(null), 3);
        return 1;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/liveeventsharing/LiveEventService$a;", "", "<init>", "()V", "", "LIVE_EVENT_SHARING_SESSION_EXPIRED", "Ljava/lang/String;", "LIVE_EVENT_REFRESH_CACHE_SETTINGS", "TAG", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
