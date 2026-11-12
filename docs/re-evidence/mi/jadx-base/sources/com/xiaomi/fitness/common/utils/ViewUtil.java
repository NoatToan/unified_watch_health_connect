package com.xiaomi.fitness.common.utils;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import com.xiaomi.fitness.common.utils.ViewUtil;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/common/utils/ViewUtil;", "", "<init>", "()V", "setTouchDelegate", "", "view", "Landroid/view/View;", "expandTouchWidth", "", "lastClickTime", "", "spaceTime", "isFastClick", "", "()Z", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ViewUtil {

    @NotNull
    public static final ViewUtil INSTANCE = new ViewUtil();
    private static long lastClickTime = 0;
    private static final int spaceTime = 500;

    private ViewUtil() {
    }

    @JvmStatic
    public static final void setTouchDelegate(@NotNull final View view, final int expandTouchWidth) {
        Intrinsics.checkNotNullParameter(view, "view");
        Object parent = view.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
        final View view2 = (View) parent;
        view2.post(new Runnable() { // from class: vxq
            @Override // java.lang.Runnable
            public final void run() {
                ViewUtil.setTouchDelegate$lambda$0(view, expandTouchWidth, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTouchDelegate$lambda$0(View view, int i, View parentView) {
        Intrinsics.checkNotNullParameter(view, "$view");
        Intrinsics.checkNotNullParameter(parentView, "$parentView");
        Rect rect = new Rect();
        view.getHitRect(rect);
        rect.top -= i;
        rect.bottom += i;
        rect.left -= i;
        rect.right += i;
        parentView.setTouchDelegate(new TouchDelegate(rect, view));
    }

    public final boolean isFastClick() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = jCurrentTimeMillis - lastClickTime <= 500;
        lastClickTime = jCurrentTimeMillis;
        return z;
    }
}
