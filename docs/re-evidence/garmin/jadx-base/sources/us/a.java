package us;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDIEventSharingProto;
import com.garmin.proto.generated.GDILiveSessionExtension;
import com.garmin.proto.generated.GDILiveSessionProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import dt2.g;
import dt2.h;
import dt2.k;
import e23.p;
import java.util.List;
import java.util.Set;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.a1;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\b\tB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lus/a;", "Ldt2/a;", "Ldt2/h;", "Lkk2/a$b;", "Lkk2/a;", "eventSharingHandler", "<init>", "(Lkk2/a;)V", "a", "b", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements dt2.a, h, kk2.a.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f172333h = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kk2.a f172334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u53.d f172335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f172336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public rs2.c f172337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC3220a f172338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set<Integer> f172339g;

    /* JADX INFO: renamed from: us.a$a, reason: collision with other inner class name */
    public interface InterfaceC3220a {
        void a(GDILiveSessionProto.SportProfile sportProfile, GDILiveSessionProto.ActivityStateRequest activityStateRequest, GDILiveSessionProto.ActivityStateRequest.EndReason endReason, List<GDILiveSessionProto.Metric> list);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.activityrecording.data.device.ActivityRecordingProtobufDataHandler$onAlertReceived$1", f = "ActivityRecordingProtobufDataHandler.kt", l = {95}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f172340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ GDILiveSessionProto.LiveSessionEventNotification f172341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f172342c;

        /* JADX INFO: renamed from: us.a$c$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.android.apps.connectmobile.activityrecording.data.device.ActivityRecordingProtobufDataHandler$onAlertReceived$1$1", f = "ActivityRecordingProtobufDataHandler.kt", l = {104}, m = "invokeSuspend", v = 2)
        public static final class C3221a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f172343a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f172344b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ GDILiveSessionProto.LiveSessionEventNotification f172345c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a f172346d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3221a(GDILiveSessionProto.LiveSessionEventNotification liveSessionEventNotification, a aVar, t13.d<? super C3221a> dVar) {
                super(2, dVar);
                this.f172345c = liveSessionEventNotification;
                this.f172346d = aVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C3221a c3221a = new C3221a(this.f172345c, this.f172346d, dVar);
                c3221a.f172344b = obj;
                return c3221a;
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C3221a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:46:0x00ff  */
            /* JADX WARN: Code duplicated, block: B:54:0x0118  */
            /* JADX WARN: Code duplicated, block: B:63:0x0132  */
            /* JADX WARN: Code duplicated, block: B:78:0x015e  */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                InterfaceC3220a interfaceC3220a;
                GDILiveSessionProto.SportProfile sportProfile;
                GDILiveSessionProto.ActivityStateRequest activityStateRequest;
                GDILiveSessionProto.ActivityStateRequest.EndReason endReason;
                GDILiveSessionProto.DataNotification dataNotification;
                GDILiveSessionProto.ActivityStateRequest activityStateRequest2;
                GDILiveSessionProto.ActivityStateRequest activityStateRequest3;
                GDILiveSessionProto.ActivityStateRequest activityStateRequest4;
                GDILiveSessionProto.ActivityStateRequest activityStateRequest5;
                GDILiveSessionProto.ActivityStartRequest activityStartRequest;
                GDILiveSessionProto.ActivityStartRequest activityStartRequest2;
                GDILiveSessionProto.ActivityStartRequest activityStartRequest3;
                b0 b0Var = (b0) this.f172344b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f172343a;
                a aVar2 = this.f172346d;
                List<GDILiveSessionProto.Metric> metricsList = null;
                GDILiveSessionProto.LiveSessionEventNotification liveSessionEventNotification = this.f172345c;
                try {
                    if (i14 == 0) {
                        r.b(obj);
                        a2 a2Var = a2.ACTIVITY_RECORDING;
                        String str = "live event metrics " + (liveSessionEventNotification != null ? liveSessionEventNotification.getDataNotification() : null);
                        i2.f36769a.getClass();
                        i2.a.b(a2Var, "ActivityRecordingProtobufDataHandler", str);
                        i2.a.b(a2Var, "ActivityRecordingProtobufDataHandler", "onAlertReceived: " + ((liveSessionEventNotification == null || (activityStartRequest3 = liveSessionEventNotification.getActivityStartRequest()) == null) ? null : activityStartRequest3.getSportProfile()));
                        if (liveSessionEventNotification != null && liveSessionEventNotification.hasActivityStateRequest()) {
                            GDILiveSessionProto.ActivityStateRequest activityStateRequest6 = liveSessionEventNotification.getActivityStateRequest();
                            GDILiveSessionProto.ActivityStateRequest.State state = activityStateRequest6 != null ? activityStateRequest6.getState() : null;
                            GDILiveSessionProto.ActivityStateRequest activityStateRequest7 = liveSessionEventNotification.getActivityStateRequest();
                            i2.a.b(a2Var, "ActivityRecordingProtobufDataHandler", "live event activity state from device " + state + ", reason " + (activityStateRequest7 != null ? activityStateRequest7.getEndReason() : null));
                            b bVar = a.f172333h;
                            aVar2.getClass();
                            GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDILiveSessionExtension.liveSessionService, GDILiveSessionProto.LiveSessionService.newBuilder().setAppInitiatedActivityCommandResponse(GDILiveSessionProto.AppInitiatedActivityCommandResponse.newBuilder().build()).build()).build();
                            if (smartBuild != null) {
                                i2.a.b(a2Var, "ActivityRecordingProtobufDataHandler", "live event activity response to device:" + smartBuild);
                                g gVar = aVar2.f172336d;
                                if (gVar != null) {
                                    this.f172344b = b0Var;
                                    this.f172343a = 1;
                                    if (gVar.c(smartBuild, this) == aVar) {
                                        return aVar;
                                    }
                                }
                            }
                        }
                        interfaceC3220a = aVar2.f172338f;
                        if (interfaceC3220a != null) {
                            if (liveSessionEventNotification != null || (activityStartRequest = liveSessionEventNotification.getActivityStartRequest()) == null || !activityStartRequest.hasSportProfile() || (activityStartRequest2 = liveSessionEventNotification.getActivityStartRequest()) == null) {
                                sportProfile = null;
                            } else {
                                sportProfile = activityStartRequest2.getSportProfile();
                            }
                            if (liveSessionEventNotification == null && liveSessionEventNotification.hasActivityStateRequest() && (activityStateRequest5 = liveSessionEventNotification.getActivityStateRequest()) != null && activityStateRequest5.hasState()) {
                                activityStateRequest = liveSessionEventNotification.getActivityStateRequest();
                            } else {
                                activityStateRequest = null;
                            }
                            if (liveSessionEventNotification == null && liveSessionEventNotification.hasActivityStateRequest() && (activityStateRequest2 = liveSessionEventNotification.getActivityStateRequest()) != null && activityStateRequest2.hasState() && (activityStateRequest3 = liveSessionEventNotification.getActivityStateRequest()) != null && activityStateRequest3.hasEndReason() && (activityStateRequest4 = liveSessionEventNotification.getActivityStateRequest()) != null) {
                                endReason = activityStateRequest4.getEndReason();
                            } else {
                                endReason = null;
                            }
                            if (liveSessionEventNotification != null && (dataNotification = liveSessionEventNotification.getDataNotification()) != null) {
                                metricsList = dataNotification.getMetricsList();
                            }
                            interfaceC3220a.a(sportProfile, activityStateRequest, endReason, metricsList);
                        }
                        return Unit.INSTANCE;
                    }
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e4) {
                    a2 a2Var2 = a2.ACTIVITY_RECORDING;
                    String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "Failed to send message to the device: ");
                    i2.f36769a.getClass();
                    i2.a.f(a2Var2, "ActivityRecordingProtobufDataHandler", strD);
                    Unit unit2 = Unit.INSTANCE;
                }
                interfaceC3220a = aVar2.f172338f;
                if (interfaceC3220a != null) {
                    if (liveSessionEventNotification != null) {
                        sportProfile = null;
                    } else {
                        sportProfile = null;
                    }
                    if (liveSessionEventNotification == null) {
                        activityStateRequest = null;
                    } else {
                        activityStateRequest = null;
                    }
                    if (liveSessionEventNotification == null) {
                        endReason = null;
                    } else {
                        endReason = null;
                    }
                    if (liveSessionEventNotification != null) {
                        metricsList = dataNotification.getMetricsList();
                    }
                    interfaceC3220a.a(sportProfile, activityStateRequest, endReason, metricsList);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(GDILiveSessionProto.LiveSessionEventNotification liveSessionEventNotification, a aVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f172341b = liveSessionEventNotification;
            this.f172342c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f172341b, this.f172342c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f172340a;
            if (i14 == 0) {
                r.b(obj);
                C3221a c3221a = new C3221a(this.f172341b, this.f172342c, null);
                this.f172340a = 1;
                if (ge1.b.Y(c3221a, this) == aVar) {
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
    @e(c = "com.garmin.android.apps.connectmobile.activityrecording.data.device.ActivityRecordingProtobufDataHandler$sendRequest$1", f = "ActivityRecordingProtobufDataHandler.kt", l = {254}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f172347a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GDISmartProto.Smart f172349c;

        /* JADX INFO: renamed from: us.a$d$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.android.apps.connectmobile.activityrecording.data.device.ActivityRecordingProtobufDataHandler$sendRequest$1$1", f = "ActivityRecordingProtobufDataHandler.kt", l = {256}, m = "invokeSuspend", v = 2)
        public static final class C3222a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f172350a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f172351b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f172352c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ GDISmartProto.Smart f172353d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3222a(a aVar, GDISmartProto.Smart smart, t13.d<? super C3222a> dVar) {
                super(2, dVar);
                this.f172352c = aVar;
                this.f172353d = smart;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C3222a c3222a = new C3222a(this.f172352c, this.f172353d, dVar);
                c3222a.f172351b = obj;
                return c3222a;
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C3222a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                GDISmartProto.Smart smart;
                b0 b0Var = (b0) this.f172351b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f172350a;
                try {
                    if (i14 == 0) {
                        r.b(obj);
                        g gVar = this.f172352c.f172336d;
                        if (gVar != null) {
                            GDISmartProto.Smart smart2 = this.f172353d;
                            this.f172351b = b0Var;
                            this.f172350a = 1;
                            obj = gVar.b(smart2, this);
                            if (obj == aVar) {
                                return aVar;
                            }
                        } else {
                            smart = null;
                        }
                        i2.f36769a.getClass();
                        i2.a.b(a2.ACTIVITY_RECORDING, "ActivityRecordingProtobufDataHandler", "Response " + smart);
                        return Unit.INSTANCE;
                    }
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                    smart = (GDISmartProto.Smart) obj;
                    i2.f36769a.getClass();
                    i2.a.b(a2.ACTIVITY_RECORDING, "ActivityRecordingProtobufDataHandler", "Response " + smart);
                } catch (Exception e4) {
                    a2 a2Var = a2.ACTIVITY_RECORDING;
                    String strN = fb1.c.n("Failed to send message to the device ", e4.getMessage());
                    i2.f36769a.getClass();
                    i2.a.f(a2Var, "ActivityRecordingProtobufDataHandler", strN);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(GDISmartProto.Smart smart, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f172349c = smart;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new d(this.f172349c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f172347a;
            if (i14 == 0) {
                r.b(obj);
                C3222a c3222a = new C3222a(a.this, this.f172349c, null);
                this.f172347a = 1;
                if (ge1.b.Y(c3222a, this) == aVar) {
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

    public a(kk2.a aVar) {
        aVar.getClass();
        this.f172334b = aVar;
        x53.c cVar = s0.f129406a;
        this.f172335c = c0.a(x53.b.f189152a.plus(g8.i.c()));
        this.f172339g = a1.b(105);
    }

    public static GDISmartProto.Smart c(a aVar, GDILiveSessionProto.AppInitiatedActivityCommandRequest.Command command, GDILiveSessionProto.SportProfile sportProfile, int i14) {
        if ((i14 & 1) != 0) {
            command = null;
        }
        if ((i14 & 2) != 0) {
            sportProfile = null;
        }
        aVar.getClass();
        GDILiveSessionProto.LiveSessionService.Builder builderNewBuilder = GDILiveSessionProto.LiveSessionService.newBuilder();
        GDILiveSessionProto.AppInitiatedActivityCommandRequest.Builder builderNewBuilder2 = GDILiveSessionProto.AppInitiatedActivityCommandRequest.newBuilder();
        if (command != null) {
            builderNewBuilder2.setCommand(command);
        }
        if (sportProfile != null) {
            builderNewBuilder2.setSportProfile(sportProfile);
        }
        GDILiveSessionProto.AppInitiatedActivityCommandRequest appInitiatedActivityCommandRequestBuild = builderNewBuilder2.build();
        appInitiatedActivityCommandRequestBuild.getClass();
        return GDISmartProto.Smart.newBuilder().setExtension(GDILiveSessionExtension.liveSessionService, builderNewBuilder.setAppInitiatedActivityCommandRequest(appInitiatedActivityCommandRequestBuild).build()).build();
    }

    @Override // dt2.a
    public final void close(String str) {
        str.getClass();
        a2 a2Var = a2.ACTIVITY_RECORDING;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "ActivityRecordingProtobufDataHandler", "close");
        c0.d(this.f172335c, "ActivityRecordingProtobufDataHandler closed");
    }

    public final void d(GDISmartProto.Smart smart) {
        ge1.b.T(this.f172335c, null, null, new d(smart, null), 3);
    }

    @Override // dt2.a
    public final Set<Integer> getConfiguration() {
        return this.f172339g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(v13.c cVar) {
        us.b bVar;
        if (cVar instanceof us.b) {
            bVar = (us.b) cVar;
            int i14 = bVar.f172356c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f172356c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new us.b(this, cVar);
            }
        } else {
            bVar = new us.b(this, cVar);
        }
        Object obj = bVar.f172354a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f172356c;
        try {
            if (i15 == 0) {
                r.b(obj);
                kk2.a aVar2 = this.f172334b;
                GDIEventSharingProto.AlertType alertType = GDIEventSharingProto.AlertType.LIVE_SESSION;
                bVar.f172356c = 1;
                if (aVar2.c(alertType, this, bVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            a2 a2Var = a2.ACTIVITY_RECORDING;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "ActivityRecordingProtobufDataHandler", "subscribeEventSharing status success");
        } catch (Exception e4) {
            a2 a2Var2 = a2.ACTIVITY_RECORDING;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "subscribeEventSharing error ");
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "ActivityRecordingProtobufDataHandler", strD);
        }
        return Unit.INSTANCE;
    }

    @Override // kk2.a.b
    public final void onAlertReceived(GDIEventSharingProto.AlertNotification alertNotification) {
        alertNotification.getClass();
        GeneratedMessage.GeneratedExtension<GDIEventSharingProto.AlertNotification, GDILiveSessionProto.LiveSessionEventNotification> generatedExtension = GDILiveSessionProto.LiveSessionEventNotification.liveSessionEvent;
        if (alertNotification.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension) && alertNotification.getAlertTypeList().contains(GDIEventSharingProto.AlertType.LIVE_SESSION) && this.f172338f != null) {
            ge1.b.T(this.f172335c, null, null, new c((GDILiveSessionProto.LiveSessionEventNotification) alertNotification.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension), this, null), 3);
        }
    }

    @Override // dt2.h
    public final boolean onProtobufRequest(GDISmartProto.Smart smart, k kVar) {
        smart.getClass();
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDILiveSessionProto.LiveSessionService> generatedExtension = GDILiveSessionExtension.liveSessionService;
        if (!smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
            return false;
        }
        a2 a2Var = a2.ACTIVITY_RECORDING;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "ActivityRecordingProtobufDataHandler", "onProtobufRequest GDILiveSessionExtension - " + smart);
        if (!((GDILiveSessionProto.LiveSessionService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension)).hasAppInitiatedActivityCommandResponse()) {
            return false;
        }
        i2.a.b(a2Var, "ActivityRecordingProtobufDataHandler", "onProtobufRequest GDILiveSessionExtension hasAppInitiatedActivityCommandResponse");
        return true;
    }

    @Override // dt2.a
    public final void start(rs2.c cVar, g gVar, ExtensionRegistryLite extensionRegistryLite) {
        cVar.getClass();
        gVar.getClass();
        this.f172336d = gVar;
        this.f172337e = cVar;
        i2.f36769a.getClass();
        i2.a.b(a2.ACTIVITY_RECORDING, "ActivityRecordingProtobufDataHandler", "start " + cVar);
        extensionRegistryLite.add(GDILiveSessionExtension.liveSessionService);
        extensionRegistryLite.add(GDILiveSessionProto.LiveSessionEventNotification.liveSessionEvent);
        ((dt2.d) gVar).f61154i.add(this);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lus/a$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
