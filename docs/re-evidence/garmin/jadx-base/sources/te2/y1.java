package te2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lve2/k;", "<anonymous>", "(Lo53/b0;)Lve2/k;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.MFAManager$getMFATokenDataMultiUserMode$2", f = "MFAManager.kt", l = {}, m = "invokeSuspend")
public final class y1 extends v13.i implements e23.p<o53.b0, t13.d<? super ve2.k>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ve2.d f164399a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(ve2.d dVar, t13.d<? super y1> dVar2) {
        super(2, dVar2);
        this.f164399a = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y1(this.f164399a, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super ve2.k> dVar) {
        return ((y1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        ve2.d dVar = this.f164399a;
        ve2.k kVar = dVar.f177697h;
        if (kVar != null) {
            if (kVar.a()) {
                Long l14 = kVar.f177754b;
                l14.getClass();
                if (!nd2.c.e(l14.longValue())) {
                    return kVar;
                }
            }
            dVar.f177697h = null;
        }
        return null;
    }
}
