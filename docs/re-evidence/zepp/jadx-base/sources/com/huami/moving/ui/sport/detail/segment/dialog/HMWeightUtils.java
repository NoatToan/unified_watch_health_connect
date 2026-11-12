package com.huami.moving.ui.sport.detail.segment.dialog;

import android.content.Context;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.huami.moving.R;
import com.huami.moving.model.StrengthTrainingAction;
import com.huami.moving.ui.animator.AnimatorViewWrapper;
import com.huami.moving.utils.StrenthTrainingUtils;
import com.huami.tools.analytics.DbUtils;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/moving/ui/sport/detail/segment/dialog/HMWeightUtils;", "", "<init>", "()V", "Companion", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class HMWeightUtils {
    public static final float AS_2_KG = 0.02834f;
    public static final int GRAM = 2;
    public static final float GRAM_2_KG = 0.001f;
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

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<String> a = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b(\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b.\u0010/J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001e\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004J\u0016\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004J\u0016\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004J\u0016\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0004J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004J&\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004J\u0016\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0004J\u0016\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0004R\u001d\u0010\u001e\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010 R\u0016\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010%\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010 R\u0016\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\"R\u0016\u0010'\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\"R\u0016\u0010(\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010 R\u0016\u0010)\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\"R\u0016\u0010*\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010 R\u0016\u0010+\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\"R\u0016\u0010,\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\"R\u0016\u0010-\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010 ¨\u00060"}, d2 = {"Lcom/huami/moving/ui/sport/detail/segment/dialog/HMWeightUtils$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "unit", "", "b", "", "weight", "unitFrom", "unitTo", "convertTo", "convertToKg", "weightInKg", "convertFromKg", "value", AnimatorViewWrapper.SCALE, "scaleFloat", "getWeightUnitString", "strengthTrainType", "getWeightAndUnit", "style", "getSwimStyleString", "trainType", "getTrainTypeString", "defaultValue$delegate", "Lkotlin/Lazy;", "a", "()Ljava/lang/String;", "defaultValue", "AS_2_KG", "F", "GRAM", LogUtil.I, "GRAM_2_KG", ExpandedProductParsedResult.KILOGRAM, "KG_2_KG", "OUNCE", "SJ", "SJ_2_KG", HTTP.ST, "ST_2_KG", "ST_TO_YB", "YB", "YB_2_KG", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ KProperty<Object>[] a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "defaultValue", "getDefaultValue()Ljava/lang/String;"))};

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String a() {
            return (String) HMWeightUtils.a.getValue();
        }

        private final String b(Context context, int unit) {
            if (unit == 0) {
                if (context == null) {
                    return null;
                }
                return context.getString(R.string.segment_weight_unit_kg);
            }
            if (unit != 1) {
                if (context == null) {
                    return null;
                }
                return context.getString(R.string.segment_weight_unit_kg);
            }
            if (context == null) {
                return null;
            }
            return context.getString(R.string.segment_weight_unit_lb);
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

        @NotNull
        public final String getSwimStyleString(@NotNull Context context, int style) {
            String string;
            if (style == 1) {
                string = context.getString(R.string.sport_swim_style_breaststroke);
            } else if (style == 2) {
                string = context.getString(R.string.sport_swim_style_freestyle);
            } else if (style == 3) {
                string = context.getString(R.string.sport_swim_style_backstroke);
            } else if (style != 4) {
                string = style != 6 ? HMWeightUtils.INSTANCE.a() : context.getString(R.string.sport_swim_style_butterfly);
            } else {
                string = context.getString(R.string.sport_swim_style_medley);
            }
            return string == null ? a() : string;
        }

        @NotNull
        public final String getTrainTypeString(@NotNull Context context, int trainType) {
            switch (trainType) {
                case 1:
                    return context.getString(R.string.sport_training_group_warm_up);
                case 2:
                    return context.getString(R.string.sport_training_group_training);
                case 3:
                    return context.getString(R.string.sport_training_group_rest);
                case 4:
                    return context.getString(R.string.sport_training_group_relax);
                case 5:
                    return context.getString(R.string.sport_training_group_recover);
                case 6:
                    return context.getString(R.string.sport_training_group_quick_walk);
                case 7:
                    return context.getString(R.string.sport_training_group_slow_walk);
                case 8:
                    return context.getString(R.string.sport_training_group_slow_run);
                case 9:
                    return context.getString(R.string.sport_training_group_quick_run);
                case 10:
                    return context.getString(R.string.sport_training_group_burn_fat_walk);
                case 11:
                    return context.getString(R.string.sport_training_group_burn_fat_run);
                case 12:
                    return context.getString(R.string.sport_training_group_sprints);
                case 13:
                    return context.getString(R.string.sport_training_group_warm_up_run);
                case 14:
                    return context.getString(R.string.sport_training_group_recover_run);
                default:
                    return HMWeightUtils.INSTANCE.a();
            }
        }

        @NotNull
        public final String getWeightAndUnit(@NotNull Context context, int weight, int unit, int strengthTrainType) {
            List<StrengthTrainingAction> listFindStrenthTrainingByType = StrenthTrainingUtils.INSTANCE.findStrenthTrainingByType(context, Integer.valueOf(strengthTrainType));
            int selfWeightType = listFindStrenthTrainingByType == null || listFindStrenthTrainingByType.isEmpty() ? 1 : listFindStrenthTrainingByType.get(0).getSelfWeightType();
            if (weight <= 0) {
                return selfWeightType == 1 ? context.getString(R.string.segment_value_weight) : a();
            }
            return weight + b(context, unit);
        }

        @Nullable
        public final String getWeightUnitString(@Nullable Context context, int unit) {
            if (unit == 0) {
                return "(" + (context != null ? context.getString(R.string.unit_kg) : null) + ")";
            }
            if (unit == 1) {
                return "(" + (context != null ? context.getString(R.string.unit_yb) : null) + ")";
            }
            if (unit != 16) {
                return "(" + (context != null ? context.getString(R.string.unit_kg) : null) + ")";
            }
            return "(" + (context != null ? context.getString(R.string.unit_sj) : null) + ")";
        }

        public final float scaleFloat(float value, int scale) {
            return new BigDecimal(value).setScale(scale, 4).floatValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "--";
        }
    }
}
