package com.xiaomi.fit.fitness.device.hm.parse.repo;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.device.hm.api.ParseResultItem;
import com.xiaomi.fit.fitness.device.hm.parse.repo.HmManualStressParse;
import com.xiaomi.fit.fitness.device.hm.parse.utils.HMParseUtilKt;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.data.item.StressItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.hm.health.bt.sdk.data.PaiData;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000fR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/parse/repo/HmManualStressParse;", "Lcom/xiaomi/fit/fitness/device/hm/parse/repo/IHmDataParseByCategory;", "<init>", "()V", "sendDataRecord", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "getSendDataRecord", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "sendDataRecord$delegate", "Lkotlin/Lazy;", "parse", "Lcom/xiaomi/fit/fitness/device/hm/api/ParseResultItem;", "sid", "", "data", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HmManualStressParse implements IHmDataParseByCategory {

    /* JADX INFO: renamed from: sendDataRecord$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sendDataRecord = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: w9c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HmManualStressParse.sendDataRecord_delegate$lambda$0();
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
        long j = 0;
        int i = 0;
        try {
            JSONArray jSONArray = new JSONArray(str2);
            int length = jSONArray.length();
            int i2 = 0;
            while (i < length) {
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    long jOptLong = jSONObjectOptJSONObject.optLong("timestamp");
                    String strOptString = jSONObjectOptJSONObject.optString("value");
                    int iOptInt = jSONObjectOptJSONObject.optInt("timeZone");
                    Intrinsics.checkNotNull(strOptString);
                    StressItem stressItem = new StressItem(jOptLong / ((long) 1000), Integer.parseInt(strOptString));
                    long jOptLong2 = jSONObjectOptJSONObject.optLong(PaiData.LAST_SYNC_TIME);
                    JSONArray jSONArray2 = jSONArray;
                    boolean zRecordManualStress = getSendDataRecord().recordManualStress(str, FitnessDateUtils.getTzOffsetInSecBy15min(iOptInt), stressItem);
                    FitnessLogUtils.i(HMParseUtilKt.TAG, "HmManualStressParse item=" + stressItem + "**time=" + jOptLong + "**result=" + zRecordManualStress);
                    if (!zRecordManualStress) {
                        return new ParseResultItem(false, 0, 0L, 6, null);
                    }
                    if (j < jOptLong2) {
                        i2 = iOptInt;
                        j = jOptLong2;
                    }
                    i++;
                    jSONArray = jSONArray2;
                } catch (Exception e) {
                    e = e;
                    i = i2;
                    FitnessLogUtils.e(HMParseUtilKt.TAG, "HmManualStressParse " + e.getMessage(), e);
                    return new ParseResultItem(true, i, j);
                }
            }
            return new ParseResultItem(true, i2, j);
        } catch (Exception e2) {
            e = e2;
        }
    }
}
