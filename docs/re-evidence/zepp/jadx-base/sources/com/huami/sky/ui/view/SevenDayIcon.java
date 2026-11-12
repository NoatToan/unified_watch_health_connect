package com.huami.sky.ui.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import com.huami.sky.ui.R;
import com.huami.sky.ui.databinding.SkyLayoutSevenDaysIconBinding;
import com.huami.sky.ui.ext.SkyExtKt;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/huami/sky/ui/view/SevenDayIcon;", "Landroid/widget/FrameLayout;", "Landroid/graphics/drawable/GradientDrawable;", "a", "", "days", "", "setDayNum", "playDone", "", "isGray", "updateIconColor", "Lcom/huami/sky/ui/databinding/SkyLayoutSevenDaysIconBinding;", "Lcom/huami/sky/ui/databinding/SkyLayoutSevenDaysIconBinding;", "binding", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SevenDayIcon extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SkyLayoutSevenDaysIconBinding binding;

    @JvmOverloads
    public SevenDayIcon(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SevenDayIcon(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SevenDayIcon(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final GradientDrawable a() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setStroke(SkyExtKt.getDp(1), ContextCompat.getColor(getContext(), R.color.s47));
        gradientDrawable.setSize(SkyExtKt.getDp(20), SkyExtKt.getDp(20));
        return gradientDrawable;
    }

    public final void playDone() {
        this.binding.dayImage.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.ic_sky_done));
        this.binding.dayNum.setVisibility(8);
    }

    public final void setDayNum(int days) {
        this.binding.dayImage.setBackground(a());
        this.binding.dayNum.setText(String.valueOf(days));
        this.binding.dayNum.setVisibility(0);
    }

    public final void updateIconColor(boolean isGray) {
        if (isGray) {
            SkyExtKt.setTextColorRes(this.binding.dayNum, R.color.s47, Double.valueOf(0.4d));
            this.binding.dayImage.setAlpha(0.4f);
        } else {
            SkyExtKt.setTextColorRes$default(this.binding.dayNum, R.color.s47, null, 2, null);
            this.binding.dayImage.setAlpha(1.0f);
        }
    }

    @JvmOverloads
    public SevenDayIcon(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.binding = SkyLayoutSevenDaysIconBinding.inflate(LayoutInflater.from(context), this);
    }
}
