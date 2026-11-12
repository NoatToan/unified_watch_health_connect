package com.xiaomi.fitness.watch.face.view;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.widget.view.DividerView;
import defpackage.iki;
import defpackage.ni4;
import defpackage.xli;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0001\u001a\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\t\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"SIDE_MARGIN", "", "getSIDE_MARGIN", "()I", "TYPE_BG", "TYPE_STYLE", "getLabelView", "Landroid/widget/TextView;", "context", "Landroid/content/Context;", "text", "getDivider", "Landroid/view/View;", "watch-face_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FaceColorPickViewKt {
    private static final int SIDE_MARGIN = AppUtil.getApp().getResources().getDimensionPixelOffset(xli.f39245a);
    public static final int TYPE_BG = 1;
    public static final int TYPE_STYLE = 2;

    @NotNull
    public static final View getDivider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        DividerView dividerView = new DividerView(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = DisplayUtil.dip2px(20.0f);
        int i = SIDE_MARGIN;
        layoutParams.leftMargin = i;
        layoutParams.rightMargin = i;
        dividerView.setLayoutParams(layoutParams);
        return dividerView;
    }

    @NotNull
    public static final TextView getLabelView(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        TextView textView = new TextView(context);
        textView.setTextColor(ni4.c(context, iki.i));
        textView.setTextSize(12.0f);
        textView.setText(i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, DisplayUtil.dip2px(33.0f));
        layoutParams.leftMargin = SIDE_MARGIN;
        textView.setLayoutParams(layoutParams);
        textView.setGravity(16);
        return textView;
    }

    public static final int getSIDE_MARGIN() {
        return SIDE_MARGIN;
    }
}
