package am;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lps/c0;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$getConnectIQDisplayInfo$1", f = "ActivityRepo.kt", l = {266, 266}, m = "invokeSuspend", v = 2)
public final class g0 extends v13.i implements e23.p<r53.j<? super v2<? extends List<? extends ps.c0>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f3966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f3969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f3970e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lps/c0;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$getConnectIQDisplayInfo$1$1", f = "ActivityRepo.kt", l = {266}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends ps.c0>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f3972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f3973c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, long j8, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f3972b = mVar;
            this.f3973c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f3972b, this.f3973c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<List<? extends ps.c0>>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f3971a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            o53.i0<c83.a0<List<ps.c0>>> i0VarL = this.f3972b.f4069a.L(this.f3973c);
            this.f3971a = 1;
            Object objAwait = i0VarL.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(m mVar, long j8, t13.d<? super g0> dVar) {
        super(2, dVar);
        this.f3969d = mVar;
        this.f3970e = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g0 g0Var = new g0(this.f3969d, this.f3970e, dVar);
        g0Var.f3968c = obj;
        return g0Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super v2<? extends List<? extends ps.c0>>> jVar, t13.d<? super Unit> dVar) {
        return ((g0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f3968c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f3967b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f3966a;
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
        long j8 = this.f3970e;
        m mVar = this.f3969d;
        a aVar2 = new a(mVar, j8, null);
        this.f3968c = null;
        this.f3966a = jVar;
        this.f3967b = 1;
        mVar.getClass();
        obj = com.garmin.android.apps.connectmobile.f0.J(mVar, aVar2, this);
        if (obj != aVar) {
        }
        return aVar;
        this.f3968c = null;
        this.f3966a = null;
        this.f3967b = 2;
    }
}
