package pj1;

import android.content.Context;
import android.location.Location;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.safetyfeatures.AssistancePlusMccManager$sendCurTimezoneLocMCCtoDevice$1", f = "AssistancePlusMccManager.kt", l = {110, 112, 113, 117, 120, 121}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public mv0.e f137889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f137890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f137891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f137892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pj1.a f137893e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Landroid/location/Location;", "<anonymous>", "(Lo53/b0;)Landroid/location/Location;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.safetyfeatures.AssistancePlusMccManager$sendCurTimezoneLocMCCtoDevice$1$location$1", f = "AssistancePlusMccManager.kt", l = {110}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Location>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f137894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mv0.e f137895b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mv0.e eVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f137895b = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f137895b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Location> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f137894a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f137894a = 1;
                Object objC = this.f137895b.c("AssistancePlusMccManager", this);
                return objC == aVar ? aVar : objC;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Landroid/location/Location;", "<anonymous>", "(Lo53/b0;)Landroid/location/Location;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.safetyfeatures.AssistancePlusMccManager$sendCurTimezoneLocMCCtoDevice$1$requestedLocation$1", f = "AssistancePlusMccManager.kt", l = {117}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Location>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f137896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mv0.e f137897b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mv0.e eVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f137897b = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f137897b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Location> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f137896a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f137896a = 1;
                Object objD = this.f137897b.d("AssistancePlusMccManager", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
                return objD == aVar ? aVar : objD;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, pj1.a aVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f137892d = context;
        this.f137893e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d dVar2 = new d(this.f137892d, this.f137893e, dVar);
        dVar2.f137891c = obj;
        return dVar2;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a4 A[Catch: Exception -> 0x00b4, TryCatch #3 {Exception -> 0x00b4, blocks: (B:57:0x0106, B:59:0x010a, B:48:0x00d6, B:50:0x00da, B:52:0x00e4, B:54:0x00ee, B:62:0x0119, B:34:0x00a0, B:36:0x00a4, B:45:0x00be), top: B:68:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00be A[Catch: Exception -> 0x00b4, TryCatch #3 {Exception -> 0x00b4, blocks: (B:57:0x0106, B:59:0x010a, B:48:0x00d6, B:50:0x00da, B:52:0x00e4, B:54:0x00ee, B:62:0x0119, B:34:0x00a0, B:36:0x00a4, B:45:0x00be), top: B:68:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d6 A[Catch: Exception -> 0x00b4, PHI: r12 r15
      0x00d6: PHI (r12v8 pj1.d) = (r12v3 pj1.d), (r12v9 pj1.d) binds: [B:46:0x00d3, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x00d6: PHI (r15v24 java.lang.Object) = (r15v18 java.lang.Object), (r15v0 java.lang.Object) binds: [B:46:0x00d3, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {Exception -> 0x00b4, blocks: (B:57:0x0106, B:59:0x010a, B:48:0x00d6, B:50:0x00da, B:52:0x00e4, B:54:0x00ee, B:62:0x0119, B:34:0x00a0, B:36:0x00a4, B:45:0x00be), top: B:68:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00da A[Catch: Exception -> 0x00b4, TryCatch #3 {Exception -> 0x00b4, blocks: (B:57:0x0106, B:59:0x010a, B:48:0x00d6, B:50:0x00da, B:52:0x00e4, B:54:0x00ee, B:62:0x0119, B:34:0x00a0, B:36:0x00a4, B:45:0x00be), top: B:68:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e4 A[Catch: Exception -> 0x00b4, TryCatch #3 {Exception -> 0x00b4, blocks: (B:57:0x0106, B:59:0x010a, B:48:0x00d6, B:50:0x00da, B:52:0x00e4, B:54:0x00ee, B:62:0x0119, B:34:0x00a0, B:36:0x00a4, B:45:0x00be), top: B:68:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:59:0x010a A[Catch: Exception -> 0x00b4, TryCatch #3 {Exception -> 0x00b4, blocks: (B:57:0x0106, B:59:0x010a, B:48:0x00d6, B:50:0x00da, B:52:0x00e4, B:54:0x00ee, B:62:0x0119, B:34:0x00a0, B:36:0x00a4, B:45:0x00be), top: B:68:0x000e }] */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0116, code lost:
    
        if (r3.b(r15, null, r14) == r1) goto L61;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Exception exc;
        mv0.e eVar;
        Location location;
        d dVar;
        d dVar2;
        String str;
        Location location2;
        String str2;
        o53.b0 b0Var = (o53.b0) this.f137891c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f137890b;
        pj1.a aVar2 = this.f137893e;
        try {
            try {
                switch (i14) {
                    case 0:
                        o13.r.b(obj);
                        try {
                            eVar = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);
                            j22.b bVar = j22.b.f96736a;
                            Context context = this.f137892d;
                            bVar.getClass();
                            if (j22.b.c(context) && eVar.a("AssistancePlusMccManager")) {
                                x53.c cVar = s0.f129406a;
                                x53.b bVar2 = x53.b.f189152a;
                                a aVar3 = new a(eVar, null);
                                this.f137891c = b0Var;
                                this.f137889a = eVar;
                                this.f137890b = 1;
                                obj = ge1.b.e0(bVar2, aVar3, this);
                                if (obj != aVar) {
                                    location = (Location) obj;
                                    if (location != null || System.currentTimeMillis() - location.getTime() > 3600000) {
                                        dVar = this;
                                        x53.c cVar2 = s0.f129406a;
                                        x53.b bVar3 = x53.b.f189152a;
                                        b bVar4 = new b(eVar, null);
                                        dVar.f137891c = b0Var;
                                        dVar.f137889a = null;
                                        dVar.f137890b = 4;
                                        obj = ge1.b.e0(bVar3, bVar4, this);
                                        if (obj != aVar) {
                                            location2 = (Location) obj;
                                            if (location2 != null) {
                                                if (Double.isNaN(location2.getLatitude()) && !Double.isNaN(location2.getLongitude())) {
                                                    pj1.a aVar4 = dVar.f137893e;
                                                    double latitude = location2.getLatitude();
                                                    double longitude = location2.getLongitude();
                                                    dVar.f137891c = b0Var;
                                                    dVar.f137889a = null;
                                                    dVar.f137890b = 5;
                                                    obj = aVar4.c(latitude, longitude, dVar);
                                                    if (obj != aVar) {
                                                        str2 = (String) obj;
                                                        if (str2 != null) {
                                                            dVar.f137891c = b0Var;
                                                            dVar.f137889a = null;
                                                            dVar.f137890b = 6;
                                                            pj1.a.C2616a c2616a = pj1.a.f137878b;
                                                        }
                                                        break;
                                                    }
                                                } else {
                                                    p92.y.f136664a.getClass();
                                                    p92.y.a.c("AssistancePlusMccManager", "sendCurTimezoneLocMCCtoDevice :: Error occurred while reading user location");
                                                }
                                            }
                                        }
                                    } else {
                                        pj1.a aVar5 = this.f137893e;
                                        double latitude2 = location.getLatitude();
                                        double longitude2 = location.getLongitude();
                                        this.f137891c = b0Var;
                                        this.f137889a = null;
                                        this.f137890b = 2;
                                        try {
                                            obj = aVar5.c(latitude2, longitude2, this);
                                            dVar2 = this;
                                            if (obj != aVar) {
                                                str = (String) obj;
                                                if (str != null) {
                                                    dVar2.f137891c = b0Var;
                                                    dVar2.f137889a = null;
                                                    dVar2.f137890b = 3;
                                                    pj1.a.C2616a c2616a2 = pj1.a.f137878b;
                                                    if (aVar2.b(str, null, this) == aVar) {
                                                    }
                                                }
                                            }
                                        } catch (Exception e4) {
                                            e = e4;
                                            exc = e;
                                            String strD = com.airbnb.lottie.animation.keyframe.a.d(exc, "sendCurTimezoneLocMCCtoDevice :: Error occured while processing the request ");
                                            p92.y.f136664a.getClass();
                                            p92.y.a.c("AssistancePlusMccManager", strD);
                                        }
                                    }
                                }
                                return aVar;
                            }
                        } catch (Exception e14) {
                            e = e14;
                            exc = e;
                            String strD2 = com.airbnb.lottie.animation.keyframe.a.d(exc, "sendCurTimezoneLocMCCtoDevice :: Error occured while processing the request ");
                            p92.y.f136664a.getClass();
                            p92.y.a.c("AssistancePlusMccManager", strD2);
                            return Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    case 1:
                        eVar = this.f137889a;
                        o13.r.b(obj);
                        location = (Location) obj;
                        if (location != null) {
                            dVar = this;
                            x53.c cVar3 = s0.f129406a;
                            x53.b bVar5 = x53.b.f189152a;
                            b bVar6 = new b(eVar, null);
                            dVar.f137891c = b0Var;
                            dVar.f137889a = null;
                            dVar.f137890b = 4;
                            obj = ge1.b.e0(bVar5, bVar6, this);
                            if (obj != aVar) {
                                location2 = (Location) obj;
                                if (location2 != null) {
                                    if (Double.isNaN(location2.getLatitude())) {
                                    }
                                    p92.y.f136664a.getClass();
                                    p92.y.a.c("AssistancePlusMccManager", "sendCurTimezoneLocMCCtoDevice :: Error occurred while reading user location");
                                    break;
                                }
                                return Unit.INSTANCE;
                            }
                        } else {
                            dVar = this;
                            x53.c cVar4 = s0.f129406a;
                            x53.b bVar7 = x53.b.f189152a;
                            b bVar8 = new b(eVar, null);
                            dVar.f137891c = b0Var;
                            dVar.f137889a = null;
                            dVar.f137890b = 4;
                            obj = ge1.b.e0(bVar7, bVar8, this);
                            if (obj != aVar) {
                                location2 = (Location) obj;
                                if (location2 != null) {
                                    if (Double.isNaN(location2.getLatitude())) {
                                    }
                                    p92.y.f136664a.getClass();
                                    p92.y.a.c("AssistancePlusMccManager", "sendCurTimezoneLocMCCtoDevice :: Error occurred while reading user location");
                                    break;
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        return aVar;
                    case 2:
                        o13.r.b(obj);
                        dVar2 = this;
                        str = (String) obj;
                        if (str != null) {
                            dVar2.f137891c = b0Var;
                            dVar2.f137889a = null;
                            dVar2.f137890b = 3;
                            pj1.a.C2616a c2616a3 = pj1.a.f137878b;
                            if (aVar2.b(str, null, this) == aVar) {
                                return aVar;
                            }
                        }
                        return Unit.INSTANCE;
                    case 3:
                    case 6:
                        o13.r.b(obj);
                        return Unit.INSTANCE;
                    case 4:
                        o13.r.b(obj);
                        dVar = this;
                        location2 = (Location) obj;
                        if (location2 != null) {
                            if (Double.isNaN(location2.getLatitude())) {
                            }
                            p92.y.f136664a.getClass();
                            p92.y.a.c("AssistancePlusMccManager", "sendCurTimezoneLocMCCtoDevice :: Error occurred while reading user location");
                            break;
                        }
                        return Unit.INSTANCE;
                    case 5:
                        o13.r.b(obj);
                        dVar = this;
                        str2 = (String) obj;
                        if (str2 != null) {
                            dVar.f137891c = b0Var;
                            dVar.f137889a = null;
                            dVar.f137890b = 6;
                            pj1.a.C2616a c2616a4 = pj1.a.f137878b;
                            break;
                        }
                        return Unit.INSTANCE;
                    default:
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            } catch (Exception e15) {
                exc = e15;
                String strD3 = com.airbnb.lottie.animation.keyframe.a.d(exc, "sendCurTimezoneLocMCCtoDevice :: Error occured while processing the request ");
                p92.y.f136664a.getClass();
                p92.y.a.c("AssistancePlusMccManager", strD3);
            }
        } catch (Exception e16) {
            e = e16;
        }
    }
}
