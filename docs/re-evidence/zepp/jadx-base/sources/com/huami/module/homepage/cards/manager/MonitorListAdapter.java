package com.huami.module.homepage.cards.manager;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.bean.BaseEvent;
import com.huami.mifit.analytics.builder.CalculationEventBuilder;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.analytics.builder.EventBuilder;
import com.huami.mifit.analytics.monitor.ExposureAppendAnalytic;
import com.huami.mifit.analytics.monitor.ExposureMonitor;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u0002*\u0014\b\u0002\u0010\u0006 \u0001*\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00072\b\u0012\u0004\u0012\u00028\u00020\bB)\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b \u0010!J\u001a\u0010\u000b\u001a\u00020\n2\u0010\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\u0004H\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0006\u0010\u000f\u001a\u00020\nR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Lcom/huami/module/homepage/cards/manager/MonitorListAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VH", "Lcom/huami/mifit/analytics/builder/EventBuilder;", "Lcom/huami/mifit/analytics/bean/BaseEvent;", "E", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/huami/mifit/analytics/monitor/ExposureAppendAnalytic;", "eventBuilder", "", "a", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "reportAll", "", LogUtil.I, "reportExposedTime", "", "b", "F", "reportExposedAreaPercent", "Lcom/huami/mifit/analytics/monitor/ExposureMonitor;", "c", "Lcom/huami/mifit/analytics/monitor/ExposureMonitor;", "exposureMonitor", GoogleApiAvailabilityLight.a, "Landroidx/recyclerview/widget/RecyclerView;", "rv", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "diffCallback", "<init>", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;IF)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public abstract class MonitorListAdapter<T, VH extends RecyclerView.ViewHolder, E extends EventBuilder<? extends BaseEvent>> extends ListAdapter<T, VH> implements ExposureAppendAnalytic<E> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int reportExposedTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float reportExposedAreaPercent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ExposureMonitor exposureMonitor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private RecyclerView rv;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0007\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001\"\u0014\b\u0002\u0010\u0005 \u0001*\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VH", "Lcom/huami/mifit/analytics/builder/EventBuilder;", "Lcom/huami/mifit/analytics/bean/BaseEvent;", "E", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "为了方便自动监听activity生命周期，请使用实现了LifecycleOwner的activity或者fragment";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001\"\u0014\b\u0002\u0010\u0005 \u0001*\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VH", "Lcom/huami/mifit/analytics/builder/EventBuilder;", "Lcom/huami/mifit/analytics/bean/BaseEvent;", "E", "", "position", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Integer, Unit> {
        public final /* synthetic */ MonitorListAdapter<T, VH, E> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(MonitorListAdapter<T, VH, ? extends E> monitorListAdapter) {
            super(1);
            this.a = monitorListAdapter;
        }

        public final void a(int i) {
            MonitorListAdapter<T, VH, E> monitorListAdapter = this.a;
            monitorListAdapter.a(monitorListAdapter.getAppendAnalytic(i));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ MonitorListAdapter(DiffUtil.ItemCallback itemCallback, int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(itemCallback, (i2 & 2) != 0 ? 1000 : i, (i2 & 4) != 0 ? 0.5f : f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(EventBuilder<? extends BaseEvent> eventBuilder) {
        if (eventBuilder instanceof CountEventBuilder) {
            Analytics.recordEvent((CountEventBuilder) eventBuilder);
        } else if (eventBuilder instanceof CalculationEventBuilder) {
            Analytics.recordEvent((CalculationEventBuilder) eventBuilder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) throws Exception {
        super.onAttachedToRecyclerView(recyclerView);
        this.rv = recyclerView;
        Object context = recyclerView.getContext();
        LifecycleOwner lifecycleOwner = context instanceof LifecycleOwner ? (LifecycleOwner) context : null;
        if (lifecycleOwner == null) {
            HMLog.error$default("MonitorListAdapter", null, null, a.a, 6, null);
        }
        this.exposureMonitor.addExposeMonitor(recyclerView, lifecycleOwner, this.reportExposedTime, this.reportExposedAreaPercent, new b(this));
    }

    public final void reportAll() {
        RecyclerView recyclerView = this.rv;
        if (recyclerView == null) {
            return;
        }
        this.exposureMonitor.reportAll(recyclerView);
    }

    public MonitorListAdapter(@NotNull DiffUtil.ItemCallback<T> itemCallback, int i, float f) {
        super(itemCallback);
        this.reportExposedTime = i;
        this.reportExposedAreaPercent = f;
        this.exposureMonitor = new ExposureMonitor();
    }
}
