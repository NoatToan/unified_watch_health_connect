package com.xiaomi.fitness.sport_export.utils;

import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"oneTrackOnClick", "", "homeDataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "dataStatus", "", "sport-export_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class OneTrackExtKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HomeDataType.values().length];
            try {
                iArr[HomeDataType.V02_MAX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HomeDataType.RUNNING_INDICATOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HomeDataType.PHYSICAL_STATUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HomeDataType.TRAINING_LOAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void oneTrackOnClick(@NotNull HomeDataType homeDataType, int i) {
        String str;
        Intrinsics.checkNotNullParameter(homeDataType, "homeDataType");
        int i2 = WhenMappings.$EnumSwitchMapping$0[homeDataType.ordinal()];
        if (i2 == 1) {
            str = FitnessPersistKey.Vo2Max;
        } else if (i2 == 2) {
            str = "stamina_level";
        } else if (i2 != 3) {
            str = i2 != 4 ? "" : FitnessPersistKey.TrainingLoad;
        } else {
            str = "training_stress_balance";
        }
        com.example.statistics.export.OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("click_v3", "56.2.0.1.36283"), "name", "workout_tab_training_indicators", "type", str, "status", Integer.valueOf(i));
    }
}
