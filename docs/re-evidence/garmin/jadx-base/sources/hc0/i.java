package hc0;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.EcgOnboardingActivity;
import com.garmin.android.apps.connectmobile.ecg.presentation.stats.EcgActivity;
import java.util.Objects;
import zb0.g0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f83249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f83250c;

    public /* synthetic */ i(Object obj, boolean z14, int i14) {
        this.f83248a = i14;
        this.f83250c = obj;
        this.f83249b = z14;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        switch (this.f83248a) {
            case 0:
                k kVar = (k) this.f83250c;
                if (!this.f83249b) {
                    kVar.I0.a();
                } else {
                    kVar.H0.a(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), null);
                }
                break;
            case 1:
                com.garmin.android.apps.connectmobile.settings.devices.common.f fVar = ((com.garmin.android.apps.connectmobile.settings.devices.common.e) this.f83250c).f42830c;
                if (!this.f83249b) {
                    Context contextRequireContext = fVar.requireContext();
                    sd2.f fVar2 = fVar.f42836l;
                    Objects.requireNonNull(fVar2);
                    long unitID = fVar2.getUnitID();
                    EcgOnboardingActivity.f34765b.getClass();
                    contextRequireContext.getClass();
                    Intent intent = new Intent(contextRequireContext, (Class<?>) EcgOnboardingActivity.class);
                    intent.putExtra("DEVICE_UNIT_ID", unitID);
                    fVar.startActivity(intent);
                } else {
                    Context contextRequireContext2 = fVar.requireContext();
                    EcgActivity.f34850a.getClass();
                    contextRequireContext2.getClass();
                    fVar.startActivity(new Intent(contextRequireContext2, (Class<?>) EcgActivity.class));
                }
                break;
            default:
                g0 g0Var = (g0) this.f83250c;
                if (!this.f83249b) {
                    g0Var.f203513z.a();
                } else {
                    g0Var.f203512y.a(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), null);
                }
                break;
        }
    }
}
