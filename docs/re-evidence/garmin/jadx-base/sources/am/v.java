package am;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lps/w0;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$getActivityJumpMetrics$1", f = "ActivityRepo.kt", l = {320, 320}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<r53.j<? super v2<? extends List<? extends ps.w0>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f4234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f4237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f4238e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lps/w0;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$getActivityJumpMetrics$1$1", f = "ActivityRepo.kt", l = {320}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends ps.w0>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f4240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f4241c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, long j8, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f4240b = mVar;
            this.f4241c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f4240b, this.f4241c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<List<? extends ps.w0>>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f4239a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            o53.i0<c83.a0<List<ps.w0>>> i0VarP = this.f4240b.f4069a.P(this.f4241c);
            this.f4239a = 1;
            Object objAwait = i0VarP.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(m mVar, long j8, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f4237d = mVar;
        this.f4238e = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        v vVar = new v(this.f4237d, this.f4238e, dVar);
        vVar.f4236c = obj;
        return vVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super v2<? extends List<? extends ps.w0>>> jVar, t13.d<? super Unit> dVar) {
        return ((v) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f4236c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f4235b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f4234a;
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
        long j8 = this.f4238e;
        m mVar = this.f4237d;
        a aVar2 = new a(mVar, j8, null);
        this.f4236c = null;
        this.f4234a = jVar;
        this.f4235b = 1;
        mVar.getClass();
        obj = com.garmin.android.apps.connectmobile.f0.J(mVar, aVar2, this);
        if (obj != aVar) {
        }
        return aVar;
        this.f4236c = null;
        this.f4234a = null;
        this.f4235b = 2;
    }
}
