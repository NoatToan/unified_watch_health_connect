package am;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/devices/model/s;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$getSensorDetails$1", f = "ActivityRepo.kt", l = {365, 364}, m = "invokeSuspend", v = 2)
public final class j0 extends v13.i implements e23.p<r53.j<? super v2<? extends com.garmin.android.apps.connectmobile.devices.model.s>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f4028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f4031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ac0.c f4032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.devices.model.p f4033f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/devices/model/s;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$getSensorDetails$1$1", f = "ActivityRepo.kt", l = {366}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.devices.model.s>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ac0.c f4035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.devices.model.p f4036c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ac0.c cVar, com.garmin.android.apps.connectmobile.devices.model.p pVar, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f4035b = cVar;
            this.f4036c = pVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f4035b, this.f4036c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.devices.model.s>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f4034a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            o53.i0<c83.a0<com.garmin.android.apps.connectmobile.devices.model.s>> i0VarB = this.f4035b.b(this.f4036c);
            this.f4034a = 1;
            Object objAwait = i0VarB.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(m mVar, ac0.c cVar, com.garmin.android.apps.connectmobile.devices.model.p pVar, t13.d<? super j0> dVar) {
        super(2, dVar);
        this.f4031d = mVar;
        this.f4032e = cVar;
        this.f4033f = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j0 j0Var = new j0(this.f4031d, this.f4032e, this.f4033f, dVar);
        j0Var.f4030c = obj;
        return j0Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super v2<? extends com.garmin.android.apps.connectmobile.devices.model.s>> jVar, t13.d<? super Unit> dVar) {
        return ((j0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f4030c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f4029b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f4028a;
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
        a aVar2 = new a(this.f4032e, this.f4033f, null);
        this.f4030c = null;
        this.f4028a = jVar;
        this.f4029b = 1;
        m mVar = this.f4031d;
        mVar.getClass();
        obj = com.garmin.android.apps.connectmobile.f0.J(mVar, aVar2, this);
        if (obj != aVar) {
        }
        return aVar;
        this.f4030c = null;
        this.f4028a = null;
        this.f4029b = 2;
    }
}
