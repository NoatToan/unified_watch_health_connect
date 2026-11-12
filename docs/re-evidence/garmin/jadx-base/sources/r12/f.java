package r12;

import a22.i;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import e23.p;
import e23.q;
import java.util.LinkedHashMap;
import java.util.Map;
import li0.d0;
import li0.e0;
import li0.l0;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.k0;
import p13.u0;
import r53.p2;
import r53.q2;
import vb.h;
import yc.i0;
import yc.o;
import yc.t2;
import yc.u2;
import yc.v2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lr12/f;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ei0.d f149414a = (ei0.d) KoinJavaComponent.get$default(ei0.d.class, null, null, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f149415b = (i) KoinJavaComponent.get$default(i.class, null, null, 6, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f149416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f149417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r53.u1 f149418e;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"r12/f$b", "Lli0/f;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends li0.f {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.follow.mute.FollowMutedUsersViewModel$action$1$updateStateData$1", f = "FollowMutedUsersViewModel.kt", l = {40}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f149420a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f149421b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l0 f149422c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f149423d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar, l0 l0Var, String str, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f149421b = fVar;
                this.f149422c = l0Var;
                this.f149423d = str;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f149421b, this.f149422c, this.f149423d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f149420a;
                if (i14 == 0) {
                    r.b(obj);
                    f fVar = this.f149421b;
                    LinkedHashMap linkedHashMapN = u0.n((Map) fVar.f149416c.getValue());
                    l0 l0VarA = this.f149422c;
                    if (l0VarA.f112785a == li0.b0.MUTED) {
                        l0VarA = l0.a(l0VarA, li0.b0.UNMUTE, null, null, 30);
                    }
                    linkedHashMapN.put(this.f149423d, l0VarA);
                    p2 p2Var = fVar.f149416c;
                    this.f149420a = 1;
                    p2Var.k(null, linkedHashMapN);
                    if (Unit.INSTANCE == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public b(b0 b0Var) {
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
            ge1.b.T(v1.a(fVar), null, null, new a(fVar, l0Var, str, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "Lli0/l0;", "tempMap", "Lyc/v2;", "Lli0/d0;", "list", "<anonymous>", "(Ljava/util/Map;Lyc/v2;)Lyc/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.follow.mute.FollowMutedUsersViewModel$mutedUsersFlow$1", f = "FollowMutedUsersViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements q<Map<String, ? extends l0>, v2<d0>, t13.d<? super v2<d0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Map f149424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ v2 f149425b;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lli0/d0;", "data", "<anonymous>", "(Lli0/d0;)Lli0/d0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.follow.mute.FollowMutedUsersViewModel$mutedUsersFlow$1$1", f = "FollowMutedUsersViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<d0, t13.d<? super d0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f149426a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Map<String, l0> f149427b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Map<String, l0> map, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f149427b = map;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f149427b, dVar);
                aVar.f149426a = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(d0 d0Var, t13.d<? super d0> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                d0 d0Var = (d0) this.f149426a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                return e0.f(d0Var, this.f149427b);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lli0/d0;", "data", "", "<anonymous>", "(Lli0/d0;)Z"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.follow.mute.FollowMutedUsersViewModel$mutedUsersFlow$1$2", f = "FollowMutedUsersViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements p<d0, t13.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f149428a;

            public b(t13.d<? super b> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                b bVar = new b(dVar);
                bVar.f149428a = obj;
                return bVar;
            }

            @Override // e23.p
            public final Object invoke(d0 d0Var, t13.d<? super Boolean> dVar) {
                return ((b) create(d0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                d0 d0Var = (d0) this.f149428a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                return Boolean.valueOf(d0Var.f112649b == li0.b0.UNMUTE);
            }
        }

        public c(t13.d<? super c> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(Map<String, ? extends l0> map, v2<d0> v2Var, t13.d<? super v2<d0>> dVar) {
            c cVar = new c(dVar);
            cVar.f149424a = map;
            cVar.f149425b = v2Var;
            return cVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Map map = this.f149424a;
            v2 v2Var = this.f149425b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            return i0.b(i0.e(v2Var, new a(map, null)), new b(null));
        }
    }

    static {
        new a(null);
    }

    public f() {
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        p2 p2VarA = q2.a(k0Var);
        this.f149416c = p2VarA;
        this.f149417d = new b(v1.a(this));
        this.f149418e = new r53.u1(p2VarA, o.a(new t2(new u2(50, 0, false, 0, 0, 0, 62, null), null, new q42.d(this, 25), 2, null).f196485a, v1.a(this)), new c(null));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lr12/f$a;", "", "<init>", "()V", "", "START_INDEX", "I", "PAGING_SIZE", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
