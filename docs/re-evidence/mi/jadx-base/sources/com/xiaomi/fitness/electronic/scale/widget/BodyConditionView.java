package com.xiaomi.fitness.electronic.scale.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xiaomi.fitness.electronic.scale.data.WeightResult;
import com.xiaomi.fitness.electronic.scale.util.GradeIndexUtils;
import com.xiaomi.fitness.electronic.scale.util.WeightInfoUtil;
import com.xiaomi.fitness.electronic.scale.widget.BodyConditionView;
import com.xiaomi.fitness.electronic.scale.widget.sliding.BodyIndexSlidingView;
import com.xiaomi.fitness.health.export.WeightExtKt;
import defpackage.bri;
import defpackage.gui;
import defpackage.mhi;
import defpackage.zzi;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006*\u0001 \u0018\u0000 62\u00020\u0001:\u00016B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\"\u0010\"\u001a\u00020#2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J0\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020,J\b\u0010-\u001a\u00020#H\u0002J\b\u0010.\u001a\u00020#H\u0002J+\u0010/\u001a\u00020#2\f\u00100\u001a\b\u0012\u0004\u0012\u00020)012\u0006\u00102\u001a\u00020\u00162\u0006\u00103\u001a\u00020\nH\u0002¢\u0006\u0002\u00104J\b\u00105\u001a\u00020#H\u0014R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0004\n\u0002\u0010!¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/widget/BodyConditionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mTvName", "Landroid/widget/TextView;", "mTvValue", "mRlResultBalance", "Landroid/widget/RelativeLayout;", "mBodyIndexSlidingView", "Lcom/xiaomi/fitness/electronic/scale/widget/sliding/BodyIndexSlidingView;", "mIvResultBalance", "Landroid/widget/ImageView;", "colorsThree", "", "colorsFour", "askCount", "gradeIndexUtils", "Lcom/xiaomi/fitness/electronic/scale/util/GradeIndexUtils;", "getGradeIndexUtils", "()Lcom/xiaomi/fitness/electronic/scale/util/GradeIndexUtils;", "gradeIndexUtils$delegate", "Lkotlin/Lazy;", "handler", "com/xiaomi/fitness/electronic/scale/widget/BodyConditionView$handler$1", "Lcom/xiaomi/fitness/electronic/scale/widget/BodyConditionView$handler$1;", "initView", "", "initData", "type", "weightResult", "Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;", "sex", "", "age", "height", "", "changeLayoutParams", "showBarLevel", "loadSlidingControlView", "strs", "", "ints", "index", "([Ljava/lang/String;[II)V", "onDetachedFromWindow", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BodyConditionView extends ConstraintLayout {
    public static final int MESSAGE_SHOW_BAR_LEVEL = 100;
    public static final int TYPE_BASAL_METABOLIC_RATE = 11;
    public static final int TYPE_BMI = 2;
    public static final int TYPE_BONE_SALT_COMPONENT = 8;
    public static final int TYPE_FAT_COMPONENT = 7;
    public static final int TYPE_FAT_RATIO = 3;
    public static final int TYPE_HEART_RATIO = 4;
    public static final int TYPE_MUSCLE_COMPONENT = 9;
    public static final int TYPE_PROTEIN_COMPONENT = 6;
    public static final int TYPE_VISCERAL_FAT_GRADE = 10;
    public static final int TYPE_WATER_COMPONENT = 5;
    public static final int TYPE_WEIGHT = 1;
    private int askCount;

    @NotNull
    private final int[] colorsFour;

    @NotNull
    private final int[] colorsThree;

    /* JADX INFO: renamed from: gradeIndexUtils$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy gradeIndexUtils;

    @NotNull
    private BodyConditionView$handler$1 handler;
    private BodyIndexSlidingView mBodyIndexSlidingView;
    private ImageView mIvResultBalance;
    private RelativeLayout mRlResultBalance;
    private TextView mTvName;
    private TextView mTvValue;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BodyConditionView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void changeLayoutParams() {
        RelativeLayout relativeLayout = this.mRlResultBalance;
        TextView textView = null;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRlResultBalance");
            relativeLayout = null;
        }
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams).weight = 2.0f;
        TextView textView2 = this.mTvName;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvName");
            textView2 = null;
        }
        ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams2).weight = 0.5f;
        TextView textView3 = this.mTvValue;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvValue");
        } else {
            textView = textView3;
        }
        ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams3).weight = 0.5f;
    }

    private final GradeIndexUtils getGradeIndexUtils() {
        return (GradeIndexUtils) this.gradeIndexUtils.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GradeIndexUtils gradeIndexUtils_delegate$lambda$0() {
        return new GradeIndexUtils();
    }

    private final void initView(Context context, AttributeSet attrs, int defStyleAttr) {
        View viewInflate = LayoutInflater.from(context).inflate(gui.U, this);
        this.mTvName = (TextView) viewInflate.findViewById(bri.b5);
        this.mTvValue = (TextView) viewInflate.findViewById(bri.P5);
        this.mRlResultBalance = (RelativeLayout) viewInflate.findViewById(bri.f3);
        this.mBodyIndexSlidingView = (BodyIndexSlidingView) viewInflate.findViewById(bri.q6);
        this.mIvResultBalance = (ImageView) viewInflate.findViewById(bri.d3);
    }

    private final void loadSlidingControlView(String[] strs, int[] ints, int index) {
        BodyIndexSlidingView bodyIndexSlidingView = this.mBodyIndexSlidingView;
        if (bodyIndexSlidingView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBodyIndexSlidingView");
            bodyIndexSlidingView = null;
        }
        bodyIndexSlidingView.f(strs, ints, index, true);
        showBarLevel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showBarLevel() {
        BodyIndexSlidingView bodyIndexSlidingView = this.mBodyIndexSlidingView;
        ImageView imageView = null;
        if (bodyIndexSlidingView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBodyIndexSlidingView");
            bodyIndexSlidingView = null;
        }
        if (!bodyIndexSlidingView.d()) {
            this.askCount++;
            sendEmptyMessageDelayed(100, 20L);
            return;
        }
        BodyIndexSlidingView bodyIndexSlidingView2 = this.mBodyIndexSlidingView;
        if (bodyIndexSlidingView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBodyIndexSlidingView");
            bodyIndexSlidingView2 = null;
        }
        float f = bodyIndexSlidingView2.getmoveWidth();
        ImageView imageView2 = this.mIvResultBalance;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvResultBalance");
            imageView2 = null;
        }
        float width = f - imageView2.getWidth();
        if (width <= 0.0f) {
            width = 0.0f;
        }
        ImageView imageView3 = this.mIvResultBalance;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvResultBalance");
            imageView3 = null;
        }
        imageView3.setTranslationX(0.0f);
        ImageView imageView4 = this.mIvResultBalance;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvResultBalance");
        } else {
            imageView = imageView4;
        }
        imageView.animate().translationX(width).setDuration(0L);
    }

    public final void initData(int type, @NotNull WeightResult weightResult, @Nullable String sex, int age, float height) {
        Intrinsics.checkNotNullParameter(weightResult, "weightResult");
        TextView textView = null;
        switch (type) {
            case 1:
                changeLayoutParams();
                TextView textView2 = this.mTvName;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvName");
                    textView2 = null;
                }
                textView2.setText(getResources().getString(zzi.o0));
                TextView textView3 = this.mTvValue;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvValue");
                    textView3 = null;
                }
                textView3.setGravity(3);
                TextView textView4 = this.mTvValue;
                if (textView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvValue");
                } else {
                    textView = textView4;
                }
                textView.setText(WeightInfoUtil.INSTANCE.getFormatFloat(weightResult.getWeight()) + "kg");
                String[] stringArray = getResources().getStringArray(mhi.f26187k);
                Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
                loadSlidingControlView(stringArray, this.colorsFour, getGradeIndexUtils().bmiGrade(weightResult.getBmi()));
                break;
            case 2:
                changeLayoutParams();
                TextView textView5 = this.mTvName;
                if (textView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvName");
                    textView5 = null;
                }
                textView5.setText(getResources().getString(zzi.n0));
                TextView textView6 = this.mTvValue;
                if (textView6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvValue");
                    textView6 = null;
                }
                textView6.setGravity(3);
                TextView textView7 = this.mTvValue;
                if (textView7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvValue");
                } else {
                    textView = textView7;
                }
                textView.setText(String.valueOf(WeightInfoUtil.INSTANCE.getFormatFloat(weightResult.getBmi())));
                String[] stringArray2 = getResources().getStringArray(mhi.f26185a);
                Intrinsics.checkNotNullExpressionValue(stringArray2, "getStringArray(...)");
                loadSlidingControlView(stringArray2, this.colorsFour, getGradeIndexUtils().bmiGrade(weightResult.getBmi()));
                break;
            case 3:
                changeLayoutParams();
                TextView textView8 = this.mTvName;
                if (textView8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvName");
                    textView8 = null;
                }
                textView8.setText(getResources().getString(zzi.c1));
                TextView textView9 = this.mTvValue;
                if (textView9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvValue");
                    textView9 = null;
                }
                textView9.setGravity(3);
                TextView textView10 = this.mTvValue;
                if (textView10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvValue");
                } else {
                    textView = textView10;
                }
                textView.setText(WeightInfoUtil.INSTANCE.getFormatFloat(weightResult.getBfp()) + "%");
                String[] stringArray3 = getResources().getStringArray(mhi.f);
                Intrinsics.checkNotNullExpressionValue(stringArray3, "getStringArray(...)");
                loadSlidingControlView(stringArray3, this.colorsFour, getGradeIndexUtils().fatRatioGrade(weightResult.getBfp(), age, sex));
                break;
            case 4:
                changeLayoutParams();
                TextView textView11 = this.mTvName;
                if (textView11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvName");
                    textView11 = null;
                }
                textView11.setText(getResources().getString(zzi.z3));
                TextView textView12 = this.mTvValue;
                if (textView12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvValue");
                    textView12 = null;
                }
                textView12.setGravity(3);
                String string = getResources().getString(zzi.h5);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                TextView textView13 = this.mTvValue;
                if (textView13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvValue");
                } else {
                    textView = textView13;
                }
                textView.setText(weightResult.getHeartRate() + string);
                String[] stringArray4 = getResources().getStringArray(mhi.g);
                Intrinsics.checkNotNullExpressionValue(stringArray4, "getStringArray(...)");
                loadSlidingControlView(stringArray4, this.colorsThree, getGradeIndexUtils().heartRateGrade(weightResult.getHeartRate()));
                break;
            case 5:
                TextView textView14 = this.mTvName;
                if (textView14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvName");
                    textView14 = null;
                }
                textView14.setText(getResources().getString(zzi.J5));
                TextView textView15 = this.mTvValue;
                if (textView15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvValue");
                } else {
                    textView = textView15;
                }
                textView.setText(WeightInfoUtil.INSTANCE.getFormatFloat(weightResult.getBwm()) + "kg");
                String[] stringArray5 = getResources().getStringArray(mhi.d);
                Intrinsics.checkNotNullExpressionValue(stringArray5, "getStringArray(...)");
                loadSlidingControlView(stringArray5, WeightExtKt.getCOMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_GOOD(), getGradeIndexUtils().waterComponentGrade(weightResult.getBwp(), sex));
                break;
            case 6:
                TextView textView16 = this.mTvName;
                if (textView16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvName");
                    textView16 = null;
                }
                textView16.setText(getResources().getString(zzi.G4));
                TextView textView17 = this.mTvValue;
                if (textView17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvValue");
                } else {
                    textView = textView17;
                }
                textView.setText(WeightInfoUtil.INSTANCE.getFormatFloat(weightResult.getPm()) + "kg");
                String[] stringArray6 = getResources().getStringArray(mhi.i);
                Intrinsics.checkNotNullExpressionValue(stringArray6, "getStringArray(...)");
                loadSlidingControlView(stringArray6, this.colorsThree, getGradeIndexUtils().proteinComponentGrade((weightResult.getPm() * ((float) 100)) / weightResult.getWeight()));
                break;
            case 7:
                TextView textView18 = this.mTvName;
                if (textView18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvName");
                    textView18 = null;
                }
                textView18.setText(getResources().getString(zzi.b1));
                TextView textView19 = this.mTvValue;
                if (textView19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvValue");
                } else {
                    textView = textView19;
                }
                textView.setText(WeightInfoUtil.INSTANCE.getFormatFloat(weightResult.getBfm()) + "kg");
                String[] stringArray7 = getResources().getStringArray(mhi.c);
                Intrinsics.checkNotNullExpressionValue(stringArray7, "getStringArray(...)");
                loadSlidingControlView(stringArray7, this.colorsFour, getGradeIndexUtils().fatRatioGrade(weightResult.getBfp(), age, sex));
                break;
            case 8:
                TextView textView20 = this.mTvName;
                if (textView20 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvName");
                    textView20 = null;
                }
                textView20.setText(getResources().getString(zzi.q0));
                TextView textView21 = this.mTvValue;
                if (textView21 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvValue");
                } else {
                    textView = textView21;
                }
                textView.setText(WeightInfoUtil.INSTANCE.getFormatFloat(weightResult.getBmc()) + "kg");
                String[] stringArray8 = getResources().getStringArray(mhi.e);
                Intrinsics.checkNotNullExpressionValue(stringArray8, "getStringArray(...)");
                loadSlidingControlView(stringArray8, WeightExtKt.getCOMMON_TWO_SEGMENT_COLOR(), getGradeIndexUtils().boneSaltComponentgrade(weightResult.getBmc(), sex, weightResult.getWeight()));
                break;
            case 9:
                TextView textView22 = this.mTvName;
                if (textView22 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvName");
                    textView22 = null;
                }
                textView22.setText(getResources().getString(zzi.a4));
                TextView textView23 = this.mTvValue;
                if (textView23 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvValue");
                } else {
                    textView = textView23;
                }
                textView.setText(WeightInfoUtil.INSTANCE.getFormatFloat(weightResult.getSlm()) + "kg");
                String[] stringArray9 = getResources().getStringArray(mhi.h);
                Intrinsics.checkNotNullExpressionValue(stringArray9, "getStringArray(...)");
                loadSlidingControlView(stringArray9, this.colorsThree, getGradeIndexUtils().muscleComponentGrade(weightResult.getSlm(), sex, height));
                break;
            case 10:
                TextView textView24 = this.mTvName;
                if (textView24 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvName");
                    textView24 = null;
                }
                textView24.setText(getResources().getString(zzi.H5));
                TextView textView25 = this.mTvValue;
                if (textView25 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvValue");
                } else {
                    textView = textView25;
                }
                textView.setText(String.valueOf((int) weightResult.getVfr()));
                String[] stringArray10 = getResources().getStringArray(mhi.j);
                Intrinsics.checkNotNullExpressionValue(stringArray10, "getStringArray(...)");
                loadSlidingControlView(stringArray10, WeightExtKt.getCOMMON_FOUR_SEGMENT_COLOR_NORMAL_TO_DANGEROUS(), getGradeIndexUtils().visceralFatGrade(weightResult.getVfr()));
                break;
            case 11:
                TextView textView26 = this.mTvName;
                if (textView26 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvName");
                    textView26 = null;
                }
                textView26.setText(getResources().getString(zzi.e0));
                RelativeLayout relativeLayout = this.mRlResultBalance;
                if (relativeLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRlResultBalance");
                    relativeLayout = null;
                }
                relativeLayout.setVisibility(4);
                TextView textView27 = this.mTvValue;
                if (textView27 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvValue");
                } else {
                    textView = textView27;
                }
                textView.setText(weightResult.getBmr() + "kcal");
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BodyConditionView$handler$1 bodyConditionView$handler$1 = this.handler;
        if (bodyConditionView$handler$1 != null) {
            bodyConditionView$handler$1.removeCallbacksAndMessages(null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BodyConditionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.xiaomi.fitness.electronic.scale.widget.BodyConditionView$handler$1] */
    public BodyConditionView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.colorsThree = WeightExtKt.getCOMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_HIGH();
        this.colorsFour = WeightExtKt.getCOMMON_FOUR_SEGMENT_COLOR_LOW_TO_WARNING();
        this.gradeIndexUtils = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: h43
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BodyConditionView.gradeIndexUtils_delegate$lambda$0();
            }
        });
        final Looper mainLooper = Looper.getMainLooper();
        this.handler = new Handler(mainLooper) { // from class: com.xiaomi.fitness.electronic.scale.widget.BodyConditionView$handler$1
            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                if (msg.what != 100 || this.this$0.askCount >= 4) {
                    return;
                }
                this.this$0.showBarLevel();
            }
        };
        initView(context, attributeSet, i);
    }
}
