package com.huami.moving.sport.ui.view.chart;

import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.moving.sport.ui.view.chart.ChartFlagViewSlideWrapper;
import com.huami.passport.Configs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0012\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/huami/moving/sport/ui/view/chart/ChartFlagViewSlideWrapper;", "", "", "centerX", "", "slide", Configs.Params.RESET, "Landroid/view/View;", "a", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "b", "F", "getLeftBoundaryX", "()F", "leftBoundaryX", "c", "getRightBoundaryX", "rightBoundaryX", "<init>", "(Landroid/view/View;FF)V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class ChartFlagViewSlideWrapper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final View view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float leftBoundaryX;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float rightBoundaryX;

    public ChartFlagViewSlideWrapper(@NotNull View view, float f, float f2) {
        this.view = view;
        this.leftBoundaryX = f;
        this.rightBoundaryX = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ChartFlagViewSlideWrapper chartFlagViewSlideWrapper) {
        chartFlagViewSlideWrapper.view.setTranslationX(0.0f);
    }

    public final float getLeftBoundaryX() {
        return this.leftBoundaryX;
    }

    public final float getRightBoundaryX() {
        return this.rightBoundaryX;
    }

    public final void reset() {
        this.view.post(new Runnable() { // from class: mn0
            @Override // java.lang.Runnable
            public final void run() {
                ChartFlagViewSlideWrapper.b(this.a);
            }
        });
    }

    public final void slide(float centerX) {
        float left = centerX - ((this.view.getLeft() + this.view.getRight()) / 2.0f);
        if (this.view.getLeft() + left < this.leftBoundaryX) {
            left -= (this.view.getLeft() + left) - this.leftBoundaryX;
        }
        if (this.view.getRight() + left > this.rightBoundaryX) {
            left -= (this.view.getRight() + left) - this.rightBoundaryX;
        }
        this.view.setTranslationX(left);
    }

    public /* synthetic */ ChartFlagViewSlideWrapper(View view, float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? view.getResources().getDisplayMetrics().widthPixels : f2);
    }
}
