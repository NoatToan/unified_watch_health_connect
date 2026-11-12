package com.xiaomi.fitness.common.recycer;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.uod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010&\u001a\u00020\u0016¢\u0006\u0004\b'\u0010(J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010!\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0014\u0010#\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001eR\u0014\u0010$\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001eR\u0014\u0010%\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001e¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/common/recycer/TimeRecordViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "timeStr", "", "updateTimeStr", "(Ljava/lang/String;)V", "", "topShow", "bottomShow", "setTopAndBottomLineVisible", "(ZZ)V", "valueStr", "unitString", "labelStr", "resultString", "updateFirstView", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "updateSecondView", "visible", "setSecondViewVisible", "(Z)V", "Luod;", "mBinging", "Luod;", "Landroid/view/View;", "centerLine", "Landroid/view/View;", "Landroid/widget/TextView;", "tvFirstValue", "Landroid/widget/TextView;", "tvFirstUnit", "tvFirstLabel", "tvFirstResult", "tvSecondValue", "tvSecondUnit", "tvSecondLabel", "tvSecondResult", "binding", "<init>", "(Luod;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TimeRecordViewHolder extends RecyclerView.d0 {

    @NotNull
    private final View centerLine;

    @NotNull
    private final uod mBinging;

    @NotNull
    private final TextView tvFirstLabel;

    @NotNull
    private final TextView tvFirstResult;

    @NotNull
    private final TextView tvFirstUnit;

    @NotNull
    private final TextView tvFirstValue;

    @NotNull
    private final TextView tvSecondLabel;

    @NotNull
    private final TextView tvSecondResult;

    @NotNull
    private final TextView tvSecondUnit;

    @NotNull
    private final TextView tvSecondValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeRecordViewHolder(@NotNull uod binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.mBinging = binding;
        View viewDivider = binding.M;
        Intrinsics.checkNotNullExpressionValue(viewDivider, "viewDivider");
        this.centerLine = viewDivider;
        TextView tvFirstValue = binding.G;
        Intrinsics.checkNotNullExpressionValue(tvFirstValue, "tvFirstValue");
        this.tvFirstValue = tvFirstValue;
        TextView tvFirstUnit = binding.F;
        Intrinsics.checkNotNullExpressionValue(tvFirstUnit, "tvFirstUnit");
        this.tvFirstUnit = tvFirstUnit;
        TextView tvFirstLabel = binding.D;
        Intrinsics.checkNotNullExpressionValue(tvFirstLabel, "tvFirstLabel");
        this.tvFirstLabel = tvFirstLabel;
        TextView tvFirstResult = binding.E;
        Intrinsics.checkNotNullExpressionValue(tvFirstResult, "tvFirstResult");
        this.tvFirstResult = tvFirstResult;
        TextView tvSecondValue = binding.K;
        Intrinsics.checkNotNullExpressionValue(tvSecondValue, "tvSecondValue");
        this.tvSecondValue = tvSecondValue;
        TextView tvSecondUnit = binding.J;
        Intrinsics.checkNotNullExpressionValue(tvSecondUnit, "tvSecondUnit");
        this.tvSecondUnit = tvSecondUnit;
        TextView tvSecondLabel = binding.H;
        Intrinsics.checkNotNullExpressionValue(tvSecondLabel, "tvSecondLabel");
        this.tvSecondLabel = tvSecondLabel;
        TextView tvSecondResult = binding.I;
        Intrinsics.checkNotNullExpressionValue(tvSecondResult, "tvSecondResult");
        this.tvSecondResult = tvSecondResult;
    }

    public static /* synthetic */ void updateFirstView$default(TimeRecordViewHolder timeRecordViewHolder, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 8) != 0) {
            str4 = null;
        }
        timeRecordViewHolder.updateFirstView(str, str2, str3, str4);
    }

    public static /* synthetic */ void updateSecondView$default(TimeRecordViewHolder timeRecordViewHolder, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 8) != 0) {
            str4 = null;
        }
        timeRecordViewHolder.updateSecondView(str, str2, str3, str4);
    }

    public final void setSecondViewVisible(boolean visible) {
        ViewExtKt.setVisible(this.tvSecondValue, visible);
        ViewExtKt.setVisible(this.tvSecondUnit, visible);
        ViewExtKt.setVisible(this.tvSecondLabel, visible);
        ViewExtKt.setVisible(this.tvSecondResult, visible);
        ViewExtKt.setVisible(this.centerLine, visible);
    }

    public final void setTopAndBottomLineVisible(boolean topShow, boolean bottomShow) {
        View topLine = this.mBinging.C;
        Intrinsics.checkNotNullExpressionValue(topLine, "topLine");
        ViewExtKt.setVisible(topLine, topShow);
        View bottomLine = this.mBinging.A;
        Intrinsics.checkNotNullExpressionValue(bottomLine, "bottomLine");
        ViewExtKt.setVisible(bottomLine, bottomShow);
    }

    public final void updateFirstView(@NotNull String valueStr, @NotNull String unitString, @NotNull String labelStr, @Nullable String resultString) {
        Intrinsics.checkNotNullParameter(valueStr, "valueStr");
        Intrinsics.checkNotNullParameter(unitString, "unitString");
        Intrinsics.checkNotNullParameter(labelStr, "labelStr");
        this.tvFirstValue.setText(valueStr);
        this.tvFirstUnit.setText(unitString);
        this.tvFirstLabel.setText(labelStr);
        if (resultString == null || resultString.length() == 0) {
            ViewExtKt.setVisible(this.tvFirstResult, false);
        } else {
            ViewExtKt.setVisible(this.tvFirstResult, true);
            this.tvFirstResult.setText(resultString);
        }
    }

    public final void updateSecondView(@NotNull String valueStr, @NotNull String unitString, @NotNull String labelStr, @Nullable String resultString) {
        Intrinsics.checkNotNullParameter(valueStr, "valueStr");
        Intrinsics.checkNotNullParameter(unitString, "unitString");
        Intrinsics.checkNotNullParameter(labelStr, "labelStr");
        this.tvSecondValue.setText(valueStr);
        this.tvSecondUnit.setText(unitString);
        this.tvSecondLabel.setText(labelStr);
        if (resultString == null || resultString.length() == 0) {
            ViewExtKt.setVisible(this.tvSecondResult, false);
        } else {
            ViewExtKt.setVisible(this.tvSecondResult, true);
            this.tvSecondResult.setText(resultString);
        }
    }

    public final void updateTimeStr(@NotNull String timeStr) {
        Intrinsics.checkNotNullParameter(timeStr, "timeStr");
        this.mBinging.L.setText(timeStr);
    }
}
