package com.huami.sleep.daysleep.daydetail.adapter;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.sleep.daysleep.daydetail.ui.DaySleepChartFragment;
import com.huami.sleep.view.WrapContentHeightViewPager;
import kotlin.Metadata;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.FlowPreview;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 #2\u00020\u0001:\u0001#B\u0019\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017J\b\u0010\r\u001a\u00020\tH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J \u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0016\u0010\u0016\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006$"}, d2 = {"Lcom/huami/sleep/daysleep/daydetail/adapter/SportInfoViewPageAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "Landroid/graphics/Bitmap;", SportAnalytics.ParamValue.MapButtonType.MAP, "", "setmPosBitmap", "", "uid", "setUserId", "", "position", "Landroidx/fragment/app/Fragment;", "getItem", "getCount", "", "object", "getItemPosition", "Landroid/view/ViewGroup;", "container", "setPrimaryItem", "a", LogUtil.I, "mPagerCount", "b", "Landroid/graphics/Bitmap;", "mPosBitmap", "c", "currentPosition", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "mUserId", "Landroidx/fragment/app/FragmentManager;", "manager", "<init>", "(Landroidx/fragment/app/FragmentManager;I)V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SportInfoViewPageAdapter extends FragmentStatePagerAdapter {

    @NotNull
    private static final String e = "SportInfoViewPageAdapter";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int mPagerCount;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Bitmap mPosBitmap;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int currentPosition;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private String mUserId;

    public SportInfoViewPageAdapter(@Nullable FragmentManager fragmentManager, int i) {
        super(fragmentManager, 1);
        this.mPagerCount = i;
        this.currentPosition = -1;
        this.mUserId = "";
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    /* JADX INFO: renamed from: getCount */
    public int getPagerCount() {
        int i = this.mPagerCount;
        if (i == 0) {
            return 1;
        }
        return i;
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    @FlowPreview
    @ExperimentalCoroutinesApi
    @NotNull
    public Fragment getItem(int position) {
        DaySleepChartFragment daySleepChartFragmentNewInstance = DaySleepChartFragment.INSTANCE.newInstance(this.mUserId, position);
        daySleepChartFragmentNewInstance.setmPosBitmap(this.mPosBitmap);
        return daySleepChartFragmentNewInstance;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(@NotNull Object object) {
        return getPagerCount() < 0 ? -1 : -2;
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(@NotNull ViewGroup container, int position, @NotNull Object object) {
        super.setPrimaryItem(container, position, object);
        if (!(container instanceof WrapContentHeightViewPager) || position == this.currentPosition) {
            return;
        }
        Fragment fragment = (Fragment) object;
        if (fragment.getView() != null) {
            ((WrapContentHeightViewPager) container).setCurrentView(fragment.getView());
            this.currentPosition = position;
        }
    }

    public final void setUserId(@NotNull String uid) {
        this.mUserId = uid;
    }

    public final void setmPosBitmap(@Nullable Bitmap map) {
        this.mPosBitmap = map;
    }
}
