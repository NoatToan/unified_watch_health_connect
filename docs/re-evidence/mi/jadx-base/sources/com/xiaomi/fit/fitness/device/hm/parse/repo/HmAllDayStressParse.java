package com.xiaomi.fit.fitness.device.hm.parse.repo;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.device.hm.api.ParseResultItem;
import com.xiaomi.fit.fitness.device.hm.parse.repo.HmAllDayStressParse;
import com.xiaomi.fit.fitness.device.hm.parse.utils.HMParseUtilKt;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.data.item.StressItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.hm.health.bt.sdk.data.PaiData;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000fR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/parse/repo/HmAllDayStressParse;", "Lcom/xiaomi/fit/fitness/device/hm/parse/repo/IHmDataParseByCategory;", "<init>", "()V", "sendDataRecord", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "getSendDataRecord", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "sendDataRecord$delegate", "Lkotlin/Lazy;", "parse", "Lcom/xiaomi/fit/fitness/device/hm/api/ParseResultItem;", "sid", "", "data", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHmAllDayStressParse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HmAllDayStressParse.kt\ncom/xiaomi/fit/fitness/device/hm/parse/repo/HmAllDayStressParse\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,72:1\n37#2:73\n36#2,3:74\n*S KotlinDebug\n*F\n+ 1 HmAllDayStressParse.kt\ncom/xiaomi/fit/fitness/device/hm/parse/repo/HmAllDayStressParse\n*L\n53#1:73\n53#1:74,3\n*E\n"})
public final class HmAllDayStressParse implements IHmDataParseByCategory {

    /* JADX INFO: renamed from: sendDataRecord$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sendDataRecord = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: s9c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HmAllDayStressParse.sendDataRecord_delegate$lambda$0();
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
        JSONArray jSONArray;
        long j = 0;
        try {
            JSONArray jSONArray2 = new JSONArray(str2);
            int length = jSONArray2.length();
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i2);
                    if (jSONObjectOptJSONObject != null) {
                        long jOptLong = jSONObjectOptJSONObject.optLong(PaiData.LAST_SYNC_TIME);
                        JSONArray jSONArray3 = new JSONArray(jSONObjectOptJSONObject.optString("data"));
                        FitnessLogUtils.d(HMParseUtilKt.TAG, "HmAllDayStressParse data.length=" + Boxing.boxInt(jSONArray3.length()));
                        int iOptInt = jSONObjectOptJSONObject.optInt("timeZone");
                        int length2 = jSONArray3.length();
                        ArrayList arrayList = new ArrayList();
                        int i4 = 0;
                        while (i4 < length2) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArray3.optJSONObject(i4);
                            String strOptString = jSONObjectOptJSONObject2.optString("time");
                            JSONArray jSONArray4 = jSONArray2;
                            String strOptString2 = jSONObjectOptJSONObject2.optString("value");
                            Intrinsics.checkNotNull(strOptString);
                            int i5 = length2;
                            long j2 = Long.parseLong(strOptString) / ((long) 1000);
                            Intrinsics.checkNotNull(strOptString2);
                            StressItem stressItem = new StressItem(j2, Integer.parseInt(strOptString2));
                            arrayList.add(stressItem);
                            FitnessLogUtils.d(HMParseUtilKt.TAG, "HmAllDayStressParse item=" + stressItem);
                            i4++;
                            jSONArray3 = jSONArray3;
                            jSONArray2 = jSONArray4;
                            length2 = i5;
                        }
                        jSONArray = jSONArray2;
                        if (!arrayList.isEmpty()) {
                            FitnessDataRecorder sendDataRecord = getSendDataRecord();
                            int tzOffsetInSecBy15min = FitnessDateUtils.getTzOffsetInSecBy15min(iOptInt);
                            StressItem[] stressItemArr = (StressItem[]) arrayList.toArray(new StressItem[0]);
                            if (sendDataRecord.recordDailyStress(str, tzOffsetInSecBy15min, (StressItem[]) Arrays.copyOf(stressItemArr, stressItemArr.length))) {
                                if (j < jOptLong) {
                                    i3 = iOptInt;
                                    j = jOptLong;
                                }
                            }
                        }
                        return new ParseResultItem(false, 0, 0L, 6, null);
                    }
                    jSONArray = jSONArray2;
                    i2++;
                    jSONArray2 = jSONArray;
                } catch (Exception e) {
                    e = e;
                    i = i3;
                    FitnessLogUtils.e(HMParseUtilKt.TAG, "HmAllDayStressParse " + e.getMessage(), e);
                    return new ParseResultItem(true, i, j);
                }
            }
            return new ParseResultItem(true, i3, j);
        } catch (Exception e2) {
            e = e2;
            i = 0;
        }
    }
}
