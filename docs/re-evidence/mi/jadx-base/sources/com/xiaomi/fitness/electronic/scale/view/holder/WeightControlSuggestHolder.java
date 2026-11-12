package com.xiaomi.fitness.electronic.scale.view.holder;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.ViewGroup;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.electronic.scale.model.VirtualMemberStatisticsViewModel;
import com.xiaomi.fitness.electronic.scale.view.TripletItemWithIconCardView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.bri;
import defpackage.zzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ+\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/view/holder/WeightControlSuggestHolder;", "", "context", "Landroid/content/Context;", "rootView", "Landroid/view/ViewGroup;", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "getContext", "()Landroid/content/Context;", "weightControlAdvice", "Lcom/xiaomi/fitness/electronic/scale/view/TripletItemWithIconCardView;", "bindData", "", "weightItem", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "fillTripletItems", "weight", "", "muscle", VirtualMemberStatisticsViewModel.KEY_FAT, "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "generateAdviceSpannableStr", "Landroid/text/SpannableString;", "value", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WeightControlSuggestHolder {

    @NotNull
    public static final String TAG = "WeightControlSuggestHolder";

    @NotNull
    private final Context context;

    @NotNull
    private TripletItemWithIconCardView weightControlAdvice;

    public WeightControlSuggestHolder(@NotNull Context context, @NotNull ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        this.context = context;
        this.weightControlAdvice = (TripletItemWithIconCardView) rootView.findViewById(bri.b7);
    }

    private final void fillTripletItems(Float weight, Float muscle, Float fat) {
        this.weightControlAdvice.getWeightTv().setText(weight == null ? "--" : generateAdviceSpannableStr(weight.floatValue()));
        this.weightControlAdvice.getMuscleTv().setText(muscle == null ? "--" : generateAdviceSpannableStr(muscle.floatValue()));
        this.weightControlAdvice.getFatTv().setText(fat != null ? generateAdviceSpannableStr(fat.floatValue()) : "--");
    }

    private final SpannableString generateAdviceSpannableStr(float value) {
        String strValueOf;
        if (value >= 0.0f) {
            strValueOf = Marker.ANY_NON_NULL_MARKER + value;
        } else {
            strValueOf = String.valueOf(value);
        }
        String str = strValueOf + " " + ResourceExtKt.getString(zzi.q5);
        int length = strValueOf.length();
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new RelativeSizeSpan(2.0f), 0, length, 17);
        return spannableString;
    }

    public final void bindData(@Nullable WeightItem weightItem) {
        if ((weightItem != null ? weightItem.getBodyFatRate() : null) == null || Intrinsics.areEqual(weightItem.getBodyFatRate(), 0.0f) || (weightItem.getWeightControl() == null && weightItem.getMuscleControl() == null && weightItem.getFatControl() == null)) {
            ViewExtKt.gone(this.weightControlAdvice);
        } else {
            ViewExtKt.visible(this.weightControlAdvice);
            fillTripletItems(weightItem.getWeightControl(), weightItem.getMuscleControl(), weightItem.getFatControl());
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }
}
