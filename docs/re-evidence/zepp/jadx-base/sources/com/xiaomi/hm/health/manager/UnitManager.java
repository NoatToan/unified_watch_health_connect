package com.xiaomi.hm.health.manager;

import android.content.Context;
import android.text.TextUtils;
import com.huami.midong.personinfo.R;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.baseutil.UnitUtils;
import com.xiaomi.hm.health.eventbus.EventUnitChanged;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import de.greenrobot.event.EventBus;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes21.dex */
public class UnitManager {
    public static final int GRAM = 2;
    public static final int KG = 0;
    public static final int ONE_MILE_FEET = 5280;
    public static final int OUNCE = 3;
    public static final int SJ = 16;
    public static final int ST = 17;
    public static final int YB = 1;
    private static final String a = "UnitManager";
    private static final float b = 453.59f;
    private static final float c = 28.34f;
    private static final float d = 3.78f;
    private static final float e = 0.34f;
    private static final float f = 6350.293f;
    private static final float g = 1000.0f;
    private static final float h = 500.0f;
    private static Context i = null;
    private static OnUnitChangeCallback j = null;
    private static volatile UnitManager k = null;
    private static float l = 10.0f;
    private static float m = 100.0f;
    private static float n = 1000.0f;

    public @interface LENGTH {
    }

    public interface OnUnitChangeCallback {
        void onChange();
    }

    public @interface WEIGHT {
    }

    private UnitManager() {
        HMLog.d(a, "mili config : " + a().toString(), new Object[0]);
        c();
        HMLog.d(a, "length unit:" + getLengthUnit() + "; weight unit:" + getWeightUnit(), new Object[0]);
    }

    private HMMiliConfig a() {
        return HMPersonInfo.getInstance().getMiliConfig();
    }

    private HMPersonInfo b() {
        return HMPersonInfo.getInstance();
    }

    private void c() {
        EventBus.getDefault().post(new EventUnitChanged(getLengthUnit(), getWeightUnit()));
        HMLog.d(a, "post EventUnitChanged", new Object[0]);
    }

    private void d() {
        b().saveInfo(2);
        OnUnitChangeCallback onUnitChangeCallback = j;
        if (onUnitChangeCallback != null) {
            onUnitChangeCallback.onChange();
        }
    }

    public static UnitManager getInstance() {
        if (k == null) {
            synchronized (UnitManager.class) {
                if (k == null) {
                    k = new UnitManager();
                }
            }
        }
        return k;
    }

    public static void init(Context context, OnUnitChangeCallback onUnitChangeCallback) {
        i = context;
        j = onUnitChangeCallback;
    }

    public void clear() {
        k = null;
    }

    public String convertKGByUnit(String str) {
        try {
            if (!TextUtils.isEmpty(str) && str.contains(",")) {
                str = str.replaceAll(",", ".");
            }
            float f2 = Float.parseFloat(str);
            int weightUnit = getInstance().getWeightUnit();
            if (weightUnit == 0) {
                if (f2 >= 1000.0f) {
                    return getInstance().formatDecimal(f2 / 1000.0f, 2);
                }
                return ((int) f2) + "";
            }
            if (weightUnit == 1) {
                return f2 >= b ? getInstance().formatDecimal(f2 / b, 2) : getInstance().formatDecimal(f2 / c, 2);
            }
            if (weightUnit == 16) {
                if (f2 >= 500.0f) {
                    return getInstance().formatDecimal(f2 / 500.0f, 2);
                }
                return ((int) f2) + "";
            }
            if (weightUnit != 17) {
                return str;
            }
            if (f2 >= f) {
                return getInstance().formatDecimal(f2 / f, 2);
            }
            return ((int) f2) + "";
        } catch (Exception unused) {
            return str;
        }
    }

    public String convertLtoGL(String str) {
        if (!Language.isUSA()) {
            return str;
        }
        float f2 = Float.parseFloat(str);
        return f2 >= d ? getInstance().formatDecimal(f2 / d, 2) : getInstance().formatDecimal(f2 / e, 2);
    }

    public String convertUnitByKg(String str) {
        try {
            if (!TextUtils.isEmpty(str) && str.contains(",")) {
                str = str.replaceAll(",", ".");
            }
            float f2 = Float.parseFloat(str);
            int weightUnit = getInstance().getWeightUnit();
            if (weightUnit == 0) {
                return f2 >= 1000.0f ? i.getString(R.string.unit_kg) : i.getString(R.string.unit_gram);
            }
            if (weightUnit == 1) {
                return f2 >= b ? i.getString(R.string.unit_yb) : i.getString(R.string.unit_as);
            }
            if (weightUnit == 16) {
                return f2 >= 500.0f ? i.getString(R.string.unit_sj) : i.getString(R.string.unit_gram);
            }
            if (weightUnit == 17) {
                return f2 >= f ? i.getString(R.string.unit_stone) : i.getString(R.string.unit_gram);
            }
            return i.getString(R.string.unit_gram);
        } catch (Exception unused) {
            return i.getString(R.string.unit_gram);
        }
    }

