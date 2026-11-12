package mt0;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmt0/b0;", "Landroidx/core/view/s;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b0 implements androidx.core.view.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.i f120518a;

    public b0(com.garmin.android.apps.connectmobile.leaderboard.challenges.i iVar) {
        this.f120518a = iVar;
    }

    @Override // androidx.core.view.s
    public final void Y3(Menu menu, MenuInflater menuInflater) {
        zl.a.f(menu, menuInflater, R.menu.save_menu, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.save_menu_item);
        com.garmin.android.apps.connectmobile.leaderboard.challenges.i iVar = this.f120518a;
        iVar.f37592f = menuItemFindItem;
        iVar.u6(false);
    }

    @Override // androidx.core.view.s
    public final boolean w5(MenuItem menuItem) {
        menuItem.getClass();
        com.garmin.android.apps.connectmobile.leaderboard.challenges.i.b bVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.i.f37586j;
        this.f120518a.v6();
        return true;
    }
}
