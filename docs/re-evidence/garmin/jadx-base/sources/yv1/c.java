package yv1;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.core.view.s;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import xv1.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyv1/c;", "Landroidx/core/view/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f199851a;

    public c(b bVar) {
        this.f199851a = bVar;
    }

    @Override // androidx.core.view.s
    public final void Y3(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        menu.clear();
        menuInflater.inflate(R.menu.save_menu, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.save_menu_item);
        menuItemFindItem.setVisible(true);
        menuItemFindItem.setEnabled(this.f199851a.f199842b);
    }

    @Override // androidx.core.view.s
    public final boolean w5(MenuItem menuItem) {
        menuItem.getClass();
        b.a aVar = b.f199840d;
        d dVar = (d) this.f199851a.f199841a.getValue();
        ge1.b.T(v1.a(dVar), null, null, new xv1.b(dVar, null), 3);
        return true;
    }
}
