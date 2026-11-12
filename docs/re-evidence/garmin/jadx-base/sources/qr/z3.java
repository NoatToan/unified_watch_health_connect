package qr;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/l0;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getTankPressure$1", f = "ActivityDetailsViewModel.kt", l = {4972, 4972}, m = "invokeSuspend", v = 2)
public final class z3 extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends com.garmin.android.apps.connectmobile.activities.newmodel.l0>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f146871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f146872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f146873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f146874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f146875e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(t tVar, long j8, t13.d<? super z3> dVar) {
        super(2, dVar);
        this.f146874d = tVar;
        this.f146875e = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        z3 z3Var = new z3(this.f146874d, this.f146875e, dVar);
        z3Var.f146873c = obj;
        return z3Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends com.garmin.android.apps.connectmobile.activities.newmodel.l0>> jVar, t13.d<? super Unit> dVar) {
        return ((z3) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f146873c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146872b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f146871a;
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
        am.x1 x1Var = this.f146874d.f146535l;
        this.f146873c = null;
        this.f146871a = jVar;
        this.f146872b = 1;
        int i15 = am.x1.f4370a;
        x1Var.getClass();
        obj = com.garmin.android.apps.connectmobile.f0.J(x1Var, new am.z1(this.f146875e, null, null), this);
        if (obj != aVar) {
        }
        return aVar;
        this.f146873c = null;
        this.f146871a = null;
        this.f146872b = 2;
    }
}
