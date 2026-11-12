package com.xiaomi.fitness.common.calendar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.c4a;
import defpackage.ja3;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001f\u0010\u000eJ/\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/common/calendar/CalendarWeekFragment;", "Lcom/xiaomi/fitness/common/calendar/BaseCalendarFragment;", "Lja3$b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onVisible", "()V", "scrollToCurrent", "initRecycler", "bindData", "Lorg/joda/time/LocalDate;", "localDate", "onWeekSelected", "(Lorg/joda/time/LocalDate;)V", "Lc4a;", "_binding", "Lc4a;", "Lja3;", "mAdapter", "Lja3;", "getBinding", "()Lc4a;", "binding", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CalendarWeekFragment extends BaseCalendarFragment implements ja3.b {

    @Nullable
    private c4a _binding;

    @Nullable
    private ja3 mAdapter;

    @Override // com.xiaomi.fitness.common.calendar.BaseCalendarFragment
    public void bindData() {
        LocalDate firstDayOfMonth = TimeDateUtil.getFirstDayOfMonth(LocalDate.now());
        if (!getMDataList().isEmpty()) {
            getMDataList().clear();
        }
        getMDataList().add(Long.valueOf(TimeDateUtil.changZeroOfTheDay(firstDayOfMonth)));
        for (int i = 1; i < 500; i++) {
            LocalDate localDateMinusMonths = firstDayOfMonth.minusMonths(i);
            LinkedList<Long> mDataList = getMDataList();
            Intrinsics.checkNotNull(localDateMinusMonths);
            mDataList.addFirst(Long.valueOf(TimeDateUtil.changZeroOfTheDay(localDateMinusMonths)));
        }
        for (int i2 = 1; i2 < 500; i2++) {
            LocalDate localDatePlusMonths = firstDayOfMonth.plusMonths(i2);
            LinkedList<Long> mDataList2 = getMDataList();
            Intrinsics.checkNotNull(localDatePlusMonths);
            mDataList2.addLast(Long.valueOf(TimeDateUtil.changZeroOfTheDay(localDatePlusMonths)));
        }
    }

    @NotNull
    public final c4a getBinding() {
        c4a c4aVar = this._binding;
        Intrinsics.checkNotNull(c4aVar);
        return c4aVar;
    }

    @Override // com.xiaomi.fitness.common.calendar.BaseCalendarFragment
    public void initRecycler() {
        this.mAdapter = new ja3(requireActivity(), getMDataList(), getRecyclerView(), getMSelectDate(), getViewModel().getDots());
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView != null) {
            recyclerView.setAdapter(this.mAdapter);
        }
        ja3 ja3Var = this.mAdapter;
        Intrinsics.checkNotNull(ja3Var);
        ja3Var.setOnWeekSelectListener(this);
        bindData();
        ja3 ja3Var2 = this.mAdapter;
        Intrinsics.checkNotNull(ja3Var2);
        ja3Var2.l(getMSelectDate() == null ? LocalDate.now() : getMSelectDate());
        ja3 ja3Var3 = this.mAdapter;
        Intrinsics.checkNotNull(ja3Var3);
        ja3Var3.m(getMSelectDate());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @Nullable
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this._binding = c4a.A0(inflater, container, false);
        setRecyclerView(getBinding().A);
        return getBinding().getRoot();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        BaseCalendarFragment.OnCalendarSelectChangedListener onCalendarSelectChangedListener = getOnCalendarSelectChangedListener();
        if (onCalendarSelectChangedListener != null) {
            onCalendarSelectChangedListener.onWeekChanged(getMSelectDate());
        }
    }

    @Override // ja3.b
    public void onWeekSelected(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putSerializable("calendar_date", localDate);
        arguments.putInt("position", 1);
        arguments.putBoolean("calendar", true);
        try {
            if (getFragmentName() != null) {
                String fragmentName = getFragmentName();
                Intrinsics.checkNotNull(fragmentName);
                Class<?> cls = Class.forName(fragmentName);
                Intrinsics.checkNotNull(cls);
                BaseFragmentExKt.gotoPageFinish(this, cls, arguments, 603979776);
            } else {
                Logger.i("jump fragmentName is null", new Object[0]);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override // com.xiaomi.fitness.common.calendar.BaseCalendarFragment
    public void scrollToCurrent() {
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        onWeekSelected(localDateNow);
    }
}
