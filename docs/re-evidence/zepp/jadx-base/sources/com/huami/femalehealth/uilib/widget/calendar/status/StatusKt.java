package com.huami.femalehealth.uilib.widget.calendar.status;

import android.graphics.Paint;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0015\"\u001d\u0010\u0005\u001a\u00020\u00008F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001d\u0010\b\u001a\u00020\u00008F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004\"\u001d\u0010\u000b\u001a\u00020\u00008F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\"\u001d\u0010\u000e\u001a\u00020\u00008F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0004\"\u001d\u0010\u0011\u001a\u00020\u00008F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0004\"\u001d\u0010\u0014\u001a\u00020\u00008F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0004¨\u0006\u0015"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;", "a", "Lkotlin/Lazy;", "getNormalStyle", "()Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;", "normalStyle", "b", "getForecastStyle", "forecastStyle", "c", "getPeriodStyle", "periodStyle", GoogleApiAvailabilityLight.a, "getOvulationStyle", "ovulationStyle", "e", "getPregnantStyle", "pregnantStyle", "f", "getNormalWeekStyle", "normalWeekStyle", "uilib_release"}, k = 2, mv = {1, 5, 1})
public final class StatusKt {

    @NotNull
    private static final Lazy a = LazyKt__LazyJVMKt.lazy(b.a);

    @NotNull
    private static final Lazy b = LazyKt__LazyJVMKt.lazy(a.a);

    @NotNull
    private static final Lazy c = LazyKt__LazyJVMKt.lazy(d.a);

    @NotNull
    private static final Lazy d = LazyKt__LazyJVMKt.lazy(c.a);

    @NotNull
    private static final Lazy e = LazyKt__LazyJVMKt.lazy(e.a);

    @NotNull
    private static final Lazy f = LazyKt__LazyJVMKt.lazy(new Function0<StatusKt$normalWeekStyle$2.AnonymousClass1>() { // from class: com.huami.femalehealth.uilib.widget.calendar.status.StatusKt$normalWeekStyle$2
        /* JADX WARN: Type inference failed for: r0v0, types: [com.huami.femalehealth.uilib.widget.calendar.status.StatusKt$normalWeekStyle$2$1] */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AnonymousClass1 invoke() {
            return new CalendarNormalStyle() { // from class: com.huami.femalehealth.uilib.widget.calendar.status.StatusKt$normalWeekStyle$2.1
                @Override // com.huami.femalehealth.uilib.widget.calendar.status.CalendarNormalStyle, com.huami.femalehealth.uilib.widget.calendar.status.CalendarPeriodStyle
                @Nullable
                public Paint datePaint(boolean isCurrentMonth) {
                    return super.datePaint(true);
                }
            };
        }
    });

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/status/ForecastStyle;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ForecastStyle> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ForecastStyle invoke() {
            return new ForecastStyle();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarNormalStyle;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<CalendarNormalStyle> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CalendarNormalStyle invoke() {
            return new CalendarNormalStyle();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/status/OvulationStyle;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<OvulationStyle> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OvulationStyle invoke() {
            return new OvulationStyle();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/status/PeriodStyle;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<PeriodStyle> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PeriodStyle invoke() {
            return new PeriodStyle();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/status/PregnantStyle;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<PregnantStyle> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PregnantStyle invoke() {
            return new PregnantStyle();
        }
    }

    @NotNull
    public static final CalendarPeriodStyle getForecastStyle() {
        return (CalendarPeriodStyle) b.getValue();
    }

    @NotNull
    public static final CalendarPeriodStyle getNormalStyle() {
        return (CalendarPeriodStyle) a.getValue();
    }

    @NotNull
    public static final CalendarPeriodStyle getNormalWeekStyle() {
        return (CalendarPeriodStyle) f.getValue();
    }

    @NotNull
    public static final CalendarPeriodStyle getOvulationStyle() {
        return (CalendarPeriodStyle) d.getValue();
    }

    @NotNull
    public static final CalendarPeriodStyle getPeriodStyle() {
        return (CalendarPeriodStyle) c.getValue();
    }

    @NotNull
    public static final CalendarPeriodStyle getPregnantStyle() {
        return (CalendarPeriodStyle) e.getValue();
    }
}
