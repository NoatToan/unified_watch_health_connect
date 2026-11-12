package com.garmin.android.apps.connectmobile.incidentdetection.service;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.lifecycle.d0;
import androidx.lifecycle.i0;
import androidx.lifecycle.q0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDILiveTrackProto;
import com.google.protobuf.ProtocolStringList;
import cq0.f;
import cq0.l;
import e23.p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kq0.g;
import kq0.h;
import o13.r;
import o53.b0;
import o53.f0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p13.h0;
import p13.j0;
import p13.x;
import p13.y;
import r53.j;
import r53.p2;
import t13.d;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/service/WellnessIncidentDetectionService;", "Landroidx/lifecycle/q0;", "<init>", "()V", "b", "a", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WellnessIncidentDetectionService extends q0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f36866g = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Looper f36867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f36868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f36869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f36870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Messenger f36871f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/service/WellnessIncidentDetectionService$b;", "Landroid/os/Handler;", "<init>", "(Lcom/garmin/android/apps/connectmobile/incidentdetection/service/WellnessIncidentDetectionService;)V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends Handler {

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f36873a;

            static {
                int[] iArr = new int[l.values().length];
                try {
                    iArr[l.TICKING_TIMER_INCIDENT_DETECTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[l.TICKING_TIMER_I_AM_OKAY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[l.USER_CAN_CANCEL_LIVE_TRACK.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[l.CANCELLING_TICKING_TIMER_INCIDENT_DETECTED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[l.NOTIFYING_EMERGENCY_CONTACTS_INCIDENT_DETECTED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[l.NOTIFYING_EMERGENCY_CONTACTS_I_AM_OKAY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[l.FINISHED.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f36873a = iArr;
            }
        }

        public b() {
        }

        public final void a() {
            String strN;
            WellnessIncidentDetectionService wellnessIncidentDetectionService = WellnessIncidentDetectionService.this;
            h hVar = wellnessIncidentDetectionService.f36869d;
            ArrayList arrayList = wellnessIncidentDetectionService.f36870e;
            g gVar = (g) hVar.f106172d.getValue();
            l lVar = gVar.f106157a;
            Message messageObtain = Message.obtain(null, 3, lVar.ordinal(), 0);
            Bundle bundle = new Bundle();
            boolean z14 = gVar.f106160d;
            bundle.putBoolean("extra.is.fall.detection", z14);
            messageObtain.setData(bundle);
            String strName = l.values()[messageObtain.arg1].name();
            switch (a.f36873a[lVar.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    messageObtain.arg2 = gVar.f106164h;
                    strN = "seconds remaining";
                    break;
                case 5:
                case 6:
                    messageObtain.arg2 = 0;
                    strN = "GCS retry attempt nbr";
                    break;
                case 7:
                    f fVar = ((g) wellnessIncidentDetectionService.f36869d.f106172d.getValue()).f106166j;
                    if (fVar == null) {
                        fVar = f.NONE;
                    }
                    messageObtain.arg2 = fVar.ordinal();
                    strN = fb1.c.n("finished how ", f.values()[messageObtain.arg2].name());
                    break;
                default:
                    strN = "";
                    break;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putLong("extra.device.id", gVar.f106159c);
            bundle2.putBoolean("extra.is.fall.detection", z14);
            messageObtain.setData(bundle2);
            int size = arrayList.size() - 1;
            if (size < 0) {
                return;
            }
            while (true) {
                int i14 = size - 1;
                try {
                    ((Messenger) arrayList.get(size)).send(Message.obtain(messageObtain));
                    String str = "Client [" + size + "] updated. State [" + strName + "], arg2 val [" + messageObtain.arg2 + "], arg2 concept [" + strN + "]";
                    a2 a2Var = kq0.a.f106152a;
                    i2.a aVar = i2.f36769a;
                    a2 a2Var2 = kq0.a.f106152a;
                    aVar.getClass();
                    i2.a.n(a2Var2, "WellnessIncidentDetectionService", str);
                } catch (RemoteException unused) {
                    arrayList.remove(size);
                }
                if (i14 < 0) {
                    return;
                } else {
                    size = i14;
                }
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            message.getClass();
            int i14 = message.what;
            WellnessIncidentDetectionService wellnessIncidentDetectionService = WellnessIncidentDetectionService.this;
            if (i14 == 1) {
                ArrayList arrayList = wellnessIncidentDetectionService.f36870e;
                Messenger messenger = message.replyTo;
                messenger.getClass();
                arrayList.add(messenger);
                a();
                return;
            }
            if (i14 == 2) {
                wellnessIncidentDetectionService.f36870e.remove(message.replyTo);
            } else if (i14 != 3) {
                super.handleMessage(message);
            } else {
                a();
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.incidentdetection.service.WellnessIncidentDetectionService$onCreate$1", f = "WellnessIncidentDetectionService.kt", l = {312}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36874a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r0<Boolean> f36876c;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r0<Boolean> f36877a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WellnessIncidentDetectionService f36878b;

            public a(r0<Boolean> r0Var, WellnessIncidentDetectionService wellnessIncidentDetectionService) {
                this.f36877a = r0Var;
                this.f36878b = wellnessIncidentDetectionService;
            }

            @Override // r53.j
            public final Object emit(Object obj, d dVar) {
                g gVar = (g) obj;
                kq0.a.a("WellnessIncidentDetectionService", "collectState: " + gVar);
                l lVar = gVar.f106157a;
                boolean z14 = gVar.f106160d;
                l lVar2 = l.TICKING_TIMER_INCIDENT_DETECTED;
                WellnessIncidentDetectionService wellnessIncidentDetectionService = this.f36878b;
                if (lVar == lVar2) {
                    Boolean boolValueOf = Boolean.valueOf(z14);
                    r0<Boolean> r0Var = this.f36877a;
                    if (!boolValueOf.equals(r0Var.f105810a)) {
                        r0Var.f105810a = (T) Boolean.valueOf(z14);
                        new kq0.d(wellnessIncidentDetectionService).a(z14);
                    }
                }
                int i14 = WellnessIncidentDetectionService.f36866g;
                wellnessIncidentDetectionService.getClass();
                try {
                    wellnessIncidentDetectionService.f36871f.send(Message.obtain((Handler) null, 3));
                } catch (RemoteException e4) {
                    kq0.a.b("WellnessIncidentDetectionService", "error sending [MSG_CURRENT_STATE] to bound clients, state [" + ((g) wellnessIncidentDetectionService.f36869d.f106172d.getValue()).f106157a.name() + "]", e4);
                }
                if (gVar.f106167k || gVar.f106157a == l.FINISHED) {
                    wellnessIncidentDetectionService.stopForeground(true);
                    wellnessIncidentDetectionService.stopSelf();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(r0<Boolean> r0Var, d<? super c> dVar) {
            super(2, dVar);
            this.f36876c = r0Var;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return WellnessIncidentDetectionService.this.new c(this.f36876c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f36874a;
            if (i14 == 0) {
                r.b(obj);
                WellnessIncidentDetectionService wellnessIncidentDetectionService = WellnessIncidentDetectionService.this;
                p2 p2Var = wellnessIncidentDetectionService.f36869d.f106172d;
                a aVar2 = new a(this.f36876c, wellnessIncidentDetectionService);
                this.f36874a = 1;
                if (p2Var.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            o2.c.f();
            return null;
        }
    }

    static {
        new a(null);
    }

    public WellnessIncidentDetectionService() {
        l lVar = l.NONE;
        String userFullName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserFullName();
        this.f36869d = new h(new g(lVar, userFullName.length() == 0 ? null : userFullName, 0L, false, null, null, null, 0, 0, f.NONE, false, null, 3580, null), new com.garmin.android.apps.connectmobile.incidentdetection.service.b(), x.k(new lq0.b(true), new lq0.h(), new lq0.d(), new lq0.a(), new lq0.c(this.f36868c)));
        this.f36870e = new ArrayList();
        this.f36871f = new Messenger(new b());
    }

    public final boolean a() {
        return ((g) this.f36869d.f106172d.getValue()).f106161e != null;
    }

    public final boolean b(long j8) {
        return ((g) this.f36869d.f106172d.getValue()).f106159c == j8;
    }

    @Override // androidx.lifecycle.q0, android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        super.onBind(intent);
        return this.f36871f.getBinder();
    }

    @Override // androidx.lifecycle.q0, android.app.Service
    public final void onCreate() {
        super.onCreate();
        kq0.a.a("WellnessIncidentDetectionService", "onCreate");
        HandlerThread handlerThread = new HandlerThread("WellnessIncidentDetectionService", 10);
        handlerThread.start();
        this.f36867b = handlerThread.getLooper();
        this.f36868c = new Handler(handlerThread.getLooper());
        kq0.d dVar = new kq0.d(this);
        kq0.a.a("NotificationStrategy", "addToAndroidNotificationBar");
        dVar.a(false);
        r0 r0Var = new r0();
        i0 i0VarW = f0.w(this);
        ge1.b.T(i0VarW, null, null, new d0(i0VarW, new c(r0Var, null), null), 3);
    }

    @Override // androidx.lifecycle.q0, android.app.Service
    public final void onDestroy() {
        kq0.a.a("WellnessIncidentDetectionService", "onDestroy");
        Handler handler = this.f36868c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Looper looper = this.f36867b;
        if (looper != null) {
            looper.quit();
        }
        this.f36868c = null;
        stopForeground(1);
        super.onDestroy();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c8, code lost:
    
        if (r6.equals("action.finish.incident.from.device") == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02e6, code lost:
    
        if (r6.equals("action.incident.detected") == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0301, code lost:
    
        if (r2.b() == null) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0303, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0304, code lost:
    
        kq0.a.a("WellnessIncidentDetectionService", "handleIncident detected hasProto " + r7);
        r2 = r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0319, code lost:
    
        if (r2 != null) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x031f, code lost:
    
        return super.onStartCommand(r19, r20, r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0320, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0322, code lost:
    
        if (r5 == null) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0324, code lost:
    
        r3 = r5.getLongExtra("extra.remote.device.id", -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0328, code lost:
    
        r5 = r6.equals("action.fall.detected");
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0330, code lost:
    
        if (a() != false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0332, code lost:
    
        r12.a(new com.garmin.android.apps.connectmobile.incidentdetection.service.a.f(r3, r2, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x033c, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0343, code lost:
    
        if (b(r3) == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0345, code lost:
    
        r12.a(new com.garmin.android.apps.connectmobile.incidentdetection.service.a.n(r3, r2, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x034d, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0352, code lost:
    
        return super.onStartCommand(r19, r20, r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0125, code lost:
    
        if (r6.equals("action.fall.detected") == false) goto L176;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r4v5, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int onStartCommand(Intent intent, int i14, int i15) {
        boolean z14;
        boolean z15;
        GDILiveTrackProto.StopNotification stopNotification;
        GDILiveTrackProto.StopNotification stopNotification2;
        ?? arrayList;
        GDILiveTrackProto.SessionGroup session;
        List<GDILiveTrackProto.Session> sessionsList;
        ProtocolStringList sessionIdsList;
        Object serializableExtra;
        int i16;
        boolean booleanExtra;
        GDILiveTrackProto.StartRequest startRequest;
        Object serializableExtra2;
        if (intent == null) {
            return super.onStartCommand(intent, i14, i15);
        }
        kq0.j jVar = new kq0.j(null, intent, 1, null);
        Intent intent2 = jVar.f106175b;
        String action = intent2 != null ? intent2.getAction() : null;
        if (action == null) {
            return super.onStartCommand(intent, i14, i15);
        }
        kq0.a.a("WellnessIncidentDetectionService", "onStartCommand: action [" + action + "]");
        int iHashCode = action.hashCode();
        h hVar = this.f36869d;
        switch (iHashCode) {
            case -1770631578:
                z14 = false;
                break;
            case -847894335:
                z15 = false;
                stopNotification = null;
                break;
            case -641581601:
                boolean z16 = false;
                if (action.equals("action.expired.incident.from.device")) {
                    kq0.a.a("WellnessIncidentDetectionService", "ActionExpired hasProto " + (jVar.b() != null));
                    GDILiveTrackProto.EmergencyCountdownNotification emergencyCountdownNotificationB = jVar.b();
                    if (emergencyCountdownNotificationB == null) {
                        return super.onStartCommand(intent, i14, i15);
                    }
                    long longExtra = intent2 != null ? intent2.getLongExtra("extra.remote.device.id", -1L) : -1L;
                    if (!a()) {
                        kq0.a.a("WellnessIncidentDetectionService", "ActionExpired handle IncidentDetected");
                        if (emergencyCountdownNotificationB.hasSessionType() && emergencyCountdownNotificationB.getSessionType() == GDILiveTrackProto.SessionType.FALL_DETECTION) {
                            z16 = true;
                        }
                        hVar.a(new com.garmin.android.apps.connectmobile.incidentdetection.service.a.f(longExtra, emergencyCountdownNotificationB, z16));
                    }
                    if (!b(longExtra)) {
                        return super.onStartCommand(intent, i14, i15);
                    }
                    kq0.a.a("WellnessIncidentDetectionService", "handleActionExpired");
                    hVar.a(com.garmin.android.apps.connectmobile.incidentdetection.service.a.p.f36900c);
                    return 1;
                }
                String strM = am.j.m("onStartCommand: fix me developer... I am not handling action [", action, "]");
                i2.a aVar = i2.f36769a;
                a2 a2Var = kq0.a.f106152a;
                aVar.getClass();
                i2.a.f(a2Var, "WellnessIncidentDetectionService", strM);
                return super.onStartCommand(intent, i14, i15);
            case 296869426:
                if (action.equals("action.pause.detected")) {
                    GDILiveTrackProto.EmergencyCountdownNotification emergencyCountdownNotificationB2 = jVar.b();
                    if (emergencyCountdownNotificationB2 == null) {
                        return super.onStartCommand(intent, i14, i15);
                    }
                    hVar.a(new com.garmin.android.apps.connectmobile.incidentdetection.service.a.l(emergencyCountdownNotificationB2.getTimeLeftS()));
                    return super.onStartCommand(intent, i14, i15);
                }
                String strM2 = am.j.m("onStartCommand: fix me developer... I am not handling action [", action, "]");
                i2.a aVar2 = i2.f36769a;
                a2 a2Var2 = kq0.a.f106152a;
                aVar2.getClass();
                i2.a.f(a2Var2, "WellnessIncidentDetectionService", strM2);
                return super.onStartCommand(intent, i14, i15);
            case 706743773:
                z14 = false;
                break;
            case 906988858:
                z15 = false;
                if (action.equals("action.cancel.incident.from.device")) {
                    stopNotification = null;
                    p2 p2Var = hVar.f106172d;
                    p2 p2Var2 = hVar.f106172d;
                    if (((g) p2Var.getValue()).f106167k) {
                        kq0.a.a("WellnessIncidentDetectionService", "WARNING: action [" + action + "]: system already received a cancel earlier, so it's going to ignore this one");
                        return super.onStartCommand(intent, i14, i15);
                    }
                    if (!a()) {
                        stopForeground(true);
                        stopSelf();
                        kq0.a.a("WellnessIncidentDetectionService", "onStartCommand: ignoring... no incident to cancel");
                        return super.onStartCommand(intent, i14, i15);
                    }
                    if (!b(intent2 != null ? intent2.getLongExtra("extra.remote.device.id", -1L) : -1L)) {
                        return super.onStartCommand(intent, i14, i15);
                    }
                    if (!action.equals("action.finish.incident.from.device")) {
                        if (!action.equals("action.cancel.incident.from.device") || ((g) p2Var2.getValue()).f106157a != l.TICKING_TIMER_INCIDENT_DETECTED) {
                            return 1;
                        }
                        hVar.a(com.garmin.android.apps.connectmobile.incidentdetection.service.a.C0659a.f36881c);
                        return 1;
                    }
                    if (intent2 != null) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializableExtra = intent2.getSerializableExtra("extra.end.live.track.proto", GDILiveTrackProto.StopNotification.class);
                        } else {
                            Object serializableExtra3 = intent2.getSerializableExtra("extra.end.live.track.proto");
                            if (!(serializableExtra3 instanceof GDILiveTrackProto.StopNotification)) {
                                serializableExtra3 = stopNotification;
                            }
                            serializableExtra = (GDILiveTrackProto.StopNotification) serializableExtra3;
                        }
                        stopNotification2 = (GDILiveTrackProto.StopNotification) serializableExtra;
                    } else {
                        stopNotification2 = stopNotification;
                    }
                    ?? B1 = (stopNotification2 == null || (sessionIdsList = stopNotification2.getSessionIdsList()) == null) ? stopNotification : h0.b1(sessionIdsList);
                    GDILiveTrackProto.StartRequest startRequest2 = ((g) p2Var2.getValue()).f106168l;
                    if (startRequest2 == null || (session = startRequest2.getSession()) == null || (sessionsList = session.getSessionsList()) == null) {
                        arrayList = j0.f134944a;
                    } else {
                        arrayList = new ArrayList(y.r(sessionsList, 10));
                        Iterator it = sessionsList.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((GDILiveTrackProto.Session) it.next()).getId());
                        }
                    }
                    if (B1 != 0 && !B1.isEmpty()) {
                        Iterator it3 = B1.iterator();
                        while (it3.hasNext()) {
                            if (arrayList.contains((String) it3.next())) {
                                z15 = true;
                            }
                        }
                    }
                    if (z15) {
                        hVar.a(new com.garmin.android.apps.connectmobile.incidentdetection.service.a.e(f.FROM_DEVICE_I_AM_OKAY));
                        return 1;
                    }
                    kq0.a.a("WellnessIncidentDetectionService", "onStartCommand: ignoring... received session id not in existing start live track session");
                    return super.onStartCommand(intent, i14, i15);
                }
                String strM3 = am.j.m("onStartCommand: fix me developer... I am not handling action [", action, "]");
                i2.a aVar3 = i2.f36769a;
                a2 a2Var3 = kq0.a.f106152a;
                aVar3.getClass();
                i2.a.f(a2Var3, "WellnessIncidentDetectionService", strM3);
                return super.onStartCommand(intent, i14, i15);
            case 1780099757:
                if (action.equals("action.cancel.incident.from.gcm")) {
                    if (((g) hVar.f106172d.getValue()).f106167k) {
                        kq0.a.a("WellnessIncidentDetectionService", "WARNING: action [" + action + "]: system already received a cancel earlier, so it's going to ignore this one");
                        return super.onStartCommand(intent, i14, i15);
                    }
                    if (!a()) {
                        stopForeground(true);
                        stopSelf();
                        kq0.a.a("WellnessIncidentDetectionService", "onStartCommand: ignoring... no incident to cancel");
                        return super.onStartCommand(intent, i14, i15);
                    }
                    if (intent2 != null) {
                        i16 = 0;
                        booleanExtra = intent2.getBooleanExtra("extra.incident.from.gcm.i.am.ok", false);
                    } else {
                        i16 = 0;
                        booleanExtra = false;
                    }
                    if (booleanExtra) {
                        hVar.a(new com.garmin.android.apps.connectmobile.incidentdetection.service.a.o(i16, 1, null));
                        return 1;
                    }
                    hVar.a(com.garmin.android.apps.connectmobile.incidentdetection.service.a.b.f36882c);
                    return 1;
                }
                String strM4 = am.j.m("onStartCommand: fix me developer... I am not handling action [", action, "]");
                i2.a aVar4 = i2.f36769a;
                a2 a2Var4 = kq0.a.f106152a;
                aVar4.getClass();
                i2.a.f(a2Var4, "WellnessIncidentDetectionService", strM4);
                return super.onStartCommand(intent, i14, i15);
            case 2075592694:
                if (action.equals("action.received.livetrack.from.device")) {
                    if (!b(intent2 != null ? intent2.getLongExtra("extra.remote.device.id", -1L) : -1L)) {
                        return super.onStartCommand(intent, i14, i15);
                    }
                    if (intent2 != null) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializableExtra2 = intent2.getSerializableExtra("extra.live.track.proto", GDILiveTrackProto.StartRequest.class);
                        } else {
                            Serializable serializableExtra4 = intent2.getSerializableExtra("extra.live.track.proto");
                            serializableExtra2 = (GDILiveTrackProto.StartRequest) (!(serializableExtra4 instanceof GDILiveTrackProto.StartRequest) ? null : serializableExtra4);
                        }
                        startRequest = (GDILiveTrackProto.StartRequest) serializableExtra2;
                    } else {
                        startRequest = null;
                    }
                    if (startRequest == null) {
                        kq0.a.a("WellnessIncidentDetectionService", "Missing livetrack session info");
                        return super.onStartCommand(intent, i14, i15);
                    }
                    kq0.a.a("WellnessIncidentDetectionService", "receivedLiveTrackSessionStart");
                    hVar.a(new com.garmin.android.apps.connectmobile.incidentdetection.service.a.m(startRequest));
                    return 1;
                }
                String strM5 = am.j.m("onStartCommand: fix me developer... I am not handling action [", action, "]");
                i2.a aVar5 = i2.f36769a;
                a2 a2Var5 = kq0.a.f106152a;
                aVar5.getClass();
                i2.a.f(a2Var5, "WellnessIncidentDetectionService", strM5);
                return super.onStartCommand(intent, i14, i15);
            default:
                String strM6 = am.j.m("onStartCommand: fix me developer... I am not handling action [", action, "]");
                i2.a aVar6 = i2.f36769a;
                a2 a2Var6 = kq0.a.f106152a;
                aVar6.getClass();
                i2.a.f(a2Var6, "WellnessIncidentDetectionService", strM6);
                return super.onStartCommand(intent, i14, i15);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/service/WellnessIncidentDetectionService$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_IS_FALL_DETECTION", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
