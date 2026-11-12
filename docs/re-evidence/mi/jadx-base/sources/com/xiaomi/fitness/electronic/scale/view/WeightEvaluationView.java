package com.xiaomi.fitness.electronic.scale.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.electronic.scale.data.WeightDataItem;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.ffe;
import defpackage.r48;
import defpackage.zzi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010!\u001a\u00020 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/view/WeightEvaluationView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "refreshView", "()V", "Lcom/xiaomi/fitness/electronic/scale/data/WeightDataItem;", "data", "updateData", "(Lcom/xiaomi/fitness/electronic/scale/data/WeightDataItem;)V", "", "visible", "showTopDivider", "(Z)V", "Lr48;", "binding", "Lr48;", "Landroid/widget/TextView;", "tvValue", "Landroid/widget/TextView;", "tvIndexLabel", "tvUnit", "tvGradeValue", "tvGradeLabel", "tvDescription", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView;", "levelBarView", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView;", "Landroidx/recyclerview/widget/RecyclerView;", "levelDescRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "weightDataItem", "Lcom/xiaomi/fitness/electronic/scale/data/WeightDataItem;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WeightEvaluationView extends ConstraintLayout {

    @NotNull
    private final r48 binding;

    @NotNull
    private final LevelBarView levelBarView;

    @NotNull
    private final RecyclerView levelDescRecyclerView;

    @NotNull
    private final TextView tvDescription;

    @NotNull
    private final TextView tvGradeLabel;

    @NotNull
    private final TextView tvGradeValue;

    @NotNull
    private final TextView tvIndexLabel;

    @NotNull
    private final TextView tvUnit;

    @NotNull
    private final TextView tvValue;

    @Nullable
    private WeightDataItem weightDataItem;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public WeightEvaluationView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void refreshView() {
        WeightDataItem weightDataItem = this.weightDataItem;
        if (weightDataItem == null) {
            return;
        }
        Intrinsics.checkNotNull(weightDataItem);
        this.tvValue.setText(weightDataItem.getValueStr());
        this.tvUnit.setText(weightDataItem.getUnitStr());
        this.tvIndexLabel.setText(weightDataItem.getLabelStr());
        this.tvGradeLabel.setText(ResourceExtKt.getString(zzi.F2));
        List<LevelBarView.LevelItem> levelItems = weightDataItem.getLevelItems();
        if (levelItems == null) {
            levelItems = new ArrayList<>();
        }
        if (!levelItems.isEmpty()) {
            this.levelBarView.setLevels(levelItems);
            int currentLevelPosition = weightDataItem.getCurrentLevelPosition();
            if (currentLevelPosition >= 0 && currentLevelPosition < levelItems.size()) {
                ViewExtKt.setVisible(this.levelBarView, true);
                LevelBarView.LevelItem levelItem = levelItems.get(currentLevelPosition);
                this.levelBarView.setLevel(currentLevelPosition);
                this.tvGradeValue.setText(ResourceExtKt.getString(levelItem.c));
            }
        } else {
            ViewExtKt.setVisible(this.levelBarView, false);
            this.tvGradeValue.setText("--");
        }
        this.tvDescription.setText(weightDataItem.getEvaluateDetailDesc());
        TextView textView = this.tvDescription;
        String evaluateDetailDesc = weightDataItem.getEvaluateDetailDesc();
        ViewExtKt.setVisible(textView, (evaluateDetailDesc == null || StringsKt__StringsKt.isBlank(evaluateDetailDesc)) ? false : true);
        ffe ffeVar = new ffe(getContext(), levelItems, 3);
        this.levelDescRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        this.levelDescRecyclerView.setHasFixedSize(true);
        this.levelDescRecyclerView.setNestedScrollingEnabled(false);
        this.levelDescRecyclerView.setAdapter(ffeVar);
        ffeVar.notifyDataSetChanged();
    }

    public final void showTopDivider(boolean visible) {
        View viewDividerTop = this.binding.J;
        Intrinsics.checkNotNullExpressionValue(viewDividerTop, "viewDividerTop");
        ViewExtKt.setVisible(viewDividerTop, visible);
    }

    public final void updateData(@NotNull WeightDataItem data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.weightDataItem = data;
        refreshView();
    }

    public /* synthetic */ WeightEvaluationView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WeightEvaluationView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        r48 r48VarA0 = r48.A0(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(r48VarA0, "inflate(...)");
        this.binding = r48VarA0;
        TextView tvValue = r48VarA0.H;
        Intrinsics.checkNotNullExpressionValue(tvValue, "tvValue");
        this.tvValue = tvValue;
        TextView tvIndexLabel = r48VarA0.F;
        Intrinsics.checkNotNullExpressionValue(tvIndexLabel, "tvIndexLabel");
        this.tvIndexLabel = tvIndexLabel;
        TextView tvUnit = r48VarA0.G;
        Intrinsics.checkNotNullExpressionValue(tvUnit, "tvUnit");
        this.tvUnit = tvUnit;
        TextView tvGradeValue = r48VarA0.E;
        Intrinsics.checkNotNullExpressionValue(tvGradeValue, "tvGradeValue");
        this.tvGradeValue = tvGradeValue;
        TextView tvGradeLabel = r48VarA0.D;
        Intrinsics.checkNotNullExpressionValue(tvGradeLabel, "tvGradeLabel");
        this.tvGradeLabel = tvGradeLabel;
        TextView tvDescription = r48VarA0.C;
        Intrinsics.checkNotNullExpressionValue(tvDescription, "tvDescription");
        this.tvDescription = tvDescription;
        LevelBarView levelBarView = r48VarA0.A;
        Intrinsics.checkNotNullExpressionValue(levelBarView, "levelBarView");
        this.levelBarView = levelBarView;
        RecyclerView levelDescRecyclerview = r48VarA0.B;
        Intrinsics.checkNotNullExpressionValue(levelDescRecyclerview, "levelDescRecyclerview");
        this.levelDescRecyclerView = levelDescRecyclerview;
    }
}
