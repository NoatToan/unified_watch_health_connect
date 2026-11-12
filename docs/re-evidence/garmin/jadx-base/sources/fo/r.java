package fo;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import b21.v4;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import r53.a2;
import r53.p2;
import r53.q2;
import yc.t2;
import yc.u2;
import yc.v2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lfo/r;", "Landroidx/lifecycle/u1;", "Leo/a;", "activitiesDisplayConfig", "Lco/d;", "deleteActivityUseCase", "Lco/b;", "buildPagerUseCase", "Lao/d;", "repository", "Lf12/l;", "userSettings", "Laz0/c;", "networkStateObserver", "<init>", "(Leo/a;Lco/d;Lco/b;Lao/d;Lf12/l;Laz0/c;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends u1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f72415i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eo.a f72416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final co.d f72417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final co.b f72418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ao.d f72419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f72420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f72421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a2 f72422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r53.i<az0.c.a> f72423h;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.p<Integer, Boolean, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f72424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i53.c<jo.c> f72425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r f72426c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, i53.c<? extends jo.c> cVar, r rVar) {
            this.f72424a = str;
            this.f72425b = cVar;
            this.f72426c = rVar;
        }

        @Override // e23.p
        public final Unit invoke(Integer num, Boolean bool) {
            Object value;
            int iIntValue = num.intValue();
            boolean zBooleanValue = bool.booleanValue();
            if (iIntValue == 0) {
                boolean z14 = false;
                i53.c<jo.c> cVar = this.f72425b;
                if (cVar != null && !cVar.isEmpty()) {
                    Iterator<jo.c> it = cVar.iterator();
                    while (it.hasNext()) {
                        if (it.next().getF99728d()) {
                            z14 = true;
                            break;
                        }
                    }
                }
                new zn.a.e(this.f72424a, z14, iIntValue).a();
            }
            p2 p2Var = this.f72426c.f72420e;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, q.a((q) value, null, false, false, iIntValue, zBooleanValue, null, null, null, null, null, null, 8143)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.history.presentation.ActivitiesListViewModel$special$$inlined$flatMapLatest$1", f = "ActivitiesListViewModel.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.q<r53.j<? super v2<wo0.a>>, t, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f72427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ r53.j f72428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f72429c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r f72430d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(t13.d dVar, r rVar) {
            super(3, dVar);
            this.f72430d = rVar;
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super v2<wo0.a>> jVar, t tVar, t13.d<? super Unit> dVar) {
            c cVar = new c(dVar, this.f72430d);
            cVar.f72428b = jVar;
            cVar.f72429c = tVar;
            return cVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f72427a;
            if (i14 == 0) {
                o13.r.b(obj);
                r53.j jVar = this.f72428b;
                t tVar = (t) this.f72429c;
                String str = tVar.f72439a;
                i53.c<jo.c> cVar = tVar.f72440b;
                jo.f fVar = tVar.f72441c;
                r rVar = this.f72430d;
                co.b bVar = rVar.f72418c;
                eo.a aVar2 = rVar.f72416a;
                b bVar2 = new b(str, cVar, rVar);
                bVar.getClass();
                aVar2.getClass();
                fVar.getClass();
                str.getClass();
                t2 t2Var = new t2(new u2(20, 10, false, 0, 0, 0, 56, null), null, new v4(str, new ao.m(aVar2.f64751a, 0, 20, fVar, aVar2.f64752b, aVar2.f64753c), cVar, bVar, bVar2, 2), 2, null);
                this.f72428b = null;
                this.f72429c = null;
                this.f72427a = 1;
                if (r53.s.v(jVar, t2Var.f196485a, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements r53.i<t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f72431a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f72432a;

            /* JADX INFO: renamed from: fo.r$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.activities.history.presentation.ActivitiesListViewModel$special$$inlined$map$1$2", f = "ActivitiesListViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C1471a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f72433a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f72434b;

                public C1471a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f72433a = obj;
                    this.f72434b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f72432a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C1471a c1471a;
                if (dVar instanceof C1471a) {
                    c1471a = (C1471a) dVar;
                    int i14 = c1471a.f72434b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c1471a.f72434b = i14 - Integer.MIN_VALUE;
                    } else {
                        c1471a = new C1471a(dVar);
                    }
                } else {
                    c1471a = new C1471a(dVar);
                }
                Object obj2 = c1471a.f72433a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c1471a.f72434b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    q qVar = (q) obj;
                    t tVar = new t(qVar.f72403b, qVar.f72412k, qVar.f72408g, qVar.f72405d);
                    c1471a.f72434b = 1;
                    if (this.f72432a.emit(tVar, c1471a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public d(r53.i iVar) {
            this.f72431a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super t> jVar, t13.d dVar) {
            Object objCollect = this.f72431a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public r(eo.a aVar, co.d dVar, co.b bVar, ao.d dVar2, f12.l lVar, az0.c cVar) {
        aVar.getClass();
        dVar.getClass();
        bVar.getClass();
        dVar2.getClass();
        lVar.getClass();
        cVar.getClass();
        this.f72416a = aVar;
        this.f72417b = dVar;
        this.f72418c = bVar;
        this.f72419d = dVar2;
        p2 p2VarA = q2.a(new q(aVar.f64751a, null, false, false, 0, false, null, null, null, null, null, lVar.B3() && (aVar.f64753c == null), i53.a.j(dVar2.a()), 2046, null));
        this.f72420e = p2VarA;
        this.f72421f = p2VarA;
        this.f72422g = yc.o.a(r53.s.N(r53.s.r(new s53.r(new r53.r(new qw0.y(new fh0.b(24), 9), new d(p2VarA), null)), new fn.f(9)), new c(null, this)), v1.a(this));
        this.f72423h = cVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x004f  */
    /* JADX WARN: Code duplicated, block: B:35:0x008c  */
    public static o13.p y4(jo.f fVar, List list) {
        eo.f fVar2;
        List listA;
        jr.p pVar;
        if (list.size() != 1 || !(h0.d0(list) instanceof ho.b.a)) {
            list = null;
        }
        ho.b bVar = list != null ? (ho.b) h0.d0(list) : null;
        ho.b.a aVar = bVar instanceof ho.b.a ? (ho.b.a) bVar : null;
        if (aVar == null || (pVar = aVar.f84584d) == null) {
            fVar2 = null;
        } else {
            eo.f.f64768c.getClass();
            int i14 = eo.f.a.C1378a.f64777a[pVar.ordinal()];
            if (i14 == 1 || i14 == 2) {
                fVar2 = eo.f.DISTANCE;
            } else if (i14 == 3) {
                fVar2 = eo.f.DURATION;
            } else if (i14 != 4) {
                fVar2 = null;
            } else {
                fVar2 = eo.f.MAX_DEPTH;
            }
        }
        if (fVar2 != null) {
            jo.f.f99756c.getClass();
            eo.f fVar3 = eo.f.START_LOCAL;
            eo.g gVar = eo.g.DESCENDING;
            jo.f fVar4 = new jo.f(fVar3, gVar);
            eo.g gVar2 = eo.g.ASCENDING;
            jo.f fVar5 = new jo.f(fVar3, gVar2);
            jo.f fVar6 = new jo.f(fVar2, gVar2);
            jo.f fVar7 = new jo.f(fVar2, gVar);
            eo.f fVar8 = eo.f.NAME;
            listA = p13.x.k(fVar4, fVar5, fVar6, fVar7, new jo.f(fVar8, gVar2), new jo.f(fVar8, gVar));
            if (listA == null) {
                jo.f.f99756c.getClass();
                listA = jo.f.a.a();
            }
        } else {
            jo.f.f99756c.getClass();
            listA = jo.f.a.a();
        }
        if (!listA.contains(fVar)) {
            fVar = new jo.f(null, null, 3, null);
        }
        return new o13.p(fVar, i53.a.j(listA));
    }

    public final void x4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f72420e;
            value = p2Var.getValue();
        } while (!p2Var.b(value, q.a((q) value, null, true, false, 0, false, null, null, null, null, null, null, 8187)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfo/r$a;", "", "<init>", "()V", "", "SEARCH_DEBOUNCE_MS", "J", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
