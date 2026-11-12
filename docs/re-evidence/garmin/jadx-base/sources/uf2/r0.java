package uf2;

import com.garmin.proto.generated.GDICore;
import com.garmin.proto.generated.GDIEventSharingProto;
import com.garmin.proto.generated.GDILiveSessionExtension;
import com.garmin.proto.generated.GDILiveSessionProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.a1;
import r53.b2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u000e\u000fB)\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Luf2/r0;", "Ldt2/c;", "Ldt2/h;", "Lkk2/a$b;", "Lrs2/c;", "deviceInfo", "Lkk2/a;", "eventSharingHandler", "Luf2/r0$b;", "interactorManager", "Lfg2/c;", "deviceProvider", "<init>", "(Lrs2/c;Lkk2/a;Luf2/r0$b;Lfg2/c;)V", "b", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r0 implements dt2.c, dt2.h, kk2.a.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rs2.c f170471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kk2.a f170472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f170473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fg2.c f170474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u53.d f170475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public dt2.g f170476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f170477h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b2 f170478i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set<Integer> f170479j;

    public interface b {
        Object a(String str, c cVar);

        Object b(rs2.c cVar, rf2.g gVar, dt2.g gVar2, GDILiveSessionProto.LiveSessionEventNotification liveSessionEventNotification, t13.d<? super Unit> dVar);

        Object c(rs2.c cVar, dt2.g gVar, e eVar);

        Object d(rs2.c cVar, dt2.g gVar, GDILiveSessionProto.LiveSessionService liveSessionService, t13.d<? super Unit> dVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LiveActivityProtobufDataHandler$close$1", f = "LiveActivityProtobufDataHandler.kt", l = {118}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f170480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f170481b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r0 f170482c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, r0 r0Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f170481b = str;
            this.f170482c = r0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f170481b, this.f170482c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f170480a;
            r0 r0Var = this.f170482c;
            if (i14 == 0) {
                o13.r.b(obj);
                zg2.c cVar = zg2.c.f204692a;
                StringBuilder sb3 = new StringBuilder("Connection ");
                String str = this.f170481b;
                sb3.append(str);
                sb3.append(" closed.");
                String string = sb3.toString();
                cVar.getClass();
                zg2.c.a("LiveActivityProtobufDataHandler", string);
                b bVar = r0Var.f170473d;
                this.f170480a = 1;
                if (bVar.a(str, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            o53.c0.d(r0Var.f170475f, "LiveActivityProtobufDataHandler closed");
            x53.c cVar2 = o53.s0.f129406a;
            r0Var.f170475f = o53.c0.a(x53.b.f189152a.plus(g8.i.c()));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LiveActivityProtobufDataHandler$onAlertReceived$1", f = "LiveActivityProtobufDataHandler.kt", l = {141}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f170483a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GDILiveSessionProto.LiveSessionEventNotification f170485c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LiveActivityProtobufDataHandler$onAlertReceived$1$1", f = "LiveActivityProtobufDataHandler.kt", l = {143}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public dt2.g f170486a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f170487b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ r0 f170488c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ GDILiveSessionProto.LiveSessionEventNotification f170489d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(r0 r0Var, GDILiveSessionProto.LiveSessionEventNotification liveSessionEventNotification, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f170488c = r0Var;
                this.f170489d = liveSessionEventNotification;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f170488c, this.f170489d, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f170487b;
                if (i14 == 0) {
                    o13.r.b(obj);
                    r0 r0Var = this.f170488c;
                    dt2.g gVar = r0Var.f170476g;
                    if (gVar != null) {
                        b bVar = r0Var.f170473d;
                        rs2.c cVar = r0Var.f170471b;
                        rf2.g gVar2 = (rf2.g) r0Var.f170478i.f150540a.getValue();
                        GDILiveSessionProto.LiveSessionEventNotification liveSessionEventNotification = this.f170489d;
                        liveSessionEventNotification.getClass();
                        this.f170486a = gVar;
                        this.f170487b = 1;
                        if (bVar.b(cVar, gVar2, gVar, liveSessionEventNotification, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(GDILiveSessionProto.LiveSessionEventNotification liveSessionEventNotification, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f170485c = liveSessionEventNotification;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return r0.this.new d(this.f170485c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f170483a;
            if (i14 == 0) {
                o13.r.b(obj);
                a aVar2 = new a(r0.this, this.f170485c, null);
                this.f170483a = 1;
                if (ge1.b.Y(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LiveActivityProtobufDataHandler$start$1", f = "LiveActivityProtobufDataHandler.kt", l = {98}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f170490a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ rs2.c f170492c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ dt2.g f170493d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(rs2.c cVar, dt2.g gVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f170492c = cVar;
            this.f170493d = gVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return r0.this.new e(this.f170492c, this.f170493d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f170490a;
            if (i14 == 0) {
                o13.r.b(obj);
                b bVar = r0.this.f170473d;
                this.f170490a = 1;
                if (bVar.c(this.f170492c, this.f170493d, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public r0(rs2.c cVar, kk2.a aVar, b bVar, fg2.c cVar2) {
        cVar.getClass();
        aVar.getClass();
        bVar.getClass();
        cVar2.getClass();
        this.f170471b = cVar;
        this.f170472c = aVar;
        this.f170473d = bVar;
        this.f170474e = cVar2;
        x53.c cVar3 = o53.s0.f129406a;
        this.f170475f = o53.c0.a(x53.b.f189152a.plus(g8.i.c()));
        p2 p2VarA = q2.a(new rf2.g(false, 0, 3, null));
        this.f170477h = p2VarA;
        this.f170478i = r53.s.d(p2VarA);
        this.f170479j = a1.b(105);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Serializable c(v13.c cVar) {
        s0 s0Var;
        List<GDILiveSessionProto.AdaptiveCoachingWorkoutInfo> listList;
        if (cVar instanceof s0) {
            s0Var = (s0) cVar;
            int i14 = s0Var.f170499c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                s0Var.f170499c = i14 - Integer.MIN_VALUE;
            } else {
                s0Var = new s0(this, cVar);
            }
        } else {
            s0Var = new s0(this, cVar);
        }
        Object objB = s0Var.f170497a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = s0Var.f170499c;
        try {
            if (i15 == 0) {
                o13.r.b(objB);
                GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDILiveSessionExtension.liveSessionService, GDILiveSessionProto.LiveSessionService.newBuilder().setAdcWorkoutListRequest(GDILiveSessionProto.AdaptiveCoachingWorkoutListRequest.newBuilder().build()).build()).build();
                dt2.g gVar = this.f170476g;
                if (gVar == null) {
                    zg2.c.f204692a.getClass();
                    zg2.c.b("LiveActivityProtobufDataHandler", "getAdaptiveCoachWorkouts error: messenger is null");
                    return null;
                }
                smartBuild.getClass();
                s0Var.f170499c = 1;
                objB = gVar.b(smartBuild, s0Var);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objB);
            }
            GDILiveSessionProto.LiveSessionService liveSessionService = (GDILiveSessionProto.LiveSessionService) ((GDISmartProto.Smart) objB).getExtension((GeneratedMessage.GeneratedExtension) GDILiveSessionExtension.liveSessionService);
            GDILiveSessionProto.AdaptiveCoachingWorkoutListResponse adcWorkoutListResponse = liveSessionService != null ? liveSessionService.getAdcWorkoutListResponse() : null;
            zg2.c.f204692a.getClass();
            zg2.c.a("LiveActivityProtobufDataHandler", "getAdaptiveCoachWorkouts response: " + adcWorkoutListResponse);
            if (adcWorkoutListResponse == null || (listList = adcWorkoutListResponse.getListList()) == null) {
                return p13.j0.f134944a;
            }
            ArrayList arrayList = new ArrayList();
            for (GDILiveSessionProto.AdaptiveCoachingWorkoutInfo adaptiveCoachingWorkoutInfo : listList) {
                rf2.f fVar = (adaptiveCoachingWorkoutInfo != null && adaptiveCoachingWorkoutInfo.hasAdcWorkoutIdx() && adaptiveCoachingWorkoutInfo.hasAdcLocalTimestamp()) ? new rf2.f(new Integer(adaptiveCoachingWorkoutInfo.getAdcLocalTimestamp()), new Integer(adaptiveCoachingWorkoutInfo.getAdcWorkoutIdx()), adaptiveCoachingWorkoutInfo.getName()) : null;
                if (fVar != null) {
                    arrayList.add(fVar);
                }
            }
            return arrayList;
        } catch (CancellationException e4) {
            zg2.c.f204692a.getClass();
            zg2.c.b("LiveActivityProtobufDataHandler", "getAdaptiveCoachWorkouts cancelled");
            throw e4;
        } catch (Exception e14) {
            zg2.c.f204692a.getClass();
            zg2.c.b("LiveActivityProtobufDataHandler", "getAdaptiveCoachWorkouts error: " + e14);
            return null;
        }
    }

    @Override // dt2.a
    public final void close(String str) {
        str.getClass();
        ge1.b.T(this.f170475f, null, null, new c(str, this, null), 3);
    }

    @Override // dt2.c
    public final void configure(rs2.c cVar, ExtensionRegistryLite extensionRegistryLite, GDICore.FeatureCapabilitiesRequest.Builder builder) {
        cVar.getClass();
        extensionRegistryLite.getClass();
        this.f170471b = cVar;
        extensionRegistryLite.add(GDILiveSessionExtension.liveSessionService);
        extensionRegistryLite.add(GDILiveSessionProto.LiveSessionEventNotification.liveSessionEvent);
        GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesRequest, GDILiveSessionProto.CapabilitiesRequest> generatedExtension = GDILiveSessionProto.CapabilitiesRequest.featuresRequest;
        extensionRegistryLite.add(generatedExtension);
        extensionRegistryLite.add(GDILiveSessionProto.CapabilitiesResponse.featuresResponse);
        builder.setExtension(generatedExtension, GDILiveSessionProto.CapabilitiesRequest.newBuilder().build());
        zg2.c cVar2 = zg2.c.f204692a;
        String strConcat = "configure ".concat(cl2.c.p(cVar));
        cVar2.getClass();
        zg2.c.a("LiveActivityProtobufDataHandler", strConcat);
    }

    @Override // dt2.c
    public final void connectionReady(GDICore.ConnectionReadyNotification connectionReadyNotification) {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Serializable d(zf2.d dVar, v13.c cVar) {
        t0 t0Var;
        List<GDILiveSessionProto.WorkoutInfo> listList;
        rf2.h hVar;
        rf2.j jVar;
        rf2.j jVar2;
        if (cVar instanceof t0) {
            t0Var = (t0) cVar;
            int i14 = t0Var.f170504c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                t0Var.f170504c = i14 - Integer.MIN_VALUE;
            } else {
                t0Var = new t0(this, cVar);
            }
        } else {
            t0Var = new t0(this, cVar);
        }
        Object objB = t0Var.f170502a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = t0Var.f170504c;
        try {
            if (i15 == 0) {
                o13.r.b(objB);
                GDILiveSessionProto.LiveSessionService.Builder builderNewBuilder = GDILiveSessionProto.LiveSessionService.newBuilder();
                GDILiveSessionProto.WorkoutListRequest.Builder builderNewBuilder2 = GDILiveSessionProto.WorkoutListRequest.newBuilder();
                GDILiveSessionProto.SportProfile.Builder builderNewBuilder3 = GDILiveSessionProto.SportProfile.newBuilder();
                builderNewBuilder3.setSportFitType(dVar.f204633e);
                builderNewBuilder3.setSportFitSubType(dVar.f204634f);
                builderNewBuilder2.setSport(builderNewBuilder3.build());
                GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDILiveSessionExtension.liveSessionService, builderNewBuilder.setWorkoutListRequest(builderNewBuilder2.build()).build()).build();
                dt2.g gVar = this.f170476g;
                if (gVar == null) {
                    zg2.c.f204692a.getClass();
                    zg2.c.b("LiveActivityProtobufDataHandler", "getWorkoutsForActivityType error: messenger is null");
                    return null;
                }
                smartBuild.getClass();
                t0Var.f170504c = 1;
                objB = gVar.b(smartBuild, t0Var);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objB);
            }
            GDILiveSessionProto.LiveSessionService liveSessionService = (GDILiveSessionProto.LiveSessionService) ((GDISmartProto.Smart) objB).getExtension((GeneratedMessage.GeneratedExtension) GDILiveSessionExtension.liveSessionService);
            GDILiveSessionProto.WorkoutListResponse workoutListResponse = liveSessionService != null ? liveSessionService.getWorkoutListResponse() : null;
            zg2.c.f204692a.getClass();
            zg2.c.a("LiveActivityProtobufDataHandler", "getWorkoutsForActivityType response: " + workoutListResponse);
            if (workoutListResponse == null || (listList = workoutListResponse.getListList()) == null) {
                return p13.j0.f134944a;
            }
            ArrayList arrayList = new ArrayList();
            for (GDILiveSessionProto.WorkoutInfo workoutInfo : listList) {
                if (workoutInfo == null || !workoutInfo.hasName() || workoutInfo.getName() == null) {
                    hVar = null;
                } else {
                    Integer num = workoutInfo.hasWorkoutId() ? new Integer(workoutInfo.getWorkoutId()) : null;
                    Integer num2 = workoutInfo.hasWorkoutRecIdx() ? new Integer(workoutInfo.getWorkoutRecIdx()) : null;
                    String name = workoutInfo.getName();
                    name.getClass();
                    String nameHandles = workoutInfo.hasNameHandles() ? workoutInfo.getNameHandles() : null;
                    if (workoutInfo.hasType()) {
                        GDILiveSessionProto.WorkoutInfo.Type type = workoutInfo.getType();
                        type.getClass();
                        int i16 = rf2.i.a.f152489a[type.ordinal()];
                        if (i16 == 1) {
                            jVar2 = rf2.j.SCHEDULED;
                        } else if (i16 == 2) {
                            jVar2 = rf2.j.NORMAL;
                        } else {
                            lc.u0.r();
                            jVar2 = null;
                        }
                        jVar = jVar2;
                    } else {
                        jVar = null;
                    }
                    hVar = new rf2.h(num, num2, name, nameHandles, jVar, workoutInfo.hasScheduledTime() ? new Integer(workoutInfo.getScheduledTime()) : null, workoutInfo.hasDescription() ? workoutInfo.getDescription() : null, workoutInfo.hasDescHandles() ? workoutInfo.getDescHandles() : null, workoutInfo.hasDurationS() ? new Integer(workoutInfo.getDurationS()) : null);
                }
                if (hVar != null) {
                    arrayList.add(hVar);
                }
            }
            return arrayList;
        } catch (CancellationException e4) {
            zg2.c.f204692a.getClass();
            zg2.c.b("LiveActivityProtobufDataHandler", "getWorkoutsForActivityType cancelled");
            throw e4;
        } catch (Exception e14) {
            zg2.c.f204692a.getClass();
            zg2.c.b("LiveActivityProtobufDataHandler", "getWorkoutsForActivityType error " + e14);
            return null;
        }
    }

    @Override // dt2.a
    public final Set<Integer> getConfiguration() {
        return this.f170479j;
    }

    @Override // kk2.a.b
    public final void onAlertReceived(GDIEventSharingProto.AlertNotification alertNotification) {
        alertNotification.getClass();
        if (alertNotification.getAlertTypeList().contains(GDIEventSharingProto.AlertType.LIVE_SESSION)) {
            ge1.b.T(this.f170475f, null, null, new d((GDILiveSessionProto.LiveSessionEventNotification) alertNotification.getExtension((GeneratedMessage.GeneratedExtension) GDILiveSessionProto.LiveSessionEventNotification.liveSessionEvent), null), 3);
        }
    }

    @Override // dt2.h
    public final boolean onProtobufRequest(GDISmartProto.Smart smart, dt2.k kVar) {
        smart.getClass();
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDILiveSessionProto.LiveSessionService> generatedExtension = GDILiveSessionExtension.liveSessionService;
        if (!smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
            return false;
        }
        zg2.c.f204692a.getClass();
        zg2.c.a("LiveActivityProtobufDataHandler", "onProtobufRequest GDILiveSessionExtension - " + smart);
        rs2.c cVar = this.f170471b;
        GDILiveSessionProto.LiveSessionService liveSessionService = (GDILiveSessionProto.LiveSessionService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
        if (liveSessionService == null) {
            return false;
        }
        ge1.b.T(this.f170475f, null, null, new u0(this, cVar, liveSessionService, null), 3);
        return true;
    }

    @Override // dt2.c
    public final void receiveCapabilities(GDICore.FeatureCapabilitiesResponse featureCapabilitiesResponse) {
        zg2.c cVar = zg2.c.f204692a;
        String strConcat = "receiveCapabilities for ".concat(cl2.c.p(this.f170471b));
        cVar.getClass();
        zg2.c.a("LiveActivityProtobufDataHandler", strConcat);
        GDILiveSessionProto.CapabilitiesResponse capabilitiesResponse = (GDILiveSessionProto.CapabilitiesResponse) featureCapabilitiesResponse.getExtension((GeneratedMessage.GeneratedExtension) GDILiveSessionProto.CapabilitiesResponse.featuresResponse);
        int version = (capabilitiesResponse == null || !capabilitiesResponse.hasVersion()) ? 1 : capabilitiesResponse.getVersion();
        this.f170477h.k(null, new rf2.g(capabilitiesResponse != null && capabilitiesResponse.hasAllowRemoteTerminate() && capabilitiesResponse.getAllowRemoteTerminate(), version));
        this.f170474e.c(version, this.f170471b.getF172494b());
    }

    @Override // dt2.a
    public final void start(rs2.c cVar, dt2.g gVar, ExtensionRegistryLite extensionRegistryLite) {
        cVar.getClass();
        gVar.getClass();
        this.f170471b = cVar;
        this.f170476g = gVar;
        zg2.c cVar2 = zg2.c.f204692a;
        String strConcat = "start ".concat(cl2.c.p(cVar));
        cVar2.getClass();
        zg2.c.a("LiveActivityProtobufDataHandler", strConcat);
        ((dt2.d) gVar).f61154i.add(this);
        ge1.b.T(this.f170475f, null, null, new v0(this, null), 3);
        ge1.b.T(this.f170475f, null, null, new e(cVar, gVar, null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Luf2/r0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
