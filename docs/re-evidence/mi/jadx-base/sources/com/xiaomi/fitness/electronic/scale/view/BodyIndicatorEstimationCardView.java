package com.xiaomi.fitness.electronic.scale.view;

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
import com.xiaomi.fitness.electronic.scale.util.TextTypefaceSpan;
import com.xiaomi.fitness.electronic.scale.util.WeightEvaluationHelper;
import com.xiaomi.fitness.electronic.scale.util.WeightParamUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.bri;
import defpackage.eji;
import defpackage.gui;
import defpackage.kpi;
import defpackage.lni;
import defpackage.oxi;
import defpackage.zzi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 .2\u00020\u0001:\u0001.B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0002\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0002\u0010\u001dJ\u001d\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0002\u0010$J\u0015\u0010%\u001a\u00020\u00192\b\u0010&\u001a\u0004\u0018\u00010\"¢\u0006\u0002\u0010'J\u000e\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020\u00192\u0006\u0010)\u001a\u00020*J\u0006\u0010,\u001a\u00020\u0017J\u0006\u0010-\u001a\u00020\"R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/view/BodyIndicatorEstimationCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bmiValueTv", "Landroid/widget/TextView;", "bmiIndicatorTv", "bodyFatRateValueTv", "bodyFatRateIndicatorTv", "bmiViewGroup", "Landroid/widget/RelativeLayout;", "bodyFatRateGroup", "bodyIndicatorEstimationValueTv", "descriptionTv", "somatoTypeImg", "Landroid/widget/ImageView;", "somatotypeNameTv", "somatoTypeFrame", "container", "Landroid/widget/LinearLayout;", "updateBmiView", "", "bmi", "", "diff", "(Ljava/lang/Float;Ljava/lang/Float;)V", "updateBodyFateRateView", WeightRecordDaoKt.COL_BODY_FAT_RATE, "updateBmiScoreAndDescription", "bmiScore", "", "somatotype", "(ILjava/lang/Integer;)V", "updateBodyShapeImageAndName", "bodyShapeType", "(Ljava/lang/Integer;)V", "setBmiClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "setBodyFatRateClickListener", "getBodyContainer", "getBodyContainerHeight", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBodyIndicatorEstimationCardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BodyIndicatorEstimationCardView.kt\ncom/xiaomi/fitness/electronic/scale/view/BodyIndicatorEstimationCardView\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,275:1\n54#2,3:276\n24#2:279\n57#2,6:280\n63#2,2:287\n57#3:286\n*S KotlinDebug\n*F\n+ 1 BodyIndicatorEstimationCardView.kt\ncom/xiaomi/fitness/electronic/scale/view/BodyIndicatorEstimationCardView\n*L\n256#1:276,3\n256#1:279\n256#1:280,6\n256#1:287,2\n256#1:286\n*E\n"})
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
    private LinearLayout container;

    @NotNull
    private TextView descriptionTv;

    @NotNull
    private ImageView somatoTypeFrame;

    @NotNull
    private ImageView somatoTypeImg;

    @NotNull
    private TextView somatotypeNameTv;

    public /* synthetic */ BodyIndicatorEstimationCardView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    @NotNull
    /* JADX INFO: renamed from: getBodyContainer, reason: from getter */
    public final LinearLayout getContainer() {
        return this.container;
    }

    public final int getBodyContainerHeight() {
        return this.container.getMeasuredHeight();
    }

    public final void setBmiClickListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.bmiViewGroup.setOnClickListener(listener);
    }

    public final void setBodyFatRateClickListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.bodyFatRateGroup.setOnClickListener(listener);
    }

    public final void updateBmiScoreAndDescription(int bmiScore, @Nullable Integer somatotype) {
        int i;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String quantityString = ResourceExtKt.getQuantityString(context, oxi.f29788a, bmiScore, Integer.valueOf(bmiScore));
        String strValueOf = String.valueOf(bmiScore);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) quantityString, strValueOf, 0, false, 6, (Object) null);
        int length = strValueOf.length() + iIndexOf$default;
        StringBuilder sb = new StringBuilder(quantityString);
        sb.insert(length, " ");
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(new RelativeSizeSpan(1.875f), iIndexOf$default, length, 17);
        this.bodyIndicatorEstimationValueTv.setText(spannableString);
        if (somatotype == null) {
            ViewExtKt.gone(this.descriptionTv);
            return;
        }
        ViewExtKt.visible(this.descriptionTv);
        if (somatotype.intValue() == -2) {
            i = zzi.i2;
        } else if (somatotype.intValue() == 2) {
            i = zzi.m2;
        } else if (somatotype.intValue() == 0) {
            i = zzi.h2;
        } else if (somatotype.intValue() == 3) {
            i = zzi.g2;
        } else if (somatotype.intValue() == 1) {
            i = zzi.k2;
        } else if (somatotype.intValue() == -3) {
            i = zzi.j2;
        } else if (somatotype.intValue() == 4) {
            i = zzi.l2;
        } else if (somatotype.intValue() == -4) {
            i = zzi.n2;
        } else if (somatotype.intValue() == -1) {
            i = zzi.o2;
        } else {
            i = somatotype.intValue() == -5 ? zzi.p2 : 0;
        }
        this.descriptionTv.setText(i);
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
        String str2 = ResourceExtKt.getString(zzi.s1) + " " + str;
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str2, str, 0, false, 6, (Object) null);
        int length = str.length() + iIndexOf$default;
        SpannableString spannableString = new SpannableString(str2);
        if (diff != null) {
            if (diff.floatValue() > 0.0f) {
                foregroundColorSpan = new ForegroundColorSpan(ExtUtilsKt.getColor(eji.f16709b));
            } else {
                foregroundColorSpan = diff.floatValue() < 0.0f ? new ForegroundColorSpan(ExtUtilsKt.getColor(eji.f16708a)) : new ForegroundColorSpan(ExtUtilsKt.getColor(eji.w));
            }
            spannableString.setSpan(foregroundColorSpan, iIndexOf$default, length, 17);
            Typeface typefaceAsResourceId = DisplayUtil.getTypefaceAsResourceId(ApplicationExtKt.getApplication(), kpi.f24141a);
            Intrinsics.checkNotNull(typefaceAsResourceId);
            spannableString.setSpan(new TextTypefaceSpan(typefaceAsResourceId), iIndexOf$default, length, 17);
        }
        Logger.i("BodyIndicatorEstimationCardView", "wholeStr is " + str2);
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
            string = ApplicationExtKt.getApplication().getString(zzi.common_unit_percentage_str_float_space, WeightEvaluationHelper.INSTANCE.formatFloatValue(1, bodyFatRate.floatValue()));
            iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) string, "%", 0, false, 6, (Object) null);
            i = iIndexOf$default + 1;
        }
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new RelativeSizeSpan(0.533f), iIndexOf$default, i, 17);
        this.bodyFatRateValueTv.setText(spannableString);
        if (diff != null) {
            String string2 = ApplicationExtKt.getApplication().getString(zzi.common_unit_percentage_str_float, WeightEvaluationHelper.INSTANCE.formatFloatValue(1, diff.floatValue()));
            if (!Intrinsics.areEqual(diff, 0.0f)) {
                if (diff.floatValue() > 0.0f) {
                    str = "↑" + string2;
                } else {
                    str = "↓" + string2;
                }
            }
            String str2 = ResourceExtKt.getString(zzi.B1) + " " + str;
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
                foregroundColorSpan = new ForegroundColorSpan(ExtUtilsKt.getColor(eji.f16709b));
            } else {
                foregroundColorSpan = diff.floatValue() < 0.0f ? new ForegroundColorSpan(ExtUtilsKt.getColor(eji.f16708a)) : new ForegroundColorSpan(ExtUtilsKt.getColor(eji.w));
            }
            spannableString2.setSpan(foregroundColorSpan, iIndexOf$default2, i2, 17);
            Typeface typefaceAsResourceId = DisplayUtil.getTypefaceAsResourceId(ApplicationExtKt.getApplication(), kpi.f24141a);
            Intrinsics.checkNotNull(typefaceAsResourceId);
            spannableString2.setSpan(new TextTypefaceSpan(typefaceAsResourceId), iIndexOf$default2, i2, 17);
        }
        this.bodyFatRateIndicatorTv.setText(spannableString2);
    }

    public final void updateBodyShapeImageAndName(@Nullable Integer bodyShapeType) {
        int i;
        if (bodyShapeType == null || bodyShapeType.intValue() < 0 || bodyShapeType.intValue() > 5) {
            Logger.d("BodyIndicatorEstimationCardView", "updateBodyShapeImageAndName bodyShapeType=" + bodyShapeType);
            ViewExtKt.gone(this.somatoTypeImg);
            ViewExtKt.gone(this.somatotypeNameTv);
            ViewExtKt.gone(this.somatoTypeFrame);
            return;
        }
        ViewExtKt.visible(this.somatoTypeImg);
        ViewExtKt.visible(this.somatotypeNameTv);
        ViewExtKt.visible(this.somatoTypeFrame);
        if (bodyShapeType.intValue() == 5) {
            i = lni.d;
        } else if (bodyShapeType.intValue() == 2) {
            i = lni.e;
        } else if (bodyShapeType.intValue() == 1) {
            i = lni.f25245b;
        } else if (bodyShapeType.intValue() == 3) {
            i = lni.c;
        } else {
            i = bodyShapeType.intValue() == 4 ? lni.f : 0;
        }
        ImageView imageView = this.somatoTypeImg;
        Coil.imageLoader(imageView.getContext()).enqueue(new ImageRequest.Builder(imageView.getContext()).data(Integer.valueOf(i)).target(imageView).build());
        this.somatotypeNameTv.setText(WeightParamUtil.INSTANCE.getBodyShape(bodyShapeType));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BodyIndicatorEstimationCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(gui.J, this);
        this.bmiValueTv = (TextView) findViewById(bri.i);
        this.bmiIndicatorTv = (TextView) findViewById(bri.h);
        this.bodyFatRateValueTv = (TextView) findViewById(bri.m);
        this.bodyFatRateIndicatorTv = (TextView) findViewById(bri.l);
        this.bmiViewGroup = (RelativeLayout) findViewById(bri.g);
        this.bodyFatRateGroup = (RelativeLayout) findViewById(bri.f4514k);
        this.bodyIndicatorEstimationValueTv = (TextView) findViewById(bri.p);
        this.descriptionTv = (TextView) findViewById(bri.o);
        this.somatoTypeImg = (ImageView) findViewById(bri.N3);
        this.somatotypeNameTv = (TextView) findViewById(bri.O3);
        this.somatoTypeFrame = (ImageView) findViewById(bri.M3);
        this.container = (LinearLayout) findViewById(bri.j);
    }
}
