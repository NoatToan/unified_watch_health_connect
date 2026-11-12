package qr;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lmo1/f;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$likeConversionByResourceType$1", f = "ActivityDetailsViewModel.kt", l = {5025, 5025}, m = "invokeSuspend", v = 2)
public final class d6 extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends mo1.f>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f146168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f146169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f146170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f146171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f146172e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(t tVar, long j8, t13.d<? super d6> dVar) {
        super(2, dVar);
        this.f146171d = tVar;
        this.f146172e = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d6 d6Var = new d6(this.f146171d, this.f146172e, dVar);
        d6Var.f146170c = obj;
        return d6Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends mo1.f>> jVar, t13.d<? super Unit> dVar) {
        return ((d6) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f146170c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146169b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f146168a;
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
        fo1.f fVar = this.f146171d.f146510d;
        am.c2 c2Var = am.c2.ACTIVITY;
        String strValueOf = String.valueOf(this.f146172e);
        this.f146170c = null;
        this.f146168a = jVar;
        this.f146169b = 1;
        fVar.getClass();
        obj = com.garmin.android.apps.connectmobile.f0.J(fVar, new fo1.v(fVar, c2Var, strValueOf, null), this);
        if (obj != aVar) {
        }
        return aVar;
        this.f146170c = null;
        this.f146168a = null;
        this.f146169b = 2;
    }
}
