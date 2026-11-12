package com.mi.health.sleep.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.xiaomi.fitness.chart.view.BaseChartRecyclerView;
import defpackage.du3;
import defpackage.qim;
import defpackage.s02;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \u001b2\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\u001bB\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\fR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/mi/health/sleep/widget/WidgetSleepChartRecyclerView;", "Lcom/xiaomi/fitness/chart/view/BaseChartRecyclerView;", "Lqim;", "Ls02;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "getAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)Lqim;", "", "mLastMotionX", "I", "mLastMotionY", "", "isLongPress", "Z", "()Z", "setLongPress", "(Z)V", "isMoved", "setMoved", "", "lastClickTime", "Ljava/lang/Long;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WidgetSleepChartRecyclerView extends BaseChartRecyclerView<qim, s02> {

    @NotNull
    private static final String TAG = "SleepChartRecyclerView";
    private boolean isLongPress;
    private boolean isMoved;

    @Nullable
    private Long lastClickTime;
    private int mLastMotionX;
    private int mLastMotionY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetSleepChartRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.xiaomi.fitness.chart.view.BaseChartRecyclerView
    @NotNull
    public qim getAttrs(@NotNull Context context, @Nullable AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        qim qimVarF = du3.f(context, attrs, false);
        Intrinsics.checkNotNullExpressionValue(qimVarF, "getSleepChartAttrs(...)");
        return qimVarF;
    }

    /* JADX INFO: renamed from: isLongPress, reason: from getter */
    public final boolean getIsLongPress() {
        return this.isLongPress;
    }

    /* JADX INFO: renamed from: isMoved, reason: from getter */
    public final boolean getIsMoved() {
        return this.isMoved;
    }

    public final void setLongPress(boolean z) {
        this.isLongPress = z;
    }

    public final void setMoved(boolean z) {
        this.isMoved = z;
    }
}
