package com.xiaomi.fitness.health.bloodpressure.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.x6e;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J1\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012R\u0014\u0010\u001a\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/health/bloodpressure/ui/BloodPressureDataTitleView;", "Landroid/widget/FrameLayout;", "", "descStr", "bpStr", "pulseStr", "pulseUnit", "", "showTitle", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "emptyTitleStr", "showEmptyStr", "(Ljava/lang/String;)V", "Lx6e;", "binding", "Lx6e;", "Landroid/widget/TextView;", "tvBpValue", "Landroid/widget/TextView;", "tvPulseValue", "tvPulseUnit", "tvEmpty", "Landroid/view/View;", "pulseView", "Landroid/view/View;", "tvTimeDesc", "titleView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BloodPressureDataTitleView extends FrameLayout {

    @NotNull
    private final x6e binding;

    @NotNull
    private final View pulseView;

    @NotNull
    private final View titleView;

    @NotNull
    private final TextView tvBpValue;

    @NotNull
    private final TextView tvEmpty;

    @NotNull
    private final TextView tvPulseUnit;

    @NotNull
    private final TextView tvPulseValue;

    @NotNull
    private final TextView tvTimeDesc;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public BloodPressureDataTitleView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void showEmptyStr(@NotNull String emptyTitleStr) {
        Intrinsics.checkNotNullParameter(emptyTitleStr, "emptyTitleStr");
        ViewExtKt.setVisible(this.tvEmpty, true);
        ViewExtKt.setVisible(this.titleView, false);
        this.tvEmpty.setText(emptyTitleStr);
    }

    public final void showTitle(@NotNull String descStr, @NotNull String bpStr, @Nullable String pulseStr, @Nullable String pulseUnit) {
        Intrinsics.checkNotNullParameter(descStr, "descStr");
        Intrinsics.checkNotNullParameter(bpStr, "bpStr");
        ViewExtKt.setVisible(this.titleView, true);
        ViewExtKt.setVisible(this.tvEmpty, false);
        this.tvTimeDesc.setText(descStr);
        this.tvBpValue.setText(bpStr);
        if (pulseStr == null || StringsKt__StringsKt.isBlank(pulseStr)) {
            ViewExtKt.setVisible(this.pulseView, false);
            return;
        }
        ViewExtKt.setVisible(this.pulseView, true);
        this.tvPulseValue.setText(pulseStr);
        this.tvPulseUnit.setText(pulseUnit);
    }

    public /* synthetic */ BloodPressureDataTitleView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BloodPressureDataTitleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        x6e x6eVarA0 = x6e.A0(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(x6eVarA0, "inflate(...)");
        this.binding = x6eVarA0;
        TextView tvBpValue = x6eVarA0.F;
        Intrinsics.checkNotNullExpressionValue(tvBpValue, "tvBpValue");
        this.tvBpValue = tvBpValue;
        TextView tvPulseValue = x6eVarA0.K;
        Intrinsics.checkNotNullExpressionValue(tvPulseValue, "tvPulseValue");
        this.tvPulseValue = tvPulseValue;
        TextView tvPulseUnit = x6eVarA0.J;
        Intrinsics.checkNotNullExpressionValue(tvPulseUnit, "tvPulseUnit");
        this.tvPulseUnit = tvPulseUnit;
        TextView tvEmpty = x6eVarA0.H;
        Intrinsics.checkNotNullExpressionValue(tvEmpty, "tvEmpty");
        this.tvEmpty = tvEmpty;
        LinearLayout llPulse = x6eVarA0.B;
        Intrinsics.checkNotNullExpressionValue(llPulse, "llPulse");
        this.pulseView = llPulse;
        TextView tvDesc = x6eVarA0.G;
        Intrinsics.checkNotNullExpressionValue(tvDesc, "tvDesc");
        this.tvTimeDesc = tvDesc;
        LinearLayout llTitle = x6eVarA0.C;
        Intrinsics.checkNotNullExpressionValue(llTitle, "llTitle");
        this.titleView = llTitle;
        UIUtils uIUtils = UIUtils.INSTANCE;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        tvBpValue.setMaxWidth(ExtUtilsKt.getDp(Integer.valueOf((!LocaleUtil.INSTANCE.isChinese() || uIUtils.isSmallScreen(context2)) ? 150 : 200)));
        setImportantForAccessibility(1);
        setFocusable(1);
        tvBpValue.requestLayout();
    }
}
