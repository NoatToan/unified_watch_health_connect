package com.huami.bloodoxygen.ui.view;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import com.huami.bloodoxygen.ui.R;
import com.huami.bloodoxygen.ui.utils.ExtensionsKt;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/huami/bloodoxygen/ui/view/BloodOxygenCardView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public class BloodOxygenCardView extends CardView {
    @JvmOverloads
    public BloodOxygenCardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public BloodOxygenCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ BloodOxygenCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @JvmOverloads
    public BloodOxygenCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setCardBackgroundColor(ContextCompat.getColor(context, R.color.s38));
        if (Build.VERSION.SDK_INT >= 21) {
            setElevation(ExtensionsKt.dpToPx(this, 0.0f));
        }
        setRadius(ExtensionsKt.dpToPx(this, 6.0f));
        setUseCompatPadding(false);
        setPreventCornerOverlap(false);
    }
}
