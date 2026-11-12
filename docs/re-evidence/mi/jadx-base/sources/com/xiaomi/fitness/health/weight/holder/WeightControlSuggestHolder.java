package com.xiaomi.fitness.health.weight.holder;

import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fitness.electronic.scale.model.VirtualMemberStatisticsViewModel;
import com.xiaomi.fitness.health.weight.ui.view.TripletItemWithIconCardView;
import com.xiaomi.fitness.health.weight.util.WeightEvaluationHelper;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import defpackage.szb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/health/weight/holder/WeightControlSuggestHolder;", "", "", "weight", "muscle", VirtualMemberStatisticsViewModel.KEY_FAT, "", "fillTripletItems", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "Landroid/text/SpannableString;", "getMaintainDescStr", "()Landroid/text/SpannableString;", "value", "generateAdviceSpannableStr", "(F)Landroid/text/SpannableString;", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "weightItem", "bindData", "(Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;)V", "Landroidx/fragment/app/Fragment;", "parent", "Landroidx/fragment/app/Fragment;", "getParent", "()Landroidx/fragment/app/Fragment;", "Lszb;", "binding", "Lszb;", "getBinding", "()Lszb;", "<init>", "(Landroidx/fragment/app/Fragment;Lszb;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WeightControlSuggestHolder {

    @NotNull
    public static final String TAG = "WeightControlSuggestHolder";

    @NotNull
    private final szb binding;

    @NotNull
    private final Fragment parent;

    public WeightControlSuggestHolder(@NotNull Fragment parent, @NotNull szb binding) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.parent = parent;
        this.binding = binding;
    }

    private final void fillTripletItems(Float weight, Float muscle, Float fat) {
        CharSequence maintainDescStr;
        CharSequence maintainDescStr2;
        TextView weightTv = this.binding.A.getWeightTv();
        CharSequence maintainDescStr3 = "--";
        if (weight == null) {
            maintainDescStr = "--";
        } else {
            maintainDescStr = Intrinsics.areEqual(weight, 0.0f) ? getMaintainDescStr() : generateAdviceSpannableStr(weight.floatValue());
        }
        weightTv.setText(maintainDescStr);
        TextView muscleTv = this.binding.A.getMuscleTv();
        if (muscle == null) {
            maintainDescStr2 = "--";
        } else {
            maintainDescStr2 = muscle.floatValue() <= 0.0f ? getMaintainDescStr() : generateAdviceSpannableStr(muscle.floatValue());
        }
        muscleTv.setText(maintainDescStr2);
        TextView fatTv = this.binding.A.getFatTv();
        if (fat != null) {
            maintainDescStr3 = fat.floatValue() >= 0.0f ? getMaintainDescStr() : generateAdviceSpannableStr(fat.floatValue());
        }
        fatTv.setText(maintainDescStr3);
    }

    private final SpannableString generateAdviceSpannableStr(float value) {
        String floatValue;
        if (value >= 0.0f) {
            floatValue = Marker.ANY_NON_NULL_MARKER + WeightEvaluationHelper.INSTANCE.formatFloatValue(2, value);
        } else {
            floatValue = WeightEvaluationHelper.INSTANCE.formatFloatValue(2, value);
        }
        String str = floatValue + " " + ExtUtilKt.getString(c0j.zp);
        int length = floatValue.length();
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new RelativeSizeSpan(2.0f), 0, length, 17);
        return spannableString;
    }

    private final SpannableString getMaintainDescStr() {
        String string = ExtUtilKt.getString(c0j.jp);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new RelativeSizeSpan(2.0f), 0, string.length(), 17);
        return spannableString;
    }

    public final void bindData(@Nullable WeightItem weightItem) {
        if ((weightItem != null ? weightItem.getBodyFatRate() : null) == null || Intrinsics.areEqual(weightItem.getBodyFatRate(), 0.0f) || (weightItem.getWeightControl() == null && weightItem.getMuscleControl() == null && weightItem.getFatControl() == null)) {
            TripletItemWithIconCardView weightControlAdvice = this.binding.A;
            Intrinsics.checkNotNullExpressionValue(weightControlAdvice, "weightControlAdvice");
            ExtUtilKt.gone(weightControlAdvice);
        } else {
            TripletItemWithIconCardView weightControlAdvice2 = this.binding.A;
            Intrinsics.checkNotNullExpressionValue(weightControlAdvice2, "weightControlAdvice");
            ExtUtilKt.visible(weightControlAdvice2);
            fillTripletItems(weightItem.getWeightControl(), weightItem.getMuscleControl(), weightItem.getFatControl());
        }
    }

    @NotNull
    public final szb getBinding() {
        return this.binding;
    }

    @NotNull
    public final Fragment getParent() {
        return this.parent;
    }
}
