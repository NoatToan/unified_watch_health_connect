package com.huami.mifit.analytics.monitor;

import androidx.p008lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.analytics.bean.BaseEvent;
import com.huami.mifit.analytics.builder.EventBuilder;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0012\b\u0001\u0010\u0005 \u0001*\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\b\u0012\u0004\u0012\u00028\u00000\u00062\b\u0012\u0004\u0012\u00028\u00010\u0007B\u001b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0006\u0010\f\u001a\u00020\nR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u001a\u001a\u00020\u00158\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/huami/mifit/analytics/monitor/MonitorAdapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VH", "Lcom/huami/mifit/analytics/builder/EventBuilder;", "Lcom/huami/mifit/analytics/bean/BaseEvent;", "E", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/mifit/analytics/monitor/ExposureAppendAnalytic;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "reportAll", "", "a", LogUtil.I, "reportExposedTime", "", "b", "F", "reportExposedAreaPercent", "Lcom/huami/mifit/analytics/monitor/ExposureMonitor;", "c", "Lcom/huami/mifit/analytics/monitor/ExposureMonitor;", "getExposureMonitor", "()Lcom/huami/mifit/analytics/monitor/ExposureMonitor;", "exposureMonitor", GoogleApiAvailabilityLight.a, "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "<init>", "(IF)V", "analytics_release"}, k = 1, mv = {1, 5, 1})
public abstract class MonitorAdapter<VH extends RecyclerView.ViewHolder, E extends EventBuilder<? extends BaseEvent>> extends RecyclerView.Adapter<VH> implements ExposureAppendAnalytic<E> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int reportExposedTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float reportExposedAreaPercent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ExposureMonitor exposureMonitor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private RecyclerView recyclerView;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0006\u001a\u0004\u0018\u00010\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0012\b\u0001\u0010\u0004 \u0001*\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\n"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VH", "Lcom/huami/mifit/analytics/builder/EventBuilder;", "Lcom/huami/mifit/analytics/bean/BaseEvent;", "E", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0012\b\u0001\u0010\u0004 \u0001*\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\n"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VH", "Lcom/huami/mifit/analytics/builder/EventBuilder;", "Lcom/huami/mifit/analytics/bean/BaseEvent;", "E", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Integer, Unit> {
        public final /* synthetic */ MonitorAdapter<VH, E> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(MonitorAdapter<VH, ? extends E> monitorAdapter) {
            super(1);
            this.a = monitorAdapter;
        }

        public final void a(int i) {
            ExposureAnalyticsKt.a(this.a.getAppendAnalytic(i));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    public MonitorAdapter() {
        this(0, 0.0f, 3, null);
    }

    public /* synthetic */ MonitorAdapter(int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1000 : i, (i2 & 2) != 0 ? 0.5f : f);
    }

    @NotNull
    public final ExposureMonitor getExposureMonitor() {
        return this.exposureMonitor;
    }

    @Nullable
    public final RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) throws Exception {
        super.onAttachedToRecyclerView(recyclerView);
        this.recyclerView = recyclerView;
        Object context = recyclerView.getContext();
        LifecycleOwner lifecycleOwner = context instanceof LifecycleOwner ? (LifecycleOwner) context : null;
        if (lifecycleOwner == null) {
            HMLog.error$default("ExposureAnalytics", null, null, a.a, 6, null);
        }
        this.exposureMonitor.addExposeMonitor(recyclerView, lifecycleOwner, this.reportExposedTime, this.reportExposedAreaPercent, new b(this));
    }

    public final void reportAll() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null) {
            return;
        }
        getExposureMonitor().reportAll(recyclerView);
    }

    public final void setRecyclerView(@Nullable RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }

    public MonitorAdapter(int i, float f) {
        this.reportExposedTime = i;
        this.reportExposedAreaPercent = f;
        this.exposureMonitor = new ExposureMonitor();
    }
}