    public String convertUnitLtoGL(String str) {
        if (Language.isUSA()) {
            return Float.parseFloat(str) >= d ? i.getString(R.string.unit_gl) : i.getString(R.string.unit_pt);
        }
        return i.getString(R.string.unit_liter);
    }

    public String formatDecimal(double d2, int i2) {
        return formatDecimal(d2, i2, RoundingMode.FLOOR);
    }

    public String formatFatValue(int i2) {
        return formatDecimal((i2 * 10.0f) / 77.0f, 2);
    }

    public String formatOilValue(int i2) {
        return formatDecimal(((i2 / 1000.0f) / 100.0f) * 8.0f, 2);
    }

    public String formatValue(int i2, int i3) {
        return formatValue(i2, i3, RoundingMode.FLOOR);
    }

    @LENGTH
    public int getLengthUnit() {
        return a().getUnit() == 0 ? 0 : 1;
    }

    public String getUnit(int i2) {
        int lengthUnit = getLengthUnit();
        if (lengthUnit != 0) {
            return lengthUnit != 1 ? i.getString(R.string.unit_m) : i.getString(R.string.unit_mile);
        }
        return i.getString(R.string.unit_km);
    }

    public String getUnitStr() {
        Context context;
        int i2;
        if (getLengthUnit() == 0) {
            context = i;
            i2 = R.string.unit_km;
        } else {
            context = i;
            i2 = R.string.unit_mile;
        }
        return context.getString(i2);
    }

    @WEIGHT
    public int getWeightUnit() {
        int weightUnit = a().getWeightUnit();
        if (weightUnit == 0 || weightUnit == 1 || weightUnit == 16 || weightUnit == 17) {
            return weightUnit;
        }
        return 0;
    }

    public String getWeightUnitString(int i2) {
        Context context = i;
        int i3 = R.string.unit_kg;
        String string = context.getString(i3);
        if (i2 == 0) {
            return i.getString(i3);
        }
        if (i2 == 1) {
            return i.getString(R.string.unit_yb);
        }
        if (i2 == 2) {
            return i.getString(R.string.unit_gram);
        }
        if (i2 == 3) {
            return i.getString(R.string.unit_as);
        }
        if (i2 != 16) {
            return i2 != 17 ? string : i.getString(R.string.unit_stone);
        }
        return i.getString(R.string.unit_sj);
    }

    public String getWeightUnitStringLt(int i2) {
        if (i2 == 0) {
            return i.getString(R.string.unit_gram);
        }
        if (i2 == 1) {
            return i.getString(R.string.unit_yb);
        }
        if (i2 == 16) {
            return i.getString(R.string.unit_sj);
        }
        return i2 == 17 ? i.getString(R.string.unit_stone) : i.getString(R.string.unit_gram);
    }

    public boolean isMetric() {
        return getLengthUnit() == 0;
    }

    public void setLengthUnit(@LENGTH int i2) {
        HMLog.d(a, "length unit :" + getLengthUnit() + " --> " + i2, new Object[0]);
        if (i2 != getLengthUnit()) {
            a().setUnit(i2);
            d();
            c();
        }
    }

    public void setWeightUnit(@WEIGHT int i2) {
        int weightUnit = getWeightUnit();
        HMLog.d(a, "weight unit :" + weightUnit + " --> " + i2, new Object[0]);
        if (i2 != weightUnit) {
            a().setWeightUnit(i2);
            d();
            c();
        }
    }

    public String formatDecimal(double d2, int i2, RoundingMode roundingMode) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Accuracy must >= 0");
        }
        String str = "###0";
        if (i2 > 0) {
            str = "###0.";
            for (int i3 = 0; i3 < i2; i3++) {
                str = str + "0";
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat(str);
        decimalFormat.setRoundingMode(roundingMode);
        return decimalFormat.format(d2);
    }

    public String formatValue(int i2, int i3, RoundingMode roundingMode) {
        float f2 = i2;
        int lengthUnit = getLengthUnit();
        int i4 = 2;
        if (lengthUnit == 0) {
            float f3 = l;
            if (f2 < f3 && f2 > 0.0f) {
                f2 = f3;
            }
            float f4 = f2 / 1000.0f;
            if (f4 >= m) {
                i4 = f4 < n ? 1 : 0;
            }
            return formatDecimal(f4, f4 != 0.0f ? i4 : 1, roundingMode);
        }
        if (lengthUnit != 1) {
            return i2 + "";
        }
        float fM2mileNew = UnitUtils.m2mileNew(f2, i3);
        if (fM2mileNew >= m) {
            i4 = fM2mileNew < n ? 1 : 0;
        }
        String decimal = formatDecimal(fM2mileNew, fM2mileNew != 0.0f ? i4 : 1, roundingMode);
        HMLog.d(a, "distance : " + i2 + "m ; " + decimal + "mile", new Object[0]);
        return decimal;
    }

    public String formatValue(int i2) {
        if (getLengthUnit() == 0) {
            return formatValue(i2, 1);
        }
        return formatValue(i2, 2);
    }

    public String formatValue(int i2, boolean z) {
        if (z) {
            if (getLengthUnit() == 0) {
                return formatDecimal(i2 / 1000.0f, 1);
            }
            return formatValue(i2, 2);
        }
        return formatValue(i2);
    }
}
