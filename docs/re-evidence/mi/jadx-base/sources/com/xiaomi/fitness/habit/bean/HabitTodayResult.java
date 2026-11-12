package com.xiaomi.fitness.habit.bean;

import com.example.habit.export.HabitBean;
import com.example.habit.export.Today;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\nHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/habit/bean/HabitTodayResult;", "", "recommend", "", "Lcom/example/habit/export/HabitBean;", "today", "Lcom/example/habit/export/Today;", "updateTime", "", "userAllHabit", "", "<init>", "(Ljava/util/List;Ljava/util/List;JI)V", "getRecommend", "()Ljava/util/List;", "getToday", "getUpdateTime", "()J", "getUserAllHabit", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HabitTodayResult {

    @NotNull
    private final List<HabitBean> recommend;

    @NotNull
    private final List<Today> today;
    private final long updateTime;
    private final int userAllHabit;

    /* JADX WARN: Multi-variable type inference failed */
    public HabitTodayResult(@NotNull List<? extends HabitBean> recommend, @NotNull List<Today> today, long j, int i) {
        Intrinsics.checkNotNullParameter(recommend, "recommend");
        Intrinsics.checkNotNullParameter(today, "today");
        this.recommend = recommend;
        this.today = today;
        this.updateTime = j;
        this.userAllHabit = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HabitTodayResult copy$default(HabitTodayResult habitTodayResult, List list, List list2, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = habitTodayResult.recommend;
        }
        if ((i2 & 2) != 0) {
            list2 = habitTodayResult.today;
        }
        List list3 = list2;
        if ((i2 & 4) != 0) {
            j = habitTodayResult.updateTime;
        }
        long j2 = j;
        if ((i2 & 8) != 0) {
            i = habitTodayResult.userAllHabit;
        }
        return habitTodayResult.copy(list, list3, j2, i);
    }

    @NotNull
    public final List<HabitBean> component1() {
        return this.recommend;
    }

    @NotNull
    public final List<Today> component2() {
        return this.today;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getUserAllHabit() {
        return this.userAllHabit;
    }

    @NotNull
    public final HabitTodayResult copy(@NotNull List<? extends HabitBean> recommend, @NotNull List<Today> today, long updateTime, int userAllHabit) {
        Intrinsics.checkNotNullParameter(recommend, "recommend");
        Intrinsics.checkNotNullParameter(today, "today");
        return new HabitTodayResult(recommend, today, updateTime, userAllHabit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HabitTodayResult)) {
            return false;
        }
        HabitTodayResult habitTodayResult = (HabitTodayResult) other;
        return Intrinsics.areEqual(this.recommend, habitTodayResult.recommend) && Intrinsics.areEqual(this.today, habitTodayResult.today) && this.updateTime == habitTodayResult.updateTime && this.userAllHabit == habitTodayResult.userAllHabit;
    }

    @NotNull
    public final List<HabitBean> getRecommend() {
        return this.recommend;
    }

    @NotNull
    public final List<Today> getToday() {
        return this.today;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final int getUserAllHabit() {
        return this.userAllHabit;
    }

    public int hashCode() {
        return (((((this.recommend.hashCode() * 31) + this.today.hashCode()) * 31) + Long.hashCode(this.updateTime)) * 31) + Integer.hashCode(this.userAllHabit);
    }

    @NotNull
    public String toString() {
        return "HabitTodayResult(recommend=" + this.recommend + ", today=" + this.today + ", updateTime=" + this.updateTime + ", userAllHabit=" + this.userAllHabit + ")";
    }
}
