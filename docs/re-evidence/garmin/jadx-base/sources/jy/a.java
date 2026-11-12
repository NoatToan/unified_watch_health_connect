package jy;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.garmin.android.apps.connectmobile.calendar.presentation.infiniteviewpager.CalendarPagerTitleNavigationStrip;
import com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTPagerTitleNavigationStrip;
import com.garmin.android.apps.connectmobile.view.pager.PagerTitleNavigationStrip;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements ViewPager.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f101663b;

    public /* synthetic */ a(ConstraintLayout constraintLayout, int i14) {
        this.f101662a = i14;
        this.f101663b = constraintLayout;
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void onAdapterChanged(ViewPager viewPager, fe.a aVar, fe.a aVar2) {
        Integer numValueOf;
        int i14 = this.f101662a;
        ConstraintLayout constraintLayout = this.f101663b;
        switch (i14) {
            case 0:
                CalendarPagerTitleNavigationStrip calendarPagerTitleNavigationStrip = (CalendarPagerTitleNavigationStrip) constraintLayout;
                int i15 = CalendarPagerTitleNavigationStrip.f31224h;
                calendarPagerTitleNavigationStrip.f31229e = new WeakReference<>(aVar2);
                ViewPager viewPager2 = calendarPagerTitleNavigationStrip.f31228d;
                numValueOf = viewPager2 != null ? Integer.valueOf(viewPager2.getCurrentItem()) : null;
                if (numValueOf != null) {
                    calendarPagerTitleNavigationStrip.i(numValueOf.intValue());
                }
                break;
            case 1:
                FBTPagerTitleNavigationStrip fBTPagerTitleNavigationStrip = (FBTPagerTitleNavigationStrip) constraintLayout;
                int i16 = FBTPagerTitleNavigationStrip.f45473i;
                fBTPagerTitleNavigationStrip.f45479f = new WeakReference<>(aVar2);
                ViewPager viewPager3 = fBTPagerTitleNavigationStrip.f45478e;
                numValueOf = viewPager3 != null ? Integer.valueOf(viewPager3.getCurrentItem()) : null;
                if (numValueOf != null) {
                    fBTPagerTitleNavigationStrip.i(numValueOf.intValue());
                }
                break;
            default:
                PagerTitleNavigationStrip pagerTitleNavigationStrip = (PagerTitleNavigationStrip) constraintLayout;
                int i17 = PagerTitleNavigationStrip.f47675h;
                pagerTitleNavigationStrip.f47680e = new WeakReference<>(aVar2);
                ViewPager viewPager4 = pagerTitleNavigationStrip.f47679d;
                numValueOf = viewPager4 != null ? Integer.valueOf(viewPager4.getCurrentItem()) : null;
                if (numValueOf != null) {
                    pagerTitleNavigationStrip.i(numValueOf.intValue());
                }
                break;
        }
    }
}
