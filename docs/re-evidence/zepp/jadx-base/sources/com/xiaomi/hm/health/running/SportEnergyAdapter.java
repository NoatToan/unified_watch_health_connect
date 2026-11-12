package com.xiaomi.hm.health.running;

import android.util.Pair;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.huami.hmchartui.utils.CommonTimeUtils;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.di.koin.module.AccountModuleKt;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import com.xiaomi.hm.health.running.calori.SportFilterType;
import com.xiaomi.hm.health.ui.sportfitness.utils.ExerciseHistoryDateUtils;
import java.util.Calendar;
import java.util.Date;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0019\u0010\u000e\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\u00020\u00058F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0016\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u000f\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/running/SportEnergyAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "", "position", "Landroid/util/Pair;", "", "a", "Landroidx/fragment/app/Fragment;", "getItem", "getCount", "Lcom/xiaomi/hm/health/running/calori/SportFilterType;", "Lcom/xiaomi/hm/health/running/calori/SportFilterType;", "getType", "()Lcom/xiaomi/hm/health/running/calori/SportFilterType;", "type", "b", "Lkotlin/Lazy;", "getCreateTime", "()J", ParamKey.createTime, "c", "()I", "pageCount", "Landroidx/fragment/app/FragmentManager;", "fm", "<init>", "(Landroidx/fragment/app/FragmentManager;Lcom/xiaomi/hm/health/running/calori/SportFilterType;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SportEnergyAdapter extends FragmentStatePagerAdapter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SportFilterType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy createTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy pageCount;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SportFilterType.values().length];
            iArr[SportFilterType.WEEK.ordinal()] = 1;
            iArr[SportFilterType.MONTH.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\t\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Long> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        public final long a() {
            return AccountModuleKt.getAccountService().getRegisterDate();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Long invoke() {
            return Long.valueOf(a());
        }
    }

    public SportEnergyAdapter(@NotNull FragmentManager fragmentManager, @NotNull SportFilterType sportFilterType) {
        super(fragmentManager);
        this.type = sportFilterType;
        this.createTime = LazyKt__LazyJVMKt.lazy(a.a);
        this.pageCount = LazyKt__LazyJVMKt.lazy(new Function0<Integer>() { // from class: com.xiaomi.hm.health.running.SportEnergyAdapter$pageCount$2

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[SportFilterType.values().length];
                    iArr[SportFilterType.WEEK.ordinal()] = 1;
                    iArr[SportFilterType.MONTH.ordinal()] = 2;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Integer invoke() {
                return Integer.valueOf(invoke2());
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final int invoke2() {
                int iDifferWeeks;
                HealthDataTimeUtils healthDataTimeUtils = HealthDataTimeUtils.INSTANCE;
                Date stringToDate = healthDataTimeUtils.parseStringToDate(healthDataTimeUtils.formatTimeYMD(this.a.getCreateTime()));
                if (stringToDate == null) {
                    stringToDate = new Date();
                }
                int i = WhenMappings.$EnumSwitchMapping$0[this.a.getType().ordinal()];
                if (i != 1) {
                    iDifferWeeks = i != 2 ? TimeUtils.getDeltaDayCount(stringToDate, new Date()) : TimeUtils.getDifferMonth(stringToDate, new Date());
                } else {
                    iDifferWeeks = CommonTimeUtils.INSTANCE.differWeeks(stringToDate, new Date());
                }
                return iDifferWeeks + 1;
            }
        });
    }

    private final Pair<Long, Long> a(int position) {
        int iB = (b() - 1) - position;
        Calendar calendar = Calendar.getInstance();
        int i = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i == 1) {
            calendar.add(3, -iB);
            return ExerciseHistoryDateUtils.getWeekStartEndTime(calendar.getTime());
        }
        if (i != 2) {
            calendar.add(6, -iB);
            return ExerciseHistoryDateUtils.getDayStartEndTime(calendar.getTime());
        }
        calendar.add(2, -iB);
        return ExerciseHistoryDateUtils.getMonthStartEndTime(calendar.getTime());
    }

    private final int b() {
        return ((Number) this.pageCount.getValue()).intValue();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    /* JADX INFO: renamed from: getCount */
    public int getPagerCount() {
        return b();
    }

    public final long getCreateTime() {
        return ((Number) this.createTime.getValue()).longValue();
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    @NotNull
    public Fragment getItem(int position) {
        Pair<Long, Long> pairA = a(position);
        return EnergyItemFragment.INSTANCE.newInstance(this.type, ((Number) pairA.first).longValue(), ((Number) pairA.second).longValue(), position == b() - 1);
    }

    @NotNull
    public final SportFilterType getType() {
        return this.type;
    }
}
