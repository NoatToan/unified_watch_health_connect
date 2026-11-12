package n70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lo70/x;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetSyncStateUseCase$invoke$1", f = "GetSyncStateUseCase.kt", l = {61}, m = "invokeSuspend", v = 2)
public final class y5 extends v13.i implements e23.p<r53.j<? super o70.x>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f124775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f124776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x5 f124777c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j<o70.x> f124778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x5 f124779b;

        /* JADX INFO: renamed from: n70.y5$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetSyncStateUseCase$invoke$1$2", f = "GetSyncStateUseCase.kt", l = {67, 73, 81, 87, 88, 90, 93, 98, 109, 116, 122}, m = "emit", v = 2)
        public static final class C2397a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public l7 f124780a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public sd2.f f124781b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Long f124782c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f124783d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ a<T> f124784e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f124785f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C2397a(a<? super T> aVar, t13.d<? super C2397a> dVar) {
                super(dVar);
                this.f124784e = aVar;
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f124783d = obj;
                this.f124785f |= Integer.MIN_VALUE;
                return this.f124784e.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(r53.j<? super o70.x> jVar, x5 x5Var) {
            this.f124778a = jVar;
            this.f124779b = x5Var;
        }

        /* JADX WARN: Code duplicated, block: B:64:0x0156  */
        /* JADX WARN: Code duplicated, block: B:8:0x001a  */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x02a8, code lost:
        
            if (r10.emit(r11, r6) == r9) goto L117;
         */
        /* JADX WARN: Code restructure failed: missing block: B:116:0x02e1, code lost:
        
            if (r10.emit(r12, r6) == r9) goto L117;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00bc, code lost:
        
            if (r10.emit(r1, r6) == r9) goto L117;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00f0, code lost:
        
            if (r10.emit(r1, r6) == r9) goto L117;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x0182, code lost:
        
            if (n70.x5.a(r18.f124779b, r18.f124778a, r5, r3, r2, r6) == r9) goto L117;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x019c, code lost:
        
            if (n70.x5.a(r18.f124779b, r18.f124778a, r3, r1, r8, r6) == r9) goto L117;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x01d9, code lost:
        
            if (n70.x5.a(r18.f124779b, r18.f124778a, r19, r4, r5, r6) == r9) goto L117;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x0250, code lost:
        
            if (r10.emit(r12, r6) == r9) goto L117;
         */
        @Override // r53.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(l7 l7Var, t13.d<? super Unit> dVar) {
            C2397a c2397a;
            sd2.f fVar;
            Long l14;
            l7 l7Var2;
            sd2.f fVar2;
            l7 l7Var3;
            l7 l7Var4 = l7Var;
            if (dVar instanceof C2397a) {
                c2397a = (C2397a) dVar;
                int i14 = c2397a.f124785f;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2397a.f124785f = i14 - Integer.MIN_VALUE;
                } else {
                    c2397a = new C2397a(this, dVar);
                }
            } else {
                c2397a = new C2397a(this, dVar);
            }
            C2397a c2397a2 = c2397a;
            Object obj = c2397a2.f124783d;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            switch (c2397a2.f124785f) {
                case 0:
                    o13.r.b(obj);
                    p1.a aVar2 = l7Var4.f124398d;
                    zr1.c cVar = l7Var4.f124396b;
                    fVar = aVar2 != null ? aVar2.f124475b.f34316a : null;
                    Long l15 = fVar != null ? new Long(fVar.getUnitID()) : null;
                    r53.j<o70.x> jVar = this.f124778a;
                    if (l15 != null) {
                        if (l7Var4.f124399e != az0.c.a.Available) {
                            com.garmin.android.apps.connectmobile.i2.a aVar3 = com.garmin.android.apps.connectmobile.i2.f36769a;
                            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                            aVar3.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "GetSyncStateUseCase", "Sync not enabled, deviceUnitId: " + l15);
                            o70.x.b bVar = o70.x.b.f130111a;
                            c2397a2.f124780a = null;
                            c2397a2.f124781b = null;
                            c2397a2.f124782c = null;
                            c2397a2.f124785f = 2;
                        } else if (cVar instanceof zr1.c.a) {
                            zr1.c.a aVar4 = (zr1.c.a) cVar;
                            boolean z14 = aVar4.f206772b;
                            al2.c cVar2 = aVar4.f206771a;
                            if (l15.longValue() == cVar2.f3775a.getF92746j() && cVar2.f3776b.f132729a && l7Var4.f124398d.f124474a != o70.g.DISCONNECTED) {
                                String strH = com.airbnb.lottie.animation.keyframe.a.h("Sync Finished successfulSync:", z14);
                                com.garmin.android.apps.connectmobile.i2.a aVar5 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                aVar5.getClass();
                                com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "GetSyncStateUseCase", strH);
                                if (!z14) {
                                    c2397a2.f124780a = l7Var4;
                                    c2397a2.f124781b = fVar;
                                    c2397a2.f124782c = l15;
                                    c2397a2.f124785f = 6;
                                    if (o53.m0.b(1000L, c2397a2) != aVar) {
                                        l14 = l15;
                                        l7Var3 = l7Var4;
                                        fVar2 = fVar;
                                        c2397a2.f124780a = null;
                                        c2397a2.f124781b = null;
                                        c2397a2.f124782c = null;
                                        c2397a2.f124785f = 7;
                                    }
                                } else {
                                    o70.x.a aVar6 = o70.x.a.f130110a;
                                    c2397a2.f124780a = l7Var4;
                                    c2397a2.f124781b = fVar;
                                    c2397a2.f124782c = l15;
                                    c2397a2.f124785f = 4;
                                    if (jVar.emit(aVar6, c2397a2) != aVar) {
                                        l14 = l15;
                                        c2397a2.f124780a = l7Var4;
                                        c2397a2.f124781b = fVar;
                                        c2397a2.f124782c = l14;
                                        c2397a2.f124785f = 5;
                                        if (o53.m0.b(1000L, c2397a2) != aVar) {
                                            l7Var2 = l7Var4;
                                            fVar2 = fVar;
                                            l7Var3 = l7Var2;
                                            c2397a2.f124780a = null;
                                            c2397a2.f124781b = null;
                                            c2397a2.f124782c = null;
                                            c2397a2.f124785f = 7;
                                        }
                                    }
                                }
                            } else {
                                c2397a2.f124780a = null;
                                c2397a2.f124781b = null;
                                c2397a2.f124782c = null;
                                c2397a2.f124785f = 3;
                            }
                        } else {
                            sd2.f fVar3 = fVar;
                            Long l16 = l15;
                            if (cVar.equals(zr1.c.C3852c.f206774a)) {
                                com.garmin.android.apps.connectmobile.i2.a aVar7 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                aVar7.getClass();
                                com.garmin.android.apps.connectmobile.i2.a.b(a2Var3, "GetSyncStateUseCase", "Sync not started: shownDeviceUnitId=" + l16);
                                c2397a2.f124780a = null;
                                c2397a2.f124781b = null;
                                c2397a2.f124782c = null;
                                c2397a2.f124785f = 8;
                            } else if (cVar instanceof zr1.c.d) {
                                al2.a aVar8 = ((zr1.c.d) cVar).f206775a;
                                boolean z15 = aVar8.f3764f;
                                rs2.c cVar3 = aVar8.f3759a;
                                String str = "Sync Progress " + aVar8.a() + " hasPendingUploads[" + z15 + "] device: " + cVar3;
                                com.garmin.android.apps.connectmobile.i2.a aVar9 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                com.garmin.android.apps.connectmobile.a2 a2Var4 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                aVar9.getClass();
                                com.garmin.android.apps.connectmobile.i2.a.b(a2Var4, "GetSyncStateUseCase", str);
                                if (l16.longValue() != cVar3.getF92746j() || !aVar8.f3760b.f132729a) {
                                    return Unit.INSTANCE;
                                }
                                o70.x.e eVar = new o70.x.e(false, z15, (aVar8.a() * 0.009f) + 0.1f, 1, null);
                                c2397a2.f124780a = null;
                                c2397a2.f124781b = null;
                                c2397a2.f124782c = null;
                                c2397a2.f124785f = 9;
                            } else if (cVar instanceof zr1.c.e) {
                                al2.c cVar4 = ((zr1.c.e) cVar).f206777a;
                                if (!cVar4.f3776b.f132729a) {
                                    return Unit.INSTANCE;
                                }
                                String str2 = "Sync Started: " + cVar4.f3775a;
                                com.garmin.android.apps.connectmobile.i2.a aVar10 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                com.garmin.android.apps.connectmobile.a2 a2Var5 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                aVar10.getClass();
                                com.garmin.android.apps.connectmobile.i2.a.b(a2Var5, "GetSyncStateUseCase", str2);
                                this.f124779b.f124750g.a(o70.f.DEVICE_SYNC.f129989a);
                                o70.x.e eVar2 = new o70.x.e(true, false, 0.1f, 2, null);
                                c2397a2.f124780a = null;
                                c2397a2.f124781b = null;
                                c2397a2.f124782c = null;
                                c2397a2.f124785f = 10;
                            } else {
                                if (!cVar.equals(zr1.c.b.f206773a)) {
                                    lc.u0.r();
                                    return null;
                                }
                                com.garmin.android.apps.connectmobile.i2.a aVar11 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                com.garmin.android.apps.connectmobile.a2 a2Var6 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                aVar11.getClass();
                                com.garmin.android.apps.connectmobile.i2.a.b(a2Var6, "GetSyncStateUseCase", "Sync Started: manual");
                                o70.x.e eVar3 = new o70.x.e(true, false, 0.1f, 2, null);
                                c2397a2.f124780a = null;
                                c2397a2.f124781b = null;
                                c2397a2.f124782c = null;
                                c2397a2.f124785f = 11;
                            }
                        }
                        break;
                    } else {
                        com.garmin.android.apps.connectmobile.i2.a aVar12 = com.garmin.android.apps.connectmobile.i2.f36769a;
                        com.garmin.android.apps.connectmobile.a2 a2Var7 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                        aVar12.getClass();
                        com.garmin.android.apps.connectmobile.i2.a.b(a2Var7, "GetSyncStateUseCase", "No device, deviceUnitId: null");
                        o70.x.c cVar5 = o70.x.c.f130112a;
                        c2397a2.f124780a = null;
                        c2397a2.f124781b = null;
                        c2397a2.f124782c = null;
                        c2397a2.f124785f = 1;
                        break;
                    }
                    return aVar;
                case 1:
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                case 2:
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                case 3:
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                case 4:
                    l14 = c2397a2.f124782c;
                    sd2.f fVar4 = c2397a2.f124781b;
                    l7 l7Var5 = c2397a2.f124780a;
                    o13.r.b(obj);
                    fVar = fVar4;
                    l7Var4 = l7Var5;
                    c2397a2.f124780a = l7Var4;
                    c2397a2.f124781b = fVar;
                    c2397a2.f124782c = l14;
                    c2397a2.f124785f = 5;
                    if (o53.m0.b(1000L, c2397a2) != aVar) {
                        l7Var2 = l7Var4;
                        fVar2 = fVar;
                        l7Var3 = l7Var2;
                        c2397a2.f124780a = null;
                        c2397a2.f124781b = null;
                        c2397a2.f124782c = null;
                        c2397a2.f124785f = 7;
                        break;
                    }
                    return aVar;
                case 5:
                    l14 = c2397a2.f124782c;
                    fVar2 = c2397a2.f124781b;
                    l7Var2 = c2397a2.f124780a;
                    o13.r.b(obj);
                    l7Var3 = l7Var2;
                    c2397a2.f124780a = null;
                    c2397a2.f124781b = null;
                    c2397a2.f124782c = null;
                    c2397a2.f124785f = 7;
                    break;
                case 6:
                    l14 = c2397a2.f124782c;
                    sd2.f fVar5 = c2397a2.f124781b;
                    l7 l7Var6 = c2397a2.f124780a;
                    o13.r.b(obj);
                    fVar = fVar5;
                    l7Var4 = l7Var6;
                    l7Var3 = l7Var4;
                    fVar2 = fVar;
                    c2397a2.f124780a = null;
                    c2397a2.f124781b = null;
                    c2397a2.f124782c = null;
                    c2397a2.f124785f = 7;
                    break;
                case 7:
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                case 8:
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                case 9:
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                case 10:
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                case 11:
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                default:
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements r53.i<l7> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i[] f124786a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements e23.a<Object[]> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i[] f124787a;

            public a(r53.i[] iVarArr) {
                this.f124787a = iVarArr;
            }

            @Override // e23.a
            public final Object[] invoke() {
                return new Object[this.f124787a.length];
            }
        }

        /* JADX INFO: renamed from: n70.y5$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lr53/j;", "", "it", "", "<anonymous>", "(Lr53/j;Lkotlin/Array;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetSyncStateUseCase$invoke$1$invokeSuspend$$inlined$combine$1$3", f = "GetSyncStateUseCase.kt", l = {234}, m = "invokeSuspend", v = 2)
        public static final class C2398b extends v13.i implements e23.q<r53.j<? super l7>, Object[], t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f124788a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ r53.j f124789b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object[] f124790c;

            public C2398b(t13.d dVar) {
                super(3, dVar);
            }

            @Override // e23.q
            public final Object invoke(r53.j<? super l7> jVar, Object[] objArr, t13.d<? super Unit> dVar) {
                C2398b c2398b = new C2398b(dVar);
                c2398b.f124789b = jVar;
                c2398b.f124790c = objArr;
                return c2398b.invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f124788a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    r53.j jVar = this.f124789b;
                    Object[] objArr = this.f124790c;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                    az0.c.a aVar2 = (az0.c.a) obj5;
                    p1.a aVar3 = (p1.a) obj4;
                    boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                    zr1.c cVar = (zr1.c) obj2;
                    if (zBooleanValue2) {
                        cVar = zr1.c.b.f206773a;
                    }
                    l7 l7Var = new l7(zBooleanValue, cVar, zBooleanValue3, aVar3, aVar2);
                    this.f124789b = null;
                    this.f124790c = null;
                    this.f124788a = 1;
                    if (jVar.emit(l7Var, this) == aVar) {
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

        public b(r53.i[] iVarArr) {
            this.f124786a = iVarArr;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super l7> jVar, t13.d dVar) {
            r53.i[] iVarArr = this.f124786a;
            Object objA = s53.m.a(iVarArr, new a(iVarArr), new C2398b(null), jVar, dVar);
            return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(x5 x5Var, t13.d<? super y5> dVar) {
        super(2, dVar);
        this.f124777c = x5Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        y5 y5Var = new y5(this.f124777c, dVar);
        y5Var.f124776b = obj;
        return y5Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super o70.x> jVar, t13.d<? super Unit> dVar) {
        return ((y5) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f124776b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f124775a;
        if (i14 == 0) {
            o13.r.b(obj);
            x5 x5Var = this.f124777c;
            zr1.a aVar2 = x5Var.f124744a;
            int i15 = zr1.a.f206766a;
            r53.i iVarS = r53.s.s(new b(new r53.i[]{r53.s.f(new zr1.b(null, null)), x5Var.f124745b.a(), x5Var.f124746c.b(), x5Var.f124748e.a(), x5Var.f124751h, x5Var.f124752i}));
            a aVar3 = new a(jVar, x5Var);
            this.f124776b = null;
            this.f124775a = 1;
            if (iVarS.collect(aVar3, this) == aVar) {
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
