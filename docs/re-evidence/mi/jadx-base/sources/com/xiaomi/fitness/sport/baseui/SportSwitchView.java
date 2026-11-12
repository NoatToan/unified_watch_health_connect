package com.xiaomi.fitness.sport.baseui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.fitness.widget.button.SwitchButton;
import defpackage.aki;
import defpackage.dvi;
import defpackage.ni4;
import defpackage.t4j;
import defpackage.xri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sport/baseui/SportSwitchView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_titleTv", "Landroid/widget/TextView;", "_detailTv", "getSwitchButton", "Lcom/xiaomi/fitness/widget/button/SwitchButton;", "initView", "", "setTextColor", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportSwitchView extends LinearLayout {
    private TextView _detailTv;
    private TextView _titleTv;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportSwitchView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(dvi.F, this);
        initView(attributeSet);
    }

    private final void initView(AttributeSet attrs) {
        TypedArray typedArrayObtainAttributes = getContext().getResources().obtainAttributes(attrs, t4j.b4);
        String string = typedArrayObtainAttributes.getString(t4j.d4);
        String string2 = typedArrayObtainAttributes.getString(t4j.c4);
        TextView textView = (TextView) findViewById(xri.D7);
        this._titleTv = textView;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_titleTv");
            textView = null;
        }
        textView.setText(string);
        this._detailTv = (TextView) findViewById(xri.j1);
        if (string2 == null || StringsKt__StringsKt.isBlank(string2)) {
            TextView textView3 = this._detailTv;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_detailTv");
            } else {
                textView2 = textView3;
            }
            textView2.setVisibility(8);
        } else {
            TextView textView4 = this._detailTv;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_detailTv");
            } else {
                textView2 = textView4;
            }
            textView2.setText(string2);
        }
        setTextColor();
        typedArrayObtainAttributes.recycle();
    }

    private final void setTextColor() {
        TextView textView = this._titleTv;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_titleTv");
            textView = null;
        }
        textView.setTextColor(ni4.c(getContext(), aki.y));
        TextView textView3 = this._detailTv;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_detailTv");
        } else {
            textView2 = textView3;
        }
        textView2.setTextColor(ni4.c(getContext(), aki.x));
    }

    @NotNull
    public final SwitchButton getSwitchButton() {
        View viewFindViewById = findViewById(xri.a7);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        return (SwitchButton) viewFindViewById;
    }
}
