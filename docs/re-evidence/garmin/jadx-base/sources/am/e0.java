package am;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/j;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$getActivityWorkouts$1", f = "ActivityRepo.kt", l = {400, 400}, m = "invokeSuspend", v = 2)
public final class e0 extends v13.i implements e23.p<r53.j<? super v2<? extends List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.j>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f3909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f3912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f3913e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/j;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$getActivityWorkouts$1$1", f = "ActivityRepo.kt", l = {400}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.j>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f3915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f3916c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, long j8, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f3915b = mVar;
            this.f3916c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f3915b, this.f3916c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.j>>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f3914a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            o53.i0<c83.a0<List<com.garmin.android.apps.connectmobile.activities.newmodel.j>>> i0VarO = this.f3915b.f4069a.o(String.valueOf(this.f3916c));
            this.f3914a = 1;
            Object objAwait = i0VarO.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(m mVar, long j8, t13.d<? super e0> dVar) {
        super(2, dVar);
        this.f3912d = mVar;
        this.f3913e = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e0 e0Var = new e0(this.f3912d, this.f3913e, dVar);
        e0Var.f3911c = obj;
        return e0Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super v2<? extends List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.j>>> jVar, t13.d<? super Unit> dVar) {
        return ((e0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f3911c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f3910b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f3909a;
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
        long j8 = this.f3913e;
        m mVar = this.f3912d;
        a aVar2 = new a(mVar, j8, null);
        this.f3911c = null;
        this.f3909a = jVar;
        this.f3910b = 1;
        mVar.getClass();
        obj = com.garmin.android.apps.connectmobile.f0.J(mVar, aVar2, this);
        if (obj != aVar) {
        }
        return aVar;
        this.f3911c = null;
        this.f3909a = null;
        this.f3910b = 2;
    }
}
