package am;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lps/s0;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$getActivityExerciseSets$1", f = "ActivityRepo.kt", l = {312, 312}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<r53.j<? super v2<? extends ps.s0>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f4168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f4171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f4172e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lps/s0;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$getActivityExerciseSets$1$1", f = "ActivityRepo.kt", l = {312}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super c83.a0<ps.s0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f4174b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f4175c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, long j8, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f4174b = mVar;
            this.f4175c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f4174b, this.f4175c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<ps.s0>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f4173a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            o53.i0<c83.a0<ps.s0>> i0VarB = this.f4174b.f4069a.b(this.f4175c);
            this.f4173a = 1;
            Object objAwait = i0VarB.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(m mVar, long j8, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f4171d = mVar;
        this.f4172e = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        r rVar = new r(this.f4171d, this.f4172e, dVar);
        rVar.f4170c = obj;
        return rVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super v2<? extends ps.s0>> jVar, t13.d<? super Unit> dVar) {
        return ((r) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f4170c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f4169b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f4168a;
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
        long j8 = this.f4172e;
        m mVar = this.f4171d;
        a aVar2 = new a(mVar, j8, null);
        this.f4170c = null;
        this.f4168a = jVar;
        this.f4169b = 1;
        mVar.getClass();
        obj = com.garmin.android.apps.connectmobile.f0.J(mVar, aVar2, this);
        if (obj != aVar) {
        }
        return aVar;
        this.f4170c = null;
        this.f4168a = null;
        this.f4169b = 2;
    }
}
