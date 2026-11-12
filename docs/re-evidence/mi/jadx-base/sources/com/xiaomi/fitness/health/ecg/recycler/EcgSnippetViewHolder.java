package com.xiaomi.fitness.health.ecg.recycler;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.ecg.recycler.EcgSnippetViewHolder;
import com.xiaomi.fitness.health.ecg.util.EcgExtKt;
import com.xiaomi.fitness.health.ecg.view.EcgCombineView;
import defpackage.eri;
import defpackage.qxi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 (2\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'JW\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/recycler/EcgSnippetViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "ecgModel", "", "position", "", "showRadioBtn", "Landroid/widget/RadioGroup;", "radioGroup", "Landroidx/lifecycle/LifecycleCoroutineScope;", "coroutineScope", "Lkotlin/Function0;", "", "onClickCallback", "onRadioBtnCheck", "bindData", "(Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;IZLandroid/widget/RadioGroup;Landroidx/lifecycle/LifecycleCoroutineScope;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/widget/TextView;", "title", "Landroid/widget/TextView;", "desc", "notificationBadge", "remindText", "Landroid/widget/ImageView;", "rightArrow", "Landroid/widget/ImageView;", "Lcom/xiaomi/fitness/health/ecg/view/EcgCombineView;", "ecgView", "Lcom/xiaomi/fitness/health/ecg/view/EcgCombineView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "ecgSnippetLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/RadioButton;", "radioBtn", "Landroid/widget/RadioButton;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EcgSnippetViewHolder extends RecyclerView.d0 {

    @NotNull
    public static final String TAG = "EcgSnippetViewHolder";

    @NotNull
    private final TextView desc;

    @NotNull
    private final ConstraintLayout ecgSnippetLayout;

    @NotNull
    private final EcgCombineView ecgView;

    @NotNull
    private final TextView notificationBadge;

    @NotNull
    private final RadioButton radioBtn;

    @NotNull
    private final TextView remindText;

    @NotNull
    private final ImageView rightArrow;

    @NotNull
    private final TextView title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcgSnippetViewHolder(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(eri.cj);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.title = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(eri.h3);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.desc = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(eri.nc);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.notificationBadge = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(eri.Yd);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.remindText = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(eri.ce);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.rightArrow = (ImageView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(eri.u4);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.ecgView = (EcgCombineView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(eri.v4);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.ecgSnippetLayout = (ConstraintLayout) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(eri.hd);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.radioBtn = (RadioButton) viewFindViewById8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindData$lambda$0(RadioGroup radioGroup, int i, Function0 onRadioBtnCheck, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(onRadioBtnCheck, "$onRadioBtnCheck");
        if (z) {
            if (radioGroup != null) {
                radioGroup.clearCheck();
            }
            if (radioGroup != null) {
                radioGroup.check(i + 1);
            }
            onRadioBtnCheck.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindData$lambda$1(EcgSnippetViewHolder this$0, EcgMedicalItemReport ecgModel, LifecycleCoroutineScope lifecycleCoroutineScope) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(ecgModel, "$ecgModel");
        this$0.ecgView.bindReport(ecgModel, 10, 5, lifecycleCoroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindData$lambda$2(Function0 onClickCallback, View view) {
        Intrinsics.checkNotNullParameter(onClickCallback, "$onClickCallback");
        onClickCallback.invoke();
    }

    public final void bindData(@NotNull final EcgMedicalItemReport ecgModel, final int position, boolean showRadioBtn, @Nullable final RadioGroup radioGroup, @Nullable final LifecycleCoroutineScope coroutineScope, @NotNull final Function0<Unit> onClickCallback, @NotNull final Function0<Unit> onRadioBtnCheck) {
        Intrinsics.checkNotNullParameter(ecgModel, "ecgModel");
        Intrinsics.checkNotNullParameter(onClickCallback, "onClickCallback");
        Intrinsics.checkNotNullParameter(onRadioBtnCheck, "onRadioBtnCheck");
        Logger.d(TAG, "bindData ecgModel=" + ecgModel);
        this.title.setText(TimeDateUtil.getDateMMddFormat(ecgModel.getTimestamp()));
        EcgExtKt.showAnalysisStatusTag(this.notificationBadge, ecgModel.getInterpretStatus());
        ViewExtKt.setVisible(this.rightArrow, showRadioBtn ^ true);
        ViewExtKt.setVisible(this.radioBtn, showRadioBtn);
        this.radioBtn.setId(position + 1);
        this.radioBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: fc7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                EcgSnippetViewHolder.bindData$lambda$0(radioGroup, position, onRadioBtnCheck, compoundButton, z);
            }
        });
        Integer avgHr = ecgModel.getAvgHr();
        String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.c0, avgHr != null ? avgHr.intValue() : 0, (avgHr == null || avgHr.intValue() <= 0) ? "--" : avgHr.toString());
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        this.desc.setText(quantityString);
        this.ecgView.post(new Runnable() { // from class: gc7
            @Override // java.lang.Runnable
            public final void run() {
                EcgSnippetViewHolder.bindData$lambda$1(this.f18827a, ecgModel, coroutineScope);
            }
        });
        this.ecgSnippetLayout.setOnClickListener(new View.OnClickListener() { // from class: hc7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcgSnippetViewHolder.bindData$lambda$2(onClickCallback, view);
            }
        });
    }
}
