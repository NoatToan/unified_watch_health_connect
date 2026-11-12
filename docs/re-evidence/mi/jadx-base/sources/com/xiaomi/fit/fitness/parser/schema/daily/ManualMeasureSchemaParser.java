package com.xiaomi.fit.fitness.parser.schema.daily;

import android.util.Log;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import com.xiaomi.fit.fitness.parser.data.MeasureBloodPressure;
import com.xiaomi.fit.fitness.parser.data.MeasureData;
import com.xiaomi.fit.fitness.parser.data.MeasureDataType;
import com.xiaomi.fit.fitness.parser.data.MeasureTemperature;
import com.xiaomi.fit.fitness.parser.schema.DailyReportKey;
import com.xiaomi.fit.fitness.parser.schema.sport.SchemaRecordParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\"\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u001aH\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/schema/daily/ManualMeasureSchemaParser;", "Lcom/xiaomi/fit/fitness/parser/schema/daily/BaseDailyParser;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "parse", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "root", "", "", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "parse$fitness_parser_release", "buildMeasureData", "Lcom/xiaomi/fit/fitness/parser/data/MeasureData;", "measure", "Lcom/xiaomi/fit/fitness/parser/schema/daily/ManualMeasureSchemaParser$MeasureTemp;", "convertReportData", "", "key", "value", "divideAndRound", "", "", "MeasureTemp", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nManualMeasureSchemaParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManualMeasureSchemaParser.kt\ncom/xiaomi/fit/fitness/parser/schema/daily/ManualMeasureSchemaParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,159:1\n1863#2:160\n1864#2:165\n216#3:161\n216#3,2:162\n217#3:164\n*S KotlinDebug\n*F\n+ 1 ManualMeasureSchemaParser.kt\ncom/xiaomi/fit/fitness/parser/schema/daily/ManualMeasureSchemaParser\n*L\n31#1:160\n31#1:165\n35#1:161\n38#1:162,2\n35#1:164\n*E\n"})
public final class ManualMeasureSchemaParser extends BaseDailyParser {

    @NotNull
    private final String TAG = "ManualMeasureSchemaParser";

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\u001a\u0010%\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R\u001a\u0010(\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0013\"\u0004\b*\u0010\u0015R\u001a\u0010+\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0013\"\u0004\b-\u0010\u0015R\u001a\u0010.\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0013\"\u0004\b0\u0010\u0015¨\u00061"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/schema/daily/ManualMeasureSchemaParser$MeasureTemp;", "", "<init>", "()V", "type", "", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "time", "", "getTime", "()J", "setTime", "(J)V", "hr", "getHr", "()I", "setHr", "(I)V", "spo2", "getSpo2", "setSpo2", "stress", "getStress", "setStress", "skinTemp", "", "getSkinTemp", "()F", "setSkinTemp", "(F)V", "bodyTemp", "getBodyTemp", "setBodyTemp", DailyReportKey.systolic, "getSystolic", "setSystolic", DailyReportKey.diastolic, "getDiastolic", "setDiastolic", DailyReportKey.pulse, "getPulse", "setPulse", DailyReportKey.measurementStatus, "getMeasurementStatus", "setMeasurementStatus", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MeasureTemp {
        private float bodyTemp;
        private int diastolic;
        private int hr;
        private int measurementStatus;
        private int pulse;
        private float skinTemp;
        private int spo2;
        private int stress;
        private int systolic;
        private long time;

        @MeasureDataType
        @Nullable
        private Integer type;

        public final float getBodyTemp() {
            return this.bodyTemp;
        }

        public final int getDiastolic() {
            return this.diastolic;
        }

        public final int getHr() {
            return this.hr;
        }

        public final int getMeasurementStatus() {
            return this.measurementStatus;
        }

        public final int getPulse() {
            return this.pulse;
        }

        public final float getSkinTemp() {
            return this.skinTemp;
        }

        public final int getSpo2() {
            return this.spo2;
        }

        public final int getStress() {
            return this.stress;
        }

        public final int getSystolic() {
            return this.systolic;
        }

        public final long getTime() {
            return this.time;
        }

        @Nullable
        public final Integer getType() {
            return this.type;
        }

        public final void setBodyTemp(float f) {
            this.bodyTemp = f;
        }

        public final void setDiastolic(int i) {
            this.diastolic = i;
        }

        public final void setHr(int i) {
            this.hr = i;
        }

        public final void setMeasurementStatus(int i) {
            this.measurementStatus = i;
        }

        public final void setPulse(int i) {
            this.pulse = i;
        }

        public final void setSkinTemp(float f) {
            this.skinTemp = f;
        }

        public final void setSpo2(int i) {
            this.spo2 = i;
        }

        public final void setStress(int i) {
            this.stress = i;
        }

        public final void setSystolic(int i) {
            this.systolic = i;
        }

        public final void setTime(long j) {
            this.time = j;
        }

        public final void setType(@Nullable Integer num) {
            this.type = num;
        }
    }

