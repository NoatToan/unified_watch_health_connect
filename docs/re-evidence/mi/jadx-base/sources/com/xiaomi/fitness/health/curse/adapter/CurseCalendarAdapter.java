package com.xiaomi.fitness.health.curse.adapter;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.curse.CurseMonthFragment;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bH\u0016J\u000e\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u000bJ\u000e\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0007R\u0018\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/health/curse/adapter/CurseCalendarAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "todayDate", "Lorg/joda/time/LocalDate;", "kotlin.jvm.PlatformType", "Lorg/joda/time/LocalDate;", "todayPos", "", "count", "selectedDay", "setSelectDay", "", "localDate", "getItemCount", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "getDateFromPos", "pos", "getPos", DialWidgetType.DATE, "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CurseCalendarAdapter extends FragmentStateAdapter {
    private final int count;
    private int selectedDay;
    private final LocalDate todayDate;
    private final int todayPos;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurseCalendarAdapter(@NotNull Context context) {
        super((FragmentActivity) context);
        Intrinsics.checkNotNullParameter(context, "context");
        LocalDate localDateNow = LocalDate.now();
        this.todayDate = localDateNow;
        this.todayPos = localDateNow.getMonthOfYear() + 587;
        this.count = 1188;
        this.selectedDay = localDateNow.getDayOfMonth();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public Fragment createFragment(int position) {
        LocalDate dateFromPos = getDateFromPos(position);
        Logger.d("CurseCalendarAdapter", "create CurseMonthFragment: position " + position + " date " + dateFromPos);
        return CurseMonthFragment.INSTANCE.instance(dateFromPos);
    }

    @NotNull
    public final LocalDate getDateFromPos(int pos) {
        LocalDate localDatePlusMonths = this.todayDate.plusMonths(pos - this.todayPos);
        TimeDateUtil timeDateUtil = TimeDateUtil.INSTANCE;
        Intrinsics.checkNotNull(localDatePlusMonths);
        int daysOfMonth = timeDateUtil.getDaysOfMonth(ExtUtilKt.getMills(localDatePlusMonths));
        int i = this.selectedDay;
        if (i <= daysOfMonth) {
            daysOfMonth = i;
        }
        LocalDate localDateWithDayOfMonth = localDatePlusMonths.withDayOfMonth(daysOfMonth);
        Intrinsics.checkNotNullExpressionValue(localDateWithDayOfMonth, "withDayOfMonth(...)");
        return localDateWithDayOfMonth;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount, reason: from getter */
    public int getCount() {
        return this.count;
    }

    public final int getPos(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        LocalDate todayDate = this.todayDate;
        Intrinsics.checkNotNullExpressionValue(todayDate, "todayDate");
        return this.todayPos - TimeDateUtil.getIntervalMonths(date, todayDate);
    }

    public final void setSelectDay(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        this.selectedDay = localDate.getDayOfMonth();
    }
}
