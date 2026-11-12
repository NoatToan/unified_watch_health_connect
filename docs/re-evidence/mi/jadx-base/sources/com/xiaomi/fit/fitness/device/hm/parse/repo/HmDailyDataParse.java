package com.xiaomi.fit.fitness.device.hm.parse.repo;

import android.util.Base64;
import com.xiaomi.fit.data.common.data.daily.SleepStateItem;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.device.hm.api.ParseResultItem;
import com.xiaomi.fit.fitness.device.hm.parse.repo.HmDailyDataParse;
import com.xiaomi.fit.fitness.device.hm.parse.utils.HMParseUtilKt;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.data.item.ActiveStageItem;
import com.xiaomi.fit.fitness.export.data.item.DayNightSleepReport;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fit.fitness.export.data.item.RestHrItem;
import com.xiaomi.fit.fitness.export.data.item.StepItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.sport_eco.SportConstants;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.hm.health.bt.sdk.data.PaiData;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0002\u0010\u0015J \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J(\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J(\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J \u0010 \u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J \u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J \u0010#\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006$"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/parse/repo/HmDailyDataParse;", "Lcom/xiaomi/fit/fitness/device/hm/parse/repo/IHmDataParseByCategory;", "<init>", "()V", "tzInsec", "", "getTzInsec", "()I", "setTzInsec", "(I)V", "sendDataRecord", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "getSendDataRecord", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "sendDataRecord$delegate", "Lkotlin/Lazy;", "parse", "Lcom/xiaomi/fit/fitness/device/hm/api/ParseResultItem;", "sid", "", "data", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseActiveStage", "", StepsInfo.KEY_STEP_INFO, "Lorg/json/JSONObject;", SportConstants.KEY_TIMESTAMP, "", "parseNightSleep", SleepInfo.KEY_SLEEP_INFO, "timeZone", "parseDaySleep", "parseRestHr", "parseStep", "jsonObject", "parseDailyHr", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHmDailyDataParse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HmDailyDataParse.kt\ncom/xiaomi/fit/fitness/device/hm/parse/repo/HmDailyDataParse\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,415:1\n37#2:416\n36#2,3:417\n37#2:420\n36#2,3:421\n37#2:424\n36#2,3:425\n*S KotlinDebug\n*F\n+ 1 HmDailyDataParse.kt\ncom/xiaomi/fit/fitness/device/hm/parse/repo/HmDailyDataParse\n*L\n107#1:416\n107#1:417,3\n356#1:420\n356#1:421,3\n401#1:424\n401#1:425,3\n*E\n"})
public final class HmDailyDataParse implements IHmDataParseByCategory {

    /* JADX INFO: renamed from: sendDataRecord$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sendDataRecord = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: u9c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HmDailyDataParse.sendDataRecord_delegate$lambda$0();
        }
    });
    private int tzInsec;

    private final FitnessDataRecorder getSendDataRecord() {
        return (FitnessDataRecorder) this.sendDataRecord.getValue();
    }

    private final boolean parseActiveStage(JSONObject stp, String sid, long timeStamp) {
        boolean zRecordActiveStage;
        try {
            JSONArray jSONArrayOptJSONArray = stp.optJSONArray(StepsInfo.KEY_STAGE);
            FitnessLogUtils.i(HMParseUtilKt.TAG, "HmDailyDataParse parseActiveStage stageArray.length=" + (jSONArrayOptJSONArray != null ? Integer.valueOf(jSONArrayOptJSONArray.length()) : null));
            if (jSONArrayOptJSONArray == null) {
                return true;
            }
            int length = jSONArrayOptJSONArray.length();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                int iMatchActiveStageType = HMParseUtilKt.matchActiveStageType(jSONObjectOptJSONObject.optInt("mode"));
                if (iMatchActiveStageType != 0) {
                    long jOptInt = timeStamp + ((long) (jSONObjectOptJSONObject.optInt(StatConstants.PARAM_START) * 60));
                    long jOptInt2 = timeStamp + ((long) (jSONObjectOptJSONObject.optInt(BroadcastsKt.SILENT_PUSHING_STOP) * 60));
                    int iOptInt = jSONObjectOptJSONObject.optInt(StepsInfo.KEY_DISTANCE);
                    Intrinsics.checkNotNull(jSONObjectOptJSONObject);
                    Integer numObtainInt = JsonUtilKt.obtainInt(jSONObjectOptJSONObject, "step");
                    int iOptInt2 = jSONObjectOptJSONObject.optInt(StepsInfo.KEY_CALORIES);
                    int iOptInt3 = jSONObjectOptJSONObject.optInt(StepsInfo.KEY_NEW_CALORIES);
                    ActiveStageItem activeStageItem = new ActiveStageItem(jOptInt, jOptInt2, iMatchActiveStageType, numObtainInt, iOptInt, iOptInt2 > iOptInt3 ? iOptInt2 : iOptInt3);
                    arrayList.add(activeStageItem);
                    FitnessLogUtils.d(HMParseUtilKt.TAG, "HmDailyDataParse parseActiveStage item=" + activeStageItem);
                }
            }
            if (!arrayList.isEmpty()) {
                FitnessDataRecorder sendDataRecord = getSendDataRecord();
                try {
                    int i2 = this.tzInsec;
                    ActiveStageItem[] activeStageItemArr = (ActiveStageItem[]) arrayList.toArray(new ActiveStageItem[0]);
                    zRecordActiveStage = sendDataRecord.recordActiveStage(sid, i2, (ActiveStageItem[]) Arrays.copyOf(activeStageItemArr, activeStageItemArr.length));
                } catch (Exception e) {
                    e = e;
                }
            } else {
                zRecordActiveStage = true;
            }
            FitnessLogUtils.i(HMParseUtilKt.TAG, "HmDailyDataParse parseActiveStage result=" + zRecordActiveStage);
            return zRecordActiveStage;
        } catch (Exception e2) {
            e = e2;
        }
        e.printStackTrace();
        FitnessLogUtils.e(HMParseUtilKt.TAG, "parseActiveStage exception=" + Unit.INSTANCE);
        return true;
    }

    private final boolean parseDailyHr(JSONObject jsonObject, String sid, long timeStamp) {
        boolean zRecordDailyHr;
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray("data");
            FitnessLogUtils.i(HMParseUtilKt.TAG, "HmDailyDataParse parseDailyHr dataArray.length=" + (jSONArrayOptJSONArray != null ? Integer.valueOf(jSONArrayOptJSONArray.length()) : null));
            if (jSONArrayOptJSONArray == null) {
                return true;
            }
            if (jSONArrayOptJSONArray.length() > 0) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
                int iOptInt = jSONObjectOptJSONObject.optInt(StatConstants.PARAM_START);
                int iOptInt2 = jSONObjectOptJSONObject.optInt(BroadcastsKt.SILENT_PUSHING_STOP);
                byte[] bArrDecode = Base64.decode(jSONObjectOptJSONObject.optString("value"), 0);
                int i = iOptInt2 - iOptInt;
                int length = bArrDecode.length / (i + 1);
                if (length > 3 && i >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = timeStamp + ((long) ((iOptInt + i2) * 60));
                        int iByteToInt = HMParseUtilKt.byteToInt(bArrDecode[(length * i2) + 3]);
                        if (1 <= iByteToInt && iByteToInt < 255) {
                            arrayList.add(new HrItem(j, iByteToInt));
                        }
                        if (i2 == i) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                FitnessDataRecorder sendDataRecord = getSendDataRecord();
                try {
                    int i3 = this.tzInsec;
                    HrItem[] hrItemArr = (HrItem[]) arrayList.toArray(new HrItem[0]);
                    zRecordDailyHr = sendDataRecord.recordDailyHr(sid, i3, (HrItem[]) Arrays.copyOf(hrItemArr, hrItemArr.length));
                } catch (Exception e) {
                    e = e;
                }
            } else {
                zRecordDailyHr = true;
            }
            FitnessLogUtils.d(HMParseUtilKt.TAG, "HmDailyDataParse parseDailyHr result=" + zRecordDailyHr);
            return zRecordDailyHr;
        } catch (Exception e2) {
            e = e2;
        }
        e.printStackTrace();
        FitnessLogUtils.e(HMParseUtilKt.TAG, "parseDailyHr exception=" + Unit.INSTANCE);
        return true;
    }

    private final boolean parseDaySleep(JSONObject slp, String sid, int timeZone, long timeStamp) {
        try {
            JSONArray jSONArrayOptJSONArray = slp.optJSONArray("odd_stage");
            FitnessLogUtils.i(HMParseUtilKt.TAG, "HmDailyDataParse parseDaySleep dayStage.length=" + (jSONArrayOptJSONArray != null ? Integer.valueOf(jSONArrayOptJSONArray.length()) : null));
            if (jSONArrayOptJSONArray == null) {
                return true;
            }
            int length = jSONArrayOptJSONArray.length();
            ArrayList arrayList = new ArrayList();
            DayNightSleepReport dayNightSleepReport = new DayNightSleepReport(timeStamp, timeZone);
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                SleepStateItem sleepStateItem = new SleepStateItem(timeStamp + ((long) ((jSONObjectOptJSONObject.optInt(StatConstants.PARAM_START) - 1440) * 60)), ((long) ((jSONObjectOptJSONObject.optInt(BroadcastsKt.SILENT_PUSHING_STOP) - 1439) * 60)) + timeStamp, HMParseUtilKt.matchSleepMode(jSONObjectOptJSONObject.optInt("mode")));
                FitnessLogUtils.i(HMParseUtilKt.TAG, "HmDailyDataParse parseDaySleep SleepMode=" + sleepStateItem);
                arrayList.add(sleepStateItem);
            }
            dayNightSleepReport.setSleepItems(new ArrayList());
            List<SleepStateItem> sleepItems = dayNightSleepReport.getSleepItems();
            if (sleepItems != null) {
                ListExtKt.addAll(sleepItems, arrayList);
            }
            try {
                boolean zRecordDaytimeSleep = getSendDataRecord().recordDaytimeSleep(sid, this.tzInsec, dayNightSleepReport);
                FitnessLogUtils.i(HMParseUtilKt.TAG, "HmDailyDataParse parseDaySleep result=" + zRecordDaytimeSleep + "**item=" + dayNightSleepReport);
                return zRecordDaytimeSleep;
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
        }
        e.printStackTrace();
        FitnessLogUtils.e(HMParseUtilKt.TAG, "parseDaySleep exception=" + Unit.INSTANCE);
        return true;
    }

    private final boolean parseNightSleep(JSONObject slp, String sid, int timeZone, long timeStamp) {
        try {
            JSONArray jSONArrayOptJSONArray = slp.optJSONArray(StepsInfo.KEY_STAGE);
            FitnessLogUtils.i(HMParseUtilKt.TAG, "HmDailyDataParse parseNightSleep nightStage.length=" + (jSONArrayOptJSONArray != null ? Integer.valueOf(jSONArrayOptJSONArray.length()) : null));
            if (jSONArrayOptJSONArray == null) {
                return true;
            }
            long jOptLong = slp.optLong("st");
            long jOptLong2 = slp.optLong("ed");
            int iOptInt = slp.optInt("dp");
            int iOptInt2 = slp.optInt(StepsInfo.KEY_STEP_WALK_TIME);
            int iOptInt3 = slp.optInt("lt");
            Integer numObtainInt = JsonUtilKt.obtainInt(slp, "sbs");
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                JSONArray jSONArray = jSONArrayOptJSONArray;
                int iOptInt4 = jSONObjectOptJSONObject.optInt(StatConstants.PARAM_START);
                int i4 = length;
                int iOptInt5 = jSONObjectOptJSONObject.optInt(BroadcastsKt.SILENT_PUSHING_STOP);
                Integer num = numObtainInt;
                int iOptInt6 = jSONObjectOptJSONObject.optInt("mode");
                int iMatchSleepMode = HMParseUtilKt.matchSleepMode(iOptInt6);
                int i5 = iOptInt2;
                if (iMatchSleepMode == 5) {
                    i2++;
                }
                int i6 = iOptInt3;
                long j = ((long) ((iOptInt4 - 1440) * 60)) + timeStamp;
                long j2 = jOptLong2;
                long j3 = ((long) ((iOptInt5 - 1439) * 60)) + timeStamp;
                SleepStateItem sleepStateItem = new SleepStateItem(j, j3, iMatchSleepMode);
                if (iOptInt6 == 8) {
                    i3 += (int) ((j3 - j) / ((long) 60));
                }
                FitnessLogUtils.d(HMParseUtilKt.TAG, "HmDailyDataParse parseNightSleep SleepMode=" + sleepStateItem);
                arrayList.add(sleepStateItem);
                i++;
                jSONArrayOptJSONArray = jSONArray;
                length = i4;
                numObtainInt = num;
                iOptInt2 = i5;
                iOptInt3 = i6;
                jOptLong2 = j2;
            }
            Integer num2 = numObtainInt;
            DayNightSleepReport dayNightSleepReport = new DayNightSleepReport(timeStamp, timeZone);
            dayNightSleepReport.setBedTime(jOptLong);
            dayNightSleepReport.setWakeUpTime(jOptLong2);
            dayNightSleepReport.setDeepDuration(Integer.valueOf(iOptInt));
            dayNightSleepReport.setLightDuration(Integer.valueOf(iOptInt3));
            dayNightSleepReport.setAwakeDuration(Integer.valueOf(iOptInt2));
            dayNightSleepReport.setAwakeCount(Integer.valueOf(i2));
            dayNightSleepReport.setRemDuration(Integer.valueOf(i3));
            dayNightSleepReport.setBreathQuality(num2);
            Integer deepDuration = dayNightSleepReport.getDeepDuration();
            int iIntValue = deepDuration != null ? deepDuration.intValue() : 0;
            Integer lightDuration = dayNightSleepReport.getLightDuration();
            int iIntValue2 = iIntValue + (lightDuration != null ? lightDuration.intValue() : 0);
            Integer remDuration = dayNightSleepReport.getRemDuration();
            dayNightSleepReport.setSleepDuration(iIntValue2 + (remDuration != null ? remDuration.intValue() : 0));
            dayNightSleepReport.setSleepItems(new ArrayList());
            List<SleepStateItem> sleepItems = dayNightSleepReport.getSleepItems();
            if (sleepItems != null) {
                ListExtKt.addAll(sleepItems, arrayList);
            }
            try {
                boolean zRecordNightSleep = getSendDataRecord().recordNightSleep(sid, this.tzInsec, dayNightSleepReport);
                FitnessLogUtils.i(HMParseUtilKt.TAG, "HmDailyDataParse parseNightSleep result=" + zRecordNightSleep + "**item=" + dayNightSleepReport);
                return zRecordNightSleep;
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
        }
        e.printStackTrace();
        FitnessLogUtils.e(HMParseUtilKt.TAG, "parseNightSleep exception=" + Unit.INSTANCE);
        return true;
    }

    private final boolean parseRestHr(JSONObject slp, String sid, long timeStamp) {
        boolean z = true;
        try {
            int iOptInt = slp.optInt("rhr");
            if (iOptInt <= 0 || HMParseUtilKt.isSupportSyncRestHr(sid)) {
                FitnessLogUtils.i(HMParseUtilKt.TAG, "HmDailyDataParse parseRestHr value=" + iOptInt);
            } else {
                RestHrItem restHrItem = new RestHrItem(timeStamp, iOptInt);
                boolean zRecordRestHr = getSendDataRecord().recordRestHr(sid, this.tzInsec, restHrItem);
                FitnessLogUtils.i(HMParseUtilKt.TAG, "HmDailyDataParse parseRestHr result=" + zRecordRestHr + "**item=" + restHrItem);
                z = zRecordRestHr;
            }
        } catch (Exception e) {
            e.printStackTrace();
            FitnessLogUtils.e(HMParseUtilKt.TAG, "parseRestHr exception=" + Unit.INSTANCE);
        }
        return z;
    }

    private final boolean parseStep(JSONObject jsonObject, String sid, long timeStamp) {
        boolean zRecordStep;
        int i;
        int i2;
        int i3;
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObjectOptJSONObject = new JSONObject(jsonObject.optString("summary")).optJSONObject(StepsInfo.KEY_STEP_INFO);
            float fOptInt = jSONObjectOptJSONObject.optInt(StepsInfo.KEY_STEPS);
            int iOptInt = jSONObjectOptJSONObject.optInt("realDis");
            if (iOptInt <= 0) {
                iOptInt = jSONObjectOptJSONObject.optInt(StepsInfo.KEY_DISTANCE);
            }
            JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray("data");
            int iOptInt2 = jSONObjectOptJSONObject.optInt("stepCal");
            FitnessLogUtils.i(HMParseUtilKt.TAG, "HmDailyDataParse parseStep stepCal=" + iOptInt2 + "**dayStep=" + fOptInt + ",dayDistance=" + iOptInt + "**dataArray.length=" + (jSONArrayOptJSONArray != null ? Integer.valueOf(jSONArrayOptJSONArray.length()) : null));
            if (jSONArrayOptJSONArray == null) {
                return true;
            }
            if (jSONArrayOptJSONArray.length() > 0) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(0);
                int iOptInt3 = jSONObjectOptJSONObject2.optInt(StatConstants.PARAM_START);
                int iOptInt4 = jSONObjectOptJSONObject2.optInt(BroadcastsKt.SILENT_PUSHING_STOP);
                byte[] bArrDecode = Base64.decode(jSONObjectOptJSONObject2.optString("value"), 0);
                int i4 = iOptInt4 - iOptInt3;
                int i5 = i4 + 1;
                int length = bArrDecode.length / i5;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (i4 >= 0) {
                    int i6 = 0;
                    int i7 = 0;
                    int i8 = 0;
                    while (true) {
                        int iByteToInt = HMParseUtilKt.byteToInt(bArrDecode[(length * i6) + 2]);
                        float f = iByteToInt / fOptInt;
                        byte[] bArr = bArrDecode;
                        int i9 = (int) (iOptInt * f);
                        float f2 = fOptInt;
                        int i10 = (int) (f * iOptInt2);
                        i7 += i9;
                        i8 += i10;
                        arrayList2.add(Integer.valueOf(iByteToInt));
                        arrayList3.add(Integer.valueOf(i9));
                        arrayList4.add(Integer.valueOf(i10));
                        if (i6 == i4) {
                            break;
                        }
                        i6++;
                        bArrDecode = bArr;
                        fOptInt = f2;
                    }
                    i = i7;
                    i2 = i8;
                } else {
                    i = 0;
                    i2 = 0;
                }
                int i11 = iOptInt - i;
                int i12 = iOptInt2 - i2;
                FitnessLogUtils.i(HMParseUtilKt.TAG, "HmDailyDataParse parseStep tocalCal=" + i2 + "**calInterval=" + i12 + "**totalDistance=" + i + ",interval=" + i11 + ",byteLength=" + length);
                int i13 = i11 / i5;
                int i14 = i11 % i5;
                int i15 = i12 / i5;
                int i16 = i12 % i5;
                if (i4 >= 0) {
                    int i17 = 0;
                    i3 = 0;
                    while (true) {
                        long j = timeStamp + ((long) ((iOptInt3 + i17) * 60));
                        Object obj = arrayList2.get(i17);
                        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                        int iIntValue = ((Number) obj).intValue();
                        if (iIntValue != 0) {
                            int iIntValue2 = ((Number) arrayList3.get(i17)).intValue() + i13;
                            if (i14 > 0) {
                                i14--;
                                iIntValue2++;
                            }
                            int i18 = iIntValue2;
                            int iIntValue3 = ((Number) arrayList4.get(i17)).intValue() + i15;
                            if (i16 > 0) {
                                i16--;
                                iIntValue3++;
                            }
                            StepItem stepItem = new StepItem(j, iIntValue, i18, iIntValue3);
                            arrayList.add(stepItem);
                            i3 += iIntValue;
                            FitnessLogUtils.d(HMParseUtilKt.TAG, "HmDailyDataParse parseStep item=" + stepItem);
                        }
                        if (i17 == i4) {
                            break;
                        }
                        i17++;
                    }
                } else {
                    i3 = 0;
                }
                FitnessLogUtils.d(HMParseUtilKt.TAG, "HmDailyDataParse totalStep=" + i3);
            }
            if (!arrayList.isEmpty()) {
                FitnessDataRecorder sendDataRecord = getSendDataRecord();
                try {
                    int i19 = this.tzInsec;
                    StepItem[] stepItemArr = (StepItem[]) arrayList.toArray(new StepItem[0]);
                    zRecordStep = sendDataRecord.recordStep(sid, i19, (StepItem[]) Arrays.copyOf(stepItemArr, stepItemArr.length));
                } catch (Exception e) {
                    e = e;
                }
            } else {
                zRecordStep = true;
            }
            FitnessLogUtils.d(HMParseUtilKt.TAG, "HmDailyDataParse result=" + zRecordStep);
            return zRecordStep;
        } catch (Exception e2) {
            e = e2;
        }
        e.printStackTrace();
        FitnessLogUtils.e(HMParseUtilKt.TAG, "parseStep exception=" + Unit.INSTANCE);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataRecorder sendDataRecord_delegate$lambda$0() {
        return FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE);
    }

    public final int getTzInsec() {
        return this.tzInsec;
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.IHmDataParseByCategory
    @Nullable
    public Object parse(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super ParseResultItem> continuation) {
        long j;
        long j2 = 0;
        int i = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        boolean z = false;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int iOptInt = jSONObject.optInt(OneTrack.Param.TZ);
            try {
                long jOptLong = jSONObject.optLong(PaiData.LAST_SYNC_TIME);
                try {
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("metadata");
                    FitnessLogUtils.i(HMParseUtilKt.TAG, "HmDailyDataParse metadata length=" + (jSONArrayOptJSONArray != null ? Boxing.boxInt(jSONArrayOptJSONArray.length()) : null));
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() >= 1) {
                        this.tzInsec = FitnessDateUtils.getTzOffsetInSecBy15min(iOptInt);
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
                        JSONObject jSONObject2 = new JSONObject(jSONObjectOptJSONObject.optString("summary"));
                        String strOptString = jSONObjectOptJSONObject.optString(DialWidgetType.DATE);
                        FitnessDateUtils fitnessDateUtils = FitnessDateUtils.INSTANCE;
                        Intrinsics.checkNotNull(strOptString);
                        long jConvertDateStrToZeroTime = fitnessDateUtils.convertDateStrToZeroTime(strOptString, "yyyy-MM-dd");
                        JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject(StepsInfo.KEY_STEP_INFO);
                        JSONObject jSONObjectOptJSONObject3 = jSONObject2.optJSONObject(SleepInfo.KEY_SLEEP_INFO);
                        Intrinsics.checkNotNull(jSONObjectOptJSONObject2);
                        if (parseActiveStage(jSONObjectOptJSONObject2, str, jConvertDateStrToZeroTime)) {
                            Intrinsics.checkNotNull(jSONObjectOptJSONObject3);
                            if (parseNightSleep(jSONObjectOptJSONObject3, str, iOptInt, jConvertDateStrToZeroTime) && parseDaySleep(jSONObjectOptJSONObject3, str, iOptInt, jConvertDateStrToZeroTime)) {
                                j = jConvertDateStrToZeroTime;
                                if (parseRestHr(jSONObjectOptJSONObject3, str, j)) {
                                    Intrinsics.checkNotNull(jSONObjectOptJSONObject);
                                    if (parseStep(jSONObjectOptJSONObject, str, j) && parseDailyHr(jSONObjectOptJSONObject, str, j)) {
                                        z = true;
                                    }
                                }
                            } else {
                                j = jConvertDateStrToZeroTime;
                            }
                        } else {
                            j = jConvertDateStrToZeroTime;
                        }
                        FitnessLogUtils.i(HMParseUtilKt.TAG, "HmDailyDataParse parseResult=" + z + "**time=" + j);
                        return new ParseResultItem(z, iOptInt, jOptLong);
                    }
                    return new ParseResultItem(true, iOptInt, jOptLong);
                } catch (Exception e) {
                    e = e;
                    i = iOptInt;
                    j2 = jOptLong;
                    FitnessLogUtils.e(HMParseUtilKt.TAG, "HmDailyDataParse " + e.getMessage(), e);
                    return new ParseResultItem(true, i, j2);
                }
            } catch (Exception e2) {
                e = e2;
                i = iOptInt;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public final void setTzInsec(int i) {
        this.tzInsec = i;
    }
}
