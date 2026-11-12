package fz1;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.core.view.s;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfz1/o;", "Landroidx/core/view/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e f74053a;

    public o(com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e eVar) {
        this.f74053a = eVar;
    }

    @Override // androidx.core.view.s
    public final void Y3(Menu menu, MenuInflater menuInflater) {
        zl.a.f(menu, menuInflater, R.menu.menu_save, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_save);
        menuItemFindItem.getClass();
        com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e eVar = this.f74053a;
        eVar.f46034j = menuItemFindItem;
        menuItemFindItem.setEnabled(eVar.f46028d > 0);
        MenuItem menuItemFindItem2 = menu.findItem(R.id.menu_item_exit);
        if (menuItemFindItem2 != null) {
            menuItemFindItem2.setVisible(false);
        }
        if (eVar.y6().f74015n) {
            menu.findItem(R.id.menu_item_save).setVisible(false);
        }
    }

    @Override // androidx.core.view.s
    public final boolean w5(MenuItem menuItem) {
        menuItem.getClass();
        com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e.f46024o;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e eVar = this.f74053a;
        eVar.y6().L4(eVar.f46029e, eVar.f46028d);
        if (eVar.f46032h != ng0.a.DETAILS_SCREEN_VIEW) {
            com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e.w6(eVar);
            return true;
        }
        Intent intent = new Intent();
        intent.putExtra("GCM_extra_sharable_event_dto", eVar.y6().x4());
        eVar.requireActivity().setResult(-1, intent);
        eVar.requireActivity().finish();
        return true;
    }
}
