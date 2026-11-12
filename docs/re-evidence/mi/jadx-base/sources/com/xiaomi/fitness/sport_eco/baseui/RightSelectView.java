package com.xiaomi.fitness.sport_eco.baseui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.fitness.sport_eco.utils.StringUtils;
import defpackage.fvi;
import defpackage.v4j;
import defpackage.zri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/baseui/RightSelectView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_titleTv", "Landroid/widget/TextView;", "_detailTv", "_rightTv", "_arrow", "Landroid/widget/ImageView;", "initView", "", "setRightText", "str", "", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RightSelectView extends LinearLayout {
    private ImageView _arrow;
    private TextView _detailTv;
    private TextView _rightTv;
    private TextView _titleTv;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RightSelectView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(fvi.w0, this);
        initView(attributeSet);
    }

    private final void initView(AttributeSet attrs) {
        TypedArray typedArrayObtainAttributes = getContext().getResources().obtainAttributes(attrs, v4j.S3);
        String string = typedArrayObtainAttributes.getString(v4j.U3);
        String string2 = typedArrayObtainAttributes.getString(v4j.T3);
        TextView textView = (TextView) findViewById(zri.V2);
        this._titleTv = textView;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_titleTv");
            textView = null;
        }
        textView.setText(string);
        this._detailTv = (TextView) findViewById(zri.L);
        if (StringUtils.isBlank(string2)) {
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
        this._rightTv = (TextView) findViewById(zri.N1);
        this._arrow = (ImageView) findViewById(zri.f41603b);
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
