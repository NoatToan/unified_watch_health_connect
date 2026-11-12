package com.xiaomi.fitness.training_plan.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.cyi;
import defpackage.eki;
import defpackage.ioi;
import defpackage.oh;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import miuix.androidbasewidget.widget.ProgressBar;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\tJ\u0015\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/training_plan/widget/AbilityMedalProgressLayout;", "Landroid/widget/FrameLayout;", "", "initView", "()V", "handleNoneFinish", "", "finishTime", "handleLess5Finish", "(I)V", "handleLess10Finish", "handleLess30Finish", "handle30Finish", "bgRes", "setBg", "finishTrainingTime", "render", "Landroid/content/Context;", "ctx", "Landroid/content/Context;", "Loh;", "binding", "Loh;", "", "finish1TimeTip", "Ljava/lang/String;", "finish5TimeTip", "finish10TimeTip", "finish30TimeTip", "", "progressRatio", "F", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AbilityMedalProgressLayout extends FrameLayout {
    private oh binding;

    @NotNull
    private final Context ctx;
    private String finish10TimeTip;
    private String finish1TimeTip;
    private String finish30TimeTip;
    private String finish5TimeTip;
    private final float progressRatio;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbilityMedalProgressLayout(@NotNull Context ctx, @Nullable AttributeSet attributeSet) {
        super(ctx, attributeSet);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.ctx = ctx;
        this.progressRatio = 0.72f;
        initView();
    }

    private final void handle30Finish() {
        oh ohVar = this.binding;
        oh ohVar2 = null;
        if (ohVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar = null;
        }
        ohVar.D.setImageResource(ioi.s);
        oh ohVar3 = this.binding;
        if (ohVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar3 = null;
        }
        ohVar3.A.setImageResource(ioi.w);
        oh ohVar4 = this.binding;
        if (ohVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar4 = null;
        }
        View rightMedalPoint = ohVar4.M;
        Intrinsics.checkNotNullExpressionValue(rightMedalPoint, "rightMedalPoint");
        ViewExtKt.gone(rightMedalPoint);
        oh ohVar5 = this.binding;
        if (ohVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar5 = null;
        }
        ImageView rightMedal = ohVar5.L;
        Intrinsics.checkNotNullExpressionValue(rightMedal, "rightMedal");
        ViewExtKt.invisible(rightMedal);
        oh ohVar6 = this.binding;
        if (ohVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar6 = null;
        }
        TextView textView = ohVar6.F;
        String str = this.finish10TimeTip;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("finish10TimeTip");
            str = null;
        }
        textView.setText(str);
        Intrinsics.checkNotNull(textView);
        textView.setTextColor(ViewExtKt.getColor(textView, eki.d));
        oh ohVar7 = this.binding;
        if (ohVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar7 = null;
        }
        TextView textView2 = ohVar7.C;
        String str2 = this.finish30TimeTip;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("finish30TimeTip");
            str2 = null;
        }
        textView2.setText(str2);
        Intrinsics.checkNotNull(textView2);
        textView2.setTextColor(ViewExtKt.getColor(textView2, eki.d));
        oh ohVar8 = this.binding;
        if (ohVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar8 = null;
        }
        TextView rightMedalTip = ohVar8.N;
        Intrinsics.checkNotNullExpressionValue(rightMedalTip, "rightMedalTip");
        ViewExtKt.invisible(rightMedalTip);
        oh ohVar9 = this.binding;
        if (ohVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar9 = null;
        }
        LinearLayout noProgressLayout = ohVar9.H;
        Intrinsics.checkNotNullExpressionValue(noProgressLayout, "noProgressLayout");
        ViewExtKt.gone(noProgressLayout);
        oh ohVar10 = this.binding;
        if (ohVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar10 = null;
        }
        ProgressBar normalProgress = ohVar10.I;
        Intrinsics.checkNotNullExpressionValue(normalProgress, "normalProgress");
        ViewExtKt.gone(normalProgress);
        oh ohVar11 = this.binding;
        if (ohVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar11 = null;
        }
        LinearLayout linearLayout = ohVar11.G;
        Intrinsics.checkNotNull(linearLayout);
        ViewExtKt.visible(linearLayout);
        oh ohVar12 = this.binding;
        if (ohVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ohVar2 = ohVar12;
        }
        ohVar2.J.setProgress(100);
        setBg(ioi.g);
    }

    private final void handleLess10Finish(int finishTime) {
        oh ohVar = this.binding;
        oh ohVar2 = null;
        if (ohVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar = null;
        }
        ohVar.D.setImageResource(ioi.v);
        oh ohVar3 = this.binding;
        if (ohVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar3 = null;
        }
        ohVar3.A.setImageResource(ioi.y);
        oh ohVar4 = this.binding;
        if (ohVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar4 = null;
        }
        ohVar4.L.setImageResource(ioi.t);
        oh ohVar5 = this.binding;
        if (ohVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar5 = null;
        }
        ohVar5.M.setBackgroundResource(ioi.f21949k);
        oh ohVar6 = this.binding;
        if (ohVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar6 = null;
        }
        TextView textView = ohVar6.F;
        String str = this.finish1TimeTip;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("finish1TimeTip");
            str = null;
        }
        textView.setText(str);
        Intrinsics.checkNotNull(textView);
        textView.setTextColor(ViewExtKt.getColor(textView, eki.d));
        oh ohVar7 = this.binding;
        if (ohVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar7 = null;
        }
        TextView textView2 = ohVar7.C;
        String str2 = this.finish5TimeTip;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("finish5TimeTip");
            str2 = null;
        }
        textView2.setText(str2);
        Intrinsics.checkNotNull(textView2);
        textView2.setTextColor(ViewExtKt.getColor(textView2, eki.d));
        oh ohVar8 = this.binding;
        if (ohVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar8 = null;
        }
        TextView textView3 = ohVar8.N;
        String str3 = this.finish10TimeTip;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("finish10TimeTip");
            str3 = null;
        }
        textView3.setText(str3);
        Intrinsics.checkNotNull(textView3);
        textView3.setTextColor(ViewExtKt.getColor(textView3, eki.f));
        oh ohVar9 = this.binding;
        if (ohVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar9 = null;
        }
        LinearLayout noProgressLayout = ohVar9.H;
        Intrinsics.checkNotNullExpressionValue(noProgressLayout, "noProgressLayout");
        ViewExtKt.gone(noProgressLayout);
        oh ohVar10 = this.binding;
        if (ohVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar10 = null;
        }
        LinearLayout maxProgressLayout = ohVar10.G;
        Intrinsics.checkNotNullExpressionValue(maxProgressLayout, "maxProgressLayout");
        ViewExtKt.gone(maxProgressLayout);
        oh ohVar11 = this.binding;
        if (ohVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar11 = null;
        }
        ProgressBar progressBar = ohVar11.I;
        Intrinsics.checkNotNull(progressBar);
        ViewExtKt.visible(progressBar);
        oh ohVar12 = this.binding;
        if (ohVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ohVar2 = ohVar12;
        }
        ohVar2.I.setProgress((((int) ((((finishTime - 5) / 5) * 100) * this.progressRatio)) / 2) + 50);
        setBg(ioi.h);
    }

    private final void handleLess30Finish(int finishTime) {
        oh ohVar = this.binding;
        oh ohVar2 = null;
        if (ohVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar = null;
        }
        ohVar.D.setImageResource(ioi.z);
        oh ohVar3 = this.binding;
        if (ohVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar3 = null;
        }
        ohVar3.A.setImageResource(ioi.f21950r);
        oh ohVar4 = this.binding;
        if (ohVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar4 = null;
        }
        ohVar4.L.setImageResource(ioi.x);
        oh ohVar5 = this.binding;
        if (ohVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar5 = null;
        }
        ohVar5.M.setBackgroundResource(ioi.f21949k);
        oh ohVar6 = this.binding;
        if (ohVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar6 = null;
        }
        TextView textView = ohVar6.F;
        String str = this.finish5TimeTip;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("finish5TimeTip");
            str = null;
        }
        textView.setText(str);
        Intrinsics.checkNotNull(textView);
        textView.setTextColor(ViewExtKt.getColor(textView, eki.d));
        oh ohVar7 = this.binding;
        if (ohVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar7 = null;
        }
        TextView textView2 = ohVar7.C;
        String str2 = this.finish10TimeTip;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("finish10TimeTip");
            str2 = null;
        }
        textView2.setText(str2);
        Intrinsics.checkNotNull(textView2);
        textView2.setTextColor(ViewExtKt.getColor(textView2, eki.d));
        oh ohVar8 = this.binding;
        if (ohVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar8 = null;
        }
        TextView textView3 = ohVar8.N;
        String str3 = this.finish30TimeTip;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("finish30TimeTip");
            str3 = null;
        }
        textView3.setText(str3);
        Intrinsics.checkNotNull(textView3);
        textView3.setTextColor(ViewExtKt.getColor(textView3, eki.f));
        oh ohVar9 = this.binding;
        if (ohVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar9 = null;
        }
        LinearLayout noProgressLayout = ohVar9.H;
        Intrinsics.checkNotNullExpressionValue(noProgressLayout, "noProgressLayout");
        ViewExtKt.gone(noProgressLayout);
        oh ohVar10 = this.binding;
        if (ohVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar10 = null;
        }
        LinearLayout maxProgressLayout = ohVar10.G;
        Intrinsics.checkNotNullExpressionValue(maxProgressLayout, "maxProgressLayout");
        ViewExtKt.gone(maxProgressLayout);
        oh ohVar11 = this.binding;
        if (ohVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar11 = null;
        }
        ProgressBar progressBar = ohVar11.I;
        Intrinsics.checkNotNull(progressBar);
        ViewExtKt.visible(progressBar);
        oh ohVar12 = this.binding;
        if (ohVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ohVar2 = ohVar12;
        }
        ohVar2.I.setProgress((((int) ((((finishTime - 10) / 20) * 100) * this.progressRatio)) / 2) + 50);
        setBg(ioi.i);
    }

    private final void handleLess5Finish(int finishTime) {
        oh ohVar = this.binding;
        oh ohVar2 = null;
        if (ohVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar = null;
        }
        ImageView leftMedal = ohVar.D;
        Intrinsics.checkNotNullExpressionValue(leftMedal, "leftMedal");
        ViewExtKt.invisible(leftMedal);
        oh ohVar3 = this.binding;
        if (ohVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar3 = null;
        }
        TextView leftMedalTip = ohVar3.F;
        Intrinsics.checkNotNullExpressionValue(leftMedalTip, "leftMedalTip");
        ViewExtKt.gone(leftMedalTip);
        oh ohVar4 = this.binding;
        if (ohVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar4 = null;
        }
        View leftMedalPoint = ohVar4.E;
        Intrinsics.checkNotNullExpressionValue(leftMedalPoint, "leftMedalPoint");
        ViewExtKt.gone(leftMedalPoint);
        oh ohVar5 = this.binding;
        if (ohVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar5 = null;
        }
        ohVar5.M.setBackgroundResource(ioi.f21949k);
        oh ohVar6 = this.binding;
        if (ohVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar6 = null;
        }
        TextView textView = ohVar6.C;
        Intrinsics.checkNotNull(textView);
        ViewExtKt.visible(textView);
        String str = this.finish1TimeTip;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("finish1TimeTip");
            str = null;
        }
        textView.setText(str);
        textView.setTextColor(ViewExtKt.getColor(textView, eki.d));
        oh ohVar7 = this.binding;
        if (ohVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar7 = null;
        }
        TextView textView2 = ohVar7.N;
        Intrinsics.checkNotNull(textView2);
        ViewExtKt.visible(textView2);
        String str2 = this.finish5TimeTip;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("finish5TimeTip");
            str2 = null;
        }
        textView2.setText(str2);
        textView2.setTextColor(ViewExtKt.getColor(textView2, eki.f));
        oh ohVar8 = this.binding;
        if (ohVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar8 = null;
        }
        ohVar8.A.setImageResource(ioi.u);
        oh ohVar9 = this.binding;
        if (ohVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar9 = null;
        }
        ohVar9.L.setImageResource(ioi.A);
        oh ohVar10 = this.binding;
        if (ohVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar10 = null;
        }
        LinearLayout maxProgressLayout = ohVar10.G;
        Intrinsics.checkNotNullExpressionValue(maxProgressLayout, "maxProgressLayout");
        ViewExtKt.gone(maxProgressLayout);
        oh ohVar11 = this.binding;
        if (ohVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar11 = null;
        }
        ProgressBar normalProgress = ohVar11.I;
        Intrinsics.checkNotNullExpressionValue(normalProgress, "normalProgress");
        ViewExtKt.gone(normalProgress);
        oh ohVar12 = this.binding;
        if (ohVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ohVar2 = ohVar12;
        }
        ohVar2.K.setProgress((int) (((finishTime - 1) / 4) * this.progressRatio * 100));
        setBg(ioi.f);
    }

    private final void handleNoneFinish() {
        oh ohVar = this.binding;
        oh ohVar2 = null;
        if (ohVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar = null;
        }
        ImageView leftMedal = ohVar.D;
        Intrinsics.checkNotNullExpressionValue(leftMedal, "leftMedal");
        ViewExtKt.invisible(leftMedal);
        oh ohVar3 = this.binding;
        if (ohVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar3 = null;
        }
        LinearLayout maxProgressLayout = ohVar3.G;
        Intrinsics.checkNotNullExpressionValue(maxProgressLayout, "maxProgressLayout");
        ViewExtKt.gone(maxProgressLayout);
        oh ohVar4 = this.binding;
        if (ohVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar4 = null;
        }
        ProgressBar normalProgress = ohVar4.I;
        Intrinsics.checkNotNullExpressionValue(normalProgress, "normalProgress");
        ViewExtKt.gone(normalProgress);
        oh ohVar5 = this.binding;
        if (ohVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar5 = null;
        }
        LinearLayout linearLayout = ohVar5.H;
        Intrinsics.checkNotNull(linearLayout);
        ViewExtKt.visible(linearLayout);
        oh ohVar6 = this.binding;
        if (ohVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar6 = null;
        }
        ohVar6.K.setProgress(0);
        oh ohVar7 = this.binding;
        if (ohVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar7 = null;
        }
        TextView leftMedalTip = ohVar7.F;
        Intrinsics.checkNotNullExpressionValue(leftMedalTip, "leftMedalTip");
        ViewExtKt.gone(leftMedalTip);
        oh ohVar8 = this.binding;
        if (ohVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar8 = null;
        }
        View leftMedalPoint = ohVar8.E;
        Intrinsics.checkNotNullExpressionValue(leftMedalPoint, "leftMedalPoint");
        ViewExtKt.gone(leftMedalPoint);
        oh ohVar9 = this.binding;
        if (ohVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar9 = null;
        }
        TextView textView = ohVar9.C;
        Intrinsics.checkNotNull(textView);
        ViewExtKt.visible(textView);
        String str = this.finish1TimeTip;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("finish1TimeTip");
            str = null;
        }
        textView.setText(str);
        textView.setTextColor(ViewExtKt.getColor(textView, eki.f));
        oh ohVar10 = this.binding;
        if (ohVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar10 = null;
        }
        TextView textView2 = ohVar10.N;
        Intrinsics.checkNotNull(textView2);
        ViewExtKt.visible(textView2);
        String str2 = this.finish5TimeTip;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("finish5TimeTip");
            str2 = null;
        }
        textView2.setText(str2);
        textView2.setTextColor(ViewExtKt.getColor(textView2, eki.f));
        oh ohVar11 = this.binding;
        if (ohVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar11 = null;
        }
        ohVar11.A.setImageResource(ioi.q);
        oh ohVar12 = this.binding;
        if (ohVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ohVar2 = ohVar12;
        }
        ohVar2.L.setImageResource(ioi.A);
        setBg(ioi.f);
    }

    private final void initView() {
        oh ohVarA0 = oh.A0(LayoutInflater.from(this.ctx));
        this.binding = ohVarA0;
        if (ohVarA0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVarA0 = null;
        }
        View root = ohVarA0.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        addView(root, new FrameLayout.LayoutParams(-1, -1));
        this.finish1TimeTip = ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), cyi.f14866a, 1, 1);
        this.finish5TimeTip = ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), cyi.f14866a, 5, 5);
        this.finish10TimeTip = ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), cyi.f14866a, 10, 10);
        this.finish30TimeTip = ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), cyi.f14866a, 30, 30);
    }

    private final void setBg(int bgRes) {
        Object parent = getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            view.setBackgroundResource(bgRes);
        }
    }

    public final void render(int finishTrainingTime) {
        Logger.d("render_ability_achievement", Integer.valueOf(finishTrainingTime));
        if (finishTrainingTime >= 30) {
            handle30Finish();
            return;
        }
        if (finishTrainingTime >= 10) {
            handleLess30Finish(finishTrainingTime);
            return;
        }
        if (finishTrainingTime >= 5) {
            handleLess10Finish(finishTrainingTime);
        } else if (finishTrainingTime >= 1) {
            handleLess5Finish(finishTrainingTime);
        } else {
            handleNoneFinish();
        }
    }
}
