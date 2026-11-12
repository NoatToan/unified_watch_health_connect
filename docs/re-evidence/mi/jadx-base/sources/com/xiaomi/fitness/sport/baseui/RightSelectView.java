package com.xiaomi.fitness.sport.baseui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.fitness.common.utils.StringUtil;
import defpackage.dvi;
import defpackage.t4j;
import defpackage.xri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/sport/baseui/RightSelectView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_titleTv", "Landroid/widget/TextView;", "_detailTv", "_rightTv", "_arrow", "Landroid/widget/ImageView;", "initView", "", "setRightText", "str", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RightSelectView extends LinearLayout {
    private ImageView _arrow;
    private TextView _detailTv;
    private TextView _rightTv;
    private TextView _titleTv;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RightSelectView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(dvi.N1, this);
        initView(attributeSet);
    }

    private final void initView(AttributeSet attrs) {
        TypedArray typedArrayObtainAttributes = getContext().getResources().obtainAttributes(attrs, t4j.u3);
        String string = typedArrayObtainAttributes.getString(t4j.w3);
        String string2 = typedArrayObtainAttributes.getString(t4j.v3);
        TextView textView = (TextView) findViewById(xri.p7);
        this._titleTv = textView;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_titleTv");
            textView = null;
        }
        textView.setText(string);
        this._detailTv = (TextView) findViewById(xri.i1);
        if (StringUtil.isBlank(string2)) {
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
        this._rightTv = (TextView) findViewById(xri.a5);
        this._arrow = (ImageView) findViewById(xri.o);
        typedArrayObtainAttributes.recycle();
    }

    public final void setRightText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        TextView textView = this._rightTv;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_rightTv");
            textView = null;
        }
        textView.setText(str);
    }
}
