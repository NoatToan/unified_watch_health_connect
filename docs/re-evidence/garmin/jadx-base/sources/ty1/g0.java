package ty1;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lty1/g0;", "Landroidx/core/view/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g0 implements androidx.core.view.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f167112a;

    public g0(h0 h0Var) {
        this.f167112a = h0Var;
    }

    @Override // androidx.core.view.s
    public final void Y3(Menu menu, MenuInflater menuInflater) {
        zl.a.f(menu, menuInflater, R.menu.menu_exit, menu);
    }

    @Override // androidx.core.view.s
    public final boolean w5(MenuItem menuItem) {
        androidx.fragment.app.m activity;
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_exit || (activity = this.f167112a.getActivity()) == null) {
            return false;
        }
        fy1.i.f73924a.getClass();
        fy1.i.a.u(activity, null);
        return true;
    }
}
