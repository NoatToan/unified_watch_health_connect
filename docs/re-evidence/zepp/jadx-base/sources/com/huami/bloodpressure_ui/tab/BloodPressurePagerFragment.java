package com.huami.bloodpressure_ui.tab;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.bloodpressure_core.ext.UserEx;
import com.huami.bloodpressure_ui.R;
import com.huami.bloodpressure_ui.databinding.FragmentBloodPressurePagerBinding;
import com.huami.bloodpressure_ui.day.BloodPressureDayFragment;
import com.huami.bloodpressure_ui.ext.TimeEx;
import com.huami.bloodpressure_ui.month.BloodPressureMonthFragment;
import com.huami.bloodpressure_ui.week.BloodPressureWeekFragment;
import com.huami.bloodpressure_ui.year.BloodPressureYearFragment;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bR\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/huami/bloodpressure_ui/tab/BloodPressurePagerFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "", "lastDataTimeStamp", "refreshPosition", "a", "J", ParamKey.createTime, "Lcom/huami/bloodpressure_ui/tab/TimeMode;", "b", "Lcom/huami/bloodpressure_ui/tab/TimeMode;", "currentTimeMode", "Lcom/huami/bloodpressure_ui/databinding/FragmentBloodPressurePagerBinding;", "c", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "()Lcom/huami/bloodpressure_ui/databinding/FragmentBloodPressurePagerBinding;", "binding", "<init>", "()V", "Companion", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressurePagerFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private long createTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private TimeMode currentTimeMode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;
    public static final /* synthetic */ KProperty<Object>[] d = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BloodPressurePagerFragment.class), "binding", "getBinding()Lcom/huami/bloodpressure_ui/databinding/FragmentBloodPressurePagerBinding;"))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/huami/bloodpressure_ui/tab/BloodPressurePagerFragment$Companion;", "", "Lcom/huami/bloodpressure_ui/tab/TimeMode;", SleepAnalysisFragment.TIME_MODE, "Lcom/huami/bloodpressure_ui/tab/BloodPressurePagerFragment;", "newInstance", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final BloodPressurePagerFragment newInstance(@NotNull TimeMode timeMode) {
            BloodPressurePagerFragment bloodPressurePagerFragment = new BloodPressurePagerFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("TIME_MODE", timeMode.ordinal());
            Unit unit = Unit.INSTANCE;
            bloodPressurePagerFragment.setArguments(bundle);
            return bloodPressurePagerFragment;
        }
    }

    public BloodPressurePagerFragment() {
        super(R.layout.fragment_blood_pressure_pager);
        this.currentTimeMode = TimeMode.DAY;
        this.binding = FragmentViewBindingKt.viewBinding(new BloodPressurePagerFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(FragmentBloodPressurePagerBinding.class)));
    }

    private final FragmentBloodPressurePagerBinding b() {
        return (FragmentBloodPressurePagerBinding) this.binding.getValue(this, d[0]);
    }

    @JvmStatic
    @NotNull
    public static final BloodPressurePagerFragment newInstance(@NotNull TimeMode timeMode) {
        return INSTANCE.newInstance(timeMode);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        TimeMode timeMode;
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i = arguments.getInt("TIME_MODE", TimeMode.DAY.ordinal());
            TimeMode[] timeModeArrValues = TimeMode.values();
            int length = timeModeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    timeMode = null;
                    break;
                }
                timeMode = timeModeArrValues[i2];
                if (timeMode.ordinal() == i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (timeMode == null) {
                timeMode = TimeMode.DAY;
            }
            this.currentTimeMode = timeMode;
        }
        long userCreateTime = UserEx.getUserCreateTime();
        this.createTime = userCreateTime;
        int differFromRegisterDay$default = TimeEx.getDifferFromRegisterDay$default(TimeEx.INSTANCE, 0L, userCreateTime, this.currentTimeMode, 1, null) + 1;
        b().viewpager.setAdapter(new FragmentStateAdapter(differFromRegisterDay$default, this) { // from class: com.huami.bloodpressure_ui.tab.BloodPressurePagerFragment.onViewCreated.2
            public final /* synthetic */ int a;
            public final /* synthetic */ BloodPressurePagerFragment b;

            /* JADX INFO: renamed from: com.huami.bloodpressure_ui.tab.BloodPressurePagerFragment$onViewCreated$2$WhenMappings */
            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TimeMode.values().length];
                    iArr[TimeMode.DAY.ordinal()] = 1;
                    iArr[TimeMode.WEEK.ordinal()] = 2;
                    iArr[TimeMode.MONTH.ordinal()] = 3;
                    iArr[TimeMode.YEAR.ordinal()] = 4;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this);
                this.b = this;
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter
            @NotNull
            public Fragment createFragment(int position) {
                long timeFromRegisterDay = TimeEx.INSTANCE.getTimeFromRegisterDay(position, this.b.currentTimeMode, this.b.createTime);
                int i3 = WhenMappings.$EnumSwitchMapping$0[this.b.currentTimeMode.ordinal()];
                if (i3 == 1) {
                    return BloodPressureDayFragment.INSTANCE.newInstance(timeFromRegisterDay);
                }
                if (i3 == 2) {
                    return BloodPressureWeekFragment.INSTANCE.newInstance(timeFromRegisterDay);
                }
                if (i3 == 3) {
                    return BloodPressureMonthFragment.INSTANCE.newInstance(timeFromRegisterDay);
                }
                if (i3 == 4) {
                    return BloodPressureYearFragment.INSTANCE.newInstance(timeFromRegisterDay);
                }
                throw new NoWhenBranchMatchedException();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            /* JADX INFO: renamed from: getItemCount, reason: from getter */
            public int getA() {
                return this.a;
            }
        });
        b().viewpager.setCurrentItem(differFromRegisterDay$default - 1, false);
        b().viewpager.setOffscreenPageLimit(1);
    }

    public final void refreshPosition(long lastDataTimeStamp) {
        b().viewpager.setCurrentItem(TimeEx.INSTANCE.getDifferFromRegisterDay(lastDataTimeStamp, this.createTime, this.currentTimeMode), false);
    }
}
