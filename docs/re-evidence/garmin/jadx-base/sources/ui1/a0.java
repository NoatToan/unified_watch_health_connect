package ui1;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/device/setup/domain/model/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.network.InReachSubscriptionRepository$isSubscriptionPurchaseProcessed$result$1", f = "InReachSubscriptionRepository.kt", l = {245}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends com.garmin.android.apps.connectmobile.device.setup.domain.model.a>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f171180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f171181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f171182c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(l lVar, String str, t13.d<? super a0> dVar) {
        super(1, dVar);
        this.f171181b = lVar;
        this.f171182c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new a0(this.f171181b, this.f171182c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends com.garmin.android.apps.connectmobile.device.setup.domain.model.a>>> dVar) {
        return ((a0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f171180a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        k kVar = this.f171181b.f171317c;
        this.f171180a = 1;
        Object objA = kVar.a(this.f171182c, this);
        return objA == aVar ? aVar : objA;
    }
}
