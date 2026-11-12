package com.xiaomi.fitness.health.weight.ui.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil.Coil;
import coil.request.ImageRequest;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.fitness.persist.db.internal.WeightRecordDaoKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.health.weight.util.TextTypefaceSpan;
import com.xiaomi.fitness.health.weight.util.WeightEvaluationHelper;
import com.xiaomi.fitness.health.weight.util.WeightParamUtil;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import defpackage.eri;
import defpackage.iji;
import defpackage.jui;
import defpackage.lpi;
import defpackage.pni;
import defpackage.qxi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 -2\u00020\u0001:\u0001-B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0002\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0002\u0010\u001dJ'\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010$\u001a\u0004\u0018\u00010\"¢\u0006\u0002\u0010%J\u0015\u0010&\u001a\u00020\u00192\b\u0010'\u001a\u0004\u0018\u00010\"¢\u0006\u0002\u0010(J\u000e\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020+J\u000e\u0010,\u001a\u00020\u00192\u0006\u0010*\u001a\u00020+R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/health/weight/ui/view/BodyIndicatorEstimationCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bmiValueTv", "Landroid/widget/TextView;", "bmiIndicatorTv", "bodyFatRateValueTv", "bodyFatRateIndicatorTv", "bmiViewGroup", "Landroid/widget/RelativeLayout;", "bodyFatRateGroup", "bodyIndicatorEstimationValueTv", "descriptionTv", "somatoTypeImg", "Landroid/widget/ImageView;", "somatotypeNameTv", "somatoTypeFrame", "llDataContainer", "Landroid/widget/LinearLayout;", "updateBmiView", "", "bmi", "", "diff", "(Ljava/lang/Float;Ljava/lang/Float;)V", "updateBodyFateRateView", WeightRecordDaoKt.COL_BODY_FAT_RATE, "updateBmiScoreAndDescription", "bmiScore", "", "somatotype", "scoreStandardType", "(ILjava/lang/Integer;Ljava/lang/Integer;)V", "updateBodyShapeImageAndName", "bodyShapeType", "(Ljava/lang/Integer;)V", "setBmiClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "setBodyFatRateClickListener", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBodyIndicatorEstimationCardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BodyIndicatorEstimationCardView.kt\ncom/xiaomi/fitness/health/weight/ui/view/BodyIndicatorEstimationCardView\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,261:1\n54#2,3:262\n24#2:265\n57#2,6:266\n63#2,2:273\n57#3:272\n*S KotlinDebug\n*F\n+ 1 BodyIndicatorEstimationCardView.kt\ncom/xiaomi/fitness/health/weight/ui/view/BodyIndicatorEstimationCardView\n*L\n250#1:262,3\n250#1:265\n250#1:266,6\n250#1:273,2\n250#1:272\n*E\n"})
public final class BodyIndicatorEstimationCardView extends ConstraintLayout {

    @NotNull
    public static final String TAG = "BodyIndicatorEstimationCardView";

    @NotNull
    private TextView bmiIndicatorTv;

    @NotNull
    private TextView bmiValueTv;

    @NotNull
    private RelativeLayout bmiViewGroup;

    @NotNull
    private RelativeLayout bodyFatRateGroup;

    @NotNull
    private TextView bodyFatRateIndicatorTv;

    @NotNull
    private TextView bodyFatRateValueTv;

    @NotNull
    private TextView bodyIndicatorEstimationValueTv;

    @NotNull
    private TextView descriptionTv;

    @NotNull
    private LinearLayout llDataContainer;

    @NotNull
    private ImageView somatoTypeFrame;

    @NotNull
    private ImageView somatoTypeImg;

    @NotNull
    private TextView somatotypeNameTv;

