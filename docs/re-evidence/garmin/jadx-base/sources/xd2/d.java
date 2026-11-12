package xd2;

import java.util.Map;
import org.joda.time.DateTime;
import org.joda.time.Period;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lxd2/g1;", "Lae2/l0;", "<anonymous>", "(Lo53/b0;)Lxd2/g1;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository$createAnonymousSession$2", f = "DefaultLivetrackRepository.kt", l = {241, 250}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.p<o53.b0, t13.d<? super g1<? extends ae2.l0>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f190072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f190073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f190074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f190075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ae2.e0 f190076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DateTime f190077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Period f190078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f190079h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lae2/l0;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository$createAnonymousSession$2$1", f = "DefaultLivetrackRepository.kt", l = {251, 251}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super c83.a0<ae2.l0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z0 f190080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f190081b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f190082c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f190083d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ae2.m0 f190084e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, long j8, ae2.m0 m0Var, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f190082c = bVar;
            this.f190083d = j8;
            this.f190084e = m0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f190082c, this.f190083d, this.f190084e, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<ae2.l0>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            z0 z0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f190081b;
            if (i14 == 0) {
                o13.r.b(obj);
                b bVar = this.f190082c;
                z0Var = bVar.f190045c;
                this.f190080a = z0Var;
                this.f190081b = 1;
                obj = b.J(bVar, this.f190083d, this);
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
            z0Var = this.f190080a;
            o13.r.b(obj);
            this.f190080a = null;
            this.f190081b = 2;
            Object objM = z0Var.m((Map) obj, this.f190084e, this);
            return objM == aVar ? aVar : objM;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, int i14, String str, ae2.e0 e0Var, DateTime dateTime, Period period, long j8, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f190073b = bVar;
        this.f190074c = i14;
        this.f190075d = str;
        this.f190076e = e0Var;
        this.f190077f = dateTime;
        this.f190078g = period;
        this.f190079h = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f190073b, this.f190074c, this.f190075d, this.f190076e, this.f190077f, this.f190078g, this.f190079h, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super g1<? extends ae2.l0>> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        if (r2 == r1) goto L20;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objK;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f190072a;
        if (i14 == 0) {
            o13.r.b(obj);
            y0 y0Var = this.f190073b.f190047e;
            this.f190072a = 1;
            objA = y0Var.a(this);
            if (objA != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            objA = obj;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objK = obj;
        }
        return h1.a((yd2.b) objK, new x91.j(17));
        wd2.c cVar = (wd2.c) objA;
        ae2.m0 m0Var = new ae2.m0(null, null, Period.hours(this.f190074c), this.f190075d, cVar != null ? new ae2.z(new Integer(cVar.f184403a), new Integer(cVar.f184404b)) : null, this.f190076e, null, this.f190077f, this.f190078g, 67, null);
        long j8 = this.f190079h;
        b bVar = this.f190073b;
        a aVar2 = new a(bVar, j8, m0Var, null);
        this.f190072a = 2;
        objK = bVar.k(0, aVar2, this);
    }
}
