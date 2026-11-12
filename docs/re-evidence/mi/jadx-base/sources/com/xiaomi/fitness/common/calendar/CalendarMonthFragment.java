package com.xiaomi.fitness.common.calendar;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.e4a;
import defpackage.x93;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001f\u0010\u000eJ/\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/common/calendar/CalendarMonthFragment;", "Lcom/xiaomi/fitness/common/calendar/BaseCalendarFragment;", "Lx93$b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onVisible", "()V", "scrollToCurrent", "initRecycler", "bindData", "Lorg/joda/time/LocalDate;", "localDate", "onMonthSelected", "(Lorg/joda/time/LocalDate;)V", "Le4a;", "_binding", "Le4a;", "Lx93;", "mAdapter", "Lx93;", "getBinding", "()Le4a;", "binding", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CalendarMonthFragment extends BaseCalendarFragment implements x93.b {

    @Nullable
    private e4a _binding;

    @Nullable
    private x93 mAdapter;

    @Override // com.xiaomi.fitness.common.calendar.BaseCalendarFragment
    public void bindData() {
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNull(localDateNow);
        LocalDate firstMonthOfTheYear = TimeDateUtil.getFirstMonthOfTheYear(localDateNow);
        if (!getMDataList().isEmpty()) {
            getMDataList().clear();
        }
        getMDataList().add(Long.valueOf(TimeDateUtil.changZeroOfTheDay(firstMonthOfTheYear)));
        for (int i = 1; i < 50; i++) {
            LocalDate localDateMinusYears = firstMonthOfTheYear.minusYears(i);
            LinkedList<Long> mDataList = getMDataList();
            Intrinsics.checkNotNull(localDateMinusYears);
            mDataList.addFirst(Long.valueOf(TimeDateUtil.changZeroOfTheDay(localDateMinusYears)));
        }
        for (int i2 = 1; i2 < 50; i2++) {
            LocalDate localDatePlusYears = firstMonthOfTheYear.plusYears(i2);
            LinkedList<Long> mDataList2 = getMDataList();
            Intrinsics.checkNotNull(localDatePlusYears);
            mDataList2.addLast(Long.valueOf(TimeDateUtil.changZeroOfTheDay(localDatePlusYears)));
        }
    }

    @NotNull
    public final e4a getBinding() {
        e4a e4aVar = this._binding;
        Intrinsics.checkNotNull(e4aVar);
        return e4aVar;
    }

    @Override // com.xiaomi.fitness.common.calendar.BaseCalendarFragment
    public void initRecycler() {
        this.mAdapter = new x93(requireActivity(), getMDataList(), getRecyclerView(), getMSelectDate(), getViewModel().getDots());
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView != null) {
            recyclerView.setAdapter(this.mAdapter);
        }
        x93 x93Var = this.mAdapter;
        Intrinsics.checkNotNull(x93Var);
        x93Var.setOnMonthSelectListener(this);
        bindData();
        x93 x93Var2 = this.mAdapter;
        Intrinsics.checkNotNull(x93Var2);
        x93Var2.l(getMSelectDate() == null ? LocalDate.now() : getMSelectDate());
        x93 x93Var3 = this.mAdapter;
        Intrinsics.checkNotNull(x93Var3);
        x93Var3.m(getMSelectDate());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @Nullable
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this._binding = e4a.A0(inflater, container, false);
        setRecyclerView(getBinding().A);
        return getBinding().getRoot();
    }

    @Override // x93.b
    public void onMonthSelected(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        if (getFromActivity()) {
            requireActivity().setResult(-1, new Intent().putExtra("calendar_date", localDate));
            finish();
            return;
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putSerializable("calendar_date", localDate);
        arguments.putInt("position", 2);
        arguments.putBoolean("calendar", true);
        String fragmentName = getFragmentName();
        if (fragmentName != null) {
            try {
                Class<?> cls = Class.forName(fragmentName);
                Intrinsics.checkNotNull(cls);
                BaseFragmentExKt.gotoPageFinish(this, cls, arguments, 603979776);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        BaseCalendarFragment.OnCalendarSelectChangedListener onCalendarSelectChangedListener = getOnCalendarSelectChangedListener();
        if (onCalendarSelectChangedListener != null) {
            onCalendarSelectChangedListener.onMonthChanged(getMSelectDate());
        }
    }

    @Override // com.xiaomi.fitness.common.calendar.BaseCalendarFragment
    public void scrollToCurrent() {
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        onMonthSelected(localDateNow);
    }
}
