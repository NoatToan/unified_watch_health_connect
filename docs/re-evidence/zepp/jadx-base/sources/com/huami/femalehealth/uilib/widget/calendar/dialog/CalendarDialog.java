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
import com.huami.femalehealth.uilib.widget.calendar.dialog.CalendarDialog;
import com.huami.tools.analytics.DbUtils;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated(message = "缺少滑动惯性")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0019\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\t¢\u0006\u0004\b\u001e\u0010!B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u001a\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b\u001e\u0010%J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R6\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006("}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/dialog/CalendarDialog;", "Landroid/app/Dialog;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/femalehealth/uilib/widget/calendar/dialog/CalendarDialog$Builder;", "builder", "", PointCategory.INIT, "Lkotlin/Function2;", "", "a", "Lkotlin/jvm/functions/Function2;", "getOnDateSelectListener", "()Lkotlin/jvm/functions/Function2;", "setOnDateSelectListener", "(Lkotlin/jvm/functions/Function2;)V", "onDateSelectListener", "b", LogUtil.I, "year", "c", "month", "Landroid/graphics/Point;", GoogleApiAvailabilityLight.a, "Landroid/graphics/Point;", "yearRange", "", "e", "Z", "showDay", "<init>", "(Landroid/content/Context;Lcom/huami/femalehealth/uilib/widget/calendar/dialog/CalendarDialog$Builder;)V", "themeResId", "(Landroid/content/Context;I)V", "cancelable", "Landroid/content/DialogInterface$OnCancelListener;", "cancelListener", "(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;)V", "Companion", ShareStoryContent.Builder.k, "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class CalendarDialog extends Dialog {
    private static final int f;
    private static final int g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Function2<? super Integer, ? super Integer, Unit> onDateSelectListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int year;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int month;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Point yearRange;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean showDay;

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
            CalendarDialog.this.year = Integer.parseInt(str);
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
            CalendarDialog.this.month = Integer.parseInt(str);
        }
    }

    static {
        ResourceHelper resourceHelper = ResourceHelper.INSTANCE;
        f = (int) resourceHelper.dp2px(10.0f);
        g = (int) resourceHelper.dp2px(54.0f);
    }

    private CalendarDialog(Context context, Builder builder) {
        super(context);
        this.yearRange = new Point();
        init(context, builder);
    }

    public /* synthetic */ CalendarDialog(Context context, Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(CalendarDialog calendarDialog, View view) {
        calendarDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(CalendarDialog calendarDialog, View view) {
        Function2<Integer, Integer, Unit> onDateSelectListener = calendarDialog.getOnDateSelectListener();
        if (onDateSelectListener != null) {
            onDateSelectListener.invoke(Integer.valueOf(calendarDialog.year), Integer.valueOf(calendarDialog.month));
        }
        calendarDialog.dismiss();
    }

    @Nullable
    public final Function2<Integer, Integer, Unit> getOnDateSelectListener() {
        return this.onDateSelectListener;
    }

    public final void init(@NotNull Context context, @NotNull Builder builder) {
        setContentView(R.layout.fh_dialog_calendar);
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
        this.showDay = builder.getShowDay();
        PickerView pickerView = (PickerView) findViewById(R.id.calendar_wheel_year);
        Point point = this.yearRange;
        int i2 = (point.y - point.x) + 1;
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(String.valueOf(this.yearRange.x + i3));
        }
        pickerView.setData(arrayList);
        PickerView pickerView2 = (PickerView) findViewById(R.id.calendar_wheel_month);
        ArrayList arrayList2 = new ArrayList(12);
        while (i < 12) {
            i++;
            arrayList2.add(String.valueOf(i));
        }
        pickerView2.setData(arrayList2);
        int i4 = R.id.calendar_wheel_year;
        ((PickerView) findViewById(i4)).setOnSelectListener(new a());
        int i5 = R.id.calendar_wheel_month;
        ((PickerView) findViewById(i5)).setOnSelectListener(new b());
        PickerView pickerView3 = (PickerView) findViewById(i4);
        ResourceHelper resourceHelper = ResourceHelper.INSTANCE;
        pickerView3.setSymbol(resourceHelper.getString(R.string.fh_year));
        ((PickerView) findViewById(i5)).setSymbol(resourceHelper.getString(R.string.fh_month));
        ((PickerView) findViewById(i4)).setSelected(String.valueOf(builder.getSelectYear()));
        ((PickerView) findViewById(i5)).setSelected(String.valueOf(builder.getSelectMonth()));
        ((TextView) findViewById(R.id.btn_cancel)).setOnClickListener(new View.OnClickListener() { // from class: hh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CalendarDialog.c(this.a, view);
            }
        });
        ((TextView) findViewById(R.id.btn_sure)).setOnClickListener(new View.OnClickListener() { // from class: gh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CalendarDialog.d(this.a, view);
            }
        });
    }

    public final void setOnDateSelectListener(@Nullable Function2<? super Integer, ? super Integer, Unit> function2) {
        this.onDateSelectListener = function2;
    }

    public CalendarDialog(@NotNull Context context, int i) {
        super(context, i);
        this.yearRange = new Point();
        init(context, Builder.INSTANCE.getDEFAULT());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0013\u0018\u0000 $2\u00020\u0001:\u0001$B9\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0006\u0012\b\b\u0002\u0010!\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u001b\u0010\n\"\u0004\b\u001c\u0010\fR\"\u0010!\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\b\u001a\u0004\b\u001f\u0010\n\"\u0004\b \u0010\f¨\u0006%"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/dialog/CalendarDialog$Builder;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/femalehealth/uilib/widget/calendar/dialog/CalendarDialog;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", "a", LogUtil.I, "getMinYear", "()I", "setMinYear", "(I)V", "minYear", "b", "getMaxYear", "setMaxYear", "maxYear", "", "c", "Z", "getShowDay", "()Z", "setShowDay", "(Z)V", "showDay", GoogleApiAvailabilityLight.a, "getSelectYear", "setSelectYear", "selectYear", "e", "getSelectMonth", "setSelectMonth", "selectMonth", "<init>", "(IIZII)V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Builder {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final Builder f = new Builder(0, 0, false, 0, 0, 31, null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private int minYear;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private int maxYear;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private boolean showDay;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private int selectYear;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private int selectMonth;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/dialog/CalendarDialog$Builder$Companion;", "", "Lcom/huami/femalehealth/uilib/widget/calendar/dialog/CalendarDialog$Builder;", MessengerShareContentUtility.PREVIEW_DEFAULT, "Lcom/huami/femalehealth/uilib/widget/calendar/dialog/CalendarDialog$Builder;", "getDEFAULT", "()Lcom/huami/femalehealth/uilib/widget/calendar/dialog/CalendarDialog$Builder;", "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
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
            this(0, 0, false, 0, 0, 31, null);
        }

        public Builder(int i, int i2, boolean z, int i3, int i4) {
            this.minYear = i;
            this.maxYear = i2;
            this.showDay = z;
            this.selectYear = i3;
            this.selectMonth = i4;
        }

        @NotNull
        public final CalendarDialog build(@NotNull Context context) {
            return new CalendarDialog(context, this, (DefaultConstructorMarker) null);
        }

        public final int getMaxYear() {
            return this.maxYear;
        }

        public final int getMinYear() {
            return this.minYear;
        }

        public final int getSelectMonth() {
            return this.selectMonth;
        }

        public final int getSelectYear() {
            return this.selectYear;
        }

        public final boolean getShowDay() {
            return this.showDay;
        }

        public final void setMaxYear(int i) {
            this.maxYear = i;
        }

        public final void setMinYear(int i) {
            this.minYear = i;
        }

        public final void setSelectMonth(int i) {
            this.selectMonth = i;
        }

        public final void setSelectYear(int i) {
            this.selectYear = i;
        }

        public final void setShowDay(boolean z) {
            this.showDay = z;
        }

        public /* synthetic */ Builder(int i, int i2, boolean z, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? 2019 : i, (i5 & 2) != 0 ? 2100 : i2, (i5 & 4) != 0 ? false : z, (i5 & 8) != 0 ? 2020 : i3, (i5 & 16) != 0 ? 1 : i4);
        }
    }

    public CalendarDialog(@NotNull Context context, boolean z, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.yearRange = new Point();
        init(context, Builder.INSTANCE.getDEFAULT());
    }
}
