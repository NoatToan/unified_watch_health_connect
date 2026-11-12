package com.xiaomi.hm.health.ui.sportfitness.adapter;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.huami.hmchartui.utils.CommonTimeUtils;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.di.koin.module.AccountModuleKt;
import com.xiaomi.hm.health.ui.sportfitness.ExerciseHistoryFragment;
import com.xiaomi.hm.health.ui.sportfitness.enums.ExerciseTimeFilterType;
import com.xiaomi.hm.health.ui.sportfitness.utils.ExerciseHistoryDateUtils;
import com.xiaomi.hm.health.view.pager.CacheFragmentStatePagerAdapter;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes22.dex */
public class ExerciseHistoryPagerAdapter extends CacheFragmentStatePagerAdapter {
    private ExerciseTimeFilterType g;
    private int h;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ExerciseTimeFilterType.values().length];
            a = iArr;
            try {
                iArr[ExerciseTimeFilterType.WEEK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ExerciseTimeFilterType.MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ExerciseTimeFilterType.YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ExerciseTimeFilterType.ALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public ExerciseHistoryPagerAdapter(FragmentManager fm, ExerciseTimeFilterType filterType) {
        super(fm);
        this.h = 0;
        this.g = filterType;
    }

    private int a() {
        int iDifferWeeks;
        Date date = new Date(AccountModuleKt.getAccountService().getRegisterDate());
        int i = a.a[this.g.ordinal()];
        if (i == 1) {
            iDifferWeeks = CommonTimeUtils.INSTANCE.differWeeks(date, new Date());
        } else if (i == 2) {
            iDifferWeeks = TimeUtils.getDifferMonth(date, new Date());
        } else {
            if (i != 3) {
                return 1;
            }
            iDifferWeeks = ExerciseHistoryDateUtils.getDateYearDiff(date);
        }
        return iDifferWeeks + 1;
    }

    private Pair<Long, Long> b(int position) {
        int pagerCount = (getPagerCount() - 1) - position;
        Calendar calendar = Calendar.getInstance();
        int i = a.a[this.g.ordinal()];
        if (i == 1) {
            calendar.add(3, -pagerCount);
            return ExerciseHistoryDateUtils.getWeekStartEndTime(calendar.getTime());
        }
        if (i == 2) {
            calendar.add(2, -pagerCount);
            return ExerciseHistoryDateUtils.getMonthStartEndTime(calendar.getTime());
        }
        if (i != 3) {
            return new Pair<>(null, null);
        }
        calendar.add(1, -pagerCount);
        return ExerciseHistoryDateUtils.getYearStartEndTime(calendar.getTime());
    }

    @Override // com.xiaomi.hm.health.view.pager.CacheFragmentStatePagerAdapter
    public Fragment createItem(int position) {
        Pair<Long, Long> pairB = b(position);
        return ExerciseHistoryFragment.newInstance(this.g, (Long) pairB.first, (Long) pairB.second);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    /* JADX INFO: renamed from: getCount */
    public int getPagerCount() {
        if (this.h <= 0) {
            this.h = a();
        }
        return this.h;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(@NonNull Object object) {
        return getPagerCount() < 0 ? -1 : -2;
    }
}
