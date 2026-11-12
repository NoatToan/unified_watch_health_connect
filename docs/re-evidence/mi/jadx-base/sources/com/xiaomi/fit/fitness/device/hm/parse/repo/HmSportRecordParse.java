package com.xiaomi.fit.fitness.device.hm.parse.repo;

import android.app.Application;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.device.hm.api.ParseResultItem;
import com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ElliticalMachineAndOBallRecord;
import com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.HITrainingRecord;
import com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.HundredsSportRecord;
import com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord;
import com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.OutdoorNoStepSportRecord;
import com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.OutdoorStepSportRecord;
import com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.RopeSkippingRecord;
import com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.RowingMachineRecord;
import com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.RunIndoorRecord;
import com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.SwimmingRecord;
import com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.YogaBikingIndoorRecord;
import com.xiaomi.fit.fitness.device.hm.parse.utils.HMParseUtilKt;
import com.xiaomi.fit.fitness.device.hm.parse.utils.HMSportGpsParser;
import com.xiaomi.fit.fitness.export.data.DataResult;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import com.xiaomi.hm.health.bt.sdk.data.PaiData;
import com.xiaomi.onetrack.OneTrack;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\tJ6\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0002¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/parse/repo/HmSportRecordParse;", "Lcom/xiaomi/fit/fitness/device/hm/parse/repo/IHmDataParseByCategory;", "<init>", "()V", "parse", "Lcom/xiaomi/fit/fitness/device/hm/api/ParseResultItem;", "sid", "", "data", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseGpsRecord", "Lcom/xiaomi/fit/fitness/export/data/DataResult;", "startTime", "", OneTrack.Param.TZ, "", DailyRecordKey.sportType, "recordObj", "Lorg/json/JSONObject;", "(Ljava/lang/String;JIILorg/json/JSONObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecordInstance", "Lcom/xiaomi/fit/fitness/device/hm/parse/repo/sportrecord/ISportRecord;", "hmType", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HmSportRecordParse implements IHmDataParseByCategory {

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.hm.parse.repo.HmSportRecordParse$parse$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.hm.parse.repo.HmSportRecordParse", f = "HmSportRecordParse.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {57, 58}, m = "parse", n = {"this", "sid", "jsonObject", PaiData.LAST_SYNC_TIME, "tzIn15Min", "startTime", "miSportType", "result", PaiData.LAST_SYNC_TIME, "tzIn15Min"}, s = {"L$0", "L$1", "L$2", "J$0", "I$0", "J$1", "I$1", "L$0", "J$0", "I$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HmSportRecordParse.this.parse(null, null, this);
        }
    }

    private final ISportRecord getRecordInstance(int hmType) {
        if (hmType == 3) {
            return new RunIndoorRecord();
        }
        if (hmType != 7) {
            if (hmType == 16) {
                return new HITrainingRecord();
            }
            if (hmType != 18) {
                if (hmType == 22) {
                    return new OutdoorStepSportRecord();
                }
                if (hmType == 23) {
                    return new OutdoorNoStepSportRecord();
                }
                switch (hmType) {
                    case 9:
                    case 10:
                        return new SwimmingRecord();
                    case 11:
                        break;
                    case 12:
                        break;
                    case 13:
                        return new RowingMachineRecord();
                    case 14:
                        return new RopeSkippingRecord();
                    default:
                        return new HundredsSportRecord();
                }
            }
            return new ElliticalMachineAndOBallRecord();
        }
        return new YogaBikingIndoorRecord();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object parseGpsRecord(String str, long j, int i, int i2, JSONObject jSONObject, Continuation<? super DataResult> continuation) throws JSONException {
        String string = jSONObject.getString("longitude_latitude");
        String strOptString = jSONObject.optString("time");
        FitnessLogUtils.i(HMParseUtilKt.TAG, "HmSportRecordParse parseGpsRecord time=" + j);
        HMSportGpsParser hMSportGpsParser = HMSportGpsParser.INSTANCE;
        Application application = ApplicationExtKt.getApplication();
        Intrinsics.checkNotNull(strOptString);
        Intrinsics.checkNotNull(string);
        return hMSportGpsParser.parseAndSaveHMGps(application, str, j, i, i2, strOptString, string, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0137 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0138  */
    /* JADX WARN: Code duplicated, block: B:52:0x0176 A[Catch: Exception -> 0x003b, TryCatch #1 {Exception -> 0x003b, blocks: (B:13:0x0036, B:50:0x0140, B:52:0x0176, B:56:0x017f), top: B:72:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x017e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.IHmDataParseByCategory
    @Nullable
    public Object parse(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super ParseResultItem> continuation) {
        AnonymousClass1 anonymousClass1;
        long j;
        int currentTZOffsetIn15min;
        int i;
        long j2;
        int i2;
        String str3;
        long j3;
        long j4;
        JSONObject jSONObject;
        HmSportRecordParse hmSportRecordParse;
        DataResult dataResult;
        long j5;
        Object gpsRecord;
        DataResult dataResult2;
        boolean z;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = anonymousClass1.label;
        try {
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                currentTZOffsetIn15min = FitnessDateUtils.getCurrentTZOffsetIn15min();
                j2 = 0;
                try {
                    JSONObject jSONObject2 = new JSONObject(str2);
                    long jOptLong = jSONObject2.optLong(PaiData.LAST_SYNC_TIME);
                    try {
                        long jOptLong2 = jSONObject2.optLong("trackid");
                        long jOptLong3 = jSONObject2.optLong(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME);
                        if (jOptLong2 < 1 || jOptLong3 < 1) {
                            FitnessLogUtils.i(HMParseUtilKt.TAG, "HmSportRecordParse time parse error");
                            return new ParseResultItem(false, 0, 0L, 6, null);
                        }
                        int iOptInt = jSONObject2.optInt("type");
                        if (HMParseUtilKt.isTriathlon(iOptInt)) {
                            try {
                                FitnessLogUtils.i(HMParseUtilKt.TAG, "HmSportRecordParse sport not support");
                                return new ParseResultItem(true, currentTZOffsetIn15min, jOptLong);
                            } catch (Exception e) {
                                e = e;
                                j2 = jOptLong;
                                i = currentTZOffsetIn15min;
                                FitnessLogUtils.e(HMParseUtilKt.TAG, "HmSportRecordParse " + e.getMessage(), e);
                                return new ParseResultItem(true, i, j2);
                            }
                        }
                        int iSwitchHmToMiProtoSportType = HMParseUtilKt.switchHmToMiProtoSportType(iOptInt);
                        FitnessLogUtils.i(HMParseUtilKt.TAG, "HmSportRecordParse huamiType=" + iOptInt + "**miType=" + iSwitchHmToMiProtoSportType + "**time=" + jOptLong2 + "**endTime=" + jOptLong3);
                        ISportRecord recordInstance = getRecordInstance(iSwitchHmToMiProtoSportType);
                        anonymousClass1.L$0 = this;
                        anonymousClass1.L$1 = str;
                        anonymousClass1.L$2 = jSONObject2;
                        anonymousClass1.J$0 = jOptLong;
                        anonymousClass1.I$0 = currentTZOffsetIn15min;
                        anonymousClass1.J$1 = jOptLong2;
                        anonymousClass1.I$1 = iSwitchHmToMiProtoSportType;
                        anonymousClass1.label = 1;
                        Object objRecord = recordInstance.record(str, jOptLong2, currentTZOffsetIn15min, iSwitchHmToMiProtoSportType, str2, anonymousClass1);
                        if (objRecord == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i2 = iSwitchHmToMiProtoSportType;
                        str3 = str;
                        j3 = jOptLong2;
                        j4 = jOptLong;
                        jSONObject = jSONObject2;
                        obj = objRecord;
                        hmSportRecordParse = this;
                        dataResult = (DataResult) obj;
                        anonymousClass1.L$0 = dataResult;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.J$0 = j4;
                        anonymousClass1.I$0 = currentTZOffsetIn15min;
                        anonymousClass1.label = 2;
                        j5 = j4;
                        gpsRecord = hmSportRecordParse.parseGpsRecord(str3, j3, currentTZOffsetIn15min, i2, jSONObject, anonymousClass1);
                        if (gpsRecord == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i = currentTZOffsetIn15min;
                        j2 = j5;
                        dataResult2 = dataResult;
                        obj = gpsRecord;
                        DataResult dataResult3 = (DataResult) obj;
                        FitnessLogUtils.i(HMParseUtilKt.TAG, "HmSportRecordParse result=" + dataResult2.isSuccess() + "**msg=" + dataResult2.getMsg() + "***gpsResult=" + dataResult3);
                        if (dataResult2.isSuccess()) {
                            z = false;
                        } else {
                            z = false;
                        }
                        return new ParseResultItem(z, i, j2);
                    } catch (Exception e2) {
                        e = e2;
                        j = jOptLong;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
                i = currentTZOffsetIn15min;
                j2 = j;
            } else if (i4 == 1) {
                int i5 = anonymousClass1.I$1;
                long j6 = anonymousClass1.J$1;
                int i6 = anonymousClass1.I$0;
                long j7 = anonymousClass1.J$0;
                JSONObject jSONObject3 = (JSONObject) anonymousClass1.L$2;
                String str4 = (String) anonymousClass1.L$1;
                HmSportRecordParse hmSportRecordParse2 = (HmSportRecordParse) anonymousClass1.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    jSONObject = jSONObject3;
                    i2 = i5;
                    hmSportRecordParse = hmSportRecordParse2;
                    currentTZOffsetIn15min = i6;
                    j3 = j6;
                    str3 = str4;
                    j4 = j7;
                    try {
                        dataResult = (DataResult) obj;
                        anonymousClass1.L$0 = dataResult;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.J$0 = j4;
                        anonymousClass1.I$0 = currentTZOffsetIn15min;
                        anonymousClass1.label = 2;
                        j5 = j4;
                        gpsRecord = hmSportRecordParse.parseGpsRecord(str3, j3, currentTZOffsetIn15min, i2, jSONObject, anonymousClass1);
                        if (gpsRecord == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i = currentTZOffsetIn15min;
                        j2 = j5;
                        dataResult2 = dataResult;
                        obj = gpsRecord;
                        DataResult dataResult4 = (DataResult) obj;
                        FitnessLogUtils.i(HMParseUtilKt.TAG, "HmSportRecordParse result=" + dataResult2.isSuccess() + "**msg=" + dataResult2.getMsg() + "***gpsResult=" + dataResult4);
                        if (dataResult2.isSuccess()) {
                            z = false;
                        } else {
                            z = false;
                        }
                        return new ParseResultItem(z, i, j2);
                    } catch (Exception e4) {
                        e = e4;
                        j = j4;
                    }
                } catch (Exception e5) {
                    e = e5;
                    i = i6;
                    j2 = j7;
                }
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = anonymousClass1.I$0;
                j2 = anonymousClass1.J$0;
                dataResult2 = (DataResult) anonymousClass1.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    DataResult dataResult5 = (DataResult) obj;
                    FitnessLogUtils.i(HMParseUtilKt.TAG, "HmSportRecordParse result=" + dataResult2.isSuccess() + "**msg=" + dataResult2.getMsg() + "***gpsResult=" + dataResult5);
                    if (dataResult2.isSuccess() || !dataResult5.isSuccess()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    return new ParseResultItem(z, i, j2);
                } catch (Exception e6) {
                    e = e6;
                }
            }
        } catch (Exception e7) {
            e = e7;
        }
        FitnessLogUtils.e(HMParseUtilKt.TAG, "HmSportRecordParse " + e.getMessage(), e);
        return new ParseResultItem(true, i, j2);
    }
}
