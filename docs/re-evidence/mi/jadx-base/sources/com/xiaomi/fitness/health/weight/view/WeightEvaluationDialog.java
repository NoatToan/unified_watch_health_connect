package com.xiaomi.fitness.health.weight.view;

import android.os.Bundle;
import android.view.View;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.dialog.a;
import com.xiaomi.fitness.health.weight.bean.WeightDataItem;
import defpackage.eri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/health/weight/view/WeightEvaluationDialog;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "<init>", "()V", "weightEvaluationView", "Lcom/xiaomi/fitness/health/weight/view/WeightEvaluationView;", "dataItem", "Lcom/xiaomi/fitness/health/weight/bean/WeightDataItem;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initCustomView", "rootView", "Landroid/view/View;", "updateData", "detail", "Builder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WeightEvaluationDialog extends CommonDialog<DialogParams> {

    @Nullable
    private WeightDataItem dataItem;

    @Nullable
    private WeightEvaluationView weightEvaluationView;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0004\u001a\u00020\u0000H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/health/weight/view/WeightEvaluationDialog$Builder;", "Lcom/xiaomi/fitness/baseui/dialog/a;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "Lcom/xiaomi/fitness/health/weight/view/WeightEvaluationDialog;", "getThis", "()Lcom/xiaomi/fitness/health/weight/view/WeightEvaluationDialog$Builder;", "internalCreate", "()Lcom/xiaomi/fitness/health/weight/view/WeightEvaluationDialog;", "", "name", "<init>", "(Ljava/lang/String;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Builder extends a<Builder, DialogParams, WeightEvaluationDialog> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull String name) {
            super(new DialogParams(name));
            Intrinsics.checkNotNullParameter(name, "name");
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public Builder getThis() {
            return this;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public WeightEvaluationDialog internalCreate() {
            return new WeightEvaluationDialog();
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(@Nullable View rootView) {
        super.initCustomView(rootView);
        WeightEvaluationView weightEvaluationView = rootView != null ? (WeightEvaluationView) rootView.findViewById(eri.xp) : null;
        this.weightEvaluationView = weightEvaluationView;
        WeightDataItem weightDataItem = this.dataItem;
        if (weightDataItem != null) {
            if (weightEvaluationView != null) {
                weightEvaluationView.showTopDivider(false);
            }
            WeightEvaluationView weightEvaluationView2 = this.weightEvaluationView;
            if (weightEvaluationView2 != null) {
                weightEvaluationView2.updateData(weightDataItem);
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    public final void updateData(@NotNull WeightDataItem detail) {
        Intrinsics.checkNotNullParameter(detail, "detail");
        this.dataItem = detail;
        WeightEvaluationView weightEvaluationView = this.weightEvaluationView;
        if (weightEvaluationView != null) {
            weightEvaluationView.updateData(detail);
        }
    }
}
