package com.xiaomi.fitness.electronic.scale.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xiaomi.fitness.electronic.scale.data.WeightResult;
import defpackage.bri;
import defpackage.gui;
import defpackage.lni;
import defpackage.zzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\"\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cR\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/widget/EvaluationIndexView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mViewBodyShape", "Lcom/xiaomi/fitness/electronic/scale/widget/BodyShapeView;", "mIvShapeImg", "Landroid/widget/ImageView;", "mTvShapeName", "Landroid/widget/TextView;", "mTvWaistHipValue", "mTvBodyAgeValue", "mTvSkeletalMuscleValue", "mTvCalorieIntakeValue", "initView", "", "initData", "weightResult", "Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;", "sex", "", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EvaluationIndexView extends ConstraintLayout {
    private ImageView mIvShapeImg;
    private TextView mTvBodyAgeValue;
    private TextView mTvCalorieIntakeValue;
    private TextView mTvShapeName;
    private TextView mTvSkeletalMuscleValue;
    private TextView mTvWaistHipValue;
    private BodyShapeView mViewBodyShape;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EvaluationIndexView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void initView(Context context, AttributeSet attrs, int defStyleAttr) {
        View viewInflate = LayoutInflater.from(context).inflate(gui.W, this);
        this.mViewBodyShape = (BodyShapeView) viewInflate.findViewById(bri.s6);
        this.mTvShapeName = (TextView) viewInflate.findViewById(bri.y5);
        this.mIvShapeImg = (ImageView) viewInflate.findViewById(bri.q1);
        this.mTvWaistHipValue = (TextView) viewInflate.findViewById(bri.T5);
        this.mTvBodyAgeValue = (TextView) viewInflate.findViewById(bri.e4);
        this.mTvSkeletalMuscleValue = (TextView) viewInflate.findViewById(bri.A5);
        this.mTvCalorieIntakeValue = (TextView) viewInflate.findViewById(bri.g4);
    }

    public final void initData(@NotNull WeightResult weightResult, @Nullable String sex) {
        Intrinsics.checkNotNullParameter(weightResult, "weightResult");
        short bs = weightResult.getBs();
        TextView textView = null;
        if (bs == 1) {
            TextView textView2 = this.mTvShapeName;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvShapeName");
                textView2 = null;
            }
            textView2.setText(getResources().getString(zzi.K));
            ImageView imageView = this.mIvShapeImg;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIvShapeImg");
                imageView = null;
            }
            imageView.setImageResource(lni.v);
        } else if (bs == 2) {
            TextView textView3 = this.mTvShapeName;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvShapeName");
                textView3 = null;
            }
            textView3.setText(getResources().getString(zzi.B4));
            ImageView imageView2 = this.mIvShapeImg;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIvShapeImg");
                imageView2 = null;
            }
            imageView2.setImageResource(lni.y);
        } else if (bs == 3) {
            TextView textView4 = this.mTvShapeName;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvShapeName");
                textView4 = null;
            }
            textView4.setText(getResources().getString(zzi.I3));
            ImageView imageView3 = this.mIvShapeImg;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIvShapeImg");
                imageView3 = null;
            }
            imageView3.setImageResource(lni.x);
        } else if (bs == 4) {
            TextView textView5 = this.mTvShapeName;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvShapeName");
                textView5 = null;
            }
            textView5.setText(getResources().getString(zzi.K3));
            ImageView imageView4 = this.mIvShapeImg;
            if (imageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIvShapeImg");
                imageView4 = null;
            }
            imageView4.setImageResource(lni.z);
        } else if (bs == 5) {
            TextView textView6 = this.mTvShapeName;
            if (textView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvShapeName");
                textView6 = null;
            }
            textView6.setText(getResources().getString(zzi.f5));
            ImageView imageView5 = this.mIvShapeImg;
            if (imageView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIvShapeImg");
                imageView5 = null;
            }
            imageView5.setImageResource(lni.w);
        }
        BodyShapeView bodyShapeView = this.mViewBodyShape;
        if (bodyShapeView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewBodyShape");
            bodyShapeView = null;
        }
        bodyShapeView.initData(weightResult, sex);
        TextView textView7 = this.mTvWaistHipValue;
        if (textView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvWaistHipValue");
            textView7 = null;
        }
        textView7.setText(String.valueOf(weightResult.getWhr()));
        TextView textView8 = this.mTvBodyAgeValue;
        if (textView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvBodyAgeValue");
            textView8 = null;
        }
        textView8.setText(String.valueOf((int) weightResult.getMa()));
        TextView textView9 = this.mTvSkeletalMuscleValue;
        if (textView9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvSkeletalMuscleValue");
            textView9 = null;
        }
        textView9.setText(String.valueOf(weightResult.getLimBmi()));
        String string = getResources().getString(zzi.M3);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        TextView textView10 = this.mTvCalorieIntakeValue;
        if (textView10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvCalorieIntakeValue");
        } else {
            textView = textView10;
        }
        textView.setText(weightResult.getCin() + string);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EvaluationIndexView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EvaluationIndexView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context, attributeSet, i);
    }
}
