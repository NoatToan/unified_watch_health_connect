package com.xiaomi.fit.fitness.parser.sport.base;

import android.util.Log;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser;
import com.xiaomi.fit.fitness.parser.base.FourDimenDataParser;
import com.xiaomi.fit.fitness.parser.base.OneDimenDataParser;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import com.xiaomi.fit.fitness.parser.data.OneSportRecord;
import com.xiaomi.fit.fitness.parser.data.SportRecord;
import com.xiaomi.fit.fitness.parser.schema.FitnessRecordKey;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.fit.fitness.parser.schema.ParserWayControl;
import com.xiaomi.fit.fitness.parser.schema.sport.SchemaRecordParser;
import com.xiaomi.fit.fitness.parser.utils.FitnessParserUtils;
import com.xiaomi.fit.fitness.parser.utils.ParserPreference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u0001:\u0001FB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0015\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0016¢\u0006\u0002\u0010\u0015J&\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J&\u0010\u001e\u001a\u00020\u001f2\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010!\u001a\u00020\rH\u0002J\u0015\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0016¢\u0006\u0002\u0010\u0015J\u0015\u0010#\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0000¢\u0006\u0002\b$J \u0010%\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\rH\u0002J;\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0002¢\u0006\u0002\u0010(J\u0017\u0010*\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0000¢\u0006\u0002\b+J+\u0010,\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\t2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u0013H\u0016¢\u0006\u0002\u0010/J?\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u00100\u001a\u0002012\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00132\u0006\u00102\u001a\u00020\u0011¢\u0006\u0002\u00103J=\u00104\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00132\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u0017¢\u0006\u0002\u00108J+\u00109\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\t2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0002\u0010;J?\u00109\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u00100\u001a\u0002012\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u00102\u001a\u00020\u0011¢\u0006\u0002\u0010<JE\u0010=\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00110\u0017¢\u0006\u0002\u0010>J0\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\f2\u0006\u0010!\u001a\u00020\r2\u0018\u0010A\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00180\u00170\fH\u0002J4\u0010B\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\r2\u0006\u0010C\u001a\u00020@2\u0006\u0010D\u001a\u00020\u000f2\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00180\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/sport/base/SportRecordBaseParser;", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser;", "<init>", "()V", "TAG", "", "parse", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "nativeParse", "parseRecord", "", "Lcom/xiaomi/fit/fitness/parser/data/SportRecord;", "getDistanceRecordTimes", "", "isSwimmingSport", "", "getPauseInitialDataTypes", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "()[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "parsePauseInitialData", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DataValueItem;", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "byteBuffer", "Ljava/nio/ByteBuffer;", "getPauseInitialDataLen", "setInitDataValue", "", "initDataValue", "sportRecord", "getITSummaryDataType", "getITSummaryDataLen", "getITSummaryDataLen$fitness_parser_release", "parseITSummaryData", "parsePauseHeaderMoreInfo", "dataTypes", "(Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;Ljava/nio/ByteBuffer;[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;)Ljava/util/Map;", "tzDiffInSec", "getCurTzDiffInSec", "getCurTzDiffInSec$fitness_parser_release", "parseFourDimenData", "dataInfoArray", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenDataInfo;", "(Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenDataInfo;)Ljava/util/List;", "dataValid", "", "isTriathlonSubType", "(Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;[BLjava/nio/ByteBuffer;[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenDataInfo;Z)Ljava/util/List;", "parseFourDimenRecords", "dataValidMap", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenType;", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenDataValid;", "(Lcom/xiaomi/fit/fitness/parser/data/SportRecord;Ljava/nio/ByteBuffer;[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenDataInfo;Ljava/util/Map;)V", "parseOneDimenData", "dataTypeArray", "(Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;)Ljava/util/List;", "(Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;[BLjava/nio/ByteBuffer;[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;Z)Ljava/util/List;", "parseOneDimenRecords", "(Lcom/xiaomi/fit/fitness/parser/data/SportRecord;Ljava/nio/ByteBuffer;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;Ljava/util/Map;)V", "processSportRecordList", "Lcom/xiaomi/fit/fitness/parser/data/OneSportRecord;", "recordList", "setSportRecordItemValue", "thisSportRecord", "type", "thisRecordMap", "DataItemType", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportRecordBaseParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordBaseParser.kt\ncom/xiaomi/fit/fitness/parser/sport/base/SportRecordBaseParser\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,615:1\n216#2,2:616\n216#2,2:618\n*S KotlinDebug\n*F\n+ 1 SportRecordBaseParser.kt\ncom/xiaomi/fit/fitness/parser/sport/base/SportRecordBaseParser\n*L\n187#1:616,2\n215#1:618,2\n*E\n"})
public abstract class SportRecordBaseParser extends FitnessDataBaseParser {

