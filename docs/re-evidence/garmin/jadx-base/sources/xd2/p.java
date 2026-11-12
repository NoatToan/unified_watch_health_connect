package xd2;

import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lxd2/g1;", "", "Lae2/q0;", "<anonymous>", "(Lo53/b0;)Lxd2/g1;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository$getGrouptrackConnections$2", f = "DefaultLivetrackRepository.kt", l = {390, 391}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<o53.b0, t13.d<? super g1<? extends List<? extends ae2.q0>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f190285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f190286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f190287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Integer f190288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Integer f190289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f190290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List<String> f190291g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lae2/h;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository$getGrouptrackConnections$2$1", f = "DefaultLivetrackRepository.kt", l = {393, 392}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super c83.a0<ae2.h>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z0 f190292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f190293b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f190294c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f190295d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Integer f190296e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ wd2.c f190297f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Integer f190298g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f190299h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ List<String> f190300i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, long j8, Integer num, wd2.c cVar, Integer num2, int i14, List<String> list, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f190294c = bVar;
            this.f190295d = j8;
            this.f190296e = num;
            this.f190297f = cVar;
            this.f190298g = num2;
            this.f190299h = i14;
            this.f190300i = list;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f190294c, this.f190295d, this.f190296e, this.f190297f, this.f190298g, this.f190299h, this.f190300i, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<ae2.h>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0059 A[PHI: r7
          0x0059: PHI (r7v8 java.lang.Integer) = (r7v3 java.lang.Integer), (r7v5 java.lang.Integer) binds: [B:25:0x0057, B:30:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            z0 z0Var;
            int iIntValue;
            int iIntValue2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f190293b;
            if (i14 == 0) {
                o13.r.b(obj);
                b bVar = this.f190294c;
                z0Var = bVar.f190045c;
                this.f190292a = z0Var;
                this.f190293b = 1;
                obj = b.J(bVar, this.f190295d, this);
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
            z0Var = this.f190292a;
            o13.r.b(obj);
            z0 z0Var2 = z0Var;
            Map<String, String> map = (Map) obj;
            wd2.c cVar = this.f190297f;
            Integer num = this.f190296e;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                Integer num2 = cVar != null ? new Integer(cVar.f184403a) : null;
                iIntValue = num2 != null ? num2.intValue() : 0;
            }
            Integer num3 = this.f190298g;
            if (num3 == null) {
                num3 = cVar != null ? new Integer(cVar.f184404b) : null;
                iIntValue2 = num3 != null ? num3.intValue() : 0;
            }
            this.f190292a = null;
            this.f190293b = 2;
            Object objD = z0Var2.d(map, iIntValue, iIntValue2, this.f190299h, this.f190300i, this);
            return objD == aVar ? aVar : objD;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(b bVar, long j8, Integer num, Integer num2, int i14, List<String> list, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f190286b = bVar;
        this.f190287c = j8;
        this.f190288d = num;
        this.f190289e = num2;
        this.f190290f = i14;
        this.f190291g = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f190286b, this.f190287c, this.f190288d, this.f190289e, this.f190290f, this.f190291g, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super g1<? extends List<? extends ae2.q0>>> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r14 == r0) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f190285a;
        if (i14 == 0) {
            o13.r.b(obj);
            y0 y0Var = this.f190286b.f190047e;
            this.f190285a = 1;
            obj = y0Var.a(this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return h1.a((yd2.b) obj, new x91.j(23));
        List<String> list = this.f190291g;
        b bVar = this.f190286b;
        a aVar2 = new a(bVar, this.f190287c, this.f190288d, (wd2.c) obj, this.f190289e, this.f190290f, list, null);
        this.f190285a = 2;
        obj = bVar.k(0, aVar2, this);
    }
}
