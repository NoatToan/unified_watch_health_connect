package nf0;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnf0/x;", "Lla2/a;", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x implements la2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f125867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f125868b;

    public x(String str, o oVar) {
        this.f125867a = str;
        this.f125868b = oVar;
    }

    @Override // la2.a
    public final void onDeviceConnected(la2.b bVar) {
    }

    @Override // la2.a
    public final void onDeviceConnectingFailure(la2.c cVar) {
    }

    @Override // la2.a
    public final void onDeviceDisconnected(la2.h hVar) {
        if (p005kotlin.jvm.internal.s.g(hVar.f111673a.getF92737a(), this.f125867a)) {
            int i14 = o.f125820q;
            o oVar = this.f125868b;
            oVar.N4();
            a2 a2Var = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "EcgOnboardingViewModel", "[startDeviceConnectionObserver] ecg feature device disconnected");
            y0<g3<Unit>> y0Var = oVar.f125823e;
            if (y0Var != null) {
                y0Var.j(g3.a.a(g3.f35298f, null, new IllegalStateException(), null, null, 13));
            } else {
                p005kotlin.jvm.internal.s.m("ecgFirstReadingRecorded");
                throw null;
            }
        }
    }
}
