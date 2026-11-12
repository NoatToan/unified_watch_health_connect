package com.huami.sleep.daysleep.breath;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.sleep.R;
import com.huami.sleep.databinding.ItemBreathQualityDayI18nBinding;
import com.huami.sleep.model.BreathQualityRiskLevel;
import com.huami.sleep.util.ExteranelKt;
import com.huami.sleep.view.PiecewiseLineView;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0007R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/huami/sleep/daysleep/breath/BreathQualityViewForDayForeign;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "wearHintCode", "", "a", "(Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;", FirebaseAnalytics.Param.LEVEL, "", "initData", "Lcom/huami/sleep/databinding/ItemBreathQualityDayI18nBinding;", "Lcom/huami/sleep/databinding/ItemBreathQualityDayI18nBinding;", "itemBreathQualityDayI18nBinding", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class BreathQualityViewForDayForeign extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ItemBreathQualityDayI18nBinding itemBreathQualityDayI18nBinding;

    @JvmOverloads
    public BreathQualityViewForDayForeign(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public BreathQualityViewForDayForeign(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ BreathQualityViewForDayForeign(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i);
    }

    private final String a(Context context, Integer wearHintCode) {
        boolean z = true;
        if (wearHintCode != null && wearHintCode.intValue() == 1) {
            return context.getResources().getString(R.string.sleep_breath_normal);
        }
        if (wearHintCode != null && wearHintCode.intValue() == 2) {
            return context.getResources().getString(R.string.sleep_breath_low);
        }
        if (wearHintCode != null && wearHintCode.intValue() == 3) {
            return context.getResources().getString(R.string.sleep_breath_high);
        }
        if (wearHintCode != null && wearHintCode.intValue() == 4) {
            return context.getString(R.string.sleep_breath_high);
        }
        if ((wearHintCode == null || wearHintCode.intValue() != 5) && (wearHintCode == null || wearHintCode.intValue() != 6)) {
            z = false;
        }
        return z ? context.getResources().getString(R.string.sleep_breath_short) : "";
    }

    public void _$_clearFindViewByIdCache() {
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    @SuppressLint({"SetTextI18n"})
    public final void initData(int level) {
        float f;
        BreathQualityRiskLevel.Companion companion = BreathQualityRiskLevel.INSTANCE;
        this.itemBreathQualityDayI18nBinding.breathDayStatusForeign.setText(companion.getTitleDesc(getContext().getApplicationContext(), companion.getByCodeValue(level)));
        this.itemBreathQualityDayI18nBinding.breathDayAdviceForeign.setText(a(getContext(), Integer.valueOf(level)));
        PiecewiseLineView piecewiseLineView = this.itemBreathQualityDayI18nBinding.piecewiseView;
        if (level == 6) {
            piecewiseLineView.setShowIndicator(false).refresh();
            return;
        }
        PiecewiseLineView showIndicator = piecewiseLineView.setShowIndicator(true);
        if (level == 1) {
            f = 1.0f;
        } else if (level == 2) {
            f = 3.0f;
        } else if (level == 3) {
            f = 5.0f;
        } else if (level == 4) {
            f = 7.0f;
        } else if (level != 5) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        showIndicator.setValue(f).refresh();
    }

    @JvmOverloads
    public BreathQualityViewForDayForeign(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ItemBreathQualityDayI18nBinding itemBreathQualityDayI18nBindingInflate = ItemBreathQualityDayI18nBinding.inflate(LayoutInflater.from(context), this, true);
        this.itemBreathQualityDayI18nBinding = itemBreathQualityDayI18nBindingInflate;
        itemBreathQualityDayI18nBindingInflate.piecewiseView.setPiecewiseColor(ExteranelKt.color(context, R.color.s15), ExteranelKt.color(context, R.color.s34), ExteranelKt.color(context, R.color.s31), ExteranelKt.color(context, R.color.p3)).setMaxValue(8).showIndicator(false);
    }
}
