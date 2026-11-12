package com.huami.bloodoxygen.ui.utils;

import com.huami.bloodoxygen.ui.dto.TimeMode;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.tools.log.HMLog;
import java.util.Date;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001e\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/bloodoxygen/ui/utils/DataUtils;", "", "Lcom/huami/bloodoxygen/ui/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "Ljava/util/Date;", "startDate", "", "getTotalPageCount", "curDate", "registerDate", "getDifferFromRegisterDay", "offset", "", "getTimeFromStartByOffset", "", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class DataUtils {

    @NotNull
    public static final DataUtils INSTANCE = new DataUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "DataUtils";

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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Date a;
        public final /* synthetic */ Date b;
        public final /* synthetic */ TimeMode c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Date date, Date date2, TimeMode timeMode, int i) {
            super(0);
            this.a = date;
            this.b = date2;
            this.c = timeMode;
            this.d = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            TimeUtils timeUtils = TimeUtils.INSTANCE;
            return "curDate:" + timeUtils.formatTimeYMDHHmm(this.a.getTime()) + ",registerDate:" + timeUtils.formatTimeYMDHHmm(this.b.getTime()) + ",timeMode:" + this.c + "->differ:" + this.d;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ TimeMode a;
        public final /* synthetic */ Date b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TimeMode timeMode, Date date, int i) {
            super(0);
            this.a = timeMode;
            this.b = date;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "timeMode:" + this.a + ",startDate:" + this.b + ",pageCount:" + this.c;
        }
    }

    private DataUtils() {
    }

    public final int getDifferFromRegisterDay(@NotNull Date curDate, @NotNull Date registerDate, @NotNull TimeMode timeMode) {
        int iDifferDays;
        int i = WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()];
        if (i == 1) {
            iDifferDays = TimeUtils.INSTANCE.differDays(registerDate, curDate);
        } else if (i == 2) {
            iDifferDays = TimeUtils.INSTANCE.differWeeks(registerDate, curDate);
        } else if (i == 3) {
            iDifferDays = TimeUtils.INSTANCE.differMonths(registerDate, curDate);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            iDifferDays = TimeUtils.INSTANCE.differYear(registerDate, curDate);
        }
        HMLog.info(TAG, new a(curDate, registerDate, timeMode, iDifferDays));
        return iDifferDays;
    }

    public final long getTimeFromStartByOffset(@NotNull TimeMode timeMode, @NotNull Date startDate, int offset) {
        int i = WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()];
        if (i == 1) {
            return TimeUtils.offsetDay$default(TimeUtils.INSTANCE, startDate, offset, false, 4, null);
        }
        if (i == 2) {
            return TimeUtils.offsetWeek$default(TimeUtils.INSTANCE, startDate, offset, false, 4, null);
        }
        if (i == 3) {
            return TimeUtils.offsetMonth$default(TimeUtils.INSTANCE, startDate, offset, false, 4, null);
        }
        if (i == 4) {
            return TimeUtils.offsetYear$default(TimeUtils.INSTANCE, startDate, offset, false, 4, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int getTotalPageCount(@NotNull TimeMode timeMode, @NotNull Date startDate) {
        int iDifferDays$default;
        int i = WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()];
        if (i == 1) {
            iDifferDays$default = TimeUtils.differDays$default(TimeUtils.INSTANCE, startDate, null, 2, null);
        } else if (i == 2) {
            iDifferDays$default = TimeUtils.differWeeks$default(TimeUtils.INSTANCE, startDate, null, 2, null);
        } else if (i == 3) {
            iDifferDays$default = TimeUtils.differMonths$default(TimeUtils.INSTANCE, startDate, null, 2, null);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            iDifferDays$default = TimeUtils.differYear$default(TimeUtils.INSTANCE, startDate, null, 2, null);
        }
        int i2 = iDifferDays$default + 1;
        HMLog.info(TAG, new b(timeMode, startDate, i2));
        return i2;
    }
}
