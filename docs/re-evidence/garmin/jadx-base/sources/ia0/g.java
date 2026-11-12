package ia0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import e23.p;
import java.util.ArrayList;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import p13.x;
import p13.y;
import r53.b2;
import r53.i;
import r53.j;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;
import r53.v;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lia0/g;", "Landroidx/lifecycle/u1;", "", "unitId", "Lh90/a;", "activityOptionsConfig", "Ly80/d;", "repository", "<init>", "(JLh90/a;Ly80/d;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f92423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h90.a f92424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y80.d f92425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<z80.g> f92426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f92427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b2 f92428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f92429g;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements i<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f92430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f92431b;

        /* JADX INFO: renamed from: ia0.g$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C1765a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j f92432a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f92433b;

            /* JADX INFO: renamed from: ia0.g$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.activityoptions.ActivityOptionsViewModel$special$$inlined$map$1$2", f = "ActivityOptionsViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C1766a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f92434a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f92435b;

                public C1766a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f92434a = obj;
                    this.f92435b |= Integer.MIN_VALUE;
                    return C1765a.this.emit(null, this);
                }
            }

            public C1765a(j jVar, g gVar) {
                this.f92432a = jVar;
                this.f92433b = gVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C1766a c1766a;
                int i14;
                if (dVar instanceof C1766a) {
                    c1766a = (C1766a) dVar;
                    int i15 = c1766a.f92435b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        c1766a.f92435b = i15 - Integer.MIN_VALUE;
                    } else {
                        c1766a = new C1766a(dVar);
                    }
                } else {
                    c1766a = new C1766a(dVar);
                }
                Object obj2 = c1766a.f92434a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i16 = c1766a.f92435b;
                if (i16 == 0) {
                    r.b(obj2);
                    h90.a aVar2 = this.f92433b.f92424b;
                    int i17 = aVar2.f82514d;
                    int i18 = aVar2.f82513c;
                    List<j90.b> list = ((ia0.b) obj).f92408a;
                    boolean z14 = false;
                    if (list == null || !list.isEmpty()) {
                        i14 = 0;
                        for (j90.b bVar : list) {
                            if (bVar.f97790c || bVar.f97789b) {
                                i14++;
                                if (i14 < 0) {
                                    x.p();
                                    throw null;
                                }
                            }
                        }
                    } else {
                        i14 = 0;
                    }
                    if (i17 <= i14 && i14 <= i18) {
                        z14 = true;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z14);
                    c1766a.f92435b = 1;
                    if (this.f92432a.emit(boolValueOf, c1766a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i16 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public a(i iVar, g gVar) {
            this.f92430a = iVar;
            this.f92431b = gVar;
        }

        @Override // r53.i
        public final Object collect(j<? super Boolean> jVar, t13.d dVar) {
            Object objCollect = this.f92430a.collect(new C1765a(jVar, this.f92431b), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lia0/b;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.activityoptions.ActivityOptionsViewModel$uiState$1", f = "ActivityOptionsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<j<? super ia0.b>, t13.d<? super Unit>, Object> {
        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return g.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(j<? super ia0.b> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            g gVar = g.this;
            gVar.getClass();
            ge1.b.T(v1.a(gVar), null, null, new e(gVar, null), 3);
            return Unit.INSTANCE;
        }
    }

    public g(long j8, h90.a aVar, y80.d dVar) {
        aVar.getClass();
        dVar.getClass();
        this.f92423a = j8;
        this.f92424b = aVar;
        this.f92425c = dVar;
        this.f92426d = j0.f134944a;
        p2 p2VarA = q2.a(new ia0.b(null, false, false, aVar.f82515e, aVar.f82512b, false, true, false, 167, null));
        this.f92427e = p2VarA;
        v vVar = new v(new b(null), p2VarA);
        w9.a aVarA = v1.a(this);
        k2.a aVar2 = k2.f150703a;
        b2 b2VarK = s.K(vVar, aVarA, k2.a.a(aVar2, 2), new ia0.b(null, false, false, aVar.f82515e, aVar.f82512b, false, true, false, 167, null));
        this.f92428f = b2VarK;
        this.f92429g = s.K(new a(b2VarK, this), v1.a(this), k2.a.a(aVar2, 2), Boolean.FALSE);
    }

    public final void x4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f92427e;
            value = p2Var.getValue();
        } while (!p2Var.b(value, ia0.b.a((ia0.b) value, null, false, false, false, false, false, 95)));
    }

    public final void y4(j90.b bVar) {
        p2 p2Var;
        Object value;
        ia0.b bVar2;
        ArrayList arrayList;
        do {
            p2Var = this.f92427e;
            value = p2Var.getValue();
            bVar2 = (ia0.b) value;
            List<j90.b> list = bVar2.f92408a;
            arrayList = new ArrayList(y.r(list, 10));
            for (j90.b bVar3 : list) {
                if (bVar3.f97788a == bVar.f97788a) {
                    bVar3 = bVar;
                }
                arrayList.add(bVar3);
            }
        } while (!p2Var.b(value, ia0.b.a(bVar2, arrayList, false, false, false, false, false, 254)));
    }
}
