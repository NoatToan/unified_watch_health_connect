package androidx.compose.foundation.lazy;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.State;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import com.airbnb.lottie.utils.Utils;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000 D2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001DB5\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010&\u001a\u00020%\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060(\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\bB\u0010CJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J)\u0010\u001e\u001a\u00020\u0010*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001f\u001a\u00020\u0010H\u0016J\b\u0010 \u001a\u00020\u0010H\u0016J\b\u0010!\u001a\u00020\u0010H\u0016R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00106\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00109R\u0016\u0010;\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00103R\u0016\u0010<\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00103R\u001e\u0010?\u001a\n >*\u0004\u0018\u00010=0=8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00103\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006E"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListPrefetcher;", "Landroidx/compose/runtime/RememberObserver;", "Landroidx/compose/foundation/lazy/LazyListOnScrolledListener;", "Landroidx/compose/foundation/lazy/LazyListOnPostMeasureListener;", "Ljava/lang/Runnable;", "Landroid/view/Choreographer$FrameCallback;", "Landroidx/compose/foundation/lazy/LazyListItemsProvider;", "itemProvider", "", "index", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "precompose", "", "new", "current", "calculateAverageTime", "", "run", "frameTimeNanos", "doFrame", "", "delta", "onScrolled", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "childConstraints", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "result", "onPostMeasure-VKLhPVY", "(Landroidx/compose/ui/layout/SubcomposeMeasureScope;JLandroidx/compose/foundation/lazy/LazyListMeasureResult;)V", "onPostMeasure", "onRemembered", "onForgotten", "onAbandoned", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "subcomposeLayoutState", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "Landroidx/compose/runtime/State;", "stateOfItemsProvider", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/lazy/LazyListItemContentFactory;", "itemContentFactory", "Landroidx/compose/foundation/lazy/LazyListItemContentFactory;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "", "wasScrollingForward", "Z", "indexToPrefetch", LogUtil.I, "precomposedSlotHandle", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "averagePrecomposeTimeNs", "J", "averagePremeasureTimeNs", "premeasuringIsNeeded", "prefetchScheduled", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "choreographer", "Landroid/view/Choreographer;", "isActive", "<init>", "(Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/State;Landroidx/compose/foundation/lazy/LazyListItemContentFactory;Landroid/view/View;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 5, 1})
final class LazyListPrefetcher implements RememberObserver, LazyListOnScrolledListener, LazyListOnPostMeasureListener, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static long frameIntervalNs;
    private long averagePrecomposeTimeNs;
    private long averagePremeasureTimeNs;
    private boolean isActive;

    @NotNull
    private final LazyListItemContentFactory itemContentFactory;

    @NotNull
    private final LazyListState lazyListState;

    @Nullable
    private SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle;
    private boolean prefetchScheduled;
    private boolean premeasuringIsNeeded;

    @NotNull
    private final State<LazyListItemsProvider> stateOfItemsProvider;

    @NotNull
    private final SubcomposeLayoutState subcomposeLayoutState;

    @NotNull
    private final View view;
    private boolean wasScrollingForward;
    private int indexToPrefetch = -1;
    private final Choreographer choreographer = Choreographer.getInstance();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListPrefetcher$Companion;", "", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "calculateFrameIntervalIfNeeded", "", "frameIntervalNs", "J", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void calculateFrameIntervalIfNeeded(View view) {
            if (LazyListPrefetcher.frameIntervalNs == 0) {
                Display display = view.getDisplay();
                float f = 60.0f;
                if (!view.isInEditMode() && display != null) {
                    float refreshRate = display.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                LazyListPrefetcher.frameIntervalNs = (long) (Utils.SECOND_IN_NANOS / f);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyListPrefetcher(@NotNull SubcomposeLayoutState subcomposeLayoutState, @NotNull LazyListState lazyListState, @NotNull State<? extends LazyListItemsProvider> state, @NotNull LazyListItemContentFactory lazyListItemContentFactory, @NotNull View view) {
        this.subcomposeLayoutState = subcomposeLayoutState;
        this.lazyListState = lazyListState;
        this.stateOfItemsProvider = state;
        this.itemContentFactory = lazyListItemContentFactory;
        this.view = view;
        INSTANCE.calculateFrameIntervalIfNeeded(view);
    }

    private final long calculateAverageTime(long j, long current) {
        if (current == 0) {
            return j;
        }
        long j2 = 4;
        return (j / j2) + ((current / j2) * ((long) 3));
    }

    private final SubcomposeLayoutState.PrecomposedSlotHandle precompose(LazyListItemsProvider itemProvider, int index) {
        Object key = itemProvider.getKey(index);
        return this.subcomposeLayoutState.precompose(key, this.itemContentFactory.getContent(index, key));
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long frameTimeNanos) {
        if (this.isActive) {
            this.view.post(this);
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        this.isActive = false;
        this.lazyListState.setOnScrolledListener$foundation_release(null);
        this.lazyListState.setOnPostMeasureListener$foundation_release(null);
        this.view.removeCallbacks(this);
        this.choreographer.removeFrameCallback(this);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    @Override // androidx.compose.foundation.lazy.LazyListOnPostMeasureListener
    /* JADX INFO: renamed from: onPostMeasure-VKLhPVY */
    public void mo357onPostMeasureVKLhPVY(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, long j, @NotNull LazyListMeasureResult lazyListMeasureResult) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.indexToPrefetch;
        if (!this.premeasuringIsNeeded || i == -1) {
            return;
        }
        if (!this.isActive) {
            throw new IllegalStateException("Check failed.".toString());
        }
        LazyListItemsProvider value = this.stateOfItemsProvider.getValue();
        if (i >= value.getItemsCount()) {
            return;
        }
        List<LazyListItemInfo> visibleItemsInfo = lazyListMeasureResult.getVisibleItemsInfo();
        int size = visibleItemsInfo.size() - 1;
        int i2 = 0;
        if (size < 0) {
            z = false;
            break;
        }
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (visibleItemsInfo.get(i3).getIndex() == i) {
                z = true;
                break;
            } else {
                if (i4 > size) {
                    z = false;
                    break;
                }
                i3 = i4;
            }
        }
        if (lazyListMeasureResult.getComposedButNotVisibleItems() != null) {
            List<LazyMeasuredItem> composedButNotVisibleItems = lazyListMeasureResult.getComposedButNotVisibleItems();
            int size2 = composedButNotVisibleItems.size() - 1;
            if (size2 < 0) {
                z3 = false;
                break;
            }
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                if (composedButNotVisibleItems.get(i5).getIndex() == i) {
                    z3 = true;
                    break;
                } else {
                    if (i6 > size2) {
                        z3 = false;
                        break;
                    }
                    i5 = i6;
                }
            }
            z2 = z3;
        }
        if (z || z2) {
            this.premeasuringIsNeeded = false;
            return;
        }
        Object key = value.getKey(i);
        List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(key, this.itemContentFactory.getContent(i, key));
        int size3 = listSubcompose.size() - 1;
        if (size3 < 0) {
            return;
        }
        while (true) {
            int i7 = i2 + 1;
            listSubcompose.get(i2).mo2468measureBRTryo0(j);
            if (i7 > size3) {
                return;
            } else {
                i2 = i7;
            }
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.lazyListState.setOnScrolledListener$foundation_release(this);
        this.lazyListState.setOnPostMeasureListener$foundation_release(this);
        this.isActive = true;
    }

    @Override // androidx.compose.foundation.lazy.LazyListOnScrolledListener
    public void onScrolled(float delta) {
        if (this.lazyListState.getPrefetchingEnabled()) {
            LazyListLayoutInfo layoutInfo = this.lazyListState.getLayoutInfo();
            if (!layoutInfo.getVisibleItemsInfo().isEmpty()) {
                if (!this.isActive) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                boolean z = delta < 0.0f;
                int index = z ? ((LazyListItemInfo) CollectionsKt.last((List) layoutInfo.getVisibleItemsInfo())).getIndex() + 1 : ((LazyListItemInfo) CollectionsKt.first((List) layoutInfo.getVisibleItemsInfo())).getIndex() - 1;
                if (index != this.indexToPrefetch) {
                    if (index >= 0 && index < layoutInfo.getTotalItemsCount()) {
                        SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposedSlotHandle;
                        if (precomposedSlotHandle != null && this.wasScrollingForward != z) {
                            precomposedSlotHandle.dispose();
                        }
                        this.wasScrollingForward = z;
                        this.indexToPrefetch = index;
                        this.precomposedSlotHandle = null;
                        this.premeasuringIsNeeded = false;
                        if (this.prefetchScheduled) {
                            return;
                        }
                        this.prefetchScheduled = true;
                        this.view.post(this);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0076 A[Catch: all -> 0x007e, TryCatch #1 {all -> 0x007e, blocks: (B:12:0x001a, B:14:0x0031, B:17:0x0039, B:28:0x0078, B:18:0x003f, B:21:0x0053, B:26:0x005d, B:27:0x0076), top: B:53:0x001a }] */
    @Override // java.lang.Runnable
    public void run() {
        if (this.indexToPrefetch != -1 && this.prefetchScheduled && this.isActive) {
            boolean z = true;
            if (this.precomposedSlotHandle != null) {
                Trace.beginSection("compose:lazylist:prefetch:measure");
                try {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(this.view.getDrawingTime()) + frameIntervalNs;
                    long jNanoTime = System.nanoTime();
                    if (jNanoTime > nanos || this.averagePremeasureTimeNs + jNanoTime < nanos) {
                        if (this.view.getWindowVisibility() == 0) {
                            this.premeasuringIsNeeded = true;
                            this.lazyListState.getRemeasurement$foundation_release().forceRemeasure();
                            this.averagePremeasureTimeNs = calculateAverageTime(System.nanoTime() - jNanoTime, this.averagePremeasureTimeNs);
                        }
                        this.prefetchScheduled = false;
                    } else {
                        this.choreographer.postFrameCallback(this);
                    }
                    Unit unit = Unit.INSTANCE;
                    return;
                } finally {
                    Trace.endSection();
                }
            }
            Trace.beginSection("compose:lazylist:prefetch:compose");
            try {
                long nanos2 = TimeUnit.MILLISECONDS.toNanos(this.view.getDrawingTime()) + frameIntervalNs;
                long jNanoTime2 = System.nanoTime();
                if (jNanoTime2 > nanos2 || this.averagePrecomposeTimeNs + jNanoTime2 < nanos2) {
                    int i = this.indexToPrefetch;
                    LazyListItemsProvider value = this.stateOfItemsProvider.getValue();
                    if (this.view.getWindowVisibility() != 0) {
                        this.prefetchScheduled = false;
                    } else {
                        if (i < 0 || i >= value.getItemsCount()) {
                            z = false;
                        }
                        if (z) {
                            this.precomposedSlotHandle = precompose(value, i);
                            this.averagePrecomposeTimeNs = calculateAverageTime(System.nanoTime() - jNanoTime2, this.averagePrecomposeTimeNs);
                            this.choreographer.postFrameCallback(this);
                        } else {
                            this.prefetchScheduled = false;
                        }
                    }
                } else {
                    this.choreographer.postFrameCallback(this);
                }
                Unit unit2 = Unit.INSTANCE;
            } finally {
                Trace.endSection();
            }
        }
    }
}
