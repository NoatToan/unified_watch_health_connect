package n70;

import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq53/t;", "", "", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetUnlinkedDevicesCardsUseCase$getUnlinkedDismissedCards$1", f = "GetUnlinkedDevicesCardsUseCase.kt", l = {50}, m = "invokeSuspend", v = 2)
public final class j6 extends v13.i implements e23.p<q53.t<? super Set<? extends String>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f124336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f124337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i6 f124338c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(i6 i6Var, t13.d<? super j6> dVar) {
        super(2, dVar);
        this.f124338c = i6Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j6 j6Var = new j6(this.f124338c, dVar);
        j6Var.f124337b = obj;
        return j6Var;
    }

    @Override // e23.p
    public final Object invoke(q53.t<? super Set<? extends String>> tVar, t13.d<? super Unit> dVar) {
        return ((j6) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        q53.t tVar = (q53.t) this.f124337b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f124336a;
        if (i14 == 0) {
            o13.r.b(obj);
            i6 i6Var = this.f124338c;
            Set<String> setL1 = i6Var.f124289b.L1("companion_device_unlinked_dismissed_cards");
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(com.garmin.android.apps.connectmobile.a2.DEVICES, "GetUnlinkedDevicesCardsUseCase", "Get unlinked companion devices dismissed cards -> " + setL1);
            tVar.i(setL1);
            lp.k kVar = new lp.k(i6Var, tVar, 3);
            i6Var.f124289b.u3(kVar);
            mt0.s1 s1Var = new mt0.s1(8, i6Var, kVar);
            this.f124337b = null;
            this.f124336a = 1;
            if (q53.r.a(tVar, s1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
