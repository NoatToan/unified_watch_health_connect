package com.xiaomi.fitness.repo.heartrate;

import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.distribute.DailyHrDistribute;
import com.xiaomi.fitness.account.HrZone;
import com.xiaomi.fitness.account.HrZoneLevel;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/repo/heartrate/HeartRateDistribute;", "", "<init>", "()V", "computeHrDistribute", "Lcom/xiaomi/fit/fitness/export/data/distribute/DailyHrDistribute;", "list", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimesDataRecordInt;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HeartRateDistribute {

    @NotNull
    public static final HeartRateDistribute INSTANCE = new HeartRateDistribute();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HrZoneLevel.values().length];
            try {
                iArr[HrZoneLevel.Extreme.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HrZoneLevel.Anaerobic.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HrZoneLevel.Aerobic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HrZoneLevel.FatBurning.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HrZoneLevel.WarmUp.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HrZoneLevel.Smooth.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private HeartRateDistribute() {
    }

    @NotNull
    public final DailyHrDistribute computeHrDistribute(@NotNull List<TimesDataRecordInt> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        DailyHrDistribute dailyHrDistribute = new DailyHrDistribute();
        if (list.isEmpty()) {
            return dailyHrDistribute;
        }
        HrZone hrZone = new HrZone();
        Iterator<TimesDataRecordInt> it = list.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (it.hasNext()) {
            int[] valueArray = it.next().getValueArray();
            if (valueArray != null) {
                if (!(valueArray.length == 0)) {
                    for (int i7 : valueArray) {
                        if (i7 != 0) {
                            switch (WhenMappings.$EnumSwitchMapping$0[hrZone.getHrZone(i7).ordinal()]) {
                                case 1:
                                    i++;
                                    break;
                                case 2:
                                    i2++;
                                    break;
                                case 3:
                                    i3++;
                                    break;
                                case 4:
                                    i4++;
                                    break;
                                case 5:
                                    i5++;
                                    break;
                                case 6:
                                    i6++;
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        dailyHrDistribute.setExtremeDuration(i);
        dailyHrDistribute.setAnaerobicDuration(i2);
        dailyHrDistribute.setAerobicDuration(i3);
        dailyHrDistribute.setFatBurningDuration(i4);
        dailyHrDistribute.setWarmUpDuration(i5);
        dailyHrDistribute.setSmoothDuration(i6);
        return dailyHrDistribute;
    }
}
