package iz1;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.core.view.s;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Liz1/h;", "Landroidx/core/view/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b f95875a;

    public h(com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b bVar) {
        this.f95875a = bVar;
    }

    @Override // androidx.core.view.s
    public final void Y3(Menu menu, MenuInflater menuInflater) {
        zl.a.f(menu, menuInflater, R.menu.menu_help, menu);
    }

    @Override // androidx.core.view.s
    public final boolean w5(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_help) {
            return false;
        }
        com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b.f46192e;
        Context context = this.f95875a.getContext();
        if (context == null) {
            return true;
        }
        HelpActivity.a.e(HelpActivity.f36653a, context, ro0.l.TRAINING_PRIORITY, null, null, 12);
        return true;
    }
}
