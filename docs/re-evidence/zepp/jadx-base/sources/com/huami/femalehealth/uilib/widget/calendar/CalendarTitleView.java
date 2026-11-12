package com.huami.femalehealth.uilib.widget.calendar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.femalehealth.uilib.widget.calendar.CalendarTitleView;
import com.huami.hmdateformat.date.HMDataFormatKt;
import com.huami.hmdateformat.date.HMPattern;
import com.huami.tools.analytics.DbUtils;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019B\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0018\u0010\u001cB#\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u001eJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007R*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/CalendarTitleView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "year", "month", "", "setTitleDate", "", "show", "isShowReturnToday", "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/Function0;", "getOnReturnToday", "()Lkotlin/jvm/functions/Function0;", "setOnReturnToday", "(Lkotlin/jvm/functions/Function0;)V", "onReturnToday", "b", "getShowSelectDateDialog", "setShowSelectDateDialog", "showSelectDateDialog", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class CalendarTitleView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> onReturnToday;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> showSelectDateDialog;

    public CalendarTitleView(@NotNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(CalendarTitleView calendarTitleView, View view) {
        Function0<Unit> showSelectDateDialog = calendarTitleView.getShowSelectDateDialog();
        if (showSelectDateDialog == null) {
            return;
        }
        showSelectDateDialog.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(CalendarTitleView calendarTitleView, View view) {
        Function0<Unit> showSelectDateDialog = calendarTitleView.getShowSelectDateDialog();
        if (showSelectDateDialog == null) {
            return;
        }
        showSelectDateDialog.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(CalendarTitleView calendarTitleView, View view) {
        Function0<Unit> onReturnToday = calendarTitleView.getOnReturnToday();
        if (onReturnToday == null) {
            return;
        }
        onReturnToday.invoke();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public final Function0<Unit> getOnReturnToday() {
        return this.onReturnToday;
    }

    @Nullable
    public final Function0<Unit> getShowSelectDateDialog() {
        return this.showSelectDateDialog;
    }

    public final void isShowReturnToday(boolean show) {
        ExtKt.setVisible$default((TextView) findViewById(R.id.tv_return_today), show, false, 2, null);
    }

    public final void setOnReturnToday(@Nullable Function0<Unit> function0) {
        this.onReturnToday = function0;
    }

    public final void setShowSelectDateDialog(@Nullable Function0<Unit> function0) {
        this.showSelectDateDialog = function0;
    }

    public final void setTitleDate(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, year);
        calendar.set(2, month - 1);
        calendar.set(5, 1);
        ((TextView) findViewById(R.id.tv_date)).setText(HMDataFormatKt.getFormatTime$default(calendar.getTime(), HMPattern.YEAR_ABBR_MONTH, (Locale) null, 2, (Object) null));
    }

    public CalendarTitleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CalendarTitleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.fh_view_calendar_title, (ViewGroup) this, true);
        ((TextView) findViewById(R.id.tv_date)).setOnClickListener(new View.OnClickListener() { // from class: ph0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CalendarTitleView.d(this.a, view);
            }
        });
        ((ImageView) findViewById(R.id.iv_calendar_select)).setOnClickListener(new View.OnClickListener() { // from class: rh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CalendarTitleView.e(this.a, view);
            }
        });
        ((TextView) findViewById(R.id.tv_return_today)).setOnClickListener(new View.OnClickListener() { // from class: qh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CalendarTitleView.f(this.a, view);
            }
        });
    }
}
