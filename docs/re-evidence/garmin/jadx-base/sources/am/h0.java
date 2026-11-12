package am;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lps/k;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$getMapDetails$1", f = "ActivityRepo.kt", l = {340, 339}, m = "invokeSuspend", v = 2)
public final class h0 extends v13.i implements e23.p<r53.j<? super v2<? extends ps.k>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f3990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f3993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f3994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3996g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lps/k;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$getMapDetails$1$1", f = "ActivityRepo.kt", l = {341}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super c83.a0<ps.k>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f3998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f3999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f4000d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f4001e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, long j8, int i14, int i15, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f3998b = mVar;
            this.f3999c = j8;
            this.f4000d = i14;
            this.f4001e = i15;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f3998b, this.f3999c, this.f4000d, this.f4001e, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<ps.k>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f3997a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            o53.i0<c83.a0<ps.k>> i0VarH = this.f3998b.f4069a.h(this.f3999c, new Integer(this.f4000d), new Integer(this.f4001e), null);
            this.f3997a = 1;
            Object objAwait = i0VarH.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(m mVar, long j8, int i14, int i15, t13.d<? super h0> dVar) {
        super(2, dVar);
        this.f3993d = mVar;
        this.f3994e = j8;
        this.f3995f = i14;
        this.f3996g = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        h0 h0Var = new h0(this.f3993d, this.f3994e, this.f3995f, this.f3996g, dVar);
        h0Var.f3992c = obj;
        return h0Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super v2<? extends ps.k>> jVar, t13.d<? super Unit> dVar) {
        return ((h0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r0.emit(r14, r13) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f3992c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f3991b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f3990a;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        int i15 = this.f3996g;
        m mVar = this.f3993d;
        a aVar2 = new a(mVar, this.f3994e, this.f3995f, i15, null);
        this.f3992c = null;
        this.f3990a = jVar;
        this.f3991b = 1;
        mVar.getClass();
        obj = com.garmin.android.apps.connectmobile.f0.J(mVar, aVar2, this);
        if (obj != aVar) {
        }
        return aVar;
        this.f3992c = null;
        this.f3990a = null;
        this.f3991b = 2;
    }
}
