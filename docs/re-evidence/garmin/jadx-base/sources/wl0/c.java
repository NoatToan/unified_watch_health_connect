package wl0;

import android.widget.Toast;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.golf.truswing.SwingDetailsActivity;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.v2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f185900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f185901c;

    public /* synthetic */ c(Object obj, boolean z14, int i14) {
        this.f185899a = i14;
        this.f185901c = obj;
        this.f185900b = z14;
    }

    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) {
        int i14 = this.f185899a;
        boolean z14 = this.f185900b;
        Object obj2 = this.f185901c;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.golf.truswing.a aVar = (com.garmin.android.apps.connectmobile.golf.truswing.a) obj2;
                aVar.F6();
                if (((v2) obj) instanceof v2.b) {
                    Toast.makeText(aVar.getContext(), R.string.swing_delete_successfully, 0).show();
                    qd2.a.b().i(qd2.a.b.GOLF_SWING_LIST);
                } else if (!z14) {
                    String string = aVar.getString(R.string.swing_delete_failed);
                    b bVar = new b(aVar);
                    q1.f41066b.getClass();
                    q1 q1VarA = q1.b.a(0, string, 0, R.string.lbl_cancel, bVar);
                    aVar.I = q1VarA;
                    q1VarA.show(aVar.getChildFragmentManager(), (String) null);
                } else {
                    Toast.makeText(aVar.getContext(), R.string.swing_delete_successfully, 0).show();
                }
                aVar.d7();
                break;
            default:
                SwingDetailsActivity swingDetailsActivity = (SwingDetailsActivity) obj2;
                int i15 = SwingDetailsActivity.f35774o;
                swingDetailsActivity.hideProgressOverlay();
                if (((v2) obj) instanceof v2.b) {
                    Toast.makeText(swingDetailsActivity, R.string.swing_delete_successfully, 0).show();
                    swingDetailsActivity.setResult(-1);
                    qd2.a.b().i(qd2.a.b.GOLF_SWING_LIST);
                } else if (!z14) {
                    swingDetailsActivity.checkInternetConnectivity();
                    String string2 = swingDetailsActivity.getString(R.string.swing_delete_failed);
                    b0 b0Var = new b0(swingDetailsActivity, 1);
                    q1.f41066b.getClass();
                    q1 q1VarA2 = q1.b.a(0, string2, 0, R.string.lbl_cancel, b0Var);
                    swingDetailsActivity.f35786l = q1VarA2;
                    q1VarA2.show(swingDetailsActivity.getSupportFragmentManager(), (String) null);
                } else {
                    Toast.makeText(swingDetailsActivity, R.string.swing_delete_successfully, 0).show();
                    swingDetailsActivity.setResult(-1);
                }
                swingDetailsActivity.finish();
                break;
        }
    }
}
