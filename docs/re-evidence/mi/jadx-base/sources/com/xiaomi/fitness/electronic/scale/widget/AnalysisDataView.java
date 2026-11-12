package com.xiaomi.fitness.electronic.scale.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.bri;
import defpackage.gui;
import defpackage.l4j;
import defpackage.zzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J\u0016\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0001X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/widget/AnalysisDataView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mTvData", "Landroid/widget/TextView;", "mTvDataUnit", "mTvDataName", "mRootLayout", "initView", "", "attr", "initData", "type", "txt", "", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AnalysisDataView extends LinearLayout {
    public static final int TYPE_LEFT_LOWER_LIMB = 4;
    public static final int TYPE_LEFT_UPPER_LIMB = 1;
    public static final int TYPE_RIGHT_LOWER_LIMB = 5;
    public static final int TYPE_RIGHT_UPPER_LIMB = 2;
    public static final int TYPE_TRUNK = 3;
    private LinearLayout mRootLayout;
    private TextView mTvData;
    private TextView mTvDataName;
    private TextView mTvDataUnit;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnalysisDataView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void initView(Context context, AttributeSet attr, int defStyleAttr) {
        View viewInflate = LayoutInflater.from(context).inflate(gui.R, this);
        this.mRootLayout = (LinearLayout) viewInflate.findViewById(bri.x3);
        this.mTvData = (TextView) viewInflate.findViewById(bri.j4);
        this.mTvDataUnit = (TextView) viewInflate.findViewById(bri.l4);
        this.mTvDataName = (TextView) viewInflate.findViewById(bri.k4);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attr, l4j.H0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        LinearLayout linearLayout = this.mRootLayout;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootLayout");
            linearLayout = null;
        }
        linearLayout.setGravity(typedArrayObtainStyledAttributes.getInt(l4j.I0, 8388611));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void initData(int type, @NotNull String txt) {
        Intrinsics.checkNotNullParameter(txt, "txt");
        TextView textView = null;
        if (type == 1) {
            TextView textView2 = this.mTvData;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvData");
                textView2 = null;
            }
            textView2.setText(txt);
            TextView textView3 = this.mTvDataUnit;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvDataUnit");
                textView3 = null;
            }
            textView3.setText(getResources().getString(zzi.q5));
            TextView textView4 = this.mTvDataName;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvDataName");
            } else {
                textView = textView4;
            }
            textView.setText(getResources().getString(zzi.P3));
            return;
        }
        if (type == 2) {
            TextView textView5 = this.mTvData;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvData");
                textView5 = null;
            }
            textView5.setText(txt);
            TextView textView6 = this.mTvDataUnit;
            if (textView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvDataUnit");
                textView6 = null;
            }
            textView6.setText(getResources().getString(zzi.q5));
            TextView textView7 = this.mTvDataName;
            if (textView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvDataName");
            } else {
                textView = textView7;
            }
            textView.setText(getResources().getString(zzi.R4));
            return;
        }
        if (type == 3) {
            TextView textView8 = this.mTvData;
            if (textView8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvData");
                textView8 = null;
            }
            textView8.setText(txt);
            TextView textView9 = this.mTvDataUnit;
            if (textView9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvDataUnit");
                textView9 = null;
            }
            textView9.setText(getResources().getString(zzi.q5));
            TextView textView10 = this.mTvDataName;
            if (textView10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvDataName");
            } else {
                textView = textView10;
            }
            textView.setText(getResources().getString(zzi.k5));
            return;
        }
        if (type == 4) {
            TextView textView11 = this.mTvData;
            if (textView11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvData");
                textView11 = null;
            }
            textView11.setText(txt);
            TextView textView12 = this.mTvDataUnit;
            if (textView12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvDataUnit");
                textView12 = null;
            }
            textView12.setText(getResources().getString(zzi.q5));
            TextView textView13 = this.mTvDataName;
            if (textView13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvDataName");
            } else {
                textView = textView13;
            }
            textView.setText(getResources().getString(zzi.O3));
            return;
        }
        if (type != 5) {
            return;
        }
        TextView textView14 = this.mTvData;
        if (textView14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvData");
            textView14 = null;
        }
        textView14.setText(txt);
        TextView textView15 = this.mTvDataUnit;
        if (textView15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvDataUnit");
            textView15 = null;
        }
        textView15.setText(getResources().getString(zzi.q5));
        TextView textView16 = this.mTvDataName;
        if (textView16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvDataName");
        } else {
            textView = textView16;
        }
        textView.setText(getResources().getString(zzi.Q4));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnalysisDataView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalysisDataView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context, attributeSet, i);
    }
}
