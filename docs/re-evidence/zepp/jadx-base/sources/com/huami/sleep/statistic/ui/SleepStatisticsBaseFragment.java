package com.huami.sleep.statistic.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.sleep.R;
import com.huami.sleep.statistic.dto.TimeMode;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.sleep.util.SleepTimeUtil;
import com.huami.sleep.view.WrapContentHeightViewPager;
import com.huami.tools.log.HMLog;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b&\u0018\u0000 )2\u00020\u0001:\u0002)*B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u0011H&J\u0010\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0013H&R\u0019\u0010\u001b\u001a\u00020\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u00060\u001cR\u00020\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006+"}, d2 = {"Lcom/huami/sleep/statistic/ui/SleepStatisticsBaseFragment;", "Landroidx/fragment/app/Fragment;", "", "b", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "", "hidden", "onHiddenChanged", "Lcom/huami/sleep/statistic/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "", "time", "dayDetailFragment", "", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "userId", "Lcom/huami/sleep/statistic/ui/SleepStatisticsBaseFragment$PagerAdapter;", "Lcom/huami/sleep/statistic/ui/SleepStatisticsBaseFragment$PagerAdapter;", "pagerAdapter", "", "c", LogUtil.I, "getPageCurrentItem", "()I", "setPageCurrentItem", "(I)V", "pageCurrentItem", "<init>", "(Ljava/lang/String;)V", "Companion", "PagerAdapter", "sleep_release"}, k = 1, mv = {1, 5, 1})
public abstract class SleepStatisticsBaseFragment extends Fragment {

    @NotNull
    private static final String d = "SleepStatisticsBaseFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private PagerAdapter pagerAdapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int pageCurrentItem = -1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J \u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/huami/sleep/statistic/ui/SleepStatisticsBaseFragment$PagerAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "", "getCount", "position", "Landroidx/fragment/app/Fragment;", "getItem", "Landroid/view/ViewGroup;", "container", "", "object", "", "setPrimaryItem", "a", LogUtil.I, "pagerCount", "b", "currentPosition", "Landroidx/fragment/app/FragmentManager;", "fm", "<init>", "(Lcom/huami/sleep/statistic/ui/SleepStatisticsBaseFragment;Landroidx/fragment/app/FragmentManager;I)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    @SuppressLint({"WrongConstant"})
    public final class PagerAdapter extends FragmentStatePagerAdapter {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int pagerCount;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private int currentPosition;

        public PagerAdapter(FragmentManager fragmentManager, int i) {
            super(fragmentManager, 1);
            this.pagerCount = i;
            this.currentPosition = -1;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* JADX INFO: renamed from: getCount, reason: from getter */
        public int getPagerCount() {
            return this.pagerCount;
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        @NotNull
        public Fragment getItem(int position) {
            return SleepStatisticsBaseFragment.this.dayDetailFragment(SleepTimeUtil.INSTANCE.getTimeFromRegisterDay(position, SleepStatisticsBaseFragment.this.timeMode()));
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
        public void setPrimaryItem(@NotNull ViewGroup container, int position, @NotNull Object object) {
            super.setPrimaryItem(container, position, object);
            WrapContentHeightViewPager wrapContentHeightViewPager = (WrapContentHeightViewPager) container;
            if (position != this.currentPosition) {
                Fragment fragment = (Fragment) object;
                if (fragment.getView() != null) {
                    wrapContentHeightViewPager.setCurrentView(fragment.getView());
                    this.currentPosition = position;
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "pageCount:" + this.a;
        }
    }

    public SleepStatisticsBaseFragment(@NotNull String str) {
        this.userId = str;
    }

    private final void b() {
        int differFromRegisterDay$default = SleepTimeUtil.getDifferFromRegisterDay$default(SleepTimeUtil.INSTANCE, 0L, timeMode(), 1, null) + 1;
        HMLog.info(d, new a(differFromRegisterDay$default));
        View view = getView();
        WrapContentHeightViewPager wrapContentHeightViewPager = (WrapContentHeightViewPager) (view == null ? null : view.findViewById(R.id.viewpager));
        PagerAdapter pagerAdapter = new PagerAdapter(getChildFragmentManager(), differFromRegisterDay$default);
        this.pagerAdapter = pagerAdapter;
        Objects.requireNonNull(pagerAdapter);
        wrapContentHeightViewPager.setAdapter(pagerAdapter);
        wrapContentHeightViewPager.setCurrentItem(getPageCurrentItem() != -1 ? getPageCurrentItem() : differFromRegisterDay$default - 1);
        wrapContentHeightViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.huami.sleep.statistic.ui.SleepStatisticsBaseFragment$initViewPager$2$1
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int state) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int position) {
                this.a.setPageCurrentItem(position);
            }
        });
        View view2 = getView();
        this.pageCurrentItem = ((WrapContentHeightViewPager) (view2 != null ? view2.findViewById(R.id.viewpager) : null)).getCurrentItem();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public abstract Fragment dayDetailFragment(long time);

    public final int getPageCurrentItem() {
        return this.pageCurrentItem;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sleep_detail_viewpager, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        PagerAdapter pagerAdapter;
        super.onHiddenChanged(hidden);
        if (hidden || !isAdded() || (pagerAdapter = this.pagerAdapter) == null) {
            return;
        }
        Objects.requireNonNull(pagerAdapter);
        View view = getView();
        ViewGroup viewGroup = (ViewGroup) (view == null ? null : view.findViewById(R.id.viewpager));
        View view2 = getView();
        Fragment fragment = (Fragment) pagerAdapter.instantiateItem(viewGroup, ((WrapContentHeightViewPager) (view2 != null ? view2.findViewById(R.id.viewpager) : null)).getCurrentItem());
        if (fragment.isVisible()) {
            fragment.onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        b();
    }

    public final void setPageCurrentItem(int i) {
        this.pageCurrentItem = i;
    }

    @NotNull
    public abstract TimeMode timeMode();
}