    public /* synthetic */ BodyIndicatorEstimationCardView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public final void setBmiClickListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.bmiViewGroup.setOnClickListener(listener);
    }

    public final void setBodyFatRateClickListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.bodyFatRateGroup.setOnClickListener(listener);
    }

    public final void updateBmiScoreAndDescription(int bmiScore, @Nullable Integer somatotype, @Nullable Integer scoreStandardType) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String quantityString = ResourceExtKt.getQuantityString(context, qxi.j, bmiScore, Integer.valueOf(bmiScore));
        String strValueOf = String.valueOf(bmiScore);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) quantityString, strValueOf, 0, false, 6, (Object) null);
        int length = strValueOf.length() + iIndexOf$default;
        StringBuilder sb = new StringBuilder(quantityString);
        sb.insert(length, " ");
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(new RelativeSizeSpan(1.875f), iIndexOf$default, length, 17);
        this.bodyIndicatorEstimationValueTv.setText(spannableString);
        if (somatotype == null) {
            ExtUtilKt.gone(this.descriptionTv);
            return;
        }
        ExtUtilKt.visible(this.descriptionTv);
        int somatoTypeDescResId = WeightEvaluationHelper.INSTANCE.getSomatoTypeDescResId(somatotype.intValue(), scoreStandardType != null ? scoreStandardType.intValue() : 0);
        if (somatoTypeDescResId == 0) {
            ExtUtilKt.gone(this.descriptionTv);
        } else {
            this.descriptionTv.setText(somatoTypeDescResId);
        }
    }

    public final void updateBmiView(@Nullable Float bmi, @Nullable Float diff) {
        ForegroundColorSpan foregroundColorSpan;
        String str = "--";
        this.bmiValueTv.setText((bmi == null || bmi.floatValue() <= 0.0f) ? "--" : WeightEvaluationHelper.INSTANCE.formatFloatValue(1, bmi.floatValue()));
        String floatValue = diff != null ? WeightEvaluationHelper.INSTANCE.formatFloatValue(1, diff.floatValue()) : "--";
        if (diff != null && !Intrinsics.areEqual(diff, 0.0f)) {
            if (diff.floatValue() > 0.0f) {
                str = "↑" + floatValue;
            } else {
                str = "↓" + floatValue;
            }
        }
        String str2 = ExtUtilKt.getString(c0j.L2) + " " + str;
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str2, str, 0, false, 6, (Object) null);
        int length = str.length() + iIndexOf$default;
        SpannableString spannableString = new SpannableString(str2);
        if (diff != null) {
            if (diff.floatValue() > 0.0f) {
                foregroundColorSpan = new ForegroundColorSpan(ExtUtilsKt.getColor(iji.y2));
            } else {
                foregroundColorSpan = diff.floatValue() < 0.0f ? new ForegroundColorSpan(ExtUtilsKt.getColor(iji.w2)) : new ForegroundColorSpan(ExtUtilsKt.getColor(iji.w3));
            }
            spannableString.setSpan(foregroundColorSpan, iIndexOf$default, length, 17);
            Typeface typefaceAsResourceId = DisplayUtil.getTypefaceAsResourceId(ApplicationExtKt.getApplication(), lpi.c);
            Intrinsics.checkNotNull(typefaceAsResourceId);
            spannableString.setSpan(new TextTypefaceSpan(typefaceAsResourceId), iIndexOf$default, length, 17);
        }
        this.bmiIndicatorTv.setText(spannableString);
    }

    public final void updateBodyFateRateView(@Nullable Float bodyFatRate, @Nullable Float diff) {
        String string;
        int iIndexOf$default;
        int i;
        int i2;
        ForegroundColorSpan foregroundColorSpan;
        String str = "--";
        int iIndexOf$default2 = 0;
        if (bodyFatRate == null || bodyFatRate.floatValue() <= 0.0f) {
            string = "--";
            iIndexOf$default = 0;
            i = 0;
        } else {
            string = ApplicationExtKt.getApplication().getString(c0j.common_unit_percentage_str_float_space, WeightEvaluationHelper.INSTANCE.formatFloatValue(1, bodyFatRate.floatValue()));
            iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) string, "%", 0, false, 6, (Object) null);
            i = iIndexOf$default + 1;
        }
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new RelativeSizeSpan(0.533f), iIndexOf$default, i, 17);
        this.bodyFatRateValueTv.setText(spannableString);
        if (diff != null) {
            String string2 = ApplicationExtKt.getApplication().getString(c0j.common_unit_percentage_str_float, WeightEvaluationHelper.INSTANCE.formatFloatValue(1, diff.floatValue()));
            if (!Intrinsics.areEqual(diff, 0.0f)) {
                if (diff.floatValue() > 0.0f) {
                    str = "↑" + string2;
                } else {
                    str = "↓" + string2;
                }
            }
            String str2 = ExtUtilKt.getString(c0j.W2) + " " + str;
            iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str2, str, 0, false, 6, (Object) null);
            int length = str.length() + iIndexOf$default2;
            str = str2;
            i2 = length;
        } else {
            i2 = 0;
        }
        SpannableString spannableString2 = new SpannableString(str);
        if (diff != null) {
            if (diff.floatValue() > 0.0f) {
                foregroundColorSpan = new ForegroundColorSpan(ExtUtilsKt.getColor(iji.y2));
            } else {
                foregroundColorSpan = diff.floatValue() < 0.0f ? new ForegroundColorSpan(ExtUtilsKt.getColor(iji.w2)) : new ForegroundColorSpan(ExtUtilsKt.getColor(iji.w3));
            }
            spannableString2.setSpan(foregroundColorSpan, iIndexOf$default2, i2, 17);
            Typeface typefaceAsResourceId = DisplayUtil.getTypefaceAsResourceId(ApplicationExtKt.getApplication(), lpi.c);
            Intrinsics.checkNotNull(typefaceAsResourceId);
            spannableString2.setSpan(new TextTypefaceSpan(typefaceAsResourceId), iIndexOf$default2, i2, 17);
        }
        this.bodyFatRateIndicatorTv.setText(spannableString2);
    }

    public final void updateBodyShapeImageAndName(@Nullable Integer bodyShapeType) {
        int i;
        if (bodyShapeType == null || bodyShapeType.intValue() <= 0 || bodyShapeType.intValue() > 5) {
            Logger.d("BodyIndicatorEstimationCardView", "updateBodyShapeImageAndName bodyShapeType=" + bodyShapeType);
            ExtUtilKt.gone(this.somatoTypeImg);
            ExtUtilKt.gone(this.somatotypeNameTv);
            ExtUtilKt.gone(this.somatoTypeFrame);
            return;
        }
        ExtUtilKt.visible(this.somatoTypeImg);
        ExtUtilKt.visible(this.somatotypeNameTv);
        ExtUtilKt.visible(this.somatoTypeFrame);
        if (bodyShapeType.intValue() == 5) {
            i = pni.D1;
        } else if (bodyShapeType.intValue() == 2) {
            i = pni.E1;
        } else if (bodyShapeType.intValue() == 1) {
            i = pni.B1;
        } else if (bodyShapeType.intValue() == 3) {
            i = pni.C1;
        } else {
            i = bodyShapeType.intValue() == 4 ? pni.F1 : 0;
        }
        ImageView imageView = this.somatoTypeImg;
        Coil.imageLoader(imageView.getContext()).enqueue(new ImageRequest.Builder(imageView.getContext()).data(Integer.valueOf(i)).target(imageView).build());
        this.somatotypeNameTv.setText(WeightParamUtil.INSTANCE.getBodyShape(bodyShapeType));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BodyIndicatorEstimationCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(jui.N4, this);
        this.bmiValueTv = (TextView) findViewById(eri.Q0);
        this.bmiIndicatorTv = (TextView) findViewById(eri.P0);
        this.bodyFatRateValueTv = (TextView) findViewById(eri.T0);
        this.bodyFatRateIndicatorTv = (TextView) findViewById(eri.S0);
        this.bmiViewGroup = (RelativeLayout) findViewById(eri.O0);
        this.bodyFatRateGroup = (RelativeLayout) findViewById(eri.R0);
        this.bodyIndicatorEstimationValueTv = (TextView) findViewById(eri.V0);
        this.descriptionTv = (TextView) findViewById(eri.U0);
        this.somatoTypeImg = (ImageView) findViewById(eri.Kg);
        this.somatotypeNameTv = (TextView) findViewById(eri.Lg);
        this.somatoTypeFrame = (ImageView) findViewById(eri.Jg);
        this.llDataContainer = (LinearLayout) findViewById(eri.Ka);
        this.llDataContainer.setWeightSum(UIUtils.INSTANCE.isTabletAndLandscape(context) ? 3 : 2);
    }
}
