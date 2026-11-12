package g62;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg62/b;", "Landroidx/core/view/s;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements androidx.core.view.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.a f76060a;

    public b(com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.a aVar) {
        this.f76060a = aVar;
    }

    @Override // androidx.core.view.s
    public final void Y3(Menu menu, MenuInflater menuInflater) {
        zl.a.f(menu, menuInflater, R.menu.workout_edit, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.save_workout);
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.a aVar = this.f76060a;
        aVar.f49100f = menuItemFindItem;
        if (menuItemFindItem != null) {
            menuItemFindItem.setTitle(aVar.getString(R.string.lbl_next));
        }
        MenuItem menuItem = aVar.f49100f;
        if (menuItem != null) {
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.i iVar = aVar.f49096b;
            if (iVar != null) {
                menuItem.setEnabled(iVar.r().size() >= 2);
            } else {
                p005kotlin.jvm.internal.s.m("adapter");
                throw null;
            }
        }
    }

    @Override // androidx.core.view.s
    public final boolean w5(MenuItem menuItem) {
        menuItem.getClass();
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.a.C0961a c0961a = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.a.f49094h;
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c cVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c) this.f76060a.f49095a.getValue();
        WorkoutDetailsDTO workoutDetailsDTO = cVar.f49138r;
        if (workoutDetailsDTO != null) {
            cVar.f49141w.j(new com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h.j(workoutDetailsDTO, null));
            return true;
        }
        a2 a2Var = a2.WORKOUTS;
        i2.f36769a.getClass();
        i2.a.e(a2Var, "Cannot open overview when workoutDetailsDTO is null");
        return true;
    }
}
