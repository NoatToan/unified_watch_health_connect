package com.xiaomi.fitness.health.runningindicator.holder;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.xiaomi.fit.fitness.export.data.item.RunningIndicatorItem;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.runningindicator.RunningIndicatorUtil;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.sde;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/health/runningindicator/holder/TrainingSuggestionViewHolder;", "", "Lcom/xiaomi/fit/fitness/export/data/item/RunningIndicatorItem;", "runningIndicatorItem", "", "bindData", "(Lcom/xiaomi/fit/fitness/export/data/item/RunningIndicatorItem;)V", "Landroidx/fragment/app/Fragment;", "parent", "Landroidx/fragment/app/Fragment;", "getParent", "()Landroidx/fragment/app/Fragment;", "Lsde;", "binding", "Lsde;", "getBinding", "()Lsde;", "<init>", "(Landroidx/fragment/app/Fragment;Lsde;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TrainingSuggestionViewHolder {

    @NotNull
    public static final String TAG = "TrainingSuggestionViewHolder";

    @NotNull
    private final sde binding;

    @NotNull
    private final Fragment parent;

    public TrainingSuggestionViewHolder(@NotNull Fragment parent, @NotNull sde binding) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.parent = parent;
        this.binding = binding;
    }

    public final void bindData(@Nullable RunningIndicatorItem runningIndicatorItem) {
        Integer runningIndicatorLevel;
        float runningIndicator = runningIndicatorItem != null ? runningIndicatorItem.getRunningIndicator() : 0.0f;
        int iIntValue = (runningIndicatorItem == null || (runningIndicatorLevel = runningIndicatorItem.getRunningIndicatorLevel()) == null) ? 0 : runningIndicatorLevel.intValue();
        Logger.d(TAG, "runningIndicator=" + runningIndicator + " runningIndicatorLevel=" + iIntValue);
        if (runningIndicator <= 0.0f || iIntValue == 0) {
            View root = this.binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            ExtUtilKt.gone(root);
            return;
        }
        View root2 = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        ExtUtilKt.visible(root2);
        TextView textView = this.binding.A;
        RunningIndicatorUtil runningIndicatorUtil = RunningIndicatorUtil.INSTANCE;
        textView.setText(runningIndicatorUtil.getRunningAbilityPredicationStr(Integer.valueOf(iIntValue)));
        this.binding.C.setText(runningIndicatorUtil.getRunningFreqAdvice(Integer.valueOf(iIntValue)));
        this.binding.I.setText(runningIndicatorUtil.getRunningAbilityEvaluationStr(iIntValue));
    }

    @NotNull
    public final sde getBinding() {
        return this.binding;
    }

    @NotNull
    public final Fragment getParent() {
        return this.parent;
    }
}
