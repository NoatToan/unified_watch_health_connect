package com.huami.bodymeasurements.common.view;

import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.bodymeasurements.common.view.ViewSlideWrapper;
import com.huami.passport.Configs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/huami/bodymeasurements/common/view/ViewSlideWrapper;", "", "", "centerX", "", "slide", Configs.Params.RESET, "Landroid/view/View;", "a", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "b", "F", "leftBoundaryX", "c", "rightBoundaryX", "<init>", "(Landroid/view/View;FF)V", "common_release"}, k = 1, mv = {1, 5, 1})
public final class ViewSlideWrapper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final View view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float leftBoundaryX;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float rightBoundaryX;

    public ViewSlideWrapper(@NotNull View view, float f, float f2) {
        this.view = view;
        this.leftBoundaryX = f;
        this.rightBoundaryX = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ViewSlideWrapper viewSlideWrapper) {
        viewSlideWrapper.view.setTranslationX(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ViewSlideWrapper viewSlideWrapper, float f) {
        float left = f - ((viewSlideWrapper.view.getLeft() + viewSlideWrapper.view.getRight()) / 2.0f);
        if (viewSlideWrapper.view.getLeft() + left < viewSlideWrapper.leftBoundaryX) {
            left -= (viewSlideWrapper.view.getLeft() + left) - viewSlideWrapper.leftBoundaryX;
        }
        if (viewSlideWrapper.view.getRight() + left > viewSlideWrapper.rightBoundaryX) {
            left -= (viewSlideWrapper.view.getRight() + left) - viewSlideWrapper.rightBoundaryX;
        }
        viewSlideWrapper.view.setTranslationX(left);
    }

    public final void reset() {
        this.view.post(new Runnable() { // from class: qb8
            @Override // java.lang.Runnable
            public final void run() {
                ViewSlideWrapper.c(this.a);
            }
        });
    }

    public final void slide(final float centerX) {
        this.view.post(new Runnable() { // from class: rb8
            @Override // java.lang.Runnable
            public final void run() {
                ViewSlideWrapper.d(this.a, centerX);
            }
        });
    }

    public /* synthetic */ ViewSlideWrapper(View view, float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? view.getResources().getDisplayMetrics().widthPixels : f2);
    }
}
