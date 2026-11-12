package com.google.android.exoplayer2.source;

import android.os.Looper;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes14.dex */
public class SampleQueue implements TrackOutput {
    static final int SAMPLE_CAPACITY_INCREMENT = 1000;
    private static final String TAG = "SampleQueue";
    private int absoluteFirstIndex;
    private DrmSession currentDrmSession;
    private Format downstreamFormat;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final DrmSessionManager drmSessionManager;
    private boolean isLastSampleQueued;
    private int length;
    private boolean loggedUnexpectedNonSyncSample;
    private boolean pendingSplice;
    private int readPosition;
    private int relativeFirstIndex;
    private final SampleDataQueue sampleDataQueue;
    private long sampleOffsetUs;
    private Format unadjustedUpstreamFormat;
    private boolean upstreamAllSamplesAreSyncSamples;
    private Format upstreamFormat;
    private boolean upstreamFormatAdjustmentRequired;
    private UpstreamFormatChangedListener upstreamFormatChangeListener;
    private int upstreamSourceId;
    private final SampleExtrasHolder extrasHolder = new SampleExtrasHolder();
    private int capacity = 1000;
    private int[] sourceIds = new int[1000];
    private long[] offsets = new long[1000];
    private long[] timesUs = new long[1000];
    private int[] flags = new int[1000];
    private int[] sizes = new int[1000];
    private TrackOutput.CryptoData[] cryptoDatas = new TrackOutput.CryptoData[1000];
    private final SpannedData<SharedSampleMetadata> sharedSampleMetadata = new SpannedData<>(new k(0));
    private long startTimeUs = Long.MIN_VALUE;
    private long largestDiscardedTimestampUs = Long.MIN_VALUE;
    private long largestQueuedTimestampUs = Long.MIN_VALUE;
    private boolean upstreamFormatRequired = true;
    private boolean upstreamKeyframeRequired = true;

    public static final class SampleExtrasHolder {
        public TrackOutput.CryptoData cryptoData;
        public long offset;
        public int size;
    }

    public static final class SharedSampleMetadata {
        public final DrmSessionManager.DrmSessionReference drmSessionReference;
        public final Format format;

        private SharedSampleMetadata(Format format, DrmSessionManager.DrmSessionReference drmSessionReference) {
            this.format = format;
            this.drmSessionReference = drmSessionReference;
        }
    }

    public interface UpstreamFormatChangedListener {
        void onUpstreamFormatChanged(Format format);
    }

    public SampleQueue(Allocator allocator, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.sampleDataQueue = new SampleDataQueue(allocator);
    }

    private synchronized boolean attemptSplice(long j8) {
        if (this.length == 0) {
            return j8 > this.largestDiscardedTimestampUs;
        }
        if (getLargestReadTimestampUs() >= j8) {
            return false;
        }
        discardUpstreamSampleMetadata(this.absoluteFirstIndex + countUnreadSamplesBefore(j8));
        return true;
    }

