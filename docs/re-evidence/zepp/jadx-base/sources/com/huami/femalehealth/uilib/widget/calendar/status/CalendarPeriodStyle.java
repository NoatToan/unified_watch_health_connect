package com.huami.femalehealth.uilib.widget.calendar.status;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.autonavi.base.ae.gmap.GLMapRender;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.calendarview.Calendar;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.helper.ResourceHelper;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.tools.analytics.DbUtils;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 !2\u00020\u0001:\u0001!J\b\u0010\u0003\u001a\u00020\u0002H\u0016JH\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016JH\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016JH\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016JH\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0002H&J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001b\u001a\u00020\rH&J\u0018\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\rH&J\b\u0010\u001e\u001a\u00020\nH&J\b\u0010 \u001a\u00020\u001fH&¨\u0006\""}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;", "", "Landroid/graphics/Paint;", "getDefaultPaint", "Lcom/huami/femalehealth/uilib/widget/calendar/status/StyleAdapter;", "adapter", "Landroid/graphics/Canvas;", "canvas", "Lcom/huami/calendarview/Calendar;", "calendar", "", "x", "y", "", "hasScheme", "isSelected", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", GLMapRender.TAG, "renderSelect", "renderState", "renderDate", "selectCirclePaint", "setSelectCirclePaintColor", "statePaint", "setStatePaintColor", "isCurrentMonth", "datePaint", "setDataPaintColor", "weight", "", "name", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public interface CalendarPeriodStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle$Companion;", "", "", "c", "F", "getDAY_SELECT_CIRCLE", "()F", "DAY_SELECT_CIRCLE", GoogleApiAvailabilityLight.a, "getDAY_STATE_CIRCLE", "DAY_STATE_CIRCLE", "Landroid/graphics/Paint;", "e", "Lkotlin/Lazy;", "a", "()Landroid/graphics/Paint;", "selectCirclePaint", "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final float DAY_SELECT_CIRCLE;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private static final float DAY_STATE_CIRCLE;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private static final Lazy<Paint> selectCirclePaint;
        public static final /* synthetic */ KProperty<Object>[] b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "selectCirclePaint", "getSelectCirclePaint()Landroid/graphics/Paint;"))};
        public static final /* synthetic */ Companion a = new Companion();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/graphics/Paint;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Paint> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Paint invoke() {
                Paint paint = new Paint();
                paint.setFlags(4);
                paint.setFlags(1);
                paint.setStrokeWidth(2.0f);
                paint.setStyle(Paint.Style.STROKE);
                return paint;
            }
        }

        static {
            ResourceHelper resourceHelper = ResourceHelper.INSTANCE;
            DAY_SELECT_CIRCLE = resourceHelper.getDimen(R.dimen.fh_day_select_circle_size);
            DAY_STATE_CIRCLE = resourceHelper.getDimen(R.dimen.fh_day_state_circle_size);
            selectCirclePaint = LazyKt__LazyJVMKt.lazy(a.a);
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Paint a() {
            return selectCirclePaint.getValue();
        }

        public final float getDAY_SELECT_CIRCLE() {
            return DAY_SELECT_CIRCLE;
        }

        public final float getDAY_STATE_CIRCLE() {
            return DAY_STATE_CIRCLE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @NotNull
        public static Paint getDefaultPaint(@NotNull CalendarPeriodStyle calendarPeriodStyle) {
            Paint paint = new Paint();
            paint.setFlags(4);
            paint.setFlags(1);
            return paint;
        }

        public static void render(@NotNull CalendarPeriodStyle calendarPeriodStyle, @NotNull StyleAdapter styleAdapter, @NotNull Canvas canvas, @NotNull Calendar calendar, int i, int i2, boolean z, boolean z2, @NotNull Context context) {
            calendarPeriodStyle.renderSelect(styleAdapter, canvas, calendar, i, i2, z, z2, context);
            calendarPeriodStyle.renderState(styleAdapter, canvas, calendar, i, i2, z, z2, context);
            calendarPeriodStyle.renderDate(styleAdapter, canvas, calendar, i, i2, z, z2, context);
        }

        public static void renderDate(@NotNull CalendarPeriodStyle calendarPeriodStyle, @NotNull StyleAdapter styleAdapter, @NotNull Canvas canvas, @NotNull Calendar calendar, int i, int i2, boolean z, boolean z2, @NotNull Context context) {
            Paint paintDatePaint = calendarPeriodStyle.datePaint(calendar.isCurrentMonth());
            if (paintDatePaint == null) {
                return;
            }
            calendarPeriodStyle.setDataPaintColor(context, calendar.isCurrentMonth());
            String string = calendar.isCurrentDay() ? ResourceHelper.INSTANCE.getString(R.string.fh_tod) : String.valueOf(calendar.getDay());
            float textSize = paintDatePaint.getTextSize();
            while (true) {
                float f = 2;
                if (paintDatePaint.measureText(string) < CalendarPeriodStyle.INSTANCE.getDAY_STATE_CIRCLE() * f) {
                    Pair<Float, Float> textPos = styleAdapter.getTextPos(paintDatePaint, string, i, i2);
                    canvas.drawText(string, textPos.getFirst().floatValue(), textPos.getSecond().floatValue(), paintDatePaint);
                    paintDatePaint.setTextSize(textSize);
                    return;
                }
                paintDatePaint.setTextSize(paintDatePaint.getTextSize() - f);
            }
        }

        public static void renderSelect(@NotNull CalendarPeriodStyle calendarPeriodStyle, @NotNull StyleAdapter styleAdapter, @NotNull Canvas canvas, @NotNull Calendar calendar, int i, int i2, boolean z, boolean z2, @NotNull Context context) {
            Paint paintSelectCirclePaint = calendarPeriodStyle.selectCirclePaint();
            if (paintSelectCirclePaint == null) {
                return;
            }
            calendarPeriodStyle.setSelectCirclePaintColor(context);
            if (z2) {
                canvas.drawCircle(i + (styleAdapter.getItemWidth() / 2.0f), i2 + (styleAdapter.getItemHeight() / 2.0f), CalendarPeriodStyle.INSTANCE.getDAY_SELECT_CIRCLE(), paintSelectCirclePaint);
            }
        }

        public static void renderState(@NotNull CalendarPeriodStyle calendarPeriodStyle, @NotNull StyleAdapter styleAdapter, @NotNull Canvas canvas, @NotNull Calendar calendar, int i, int i2, boolean z, boolean z2, @NotNull Context context) {
            Paint paintStatePaint = calendarPeriodStyle.statePaint();
            if (paintStatePaint == null) {
                return;
            }
            calendarPeriodStyle.setStatePaintColor(context);
            canvas.drawCircle(i + (styleAdapter.getItemWidth() / 2.0f), i2 + (styleAdapter.getItemHeight() / 2.0f), CalendarPeriodStyle.INSTANCE.getDAY_STATE_CIRCLE(), paintStatePaint);
        }

        @Nullable
        public static Paint selectCirclePaint(@NotNull CalendarPeriodStyle calendarPeriodStyle) {
            return CalendarPeriodStyle.INSTANCE.a();
        }

        public static void setSelectCirclePaintColor(@NotNull CalendarPeriodStyle calendarPeriodStyle, @NotNull Context context) {
            CalendarPeriodStyle.INSTANCE.a().setColor(ExtKt.getResColor(context, R.color.fh_select_circle_color));
        }
    }

    @Nullable
    Paint datePaint(boolean isCurrentMonth);

    @NotNull
    Paint getDefaultPaint();

    @NotNull
    String name();

    void render(@NotNull StyleAdapter adapter, @NotNull Canvas canvas, @NotNull Calendar calendar, int x, int y, boolean hasScheme, boolean isSelected, @NotNull Context context);

    void renderDate(@NotNull StyleAdapter adapter, @NotNull Canvas canvas, @NotNull Calendar calendar, int x, int y, boolean hasScheme, boolean isSelected, @NotNull Context context);

    void renderSelect(@NotNull StyleAdapter adapter, @NotNull Canvas canvas, @NotNull Calendar calendar, int x, int y, boolean hasScheme, boolean isSelected, @NotNull Context context);

    void renderState(@NotNull StyleAdapter adapter, @NotNull Canvas canvas, @NotNull Calendar calendar, int x, int y, boolean hasScheme, boolean isSelected, @NotNull Context context);

    @Nullable
    Paint selectCirclePaint();

    void setDataPaintColor(@NotNull Context context, boolean isCurrentMonth);

    void setSelectCirclePaintColor(@NotNull Context context);

    void setStatePaintColor(@NotNull Context context);

    @Nullable
    Paint statePaint();

    int weight();
}
