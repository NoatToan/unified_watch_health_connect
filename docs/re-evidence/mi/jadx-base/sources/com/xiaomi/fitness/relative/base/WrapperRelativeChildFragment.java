package com.xiaomi.fitness.relative.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.y4a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.Months;
import org.joda.time.Weeks;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 '2\u00020\u0001:\u0002'(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0011H\u0014J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0007H\u0002J\b\u0010\u001b\u001a\u00020\u0011H\u0002J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0019H\u0002J\b\u0010\u001e\u001a\u00020\u0019H\u0002J&\u0010\u001f\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H$R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¤\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/relative/base/WrapperRelativeChildFragment;", "Lcom/xiaomi/fitness/relative/base/BaseRelativeChildFragment;", "<init>", "()V", "mViewPager", "Landroidx/viewpager2/widget/ViewPager2;", "mTodayLocalDate", "Lorg/joda/time/LocalDate;", "getMTodayLocalDate", "()Lorg/joda/time/LocalDate;", "setMTodayLocalDate", "(Lorg/joda/time/LocalDate;)V", "mPageName", "", "getMPageName", "()Ljava/lang/String;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onVisible", "refreshPagerPosition", "getViewPagerOffset", "", DialWidgetType.DATE, "initViewPager", "getDataOffsetToday", "position", "getPageSize", "onInflateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "getItemChildFragmentClass", "Ljava/lang/Class;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "Companion", "CommonFragmentStatePagerAdapter", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class WrapperRelativeChildFragment extends BaseRelativeChildFragment {

    @NotNull
    public static final String KEY_OFFSET = "offset";

    @NotNull
    public static final String KEY_SID = "sid";

    @NotNull
    private LocalDate mTodayLocalDate;
    private ViewPager2 mViewPager;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001d\u001a\u00020\bH\u0016J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\bH\u0016R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010R\u0014\u0010\u0019\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0014¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/relative/base/WrapperRelativeChildFragment$CommonFragmentStatePagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fa", "Landroidx/fragment/app/Fragment;", "clz", "Ljava/lang/Class;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "pageSize", "", "sid", "", "relativeUid", "", "<init>", "(Landroidx/fragment/app/Fragment;Ljava/lang/Class;ILjava/lang/String;J)V", "getClz", "()Ljava/lang/Class;", "getPageSize", "()I", "getSid", "()Ljava/lang/String;", "getRelativeUid", "()J", "mFragmentClass", "getMFragmentClass", "mPageSize", "getMPageSize", "mSid", "getMSid", "getItemCount", "createFragment", "position", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CommonFragmentStatePagerAdapter extends FragmentStateAdapter {

        @Nullable
        private final Class<BaseFragment> clz;
        private final int pageSize;
        private final long relativeUid;

        @Nullable
        private final String sid;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CommonFragmentStatePagerAdapter(@NotNull Fragment fa, @Nullable Class<BaseFragment> cls, int i, @Nullable String str, long j) {
            super(fa);
            Intrinsics.checkNotNullParameter(fa, "fa");
            this.clz = cls;
            this.pageSize = i;
            this.sid = str;
            this.relativeUid = j;
        }

        private final Class<BaseFragment> getMFragmentClass() {
            return this.clz;
        }

        /* JADX INFO: renamed from: getMPageSize, reason: from getter */
        private final int getPageSize() {
            return this.pageSize;
        }

        /* JADX INFO: renamed from: getMSid, reason: from getter */
        private final String getSid() {
            return this.sid;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NotNull
        public Fragment createFragment(int position) {
            Class<BaseFragment> mFragmentClass = getMFragmentClass();
            BaseFragment baseFragmentNewInstance = mFragmentClass != null ? mFragmentClass.newInstance() : null;
            Intrinsics.checkNotNull(baseFragmentNewInstance, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.view.BaseFragment");
            Bundle bundle = new Bundle();
            bundle.putInt("offset", (getPageSize() - 1) - position);
            bundle.putString("sid", getSid());
            bundle.putLong("key_relative_uid", this.relativeUid);
            baseFragmentNewInstance.setArguments(bundle);
            return baseFragmentNewInstance;
        }

        @Nullable
        public final Class<BaseFragment> getClz() {
            return this.clz;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return getPageSize();
        }

        public final int getPageSize() {
            return this.pageSize;
        }

        public final long getRelativeUid() {
            return this.relativeUid;
        }

        @Nullable
        public final String getSid() {
            return this.sid;
        }
    }

    public WrapperRelativeChildFragment() {
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        this.mTodayLocalDate = localDateNow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocalDate getDataOffsetToday(int position) {
        int pageSize = getPageSize();
        int xAxisPosition = getXAxisPosition();
        if (xAxisPosition == 0) {
            LocalDate localDateMinusDays = this.mTodayLocalDate.minusDays((pageSize - 1) - position);
            Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "minusDays(...)");
            return localDateMinusDays;
        }
        if (xAxisPosition != 1) {
            return xAxisPosition != 2 ? this.mTodayLocalDate : TimeDateUtil.getFirstDayOfMonth(this.mTodayLocalDate.minusMonths((pageSize - 1) - position));
        }
        LocalDate localDatePlusDays = TimeDateUtil.getWeekMonday(this.mTodayLocalDate.minusWeeks((pageSize - 1) - position)).plusDays(6);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        return localDatePlusDays;
    }

    private final int getPageSize() {
        int xAxisPosition = getXAxisPosition();
        if (xAxisPosition == 0) {
            return CommonConstants.Mgc.NEED_UPGRADE_VERSION;
        }
        if (xAxisPosition != 1) {
            return xAxisPosition != 2 ? 0 : 240;
        }
        return 960;
    }

    private final int getViewPagerOffset(LocalDate date) {
        int xAxisPosition = getXAxisPosition();
        if (xAxisPosition != 1) {
            return xAxisPosition != 2 ? Days.daysBetween(this.mTodayLocalDate, date).getDays() : Months.monthsBetween(TimeDateUtil.getFirstDayOfMonth(this.mTodayLocalDate), TimeDateUtil.getFirstDayOfMonth(date)).getMonths();
        }
        return Weeks.weeksBetween(TimeDateUtil.getWeekMonday(this.mTodayLocalDate), TimeDateUtil.getWeekMonday(date)).getWeeks();
    }

    private final void initViewPager() {
        CommonFragmentStatePagerAdapter commonFragmentStatePagerAdapter = new CommonFragmentStatePagerAdapter(this, getItemChildFragmentClass(), getPageSize(), getSid(), getRelativeUid());
        ViewPager2 viewPager2 = this.mViewPager;
        ViewPager2 viewPager3 = null;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            viewPager2 = null;
        }
        viewPager2.setAdapter(commonFragmentStatePagerAdapter);
        ViewPager2 viewPager4 = this.mViewPager;
        if (viewPager4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            viewPager4 = null;
        }
        viewPager4.h(new ViewPager2.i() { // from class: com.xiaomi.fitness.relative.base.WrapperRelativeChildFragment.initViewPager.1
            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                Logger.i(WrapperRelativeChildFragment.this.getLogTag(), WrapperRelativeChildFragment.this.getMPageName() + "-onPageSelected:" + position + " CCC 222 ");
                WrapperRelativeChildFragment wrapperRelativeChildFragment = WrapperRelativeChildFragment.this;
                wrapperRelativeChildFragment.setMCurrentDate(wrapperRelativeChildFragment.getDataOffsetToday(position));
                Bundle arguments = WrapperRelativeChildFragment.this.getArguments();
                if (arguments != null) {
                    arguments.putSerializable("local_date", WrapperRelativeChildFragment.this.getMCurrentDate());
                }
                BaseRelativeChildFragment.OnDateSelectChangedListener mSelectChangedListener = WrapperRelativeChildFragment.this.getMSelectChangedListener();
                if (mSelectChangedListener != null) {
                    mSelectChangedListener.onSelectDateChanged(WrapperRelativeChildFragment.this.getMCurrentDate());
                }
            }
        });
        LocalDate mCurrentDate = getMCurrentDate();
        Intrinsics.checkNotNull(mCurrentDate);
        int pageSize = (getPageSize() - 1) - Math.abs(getViewPagerOffset(mCurrentDate));
        ViewPager2 viewPager5 = this.mViewPager;
        if (viewPager5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
        } else {
            viewPager3 = viewPager5;
        }
        viewPager3.k(pageSize, false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putSerializable("local_date", getMCurrentDate());
        }
        BaseRelativeChildFragment.OnDateSelectChangedListener mSelectChangedListener = getMSelectChangedListener();
        if (mSelectChangedListener != null) {
            mSelectChangedListener.onSelectDateChanged(getMCurrentDate());
        }
    }

    private final void refreshPagerPosition() {
        LocalDate mCurrentDate = getMCurrentDate();
        if (mCurrentDate != null) {
            if (getXAxisPosition() == 1) {
                mCurrentDate = TimeDateUtil.getWeekMonday(mCurrentDate);
            } else if (getXAxisPosition() == 2) {
                mCurrentDate = TimeDateUtil.getFirstDayOfMonth(mCurrentDate);
            }
            int viewPagerOffset = getViewPagerOffset(mCurrentDate);
            int pageSize = (getPageSize() - 1) - Math.abs(viewPagerOffset);
            Logger.i(getLogTag(), "Wrapper " + getMPageName() + "-refreshPagerPosition-" + mCurrentDate + "-xAxisPosition-" + getXAxisPosition() + "-viewPagerOffset-" + viewPagerOffset + "-pagerOffset-" + pageSize);
            ViewPager2 viewPager2 = this.mViewPager;
            if (viewPager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
                viewPager2 = null;
            }
            viewPager2.k(pageSize, false);
        }
    }

    @NotNull
    public abstract Class<BaseFragment> getItemChildFragmentClass();

    @NotNull
    public abstract String getMPageName();

    @NotNull
    public final LocalDate getMTodayLocalDate() {
        return this.mTodayLocalDate;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        y4a y4aVarA0 = y4a.A0(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(y4aVarA0, "inflate(...)");
        this.mViewPager = y4aVarA0.A;
        View root = y4aVarA0.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.xiaomi.fitness.relative.base.BaseRelativeChildFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        initViewPager();
    }

    @Override // com.xiaomi.fitness.relative.base.BaseRelativeChildFragment, com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        refreshPagerPosition();
    }

    public final void setMTodayLocalDate(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<set-?>");
        this.mTodayLocalDate = localDate;
    }
}
