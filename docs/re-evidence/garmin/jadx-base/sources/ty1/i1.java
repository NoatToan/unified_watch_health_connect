package ty1;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lty1/i1;", "Landroidx/core/view/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i1 implements androidx.core.view.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.u f167138a;

    public i1(com.garmin.android.apps.connectmobile.traininginitiative.ui.u uVar) {
        this.f167138a = uVar;
    }

    @Override // androidx.core.view.s
    public final void Y3(Menu menu, MenuInflater menuInflater) {
        zl.a.f(menu, menuInflater, R.menu.menu_save, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_save);
        menuItemFindItem.getClass();
        com.garmin.android.apps.connectmobile.traininginitiative.ui.u uVar = this.f167138a;
        uVar.f46286p = menuItemFindItem;
        menuItemFindItem.setEnabled(uVar.F6());
    }

    @Override // androidx.core.view.s
    public final boolean w5(MenuItem menuItem) {
        menuItem.getClass();
        com.garmin.android.apps.connectmobile.traininginitiative.ui.u.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.u.A;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.u uVar = this.f167138a;
        uVar.G6();
        com.garmin.android.apps.connectmobile.traininginitiative.ui.u.A6(uVar);
        return true;
    }
}
