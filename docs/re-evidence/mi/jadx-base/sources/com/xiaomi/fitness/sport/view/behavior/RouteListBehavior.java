package com.xiaomi.fitness.sport.view.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0016B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J \u0010\u0015\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/sport/view/behavior/RouteListBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "lastY", "", "isInitBootemSheetHeigh", "", "()Z", "setInitBootemSheetHeigh", "(Z)V", "layoutDependsOn", "parent", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "child", "dependency", "onDependentViewChanged", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouteListBehavior extends CoordinatorLayout.Behavior<View> {

    @NotNull
    public static final String TAG = "RouteListBehavior";
    private static int collapseHeigh;
    private boolean isInitBootemSheetHeigh;
    private int lastY;

    public RouteListBehavior(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
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
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(@NotNull CoordinatorLayout parent, @NotNull View child, @NotNull View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
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
            float f = i - top;
            child.setTranslationY(child.getTranslationY() - (f + (child.getHeight() * (f / dependency.getHeight()))));
        }
        this.lastY = top;
        return false;
    }

    public final void setInitBootemSheetHeigh(boolean z) {
        this.isInitBootemSheetHeigh = z;
    }
}
