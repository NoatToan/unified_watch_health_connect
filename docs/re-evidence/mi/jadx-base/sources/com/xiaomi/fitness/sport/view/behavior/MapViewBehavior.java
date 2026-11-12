package com.xiaomi.fitness.sport.view.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.mi.health.sport.AmapRealTimePathView;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.xri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u001cB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J \u0010\u001b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/sport/view/behavior/MapViewBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "lastY", "", "isInitBootemSheetHeigh", "", "()Z", "setInitBootemSheetHeigh", "(Z)V", "sum", "", "getSum", "()F", "setSum", "(F)V", "layoutDependsOn", "parent", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "child", "dependency", "onDependentViewChanged", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MapViewBehavior extends CoordinatorLayout.Behavior<View> {

    @NotNull
    public static final String TAG = "MapViewBehavior";
    private static int collapseHeigh;
    private boolean isInitBootemSheetHeigh;
    private int lastY;
    private float sum;

    public MapViewBehavior(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final float getSum() {
        return this.sum;
    }

    /* JADX INFO: renamed from: isInitBootemSheetHeigh, reason: from getter */
    public final boolean getIsInitBootemSheetHeigh() {
        return this.isInitBootemSheetHeigh;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(@NotNull CoordinatorLayout parent, @NotNull View child, @NotNull View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        Logger.d(TAG, String.valueOf(dependency.getId() == xri.q3));
        return dependency.getId() == xri.q3;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(@NotNull CoordinatorLayout parent, @NotNull View child, @NotNull View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        View viewFindViewById = child.findViewById(xri.n);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        AmapRealTimePathView amapRealTimePathView = (AmapRealTimePathView) viewFindViewById;
        if (!this.isInitBootemSheetHeigh) {
            this.isInitBootemSheetHeigh = true;
            collapseHeigh = dependency.getTop();
        }
        int top = dependency.getTop();
        if (this.lastY == 0) {
            this.lastY = top;
        }
        int i = this.lastY;
        if (i != 0) {
            int i2 = (int) ((i - top) * 0.501151f);
            this.sum += i2;
            Logger.d(TAG, "nowY-----:" + top + ",coll:" + collapseHeigh + " , delta:" + i2 + " , top:" + amapRealTimePathView.getTop() + " , x:" + amapRealTimePathView.getY() + " , tran:" + amapRealTimePathView.getTranslationY() + " , sum:" + this.sum);
            if (this.sum >= 0.0f) {
                amapRealTimePathView.scrollBy(0, i2);
            }
        }
        this.lastY = top;
        return false;
    }

    public final void setInitBootemSheetHeigh(boolean z) {
        this.isInitBootemSheetHeigh = z;
    }

    public final void setSum(float f) {
        this.sum = f;
    }
}
