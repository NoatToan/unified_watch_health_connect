package de2;

import com.garmin.proto.generated.GDILiveTrackExtension;
import com.garmin.proto.generated.GDILiveTrackProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.android.gms.wallet.WalletConstants;
import com.google.protobuf.GeneratedMessage;
import fe2.v1;
import lc.u0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lde2/g0$b;", "<anonymous>", "(Lo53/b0;)Lde2/g0$b;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.device.DefaultDeviceManager$sendStartRequest$2", f = "DefaultDeviceManager.kt", l = {WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<o53.b0, t13.d<? super g0.b>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f59300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ de2.a f59301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f59302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f59303d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"de2/h$a", "Lwm2/b;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements wm2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ de2.a f59304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t13.d<g0.b> f59305b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(de2.a aVar, t13.d<? super g0.b> dVar) {
            this.f59304a = aVar;
            this.f59305b = dVar;
        }

        @Override // wm2.b
        public final void onResponseFailed(int i14) {
            this.f59304a.f59230c.error("Start livetrack onResponseFailed");
            int i15 = o13.q.f128596b;
            this.f59305b.resumeWith(g0.b.c.f59298a);
        }

        @Override // wm2.b
        public final void onResponseReceived(int i14, GDISmartProto.Smart smart) {
            Object obj;
            smart.getClass();
            this.f59304a.f59230c.debug("Start livetrack onResponseReceived " + a0.a(smart));
            if (smart.hasExtension((GeneratedMessage.GeneratedExtension) GDILiveTrackExtension.liveTrackService) && a0.a(smart).hasStartResponse()) {
                GDILiveTrackProto.StartResponse.Status startStatus = a0.a(smart).getStartResponse().getStartStatus();
                startStatus.getClass();
                int i15 = a0.a.f59244d[startStatus.ordinal()];
                if (i15 == 1) {
                    obj = g0.b.d.f59299a;
                } else if (i15 == 2) {
                    obj = g0.b.C1267b.f59297a;
                } else {
                    if (i15 != 3) {
                        u0.r();
                        return;
                    }
                    obj = g0.b.c.f59298a;
                }
            } else {
                obj = g0.b.c.f59298a;
            }
            int i16 = o13.q.f128596b;
            this.f59305b.resumeWith(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(de2.a aVar, h0 h0Var, String str, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f59301b = aVar;
        this.f59302c = h0Var;
        this.f59303d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f59301b, this.f59302c, this.f59303d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super g0.b> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        GDILiveTrackProto.DeviceType deviceType;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f59300a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        this.f59300a = 1;
        t13.i iVar = new t13.i(u13.f.b(this));
        de2.a aVar2 = this.f59301b;
        Logger logger = aVar2.f59230c;
        StringBuilder sb3 = new StringBuilder("Start request details for device ");
        h0 h0Var = this.f59302c;
        sb3.append(h0Var);
        logger.debug(sb3.toString());
        h0Var.getClass();
        ae2.e0 e0Var = h0Var.f59306a;
        GDILiveTrackProto.SessionGroup.Builder builderNewBuilder = GDILiveTrackProto.SessionGroup.newBuilder();
        builderNewBuilder.setName(h0Var.f59308c);
        builderNewBuilder.setDurationS(h0Var.f59309d);
        builderNewBuilder.setSessionType(GDILiveTrackProto.SessionType.STANDARD);
        builderNewBuilder.setStartUnixTimestamp(h0Var.f59307b);
        GDILiveTrackProto.Session.Builder builderNewBuilder2 = GDILiveTrackProto.Session.newBuilder();
        for (v1 v1Var : h0Var.f59310e) {
            builderNewBuilder2.setId(v1Var.f70965a);
            builderNewBuilder2.setToken(v1Var.f70966b);
            v1.b bVar = v1Var.f70968d;
            if (p005kotlin.jvm.internal.s.g(bVar, v1.b.a.f70975a)) {
                deviceType = GDILiveTrackProto.DeviceType.ANONYMOUS;
            } else if (p005kotlin.jvm.internal.s.g(bVar, v1.b.c.f70977a)) {
                deviceType = GDILiveTrackProto.DeviceType.EMAIL;
            } else if (p005kotlin.jvm.internal.s.g(bVar, v1.b.f.f70980a)) {
                deviceType = GDILiveTrackProto.DeviceType.STRAVA;
            } else if (p005kotlin.jvm.internal.s.g(bVar, v1.b.C1451b.f70976a)) {
                deviceType = GDILiveTrackProto.DeviceType.GROUPTRACK;
            } else if (p005kotlin.jvm.internal.s.g(bVar, v1.b.d.f70978a)) {
                deviceType = GDILiveTrackProto.DeviceType.LIVEEVENT;
            } else if (p005kotlin.jvm.internal.s.g(bVar, v1.b.e.f70979a)) {
                deviceType = GDILiveTrackProto.DeviceType.SMS_SUBSCRIBER;
            } else if (p005kotlin.jvm.internal.s.g(bVar, v1.b.g.f70981a)) {
                deviceType = GDILiveTrackProto.DeviceType.SUBSCRIPTION_SUBSCRIBER;
            } else {
                if (bVar != null) {
                    u0.r();
                    return null;
                }
                deviceType = null;
            }
            builderNewBuilder2.setDeviceType(deviceType);
            builderNewBuilder.addSessions(builderNewBuilder2.build());
        }
        GDILiveTrackProto.TrackerId.Builder builderNewBuilder3 = GDILiveTrackProto.TrackerId.newBuilder();
        builderNewBuilder3.setTrackerId(e0Var.getTrackerId());
        builderNewBuilder3.setUnitId(e0Var.getIdentifier());
        builderNewBuilder3.setNickname(e0Var.getNickname());
        builderNewBuilder3.setDeviceType(GDILiveTrackProto.DeviceType.FITNESSAPP);
        GDILiveTrackProto.StartRequest.Builder builderNewBuilder4 = GDILiveTrackProto.StartRequest.newBuilder();
        builderNewBuilder4.setSession(builderNewBuilder.build());
        builderNewBuilder4.setTrackerId(builderNewBuilder3.build());
        GDILiveTrackProto.LiveTrackService.Builder builderNewBuilder5 = GDILiveTrackProto.LiveTrackService.newBuilder();
        builderNewBuilder5.setStartRequest(builderNewBuilder4.build());
        GDISmartProto.Smart.Builder builderNewBuilder6 = GDISmartProto.Smart.newBuilder();
        builderNewBuilder6.getClass();
        GDILiveTrackProto.LiveTrackService liveTrackServiceBuild = builderNewBuilder5.build();
        liveTrackServiceBuild.getClass();
        builderNewBuilder6.setExtension(GDILiveTrackExtension.liveTrackService, liveTrackServiceBuild);
        GDISmartProto.Smart smartBuild = builderNewBuilder6.build();
        smartBuild.getClass();
        da2.d dVarC = da2.d.c(aVar2.f59231d);
        String str = this.f59303d;
        wm2.a aVar3 = (wm2.a) dVarC.getCapability(str, wm2.a.class);
        if (aVar3 != null) {
            aVar3.initiateRequest(smartBuild, str, new a(aVar2, iVar));
        }
        Object objA = iVar.a();
        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
        return objA == aVar ? aVar : objA;
    }
}
