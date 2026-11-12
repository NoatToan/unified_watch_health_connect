package xd2;

import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lxd2/g1;", "", "<anonymous>", "(Lo53/b0;)Lxd2/g1;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository$updateSessionName$2", f = "DefaultLivetrackRepository.kt", l = {343}, m = "invokeSuspend", v = 2)
public final class l0 extends v13.i implements e23.p<o53.b0, t13.d<? super g1<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f190231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f190232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f190233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ae2.e0 f190234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f190235e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository$updateSessionName$2$1", f = "DefaultLivetrackRepository.kt", l = {345, 344}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z0 f190236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f190237b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f190238c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f190239d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ae2.e0 f190240e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f190241f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, long j8, ae2.e0 e0Var, String str, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f190238c = bVar;
            this.f190239d = j8;
            this.f190240e = e0Var;
            this.f190241f = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f190238c, this.f190239d, this.f190240e, this.f190241f, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            z0 z0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f190237b;
            if (i14 == 0) {
                o13.r.b(obj);
                b bVar = this.f190238c;
                z0Var = bVar.f190045c;
                this.f190236a = z0Var;
                this.f190237b = 1;
                obj = b.J(bVar, this.f190239d, this);
                if (obj != aVar) {
                }
            }
            if (i14 != 1) {
                if (i14 == 2) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z0Var = this.f190236a;
            o13.r.b(obj);
            ae2.y yVar = new ae2.y(Boolean.FALSE, null, this.f190240e, null, this.f190241f, 10, null);
            this.f190236a = null;
            this.f190237b = 2;
            Object objA = z0Var.a((Map) obj, yVar, this);
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(b bVar, long j8, ae2.e0 e0Var, String str, t13.d<? super l0> dVar) {
        super(2, dVar);
        this.f190232b = bVar;
        this.f190233c = j8;
        this.f190234d = e0Var;
        this.f190235e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l0(this.f190232b, this.f190233c, this.f190234d, this.f190235e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super g1<? extends Unit>> dVar) {
        return ((l0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f190231a;
        if (i14 == 0) {
            o13.r.b(obj);
            String str = this.f190235e;
            b bVar = this.f190232b;
            a aVar2 = new a(bVar, this.f190233c, this.f190234d, str, null);
            this.f190231a = 1;
            obj = bVar.k(0, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return h1.a((yd2.b) obj, new x91.j(29));
    }
}
