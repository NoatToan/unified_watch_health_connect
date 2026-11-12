package com.xiaomi.fit.fitness.parser.sport.report;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.data.mi.FitnessDataValidity;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fit.fitness.parser.utils.FitnessParserUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J \u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0002J\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/sport/report/TriathlonReportParser;", "Lcom/xiaomi/fit/fitness/parser/sport/base/SportReportBaseParser;", "<init>", "()V", "TAG", "", "reportDataTypeArray", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "parse", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "parseSubSportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "byteBuffer", "Ljava/nio/ByteBuffer;", FitnessReportKey.subSportType, "", "createSubSportType", DailyRecordKey.sportType, "version", "getReportDataType", "()[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TriathlonReportParser extends SportReportBaseParser {

    @NotNull
    private final String TAG = "TriathlonReportParser";

    @NotNull
    private final FitnessDataBaseParser.OneDimenDataType[] reportDataTypeArray = {new FitnessDataBaseParser.OneDimenDataType(1, 4, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(2, 4, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(3, 4, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(66, 4, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(67, 4, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(5, 4, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(6, 2, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(16, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(27, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(29, 2, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(68, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(69, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(70, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(4, 4, 2, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(152, 1, 4, false, null, false, null, 120, null)};

    private final FitnessDataId createSubSportType(FitnessDataId dataId, int sportType, int version) {
        return dataId.copy().sportType(sportType).version(version).fileType(1).build();
    }

    private final SportBasicReport parseSubSportReport(FitnessDataId dataId, ByteBuffer byteBuffer, int subSportType) {
        SportReportBaseParser outdoorSportReportParser;
        FitnessParserUtils fitnessParserUtils = FitnessParserUtils.INSTANCE;
        int intFor1Byte$default = FitnessParserUtils.getIntFor1Byte$default(fitnessParserUtils, byteBuffer, false, 2, null);
        FitnessDataId fitnessDataIdCreateSubSportType = createSubSportType(dataId, subSportType, intFor1Byte$default);
        FitnessDataValidity fitnessDataValidity = FitnessDataValidity.INSTANCE;
        int dataValidityLen = fitnessDataValidity.getDataValidityLen(fitnessDataIdCreateSubSportType);
        if (!fitnessDataValidity.checkSupport(dataValidityLen)) {
            FitnessLogUtils.i(this.TAG, "not support sub sport(" + fitnessDataIdCreateSubSportType + ")");
            return null;
        }
        FitnessLogUtils.i(this.TAG, "parseSubSportReport: subType=" + subSportType + ", version=" + intFor1Byte$default);
        byte[] bytes = fitnessParserUtils.getBytes(byteBuffer, dataValidityLen);
        if (subSportType == 1) {
            outdoorSportReportParser = new OutdoorSportReportParser();
        } else if (subSportType == 6) {
            outdoorSportReportParser = new OutdoorBikingReportParser();
        } else if (subSportType == 10) {
            outdoorSportReportParser = new SwimmingReportParser();
        } else if (subSportType != 22) {
            outdoorSportReportParser = subSportType != 23 ? null : new OutdoorNoStepReportParser();
        } else {
            outdoorSportReportParser = new OutdoorStepReportParser();
        }
        if (outdoorSportReportParser != null) {
            return outdoorSportReportParser.parseReport(fitnessDataIdCreateSubSportType, bytes, byteBuffer);
        }
        return null;
    }

    @Override // com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser
    @NotNull
    /* JADX INFO: renamed from: getReportDataType, reason: from getter */
    public FitnessDataBaseParser.OneDimenDataType[] getReportDataTypeArray() {
        return this.reportDataTypeArray;
    }

    @Override // com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser, com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser
    @Nullable
    public FitnessParseResult parse(@NotNull FitnessBinaryData binaryData) {
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        FitnessDataId dataId = binaryData.getDataId();
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(binaryData.getBodyData()).order(ByteOrder.LITTLE_ENDIAN);
        if (binaryData.getDataValid() == null) {
            FitnessLogUtils.w(this.TAG, "empty dataValid " + dataId);
            return null;
        }
        FitnessDataId dataId2 = binaryData.getDataId();
        byte[] dataValid = binaryData.getDataValid();
        Intrinsics.checkNotNull(byteBufferOrder);
        SportBasicReport report = parseReport(dataId2, dataValid, byteBufferOrder);
        SportBasicReport subSportReport = parseSubSportReport(dataId, byteBufferOrder, 10);
        if (subSportReport == null) {
            FitnessLogUtils.w(this.TAG, "parse swimming failed " + dataId);
            return new FitnessParseResult.Builder().sportReport(report).build();
        }
        report.setOpenSwimmingReport(subSportReport);
        SportBasicReport subSportReport2 = parseSubSportReport(dataId, byteBufferOrder, dataId.getVersion() >= 3 ? 23 : 6);
        if (subSportReport2 == null) {
            FitnessLogUtils.w(this.TAG, "parse biking failed " + dataId);
            return new FitnessParseResult.Builder().sportReport(report).build();
        }
        report.setOutdoorRidingReport(subSportReport2);
        SportBasicReport subSportReport3 = parseSubSportReport(dataId, byteBufferOrder, dataId.getVersion() >= 3 ? 22 : 1);
        if (subSportReport3 != null) {
            report.setOutdoorRunningReport(subSportReport3);
            printSportReport$fitness_parser_release(report);
            return new FitnessParseResult.Builder().sportReport(report).build();
        }
        FitnessLogUtils.w(this.TAG, "parse subSport failed " + dataId);
        return new FitnessParseResult.Builder().sportReport(report).build();
    }
}
