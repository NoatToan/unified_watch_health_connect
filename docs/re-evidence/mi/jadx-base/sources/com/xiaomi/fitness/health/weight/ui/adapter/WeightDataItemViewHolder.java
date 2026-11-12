package com.xiaomi.fitness.health.weight.ui.adapter;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.weight.bean.WeightDataItem;
import defpackage.mxb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/health/weight/ui/adapter/WeightDataItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/health/weight/bean/WeightDataItem;", "weightDataItem", "", "bindData", "(Lcom/xiaomi/fitness/health/weight/bean/WeightDataItem;)V", "Lmxb;", "bind", "Lmxb;", "getBind", "()Lmxb;", "<init>", "(Lmxb;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WeightDataItemViewHolder extends RecyclerView.d0 {

    @NotNull
    private final mxb bind;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeightDataItemViewHolder(@NotNull mxb bind) {
        super(bind.getRoot());
        Intrinsics.checkNotNullParameter(bind, "bind");
        this.bind = bind;
    }

    public final void bindData(@NotNull WeightDataItem weightDataItem) {
        String evaluateShortDesc;
        Intrinsics.checkNotNullParameter(weightDataItem, "weightDataItem");
        this.bind.F.setText(weightDataItem.getValueStr());
        this.bind.E.setText(weightDataItem.getUnitStr());
        this.bind.D.setText(weightDataItem.getLabelStr());
        TextView tvAbnormal = this.bind.C;
        Intrinsics.checkNotNullExpressionValue(tvAbnormal, "tvAbnormal");
        ViewExtKt.setVisible(tvAbnormal, (!weightDataItem.getItemAbnormal() || (evaluateShortDesc = weightDataItem.getEvaluateShortDesc()) == null || StringsKt__StringsKt.isBlank(evaluateShortDesc)) ? false : true);
        this.bind.C.setText(weightDataItem.getEvaluateShortDesc());
        ImageView ivJump = this.bind.B;
        Intrinsics.checkNotNullExpressionValue(ivJump, "ivJump");
        ViewExtKt.setVisible(ivJump, weightDataItem.getJumpEnable());
    }

    @NotNull
    public final mxb getBind() {
        return this.bind;
    }
}
