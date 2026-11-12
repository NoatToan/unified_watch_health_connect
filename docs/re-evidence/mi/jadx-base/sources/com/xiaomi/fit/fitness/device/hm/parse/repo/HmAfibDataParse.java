package com.xiaomi.fit.fitness.device.hm.parse.repo;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.device.hm.api.ParseResultItem;
import com.xiaomi.fit.fitness.device.hm.parse.repo.HmAfibDataParse;
import com.xiaomi.fit.fitness.device.hm.parse.utils.HMParseUtilKt;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000fR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/parse/repo/HmAfibDataParse;", "Lcom/xiaomi/fit/fitness/device/hm/parse/repo/IHmDataParseByCategory;", "<init>", "()V", "sendDataRecord", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "getSendDataRecord", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "sendDataRecord$delegate", "Lkotlin/Lazy;", "parse", "Lcom/xiaomi/fit/fitness/device/hm/api/ParseResultItem;", "sid", "", "data", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHmAfibDataParse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HmAfibDataParse.kt\ncom/xiaomi/fit/fitness/device/hm/parse/repo/HmAfibDataParse\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,84:1\n37#2:85\n36#2,3:86\n*S KotlinDebug\n*F\n+ 1 HmAfibDataParse.kt\ncom/xiaomi/fit/fitness/device/hm/parse/repo/HmAfibDataParse\n*L\n74#1:85\n74#1:86,3\n*E\n"})
public final class HmAfibDataParse implements IHmDataParseByCategory {

    /* JADX INFO: renamed from: sendDataRecord$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sendDataRecord = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: r9c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HmAfibDataParse.sendDataRecord_delegate$lambda$0();
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
        boolean zRecordAbnormalFib;
        int i2;
        long jLongValue;
        long j = 0;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int iOptInt = jSONObject.optInt("timeZone");
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("generatedTime");
                FitnessLogUtils.i(HMParseUtilKt.TAG, "HmAfibDataParse data.length=" + (jSONArrayOptJSONArray != null ? Boxing.boxInt(jSONArrayOptJSONArray.length()) : null));
                if (jSONArrayOptJSONArray == null) {
                    return new ParseResultItem(true, 0, 0L, 6, null);
                }
                int length = jSONArrayOptJSONArray.length();
                ArrayList arrayList = new ArrayList();
                int i3 = 0;
                for (int i4 = 0; i4 < length; i4++) {
                    if (i4 >= i3) {
                        long jOptLong = jSONArrayOptJSONArray.optLong(i4);
                        int i5 = i4 + 1;
                        if (i5 < length) {
                            Long lBoxLong = Boxing.boxLong(jSONArrayOptJSONArray.optLong(i5));
                            if (lBoxLong == null) {
                                return new ParseResultItem(false, 0, 0L, 6, null);
                            }
                            long jLongValue2 = lBoxLong.longValue();
                            i2 = i5;
                            while (Math.abs(jOptLong - jLongValue2) < 75 && (i2 = i2 + 1) < length) {
                                jLongValue2 = Boxing.boxLong(jSONArrayOptJSONArray.optLong(i2)).longValue();
                            }
                            if (i2 > i5) {
                                jLongValue = Boxing.boxLong(jSONArrayOptJSONArray.optLong(i2 - 1)).longValue();
                                if (i2 == length) {
                                    j = jLongValue;
                                }
                            } else {
                                jLongValue = jOptLong;
                            }
                        } else {
                            j = jOptLong;
                            i2 = i5;
                            jLongValue = j;
                        }
                        try {
                            long j2 = j;
                            try {
                                AbnormalFibItem abnormalFibItem = new AbnormalFibItem(jOptLong - ((long) 71), jLongValue);
                                arrayList.add(abnormalFibItem);
                                FitnessLogUtils.i(HMParseUtilKt.TAG, "HmAfibDataParse item=" + abnormalFibItem);
                                i3 = i2;
                                j = j2;
                            } catch (Exception e) {
                                e = e;
                                i = iOptInt;
                                j = j2;
                                FitnessLogUtils.e(HMParseUtilKt.TAG, "HmAfibDataParse " + e.getMessage(), e);
                                return new ParseResultItem(true, i, j);
                            }
                        } catch (Exception e2) {
                            e = e2;
                            i = iOptInt;
                            FitnessLogUtils.e(HMParseUtilKt.TAG, "HmAfibDataParse " + e.getMessage(), e);
                            return new ParseResultItem(true, i, j);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    FitnessDataRecorder sendDataRecord = getSendDataRecord();
                    int tzOffsetInSecBy15min = FitnessDateUtils.getTzOffsetInSecBy15min(iOptInt);
                    AbnormalFibItem[] abnormalFibItemArr = (AbnormalFibItem[]) arrayList.toArray(new AbnormalFibItem[0]);
                    zRecordAbnormalFib = sendDataRecord.recordAbnormalFib(str, tzOffsetInSecBy15min, (AbnormalFibItem[]) Arrays.copyOf(abnormalFibItemArr, abnormalFibItemArr.length));
                } else {
                    zRecordAbnormalFib = true;
                }
                return new ParseResultItem(zRecordAbnormalFib, iOptInt, j);
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Exception e4) {
            e = e4;
            i = 0;
        }
    }
}
