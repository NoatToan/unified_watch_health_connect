package com.xiaomi.fitness.baseui.view;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¨\u0006\u000b"}, d2 = {"addTipView", "Lcom/xiaomi/fitness/baseui/view/TipView;", "container", "Landroid/widget/FrameLayout;", "type", "Lcom/xiaomi/fitness/baseui/view/TipType;", "removeErrorOnRefresh", "", "onRetry", "Lkotlin/Function0;", "", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TipViewKt {
    @NotNull
    public static final TipView addTipView(@NotNull FrameLayout container, @NotNull TipType type, boolean z, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(type, "type");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TipView tipView = new TipView(context, type, function0, z);
        container.addView(tipView, new FrameLayout.LayoutParams(-1, -1));
        return tipView;
    }

    public static /* synthetic */ TipView addTipView$default(FrameLayout frameLayout, TipType tipType, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return addTipView(frameLayout, tipType, z, function0);
    }
}
