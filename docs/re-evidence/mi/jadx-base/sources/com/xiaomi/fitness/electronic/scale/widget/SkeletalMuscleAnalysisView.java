package com.xiaomi.fitness.electronic.scale.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xiaomi.fitness.electronic.scale.data.WeightResult;
import com.xiaomi.fitness.electronic.scale.model.AnalysisDataModel;
import com.xiaomi.fitness.electronic.scale.model.FatAnalysisBean;
import com.xiaomi.fitness.electronic.scale.util.WeightInfoUtil;
import com.xiaomi.fitness.health.export.WeightExtKt;
import defpackage.bri;
import defpackage.c8l;
import defpackage.gui;
import defpackage.jz6;
import defpackage.lni;
import defpackage.ofl;
import defpackage.syi;
import defpackage.ua1;
import defpackage.z5h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\"\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eR\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/widget/SkeletalMuscleAnalysisView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mViewBody", "Lcom/xiaomi/fitness/electronic/scale/widget/SkeletalMuscleAnalysisBodyView;", "mIvLow", "Landroid/widget/ImageView;", "mIvNormal", "mIvHigh", "mViewLeftUpperLimb", "Lcom/xiaomi/fitness/electronic/scale/widget/AnalysisDataView;", "mViewRightUpperLimb", "mViewTrunk", "mViewLeftLowerLimb", "mViewRightLowerLimb", "mViewAnalysisDataDes", "Lcom/xiaomi/fitness/electronic/scale/widget/AnalysisDataDesView;", "initView", "", "initData", "weightResult", "Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SkeletalMuscleAnalysisView extends ConstraintLayout {
    private ImageView mIvHigh;
    private ImageView mIvLow;
    private ImageView mIvNormal;
    private AnalysisDataDesView mViewAnalysisDataDes;
    private SkeletalMuscleAnalysisBodyView mViewBody;
    private AnalysisDataView mViewLeftLowerLimb;
    private AnalysisDataView mViewLeftUpperLimb;
    private AnalysisDataView mViewRightLowerLimb;
    private AnalysisDataView mViewRightUpperLimb;
    private AnalysisDataView mViewTrunk;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SkeletalMuscleAnalysisView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void initView(Context context, AttributeSet attrs, int defStyleAttr) {
        View viewInflate = LayoutInflater.from(context).inflate(gui.Z, this);
        this.mViewBody = (SkeletalMuscleAnalysisBodyView) viewInflate.findViewById(bri.o6);
        this.mIvLow = (ImageView) viewInflate.findViewById(bri.o1);
        this.mIvNormal = (ImageView) viewInflate.findViewById(bri.p1);
        this.mIvHigh = (ImageView) viewInflate.findViewById(bri.l1);
        this.mViewLeftUpperLimb = (AnalysisDataView) viewInflate.findViewById(bri.E6);
        this.mViewRightUpperLimb = (AnalysisDataView) viewInflate.findViewById(bri.K6);
        this.mViewTrunk = (AnalysisDataView) viewInflate.findViewById(bri.M6);
        this.mViewLeftLowerLimb = (AnalysisDataView) viewInflate.findViewById(bri.D6);
        this.mViewRightLowerLimb = (AnalysisDataView) viewInflate.findViewById(bri.J6);
        this.mViewAnalysisDataDes = (AnalysisDataDesView) viewInflate.findViewById(bri.l6);
        Drawable drawableA = c8l.a(context, lni.h, WeightExtKt.getColorLow());
        ImageView imageView = this.mIvLow;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvLow");
            imageView = null;
        }
        imageView.setImageDrawable(drawableA);
        Drawable drawableA2 = c8l.a(context, lni.h, WeightExtKt.getColorNormal());
        ImageView imageView3 = this.mIvNormal;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvNormal");
            imageView3 = null;
        }
        imageView3.setImageDrawable(drawableA2);
        Drawable drawableA3 = c8l.a(context, lni.h, WeightExtKt.getColorHigh());
        ImageView imageView4 = this.mIvHigh;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvHigh");
        } else {
            imageView2 = imageView4;
        }
        imageView2.setImageDrawable(drawableA3);
    }

    public final void initData(@NotNull final WeightResult weightResult) {
        Intrinsics.checkNotNullParameter(weightResult, "weightResult");
        AnalysisDataView analysisDataView = this.mViewLeftUpperLimb;
        AnalysisDataDesView analysisDataDesView = null;
        if (analysisDataView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewLeftUpperLimb");
            analysisDataView = null;
        }
        WeightInfoUtil weightInfoUtil = WeightInfoUtil.INSTANCE;
        analysisDataView.initData(1, String.valueOf(weightInfoUtil.getFormatFloat(weightResult.getLam())));
        AnalysisDataView analysisDataView2 = this.mViewRightUpperLimb;
        if (analysisDataView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewRightUpperLimb");
            analysisDataView2 = null;
        }
        analysisDataView2.initData(2, String.valueOf(weightInfoUtil.getFormatFloat(weightResult.getRam())));
        AnalysisDataView analysisDataView3 = this.mViewTrunk;
        if (analysisDataView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewTrunk");
            analysisDataView3 = null;
        }
        analysisDataView3.initData(3, String.valueOf(weightInfoUtil.getFormatFloat(weightResult.getTm())));
        AnalysisDataView analysisDataView4 = this.mViewLeftLowerLimb;
        if (analysisDataView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewLeftLowerLimb");
            analysisDataView4 = null;
        }
        analysisDataView4.initData(4, String.valueOf(weightInfoUtil.getFormatFloat(weightResult.getLlm())));
        AnalysisDataView analysisDataView5 = this.mViewRightLowerLimb;
        if (analysisDataView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewRightLowerLimb");
            analysisDataView5 = null;
        }
        analysisDataView5.initData(5, String.valueOf(weightInfoUtil.getFormatFloat(weightResult.getRlm())));
        AnalysisDataDesView analysisDataDesView2 = this.mViewAnalysisDataDes;
        if (analysisDataDesView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAnalysisDataDes");
        } else {
            analysisDataDesView = analysisDataDesView2;
        }
        analysisDataDesView.initData(weightResult, 1);
        AnalysisDataModel analysisDataModel = new AnalysisDataModel();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        analysisDataModel.getFatAnalysisData(resources, syi.c).S(ofl.c()).e0(ofl.c()).H(ua1.c()).a(new z5h<List<FatAnalysisBean>>() { // from class: com.xiaomi.fitness.electronic.scale.widget.SkeletalMuscleAnalysisView.initData.1
            @Override // defpackage.z5h
            public void onComplete() {
            }

            @Override // defpackage.z5h
            public void onError(Throwable e) {
                Intrinsics.checkNotNullParameter(e, "e");
            }

            @Override // defpackage.z5h
            public void onSubscribe(jz6 d) {
                Intrinsics.checkNotNullParameter(d, "d");
            }

            @Override // defpackage.z5h
            public void onNext(List<FatAnalysisBean> list) {
                Intrinsics.checkNotNullParameter(list, "list");
                SkeletalMuscleAnalysisBodyView skeletalMuscleAnalysisBodyView = SkeletalMuscleAnalysisView.this.mViewBody;
                if (skeletalMuscleAnalysisBodyView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewBody");
                    skeletalMuscleAnalysisBodyView = null;
                }
                skeletalMuscleAnalysisBodyView.setData(list, weightResult);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SkeletalMuscleAnalysisView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkeletalMuscleAnalysisView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context, attributeSet, i);
    }
}
