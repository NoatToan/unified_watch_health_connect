package qr;

import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "", "Lnr/m0;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$fetchPersonalRecordsState$1", f = "ActivityDetailsViewModel.kt", l = {4643, 4642}, m = "invokeSuspend", v = 2)
public final class d0 extends v13.i implements e23.p<r53.j<? super List<? extends nr.m0>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f146144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f146145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f146146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f146147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f146148e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lnr/m0;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$fetchPersonalRecordsState$1$1", f = "ActivityDetailsViewModel.kt", l = {4657, 4661}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends nr.m0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o53.j0 f146149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f146150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p005kotlin.jvm.internal.r0 f146151c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f146152d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f146153e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ t f146154f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f146155g;

        /* JADX INFO: renamed from: qr.d0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$fetchPersonalRecordsState$1$1$exerciseListTranslationsAsync$1", f = "ActivityDetailsViewModel.kt", l = {4651}, m = "invokeSuspend", v = 2)
        public static final class C2753a extends v13.i implements e23.p<o53.b0, t13.d<? super com.garmin.android.apps.connectmobile.v2<? extends String>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f146156a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f146157b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2753a(t tVar, t13.d<? super C2753a> dVar) {
                super(2, dVar);
                this.f146157b = tVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C2753a(this.f146157b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super com.garmin.android.apps.connectmobile.v2<? extends String>> dVar) {
                return ((C2753a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f146156a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                ru1.d dVar = this.f146157b.f146519g;
                am.x0 x0Var = am.x0.f4309n1;
                this.f146156a = 1;
                Object objA = ru1.d.a(dVar, x0Var, this);
                return objA == aVar ? aVar : objA;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Ln91/a;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$fetchPersonalRecordsState$1$1$personalRecordsAsync$1", f = "ActivityDetailsViewModel.kt", l = {4645}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super com.garmin.android.apps.connectmobile.v2<? extends List<? extends n91.a>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f146158a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f146159b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f146160c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(t tVar, boolean z14, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f146159b = tVar;
                this.f146160c = z14;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f146159b, this.f146160c, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super com.garmin.android.apps.connectmobile.v2<? extends List<? extends n91.a>>> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f146158a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                t tVar = this.f146159b;
                o91.a aVar2 = tVar.E;
                long j8 = tVar.f146575z;
                this.f146158a = 1;
                Object objH = aVar2.h(j8, this.f146160c, this);
                return objH == aVar ? aVar : objH;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t tVar, boolean z14, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f146154f = tVar;
            this.f146155g = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f146154f, this.f146155g, dVar);
            aVar.f146153e = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends nr.m0>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:27:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:29:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:33:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:35:0x00f3  */
        /* JADX WARN: Code duplicated, block: B:36:0x013b  */
        /* JADX WARN: Code duplicated, block: B:38:0x013e  */
        /* JADX WARN: Code duplicated, block: B:41:0x0145  */
        /* JADX WARN: Code duplicated, block: B:47:0x0141 A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v12, types: [T, com.garmin.android.apps.connectmobile.repcounting.model.f] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o53.j0 j0VarJ;
            p005kotlin.jvm.internal.r0 r0Var;
            Object objC;
            List list;
            List list2;
            Object objAwait;
            List<n91.a> list3;
            com.garmin.android.apps.connectmobile.v2 v2Var;
            ArrayList arrayList;
            Long l14;
            nr.m0 m0Var;
            o53.b0 b0Var = (o53.b0) this.f146153e;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f146152d;
            t tVar = this.f146154f;
            if (i14 == 0) {
                o13.r.b(obj);
                o53.j0 j0VarJ2 = ge1.b.j(androidx.lifecycle.v1.a(tVar), null, null, new b(tVar, this.f146155g, null), 3);
                j0VarJ = ge1.b.j(androidx.lifecycle.v1.a(tVar), null, null, new C2753a(tVar, null), 3);
                p13.j0 j0Var = p13.j0.f134944a;
                r0Var = new p005kotlin.jvm.internal.r0();
                this.f146153e = b0Var;
                this.f146149a = j0VarJ;
                this.f146150b = j0Var;
                this.f146151c = r0Var;
                this.f146152d = 1;
                objC = j0VarJ2.C(this);
                if (objC != aVar) {
                    list = j0Var;
                }
                return aVar;
            }
            if (i14 == 1) {
                p005kotlin.jvm.internal.r0 r0Var2 = this.f146151c;
                list = this.f146150b;
                j0VarJ = this.f146149a;
                o13.r.b(obj);
                r0Var = r0Var2;
                objC = obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p005kotlin.jvm.internal.r0 r0Var3 = this.f146151c;
                list3 = this.f146150b;
                o13.r.b(obj);
                r0Var = r0Var3;
                objAwait = obj;
            }
            v2Var = (com.garmin.android.apps.connectmobile.v2) objAwait;
            if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                com.garmin.android.apps.connectmobile.repcounting.model.d.b bVar = com.garmin.android.apps.connectmobile.repcounting.model.d.f41101j;
                String str = (String) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
                bVar.getClass();
                r0Var.f105810a = com.garmin.android.apps.connectmobile.repcounting.model.d.b.b(str);
            } else {
                if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.a) {
                    lc.u0.r();
                    return null;
                }
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
                String strD = com.airbnb.lottie.animation.keyframe.a.d(((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47383a, "Error fetching exercise translations ");
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strD);
            }
            arrayList = new ArrayList();
            for (n91.a aVar2 : list3) {
                l14 = aVar2.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                if (l14 != null) {
                    long jLongValue = l14.longValue();
                    boolean zS = aVar2.s();
                    boolean zR = aVar2.r();
                    sr.n nVar = (sr.n) tVar.f146541n.f160548i.getValue();
                    long typeId = aVar2.getTypeId();
                    com.garmin.android.apps.connectmobile.repcounting.model.f fVar = (com.garmin.android.apps.connectmobile.repcounting.model.f) r0Var.f105810a;
                    nVar.getClass();
                    String strK = ((am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null)).K(nVar.f160578a, typeId, fVar);
                    q91.d.a aVar3 = q91.d.f143558e;
                    Long l15 = new Long(aVar2.getTypeId());
                    aVar3.getClass();
                    m0Var = new nr.m0(jLongValue, zS, zR, strK, q91.d.a.a(l15));
                } else {
                    m0Var = null;
                }
                if (m0Var != null) {
                    arrayList.add(m0Var);
                }
            }
            return arrayList;
            com.garmin.android.apps.connectmobile.v2 v2Var2 = (com.garmin.android.apps.connectmobile.v2) objC;
            if (v2Var2 instanceof com.garmin.android.apps.connectmobile.v2.b) {
                list2 = (List) ((com.garmin.android.apps.connectmobile.v2.b) v2Var2).f47386a;
            } else {
                if (!(v2Var2 instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                    lc.u0.r();
                    return null;
                }
                com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
                String strD2 = com.airbnb.lottie.animation.keyframe.a.d(((com.garmin.android.apps.connectmobile.v2.a) v2Var2).f47383a, "Error fetching personal records ");
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.f(a2Var2, "ActivityDetailsViewModel", strD2);
                list2 = list;
            }
            this.f146153e = b0Var;
            this.f146149a = null;
            this.f146150b = list2;
            this.f146151c = r0Var;
            this.f146152d = 2;
            objAwait = j0VarJ.await(this);
            if (objAwait != aVar) {
                list3 = list2;
                v2Var = (com.garmin.android.apps.connectmobile.v2) objAwait;
                if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                    com.garmin.android.apps.connectmobile.repcounting.model.d.b bVar2 = com.garmin.android.apps.connectmobile.repcounting.model.d.f41101j;
                    String str2 = (String) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
                    bVar2.getClass();
                    r0Var.f105810a = com.garmin.android.apps.connectmobile.repcounting.model.d.b.b(str2);
                } else {
                    if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.a) {
                        lc.u0.r();
                        return null;
                    }
                    com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
                    String strD3 = com.airbnb.lottie.animation.keyframe.a.d(((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47383a, "Error fetching exercise translations ");
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.f(a2Var3, "ActivityDetailsViewModel", strD3);
                }
                arrayList = new ArrayList();
                while (r2.hasNext()) {
                    l14 = aVar2.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                    if (l14 != null) {
                        long jLongValue2 = l14.longValue();
                        boolean zS2 = aVar2.s();
                        boolean zR2 = aVar2.r();
                        sr.n nVar2 = (sr.n) tVar.f146541n.f160548i.getValue();
                        long typeId2 = aVar2.getTypeId();
                        com.garmin.android.apps.connectmobile.repcounting.model.f fVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.f) r0Var.f105810a;
                        nVar2.getClass();
                        String strK2 = ((am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null)).K(nVar2.f160578a, typeId2, fVar2);
                        q91.d.a aVar4 = q91.d.f143558e;
                        Long l16 = new Long(aVar2.getTypeId());
                        aVar4.getClass();
                        m0Var = new nr.m0(jLongValue2, zS2, zR2, strK2, q91.d.a.a(l16));
                    } else {
                        m0Var = null;
                    }
                    if (m0Var != null) {
                        arrayList.add(m0Var);
                    }
                }
                return arrayList;
            }
            return aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(t tVar, boolean z14, t13.d<? super d0> dVar) {
        super(2, dVar);
        this.f146147d = tVar;
        this.f146148e = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d0 d0Var = new d0(this.f146147d, this.f146148e, dVar);
        d0Var.f146146c = obj;
        return d0Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super List<? extends nr.m0>> jVar, t13.d<? super Unit> dVar) {
        return ((d0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f146146c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146145b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f146144a;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        a aVar2 = new a(this.f146147d, this.f146148e, null);
        this.f146146c = null;
        this.f146144a = jVar;
        this.f146145b = 1;
        obj = o53.c0.e(aVar2, this);
        if (obj != aVar) {
        }
        return aVar;
        this.f146146c = null;
        this.f146144a = null;
        this.f146145b = 2;
    }
}
