package zb0;

import android.view.View;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes8.dex */
public class p implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.devices.model.t f203610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f203611b;

    public p(o oVar, com.garmin.android.apps.connectmobile.devices.model.t tVar) {
        this.f203611b = oVar;
        this.f203610a = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        ab2.a aVar = new ab2.a(9);
        o oVar = this.f203611b;
        oVar.getClass();
        com.garmin.android.apps.connectmobile.devices.model.t tVar = this.f203610a;
        String strA = c22.j0.a(tVar.getServiceEndDate().minusDays(1), 'L');
        new androidx.appcompat.app.e.a(oVar.requireContext()).setTitle(R.string.device_settings_expresspay_attention).setMessage(tVar.b() ? oVar.getString(R.string.device_settings_expresspay_service_deprecated, strA) : oVar.getString(R.string.device_settings_expresspay_service_transferred, strA)).setPositiveButton(R.string.common_learn_more, new n(oVar, 0)).setNeutralButton(R.string.common_button_ok, new xg1.l(tVar, aVar)).create().show();
    }
}
