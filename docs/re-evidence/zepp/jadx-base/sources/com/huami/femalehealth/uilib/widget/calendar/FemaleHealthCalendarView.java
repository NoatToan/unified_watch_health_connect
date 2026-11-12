package com.huami.femalehealth.uilib.widget.calendar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.calendarview.Calendar;
import com.huami.calendarview.CalendarView;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.helper.DateTriple;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.helper.ResourceHelper;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.femalehealth.uilib.widget.calendar.dialog.CalendarSelectDialog;
import com.huami.femalehealth.uilib.widget.calendar.status.CalendarPeriodStyle;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001IB\u0011\b\u0016\u0012\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CB\u001b\b\u0016\u0012\u0006\u0010A\u001a\u00020@\u0012\b\u0010E\u001a\u0004\u0018\u00010D¢\u0006\u0004\bB\u0010FB#\b\u0016\u0012\u0006\u0010A\u001a\u00020@\u0012\b\u0010E\u001a\u0004\u0018\u00010D\u0012\u0006\u0010G\u001a\u00020\r¢\u0006\u0004\bB\u0010HJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\u001a\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016J.\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\tJ!\u0010\u0014\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\tR?\u0010!\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010)\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R$\u00104\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0016\u00107\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0013\u0010?\u001a\u00020<8F@\u0006¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006J"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/FemaleHealthCalendarView;", "Landroidx/cardview/widget/CardView;", "Lcom/huami/calendarview/CalendarView$OnCalendarSelectListener;", "Lcom/huami/calendarview/CalendarView$OnMonthChangeListener;", "", "a", "onAttachedToWindow", "Lcom/huami/calendarview/Calendar;", "calendar", "", "isClick", "onCalendarSelect", "onCalendarOutOfRange", "", "year", "month", "onMonthChange", "day", "smoothScroll", "selectDay", "refresh", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "show", "showEdit", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;", "Lkotlin/jvm/functions/Function1;", "getRenderStyle", "()Lkotlin/jvm/functions/Function1;", "setRenderStyle", "(Lkotlin/jvm/functions/Function1;)V", "renderStyle", "Lcom/huami/femalehealth/uilib/widget/calendar/FemaleHealthCalendarView$OnCalendarListener;", "b", "Lcom/huami/femalehealth/uilib/widget/calendar/FemaleHealthCalendarView$OnCalendarListener;", "getCalendarListener", "()Lcom/huami/femalehealth/uilib/widget/calendar/FemaleHealthCalendarView$OnCalendarListener;", "setCalendarListener", "(Lcom/huami/femalehealth/uilib/widget/calendar/FemaleHealthCalendarView$OnCalendarListener;)V", "calendarListener", "c", "Lcom/huami/calendarview/Calendar;", "select", "Landroidx/fragment/app/FragmentManager;", GoogleApiAvailabilityLight.a, "Landroidx/fragment/app/FragmentManager;", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "setFragmentManager", "(Landroidx/fragment/app/FragmentManager;)V", "fragmentManager", "e", "Z", "monthChangeIntercept", "Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "f", "Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "selectMonth", "Lcom/huami/femalehealth/uilib/widget/calendar/CalendarStateView;", "getCalendarStateView", "()Lcom/huami/femalehealth/uilib/widget/calendar/CalendarStateView;", "calendarStateView", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OnCalendarListener", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class FemaleHealthCalendarView extends CardView implements CalendarView.OnCalendarSelectListener, CalendarView.OnMonthChangeListener {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Calendar, ? extends CalendarPeriodStyle> renderStyle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private OnCalendarListener calendarListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Calendar select;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private FragmentManager fragmentManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean monthChangeIntercept;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private DateTriple selectMonth;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&¨\u0006\f"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/FemaleHealthCalendarView$OnCalendarListener;", "", "Lcom/huami/calendarview/Calendar;", "calendar", "", "isClick", "", "onCalendarSelect", "", "year", "month", "onMonthChange", "uilib_release"}, k = 1, mv = {1, 5, 1})
    public interface OnCalendarListener {
        void onCalendarSelect(@Nullable Calendar calendar, boolean isClick);

        void onMonthChange(int year, int month);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: com.huami.femalehealth.uilib.widget.calendar.FemaleHealthCalendarView$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0421a extends Lambda implements Function0<String> {
            public static final C0421a a = new C0421a();

            public C0421a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "onReturnClick";
            }
        }

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HMLog.info("xys", C0421a.a);
            FemaleHealthCalendarView.this.monthChangeIntercept = true;
            FemaleHealthCalendarView.selectDay$default(FemaleHealthCalendarView.this, 0, 0, 0, false, 15, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            FemaleHealthCalendarView.this.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, int i2) {
            super(0);
            this.a = i;
            this.b = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onMonthChange -> " + this.a + (char) 12289 + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "showSelectDateDialog";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\n"}, d2 = {"", "year", "month", "day", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function3<Integer, Integer, Integer, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;
            public final /* synthetic */ int b;
            public final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i, int i2, int i3) {
                super(0);
                this.a = i;
                this.b = i2;
                this.c = i3;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "跳转日历:" + this.a + '/' + this.b + '/' + this.c;
            }
        }

        public e() {
            super(3);
        }

        public final void a(int i, int i2, int i3) {
            HMLog.info("xys", new a(i, i2, i3));
            FemaleHealthCalendarView femaleHealthCalendarView = FemaleHealthCalendarView.this;
            FemaleHealthCalendarView.selectDay$default(femaleHealthCalendarView, i, i2, ((RTLCalendarView) femaleHealthCalendarView.findViewById(R.id.calendar)).getCurDay(), false, 8, null);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3) {
            a(num.intValue(), num2.intValue(), num3.intValue());
            return Unit.INSTANCE;
        }
    }

    public FemaleHealthCalendarView(@NotNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        HMLog.info("xys", d.a);
        FragmentManager fragmentManager = this.fragmentManager;
        if (fragmentManager == null) {
            return;
        }
        DateTriple dateTripleClone$default = this.selectMonth;
        if (dateTripleClone$default == null) {
            dateTripleClone$default = DateTriple.clone$default(DateHelper.nowDate$default(DateHelper.INSTANCE, 0L, 1, null), 0, 0, -1, 3, null);
        }
        new CalendarSelectDialog(getContext(), ResourceHelper.INSTANCE.getString(R.string.fh_date_select), FemaleHealthCalendarViewKt.getYEAR_MAX(), 2019, false, new e(), 16, null).selectDate(new DateTriple(dateTripleClone$default.getYear(), dateTripleClone$default.getMonth())).show(fragmentManager);
    }

    public static /* synthetic */ void selectDay$default(FemaleHealthCalendarView femaleHealthCalendarView, int i, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = ((RTLCalendarView) femaleHealthCalendarView.findViewById(R.id.calendar)).getCurYear();
        }
        if ((i4 & 2) != 0) {
            i2 = ((RTLCalendarView) femaleHealthCalendarView.findViewById(R.id.calendar)).getCurMonth();
        }
        if ((i4 & 4) != 0) {
            i3 = ((RTLCalendarView) femaleHealthCalendarView.findViewById(R.id.calendar)).getCurDay();
        }
        if ((i4 & 8) != 0) {
            z = true;
        }
        femaleHealthCalendarView.selectDay(i, i2, i3, z);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public final OnCalendarListener getCalendarListener() {
        return this.calendarListener;
    }

    @NotNull
    public final CalendarStateView getCalendarStateView() {
        return (CalendarStateView) findViewById(R.id.calendar_state);
    }

    @Nullable
    public final FragmentManager getFragmentManager() {
        return this.fragmentManager;
    }

    @Nullable
    public final Function1<Calendar, CalendarPeriodStyle> getRenderStyle() {
        return this.renderStyle;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        int cardElevation = (int) getCardElevation();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(kotlin.ranges.e.coerceAtLeast(cardElevation, marginLayoutParams.leftMargin), kotlin.ranges.e.coerceAtLeast(cardElevation, marginLayoutParams.topMargin), kotlin.ranges.e.coerceAtLeast(cardElevation, marginLayoutParams.rightMargin), kotlin.ranges.e.coerceAtLeast(cardElevation, marginLayoutParams.bottomMargin));
    }

    @Override // com.huami.calendarview.CalendarView.OnCalendarSelectListener
    public void onCalendarOutOfRange(@Nullable Calendar calendar) {
    }

    @Override // com.huami.calendarview.CalendarView.OnCalendarSelectListener
    public void onCalendarSelect(@Nullable Calendar calendar, boolean isClick) {
        OnCalendarListener onCalendarListener = this.calendarListener;
        if (onCalendarListener != null) {
            onCalendarListener.onCalendarSelect(calendar, isClick);
        }
        this.select = calendar;
    }

    @Override // com.huami.calendarview.CalendarView.OnMonthChangeListener
    public void onMonthChange(int year, int month) {
        Calendar calendar;
        this.selectMonth = new DateTriple(year, month);
        HMLog.info("xys", new c(year, month));
        int i = R.id.calendar_title;
        CalendarTitleView calendarTitleView = (CalendarTitleView) findViewById(i);
        int i2 = R.id.calendar;
        calendarTitleView.isShowReturnToday((((RTLCalendarView) findViewById(i2)).getCurMonth() == month && ((RTLCalendarView) findViewById(i2)).getCurYear() == year) ? false : true);
        ((CalendarTitleView) findViewById(i)).setTitleDate(year, month);
        OnCalendarListener onCalendarListener = this.calendarListener;
        if (onCalendarListener != null) {
            onCalendarListener.onMonthChange(year, month);
        }
        if (!this.monthChangeIntercept && (calendar = this.select) != null) {
            selectDay$default(this, year, month, Math.min(DateHelper.INSTANCE.getMonthOfDay(year, month), calendar.getDay()), false, 8, null);
        }
        this.monthChangeIntercept = false;
    }

    public final void refresh(@Nullable Integer year, @Nullable Integer month) {
        int i = R.id.calendar;
        ((RTLCalendarView) findViewById(i)).getMonthViewPager().invalidate();
        int childCount = ((RTLCalendarView) findViewById(i)).getMonthViewPager().getChildCount();
        if (childCount < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            View childAt = ((RTLCalendarView) findViewById(R.id.calendar)).getMonthViewPager().getChildAt(i2);
            if (childAt != null) {
                childAt.invalidate();
            }
            if (i2 == childCount) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    public final void selectDay(int year, int month, int day, boolean smoothScroll) {
        ((RTLCalendarView) findViewById(R.id.calendar)).scrollToCalendar(year, month, day, smoothScroll);
    }

    public final void setCalendarListener(@Nullable OnCalendarListener onCalendarListener) {
        this.calendarListener = onCalendarListener;
    }

    public final void setFragmentManager(@Nullable FragmentManager fragmentManager) {
        this.fragmentManager = fragmentManager;
    }

    public final void setRenderStyle(@Nullable Function1<? super Calendar, ? extends CalendarPeriodStyle> function1) {
        this.renderStyle = function1;
    }

    public final void showEdit(boolean show) {
        getCalendarStateView().showEdit(show);
    }

    public FemaleHealthCalendarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.cardViewStyle);
    }

    public FemaleHealthCalendarView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.fh_view_female_health_calendar, (ViewGroup) this, true);
        setRadius(ExtKt.dpToPx(this, 10.0f));
        setCardElevation(ExtKt.dpToPx(this, 3.0f));
        int i2 = R.id.calendar_title;
        CalendarTitleView calendarTitleView = (CalendarTitleView) findViewById(i2);
        int i3 = R.id.calendar;
        calendarTitleView.setTitleDate(((RTLCalendarView) findViewById(i3)).getCurYear(), ((RTLCalendarView) findViewById(i3)).getCurMonth());
        ((CalendarTitleView) findViewById(i2)).setOnReturnToday(new a());
        ((CalendarTitleView) findViewById(i2)).setShowSelectDateDialog(new b());
        ((RTLCalendarView) findViewById(i3)).setRange(2019, 1, 1, FemaleHealthCalendarViewKt.getYEAR_MAX(), 12, 31);
        ((RTLCalendarView) findViewById(i3)).setOnCalendarSelectListener(this);
        ((RTLCalendarView) findViewById(i3)).setOnMonthChangeListener(this);
    }
}
