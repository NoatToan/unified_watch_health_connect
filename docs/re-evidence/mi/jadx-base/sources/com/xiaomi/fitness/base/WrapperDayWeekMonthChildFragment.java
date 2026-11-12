package com.xiaomi.fitness.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
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
import com.xiaomi.fitness.common.utils.SafeDBUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.y4a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.Months;
import org.joda.time.Weeks;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0011\b&\u0018\u0000 /2\u00020\u0001:\u0002/0B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0016J\b\u0010\u001b\u001a\u00020\u0014H\u0014J\b\u0010\u001c\u001a\u00020\u0014H\u0002J'\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u0007H\u0002J\b\u0010#\u001a\u00020\u0014H\u0002J\u0010\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u000fH\u0002J\b\u0010&\u001a\u00020\u000fH\u0002J&\u0010'\u001a\u00020\u00162\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-H$R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¤\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/base/WrapperDayWeekMonthChildFragment;", "Lcom/xiaomi/fitness/base/BaseDetailChildFragment;", "<init>", "()V", "mViewPager", "Landroidx/viewpager2/widget/ViewPager2;", "mTodayLocalDate", "Lorg/joda/time/LocalDate;", "getMTodayLocalDate", "()Lorg/joda/time/LocalDate;", "mPageName", "", "getMPageName", "()Ljava/lang/String;", "prePositionOffset", "", "broadcastReceiver", "com/xiaomi/fitness/base/WrapperDayWeekMonthChildFragment$broadcastReceiver$1", "Lcom/xiaomi/fitness/base/WrapperDayWeekMonthChildFragment$broadcastReceiver$1;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onReceiveDateChange", "onDestroyView", "onVisible", "refreshPagerPosition", "getViewPagerPosition", "fragmentPosition", "pagerOffset", DialWidgetType.DATE, "(Ljava/lang/Integer;ILorg/joda/time/LocalDate;)I", "getViewPagerOffset", "initViewPager", "getDataOffsetToday", "position", "getPageSize", "onInflateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "getItemChildFragmentClass", "Ljava/lang/Class;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "Companion", "CommonFragmentStatePagerAdapter", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWrapperDayWeekMonthChildFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WrapperDayWeekMonthChildFragment.kt\ncom/xiaomi/fitness/base/WrapperDayWeekMonthChildFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,217:1\n1#2:218\n*E\n"})
public abstract class WrapperDayWeekMonthChildFragment extends BaseDetailChildFragment {

    @NotNull
    public static final String KEY_OFFSET = "offset";

    @NotNull
    public static final String KEY_SID = "sid";