    private synchronized void commitSample(long j8, int i14, long j14, int i15, TrackOutput.CryptoData cryptoData) {
        try {
            int i16 = this.length;
            if (i16 > 0) {
                int relativeIndex = getRelativeIndex(i16 - 1);
                Assertions.checkArgument(this.offsets[relativeIndex] + ((long) this.sizes[relativeIndex]) <= j14);
            }
            this.isLastSampleQueued = (536870912 & i14) != 0;
            this.largestQueuedTimestampUs = Math.max(this.largestQueuedTimestampUs, j8);
            int relativeIndex2 = getRelativeIndex(this.length);
            this.timesUs[relativeIndex2] = j8;
            this.offsets[relativeIndex2] = j14;
            this.sizes[relativeIndex2] = i15;
            this.flags[relativeIndex2] = i14;
            this.cryptoDatas[relativeIndex2] = cryptoData;
            this.sourceIds[relativeIndex2] = this.upstreamSourceId;
            if (this.sharedSampleMetadata.isEmpty() || !this.sharedSampleMetadata.getEndValue().format.equals(this.upstreamFormat)) {
                DrmSessionManager drmSessionManager = this.drmSessionManager;
                this.sharedSampleMetadata.appendSpan(getWriteIndex(), new SharedSampleMetadata((Format) Assertions.checkNotNull(this.upstreamFormat), drmSessionManager != null ? drmSessionManager.preacquireSession(this.drmEventDispatcher, this.upstreamFormat) : DrmSessionManager.DrmSessionReference.EMPTY));
            }
            int i17 = this.length + 1;
            this.length = i17;
            int i18 = this.capacity;
            if (i17 == i18) {
                int i19 = i18 + 1000;
                int[] iArr = new int[i19];
                long[] jArr = new long[i19];
                long[] jArr2 = new long[i19];
                int[] iArr2 = new int[i19];
                int[] iArr3 = new int[i19];
                TrackOutput.CryptoData[] cryptoDataArr = new TrackOutput.CryptoData[i19];
                int i24 = this.relativeFirstIndex;
                int i25 = i18 - i24;
                System.arraycopy(this.offsets, i24, jArr, 0, i25);
                System.arraycopy(this.timesUs, this.relativeFirstIndex, jArr2, 0, i25);
                System.arraycopy(this.flags, this.relativeFirstIndex, iArr2, 0, i25);
                System.arraycopy(this.sizes, this.relativeFirstIndex, iArr3, 0, i25);
                System.arraycopy(this.cryptoDatas, this.relativeFirstIndex, cryptoDataArr, 0, i25);
                System.arraycopy(this.sourceIds, this.relativeFirstIndex, iArr, 0, i25);
                int i26 = this.relativeFirstIndex;
                System.arraycopy(this.offsets, 0, jArr, i25, i26);
                System.arraycopy(this.timesUs, 0, jArr2, i25, i26);
                System.arraycopy(this.flags, 0, iArr2, i25, i26);
                System.arraycopy(this.sizes, 0, iArr3, i25, i26);
                System.arraycopy(this.cryptoDatas, 0, cryptoDataArr, i25, i26);
                System.arraycopy(this.sourceIds, 0, iArr, i25, i26);
                this.offsets = jArr;
                this.timesUs = jArr2;
                this.flags = iArr2;
                this.sizes = iArr3;
                this.cryptoDatas = cryptoDataArr;
                this.sourceIds = iArr;
                this.relativeFirstIndex = 0;
                this.capacity = i19;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    private int countUnreadSamplesBefore(long j8) {
        int i14 = this.length;
        int relativeIndex = getRelativeIndex(i14 - 1);
        while (i14 > this.readPosition && this.timesUs[relativeIndex] >= j8) {
            i14--;
            relativeIndex--;
            if (relativeIndex == -1) {
                relativeIndex = this.capacity - 1;
            }
        }
        return i14;
    }

    @Deprecated
    public static SampleQueue createWithDrm(Allocator allocator, Looper looper, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        drmSessionManager.setPlayer(looper, PlayerId.UNSET);
        return new SampleQueue(allocator, (DrmSessionManager) Assertions.checkNotNull(drmSessionManager), (DrmSessionEventListener.EventDispatcher) Assertions.checkNotNull(eventDispatcher));
    }

    public static SampleQueue createWithoutDrm(Allocator allocator) {
        return new SampleQueue(allocator, null, null);
    }

    private synchronized long discardSampleMetadataTo(long j8, boolean z14, boolean z15) throws Throwable {
        Throwable th3;
        try {
            try {
                int i14 = this.length;
                if (i14 != 0) {
                    long[] jArr = this.timesUs;
                    int i15 = this.relativeFirstIndex;
                    if (j8 >= jArr[i15]) {
                        if (z15) {
                            try {
                                int i16 = this.readPosition;
                                if (i16 != i14) {
                                    i14 = i16 + 1;
                                }
                            } catch (Throwable th4) {
                                th3 = th4;
                                throw th3;
                            }
                        }
                        int iFindSampleBefore = findSampleBefore(i15, i14, j8, z14);
                        if (iFindSampleBefore == -1) {
                            return -1L;
                        }
                        return discardSamples(iFindSampleBefore);
                    }
                }
                return -1L;
            } catch (Throwable th5) {
                th = th5;
                th3 = th;
                throw th3;
            }
        } catch (Throwable th6) {
            th = th6;
            th3 = th;
            throw th3;
        }
    }

    private synchronized long discardSampleMetadataToEnd() {
        int i14 = this.length;
        if (i14 == 0) {
            return -1L;
        }
        return discardSamples(i14);
    }

    private long discardSamples(int i14) {
        this.largestDiscardedTimestampUs = Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(i14));
        this.length -= i14;
        int i15 = this.absoluteFirstIndex + i14;
        this.absoluteFirstIndex = i15;
        int i16 = this.relativeFirstIndex + i14;
        this.relativeFirstIndex = i16;
        int i17 = this.capacity;
        if (i16 >= i17) {
            this.relativeFirstIndex = i16 - i17;
        }
        int i18 = this.readPosition - i14;
        this.readPosition = i18;
        if (i18 < 0) {
            this.readPosition = 0;
        }
        this.sharedSampleMetadata.discardTo(i15);
        if (this.length != 0) {
            return this.offsets[this.relativeFirstIndex];
        }
        int i19 = this.relativeFirstIndex;
        if (i19 == 0) {
            i19 = this.capacity;
        }
        int i24 = i19 - 1;
        return this.offsets[i24] + ((long) this.sizes[i24]);
    }

    private long discardUpstreamSampleMetadata(int i14) {
        int writeIndex = getWriteIndex() - i14;
        boolean z14 = false;
        Assertions.checkArgument(writeIndex >= 0 && writeIndex <= this.length - this.readPosition);
        int i15 = this.length - writeIndex;
        this.length = i15;
        this.largestQueuedTimestampUs = Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(i15));
        if (writeIndex == 0 && this.isLastSampleQueued) {
            z14 = true;
        }
        this.isLastSampleQueued = z14;
        this.sharedSampleMetadata.discardFrom(i14);
        int i16 = this.length;
        if (i16 == 0) {
            return 0L;
        }
        int relativeIndex = getRelativeIndex(i16 - 1);
        return this.offsets[relativeIndex] + ((long) this.sizes[relativeIndex]);
    }

    private int findSampleBefore(int i14, int i15, long j8, boolean z14) {
        int i16 = -1;
        for (int i17 = 0; i17 < i15; i17++) {
            long j14 = this.timesUs[i14];
            if (j14 > j8) {
                break;
            }
            if (!z14 || (this.flags[i14] & 1) != 0) {
                if (j14 == j8) {
                    return i17;
                }
                i16 = i17;
            }
            i14++;
            if (i14 == this.capacity) {
                i14 = 0;
            }
        }
        return i16;
    }

    private long getLargestTimestamp(int i14) {
        long jMax = Long.MIN_VALUE;
        if (i14 == 0) {
            return Long.MIN_VALUE;
        }
        int relativeIndex = getRelativeIndex(i14 - 1);
        for (int i15 = 0; i15 < i14; i15++) {
            jMax = Math.max(jMax, this.timesUs[relativeIndex]);
            if ((this.flags[relativeIndex] & 1) != 0) {
                return jMax;
            }
            relativeIndex--;
            if (relativeIndex == -1) {
                relativeIndex = this.capacity - 1;
            }
        }
        return jMax;
    }

    private int getRelativeIndex(int i14) {
        int i15 = this.relativeFirstIndex + i14;
        int i16 = this.capacity;
        return i15 < i16 ? i15 : i15 - i16;
    }

    private boolean hasNextSample() {
        return this.readPosition != this.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(SharedSampleMetadata sharedSampleMetadata) {
        sharedSampleMetadata.drmSessionReference.release();
    }

    private boolean mayReadSample(int i14) {
        DrmSession drmSession = this.currentDrmSession;
        if (drmSession == null || drmSession.getState() == 4) {
            return true;
        }
        return (this.flags[i14] & 1073741824) == 0 && this.currentDrmSession.playClearSamplesWithoutKeys();
    }

    private void onFormatResult(Format format, FormatHolder formatHolder) {
        Format format2 = this.downstreamFormat;
        boolean z14 = format2 == null;
        DrmInitData drmInitData = z14 ? null : format2.drmInitData;
        this.downstreamFormat = format;
        DrmInitData drmInitData2 = format.drmInitData;
        DrmSessionManager drmSessionManager = this.drmSessionManager;
        formatHolder.format = drmSessionManager != null ? format.copyWithCryptoType(drmSessionManager.getCryptoType(format)) : format;
        formatHolder.drmSession = this.currentDrmSession;
        if (this.drmSessionManager == null) {
            return;
        }
        if (z14 || !Util.areEqual(drmInitData, drmInitData2)) {
            DrmSession drmSession = this.currentDrmSession;
            DrmSession drmSessionAcquireSession = this.drmSessionManager.acquireSession(this.drmEventDispatcher, format);
            this.currentDrmSession = drmSessionAcquireSession;
            formatHolder.drmSession = drmSessionAcquireSession;
            if (drmSession != null) {
                drmSession.release(this.drmEventDispatcher);
            }
        }
    }

    private synchronized int peekSampleMetadata(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z14, boolean z15, SampleExtrasHolder sampleExtrasHolder) {
        try {
            decoderInputBuffer.waitingForKeys = false;
            if (!hasNextSample()) {
                if (!z15 && !this.isLastSampleQueued) {
                    Format format = this.upstreamFormat;
                    if (format == null || (!z14 && format == this.downstreamFormat)) {
                        return -3;
                    }
                    onFormatResult((Format) Assertions.checkNotNull(format), formatHolder);
                    return -5;
                }
                decoderInputBuffer.setFlags(4);
                return -4;
            }
            Format format2 = this.sharedSampleMetadata.get(getReadIndex()).format;
            if (!z14 && format2 == this.downstreamFormat) {
                int relativeIndex = getRelativeIndex(this.readPosition);
                if (!mayReadSample(relativeIndex)) {
                    decoderInputBuffer.waitingForKeys = true;
                    return -3;
                }
                decoderInputBuffer.setFlags(this.flags[relativeIndex]);
                long j8 = this.timesUs[relativeIndex];
                decoderInputBuffer.timeUs = j8;
                if (j8 < this.startTimeUs) {
                    decoderInputBuffer.addFlag(Integer.MIN_VALUE);
                }
                sampleExtrasHolder.size = this.sizes[relativeIndex];
                sampleExtrasHolder.offset = this.offsets[relativeIndex];
                sampleExtrasHolder.cryptoData = this.cryptoDatas[relativeIndex];
                return -4;
            }
            onFormatResult(format2, formatHolder);
            return -5;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    private void releaseDrmSessionReferences() {
        DrmSession drmSession = this.currentDrmSession;
        if (drmSession != null) {
            drmSession.release(this.drmEventDispatcher);
            this.currentDrmSession = null;
            this.downstreamFormat = null;
        }
    }

    private synchronized void rewind() {
        this.readPosition = 0;
        this.sampleDataQueue.rewind();
    }

    private synchronized boolean setUpstreamFormat(Format format) {
        try {
            this.upstreamFormatRequired = false;
            if (Util.areEqual(format, this.upstreamFormat)) {
                return false;
            }
            if (this.sharedSampleMetadata.isEmpty() || !this.sharedSampleMetadata.getEndValue().format.equals(format)) {
                this.upstreamFormat = format;
            } else {
                this.upstreamFormat = this.sharedSampleMetadata.getEndValue().format;
            }
            Format format2 = this.upstreamFormat;
            this.upstreamAllSamplesAreSyncSamples = MimeTypes.allSamplesAreSyncSamples(format2.sampleMimeType, format2.codecs);
            this.loggedUnexpectedNonSyncSample = false;
            return true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public synchronized long discardSampleMetadataToRead() {
        int i14 = this.readPosition;
        if (i14 == 0) {
            return -1L;
        }
        return discardSamples(i14);
    }

    public final void discardTo(long j8, boolean z14, boolean z15) {
        this.sampleDataQueue.discardDownstreamTo(discardSampleMetadataTo(j8, z14, z15));
    }

    public final void discardToEnd() {
        this.sampleDataQueue.discardDownstreamTo(discardSampleMetadataToEnd());
    }

    public final void discardToRead() {
        this.sampleDataQueue.discardDownstreamTo(discardSampleMetadataToRead());
    }

    public final void discardUpstreamFrom(long j8) {
        if (this.length == 0) {
            return;
        }
        Assertions.checkArgument(j8 > getLargestReadTimestampUs());
        discardUpstreamSamples(this.absoluteFirstIndex + countUnreadSamplesBefore(j8));
    }

    public final void discardUpstreamSamples(int i14) {
        this.sampleDataQueue.discardUpstreamSampleBytes(discardUpstreamSampleMetadata(i14));
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void format(Format format) {
        Format adjustedUpstreamFormat = getAdjustedUpstreamFormat(format);
        this.upstreamFormatAdjustmentRequired = false;
        this.unadjustedUpstreamFormat = format;
        boolean upstreamFormat = setUpstreamFormat(adjustedUpstreamFormat);
        UpstreamFormatChangedListener upstreamFormatChangedListener = this.upstreamFormatChangeListener;
        if (upstreamFormatChangedListener == null || !upstreamFormat) {
            return;
        }
        upstreamFormatChangedListener.onUpstreamFormatChanged(adjustedUpstreamFormat);
    }

    public Format getAdjustedUpstreamFormat(Format format) {
        return (this.sampleOffsetUs == 0 || format.subsampleOffsetUs == Long.MAX_VALUE) ? format : format.buildUpon().setSubsampleOffsetUs(format.subsampleOffsetUs + this.sampleOffsetUs).build();
    }

    public final int getFirstIndex() {
        return this.absoluteFirstIndex;
    }

    public final synchronized long getFirstTimestampUs() {
        return this.length == 0 ? Long.MIN_VALUE : this.timesUs[this.relativeFirstIndex];
    }

    public final synchronized long getLargestQueuedTimestampUs() {
        return this.largestQueuedTimestampUs;
    }

    public final synchronized long getLargestReadTimestampUs() {
        return Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(this.readPosition));
    }

    public final int getReadIndex() {
        return this.absoluteFirstIndex + this.readPosition;
    }

    public final synchronized int getSkipCount(long j8, boolean z14) throws Throwable {
        Throwable th3;
        try {
            try {
                int relativeIndex = getRelativeIndex(this.readPosition);
                if (!hasNextSample() || j8 < this.timesUs[relativeIndex]) {
                    return 0;
                }
                if (j8 <= this.largestQueuedTimestampUs || !z14) {
                    int iFindSampleBefore = findSampleBefore(relativeIndex, this.length - this.readPosition, j8, true);
                    if (iFindSampleBefore == -1) {
                        return 0;
                    }
                    return iFindSampleBefore;
                }
                try {
                    return this.length - this.readPosition;
                } catch (Throwable th4) {
                    th3 = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                th3 = th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
        throw th3;
    }

    public final synchronized Format getUpstreamFormat() {
        return this.upstreamFormatRequired ? null : this.upstreamFormat;
    }

    public final int getWriteIndex() {
        return this.absoluteFirstIndex + this.length;
    }

    public final void invalidateUpstreamFormatAdjustment() {
        this.upstreamFormatAdjustmentRequired = true;
    }

    public final synchronized boolean isLastSampleQueued() {
        return this.isLastSampleQueued;
    }

    public synchronized boolean isReady(boolean z14) {
        Format format;
        boolean z15 = true;
        if (hasNextSample()) {
            if (this.sharedSampleMetadata.get(getReadIndex()).format != this.downstreamFormat) {
                return true;
            }
            return mayReadSample(getRelativeIndex(this.readPosition));
        }
        if (!z14 && !this.isLastSampleQueued && ((format = this.upstreamFormat) == null || format == this.downstreamFormat)) {
            z15 = false;
        }
        return z15;
    }

    public void maybeThrowError() throws DrmSession.DrmSessionException {
        DrmSession drmSession = this.currentDrmSession;
        if (drmSession != null && drmSession.getState() == 1) {
            throw ((DrmSession.DrmSessionException) Assertions.checkNotNull(this.currentDrmSession.getError()));
        }
    }

    public final synchronized int peekSourceId() {
        try {
        } catch (Throwable th3) {
            throw th3;
        }
        return hasNextSample() ? this.sourceIds[getRelativeIndex(this.readPosition)] : this.upstreamSourceId;
    }

    public void preRelease() {
        discardToEnd();
        releaseDrmSessionReferences();
    }

    public int read(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i14, boolean z14) {
        int iPeekSampleMetadata = peekSampleMetadata(formatHolder, decoderInputBuffer, (i14 & 2) != 0, z14, this.extrasHolder);
        if (iPeekSampleMetadata == -4 && !decoderInputBuffer.isEndOfStream()) {
            boolean z15 = (i14 & 1) != 0;
            if ((i14 & 4) == 0) {
                SampleDataQueue sampleDataQueue = this.sampleDataQueue;
                if (z15) {
                    sampleDataQueue.peekToBuffer(decoderInputBuffer, this.extrasHolder);
                } else {
                    sampleDataQueue.readToBuffer(decoderInputBuffer, this.extrasHolder);
                }
            }
            if (!z15) {
                this.readPosition++;
            }
        }
        return iPeekSampleMetadata;
    }

    public void release() {
        reset(true);
        releaseDrmSessionReferences();
    }

    public void reset(boolean z14) {
        this.sampleDataQueue.reset();
        this.length = 0;
        this.absoluteFirstIndex = 0;
        this.relativeFirstIndex = 0;
        this.readPosition = 0;
        this.upstreamKeyframeRequired = true;
        this.startTimeUs = Long.MIN_VALUE;
        this.largestDiscardedTimestampUs = Long.MIN_VALUE;
        this.largestQueuedTimestampUs = Long.MIN_VALUE;
        this.isLastSampleQueued = false;
        this.sharedSampleMetadata.clear();
        if (z14) {
            this.unadjustedUpstreamFormat = null;
            this.upstreamFormat = null;
            this.upstreamFormatRequired = true;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final int sampleData(DataReader dataReader, int i14, boolean z14, int i15) {
        return this.sampleDataQueue.sampleData(dataReader, i14, z14);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public void sampleMetadata(long j8, int i14, int i15, int i16, TrackOutput.CryptoData cryptoData) {
        int i17;
        if (this.upstreamFormatAdjustmentRequired) {
            format((Format) Assertions.checkStateNotNull(this.unadjustedUpstreamFormat));
        }
        int i18 = i14 & 1;
        boolean z14 = i18 != 0;
        if (this.upstreamKeyframeRequired) {
            if (!z14) {
                return;
            } else {
                this.upstreamKeyframeRequired = false;
            }
        }
        long j14 = this.sampleOffsetUs + j8;
        if (!this.upstreamAllSamplesAreSyncSamples) {
            i17 = i14;
        } else {
            if (j14 < this.startTimeUs) {
                return;
            }
            if (i18 == 0) {
                if (!this.loggedUnexpectedNonSyncSample) {
                    String strValueOf = String.valueOf(this.upstreamFormat);
                    StringBuilder sb3 = new StringBuilder(strValueOf.length() + 50);
                    sb3.append("Overriding unexpected non-sync sample for format: ");
                    sb3.append(strValueOf);
                    Log.w(TAG, sb3.toString());
                    this.loggedUnexpectedNonSyncSample = true;
                }
                i17 = i14 | 1;
            } else {
                i17 = i14;
            }
        }
        if (this.pendingSplice) {
            if (!z14 || !attemptSplice(j14)) {
                return;
            } else {
                this.pendingSplice = false;
            }
        }
        commitSample(j14, i17, (this.sampleDataQueue.getTotalBytesWritten() - ((long) i15)) - ((long) i16), i15, cryptoData);
    }

    public final synchronized boolean seekTo(long j8, boolean z14) throws Throwable {
        try {
            try {
                rewind();
                int relativeIndex = getRelativeIndex(this.readPosition);
                if (!hasNextSample() || j8 < this.timesUs[relativeIndex] || (j8 > this.largestQueuedTimestampUs && !z14)) {
                    return false;
                }
                int iFindSampleBefore = findSampleBefore(relativeIndex, this.length - this.readPosition, j8, true);
                if (iFindSampleBefore == -1) {
                    return false;
                }
                this.startTimeUs = j8;
                this.readPosition += iFindSampleBefore;
                return true;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final void setSampleOffsetUs(long j8) {
        if (this.sampleOffsetUs != j8) {
            this.sampleOffsetUs = j8;
            invalidateUpstreamFormatAdjustment();
        }
    }

    public final void setStartTimeUs(long j8) {
        this.startTimeUs = j8;
    }

    public final void setUpstreamFormatChangeListener(UpstreamFormatChangedListener upstreamFormatChangedListener) {
        this.upstreamFormatChangeListener = upstreamFormatChangedListener;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    public final synchronized void skip(int i14) {
        boolean z14;
        if (i14 >= 0) {
            try {
                if (this.readPosition + i14 <= this.length) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        } else {
            z14 = false;
        }
        Assertions.checkArgument(z14);
        this.readPosition += i14;
    }

    public final void sourceId(int i14) {
        this.upstreamSourceId = i14;
    }

    public final void splice() {
        this.pendingSplice = true;
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void sampleData(ParsableByteArray parsableByteArray, int i14, int i15) {
        this.sampleDataQueue.sampleData(parsableByteArray, i14);
    }

    public static SampleQueue createWithDrm(Allocator allocator, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return new SampleQueue(allocator, (DrmSessionManager) Assertions.checkNotNull(drmSessionManager), (DrmSessionEventListener.EventDispatcher) Assertions.checkNotNull(eventDispatcher));
    }

    public final void reset() {
        reset(false);
    }

    public final synchronized boolean seekTo(int i14) {
        rewind();
        int i15 = this.absoluteFirstIndex;
        if (i14 >= i15 && i14 <= this.length + i15) {
            this.startTimeUs = Long.MIN_VALUE;
            this.readPosition = i14 - i15;
            return true;
        }
        return false;
    }
}
