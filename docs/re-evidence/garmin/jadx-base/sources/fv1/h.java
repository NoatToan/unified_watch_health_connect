package fv1;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.core.view.s;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfv1/h;", "Landroidx/core/view/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f73722a;

    public h(g gVar) {
        this.f73722a = gVar;
    }

    @Override // androidx.core.view.s
    public final void Y3(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        menu.clear();
        menuInflater.inflate(R.menu.save_menu, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.save_menu_item);
        menuItemFindItem.setVisible(true);
        menuItemFindItem.setEnabled(this.f73722a.f73713b);
    }

    @Override // androidx.core.view.s
    public final boolean w5(MenuItem menuItem) {
        menuItem.getClass();
        g.a aVar = g.f73711d;
        ev1.b bVarV6 = this.f73722a.v6();
        ge1.b.T(v1.a(bVarV6), null, null, new ev1.a(bVarV6, null), 3);
        return true;
    }
}
