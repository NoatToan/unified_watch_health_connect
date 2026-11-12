package com.xiaomi.fit.fitness.parser.schema.daily;

import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.data.common.data.daily.SleepAssistItemInfo;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.fitness.parser.data.AllDaySleepParseData;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import com.xiaomi.fit.fitness.parser.schema.DailyReportKey;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u000fJ@\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/schema/daily/AllDaySleepSchemaParser;", "Lcom/xiaomi/fit/fitness/parser/schema/daily/BaseDailyParser;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "parse", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "root", "", "", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "parse$fitness_parser_release", "convertReportData", "", "key", "value", "allDaySleepParseData", "Lcom/xiaomi/fit/fitness/parser/data/AllDaySleepParseData;", "hrInfo", "Lcom/xiaomi/fit/fitness/parser/schema/daily/AllDaySleepSchemaParser$SleepItemInfo;", "spo2Info", "snoreDecibelInfo", DailyReportKey.featureData, "Lcom/xiaomi/fit/fitness/parser/schema/daily/AllDaySleepSchemaParser$FeatureData;", "SleepItemInfo", "FeatureData", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAllDaySleepSchemaParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllDaySleepSchemaParser.kt\ncom/xiaomi/fit/fitness/parser/schema/daily/AllDaySleepSchemaParser\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,138:1\n216#2,2:139\n37#3:141\n36#3,3:142\n37#3:145\n36#3,3:146\n37#3:149\n36#3,3:150\n*S KotlinDebug\n*F\n+ 1 AllDaySleepSchemaParser.kt\ncom/xiaomi/fit/fitness/parser/schema/daily/AllDaySleepSchemaParser\n*L\n22#1:139,2\n51#1:141\n51#1:142,3\n60#1:145\n60#1:146,3\n69#1:149\n69#1:150,3\n*E\n"})
public final class AllDaySleepSchemaParser extends BaseDailyParser {

