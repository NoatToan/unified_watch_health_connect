package com.huami.mifit.analytics.monitor;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 =2\u00020\u0001:\u0001=B\u0007¢\u0006\u0004\b;\u0010<J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002J$\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u0010H\u0002J\u001a\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0011H\u0002J!\u0010\u0018\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J$\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u0010H\u0002J\"\u0010#\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u0011H\u0002J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u0011H\u0002J\u0010\u0010%\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010(\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0002J\b\u0010)\u001a\u00020\u0004H\u0002JB\u0010-\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010*\u001a\u00020\u00112\b\b\u0002\u0010,\u001a\u00020+2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u0010J\u000e\u0010.\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010*\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010/R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00100R\"\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001f018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00102R\u0018\u00106\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006>"}, d2 = {"Lcom/huami/mifit/analytics/monitor/ExposureMonitor;", "", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "m", hl.k, "Landroidx/lifecycle/LifecycleOwner;", "lifecycleObserver", "h", "b", "", "isShowing", "l", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lkotlin/Function1;", "", "exposedCallback", "a", "childId", "", GoogleApiAvailabilityLight.a, "key", "f", "(Landroid/view/View;Ljava/lang/String;)Ljava/lang/Integer;", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "layoutManager", "Lcom/huami/mifit/analytics/monitor/VisibleItemPositionRange;", "g", com.google.android.exoplayer2.text.ttml.b.r, "Lcom/huami/mifit/analytics/monitor/MonitorView;", "monitorView", "isTheoryShowing", "index", GoogleApiAvailabilityLight.b, DTransferConstants.SEARCH_KEY, z.j, "Landroid/graphics/Rect;", "r", "i", "c", "reportExposedTime", "", "reportExposedAreaPercent", "addExposeMonitor", "reportAll", LogUtil.I, "F", "", "Ljava/util/Map;", "monitorViewList", "Lcom/huami/mifit/analytics/monitor/ViewTreeStatusObservable;", "Lcom/huami/mifit/analytics/monitor/ViewTreeStatusObservable;", "viewTreeStatusObservable", "Lcom/huami/mifit/analytics/monitor/RecyclerViewOnScrollListener;", "e", "Lcom/huami/mifit/analytics/monitor/RecyclerViewOnScrollListener;", "recyclerViewOnScrollListener", "<init>", "()V", "Companion", "analytics_release"}, k = 1, mv = {1, 5, 1})
public final class ExposureMonitor {
    public static final float REPORT_EXPOSURE_AREA_PERCENT_DEFAULT = 0.5f;
    public static final int REPORT_EXPOSURE_MIN_MILLISECOND_DEFAULT = 1000;

    @NotNull
    private static final String f = "ExposureMonitor";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int reportExposedTime = 1000;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private float reportExposedAreaPercent = 0.5f;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Map<String, MonitorView> monitorViewList = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private ViewTreeStatusObservable viewTreeStatusObservable;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private RecyclerViewOnScrollListener recyclerViewOnScrollListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Integer, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(int i) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ View b;
        public final /* synthetic */ Function1<Integer, Unit> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(View view, Function1<? super Integer, Unit> function1) {
            super(0);
            this.b = view;
            this.c = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ExposureMonitor.this.reportAll(this.b);
            ExposureMonitor.this.p((RecyclerView) this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "重复传入，如果使用了循环使用的view，请使用对Recyclerview的监听，adapter继承自MonitorAdapter即可";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public final /* synthetic */ RecyclerView b;
        public final /* synthetic */ Function1<Integer, Unit> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(RecyclerView recyclerView, Function1<? super Integer, Unit> function1) {
            super(0);
            this.b = recyclerView;
            this.c = function1;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ExposureMonitor.this.p(this.b, this.c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Unit> {
        public final /* synthetic */ View b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view) {
            super(0);
            this.b = view;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ExposureMonitor exposureMonitor = ExposureMonitor.this;
            View view = this.b;
            exposureMonitor.l(view, exposureMonitor.j(view));
        }
    }

    private final void a(RecyclerView recyclerView, Function1<? super Integer, Unit> exposedCallback) {
        RecyclerViewOnScrollListener recyclerViewOnScrollListener = new RecyclerViewOnScrollListener(new d(recyclerView, exposedCallback));
        recyclerView.addOnScrollListener(recyclerViewOnScrollListener);
        Unit unit = Unit.INSTANCE;
        this.recyclerViewOnScrollListener = recyclerViewOnScrollListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addExposeMonitor$default(ExposureMonitor exposureMonitor, View view, LifecycleOwner lifecycleOwner, int i, float f2, Function1 function1, int i2, Object obj) throws Exception {
        int i3 = (i2 & 4) != 0 ? 1000 : i;
        float f3 = (i2 & 8) != 0 ? 0.5f : f2;
        if ((i2 & 16) != 0) {
            function1 = a.a;
        }
        exposureMonitor.addExposeMonitor(view, lifecycleOwner, i3, f3, function1);
    }

    private final void b(View view) {
        this.viewTreeStatusObservable = new ViewTreeStatusObservable(new e(view));
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        viewTreeObserver.addOnDrawListener(this.viewTreeStatusObservable);
        viewTreeObserver.addOnScrollChangedListener(this.viewTreeStatusObservable);
        viewTreeObserver.addOnWindowAttachListener(this.viewTreeStatusObservable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        ViewTreeStatusObservable viewTreeStatusObservable;
        Iterator<Map.Entry<String, MonitorView>> it2 = this.monitorViewList.entrySet().iterator();
        while (it2.hasNext()) {
            View view = it2.next().getValue().getCom.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY java.lang.String();
            if (view instanceof RecyclerView) {
                RecyclerViewOnScrollListener recyclerViewOnScrollListener = this.recyclerViewOnScrollListener;
                if (recyclerViewOnScrollListener != null) {
                    ((RecyclerView) view).removeOnScrollListener(recyclerViewOnScrollListener);
                }
            } else {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive() && (viewTreeStatusObservable = this.viewTreeStatusObservable) != null) {
                    viewTreeObserver.removeOnDrawListener(viewTreeStatusObservable);
                    viewTreeObserver.removeOnScrollChangedListener(this.viewTreeStatusObservable);
                    viewTreeObserver.removeOnWindowAttachListener(this.viewTreeStatusObservable);
                }
            }
        }
        this.monitorViewList.clear();
    }

    private final String d(View view, int childId) {
        StringBuilder sb = new StringBuilder();
        sb.append(view.hashCode());
        sb.append(childId);
        return sb.toString();
    }

    public static /* synthetic */ String e(ExposureMonitor exposureMonitor, View view, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return exposureMonitor.d(view, i);
    }

    private final Integer f(View view, String key) {
        Object objM3845constructorimpl;
        String strValueOf = String.valueOf(view.hashCode());
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(Integer.valueOf(Integer.parseInt(StringsKt__StringsKt.removePrefix(key, (CharSequence) strValueOf))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        return (Integer) objM3845constructorimpl;
    }

    private final VisibleItemPositionRange g(RecyclerView.LayoutManager layoutManager) throws Exception {
        if (!(layoutManager instanceof LinearLayoutManager)) {
            throw new Exception("暂不支持其他类型，如需支持，请联系我！");
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        VisibleItemPositionRange visibleItemPositionRange = new VisibleItemPositionRange(linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition());
        if (visibleItemPositionRange.getFirstVisibleItemPosition() < 0 || visibleItemPositionRange.getLastVisibleItemPosition() < 0) {
            return null;
        }
        return visibleItemPositionRange;
    }

    private final void h(final View view, final LifecycleOwner lifecycleObserver) {
        Lifecycle lifecycle;
        if (lifecycleObserver == null || (lifecycle = lifecycleObserver.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver(new LifecycleObserver() { // from class: com.huami.mifit.analytics.monitor.ExposureMonitor$handleViewVisibleInActivityLifecycle$1
            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                this.a.c();
                lifecycleObserver.getLifecycle().removeObserver(this);
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
            public final void onPause() {
                this.a.k(view);
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            public final void onResume() {
                this.a.m(view);
            }
        });
    }

    private final boolean i(View view, Rect r) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (width == 0 || height == 0) {
            return false;
        }
        return ((float) (width * height)) * this.reportExposedAreaPercent <= ((float) ((r.right - r.left) * (r.bottom - r.top)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j(View view) {
        Rect rect = new Rect();
        if (view.isShown() && view.getLocalVisibleRect(rect)) {
            return i(view, rect);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(View view) {
        l(view, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(View view, boolean isShowing) {
        if (this.monitorViewList.isEmpty()) {
            return;
        }
        if (!(view instanceof RecyclerView)) {
            MonitorView monitorView = this.monitorViewList.get(e(this, view, 0, 2, null));
            if (monitorView == null) {
                return;
            }
            o(this, monitorView, isShowing, 0, 4, null);
            return;
        }
        for (Map.Entry<String, MonitorView> entry : this.monitorViewList.entrySet()) {
            Integer numF = f(view, entry.getKey());
            if (numF != null) {
                n(entry.getValue(), isShowing, numF.intValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(View view) {
        l(view, true);
    }

    private final void n(MonitorView monitorView, boolean isTheoryShowing, int index) {
        if (monitorView.getIsReported()) {
            Log.d(f, index + " : 已经上报了");
            return;
        }
        View view = monitorView.getCom.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY java.lang.String();
        if (isTheoryShowing) {
            if (!monitorView.getIsShow() && j(view)) {
                monitorView.setShow(true);
                return;
            }
            return;
        }
        if (monitorView.getIsShow()) {
            if (System.currentTimeMillis() - monitorView.getShowStartTime() >= this.reportExposedTime) {
                q(monitorView, index);
            } else {
                Log.d(f, "tag:" + index + " ,曝光未达到时间");
            }
            monitorView.setShow(false);
        }
    }

    public static /* synthetic */ void o(ExposureMonitor exposureMonitor, MonitorView monitorView, boolean z, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        exposureMonitor.n(monitorView, z, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(RecyclerView recyclerView, Function1<? super Integer, Unit> exposedCallback) {
        VisibleItemPositionRange visibleItemPositionRangeG;
        View viewFindViewByPosition;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || (visibleItemPositionRangeG = g(layoutManager)) == null) {
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        boolean z = false;
        int pagerCount = adapter == null ? 0 : adapter.getPagerCount();
        if (pagerCount <= 0) {
            return;
        }
        IntRange intRange = new IntRange(0, pagerCount - 1);
        IntRange intRange2 = new IntRange(visibleItemPositionRangeG.getFirstVisibleItemPosition(), visibleItemPositionRangeG.getLastVisibleItemPosition());
        int first = intRange.getFirst();
        int last = intRange.getLast();
        if (first > last) {
            return;
        }
        while (true) {
            int i = first + 1;
            String strD = d(recyclerView, first);
            MonitorView monitorView = this.monitorViewList.get(strD);
            if (monitorView != null) {
                if (first <= intRange2.getLast() && intRange2.getFirst() <= first) {
                    View viewFindViewByPosition2 = layoutManager.findViewByPosition(first);
                    if (viewFindViewByPosition2 != null) {
                        n(monitorView, j(viewFindViewByPosition2), first);
                    }
                } else {
                    n(monitorView, z, first);
                }
            } else {
                if ((first <= intRange2.getLast() && intRange2.getFirst() <= first) && (viewFindViewByPosition = layoutManager.findViewByPosition(first)) != null) {
                    MonitorView monitorView2 = new MonitorView(viewFindViewByPosition, exposedCallback, 0L, false, 12, null);
                    this.monitorViewList.put(strD, monitorView2);
                    n(monitorView2, j(viewFindViewByPosition), first);
                }
            }
            if (first == last) {
                return;
            }
            first = i;
            z = false;
        }
    }

    private final void q(MonitorView monitorView, int index) {
        monitorView.setReported(true);
        monitorView.getExposedCallback().invoke(Integer.valueOf(index));
    }

    public final void addExposeMonitor(@NotNull View view, @Nullable LifecycleOwner lifecycleObserver, int reportExposedTime, float reportExposedAreaPercent, @NotNull Function1<? super Integer, Unit> exposedCallback) throws Exception {
        this.reportExposedTime = reportExposedTime;
        this.reportExposedAreaPercent = reportExposedAreaPercent;
        if (!(view instanceof RecyclerView)) {
            if (this.monitorViewList.containsKey(e(this, view, 0, 2, null))) {
                HMLog.error$default(f, null, null, c.a, 6, null);
                return;
            }
            this.monitorViewList.put(e(this, view, 0, 2, null), new MonitorView(view, exposedCallback, 0L, false, 12, null));
            h(view, lifecycleObserver);
            b(view);
            return;
        }
        h(view, lifecycleObserver);
        RecyclerView recyclerView = (RecyclerView) view;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (!(adapter instanceof ExposureAppendAnalytic)) {
            throw new Exception("RecyclerView 监听曝光，只需要adapter继承自MonitorAdapter即可；\n或者Adapter实现ExposureAppendAnalytic ,onAttachedToRecyclerView 添加 addExposeMonitor方法调用");
        }
        a(recyclerView, exposedCallback);
        adapter.registerAdapterDataObserver(new AdapterDataObserver(recyclerView, new b(view, exposedCallback)));
    }

    public final void reportAll(@NotNull View view) {
        k(view);
        c();
    }
}
