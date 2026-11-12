package qr;

import okhttp3.ResponseBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lokhttp3/ResponseBody;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getThirdPartyUploader$1", f = "ActivityDetailsViewModel.kt", l = {4812, 4812}, m = "invokeSuspend", v = 2)
public final class e4 extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends ResponseBody>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f146186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f146187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f146188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f146189d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(t tVar, t13.d<? super e4> dVar) {
        super(2, dVar);
        this.f146189d = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e4 e4Var = new e4(this.f146189d, dVar);
        e4Var.f146188c = obj;
        return e4Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends ResponseBody>> jVar, t13.d<? super Unit> dVar) {
        return ((e4) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f146188c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146187b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f146186a;
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
        aq.h3 h3Var = this.f146189d.f146528j;
        this.f146188c = null;
        this.f146186a = jVar;
        this.f146187b = 1;
        h3Var.getClass();
        obj = com.garmin.android.apps.connectmobile.f0.J(h3Var, new aq.g3(h3Var, null), this);
        if (obj != aVar) {
        }
        return aVar;
        this.f146188c = null;
        this.f146186a = null;
        this.f146187b = 2;
    }
}
