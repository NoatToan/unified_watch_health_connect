package g12;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.AvailableAdventuresActivity;
import com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements AppBarLayout.OnOffsetChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.c f74891b;

    public /* synthetic */ g(com.garmin.android.apps.connectmobile.c cVar, int i14) {
        this.f74890a = i14;
        this.f74891b = cVar;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
    public final void onOffsetChanged(AppBarLayout appBarLayout, int i14) {
        int i15 = this.f74890a;
        boolean z14 = false;
        com.garmin.android.apps.connectmobile.c cVar = this.f74891b;
        switch (i15) {
            case 0:
                UserProfileActivity userProfileActivity = (UserProfileActivity) cVar;
                UserProfileActivity.a aVar = UserProfileActivity.f46494x;
                userProfileActivity.ea(i14 == 0);
                return;
            default:
                AvailableAdventuresActivity availableAdventuresActivity = (AvailableAdventuresActivity) cVar;
                RecyclerView recyclerView = availableAdventuresActivity.f37192g;
                if (recyclerView == null) {
                    p005kotlin.jvm.internal.s.m("recyclerView");
                    throw null;
                }
                RecyclerView.p layoutManager = recyclerView.getLayoutManager();
                layoutManager.getClass();
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                SwipeRefreshLayout swipeRefreshLayout = availableAdventuresActivity.f37187b;
                if (swipeRefreshLayout == null) {
                    p005kotlin.jvm.internal.s.m("swipeRefreshView");
                    throw null;
                }
                if (i14 >= 0 && linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0) {
                    z14 = true;
                }
                swipeRefreshLayout.setEnabled(z14);
                return;
        }
    }
}
