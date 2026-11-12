package mi0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import e23.p;
import e23.r;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import li0.d0;
import li0.e0;
import li0.l0;
import li0.n0;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.k0;
import p13.u0;
import p13.w;
import r53.p2;
import r53.q2;
import r53.r1;
import yc.i0;
import yc.o;
import yc.t2;
import yc.u2;
import yc.v2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lmi0/a;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "gcm-follow_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends u1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f118681h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ei0.d f118682a = (ei0.d) KoinJavaComponent.get$default(ei0.d.class, null, null, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f118683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f118684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f118685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f118686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f118687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r1 f118688g;

    @Metadata(d1 = {"\u0000 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "", "Lli0/l0;", "tempMap", "", "visibilityMap", "Lyc/v2;", "Lli0/d0;", "list", "<anonymous>", "(Ljava/util/Map;Ljava/util/Map;Lyc/v2;)Lyc/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FollowRequestViewModel$pendingFlow$1", f = "FollowRequestViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements r<Map<String, ? extends l0>, Map<String, ? extends Boolean>, v2<d0>, t13.d<? super v2<d0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Map f118689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Map f118690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ v2 f118691c;

        /* JADX INFO: renamed from: mi0.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lli0/d0;", "data", "<anonymous>", "(Lli0/d0;)Lli0/d0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FollowRequestViewModel$pendingFlow$1$1", f = "FollowRequestViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C2250a extends v13.i implements p<d0, t13.d<? super d0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f118692a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Map<String, l0> f118693b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2250a(Map<String, l0> map, t13.d<? super C2250a> dVar) {
                super(2, dVar);
                this.f118693b = map;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C2250a c2250a = new C2250a(this.f118693b, dVar);
                c2250a.f118692a = obj;
                return c2250a;
            }

            @Override // e23.p
            public final Object invoke(d0 d0Var, t13.d<? super d0> dVar) {
                return ((C2250a) create(d0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                d0 d0Var = (d0) this.f118692a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                return e0.f(d0Var, this.f118693b);
            }
        }

        /* JADX INFO: renamed from: mi0.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lli0/d0;", "data", "", "<anonymous>", "(Lli0/d0;)Z"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FollowRequestViewModel$pendingFlow$1$2", f = "FollowRequestViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C2251b extends v13.i implements p<d0, t13.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f118694a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Map<String, Boolean> f118695b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2251b(Map<String, Boolean> map, t13.d<? super C2251b> dVar) {
                super(2, dVar);
                this.f118695b = map;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C2251b c2251b = new C2251b(this.f118695b, dVar);
                c2251b.f118694a = obj;
                return c2251b;
            }

            @Override // e23.p
            public final Object invoke(d0 d0Var, t13.d<? super Boolean> dVar) {
                return ((C2251b) create(d0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                d0 d0Var = (d0) this.f118694a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                Boolean bool = this.f118695b.get(d0Var.f112650c);
                Boolean bool2 = Boolean.TRUE;
                boolean z14 = false;
                if (!s.g(bool, bool2)) {
                    n0 n0Var = d0Var.f112656i;
                    if (!(n0Var != null ? s.g(n0Var.f112817b, bool2) : false)) {
                        z14 = true;
                    }
                }
                return Boolean.valueOf(z14);
            }
        }

        public b(t13.d<? super b> dVar) {
            super(4, dVar);
        }

        @Override // e23.r
        public final Object invoke(Map<String, ? extends l0> map, Map<String, ? extends Boolean> map2, v2<d0> v2Var, t13.d<? super v2<d0>> dVar) {
            b bVar = new b(dVar);
            bVar.f118689a = map;
            bVar.f118690b = map2;
            bVar.f118691c = v2Var;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Map map = this.f118689a;
            Map map2 = this.f118690b;
            v2 v2Var = this.f118691c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return i0.b(i0.e(v2Var, new C2250a(map, null)), new C2251b(map2, null));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"mi0/a$c", "Lli0/f;", "gcm-follow_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends li0.f {

        /* JADX INFO: renamed from: mi0.a$c$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FollowRequestViewModel$pendingRequestAction$1$setVisibility$1", f = "FollowRequestViewModel.kt", l = {62}, m = "invokeSuspend", v = 2)
        public static final class C2252a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f118697a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f118698b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f118699c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ int f118700d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2252a(a aVar, String str, int i14, t13.d<? super C2252a> dVar) {
                super(2, dVar);
                this.f118698b = aVar;
                this.f118699c = str;
                this.f118700d = i14;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C2252a(this.f118698b, this.f118699c, this.f118700d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C2252a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f118697a;
                a aVar2 = this.f118698b;
                if (i14 == 0) {
                    o13.r.b(obj);
                    LinkedHashMap linkedHashMapN = u0.n((Map) aVar2.f118686e.getValue());
                    int i15 = this.f118700d;
                    linkedHashMapN.put(this.f118699c, Boolean.valueOf(i15 == 8 || i15 == 4));
                    p2 p2Var = aVar2.f118686e;
                    this.f118697a = 1;
                    p2Var.k(null, linkedHashMapN);
                    if (Unit.INSTANCE == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                aVar2.f118684c = true;
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FollowRequestViewModel$pendingRequestAction$1$updateStateData$1", f = "FollowRequestViewModel.kt", l = {51}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f118701a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f118702b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l0 f118703c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f118704d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar, l0 l0Var, String str, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f118702b = aVar;
                this.f118703c = l0Var;
                this.f118704d = str;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f118702b, this.f118703c, this.f118704d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f118701a;
                a aVar2 = this.f118702b;
                if (i14 == 0) {
                    o13.r.b(obj);
                    LinkedHashMap linkedHashMapN = u0.n((Map) aVar2.f118685d.getValue());
                    l0 l0VarA = this.f118703c;
                    n0 n0Var = l0VarA.f112789e;
                    if (n0Var == null || !e0.a(n0Var)) {
                        l0VarA = l0.a(l0VarA, li0.b0.ACCEPT, null, null, 30);
                    }
                    linkedHashMapN.put(this.f118704d, l0VarA);
                    p2 p2Var = aVar2.f118685d;
                    this.f118701a = 1;
                    p2Var.k(null, linkedHashMapN);
                    if (Unit.INSTANCE == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                aVar2.f118683b = true;
                return Unit.INSTANCE;
            }
        }

        public c(b0 b0Var, List<? extends ki0.a.b.EnumC2007a> list, List<? extends ki0.a.b.EnumC2007a> list2) {
            super(b0Var, list, list2);
        }

        @Override // li0.f
        public final void l(int i14, String str) {
            if (str == null) {
                return;
            }
            a aVar = a.this;
            ge1.b.T(v1.a(aVar), null, null, new C2252a(aVar, str, i14, null), 3);
        }

        @Override // li0.f
        public final void n(String str, l0 l0Var) {
            if (str == null || l0Var == null) {
                return;
            }
            a aVar = a.this;
            ge1.b.T(v1.a(aVar), null, null, new b(aVar, l0Var, str, null), 3);
        }
    }

    static {
        new C2249a(null);
        f118681h = 8;
    }

    public a() {
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        p2 p2VarA = q2.a(k0Var);
        this.f118685d = p2VarA;
        p2 p2VarA2 = q2.a(k0Var);
        this.f118686e = p2VarA2;
        this.f118687f = new c(v1.a(this), w.c(ki0.a.b.EnumC2007a.DECLINE_REQUEST), w.c(ki0.a.b.EnumC2007a.DECLINE_REQUEST_REVERTED));
        this.f118688g = r53.s.l(p2VarA, p2VarA2, o.a(new t2(new u2(20, 0, false, 0, 0, 0, 62, null), null, new mh1.i(this, 2), 2, null).f196485a, v1.a(this)), new b(null));
    }

    /* JADX INFO: renamed from: mi0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lmi0/a$a;", "", "<init>", "()V", "", "PAGING_SIZE", "I", "", "TAG", "Ljava/lang/String;", "gcm-follow_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2249a {
        public /* synthetic */ C2249a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2249a() {
        }
    }
}
