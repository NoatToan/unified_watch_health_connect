package com.huami.account.userinfo.utils;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.huami.moving.ui.animator.AnimatorViewWrapper;
import com.xiaomi.hm.health.manager.UnitManager;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004J\u0016\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004J\u001e\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\u0016\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0004J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0016\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0016\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0016\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001b¨\u0006#"}, d2 = {"Lcom/huami/account/userinfo/utils/WeightUtil;", "", "", "weightInKg", "", "unit", "", "getWeightValueStringForDisplay", "unitTo", "convertFromKg", "weight", "unitFrom", "convertToKg", "convertTo", "value", AnimatorViewWrapper.SCALE, "scaleFloat", "toUnitStr", ExpandedProductParsedResult.KILOGRAM, LogUtil.I, "SJ", "YB", HTTP.ST, "GRAM", "OUNCE", "ST_TO_YB", "YB_2_KG", "F", "AS_2_KG", "KG_2_KG", "SJ_2_KG", "GRAM_2_KG", "ST_2_KG", "<init>", "()V", "userinfo_release"}, k = 1, mv = {1, 5, 1})
public final class WeightUtil {
    public static final float AS_2_KG = 0.02834f;
    public static final int GRAM = 2;
    public static final float GRAM_2_KG = 0.001f;

    @NotNull
    public static final WeightUtil INSTANCE = new WeightUtil();
    public static final int KG = 0;
    public static final float KG_2_KG = 1.0f;
    public static final int OUNCE = 3;
    public static final int SJ = 16;
    public static final float SJ_2_KG = 0.5f;
    public static final int ST = 17;
    public static final float ST_2_KG = 6.35029f;
    public static final int ST_TO_YB = 14;
    public static final int YB = 1;
    public static final float YB_2_KG = 0.45359f;

    private WeightUtil() {
    }

    public final float convertFromKg(float weightInKg, int unitTo) {
        return convertTo(weightInKg, 0, unitTo);
    }

    public final float convertTo(float weight, int unitFrom, int unitTo) {
        float f;
        float f2;
        if (unitFrom != 0) {
            if (unitFrom != 1) {
                if (unitFrom == 16) {
                    if (unitTo == 0) {
                        return weight / 2.0f;
                    }
                    if (unitTo == 1) {
                        return scaleFloat(weight * 1.10231f, 2);
                    }
                    if (unitTo == 2) {
                        weight /= 0.001f;
                        f = 2;
                    } else {
                        if (unitTo == 16) {
                            return weight;
                        }
                        if (unitTo == 17) {
                            f = 12.70058f;
                        }
                    }
                    return weight / f;
                }
                if (unitFrom != 17) {
                    return weight;
                }
                if (unitTo == 0) {
                    return weight * 6.35029f;
                }
                if (unitTo == 1) {
                    f2 = 14;
                } else if (unitTo == 3) {
                    weight *= 14;
                    f2 = 16;
                } else if (unitTo == 16) {
                    weight *= 6.35029f;
                    f2 = 2;
                } else if (unitTo == 17) {
                    return weight;
                }
            } else {
                if (unitTo == 0) {
                    return scaleFloat(weight * 0.45359f, 2);
                }
                if (unitTo == 1) {
                    return weight;
                }
                if (unitTo != 3) {
                    if (unitTo == 16) {
                        return scaleFloat(weight * 0.90718f, 2);
                    }
                    if (unitTo == 17) {
                        f = 14;
                        return weight / f;
                    }
                }
                f2 = 16;
            }
            return weight * f2;
        }
        if (unitTo == 0) {
            return weight;
        }
        if (unitTo == 1) {
            return scaleFloat(weight * 2.20462f, 2);
        }
        if (unitTo == 2) {
            return weight / 0.001f;
        }
        if (unitTo == 16) {
            return weight * 2.0f;
        }
        if (unitTo == 17) {
            return weight / 6.35029f;
        }
        return 0.0f;
    }

    public final float convertToKg(float weight, int unitFrom) {
        return convertTo(weight, unitFrom, 0);
    }

    @Nullable
    public final String getWeightValueStringForDisplay(float weightInKg, int unit) {
        int i = 0;
        int i2 = 1;
        if (unit == 17) {
            int iConvertFromKg = (int) (convertFromKg(weightInKg, 1) + 0.5f);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format(Locale.getDefault(), "%d:%d", Arrays.copyOf(new Object[]{Integer.valueOf(iConvertFromKg / 14), Integer.valueOf(iConvertFromKg % 14)}, 2));
        }
        float fConvertFromKg = convertFromKg(weightInKg, unit);
        if (unit == 0 && 0.1f < Math.abs(weightInKg) && Math.abs(weightInKg) < 100.0f) {
            i2 = 2;
        }
        if (unit == 2) {
            fConvertFromKg = new BigDecimal(fConvertFromKg).setScale(0, 4).floatValue();
        } else {
            i = i2;
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMinimumFractionDigits(i);
        numberInstance.setMaximumFractionDigits(i);
        return numberInstance.format(fConvertFromKg);
    }

    public final float scaleFloat(float value, int scale) {
        return new BigDecimal(value).setScale(scale, 4).floatValue();
    }

    @Nullable
    public final String toUnitStr(int unit) {
        return UnitManager.getInstance().getWeightUnitString(unit);
    }
}
