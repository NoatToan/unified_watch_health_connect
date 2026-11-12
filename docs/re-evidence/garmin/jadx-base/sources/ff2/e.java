package ff2;

import fb1.d0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q53.t;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lff2/a;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.promotionlibrary.domain.CampaignInteractorKt$activeCampaignFlow$1", f = "CampaignInteractor.kt", l = {113}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<t<? super a>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f71147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f71148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f71149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f71150d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, boolean z14, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f71149c = cVar;
        this.f71150d = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f71149c, this.f71150d, dVar);
        eVar.f71148b = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(t<? super a> tVar, t13.d<? super Unit> dVar) {
        return ((e) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        t tVar = (t) this.f71148b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f71147a;
        if (i14 == 0) {
            r.b(obj);
            tVar.i(null);
            this.f71149c.a(new d(tVar, 0), this.f71150d);
            d0 d0Var = new d0(7);
            this.f71148b = null;
            this.f71147a = 1;
            if (q53.r.a(tVar, d0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
