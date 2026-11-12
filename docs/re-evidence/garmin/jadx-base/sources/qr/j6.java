package qr;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$unlikeActivity$1$1", f = "ActivityDetailsViewModel.kt", l = {5055, 5055}, m = "invokeSuspend", v = 2)
public final class j6 extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends Unit>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f146279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f146280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f146281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f146282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f146283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f146284f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(t tVar, String str, long j8, t13.d<? super j6> dVar) {
        super(2, dVar);
        this.f146282d = tVar;
        this.f146283e = str;
        this.f146284f = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j6 j6Var = new j6(this.f146282d, this.f146283e, this.f146284f, dVar);
        j6Var.f146281c = obj;
        return j6Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends Unit>> jVar, t13.d<? super Unit> dVar) {
        return ((j6) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f146281c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146280b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f146279a;
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
        fo1.f fVar = this.f146282d.f146510d;
        String strValueOf = String.valueOf(this.f146284f);
        this.f146281c = null;
        this.f146279a = jVar;
        this.f146280b = 1;
        fVar.getClass();
        obj = com.garmin.android.apps.connectmobile.f0.J(fVar, new fo1.b0(fVar, this.f146283e, strValueOf, null), this);
        if (obj != aVar) {
        }
        return aVar;
        this.f146281c = null;
        this.f146279a = null;
        this.f146280b = 2;
    }
}
