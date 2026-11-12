package com.xiaomi.hm.health.ui.sportfitness.utils;

import android.content.Context;
import android.util.SparseArray;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bodymeasurements.common.utils.TimeFormatUtils;
import com.huami.moving.ui.utils.SportRecordAssembleUtil;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.running.calori.CaloriActivity;
import com.xiaomi.hm.health.ui.sportfitness.enums.ExerciseTimeFilterType;
import com.xiaomi.hm.health.ui.sportfitness.manager.ExerciseTypeChooseManager;
import com.xiaomi.hm.health.ui.sportfitness.model.ExerciseStatSportCountData;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.g;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ+\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\tJ\b\u0010\u000b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0010H\u0007J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0012H\u0007R\u0016\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u000e8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/ui/sportfitness/utils/ExerciseHistoryShareUtils;", "", "Lcom/xiaomi/hm/health/ui/sportfitness/enums/ExerciseTimeFilterType;", CaloriActivity.ARG_FILTER_TYPE, "", "startTime", "endTime", "", "getShareTitleDes", "(Lcom/xiaomi/hm/health/ui/sportfitness/enums/ExerciseTimeFilterType;Ljava/lang/Long;Ljava/lang/Long;)Ljava/lang/String;", "getDateRangeDes", "a", "Lcom/xiaomi/hm/health/ui/sportfitness/model/ExerciseStatSportCountData;", "item", "", "getIconNameByType", "Landroid/util/SparseArray;", "items", "Ljava/util/ArrayList;", "convertToStatSportCountData", "sortStatSportCountData", "STAT_SPORT_TYPE_TRAINING", LogUtil.I, "STAT_SPORT_TYPE_OTHER", "STAT_SPORT_MAX_DISPLAY_NUM", "SPORT_HISTORY_SHARE_SHORT", "Ljava/lang/String;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ExerciseHistoryShareUtils {

    @NotNull
    public static final ExerciseHistoryShareUtils INSTANCE = new ExerciseHistoryShareUtils();

    @NotNull
    public static final String SPORT_HISTORY_SHARE_SHORT = "sportHistory_short.jpg";
    public static final int STAT_SPORT_TYPE_OTHER = -101;
    public static final int STAT_SPORT_TYPE_TRAINING = -100;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int STAT_SPORT_MAX_DISPLAY_NUM = 6;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ExerciseTimeFilterType.values().length];
            iArr[ExerciseTimeFilterType.ALL.ordinal()] = 1;
            iArr[ExerciseTimeFilterType.WEEK.ordinal()] = 2;
            iArr[ExerciseTimeFilterType.MONTH.ordinal()] = 3;
            iArr[ExerciseTimeFilterType.YEAR.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getShareSportName err";
        }
    }

    private ExerciseHistoryShareUtils() {
    }

    private final String a() {
        try {
            Context context = BraceletApp.getContext();
            return HMKeeper.getChooseExerciseType() == 100 ? context.getString(R.string.exercise_history_share_title_sport) : context.getString(ExerciseTypeChooseManager.getInstance().filterExerciseType(false)[1][ExerciseTypeChooseManager.getInstance().getIndexByExerType(HMKeeper.getChooseExerciseType())]);
        } catch (Exception e) {
            HMLog.error$default("ExerciseHistoryShareUtils", null, e, a.a, 2, null);
            return BraceletApp.getContext().getString(R.string.exercise_history_share_title_sport);
        }
    }

    @JvmStatic
    @NotNull
    public static final ArrayList<ExerciseStatSportCountData> convertToStatSportCountData(@Nullable SparseArray<ExerciseStatSportCountData> items) {
        ArrayList arrayList = new ArrayList();
        if (items != null) {
            int i = 0;
            int size = items.size();
            if (size > 0) {
                while (true) {
                    int i2 = i + 1;
                    arrayList.add(items.valueAt(i));
                    if (i2 >= size) {
                        break;
                    }
                    i = i2;
                }
            }
        }
        return sortStatSportCountData(arrayList);
    }

    @JvmStatic
    @NotNull
    public static final String getDateRangeDes(@NotNull ExerciseTimeFilterType filterType, @Nullable Long startTime, @Nullable Long endTime) {
        Context context = BraceletApp.getContext();
        int i = WhenMappings.$EnumSwitchMapping$0[filterType.ordinal()];
        if (i == 1) {
            return "";
        }
        String str = null;
        if (i == 2) {
            Object[] objArr = new Object[2];
            objArr[0] = startTime == null ? null : TimeUtils.formatDate(context, new Date(startTime.longValue()), true);
            objArr[1] = endTime != null ? TimeUtils.formatDate(context, new Date(endTime.longValue()), true) : null;
            return context.getString(R.string.exercise_history_share_title_date, objArr);
        }
        if (i == 3) {
            if (startTime != null) {
                str = new SimpleDateFormat(TimeFormatUtils.PATTERN_YYY_MM, Locale.getDefault()).format(new Date(startTime.longValue()));
            }
            return String.valueOf(str);
        }
        if (i != 4) {
            return "";
        }
        if (startTime != null) {
            str = new SimpleDateFormat("yyyy", Locale.getDefault()).format(new Date(startTime.longValue()));
        }
        return String.valueOf(str);
    }

    @JvmStatic
    public static final int getIconNameByType(@NotNull ExerciseStatSportCountData item) {
        int type = item.getType();
        if (type == -100) {
            return R.string.training_type_exercise;
        }
        if (type == -101) {
            return R.string.exercise_history_stat_sport_count_type_other;
        }
        return type == 16 ? ExerciseTypeChooseManager.getInstance().getWorkoutStrId() : SportRecordAssembleUtil.INSTANCE.getSportIconColorAndName(item.getType(), -1, -1)[2];
    }

    @JvmStatic
    @NotNull
    public static final String getShareTitleDes(@NotNull ExerciseTimeFilterType filterType, @Nullable Long startTime, @Nullable Long endTime) {
        Context context = BraceletApp.getContext();
        String strA = INSTANCE.a();
        int i = WhenMappings.$EnumSwitchMapping$0[filterType.ordinal()];
        if (i == 1) {
            return context.getString(R.string.exercise_history_share_title_des_all, strA);
        }
        if (i == 2) {
            Object[] objArr = new Object[2];
            Object[] objArr2 = new Object[2];
            objArr2[0] = startTime == null ? null : TimeUtils.formatDate_no_y(context, startTime.longValue(), true);
            objArr2[1] = endTime != null ? TimeUtils.formatDate_no_y(context, endTime.longValue(), true) : null;
            objArr[0] = context.getString(R.string.exercise_history_share_title_date, objArr2);
            objArr[1] = strA;
            return context.getString(R.string.exercise_history_share_title_des_week, objArr);
        }
        if (i != 3) {
            if (i == 4 && startTime != null) {
                return context.getString(R.string.exercise_history_share_title_des_month, new SimpleDateFormat("yyyy", Locale.getDefault()).format(new Date(startTime.longValue())) + context.getString(R.string.radio_year), strA);
            }
        } else if (startTime != null) {
            startTime.longValue();
            return context.getString(R.string.exercise_history_share_title_des_month, TimeUtils.formatDate(context.getString(R.string.exercise_history_share_title_month_pattern), startTime.longValue()), strA);
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    @NotNull
    public static final ArrayList<ExerciseStatSportCountData> sortStatSportCountData(@NotNull ArrayList<ExerciseStatSportCountData> items) {
        if (items.size() > 1) {
            g.sortWith(items, new Comparator() { // from class: com.xiaomi.hm.health.ui.sportfitness.utils.ExerciseHistoryShareUtils$sortStatSportCountData$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((ExerciseStatSportCountData) t2).getCount()), Long.valueOf(((ExerciseStatSportCountData) t).getCount()));
                }
            });
        }
        Unit unit = Unit.INSTANCE;
        if (!(items.size() > 6)) {
            unit = null;
        }
        if (unit == null) {
            return items;
        }
        ExerciseStatSportCountData exerciseStatSportCountData = items.get(5);
        int size = items.size();
        if (6 < size) {
            int i = 6;
            while (true) {
                int i2 = i + 1;
                exerciseStatSportCountData.setCount(exerciseStatSportCountData.getCount() + items.get(i).getCount());
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        exerciseStatSportCountData.setType(-101);
        ArrayList<ExerciseStatSportCountData> arrayList = new ArrayList<>();
        int i3 = 0;
        for (Object obj : items) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (i3 < 6) {
                arrayList.add(obj);
            }
            i3 = i4;
        }
        return arrayList;
    }
}
