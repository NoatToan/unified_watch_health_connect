package com.huami.femalehealth.uilib.widget.calendar.dialog;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.helper.DateTriple;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.helper.ResourceHelper;
import com.huami.femalehealth.uilib.widget.dialog.SingleWheelDialog;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B~\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\"\u001a\u00020\u001f\u0012K\u0010'\u001aG\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00040#¢\u0006\u0004\b2\u00103J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0002J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J\u0010\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u0002J\u0010\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R[\u0010'\u001aG\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00040#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010(R\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\u00190.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100¨\u00064"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/dialog/CalendarSelectDialog;", "", "Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "dateTriple", "", "g", "", "", "f", "year", GoogleApiAvailabilityLight.a, "month", "c", "b", "day", "a", "defaultSelect", "showDayWheel", "selectDate", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "show", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "Ljava/lang/String;", "title", LogUtil.I, "maxYear", "minYear", "", "e", "Z", "showFuture", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Lkotlin/jvm/functions/Function3;", "callback", "Ljava/util/List;", "yearList", "h", "monthList", "i", "dayList", "Lcom/huami/femalehealth/uilib/widget/dialog/SingleWheelDialog;", z.j, "Lcom/huami/femalehealth/uilib/widget/dialog/SingleWheelDialog;", "dialog", "<init>", "(Landroid/content/Context;Ljava/lang/String;IIZLkotlin/jvm/functions/Function3;)V", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class CalendarSelectDialog {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int maxYear;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int minYear;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean showFuture;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Function3<Integer, Integer, Integer, Unit> callback;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final List<Integer> yearList;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private List<Integer> monthList;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private List<Integer> dayList;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private SingleWheelDialog<String> dialog;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "pos", "pos1", "pos2", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function3<Integer, Integer, Integer, Unit> {
        public a() {
            super(3);
        }

        public final void a(int i, @Nullable Integer num, @Nullable Integer num2) {
            int iIntValue;
            Function3 function3 = CalendarSelectDialog.this.callback;
            Object obj = CalendarSelectDialog.this.yearList.get(i);
            int iIntValue2 = 1;
            if (num == null) {
                iIntValue = 1;
            } else {
                iIntValue = Integer.valueOf(((Number) CalendarSelectDialog.this.monthList.get(num.intValue())).intValue()).intValue();
            }
            Integer numValueOf = Integer.valueOf(iIntValue);
            if (num2 != null) {
                CalendarSelectDialog calendarSelectDialog = CalendarSelectDialog.this;
                int iIntValue3 = num2.intValue();
                List list = calendarSelectDialog.dayList;
                Integer num3 = list == null ? null : (Integer) list.get(iIntValue3);
                if (num3 != null) {
                    iIntValue2 = num3.intValue();
                }
            }
            function3.invoke(obj, numValueOf, Integer.valueOf(iIntValue2));
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3) {
            a(num.intValue(), num2, num3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\n"}, d2 = {"", "year", "month", "<anonymous parameter 2>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function3<Boolean, Boolean, Boolean, Unit> {
        public b() {
            super(3);
        }

        public final void a(boolean z, boolean z2, boolean z3) {
            List list;
            if (z) {
                CalendarSelectDialog calendarSelectDialog = CalendarSelectDialog.this;
                List list2 = calendarSelectDialog.yearList;
                SingleWheelDialog singleWheelDialog = CalendarSelectDialog.this.dialog;
                Objects.requireNonNull(singleWheelDialog);
                int iIntValue = ((Number) list2.get(singleWheelDialog.getYearPos())).intValue();
                List list3 = CalendarSelectDialog.this.monthList;
                SingleWheelDialog singleWheelDialog2 = CalendarSelectDialog.this.dialog;
                Objects.requireNonNull(singleWheelDialog2);
                calendarSelectDialog.b(iIntValue, ((Number) list3.get(singleWheelDialog2.getMonthPos())).intValue());
                return;
            }
            if ((z || z2) && (list = CalendarSelectDialog.this.dayList) != null) {
                CalendarSelectDialog calendarSelectDialog2 = CalendarSelectDialog.this;
                List list4 = calendarSelectDialog2.yearList;
                SingleWheelDialog singleWheelDialog3 = calendarSelectDialog2.dialog;
                Objects.requireNonNull(singleWheelDialog3);
                int iIntValue2 = ((Number) list4.get(singleWheelDialog3.getYearPos())).intValue();
                List list5 = calendarSelectDialog2.monthList;
                SingleWheelDialog singleWheelDialog4 = calendarSelectDialog2.dialog;
                Objects.requireNonNull(singleWheelDialog4);
                int iIntValue3 = ((Number) list5.get(singleWheelDialog4.getMonthPos())).intValue();
                SingleWheelDialog singleWheelDialog5 = calendarSelectDialog2.dialog;
                Objects.requireNonNull(singleWheelDialog5);
                calendarSelectDialog2.a(iIntValue2, iIntValue3, ((Number) list.get(singleWheelDialog5.getDayPos())).intValue());
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Boolean bool2, Boolean bool3) {
            a(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CalendarSelectDialog(@NotNull Context context, @NotNull String str, int i, int i2, boolean z, @NotNull Function3<? super Integer, ? super Integer, ? super Integer, Unit> function3) {
        this.context = context;
        this.title = str;
        this.maxYear = i;
        this.minYear = i2;
        this.showFuture = z;
        this.callback = function3;
        this.yearList = f();
        this.monthList = e(this, 0, 1, null);
        g(DateHelper.nowDate$default(DateHelper.INSTANCE, 0L, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int year, int month, int day) {
        List<Integer> listC = c(year, month);
        this.dayList = listC;
        SingleWheelDialog<String> singleWheelDialog = this.dialog;
        Objects.requireNonNull(singleWheelDialog);
        singleWheelDialog.showThirdWheel("", ResourceHelper.INSTANCE.getString(R.string.fh_day), CalendarSelectDialogKt.a(listC), day > listC.size() ? listC.size() - 1 : listC.indexOf(Integer.valueOf(day)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(int year, int month) {
        List<Integer> listD = d(year);
        this.monthList = listD;
        SingleWheelDialog<String> singleWheelDialog = this.dialog;
        Objects.requireNonNull(singleWheelDialog);
        singleWheelDialog.showDoubleWheel("", ResourceHelper.INSTANCE.getString(R.string.fh_month), CalendarSelectDialogKt.b(this.monthList), month > listD.size() ? listD.size() - 1 : this.monthList.indexOf(Integer.valueOf(month)));
    }

    private final List<Integer> c(int year, int month) {
        DateHelper dateHelper = DateHelper.INSTANCE;
        int monthOfDay = dateHelper.getMonthOfDay(year, month);
        if (!this.showFuture && dateHelper.isCurrentMonth(year, month)) {
            monthOfDay = DateHelper.nowDate$default(dateHelper, 0L, 1, null).getDay();
        }
        ArrayList arrayList = new ArrayList(monthOfDay);
        int i = 0;
        while (i < monthOfDay) {
            i++;
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    private final List<Integer> d(int year) {
        int month;
        if (this.showFuture) {
            month = 12;
        } else {
            DateHelper dateHelper = DateHelper.INSTANCE;
            if (dateHelper.isCurrentYear(year)) {
                month = DateHelper.nowDate$default(dateHelper, 0L, 1, null).getMonth();
            } else {
                month = 12;
            }
        }
        ArrayList arrayList = new ArrayList(month);
        int i = 0;
        while (i < month) {
            i++;
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static /* synthetic */ List e(CalendarSelectDialog calendarSelectDialog, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = DateHelper.nowDate$default(DateHelper.INSTANCE, 0L, 1, null).getYear();
        }
        return calendarSelectDialog.d(i);
    }

    private final List<Integer> f() {
        int year = ((this.showFuture ? this.maxYear : DateHelper.nowDate$default(DateHelper.INSTANCE, 0L, 1, null).getYear()) - this.minYear) + 1;
        ArrayList arrayList = new ArrayList(year);
        for (int i = 0; i < year; i++) {
            arrayList.add(Integer.valueOf(this.minYear + i));
        }
        return arrayList;
    }

    private final void g(DateTriple dateTriple) {
        String str = this.title;
        ResourceHelper resourceHelper = ResourceHelper.INSTANCE;
        SingleWheelDialog<String> singleWheelDialogShowDoubleWheel = new SingleWheelDialog(str, "", resourceHelper.getString(R.string.fh_year), CalendarSelectDialogKt.c(this.yearList), this.yearList.indexOf(Integer.valueOf(dateTriple.getYear())), null, new a()).showDoubleWheel("", resourceHelper.getString(R.string.fh_month), CalendarSelectDialogKt.b(this.monthList), this.monthList.indexOf(Integer.valueOf(dateTriple.getMonth())));
        this.dialog = singleWheelDialogShowDoubleWheel;
        Objects.requireNonNull(singleWheelDialogShowDoubleWheel);
        singleWheelDialogShowDoubleWheel.setReverse(new Reverse().shouldReverse(this.context));
        SingleWheelDialog<String> singleWheelDialog = this.dialog;
        Objects.requireNonNull(singleWheelDialog);
        singleWheelDialog.setOnScrollListener(new b());
    }

    public static /* synthetic */ CalendarSelectDialog selectDate$default(CalendarSelectDialog calendarSelectDialog, DateTriple dateTriple, int i, Object obj) {
        if ((i & 1) != 0) {
            dateTriple = DateHelper.nowDate$default(DateHelper.INSTANCE, 0L, 1, null);
        }
        return calendarSelectDialog.selectDate(dateTriple);
    }

    public static /* synthetic */ CalendarSelectDialog showDayWheel$default(CalendarSelectDialog calendarSelectDialog, DateTriple dateTriple, int i, Object obj) {
        if ((i & 1) != 0) {
            dateTriple = DateHelper.nowDate$default(DateHelper.INSTANCE, 0L, 1, null);
        }
        return calendarSelectDialog.showDayWheel(dateTriple);
    }

    @NotNull
    public final CalendarSelectDialog selectDate(@NotNull DateTriple defaultSelect) {
        g(defaultSelect);
        if (defaultSelect.getMonth() != -1) {
            b(defaultSelect.getYear(), defaultSelect.getMonth());
        }
        if (defaultSelect.getDay() != -1) {
            a(defaultSelect.getYear(), defaultSelect.getMonth(), defaultSelect.getDay());
        }
        return this;
    }

    public final void show(@NotNull FragmentManager fragmentManager) {
        SingleWheelDialog<String> singleWheelDialog = this.dialog;
        Objects.requireNonNull(singleWheelDialog);
        singleWheelDialog.show(fragmentManager);
    }

    @NotNull
    public final CalendarSelectDialog showDayWheel(@NotNull DateTriple defaultSelect) {
        g(defaultSelect);
        b(defaultSelect.getYear(), defaultSelect.getMonth());
        a(defaultSelect.getYear(), defaultSelect.getMonth(), defaultSelect.getDay());
        return this;
    }

    public /* synthetic */ CalendarSelectDialog(Context context, String str, int i, int i2, boolean z, Function3 function3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, i, i2, (i3 & 16) != 0 ? true : z, function3);
    }
}
