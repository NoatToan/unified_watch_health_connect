package com.xiaomi.fitness.util;

import android.content.Context;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.util.ViewUtil;
import com.xiaomi.fitness.view.DataTitleView;
import defpackage.a52;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/util/ViewUtil;", "", "Landroid/view/View;", "view", "", "expandTouchWidth", "", "setTouchDelegate", "(Landroid/view/View;I)V", "La52;", "attrs", "Landroid/content/Context;", "context", "adaptChartHighLightTextSize", "(La52;Landroid/content/Context;)V", "Lcom/xiaomi/fitness/view/DataTitleView;", "dataTitleView", "adaptChartCommonDataTitleView", "(Lcom/xiaomi/fitness/view/DataTitleView;Landroid/content/Context;)V", "", "lastClickTime", "J", "spaceTime", "I", "", "isFastClick", "()Z", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
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
        view2.post(new Runnable() { // from class: uxq
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

    public final void adaptChartCommonDataTitleView(@NotNull DataTitleView dataTitleView, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(dataTitleView, "dataTitleView");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!UIUtils.INSTANCE.isSmallScreen(context) && LocaleUtil.INSTANCE.isChinese()) {
            dataTitleView.f(33.0f);
        } else {
            dataTitleView.f(20.0f - (20 * (AppUtil.getTxtFontSize(context) - 1)));
        }
    }

    public final void adaptChartHighLightTextSize(@NotNull a52 attrs, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(context, "context");
        if (UIUtils.INSTANCE.isSmallScreen(context) || !LocaleUtil.INSTANCE.isChinese()) {
            attrs.B0 = ExtUtilsKt.getDp(18);
            attrs.C0 = ExtUtilsKt.getDp(8);
        } else {
            attrs.B0 = ExtUtilsKt.getDp(24);
            attrs.C0 = ExtUtilsKt.getDp(12);
        }
    }

    public final boolean isFastClick() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = jCurrentTimeMillis - lastClickTime <= 500;
        lastClickTime = jCurrentTimeMillis;
        return z;
    }
}
