package com.xiaomi.hm.health.device.settings.todo.view;

import android.content.Context;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.haibin.calendarview.CalendarView;
import com.huami.devicex.R;
import com.huami.devicex.databinding.ViewLayoutTodoCalendarBinding;
import com.huami.lib.rainbow.ListTile;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.xiaomi.hm.health.device.settings.todo.view.TodoCalendarView;
import java.util.Calendar;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fB\u001b\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001e\u0010\"B#\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b\u001e\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0005\u001a\u00020\u0002*\u00020\u0004H\u0002J\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002J\f\u0010\n\u001a\u00020\t*\u00020\u0007H\u0002J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\u0007J\u0010\u0010\u0010\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007R$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/view/TodoCalendarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "e", "Lcom/huami/devicex/databinding/ViewLayoutTodoCalendarBinding;", "f", "Lcom/haibin/calendarview/Calendar;", "Ljava/util/Calendar;", z.j, "", GoogleApiAvailabilityLight.a, "cal", "", "smoothScroll", "setDate", "getDate", "setTime", "Landroid/view/View$OnClickListener;", "a", "Landroid/view/View$OnClickListener;", "getTimeClickListener", "()Landroid/view/View$OnClickListener;", "setTimeClickListener", "(Landroid/view/View$OnClickListener;)V", "timeClickListener", "b", "Lcom/huami/devicex/databinding/ViewLayoutTodoCalendarBinding;", "binding", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class TodoCalendarView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private View.OnClickListener timeClickListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private ViewLayoutTodoCalendarBinding binding;

    public TodoCalendarView(@NotNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String d(Calendar calendar) {
        return DateUtils.formatDateTime(getContext(), calendar.getTimeInMillis(), 65588);
    }

    private final void e() {
        ViewLayoutTodoCalendarBinding viewLayoutTodoCalendarBindingBind = ViewLayoutTodoCalendarBinding.bind(LayoutInflater.from(getContext()).inflate(R.layout.view_layout_todo_calendar, (ViewGroup) this, true));
        this.binding = viewLayoutTodoCalendarBindingBind;
        Objects.requireNonNull(viewLayoutTodoCalendarBindingBind);
        f(viewLayoutTodoCalendarBindingBind);
    }

    private final void f(final ViewLayoutTodoCalendarBinding viewLayoutTodoCalendarBinding) {
        viewLayoutTodoCalendarBinding.tvYearMonth.setText(d(j(viewLayoutTodoCalendarBinding.calendarView.getSelectedCalendar())));
        viewLayoutTodoCalendarBinding.calendarView.setOnCalendarSelectListener(new CalendarView.OnCalendarSelectListener() { // from class: com.xiaomi.hm.health.device.settings.todo.view.TodoCalendarView$init$1
            @Override // com.haibin.calendarview.CalendarView.OnCalendarSelectListener
            public void onCalendarOutOfRange(@NotNull com.haibin.calendarview.Calendar calendar) {
            }

            @Override // com.haibin.calendarview.CalendarView.OnCalendarSelectListener
            public void onCalendarSelect(@NotNull com.haibin.calendarview.Calendar cal, boolean isClick) {
                TextView textView = viewLayoutTodoCalendarBinding.tvYearMonth;
                TodoCalendarView todoCalendarView = this;
                textView.setText(todoCalendarView.d(todoCalendarView.j(cal)));
            }
        });
        viewLayoutTodoCalendarBinding.ivPrev.setOnClickListener(new View.OnClickListener() { // from class: qp7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TodoCalendarView.g(viewLayoutTodoCalendarBinding, view);
            }
        });
        viewLayoutTodoCalendarBinding.ivNext.setOnClickListener(new View.OnClickListener() { // from class: rp7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TodoCalendarView.h(viewLayoutTodoCalendarBinding, view);
            }
        });
        viewLayoutTodoCalendarBinding.timeTile.setOnClickListener(new View.OnClickListener() { // from class: sp7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TodoCalendarView.i(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(ViewLayoutTodoCalendarBinding viewLayoutTodoCalendarBinding, View view) {
        viewLayoutTodoCalendarBinding.calendarView.scrollToPre(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(ViewLayoutTodoCalendarBinding viewLayoutTodoCalendarBinding, View view) {
        viewLayoutTodoCalendarBinding.calendarView.scrollToNext(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(TodoCalendarView todoCalendarView, View view) {
        View.OnClickListener timeClickListener = todoCalendarView.getTimeClickListener();
        if (timeClickListener == null) {
            return;
        }
        timeClickListener.onClick(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Calendar j(com.haibin.calendarview.Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(calendar.getYear(), calendar.getMonth() - 1, calendar.getDay(), 0, 0, 0);
        calendar2.set(14, 0);
        return calendar2;
    }

    public static /* synthetic */ void setDate$default(TodoCalendarView todoCalendarView, Calendar calendar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        todoCalendarView.setDate(calendar, z);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final Calendar getDate() {
        ViewLayoutTodoCalendarBinding viewLayoutTodoCalendarBinding = this.binding;
        Objects.requireNonNull(viewLayoutTodoCalendarBinding);
        return j(viewLayoutTodoCalendarBinding.calendarView.getSelectedCalendar());
    }

    @Nullable
    public final View.OnClickListener getTimeClickListener() {
        return this.timeClickListener;
    }

    public final void setDate(@NotNull Calendar cal, boolean smoothScroll) {
        ViewLayoutTodoCalendarBinding viewLayoutTodoCalendarBinding = this.binding;
        Objects.requireNonNull(viewLayoutTodoCalendarBinding);
        viewLayoutTodoCalendarBinding.calendarView.scrollToCalendar(cal.get(1), cal.get(2) + 1, cal.get(5), smoothScroll, true);
    }

    public final void setTime(@Nullable Calendar cal) {
        ViewLayoutTodoCalendarBinding viewLayoutTodoCalendarBinding = this.binding;
        Objects.requireNonNull(viewLayoutTodoCalendarBinding);
        ListTile listTile = viewLayoutTodoCalendarBinding.timeTile;
        String dateTime = cal == null ? null : DateUtils.formatDateTime(getContext(), cal.getTimeInMillis(), 1);
        if (dateTime == null) {
            dateTime = getContext().getString(R.string.info_empty);
        }
        listTile.setTips(dateTime);
    }

    public final void setTimeClickListener(@Nullable View.OnClickListener onClickListener) {
        this.timeClickListener = onClickListener;
    }

    public TodoCalendarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TodoCalendarView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e();
    }
}
