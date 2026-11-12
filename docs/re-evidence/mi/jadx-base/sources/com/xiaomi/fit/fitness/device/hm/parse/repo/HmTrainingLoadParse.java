package com.xiaomi.fit.fitness.device.hm.parse.repo;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.device.hm.api.ParseResultItem;
import com.xiaomi.fit.fitness.device.hm.parse.repo.HmTrainingLoadParse;
import com.xiaomi.fit.fitness.device.hm.parse.utils.HMParseUtilKt;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.data.item.TrainingLoadItem;
import com.xiaomi.fit.fitness.export.data.item.Vo2MaxItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000fR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/parse/repo/HmTrainingLoadParse;", "Lcom/xiaomi/fit/fitness/device/hm/parse/repo/IHmDataParseByCategory;", "<init>", "()V", "sendDataRecord", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "getSendDataRecord", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "sendDataRecord$delegate", "Lkotlin/Lazy;", "parse", "Lcom/xiaomi/fit/fitness/device/hm/api/ParseResultItem;", "sid", "", "data", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HmTrainingLoadParse implements IHmDataParseByCategory {

    /* JADX INFO: renamed from: sendDataRecord$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sendDataRecord = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: aac
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HmTrainingLoadParse.sendDataRecord_delegate$lambda$0();
        }
    });

    private final FitnessDataRecorder getSendDataRecord() {
        return (FitnessDataRecorder) this.sendDataRecord.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataRecorder sendDataRecord_delegate$lambda$0() {
        return FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE);
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.IHmDataParseByCategory
    @Nullable
    public Object parse(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super ParseResultItem> continuation) {
        int currentTZOffsetIn15min = FitnessDateUtils.getCurrentTZOffsetIn15min();
        long jOptLong = 0;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int iOptInt = jSONObject.optInt("dayId");
            long seconds = TimeUnit.DAYS.toSeconds(iOptInt);
            int iOptInt2 = jSONObject.optInt("weeklyTLSum");
            int iOptInt3 = jSONObject.optInt("sportVO2Max");
            jOptLong = jSONObject.optLong("updateTime");
            TrainingLoadItem trainingLoadItem = new TrainingLoadItem(seconds, iOptInt2);
            trainingLoadItem.setCurrentDayTL(Boxing.boxInt(jSONObject.optInt("currentDayTL")));
            trainingLoadItem.setWtlSumOptimalMin(Boxing.boxInt(jSONObject.optInt("weeklyTLSumOptimalMin")));
            trainingLoadItem.setWtlSumOverreaching(Boxing.boxInt(jSONObject.optInt("weeklyTLSumOverreaching")));
            trainingLoadItem.setWtlSumOptimalMax(Boxing.boxInt(jSONObject.optInt("weeklyTLSumOptimalMax")));
            boolean zRecordTrainingLoad = getSendDataRecord().recordTrainingLoad(str, 0, trainingLoadItem);
            int i = iOptInt3 / 100;
            if (i > 0) {
                getSendDataRecord().recordV02max(str, 0, new Vo2MaxItem(seconds, i));
            }
            FitnessLogUtils.i(HMParseUtilKt.TAG, "HmTrainingLoadParse item=" + trainingLoadItem + "**result=" + zRecordTrainingLoad + "**time=" + seconds + "**dayId=" + iOptInt);
            return new ParseResultItem(zRecordTrainingLoad, currentTZOffsetIn15min, jOptLong);
        } catch (Exception e) {
            FitnessLogUtils.e(HMParseUtilKt.TAG, "HmTrainingLoadParse " + e.getMessage(), e);
            return new ParseResultItem(true, currentTZOffsetIn15min, jOptLong);
        }
    }
}
