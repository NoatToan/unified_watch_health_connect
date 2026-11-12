package com.xiaomi.fitness.sport.view.route;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import defpackage.xri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0016J \u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/CreateRouteMapContentBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "createRouteActivity", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;", "getCreateRouteActivity", "()Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;", "setCreateRouteActivity", "(Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;)V", "listView", "getListView", "()Landroid/view/View;", "setListView", "(Landroid/view/View;)V", "titleView", "getTitleView", "setTitleView", "layoutDependsOn", "", "parent", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "child", "dependency", "onDependentViewChanged", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CreateRouteMapContentBehavior extends CoordinatorLayout.Behavior<View> {

    @Nullable
    private CreateRouteActivity createRouteActivity;

    @Nullable
    private View listView;

    @Nullable
    private View titleView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateRouteMapContentBehavior(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        try {
            this.createRouteActivity = (CreateRouteActivity) context;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }

    @Nullable
    public final CreateRouteActivity getCreateRouteActivity() {
        return this.createRouteActivity;
    }

    @Nullable
    public final View getListView() {
        return this.listView;
    }

    @Nullable
    public final View getTitleView() {
        return this.titleView;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(@NotNull CoordinatorLayout parent, @NotNull View child, @NotNull View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        return dependency.getId() == xri.C7 || dependency.getId() == xri.I;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(@NotNull CoordinatorLayout parent, @NotNull View child, @NotNull View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        View view = this.titleView;
        if (view == null || !view.isAttachedToWindow()) {
            this.titleView = parent.findViewById(xri.C7);
        }
        View view2 = this.titleView;
        int rootHeight = 0;
        int height = (view2 == null || !ExtUtilsKt.isVisible(view2) || view2.getHeight() <= 0) ? 0 : view2.getHeight();
        View view3 = this.listView;
        if (view3 == null || !view3.isAttachedToWindow()) {
            this.listView = parent.findViewById(xri.I);
        }
        View view4 = this.listView;
        if (view4 != null && ExtUtilsKt.isVisible(view4)) {
            CreateRouteActivity createRouteActivity = this.createRouteActivity;
            rootHeight = createRouteActivity != null ? createRouteActivity.getRootHeight() : 0;
            CreateRouteActivity createRouteActivity2 = this.createRouteActivity;
            rootHeight -= createRouteActivity2 != null ? createRouteActivity2.getViewTopOnScreen(view4) : rootHeight;
        }
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        CreateRouteActivity createRouteActivity3 = this.createRouteActivity;
        if (createRouteActivity3 != null) {
            if (height == 0) {
                layoutParams.height = (createRouteActivity3.getRootHeight() - rootHeight) - createRouteActivity3.getStatusBarHeight();
                child.setY(createRouteActivity3.getStatusBarHeight());
            } else {
                layoutParams.height = (createRouteActivity3.getRootHeight() - height) - rootHeight;
                child.setY(height);
            }
            child.setLayoutParams(layoutParams);
        }
        return true;
    }

    public final void setCreateRouteActivity(@Nullable CreateRouteActivity createRouteActivity) {
        this.createRouteActivity = createRouteActivity;
    }

    public final void setListView(@Nullable View view) {
        this.listView = view;
    }

    public final void setTitleView(@Nullable View view) {
        this.titleView = view;
    }
}
