package aq;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Laq/f0;", "Landroidx/core/view/s;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f0 implements androidx.core.view.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f11930a;

    public f0(c0 c0Var) {
        this.f11930a = c0Var;
    }

    @Override // androidx.core.view.s
    public final void Y3(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        menuInflater.inflate(R.menu.edit_exercises_multi_edit_menu, menu);
        menu.findItem(R.id.menu_item_done).setEnabled(true);
    }

    @Override // androidx.core.view.s
    public final boolean w5(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_done) {
            return false;
        }
        int i14 = c0.f11852i;
        c0 c0Var = this.f11930a;
        c0Var.getClass();
        ge1.b.T(g22.f.b(c0Var), null, null, new e0(c0Var, null), 3);
        return false;
    }
}