    private final MeasureData buildMeasureData(MeasureTemp measure) {
        Integer type = measure.getType();
        if (type != null && type.intValue() == 1) {
            return new MeasureData(1, measure.getTime(), Integer.valueOf(measure.getHr()));
        }
        if (type != null && type.intValue() == 2) {
            return new MeasureData(2, measure.getTime(), Integer.valueOf(measure.getSpo2()));
        }
        if (type != null && type.intValue() == 3) {
            return new MeasureData(3, measure.getTime(), Integer.valueOf(measure.getStress()));
        }
        if (type != null && type.intValue() == 4) {
            return new MeasureData(4, measure.getTime(), new MeasureTemperature(Float.valueOf(measure.getSkinTemp()), Float.valueOf(measure.getBodyTemp())));
        }
        if (type == null || type.intValue() != 5) {
            return null;
        }
        MeasureBloodPressure measureBloodPressure = new MeasureBloodPressure(measure.getSystolic(), measure.getDiastolic());
        measureBloodPressure.setPulse(measure.getPulse());
        measureBloodPressure.setMeasurementStatus(measure.getMeasurementStatus());
        return new MeasureData(5, measure.getTime(), measureBloodPressure);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void convertReportData(String key, Object value, MeasureTemp measure) {
        switch (key.hashCode()) {
            case -1713030542:
                if (key.equals(DailyReportKey.bodyTemperature)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    measure.setBodyTemp(divideAndRound((int) ((Double) value).doubleValue()));
                    break;
                }
                break;
            case -1201087794:
                if (key.equals(DailyReportKey.measurementStatus)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    measure.setMeasurementStatus((int) ((Double) value).doubleValue());
                    break;
                }
                break;
            case -891989580:
                if (key.equals("stress")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    measure.setStress((int) ((Double) value).doubleValue());
                    break;
                }
                break;
            case 3537088:
                if (key.equals("spo2")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    measure.setSpo2((int) ((Double) value).doubleValue());
                    break;
                }
                break;
            case 3575610:
                if (key.equals("type")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    measure.setType(Integer.valueOf((int) ((Double) value).doubleValue()));
                    break;
                }
                break;
            case 55126294:
                if (key.equals("timestamp")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    measure.setTime((long) ((Double) value).doubleValue());
                }
                break;
            case 107027353:
                if (key.equals(DailyReportKey.pulse)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    measure.setPulse((int) ((Double) value).doubleValue());
                    break;
                }
                break;
            case 200416838:
                if (key.equals("heartRate")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    measure.setHr((int) ((Double) value).doubleValue());
                    break;
                }
                break;
            case 1546077460:
                if (key.equals(DailyReportKey.diastolic)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    measure.setDiastolic((int) ((Double) value).doubleValue());
                    break;
                }
                break;
            case 1575823287:
                if (key.equals(DailyReportKey.skinTemperature)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    measure.setSkinTemp(divideAndRound((int) ((Double) value).doubleValue()));
                    break;
                }
                break;
            case 1976383358:
                if (key.equals(DailyReportKey.systolic)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    measure.setSystolic((int) ((Double) value).doubleValue());
                    break;
                }
                break;
        }
    }

    private final float divideAndRound(int value) {
        return Math.round((((double) value) / 100.0d) * ((double) 10)) / 10.0f;
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
        ArrayList arrayList = new ArrayList();
        try {
            Object obj = root.get("body");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                Map map = (Map) SchemaRecordParser.INSTANCE.getGson().fromJson((String) it.next(), new TypeToken<Map<String, ? extends Object>>() { // from class: com.xiaomi.fit.fitness.parser.schema.daily.ManualMeasureSchemaParser$parse$1$mapType$1
                }.getType());
                MeasureTemp measureTemp = new MeasureTemp();
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (entry.getValue() instanceof Map) {
                            Object value = entry.getValue();
                            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                            for (Map.Entry entry2 : ((Map) value).entrySet()) {
                                convertReportData((String) entry2.getKey(), entry2.getValue(), measureTemp);
                            }
                        } else {
                            convertReportData((String) entry.getKey(), entry.getValue(), measureTemp);
                        }
                    }
                }
                MeasureData measureDataBuildMeasureData = buildMeasureData(measureTemp);
                if (measureDataBuildMeasureData != null) {
                    arrayList.add(measureDataBuildMeasureData);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            String str = this.TAG;
            String stackTraceString = Log.getStackTraceString(e);
            Intrinsics.checkNotNullExpressionValue(stackTraceString, "getStackTraceString(...)");
            FitnessLogUtils.d(str, stackTraceString);
        }
        FitnessParseResult fitnessParseResultBuild = new FitnessParseResult.Builder().measureData(arrayList).build();
        FitnessLogUtils.i(this.TAG, "result:" + fitnessParseResultBuild);
        return fitnessParseResultBuild;
    }
}
