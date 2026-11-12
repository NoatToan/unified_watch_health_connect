package com.xiaomi.fitness.electronic.scale.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xiaomi.fitness.electronic.scale.data.WeightResult;
import defpackage.bri;
import defpackage.gui;
import defpackage.zzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\"\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/widget/BodyIndexScoreView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mTvScore", "Landroid/widget/TextView;", "mTvDes", "mViewWeight", "Lcom/xiaomi/fitness/electronic/scale/widget/BodyConditionView;", "mViewBMI", "mViewFatRatio", "mViewHeartRatio", "initView", "", "initData", "weightResult", "Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;", "sex", "", "age", "height", "", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BodyIndexScoreView extends ConstraintLayout {
    private TextView mTvDes;
    private TextView mTvScore;
    private BodyConditionView mViewBMI;
    private BodyConditionView mViewFatRatio;
    private BodyConditionView mViewHeartRatio;
    private BodyConditionView mViewWeight;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BodyIndexScoreView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void initView(Context context, AttributeSet attrs, int defStyleAttr) {
        View viewInflate = LayoutInflater.from(context).inflate(gui.V, this);
        this.mTvScore = (TextView) viewInflate.findViewById(bri.s5);
        this.mTvDes = (TextView) viewInflate.findViewById(bri.m4);
        this.mViewWeight = (BodyConditionView) viewInflate.findViewById(bri.P6);
        this.mViewBMI = (BodyConditionView) viewInflate.findViewById(bri.n6);
        this.mViewFatRatio = (BodyConditionView) viewInflate.findViewById(bri.B6);
        this.mViewHeartRatio = (BodyConditionView) viewInflate.findViewById(bri.C6);
    }

    public final void initData(@NotNull WeightResult weightResult, @Nullable String sex, int age, float height) {
        BodyConditionView bodyConditionView;
        BodyConditionView bodyConditionView2;
        BodyConditionView bodyConditionView3;
        BodyConditionView bodyConditionView4;
        Intrinsics.checkNotNullParameter(weightResult, "weightResult");
        TextView textView = this.mTvScore;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvScore");
            textView = null;
        }
        textView.setText(String.valueOf((int) weightResult.getSbc()));
        short bt = weightResult.getBt();
        if (bt == -5) {
            TextView textView2 = this.mTvDes;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvDes");
                textView2 = null;
            }
            textView2.setText(getResources().getString(zzi.V0));
        } else if (bt == -4) {
            TextView textView3 = this.mTvDes;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvDes");
                textView3 = null;
            }
            textView3.setText(getResources().getString(zzi.N3));
        } else if (bt == -3) {
            TextView textView4 = this.mTvDes;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvDes");
                textView4 = null;
            }
            textView4.setText(getResources().getString(zzi.L3));
        } else if (bt == -2) {
            TextView textView5 = this.mTvDes;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvDes");
                textView5 = null;
            }
            textView5.setText(getResources().getString(zzi.c5));
        } else if (bt == -1) {
            TextView textView6 = this.mTvDes;
            if (textView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvDes");
                textView6 = null;
            }
            textView6.setText(getResources().getString(zzi.d5));
        } else if (bt == 0) {
            TextView textView7 = this.mTvDes;
            if (textView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvDes");
                textView7 = null;
            }
            textView7.setText(getResources().getString(zzi.y3));
        } else if (bt == 1) {
            TextView textView8 = this.mTvDes;
            if (textView8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvDes");
                textView8 = null;
            }
            textView8.setText(getResources().getString(zzi.b4));
        } else if (bt == 2) {
            TextView textView9 = this.mTvDes;
            if (textView9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvDes");
                textView9 = null;
            }
            textView9.setText(getResources().getString(zzi.z4));
        } else if (bt == 3) {
            TextView textView10 = this.mTvDes;
            if (textView10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvDes");
                textView10 = null;
            }
            textView10.setText(getResources().getString(zzi.L));
        } else if (bt == 4) {
            TextView textView11 = this.mTvDes;
            if (textView11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvDes");
                textView11 = null;
            }
            textView11.setText(getResources().getString(zzi.j4));
        }
        BodyConditionView bodyConditionView5 = this.mViewWeight;
        if (bodyConditionView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewWeight");
            bodyConditionView = null;
        } else {
            bodyConditionView = bodyConditionView5;
        }
        bodyConditionView.initData(1, weightResult, sex, age, height);
        BodyConditionView bodyConditionView6 = this.mViewBMI;
        if (bodyConditionView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewBMI");
            bodyConditionView2 = null;
        } else {
            bodyConditionView2 = bodyConditionView6;
        }
        bodyConditionView2.initData(2, weightResult, sex, age, height);
        BodyConditionView bodyConditionView7 = this.mViewFatRatio;
        if (bodyConditionView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewFatRatio");
            bodyConditionView3 = null;
        } else {
            bodyConditionView3 = bodyConditionView7;
        }
        bodyConditionView3.initData(3, weightResult, sex, age, height);
        BodyConditionView bodyConditionView8 = this.mViewHeartRatio;
        if (bodyConditionView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewHeartRatio");
            bodyConditionView4 = null;
        } else {
            bodyConditionView4 = bodyConditionView8;
        }
        bodyConditionView4.initData(4, weightResult, sex, age, height);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BodyIndexScoreView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BodyIndexScoreView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context, attributeSet, i);
    }
}
