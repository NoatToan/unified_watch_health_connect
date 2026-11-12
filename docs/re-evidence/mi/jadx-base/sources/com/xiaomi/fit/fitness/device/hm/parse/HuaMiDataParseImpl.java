package com.xiaomi.fit.fitness.device.hm.parse;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.device.hm.api.HuaMiParseType;
import com.xiaomi.fit.fitness.device.hm.api.IHuamiDataParse;
import com.xiaomi.fit.fitness.device.hm.api.ParseResultItem;
import com.xiaomi.fit.fitness.device.hm.parse.repo.HmAfibDataParse;
import com.xiaomi.fit.fitness.device.hm.parse.repo.HmAllDayStressParse;
import com.xiaomi.fit.fitness.device.hm.parse.repo.HmCaloriesParse;
import com.xiaomi.fit.fitness.device.hm.parse.repo.HmDailyDataParse;
import com.xiaomi.fit.fitness.device.hm.parse.repo.HmManualHrParse;
import com.xiaomi.fit.fitness.device.hm.parse.repo.HmManualStressParse;
import com.xiaomi.fit.fitness.device.hm.parse.repo.HmPaiDataParse;
import com.xiaomi.fit.fitness.device.hm.parse.repo.HmSpo2DataParse;
import com.xiaomi.fit.fitness.device.hm.parse.repo.HmSportRecordParse;
import com.xiaomi.fit.fitness.device.hm.parse.repo.HmSportReportParse;
import com.xiaomi.fit.fitness.device.hm.parse.repo.HmTrainingLoadParse;
import com.xiaomi.fit.fitness.device.hm.parse.repo.IHmDataParseByCategory;
import com.xiaomi.fit.fitness.device.hm.parse.utils.HMParseUtilKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/parse/HuaMiDataParseImpl;", "Lcom/xiaomi/fit/fitness/device/hm/api/IHuamiDataParse;", "<init>", "()V", "dataParse", "Lcom/xiaomi/fit/fitness/device/hm/api/ParseResultItem;", "dataType", "Lcom/xiaomi/fit/fitness/device/hm/api/HuaMiParseType;", "sid", "", "data", "(Lcom/xiaomi/fit/fitness/device/hm/api/HuaMiParseType;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getParseInstance", "Lcom/xiaomi/fit/fitness/device/hm/parse/repo/IHmDataParseByCategory;", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HuaMiDataParseImpl implements IHuamiDataParse {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HuaMiParseType.values().length];
            try {
                iArr[HuaMiParseType.AFib.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HuaMiParseType.AllDayStress.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HuaMiParseType.ManualStress.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HuaMiParseType.ManualHr.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HuaMiParseType.Pai.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HuaMiParseType.Spo2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HuaMiParseType.DailyData.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HuaMiParseType.SportReport.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HuaMiParseType.SportRecord.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[HuaMiParseType.Calories.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[HuaMiParseType.TrainingLoad.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final IHmDataParseByCategory getParseInstance(HuaMiParseType dataType) {
        switch (WhenMappings.$EnumSwitchMapping$0[dataType.ordinal()]) {
            case 1:
                return new HmAfibDataParse();
            case 2:
                return new HmAllDayStressParse();
            case 3:
                return new HmManualStressParse();
            case 4:
                return new HmManualHrParse();
            case 5:
                return new HmPaiDataParse();
            case 6:
                return new HmSpo2DataParse();
            case 7:
                return new HmDailyDataParse();
            case 8:
                return new HmSportReportParse();
            case 9:
                return new HmSportRecordParse();
            case 10:
                return new HmCaloriesParse();
            case 11:
                return new HmTrainingLoadParse();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.xiaomi.fit.fitness.device.hm.api.IHuamiDataParse
    @Nullable
    public Object dataParse(@NotNull HuaMiParseType huaMiParseType, @NotNull String str, @NotNull String str2, @NotNull Continuation<? super ParseResultItem> continuation) {
        FitnessLogUtils.i(HMParseUtilKt.TAG, "dataParse type=" + huaMiParseType.name() + "**data=" + str2);
        return getParseInstance(huaMiParseType).parse(str, str2, continuation);
    }
}
