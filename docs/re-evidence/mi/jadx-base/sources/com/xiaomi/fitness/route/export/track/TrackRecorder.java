package com.xiaomi.fitness.route.export.track;

import com.xiaomi.fitness.common.log.Logger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/route/export/track/TrackRecorder;", "", "<init>", "()V", "TAG", "", "recorder", "Lkotlin/Pair;", "", "Lcom/xiaomi/fitness/route/export/track/Recorder;", "data", "recorderTrackWptPoint", "recorderTrackInfo", "recorderTrackSegment", "recorderTrackRecord", "route-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTrackRecorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackRecorder.kt\ncom/xiaomi/fitness/route/export/track/TrackRecorder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,137:1\n1863#2,2:138\n1863#2,2:140\n1863#2,2:142\n*S KotlinDebug\n*F\n+ 1 TrackRecorder.kt\ncom/xiaomi/fitness/route/export/track/TrackRecorder\n*L\n44#1:138,2\n97#1:140,2\n118#1:142,2\n*E\n"})
public final class TrackRecorder {

    @NotNull
    public static final TrackRecorder INSTANCE = new TrackRecorder();

    @NotNull
    public static final String TAG = "TrackRecorder";

    private TrackRecorder() {
    }

    private final byte[] recorderTrackInfo(Recorder data) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(133).order(ByteOrder.LITTLE_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "order(...)");
        Logger.d(TAG, "recorder:" + data);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putInt(128);
        byteBufferOrder.putInt(data.getVersion());
        byteBufferOrder.put(data.getName());
        byteBufferOrder.put(data.getMd5());
        byteBufferOrder.putInt(data.getDis());
        byteBufferOrder.putInt(data.getLocationCount());
        byteBufferOrder.putInt(data.getPassPoint());
        byteBufferOrder.putInt(data.getTurnPoint());
        byteBufferOrder.putInt(data.getMinLongitude());
        byteBufferOrder.putInt(data.getMinLatitude());
        byteBufferOrder.putInt(data.getMaxLongitude());
        byteBufferOrder.putInt(data.getMaxLatitude());
        byteBufferOrder.putInt(data.getMinAltitude());
        byteBufferOrder.putInt(data.getMaxAltitude());
        byteBufferOrder.putInt((int) data.getCumulativeIncrease());
        byteBufferOrder.putInt((int) data.getCumulativeDecrease());
        byte[] bArrArray = byteBufferOrder.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        return bArrArray;
    }

    private final byte[] recorderTrackRecord(Recorder data) {
        List<RecorderPoint> pointList = data.getPointList();
        int size = (pointList != null ? pointList.size() : 0) * 20;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(size + 5).order(ByteOrder.LITTLE_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "order(...)");
        byteBufferOrder.put((byte) 1);
        byteBufferOrder.putInt(size);
        List<RecorderPoint> pointList2 = data.getPointList();
        if (pointList2 != null) {
            for (RecorderPoint recorderPoint : pointList2) {
                byteBufferOrder.putInt(recorderPoint.getNo());
                byteBufferOrder.putInt(recorderPoint.getLon());
                byteBufferOrder.putInt(recorderPoint.getLat());
                byteBufferOrder.putInt((int) recorderPoint.getEle());
                byteBufferOrder.putInt(recorderPoint.getType());
            }
        }
        byte[] bArrArray = byteBufferOrder.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        return bArrArray;
    }

    private final byte[] recorderTrackSegment(Recorder data) {
        List<SegmentRecorderPoint> segmentList;
        if (data.getSegmentList() == null || ((segmentList = data.getSegmentList()) != null && segmentList.isEmpty())) {
            return new byte[0];
        }
        List<SegmentRecorderPoint> segmentList2 = data.getSegmentList();
        int size = (segmentList2 != null ? segmentList2.size() : 0) * 24;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(size + 5).order(ByteOrder.LITTLE_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "order(...)");
        byteBufferOrder.put((byte) 4);
        byteBufferOrder.putInt(size);
        List<SegmentRecorderPoint> segmentList3 = data.getSegmentList();
        if (segmentList3 != null) {
            for (SegmentRecorderPoint segmentRecorderPoint : segmentList3) {
                byteBufferOrder.putInt(segmentRecorderPoint.getNo());
                byteBufferOrder.putInt(segmentRecorderPoint.getLon());
                byteBufferOrder.putInt(segmentRecorderPoint.getLat());
                byteBufferOrder.putInt((int) segmentRecorderPoint.getEle());
                byteBufferOrder.putInt(segmentRecorderPoint.getSize());
                byteBufferOrder.putInt(segmentRecorderPoint.getDistance());
            }
        }
        byte[] bArrArray = byteBufferOrder.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        return bArrArray;
    }

    private final byte[] recorderTrackWptPoint(Recorder data) {
        List<WptRecorderPoint> wptList;
        if (data.getWptList() == null || ((wptList = data.getWptList()) != null && wptList.isEmpty())) {
            return new byte[0];
        }
        List<WptRecorderPoint> wptList2 = data.getWptList();
        Integer numValueOf = wptList2 != null ? Integer.valueOf(wptList2.size()) : null;
        Intrinsics.checkNotNull(numValueOf);
        ByteBuffer byteBufferOrder = ByteBuffer.allocate((numValueOf.intValue() * 92) + 5).order(ByteOrder.LITTLE_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "order(...)");
        byteBufferOrder.put((byte) 2);
        List<WptRecorderPoint> wptList3 = data.getWptList();
        Intrinsics.checkNotNull(wptList3);
        byteBufferOrder.putInt(wptList3.size() * 92);
        List<WptRecorderPoint> wptList4 = data.getWptList();
        Intrinsics.checkNotNull(wptList4);
        for (WptRecorderPoint wptRecorderPoint : wptList4) {
            byteBufferOrder.putInt(wptRecorderPoint.getNo());
            byte[] bArrCopyOf = Arrays.copyOf(wptRecorderPoint.getName(), 60);
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
            byteBufferOrder.put(bArrCopyOf);
            byteBufferOrder.putInt(wptRecorderPoint.getLon());
            byteBufferOrder.putInt(wptRecorderPoint.getLat());
            byteBufferOrder.putInt(wptRecorderPoint.getEle());
            byteBufferOrder.putInt((int) wptRecorderPoint.getCumulativeIncrease());
            byteBufferOrder.putInt((int) wptRecorderPoint.getCumulativeDecrease());
            byteBufferOrder.putInt(wptRecorderPoint.getDisToNextWptPoint());
            byteBufferOrder.putInt(wptRecorderPoint.getDisToStartPoint());
            Logger.d(TAG, "wptPoint:" + wptRecorderPoint);
        }
        byte[] bArrArray = byteBufferOrder.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        return bArrArray;
    }

    @NotNull
    public final Pair<byte[], Recorder> recorder(@NotNull Recorder data) {
        Intrinsics.checkNotNullParameter(data, "data");
        List<RecorderPoint> pointList = data.getPointList();
        int size = pointList != null ? pointList.size() : 0;
        List<WptRecorderPoint> wptList = data.getWptList();
        int size2 = wptList != null ? wptList.size() : 0;
        List<SegmentRecorderPoint> segmentList = data.getSegmentList();
        ByteBuffer byteBufferOrder = ByteBuffer.allocate((size * 20) + 140 + (size2 * 92) + 5 + ((segmentList != null ? segmentList.size() : 0) * 24) + 5).order(ByteOrder.LITTLE_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "order(...)");
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.put(data.getHeadValid());
        TrackRecorder trackRecorder = INSTANCE;
        byteBufferOrder.put(trackRecorder.recorderTrackInfo(data));
        byteBufferOrder.put(trackRecorder.recorderTrackRecord(data));
        byteBufferOrder.put(trackRecorder.recorderTrackWptPoint(data));
        List<SegmentRecorderPoint> segmentList2 = data.getSegmentList();
        if (segmentList2 != null && !segmentList2.isEmpty()) {
            byteBufferOrder.put(trackRecorder.recorderTrackSegment(data));
        }
        return new Pair<>(byteBufferOrder.array(), data);
    }
}
