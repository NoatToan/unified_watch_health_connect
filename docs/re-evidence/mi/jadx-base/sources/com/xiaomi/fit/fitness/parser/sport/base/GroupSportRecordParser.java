package com.xiaomi.fit.fitness.parser.sport.base;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser;
import com.xiaomi.fit.fitness.parser.base.FourDimenDataParser;
import com.xiaomi.fit.fitness.parser.base.OneDimenDataParser;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.data.SportRecord;
import com.xiaomi.fit.fitness.parser.utils.FitnessParserUtils;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0002\u0010\u000eJ+\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fH\u0016¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/sport/base/GroupSportRecordParser;", "Lcom/xiaomi/fit/fitness/parser/sport/base/SportRecordBaseParser;", "<init>", "()V", "TAG", "", "parseFourDimenData", "", "Lcom/xiaomi/fit/fitness/parser/data/SportRecord;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "dataInfoArray", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenDataInfo;", "(Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenDataInfo;)Ljava/util/List;", "parseOneDimenData", "dataTypeArray", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "(Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;)Ljava/util/List;", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class GroupSportRecordParser extends SportRecordBaseParser {

    @NotNull
    private final String TAG = "GroupSportRecordParser";

    @Override // com.xiaomi.fit.fitness.parser.sport.base.SportRecordBaseParser
    @Nullable
    public List<SportRecord> parseFourDimenData(@NotNull FitnessBinaryData binaryData, @NotNull FitnessDataBaseParser.FourDimenDataInfo[] dataInfoArray) {
        SportRecord sportRecord;
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        Intrinsics.checkNotNullParameter(dataInfoArray, "dataInfoArray");
        if (getITSummaryDataLen$fitness_parser_release(binaryData.getDataId()) > 0) {
            return super.parseFourDimenData(binaryData, dataInfoArray);
        }
        FourDimenDataParser fourDimenDataParser = FourDimenDataParser.INSTANCE;
        FitnessDataId dataId = binaryData.getDataId();
        byte[] dataValid = binaryData.getDataValid();
        Intrinsics.checkNotNull(dataValid);
        Map<FitnessDataBaseParser.FourDimenType, FitnessDataBaseParser.FourDimenDataValid> dataValid2 = fourDimenDataParser.parseDataValid(dataId, dataInfoArray, dataValid);
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(binaryData.getBodyData()).order(ByteOrder.LITTLE_ENDIAN);
        LinkedList linkedList = new LinkedList();
        int curTzDiffInSec$fitness_parser_release = getCurTzDiffInSec$fitness_parser_release(binaryData.getDataId());
        Object obj = null;
        LinkedList linkedList2 = null;
        SportRecord sportRecord2 = null;
        long j = 0;
        long j2 = 0;
        while (byteBufferOrder.position() + 13 <= byteBufferOrder.capacity()) {
            FitnessParserUtils fitnessParserUtils = FitnessParserUtils.INSTANCE;
            Intrinsics.checkNotNull(byteBufferOrder);
            long j3 = j2;
            long intFor4Bytes$default = FitnessParserUtils.getIntFor4Bytes$default(fitnessParserUtils, byteBufferOrder, false, 2, obj);
            LinkedList linkedList3 = linkedList2;
            long j4 = j;
            long intFor4Bytes$default2 = FitnessParserUtils.getIntFor4Bytes$default(fitnessParserUtils, byteBufferOrder, false, 2, obj);
            dataValid2 = dataValid2;
            long j5 = ((long) curTzDiffInSec$fitness_parser_release) + intFor4Bytes$default2;
            boolean z = FitnessParserUtils.getIntFor1Byte$default(fitnessParserUtils, byteBufferOrder, false, 2, obj) > 0;
            long intFor4Bytes$default3 = FitnessParserUtils.getIntFor4Bytes$default(fitnessParserUtils, byteBufferOrder, false, 2, obj);
            String str = this.TAG;
            StringBuilder sb = new StringBuilder();
            SportRecord sportRecord3 = sportRecord2;
            sb.append("sportRecordCount = ");
            sb.append(intFor4Bytes$default);
            sb.append(", recordStartTime = ");
            sb.append(intFor4Bytes$default2);
            sb.append(", startTime = ");
            sb.append(j5);
            sb.append(", isGroup = ");
            sb.append(z);
            sb.append(", groupRecordCount = ");
            sb.append(intFor4Bytes$default3);
            FitnessLogUtils.i(str, sb.toString());
            SportRecord sportRecord4 = new SportRecord(j5, intFor4Bytes$default);
            parseFourDimenRecords(sportRecord4, byteBufferOrder, dataInfoArray, dataValid2);
            long j6 = j4 + intFor4Bytes$default;
            long j7 = j3 == 0 ? j5 : j3;
            LinkedList linkedList4 = linkedList3 == null ? new LinkedList() : linkedList3;
            ListExtKt.addAll(linkedList4, sportRecord4.getRecordList());
            long j8 = intFor4Bytes$default3 - j6;
            if (!z || j8 <= 0) {
                sportRecord = sportRecord3;
            } else {
                sportRecord = new SportRecord(j5 + intFor4Bytes$default, j8);
                parseFourDimenRecords(sportRecord, byteBufferOrder, dataInfoArray, dataValid2);
            }
            if (z) {
                SportRecord sportRecord5 = new SportRecord(j7, j6);
                sportRecord5.setRecordList(linkedList4);
                sportRecord5.setRestSportRecord(sportRecord);
                linkedList.add(sportRecord5);
                j = 0;
                j2 = 0;
                obj = null;
                linkedList2 = null;
                sportRecord2 = null;
            } else {
                j2 = j7;
                linkedList2 = linkedList4;
                j = j6;
                sportRecord2 = sportRecord;
                obj = null;
            }
        }
        LinkedList linkedList5 = linkedList2;
        long j9 = j;
        long j10 = j2;
        if (linkedList5 != null && (!linkedList5.isEmpty())) {
            SportRecord sportRecord6 = new SportRecord(j10, j9);
            sportRecord6.setRecordList(linkedList5);
            linkedList.add(sportRecord6);
        }
        return linkedList;
    }

    @Override // com.xiaomi.fit.fitness.parser.sport.base.SportRecordBaseParser
    @Nullable
    public List<SportRecord> parseOneDimenData(@NotNull FitnessBinaryData binaryData, @NotNull FitnessDataBaseParser.OneDimenDataType[] dataTypeArray) {
        SportRecord sportRecord;
        this = this;
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        Intrinsics.checkNotNullParameter(dataTypeArray, "dataTypeArray");
        if (this.getITSummaryDataLen$fitness_parser_release(binaryData.getDataId()) > 0) {
            return super.parseOneDimenData(binaryData, dataTypeArray);
        }
        OneDimenDataParser oneDimenDataParser = OneDimenDataParser.INSTANCE;
        FitnessDataId dataId = binaryData.getDataId();
        byte[] dataValid = binaryData.getDataValid();
        Intrinsics.checkNotNull(dataValid);
        Map<Integer, Boolean> dataValid2 = oneDimenDataParser.parseDataValid(dataTypeArray, dataId, dataValid);
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(binaryData.getBodyData()).order(ByteOrder.LITTLE_ENDIAN);
        LinkedList linkedList = new LinkedList();
        int curTzDiffInSec$fitness_parser_release = this.getCurTzDiffInSec$fitness_parser_release(binaryData.getDataId());
        Object obj = null;
        LinkedList linkedList2 = null;
        SportRecord sportRecord2 = null;
        long j = 0;
        long j2 = 0;
        while (byteBufferOrder.position() + 13 <= byteBufferOrder.capacity()) {
            FitnessParserUtils fitnessParserUtils = FitnessParserUtils.INSTANCE;
            Intrinsics.checkNotNull(byteBufferOrder);
            long intFor4Bytes$default = FitnessParserUtils.getIntFor4Bytes$default(fitnessParserUtils, byteBufferOrder, false, 2, obj);
            long j3 = j;
            long intFor4Bytes$default2 = FitnessParserUtils.getIntFor4Bytes$default(fitnessParserUtils, byteBufferOrder, false, 2, obj);
            long j4 = j2;
            long j5 = ((long) curTzDiffInSec$fitness_parser_release) + intFor4Bytes$default2;
            boolean z = FitnessParserUtils.getIntFor1Byte$default(fitnessParserUtils, byteBufferOrder, false, 2, obj) > 0;
            long intFor4Bytes$default3 = FitnessParserUtils.getIntFor4Bytes$default(fitnessParserUtils, byteBufferOrder, false, 2, obj);
            FitnessLogUtils.i(this.TAG, "sportRecordCount = " + intFor4Bytes$default + ", recordStartTime = " + intFor4Bytes$default2 + ", startTime = " + j5 + ", isGroup = " + z + ", groupRecordCount = " + intFor4Bytes$default3);
            SportRecord sportRecord3 = new SportRecord(j5, intFor4Bytes$default);
            LinkedList linkedList3 = linkedList;
            boolean z2 = z;
            long j6 = j3;
            LinkedList linkedList4 = linkedList2;
            parseOneDimenRecords(sportRecord3, byteBufferOrder, binaryData.getDataId(), dataTypeArray, dataValid2);
            long j7 = j4 + intFor4Bytes$default;
            if (j6 == 0) {
                j6 = j5;
            }
            if (linkedList4 == null) {
                linkedList4 = new LinkedList();
            }
            ListExtKt.addAll(linkedList4, sportRecord3.getRecordList());
            long j8 = intFor4Bytes$default3 - j7;
            if (!z2 || j8 <= 0) {
                sportRecord = sportRecord2;
            } else {
                sportRecord = new SportRecord(j5 + intFor4Bytes$default, j8);
                parseOneDimenRecords(sportRecord, byteBufferOrder, binaryData.getDataId(), dataTypeArray, dataValid2);
            }
            if (z2) {
                SportRecord sportRecord4 = new SportRecord(j6, j7);
                sportRecord4.setRecordList(linkedList4);
                sportRecord4.setRestSportRecord(sportRecord);
                linkedList3.add(sportRecord4);
                linkedList = linkedList3;
                j = 0;
                j2 = 0;
                linkedList2 = null;
                obj = null;
                sportRecord2 = null;
            } else {
                linkedList2 = linkedList4;
                sportRecord2 = sportRecord;
                j = j6;
                j2 = j7;
                linkedList = linkedList3;
                obj = null;
            }
        }
        long j9 = j2;
        LinkedList linkedList5 = linkedList2;
        long j10 = j;
        LinkedList linkedList6 = linkedList;
        if (linkedList5 != null && (!linkedList5.isEmpty())) {
            SportRecord sportRecord5 = new SportRecord(j10, j9);
            sportRecord5.setRecordList(linkedList5);
            linkedList6.add(sportRecord5);
        }
        return linkedList6;
    }
}
