package com.xiaomi.hm.health.healthdata.core.third;

import com.xiaomi.hm.health.healthdata.core.third.impl.BasalMetabolismDtImpl;
import com.xiaomi.hm.health.healthdata.core.third.impl.BmiDtImpl;
import com.xiaomi.hm.health.healthdata.core.third.impl.BodyFatDtImpl;
import com.xiaomi.hm.health.healthdata.core.third.impl.BoneDtImpl;
import com.xiaomi.hm.health.healthdata.core.third.impl.MuscleDtImpl;
import com.xiaomi.hm.health.healthdata.core.third.impl.ProteinDtImpl;
import com.xiaomi.hm.health.healthdata.core.third.impl.SkeletalMuscleImpl;
import com.xiaomi.hm.health.healthdata.core.third.impl.SubcutaneousFatImpl;
import com.xiaomi.hm.health.healthdata.core.third.impl.VisceralFatDtImpl;
import com.xiaomi.hm.health.healthdata.core.third.impl.WaterDtImpl;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/third/ThirdDataOperationFactory;", "", "Lcom/xiaomi/hm/health/healthdata/dto/HealthDataType;", "type", "Lcom/xiaomi/hm/health/healthdata/core/third/ThirdDataDtApi;", "createOpAction", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ThirdDataOperationFactory {

    @NotNull
    public static final ThirdDataOperationFactory INSTANCE = new ThirdDataOperationFactory();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HealthDataType.values().length];
            iArr[HealthDataType.BMI.ordinal()] = 1;
            iArr[HealthDataType.BODY_FAT.ordinal()] = 2;
            iArr[HealthDataType.WATER.ordinal()] = 3;
            iArr[HealthDataType.VISCERAL_FAT.ordinal()] = 4;
            iArr[HealthDataType.MUSCLE.ordinal()] = 5;
            iArr[HealthDataType.PROTEIN.ordinal()] = 6;
            iArr[HealthDataType.BASAL_METABOLISM.ordinal()] = 7;
            iArr[HealthDataType.BONE.ordinal()] = 8;
            iArr[HealthDataType.SKELETAL_MUSCLE.ordinal()] = 9;
            iArr[HealthDataType.SUBCUTANEOUS_FAT.ordinal()] = 10;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ThirdDataOperationFactory() {
    }

    @Nullable
    public final ThirdDataDtApi createOpAction(@NotNull HealthDataType type) {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return new BmiDtImpl();
            case 2:
                return new BodyFatDtImpl();
            case 3:
                return new WaterDtImpl();
            case 4:
                return new VisceralFatDtImpl();
            case 5:
                return new MuscleDtImpl();
            case 6:
                return new ProteinDtImpl();
            case 7:
                return new BasalMetabolismDtImpl();
            case 8:
                return new BoneDtImpl();
            case 9:
                return new SkeletalMuscleImpl();
            case 10:
                return new SubcutaneousFatImpl();
            default:
                return null;
        }
    }
}
