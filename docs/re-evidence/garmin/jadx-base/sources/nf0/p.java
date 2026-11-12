package nf0;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnf0/p;", "Lvf1/e;", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends vf1.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f125838a;

    public p(o oVar) {
        this.f125838a = oVar;
    }

    @Override // vf1.e
    public final void a(long j8, Boolean bool, String str) {
        str.getClass();
        o oVar = this.f125838a;
        if (j8 == oVar.f125821c) {
            oVar.N4();
            if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                y0<g3<Unit>> y0Var = oVar.f125823e;
                if (y0Var != null) {
                    y0Var.j(g3.a.e(g3.f35298f));
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("ecgFirstReadingRecorded");
                    throw null;
                }
            }
            i2.f36769a.getClass();
            i2.a.f(a2.ONBOARDING, "EcgOnboardingViewModel", "[createEcgFirstReadingRecordedLifecycleObserver] ecg feature enabled = " + bool);
            y0<g3<Unit>> y0Var2 = oVar.f125823e;
            if (y0Var2 != null) {
                y0Var2.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
            } else {
                p005kotlin.jvm.internal.s.m("ecgFirstReadingRecorded");
                throw null;
            }
        }
    }

    @Override // vf1.e
    public final void b(long j8, String str) {
        str.getClass();
        o oVar = this.f125838a;
        if (j8 == oVar.f125821c) {
            oVar.N4();
            a2 a2Var = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "EcgOnboardingViewModel", "[createEcgFirstReadingRecordedLifecycleObserver] ecg feature timeout");
            y0<g3<Unit>> y0Var = oVar.f125823e;
            if (y0Var != null) {
                y0Var.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
            } else {
                p005kotlin.jvm.internal.s.m("ecgFirstReadingRecorded");
                throw null;
            }
        }
    }
}
