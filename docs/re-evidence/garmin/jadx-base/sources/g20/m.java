package g20;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.core.view.s;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg20/m;", "Landroidx/core/view/s;", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.details.c f75359a;

    public m(com.garmin.android.apps.connectmobile.contacts.details.c cVar) {
        this.f75359a = cVar;
    }

    @Override // androidx.core.view.s
    public final void Y3(Menu menu, MenuInflater menuInflater) {
        zl.a.f(menu, menuInflater, R.menu.menu_done, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_done);
        menuItemFindItem.getClass();
        com.garmin.android.apps.connectmobile.contacts.details.c cVar = this.f75359a;
        cVar.f32488j = menuItemFindItem;
        menuItemFindItem.setEnabled(cVar.f32489k);
    }

    @Override // androidx.core.view.s
    public final boolean w5(MenuItem menuItem) {
        menuItem.getClass();
        this.f75359a.v6().x4();
        return true;
    }
}
