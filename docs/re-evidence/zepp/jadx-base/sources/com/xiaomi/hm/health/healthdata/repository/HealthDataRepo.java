package com.xiaomi.hm.health.healthdata.repository;

import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.di.koin.module.AccountModuleKt;
import com.xiaomi.hm.health.healthdata.core.entity.UserDataEntity;
import com.xiaomi.hm.health.healthdata.core.repo.HealthCoreDataRepo;
import com.xiaomi.hm.health.healthdata.dto.DataType;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import com.xiaomi.hm.health.healthdata.dto.StressDataType;
import com.xiaomi.hm.health.healthdata.dto.TemperatureDataType;
import com.xiaomi.hm.health.healthdata.dto.TimeMode;
import com.xiaomi.hm.health.healthdata.ui.detail.healthdata.HealthDataDayHomeFragment;
import com.xiaomi.hm.health.healthdata.ui.detail.healthdata.HealthDataMonthHomeFragment;
import com.xiaomi.hm.health.healthdata.ui.detail.healthdata.HealthDataWeekHomeFragment;
import com.xiaomi.hm.health.healthdata.ui.detail.healthdata.HealthDataYearHomeFragment;
import com.xiaomi.hm.health.healthdata.ui.detail.stress.StressDayHomeFragment;
import com.xiaomi.hm.health.healthdata.ui.detail.stress.StressMonthHomeFragment;
import com.xiaomi.hm.health.healthdata.ui.detail.stress.StressWeekHomeFragment;
import com.xiaomi.hm.health.healthdata.ui.detail.stress.StressYearHomeFragment;
import com.xiaomi.hm.health.healthdata.ui.detail.temperature.TemperatureDayHomeFragment;
import com.xiaomi.hm.health.healthdata.ui.detail.temperature.TemperatureMonthHomeFragment;
import com.xiaomi.hm.health.healthdata.ui.detail.temperature.TemperatureWeekHomeFragment;
import com.xiaomi.hm.health.healthdata.ui.detail.temperature.TemperatureYearHomeFragment;
import com.xiaomi.hm.health.healthdata.ui.vo.TimeParam;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tJ\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0010J\u0016\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0010J\u0016\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0010J\u0016\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0010J\u000e\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001e¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/repository/HealthDataRepo;", "", "Lcom/xiaomi/hm/health/healthdata/dto/DataType;", "type", "Landroidx/fragment/app/Fragment;", "a", "c", "b", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/healthdata/ui/vo/TimeParam;", "timeParam", "", "getTimeToUi", "Lkotlin/Pair;", "", "getTimeRange", "", "isFutureDate", "isBeforeRegisterDate", "Landroid/util/SparseArray;", "timeModeFragments", "time", "next", "offsetDay", "offsetWeek", "offsetMonth", "offsetYear", "Lcom/xiaomi/hm/health/healthdata/dto/HealthDataType;", "findTopDataTime", "Lcom/xiaomi/hm/health/healthdata/core/repo/HealthCoreDataRepo;", "Lcom/xiaomi/hm/health/healthdata/core/repo/HealthCoreDataRepo;", "healthCoreDataRepo", "<init>", "(Lcom/xiaomi/hm/health/healthdata/core/repo/HealthCoreDataRepo;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthDataRepo {
    public static final int TIME_OFFSET_STEP = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HealthCoreDataRepo healthCoreDataRepo;

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

    public HealthDataRepo(@NotNull HealthCoreDataRepo healthCoreDataRepo) {
        this.healthCoreDataRepo = healthCoreDataRepo;
    }

    private final Fragment a(DataType type) {
        if (type instanceof HealthDataType) {
            return new HealthDataDayHomeFragment();
        }
        if (type instanceof StressDataType) {
            return new StressDayHomeFragment();
        }
        return type instanceof TemperatureDataType ? new TemperatureDayHomeFragment() : new Fragment();
    }

    private final Fragment b(DataType type) {
        if (type instanceof HealthDataType) {
            return new HealthDataMonthHomeFragment();
        }
        if (type instanceof StressDataType) {
            return new StressMonthHomeFragment();
        }
        return type instanceof TemperatureDataType ? new TemperatureMonthHomeFragment() : new Fragment();
    }

    private final Fragment c(DataType type) {
        if (type instanceof HealthDataType) {
            return new HealthDataWeekHomeFragment();
        }
        if (type instanceof StressDataType) {
            return new StressWeekHomeFragment();
        }
        return type instanceof TemperatureDataType ? new TemperatureWeekHomeFragment() : new Fragment();
    }

    private final Fragment d(DataType type) {
        if (type instanceof HealthDataType) {
            return new HealthDataYearHomeFragment();
        }
        if (type instanceof StressDataType) {
            return new StressYearHomeFragment();
        }
        return type instanceof TemperatureDataType ? new TemperatureYearHomeFragment() : new Fragment();
    }

    public final long findTopDataTime(@NotNull HealthDataType type) {
        Date uploadTime;
        UserDataEntity userDataEntity = (UserDataEntity) CollectionsKt.firstOrNull((List) this.healthCoreDataRepo.top(type, 1));
        Long lValueOf = null;
        if (userDataEntity != null && (uploadTime = userDataEntity.getUploadTime()) != null) {
            lValueOf = Long.valueOf(uploadTime.getTime());
        }
        return lValueOf == null ? System.currentTimeMillis() : lValueOf.longValue();
    }

    @NotNull
    public final Pair<Long, Long> getTimeRange(@NotNull TimeParam timeParam) {
        TimeMode mode = timeParam.getMode();
        long time = timeParam.getTime();
        int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        if (i == 1) {
            HealthDataTimeUtils healthDataTimeUtils = HealthDataTimeUtils.INSTANCE;
            return new Pair<>(Long.valueOf(healthDataTimeUtils.getDayStartTime(time)), Long.valueOf(healthDataTimeUtils.getDayEndTime(time)));
        }
        if (i == 2) {
            HealthDataTimeUtils healthDataTimeUtils2 = HealthDataTimeUtils.INSTANCE;
            return new Pair<>(Long.valueOf(healthDataTimeUtils2.getFirstDayOfWeekTime(time)), Long.valueOf(healthDataTimeUtils2.getLastDayOfWeekTime(time)));
        }
        if (i == 3) {
            HealthDataTimeUtils healthDataTimeUtils3 = HealthDataTimeUtils.INSTANCE;
            return new Pair<>(Long.valueOf(healthDataTimeUtils3.getFirstDayOfMonthTime(time)), Long.valueOf(healthDataTimeUtils3.getLastDayOfMonthTime(time)));
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        HealthDataTimeUtils healthDataTimeUtils4 = HealthDataTimeUtils.INSTANCE;
        return new Pair<>(Long.valueOf(healthDataTimeUtils4.getFirstDayOfYearTime(time)), Long.valueOf(healthDataTimeUtils4.getLastDayOfYearTime(time)));
    }

    @NotNull
    public final String getTimeToUi(@NotNull TimeParam timeParam) {
        TimeMode mode = timeParam.getMode();
        long time = timeParam.getTime();
        StringBuilder sb = new StringBuilder();
        int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        if (i == 1) {
            sb.append(HealthDataTimeUtils.INSTANCE.formatTimeYMD(time));
        } else if (i == 2) {
            HealthDataTimeUtils healthDataTimeUtils = HealthDataTimeUtils.INSTANCE;
            sb.append(healthDataTimeUtils.getFirstDayOfWeekMD(time));
            sb.append(" - ");
            sb.append(healthDataTimeUtils.getLastDayOfWeekMD(time));
        } else if (i == 3) {
            sb.append(HealthDataTimeUtils.INSTANCE.getMonth(time));
        } else if (i == 4) {
            sb.append(HealthDataTimeUtils.INSTANCE.getYear(time));
        }
        return sb.toString();
    }

    public final boolean isBeforeRegisterDate(@NotNull TimeParam timeParam) {
        TimeMode mode = timeParam.getMode();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeParam.getTime());
        Date time = calendar.getTime();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(AccountModuleKt.getAccountService().getRegisterDate());
        Date time2 = calendar2.getTime();
        int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (HealthDataTimeUtils.INSTANCE.differYear(time2, time) > 0) {
                        return false;
                    }
                } else if (HealthDataTimeUtils.INSTANCE.differMonths(time2, time) > 0) {
                    return false;
                }
            } else if (HealthDataTimeUtils.INSTANCE.differWeeks(time2, time) > 0) {
                return false;
            }
        } else if (HealthDataTimeUtils.INSTANCE.differDays(time2, time) > 0) {
            return false;
        }
        return true;
    }

    public final boolean isFutureDate(@NotNull TimeParam timeParam) {
        TimeMode mode = timeParam.getMode();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeParam.getTime());
        Date time = calendar.getTime();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(System.currentTimeMillis());
        Date time2 = calendar2.getTime();
        int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (HealthDataTimeUtils.INSTANCE.differYear(time, time2) > 0) {
                        return false;
                    }
                } else if (HealthDataTimeUtils.INSTANCE.differMonths(time, time2) > 0) {
                    return false;
                }
            } else if (HealthDataTimeUtils.INSTANCE.differWeeks(time, time2) > 0) {
                return false;
            }
        } else if (HealthDataTimeUtils.INSTANCE.differDays(time, time2) > 0) {
            return false;
        }
        return true;
    }

    public final long offsetDay(long time, boolean next) {
        return HealthDataTimeUtils.INSTANCE.offsetDay(time, 1, next);
    }

    public final long offsetMonth(long time, boolean next) {
        return HealthDataTimeUtils.INSTANCE.offsetMonth(time, 1, next);
    }

    public final long offsetWeek(long time, boolean next) {
        return HealthDataTimeUtils.INSTANCE.offsetWeek(time, 1, next);
    }

    public final long offsetYear(long time, boolean next) {
        return HealthDataTimeUtils.INSTANCE.offsetYear(time, 1, next);
    }

    @NotNull
    public final SparseArray<Fragment> timeModeFragments(@NotNull DataType type) {
        SparseArray<Fragment> sparseArray = new SparseArray<>();
        sparseArray.put(TimeMode.DAY.ordinal(), a(type));
        sparseArray.put(TimeMode.WEEK.ordinal(), c(type));
        sparseArray.put(TimeMode.MONTH.ordinal(), b(type));
        sparseArray.put(TimeMode.YEAR.ordinal(), d(type));
        return sparseArray;
    }
}
