package com.xiaomi.fit.fitness.parser.sport.base;

import android.util.Log;
import androidx.annotation.RequiresApi;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser;
import com.xiaomi.fit.fitness.parser.base.OneDimenDataParser;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.fit.fitness.parser.schema.ParserWayControl;
import com.xiaomi.fit.fitness.parser.schema.sport.SchemaReportParser;
import com.xiaomi.fit.fitness.parser.utils.ParserPreference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0002\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0017J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0015\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0000¢\u0006\u0002\b\u0019J\u001e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J$\u0010!\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#H\u0002J\u0018\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020%H\u0002J \u0010)\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020$H\u0002J \u0010,\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020-H\u0002J \u0010.\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u00060"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/sport/base/SportReportBaseParser;", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser;", "<init>", "()V", "TAG", "", "courseIdExistType", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DependDataType;", "getCourseIdExistType", "()Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DependDataType;", "lactateTypeExistType", "getLactateTypeExistType", "getReportDataType", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "()[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "parse", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "nativeParse", "printSportReport", "", "sportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "printSportReport$fitness_parser_release", "parseReport", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "dataValid", "", "byteBuffer", "Ljava/nio/ByteBuffer;", "processParseReport", "reportValue", "", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DataValueItem;", "setReportValue", "report", "itemValue", "convertTargetIntValue", "type", "value", "convertTargetFloatValue", "", "addToReportTarget", "ReportType", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SportReportBaseParser extends FitnessDataBaseParser {

    @NotNull
    private final String TAG = "BaseSportReportParser";

    @NotNull
    private final FitnessDataBaseParser.DependDataType courseIdExistType = new FitnessDataBaseParser.DependDataType(90, new Integer[]{252, 253, 255});

    @NotNull
    private final FitnessDataBaseParser.DependDataType lactateTypeExistType = new FitnessDataBaseParser.DependDataType(90, new Integer[]{11});

    @Metadata(d1 = {"\u0000\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0003\bâ\u0001\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010m\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010o\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010q\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010u\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010v\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010w\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010x\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010y\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010z\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010{\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010|\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010}\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010~\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u007f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0080\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0081\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0082\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0083\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0084\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0085\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0086\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0087\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0088\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0089\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008a\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008b\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008c\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008d\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008e\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008f\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0090\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0091\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0092\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0093\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0094\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0095\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0096\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0097\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0098\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0099\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u009a\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u009b\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u009c\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u009d\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u009e\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u009f\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010 \u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¡\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¢\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010£\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¤\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¥\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¦\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010§\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¨\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010©\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010ª\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010«\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¬\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u00ad\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010®\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¯\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010°\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010±\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010²\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010³\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010´\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010µ\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¶\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010·\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¸\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¹\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010º\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010»\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¼\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010½\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¾\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¿\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010À\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Á\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Â\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Ã\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Ä\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Å\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Æ\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Ç\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010È\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010É\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Ê\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Ë\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Ì\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Í\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Î\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Ï\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Ð\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Ñ\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Ò\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Ó\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Ô\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Õ\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Ö\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010×\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Ø\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Ù\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Ú\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Û\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Ü\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Ý\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Þ\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010ß\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010à\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010á\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010â\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010ã\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010ä\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010å\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010æ\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006ç\u0001"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/sport/base/SportReportBaseParser$ReportType;", "", "<init>", "()V", "startTime", "", "endTime", "duration", "validDuration", "distance", "calories", "totalCal", FitnessReportKey.maxPace, "minPace", FitnessReportKey.avgPace, "avgSpeed", "maxSpeed", "steps", FitnessReportKey.maxCadence, FitnessReportKey.avgCadence, "avgHr", "maxHr", "minHr", "riseHeight", "fallHeight", "avgHeight", "maxHeight", "minHeight", FitnessReportKey.totalClimbing, "trainEffect", "anaerobicTrainEffect", "v02max", "energyConsume", "recoveryTime", "hrExtremeDuration", "hrAnaerobicDuration", "hrAerobicDuration", "hrFatBurningDuration", "hrWarmUpDuration", FitnessReportKey.strokeCount, FitnessReportKey.mainPosture, FitnessReportKey.avgStrokeFreq, FitnessReportKey.maxStrokeFreq, "turnCount", FitnessReportKey.avgSwolf, FitnessReportKey.bestSwolf, FitnessReportKey.poolWidth, "rowCount", "avgRowFreq", "bestRowFreq", "pullOarsDuration", "layOarsDuration", "skipCount", "avgSkipFreq", "bestSkipFreq", "avgStartingHeight", "maxStartingHeight", "minStartingHeight", "hangInAirDuration", "energyWorking", "stumbleTimes", "hrRecoveryRate", "swingCount", "forehandSwingCount", "backhandSwingCount", "serveBallCount", "smashBallCount", "restBetweenGroupDuration", FitnessReportKey.groupCount, "hundredSportType", "changeItemADuration", "changeItemBDuration", "firstSport", "secondSport", "thirdSport", "openSwimmingReport", "outdoorRidingReport", "outdoorRunningReport", "maxSlope", "gross", "backSwingDuration", "downSwingDuration", "avgSwingThythm", "avgSwingSpeed", "shootCount", FitnessReportKey.dribbleDuration, FitnessReportKey.avgPower, "maxPower", FitnessReportKey.avgResistance, "maxResistance", "leisureCyclingDuration", "cardioTrainingDuration", "intensiveFitDuration", "rapidMuscleGainDuration", "sportCourse", "serverCourseId", "reserveHrZone", "goalDuration", "goalCalories", "goalDistance", "goalPace", "goalCadence", "goalRoundCount", "goalCount", "goalSpeed", FitnessReportKey.correctedDistance, FitnessReportKey.avgSpo2, FitnessReportKey.maxSpo2, FitnessReportKey.minSpo2, "avgStress", "maxStress", "minStress", "trainEffectLevel", "anaerobicTrainEffectLevel", "v02maxLevel", FitnessReportKey.trainingLoad, "trainingLoadLevel", "runningIndex", "runningIndexLevel", "trainingPeriod", FitnessReportKey.avgCycleCadence, FitnessReportKey.maxCycleCadence, "vitality", "totalPunchCount", "perfectPunchCount", "goodPunchCount", "missPunchCount", "maxPunchIntensity", "maxPunchComboCount", "punchHitRate", FitnessReportKey.fullFootLandingDuration, FitnessReportKey.foreFootLandingDuration, FitnessReportKey.heelLandingDuration, "valgusRange", "powerActiveRecoveryDuration", "powerEnduranceDuration", "powerRhythmDuration", "powerLactateThresholdDuration", "powerMaxVo2Duration", "powerAnaerobicDuration", "powerExtremeDuration", "environmental", "mainLandingMode", "foreFootLandingRatio", "heelLandingRatio", "avgLandingImpact", "maxLandingImpact", "avgTouchDownDuration", "minTouchDownDuration", "avgAirDuration", "maxAirDuration", "avgTouchDownAirRatio", "minTouchDownAirRatio", FitnessReportKey.avgStride, "smallForceFrisbeeThrowingCount", "midForceFrisbeeThrowingCount", "strongForceFrisbeeThrowingCount", "trainingExperience", "fiveKilometreGradePrediction", "tenKilometreGradePrediction", "fullMarathonGradePrediction", "halfMarathonGradePrediction", FitnessReportKey.avgStrokeFrequency, "hrExtremeLowerLimit", "hrAnaerobicLowerLimit", "hrAerobicLowerLimit", "hrFatBurningLowerLimit", "hrWarmUpLowerLimit", "topTrainEffect", "topTrainEffectLevel", "trainingPressure", "fivePaceZoneDuration", "fourPaceZoneDuration", "threePaceZoneDuration", "twoPaceZoneDuration", "onePaceZoneDuration", FitnessReportKey.lactateThresholdHeartRate, FitnessReportKey.lactateThresholdPace, FitnessReportKey.avgRunningPower, FitnessReportKey.maxRunningPower, "avgEqualPace", "maxEqualPace", "waterBodyType", "waterInletLongitude", "waterInletLatitude", "waterOutletLongitude", "waterOutletLatitude", "totalDivingDuration", "entryTime", "exitTime", FitnessReportKey.maxDivingDepth, FitnessReportKey.avgDivingDepth, "avgAscentRate", "avgDescentRate", "descentCount", FitnessReportKey.maxWaterTemperature, FitnessReportKey.minWaterTemperature, FitnessReportKey.avgWaterTemperature, "divingOTU", "divingCNS", "oxygenPartialPressureThreshold", FitnessReportKey.oxygenConcentration, FitnessReportKey.noFlyDuration, FitnessReportKey.algorithmDataSource, "averageVerticalStrideRatio", FitnessReportKey.minVerticalStrideRatio, FitnessReportKey.maxVerticalStrideRatio, "averageVerticalAmplitude", "minVerticalAmplitude", "maxVerticalAmplitude", "maxTouchDownTime", FitnessReportKey.trainingPlanId, "trainingPlanTime", FitnessReportKey.freeSwimDuration, "avgFreeBreathAngle", "maxFreeBreathAngle", FitnessReportKey.avgFreePitchAngle, FitnessReportKey.maxFreePitchAngle, "frogSwimDuration", "frogSkiDuration", "avgFrogBreathAngle", "maxFrogBreathAngle", "avgFrogSkiDuration", "maxFrogSkiDuration", FitnessReportKey.ventilationFrequency, "gymTrainingTotalTimes", "gymTrainingTotalWeight", "gymTrainingGroupTimes", "targetValueNumber", "avgFreq", "maxFreq", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ReportType {

        @NotNull
        public static final ReportType INSTANCE = new ReportType();
        public static final int algorithmDataSource = 198;
        public static final int anaerobicTrainEffect = 26;
        public static final int anaerobicTrainEffectLevel = 108;
        public static final int averageVerticalAmplitude = 202;
        public static final int averageVerticalStrideRatio = 199;
        public static final int avgAirDuration = 144;
        public static final int avgAscentRate = 187;
        public static final int avgCadence = 15;
        public static final int avgCycleCadence = 115;
        public static final int avgDescentRate = 188;
        public static final int avgDivingDepth = 186;
        public static final int avgEqualPace = 175;
        public static final int avgFreeBreathAngle = 209;
        public static final int avgFreePitchAngle = 211;
        public static final int avgFreq = 224;
        public static final int avgFrogBreathAngle = 215;
        public static final int avgFrogSkiDuration = 217;
        public static final int avgHeight = 21;
        public static final int avgHr = 16;
        public static final int avgLandingImpact = 140;
        public static final int avgPace = 10;
        public static final int avgPower = 82;
        public static final int avgResistance = 84;
        public static final int avgRowFreq = 44;
        public static final int avgRunningPower = 173;
        public static final int avgSkipFreq = 49;
        public static final int avgSpeed = 11;
        public static final int avgSpo2 = 101;
        public static final int avgStartingHeight = 51;
        public static final int avgStress = 104;
        public static final int avgStride = 148;
        public static final int avgStrokeFreq = 37;
        public static final int avgStrokeFrequency = 157;
        public static final int avgSwingSpeed = 79;
        public static final int avgSwingThythm = 78;
        public static final int avgSwolf = 40;
        public static final int avgTouchDownAirRatio = 146;
        public static final int avgTouchDownDuration = 142;
        public static final int avgWaterTemperature = 192;
        public static final int backSwingDuration = 76;
        public static final int backhandSwingCount = 60;
        public static final int bestRowFreq = 45;
        public static final int bestSkipFreq = 50;
        public static final int bestSwolf = 41;
        public static final int calories = 6;
        public static final int cardioTrainingDuration = 87;
        public static final int changeItemADuration = 66;
        public static final int changeItemBDuration = 67;
        public static final int correctedDistance = 100;
        public static final int descentCount = 189;
        public static final int distance = 5;
        public static final int divingCNS = 194;
        public static final int divingOTU = 193;
        public static final int downSwingDuration = 77;
        public static final int dribbleDuration = 81;
        public static final int duration = 3;
        public static final int endTime = 2;
        public static final int energyConsume = 28;
        public static final int energyWorking = 55;
        public static final int entryTime = 183;
        public static final int environmental = 136;
        public static final int exitTime = 184;
        public static final int fallHeight = 20;
        public static final int firstSport = 68;
        public static final int fiveKilometreGradePrediction = 153;
        public static final int fivePaceZoneDuration = 166;
        public static final int foreFootLandingDuration = 126;
        public static final int foreFootLandingRatio = 138;
        public static final int forehandSwingCount = 59;
        public static final int fourPaceZoneDuration = 167;
        public static final int freeSwimDuration = 208;
        public static final int frogSkiDuration = 214;
        public static final int frogSwimDuration = 213;
        public static final int fullFootLandingDuration = 125;
        public static final int fullMarathonGradePrediction = 155;
        public static final int goalCadence = 96;
        public static final int goalCalories = 93;
        public static final int goalCount = 98;
        public static final int goalDistance = 94;
        public static final int goalDuration = 92;
        public static final int goalPace = 95;
        public static final int goalRoundCount = 97;
        public static final int goalSpeed = 99;
        public static final int goodPunchCount = 120;
        public static final int gross = 75;
        public static final int groupCount = 64;
        public static final int gymTrainingGroupTimes = 222;
        public static final int gymTrainingTotalTimes = 220;
        public static final int gymTrainingTotalWeight = 221;
        public static final int halfMarathonGradePrediction = 156;
        public static final int hangInAirDuration = 54;
        public static final int heelLandingDuration = 127;
        public static final int heelLandingRatio = 139;
        public static final int hrAerobicDuration = 32;
        public static final int hrAerobicLowerLimit = 160;
        public static final int hrAnaerobicDuration = 31;
        public static final int hrAnaerobicLowerLimit = 159;
        public static final int hrExtremeDuration = 30;
        public static final int hrExtremeLowerLimit = 158;
        public static final int hrFatBurningDuration = 33;
        public static final int hrFatBurningLowerLimit = 161;
        public static final int hrRecoveryRate = 57;
        public static final int hrWarmUpDuration = 34;
        public static final int hrWarmUpLowerLimit = 162;
        public static final int hundredSportType = 65;
        public static final int intensiveFitDuration = 88;
        public static final int lactateThresholdHeartRate = -2;
        public static final int lactateThresholdPace = -3;
        public static final int layOarsDuration = 47;
        public static final int leisureCyclingDuration = 86;
        public static final int mainLandingMode = 137;
        public static final int mainPosture = 36;
        public static final int maxAirDuration = 145;
        public static final int maxCadence = 14;
        public static final int maxCycleCadence = 116;
        public static final int maxDivingDepth = 185;
        public static final int maxEqualPace = 176;
        public static final int maxFreeBreathAngle = 210;
        public static final int maxFreePitchAngle = 212;
        public static final int maxFreq = 225;
        public static final int maxFrogBreathAngle = 216;
        public static final int maxFrogSkiDuration = 218;
        public static final int maxHeight = 22;
        public static final int maxHr = 17;
        public static final int maxLandingImpact = 141;
        public static final int maxPace = 8;
        public static final int maxPower = 83;
        public static final int maxPunchComboCount = 123;
        public static final int maxPunchIntensity = 122;
        public static final int maxResistance = 85;
        public static final int maxRunningPower = 174;
        public static final int maxSlope = 74;
        public static final int maxSpeed = 12;
        public static final int maxSpo2 = 102;
        public static final int maxStartingHeight = 52;
        public static final int maxStress = 105;
        public static final int maxStrokeFreq = 38;
        public static final int maxTouchDownTime = 205;
        public static final int maxVerticalAmplitude = 204;
        public static final int maxVerticalStrideRatio = 201;
        public static final int maxWaterTemperature = 190;
        public static final int midForceFrisbeeThrowingCount = 150;
        public static final int minHeight = 23;
        public static final int minHr = 18;
        public static final int minPace = 9;
        public static final int minSpo2 = 103;
        public static final int minStartingHeight = 53;
        public static final int minStress = 106;
        public static final int minTouchDownAirRatio = 147;
        public static final int minTouchDownDuration = 143;
        public static final int minVerticalAmplitude = 203;
        public static final int minVerticalStrideRatio = 200;
        public static final int minWaterTemperature = 191;
        public static final int missPunchCount = 121;
        public static final int noFlyDuration = 197;
        public static final int onePaceZoneDuration = 170;
        public static final int openSwimmingReport = 71;
        public static final int outdoorRidingReport = 72;
        public static final int outdoorRunningReport = 73;
        public static final int oxygenConcentration = 196;
        public static final int oxygenPartialPressureThreshold = 195;
        public static final int perfectPunchCount = 119;
        public static final int poolWidth = 42;
        public static final int powerActiveRecoveryDuration = 129;
        public static final int powerAnaerobicDuration = 134;
        public static final int powerEnduranceDuration = 130;
        public static final int powerExtremeDuration = 135;
        public static final int powerLactateThresholdDuration = 132;
        public static final int powerMaxVo2Duration = 133;
        public static final int powerRhythmDuration = 131;
        public static final int pullOarsDuration = 46;
        public static final int punchHitRate = 124;
        public static final int rapidMuscleGainDuration = 89;
        public static final int recoveryTime = 29;
        public static final int reserveHrZone = 91;
        public static final int restBetweenGroupDuration = 63;
        public static final int riseHeight = 19;
        public static final int rowCount = 43;
        public static final int runningIndex = 112;
        public static final int runningIndexLevel = 113;
        public static final int secondSport = 69;
        public static final int serveBallCount = 61;
        public static final int serverCourseId = -1;
        public static final int shootCount = 80;
        public static final int skipCount = 48;
        public static final int smallForceFrisbeeThrowingCount = 149;
        public static final int smashBallCount = 62;
        public static final int sportCourse = 90;
        public static final int startTime = 1;
        public static final int steps = 13;
        public static final int strokeCount = 35;
        public static final int strongForceFrisbeeThrowingCount = 151;
        public static final int stumbleTimes = 56;
        public static final int swingCount = 58;
        public static final int targetValueNumber = 223;
        public static final int tenKilometreGradePrediction = 154;
        public static final int thirdSport = 70;
        public static final int threePaceZoneDuration = 168;
        public static final int topTrainEffect = 163;
        public static final int topTrainEffectLevel = 164;
        public static final int totalCal = 7;
        public static final int totalClimbing = 24;
        public static final int totalDivingDuration = 182;
        public static final int totalPunchCount = 118;
        public static final int trainEffect = 25;
        public static final int trainEffectLevel = 107;
        public static final int trainingExperience = 152;
        public static final int trainingLoad = 110;
        public static final int trainingLoadLevel = 111;
        public static final int trainingPeriod = 114;
        public static final int trainingPlanId = 206;
        public static final int trainingPlanTime = 207;
        public static final int trainingPressure = 165;
        public static final int turnCount = 39;
        public static final int twoPaceZoneDuration = 169;
        public static final int v02max = 27;
        public static final int v02maxLevel = 109;
        public static final int valgusRange = 128;
        public static final int validDuration = 4;
        public static final int ventilationFrequency = 219;
        public static final int vitality = 117;
        public static final int waterBodyType = 177;
        public static final int waterInletLatitude = 179;
        public static final int waterInletLongitude = 178;
        public static final int waterOutletLatitude = 181;
        public static final int waterOutletLongitude = 180;

        private ReportType() {
        }
    }

    private final void addToReportTarget(SportBasicReport sportReport, int type, String value) {
        if (sportReport.getTargetValue() == null) {
            sportReport.setTargetValue(new LinkedHashMap());
        }
        Integer numValueOf = Integer.valueOf(type);
        Map<Integer, String> targetValue = sportReport.getTargetValue();
        Intrinsics.checkNotNull(targetValue);
        targetValue.put(numValueOf, value);
    }

    private final void convertTargetFloatValue(SportBasicReport sportReport, int type, float value) {
        if (value == 0.0f) {
            return;
        }
        addToReportTarget(sportReport, type, String.valueOf(value));
    }

    private final void convertTargetIntValue(SportBasicReport sportReport, int type, int value) {
        if (value == 0) {
            return;
        }
        addToReportTarget(sportReport, type, String.valueOf(value));
    }

    private final FitnessParseResult nativeParse(FitnessBinaryData binaryData) {
        FitnessLogUtils.i(this.TAG, "nativeParse report");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(binaryData.getBodyData()).order(ByteOrder.LITTLE_ENDIAN);
        FitnessDataId dataId = binaryData.getDataId();
        byte[] dataValid = binaryData.getDataValid();
        Intrinsics.checkNotNull(dataValid);
        Intrinsics.checkNotNull(byteBufferOrder);
        SportBasicReport report = parseReport(dataId, dataValid, byteBufferOrder);
        printSportReport$fitness_parser_release(report);
        return new FitnessParseResult.Builder().sportReport(report).build();
    }

    private final SportBasicReport processParseReport(FitnessDataId dataId, Map<Integer, FitnessDataBaseParser.DataValueItem> reportValue) {
        SportBasicReport sportBasicReport = new SportBasicReport(dataId);
        for (FitnessDataBaseParser.OneDimenDataType oneDimenDataType : getReportDataTypeArray()) {
            FitnessDataBaseParser.DataValueItem dataValueItem = reportValue.get(Integer.valueOf(oneDimenDataType.getType()));
            if (dataValueItem != null && dataValueItem.getValid()) {
                setReportValue(sportBasicReport, dataValueItem);
            }
        }
        return sportBasicReport;
    }

    private final void setReportValue(SportBasicReport report, FitnessDataBaseParser.DataValueItem itemValue) {
        Number value = itemValue.getValue();
        Integer num = 0;
        switch (itemValue.getType()) {
            case -3:
                report.setLactateThresholdPace(Integer.valueOf(value.intValue()));
                break;
            case -2:
                report.setLactateThresholdHeartRate(Integer.valueOf(value.intValue()));
                break;
            case -1:
                if (ArraysKt___ArraysKt.contains(new Integer[]{2, 1, num}, report.getCloudCourseSource())) {
                    report.setCloudCourseId(Long.valueOf(value.longValue()));
                }
                break;
            case 0:
            case 71:
            case 72:
            case 73:
            case 171:
            case 172:
            default:
                FitnessLogUtils.i(this.TAG, "setReportValue:not support valueType=" + itemValue.getType());
                break;
            case 1:
                report.setStartTime(value.longValue());
                break;
            case 2:
                report.setEndTime(value.longValue());
                break;
            case 3:
                report.setDuration(value.intValue());
                break;
            case 4:
                report.setValidDuration(Integer.valueOf(value.intValue()));
                break;
            case 5:
                report.setDistance(Integer.valueOf(value.intValue()));
                break;
            case 6:
                report.setCalories(Integer.valueOf(value.intValue()));
                break;
            case 7:
                report.setTotalCal(Integer.valueOf(value.intValue()));
                break;
            case 8:
                report.setMaxPace(Integer.valueOf(value.intValue()));
                break;
            case 9:
                report.setMinPace(Integer.valueOf(value.intValue()));
                break;
            case 10:
                report.setAvgPace(Integer.valueOf(value.intValue()));
                break;
            case 11:
                report.setAvgSpeed(Float.valueOf(value.floatValue()));
                break;
            case 12:
                report.setMaxSpeed(Float.valueOf(value.floatValue()));
                break;
            case 13:
                report.setSteps(Integer.valueOf(value.intValue()));
                break;
            case 14:
                report.setMaxCadence(Integer.valueOf(value.intValue()));
                break;
            case 15:
                report.setAvgCadence(Integer.valueOf(value.intValue()));
                break;
            case 16:
                report.setAvgHr(Integer.valueOf(value.intValue()));
                break;
            case 17:
                report.setMaxHr(Integer.valueOf(value.intValue()));
                break;
            case 18:
                report.setMinHr(Integer.valueOf(value.intValue()));
                break;
            case 19:
                report.setRiseHeight(Float.valueOf(value.floatValue()));
                break;
            case 20:
                report.setFallHeight(Float.valueOf(value.floatValue()));
                break;
            case 21:
                report.setAvgHeight(Float.valueOf(value.floatValue()));
                break;
            case 22:
                report.setMaxHeight(Float.valueOf(value.floatValue()));
                break;
            case 23:
                report.setMinHeight(Float.valueOf(value.floatValue()));
                break;
            case 24:
                report.setTotalClimbing(Long.valueOf(value.longValue()));
                break;
            case 25:
                report.setTrainEffect(Float.valueOf(value.floatValue()));
                break;
            case 26:
                report.setAnaerobicTrainEffect(Float.valueOf(value.floatValue()));
                break;
            case 27:
                report.setVo2max(Integer.valueOf(value.intValue()));
                break;
            case 28:
                report.setEnergyConsume(Integer.valueOf(value.intValue()));
                break;
            case 29:
                report.setRecoveryTime(Integer.valueOf(value.intValue()));
                break;
            case 30:
                report.setHrExtremeDuration(Integer.valueOf(value.intValue()));
                break;
            case 31:
                report.setHrAnaerobicDuration(Integer.valueOf(value.intValue()));
                break;
            case 32:
                report.setHrAerobicDuration(Integer.valueOf(value.intValue()));
                break;
            case 33:
                report.setHrFatBurningDuration(Integer.valueOf(value.intValue()));
                break;
            case 34:
                report.setHrWarmUpDuration(Integer.valueOf(value.intValue()));
                break;
            case 35:
                report.setStrokeCount(Integer.valueOf(value.intValue()));
                break;
            case 36:
                report.setMainPosture(Integer.valueOf(value.intValue()));
                break;
            case 37:
                report.setAvgStrokeFreq(Integer.valueOf(value.intValue()));
                break;
            case 38:
                report.setMaxStrokeFreq(Integer.valueOf(value.intValue()));
                break;
            case 39:
                report.setTurnCount(Integer.valueOf(value.intValue()));
                break;
            case 40:
                report.setAvgSwolf(Integer.valueOf(value.intValue()));
                break;
            case 41:
                report.setBestSwolf(Integer.valueOf(value.intValue()));
                break;
            case 42:
                report.setPoolWidth(Integer.valueOf(value.intValue()));
                break;
            case 43:
                report.setRowCount(Integer.valueOf(value.intValue()));
                break;
            case 44:
                report.setAvgRowFreq(Integer.valueOf(value.intValue()));
                break;
            case 45:
                report.setBestRowFreq(Integer.valueOf(value.intValue()));
                break;
            case 46:
                report.setPullOarsDuration(Integer.valueOf(value.intValue()));
                break;
            case 47:
                report.setLayOarsDuration(Integer.valueOf(value.intValue()));
                break;
            case 48:
                report.setSkipCount(Integer.valueOf(value.intValue()));
                break;
            case 49:
                report.setAvgSkipFreq(Integer.valueOf(value.intValue()));
                break;
            case 50:
                report.setBestSkipFreq(Integer.valueOf(value.intValue()));
                break;
            case 51:
                report.setAvgStartingHeight(Integer.valueOf(value.intValue()));
                break;
            case 52:
                report.setMaxStartingHeight(Integer.valueOf(value.intValue()));
                break;
            case 53:
                report.setMinStartingHeight(Integer.valueOf(value.intValue()));
                break;
            case 54:
                report.setHangInAirDuration(Integer.valueOf(value.intValue()));
                break;
            case 55:
                report.setEnergyWorking(Integer.valueOf(value.intValue()));
                break;
            case 56:
                report.setStumbleTimes(Integer.valueOf(value.intValue()));
                break;
            case 57:
                report.setHrRecoveryRate(Float.valueOf(value.floatValue()));
                break;
            case 58:
                report.setSwingCount(Integer.valueOf(value.intValue()));
                break;
            case 59:
                report.setForehandSwingCount(Integer.valueOf(value.intValue()));
                break;
            case 60:
                report.setBackhandSwingCount(Integer.valueOf(value.intValue()));
                break;
            case 61:
                report.setServeBallCount(Integer.valueOf(value.intValue()));
                break;
            case 62:
                report.setSmashBallCount(Integer.valueOf(value.intValue()));
                break;
            case 63:
                report.setTotalRestDuration(Integer.valueOf(value.intValue()));
                break;
            case 64:
                report.setGroupCount(Integer.valueOf(value.intValue()));
                break;
            case 65:
                int iIntValue = value.intValue();
                if (iIntValue > 0) {
                    report.setSportType(iIntValue);
                }
                break;
            case 66:
                report.setChangeItemADuration(Integer.valueOf(value.intValue()));
                break;
            case 67:
                report.setChangeItemBDuration(Integer.valueOf(value.intValue()));
                break;
            case 68:
                report.setFirstSport(Integer.valueOf(value.intValue()));
                break;
            case 69:
                report.setSecondSport(Integer.valueOf(value.intValue()));
                break;
            case 70:
                report.setThirdSport(Integer.valueOf(value.intValue()));
                break;
            case 74:
                report.setMaxSlope(Integer.valueOf(value.intValue()));
                break;
            case 75:
                report.setGross(Integer.valueOf(value.intValue()));
                break;
            case 76:
                report.setAvgBackSwingDuration(Float.valueOf(value.floatValue()));
                break;
            case 77:
                report.setAvgDownSwingDuration(Float.valueOf(value.floatValue()));
                break;
            case 78:
                report.setAvgSwingRhythm(Float.valueOf(value.floatValue()));
                break;
            case 79:
                report.setAvgSwingSpeed(Float.valueOf(value.floatValue()));
                break;
            case 80:
                report.setShootCount(Integer.valueOf(value.intValue()));
                break;
            case 81:
                report.setDribbleDuration(Integer.valueOf(value.intValue()));
                break;
            case 82:
                report.setAvgPower(Integer.valueOf(value.intValue()));
                break;
            case 83:
                report.setMaxPower(Integer.valueOf(value.intValue()));
                break;
            case 84:
                report.setAvgResistance(Integer.valueOf(value.intValue()));
                break;
            case 85:
                report.setMaxResistance(Integer.valueOf(value.intValue()));
                break;
            case 86:
                report.setResLeisureDuration(Integer.valueOf(value.intValue()));
                break;
            case 87:
                report.setResCardioDuration(Integer.valueOf(value.intValue()));
                break;
            case 88:
                report.setResIntensiveDuration(Integer.valueOf(value.intValue()));
                break;
            case 89:
                report.setResFastStrengthenDuration(Integer.valueOf(value.intValue()));
                break;
            case 90:
                if (value.intValue() > 0) {
                    report.setSportCourseId(Integer.valueOf(value.intValue()));
                    Integer sportCourseId = report.getSportCourseId();
                    if (sportCourseId != null && sportCourseId.intValue() == 252) {
                        num = 2;
                    } else if (sportCourseId != null && sportCourseId.intValue() == 253) {
                        num = 1;
                    } else if (sportCourseId == null || sportCourseId.intValue() != 255) {
                        num = null;
                    }
                    report.setCloudCourseSource(num);
                }
                break;
            case 91:
                report.setReserveHrZone(Integer.valueOf(value.intValue()));
                break;
            case 92:
                convertTargetIntValue(report, 2, value.intValue());
                break;
            case 93:
                convertTargetIntValue(report, 4, value.intValue());
                break;
            case 94:
                convertTargetIntValue(report, 3, value.intValue());
                break;
            case 95:
                convertTargetIntValue(report, 1, value.intValue());
                break;
            case 96:
                convertTargetIntValue(report, 7, value.intValue());
                break;
            case 97:
                convertTargetIntValue(report, 5, value.intValue());
                break;
            case 98:
                convertTargetIntValue(report, 6, value.intValue());
                break;
            case 99:
                convertTargetFloatValue(report, 8, value.floatValue());
                break;
            case 100:
                int iIntValue2 = value.intValue();
                if (iIntValue2 > 0) {
                    report.setCorrectedDistance(Integer.valueOf(iIntValue2));
                }
                break;
            case 101:
                report.setAvgSpo2(Integer.valueOf(value.intValue()));
                break;
            case 102:
                report.setMaxSpo2(Integer.valueOf(value.intValue()));
                break;
            case 103:
                report.setMinSpo2(Integer.valueOf(value.intValue()));
                break;
            case 104:
                report.setAvgStress(Integer.valueOf(value.intValue()));
                break;
            case 105:
                report.setMaxStress(Integer.valueOf(value.intValue()));
                break;
            case 106:
                report.setMinStress(Integer.valueOf(value.intValue()));
                break;
            case 107:
                report.setTrainEffectLevel(Integer.valueOf(value.intValue()));
                break;
            case 108:
                report.setAnaerobicTrainEffectLevel(Integer.valueOf(value.intValue()));
                break;
            case 109:
                report.setVo2maxLevel(Integer.valueOf(value.intValue()));
                break;
            case 110:
                report.setTrainingLoad(Integer.valueOf(value.intValue()));
                break;
            case 111:
                report.setTrainingLoadLevel(Integer.valueOf(value.intValue()));
                break;
            case 112:
                report.setRunningIndicator(Float.valueOf(value.floatValue()));
                break;
            case 113:
                report.setRunningIndicatorLevel(Integer.valueOf(value.intValue()));
                break;
            case 114:
                int iIntValue3 = value.intValue();
                if (iIntValue3 > 0) {
                    report.setTrainingPeriod(Integer.valueOf(iIntValue3));
                }
                break;
            case 115:
                report.setAvgCycleCadence(Integer.valueOf(value.intValue()));
                break;
            case 116:
                report.setMaxCycleCadence(Integer.valueOf(value.intValue()));
                break;
            case 117:
                report.setVitality(Integer.valueOf(value.intValue()));
                break;
            case 118:
                report.setTotalPunchCount(Integer.valueOf(value.intValue()));
                break;
            case 119:
                report.setPerfectPunchCount(Integer.valueOf(value.intValue()));
                break;
            case 120:
                report.setGoodPunchCount(Integer.valueOf(value.intValue()));
                break;
            case 121:
                report.setMissPunchCount(Integer.valueOf(value.intValue()));
                break;
            case 122:
                report.setMaxPunchIntensity(Float.valueOf(value.floatValue()));
                break;
            case 123:
                report.setMaxPunchComboCount(Integer.valueOf(value.intValue()));
                break;
            case 124:
                report.setPunchHitRate(Integer.valueOf(value.intValue()));
                break;
            case 125:
                report.setFullFootLandingDuration(Integer.valueOf(value.intValue()));
                break;
            case 126:
                report.setForeFootLandingDuration(Integer.valueOf(value.intValue()));
                break;
            case 127:
                report.setHeelLandingDuration(Integer.valueOf(value.intValue()));
                break;
            case 128:
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1);
                byteBufferAllocate.put(value.byteValue());
                byteBufferAllocate.rewind();
                report.setValgusRange(Integer.valueOf(byteBufferAllocate.get()));
                break;
            case 129:
                report.setPowerActiveRecoveryDuration(Integer.valueOf(value.intValue()));
                break;
            case 130:
                report.setPowerEnduranceDuration(Integer.valueOf(value.intValue()));
                break;
            case 131:
                report.setPowerRhythmDuration(Integer.valueOf(value.intValue()));
                break;
            case 132:
                report.setPowerLactateThresholdDuration(Integer.valueOf(value.intValue()));
                break;
            case 133:
                report.setPowerMaxVo2Duration(Integer.valueOf(value.intValue()));
                break;
            case 134:
                report.setPowerAnaerobicDuration(Integer.valueOf(value.intValue()));
                break;
            case 135:
                report.setPowerExtremeDuration(Integer.valueOf(value.intValue()));
                break;
            case 136:
                report.setEnvironmental(Integer.valueOf(value.intValue()));
                break;
            case 137:
                report.setMainLandingMode(Integer.valueOf(value.intValue()));
                break;
            case 138:
                report.setForeFootLandingRatio(Integer.valueOf(value.intValue()));
                break;
            case 139:
                report.setHeelLandingRatio(Integer.valueOf(value.intValue()));
                break;
            case 140:
                report.setAvgLandingImpact(Float.valueOf(value.intValue() / 10.0f));
                break;
            case 141:
                report.setMaxLandingImpact(Float.valueOf(value.intValue() / 10.0f));
                break;
            case 142:
                report.setAvgTouchDownDuration(Integer.valueOf(value.intValue()));
                break;
            case 143:
                report.setMinTouchDownDuration(Integer.valueOf(value.intValue()));
                break;
            case 144:
                report.setAvgAirDuration(Integer.valueOf(value.intValue()));
                break;
            case 145:
                report.setMaxAirDuration(Integer.valueOf(value.intValue()));
                break;
            case 146:
                report.setAvgTouchDownAirRatio(Float.valueOf(value.intValue() / 10.0f));
                break;
            case 147:
                report.setMinTouchDownAirRatio(Float.valueOf(value.intValue() / 10.0f));
                break;
            case 148:
                report.setAvgStride(Integer.valueOf(value.intValue()));
                break;
            case 149:
                report.setSmallForceFrisbeeThrowingCount(Integer.valueOf(value.intValue()));
                break;
            case 150:
                report.setMidForceFrisbeeThrowingCount(Integer.valueOf(value.intValue()));
                break;
            case 151:
                report.setStrongForceFrisbeeThrowingCount(Integer.valueOf(value.intValue()));
                break;
            case 152:
                report.setTrainingExperience(Integer.valueOf(value.intValue()));
                break;
            case 153:
                report.setFiveKilometreGradePrediction(Integer.valueOf(value.intValue()));
                break;
            case 154:
                report.setTenKilometreGradePrediction(Integer.valueOf(value.intValue()));
                break;
            case 155:
                report.setFullMarathonGradePrediction(Integer.valueOf(value.intValue()));
                break;
            case 156:
                report.setHalfMarathonGradePrediction(Integer.valueOf(value.intValue()));
                break;
            case 157:
                report.setAvgStrokeFrequency(Integer.valueOf(value.intValue()));
                break;
            case 158:
                report.setLowerLimitHeartRateZoneFive(Integer.valueOf(value.intValue()));
                break;
            case 159:
                report.setLowerLimitHeartRateZoneFour(Integer.valueOf(value.intValue()));
                break;
            case 160:
                report.setLowerLimitHeartRateZoneThree(Integer.valueOf(value.intValue()));
                break;
            case 161:
                report.setLowerLimitHeartRateZoneTwo(Integer.valueOf(value.intValue()));
                break;
            case 162:
                report.setLowerLimitHeartRateZoneOne(Integer.valueOf(value.intValue()));
                break;
            case 163:
                report.setPeekTrainingEffect(Float.valueOf(value.floatValue()));
                break;
            case 164:
                report.setPeekTrainingEffectRating(Integer.valueOf(value.intValue()));
                break;
            case 165:
                report.setTrainingPressure(Integer.valueOf(value.intValue()));
                break;
            case 166:
                report.setFivePaceZoneDuration(Integer.valueOf(value.intValue()));
                break;
            case 167:
                report.setFourPaceZoneDuration(Integer.valueOf(value.intValue()));
                break;
            case 168:
                report.setThreePaceZoneDuration(Integer.valueOf(value.intValue()));
                break;
            case 169:
                report.setTwoPaceZoneDuration(Integer.valueOf(value.intValue()));
                break;
            case 170:
                report.setOnePaceZoneDuration(Integer.valueOf(value.intValue()));
                break;
            case 173:
                report.setAvgRunningPower(Integer.valueOf(value.intValue()));
                break;
            case 174:
                report.setMaxRunningPower(Integer.valueOf(value.intValue()));
                break;
            case 175:
                report.setAvgEqualPace(Integer.valueOf(value.intValue()));
                break;
            case 176:
                report.setMaxEqualPace(Integer.valueOf(value.intValue()));
                break;
            case 177:
                report.setWaterBodyType(Integer.valueOf(value.intValue()));
                break;
            case 178:
                report.setWaterInletLongitude(Float.valueOf(value.floatValue()));
                break;
            case 179:
                report.setWaterInletLatitude(Float.valueOf(value.floatValue()));
                break;
            case 180:
                report.setWaterOutletLongitude(Float.valueOf(value.floatValue()));
                break;
            case 181:
                report.setWaterOutletLatitude(Float.valueOf(value.floatValue()));
                break;
            case 182:
                report.setTotalDivingDuration(Integer.valueOf(value.intValue()));
                break;
            case ReportType.entryTime /* 183 */:
                report.setEntryTime(Long.valueOf(value.longValue()));
                break;
            case ReportType.exitTime /* 184 */:
                report.setExitTime(Long.valueOf(value.longValue()));
                break;
            case 185:
                report.setMaxDivingDepth(Float.valueOf(value.intValue() / 10.0f));
                break;
            case ReportType.avgDivingDepth /* 186 */:
                report.setAvgDivingDepth(Float.valueOf(value.intValue() / 10.0f));
                break;
            case ReportType.avgAscentRate /* 187 */:
                report.setAvgAscentRate(Float.valueOf(value.floatValue()));
                break;
            case ReportType.avgDescentRate /* 188 */:
                report.setAvgDescentRate(Float.valueOf(value.floatValue()));
                break;
            case ReportType.descentCount /* 189 */:
                report.setDescentCount(Integer.valueOf(value.intValue()));
                break;
            case ReportType.maxWaterTemperature /* 190 */:
                report.setMaxWaterTemperature(Float.valueOf(value.intValue() / 10.0f));
                break;
            case ReportType.minWaterTemperature /* 191 */:
                report.setMinWaterTemperature(Float.valueOf(value.intValue() / 10.0f));
                break;
            case 192:
                report.setAvgWaterTemperature(Float.valueOf(value.intValue() / 10.0f));
                break;
            case ReportType.divingOTU /* 193 */:
                report.setDivingOTU(Integer.valueOf(value.intValue()));
                break;
            case ReportType.divingCNS /* 194 */:
                report.setDivingCNS(Integer.valueOf(value.intValue()));
                break;
            case ReportType.oxygenPartialPressureThreshold /* 195 */:
                report.setOxygenPartialPressureThreshold(Float.valueOf(value.intValue() / 10.0f));
                break;
            case ReportType.oxygenConcentration /* 196 */:
                report.setOxygenConcentration(Integer.valueOf(value.intValue()));
                break;
            case ReportType.noFlyDuration /* 197 */:
                report.setNoFlyDuration(Integer.valueOf(value.intValue()));
                break;
            case ReportType.algorithmDataSource /* 198 */:
                report.setAlgorithmDataSource(Integer.valueOf(value.intValue()));
                break;
            case 199:
                report.setAvgVerticalStrideRatio(Float.valueOf(value.intValue() / 10.0f));
                break;
            case 200:
                report.setMinVerticalStrideRatio(Float.valueOf(value.intValue() / 10.0f));
                break;
            case 201:
                report.setMaxVerticalStrideRatio(Float.valueOf(value.intValue() / 10.0f));
                break;
            case 202:
                report.setAvgVerticalAmplitude(Float.valueOf(value.intValue() / 10.0f));
                break;
            case 203:
                report.setMinVerticalAmplitude(Float.valueOf(value.intValue() / 10.0f));
                break;
            case 204:
                report.setMaxVerticalAmplitude(Float.valueOf(value.intValue() / 10.0f));
                break;
            case 205:
                report.setMaxTouchDownTime(Integer.valueOf(value.intValue()));
                break;
            case 206:
                report.setTrainingPlanId(Long.valueOf(value.longValue()));
                break;
            case 207:
                report.setTrainingPlanTime(Integer.valueOf(value.intValue()));
                break;
            case 208:
                report.setFreeSwimDuration(Integer.valueOf(value.intValue()));
                break;
            case 209:
                report.setAvgFreeBreathAngle(Integer.valueOf(value.intValue()));
                break;
            case 210:
                report.setMaxFreeBreathAngle(Integer.valueOf(value.intValue()));
                break;
            case 211:
                report.setAvgFreePitchAngle(Integer.valueOf(value.intValue()));
                break;
            case 212:
                report.setMaxFreePitchAngle(Integer.valueOf(value.intValue()));
                break;
            case 213:
                report.setFrogSwimDuration(Integer.valueOf(value.intValue()));
                break;
            case 214:
                report.setFrogSkiDuration(Integer.valueOf(value.intValue()));
                break;
            case 215:
                report.setAvgFrogBreathAngle(Integer.valueOf(value.intValue()));
                break;
            case 216:
                report.setMaxFrogBreathAngle(Integer.valueOf(value.intValue()));
                break;
            case 217:
                report.setAvgFrogSkiDuration(Integer.valueOf(value.intValue()));
                break;
            case 218:
                report.setMaxFrogSkiDuration(Integer.valueOf(value.intValue()));
                break;
            case 219:
                report.setVentilationFrequency(Integer.valueOf(value.intValue()));
                break;
            case 220:
                report.setGymTrainingTotalTimes(Integer.valueOf(value.intValue()));
                break;
            case 221:
                report.setGymTrainingTotalWeight(Integer.valueOf(value.intValue()));
                break;
            case 222:
                report.setGymTrainingGroupTimes(Integer.valueOf(value.intValue()));
                break;
            case ReportType.targetValueNumber /* 223 */:
                convertTargetIntValue(report, 6, value.intValue());
                break;
            case ReportType.avgFreq /* 224 */:
                report.setAvgFreq(Integer.valueOf(value.intValue()));
                break;
            case ReportType.maxFreq /* 225 */:
                report.setMaxFreq(Integer.valueOf(value.intValue()));
                break;
        }
    }

    @NotNull
    public final FitnessDataBaseParser.DependDataType getCourseIdExistType() {
        return this.courseIdExistType;
    }

    @NotNull
    public final FitnessDataBaseParser.DependDataType getLactateTypeExistType() {
        return this.lactateTypeExistType;
    }

    @NotNull
    /* JADX INFO: renamed from: getReportDataType */
    public abstract FitnessDataBaseParser.OneDimenDataType[] getReportDataTypeArray();

    @Override // com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser
    @RequiresApi(30)
    @Nullable
    public FitnessParseResult parse(@NotNull FitnessBinaryData binaryData) {
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        FitnessDataId dataId = binaryData.getDataId();
        if (binaryData.getDataValid() == null) {
            FitnessLogUtils.w(this.TAG, "empty dataValid " + dataId);
            return null;
        }
        ParserWayControl parserWayControl = ParserWayControl.INSTANCE;
        String schema = parserWayControl.getSchema(binaryData);
        if (schema == null || !(!StringsKt__StringsKt.isBlank(schema))) {
            FitnessLogUtils.i(this.TAG, "parse sport report by native");
            if (ParserPreference.INSTANCE.getIS_USE_NATIVE_PARSER()) {
                return nativeParse(binaryData);
            }
        } else {
            try {
                FitnessLogUtils.i(this.TAG, "parse sport report by schema");
                SchemaReportParser schemaReportParser = SchemaReportParser.INSTANCE;
                String schema2 = parserWayControl.getSchema(binaryData);
                Intrinsics.checkNotNull(schema2);
                return schemaReportParser.parser(binaryData, schema2);
            } catch (Exception e) {
                FitnessLogUtils.i(this.TAG, "parse sport report by schema error , e:" + e + " ,trace:" + Log.getStackTraceString(e));
                if (ParserPreference.INSTANCE.getIS_USE_NATIVE_PARSER()) {
                    return nativeParse(binaryData);
                }
            }
        }
        return null;
    }

    @NotNull
    public final SportBasicReport parseReport(@NotNull FitnessDataId dataId, @NotNull byte[] dataValid, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(dataValid, "dataValid");
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        FitnessDataBaseParser.OneDimenDataType[] reportDataType = getReportDataTypeArray();
        OneDimenDataParser oneDimenDataParser = OneDimenDataParser.INSTANCE;
        return processParseReport(dataId, oneDimenDataParser.parseOneRecord(reportDataType, dataId, oneDimenDataParser.parseDataValid(reportDataType, dataId, dataValid), byteBuffer));
    }

    public final void printSportReport$fitness_parser_release(@NotNull SportBasicReport sportReport) {
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        try {
            FitnessLogUtils.i(this.TAG, "sportReport(" + getMGson().toJson(sportReport) + ")");
        } catch (Exception e) {
            FitnessLogUtils.INSTANCE.w(this.TAG, "sportReport print", e);
        }
    }
}
