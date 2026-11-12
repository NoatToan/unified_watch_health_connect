package com.xiaomi.fitness.health.weight.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.baseui.widget.LevelPercentBarView;
import com.xiaomi.fitness.baseui.widget.PercentLevel;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.weight.bean.WeightDataItem;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import defpackage.gfe;
import defpackage.z3c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010)\u001a\u00020(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/health/weight/view/WeightEvaluationView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "refreshView", "()V", "updateViewDynamic", "Lcom/xiaomi/fitness/health/weight/bean/WeightDataItem;", "data", "updateData", "(Lcom/xiaomi/fitness/health/weight/bean/WeightDataItem;)V", "", "visible", "showTopDivider", "(Z)V", "enable", "updateAdaptLargeEnable", "Lz3c;", "binding", "Lz3c;", "Landroid/widget/TextView;", "tvValue", "Landroid/widget/TextView;", "tvIndexLabel", "tvUnit", "tvGradeValue", "tvGradeLabel", "tvDescription", "Lcom/xiaomi/fitness/baseui/widget/LevelPercentBarView;", "levelBarView", "Lcom/xiaomi/fitness/baseui/widget/LevelPercentBarView;", "Landroidx/recyclerview/widget/RecyclerView;", "levelDescRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "weightDataItem", "Lcom/xiaomi/fitness/health/weight/bean/WeightDataItem;", "adaptLarge", "Z", "Landroidx/constraintlayout/widget/Guideline;", "guideLineView", "Landroidx/constraintlayout/widget/Guideline;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nWeightEvaluationView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightEvaluationView.kt\ncom/xiaomi/fitness/health/weight/view/WeightEvaluationView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n1557#2:112\n1628#2,3:113\n*S KotlinDebug\n*F\n+ 1 WeightEvaluationView.kt\ncom/xiaomi/fitness/health/weight/view/WeightEvaluationView\n*L\n92#1:112\n92#1:113,3\n*E\n"})
public final class WeightEvaluationView extends ConstraintLayout {
    private boolean adaptLarge;

    @NotNull
    private final z3c binding;

    @NotNull
    private final Guideline guideLineView;

    @NotNull
    private final LevelPercentBarView levelBarView;

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
        if (this.weightDataItem == null) {
            return;
        }
        updateViewDynamic();
        WeightDataItem weightDataItem = this.weightDataItem;
        Intrinsics.checkNotNull(weightDataItem);
        this.tvValue.setText(weightDataItem.getValueStr());
        this.tvUnit.setText(weightDataItem.getUnitStr());
        this.tvIndexLabel.setText(weightDataItem.getLabelStr());
        this.tvGradeLabel.setText(ExtUtilKt.getString(c0j.t4));
        List<PercentLevel> levelItems = weightDataItem.getLevelItems();
        if (levelItems == null) {
            levelItems = new ArrayList<>();
        }
        if (!levelItems.isEmpty()) {
            this.levelBarView.setLevels(levelItems);
            int currentLevelPosition = weightDataItem.getCurrentLevelPosition();
            if (currentLevelPosition >= 0 && currentLevelPosition < levelItems.size()) {
                ViewExtKt.setVisible(this.levelBarView, true);
                PercentLevel percentLevel = levelItems.get(currentLevelPosition);
                this.levelBarView.setLevelWithChildPercent(currentLevelPosition, weightDataItem.getCurrentLevelPositionPercent());
                this.tvGradeValue.setText(ExtUtilKt.getString(percentLevel.getLevelDesc()));
            }
        } else {
            ViewExtKt.setVisible(this.levelBarView, false);
            this.tvGradeValue.setText("--");
        }
        this.tvDescription.setText(weightDataItem.getEvaluateDetailDesc());
        TextView textView = this.tvDescription;
        String evaluateDetailDesc = weightDataItem.getEvaluateDetailDesc();
        ViewExtKt.setVisible(textView, (evaluateDetailDesc == null || StringsKt__StringsKt.isBlank(evaluateDetailDesc)) ? false : true);
        List<PercentLevel> list = levelItems;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (PercentLevel percentLevel2 : list) {
            arrayList.add(new LevelBarView.LevelItem(percentLevel2.getColor(), percentLevel2.getTextColor(), percentLevel2.getLevelDesc()));
        }
        gfe gfeVar = new gfe(getContext(), arrayList, 3);
        this.levelDescRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        this.levelDescRecyclerView.setHasFixedSize(true);
        this.levelDescRecyclerView.setNestedScrollingEnabled(false);
        this.levelDescRecyclerView.setAdapter(gfeVar);
        gfeVar.notifyDataSetChanged();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    private final void updateViewDynamic() {
        boolean z;
        if (this.adaptLarge) {
            UIUtils uIUtils = UIUtils.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (uIUtils.isTabletAndLandscape(context)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.guideLineView.setGuidelinePercent(z ? 0.33f : 0.5f);
        ViewGroup.LayoutParams layoutParams = this.levelDescRecyclerView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(ExtUtilsKt.getDp(z ? 270 : 0));
        this.levelDescRecyclerView.setLayoutParams(marginLayoutParams);
    }

    public final void showTopDivider(boolean visible) {
        View viewDividerTop = this.binding.K;
        Intrinsics.checkNotNullExpressionValue(viewDividerTop, "viewDividerTop");
        ViewExtKt.setVisible(viewDividerTop, visible);
    }

    public final void updateAdaptLargeEnable(boolean enable) {
        this.adaptLarge = enable;
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
        z3c z3cVarA0 = z3c.A0(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(z3cVarA0, "inflate(...)");
        this.binding = z3cVarA0;
        TextView tvValue = z3cVarA0.H;
        Intrinsics.checkNotNullExpressionValue(tvValue, "tvValue");
        this.tvValue = tvValue;
        TextView tvIndexLabel = z3cVarA0.F;
        Intrinsics.checkNotNullExpressionValue(tvIndexLabel, "tvIndexLabel");
        this.tvIndexLabel = tvIndexLabel;
        TextView tvUnit = z3cVarA0.G;
        Intrinsics.checkNotNullExpressionValue(tvUnit, "tvUnit");
        this.tvUnit = tvUnit;
        TextView tvGradeValue = z3cVarA0.E;
        Intrinsics.checkNotNullExpressionValue(tvGradeValue, "tvGradeValue");
        this.tvGradeValue = tvGradeValue;
        TextView tvGradeLabel = z3cVarA0.D;
        Intrinsics.checkNotNullExpressionValue(tvGradeLabel, "tvGradeLabel");
        this.tvGradeLabel = tvGradeLabel;
        TextView tvDescription = z3cVarA0.C;
        Intrinsics.checkNotNullExpressionValue(tvDescription, "tvDescription");
        this.tvDescription = tvDescription;
        LevelPercentBarView levelBarView = z3cVarA0.A;
        Intrinsics.checkNotNullExpressionValue(levelBarView, "levelBarView");
        this.levelBarView = levelBarView;
        RecyclerView levelDescRecyclerview = z3cVarA0.B;
        Intrinsics.checkNotNullExpressionValue(levelDescRecyclerview, "levelDescRecyclerview");
        this.levelDescRecyclerView = levelDescRecyclerview;
        Guideline verticalGuideline = z3cVarA0.I;
        Intrinsics.checkNotNullExpressionValue(verticalGuideline, "verticalGuideline");
        this.guideLineView = verticalGuideline;
    }
}
