package com.huawei.health.sport.utils;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.openalliance.ad.constant.ConfigMapDefValues;
import defpackage.ltb;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class FitnessDataQueryDefine {

    public enum FitnessSleepTotalDataId {
        FITNESS_UNSPECIFIC_SLEEP_TIME,
        FITNESS_TOTAL_SLEEP_TIME,
        FITNESS_DEEP_SLEEP_TIME,
        FITNESS_SHALLOW_SLEEP_TIME,
        FITNESS_WAKEUP_DURATION,
        FITNESS_WAKEUP_TIME
    }

    public enum FitnessQueryId {
        FITNESS_TYPE_DEFAULT_HISTOGRAM(0),
        FITNESS_TYPE_DAY_HISTOGRAM(1),
        FITNESS_TYPE_WEEK_HISTOGRAM(2),
        FITNESS_TYPE_MONTH_HISTOGRAM(3),
        FITNESS_TYPE_YEAR_HISTOGRAM(4),
        FITNESS_TYPE_DAY_HISTOGRAM_STEP(5),
        FITNESS_TYPE_UP_SPORT_DETAIL(10),
        FITNESS_TYPE_UP_SLEEP_DETAIL(11),
        FITNESS_TYPE_MYFIT_WALK_DETAIL(12),
        FITNESS_TYPE_MYFIT_CALORIE_DETAIL(13),
        FITNESS_TYPE_DAY_STATISTIC(101),
        FITNESS_TYPE_WEEK_STATISTIC(102),
        FITNESS_TYPE_MONTH_STATISTIC(103),
        FITNESS_TYPE_YEAR_STATISTIC(104),
        FITNESS_TYPE_DAY_STATISTIC_DETAIL(120),
        FITNESS_TYPE_WEEK_STATISTIC_DETAIL(121),
        FITNESS_TYPE_MONTH_STATISTIC_DETAIL(122),
        FITNESS_TYPE_YEAR_STATISTIC_DETAIL(123),
        FITNESS_TYPE_SLEEP_DAY_HISTOGRAM(500),
        FITNESS_TYPE_SLEEP_WEEK_HISTOGRAM(501),
        FITNESS_TYPE_SLEEP_MONTH_HISTOGRAM(TypedValues.PositionType.TYPE_DRAWPATH),
        FITNESS_TYPE_SLEEP_YEAR_HISTOGRAM(503),
        FITNESS_TYPE_SLEEP_DAY_STATISTIC(TypedValues.PositionType.TYPE_POSITION_TYPE),
        FITNESS_TYPE_SLEEP_WEEK_STATISTIC(511),
        FITNESS_TYPE_SLEEP_MONTH_STATISTIC(512),
        FITNESS_TYPE_SLEEP_YEAR_STATISTIC(513),
        FITNESS_TYPE_SLEEP_DAY_STATISTIC_DETAIL(520),
        FITNESS_TYPE_SLEEP_WEEK_STATISTIC_DETAIL(521),
        FITNESS_TYPE_SLEEP_MONTH_STATISTIC_DETAIL(522),
        FITNESS_TYPE_SLEEP_YEAR_STATISTIC_DETAIL(523),
        FITNESS_TYPE_HEARRATE_DAY_LAST_VALUE(600),
        FITNESS_TYPE_HEARRATE_WEEK_LAST_VALUE(601),
        FITNESS_TYPE_HEARRATE_MONTH_LAST_VALUE(602),
        FITNESS_TYPE_HEARRATE_YEAR_LAST_VALUE(TypedValues.MotionType.TYPE_EASING);

        private int mQueryId;

        FitnessQueryId(int i) {
            this.mQueryId = i;
        }

        public int getFitnessQueryId() {
            return this.mQueryId;
        }
    }

    public static int e(long j, FitnessQueryId fitnessQueryId) {
        switch (fitnessQueryId.ordinal()) {
            case 1:
                return 60;
            case 2:
            case 3:
            case 19:
            case 20:
                return ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL;
            case 4:
                return 43800;
            case 5:
                return 30;
            case 6:
            case 7:
            case 8:
            case 9:
                return 1;
            case 10:
            case 14:
                return ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL;
            case 11:
            case 15:
            case 23:
                return 10080;
            case 12:
            case 13:
            case 16:
            case 17:
            case 18:
            case 22:
            default:
                return c(j, fitnessQueryId);
            case 21:
                return a(j) * ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL;
        }
    }

    private static int c(long j, FitnessQueryId fitnessQueryId) {
        switch (fitnessQueryId.ordinal()) {
            case 12:
            case 16:
            case 24:
                return 43200;
            case 13:
            case 17:
            case 25:
            case 29:
                Date date = new Date(j * 1000);
                int iA = 0;
                for (int i = 0; i < 12; i++) {
                    iA += a(ltb.m(ltb.b(date, i))) * ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL;
                }
                return iA;
            case 14:
            case 15:
            case 19:
            case 20:
            case 21:
            case 23:
            case 27:
            case 28:
            default:
                return 0;
            case 18:
                return 1;
            case 22:
                return ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL;
            case 26:
                return 1;
        }
    }

    public static int c(FitnessQueryId fitnessQueryId) {
        int iOrdinal = fitnessQueryId.ordinal();
        if (iOrdinal != 26) {
            switch (iOrdinal) {
                case 1:
                    return 24;
                case 2:
                    return 14;
                case 3:
                    return 60;
                case 4:
                    return 12;
                case 5:
                    return 48;
                default:
                    switch (iOrdinal) {
                        case 18:
                            break;
                        case 19:
                            return 14;
                        case 20:
                            return 60;
                        case 21:
                            return 365;
                        default:
                            return 1;
                    }
                case 6:
                case 7:
                case 8:
                case 9:
                    return ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL;
            }
        }
        return ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL;
    }

    public static int b(FitnessQueryId fitnessQueryId) {
        int iOrdinal = fitnessQueryId.ordinal();
        if (iOrdinal != 26) {
            switch (iOrdinal) {
                case 1:
                    return 24;
                case 2:
                    return 7;
                case 3:
                    return 30;
                case 4:
                    return 12;
                case 5:
                    return 48;
                default:
                    switch (iOrdinal) {
                        case 18:
                            break;
                        case 19:
                            return 7;
                        case 20:
                            return 30;
                        case 21:
                            return 12;
                        default:
                            return 1;
                    }
                case 6:
                case 7:
                case 8:
                case 9:
                    return ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL;
            }
        }
        return ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL;
    }

    public static int a(long j) {
        List listAsList = Arrays.asList("1", "3", "5", "7", "8", "10", "12");
        List listAsList2 = Arrays.asList("4", "6", "9", "11");
        Date date = new Date(j * 1000);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        if (listAsList.contains(String.valueOf(calendar.get(2) + 1))) {
            return 31;
        }
        if (listAsList2.contains(String.valueOf(calendar.get(2) + 1))) {
            return 30;
        }
        int year = date.getYear();
        return ((year % 4 != 0 || year % 100 == 0) && year % 400 != 0) ? 28 : 29;
    }

    public static int a(FitnessQueryId fitnessQueryId) {
        int iOrdinal = fitnessQueryId.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    if (iOrdinal != 5) {
                        switch (iOrdinal) {
                            case 19:
                            case 20:
                            case 21:
                                break;
                            case 22:
                            case 23:
                            case 24:
                            case 26:
                            case 27:
                            case 28:
                                return 3;
                            case 25:
                            case 29:
                                break;
                            default:
                                return 1;
                        }
                    }
                }
                return 5;
            }
            return 3;
        }
        return 1;
    }
}
