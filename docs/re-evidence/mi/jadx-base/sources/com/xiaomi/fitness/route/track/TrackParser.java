package com.xiaomi.fitness.route.track;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.route.track.utils.FitnessParserUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/route/track/TrackParser;", "", "<init>", "()V", "TAG", "", "parse", "", "data", "", "parseTrackTurnPoint", "byteBuffer", "Ljava/nio/ByteBuffer;", "parseTrackWptPoint", "parseTrackRecord", "parseTrackInfo", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrackParser {

    @NotNull
    public static final TrackParser INSTANCE = new TrackParser();

    @NotNull
    public static final String TAG = "TrackParser";

    private TrackParser() {
    }

    private final void parseTrackInfo(ByteBuffer byteBuffer) {
        FitnessParserUtils fitnessParserUtils = FitnessParserUtils.INSTANCE;
        fitnessParserUtils.getIntFor1Byte(byteBuffer);
        fitnessParserUtils.getIntFor4Bytes(byteBuffer);
        fitnessParserUtils.getIntFor4Bytes(byteBuffer);
        String string = StringsKt__StringsKt.trim((CharSequence) new String(fitnessParserUtils.getBytes(byteBuffer, 60), Charsets.UTF_8)).toString();
        byte[] bytes = fitnessParserUtils.getBytes(byteBuffer, 16);
        long intFor4Bytes = fitnessParserUtils.getIntFor4Bytes(byteBuffer);
        long intFor4Bytes2 = fitnessParserUtils.getIntFor4Bytes(byteBuffer);
        long intFor4Bytes3 = fitnessParserUtils.getIntFor4Bytes(byteBuffer);
        long intFor4Bytes4 = fitnessParserUtils.getIntFor4Bytes(byteBuffer);
        long intFor4Bytes5 = fitnessParserUtils.getIntFor4Bytes(byteBuffer);
        long intFor4Bytes6 = fitnessParserUtils.getIntFor4Bytes(byteBuffer);
        long intFor4Bytes7 = fitnessParserUtils.getIntFor4Bytes(byteBuffer);
        long intFor4Bytes8 = fitnessParserUtils.getIntFor4Bytes(byteBuffer);
        long intFor4Bytes9 = fitnessParserUtils.getIntFor4Bytes(byteBuffer);
        long intFor4Bytes10 = fitnessParserUtils.getIntFor4Bytes(byteBuffer);
        long intFor4Bytes11 = fitnessParserUtils.getIntFor4Bytes(byteBuffer);
        long intFor4Bytes12 = fitnessParserUtils.getIntFor4Bytes(byteBuffer);
        FitnessLogUtils.d(TAG, "轨迹信息--------------------------------------------");
        FitnessLogUtils.d(TAG, "name:" + string + " , md5:" + bytes + " , dis:" + intFor4Bytes + " , locationCount:" + intFor4Bytes2 + " , wptPointCount :" + intFor4Bytes3 + " ,turnCount:" + intFor4Bytes4 + " , minLon:" + intFor4Bytes5 + ",minLat:" + intFor4Bytes6 + " , maxLon:" + intFor4Bytes7 + " , maxLat:" + intFor4Bytes8 + " , minEle:" + intFor4Bytes9 + " , maxEle:" + intFor4Bytes10 + " , cumulativeIncrease:" + intFor4Bytes11 + " , cumulativeDecrease:" + intFor4Bytes12);
    }

    private final void parseTrackRecord(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        FitnessParserUtils fitnessParserUtils = FitnessParserUtils.INSTANCE;
        fitnessParserUtils.getIntFor1Byte(byteBuffer2);
        long intFor4Bytes = fitnessParserUtils.getIntFor4Bytes(byteBuffer2);
        FitnessLogUtils.d(TAG, "轨迹点-------------------------------------");
        long j = intFor4Bytes / ((long) 20);
        long j2 = 0;
        while (j2 < j) {
            FitnessParserUtils fitnessParserUtils2 = FitnessParserUtils.INSTANCE;
            long j3 = j;
            FitnessLogUtils.d(TAG, "no:" + fitnessParserUtils2.getIntFor4Bytes(byteBuffer2) + " , lon:" + fitnessParserUtils2.getIntFor4Bytes(byteBuffer2) + " , lat:" + fitnessParserUtils2.getIntFor4Bytes(byteBuffer2) + " ,ele:" + fitnessParserUtils2.getIntFor4Bytes(byteBuffer2) + ", type:" + fitnessParserUtils2.getIntFor4Bytes(byteBuffer2));
            j2++;
            byteBuffer2 = byteBuffer;
            j = j3;
        }
    }

    private final void parseTrackTurnPoint(ByteBuffer byteBuffer) {
    }

    private final void parseTrackWptPoint(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        FitnessParserUtils fitnessParserUtils = FitnessParserUtils.INSTANCE;
        fitnessParserUtils.getIntFor1Byte(byteBuffer2);
        long intFor4Bytes = fitnessParserUtils.getIntFor4Bytes(byteBuffer2);
        FitnessLogUtils.d(TAG, "途经点-----------------------------");
        long j = intFor4Bytes / ((long) 92);
        long j2 = 0;
        while (j2 < j) {
            FitnessParserUtils fitnessParserUtils2 = FitnessParserUtils.INSTANCE;
            fitnessParserUtils2.getIntFor4Bytes(byteBuffer2);
            byte[] bytes = fitnessParserUtils2.getBytes(byteBuffer2, 60);
            fitnessParserUtils2.getIntFor4Bytes(byteBuffer2);
            fitnessParserUtils2.getIntFor4Bytes(byteBuffer2);
            fitnessParserUtils2.getIntFor4Bytes(byteBuffer2);
            long intFor4Bytes2 = fitnessParserUtils2.getIntFor4Bytes(byteBuffer2);
            long intFor4Bytes3 = fitnessParserUtils2.getIntFor4Bytes(byteBuffer2);
            long intFor4Bytes4 = fitnessParserUtils2.getIntFor4Bytes(byteBuffer2);
            long intFor4Bytes5 = fitnessParserUtils2.getIntFor4Bytes(byteBuffer2);
            FitnessLogUtils.d(TAG, "name:" + StringsKt__StringsKt.trim((CharSequence) new String(bytes, Charsets.UTF_8)).toString() + ", cumulativeIncrease:" + intFor4Bytes2 + ", cumulativeDecrease:" + intFor4Bytes3 + " , nextDis:" + intFor4Bytes4 + ", disToStart:" + intFor4Bytes5);
            j2++;
            byteBuffer2 = byteBuffer;
        }
    }

    public final void parse(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        FitnessParserUtils fitnessParserUtils = FitnessParserUtils.INSTANCE;
        Intrinsics.checkNotNull(byteBufferOrder);
        fitnessParserUtils.getIntFor1Byte(byteBufferOrder);
        fitnessParserUtils.getIntFor1Byte(byteBufferOrder);
        parseTrackInfo(byteBufferOrder);
        parseTrackRecord(byteBufferOrder);
        parseTrackWptPoint(byteBufferOrder);
        parseTrackTurnPoint(byteBufferOrder);
    }
}
