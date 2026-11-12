package ne0;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lpe0/f;", "<anonymous>", "(Lo53/b0;)Lpe0/f;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.domain.GetDogProfileUseCase$invoke$2", f = "GetDogProfileUseCase.kt", l = {27, 29}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.p<o53.b0, t13.d<? super pe0.f>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f125528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f125529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f125530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f125531d;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a8\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo53/b0;", "Lo13/u;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lje0/i;", "Li53/c;", "Lpe0/d;", "<anonymous>", "(Lo53/b0;)Lo13/u;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.domain.GetDogProfileUseCase$invoke$2$1", f = "GetDogProfileUseCase.kt", l = {46, 46, 46}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super o13.u<? extends v2<? extends List<? extends je0.i>>, ? extends v2<? extends List<? extends je0.i>>, ? extends v2<? extends i53.c<? extends pe0.d>>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o53.j0 f125532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public o53.i0 f125533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f125534c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f125535d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f125536e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f125537f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ z f125538g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ long f125539h;

        /* JADX INFO: renamed from: ne0.y$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Li53/c;", "Lpe0/d;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.domain.GetDogProfileUseCase$invoke$2$1$breeds$1", f = "GetDogProfileUseCase.kt", l = {44}, m = "invokeSuspend", v = 2)
        public static final class C2418a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends i53.c<? extends pe0.d>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f125540a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f125541b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2418a(z zVar, t13.d<? super C2418a> dVar) {
                super(2, dVar);
                this.f125541b = zVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C2418a(this.f125541b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends i53.c<? extends pe0.d>>> dVar) {
                return ((C2418a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f125540a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                t tVar = this.f125541b.f125549b;
                this.f125540a = 1;
                Object objA = t.a(tVar, this);
                return objA == aVar ? aVar : objA;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lje0/i;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.domain.GetDogProfileUseCase$invoke$2$1$lifetimeStats$1", f = "GetDogProfileUseCase.kt", l = {39}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends List<? extends je0.i>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f125542a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f125543b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f125544c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(z zVar, long j8, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f125543b = zVar;
                this.f125544c = j8;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f125543b, this.f125544c, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends List<? extends je0.i>>> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f125542a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                me0.w wVar = this.f125543b.f125548a;
                List listC = p13.w.c(new Long(this.f125544c));
                this.f125542a = 1;
                Object objD = me0.w.d(wVar, listC, this);
                return objD == aVar ? aVar : objD;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lje0/i;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.domain.GetDogProfileUseCase$invoke$2$1$sevenDayStats$1", f = "GetDogProfileUseCase.kt", l = {31}, m = "invokeSuspend", v = 2)
        public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends List<? extends je0.i>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f125545a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f125546b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f125547c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(z zVar, long j8, t13.d<? super c> dVar) {
                super(2, dVar);
                this.f125546b = zVar;
                this.f125547c = j8;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new c(this.f125546b, this.f125547c, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends List<? extends je0.i>>> dVar) {
                return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f125545a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                me0.w wVar = this.f125546b.f125548a;
                List listC = p13.w.c(new Long(this.f125547c));
                DateTime dateTimeMinusDays = DateTime.now().minusDays(7);
                DateTime dateTimePlusDays = DateTime.now().plusDays(1);
                this.f125545a = 1;
                wVar.getClass();
                Object objJ = com.garmin.android.apps.connectmobile.f0.J(wVar, new me0.l(wVar, dateTimeMinusDays, dateTimePlusDays, listC, null), this);
                return objJ == aVar ? aVar : objJ;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(z zVar, long j8, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f125538g = zVar;
            this.f125539h = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f125538g, this.f125539h, dVar);
            aVar.f125537f = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super o13.u<? extends v2<? extends List<? extends je0.i>>, ? extends v2<? extends List<? extends je0.i>>, ? extends v2<? extends i53.c<? extends pe0.d>>>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x008e  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o53.i0 i0VarJ;
            o53.j0 j0Var;
            Object obj2;
            o53.i0 i0Var;
            Object objAwait;
            Object obj3;
            Object obj4;
            o53.b0 b0Var = (o53.b0) this.f125537f;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f125536e;
            if (i14 == 0) {
                o13.r.b(obj);
                z zVar = this.f125538g;
                long j8 = this.f125539h;
                o53.j0 j0VarJ = ge1.b.j(b0Var, null, null, new c(zVar, j8, null), 3);
                o53.j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new b(zVar, j8, null), 3);
                i0VarJ = ge1.b.j(b0Var, null, null, new C2418a(zVar, null), 3);
                this.f125537f = null;
                this.f125532a = j0VarJ2;
                this.f125533b = i0VarJ;
                this.f125536e = 1;
                obj = j0VarJ.C(this);
                if (obj != aVar) {
                    j0Var = j0VarJ2;
                }
                return aVar;
            }
            if (i14 == 1) {
                i0VarJ = this.f125533b;
                j0Var = this.f125532a;
                o13.r.b(obj);
            } else {
                if (i14 == 2) {
                    obj2 = this.f125534c;
                    i0Var = this.f125533b;
                    o13.r.b(obj);
                    this.f125537f = null;
                    this.f125532a = null;
                    this.f125533b = null;
                    this.f125534c = obj2;
                    this.f125535d = obj;
                    this.f125536e = 3;
                    objAwait = i0Var.await(this);
                    if (objAwait != aVar) {
                        obj3 = obj2;
                        obj4 = obj;
                        obj = objAwait;
                    }
                    return aVar;
                }
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj4 = this.f125535d;
                obj3 = this.f125534c;
                o13.r.b(obj);
            }
            return new o13.u(obj3, obj4, obj);
            this.f125537f = null;
            this.f125532a = null;
            this.f125533b = i0VarJ;
            this.f125534c = obj;
            this.f125536e = 2;
            Object objAwait2 = j0Var.await(this);
            if (objAwait2 != aVar) {
                o53.i0 i0Var2 = i0VarJ;
                obj2 = obj;
                obj = objAwait2;
                i0Var = i0Var2;
                this.f125537f = null;
                this.f125532a = null;
                this.f125533b = null;
                this.f125534c = obj2;
                this.f125535d = obj;
                this.f125536e = 3;
                objAwait = i0Var.await(this);
                if (objAwait != aVar) {
                    obj3 = obj2;
                    obj4 = obj;
                    obj = objAwait;
                    return new o13.u(obj3, obj4, obj);
                }
            }
            return aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, long j8, t13.d<? super y> dVar) {
        super(2, dVar);
        this.f125530c = zVar;
        this.f125531d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y(this.f125530c, this.f125531d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super pe0.f> dVar) {
        return ((y) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x019c  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:119:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:123:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0124  */
    /* JADX WARN: Code duplicated, block: B:73:0x012b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0139  */
    /* JADX WARN: Code duplicated, block: B:79:0x0140  */
    /* JADX WARN: Code duplicated, block: B:82:0x014a  */
    /* JADX WARN: Code duplicated, block: B:87:0x015f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0164  */
    /* JADX WARN: Code duplicated, block: B:93:0x0173  */
    /* JADX WARN: Code duplicated, block: B:96:0x0183  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objJ;
        Object objE;
        v2 v2Var;
        v2 v2Var2;
        v2 v2Var3;
        v2 v2Var4;
        pe0.i iVar;
        pe0.i iVar2;
        Iterable iterable;
        String str;
        je0.d dVar;
        pe0.d dVar2;
        List<je0.d> list;
        i53.c cVarB;
        String str2;
        String str3;
        je0.j jVar;
        LocalDate localDate;
        ArrayList arrayList;
        Iterator it;
        Object next;
        pe0.d dVar3;
        Iterator it3;
        Object next2;
        je0.i iVar3;
        je0.q qVar;
        je0.n nVar;
        je0.p pVar;
        List<je0.a> list2;
        je0.a aVar;
        je0.i iVar4;
        je0.q qVar2;
        je0.n nVar2;
        je0.p pVar2;
        List<je0.a> list3;
        je0.a aVar2;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f125529b;
        long j8 = this.f125531d;
        z zVar = this.f125530c;
        if (i14 == 0) {
            o13.r.b(obj);
            me0.w wVar = zVar.f125548a;
            this.f125529b = 1;
            wVar.getClass();
            objJ = com.garmin.android.apps.connectmobile.f0.J(wVar, new me0.m(wVar, j8, null), this);
            if (objJ != aVar3) {
            }
            return aVar3;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            objJ = obj;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2Var = this.f125528a;
            o13.r.b(obj);
            objE = obj;
        }
        o13.u uVar = (o13.u) objE;
        v2Var2 = (v2) uVar.f128605a;
        v2Var3 = (v2) uVar.f128606b;
        v2Var4 = (v2) uVar.f128607c;
        if (!(v2Var2 instanceof v2.b) && (iVar4 = (je0.i) p13.h0.d0((List) ((v2.b) v2Var2).f47386a)) != null && (qVar2 = iVar4.f98538c) != null && (nVar2 = qVar2.f98564a) != null && (pVar2 = nVar2.f98558a) != null && (list3 = pVar2.f98562a) != null && (aVar2 = (je0.a) p13.h0.d0(list3)) != null) {
            je0.r rVar = aVar2.f98474e;
            Double d14 = rVar != null ? rVar.f98570e : null;
            je0.r rVar2 = aVar2.f98473d;
            iVar = new pe0.i(d14, rVar2 != null ? rVar2.f98570e : null, aVar2.f98471b);
        }
        if (!(v2Var3 instanceof v2.b) && (iVar3 = (je0.i) p13.h0.d0((List) ((v2.b) v2Var3).f47386a)) != null && (qVar = iVar3.f98538c) != null && (nVar = qVar.f98564a) != null && (pVar = nVar.f98558a) != null && (list2 = pVar.f98562a) != null && (aVar = (je0.a) p13.h0.d0(list2)) != null) {
            je0.r rVar3 = aVar.f98474e;
            Double d15 = rVar3 != null ? rVar3.f98570e : null;
            je0.r rVar4 = aVar.f98473d;
            iVar2 = new pe0.i(d15, rVar4 != null ? rVar4.f98570e : null, aVar.f98471b);
        }
        if (v2Var4 instanceof v2.b) {
            iterable = (List) ((v2.b) v2Var4).f47386a;
        } else {
            iterable = p13.j0.f134944a;
        }
        je0.f fVar = (je0.f) ((v2.b) v2Var).f47386a;
        long j14 = fVar.f98501a;
        str = fVar.f98504d;
        if (str == null) {
            str = "";
        }
        String str4 = str;
        dVar = fVar.f98507g;
        if (dVar != null) {
            it3 = iterable.iterator();
            do {
                if (it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (((pe0.d) next2).f137416a != dVar.f98486a);
            dVar2 = (pe0.d) next2;
        } else {
            dVar2 = null;
        }
        list = fVar.f98508h;
        if (list != null) {
            arrayList = new ArrayList();
            for (je0.d dVar4 : list) {
                it = iterable.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((pe0.d) next).f137416a != dVar4.f98486a);
                dVar3 = (pe0.d) next;
                if (dVar3 != null) {
                    arrayList.add(dVar3);
                }
            }
            cVarB = i53.a.e(arrayList);
            if (cVarB == null) {
                cVarB = j53.l.b();
            }
        } else {
            cVarB = j53.l.b();
        }
        i53.c cVar = cVarB;
        je0.g gVar = fVar.f98509i;
        Double d16 = fVar.f98512l;
        str2 = fVar.f98513m;
        if (str2 != null || (localDate = LocalDate.parse(str2)) == null) {
            str3 = null;
        } else {
            Period period = new Period(localDate, new LocalDate(DateTime.now()), PeriodType.yearMonthDay());
            str3 = period.getYears() + "y " + period.getMonths() + "m";
        }
        jVar = fVar.f98515o;
        if (jVar == null) {
            jVar = je0.j.ACTIVE;
        }
        return new pe0.f(j14, str4, dVar2, cVar, gVar, d16, str3, jVar, iVar, iVar2, i53.a.e(p13.j0.f134944a), fVar.f98517q, null, null, 12288, null);
        v2 v2Var5 = (v2) objJ;
        if (!(v2Var5 instanceof v2.b)) {
            q2.u("Failed to fetch dog");
            return null;
        }
        a aVar4 = new a(zVar, j8, null);
        this.f125528a = (v2.b) v2Var5;
        this.f125529b = 2;
        objE = o53.c0.e(aVar4, this);
        if (objE != aVar3) {
            v2Var = v2Var5;
            o13.u uVar2 = (o13.u) objE;
            v2Var2 = (v2) uVar2.f128605a;
            v2Var3 = (v2) uVar2.f128606b;
            v2Var4 = (v2) uVar2.f128607c;
            iVar = !(v2Var2 instanceof v2.b) ? new pe0.i(null, null, null, 7, null) : new pe0.i(null, null, null, 7, null);
            iVar2 = !(v2Var3 instanceof v2.b) ? new pe0.i(null, null, null, 7, null) : new pe0.i(null, null, null, 7, null);
            if (v2Var4 instanceof v2.b) {
                iterable = (List) ((v2.b) v2Var4).f47386a;
            } else {
                iterable = p13.j0.f134944a;
            }
            je0.f fVar2 = (je0.f) ((v2.b) v2Var).f47386a;
            long j15 = fVar2.f98501a;
            str = fVar2.f98504d;
            if (str == null) {
                str = "";
            }
            String str5 = str;
            dVar = fVar2.f98507g;
            if (dVar != null) {
                it3 = iterable.iterator();
                do {
                    if (it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                } while (((pe0.d) next2).f137416a != dVar.f98486a);
                dVar2 = (pe0.d) next2;
            } else {
                dVar2 = null;
            }
            list = fVar2.f98508h;
            if (list != null) {
                arrayList = new ArrayList();
                while (r3.hasNext()) {
                    it = iterable.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((pe0.d) next).f137416a != dVar4.f98486a);
                    dVar3 = (pe0.d) next;
                    if (dVar3 != null) {
                        arrayList.add(dVar3);
                    }
                }
                cVarB = i53.a.e(arrayList);
                if (cVarB == null) {
                    cVarB = j53.l.b();
                }
            } else {
                cVarB = j53.l.b();
            }
            i53.c cVar2 = cVarB;
            je0.g gVar2 = fVar2.f98509i;
            Double d17 = fVar2.f98512l;
            str2 = fVar2.f98513m;
            if (str2 != null) {
                str3 = null;
            } else {
                str3 = null;
            }
            jVar = fVar2.f98515o;
            if (jVar == null) {
                jVar = je0.j.ACTIVE;
            }
            return new pe0.f(j15, str5, dVar2, cVar2, gVar2, d17, str3, jVar, iVar, iVar2, i53.a.e(p13.j0.f134944a), fVar2.f98517q, null, null, 12288, null);
        }
        return aVar3;
    }
}
