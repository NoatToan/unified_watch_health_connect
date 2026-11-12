package am;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lps/v0;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$getActivityIntervals$1", f = "ActivityRepo.kt", l = {254, 254}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<r53.j<? super v2<? extends ps.v0>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f4206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f4209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f4210e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lps/v0;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$getActivityIntervals$1$1", f = "ActivityRepo.kt", l = {254}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super c83.a0<ps.v0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f4212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f4213c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, long j8, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f4212b = mVar;
            this.f4213c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f4212b, this.f4213c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<ps.v0>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f4211a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            o53.i0<c83.a0<ps.v0>> i0VarD = this.f4212b.f4069a.D(this.f4213c);
            this.f4211a = 1;
            Object objAwait = i0VarD.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(m mVar, long j8, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f4209d = mVar;
        this.f4210e = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        u uVar = new u(this.f4209d, this.f4210e, dVar);
        uVar.f4208c = obj;
        return uVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super v2<? extends ps.v0>> jVar, t13.d<? super Unit> dVar) {
        return ((u) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f4208c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f4207b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f4206a;
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
        long j8 = this.f4210e;
        m mVar = this.f4209d;
        a aVar2 = new a(mVar, j8, null);
        this.f4208c = null;
        this.f4206a = jVar;
        this.f4207b = 1;
        mVar.getClass();
        obj = com.garmin.android.apps.connectmobile.f0.J(mVar, aVar2, this);
        if (obj != aVar) {
        }
        return aVar;
        this.f4208c = null;
        this.f4206a = null;
        this.f4207b = 2;
    }
}
