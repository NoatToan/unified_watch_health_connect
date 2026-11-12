package com.xiaomi.fitness.base;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.item.FitnessDeviceItem;
import com.xiaomi.fitness.base.BasicDataViewModel;
import com.xiaomi.fitness.baseui.view.BaseViewModelFragment;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.util.HealthUtil;
import defpackage.hak;
import defpackage.str;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseDataFragment<M extends BasicDataViewModel, T extends RecyclerBarEntry> extends BaseViewModelFragment<M> {
    protected static final int DAY_GET_DATA_DAYS = 5;
    protected static final int MONTH_GET_DATA_MONTHS = 2;
    protected static final int WEEK_GET_DATA_WEEKS = 2;
    protected M basicDataViewModel;
    public LocalDate mCurrentDate;
    protected hak mItemGestureListener;
    protected a mSelectChangedListener;
    public LocalDate mSelectDate;
    protected str<T> mYAxisMaxEntries;
    protected List<T> visibleEntries;

    public interface a {
        default void onDateChanged(LocalDate localDate) {
        }

        default void onDeviceListChanged(List<FitnessDeviceItem> list) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFetchFitnessReport$0(String str, List list) {
        if (isInvalid()) {
            return;
        }
        Logger.d("DailyBasicReport observe invoke isInvalid in !!", new Object[0]);
        onReportChanged(str, list);
    }

    public void changeSid(String str) {
    }

    public boolean checkDidChangeSave() {
        return true;
    }

    public abstract void displayData();

    public void fillChartEntry() {
    }

    public void forceStopRecyclerViewScroll(RecyclerView recyclerView) {
        recyclerView.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
    }

    public LocalDate getCurrentDate() {
        LocalDate localDate = this.mCurrentDate;
        return localDate != null ? localDate : this.mSelectDate;
    }

    public String getTitleDesc(int i, LocalDate localDate) {
        if (i == 0) {
            return TimeDateUtil.getDateYYYYMMddLocalFormat(localDate);
        }
        if (i == 1) {
            return HealthUtil.getWeekDateStr(localDate);
        }
        return i == 2 ? TimeDateUtil.getDateYYYYMMLocalFormat(localDate) : "";
    }

    public void onReportChanged(String str, List<DailyBasicReport> list) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        resetSelectedEntry();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.basicDataViewModel = getMViewModel();
        setActionBarDisplayable(false);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
    }

    public void resetSelectedEntry() {
        hak hakVar = this.mItemGestureListener;
        if (hakVar != null) {
            hakVar.l();
        }
    }

    public abstract void scrollToCurrentCycle();

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void setMenuVisibility(boolean z) {
        super.setMenuVisibility(z);
        if (getView() != null) {
            getView().setVisibility(z ? 0 : 8);
        }
    }

    public void setOnSelectChangedListener(a aVar) {
        this.mSelectChangedListener = aVar;
    }

    public void setVisibleEntries(str strVar) {
        List<T> list = this.visibleEntries;
        if (list == null) {
            this.visibleEntries = new ArrayList();
        } else {
            list.clear();
        }
        this.visibleEntries.addAll(strVar.c);
        if (this.visibleEntries.size() == 0) {
            return;
        }
        if (this.mYAxisMaxEntries == null) {
            this.mYAxisMaxEntries = new str<>();
        }
        this.mYAxisMaxEntries.a(strVar);
        displayData();
    }

    public void triggerFetchFitnessReport(Class cls, final String str, long j, int i, int i2, String str2) {
        Objects.hash(cls, str, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), str2);
        this.basicDataViewModel.triggerFetchFitnessReport(cls, str, j, i, i2, str2).observe(getViewLifecycleOwner(), new Observer() { // from class: j62
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f22454a.lambda$triggerFetchFitnessReport$0(str, (List) obj);
            }
        });
    }
}
