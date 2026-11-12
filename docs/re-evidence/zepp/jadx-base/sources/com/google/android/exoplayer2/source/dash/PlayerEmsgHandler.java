package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class PlayerEmsgHandler implements Handler.Callback {
    private static final int k = 1;
    private final Allocator a;
    private final PlayerEmsgCallback b;
    private DashManifest f;
    private long g;
    private boolean h;
    private boolean i;
    private boolean j;
    private final TreeMap<Long, Long> e = new TreeMap<>();
    private final Handler d = Util.createHandlerForCurrentLooper(this);
    private final EventMessageDecoder c = new EventMessageDecoder();

    public interface PlayerEmsgCallback {
        void onDashManifestPublishTimeExpired(long expiredManifestPublishTimeUs);

        void onDashManifestRefreshRequested();
    }

    public final class PlayerTrackEmsgHandler implements TrackOutput {
        private final SampleQueue a;
        private final FormatHolder b = new FormatHolder();
        private final MetadataInputBuffer c = new MetadataInputBuffer();
        private long d = C.TIME_UNSET;

        public PlayerTrackEmsgHandler(Allocator allocator) {
            this.a = SampleQueue.createWithoutDrm(allocator);
        }

        @Nullable
        private MetadataInputBuffer a() {
            this.c.clear();
            if (this.a.read(this.b, this.c, 0, false) != -4) {
                return null;
            }
            this.c.flip();
            return this.c;
        }

        private void b(long eventTimeUs, long manifestPublishTimeMsInEmsg) {
            PlayerEmsgHandler.this.d.sendMessage(PlayerEmsgHandler.this.d.obtainMessage(1, new a(eventTimeUs, manifestPublishTimeMsInEmsg)));
        }

        private void c() {
            while (this.a.isReady(false)) {
                MetadataInputBuffer metadataInputBufferA = a();
                if (metadataInputBufferA != null) {
                    long j = metadataInputBufferA.timeUs;
                    Metadata metadataDecode = PlayerEmsgHandler.this.c.decode(metadataInputBufferA);
                    if (metadataDecode != null) {
                        EventMessage eventMessage = (EventMessage) metadataDecode.get(0);
                        if (PlayerEmsgHandler.h(eventMessage.schemeIdUri, eventMessage.value)) {
                            d(j, eventMessage);
                        }
                    }
                }
            }
            this.a.discardToRead();
        }

        private void d(long eventTimeUs, EventMessage eventMessage) {
            long jF = PlayerEmsgHandler.f(eventMessage);
            if (jF == C.TIME_UNSET) {
                return;
            }
            b(eventTimeUs, jF);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void format(Format format) {
            this.a.format(format);
        }

        public boolean maybeRefreshManifestBeforeLoadingNextChunk(long presentationPositionUs) {
            return PlayerEmsgHandler.this.j(presentationPositionUs);
        }

        public void onChunkLoadCompleted(Chunk chunk) {
            long j = this.d;
            if (j == C.TIME_UNSET || chunk.endTimeUs > j) {
                this.d = chunk.endTimeUs;
            }
            PlayerEmsgHandler.this.l(chunk);
        }

        public boolean onChunkLoadError(Chunk chunk) {
            long j = this.d;
            return PlayerEmsgHandler.this.m(j != C.TIME_UNSET && j < chunk.startTimeUs);
        }

        public void release() {
            this.a.release();
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public /* synthetic */ int sampleData(DataReader dataReader, int i, boolean z) {
            return com.google.android.exoplayer2.extractor.b.a(this, dataReader, i, z);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public int sampleData(DataReader input, int length, boolean allowEndOfInput, int sampleDataPart) throws IOException {
            return this.a.sampleData(input, length, allowEndOfInput);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public /* synthetic */ void sampleData(ParsableByteArray parsableByteArray, int i) {
            com.google.android.exoplayer2.extractor.b.b(this, parsableByteArray, i);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleMetadata(long timeUs, int flags, int size, int offset, @Nullable TrackOutput.CryptoData cryptoData) {
            this.a.sampleMetadata(timeUs, flags, size, offset, cryptoData);
            c();
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleData(ParsableByteArray data, int length, int sampleDataPart) {
            this.a.sampleData(data, length);
        }
    }

    public static final class a {
        public final long a;
        public final long b;

        public a(long eventTimeUs, long manifestPublishTimeMsInEmsg) {
            this.a = eventTimeUs;
            this.b = manifestPublishTimeMsInEmsg;
        }
    }

    public PlayerEmsgHandler(DashManifest manifest, PlayerEmsgCallback playerEmsgCallback, Allocator allocator) {
        this.f = manifest;
        this.b = playerEmsgCallback;
        this.a = allocator;
    }

    @Nullable
    private Map.Entry<Long, Long> e(long publishTimeMs) {
        return this.e.ceilingEntry(Long.valueOf(publishTimeMs));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long f(EventMessage eventMessage) {
        try {
            return Util.parseXsDateTime(Util.fromUtf8Bytes(eventMessage.messageData));
        } catch (ParserException unused) {
            return C.TIME_UNSET;
        }
    }

    private void g(long eventTimeUs, long manifestPublishTimeMsInEmsg) {
        Long l = this.e.get(Long.valueOf(manifestPublishTimeMsInEmsg));
        if (l == null) {
            this.e.put(Long.valueOf(manifestPublishTimeMsInEmsg), Long.valueOf(eventTimeUs));
        } else if (l.longValue() > eventTimeUs) {
            this.e.put(Long.valueOf(manifestPublishTimeMsInEmsg), Long.valueOf(eventTimeUs));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean h(String schemeIdUri, String value) {
        return "urn:mpeg:dash:event:2012".equals(schemeIdUri) && ("1".equals(value) || "2".equals(value) || "3".equals(value));
    }

    private void i() {
        if (this.h) {
            this.i = true;
            this.h = false;
            this.b.onDashManifestRefreshRequested();
        }
    }

    private void k() {
        this.b.onDashManifestPublishTimeExpired(this.g);
    }

    private void n() {
        Iterator<Map.Entry<Long, Long>> it2 = this.e.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getKey().longValue() < this.f.publishTimeMs) {
                it2.remove();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.j) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        g(aVar.a, aVar.b);
        return true;
    }

    public boolean j(long presentationPositionUs) {
        DashManifest dashManifest = this.f;
        boolean z = false;
        if (!dashManifest.dynamic) {
            return false;
        }
        if (this.i) {
            return true;
        }
        Map.Entry<Long, Long> entryE = e(dashManifest.publishTimeMs);
        if (entryE != null && entryE.getValue().longValue() < presentationPositionUs) {
            this.g = entryE.getKey().longValue();
            k();
            z = true;
        }
        if (z) {
            i();
        }
        return z;
    }

    public void l(Chunk chunk) {
        this.h = true;
    }

    public boolean m(boolean isForwardSeek) {
        if (!this.f.dynamic) {
            return false;
        }
        if (this.i) {
            return true;
        }
        if (!isForwardSeek) {
            return false;
        }
        i();
        return true;
    }

    public PlayerTrackEmsgHandler newPlayerTrackEmsgHandler() {
        return new PlayerTrackEmsgHandler(this.a);
    }

    public void release() {
        this.j = true;
        this.d.removeCallbacksAndMessages(null);
    }

    public void updateManifest(DashManifest newManifest) {
        this.i = false;
        this.g = C.TIME_UNSET;
        this.f = newManifest;
        n();
    }
}
