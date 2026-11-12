package wl0;

import android.app.Activity;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.garmin.android.apps.connectmobile.golf.truswing.ClubSelectionDrawerFragment;

/* JADX INFO: loaded from: classes8.dex */
public class d extends i.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ClubSelectionDrawerFragment f185908i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ClubSelectionDrawerFragment clubSelectionDrawerFragment, Activity activity, DrawerLayout drawerLayout, int i14, int i15) {
        super(activity, drawerLayout, i14, i15);
        this.f185908i = clubSelectionDrawerFragment;
    }

    @Override // i.b, androidx.drawerlayout.widget.DrawerLayout.e
    public final void onDrawerClosed(View view2) {
        super.onDrawerClosed(view2);
        ClubSelectionDrawerFragment clubSelectionDrawerFragment = this.f185908i;
        if (clubSelectionDrawerFragment.isAdded()) {
            clubSelectionDrawerFragment.getActivity().invalidateOptionsMenu();
        }
    }

    @Override // i.b, androidx.drawerlayout.widget.DrawerLayout.e
    public final void onDrawerOpened(View view2) {
        super.onDrawerOpened(view2);
        ClubSelectionDrawerFragment clubSelectionDrawerFragment = this.f185908i;
        if (clubSelectionDrawerFragment.isAdded()) {
            clubSelectionDrawerFragment.getClass();
            clubSelectionDrawerFragment.getActivity().invalidateOptionsMenu();
        }
    }
}
