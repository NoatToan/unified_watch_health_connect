package com.xiaomi.fitness.health.sleep.ui.adapter;

import android.graphics.Typeface;
import android.text.SpannableString;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.entity.SleepAnalyzeItem;
import com.xiaomi.fitness.health.sleep.ui.SleepAnalyzeLevelView;
import com.xiaomi.fitness.health.sleep.ui.SleepLevel;
import defpackage.j1c;
import defpackage.lpi;
import defpackage.ne5;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepAnalyzeItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "childStr", "endStr", "", "updateSpannableText", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/xiaomi/fitness/health/sleep/entity/SleepAnalyzeItem;", "item", "", "positionLast", "updateDataItem", "(Lcom/xiaomi/fitness/health/sleep/entity/SleepAnalyzeItem;Z)V", "Lj1c;", "binding", "Lj1c;", "getBinding", "()Lj1c;", "Lcom/xiaomi/fitness/health/sleep/ui/SleepAnalyzeLevelView;", "levelBarView", "Lcom/xiaomi/fitness/health/sleep/ui/SleepAnalyzeLevelView;", "<init>", "(Lj1c;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepAnalyzeItemViewHolder extends RecyclerView.d0 {

    @NotNull
    private final j1c binding;

    @NotNull
    private final SleepAnalyzeLevelView levelBarView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepAnalyzeItemViewHolder(@NotNull j1c binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        SleepAnalyzeLevelView levelBarView = binding.B;
        Intrinsics.checkNotNullExpressionValue(levelBarView, "levelBarView");
        this.levelBarView = levelBarView;
    }

    private final void updateSpannableText(String childStr, String endStr) {
        if (childStr == null || StringsKt__StringsKt.isBlank(childStr)) {
            this.binding.D.setText(endStr);
            return;
        }
        if (endStr == null || StringsKt__StringsKt.isBlank(endStr)) {
            this.binding.D.setText("");
            return;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s %s", Arrays.copyOf(new Object[]{StringsKt__StringsKt.trim((CharSequence) childStr).toString(), StringsKt__StringsKt.trim((CharSequence) endStr).toString()}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        SpannableString spannableString = new SpannableString(str);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, childStr, 0, false, 6, (Object) null);
        int length = childStr.length() + iIndexOf$default;
        Typeface font = this.itemView.getContext().getResources().getFont(lpi.e);
        if (font != null) {
            spannableString.setSpan(new ne5(font), iIndexOf$default, length, 17);
        }
        this.binding.D.setText(spannableString);
    }

    @NotNull
    public final j1c getBinding() {
        return this.binding;
    }

    public final void updateDataItem(@NotNull SleepAnalyzeItem item, boolean positionLast) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.binding.E.setText(item.getTitleStr());
        updateSpannableText(item.getEvaluationCoreStr(), item.getAnalyzeDetailStr());
        View splitLineView = this.binding.C;
        Intrinsics.checkNotNullExpressionValue(splitLineView, "splitLineView");
        ViewExtKt.setVisible(splitLineView, !positionLast);
        List<SleepLevel> levelItems = item.getLevelItems();
        if (levelItems == null || levelItems.isEmpty()) {
            ViewExtKt.setVisible(this.levelBarView, false);
            return;
        }
        ViewExtKt.setVisible(this.levelBarView, true);
        this.levelBarView.setLevels(item.getLevelItems());
        this.levelBarView.setLevelWithChildPercent(item.getSelectPosition(), item.getSelectPercent());
    }
}
