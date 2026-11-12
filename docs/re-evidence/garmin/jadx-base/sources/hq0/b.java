package hq0;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.incidentdetection.service.WellnessIncidentDetectionService;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.proto.generated.GDICore;
import com.garmin.proto.generated.GDILiveTrackExtension;
import com.garmin.proto.generated.GDILiveTrackProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import dt2.g;
import dt2.h;
import dt2.k;
import e23.p;
import java.util.Iterator;
import java.util.Set;
import kq0.j;
import o13.r;
import o53.a0;
import o53.b0;
import o53.c0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.u;
import us2.f;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lhq0/b;", "Ldt2/c;", "Ldt2/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements dt2.c, h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f85200i = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f85201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Logger f85202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u53.d f85203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public rs2.c f85204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f85205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f85206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set<Integer> f85207h;

    /* JADX INFO: renamed from: hq0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.incidentdetection.data.gdi.WellnessIncidentDetectionDataHandler$onProtobufRequest$1", f = "WellnessIncidentDetectionDataHandler.kt", l = {98}, m = "invokeSuspend", v = 2)
    public static final class C1689b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f85208a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GDILiveTrackProto.StartRequest f85210c;

        /* JADX INFO: renamed from: hq0.b$b$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.android.apps.connectmobile.incidentdetection.data.gdi.WellnessIncidentDetectionDataHandler$onProtobufRequest$1$1", f = "WellnessIncidentDetectionDataHandler.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f85211a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GDILiveTrackProto.StartRequest f85212b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, GDILiveTrackProto.StartRequest startRequest, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f85211a = bVar;
                this.f85212b = startRequest;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f85211a, this.f85212b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                b bVar = this.f85211a;
                j jVar = new j(bVar.f85201b, null, 2, null);
                jVar.f106176c = bVar.f85205f;
                GDILiveTrackProto.StartRequest startRequest = this.f85212b;
                startRequest.getClass();
                jVar.f106178e = startRequest;
                jVar.f106180g = "action.received.livetrack.from.device";
                a7.b.startForegroundService(bVar.f85201b, jVar.a());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1689b(GDILiveTrackProto.StartRequest startRequest, t13.d<? super C1689b> dVar) {
            super(2, dVar);
            this.f85210c = startRequest;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new C1689b(this.f85210c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C1689b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f85208a;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = new a(b.this, this.f85210c, null);
                this.f85208a = 1;
                if (ge1.b.Y(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.incidentdetection.data.gdi.WellnessIncidentDetectionDataHandler$onProtobufRequest$2", f = "WellnessIncidentDetectionDataHandler.kt", l = {123}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f85213a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GDILiveTrackProto.StopNotification f85215c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.android.apps.connectmobile.incidentdetection.data.gdi.WellnessIncidentDetectionDataHandler$onProtobufRequest$2$1", f = "WellnessIncidentDetectionDataHandler.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f85216a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GDILiveTrackProto.StopNotification f85217b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, GDILiveTrackProto.StopNotification stopNotification, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f85216a = bVar;
                this.f85217b = stopNotification;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f85216a, this.f85217b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                b bVar = this.f85216a;
                j jVar = new j(bVar.f85201b, null, 2, null);
                jVar.f106176c = bVar.f85205f;
                GDILiveTrackProto.StopNotification stopNotification = this.f85217b;
                stopNotification.getClass();
                jVar.f106179f = stopNotification;
                jVar.f106180g = "action.finish.incident.from.device";
                a7.b.startForegroundService(bVar.f85201b, jVar.a());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(GDILiveTrackProto.StopNotification stopNotification, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f85215c = stopNotification;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new c(this.f85215c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f85213a;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = new a(b.this, this.f85215c, null);
                this.f85213a = 1;
                if (ge1.b.Y(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.incidentdetection.data.gdi.WellnessIncidentDetectionDataHandler$onProtobufRequest$3", f = "WellnessIncidentDetectionDataHandler.kt", l = {146}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f85218a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GDISmartProto.Smart f85220c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.android.apps.connectmobile.incidentdetection.data.gdi.WellnessIncidentDetectionDataHandler$onProtobufRequest$3$1", f = "WellnessIncidentDetectionDataHandler.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f85221a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GDISmartProto.Smart f85222b;

            /* JADX INFO: renamed from: hq0.b$d$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C1690a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f85223a;

                static {
                    int[] iArr = new int[GDILiveTrackProto.EmergencyCountdownNotification.State.values().length];
                    try {
                        iArr[GDILiveTrackProto.EmergencyCountdownNotification.State.PAUSED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[GDILiveTrackProto.EmergencyCountdownNotification.State.IN_PROGRESS.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[GDILiveTrackProto.EmergencyCountdownNotification.State.EXPIRED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[GDILiveTrackProto.EmergencyCountdownNotification.State.CANCELED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f85223a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, GDISmartProto.Smart smart, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f85221a = bVar;
                this.f85222b = smart;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f85221a, this.f85222b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                int i14 = b.f85200i;
                b bVar = this.f85221a;
                bVar.getClass();
                Context context = bVar.f85201b;
                GDILiveTrackProto.EmergencyCountdownNotification emergencyCountdownNotification = b.c(this.f85222b).getEmergencyCountdownNotification();
                GDILiveTrackProto.EmergencyCountdownNotification.State state = emergencyCountdownNotification.getState();
                int i15 = state == null ? -1 : C1690a.f85223a[state.ordinal()];
                Intent intentA = null;
                if (i15 == 1) {
                    j jVar = new j(context, null, 2, null);
                    jVar.f106176c = bVar.f85205f;
                    jVar.f106177d = emergencyCountdownNotification;
                    jVar.f106180g = "action.pause.detected";
                    intentA = jVar.a();
                } else if (i15 == 2) {
                    String str = emergencyCountdownNotification.getSessionType() == GDILiveTrackProto.SessionType.FALL_DETECTION ? "action.fall.detected" : "action.incident.detected";
                    Logger logger = bVar.f85202c;
                    if (logger == null) {
                        s.m("logger");
                        throw null;
                    }
                    logger.debug("emergencyCountdownNotification IN_PROGRESS: dispatching action [" + str + "]");
                    j jVar2 = new j(context, null, 2, null);
                    jVar2.f106176c = bVar.f85205f;
                    jVar2.f106177d = emergencyCountdownNotification;
                    jVar2.f106180g = str;
                    intentA = jVar2.a();
                } else if (i15 == 3) {
                    j jVar3 = new j(context, null, 2, null);
                    jVar3.f106176c = bVar.f85205f;
                    jVar3.f106177d = emergencyCountdownNotification;
                    jVar3.f106180g = "action.expired.incident.from.device";
                    intentA = jVar3.a();
                } else if (i15 != 4) {
                    Logger logger2 = bVar.f85202c;
                    if (logger2 == null) {
                        s.m("logger");
                        throw null;
                    }
                    logger2.debug("Emergency countdown no state");
                } else {
                    j jVar4 = new j(context, null, 2, null);
                    jVar4.f106176c = bVar.f85205f;
                    jVar4.f106180g = "action.cancel.incident.from.device";
                    intentA = jVar4.a();
                }
                if (intentA != null) {
                    a7.b.startForegroundService(context, intentA);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(GDISmartProto.Smart smart, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f85220c = smart;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new d(this.f85220c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f85218a;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = new a(b.this, this.f85220c, null);
                this.f85218a = 1;
                if (ge1.b.Y(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public b(Context context) {
        context.getClass();
        this.f85201b = context;
        this.f85205f = -1L;
        this.f85207h = u.m0(new Integer[]{Integer.valueOf(SupportedCapability.DEVICE_DRIVEN_LIVETRACK_SUPPORT.ordinal()), Integer.valueOf(SupportedCapability.INCIDENT_DETECT_AND_ASSISTANCE.ordinal()), Integer.valueOf(SupportedCapability.LIVETRACK_MESSAGING.ordinal()), Integer.valueOf(SupportedCapability.LIVETRACK.ordinal())});
    }

    public static GDILiveTrackProto.LiveTrackService c(GDISmartProto.Smart smart) {
        Object extension = smart.getExtension((GeneratedMessage.GeneratedExtension<MessageT, Object>) GDILiveTrackExtension.liveTrackService);
        extension.getClass();
        return (GDILiveTrackProto.LiveTrackService) extension;
    }

    public static boolean d(Context context) {
        Object systemService = context.getSystemService("activity");
        systemService.getClass();
        Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) systemService).getRunningServices(Integer.MAX_VALUE).iterator();
        while (it.hasNext()) {
            if (WellnessIncidentDetectionService.class.getName().equals(it.next().service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    @Override // dt2.a
    public final void close(String str) {
        str.getClass();
        u53.d dVar = this.f85203d;
        if (dVar != null) {
            c0.d(dVar, "WellnessIncidentDetectionDataHandler closed");
        } else {
            s.m("coroutineScope");
            throw null;
        }
    }

    @Override // dt2.c
    public final void configure(rs2.c cVar, ExtensionRegistryLite extensionRegistryLite, GDICore.FeatureCapabilitiesRequest.Builder builder) {
        cVar.getClass();
        extensionRegistryLite.getClass();
        GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesRequest, GDILiveTrackProto.CapabilitiesRequest> generatedExtension = GDILiveTrackProto.CapabilitiesRequest.featuresRequest;
        extensionRegistryLite.add(generatedExtension);
        extensionRegistryLite.add(GDILiveTrackProto.CapabilitiesResponse.featuresResponse);
        GDILiveTrackProto.CapabilitiesRequest.Builder builderNewBuilder = GDILiveTrackProto.CapabilitiesRequest.newBuilder();
        builderNewBuilder.setServiceVersion(1);
        builder.setExtension(generatedExtension, builderNewBuilder.build());
    }

    @Override // dt2.c
    public final void connectionReady(GDICore.ConnectionReadyNotification connectionReadyNotification) {
    }

    @Override // dt2.a
    public final Set<Integer> getConfiguration() {
        return this.f85207h;
    }

    @Override // dt2.h
    public final boolean onProtobufRequest(GDISmartProto.Smart smart, k kVar) {
        smart.getClass();
        if (smart.hasExtension((GeneratedMessage.GeneratedExtension) GDILiveTrackExtension.liveTrackService)) {
            Logger logger = this.f85202c;
            if (logger == null) {
                s.m("logger");
                throw null;
            }
            logger.debug("Message - " + smart);
            boolean zHasStartRequest = c(smart).hasStartRequest();
            Context context = this.f85201b;
            if (zHasStartRequest) {
                Logger logger2 = this.f85202c;
                if (logger2 == null) {
                    s.m("logger");
                    throw null;
                }
                logger2.debug("Message Start");
                if (d(context)) {
                    GDILiveTrackProto.StartRequest startRequest = c(smart).getStartRequest();
                    GDILiveTrackProto.SessionGroup session = startRequest.getSession();
                    Logger logger3 = this.f85202c;
                    if (logger3 == null) {
                        s.m("logger");
                        throw null;
                    }
                    logger3.debug("startRequest received - sessionType [" + session.getSessionType() + "]");
                    if (session.getSessionType() == GDILiveTrackProto.SessionType.INCIDENT_DETECT || session.getSessionType() == GDILiveTrackProto.SessionType.FALL_DETECTION) {
                        u53.d dVar = this.f85203d;
                        if (dVar != null) {
                            ge1.b.T(dVar, null, null, new C1689b(startRequest, null), 3);
                            return true;
                        }
                        s.m("coroutineScope");
                        throw null;
                    }
                }
            } else {
                if (!c(smart).hasStopNotification()) {
                    boolean zHasEmergencyCountdownNotification = c(smart).hasEmergencyCountdownNotification();
                    Logger logger4 = this.f85202c;
                    if (!zHasEmergencyCountdownNotification) {
                        if (logger4 != null) {
                            logger4.debug("Message does NOT have emergency countdown, and is not startRequest or stopNotification - unhandled message");
                            return false;
                        }
                        s.m("logger");
                        throw null;
                    }
                    if (logger4 == null) {
                        s.m("logger");
                        throw null;
                    }
                    logger4.debug("emergencyCountdownNotification received - state [" + c(smart).getEmergencyCountdownNotification().getState() + "]");
                    u53.d dVar2 = this.f85203d;
                    if (dVar2 != null) {
                        ge1.b.T(dVar2, null, null, new d(smart, null), 3);
                        return true;
                    }
                    s.m("coroutineScope");
                    throw null;
                }
                GDILiveTrackProto.StopNotification stopNotification = c(smart).getStopNotification();
                stopNotification.getClass();
                if (d(context)) {
                    u53.d dVar3 = this.f85203d;
                    if (dVar3 != null) {
                        ge1.b.T(dVar3, null, null, new c(stopNotification, null), 3);
                        return true;
                    }
                    s.m("coroutineScope");
                    throw null;
                }
            }
        }
        return false;
    }

    @Override // dt2.c
    public final void receiveCapabilities(GDICore.FeatureCapabilitiesResponse featureCapabilitiesResponse) {
    }

    @Override // dt2.a
    public final void start(rs2.c cVar, g gVar, ExtensionRegistryLite extensionRegistryLite) {
        cVar.getClass();
        gVar.getClass();
        this.f85203d = c0.a(new a0("WellnessIncidentDetectionDataHandler"));
        Logger logger = LoggerFactory.getLogger("WellnessIncidentDetectionDataHandler");
        logger.getClass();
        this.f85202c = logger;
        extensionRegistryLite.add(GDILiveTrackExtension.liveTrackService);
        ((dt2.d) gVar).f61154i.add(this);
        this.f85204e = cVar;
        this.f85205f = ((f) cVar).f172494b;
        this.f85206g = gVar;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lhq0/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "LT_CAPABILITIES_SERVICE_VERSION", "I", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
