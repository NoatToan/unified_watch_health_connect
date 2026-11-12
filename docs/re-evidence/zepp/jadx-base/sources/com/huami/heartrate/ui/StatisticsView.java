package com.huami.heartrate.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huami.heartrate.R;
import com.huami.heartrate.databinding.HeartRateStatisticsViewBinding;
import com.huami.heartrate.utils.ExtensionUtilsKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.viewbindingx.ViewBindingProperty;
import com.huami.viewbindingx.viewgroup.ViewGroupViewBindingKt;
import com.xiaomi.hm.health.Constant;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bR\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/huami/heartrate/ui/StatisticsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "averageHr", Constant.PAI_KEY_MAX_HR, "minHr", "", "setDataText", "", "title", "initText", "Lcom/huami/heartrate/databinding/HeartRateStatisticsViewBinding;", "a", "Lcom/huami/viewbindingx/ViewBindingProperty;", "getBinding", "()Lcom/huami/heartrate/databinding/HeartRateStatisticsViewBinding;", "binding", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class StatisticsView extends ConstraintLayout {
    public static final /* synthetic */ KProperty<Object>[] b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(StatisticsView.class), "binding", "getBinding()Lcom/huami/heartrate/databinding/HeartRateStatisticsViewBinding;"))};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ViewBindingProperty binding;

    @JvmOverloads
    public StatisticsView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public StatisticsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ StatisticsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final HeartRateStatisticsViewBinding getBinding() {
        return (HeartRateStatisticsViewBinding) this.binding.getValue(this, b[0]);
    }

    public final void initText(@NotNull String title) {
        getBinding().title.setText(title);
        getBinding().averageHr.setText("--");
        getBinding().maxHr.setText("--");
        getBinding().minHr.setText("--");
    }

    public final void setDataText(int averageHr, int maxHr, int minHr) {
        getBinding().averageHr.setText(ExtensionUtilsKt.formatIntOrDefaultText(Integer.valueOf(averageHr)));
        getBinding().averageHrUnit.setVisibility(ExtensionUtilsKt.isVerify(Integer.valueOf(averageHr)) ? 0 : 8);
        getBinding().maxHr.setText(ExtensionUtilsKt.formatIntOrDefaultText(Integer.valueOf(maxHr)));
        getBinding().maxHrUnit.setVisibility(ExtensionUtilsKt.isVerify(Integer.valueOf(maxHr)) ? 0 : 8);
        getBinding().minHr.setText(ExtensionUtilsKt.formatIntOrDefaultText(Integer.valueOf(minHr)));
        getBinding().minHrUnit.setVisibility(ExtensionUtilsKt.isVerify(Integer.valueOf(minHr)) ? 0 : 8);
    }

    @JvmOverloads
    public StatisticsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.binding = ViewGroupViewBindingKt.viewBinding(this, HeartRateStatisticsViewBinding.class);
        ViewGroup.inflate(context, R.layout.heart_rate_statistics_view, this);
    }
}
