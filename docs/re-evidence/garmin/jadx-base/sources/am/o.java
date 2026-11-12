package am;

import com.garmin.android.apps.connectmobile.v2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$deleteActivity$1", f = "ActivityRepo.kt", l = {241, 246, 249}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<r53.j<? super v2<? extends Unit>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f4122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f4125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Long f4126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Long f4127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f4128g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$deleteActivity$1$result$1", f = "ActivityRepo.kt", l = {242}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f4130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f4131c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, long j8, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f4130b = mVar;
            this.f4131c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f4130b, this.f4131c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f4129a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            o53.i0<c83.a0<Unit>> i0VarM = this.f4130b.f4069a.M(this.f4131c);
            this.f4129a = 1;
            Object objAwait = i0VarM.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m mVar, Long l14, Long l15, long j8, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f4125d = mVar;
        this.f4126e = l14;
        this.f4127f = l15;
        this.f4128g = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f4125d, this.f4126e, this.f4127f, this.f4128g, dVar);
        oVar.f4124c = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super v2<? extends Unit>> jVar, t13.d<? super Unit> dVar) {
        return ((o) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
    
        if (r8.emit(r12, r15) == r9) goto L28;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        v2 v2Var;
        Long l14;
        Long l15;
        v2 v2Var2;
        r53.j jVar = (r53.j) this.f4124c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f4123b;
        if (i14 == 0) {
            o13.r.b(obj);
            long j8 = this.f4128g;
            m mVar = this.f4125d;
            a aVar2 = new a(mVar, j8, null);
            this.f4124c = jVar;
            this.f4123b = 1;
            mVar.getClass();
            objJ = com.garmin.android.apps.connectmobile.f0.J(mVar, aVar2, this);
            if (objJ != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            objJ = obj;
        } else if (i14 == 2) {
            v2Var2 = this.f4122a;
            o13.r.b(obj);
            v2Var = v2Var2;
            this.f4124c = null;
            this.f4122a = null;
            this.f4123b = 3;
        } else {
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b) || (l14 = this.f4126e) == null || (l15 = this.f4127f) == null) {
            this.f4124c = null;
            this.f4122a = null;
            this.f4123b = 3;
        } else {
            com.garmin.android.apps.connectmobile.googlehealthconnect.a aVar3 = (com.garmin.android.apps.connectmobile.googlehealthconnect.a) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.googlehealthconnect.a.class, null, null, 6, null);
            long jLongValue = l14.longValue();
            long jLongValue2 = l15.longValue();
            this.f4124c = jVar;
            this.f4122a = (v2.b) v2Var;
            this.f4123b = 2;
            if (aVar3.g(this.f4128g, jLongValue, jLongValue2, this) != aVar) {
                v2Var2 = v2Var;
                v2Var = v2Var2;
                this.f4124c = null;
                this.f4122a = null;
                this.f4123b = 3;
            }
        }
        return aVar;
    }
}
