package r70;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.b1;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.ArrayList;
import java.util.List;
import l70.n0;
import lc.u0;
import o53.b0;
import o70.d0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.c2;
import r53.e2;
import r53.g2;
import r53.k2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lr70/z;", "Landroidx/lifecycle/u1;", "Ll70/n0;", "userFocusRepository", "Laz0/c;", "networkStateObserver", "Lcom/garmin/android/apps/connectmobile/b1;", "featureAvailability", "<init>", "(Ll70/n0;Laz0/c;Lcom/garmin/android/apps/connectmobile/b1;)V", "a", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z extends u1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f151116t = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f151117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final az0.c f151118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b1 f151119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e2 f151120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e2 f151121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j70.r f151122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f151123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b2 f151124h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f151125i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b2 f151126j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f151127k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b2 f151128l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b2 f151129m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p2 f151130n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p2 f151131o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p2 f151132p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p2 f151133q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o13.t f151134r;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.UserFocusViewModel$saveUserFocus$1", f = "UserFocusViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_AC4, 174, 186, TsExtractor.TS_PACKET_SIZE}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f151135a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j70.r f151137c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f151138d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j70.r rVar, boolean z14, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f151137c = rVar;
            this.f151138d = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return z.this.new b(this.f151137c, this.f151138d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x006d A[PHI: r2
          0x006d: PHI (r2v11 java.lang.Object) = (r2v10 java.lang.Object), (r2v21 java.lang.Object) binds: [B:26:0x006a, B:12:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:30:0x0073  */
        /* JADX WARN: Code duplicated, block: B:31:0x0090  */
        /* JADX WARN: Code duplicated, block: B:33:0x0094  */
        /* JADX WARN: Code duplicated, block: B:39:0x00b5  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
        
            if (r10.emit(r2, r16) == r1) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00af, code lost:
        
            if (r3.emit(r2, r16) == r1) goto L36;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objJ0;
            v2 v2Var;
            g3 g3VarA;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f151135a;
            j70.r rVar = this.f151137c;
            z zVar = z.this;
            if (i14 == 0) {
                o13.r.b(obj);
                j70.r rVar2 = zVar.f151122f;
                e2 e2Var = zVar.f151120d;
                if (rVar2 != rVar || this.f151138d) {
                    g3 g3VarC = g3.a.c(g3.f35298f);
                    this.f151135a = 1;
                    if (e2Var.emit(g3VarC, this) != aVar) {
                        n0 n0Var = zVar.f151117a;
                        j70.y yVar = new j70.y(rVar.f97636a, null, 2, null);
                        this.f151135a = 2;
                        objJ0 = n0Var.J0(yVar, this);
                        if (objJ0 != aVar) {
                            v2Var = (v2) objJ0;
                            if (v2Var instanceof v2.b) {
                                ht.s sVar = ht.s.f85508a;
                                lt.c.C2182c c2182c = new lt.c.C2182c(rVar.f97636a);
                                sVar.getClass();
                                ht.s.a(c2182c);
                                zVar.f151122f = rVar;
                                g3.a aVar2 = g3.f35298f;
                                Unit unit = Unit.INSTANCE;
                                aVar2.getClass();
                                g3VarA = g3.a.d(unit);
                            } else {
                                if (!(v2Var instanceof v2.a)) {
                                    u0.r();
                                    return null;
                                }
                                zVar.f151130n.k(null, Boolean.TRUE);
                                g3VarA = g3.a.a(g3.f35298f, null, null, null, null, 15);
                            }
                            e2 e2Var2 = zVar.f151120d;
                            this.f151135a = 3;
                        }
                    }
                } else {
                    g3 g3VarE = g3.a.e(g3.f35298f);
                    this.f151135a = 4;
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                n0 n0Var2 = zVar.f151117a;
                j70.y yVar2 = new j70.y(rVar.f97636a, null, 2, null);
                this.f151135a = 2;
                objJ0 = n0Var2.J0(yVar2, this);
                if (objJ0 != aVar) {
                    v2Var = (v2) objJ0;
                    if (v2Var instanceof v2.b) {
                        ht.s sVar2 = ht.s.f85508a;
                        lt.c.C2182c c2182c2 = new lt.c.C2182c(rVar.f97636a);
                        sVar2.getClass();
                        ht.s.a(c2182c2);
                        zVar.f151122f = rVar;
                        g3.a aVar3 = g3.f35298f;
                        Unit unit2 = Unit.INSTANCE;
                        aVar3.getClass();
                        g3VarA = g3.a.d(unit2);
                    } else {
                        if (!(v2Var instanceof v2.a)) {
                            u0.r();
                            return null;
                        }
                        zVar.f151130n.k(null, Boolean.TRUE);
                        g3VarA = g3.a.a(g3.f35298f, null, null, null, null, 15);
                    }
                    e2 e2Var3 = zVar.f151120d;
                    this.f151135a = 3;
                }
                return aVar;
            }
            if (i14 == 2) {
                o13.r.b(obj);
                objJ0 = obj;
                v2Var = (v2) objJ0;
                if (v2Var instanceof v2.b) {
                    ht.s sVar3 = ht.s.f85508a;
                    lt.c.C2182c c2182c3 = new lt.c.C2182c(rVar.f97636a);
                    sVar3.getClass();
                    ht.s.a(c2182c3);
                    zVar.f151122f = rVar;
                    g3.a aVar4 = g3.f35298f;
                    Unit unit3 = Unit.INSTANCE;
                    aVar4.getClass();
                    g3VarA = g3.a.d(unit3);
                } else {
                    if (!(v2Var instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    zVar.f151130n.k(null, Boolean.TRUE);
                    g3VarA = g3.a.a(g3.f35298f, null, null, null, null, 15);
                }
                e2 e2Var4 = zVar.f151120d;
                this.f151135a = 3;
            } else {
                if (i14 != 3 && i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements r53.i<u70.a[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i[] f151139a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements e23.a<u70.a[]> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i[] f151140a;

            public a(r53.i[] iVarArr) {
                this.f151140a = iVarArr;
            }

            @Override // e23.a
            public final u70.a[] invoke() {
                return new u70.a[this.f151140a.length];
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lr53/j;", "", "it", "", "<anonymous>", "(Lr53/j;Lkotlin/Array;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.UserFocusViewModel$special$$inlined$combine$1$3", f = "UserFocusViewModel.kt", l = {234}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.q<r53.j<? super u70.a[]>, u70.a[], t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f151141a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ r53.j f151142b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object[] f151143c;

            public b(t13.d dVar) {
                super(3, dVar);
            }

            @Override // e23.q
            public final Object invoke(r53.j<? super u70.a[]> jVar, u70.a[] aVarArr, t13.d<? super Unit> dVar) {
                b bVar = new b(dVar);
                bVar.f151142b = jVar;
                bVar.f151143c = aVarArr;
                return bVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f151141a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    r53.j jVar = this.f151142b;
                    u70.a[] aVarArr = (u70.a[]) this.f151143c;
                    this.f151142b = null;
                    this.f151143c = null;
                    this.f151141a = 1;
                    if (jVar.emit(aVarArr, this) == aVar) {
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

        public c(r53.i[] iVarArr) {
            this.f151139a = iVarArr;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super u70.a[]> jVar, t13.d dVar) {
            r53.i[] iVarArr = this.f151139a;
            Object objA = s53.m.a(iVarArr, new a(iVarArr), new b(null), jVar, dVar);
            return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.UserFocusViewModel$special$$inlined$flatMapLatest$1", f = "UserFocusViewModel.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.q<r53.j<? super g3<? extends List<? extends j70.y>>>, u70.a[], t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f151144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ r53.j f151145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f151146c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ z f151147d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(t13.d dVar, z zVar) {
            super(3, dVar);
            this.f151147d = zVar;
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super g3<? extends List<? extends j70.y>>> jVar, u70.a[] aVarArr, t13.d<? super Unit> dVar) {
            d dVar2 = new d(dVar, this.f151147d);
            dVar2.f151145b = jVar;
            dVar2.f151146c = aVarArr;
            return dVar2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f151144a;
            if (i14 == 0) {
                o13.r.b(obj);
                r53.j jVar = this.f151145b;
                c2 c2Var = new c2(this.f151147d.new g(((u70.a[]) this.f151146c)[0], null));
                this.f151145b = null;
                this.f151146c = null;
                this.f151144a = 1;
                if (r53.s.v(jVar, c2Var, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/g3;", "Lj70/r;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.UserFocusViewModel$userFocus$1", f = "UserFocusViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<r53.j<? super g3<? extends j70.r>>, t13.d<? super Unit>, Object> {
        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return z.this.new e(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super g3<? extends j70.r>> jVar, t13.d<? super Unit> dVar) {
            return ((e) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            int i14 = z.f151116t;
            z zVar = z.this;
            zVar.getClass();
            ge1.b.T(v1.a(zVar), null, null, new a0(zVar, null), 3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00002\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/g3;", "", "Lj70/y;", "suggestedFocuses", "Lj70/r;", "userFocus", "Lo70/d0;", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/g3;Lcom/garmin/android/apps/connectmobile/g3;)Lcom/garmin/android/apps/connectmobile/g3;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.UserFocusViewModel$userFocusInfo$2$1", f = "UserFocusViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.q<g3<? extends List<? extends j70.y>>, g3<? extends j70.r>, t13.d<? super g3<? extends d0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ g3 f151149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ g3 f151150b;

        public f(t13.d<? super f> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(g3<? extends List<? extends j70.y>> g3Var, g3<? extends j70.r> g3Var2, t13.d<? super g3<? extends d0>> dVar) {
            f fVar = z.this.new f(dVar);
            fVar.f151149a = g3Var;
            fVar.f151150b = g3Var2;
            return fVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            g3 g3VarC;
            fw.p pVar;
            List list;
            g3 g3Var = this.f151149a;
            g3 g3Var2 = this.f151150b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            fw.p pVar2 = g3Var.f35300a;
            fw.p pVar3 = fw.p.LOADING;
            if (pVar2 == pVar3 || (pVar = g3Var2.f35300a) == pVar3) {
                g3VarC = g3.a.c(g3.f35298f);
            } else {
                fw.p pVar4 = fw.p.SUCCESS;
                if (pVar2 == pVar4 && pVar == pVar4) {
                    j70.r rVar = (j70.r) g3Var2.f35301b;
                    if (rVar != null && (list = (List) g3Var.f35301b) != null) {
                        g3.a aVar2 = g3.f35298f;
                        d0 d0Var = new d0(rVar, list);
                        aVar2.getClass();
                        g3VarC = g3.a.d(d0Var);
                    }
                    return g3.a.a(g3.f35298f, null, null, null, null, 15);
                }
                g3VarC = g3.a.a(g3.f35298f, null, null, null, null, 15);
            }
            z.this.y4(g3VarC.f35300a == fw.p.ERROR);
            return g3VarC;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "Lj70/y;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.UserFocusViewModel$userSuggestedFocuses$2$1", f = "UserFocusViewModel.kt", l = {71, 72, 115}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.p<r53.j<? super g3<? extends List<? extends j70.y>>>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f151152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f151153b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ u70.a f151155d;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f151156a;

            static {
                int[] iArr = new int[u70.a.values().length];
                try {
                    iArr[u70.a.IN_FOCUS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[u70.a.ESSENTIALS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f151156a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(u70.a aVar, t13.d<? super g> dVar) {
            super(2, dVar);
            this.f151155d = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            g gVar = z.this.new g(this.f151155d, dVar);
            gVar.f151153b = obj;
            return gVar;
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super g3<? extends List<? extends j70.y>>> jVar, t13.d<? super Unit> dVar) {
            return ((g) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0052  */
        /* JADX WARN: Code duplicated, block: B:24:0x0067  */
        /* JADX WARN: Code duplicated, block: B:29:0x008a  */
        /* JADX WARN: Code duplicated, block: B:31:0x008f  */
        /* JADX WARN: Code duplicated, block: B:32:0x0091  */
        /* JADX WARN: Code duplicated, block: B:34:0x009b  */
        /* JADX WARN: Code duplicated, block: B:36:0x009f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:42:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:55:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:58:0x00fb  */
        /* JADX WARN: Code duplicated, block: B:59:0x0100  */
        /* JADX WARN: Code duplicated, block: B:62:0x0113  */
        /* JADX WARN: Code duplicated, block: B:64:0x0128  */
        /* JADX WARN: Code duplicated, block: B:65:0x012a  */
        /* JADX WARN: Code duplicated, block: B:67:0x0135  */
        /* JADX WARN: Code duplicated, block: B:70:0x013b  */
        /* JADX WARN: Code duplicated, block: B:71:0x0140 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:72:0x0142  */
        /* JADX WARN: Code duplicated, block: B:73:0x0144  */
        /* JADX WARN: Code duplicated, block: B:75:0x014f  */
        /* JADX WARN: Code duplicated, block: B:76:0x0152  */
        /* JADX WARN: Code duplicated, block: B:77:0x0155  */
        /* JADX WARN: Code duplicated, block: B:78:0x0158  */
        /* JADX WARN: Code duplicated, block: B:79:0x015b  */
        /* JADX WARN: Code duplicated, block: B:83:0x0171  */
        /* JADX WARN: Code duplicated, block: B:85:0x0175  */
        /* JADX WARN: Code duplicated, block: B:91:0x0193  */
        /* JADX WARN: Code duplicated, block: B:93:0x007c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:95:0x0061 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x018d, code lost:
        
            if (r0.emit(r14, r13) == r1) goto L88;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            v2 v2Var;
            g3 g3VarA;
            ArrayList<j70.y> arrayList;
            u70.a aVar;
            int i14;
            ArrayList arrayList2;
            j70.r rVarA;
            int i15;
            int i16;
            j70.r rVar;
            String userFocus;
            j70.r rVarA2;
            int i17;
            String userFocus2;
            r53.j jVar = (r53.j) this.f151153b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i18 = this.f151152a;
            z zVar = z.this;
            if (i18 == 0) {
                o13.r.b(obj);
                g3 g3VarC = g3.a.c(g3.f35298f);
                this.f151153b = jVar;
                this.f151152a = 1;
                if (jVar.emit(g3VarC, this) != aVar2) {
                }
                return aVar2;
            }
            if (i18 == 1) {
                o13.r.b(obj);
            } else if (i18 == 2) {
                o13.r.b(obj);
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    Iterable iterable = (Iterable) ((v2.b) v2Var).f47386a;
                    arrayList = new ArrayList();
                    for (Object obj2 : iterable) {
                        if (!p005kotlin.jvm.internal.s.g(((j70.y) obj2).getUserFocus(), j70.r.f97629l.f97636a)) {
                            arrayList.add(obj2);
                        }
                    }
                    if (zVar.f151124h.f150540a.getValue() != null) {
                        aVar = this.f151155d;
                        if (aVar == null) {
                            i14 = -1;
                        } else {
                            i14 = a.f151156a[aVar.ordinal()];
                        }
                        if (i14 != -1) {
                            if (i14 != 1) {
                                arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                for (j70.y yVar : arrayList) {
                                    j70.r.a aVar3 = j70.r.f97623f;
                                    String userFocus3 = yVar.getUserFocus();
                                    aVar3.getClass();
                                    rVarA = j70.r.a.a(userFocus3);
                                    if (rVarA == null) {
                                        i15 = -1;
                                    } else {
                                        i15 = j70.z.a.f97677a[rVarA.ordinal()];
                                    }
                                    switch (i15) {
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                            if (rVarA == null) {
                                                i16 = -1;
                                            } else {
                                                i16 = j70.z.a.f97677a[rVarA.ordinal()];
                                            }
                                            switch (i16) {
                                                case 6:
                                                    rVar = j70.r.f97624g;
                                                    break;
                                                case 7:
                                                    rVar = j70.r.f97625h;
                                                    break;
                                                case 8:
                                                    rVar = j70.r.f97626i;
                                                    break;
                                                case 9:
                                                    rVar = j70.r.f97627j;
                                                    break;
                                                default:
                                                    rVar = j70.r.f97624g;
                                                    break;
                                            }
                                            userFocus = rVar.f97636a;
                                            break;
                                        default:
                                            if (rVarA != null || (userFocus = rVarA.f97636a) == null) {
                                                userFocus = yVar.getUserFocus();
                                            }
                                            break;
                                    }
                                    arrayList2.add(j70.y.a(yVar, userFocus));
                                }
                            } else {
                                if (i14 == 2) {
                                    u0.r();
                                    return null;
                                }
                                arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                for (j70.y yVar2 : arrayList) {
                                    j70.r.a aVar4 = j70.r.f97623f;
                                    String userFocus4 = yVar2.getUserFocus();
                                    aVar4.getClass();
                                    rVarA2 = j70.r.a.a(userFocus4);
                                    if (rVarA2 == null) {
                                        i17 = -1;
                                    } else {
                                        i17 = j70.z.a.f97677a[rVarA2.ordinal()];
                                    }
                                    if (i17 != 1 || i17 == 2 || i17 == 3 || i17 == 4 || i17 == 5) {
                                        userFocus2 = j70.z.b(rVarA2).f97636a;
                                    } else if (rVarA2 == null || (userFocus2 = rVarA2.f97636a) == null) {
                                        userFocus2 = yVar2.getUserFocus();
                                    }
                                    arrayList2.add(j70.y.a(yVar2, userFocus2));
                                }
                            }
                            arrayList = arrayList2;
                        }
                    }
                    g3.f35298f.getClass();
                    g3VarA = g3.a.d(arrayList);
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    zVar.y4(true);
                    g3VarA = g3.a.a(g3.f35298f, null, null, null, null, 15);
                }
                this.f151153b = null;
                this.f151152a = 3;
            } else {
                if (i18 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            n0 n0Var = zVar.f151117a;
            this.f151153b = jVar;
            this.f151152a = 2;
            obj = n0Var.r3(this);
            if (obj != aVar2) {
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    Iterable iterable2 = (Iterable) ((v2.b) v2Var).f47386a;
                    arrayList = new ArrayList();
                    while (r14.hasNext()) {
                        if (!p005kotlin.jvm.internal.s.g(((j70.y) obj2).getUserFocus(), j70.r.f97629l.f97636a)) {
                            arrayList.add(obj2);
                        }
                    }
                    if (zVar.f151124h.f150540a.getValue() != null) {
                        aVar = this.f151155d;
                        if (aVar == null) {
                            i14 = -1;
                        } else {
                            i14 = a.f151156a[aVar.ordinal()];
                        }
                        if (i14 != -1) {
                            if (i14 != 1) {
                                arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                while (r2.hasNext()) {
                                    j70.r.a aVar5 = j70.r.f97623f;
                                    String userFocus5 = yVar.getUserFocus();
                                    aVar5.getClass();
                                    rVarA = j70.r.a.a(userFocus5);
                                    if (rVarA == null) {
                                        i15 = -1;
                                    } else {
                                        i15 = j70.z.a.f97677a[rVarA.ordinal()];
                                    }
                                    switch (i15) {
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                            if (rVarA == null) {
                                                i16 = -1;
                                            } else {
                                                i16 = j70.z.a.f97677a[rVarA.ordinal()];
                                            }
                                            switch (i16) {
                                                case 6:
                                                    rVar = j70.r.f97624g;
                                                    break;
                                                case 7:
                                                    rVar = j70.r.f97625h;
                                                    break;
                                                case 8:
                                                    rVar = j70.r.f97626i;
                                                    break;
                                                case 9:
                                                    rVar = j70.r.f97627j;
                                                    break;
                                                default:
                                                    rVar = j70.r.f97624g;
                                                    break;
                                            }
                                            userFocus = rVar.f97636a;
                                            break;
                                        default:
                                            if (rVarA != null) {
                                                userFocus = yVar.getUserFocus();
                                            } else {
                                                userFocus = yVar.getUserFocus();
                                            }
                                            break;
                                    }
                                    arrayList2.add(j70.y.a(yVar, userFocus));
                                }
                            } else {
                                if (i14 == 2) {
                                    u0.r();
                                    return null;
                                }
                                arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                while (r2.hasNext()) {
                                    j70.r.a aVar6 = j70.r.f97623f;
                                    String userFocus6 = yVar2.getUserFocus();
                                    aVar6.getClass();
                                    rVarA2 = j70.r.a.a(userFocus6);
                                    if (rVarA2 == null) {
                                        i17 = -1;
                                    } else {
                                        i17 = j70.z.a.f97677a[rVarA2.ordinal()];
                                    }
                                    if (i17 != 1) {
                                        userFocus2 = j70.z.b(rVarA2).f97636a;
                                    } else {
                                        userFocus2 = j70.z.b(rVarA2).f97636a;
                                    }
                                    arrayList2.add(j70.y.a(yVar2, userFocus2));
                                }
                            }
                            arrayList = arrayList2;
                        }
                    }
                    g3.f35298f.getClass();
                    g3VarA = g3.a.d(arrayList);
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    zVar.y4(true);
                    g3VarA = g3.a.a(g3.f35298f, null, null, null, null, 15);
                }
                this.f151153b = null;
                this.f151152a = 3;
            }
            return aVar2;
        }
    }

    static {
        new a(null);
    }

    public z(n0 n0Var, az0.c cVar, b1 b1Var) {
        n0Var.getClass();
        cVar.getClass();
        b1Var.getClass();
        this.f151117a = n0Var;
        this.f151118b = cVar;
        this.f151119c = b1Var;
        e2 e2VarB = g2.b(0, 0, null, 7);
        this.f151120d = e2VarB;
        this.f151121e = e2VarB;
        p2 p2VarA = q2.a(null);
        this.f151123g = p2VarA;
        b2 b2VarD = r53.s.d(p2VarA);
        this.f151124h = b2VarD;
        Boolean bool = Boolean.FALSE;
        p2 p2VarA2 = q2.a(bool);
        this.f151125i = p2VarA2;
        this.f151126j = r53.s.d(p2VarA2);
        p2VarA2.k(null, Boolean.valueOf(b1Var.I0()));
        p2 p2VarA3 = q2.a(g3.a.c(g3.f35298f));
        this.f151127k = p2VarA3;
        r53.v vVar = new r53.v(new e(null), p2VarA3);
        w9.a aVarA = v1.a(this);
        k2.a aVar = k2.f150703a;
        this.f151128l = r53.s.K(vVar, aVarA, k2.a.a(aVar, 2), g3.a.b(null));
        this.f151129m = r53.s.K(r53.s.N(new c(new r53.i[]{b2VarD}), new d(null, this)), v1.a(this), k2.a.a(aVar, 2), g3.a.b(null));
        p2 p2VarA4 = q2.a(bool);
        this.f151130n = p2VarA4;
        this.f151131o = p2VarA4;
        p2 p2VarA5 = q2.a(bool);
        this.f151132p = p2VarA5;
        this.f151133q = p2VarA5;
        this.f151134r = o13.m.b(new y(this, 0));
    }

    public final void x4(j70.r rVar, boolean z14) {
        rVar.getClass();
        ge1.b.T(v1.a(this), null, null, new b(rVar, z14, null), 3);
    }

    public final void y4(boolean z14) {
        this.f151132p.k(null, Boolean.valueOf(z14));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lr70/z$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
