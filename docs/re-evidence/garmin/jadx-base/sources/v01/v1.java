package v01;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2$b;", "Lk01/f;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2$b;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.ReportsDailyUseCase$invoke$2", f = "ReportsDailyUseCase.kt", l = {36, 41, 46}, m = "invokeSuspend", v = 2)
public final class v1 extends v13.i implements e23.p<o53.b0, t13.d<? super v2.b<? extends k01.f>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o53.i0 f174558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k01.c f174559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l42.k f174560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f174561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f174562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f174563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w1 f174564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b63.o f174565h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b63.o f174566i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b63.o f174567j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ls21/o;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.ReportsDailyUseCase$invoke$2$micronutrientsSettingsTask$1", f = "ReportsDailyUseCase.kt", l = {34}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends s21.o>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f174568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w1 f174569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b63.o f174570c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w1 w1Var, b63.o oVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f174569b = w1Var;
            this.f174570c = oVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f174569b, this.f174570c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends s21.o>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f174568a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            t0 t0Var = this.f174569b.f174581d;
            this.f174568a = 1;
            Object objA = t0Var.a(this.f174570c, this);
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(w1 w1Var, b63.o oVar, b63.o oVar2, b63.o oVar3, t13.d<? super v1> dVar) {
        super(2, dVar);
        this.f174564g = w1Var;
        this.f174565h = oVar;
        this.f174566i = oVar2;
        this.f174567j = oVar3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        v1 v1Var = new v1(this.f174564g, this.f174565h, this.f174566i, this.f174567j, dVar);
        v1Var.f174563f = obj;
        return v1Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2.b<? extends k01.f>> dVar) {
        return ((v1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00df  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:60:0x0104  */
    /* JADX WARN: Code duplicated, block: B:62:0x0108 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x0112  */
    /* JADX WARN: Code duplicated, block: B:67:0x0114  */
    /* JADX WARN: Code duplicated, block: B:69:0x0124  */
    /* JADX WARN: Code duplicated, block: B:72:0x012c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0149  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objQ;
        o53.i0 i0Var;
        boolean z14;
        k01.c cVar;
        Object objJ;
        o53.i0 i0Var2;
        k01.c cVar2;
        v2 v2Var;
        l42.k kVar;
        v2 v2Var2;
        Object objAwait;
        l42.k kVar2;
        List<s21.n> list;
        List listA;
        s21.o oVar;
        o53.b0 b0Var = (o53.b0) this.f174563f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f174562e;
        b63.o oVar2 = this.f174566i;
        b63.o oVar3 = this.f174565h;
        w1 w1Var = this.f174564g;
        List list2 = null;
        if (i14 == 0) {
            o13.r.b(obj);
            boolean zE = w1Var.f174582e.e();
            b63.o oVar4 = this.f174567j;
            o53.j0 j0VarJ = zE ? ge1.b.j(b0Var, null, null, new a(w1Var, oVar4, null), 3) : null;
            m01.g gVar = w1Var.f174578a;
            this.f174563f = null;
            this.f174558a = j0VarJ;
            this.f174561d = zE;
            this.f174562e = 1;
            objQ = gVar.q(oVar3, oVar2, oVar4, this);
            if (objQ != aVar) {
                i0Var = j0VarJ;
                z14 = zE;
            }
            return aVar;
        }
        if (i14 == 1) {
            z14 = this.f174561d;
            i0Var = this.f174558a;
            o13.r.b(obj);
            objQ = obj;
        } else {
            if (i14 == 2) {
                z14 = this.f174561d;
                cVar2 = this.f174559b;
                o53.i0 i0Var3 = this.f174558a;
                o13.r.b(obj);
                i0Var2 = i0Var3;
                objJ = obj;
                v2Var = (v2) objJ;
                if (v2Var instanceof v2.b) {
                    kVar = (l42.k) ((v2.b) v2Var).f47386a;
                } else {
                    if (v2Var instanceof v2.a) {
                        lc.u0.r();
                        return null;
                    }
                    kVar = null;
                }
                if (i0Var2 != null) {
                    this.f174563f = null;
                    this.f174558a = null;
                    this.f174559b = cVar2;
                    this.f174560c = kVar;
                    this.f174561d = z14;
                    this.f174562e = 3;
                    objAwait = i0Var2.await(this);
                    if (objAwait != aVar) {
                        kVar2 = kVar;
                    }
                    return aVar;
                }
                v2Var2 = null;
                if (v2Var2 instanceof v2.b) {
                    oVar = (s21.o) ((v2.b) v2Var2).f47386a;
                    if (oVar != null) {
                        if (!oVar.f156159a) {
                            oVar = null;
                        }
                        if (oVar != null) {
                            list = oVar.f156160b;
                        } else {
                            list = null;
                        }
                        if (list == null) {
                            list = p13.j0.f134944a;
                        }
                    }
                    if (z14) {
                        if (list != null || (listA = p13.h0.N0(list, new s21.q(new s21.p()))) == null) {
                            listA = p13.j0.f134944a;
                        }
                        if (listA.isEmpty()) {
                            b11.n.f14341e.getClass();
                            listA = b11.n.a.a();
                        }
                        list2 = listA;
                    }
                    return new v2.b(new k01.f(cVar2, kVar, list2), 200, null, null, 12, null);
                }
                if (!(v2Var2 instanceof v2.a) && v2Var2 != null) {
                    lc.u0.r();
                    return null;
                }
                list = null;
                if (z14) {
                    if (list != null) {
                        listA = p13.j0.f134944a;
                    } else {
                        listA = p13.j0.f134944a;
                    }
                    if (listA.isEmpty()) {
                        b11.n.f14341e.getClass();
                        listA = b11.n.a.a();
                    }
                    list2 = listA;
                }
                return new v2.b(new k01.f(cVar2, kVar, list2), 200, null, null, 12, null);
            }
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z14 = this.f174561d;
            kVar2 = this.f174560c;
            cVar2 = this.f174559b;
            o13.r.b(obj);
            objAwait = obj;
        }
        v2Var2 = (v2) objAwait;
        kVar = kVar2;
        if (v2Var2 instanceof v2.b) {
            oVar = (s21.o) ((v2.b) v2Var2).f47386a;
            if (oVar != null) {
                if (!oVar.f156159a) {
                    oVar = null;
                }
                if (oVar != null) {
                    list = oVar.f156160b;
                } else {
                    list = null;
                }
                if (list == null) {
                    list = p13.j0.f134944a;
                }
            }
            if (z14) {
                if (list != null) {
                    listA = p13.j0.f134944a;
                } else {
                    listA = p13.j0.f134944a;
                }
                if (listA.isEmpty()) {
                    b11.n.f14341e.getClass();
                    listA = b11.n.a.a();
                }
                list2 = listA;
            }
            return new v2.b(new k01.f(cVar2, kVar, list2), 200, null, null, 12, null);
        }
        if (!(v2Var2 instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        list = null;
        if (z14) {
            if (list != null) {
                listA = p13.j0.f134944a;
            } else {
                listA = p13.j0.f134944a;
            }
            if (listA.isEmpty()) {
                b11.n.f14341e.getClass();
                listA = b11.n.a.a();
            }
            list2 = listA;
        }
        return new v2.b(new k01.f(cVar2, kVar, list2), 200, null, null, 12, null);
        v2 v2Var3 = (v2) objQ;
        if (v2Var3 instanceof v2.b) {
            cVar = (k01.c) ((v2.b) v2Var3).f47386a;
            if (cVar == null) {
                cVar = new k01.c((b63.o) null, (b63.o) null, (List) null, (List) null, (k01.k) null, 31, (p005kotlin.jvm.internal.j) null);
            }
        } else {
            if (!(v2Var3 instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            cVar = null;
        }
        m42.b bVar = w1Var.f174579b;
        this.f174563f = null;
        this.f174558a = i0Var;
        this.f174559b = cVar;
        this.f174561d = z14;
        this.f174562e = 2;
        bVar.getClass();
        objJ = com.garmin.android.apps.connectmobile.f0.J(bVar, new m42.i(oVar3, oVar2, null), this);
        if (objJ != aVar) {
            i0Var2 = i0Var;
            cVar2 = cVar;
            v2Var = (v2) objJ;
            if (v2Var instanceof v2.b) {
                kVar = (l42.k) ((v2.b) v2Var).f47386a;
            } else {
                if (v2Var instanceof v2.a) {
                    lc.u0.r();
                    return null;
                }
                kVar = null;
            }
            if (i0Var2 != null) {
                this.f174563f = null;
                this.f174558a = null;
                this.f174559b = cVar2;
                this.f174560c = kVar;
                this.f174561d = z14;
                this.f174562e = 3;
                objAwait = i0Var2.await(this);
                if (objAwait != aVar) {
                    kVar2 = kVar;
                    v2Var2 = (v2) objAwait;
                    kVar = kVar2;
                }
            } else {
                v2Var2 = null;
            }
            if (v2Var2 instanceof v2.b) {
                oVar = (s21.o) ((v2.b) v2Var2).f47386a;
                if (oVar != null) {
                    if (!oVar.f156159a) {
                        oVar = null;
                    }
                    if (oVar != null) {
                        list = oVar.f156160b;
                    } else {
                        list = null;
                    }
                    if (list == null) {
                        list = p13.j0.f134944a;
                    }
                }
                if (z14) {
                    if (list != null) {
                        listA = p13.j0.f134944a;
                    } else {
                        listA = p13.j0.f134944a;
                    }
                    if (listA.isEmpty()) {
                        b11.n.f14341e.getClass();
                        listA = b11.n.a.a();
                    }
                    list2 = listA;
                }
                return new v2.b(new k01.f(cVar2, kVar, list2), 200, null, null, 12, null);
            }
            if (!(v2Var2 instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            list = null;
            if (z14) {
                if (list != null) {
                    listA = p13.j0.f134944a;
                } else {
                    listA = p13.j0.f134944a;
                }
                if (listA.isEmpty()) {
                    b11.n.f14341e.getClass();
                    listA = b11.n.a.a();
                }
                list2 = listA;
            }
            return new v2.b(new k01.f(cVar2, kVar, list2), 200, null, null, 12, null);
        }
        return aVar;
    }
}
