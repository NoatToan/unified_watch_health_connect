package am;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lps/r1;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$getTimeInStaminaPowerZones$1", f = "ActivityRepo.kt", l = {282, 282}, m = "invokeSuspend", v = 2)
public final class n0 extends v13.i implements e23.p<r53.j<? super v2<? extends List<? extends ps.r1>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f4109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f4112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f4113e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lps/r1;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$getTimeInStaminaPowerZones$1$1", f = "ActivityRepo.kt", l = {282}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends ps.r1>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f4115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f4116c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, long j8, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f4115b = mVar;
            this.f4116c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f4115b, this.f4116c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<List<? extends ps.r1>>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f4114a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            o53.i0<c83.a0<List<ps.r1>>> i0VarR = this.f4115b.f4069a.R(this.f4116c);
            this.f4114a = 1;
            Object objAwait = i0VarR.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(m mVar, long j8, t13.d<? super n0> dVar) {
        super(2, dVar);
        this.f4112d = mVar;
        this.f4113e = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        n0 n0Var = new n0(this.f4112d, this.f4113e, dVar);
        n0Var.f4111c = obj;
        return n0Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super v2<? extends List<? extends ps.r1>>> jVar, t13.d<? super Unit> dVar) {
        return ((n0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f4111c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f4110b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f4109a;
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
        long j8 = this.f4113e;
        m mVar = this.f4112d;
        a aVar2 = new a(mVar, j8, null);
        this.f4111c = null;
        this.f4109a = jVar;
        this.f4110b = 1;
        mVar.getClass();
        obj = com.garmin.android.apps.connectmobile.f0.J(mVar, aVar2, this);
        if (obj != aVar) {
        }
        return aVar;
        this.f4111c = null;
        this.f4109a = null;
        this.f4110b = 2;
    }
}