    @NotNull
    private final String TAG = "SportRecordBaseParser";
    private int tzDiffInSec;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\\\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006a"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/sport/base/SportRecordBaseParser$DataItemType;", "", "<init>", "()V", FitnessRecordKey.skiPath, "", "swimmingType", "initHeight", "endTime", "calories", "totalCal", "steps", "hr", "integerKM", "heightChangeSign", "heightChangeValue", "distance", "turnCount", FitnessReportKey.mainPosture, "pace", "swolf", FitnessReportKey.strokeCount, "strokeFreq", "unknownStrokeFreq", "breastStrokeFreq", "crawlStrokeFreq", "backStrokeFreq", "butterflyStrokeFreq", "resistance", "pullOars", "layOars", "rowCount", "shootCount", FitnessReportKey.dribbleDuration, "swingCount", "swingType", "backSwingDuration", "downSwingDuration", FitnessRecordKey.swingRhythm, FitnessRecordKey.swingSpeed, "skipCount", "skipStartingHeight", "stumbleTimes", "spo2", "stress", FitnessRecordKey.stride, "itState", "itTotalCount", "itTotalDistance", "landingImpact", "touchdownTime", "inTheAirTime", "power", "touchdownAirRatio", FitnessRecordKey.cadence, FitnessRecordKey.cycleCadence, "speed", "rowingCadence", "jumpCadence", "itTotalSteps", "itTotalPaces", FitnessRecordKey.equalIntensityPace, FitnessRecordKey.runningPower, "itTotalSpeed", "itSkiTotalTime", "itSkiTotalDistance", "itSkiAvgSpeed", "itSkiMaxSpeed", "itSkiSlope", "divingType", "divingInSectionDuration", "divingOutSectionDuration", "divingAvgDepth", "divingMaxDepth", "divingAvgTemperature", "divingStatus", "divingDepth", "divingTemperature", "speedChangeSign", "speedChangeValue", "divingMinTemperature", "divingAvgDownSpeed", "divingAvgUpSpeed", "itTotalDuration", FitnessRecordKey.verticalStrideRatio, FitnessRecordKey.verticalAmplitude, "freeBreathAngle", "freePitchAngle", "frogBreathAngle", "frogSkiDuration", "swimHrCount", "swimHr", "heightValue", "distanceDouble", "itActionCount", "itTotalWeight", "itActionType", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DataItemType {

        @NotNull
        public static final DataItemType INSTANCE = new DataItemType();
        public static final int backStrokeFreq = 21;
        public static final int backSwingDuration = 31;
        public static final int breastStrokeFreq = 19;
        public static final int butterflyStrokeFreq = 22;
        public static final int cadence = 49;
        public static final int calories = 2;
        public static final int crawlStrokeFreq = 20;
        public static final int cycleCadence = 50;
        public static final int distance = 9;
        public static final int distanceDouble = 88;
        public static final int divingAvgDepth = 67;
        public static final int divingAvgDownSpeed = 76;
        public static final int divingAvgTemperature = 69;
        public static final int divingAvgUpSpeed = 77;
        public static final int divingDepth = 71;
        public static final int divingInSectionDuration = 65;
        public static final int divingMaxDepth = 68;
        public static final int divingMinTemperature = 75;
        public static final int divingOutSectionDuration = 66;
        public static final int divingStatus = 70;
        public static final int divingTemperature = 72;
        public static final int divingType = 64;
        public static final int downSwingDuration = 32;
        public static final int dribbleDuration = 28;
        public static final int endTime = 1;
        public static final int equalIntensityPace = 56;
        public static final int freeBreathAngle = 81;
        public static final int freePitchAngle = 82;
        public static final int frogBreathAngle = 83;
        public static final int frogSkiDuration = 84;
        public static final int heightChangeSign = 7;
        public static final int heightChangeValue = 8;
        public static final int heightValue = 87;
        public static final int hr = 5;
        public static final int inTheAirTime = 46;
        public static final int initHeight = 0;
        public static final int integerKM = 6;
        public static final int itActionCount = 89;
        public static final int itActionType = 91;
        public static final int itSkiAvgSpeed = 61;
        public static final int itSkiMaxSpeed = 62;
        public static final int itSkiSlope = 63;
        public static final int itSkiTotalDistance = 60;
        public static final int itSkiTotalTime = 59;
        public static final int itState = 41;
        public static final int itTotalCount = 42;
        public static final int itTotalDistance = 43;
        public static final int itTotalDuration = 78;
        public static final int itTotalPaces = 55;
        public static final int itTotalSpeed = 58;
        public static final int itTotalSteps = 54;
        public static final int itTotalWeight = 90;
        public static final int jumpCadence = 53;
        public static final int landingImpact = 44;
        public static final int layOars = 25;
        public static final int mainPosture = 11;
        public static final int pace = 12;
        public static final int power = 47;
        public static final int pullOars = 24;
        public static final int resistance = 23;
        public static final int rowCount = 26;
        public static final int rowingCadence = 52;
        public static final int runningPower = 57;
        public static final int shootCount = 27;
        public static final int skiPath = -2;
        public static final int skipCount = 35;
        public static final int skipStartingHeight = 36;
        public static final int speed = 51;
        public static final int speedChangeSign = 73;
        public static final int speedChangeValue = 74;
        public static final int spo2 = 38;
        public static final int steps = 4;
        public static final int stress = 39;
        public static final int stride = 40;
        public static final int strokeCount = 16;
        public static final int strokeFreq = 17;
        public static final int stumbleTimes = 37;
        public static final int swimHr = 86;
        public static final int swimHrCount = 85;
        public static final int swimmingType = -1;
        public static final int swingCount = 29;
        public static final int swingRhythm = 33;
        public static final int swingSpeed = 34;
        public static final int swingType = 30;
        public static final int swolf = 13;
        public static final int totalCal = 3;
        public static final int touchdownAirRatio = 48;
        public static final int touchdownTime = 45;
        public static final int turnCount = 10;
        public static final int unknownStrokeFreq = 18;
        public static final int verticalAmplitude = 80;
        public static final int verticalStrideRatio = 79;

        private DataItemType() {
        }
    }

