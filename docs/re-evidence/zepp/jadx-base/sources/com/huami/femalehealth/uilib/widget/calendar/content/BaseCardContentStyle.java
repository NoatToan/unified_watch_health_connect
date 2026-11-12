package com.huami.femalehealth.uilib.widget.calendar.content;

import android.content.res.Resources;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.helper.ResourceHelper;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001d\b&\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H&J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H&J\u001c\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002H&J\u001a\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002H&J\"\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H&J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0002H&J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0006\u0010\u0019\u001a\u00020\u0004J\u0013\u0010\u001c\u001a\u00020\u0004*\u00020\u0002H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001e\u001a\u00020\u0004*\u00020\u0002H\u0000¢\u0006\u0004\b\u001d\u0010\u001bJ\u001b\u0010!\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/content/BaseCardContentStyle;", "", "", "dur", "", "periodPos", "dur2", "periodPosWithForecast", "", "isToday", "periodFinish", "forecastPeriodFinish", "forecastPeriodStart", "periodStart", "remaining", "forecastPeriodWithRemaining", "periodWithRemaining", "total", "forecastPeriodWithOvulation", "ovulationDay", "forecastPregnantBeforeOvulation", "pregnantDur", "forecastPregnantAfterOvulation", "pregnantFinish", "forecastPregnantStart", "noRecord", "toDayString$uilib_release", "(I)Ljava/lang/String;", "toDayString", "toTheDayString$uilib_release", "toTheDayString", "toTheDayTotalString$uilib_release", "(II)Ljava/lang/String;", "toTheDayTotalString", "<init>", "()V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseCardContentStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final Lazy<LongContentStyle> a;

    @NotNull
    private static final Lazy<ShortContentStyle> b;

    @NotNull
    private static BaseCardContentStyle c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0004R\u001d\u0010\r\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0004\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/content/BaseCardContentStyle$Companion;", "", "Lcom/huami/femalehealth/uilib/widget/calendar/content/BaseCardContentStyle;", "longStyle$uilib_release", "()Lcom/huami/femalehealth/uilib/widget/calendar/content/BaseCardContentStyle;", "longStyle", "shortStyle$uilib_release", "shortStyle", "Lcom/huami/femalehealth/uilib/widget/calendar/content/LongContentStyle;", "LONG_CONTENT$delegate", "Lkotlin/Lazy;", "a", "()Lcom/huami/femalehealth/uilib/widget/calendar/content/LongContentStyle;", "LONG_CONTENT", "Lcom/huami/femalehealth/uilib/widget/calendar/content/ShortContentStyle;", "SHORT_CONTENT$delegate", "b", "()Lcom/huami/femalehealth/uilib/widget/calendar/content/ShortContentStyle;", "SHORT_CONTENT", MessengerShareContentUtility.PREVIEW_DEFAULT, "Lcom/huami/femalehealth/uilib/widget/calendar/content/BaseCardContentStyle;", "getDEFAULT$uilib_release", "setDEFAULT$uilib_release", "(Lcom/huami/femalehealth/uilib/widget/calendar/content/BaseCardContentStyle;)V", "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ KProperty<Object>[] a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "LONG_CONTENT", "getLONG_CONTENT()Lcom/huami/femalehealth/uilib/widget/calendar/content/LongContentStyle;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "SHORT_CONTENT", "getSHORT_CONTENT()Lcom/huami/femalehealth/uilib/widget/calendar/content/ShortContentStyle;"))};

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final LongContentStyle a() {
            return (LongContentStyle) BaseCardContentStyle.a.getValue();
        }

        private final ShortContentStyle b() {
            return (ShortContentStyle) BaseCardContentStyle.b.getValue();
        }

        @NotNull
        public final BaseCardContentStyle getDEFAULT$uilib_release() {
            return BaseCardContentStyle.c;
        }

        @NotNull
        public final BaseCardContentStyle longStyle$uilib_release() {
            return a();
        }

        public final void setDEFAULT$uilib_release(@NotNull BaseCardContentStyle baseCardContentStyle) {
            BaseCardContentStyle.c = baseCardContentStyle;
        }

        @NotNull
        public final BaseCardContentStyle shortStyle$uilib_release() {
            return b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/content/LongContentStyle;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<LongContentStyle> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LongContentStyle invoke() {
            return new LongContentStyle();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/content/ShortContentStyle;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<ShortContentStyle> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ShortContentStyle invoke() {
            return new ShortContentStyle();
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        a = LazyKt__LazyJVMKt.lazy(a.a);
        b = LazyKt__LazyJVMKt.lazy(b.a);
        c = companion.a();
    }

    public static /* synthetic */ String forecastPeriodWithOvulation$default(BaseCardContentStyle baseCardContentStyle, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forecastPeriodWithOvulation");
        }
        if ((i3 & 1) != 0) {
            i = 6;
        }
        if ((i3 & 2) != 0) {
            i2 = 10;
        }
        return baseCardContentStyle.forecastPeriodWithOvulation(i, i2);
    }

    public static /* synthetic */ String forecastPregnantAfterOvulation$default(BaseCardContentStyle baseCardContentStyle, int i, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forecastPregnantAfterOvulation");
        }
        if ((i4 & 2) != 0) {
            i2 = 10;
        }
        return baseCardContentStyle.forecastPregnantAfterOvulation(i, i2, i3);
    }

    public static /* synthetic */ String forecastPregnantBeforeOvulation$default(BaseCardContentStyle baseCardContentStyle, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forecastPregnantBeforeOvulation");
        }
        if ((i3 & 2) != 0) {
            i2 = 10;
        }
        return baseCardContentStyle.forecastPregnantBeforeOvulation(i, i2);
    }

    @NotNull
    public abstract String forecastPeriodFinish(boolean isToday);

    @NotNull
    public abstract String forecastPeriodStart(int dur);

    @NotNull
    public abstract String forecastPeriodWithOvulation(int dur, int total);

    @NotNull
    public abstract String forecastPeriodWithRemaining(int dur, int remaining);

    @NotNull
    public abstract String forecastPregnantAfterOvulation(int pregnantDur, int total, int ovulationDay);

    @NotNull
    public abstract String forecastPregnantBeforeOvulation(int ovulationDay, int total);

    @NotNull
    public abstract String forecastPregnantStart(int dur);

    @NotNull
    public final String noRecord() {
        return ResourceHelper.INSTANCE.getString(R.string.fh_status_empty);
    }

    @NotNull
    public abstract String periodFinish(boolean isToday);

    @NotNull
    public abstract String periodPos(int dur);

    @NotNull
    public abstract String periodPosWithForecast(int dur, int dur2);

    @NotNull
    public abstract String periodStart(int dur);

    @NotNull
    public abstract String periodWithRemaining(int dur, int remaining);

    @NotNull
    public abstract String pregnantFinish(boolean isToday, int periodStart);

    @NotNull
    public final String toDayString$uilib_release(int i) {
        String quantityString;
        Resources resources = ResourceHelper.INSTANCE.getResources();
        return (resources == null || (quantityString = resources.getQuantityString(R.plurals.fh_time_day_var, i, Integer.valueOf(i))) == null) ? "" : quantityString;
    }

    @NotNull
    public final String toTheDayString$uilib_release(int i) {
        String quantityString;
        Resources resources = ResourceHelper.INSTANCE.getResources();
        return (resources == null || (quantityString = resources.getQuantityString(R.plurals.fh_the_day, i, Integer.valueOf(i))) == null) ? "" : quantityString;
    }

    @NotNull
    public final String toTheDayTotalString$uilib_release(int i, int i2) {
        String string;
        Resources resources = ResourceHelper.INSTANCE.getResources();
        return (resources == null || (string = resources.getString(R.string.fh_the_day_total, Integer.valueOf(i), Integer.valueOf(i2))) == null) ? "" : string;
    }
}
