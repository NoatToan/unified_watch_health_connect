package xd2;

import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lxd2/g1;", "", "Lae2/h0;", "<anonymous>", "(Lo53/b0;)Lxd2/g1;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository$getLivetrackSessionsByPublisher$2", f = "DefaultLivetrackRepository.kt", l = {290}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<o53.b0, t13.d<? super g1<? extends List<? extends ae2.h0>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f190358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f190359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f190360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f190361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f190362e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lae2/j0;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository$getLivetrackSessionsByPublisher$2$1", f = "DefaultLivetrackRepository.kt", l = {291, 291}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super c83.a0<ae2.j0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z0 f190363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f190364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f190365c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f190366d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f190367e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f190368f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, long j8, String str, String str2, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f190365c = bVar;
            this.f190366d = j8;
            this.f190367e = str;
            this.f190368f = str2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f190365c, this.f190366d, this.f190367e, this.f190368f, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<ae2.j0>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            z0 z0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f190364b;
            if (i14 == 0) {
                o13.r.b(obj);
                b bVar = this.f190365c;
                z0Var = bVar.f190045c;
                this.f190363a = z0Var;
                this.f190364b = 1;
                obj = b.J(bVar, this.f190366d, this);
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
            z0Var = this.f190363a;
            o13.r.b(obj);
            this.f190363a = null;
            this.f190364b = 2;
            Object objC = z0Var.c((Map) obj, this.f190367e, this.f190368f, this);
            return objC == aVar ? aVar : objC;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(b bVar, long j8, String str, String str2, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f190359b = bVar;
        this.f190360c = j8;
        this.f190361d = str;
        this.f190362e = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f190359b, this.f190360c, this.f190361d, this.f190362e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super g1<? extends List<? extends ae2.h0>>> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f190358a;
        if (i14 == 0) {
            o13.r.b(obj);
            String str = this.f190362e;
            b bVar = this.f190359b;
            a aVar2 = new a(bVar, this.f190360c, this.f190361d, str, null);
            this.f190358a = 1;
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
        return h1.a((yd2.b) obj, new x91.j(27));
    }
}