    private final int getPauseInitialDataLen(FitnessDataId dataId) {
        FitnessDataBaseParser.OneDimenDataType[] pauseInitialDataTypes = getPauseInitialDataTypes();
        if (pauseInitialDataTypes == null || pauseInitialDataTypes.length == 0) {
            return 0;
        }
        return OneDimenDataParser.INSTANCE.getOneRecordLeastDataLen$fitness_parser_release(pauseInitialDataTypes, dataId.getVersion());
    }

    private final FitnessParseResult nativeParse(FitnessBinaryData binaryData) {
        FitnessLogUtils.i(this.TAG, "nativeParse record");
        List<SportRecord> record = parseRecord(binaryData);
        if (record == null) {
            return null;
        }
        Map<Integer, ? extends List<SportRecord>> mapSingletonMap = Collections.singletonMap(Integer.valueOf(binaryData.getDataId().getSportType()), record);
        FitnessParseResult.Builder builder = new FitnessParseResult.Builder();
        Intrinsics.checkNotNull(mapSingletonMap);
        return builder.sportRecord(mapSingletonMap).build();
    }

    private final void parseITSummaryData(FitnessDataId dataId, ByteBuffer byteBuffer, SportRecord sportRecord) {
        Integer iTState;
        Map<Integer, FitnessDataBaseParser.DataValueItem> pauseHeaderMoreInfo = parsePauseHeaderMoreInfo(dataId, byteBuffer, getITSummaryDataType());
        if (pauseHeaderMoreInfo != null) {
            for (Map.Entry<Integer, FitnessDataBaseParser.DataValueItem> entry : pauseHeaderMoreInfo.entrySet()) {
                int iIntValue = entry.getValue().getValue().intValue();
                int iIntValue2 = entry.getKey().intValue();
                if (iIntValue2 == 54) {
                    sportRecord.setItTotalSteps(Integer.valueOf(iIntValue));
                } else if (iIntValue2 != 55) {
                    switch (iIntValue2) {
                        case 41:
                            sportRecord.setSportPause((iIntValue & 128) == 0);
                            sportRecord.setITState(Integer.valueOf(iIntValue & 127));
                            FitnessLogUtils.i(this.TAG, "interval/course training:isPause = " + sportRecord.getIsSportPause() + ", state = " + sportRecord.getITState());
                            if (sportRecord.getIsSportPause() && (iTState = sportRecord.getITState()) != null && iTState.intValue() == 32) {
                                sportRecord.setITState(128);
                            }
                            break;
                        case 42:
                            sportRecord.setITTotalCount(Integer.valueOf(iIntValue));
                            break;
                        case 43:
                            sportRecord.setITTotalDistance(Integer.valueOf(iIntValue));
                            break;
                        default:
                            switch (iIntValue2) {
                                case 58:
                                    sportRecord.setItAvgSpeed(Float.valueOf(iIntValue / 10.0f));
                                    break;
                                case 59:
                                    sportRecord.setItSkiTotalTime(Integer.valueOf(iIntValue));
                                    break;
                                case 60:
                                    sportRecord.setItSkiTotalDistance(Integer.valueOf(iIntValue));
                                    break;
                                case 61:
                                    sportRecord.setItSkiAvgSpeed(Float.valueOf(iIntValue / 10.0f));
                                    break;
                                case 62:
                                    sportRecord.setItSkiMaxSpeed(Float.valueOf(iIntValue / 10.0f));
                                    break;
                                case 63:
                                    sportRecord.setItSkiSlope(Integer.valueOf(iIntValue));
                                    break;
                                case 64:
                                    sportRecord.setDivingType(Integer.valueOf(iIntValue));
                                    break;
                                case 65:
                                    sportRecord.setDivingInSectionDuration(Integer.valueOf(iIntValue));
                                    break;
                                case 66:
                                    sportRecord.setDivingOutSectionDuration(Integer.valueOf(iIntValue));
                                    break;
                                case 67:
                                    sportRecord.setDivingAvgDepth(Float.valueOf(iIntValue / 10.0f));
                                    break;
                                case 68:
                                    sportRecord.setDivingMaxDepth(Float.valueOf(iIntValue / 10.0f));
                                    break;
                                case 69:
                                    sportRecord.setDivingAvgTemperature(Float.valueOf(iIntValue / 10.0f));
                                    break;
                                default:
                                    switch (iIntValue2) {
                                        case 75:
                                            sportRecord.setDivingMinTemperature(Float.valueOf(iIntValue / 10.0f));
                                            break;
                                        case 76:
                                            sportRecord.setDivingAvgDownSpeed(Float.valueOf(iIntValue / 10.0f));
                                            break;
                                        case 77:
                                            sportRecord.setDivingAvgUpSpeed(Float.valueOf(iIntValue / 10.0f));
                                            break;
                                        case 78:
                                            sportRecord.setItTotalDuration(Integer.valueOf(iIntValue));
                                            break;
                                        default:
                                            switch (iIntValue2) {
                                                case 89:
                                                    sportRecord.setItActionCount(Integer.valueOf(iIntValue));
                                                    break;
                                                case 90:
                                                    sportRecord.setItTotalWeight(Integer.valueOf(iIntValue));
                                                    break;
                                                case 91:
                                                    sportRecord.setItActionType(Integer.valueOf(iIntValue));
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    sportRecord.setItAvgPaces(Integer.valueOf(iIntValue));
                }
            }
        }
    }

    private final Map<Integer, FitnessDataBaseParser.DataValueItem> parsePauseHeaderMoreInfo(FitnessDataId dataId, ByteBuffer byteBuffer, FitnessDataBaseParser.OneDimenDataType[] dataTypes) {
        if (dataTypes == null || dataTypes.length == 0) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator it = ArrayIteratorKt.iterator(dataTypes);
        while (it.hasNext()) {
            FitnessDataBaseParser.OneDimenDataType oneDimenDataType = (FitnessDataBaseParser.OneDimenDataType) it.next();
            map.put(Integer.valueOf(oneDimenDataType.getType()), Boolean.valueOf(dataId.getVersion() >= oneDimenDataType.getSupportVersion()));
        }
        return OneDimenDataParser.INSTANCE.parseOneRecord(dataTypes, dataId, map, byteBuffer);
    }

    private final Map<Integer, FitnessDataBaseParser.DataValueItem> parsePauseInitialData(FitnessDataId dataId, ByteBuffer byteBuffer) {
        return parsePauseHeaderMoreInfo(dataId, byteBuffer, getPauseInitialDataTypes());
    }

    private final List<OneSportRecord> processSportRecordList(SportRecord sportRecord, List<? extends Map<Integer, FitnessDataBaseParser.DataValueItem>> recordList) {
        Integer type;
        LinkedList linkedList = new LinkedList();
        long startTime = sportRecord.getStartTime();
        long startTime2 = sportRecord.getStartTime();
        for (Map<Integer, FitnessDataBaseParser.DataValueItem> map : recordList) {
            OneSportRecord oneSportRecord = new OneSportRecord(startTime, 1 + startTime);
            Iterator<Integer> it = map.keySet().iterator();
            while (it.hasNext()) {
                setSportRecordItemValue(sportRecord, oneSportRecord, it.next().intValue(), map);
            }
            if (isSwimmingSport() && (type = oneSportRecord.getType()) != null && type.intValue() == 1) {
                oneSportRecord.setStartTime(startTime2);
                startTime2 = oneSportRecord.getEndTime();
            }
            oneSportRecord.setDuration((int) (oneSportRecord.getEndTime() - oneSportRecord.getStartTime()));
            startTime = oneSportRecord.getEndTime();
            linkedList.add(oneSportRecord);
        }
        FitnessLogUtils.i(this.TAG, "one pause record size = " + linkedList.size());
        return linkedList;
    }

    private final void setInitDataValue(Map<Integer, FitnessDataBaseParser.DataValueItem> initDataValue, SportRecord sportRecord) {
        if (initDataValue != null) {
            for (Map.Entry<Integer, FitnessDataBaseParser.DataValueItem> entry : initDataValue.entrySet()) {
                Number value = entry.getValue().getValue();
                int iIntValue = entry.getKey().intValue();
                if (iIntValue == -2) {
                    sportRecord.setSkiPath(Integer.valueOf(value.intValue()));
                } else if (iIntValue == 0) {
                    sportRecord.setHeight(Float.valueOf(value.floatValue()));
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:92:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:93:0x040d  */
    /* JADX WARN: Switch 'out' block B:93:0x040d for B:16:0x0029 already processed. Defaulting to fallback option. */
    /* JADX WARN: Switch 'out' block B:93:0x040d for B:17:0x002c already processed. Defaulting to fallback option. */
    /* JADX WARN: Switch 'out' block B:93:0x040d for B:18:0x002f already processed. Defaulting to fallback option. */
    private final void setSportRecordItemValue(SportRecord sportRecord, OneSportRecord thisSportRecord, int type, Map<Integer, FitnessDataBaseParser.DataValueItem> thisRecordMap) {
        FitnessDataBaseParser.DataValueItem dataValueItem;
        float f;
        float fIntValue;
        FitnessDataBaseParser.DataValueItem dataValueItem2 = thisRecordMap.get(Integer.valueOf(type));
        if (dataValueItem2 == null || !dataValueItem2.getValid()) {
            return;
        }
        if (type != -1) {
            if (type == 56) {
                thisSportRecord.setEqualIntensityPace(Integer.valueOf(dataValueItem2.getValue().intValue()));
                return;
            }
            if (type == 57) {
                thisSportRecord.setRunningPower(Integer.valueOf(dataValueItem2.getValue().intValue()));
                return;
            }
            switch (type) {
                case 1:
                    thisSportRecord.setEndTime(dataValueItem2.getValue().longValue() + ((long) getCurTzDiffInSec$fitness_parser_release(null)));
                    break;
                case 2:
                    thisSportRecord.setCalories(Integer.valueOf(dataValueItem2.getValue().intValue()));
                    break;
                case 3:
                    thisSportRecord.setTotalCal(Integer.valueOf(dataValueItem2.getValue().intValue()));
                    break;
                case 4:
                    thisSportRecord.setSteps(Integer.valueOf(dataValueItem2.getValue().intValue()));
                    break;
                case 5:
                    thisSportRecord.setHr(Integer.valueOf(dataValueItem2.getValue().intValue()));
                    break;
                case 6:
                    thisSportRecord.setWholeKMPoint(Boolean.valueOf(dataValueItem2.getValue().intValue() > 0));
                    break;
                case 7:
                    break;
                case 8:
                    if (sportRecord.getHeight() != null && (dataValueItem = thisRecordMap.get(7)) != null && dataValueItem.getValid()) {
                        float fIntValue2 = ((dataValueItem.getValue().intValue() != 0 ? 1 : -1) * dataValueItem2.getValue().intValue()) / 10.0f;
                        Float height = sportRecord.getHeight();
                        Intrinsics.checkNotNull(height);
                        thisSportRecord.setHeight(Float.valueOf(height.floatValue() + fIntValue2));
                        thisSportRecord.setHeightChange(Float.valueOf(fIntValue2));
                        sportRecord.setHeight(thisSportRecord.getHeight());
                        break;
                    }
                    break;
                case 9:
                    thisSportRecord.setDistance(Float.valueOf(dataValueItem2.getValue().intValue() / (getDistanceRecordTimes() * 1.0f)));
                    break;
                case 10:
                    thisSportRecord.setCount(Integer.valueOf(dataValueItem2.getValue().intValue()));
                    break;
                case 11:
                    thisSportRecord.setMainPosture(Integer.valueOf(dataValueItem2.getValue().intValue()));
                    break;
                case 12:
                    thisSportRecord.setPace(Integer.valueOf(dataValueItem2.getValue().intValue()));
                    break;
                case 13:
                    thisSportRecord.setSwolf(Integer.valueOf(dataValueItem2.getValue().intValue()));
                    break;
                default:
                    switch (type) {
                        case 16:
                            thisSportRecord.setStrokeCount(Integer.valueOf(dataValueItem2.getValue().intValue()));
                            break;
                        case 17:
                            thisSportRecord.setStrokeFreq(Integer.valueOf(dataValueItem2.getValue().intValue()));
                            break;
                        case 18:
                            thisSportRecord.setUnknownStrokeFreq(Integer.valueOf(dataValueItem2.getValue().intValue()));
                            break;
                        case 19:
                            thisSportRecord.setBreastStrokeFreq(Integer.valueOf(dataValueItem2.getValue().intValue()));
                            break;
                        case 20:
                            thisSportRecord.setCrawlStrokeFreq(Integer.valueOf(dataValueItem2.getValue().intValue()));
                            break;
                        case 21:
                            thisSportRecord.setBackStrokeFreq(Integer.valueOf(dataValueItem2.getValue().intValue()));
                            break;
                        case 22:
                            thisSportRecord.setButterflyStrokeFreq(Integer.valueOf(dataValueItem2.getValue().intValue()));
                            break;
                        case 23:
                            thisSportRecord.setResistance(Integer.valueOf(dataValueItem2.getValue().intValue()));
                            break;
                        case 24:
                            thisSportRecord.setPullOars(Integer.valueOf(dataValueItem2.getValue().intValue()));
                            break;
                        case 25:
                            thisSportRecord.setLayOars(Integer.valueOf(dataValueItem2.getValue().intValue()));
                            break;
                        case 26:
                        case 27:
                        case 29:
                        case 35:
                            thisSportRecord.setCount(Integer.valueOf(dataValueItem2.getValue().intValue()));
                            break;
                        case 28:
                            thisSportRecord.setDribbleDuration(Integer.valueOf(dataValueItem2.getValue().intValue()));
                            break;
                        case 30:
                            break;
                        case 31:
                            thisSportRecord.setBackSwingDuration(Float.valueOf(dataValueItem2.getValue().intValue() / 100.0f));
                            break;
                        case 32:
                            thisSportRecord.setDownSwingDuration(Float.valueOf(dataValueItem2.getValue().intValue() / 100.0f));
                            break;
                        case 33:
                            thisSportRecord.setSwingRhythm(Float.valueOf(dataValueItem2.getValue().intValue() / 10.0f));
                            break;
                        case 34:
                            thisSportRecord.setSwingSpeed(Float.valueOf(dataValueItem2.getValue().intValue() / 10.0f));
                            break;
                        case 36:
                            thisSportRecord.setSkipStartingHeight(Integer.valueOf(dataValueItem2.getValue().intValue()));
                            break;
                        case 37:
                            thisSportRecord.setStumbleTimes(Integer.valueOf(dataValueItem2.getValue().intValue()));
                            break;
                        case 38:
                            thisSportRecord.setSpo2(Integer.valueOf(dataValueItem2.getValue().intValue()));
                            break;
                        case 39:
                            thisSportRecord.setStress(Integer.valueOf(dataValueItem2.getValue().intValue()));
                            break;
                        case 40:
                            thisSportRecord.setStride(Integer.valueOf(dataValueItem2.getValue().intValue()));
                            break;
                        default:
                            switch (type) {
                                case 44:
                                    thisSportRecord.setLandingImpact(Float.valueOf(dataValueItem2.getValue().intValue() / 10.0f));
                                    break;
                                case 45:
                                    thisSportRecord.setTouchdownTime(Integer.valueOf(dataValueItem2.getValue().intValue()));
                                    break;
                                case 46:
                                    thisSportRecord.setInTheAirTime(Integer.valueOf(dataValueItem2.getValue().intValue()));
                                    break;
                                case 47:
                                    thisSportRecord.setPower(Integer.valueOf(dataValueItem2.getValue().intValue()));
                                    break;
                                case 48:
                                    thisSportRecord.setTouchdownAirRatio(Float.valueOf(dataValueItem2.getValue().intValue() / 10.0f));
                                    break;
                                case 49:
                                    thisSportRecord.setCadence(Integer.valueOf(dataValueItem2.getValue().intValue()));
                                    break;
                                case 50:
                                    thisSportRecord.setCycleCadence(Integer.valueOf(dataValueItem2.getValue().intValue()));
                                    break;
                                case 51:
                                    thisSportRecord.setSpeed(Float.valueOf(dataValueItem2.getValue().intValue() / 10.0f));
                                    break;
                                case 52:
                                    thisSportRecord.setRowingCadence(Integer.valueOf(dataValueItem2.getValue().intValue()));
                                    break;
                                case 53:
                                    thisSportRecord.setJumpCadence(Integer.valueOf(dataValueItem2.getValue().intValue()));
                                    break;
                                default:
                                    switch (type) {
                                        case 70:
                                            thisSportRecord.setDivingStatus(Integer.valueOf(dataValueItem2.getValue().intValue()));
                                            break;
                                        case 71:
                                            thisSportRecord.setDivingDepth(Float.valueOf(dataValueItem2.getValue().intValue() / 10.0f));
                                            break;
                                        case 72:
                                            thisSportRecord.setDivingTemperature(Float.valueOf(dataValueItem2.getValue().intValue() / 10.0f));
                                            break;
                                        case 73:
                                            break;
                                        case 74:
                                            FitnessDataBaseParser.DataValueItem dataValueItem3 = thisRecordMap.get(73);
                                            if (dataValueItem3 != null && dataValueItem3.getValid() && dataValueItem3.getValue().intValue() == 1) {
                                                fIntValue = dataValueItem2.getValue().intValue();
                                            } else {
                                                if (dataValueItem3 != null && dataValueItem3.getValid() && dataValueItem3.getValue().intValue() == 0) {
                                                    fIntValue = dataValueItem2.getValue().intValue() * (-1.0f);
                                                } else {
                                                    f = 0.0f;
                                                }
                                                thisSportRecord.setSpeed(Float.valueOf(f));
                                            }
                                            f = fIntValue / 10.0f;
                                            thisSportRecord.setSpeed(Float.valueOf(f));
                                            break;
                                        default:
                                            switch (type) {
                                                case 79:
                                                    thisSportRecord.setVerticalStrideRatio(Float.valueOf(dataValueItem2.getValue().intValue() / 10.0f));
                                                    break;
                                                case 80:
                                                    thisSportRecord.setVerticalAmplitude(Float.valueOf(dataValueItem2.getValue().intValue() / 10.0f));
                                                    break;
                                                case 81:
                                                    thisSportRecord.setFreeBreathAngle(Integer.valueOf(dataValueItem2.getValue().intValue()));
                                                    break;
                                                case 82:
                                                    thisSportRecord.setFreePitchAngle(Integer.valueOf(dataValueItem2.getValue().intValue()));
                                                    break;
                                                case 83:
                                                    thisSportRecord.setFrogBreathAngle(Integer.valueOf(dataValueItem2.getValue().intValue()));
                                                    break;
                                                case 84:
                                                    thisSportRecord.setFrogSkiDuration(Integer.valueOf(dataValueItem2.getValue().intValue()));
                                                    break;
                                                case 85:
                                                    thisSportRecord.setSwimmingHrCount(Integer.valueOf(dataValueItem2.getValue().intValue()));
                                                    break;
                                                case 86:
                                                    byte[] bytes = dataValueItem2.getBytes();
                                                    int iIntValue = dataValueItem2.getValue().intValue();
                                                    if (bytes != null && iIntValue > 0) {
                                                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iIntValue);
                                                        byteBufferAllocate.put(bytes);
                                                        byteBufferAllocate.flip();
                                                        ArrayList arrayList = new ArrayList();
                                                        for (int i = 0; i < iIntValue; i++) {
                                                            FitnessParserUtils fitnessParserUtils = FitnessParserUtils.INSTANCE;
                                                            Intrinsics.checkNotNull(byteBufferAllocate);
                                                            arrayList.add(Integer.valueOf(FitnessParserUtils.getIntFor1Byte$default(fitnessParserUtils, byteBufferAllocate, false, 2, null)));
                                                        }
                                                        thisSportRecord.setSwimmingHr(arrayList);
                                                        break;
                                                    }
                                                    break;
                                                case 87:
                                                    thisSportRecord.setHeight(dataValueItem2.getValue().intValue() != 65535 ? Float.valueOf(dataValueItem2.getValue().intValue() / 10.0f) : sportRecord.getHeight());
                                                    sportRecord.setHeight(thisSportRecord.getHeight());
                                                    break;
                                                case 88:
                                                    thisSportRecord.setDistance(Float.valueOf(dataValueItem2.getValue().intValue() / (getDistanceRecordTimes() * 1.0f)));
                                                    break;
                                                default:
                                                    FitnessLogUtils.e(this.TAG, "no adapter record type(" + type + ")");
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        thisSportRecord.setType(Integer.valueOf(dataValueItem2.getValue().intValue()));
    }

    public final int getCurTzDiffInSec$fitness_parser_release(@Nullable FitnessDataId dataId) {
        if (dataId == null) {
            return this.tzDiffInSec;
        }
        int tzOffsetInSec = dataId.getTzOffsetInSec() - FitnessDateUtils.getCurrentTZOffsetInSec();
        this.tzDiffInSec = tzOffsetInSec;
        return tzOffsetInSec;
    }

    public int getDistanceRecordTimes() {
        return 10;
    }

    public final int getITSummaryDataLen$fitness_parser_release(@NotNull FitnessDataId dataId) {
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        FitnessDataBaseParser.OneDimenDataType[] iTSummaryDataType = getITSummaryDataType();
        if (iTSummaryDataType == null || iTSummaryDataType.length == 0) {
            return 0;
        }
        return OneDimenDataParser.INSTANCE.getOneRecordLeastDataLen$fitness_parser_release(iTSummaryDataType, dataId.getVersion());
    }

    @Nullable
    public FitnessDataBaseParser.OneDimenDataType[] getITSummaryDataType() {
        return null;
    }

    @Nullable
    public FitnessDataBaseParser.OneDimenDataType[] getPauseInitialDataTypes() {
        return null;
    }

    public boolean isSwimmingSport() {
        return false;
    }

    @Override // com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser
    @Nullable
    public FitnessParseResult parse(@NotNull FitnessBinaryData binaryData) {
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        ParserWayControl parserWayControl = ParserWayControl.INSTANCE;
        String schema = parserWayControl.getSchema(binaryData);
        if (schema == null || !(!StringsKt__StringsKt.isBlank(schema))) {
            String str = this.TAG;
            ParserPreference parserPreference = ParserPreference.INSTANCE;
            FitnessLogUtils.i(str, "no schema , parse sport record by native , isSwitch:" + parserPreference.getIS_USE_NATIVE_PARSER());
            if (parserPreference.getIS_USE_NATIVE_PARSER()) {
                return nativeParse(binaryData);
            }
            return null;
        }
        try {
            FitnessLogUtils.i(this.TAG, "parse sport record by schema");
            SchemaRecordParser schemaRecordParser = SchemaRecordParser.INSTANCE;
            String schema2 = parserWayControl.getSchema(binaryData);
            Intrinsics.checkNotNull(schema2);
            return schemaRecordParser.parser(binaryData, schema2);
        } catch (Exception e) {
            FitnessLogUtils.i(this.TAG, "parse soprt record by schema error , e:" + e + " , trace:" + Log.getStackTraceString(e));
            if (ParserPreference.INSTANCE.getIS_USE_NATIVE_PARSER()) {
                return nativeParse(binaryData);
            }
            return null;
        }
    }

    @Nullable
    public List<SportRecord> parseFourDimenData(@NotNull FitnessBinaryData binaryData, @NotNull FitnessDataBaseParser.FourDimenDataInfo[] dataInfoArray) {
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        Intrinsics.checkNotNullParameter(dataInfoArray, "dataInfoArray");
        if (binaryData.getDataValid() != null) {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(binaryData.getBodyData()).order(ByteOrder.LITTLE_ENDIAN);
            FitnessDataId dataId = binaryData.getDataId();
            byte[] dataValid = binaryData.getDataValid();
            Intrinsics.checkNotNull(byteBufferOrder);
            return parseFourDimenData(dataId, dataValid, byteBufferOrder, dataInfoArray, false);
        }
        FitnessLogUtils.w(this.TAG, "not support parse (" + binaryData.getDataId() + ")");
        return null;
    }

    public final void parseFourDimenRecords(@NotNull SportRecord sportRecord, @NotNull ByteBuffer byteBuffer, @NotNull FitnessDataBaseParser.FourDimenDataInfo[] dataInfoArray, @NotNull Map<FitnessDataBaseParser.FourDimenType, FitnessDataBaseParser.FourDimenDataValid> dataValidMap) {
        Intrinsics.checkNotNullParameter(sportRecord, "sportRecord");
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        Intrinsics.checkNotNullParameter(dataInfoArray, "dataInfoArray");
        Intrinsics.checkNotNullParameter(dataValidMap, "dataValidMap");
        sportRecord.setRecordList(processSportRecordList(sportRecord, FourDimenDataParser.INSTANCE.parseLoopRecord(dataValidMap, dataInfoArray, byteBuffer, sportRecord.getRecordCount())));
    }

    @Nullable
    public List<SportRecord> parseOneDimenData(@NotNull FitnessBinaryData binaryData, @NotNull FitnessDataBaseParser.OneDimenDataType[] dataTypeArray) {
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        Intrinsics.checkNotNullParameter(dataTypeArray, "dataTypeArray");
        if (binaryData.getDataValid() != null) {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(binaryData.getBodyData()).order(ByteOrder.LITTLE_ENDIAN);
            FitnessDataId dataId = binaryData.getDataId();
            byte[] dataValid = binaryData.getDataValid();
            Intrinsics.checkNotNull(byteBufferOrder);
            return parseOneDimenData(dataId, dataValid, byteBufferOrder, dataTypeArray, false);
        }
        FitnessLogUtils.w(this.TAG, "not support parse (" + binaryData.getDataId() + ")");
        return null;
    }

    public final void parseOneDimenRecords(@NotNull SportRecord sportRecord, @NotNull ByteBuffer byteBuffer, @NotNull FitnessDataId dataId, @NotNull FitnessDataBaseParser.OneDimenDataType[] dataTypeArray, @NotNull Map<Integer, Boolean> dataValidMap) {
        Intrinsics.checkNotNullParameter(sportRecord, "sportRecord");
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(dataTypeArray, "dataTypeArray");
        Intrinsics.checkNotNullParameter(dataValidMap, "dataValidMap");
        sportRecord.setRecordList(processSportRecordList(sportRecord, OneDimenDataParser.INSTANCE.parseLoopRecord(dataTypeArray, dataId, dataValidMap, byteBuffer, sportRecord.getRecordCount())));
    }

    @Nullable
    public abstract List<SportRecord> parseRecord(@NotNull FitnessBinaryData binaryData);

    @NotNull
    public final List<SportRecord> parseFourDimenData(@NotNull FitnessDataId dataId, @NotNull byte[] dataValid, @NotNull ByteBuffer byteBuffer, @NotNull FitnessDataBaseParser.FourDimenDataInfo[] dataInfoArray, boolean isTriathlonSubType) {
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(dataValid, "dataValid");
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        Intrinsics.checkNotNullParameter(dataInfoArray, "dataInfoArray");
        Map<FitnessDataBaseParser.FourDimenType, FitnessDataBaseParser.FourDimenDataValid> dataValid2 = FourDimenDataParser.INSTANCE.parseDataValid(dataId, dataInfoArray, dataValid);
        LinkedList linkedList = new LinkedList();
        int pauseInitialDataLen = getPauseInitialDataLen(dataId) + 8 + getITSummaryDataLen$fitness_parser_release(dataId);
        int curTzDiffInSec$fitness_parser_release = getCurTzDiffInSec$fitness_parser_release(dataId);
        while (byteBuffer.position() + pauseInitialDataLen <= byteBuffer.capacity()) {
            Map<Integer, FitnessDataBaseParser.DataValueItem> pauseInitialData = parsePauseInitialData(dataId, byteBuffer);
            FitnessParserUtils fitnessParserUtils = FitnessParserUtils.INSTANCE;
            long intFor4Bytes$default = FitnessParserUtils.getIntFor4Bytes$default(fitnessParserUtils, byteBuffer, false, 2, null);
            long intFor4Bytes$default2 = FitnessParserUtils.getIntFor4Bytes$default(fitnessParserUtils, byteBuffer, false, 2, null);
            SportRecord sportRecord = new SportRecord(((long) curTzDiffInSec$fitness_parser_release) + intFor4Bytes$default2, intFor4Bytes$default);
            setInitDataValue(pauseInitialData, sportRecord);
            parseITSummaryData(dataId, byteBuffer, sportRecord);
            FitnessLogUtils.i(this.TAG, "parseFourDimenData(" + sportRecord + "), recordStartTime=" + intFor4Bytes$default2);
            parseFourDimenRecords(sportRecord, byteBuffer, dataInfoArray, dataValid2);
            linkedList.add(sportRecord);
            if (isTriathlonSubType) {
                break;
            }
        }
        return linkedList;
    }

    @NotNull
    public final List<SportRecord> parseOneDimenData(@NotNull FitnessDataId dataId, @NotNull byte[] dataValid, @NotNull ByteBuffer byteBuffer, @NotNull FitnessDataBaseParser.OneDimenDataType[] dataTypeArray, boolean isTriathlonSubType) {
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(dataValid, "dataValid");
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        Intrinsics.checkNotNullParameter(dataTypeArray, "dataTypeArray");
        Map<Integer, Boolean> dataValid2 = OneDimenDataParser.INSTANCE.parseDataValid(dataTypeArray, dataId, dataValid);
        LinkedList linkedList = new LinkedList();
        int pauseInitialDataLen = getPauseInitialDataLen(dataId) + 8 + getITSummaryDataLen$fitness_parser_release(dataId);
        int curTzDiffInSec$fitness_parser_release = getCurTzDiffInSec$fitness_parser_release(dataId);
        while (byteBuffer.position() + pauseInitialDataLen <= byteBuffer.capacity()) {
            Map<Integer, FitnessDataBaseParser.DataValueItem> pauseInitialData = parsePauseInitialData(dataId, byteBuffer);
            FitnessParserUtils fitnessParserUtils = FitnessParserUtils.INSTANCE;
            long intFor4Bytes$default = FitnessParserUtils.getIntFor4Bytes$default(fitnessParserUtils, byteBuffer, false, 2, null);
            long intFor4Bytes$default2 = FitnessParserUtils.getIntFor4Bytes$default(fitnessParserUtils, byteBuffer, false, 2, null);
            SportRecord sportRecord = new SportRecord(((long) curTzDiffInSec$fitness_parser_release) + intFor4Bytes$default2, intFor4Bytes$default);
            setInitDataValue(pauseInitialData, sportRecord);
            parseITSummaryData(dataId, byteBuffer, sportRecord);
            FitnessLogUtils.i(this.TAG, "parseOneDimenData(" + sportRecord + "), recordStartTime = " + intFor4Bytes$default2);
            parseOneDimenRecords(sportRecord, byteBuffer, dataId, dataTypeArray, dataValid2);
            linkedList.add(sportRecord);
            if (isTriathlonSubType) {
                break;
            }
        }
        return linkedList;
    }
}
