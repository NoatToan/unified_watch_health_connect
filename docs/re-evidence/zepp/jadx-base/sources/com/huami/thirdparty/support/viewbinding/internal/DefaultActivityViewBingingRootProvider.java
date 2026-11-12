package com.huami.thirdparty.support.viewbinding.internal;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/thirdparty/support/viewbinding/internal/DefaultActivityViewBingingRootProvider;", "", "Landroid/app/Activity;", "activity", "Landroid/view/View;", "findRootView", "<init>", "()V", "support_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class DefaultActivityViewBingingRootProvider {

    @NotNull
    public static final DefaultActivityViewBingingRootProvider INSTANCE = new DefaultActivityViewBingingRootProvider();

    private DefaultActivityViewBingingRootProvider() {
    }

    @NotNull
    public final View findRootView(@NotNull Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        if (viewGroup == null) {
            throw new IllegalStateException("Activity has no content view".toString());
        }
        int childCount = viewGroup.getChildCount();
        if (childCount == 0) {
            throw new IllegalStateException("Content view has no children. Provide root view explicitly".toString());
        }
        if (childCount == 1) {
            return viewGroup.getChildAt(0);
        }
        throw new IllegalStateException("More than one child view found in Activity content view".toString());
    }
}
