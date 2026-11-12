package v01;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2$b;", "Lk01/g;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2$b;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.ReportsWeeklyUseCase$invoke$2", f = "ReportsWeeklyUseCase.kt", l = {36, 41, 46}, m = "invokeSuspend", v = 2)
public final class x1 extends v13.i implements e23.p<o53.b0, t13.d<? super v2.b<? extends k01.g>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o53.i0 f174594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k01.e f174595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l42.e f174596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f174597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f174598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f174599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y1 f174600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b63.o f174601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b63.o f174602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b63.o f174603j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ls21/o;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.ReportsWeeklyUseCase$invoke$2$micronutrientsSettingsTask$1", f = "ReportsWeeklyUseCase.kt", l = {34}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends s21.o>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f174604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y1 f174605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b63.o f174606c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y1 y1Var, b63.o oVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f174605b = y1Var;
            this.f174606c = oVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f174605b, this.f174606c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends s21.o>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f174604a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            t0 t0Var = this.f174605b.f174615d;
            this.f174604a = 1;
            Object objA = t0Var.a(this.f174606c, this);
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(y1 y1Var, b63.o oVar, b63.o oVar2, b63.o oVar3, t13.d<? super x1> dVar) {
        super(2, dVar);
        this.f174600g = y1Var;
        this.f174601h = oVar;
        this.f174602i = oVar2;
        this.f174603j = oVar3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        x1 x1Var = new x1(this.f174600g, this.f174601h, this.f174602i, this.f174603j, dVar);
        x1Var.f174599f = obj;
        return x1Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2.b<? extends k01.g>> dVar) {
        return ((x1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00de  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:65:0x0101  */
    /* JADX WARN: Code duplicated, block: B:67:0x0111  */
    /* JADX WARN: Code duplicated, block: B:70:0x0119  */
    /* JADX WARN: Code duplicated, block: B:74:0x0136  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objN0;
        o53.i0 i0Var;
        boolean z14;
        k01.e eVar;
        Object objJ;
        o53.i0 i0Var2;
        k01.e eVar2;
        v2 v2Var;
        l42.e eVar3;
        v2 v2Var2;
        Object objAwait;
        l42.e eVar4;
        List<s21.n> list;
        List listA;
        s21.o oVar;
        o53.b0 b0Var = (o53.b0) this.f174599f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f174598e;
        b63.o oVar2 = this.f174602i;
        b63.o oVar3 = this.f174601h;
        y1 y1Var = this.f174600g;
        List list2 = null;
        if (i14 == 0) {
            o13.r.b(obj);
            boolean zE = y1Var.f174616e.e();
            o53.j0 j0VarJ = zE ? ge1.b.j(b0Var, null, null, new a(y1Var, this.f174603j, null), 3) : null;
            m01.g gVar = y1Var.f174612a;
            this.f174599f = null;
            this.f174594a = j0VarJ;
            this.f174597d = zE;
            this.f174598e = 1;
            objN0 = gVar.N0(oVar3, oVar2, this);
            if (objN0 != aVar) {
                i0Var = j0VarJ;
                z14 = zE;
            }
            return aVar;
        }
        if (i14 == 1) {
            z14 = this.f174597d;
            i0Var = this.f174594a;
            o13.r.b(obj);
            objN0 = obj;
        } else {
            if (i14 == 2) {
                z14 = this.f174597d;
                eVar2 = this.f174595b;
                o53.i0 i0Var3 = this.f174594a;
                o13.r.b(obj);
                i0Var2 = i0Var3;
                objJ = obj;
                v2Var = (v2) objJ;
                if (v2Var instanceof v2.b) {
                    eVar3 = (l42.e) ((v2.b) v2Var).f47386a;
                } else {
                    if (v2Var instanceof v2.a) {
                        lc.u0.r();
                        return null;
                    }
                    eVar3 = null;
                }
                if (i0Var2 != null) {
                    this.f174599f = null;
                    this.f174594a = null;
                    this.f174595b = eVar2;
                    this.f174596c = eVar3;
                    this.f174597d = z14;
                    this.f174598e = 3;
                    objAwait = i0Var2.await(this);
                    if (objAwait != aVar) {
                        eVar4 = eVar3;
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
                    return new v2.b(new k01.g(eVar2, eVar3, list2), 200, null, null, 12, null);
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
                return new v2.b(new k01.g(eVar2, eVar3, list2), 200, null, null, 12, null);
            }
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z14 = this.f174597d;
            eVar4 = this.f174596c;
            eVar2 = this.f174595b;
            o13.r.b(obj);
            objAwait = obj;
        }
        v2Var2 = (v2) objAwait;
        eVar3 = eVar4;
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
            return new v2.b(new k01.g(eVar2, eVar3, list2), 200, null, null, 12, null);
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
        return new v2.b(new k01.g(eVar2, eVar3, list2), 200, null, null, 12, null);
        v2 v2Var3 = (v2) objN0;
        if (v2Var3 instanceof v2.b) {
            eVar = (k01.e) ((v2.b) v2Var3).f47386a;
        } else {
            if (!(v2Var3 instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            eVar = null;
        }
        m42.b bVar = y1Var.f174613b;
        this.f174599f = null;
        this.f174594a = i0Var;
        this.f174595b = eVar;
        this.f174597d = z14;
        this.f174598e = 2;
        bVar.getClass();
        objJ = com.garmin.android.apps.connectmobile.f0.J(bVar, new m42.j(oVar3, oVar2, null), this);
        if (objJ != aVar) {
            i0Var2 = i0Var;
            eVar2 = eVar;
            v2Var = (v2) objJ;
            if (v2Var instanceof v2.b) {
                eVar3 = (l42.e) ((v2.b) v2Var).f47386a;
            } else {
                if (v2Var instanceof v2.a) {
                    lc.u0.r();
                    return null;
                }
                eVar3 = null;
            }
            if (i0Var2 != null) {
                this.f174599f = null;
                this.f174594a = null;
                this.f174595b = eVar2;
                this.f174596c = eVar3;
                this.f174597d = z14;
                this.f174598e = 3;
                objAwait = i0Var2.await(this);
                if (objAwait != aVar) {
                    eVar4 = eVar3;
                    v2Var2 = (v2) objAwait;
                    eVar3 = eVar4;
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
                return new v2.b(new k01.g(eVar2, eVar3, list2), 200, null, null, 12, null);
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
            return new v2.b(new k01.g(eVar2, eVar3, list2), 200, null, null, 12, null);
        }
        return aVar;
    }
}
