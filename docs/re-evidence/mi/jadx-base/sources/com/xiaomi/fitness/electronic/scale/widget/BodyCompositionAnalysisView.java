package com.xiaomi.fitness.electronic.scale.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xiaomi.fitness.electronic.scale.data.WeightResult;
import defpackage.bri;
import defpackage.gui;
import defpackage.qal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\"\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001dR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/widget/BodyCompositionAnalysisView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mViewWaterComponent", "Lcom/xiaomi/fitness/electronic/scale/widget/BodyConditionView;", "mViewProteinComponent", "mViewFatComponent", "mViewBoneSaltComponent", "mViewMuscleComponent", "mViewVisceralFatGrade", "mViewBasalMetabolicRate", "initView", "", "initData", "weightResult", "Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;", "sex", "", "age", "height", "", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BodyCompositionAnalysisView extends ConstraintLayout {

    @Nullable
    private BodyConditionView mViewBasalMetabolicRate;

    @Nullable
    private BodyConditionView mViewBoneSaltComponent;

    @Nullable
    private BodyConditionView mViewFatComponent;

    @Nullable
    private BodyConditionView mViewMuscleComponent;

    @Nullable
    private BodyConditionView mViewProteinComponent;

    @Nullable
    private BodyConditionView mViewVisceralFatGrade;

    @Nullable
    private BodyConditionView mViewWaterComponent;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BodyCompositionAnalysisView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void initView(Context context, AttributeSet attrs, int defStyleAttr) {
        View viewInflate = LayoutInflater.from(context).inflate(gui.T, this);
        this.mViewWaterComponent = (BodyConditionView) viewInflate.findViewById(bri.O6);
        this.mViewProteinComponent = (BodyConditionView) viewInflate.findViewById(bri.H6);
        this.mViewFatComponent = (BodyConditionView) viewInflate.findViewById(bri.A6);
        this.mViewBoneSaltComponent = (BodyConditionView) viewInflate.findViewById(bri.t6);
        this.mViewMuscleComponent = (BodyConditionView) viewInflate.findViewById(bri.G6);
        this.mViewVisceralFatGrade = (BodyConditionView) viewInflate.findViewById(bri.N6);
        this.mViewBasalMetabolicRate = (BodyConditionView) viewInflate.findViewById(bri.m6);
    }

    public final void initData(@NotNull WeightResult weightResult, @Nullable String sex, int age, float height) {
        Intrinsics.checkNotNullParameter(weightResult, "weightResult");
        qal.c("initData() " + weightResult + ".spliceAllProperties()");
        BodyConditionView bodyConditionView = this.mViewWaterComponent;
        if (bodyConditionView != null) {
            bodyConditionView.initData(5, weightResult, sex, age, height);
        }
        BodyConditionView bodyConditionView2 = this.mViewProteinComponent;
        if (bodyConditionView2 != null) {
            bodyConditionView2.initData(6, weightResult, sex, age, height);
        }
        BodyConditionView bodyConditionView3 = this.mViewFatComponent;
        if (bodyConditionView3 != null) {
            bodyConditionView3.initData(7, weightResult, sex, age, height);
        }
        BodyConditionView bodyConditionView4 = this.mViewBoneSaltComponent;
        if (bodyConditionView4 != null) {
            bodyConditionView4.initData(8, weightResult, sex, age, height);
        }
        BodyConditionView bodyConditionView5 = this.mViewMuscleComponent;
        if (bodyConditionView5 != null) {
            bodyConditionView5.initData(9, weightResult, sex, age, height);
        }
        BodyConditionView bodyConditionView6 = this.mViewVisceralFatGrade;
        if (bodyConditionView6 != null) {
            bodyConditionView6.initData(10, weightResult, sex, age, height);
        }
        BodyConditionView bodyConditionView7 = this.mViewBasalMetabolicRate;
        if (bodyConditionView7 != null) {
            bodyConditionView7.initData(11, weightResult, sex, age, height);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BodyCompositionAnalysisView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BodyCompositionAnalysisView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context, attributeSet, i);
    }
}
