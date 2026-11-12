package com.xiaomi.fit.fitness.export.data.aggregation;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.utils.TimeUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u0000 T2\u00020\u0001:\u0001TB\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0006\u0010-\u001a\u00020.J\u0006\u0010/\u001a\u00020.J\u0006\u00100\u001a\u00020.J\b\u00101\u001a\u00020\u0003H\u0016J\b\u00102\u001a\u00020.H\u0016J'\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002062\n\b\u0002\u00108\u001a\u0004\u0018\u000106¢\u0006\u0002\u00109J\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002060;J\u001e\u0010<\u001a\u001a\u0012\u0004\u0012\u000206\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002060=0;J\u0015\u0010>\u001a\u0004\u0018\u0001062\u0006\u00105\u001a\u000206¢\u0006\u0002\u0010?J\u000e\u0010@\u001a\u0002062\u0006\u00105\u001a\u000206J\u0006\u0010A\u001a\u00020.J-\u0010B\u001a\u0002042\u0006\u0010C\u001a\u0002062\u0006\u0010D\u001a\u0002062\u0006\u0010E\u001a\u0002062\b\u0010F\u001a\u0004\u0018\u000106¢\u0006\u0002\u0010GJ\u0006\u0010H\u001a\u000206J\b\u0010I\u001a\u00020\u000eH\u0016J\u0013\u0010J\u001a\u00020.2\b\u0010K\u001a\u0004\u0018\u00010LH\u0096\u0002J$\u0010M\u001a\u00020.2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\u000f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÂ\u0003J#\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\t\u0010S\u001a\u000206HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0010\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006U"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "time", "", "goalList", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/GoalItem;", "<init>", "(JLjava/util/List;)V", "getTime", "()J", "setTime", "(J)V", "tag", "", "getTag", "()Ljava/lang/String;", "sid", "getSid", "setSid", "(Ljava/lang/String;)V", "stepReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStepReport;", "getStepReport", "()Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStepReport;", "setStepReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStepReport;)V", "calReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyCalorieReport;", "getCalReport", "()Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyCalorieReport;", "setCalReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyCalorieReport;)V", "validStandReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStandReport;", "getValidStandReport", "()Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStandReport;", "setValidStandReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStandReport;)V", "mhStrengthReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyMHStrengthReport;", "getMhStrengthReport", "()Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyMHStrengthReport;", "setMhStrengthReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyMHStrengthReport;)V", "isFinished", "", "containsStanding", "containsMHIntensity", "getTimeStamp", "isEmpty", "updateItem", "", "type", "", "curValue", "goalValue", "(IILjava/lang/Integer;)V", "getItemTypeAndGoal", "", "getItemTypeGoalAndValue", "Lkotlin/Pair;", "getItemGoal", "(I)Ljava/lang/Integer;", "getAchieved", "validate", "changeItem", "oldType", "newType", "achieved", FitnessPersistKey.Rainbow, "(IIILjava/lang/Integer;)V", "getAchievedCount", "toString", "equals", "other", "", "checkGoalListEquals", "list", "comparableList", "component1", "component2", "copy", "hashCode", "Companion", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDailyGoalReport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DailyGoalReport.kt\ncom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,304:1\n1863#2,2:305\n1755#2,3:307\n1755#2,3:310\n1863#2:313\n1864#2:315\n1863#2,2:316\n1863#2,2:318\n1863#2,2:320\n1#3:314\n*S KotlinDebug\n*F\n+ 1 DailyGoalReport.kt\ncom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport\n*L\n55#1:305,2\n83#1:307,3\n89#1:310,3\n103#1:313\n103#1:315\n113#1:316,2\n128#1:318,2\n178#1:320,2\n*E\n"})
public final /* data */ class DailyGoalReport extends DailyBasicReport {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private DailyCalorieReport calReport;

    @SerializedName("goal_items")
    @NotNull
    private final List<GoalItem> goalList;

    @Nullable
    private DailyMHStrengthReport mhStrengthReport;

    @Nullable
    private String sid;

    @Nullable
    private DailyStepReport stepReport;

    @SerializedName("date_time")
    private long time;

    @Nullable
    private DailyStandReport validStandReport;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport$Companion;", "", "<init>", "()V", "getEmptyReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "time", "", "goalMap", "", "", "getRelativeEmptyReport", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDailyGoalReport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DailyGoalReport.kt\ncom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport$Companion\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,304:1\n216#2,2:305\n*S KotlinDebug\n*F\n+ 1 DailyGoalReport.kt\ncom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport$Companion\n*L\n66#1:305,2\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DailyGoalReport getEmptyReport(long time, @NotNull Map<Integer, Integer> goalMap) {
            Intrinsics.checkNotNullParameter(goalMap, "goalMap");
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<Integer, Integer> entry : goalMap.entrySet()) {
                arrayList.add(new GoalItem(entry.getKey().intValue(), entry.getValue().intValue(), 0));
            }
            return new DailyGoalReport(time, arrayList);
        }

        @NotNull
        public final DailyGoalReport getRelativeEmptyReport(long time) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new GoalItem(1, 0, 0));
            arrayList.add(new GoalItem(2, 0, 0));
            arrayList.add(new GoalItem(4, 0, 0));
            return new DailyGoalReport(time, arrayList);
        }
    }

    public /* synthetic */ DailyGoalReport(long j, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, list);
    }

    private final boolean checkGoalListEquals(List<GoalItem> list, List<GoalItem> comparableList) {
        if (list.isEmpty() || comparableList.isEmpty() || list.size() != comparableList.size()) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (GoalItem goalItem : list) {
            linkedHashMap.put(Integer.valueOf(goalItem.getType()), goalItem);
        }
        for (GoalItem goalItem2 : comparableList) {
            GoalItem goalItem3 = (GoalItem) linkedHashMap.get(Integer.valueOf(goalItem2.getType()));
            if (goalItem3 == null || !Intrinsics.areEqual(goalItem2, goalItem3)) {
                return false;
            }
        }
        return true;
    }

    private final List<GoalItem> component2() {
        return this.goalList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DailyGoalReport copy$default(DailyGoalReport dailyGoalReport, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dailyGoalReport.time;
        }
        if ((i & 2) != 0) {
            list = dailyGoalReport.goalList;
        }
        return dailyGoalReport.copy(j, list);
    }

    public static /* synthetic */ void updateItem$default(DailyGoalReport dailyGoalReport, int i, int i2, Integer num, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        dailyGoalReport.updateItem(i, i2, num);
    }

    public final void changeItem(int oldType, int newType, int achieved, @Nullable Integer goal) {
        if (goal == null) {
            return;
        }
        for (GoalItem goalItem : goalList()) {
            if (goalItem.getType() == oldType) {
                goalItem.setType(newType);
                goalItem.setGoalValue(goal.intValue());
                goalItem.setAchievedValue(achieved);
            }
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    public final boolean containsMHIntensity() {
        List<GoalItem> list = this.goalList;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((GoalItem) it.next()).getType() == 4) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsStanding() {
        List<GoalItem> list = this.goalList;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((GoalItem) it.next()).getType() == 3) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final DailyGoalReport copy(long time, @NotNull List<GoalItem> goalList) {
        Intrinsics.checkNotNullParameter(goalList, "goalList");
        return new DailyGoalReport(time, goalList);
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DailyGoalReport)) {
            return false;
        }
        DailyGoalReport dailyGoalReport = (DailyGoalReport) other;
        return Long.valueOf(getTime()).equals(Long.valueOf(dailyGoalReport.getTime())) && checkGoalListEquals(goalList(), dailyGoalReport.goalList());
    }

    public final int getAchieved(int type) {
        for (GoalItem goalItem : goalList()) {
            if (goalItem.getType() == type) {
                return goalItem.getAchievedValue();
            }
        }
        return 0;
    }

    public final int getAchievedCount() {
        int i = 0;
        for (GoalItem goalItem : this.goalList) {
            if (goalItem.getAchievedValue() >= goalItem.getGoalValue()) {
                i++;
            }
        }
        return i;
    }

    @Nullable
    public final DailyCalorieReport getCalReport() {
        return this.calReport;
    }

    @Nullable
    public final Integer getItemGoal(int type) {
        for (GoalItem goalItem : goalList()) {
            if (goalItem.getType() == type) {
                return Integer.valueOf(goalItem.getGoalValue());
            }
        }
        return null;
    }

    @NotNull
    public final Map<Integer, Integer> getItemTypeAndGoal() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (GoalItem goalItem : goalList()) {
            linkedHashMap.put(Integer.valueOf(goalItem.getType()), Integer.valueOf(goalItem.getGoalValue()));
        }
        return linkedHashMap;
    }

    @NotNull
    public final Map<Integer, Pair<Integer, Integer>> getItemTypeGoalAndValue() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (GoalItem goalItem : goalList()) {
            linkedHashMap.put(Integer.valueOf(goalItem.getType()), TuplesKt.to(Integer.valueOf(goalItem.getGoalValue()), Integer.valueOf(goalItem.getAchievedValue())));
        }
        return linkedHashMap;
    }

    @Nullable
    public final DailyMHStrengthReport getMhStrengthReport() {
        return this.mhStrengthReport;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @Nullable
    public String getSid() {
        return this.sid;
    }

    @Nullable
    public final DailyStepReport getStepReport() {
        return this.stepReport;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @NotNull
    public String getTag() {
        return "days";
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public long getTime() {
        return this.time;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport, com.xiaomi.fit.fitness.export.data.aggregation.ISummary
    public long getTimeStamp() {
        return getTime();
    }

    @Nullable
    public final DailyStandReport getValidStandReport() {
        return this.validStandReport;
    }

    @NotNull
    public final List<GoalItem> goalList() {
        ArrayList arrayList = new ArrayList();
        GoalItem goalItem = null;
        GoalItem goalItem2 = null;
        GoalItem goalItem3 = null;
        GoalItem goalItem4 = null;
        for (GoalItem goalItem5 : this.goalList) {
            int type = goalItem5.getType();
            if (type == 1) {
                goalItem2 = goalItem5;
            } else if (type == 2) {
                goalItem = goalItem5;
            } else if (type == 3) {
                goalItem3 = goalItem5;
            } else if (type == 4) {
                goalItem4 = goalItem5;
            }
        }
        if (goalItem != null) {
            ListExtKt.add(arrayList, goalItem);
        }
        if (goalItem2 != null) {
            ListExtKt.add(arrayList, goalItem2);
        }
        if (goalItem3 != null) {
            ListExtKt.add(arrayList, goalItem3);
        } else if (goalItem4 != null) {
            ListExtKt.add(arrayList, goalItem4);
        }
        return arrayList;
    }

    public int hashCode() {
        return (Long.hashCode(this.time) * 31) + this.goalList.hashCode();
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public boolean isEmpty() {
        return this.goalList.isEmpty();
    }

    public final boolean isFinished() {
        Iterator<T> it = this.goalList.iterator();
        while (it.hasNext()) {
            if (!((GoalItem) it.next()).isReachGoal()) {
                return false;
            }
        }
        return true;
    }

    public final void setCalReport(@Nullable DailyCalorieReport dailyCalorieReport) {
        this.calReport = dailyCalorieReport;
    }

    public final void setMhStrengthReport(@Nullable DailyMHStrengthReport dailyMHStrengthReport) {
        this.mhStrengthReport = dailyMHStrengthReport;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setSid(@Nullable String str) {
        this.sid = str;
    }

    public final void setStepReport(@Nullable DailyStepReport dailyStepReport) {
        this.stepReport = dailyStepReport;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setTime(long j) {
        this.time = j;
    }

    public final void setValidStandReport(@Nullable DailyStandReport dailyStandReport) {
        this.validStandReport = dailyStandReport;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        DailyStepReport dailyStepReport = this.stepReport;
        if (dailyStepReport != null) {
            sb.append("steps=");
            sb.append(dailyStepReport.getSteps());
        }
        DailyCalorieReport dailyCalorieReport = this.calReport;
        if (dailyCalorieReport != null) {
            sb.append(", calorie=");
            sb.append(dailyCalorieReport.getCalories());
        }
        DailyStandReport dailyStandReport = this.validStandReport;
        if (dailyStandReport != null) {
            sb.append(", stand=");
            sb.append(dailyStandReport.getStandCount());
        }
        DailyMHStrengthReport dailyMHStrengthReport = this.mhStrengthReport;
        if (dailyMHStrengthReport != null) {
            sb.append(", strength=");
            sb.append(dailyMHStrengthReport.getDuration());
        }
        sb.append("]");
        return "DailyGoalReport(time=" + getTime() + ", time=" + TimeUtils.formatDate("yyyy-MM-dd HH:mm:ss", Long.valueOf(getTime() * ((long) 1000))) + ", goals=" + goalList() + "， detail = " + ((Object) sb) + ")";
    }

    public final void updateItem(int type, int curValue, @Nullable Integer goalValue) {
        for (GoalItem goalItem : goalList()) {
            if (goalItem.getType() == type) {
                goalItem.setAchievedValue(curValue);
                if (goalValue != null) {
                    goalItem.setGoalValue(goalValue.intValue());
                }
            }
        }
    }

    public final boolean validate() {
        List<GoalItem> list;
        boolean z = false;
        if (getTime() > 0 && (list = this.goalList) != null && !list.isEmpty()) {
            Map<Integer, Integer> itemTypeAndGoal = getItemTypeAndGoal();
            if (!itemTypeAndGoal.containsKey(0) && itemTypeAndGoal.size() >= 3) {
                Iterator<GoalItem> it = this.goalList.iterator();
                while (it.hasNext()) {
                    if (it.next().getAchievedValue() > 0) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public DailyGoalReport(long j, @NotNull List<GoalItem> goalList) {
        Intrinsics.checkNotNullParameter(goalList, "goalList");
        this.time = j;
        this.goalList = goalList;
    }
}