    @NotNull
    private final WrapperDayWeekMonthChildFragment$broadcastReceiver$1 broadcastReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.base.WrapperDayWeekMonthChildFragment$broadcastReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, "android.intent.action.DATE_CHANGED")) {
                this.this$0.onReceiveDateChange();
            }
        }
    };
    private ViewPager2 mViewPager;
    private int prePositionOffset;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u001f\u001a\u00020\bH\u0016J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\bH\u0016R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000fR\u0014\u0010\u0019\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0011R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0013R\u0014\u0010\u001d\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0011¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/base/WrapperDayWeekMonthChildFragment$CommonFragmentStatePagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fa", "Landroidx/fragment/app/Fragment;", "clz", "Ljava/lang/Class;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "pageSize", "", "sid", "", "prePosition", "<init>", "(Landroidx/fragment/app/Fragment;Ljava/lang/Class;ILjava/lang/String;Ljava/lang/Integer;)V", "getClz", "()Ljava/lang/Class;", "getPageSize", "()I", "getSid", "()Ljava/lang/String;", "getPrePosition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "mFragmentClass", "getMFragmentClass", "mPageSize", "getMPageSize", "mSid", "getMSid", "mPrePosition", "getMPrePosition", "getItemCount", "createFragment", "position", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CommonFragmentStatePagerAdapter extends FragmentStateAdapter {

        @Nullable
        private final Class<BaseFragment> clz;
        private final int pageSize;

        @Nullable
        private final Integer prePosition;

        @Nullable
        private final String sid;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CommonFragmentStatePagerAdapter(@NotNull Fragment fa, @Nullable Class<BaseFragment> cls, int i, @Nullable String str, @Nullable Integer num) {
            super(fa);
            Intrinsics.checkNotNullParameter(fa, "fa");
            this.clz = cls;
            this.pageSize = i;
            this.sid = str;
            this.prePosition = num;
        }

        private final Class<BaseFragment> getMFragmentClass() {
            return this.clz;
        }

        /* JADX INFO: renamed from: getMPageSize, reason: from getter */
        private final int getPageSize() {
            return this.pageSize;
        }

        private final int getMPrePosition() {
            Integer num = this.prePosition;
            if (num != null) {
                return num.intValue();
            }
            return 0;
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
            bundle.putInt("offset", ((getPageSize() - 1) - position) - getMPrePosition());
            bundle.putString("sid", getSid());
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

        @Nullable
        public final Integer getPrePosition() {
            return this.prePosition;
        }

        @Nullable
        public final String getSid() {
            return this.sid;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocalDate getDataOffsetToday(int position) {
        int pageSize = getPageSize();
        int xAxisPosition = getXAxisPosition();
        if (xAxisPosition == 0) {
            LocalDate localDateMinusDays = getMTodayLocalDate().minusDays((pageSize - 1) - position);
            Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "minusDays(...)");
            return localDateMinusDays;
        }
        if (xAxisPosition != 1) {
            return xAxisPosition != 2 ? getMTodayLocalDate() : TimeDateUtil.getFirstDayOfMonth(getMTodayLocalDate().minusMonths((pageSize - 1) - position));
        }
        LocalDate localDatePlusDays = TimeDateUtil.getWeekMonday(getMTodayLocalDate().minusWeeks((pageSize - 1) - position)).plusDays(6);
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
            return xAxisPosition != 2 ? Days.daysBetween(getMTodayLocalDate(), date).getDays() : Months.monthsBetween(TimeDateUtil.getFirstDayOfMonth(getMTodayLocalDate()), TimeDateUtil.getFirstDayOfMonth(date)).getMonths();
        }
        return Weeks.weeksBetween(TimeDateUtil.getWeekMonday(getMTodayLocalDate()), TimeDateUtil.getWeekMonday(date)).getWeeks();
    }

    private final int getViewPagerPosition(Integer fragmentPosition, int pagerOffset, LocalDate date) {
        if (fragmentPosition == null || fragmentPosition.intValue() == 0) {
            return 0;
        }
        int pageSize = (getPageSize() - 1) - pagerOffset;
        int days = Days.daysBetween(date, date.plusMonths(1).minusDays(1)).getDays();
        if (fragmentPosition.intValue() == 1) {
            if (pageSize > 6) {
                return 6;
            }
        } else {
            if (fragmentPosition.intValue() != 2) {
                return 0;
            }
            if (pageSize > days) {
                return days;
            }
        }
        return pageSize;
    }

    private final void initViewPager() {
        CommonFragmentStatePagerAdapter commonFragmentStatePagerAdapter = new CommonFragmentStatePagerAdapter(this, getItemChildFragmentClass(), getPageSize(), getSid(), Integer.valueOf(this.prePositionOffset));
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
        viewPager4.h(new ViewPager2.i() { // from class: com.xiaomi.fitness.base.WrapperDayWeekMonthChildFragment.initViewPager.1
            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                Logger.i(WrapperDayWeekMonthChildFragment.this.getLogTag(), WrapperDayWeekMonthChildFragment.this.getMPageName() + "-onPageSelected:" + position + " CCC 222 ");
                WrapperDayWeekMonthChildFragment wrapperDayWeekMonthChildFragment = WrapperDayWeekMonthChildFragment.this;
                wrapperDayWeekMonthChildFragment.setMCurrentDate(wrapperDayWeekMonthChildFragment.getDataOffsetToday(position));
                Bundle arguments = WrapperDayWeekMonthChildFragment.this.getArguments();
                if (arguments != null) {
                    arguments.putSerializable("local_date", WrapperDayWeekMonthChildFragment.this.getMCurrentDate());
                }
                BaseDetailChildFragment.OnDateSelectChangedListener mSelectChangedListener = WrapperDayWeekMonthChildFragment.this.getMSelectChangedListener();
                if (mSelectChangedListener != null) {
                    mSelectChangedListener.onSelectDateChanged(WrapperDayWeekMonthChildFragment.this.getMCurrentDate());
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
        BaseDetailChildFragment.OnDateSelectChangedListener mSelectChangedListener = getMSelectChangedListener();
        if (mSelectChangedListener != null) {
            mSelectChangedListener.onSelectDateChanged(getMCurrentDate());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onReceiveDateChange() {
        Logger.i(getLogTag(), "onReceiveDateChange " + getMCurrentDate() + " today:" + getMTodayLocalDate());
        refreshPagerPosition();
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
            Bundle arguments = getArguments();
            ViewPager2 viewPager2 = null;
            this.prePositionOffset = getViewPagerPosition(arguments != null ? Integer.valueOf(arguments.getInt("origin", 0)) : null, pageSize, mCurrentDate);
            Logger.i(getLogTag(), "Wrapper " + getMPageName() + "-refreshPagerPosition-" + mCurrentDate + "-xAxisPosition-" + getXAxisPosition() + "-viewPagerOffset-" + viewPagerOffset + "-pagerOffset-" + pageSize);
            ViewPager2 viewPager3 = this.mViewPager;
            if (viewPager3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            } else {
                viewPager2 = viewPager3;
            }
            viewPager2.k(pageSize + this.prePositionOffset, false);
        }
    }

    @NotNull
    public abstract Class<BaseFragment> getItemChildFragmentClass();

    @NotNull
    public abstract String getMPageName();

    @NotNull
    public final LocalDate getMTodayLocalDate() {
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        return localDateNow;
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Context context = getContext();
        if (context != null) {
            SafeDBUtil.INSTANCE.safeUnregisterBroadcastReceiver(context, this.broadcastReceiver);
        }
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

    @Override // com.xiaomi.fitness.base.BaseDetailChildFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        initViewPager();
        SafeDBUtil safeDBUtil = SafeDBUtil.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        WrapperDayWeekMonthChildFragment$broadcastReceiver$1 wrapperDayWeekMonthChildFragment$broadcastReceiver$1 = this.broadcastReceiver;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DATE_CHANGED");
        Unit unit = Unit.INSTANCE;
        safeDBUtil.safeRegisterBroadcastReceiver(contextRequireContext, wrapperDayWeekMonthChildFragment$broadcastReceiver$1, intentFilter, 4);
    }

    @Override // com.xiaomi.fitness.base.BaseDetailChildFragment, com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        refreshPagerPosition();
    }
}
