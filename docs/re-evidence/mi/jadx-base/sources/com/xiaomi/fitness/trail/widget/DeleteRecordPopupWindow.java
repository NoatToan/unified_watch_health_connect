package com.xiaomi.fitness.trail.widget;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.dki;
import defpackage.hoi;
import defpackage.j1j;
import defpackage.ni4;
import defpackage.s2j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/trail/widget/DeleteRecordPopupWindow;", "Landroid/widget/PopupWindow;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mContentView", "Landroid/widget/TextView;", "setOnBtnClickListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "initContentView", "dp2px", "", "dp", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeleteRecordPopupWindow extends PopupWindow {

    @NotNull
    private final TextView mContentView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteRecordPopupWindow(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setFocusable(true);
        setOutsideTouchable(true);
        setHeight(-2);
        setWidth(dp2px(context, 167));
        setBackgroundDrawable(new ColorDrawable(0));
        TextView textView = new TextView(context);
        this.mContentView = textView;
        initContentView(context);
        setContentView(textView);
    }

    private final int dp2px(Context context, int dp) {
        return (int) ((dp * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private final void initContentView(Context context) {
        this.mContentView.setText(j1j.common_delete);
        this.mContentView.setTextAppearance(s2j.f33209a);
        this.mContentView.setTextSize(15.0f);
        this.mContentView.setTextColor(ni4.c(context, dki.G0));
        this.mContentView.setBackgroundResource(hoi.j);
        int iDp2px = dp2px(context, 27);
        int iDp2px2 = dp2px(context, 25);
        this.mContentView.setPadding(iDp2px, iDp2px2, iDp2px, iDp2px2);
    }

    public final void setOnBtnClickListener(@Nullable View.OnClickListener listener) {
        this.mContentView.setOnClickListener(listener);
    }
}
