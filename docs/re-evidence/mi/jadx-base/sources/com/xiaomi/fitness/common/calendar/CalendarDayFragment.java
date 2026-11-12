package com.xiaomi.fitness.common.calendar;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.c4a;
import defpackage.d8h;
import defpackage.t93;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b%\u0010\u0011J/\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/common/calendar/CalendarDayFragment;", "Lcom/xiaomi/fitness/common/calendar/BaseCalendarFragment;", "Ld8h;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onVisible", "()V", "scrollToCurrent", "initRecycler", "bindData", "Lorg/joda/time/LocalDate;", "localDate", "onDaySelected", "(Lorg/joda/time/LocalDate;)V", "Lc4a;", "_binding", "Lc4a;", "", "originPosition", "I", "Lt93;", "mAdapter", "Lt93;", "getBinding", "()Lc4a;", "binding", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CalendarDayFragment extends BaseCalendarFragment implements d8h {

    @Nullable
    private c4a _binding;

    @Nullable
    private t93 mAdapter;
    private int originPosition;

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
        t93 t93Var = new t93(getMDataList(), getRecyclerView(), getMSelectDate(), getViewModel().getDots());
        this.mAdapter = t93Var;
        Intrinsics.checkNotNull(t93Var);
        t93Var.j(getIsShowFuture());
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView != null) {
            recyclerView.setAdapter(this.mAdapter);
        }
        t93 t93Var2 = this.mAdapter;
        Intrinsics.checkNotNull(t93Var2);
        t93Var2.setOnDaySelectListener(this);
        bindData();
        t93 t93Var3 = this.mAdapter;
        Intrinsics.checkNotNull(t93Var3);
        t93Var3.m(getMSelectDate() == null ? LocalDate.now() : getMSelectDate());
        t93 t93Var4 = this.mAdapter;
        Intrinsics.checkNotNull(t93Var4);
        t93Var4.n(getMSelectDate());
    }

    @Override // defpackage.d8h
    public void onDaySelected(@NotNull LocalDate localDate) {
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
        arguments.putInt("position", this.originPosition);
        arguments.putBoolean("calendar", true);
        try {
            String fragmentName = getFragmentName();
            if (fragmentName != null) {
                Class<?> cls = Class.forName(fragmentName);
                Intrinsics.checkNotNull(cls);
                BaseFragmentExKt.gotoPageFinish(this, cls, arguments, 603979776);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @Nullable
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this._binding = c4a.A0(inflater, container, false);
        setRecyclerView(getBinding().A);
        return getBinding().getRoot();
    }

    @Override // com.xiaomi.fitness.common.calendar.BaseCalendarFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        this.originPosition = arguments != null ? arguments.getInt("position", 0) : 0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        BaseCalendarFragment.OnCalendarSelectChangedListener onCalendarSelectChangedListener = getOnCalendarSelectChangedListener();
        if (onCalendarSelectChangedListener != null) {
            onCalendarSelectChangedListener.onDayChanged(getMSelectDate());
        }
    }

    @Override // com.xiaomi.fitness.common.calendar.BaseCalendarFragment
    public void scrollToCurrent() {
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        onDaySelected(localDateNow);
    }
}
