package com.google.android.exoplayer2.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SilenceMediaSource extends BaseMediaSource {
    public static final String MEDIA_ID = "SilenceMediaSource";
    private static final int i = 44100;
    private static final int j = 2;
    private static final int k = 2;
    private static final Format l;
    private static final MediaItem m;
    private static final byte[] n;
    private final long g;
    private final MediaItem h;

    public static final class Factory {
        private long a;

        @Nullable
        private Object b;

        public SilenceMediaSource createMediaSource() {
            Assertions.checkState(this.a > 0);
            return new SilenceMediaSource(this.a, SilenceMediaSource.m.buildUpon().setTag(this.b).build());
        }

        public Factory setDurationUs(long durationUs) {
            this.a = durationUs;
            return this;
        }

        public Factory setTag(@Nullable Object tag) {
            this.b = tag;
            return this;
        }
    }

    public static final class b implements MediaPeriod {
        private static final TrackGroupArray c = new TrackGroupArray(new TrackGroup(SilenceMediaSource.l));
        private final long a;
        private final ArrayList<SampleStream> b = new ArrayList<>();

        public b(long durationUs) {
            this.a = durationUs;
        }

        private long a(long positionUs) {
            return Util.constrainValue(positionUs, 0L, this.a);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean continueLoading(long positionUs) {
            return false;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void discardBuffer(long positionUs, boolean toKeyframe) {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long getAdjustedSeekPositionUs(long positionUs, SeekParameters seekParameters) {
            return a(positionUs);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getBufferedPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public /* synthetic */ List getStreamKeys(List list) {
            return com.google.android.exoplayer2.source.a.a(this, list);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public TrackGroupArray getTrackGroups() {
            return c;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void maybeThrowPrepareError() {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void prepare(MediaPeriod.Callback callback, long positionUs) {
            callback.onPrepared(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long readDiscontinuity() {
            return C.TIME_UNSET;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public void reevaluateBuffer(long positionUs) {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long seekToUs(long positionUs) {
            long jA = a(positionUs);
            for (int i = 0; i < this.b.size(); i++) {
                ((c) this.b.get(i)).a(jA);
            }
            return jA;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long selectTracks(ExoTrackSelection[] selections, boolean[] mayRetainStreamFlags, SampleStream[] streams, boolean[] streamResetFlags, long positionUs) {
            long jA = a(positionUs);
            for (int i = 0; i < selections.length; i++) {
                if (streams[i] != null && (selections[i] == null || !mayRetainStreamFlags[i])) {
                    this.b.remove(streams[i]);
                    streams[i] = null;
                }
                if (streams[i] == null && selections[i] != null) {
                    c cVar = new c(this.a);
                    cVar.a(jA);
                    this.b.add(cVar);
                    streams[i] = cVar;
                    streamResetFlags[i] = true;
                }
            }
            return jA;
        }
    }

    public static final class c implements SampleStream {
        private final long a;
        private boolean b;
        private long c;

        public c(long durationUs) {
            this.a = SilenceMediaSource.f(durationUs);
            a(0L);
        }

        public void a(long positionUs) {
            this.c = Util.constrainValue(SilenceMediaSource.f(positionUs), 0L, this.a);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
            return true;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() {
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer buffer, int readFlags) {
            if (!this.b || (readFlags & 2) != 0) {
                formatHolder.format = SilenceMediaSource.l;
                this.b = true;
                return -5;
            }
            long j = this.a;
            long j2 = this.c;
            long j3 = j - j2;
            if (j3 == 0) {
                buffer.addFlag(4);
                return -4;
            }
            buffer.timeUs = SilenceMediaSource.g(j2);
            buffer.addFlag(1);
            int iMin = (int) Math.min(SilenceMediaSource.n.length, j3);
            if ((readFlags & 4) == 0) {
                buffer.ensureSpaceForWrite(iMin);
                buffer.data.put(SilenceMediaSource.n, 0, iMin);
            }
            if ((readFlags & 1) == 0) {
                this.c += (long) iMin;
            }
            return -4;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long positionUs) {
            long j = this.c;
            a(positionUs);
            return (int) ((this.c - j) / ((long) SilenceMediaSource.n.length));
        }
    }

    static {
        Format formatBuild = new Format.Builder().setSampleMimeType(MimeTypes.AUDIO_RAW).setChannelCount(2).setSampleRate(44100).setPcmEncoding(2).build();
        l = formatBuild;
        m = new MediaItem.Builder().setMediaId(MEDIA_ID).setUri(Uri.EMPTY).setMimeType(formatBuild.sampleMimeType).build();
        n = new byte[Util.getPcmFrameSize(2, 2) * 1024];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long f(long durationUs) {
        return ((long) Util.getPcmFrameSize(2, 2)) * ((durationUs * 44100) / 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long g(long bytes) {
        return ((bytes / ((long) Util.getPcmFrameSize(2, 2))) * 1000000) / 44100;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId id, Allocator allocator, long startPositionUs) {
        return new b(this.g);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return this.h;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener mediaTransferListener) {
        refreshSourceInfo(new SinglePeriodTimeline(this.g, true, false, false, (Object) null, this.h));
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
    }

    public SilenceMediaSource(long durationUs) {
        this(durationUs, m);
    }

    private SilenceMediaSource(long durationUs, MediaItem mediaItem) {
        Assertions.checkArgument(durationUs >= 0);
        this.g = durationUs;
        this.h = mediaItem;
    }
}
