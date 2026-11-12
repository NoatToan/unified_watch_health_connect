package qr;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements SwipeRefreshLayout.e, TabLayoutMediator.TabConfigurationStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActivityDetailsFragment f146212a;

    public /* synthetic */ g(ActivityDetailsFragment activityDetailsFragment) {
        this.f146212a = activityDetailsFragment;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.e
    public boolean a(SwipeRefreshLayout swipeRefreshLayout) {
        int i14 = ActivityDetailsFragment.I;
        ActivityDetailsFragment activityDetailsFragment = this.f146212a;
        ViewPager2 viewPager2 = activityDetailsFragment.f29992e;
        int currentItem = viewPager2 != null ? viewPager2.getCurrentItem() : -1;
        nr.t tVar = ((nr.i) activityDetailsFragment.z6().L1.getValue()).f127191a;
        nr.t.f fVar = tVar instanceof nr.t.f ? (nr.t.f) tVar : null;
        List<nr.k> list = fVar != null ? fVar.f127338c : null;
        nr.k kVar = list != null ? (nr.k) p13.h0.e0(currentItem, list) : null;
        return (kVar != null ? ActivityDetailsFragment.d.f30018a[kVar.ordinal()] : -1) == 1 ? ((Boolean) activityDetailsFragment.z6().f146560t2.getValue()).booleanValue() : ((Boolean) activityDetailsFragment.z6().f146557s2.getValue()).booleanValue();
    }

    @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
    public void onConfigureTab(TabLayout.Tab tab, int i14) {
        ActivityDetailsFragment.a aVar = this.f146212a.f29997j;
        if (aVar == null) {
            p005kotlin.jvm.internal.s.m("tabAdapter");
            throw null;
        }
        String string = aVar.f30012j.getString(aVar.f30014l.get(i14).f127237a);
        string.getClass();
        tab.setText(string);
    }
}
