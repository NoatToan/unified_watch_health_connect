package com.xiaomi.fitness.electronic.scale.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.electronic.scale.util.WeightEvaluationHelper;
import defpackage.eoq;
import defpackage.lni;
import defpackage.znq;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tJ\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0017\u0010\u0019\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0002\u0010\u001bR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/view/WeightSegmentalView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "type", "Lcom/xiaomi/fitness/electronic/scale/view/SEGMENTAL;", "getType", "()Lcom/xiaomi/fitness/electronic/scale/view/SEGMENTAL;", "setType", "(Lcom/xiaomi/fitness/electronic/scale/view/SEGMENTAL;)V", "drawableId", "", "getDrawableId", "()I", "refreshView", "", "weightItem", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "segmental", "refreshSegmentalMuscleVector", "refreshSegmentalFatVector", "getSegmentalColorByLevel", "level", "(Ljava/lang/Integer;)I", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WeightSegmentalView extends AppCompatImageView {

    @NotNull
    private SEGMENTAL type;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public WeightSegmentalView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getDrawableId() {
        return this.type == SEGMENTAL.FAT ? lni.n : lni.p;
    }

    private final int getSegmentalColorByLevel(Integer level) {
        int i;
        if (level != null && level.intValue() == -1) {
            i = WeightEvaluationHelper.INSTANCE.getCOMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_HIGH()[0];
        } else {
            i = (level != null && level.intValue() == 1) ? WeightEvaluationHelper.INSTANCE.getCOMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_HIGH()[2] : WeightEvaluationHelper.INSTANCE.getCOMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_HIGH()[1];
        }
        return ExtUtilsKt.getColor(i);
    }

    private final void refreshSegmentalFatVector(WeightItem weightItem) {
        znq znqVar = new znq(getContext(), lni.n, this);
        int segmentalColorByLevel = getSegmentalColorByLevel(weightItem.getTrunkFatLevel());
        eoq.b bVarA = znqVar.a("trunkFatMassBg");
        Intrinsics.checkNotNullExpressionValue(bVarA, "findPathByName(...)");
        eoq.b bVarA2 = znqVar.a("trunkFatMassCircle");
        Intrinsics.checkNotNullExpressionValue(bVarA2, "findPathByName(...)");
        bVarA.g(segmentalColorByLevel);
        bVarA2.g(segmentalColorByLevel);
        int segmentalColorByLevel2 = getSegmentalColorByLevel(weightItem.getLeftUpperLimbFatLevel());
        eoq.b bVarA3 = znqVar.a("leftUpperLimbFatMassBg");
        Intrinsics.checkNotNullExpressionValue(bVarA3, "findPathByName(...)");
        eoq.b bVarA4 = znqVar.a("leftUpperLimbFatMassCircle");
        Intrinsics.checkNotNullExpressionValue(bVarA4, "findPathByName(...)");
        bVarA3.g(segmentalColorByLevel2);
        bVarA4.g(segmentalColorByLevel2);
        int segmentalColorByLevel3 = getSegmentalColorByLevel(weightItem.getLeftLowerLimbFatLevel());
        eoq.b bVarA5 = znqVar.a("leftLowerLimbFatMassBg");
        Intrinsics.checkNotNullExpressionValue(bVarA5, "findPathByName(...)");
        eoq.b bVarA6 = znqVar.a("leftLowerLimbFatMassCircle");
        Intrinsics.checkNotNullExpressionValue(bVarA6, "findPathByName(...)");
        bVarA5.g(segmentalColorByLevel3);
        bVarA6.g(segmentalColorByLevel3);
        int segmentalColorByLevel4 = getSegmentalColorByLevel(weightItem.getRightUpperLimbFatLevel());
        eoq.b bVarA7 = znqVar.a("rightUpperLimbFatMassBg");
        Intrinsics.checkNotNullExpressionValue(bVarA7, "findPathByName(...)");
        eoq.b bVarA8 = znqVar.a("rightUpperLimbFatMassCircle");
        Intrinsics.checkNotNullExpressionValue(bVarA8, "findPathByName(...)");
        bVarA7.g(segmentalColorByLevel4);
        bVarA8.g(segmentalColorByLevel4);
        int segmentalColorByLevel5 = getSegmentalColorByLevel(weightItem.getRightLowerLimbFatLevel());
        eoq.b bVarA9 = znqVar.a("rightLowerLimbFatMassBg");
        Intrinsics.checkNotNullExpressionValue(bVarA9, "findPathByName(...)");
        eoq.b bVarA10 = znqVar.a("rightLowerLimbFatMassCircle");
        Intrinsics.checkNotNullExpressionValue(bVarA10, "findPathByName(...)");
        bVarA9.g(segmentalColorByLevel5);
        bVarA10.g(segmentalColorByLevel5);
        invalidate();
    }

    private final void refreshSegmentalMuscleVector(WeightItem weightItem) {
        znq znqVar = new znq(getContext(), lni.p, this);
        int segmentalColorByLevel = getSegmentalColorByLevel(weightItem.getTrunkMuscleLevel());
        eoq.b bVarA = znqVar.a("leftTrunkMuscleMass");
        Intrinsics.checkNotNullExpressionValue(bVarA, "findPathByName(...)");
        eoq.b bVarA2 = znqVar.a("rightTrunkMuscleMass");
        Intrinsics.checkNotNullExpressionValue(bVarA2, "findPathByName(...)");
        bVarA.g(segmentalColorByLevel);
        bVarA2.g(segmentalColorByLevel);
        int segmentalColorByLevel2 = getSegmentalColorByLevel(weightItem.getLeftUpperLimbMuscleLevel());
        eoq.b bVarA3 = znqVar.a("leftUpperLimbMuscleMass");
        Intrinsics.checkNotNullExpressionValue(bVarA3, "findPathByName(...)");
        bVarA3.g(segmentalColorByLevel2);
        int segmentalColorByLevel3 = getSegmentalColorByLevel(weightItem.getLeftLowerLimbMuscleLevel());
        eoq.b bVarA4 = znqVar.a("leftLowerLimbMuscleMass");
        Intrinsics.checkNotNullExpressionValue(bVarA4, "findPathByName(...)");
        bVarA4.g(segmentalColorByLevel3);
        int segmentalColorByLevel4 = getSegmentalColorByLevel(weightItem.getRightUpperLimbMuscleLevel());
        eoq.b bVarA5 = znqVar.a("rightUpperLimbMuscleMass");
        Intrinsics.checkNotNullExpressionValue(bVarA5, "findPathByName(...)");
        bVarA5.g(segmentalColorByLevel4);
        int segmentalColorByLevel5 = getSegmentalColorByLevel(weightItem.getRightLowerLimbMuscleLevel());
        eoq.b bVarA6 = znqVar.a("rightLowerLimbMuscleMass");
        Intrinsics.checkNotNullExpressionValue(bVarA6, "findPathByName(...)");
        bVarA6.g(segmentalColorByLevel5);
        invalidate();
    }

    @NotNull
    public final SEGMENTAL getType() {
        return this.type;
    }

    public final void refreshView(@NotNull WeightItem weightItem, @NotNull SEGMENTAL segmental) {
        Intrinsics.checkNotNullParameter(weightItem, "weightItem");
        Intrinsics.checkNotNullParameter(segmental, "segmental");
        this.type = segmental;
        setImageResource(getDrawableId());
        if (this.type == SEGMENTAL.FAT) {
            refreshSegmentalFatVector(weightItem);
        } else {
            refreshSegmentalMuscleVector(weightItem);
        }
    }

    public final void setType(@NotNull SEGMENTAL segmental) {
        Intrinsics.checkNotNullParameter(segmental, "<set-?>");
        this.type = segmental;
    }

    public /* synthetic */ WeightSegmentalView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WeightSegmentalView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.type = SEGMENTAL.FAT;
    }
}
