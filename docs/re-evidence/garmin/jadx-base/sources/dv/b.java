package dv;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.d3;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes7.dex */
public class b extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d3 f61319a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.f61319a = (d3) context;
        } catch (ClassCastException e4) {
            i2.f(a2.BIC, "BaseTitleFragment", e4.getMessage() + " -- Host activity must implement the ToolbarListener interfaces.");
        }
    }

    public final void u6(String str) {
        d3 d3Var = this.f61319a;
        if (d3Var != null) {
            d3Var.updateActionBarTitle(str);
        }
    }
}
