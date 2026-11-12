package lc0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llc0/l;", "Llm2/i$b;", "Lvm2/h;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements lm2.i.b<vm2.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<vm2.h, Unit> f111952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l<Throwable, Unit> f111953b;

    /* JADX WARN: Multi-variable type inference failed */
    public l(e23.l<? super vm2.h, Unit> lVar, e23.l<? super Throwable, Unit> lVar2) {
        this.f111952a = lVar;
        this.f111953b = lVar2;
    }

    @Override // lm2.i.b
    public final void a(vm2.h hVar) {
        vm2.h hVar2 = hVar;
        String strH = com.airbnb.lottie.animation.keyframe.a.h("removeDeviceFromAccount complete -> success: ", hVar2 != null ? hVar2.f178831a : false);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "RemoveDeviceUseCase", strH);
        this.f111952a.invoke(hVar2);
    }

    @Override // lm2.i.b
    public final void onFailure(Throwable th3) {
        th3.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.f(a2Var, "RemoveDeviceUseCase", "removeDeviceFromAccount failed " + th3);
        this.f111953b.invoke(th3);
    }
}
