package mi0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.mlkit.common.MlKitException;
import d53.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
import p13.k0;
import p13.u0;
import p13.x;
import p13.y;
import r53.a2;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.r1;
import r53.z1;
import yc.h3;
import yc.i0;
import yc.t2;
import yc.u2;
import yc.v2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lmi0/f;", "Landroidx/lifecycle/u1;", "<init>", "()V", "c", "b", "gcm-follow_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends u1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f118765t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ei0.d f118766a = (ei0.d) KoinJavaComponent.get$default(ei0.d.class, null, null, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f118767b = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f118768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f118769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f118770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f118771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f118772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f118773h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f118774i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f118775j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b2 f118776k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p2 f118777l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r53.u1 f118778m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r53.u1 f118779n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p2 f118780o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r53.u1 f118781p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r53.u1 f118782q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r1 f118783r;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendListViewModel$1", f = "FriendListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {
        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return f.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            f.this.x4();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmi0/f$c;", "", "", "requestCount", "", "Lli0/d0;", "requestList", "<init>", "(Ljava/lang/Integer;Ljava/util/List;)V", "gcm-follow_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f118785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<d0> f118786b;

        public c(Integer num, List<d0> list) {
            this.f118785a = num;
            this.f118786b = list;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "Lli0/l0;", "tempMap", "Lyc/v2;", "Lli0/d0;", "list", "<anonymous>", "(Ljava/util/Map;Lyc/v2;)Lyc/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendListViewModel$followerFlow$1", f = "FriendListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.q<Map<String, ? extends l0>, v2<d0>, t13.d<? super v2<d0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Map f118787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ v2 f118788b;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lli0/d0;", "data", "<anonymous>", "(Lli0/d0;)Lli0/d0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendListViewModel$followerFlow$1$1", f = "FriendListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<d0, t13.d<? super d0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f118789a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Map<String, l0> f118790b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Map<String, l0> map, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f118790b = map;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f118790b, dVar);
                aVar.f118789a = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(d0 d0Var, t13.d<? super d0> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                d0 d0Var = (d0) this.f118789a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                return e0.f(d0Var, this.f118790b);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lli0/d0;", "data", "", "<anonymous>", "(Lli0/d0;)Z"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendListViewModel$followerFlow$1$2", f = "FriendListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.p<d0, t13.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f118791a;

            public b(t13.d<? super b> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                b bVar = new b(dVar);
                bVar.f118791a = obj;
                return bVar;
            }

            @Override // e23.p
            public final Object invoke(d0 d0Var, t13.d<? super Boolean> dVar) {
                return ((b) create(d0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                d0 d0Var = (d0) this.f118791a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                n0 n0Var = d0Var.f112656i;
                return Boolean.valueOf(!(n0Var != null ? p005kotlin.jvm.internal.s.g(n0Var.f112817b, Boolean.TRUE) : false));
            }
        }

        public d(t13.d<? super d> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(Map<String, ? extends l0> map, v2<d0> v2Var, t13.d<? super v2<d0>> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f118787a = map;
            dVar2.f118788b = v2Var;
            return dVar2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Map map = this.f118787a;
            v2 v2Var = this.f118788b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return i0.b(i0.e(v2Var, new a(map, null)), new b(null));
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "Lli0/l0;", "tempMap", "Lyc/v2;", "Lli0/d0;", "list", "<anonymous>", "(Ljava/util/Map;Lyc/v2;)Lyc/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendListViewModel$followerQueryFlow$1", f = "FriendListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.q<Map<String, ? extends l0>, v2<d0>, t13.d<? super v2<d0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Map f118792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ v2 f118793b;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lli0/d0;", "data", "<anonymous>", "(Lli0/d0;)Lli0/d0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendListViewModel$followerQueryFlow$1$1", f = "FriendListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<d0, t13.d<? super d0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f118794a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Map<String, l0> f118795b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Map<String, l0> map, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f118795b = map;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f118795b, dVar);
                aVar.f118794a = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(d0 d0Var, t13.d<? super d0> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                d0 d0Var = (d0) this.f118794a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                return e0.f(d0Var, this.f118795b);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lli0/d0;", "data", "", "<anonymous>", "(Lli0/d0;)Z"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendListViewModel$followerQueryFlow$1$2", f = "FriendListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.p<d0, t13.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f118796a;

            public b(t13.d<? super b> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                b bVar = new b(dVar);
                bVar.f118796a = obj;
                return bVar;
            }

            @Override // e23.p
            public final Object invoke(d0 d0Var, t13.d<? super Boolean> dVar) {
                return ((b) create(d0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                d0 d0Var = (d0) this.f118796a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                n0 n0Var = d0Var.f112656i;
                return Boolean.valueOf(!(n0Var != null ? p005kotlin.jvm.internal.s.g(n0Var.f112817b, Boolean.TRUE) : false));
            }
        }

        public e(t13.d<? super e> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(Map<String, ? extends l0> map, v2<d0> v2Var, t13.d<? super v2<d0>> dVar) {
            e eVar = new e(dVar);
            eVar.f118792a = map;
            eVar.f118793b = v2Var;
            return eVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Map map = this.f118792a;
            v2 v2Var = this.f118793b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return i0.b(i0.e(v2Var, new a(map, null)), new b(null));
        }
    }

    /* JADX INFO: renamed from: mi0.f$f, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2256f implements e23.a<h3<Integer, d0>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f118798b;

        public C2256f(String str) {
            this.f118798b = str;
        }

        @Override // e23.a
        public final h3<Integer, d0> invoke() {
            f fVar = f.this;
            return new fi0.q(fVar.f118768c, fVar.f118767b, this.f118798b, fVar.f118766a, fi0.q.a.FOLLOWER, 1, 20);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "Lli0/l0;", "tempMap", "Lyc/v2;", "Lli0/d0;", "list", "<anonymous>", "(Ljava/util/Map;Lyc/v2;)Lyc/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendListViewModel$followingFlow$1", f = "FriendListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.q<Map<String, ? extends l0>, v2<d0>, t13.d<? super v2<d0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Map f118799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ v2 f118800b;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lli0/d0;", "data", "<anonymous>", "(Lli0/d0;)Lli0/d0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendListViewModel$followingFlow$1$1", f = "FriendListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<d0, t13.d<? super d0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f118801a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Map<String, l0> f118802b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Map<String, l0> map, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f118802b = map;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f118802b, dVar);
                aVar.f118801a = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(d0 d0Var, t13.d<? super d0> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                d0 d0Var = (d0) this.f118801a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                return e0.f(d0Var, this.f118802b);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lli0/d0;", "data", "", "<anonymous>", "(Lli0/d0;)Z"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendListViewModel$followingFlow$1$2", f = "FriendListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.p<d0, t13.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f118803a;

            public b(t13.d<? super b> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                b bVar = new b(dVar);
                bVar.f118803a = obj;
                return bVar;
            }

            @Override // e23.p
            public final Object invoke(d0 d0Var, t13.d<? super Boolean> dVar) {
                return ((b) create(d0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                d0 d0Var = (d0) this.f118803a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                n0 n0Var = d0Var.f112656i;
                return Boolean.valueOf(!(n0Var != null ? p005kotlin.jvm.internal.s.g(n0Var.f112817b, Boolean.TRUE) : false));
            }
        }

        public g(t13.d<? super g> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(Map<String, ? extends l0> map, v2<d0> v2Var, t13.d<? super v2<d0>> dVar) {
            g gVar = new g(dVar);
            gVar.f118799a = map;
            gVar.f118800b = v2Var;
            return gVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Map map = this.f118799a;
            v2 v2Var = this.f118800b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return i0.b(i0.e(v2Var, new a(map, null)), new b(null));
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "Lli0/l0;", "tempMap", "Lyc/v2;", "Lli0/d0;", "list", "<anonymous>", "(Ljava/util/Map;Lyc/v2;)Lyc/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendListViewModel$followingQueryFlow$1", f = "FriendListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements e23.q<Map<String, ? extends l0>, v2<d0>, t13.d<? super v2<d0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Map f118804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ v2 f118805b;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lli0/d0;", "data", "<anonymous>", "(Lli0/d0;)Lli0/d0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendListViewModel$followingQueryFlow$1$1", f = "FriendListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<d0, t13.d<? super d0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f118806a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Map<String, l0> f118807b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Map<String, l0> map, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f118807b = map;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f118807b, dVar);
                aVar.f118806a = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(d0 d0Var, t13.d<? super d0> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                d0 d0Var = (d0) this.f118806a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                return e0.f(d0Var, this.f118807b);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lli0/d0;", "data", "", "<anonymous>", "(Lli0/d0;)Z"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendListViewModel$followingQueryFlow$1$2", f = "FriendListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.p<d0, t13.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f118808a;

            public b(t13.d<? super b> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                b bVar = new b(dVar);
                bVar.f118808a = obj;
                return bVar;
            }

            @Override // e23.p
            public final Object invoke(d0 d0Var, t13.d<? super Boolean> dVar) {
                return ((b) create(d0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                d0 d0Var = (d0) this.f118808a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                n0 n0Var = d0Var.f112656i;
                return Boolean.valueOf(!(n0Var != null ? p005kotlin.jvm.internal.s.g(n0Var.f112817b, Boolean.TRUE) : false));
            }
        }

        public h(t13.d<? super h> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(Map<String, ? extends l0> map, v2<d0> v2Var, t13.d<? super v2<d0>> dVar) {
            h hVar = new h(dVar);
            hVar.f118804a = map;
            hVar.f118805b = v2Var;
            return hVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Map map = this.f118804a;
            v2 v2Var = this.f118805b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return i0.b(i0.e(v2Var, new a(map, null)), new b(null));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.a<h3<Integer, d0>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f118810b;

        public i(String str) {
            this.f118810b = str;
        }

        @Override // e23.a
        public final h3<Integer, d0> invoke() {
            f fVar = f.this;
            return new fi0.q(fVar.f118768c, fVar.f118767b, this.f118810b, fVar.f118766a, fi0.q.a.FOLLOWING, 1, 20);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"mi0/f$j", "Lli0/f;", "gcm-follow_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class j extends li0.f {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendListViewModel$friendAction$1$updateStateData$1", f = "FriendListViewModel.kt", l = {62}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f118812a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f118813b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f118814c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ l0 f118815d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar, String str, l0 l0Var, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f118813b = fVar;
                this.f118814c = str;
                this.f118815d = l0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f118813b, this.f118814c, this.f118815d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f118812a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    f fVar = this.f118813b;
                    LinkedHashMap linkedHashMapN = u0.n((Map) fVar.f118768c.getValue());
                    linkedHashMapN.put(this.f118814c, this.f118815d);
                    p2 p2Var = fVar.f118768c;
                    this.f118812a = 1;
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
                return Unit.INSTANCE;
            }
        }

        public j(b0 b0Var) {
            super(b0Var, null, null, 6, null);
        }

        @Override // li0.f
        public final void l(int i14, String str) {
        }

        @Override // li0.f
        public final void n(String str, l0 l0Var) {
            if (str == null || l0Var == null) {
                return;
            }
            f fVar = f.this;
            ge1.b.T(v1.a(fVar), null, null, new a(fVar, str, l0Var, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "", "Lli0/l0;", "tempMap", "", "visibilityMap", "Lmi0/f$c;", "pendingItems", "<anonymous>", "(Ljava/util/Map;Ljava/util/Map;Lmi0/f$c;)Lmi0/f$c;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendListViewModel$pendingRequest$1", f = "FriendListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class k extends v13.i implements e23.r<Map<String, ? extends l0>, Map<String, ? extends Boolean>, c, t13.d<? super c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Map f118816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Map f118817b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ c f118818c;

        public k(t13.d<? super k> dVar) {
            super(4, dVar);
        }

        @Override // e23.r
        public final Object invoke(Map<String, ? extends l0> map, Map<String, ? extends Boolean> map2, c cVar, t13.d<? super c> dVar) {
            k kVar = new k(dVar);
            kVar.f118816a = map;
            kVar.f118817b = map2;
            kVar.f118818c = cVar;
            return kVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            Integer num;
            List<d0> list;
            List<d0> list2;
            Map map = this.f118816a;
            Map map2 = this.f118817b;
            c cVar = this.f118818c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            Integer num2 = null;
            if (cVar == null || (list2 = cVar.f118786b) == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList(y.r(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(e0.f((d0) it.next(), map));
                }
                arrayList = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (!p005kotlin.jvm.internal.s.g(map2.get(((d0) obj2).f112650c), Boolean.TRUE)) {
                        arrayList.add(obj2);
                    }
                }
            }
            int i14 = 0;
            if (cVar != null && (list = cVar.f118786b) != null && !list.isEmpty()) {
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    if (p005kotlin.jvm.internal.s.g(map2.get(((d0) it3.next()).f112650c), Boolean.TRUE) && (i14 = i14 + 1) < 0) {
                        x.p();
                        throw null;
                    }
                }
            }
            if (cVar != null && (num = cVar.f118785a) != null) {
                num2 = new Integer(num.intValue() - i14);
            }
            return new c(num2, arrayList);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"mi0/f$l", "Lli0/f;", "gcm-follow_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class l extends li0.f {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendListViewModel$pendingRequestAction$1$setVisibility$1", f = "FriendListViewModel.kt", l = {125}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f118820a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f118821b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f118822c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ int f118823d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar, String str, int i14, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f118821b = fVar;
                this.f118822c = str;
                this.f118823d = i14;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f118821b, this.f118822c, this.f118823d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f118820a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    f fVar = this.f118821b;
                    LinkedHashMap linkedHashMapN = u0.n((Map) fVar.f118771f.getValue());
                    int i15 = this.f118823d;
                    linkedHashMapN.put(this.f118822c, Boolean.valueOf(i15 == 8 || i15 == 4));
                    p2 p2Var = fVar.f118771f;
                    this.f118820a = 1;
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
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendListViewModel$pendingRequestAction$1$updateStateData$1", f = "FriendListViewModel.kt", l = {116}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f118824a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f118825b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l0 f118826c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f118827d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(f fVar, l0 l0Var, String str, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f118825b = fVar;
                this.f118826c = l0Var;
                this.f118827d = str;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f118825b, this.f118826c, this.f118827d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f118824a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    f fVar = this.f118825b;
                    LinkedHashMap linkedHashMapN = u0.n((Map) fVar.f118769d.getValue());
                    l0 l0VarA = this.f118826c;
                    n0 n0Var = l0VarA.f112789e;
                    if (n0Var == null || !e0.a(n0Var)) {
                        l0VarA = l0.a(l0VarA, li0.b0.ACCEPT, null, null, 30);
                    }
                    linkedHashMapN.put(this.f118827d, l0VarA);
                    p2 p2Var = fVar.f118769d;
                    this.f118824a = 1;
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
                return Unit.INSTANCE;
            }
        }

        public l(b0 b0Var, List<? extends ki0.a.b.EnumC2007a> list, List<? extends ki0.a.b.EnumC2007a> list2) {
            super(b0Var, list, list2);
        }

        @Override // li0.f
        public final boolean h() {
            return true;
        }

        @Override // li0.f
        public final void l(int i14, String str) {
            if (str == null) {
                return;
            }
            f fVar = f.this;
            ge1.b.T(v1.a(fVar), null, null, new a(fVar, str, i14, null), 3);
        }

        @Override // li0.f
        public final void n(String str, l0 l0Var) {
            if (str == null || l0Var == null) {
                return;
            }
            n0 n0Var = l0Var.f112789e;
            boolean zG = n0Var != null ? p005kotlin.jvm.internal.s.g(n0Var.f112817b, Boolean.TRUE) : false;
            f fVar = f.this;
            if (zG) {
                fVar.x4();
            } else {
                ge1.b.T(v1.a(fVar), null, null, new b(fVar, l0Var, str, null), 3);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class m implements r53.i<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f118828a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f118829a;

            /* JADX INFO: renamed from: mi0.f$m$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendListViewModel$special$$inlined$filter$1$2", f = "FriendListViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2257a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f118830a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f118831b;

                public C2257a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f118830a = obj;
                    this.f118831b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f118829a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2257a c2257a;
                if (dVar instanceof C2257a) {
                    c2257a = (C2257a) dVar;
                    int i14 = c2257a.f118831b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2257a.f118831b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2257a = new C2257a(dVar);
                    }
                } else {
                    c2257a = new C2257a(dVar);
                }
                Object obj2 = c2257a.f118830a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2257a.f118831b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    if (((String) obj).length() >= 2) {
                        c2257a.f118831b = 1;
                        if (this.f118829a.emit(obj, c2257a) == aVar) {
                            return aVar;
                        }
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

        public m(r53.i iVar) {
            this.f118828a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super String> jVar, t13.d dVar) {
            Object objCollect = this.f118828a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class n implements r53.i<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f118833a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f118834a;

            /* JADX INFO: renamed from: mi0.f$n$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendListViewModel$special$$inlined$filter$2$2", f = "FriendListViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2258a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f118835a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f118836b;

                public C2258a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f118835a = obj;
                    this.f118836b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f118834a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2258a c2258a;
                if (dVar instanceof C2258a) {
                    c2258a = (C2258a) dVar;
                    int i14 = c2258a.f118836b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2258a.f118836b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2258a = new C2258a(dVar);
                    }
                } else {
                    c2258a = new C2258a(dVar);
                }
                Object obj2 = c2258a.f118835a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2258a.f118836b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    if (((String) obj).length() >= 2) {
                        c2258a.f118836b = 1;
                        if (this.f118834a.emit(obj, c2258a) == aVar) {
                            return aVar;
                        }
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

        public n(r53.i iVar) {
            this.f118833a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super String> jVar, t13.d dVar) {
            Object objCollect = this.f118833a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendListViewModel$special$$inlined$flatMapLatest$1", f = "FriendListViewModel.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
    public static final class o extends v13.i implements e23.q<r53.j<? super v2<d0>>, String, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f118838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ r53.j f118839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f118840c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f f118841d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(t13.d dVar, f fVar) {
            super(3, dVar);
            this.f118841d = fVar;
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super v2<d0>> jVar, String str, t13.d<? super Unit> dVar) {
            o oVar = new o(dVar, this.f118841d);
            oVar.f118839b = jVar;
            oVar.f118840c = str;
            return oVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f118838a;
            if (i14 == 0) {
                o13.r.b(obj);
                r53.j jVar = this.f118839b;
                String str = (String) this.f118840c;
                u2 u2Var = new u2(20, 0, false, 0, 0, 0, 62, null);
                f fVar = this.f118841d;
                a2 a2VarA = yc.o.a(new t2(u2Var, null, fVar.new C2256f(str), 2, null).f196485a, v1.a(fVar));
                this.f118839b = null;
                this.f118840c = null;
                this.f118838a = 1;
                if (r53.s.v(jVar, a2VarA, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendListViewModel$special$$inlined$flatMapLatest$2", f = "FriendListViewModel.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
    public static final class p extends v13.i implements e23.q<r53.j<? super v2<d0>>, String, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f118842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ r53.j f118843b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f118844c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f f118845d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(t13.d dVar, f fVar) {
            super(3, dVar);
            this.f118845d = fVar;
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super v2<d0>> jVar, String str, t13.d<? super Unit> dVar) {
            p pVar = new p(dVar, this.f118845d);
            pVar.f118843b = jVar;
            pVar.f118844c = str;
            return pVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f118842a;
            if (i14 == 0) {
                o13.r.b(obj);
                r53.j jVar = this.f118843b;
                String str = (String) this.f118844c;
                u2 u2Var = new u2(20, 0, false, 0, 0, 0, 62, null);
                f fVar = this.f118845d;
                a2 a2VarA = yc.o.a(new t2(u2Var, null, fVar.new i(str), 2, null).f196485a, v1.a(fVar));
                this.f118843b = null;
                this.f118844c = null;
                this.f118842a = 1;
                if (r53.s.v(jVar, a2VarA, this) == aVar) {
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
    public static final class q implements r53.i<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f118846a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f118847a;

            /* JADX INFO: renamed from: mi0.f$q$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendListViewModel$special$$inlined$map$1$2", f = "FriendListViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2259a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f118848a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f118849b;

                public C2259a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f118848a = obj;
                    this.f118849b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f118847a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2259a c2259a;
                if (dVar instanceof C2259a) {
                    c2259a = (C2259a) dVar;
                    int i14 = c2259a.f118849b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2259a.f118849b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2259a = new C2259a(dVar);
                    }
                } else {
                    c2259a = new C2259a(dVar);
                }
                Object obj2 = c2259a.f118848a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2259a.f118849b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    String string = w.i0((String) obj).toString();
                    c2259a.f118849b = 1;
                    if (this.f118847a.emit(string, c2259a) == aVar) {
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

        public q(r53.i iVar) {
            this.f118846a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super String> jVar, t13.d dVar) {
            Object objCollect = this.f118846a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class r implements r53.i<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f118851a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f118852a;

            /* JADX INFO: renamed from: mi0.f$r$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendListViewModel$special$$inlined$map$2$2", f = "FriendListViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2260a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f118853a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f118854b;

                public C2260a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f118853a = obj;
                    this.f118854b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f118852a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2260a c2260a;
                if (dVar instanceof C2260a) {
                    c2260a = (C2260a) dVar;
                    int i14 = c2260a.f118854b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2260a.f118854b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2260a = new C2260a(dVar);
                    }
                } else {
                    c2260a = new C2260a(dVar);
                }
                Object obj2 = c2260a.f118853a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2260a.f118854b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    String string = w.i0((String) obj).toString();
                    c2260a.f118854b = 1;
                    if (this.f118852a.emit(string, c2260a) == aVar) {
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

        public r(r53.i iVar) {
            this.f118851a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super String> jVar, t13.d dVar) {
            Object objCollect = this.f118851a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "", "Lli0/l0;", "tempMap", "", "visibilityMap", "Lyc/v2;", "Lli0/d0;", "list", "<anonymous>", "(Ljava/util/Map;Ljava/util/Map;Lyc/v2;)Lyc/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendListViewModel$suggestedFlow$1", f = "FriendListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class s extends v13.i implements e23.r<Map<String, ? extends l0>, Map<String, ? extends Boolean>, v2<d0>, t13.d<? super v2<d0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Map f118856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Map f118857b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ v2 f118858c;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lli0/d0;", "data", "<anonymous>", "(Lli0/d0;)Lli0/d0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendListViewModel$suggestedFlow$1$1", f = "FriendListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<d0, t13.d<? super d0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f118859a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Map<String, l0> f118860b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Map<String, l0> map, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f118860b = map;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f118860b, dVar);
                aVar.f118859a = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(d0 d0Var, t13.d<? super d0> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                d0 d0Var = (d0) this.f118859a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                return e0.f(d0Var, this.f118860b);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lli0/d0;", "data", "", "<anonymous>", "(Lli0/d0;)Z"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendListViewModel$suggestedFlow$1$2", f = "FriendListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.p<d0, t13.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f118861a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Map<String, Boolean> f118862b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Map<String, Boolean> map, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f118862b = map;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                b bVar = new b(this.f118862b, dVar);
                bVar.f118861a = obj;
                return bVar;
            }

            @Override // e23.p
            public final Object invoke(d0 d0Var, t13.d<? super Boolean> dVar) {
                return ((b) create(d0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                d0 d0Var = (d0) this.f118861a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                Boolean bool = this.f118862b.get(d0Var.f112650c);
                Boolean bool2 = Boolean.TRUE;
                boolean z14 = false;
                if (!p005kotlin.jvm.internal.s.g(bool, bool2)) {
                    n0 n0Var = d0Var.f112656i;
                    if (!(n0Var != null ? p005kotlin.jvm.internal.s.g(n0Var.f112817b, bool2) : false)) {
                        z14 = true;
                    }
                }
                return Boolean.valueOf(z14);
            }
        }

        public s(t13.d<? super s> dVar) {
            super(4, dVar);
        }

        @Override // e23.r
        public final Object invoke(Map<String, ? extends l0> map, Map<String, ? extends Boolean> map2, v2<d0> v2Var, t13.d<? super v2<d0>> dVar) {
            s sVar = new s(dVar);
            sVar.f118856a = map;
            sVar.f118857b = map2;
            sVar.f118858c = v2Var;
            return sVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Map map = this.f118856a;
            Map map2 = this.f118857b;
            v2 v2Var = this.f118858c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return i0.b(i0.e(v2Var, new a(map, null)), new b(map2, null));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"mi0/f$t", "Lli0/f;", "gcm-follow_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class t extends li0.f {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendListViewModel$suggestedFriendAction$1$setVisibility$1", f = "FriendListViewModel.kt", l = {86}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f118864a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f118865b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f118866c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ int f118867d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar, String str, int i14, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f118865b = fVar;
                this.f118866c = str;
                this.f118867d = i14;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f118865b, this.f118866c, this.f118867d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f118864a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    f fVar = this.f118865b;
                    LinkedHashMap linkedHashMapN = u0.n((Map) fVar.f118770e.getValue());
                    int i15 = this.f118867d;
                    linkedHashMapN.put(this.f118866c, Boolean.valueOf(i15 == 8 || i15 == 4));
                    p2 p2Var = fVar.f118770e;
                    this.f118864a = 1;
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
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendListViewModel$suggestedFriendAction$1$updateStateData$1", f = "FriendListViewModel.kt", l = {77}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f118868a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f118869b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f118870c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ l0 f118871d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(f fVar, String str, l0 l0Var, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f118869b = fVar;
                this.f118870c = str;
                this.f118871d = l0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f118869b, this.f118870c, this.f118871d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f118868a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    f fVar = this.f118869b;
                    LinkedHashMap linkedHashMapN = u0.n((Map) fVar.f118768c.getValue());
                    linkedHashMapN.put(this.f118870c, this.f118871d);
                    p2 p2Var = fVar.f118768c;
                    this.f118868a = 1;
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
                return Unit.INSTANCE;
            }
        }

        public t(b0 b0Var, List<? extends ki0.a.b.EnumC2007a> list) {
            super(b0Var, list, null, 4, null);
        }

        @Override // li0.f
        public final boolean h() {
            return true;
        }

        @Override // li0.f
        public final void l(int i14, String str) {
            if (str == null) {
                return;
            }
            f fVar = f.this;
            ge1.b.T(v1.a(fVar), null, null, new a(fVar, str, i14, null), 3);
        }

        @Override // li0.f
        public final void n(String str, l0 l0Var) {
            if (str == null || l0Var == null) {
                return;
            }
            f fVar = f.this;
            ge1.b.T(v1.a(fVar), null, null, new b(fVar, str, l0Var, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendListViewModel$updatePendingRequest$1", f = "FriendListViewModel.kt", l = {271, 281, MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE, 282}, m = "invokeSuspend", v = 2)
    public static final class u extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public hi0.k f118872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public f f118873b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Collection f118874c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Iterator f118875d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d0 f118876e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public z1 f118877f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Integer f118878g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Collection f118879h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f118880i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f118881j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f118882k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f118883l;

        public u(t13.d<? super u> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            u uVar = f.this.new u(dVar);
            uVar.f118883l = obj;
            return uVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:37:0x010c  */
        /* JADX WARN: Code duplicated, block: B:42:0x0125  */
        /* JADX WARN: Code duplicated, block: B:45:0x012d  */
        /* JADX WARN: Code duplicated, block: B:50:0x0146  */
        /* JADX WARN: Code duplicated, block: B:53:0x015a  */
        /* JADX WARN: Code duplicated, block: B:54:0x015f  */
        /* JADX WARN: Code duplicated, block: B:57:0x0167  */
        /* JADX WARN: Code duplicated, block: B:59:0x016b  */
        /* JADX WARN: Code duplicated, block: B:61:0x0171  */
        /* JADX WARN: Code duplicated, block: B:62:0x0174  */
        /* JADX WARN: Code duplicated, block: B:64:0x017e  */
        /* JADX WARN: Code duplicated, block: B:66:0x0195  */
        /* JADX WARN: Code duplicated, block: B:70:0x01bc  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x01bc -> B:71:0x01c1). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r34) {
            /*
                Method dump skipped, instruction units count: 506
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: mi0.f.u.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new b(null);
        f118765t = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f() {
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        p2 p2VarA = q2.a(k0Var);
        this.f118768c = p2VarA;
        p2 p2VarA2 = q2.a(k0Var);
        this.f118769d = p2VarA2;
        p2 p2VarA3 = q2.a(k0Var);
        this.f118770e = p2VarA3;
        p2 p2VarA4 = q2.a(k0Var);
        this.f118771f = p2VarA4;
        this.f118772g = new j(v1.a(this));
        this.f118773h = new t(v1.a(this), p13.w.c(ki0.a.b.EnumC2007a.DISMISS_SUGGESTION));
        this.f118774i = new l(v1.a(this), p13.w.c(ki0.a.b.EnumC2007a.DECLINE_REQUEST), p13.w.c(ki0.a.b.EnumC2007a.DECLINE_REQUEST_REVERTED));
        p2 p2VarA5 = q2.a(null);
        this.f118775j = p2VarA5;
        this.f118776k = r53.s.K(r53.s.l(p2VarA2, p2VarA4, p2VarA5, new k(null)), v1.a(this), k2.a.a(k2.f150703a, 3), new c(null, null));
        p2 p2VarA6 = q2.a("");
        this.f118777l = p2VarA6;
        int i14 = 0;
        Object obj = null;
        this.f118778m = new r53.u1(p2VarA, yc.o.a(new t2(new u2(20, 0, false, 0, 0, i14, 62, null), obj, new ii0.p(this, 1), 2, null).f196485a, v1.a(this)), new d(null));
        this.f118779n = new r53.u1(p2VarA, r53.s.N(r53.s.q(new m(new q(p2VarA6)), 500L), new o(null, this)), new e(null));
        p2 p2VarA7 = q2.a("");
        this.f118780o = p2VarA7;
        Object[] objArr = 0 == true ? 1 : 0;
        Object obj2 = null;
        this.f118781p = new r53.u1(p2VarA, yc.o.a(new t2(new u2(20, 0, objArr, i14, 0, 0, 62, null), obj2, new ii0.p(this, 2), 2, null).f196485a, v1.a(this)), new g(null));
        this.f118782q = new r53.u1(p2VarA, r53.s.N(r53.s.q(new n(new r(p2VarA7)), 500L), new p(null, this)), new h(null));
        Object obj3 = null;
        this.f118783r = r53.s.l(p2VarA, p2VarA3, yc.o.a(new t2(new u2(200, 0, false, 0, 0, 0, 62, null), obj3, new ii0.p(this, 3), 2, null).f196485a, v1.a(this)), new s(null));
        ge1.b.T(v1.a(this), null, null, new a(null), 3);
    }

    public final void x4() {
        ge1.b.T(v1.a(this), null, null, new u(null), 3);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lmi0/f$b;", "", "<init>", "()V", "", "PAGING_SIZE", "I", "SUGGESTED_PAGING_SIZE", "", "TAG", "Ljava/lang/String;", "gcm-follow_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
