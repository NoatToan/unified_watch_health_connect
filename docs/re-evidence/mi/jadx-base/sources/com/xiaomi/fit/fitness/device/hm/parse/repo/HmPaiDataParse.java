package com.xiaomi.fit.fitness.device.hm.parse.repo;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.device.hm.api.ParseResultItem;
import com.xiaomi.fit.fitness.device.hm.parse.repo.HmPaiDataParse;
import com.xiaomi.fit.fitness.device.hm.parse.utils.HMParseUtilKt;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.data.item.OneDayPaiReport;
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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000fR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/parse/repo/HmPaiDataParse;", "Lcom/xiaomi/fit/fitness/device/hm/parse/repo/IHmDataParseByCategory;", "<init>", "()V", "sendDataRecord", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "getSendDataRecord", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "sendDataRecord$delegate", "Lkotlin/Lazy;", "parse", "Lcom/xiaomi/fit/fitness/device/hm/api/ParseResultItem;", "sid", "", "data", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HmPaiDataParse implements IHmDataParseByCategory {

    /* JADX INFO: renamed from: sendDataRecord$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sendDataRecord = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: x9c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HmPaiDataParse.sendDataRecord_delegate$lambda$0();
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
        int i;
        int i2;
        JSONArray jSONArray;
        int i3;
        int iOptInt;
        long j = 0;
        int i4 = 0;
        try {
            JSONArray jSONArray2 = new JSONArray(str2);
            int length = jSONArray2.length();
            int i5 = 0;
            while (i4 < length) {
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i4);
                    String strOptString = jSONObjectOptJSONObject.optString(PaiData.TOTAL_PAI);
                    Intrinsics.checkNotNull(strOptString);
                    if (Float.parseFloat(strOptString) > 0.0f) {
                        long jOptLong = jSONObjectOptJSONObject.optLong("timestamp");
                        iOptInt = jSONObjectOptJSONObject.optInt("timeZone");
                        String strOptString2 = jSONObjectOptJSONObject.optString(PaiData.LOW_ZONE_PAI);
                        String strOptString3 = jSONObjectOptJSONObject.optString(PaiData.MEDIUM_ZONE_PAI);
                        String strOptString4 = jSONObjectOptJSONObject.optString(PaiData.HIGH_ZONE_PAI);
                        String strOptString5 = jSONObjectOptJSONObject.optString(PaiData.DAILY_PAI);
                        jSONArray = jSONArray2;
                        long jOptLong2 = jSONObjectOptJSONObject.optLong(PaiData.LAST_SYNC_TIME);
                        i3 = length;
                        i2 = i5;
                        try {
                            Intrinsics.checkNotNull(strOptString5);
                            float f = Float.parseFloat(strOptString5);
                            float f2 = Float.parseFloat(strOptString);
                            Intrinsics.checkNotNull(strOptString4);
                            float f3 = Float.parseFloat(strOptString4);
                            Intrinsics.checkNotNull(strOptString3);
                            float f4 = Float.parseFloat(strOptString3);
                            Intrinsics.checkNotNull(strOptString2);
                            boolean zRecordPai = getSendDataRecord().recordPai(str, FitnessDateUtils.getTzOffsetInSecBy15min(iOptInt), new OneDayPaiReport(jOptLong / ((long) 1000), f, f2, f3, f4, Float.parseFloat(strOptString2)));
                            FitnessLogUtils.i(HMParseUtilKt.TAG, "HmPaiDataParse totalPai=" + strOptString + "**result=" + zRecordPai + "**time=" + jOptLong);
                            if (!zRecordPai) {
                                return new ParseResultItem(false, 0, 0L, 6, null);
                            }
                            if (j < jOptLong2) {
                                j = jOptLong2;
                            }
                            i4++;
                            length = i3;
                            i5 = iOptInt;
                            jSONArray2 = jSONArray;
                        } catch (Exception e) {
                            e = e;
                            i4 = i2;
                            FitnessLogUtils.e(HMParseUtilKt.TAG, "HmPaiDataParse " + e.getMessage(), e);
                            return new ParseResultItem(true, i4, j);
                        }
                    } else {
                        jSONArray = jSONArray2;
                        i3 = length;
                        i2 = i5;
                    }
                    iOptInt = i2;
                    i4++;
                    length = i3;
                    i5 = iOptInt;
                    jSONArray2 = jSONArray;
                } catch (Exception e2) {
                    e = e2;
                    i2 = i5;
                }
            }
            int i6 = i5;
            try {
                i = i6;
                try {
                    return new ParseResultItem(true, i, j);
                } catch (Exception e3) {
                    e = e3;
                    i4 = i;
                    FitnessLogUtils.e(HMParseUtilKt.TAG, "HmPaiDataParse " + e.getMessage(), e);
                    return new ParseResultItem(true, i4, j);
                }
            } catch (Exception e4) {
                e = e4;
                i = i6;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }
}
