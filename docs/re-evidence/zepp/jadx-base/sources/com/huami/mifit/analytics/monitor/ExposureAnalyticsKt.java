package com.huami.mifit.analytics.monitor;

import android.view.View;
import androidx.annotation.MainThread;
import androidx.p008lifecycle.LifecycleOwner;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.bean.BaseEvent;
import com.huami.mifit.analytics.builder.CalculationEventBuilder;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.analytics.builder.EventBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a:\u0010\u000b\u001a\u00020\n*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007\u001a\u0018\u0010\f\u001a\u00020\n2\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001H\u0002\"\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroid/view/View;", "Lcom/huami/mifit/analytics/builder/EventBuilder;", "Lcom/huami/mifit/analytics/bean/BaseEvent;", "eventBuilder", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "", "reportExposedTime", "", "reportExposedAreaPercent", "", "addExposeAnalytics", "a", "", "Ljava/lang/String;", "TAG", "analytics_release"}, k = 2, mv = {1, 5, 1})
public final class ExposureAnalyticsKt {

    @NotNull
    private static final String a = "ExposureAnalytics";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Integer, Unit> {
        public final /* synthetic */ EventBuilder<? extends BaseEvent> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EventBuilder<? extends BaseEvent> eventBuilder) {
            super(1);
            this.a = eventBuilder;
        }

        public final void a(int i) {
            ExposureAnalyticsKt.a(this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(EventBuilder<? extends BaseEvent> eventBuilder) {
        if (eventBuilder instanceof CountEventBuilder) {
            Analytics.recordEvent((CountEventBuilder) eventBuilder);
        } else if (eventBuilder instanceof CalculationEventBuilder) {
            Analytics.recordEvent((CalculationEventBuilder) eventBuilder);
        }
    }

    @JvmOverloads
    @MainThread
    public static final void addExposeAnalytics(@NotNull View view, @NotNull EventBuilder<? extends BaseEvent> eventBuilder, @Nullable LifecycleOwner lifecycleOwner) throws Exception {
        addExposeAnalytics$default(view, eventBuilder, lifecycleOwner, 0, 0.0f, 12, null);
    }

    @JvmOverloads
    @MainThread
    public static final void addExposeAnalytics(@NotNull View view, @NotNull EventBuilder<? extends BaseEvent> eventBuilder, @Nullable LifecycleOwner lifecycleOwner, int i) throws Exception {
        addExposeAnalytics$default(view, eventBuilder, lifecycleOwner, i, 0.0f, 8, null);
    }

    @JvmOverloads
    @MainThread
    public static final void addExposeAnalytics(@NotNull View view, @NotNull EventBuilder<? extends BaseEvent> eventBuilder, @Nullable LifecycleOwner lifecycleOwner, int i, float f) throws Exception {
        new ExposureMonitor().addExposeMonitor(view, lifecycleOwner, i, f, new a(eventBuilder));
    }

    public static /* synthetic */ void addExposeAnalytics$default(View view, EventBuilder eventBuilder, LifecycleOwner lifecycleOwner, int i, float f, int i2, Object obj) throws Exception {
        if ((i2 & 4) != 0) {
            i = 1000;
        }
        if ((i2 & 8) != 0) {
            f = 0.5f;
        }
        addExposeAnalytics(view, eventBuilder, lifecycleOwner, i, f);
    }
}
