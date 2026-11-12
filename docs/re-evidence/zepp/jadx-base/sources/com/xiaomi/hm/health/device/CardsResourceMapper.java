package com.xiaomi.hm.health.device;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.huami.bluetooth.profile.channel.module.DisplayType;
import com.huami.devicex.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/device/CardsResourceMapper;", "", "Lcom/huami/bluetooth/profile/channel/module/DisplayType;", "type", "", "loadTitle", "loadIcon", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class CardsResourceMapper {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DisplayType.values().length];
            iArr[DisplayType.WEIGHT.ordinal()] = 1;
            iArr[DisplayType.WEIGHT_TREND.ordinal()] = 2;
            iArr[DisplayType.BFR.ordinal()] = 3;
            iArr[DisplayType.MUSCLE_MASS.ordinal()] = 4;
            iArr[DisplayType.HEART_RATE.ordinal()] = 5;
            iArr[DisplayType.PBW.ordinal()] = 6;
            iArr[DisplayType.BONE_MASS.ordinal()] = 7;
            iArr[DisplayType.PROTEIN_RATE.ordinal()] = 8;
            iArr[DisplayType.BMR.ordinal()] = 9;
            iArr[DisplayType.VISCERAL_FAT_RATE.ordinal()] = 10;
            iArr[DisplayType.SUBCUTANEOUS_FAT.ordinal()] = 11;
            iArr[DisplayType.SKELETAL_MUSCLE.ordinal()] = 12;
            iArr[DisplayType.PHYSICAL_AGE.ordinal()] = 13;
            iArr[DisplayType.BMI.ordinal()] = 14;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @DrawableRes
    public final int loadIcon(@NotNull DisplayType type) {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return R.drawable.icon_scale_weight;
            case 2:
                return R.drawable.icon_scale_weight_rate;
            case 3:
                return R.drawable.icon_scale_bf;
            case 4:
                return R.drawable.icon_scale_muscle_mass;
            case 5:
                return R.drawable.icon_scale_hr;
            case 6:
                return R.drawable.icon_scale_water_rate;
            case 7:
                return R.drawable.icon_scale_bmd;
            case 8:
                return R.drawable.icon_scale_pro;
            case 9:
                return R.drawable.icon_scale_bm;
            case 10:
                return R.drawable.icon_scale_bai;
            case 11:
                return R.drawable.icon_scale_asfa;
            case 12:
                return R.drawable.icon_scale_sm;
            case 13:
                return R.drawable.icon_scale_body_age;
            case 14:
                return R.drawable.icon_scale_bmi;
            default:
                return 0;
        }
    }

    @StringRes
    public final int loadTitle(@NotNull DisplayType type) {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return R.string.weight_params_pre;
            case 2:
                return R.string.setting_weight_trend;
            case 3:
                return R.string.setting_bf;
            case 4:
                return R.string.setting_muscle_mass;
            case 5:
                return R.string.setting_app_hr;
            case 6:
                return R.string.setting_water_rate;
            case 7:
                return R.string.bone_value;
            case 8:
                return R.string.setting_pro;
            case 9:
                return R.string.setting_bm;
            case 10:
                return R.string.setting_bai;
            case 11:
                return R.string.health_data_subcutaneous_fat;
            case 12:
                return R.string.skeletal_muscle;
            case 13:
                return R.string.body_age;
            case 14:
                return R.string.bmi;
            default:
                return 0;
        }
    }
}
