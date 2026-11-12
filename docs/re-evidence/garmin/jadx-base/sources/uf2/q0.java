package uf2;

import com.garmin.proto.generated.GDILiveSessionProto;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import u1.p1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Luf2/q0;", "Luf2/r0$b;", "<init>", "()V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q0 implements r0.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f170463e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o13.t f170464a = o13.m.b(new p1(29));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.t f170465b = o13.m.b(new p0(0));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f170466c = o13.m.b(new p0(1));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public of2.b f170467d;

    static {
        new a(null);
    }

    @Override // uf2.r0.b
    public final Object a(String str, r0.c cVar) {
        p2 p2Var;
        of2.b0 b0Var;
        zg2.c.f204692a.getClass();
        zg2.c.a("LiveActivityInteractorManager", "Connection " + str + " closed.");
        of2.b bVar = this.f170467d;
        rs2.c cVar2 = (bVar == null || (p2Var = bVar.f131736o) == null || (b0Var = (of2.b0) p2Var.getValue()) == null) ? null : b0Var.f131745b;
        if (p005kotlin.jvm.internal.s.g(cVar2 != null ? cVar2.getF92741e() : null, str)) {
            Object objA = f().e().a(str, cVar);
            return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
        }
        zg2.c.a("LiveActivityInteractorManager", "Current connection id " + (cVar2 != null ? cVar2.getF92741e() : null) + " doesn't match the incoming " + str);
        return Unit.INSTANCE;
    }

    @Override // uf2.r0.b
    public final Object b(rs2.c cVar, rf2.g gVar, dt2.g gVar2, GDILiveSessionProto.LiveSessionEventNotification liveSessionEventNotification, t13.d<? super Unit> dVar) {
        if (!g(cVar, liveSessionEventNotification.hasActivityStartRequest())) {
            return Unit.INSTANCE;
        }
        if (!liveSessionEventNotification.hasActivityStartRequest()) {
            zg2.c.f204692a.getClass();
            zg2.c.a("LiveActivityInteractorManager", "updateListener protobufMessage");
            Object objB = f().e().b(cVar, gVar, gVar2, liveSessionEventNotification, dVar);
            return objB == u13.a.COROUTINE_SUSPENDED ? objB : Unit.INSTANCE;
        }
        zg2.c.f204692a.getClass();
        zg2.c.a("LiveActivityInteractorManager", "startListener protobufMessage");
        d dVarE = e();
        GDILiveSessionProto.ActivityStartRequest activityStartRequest = liveSessionEventNotification.getActivityStartRequest();
        activityStartRequest.getClass();
        Object objC = dVarE.c(activityStartRequest, cVar, gVar2, gVar.f152479b, (fg2.d) KoinJavaComponent.get$default(fg2.d.class, null, null, 6, null), (v13.c) dVar);
        return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
    }

    @Override // uf2.r0.b
    public final Object c(rs2.c cVar, dt2.g gVar, r0.e eVar) {
        zg2.c cVar2 = zg2.c.f204692a;
        String str = "Connection " + cVar.getF92741e() + " started.";
        cVar2.getClass();
        zg2.c.a("LiveActivityInteractorManager", str);
        if (g(cVar, false)) {
            e().f170501b = gVar;
            Object objC = f().e().c(cVar, gVar, eVar);
            return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
        }
        zg2.c.a("LiveActivityInteractorManager", "Device with connection " + cVar.getF92741e() + " not allowed.");
        return Unit.INSTANCE;
    }

    @Override // uf2.r0.b
    public final Object d(rs2.c cVar, dt2.g gVar, GDILiveSessionProto.LiveSessionService liveSessionService, t13.d<? super Unit> dVar) {
        Object objD;
        zg2.c cVar2 = zg2.c.f204692a;
        String str = "protobufMessage LiveSessionService HasActiveSession " + (this.f170467d != null);
        cVar2.getClass();
        zg2.c.a("LiveActivityInteractorManager", str);
        return (g(cVar, false) && (objD = f().e().d(cVar, gVar, liveSessionService, dVar)) == u13.a.COROUTINE_SUSPENDED) ? objD : Unit.INSTANCE;
    }

    public final d e() {
        return (d) this.f170465b.getValue();
    }

    public final s f() {
        return (s) this.f170464a.getValue();
    }

    public final boolean g(rs2.c cVar, boolean z14) {
        p2 p2Var;
        of2.b0 b0Var;
        of2.b bVar = this.f170467d;
        rs2.c cVar2 = (bVar == null || (p2Var = bVar.f131736o) == null || (b0Var = (of2.b0) p2Var.getValue()) == null) ? null : b0Var.f131745b;
        zg2.c cVar3 = zg2.c.f204692a;
        boolean z15 = this.f170467d != null;
        Long lValueOf = cVar2 != null ? Long.valueOf(cVar2.getF92746j()) : null;
        long f172494b = cVar.getF92746j();
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("hasActiveSession: ", ", hasActivityStartRequest: ", ", active session device: ", z15, z14);
        sbM.append(lValueOf);
        sbM.append(", incoming device info: ");
        sbM.append(f172494b);
        String string = sbM.toString();
        cVar3.getClass();
        zg2.c.d("LiveActivityInteractorManager", string);
        if ((this.f170467d == null && z14) || (cVar2 != null && cVar2.getF92746j() == cVar.getF92746j())) {
            return true;
        }
        zg2.c.d("LiveActivityInteractorManager", "validateDeviceInfo - Different Device");
        return false;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Luf2/q0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
