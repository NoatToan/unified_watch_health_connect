package com.huami.femalehealth.uilib.widget.calendar.status;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.huami.calendarview.Calendar;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.helper.ResourceHelper;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.tools.analytics.DbUtils;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u001d\u0010\n\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001d\u0010\u0003\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/status/OvulationStyle;", "Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;", "Landroid/graphics/Paint;", "statePaint", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "setStatePaintColor", "", "isCurrentMonth", "datePaint", "setDataPaintColor", "", "weight", "", "name", "a", "Lkotlin/Lazy;", "()Landroid/graphics/Paint;", "b", "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class OvulationStyle implements CalendarPeriodStyle {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy datePaint = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy statePaint = LazyKt__LazyJVMKt.lazy(new b());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/graphics/Paint;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Paint> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint invoke() {
            Paint defaultPaint = OvulationStyle.this.getDefaultPaint();
            defaultPaint.setTextSize(ResourceHelper.INSTANCE.getDimen(R.dimen.fh_day_text_size));
            return defaultPaint;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/graphics/Paint;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Paint> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint invoke() {
            return OvulationStyle.this.getDefaultPaint();
        }
    }

    private final Paint a() {
        return (Paint) this.datePaint.getValue();
    }

    private final Paint b() {
        return (Paint) this.statePaint.getValue();
    }

    @Override // com.huami.femalehealth.uilib.widget.calendar.status.CalendarPeriodStyle
    @Nullable
    public Paint datePaint(boolean isCurrentMonth) {
        return a();
    }

    @Override // com.huami.femalehealth.uilib.widget.calendar.status.CalendarPeriodStyle
    @NotNull
    public Paint getDefaultPaint() {
        return CalendarPeriodStyle.DefaultImpls.getDefaultPaint(this);
    }

    @Override // com.huami.femalehealth.uilib.widget.calendar.status.CalendarPeriodStyle
    @NotNull
    public String name() {
        return ResourceHelper.INSTANCE.getString(R.string.fh_ovulation);
    }

    @Override // com.huami.femalehealth.uilib.widget.calendar.status.CalendarPeriodStyle
    public void render(@NotNull StyleAdapter styleAdapter, @NotNull Canvas canvas, @NotNull Calendar calendar, int i, int i2, boolean z, boolean z2, @NotNull Context context) {
        CalendarPeriodStyle.DefaultImpls.render(this, styleAdapter, canvas, calendar, i, i2, z, z2, context);
    }

    @Override // com.huami.femalehealth.uilib.widget.calendar.status.CalendarPeriodStyle
    public void renderDate(@NotNull StyleAdapter styleAdapter, @NotNull Canvas canvas, @NotNull Calendar calendar, int i, int i2, boolean z, boolean z2, @NotNull Context context) {
        CalendarPeriodStyle.DefaultImpls.renderDate(this, styleAdapter, canvas, calendar, i, i2, z, z2, context);
    }

    @Override // com.huami.femalehealth.uilib.widget.calendar.status.CalendarPeriodStyle
    public void renderSelect(@NotNull StyleAdapter styleAdapter, @NotNull Canvas canvas, @NotNull Calendar calendar, int i, int i2, boolean z, boolean z2, @NotNull Context context) {
        CalendarPeriodStyle.DefaultImpls.renderSelect(this, styleAdapter, canvas, calendar, i, i2, z, z2, context);
    }

    @Override // com.huami.femalehealth.uilib.widget.calendar.status.CalendarPeriodStyle
    public void renderState(@NotNull StyleAdapter styleAdapter, @NotNull Canvas canvas, @NotNull Calendar calendar, int i, int i2, boolean z, boolean z2, @NotNull Context context) {
        CalendarPeriodStyle.DefaultImpls.renderState(this, styleAdapter, canvas, calendar, i, i2, z, z2, context);
    }

    @Override // com.huami.femalehealth.uilib.widget.calendar.status.CalendarPeriodStyle
    @Nullable
    public Paint selectCirclePaint() {
        return CalendarPeriodStyle.DefaultImpls.selectCirclePaint(this);
    }

    @Override // com.huami.femalehealth.uilib.widget.calendar.status.CalendarPeriodStyle
    public void setDataPaintColor(@NotNull Context context, boolean isCurrentMonth) {
        a().setColor(ExtKt.getResColor(context, R.color.fh_day_ovulation_color));
    }

    @Override // com.huami.femalehealth.uilib.widget.calendar.status.CalendarPeriodStyle
    public void setSelectCirclePaintColor(@NotNull Context context) {
        CalendarPeriodStyle.DefaultImpls.setSelectCirclePaintColor(this, context);
    }

    @Override // com.huami.femalehealth.uilib.widget.calendar.status.CalendarPeriodStyle
    public void setStatePaintColor(@NotNull Context context) {
        b().setColor(ExtKt.getResColor(context, R.color.fh_ovulation_state_circle_color));
    }

    @Override // com.huami.femalehealth.uilib.widget.calendar.status.CalendarPeriodStyle
    @Nullable
    public Paint statePaint() {
        return b();
    }

    @Override // com.huami.femalehealth.uilib.widget.calendar.status.CalendarPeriodStyle
    public int weight() {
        return 3;
    }
}
