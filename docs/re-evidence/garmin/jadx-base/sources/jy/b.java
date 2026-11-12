package jy;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.garmin.android.apps.connectmobile.calendar.presentation.infiniteviewpager.CalendarPagerTitleNavigationStrip;
import com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTPagerTitleNavigationStrip;
import com.garmin.android.apps.connectmobile.view.pager.PagerTitleNavigationStrip;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPager f101665b;

    public /* synthetic */ b(ViewPager viewPager, int i14) {
        this.f101664a = i14;
        this.f101665b = viewPager;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f101664a;
        ViewPager viewPager = this.f101665b;
        switch (i14) {
            case 0:
                int i15 = CalendarPagerTitleNavigationStrip.f31224h;
                viewPager.C(viewPager.getCurrentItem() - 1, true);
                break;
            case 1:
                int i16 = CalendarPagerTitleNavigationStrip.f31224h;
                viewPager.C(viewPager.getCurrentItem() + 1, true);
                break;
            case 2:
                int i17 = FBTPagerTitleNavigationStrip.f45473i;
                viewPager.C(viewPager.getCurrentItem() - 1, true);
                break;
            case 3:
                int i18 = FBTPagerTitleNavigationStrip.f45473i;
                viewPager.C(viewPager.getCurrentItem() + 1, true);
                break;
            case 4:
                int i19 = PagerTitleNavigationStrip.f47675h;
                viewPager.C(viewPager.getCurrentItem() - 1, true);
                break;
            default:
                int i24 = PagerTitleNavigationStrip.f47675h;
                viewPager.C(viewPager.getCurrentItem() + 1, true);
                break;
        }
    }
}
