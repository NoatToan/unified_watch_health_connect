package qr;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lps/i0;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getDiveActivity$1", f = "ActivityDetailsViewModel.kt", l = {4923, 4923}, m = "invokeSuspend", v = 2)
public final class r2 extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends ps.i0>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f146463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f146464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f146465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f146466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f146467e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(t tVar, long j8, t13.d<? super r2> dVar) {
        super(2, dVar);
        this.f146466d = tVar;
        this.f146467e = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        r2 r2Var = new r2(this.f146466d, this.f146467e, dVar);
        r2Var.f146465c = obj;
        return r2Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends ps.i0>> jVar, t13.d<? super Unit> dVar) {
        return ((r2) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f146465c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146464b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f146463a;
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
        am.x1 x1Var = this.f146466d.f146535l;
        this.f146465c = null;
        this.f146463a = jVar;
        this.f146464b = 1;
        int i15 = am.x1.f4370a;
        x1Var.getClass();
        obj = com.garmin.android.apps.connectmobile.f0.J(x1Var, new am.y1(this.f146467e, null, null), this);
        if (obj != aVar) {
        }
        return aVar;
        this.f146465c = null;
        this.f146463a = null;
        this.f146464b = 2;
    }
}