    @NotNull
    private final String TAG = "AllDaySleepSchemaParser";

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/schema/daily/AllDaySleepSchemaParser$FeatureData;", "", "<init>", "()V", "sleepSrcDataLen", "", "getSleepSrcDataLen", "()I", "setSleepSrcDataLen", "(I)V", "assistInfoBytes", "", "getAssistInfoBytes", "()[B", "setAssistInfoBytes", "([B)V", "sleepSrcBytes", "getSleepSrcBytes", "setSleepSrcBytes", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FeatureData {

        @Nullable
        private byte[] assistInfoBytes;

        @Nullable
        private byte[] sleepSrcBytes;
        private int sleepSrcDataLen;

        @Nullable
        public final byte[] getAssistInfoBytes() {
            return this.assistInfoBytes;
        }

        @Nullable
        public final byte[] getSleepSrcBytes() {
            return this.sleepSrcBytes;
        }

        public final int getSleepSrcDataLen() {
            return this.sleepSrcDataLen;
        }

        public final void setAssistInfoBytes(@Nullable byte[] bArr) {
            this.assistInfoBytes = bArr;
        }

        public final void setSleepSrcBytes(@Nullable byte[] bArr) {
            this.sleepSrcBytes = bArr;
        }

        public final void setSleepSrcDataLen(int i) {
            this.sleepSrcDataLen = i;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u0004\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/schema/daily/AllDaySleepSchemaParser$SleepItemInfo;", "", "<init>", "()V", "firstRecordTime", "", "getFirstRecordTime", "()J", "setFirstRecordTime", "(J)V", "sampleUnit", "", "getSampleUnit", "()I", "setSampleUnit", "(I)V", "count", "getCount", FitnessReportKey.setCount, Constants.KEY_RECHARGE_VALUES, "", "", "getValues", "()Ljava/util/List;", "setValues", "(Ljava/util/List;)V", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SleepItemInfo {
        private int count;
        private long firstRecordTime;
        private int sampleUnit;

        @NotNull
        private List<? extends Number> values = new ArrayList();

        public final int getCount() {
            return this.count;
        }

        public final long getFirstRecordTime() {
            return this.firstRecordTime;
        }

        public final int getSampleUnit() {
            return this.sampleUnit;
        }

        @NotNull
        public final List<Number> getValues() {
            return this.values;
        }

        public final void setCount(int i) {
            this.count = i;
        }

        public final void setFirstRecordTime(long j) {
            this.firstRecordTime = j;
        }

        public final void setSampleUnit(int i) {
            this.sampleUnit = i;
        }

        public final void setValues(@NotNull List<? extends Number> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.values = list;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void convertReportData(String key, Object value, AllDaySleepParseData allDaySleepParseData, SleepItemInfo hrInfo, SleepItemInfo spo2Info, SleepItemInfo snoreDecibelInfo, FeatureData featureData) {
        switch (key.hashCode()) {
            case -2129294769:
                if (key.equals("startTime")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Long");
                    allDaySleepParseData.setDeviceBedTime((Long) value);
                    break;
                }
                break;
            case -2095415606:
                if (key.equals(DailyReportKey.asleepDuration)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Long");
                    allDaySleepParseData.setEntrySleepDuration((Long) value);
                    break;
                }
                break;
            case -1642811232:
                if (key.equals(DailyReportKey.sleepEfficiency)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    allDaySleepParseData.setSleepEfficiency((Integer) value);
                    break;
                }
                break;
            case -1607243192:
                if (key.equals("endTime")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Long");
                    allDaySleepParseData.setDeviceWakeupTime((Long) value);
                    break;
                }
                break;
            case -1420140446:
                if (key.equals(DailyReportKey.liveBedTime)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Long");
                    allDaySleepParseData.setLeaveBedTime((Long) value);
                    break;
                }
                break;
            case -1350254293:
                if (key.equals(DailyReportKey.heartRateInterval)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    hrInfo.setSampleUnit(((Integer) value).intValue());
                    break;
                }
                break;
            case -1298024583:
                if (key.equals(DailyReportKey.bloodOxygens)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
                    spo2Info.setValues((List) value);
                    break;
                }
                break;
            case -897608020:
                if (key.equals(DailyReportKey.snores)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
                    snoreDecibelInfo.setValues((List) value);
                    break;
                }
                break;
            case -764166369:
                if (key.equals(DailyReportKey.bloodOxygenInterval)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    spo2Info.setSampleUnit(((Integer) value).intValue());
                    break;
                }
                break;
            case -377457728:
                if (key.equals(DailyReportKey.featureData)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.ByteArray");
                    featureData.setSleepSrcBytes((byte[]) value);
                    byte[] sleepSrcBytes = featureData.getSleepSrcBytes();
                    featureData.setSleepSrcDataLen(sleepSrcBytes != null ? sleepSrcBytes.length : 0);
                    break;
                }
                break;
            case -63791853:
                if (key.equals(DailyReportKey.snoreRecondCount)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    snoreDecibelInfo.setCount(((Integer) value).intValue());
                    break;
                }
                break;
            case -13139450:
                if (key.equals(DailyReportKey.sleepFull)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    allDaySleepParseData.setSleepFinish(((Integer) value).intValue() == 1);
                    break;
                }
                break;
            case 126406886:
                if (key.equals(DailyReportKey.goBedTime)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Long");
                    allDaySleepParseData.setGoBedTime((Long) value);
                    break;
                }
                break;
            case 253292755:
                if (key.equals(DailyReportKey.liebBedDuratio)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Long");
                    allDaySleepParseData.setLinBedDuration((Long) value);
                    break;
                }
                break;
            case 567220776:
                if (key.equals(DailyReportKey.sleepQuality)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    allDaySleepParseData.setSleepQuality((Integer) value);
                    break;
                }
                break;
            case 721711607:
                if (key.equals(DailyReportKey.heartRateFirstTime)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Long");
                    hrInfo.setFirstRecordTime(((Long) value).longValue());
                    break;
                }
                break;
            case 831329300:
                if (key.equals(DailyReportKey.heartRateRecondCount)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    hrInfo.setCount(((Integer) value).intValue());
                    break;
                }
                break;
            case 1710568067:
                if (key.equals(DailyReportKey.bloodOxygenFirstTime)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Long");
                    spo2Info.setFirstRecordTime(((Long) value).longValue());
                    break;
                }
                break;
            case 1877536908:
                if (key.equals(DailyReportKey.snoreInterval)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    snoreDecibelInfo.setSampleUnit(((Integer) value).intValue());
                    break;
                }
                break;
            case 1917954797:
                if (key.equals("heartRates")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
                    hrInfo.setValues((List) value);
                    break;
                }
                break;
            case 1934614944:
                if (key.equals(DailyReportKey.bloodOxygenRecondCount)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    spo2Info.setCount(((Integer) value).intValue());
                    break;
                }
                break;
            case 1998991030:
                if (key.equals(DailyReportKey.snoreFirstTime)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Long");
                    snoreDecibelInfo.setFirstRecordTime(((Long) value).longValue());
                    break;
                }
                break;
        }
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @Override // com.xiaomi.fit.fitness.parser.schema.daily.BaseDailyParser
    @NotNull
    public FitnessParseResult parse$fitness_parser_release(@NotNull Map<String, ? extends Object> root, @NotNull FitnessDataId dataId) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Object obj = root.get("body");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        AllDaySleepParseData allDaySleepParseData = new AllDaySleepParseData();
        SleepItemInfo sleepItemInfo = new SleepItemInfo();
        SleepItemInfo sleepItemInfo2 = new SleepItemInfo();
        SleepItemInfo sleepItemInfo3 = new SleepItemInfo();
        FeatureData featureData = new FeatureData();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            if (entry.getValue() instanceof List) {
                convertReportData((String) entry.getKey(), entry.getValue(), allDaySleepParseData, sleepItemInfo, sleepItemInfo2, sleepItemInfo3, featureData);
            } else {
                convertReportData((String) entry.getKey(), entry.getValue(), allDaySleepParseData, sleepItemInfo, sleepItemInfo2, sleepItemInfo3, featureData);
            }
        }
        if (sleepItemInfo.getCount() != 0) {
            allDaySleepParseData.setHrInfo(new SleepAssistItemInfo(sleepItemInfo.getFirstRecordTime(), (short) sleepItemInfo.getSampleUnit(), (short) sleepItemInfo.getCount(), (Number[]) sleepItemInfo.getValues().toArray(new Number[0])));
        }
        if (sleepItemInfo2.getCount() != 0) {
            allDaySleepParseData.setSpo2Info(new SleepAssistItemInfo(sleepItemInfo2.getFirstRecordTime(), (short) sleepItemInfo2.getSampleUnit(), (short) sleepItemInfo2.getCount(), (Number[]) sleepItemInfo2.getValues().toArray(new Number[0])));
        }
        if (sleepItemInfo3.getCount() != 0) {
            allDaySleepParseData.setSnoreDecibelInfo(new SleepAssistItemInfo(sleepItemInfo3.getFirstRecordTime(), (short) sleepItemInfo3.getSampleUnit(), (short) sleepItemInfo3.getCount(), (Number[]) sleepItemInfo3.getValues().toArray(new Number[0])));
        }
        if (featureData.getSleepSrcBytes() != null) {
            allDaySleepParseData.setSleepSrcBytes(featureData.getSleepSrcBytes());
            allDaySleepParseData.setSleepSrcDataLen(featureData.getSleepSrcDataLen());
        }
        return new FitnessParseResult.Builder().allDaySleep(allDaySleepParseData).build();
    }
}
