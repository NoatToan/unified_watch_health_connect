package xd2;

import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lxd2/g1;", "Lae2/i;", "<anonymous>", "(Lo53/b0;)Lxd2/g1;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository$getGrouptrackLastKnownLocations$2", f = "DefaultLivetrackRepository.kt", l = {469}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<o53.b0, t13.d<? super g1<? extends ae2.i>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f190304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f190305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f190306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<String> f190307d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lae2/i;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository$getGrouptrackLastKnownLocations$2$1", f = "DefaultLivetrackRepository.kt", l = {471, 470}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super c83.a0<ae2.i>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z0 f190308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f190309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f190310c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f190311d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List<String> f190312e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, long j8, List<String> list, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f190310c = bVar;
            this.f190311d = j8;
            this.f190312e = list;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f190310c, this.f190311d, this.f190312e, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<ae2.i>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            z0 z0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f190309b;
            if (i14 == 0) {
                o13.r.b(obj);
                b bVar = this.f190310c;
                z0Var = bVar.f190045c;
                this.f190308a = z0Var;
                this.f190309b = 1;
                obj = b.J(bVar, this.f190311d, this);
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
            z0Var = this.f190308a;
            o13.r.b(obj);
            this.f190308a = null;
            this.f190309b = 2;
            Object objB = z0Var.b((Map) obj, this.f190312e, this);
            return objB == aVar ? aVar : objB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(b bVar, long j8, List<String> list, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f190305b = bVar;
        this.f190306c = j8;
        this.f190307d = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f190305b, this.f190306c, this.f190307d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super g1<? extends ae2.i>> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f190304a;
        if (i14 == 0) {
            o13.r.b(obj);
            List<String> list = this.f190307d;
            b bVar = this.f190305b;
            a aVar2 = new a(bVar, this.f190306c, list, null);
            this.f190304a = 1;
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
        return h1.a((yd2.b) obj, new x91.j(24));
    }
}
