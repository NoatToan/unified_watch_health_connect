package zo;

import androidx.viewpager.widget.ViewPager;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzo/o;", "Landroidx/viewpager/widget/ViewPager$j;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o implements ViewPager.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.f f206064a;

    public o(com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.f fVar) {
        this.f206064a = fVar;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrollStateChanged(int i14) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrolled(int i14, float f14, int i15) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageSelected(int i14) {
        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.f fVar = this.f206064a;
        fVar.f29346h = i14;
        fVar.v6(i14);
        fVar.u6(i14);
    }
}
