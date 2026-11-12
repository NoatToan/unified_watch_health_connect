package com.xiaomi.fitness.habit.bean;

import com.example.habit.export.HabitBean;
import com.example.habit.export.Today;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/habit/bean/HabitTodayBean;", "", "viewType", "", "today", "Lcom/example/habit/export/Today;", "recommend", "Lcom/example/habit/export/HabitBean;", "<init>", "(ILcom/example/habit/export/Today;Lcom/example/habit/export/HabitBean;)V", "getViewType", "()I", "getToday", "()Lcom/example/habit/export/Today;", "getRecommend", "()Lcom/example/habit/export/HabitBean;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HabitTodayBean {

    @Nullable
    private final HabitBean recommend;

    @Nullable
    private final Today today;
    private final int viewType;

    public HabitTodayBean(int i, @Nullable Today today, @Nullable HabitBean habitBean) {
        this.viewType = i;
        this.today = today;
        this.recommend = habitBean;
    }

    public static /* synthetic */ HabitTodayBean copy$default(HabitTodayBean habitTodayBean, int i, Today today, HabitBean habitBean, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = habitTodayBean.viewType;
        }
        if ((i2 & 2) != 0) {
            today = habitTodayBean.today;
        }
        if ((i2 & 4) != 0) {
            habitBean = habitTodayBean.recommend;
        }
        return habitTodayBean.copy(i, today, habitBean);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getViewType() {
        return this.viewType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Today getToday() {
        return this.today;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HabitBean getRecommend() {
        return this.recommend;
    }

    @NotNull
    public final HabitTodayBean copy(int viewType, @Nullable Today today, @Nullable HabitBean recommend) {
        return new HabitTodayBean(viewType, today, recommend);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HabitTodayBean)) {
            return false;
        }
        HabitTodayBean habitTodayBean = (HabitTodayBean) other;
        return this.viewType == habitTodayBean.viewType && Intrinsics.areEqual(this.today, habitTodayBean.today) && Intrinsics.areEqual(this.recommend, habitTodayBean.recommend);
    }

    @Nullable
    public final HabitBean getRecommend() {
        return this.recommend;
    }

    @Nullable
    public final Today getToday() {
        return this.today;
    }

    public final int getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.viewType) * 31;
        Today today = this.today;
        int iHashCode2 = (iHashCode + (today == null ? 0 : today.hashCode())) * 31;
        HabitBean habitBean = this.recommend;
        return iHashCode2 + (habitBean != null ? habitBean.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HabitTodayBean(viewType=" + this.viewType + ", today=" + this.today + ", recommend=" + this.recommend + ")";
    }
}
