package com.huami.femalehealth.uilib.widget.calendar.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.facebook.share.model.ShareStoryContent;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.helper.ResourceHelper;
import com.huami.femalehealth.uilib.widget.calendar.dialog.CalendarYearMonthDayDialog;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0019\b\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001fB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001c\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bR<\u0010\u0012\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001a¨\u0006'"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/dialog/CalendarYearMonthDayDialog;", "Landroid/app/Dialog;", "", "day", "", "e", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/femalehealth/uilib/widget/calendar/dialog/CalendarYearMonthDayDialog$Builder;", "builder", PointCategory.INIT, "Lkotlin/Function3;", "a", "Lkotlin/jvm/functions/Function3;", "getOnDateSelectListener", "()Lkotlin/jvm/functions/Function3;", "setOnDateSelectListener", "(Lkotlin/jvm/functions/Function3;)V", "onDateSelectListener", "b", LogUtil.I, "year", "c", "month", GoogleApiAvailabilityLight.a, "Landroid/graphics/Point;", "Landroid/graphics/Point;", "yearRange", "<init>", "(Landroid/content/Context;Lcom/huami/femalehealth/uilib/widget/calendar/dialog/CalendarYearMonthDayDialog$Builder;)V", "themeResId", "(Landroid/content/Context;I)V", "", "cancelable", "Landroid/content/DialogInterface$OnCancelListener;", "cancelListener", "(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;)V", "Companion", ShareStoryContent.Builder.k, "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class CalendarYearMonthDayDialog extends Dialog {

    @NotNull
    public static final String TAG = "CalendarYearMonthDayDialog";
    private static final int f;
    private static final int g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Function3<? super Integer, ? super Integer, ? super Integer, Unit> onDateSelectListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int year;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int month;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int day;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Point yearRange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<String, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
            CalendarYearMonthDayDialog.this.year = Integer.parseInt(str);
            CalendarYearMonthDayDialog.this.e(1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<String, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
            CalendarYearMonthDayDialog.this.month = Integer.parseInt(str);
            CalendarYearMonthDayDialog.this.e(1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<String, Unit> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
            CalendarYearMonthDayDialog.this.day = Integer.parseInt(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "updateDayWheelData, year=" + CalendarYearMonthDayDialog.this.year + ", month=" + CalendarYearMonthDayDialog.this.month;
        }
    }

    static {
        ResourceHelper resourceHelper = ResourceHelper.INSTANCE;
        f = (int) resourceHelper.dp2px(10.0f);
        g = (int) resourceHelper.dp2px(54.0f);
    }

    private CalendarYearMonthDayDialog(Context context, Builder builder) {
        super(context);
        this.yearRange = new Point();
        init(context, builder);
    }

    public /* synthetic */ CalendarYearMonthDayDialog(Context context, Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(CalendarYearMonthDayDialog calendarYearMonthDayDialog, View view) {
        calendarYearMonthDayDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(CalendarYearMonthDayDialog calendarYearMonthDayDialog, View view) {
        Function3<Integer, Integer, Integer, Unit> onDateSelectListener = calendarYearMonthDayDialog.getOnDateSelectListener();
        if (onDateSelectListener != null) {
            onDateSelectListener.invoke(Integer.valueOf(calendarYearMonthDayDialog.year), Integer.valueOf(calendarYearMonthDayDialog.month), Integer.valueOf(calendarYearMonthDayDialog.day));
        }
        calendarYearMonthDayDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(int day) {
        HMLog.info(TAG, new d());
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, this.year);
        calendar.set(2, this.month - 1);
        int actualMaximum = calendar.getActualMaximum(5);
        PickerView pickerView = (PickerView) findViewById(R.id.calendar_wheel_day);
        ArrayList arrayList = new ArrayList(actualMaximum);
        int i = 0;
        while (i < actualMaximum) {
            i++;
            arrayList.add(String.valueOf(i));
        }
        pickerView.setData(arrayList);
        ((PickerView) findViewById(R.id.calendar_wheel_day)).setSelected(String.valueOf(day));
    }

    @Nullable
    public final Function3<Integer, Integer, Integer, Unit> getOnDateSelectListener() {
        return this.onDateSelectListener;
    }

    public final void init(@NotNull Context context, @NotNull Builder builder) {
        setContentView(R.layout.fh_dialog_year_month_day_picker);
        Window window = getWindow();
        int i = 0;
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setGravity(80);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = ResourceHelper.INSTANCE.findScreenWH().x - (f * 2);
            attributes.y = g;
            window.setAttributes(attributes);
        }
        this.yearRange.x = builder.getMinYear();
        this.yearRange.y = builder.getMaxYear();
        this.year = builder.getSelectYear();
        PickerView pickerView = (PickerView) findViewById(R.id.calendar_wheel_year);
        Point point = this.yearRange;
        int i2 = (point.y - point.x) + 1;
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(String.valueOf(this.yearRange.x + i3));
        }
        pickerView.setData(arrayList);
        this.month = builder.getSelectMonth();
        PickerView pickerView2 = (PickerView) findViewById(R.id.calendar_wheel_month);
        ArrayList arrayList2 = new ArrayList(12);
        while (i < 12) {
            i++;
            arrayList2.add(String.valueOf(i));
        }
        pickerView2.setData(arrayList2);
        this.day = builder.getSelectDay();
        e(builder.getSelectDay());
        int i4 = R.id.calendar_wheel_year;
        ((PickerView) findViewById(i4)).setOnSelectListener(new a());
        int i5 = R.id.calendar_wheel_month;
        ((PickerView) findViewById(i5)).setOnSelectListener(new b());
        int i6 = R.id.calendar_wheel_day;
        ((PickerView) findViewById(i6)).setOnSelectListener(new c());
        PickerView pickerView3 = (PickerView) findViewById(i4);
        ResourceHelper resourceHelper = ResourceHelper.INSTANCE;
        pickerView3.setSymbol(resourceHelper.getString(R.string.fh_year));
        ((PickerView) findViewById(i5)).setSymbol(resourceHelper.getString(R.string.fh_month));
        ((PickerView) findViewById(i6)).setSymbol(resourceHelper.getString(R.string.fh_day));
        ((PickerView) findViewById(i4)).setSelected(String.valueOf(builder.getSelectYear()));
        ((PickerView) findViewById(i5)).setSelected(String.valueOf(builder.getSelectMonth()));
        ((PickerView) findViewById(i6)).setSelected(String.valueOf(builder.getSelectDay()));
        ((TextView) findViewById(R.id.btn_cancel)).setOnClickListener(new View.OnClickListener() { // from class: sh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CalendarYearMonthDayDialog.c(this.a, view);
            }
        });
        ((TextView) findViewById(R.id.btn_sure)).setOnClickListener(new View.OnClickListener() { // from class: th0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CalendarYearMonthDayDialog.d(this.a, view);
            }
        });
    }

    public final void setOnDateSelectListener(@Nullable Function3<? super Integer, ? super Integer, ? super Integer, Unit> function3) {
        this.onDateSelectListener = function3;
    }

    public CalendarYearMonthDayDialog(@NotNull Context context, int i) {
        super(context, i);
        this.yearRange = new Point();
        init(context, Builder.INSTANCE.getDEFAULT());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\u0018\u0000  2\u00020\u0001:\u0001 B9\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\"\u0010\u0015\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\fR\"\u0010\u0019\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\fR\"\u0010\u001d\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u001b\u0010\n\"\u0004\b\u001c\u0010\f¨\u0006!"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/dialog/CalendarYearMonthDayDialog$Builder;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/femalehealth/uilib/widget/calendar/dialog/CalendarYearMonthDayDialog;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", "a", LogUtil.I, "getMinYear", "()I", "setMinYear", "(I)V", "minYear", "b", "getMaxYear", "setMaxYear", "maxYear", "c", "getSelectYear", "setSelectYear", "selectYear", GoogleApiAvailabilityLight.a, "getSelectMonth", "setSelectMonth", "selectMonth", "e", "getSelectDay", "setSelectDay", "selectDay", "<init>", "(IIIII)V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Builder {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final Builder f = new Builder(0, 0, 0, 0, 0, 31, null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private int minYear;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private int maxYear;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private int selectYear;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private int selectMonth;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private int selectDay;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/dialog/CalendarYearMonthDayDialog$Builder$Companion;", "", "Lcom/huami/femalehealth/uilib/widget/calendar/dialog/CalendarYearMonthDayDialog$Builder;", MessengerShareContentUtility.PREVIEW_DEFAULT, "Lcom/huami/femalehealth/uilib/widget/calendar/dialog/CalendarYearMonthDayDialog$Builder;", "getDEFAULT", "()Lcom/huami/femalehealth/uilib/widget/calendar/dialog/CalendarYearMonthDayDialog$Builder;", "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Builder getDEFAULT() {
                return Builder.f;
            }
        }

        public Builder() {
            this(0, 0, 0, 0, 0, 31, null);
        }

        public Builder(int i, int i2, int i3, int i4, int i5) {
            this.minYear = i;
            this.maxYear = i2;
            this.selectYear = i3;
            this.selectMonth = i4;
            this.selectDay = i5;
        }

        @NotNull
        public final CalendarYearMonthDayDialog build(@NotNull Context context) {
            return new CalendarYearMonthDayDialog(context, this, (DefaultConstructorMarker) null);
        }

        public final int getMaxYear() {
            return this.maxYear;
        }

        public final int getMinYear() {
            return this.minYear;
        }

        public final int getSelectDay() {
            return this.selectDay;
        }

        public final int getSelectMonth() {
            return this.selectMonth;
        }

        public final int getSelectYear() {
            return this.selectYear;
        }

        public final void setMaxYear(int i) {
            this.maxYear = i;
        }

        public final void setMinYear(int i) {
            this.minYear = i;
        }

        public final void setSelectDay(int i) {
            this.selectDay = i;
        }

        public final void setSelectMonth(int i) {
            this.selectMonth = i;
        }

        public final void setSelectYear(int i) {
            this.selectYear = i;
        }

        public /* synthetic */ Builder(int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
            this((i6 & 1) != 0 ? 2019 : i, (i6 & 2) != 0 ? 2100 : i2, (i6 & 4) != 0 ? 2020 : i3, (i6 & 8) != 0 ? 1 : i4, (i6 & 16) != 0 ? 1 : i5);
        }
    }

    public CalendarYearMonthDayDialog(@NotNull Context context, boolean z, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.yearRange = new Point();
        init(context, Builder.INSTANCE.getDEFAULT());
    }
}
