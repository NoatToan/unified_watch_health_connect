package ew1;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lew1/t;", "Landroidx/core/view/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t implements androidx.core.view.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f66753a;

    public t(u uVar) {
        this.f66753a = uVar;
    }

    @Override // androidx.core.view.s
    public final void Y3(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
    }

    @Override // androidx.core.view.s
    public final void Z4(Menu menu) {
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_exit);
        if (menuItemFindItem != null) {
            menuItemFindItem.setVisible(this.f66753a.u6());
        }
    }

    @Override // androidx.core.view.s
    public final boolean w5(MenuItem menuItem) {
        menuItem.getClass();
        return menuItem.getItemId() == R.id.menu_item_exit;
    }
}
