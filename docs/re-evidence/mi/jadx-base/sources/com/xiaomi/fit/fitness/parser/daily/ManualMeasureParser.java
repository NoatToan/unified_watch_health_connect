package com.xiaomi.fit.fitness.parser.daily;

import android.util.Log;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import com.xiaomi.fit.fitness.parser.data.MeasureBloodPressure;
import com.xiaomi.fit.fitness.parser.data.MeasureData;
import com.xiaomi.fit.fitness.parser.data.MeasureTemperature;
import com.xiaomi.fit.fitness.parser.schema.ParserWayControl;
import com.xiaomi.fit.fitness.parser.schema.daily.SchemaDailyParser;
import com.xiaomi.fit.fitness.parser.utils.FitnessParserUtils;
import com.xiaomi.fit.fitness.parser.utils.ParserPreference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/daily/ManualMeasureParser;", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser;", "<init>", "()V", "TAG", "", "parse", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "nativeParseManualMeasure", "parseBloodPressure", "Lcom/xiaomi/fit/fitness/parser/data/MeasureBloodPressure;", "byteBuffer", "Ljava/nio/ByteBuffer;", "parseTemperatureRecord", "Lcom/xiaomi/fit/fitness/parser/data/MeasureTemperature;", "getDataValueLen", "", "dataType", "(I)Ljava/lang/Integer;", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ManualMeasureParser extends FitnessDataBaseParser {

    @NotNull
    private final String TAG = "ManualMeasureParser";

    private final Integer getDataValueLen(int dataType) {
        if (dataType == 1 || dataType == 2 || dataType == 3) {
            return 1;
        }
        if (dataType != 4) {
            return dataType != 5 ? null : 6;
        }
        return 4;
    }

    private final FitnessParseResult nativeParseManualMeasure(FitnessBinaryData binaryData) {
        Integer numValueOf;
        FitnessLogUtils.i(this.TAG, "nativeParse manual measure");
        FitnessDataId dataId = binaryData.getDataId();
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(binaryData.getBodyData()).order(ByteOrder.LITTLE_ENDIAN);
        LinkedList linkedList = new LinkedList();
        while (byteBufferOrder.position() + 5 <= byteBufferOrder.capacity()) {
            FitnessParserUtils fitnessParserUtils = FitnessParserUtils.INSTANCE;
            Intrinsics.checkNotNull(byteBufferOrder);
            Object temperatureRecord = null;
            long intFor4Bytes$default = FitnessParserUtils.getIntFor4Bytes$default(fitnessParserUtils, byteBufferOrder, false, 2, null);
            int intFor1Byte$default = FitnessParserUtils.getIntFor1Byte$default(fitnessParserUtils, byteBufferOrder, false, 2, null);
            if (dataId.getVersion() == 1) {
                numValueOf = getDataValueLen(intFor1Byte$default);
            } else {
                numValueOf = Integer.valueOf((intFor1Byte$default >>> 4) & 15);
                intFor1Byte$default &= 15;
            }
            if (numValueOf == null) {
                FitnessLogUtils.i(this.TAG, "no support dataType(" + intFor1Byte$default + ")-" + intFor4Bytes$default);
                break;
            }
            FitnessLogUtils.d(this.TAG, "time=" + intFor4Bytes$default + ", dataType=" + intFor1Byte$default + ", dataLen=" + numValueOf);
            if (byteBufferOrder.position() + numValueOf.intValue() > byteBufferOrder.capacity()) {
                break;
            }
            if (intFor1Byte$default == 4) {
                temperatureRecord = parseTemperatureRecord(byteBufferOrder);
            } else if (intFor1Byte$default == 5) {
                temperatureRecord = parseBloodPressure(byteBufferOrder);
            } else if (numValueOf.intValue() == 1) {
                temperatureRecord = Integer.valueOf(FitnessParserUtils.getIntFor1Byte$default(fitnessParserUtils, byteBufferOrder, false, 2, null));
            } else if (numValueOf.intValue() == 2) {
                temperatureRecord = Integer.valueOf(FitnessParserUtils.getIntFor2Bytes$default(fitnessParserUtils, byteBufferOrder, false, 2, null));
            } else {
                FitnessLogUtils.i(this.TAG, "not support data len(" + numValueOf + ")");
                fitnessParserUtils.getBytes(byteBufferOrder, numValueOf.intValue());
            }
            if (temperatureRecord != null) {
                MeasureData measureData = new MeasureData(intFor1Byte$default, intFor4Bytes$default, temperatureRecord);
                FitnessLogUtils.i(this.TAG, "measureData(" + measureData + ")- " + numValueOf);
                linkedList.add(measureData);
            }
        }
        return new FitnessParseResult.Builder().measureData(linkedList).build();
    }

    private final MeasureBloodPressure parseBloodPressure(ByteBuffer byteBuffer) {
        FitnessParserUtils fitnessParserUtils = FitnessParserUtils.INSTANCE;
        MeasureBloodPressure measureBloodPressure = new MeasureBloodPressure(FitnessParserUtils.getIntFor2Bytes$default(fitnessParserUtils, byteBuffer, false, 2, null), FitnessParserUtils.getIntFor2Bytes$default(fitnessParserUtils, byteBuffer, false, 2, null));
        measureBloodPressure.setPulse(FitnessParserUtils.getIntFor1Byte$default(fitnessParserUtils, byteBuffer, false, 2, null));
        measureBloodPressure.setMeasurementStatus(FitnessParserUtils.getIntFor1Byte$default(fitnessParserUtils, byteBuffer, false, 2, null));
        return measureBloodPressure;
    }

    private final MeasureTemperature parseTemperatureRecord(ByteBuffer byteBuffer) {
        FitnessParserUtils fitnessParserUtils = FitnessParserUtils.INSTANCE;
        int intFor2Bytes$default = FitnessParserUtils.getIntFor2Bytes$default(fitnessParserUtils, byteBuffer, false, 2, null);
        int intFor2Bytes$default2 = FitnessParserUtils.getIntFor2Bytes$default(fitnessParserUtils, byteBuffer, false, 2, null);
        MeasureTemperature measureTemperature = new MeasureTemperature(null, null, 3, null);
        if (intFor2Bytes$default > 0) {
            measureTemperature.setSkinTemp(Float.valueOf(intFor2Bytes$default / 100.0f));
        }
        if (intFor2Bytes$default2 > 0) {
            measureTemperature.setBodyTemp(Float.valueOf(intFor2Bytes$default2 / 100.0f));
        }
        return measureTemperature;
    }

    @Override // com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser
    @Nullable
    public FitnessParseResult parse(@NotNull FitnessBinaryData binaryData) {
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        ParserWayControl parserWayControl = ParserWayControl.INSTANCE;
        String schema = parserWayControl.getSchema(binaryData);
        if (schema == null || !(!StringsKt__StringsKt.isBlank(schema))) {
            FitnessLogUtils.i(this.TAG, "parse manual measure by native");
            if (ParserPreference.INSTANCE.getIS_USE_NATIVE_PARSER()) {
                return nativeParseManualMeasure(binaryData);
            }
            return null;
        }
        try {
            FitnessLogUtils.i(this.TAG, "parse manual measure by schema");
            SchemaDailyParser schemaDailyParser = SchemaDailyParser.INSTANCE;
            String schema2 = parserWayControl.getSchema(binaryData);
            Intrinsics.checkNotNull(schema2);
            return schemaDailyParser.parser(binaryData, schema2);
        } catch (Exception e) {
            FitnessLogUtils.i(this.TAG, "parse manual measure by schema error , e:" + e + " ,trace:" + Log.getStackTraceString(e));
            if (ParserPreference.INSTANCE.getIS_USE_NATIVE_PARSER()) {
                return nativeParseManualMeasure(binaryData);
            }
            return null;
        }
    }
}
