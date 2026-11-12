package com.huami.heartrate.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huami.heartrate.R;
import com.huami.heartrate.databinding.HeartRateFragmentDetailFooterItemBinding;
import com.huami.tools.analytics.DbUtils;
import com.huami.viewbindingx.ViewBindingProperty;
import com.huami.viewbindingx.viewgroup.ViewGroupViewBindingKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0007\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u000b\u001a\u00020\b8F@\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0013\u0010\r\u001a\u00020\b8F@\u0006¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0013\u0010\u000f\u001a\u00020\b8F@\u0006¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/huami/heartrate/ui/HeartRateFooterView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/huami/heartrate/databinding/HeartRateFragmentDetailFooterItemBinding;", "a", "Lcom/huami/viewbindingx/ViewBindingProperty;", "getViewBinding", "()Lcom/huami/heartrate/databinding/HeartRateFragmentDetailFooterItemBinding;", "viewBinding", "Landroidx/appcompat/widget/AppCompatTextView;", "getValueText", "()Landroidx/appcompat/widget/AppCompatTextView;", "valueText", "getLabelText", "labelText", "getUnitText", "unitText", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class HeartRateFooterView extends ConstraintLayout {
    public static final /* synthetic */ KProperty<Object>[] b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(HeartRateFooterView.class), "viewBinding", "getViewBinding()Lcom/huami/heartrate/databinding/HeartRateFragmentDetailFooterItemBinding;"))};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ViewBindingProperty viewBinding;

    @JvmOverloads
    public HeartRateFooterView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public HeartRateFooterView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ HeartRateFooterView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final HeartRateFragmentDetailFooterItemBinding getViewBinding() {
        return (HeartRateFragmentDetailFooterItemBinding) this.viewBinding.getValue(this, b[0]);
    }

    @NotNull
    public final AppCompatTextView getLabelText() {
        return getViewBinding().heartRateLabel;
    }

    @NotNull
    public final AppCompatTextView getUnitText() {
        return getViewBinding().heartRateUnit;
    }

    @NotNull
    public final AppCompatTextView getValueText() {
        return getViewBinding().heartRateValue;
    }

    @JvmOverloads
    public HeartRateFooterView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.inflate(context, R.layout.heart_rate_fragment_detail_footer_item, this);
        this.viewBinding = ViewGroupViewBindingKt.viewBinding(this, HeartRateFragmentDetailFooterItemBinding.class);
    }
}
