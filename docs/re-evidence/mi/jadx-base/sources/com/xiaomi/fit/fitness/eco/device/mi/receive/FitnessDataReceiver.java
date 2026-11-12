package com.xiaomi.fit.fitness.eco.device.mi.receive;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.eco.device.mi.FitnessDeviceSyncManager;
import com.xiaomi.fitness.common.utils.CRCUtil;
import com.xiaomi.fitness.statistics.StatConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\u0018\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fit/fitness/eco/device/mi/receive/FitnessDataReceiver;", "", "sid", "", "crc32Verify", "", "<init>", "(Ljava/lang/String;Z)V", "TAG", "DATA_ID_LENGTH", "", "mCurrentCount", "mTotalCount", "mTotalBytes", "mSegments", "Ljava/util/ArrayList;", "Lcom/xiaomi/fit/fitness/eco/device/mi/receive/FitnessDataReceiver$Segment;", "onReceive", "", "data", "", "merge", "generateCompleteData", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "reset", "Segment", "fitness-eco-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FitnessDataReceiver {
    private final int DATA_ID_LENGTH;

    @NotNull
    private final String TAG;
    private final boolean crc32Verify;
    private int mCurrentCount;

    @NotNull
    private final ArrayList<Segment> mSegments;
    private int mTotalBytes;
    private int mTotalCount;

    @NotNull
    private final String sid;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fit/fitness/eco/device/mi/receive/FitnessDataReceiver$Segment;", "", "sequence", "", "data", "", StatConstants.PARAM_START, StatConstants.PARAM_END, "<init>", "(I[BII)V", "getSequence", "()I", "getData", "()[B", "getStart", "getEnd", "dataLength", "getDataLength", "fillBuffer", "", "buffer", "Ljava/nio/ByteBuffer;", "fitness-eco-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Segment {

        @NotNull
        private final byte[] data;
        private final int end;
        private final int sequence;
        private final int start;

        public Segment(int i, @NotNull byte[] data, int i2, int i3) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.sequence = i;
            this.data = data;
            this.start = i2;
            this.end = i3;
        }

        public final void fillBuffer(@NotNull ByteBuffer buffer) {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            buffer.put(this.data, this.start, getDataLength());
        }

        @NotNull
        public final byte[] getData() {
            return this.data;
        }

        public final int getDataLength() {
            return this.end - this.start;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getSequence() {
            return this.sequence;
        }

        public final int getStart() {
            return this.start;
        }
    }

    public FitnessDataReceiver(@NotNull String sid, boolean z) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        this.sid = sid;
        this.crc32Verify = z;
        this.TAG = "FitnessDataReceiver";
        this.DATA_ID_LENGTH = 7;
        this.mSegments = new ArrayList<>();
    }

    private final byte[] generateCompleteData(FitnessDataId dataId, byte[] data) {
        byte[] bArrConvertToServerDataId = dataId.convertToServerDataId();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrConvertToServerDataId.length + data.length);
        byteBufferAllocate.put(bArrConvertToServerDataId);
        byteBufferAllocate.put(data);
        byte[] bArrArray = byteBufferAllocate.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        return bArrArray;
    }

    private final void merge() {
        FitnessLogUtils.i(this.TAG, "merge");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.mTotalBytes);
        Iterator<Segment> it = this.mSegments.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Segment next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            Intrinsics.checkNotNull(byteBufferAllocate);
            next.fillBuffer(byteBufferAllocate);
        }
        int i = this.crc32Verify ? this.mTotalBytes - 4 : this.mTotalBytes;
        byte[] bArr = new byte[i];
        byteBufferAllocate.clear();
        byteBufferAllocate.get(bArr);
        if (this.crc32Verify) {
            byte[] bArr2 = new byte[4];
            byteBufferAllocate.get(bArr2);
            if (!Arrays.equals(bArr2, CRCUtil.CRC32(bArr))) {
                FitnessLogUtils.e(this.TAG, "check crc32 failed!!! ");
                return;
            }
        }
        int i2 = this.DATA_ID_LENGTH;
        byte[] bArr3 = new byte[i2];
        byte[] bArr4 = new byte[i - i2];
        byteBufferAllocate.clear();
        byteBufferAllocate.get(bArr3);
        byteBufferAllocate.get(bArr4);
        FitnessDataId fitnessDataId = new FitnessDataId(bArr3);
        FitnessLogUtils.i(this.TAG, "received " + this.mTotalBytes + " bytes(" + fitnessDataId + ")");
        FitnessDeviceSyncManager.INSTANCE.getInstance().syncTheData(this.sid, fitnessDataId, generateCompleteData(fitnessDataId, bArr4));
    }

    private final void reset() {
        this.mCurrentCount = 0;
        this.mTotalCount = 0;
        this.mTotalBytes = 0;
        this.mSegments.clear();
    }

    public final void onReceive(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        short s = byteBufferOrder.getShort();
        short s2 = byteBufferOrder.getShort();
        FitnessLogUtils.i(this.TAG, "sid = " + this.sid + ", onReceive, sequence = " + ((int) s2) + ", total = " + ((int) s));
        if (s2 > s) {
            FitnessLogUtils.e(this.TAG, "sequence = " + ((int) s2) + ", total = " + ((int) s) + ", illegal");
            reset();
            return;
        }
        int i = this.mTotalCount;
        if (i == 0) {
            this.mTotalCount = s;
        } else if (i != s) {
            FitnessLogUtils.e(this.TAG, "preTotal = " + i + ", thisTotal = " + ((int) s) + ", illegal");
            reset();
            this.mTotalCount = s;
        }
        int i2 = this.mCurrentCount;
        if (s2 == i2 + 1) {
            this.mCurrentCount = s2;
            Segment segment = new Segment(s2, data, 4, data.length);
            this.mTotalBytes += segment.getDataLength();
            this.mSegments.add(segment);
            if (s == s2) {
                merge();
                reset();
                return;
            }
            return;
        }
        FitnessLogUtils.e(this.TAG, "sequence = " + ((int) s2) + ", preSequence = " + i2 + ", illegal");
        reset();
    }
}
