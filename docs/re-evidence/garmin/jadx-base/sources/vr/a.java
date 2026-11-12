package vr;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.core.view.s;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activity.details.presentation.jumps.ActivityDetailsJumpMetricFragment;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import p005kotlin.Metadata;
import ro0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvr/a;", "Landroidx/core/view/s;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActivityDetailsJumpMetricFragment f179464a;

    public a(ActivityDetailsJumpMetricFragment activityDetailsJumpMetricFragment) {
        this.f179464a = activityDetailsJumpMetricFragment;
    }

    @Override // androidx.core.view.s
    public final void Y3(Menu menu, MenuInflater menuInflater) {
        zl.a.f(menu, menuInflater, R.menu.help_3_0, menu);
    }

    @Override // androidx.core.view.s
    public final boolean w5(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_help) {
            return false;
        }
        HelpActivity.a.e(HelpActivity.f36653a, this.f179464a.getContext(), l.GRIT_FLOW, "JUMP", null, 8);
        return true;
    }
}
