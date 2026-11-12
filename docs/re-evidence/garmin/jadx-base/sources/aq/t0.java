package aq;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectViewModel;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Laq/t0;", "Landroidx/core/view/s;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t0 implements androidx.core.view.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f12218a;

    public t0(n0 n0Var) {
        this.f12218a = n0Var;
    }

    @Override // androidx.core.view.s
    public final void Y3(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        menuInflater.inflate(R.menu.edit_exercises_multi_select_menu, menu);
        menu.findItem(R.id.menu_item_save).setEnabled(true);
    }

    @Override // androidx.core.view.s
    public final boolean w5(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_save) {
            return false;
        }
        int i14 = n0.f12063j;
        n0 n0Var = this.f12218a;
        if (!n0Var.u6().f29796h) {
            n0Var.requireActivity().finish();
            return false;
        }
        EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModelU6 = n0Var.u6();
        ge1.b.T(androidx.lifecycle.v1.a(editExercisesMultiSelectViewModelU6), null, null, new com.garmin.android.apps.connectmobile.activities.stats.a(editExercisesMultiSelectViewModelU6, null), 3);
        return false;
    }
}
