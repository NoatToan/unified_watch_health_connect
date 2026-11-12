package lc0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llc0/n;", "Llm2/i$b;", "Lvm2/h;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n implements lm2.i.b<vm2.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o53.j<q<? extends vm2.h>> f111957a;

    /* JADX WARN: Multi-variable type inference failed */
    public n(o53.j<? super q<? extends vm2.h>> jVar) {
        this.f111957a = jVar;
    }

    @Override // lm2.i.b
    public final void a(vm2.h hVar) {
        vm2.h hVar2 = hVar;
        String strH = com.airbnb.lottie.animation.keyframe.a.h("removeDeviceFromAccount complete -> success: ", hVar2 != null ? hVar2.f178831a : false);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "RemoveDeviceUseCase", strH);
        this.f111957a.resumeWith(q.a(hVar2));
    }

    @Override // lm2.i.b
    public final void onFailure(Throwable th3) {
        th3.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.f(a2Var, "RemoveDeviceUseCase", "removeDeviceFromAccount failed " + th3);
        int i14 = q.f128596b;
        this.f111957a.resumeWith(q.a(new q.b(th3)));
    }
}
