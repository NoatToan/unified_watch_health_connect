package qr;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$earnShareActivityBadge$1", f = "ActivityDetailsViewModel.kt", l = {2077, 2077}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends Unit>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f146845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f146846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f146847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f146848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f146849e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(t tVar, long j8, t13.d<? super y> dVar) {
        super(2, dVar);
        this.f146848d = tVar;
        this.f146849e = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        y yVar = new y(this.f146848d, this.f146849e, dVar);
        yVar.f146847c = obj;
        return yVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends Unit>> jVar, t13.d<? super Unit> dVar) {
        return ((y) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f146847c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146846b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f146845a;
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
        am.d dVar = this.f146848d.f146544o;
        this.f146847c = null;
        this.f146845a = jVar;
        this.f146846b = 1;
        obj = dVar.m0(this.f146849e, this);
        if (obj != aVar) {
        }
        return aVar;
        this.f146847c = null;
        this.f146845a = null;
        this.f146846b = 2;
    }
}
