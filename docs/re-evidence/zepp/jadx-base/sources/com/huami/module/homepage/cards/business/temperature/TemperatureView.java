package com.huami.module.homepage.cards.business.temperature;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.module.homepage.R;
import com.huami.module.homepage.cards.cardui.I18nNumberView;
import com.huami.module.homepage.cards.cardui.PiecewiseLineView;
import com.huami.module.homepage.databinding.HomepageItemCardTemperatureBinding;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.I18nKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.module.utils.HMSpannable;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010-\u001a\u00020,\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u00100\u001a\u00020\u0010¢\u0006\u0004\b1\u00102J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002J \u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001a\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\u001a\u001a\u00020\r2\b\b\u0001\u0010\u0019\u001a\u00020\u0010H\u0002J+\u0010\u001d\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u0016\u0010!\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0016\u0010$\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010#R\u0016\u0010%\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u0016\u0010&\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010#R\u0016\u0010'\u001a\u00020\u00108\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u001fR\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u00063"}, d2 = {"Lcom/huami/module/homepage/cards/business/temperature/TemperatureView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "temp", "Lcom/huami/module/homepage/cards/business/temperature/a;", "status", "", "unitIsCentigrade", "", "l", "temperature", "c", hl.k, "", "g", "b", "", GoogleApiAvailabilityLight.a, "show", "i", z.j, "m", "", "a", "e", "resId", "f", "", EcgData.TIMESTAMP_SERVER_UPDATED, "setTemperatureValue", "(FLjava/lang/Long;Z)V", LogUtil.I, "yellow", "green", "gray", "[I", "noneDataColors", "normalColors", "abnormalColors", "maxValue", "Lcom/huami/module/homepage/databinding/HomepageItemCardTemperatureBinding;", "h", "Lcom/huami/module/homepage/databinding/HomepageItemCardTemperatureBinding;", "binding", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class TemperatureView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int yellow;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int green;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int gray;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final int[] noneDataColors;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final int[] normalColors;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final int[] abnormalColors;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int maxValue;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final HomepageItemCardTemperatureBinding binding;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            iArr[a.NONE.ordinal()] = 1;
            iArr[a.NORMAL.ordinal()] = 2;
            iArr[a.ABNORMAL.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmOverloads
    public TemperatureView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public TemperatureView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ TemperatureView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final int[] a(a status) {
        int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1) {
            return this.noneDataColors;
        }
        if (i == 2) {
            return this.normalColors;
        }
        if (i == 3) {
            return this.abnormalColors;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void b(a status) {
        Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.ic_temperature_28_s20);
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(d(status));
        } else {
            DrawableCompat.setTint(drawable, d(status));
        }
        this.binding.icon.setImageDrawable(drawable);
    }

    private final float c(float temperature) {
        int i = this.maxValue;
        float f = i / 2.0f;
        if (temperature <= 35.0f) {
            return 0.0f;
        }
        if (temperature < 37.2f) {
            return ((temperature - 35.0f) / 2.2000008f) * f;
        }
        if (temperature == 37.2f) {
            return f;
        }
        return (temperature <= 37.2f || temperature >= 42.0f) ? i : (((temperature - 37.2f) / 4.799999f) * f) + f;
    }

    private final int d(a status) {
        int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1) {
            return this.gray;
        }
        if (i == 2) {
            return this.green;
        }
        if (i == 3) {
            return this.yellow;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final a e(float temperature, boolean unitIsCentigrade) {
        if (unitIsCentigrade) {
            if (temperature < 35.0f) {
                return a.NONE;
            }
            return temperature > 37.2f ? a.ABNORMAL : a.NORMAL;
        }
        if (temperature < 95.0f) {
            return a.NONE;
        }
        return temperature > 98.96f ? a.ABNORMAL : a.NORMAL;
    }

    private final String f(@StringRes int resId) {
        return getContext().getString(resId);
    }

    private final String g(float temperature, boolean unitIsCentigrade) {
        return I18nKt.i18n$default(temperature, 0, 1, null) + f(unitIsCentigrade ? R.string.homepage_temperature_unit_c : R.string.homepage_temperature_unit_f);
    }

    public static /* synthetic */ String h(TemperatureView temperatureView, float f, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return temperatureView.g(f, z);
    }

    private final void i(boolean show) {
        this.binding.mask.setVisibility(show ? 0 : 8);
    }

    private final void j(boolean unitIsCentigrade) {
        HomepageItemCardTemperatureBinding homepageItemCardTemperatureBinding = this.binding;
        if (unitIsCentigrade) {
            String strF = f(R.string.homepage_temperature_unit_c);
            I18nNumberView.setNumberAndUnit$default(homepageItemCardTemperatureBinding.temperatureNone, f(R.string.homepage_temperature_low_c), strF, false, 0, 12, null);
            I18nNumberView.setNumberAndUnit$default(homepageItemCardTemperatureBinding.temperatureNormal, f(R.string.homepage_temperature_middle_c), strF, true, 0, 8, null);
            I18nNumberView.setNumberAndUnit$default(homepageItemCardTemperatureBinding.temperatureAbnormal, f(R.string.homepage_temperature_high_c), strF, false, 0, 12, null);
            return;
        }
        String strF2 = f(R.string.homepage_temperature_unit_f);
        I18nNumberView.setNumberAndUnit$default(homepageItemCardTemperatureBinding.temperatureNone, f(R.string.homepage_temperature_low_f), strF2, false, 0, 12, null);
        I18nNumberView.setNumberAndUnit$default(homepageItemCardTemperatureBinding.temperatureNormal, f(R.string.homepage_temperature_middle_f), strF2, true, 0, 8, null);
        I18nNumberView.setNumberAndUnit$default(homepageItemCardTemperatureBinding.temperatureAbnormal, f(R.string.homepage_temperature_high_f), strF2, true, 0, 8, null);
    }

    private final void k(float temperature, a status, boolean unitIsCentigrade) {
        this.binding.pairCircleView.setValueText(status == a.NONE ? "--" : g(temperature, unitIsCentigrade)).setColor(d(status)).invalidate();
        b(status);
    }

    private final void l(float temp, a status, boolean unitIsCentigrade) {
        if (!unitIsCentigrade) {
            temp = (temp - 32) / 1.8f;
        }
        PiecewiseLineView piecewiseLineView = this.binding.piecewiseLineView;
        int[] iArrA = a(status);
        piecewiseLineView.setPiecewiseColor(Arrays.copyOf(iArrA, iArrA.length)).setValue(status == a.NONE ? 0.0f : c(temp)).refresh();
    }

    private final void m(a status) {
        String string;
        int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1) {
            string = "--";
        } else if (i == 2) {
            string = getContext().getString(R.string.homepage_item_card_temperature_standard);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            string = getContext().getString(R.string.homepage_item_card_temperature_heat);
        }
        String str = string;
        TextView textView = this.binding.temperatureStatus;
        CharSequence charSequenceBuild = str;
        if (HomeUtils.isChineseLanguage()) {
            charSequenceBuild = HMSpannable.append$default(HMSpannable.append$default(new HMSpannable(), getContext().getString(R.string.homepage_item_card_temperature), null, null, false, null, null, null, 126, null).addSpaceBlank(), str, null, 18, false, null, null, null, 122, null).build();
        }
        textView.setText(charSequenceBuild);
    }

    public static /* synthetic */ void setTemperatureValue$default(TemperatureView temperatureView, float f, Long l, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        temperatureView.setTemperatureValue(f, l, z);
    }

    public final void setTemperatureValue(float temperature, @Nullable Long updateTime, boolean unitIsCentigrade) {
        a aVarE = e(temperature, unitIsCentigrade);
        m(aVarE);
        this.binding.temperatureBar.setFirstTime(updateTime == null ? 0L : updateTime.longValue());
        j(unitIsCentigrade);
        l(temperature, aVarE, unitIsCentigrade);
        k(temperature, aVarE, unitIsCentigrade);
        i(aVarE == a.NONE);
    }

    @JvmOverloads
    public TemperatureView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int iLoadColor = ViewExtKt.loadColor(this, R.color.s33);
        this.yellow = iLoadColor;
        int iLoadColor2 = ViewExtKt.loadColor(this, R.color.s20);
        this.green = iLoadColor2;
        int iLoadColor3 = ViewExtKt.loadColor(this, R.color.s4);
        this.gray = iLoadColor3;
        this.noneDataColors = new int[]{iLoadColor3, iLoadColor3};
        int[] iArr = {iLoadColor2, iLoadColor3};
        this.normalColors = iArr;
        this.abnormalColors = new int[]{iLoadColor3, iLoadColor};
        this.maxValue = 7;
        HomepageItemCardTemperatureBinding homepageItemCardTemperatureBindingInflate = HomepageItemCardTemperatureBinding.inflate(LayoutInflater.from(context), this, true);
        PiecewiseLineView piecewiseLineView = homepageItemCardTemperatureBindingInflate.piecewiseLineView;
        piecewiseLineView.setMaxValue(7);
        piecewiseLineView.setPiecewiseColor(Arrays.copyOf(iArr, iArr.length));
        piecewiseLineView.invalidate();
        Unit unit = Unit.INSTANCE;
        this.binding = homepageItemCardTemperatureBindingInflate;
    }
}
