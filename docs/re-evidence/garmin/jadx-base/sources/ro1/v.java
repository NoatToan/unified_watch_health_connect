package ro1;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.share.PhotoEditViewModel$earnShareActivityBadge$1", f = "PhotoEditViewModel.kt", l = {356, 360}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<androidx.lifecycle.t0<v2<? extends Unit>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f154029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f154030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f154031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f154032d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.social.share.PhotoEditViewModel$earnShareActivityBadge$1$result$1", f = "PhotoEditViewModel.kt", l = {358}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f154033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f154034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ u f154035c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j8, u uVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f154034b = j8;
            this.f154035c = uVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f154034b, this.f154035c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f154033a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.badges.service.model.n nVar = new com.garmin.android.apps.connectmobile.badges.service.model.n(32, this.f154034b);
            av.g gVar = this.f154035c.f154013b;
            this.f154033a = 1;
            gVar.getClass();
            Object objJ = com.garmin.android.apps.connectmobile.f0.J(gVar, new av.h(gVar, nVar, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(long j8, u uVar, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f154031c = j8;
        this.f154032d = uVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        v vVar = new v(this.f154031c, this.f154032d, dVar);
        vVar.f154030b = obj;
        return vVar;
    }

    @Override // e23.p
    public final Object invoke(androidx.lifecycle.t0<v2<? extends Unit>> t0Var, t13.d<? super Unit> dVar) {
        return ((v) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r0.emit((com.garmin.android.apps.connectmobile.v2) r10, r9) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        androidx.lifecycle.t0 t0Var = (androidx.lifecycle.t0) this.f154030b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f154029a;
        if (i14 != 0) {
            if (i14 == 1) {
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
        x53.c cVar = o53.s0.f129406a;
        x53.b bVar = x53.b.f189152a;
        a aVar2 = new a(this.f154031c, this.f154032d, null);
        this.f154030b = t0Var;
        this.f154029a = 1;
        obj = ge1.b.e0(bVar, aVar2, this);
        if (obj != aVar) {
        }
        return aVar;
        this.f154030b = null;
        this.f154029a = 2;
    }
}
