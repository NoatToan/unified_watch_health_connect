package com.xiaomi.fitness.relative.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import defpackage.eri;
import defpackage.jui;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\u001e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018R\u001a\u0010\b\u001a\u00020\tX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u00020\tX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/relative/view/TargetRItemView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "valueTextTv", "Landroid/widget/TextView;", "getValueTextTv", "()Landroid/widget/TextView;", "setValueTextTv", "(Landroid/widget/TextView;)V", "unitTextTv", "getUnitTextTv", "setUnitTextTv", "descTextTv", "getDescTextTv", "setDescTextTv", "onFinishInflate", "", "bindData", "valueText", "", "unitText", "descText", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TargetRItemView extends RelativeLayout {
    public TextView descTextTv;
    public TextView unitTextTv;
    public TextView valueTextTv;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TargetRItemView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        LayoutInflater.from(context).inflate(jui.U6, this);
    }

    public final void bindData(@NotNull String valueText, @NotNull String unitText, @NotNull String descText) {
        Intrinsics.checkNotNullParameter(valueText, "valueText");
        Intrinsics.checkNotNullParameter(unitText, "unitText");
        Intrinsics.checkNotNullParameter(descText, "descText");
        getValueTextTv().setText(valueText);
        getUnitTextTv().setText(unitText);
        getDescTextTv().setText(descText);
    }

    @NotNull
    public final TextView getDescTextTv() {
        TextView textView = this.descTextTv;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("descTextTv");
        return null;
    }

    @NotNull
    public final TextView getUnitTextTv() {
        TextView textView = this.unitTextTv;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("unitTextTv");
        return null;
    }

    @NotNull
    public final TextView getValueTextTv() {
        TextView textView = this.valueTextTv;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("valueTextTv");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setValueTextTv((TextView) findViewById(eri.ho));
        setUnitTextTv((TextView) findViewById(eri.fo));
        setDescTextTv((TextView) findViewById(eri.Dn));
    }

    public final void setDescTextTv(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.descTextTv = textView;
    }

    public final void setUnitTextTv(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.unitTextTv = textView;
    }

    public final void setValueTextTv(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.valueTextTv = textView;
    }
}
