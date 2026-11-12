package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class RtpDataLoadable implements Loader.Loadable {
    public final int a;
    public final m b;
    private final EventListener c;
    private final ExtractorOutput d;
    private final RtpDataChannel.Factory f;
    private b g;
    private volatile boolean h;
    private volatile long j;
    private final Handler e = Util.createHandlerForCurrentLooper();
    private volatile long i = C.TIME_UNSET;

    public interface EventListener {
        void onTransportReady(String transport, RtpDataChannel rtpDataChannel);
    }

    public RtpDataLoadable(int trackId, m rtspMediaTrack, EventListener eventListener, ExtractorOutput output, RtpDataChannel.Factory rtpDataChannelFactory) {
        this.a = trackId;
        this.b = rtspMediaTrack;
        this.c = eventListener;
        this.d = output;
        this.f = rtpDataChannelFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str, RtpDataChannel rtpDataChannel) {
        this.c.onTransportReady(str, rtpDataChannel);
    }

    public void c() {
        ((b) Assertions.checkNotNull(this.g)).c();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public void cancelLoad() {
        this.h = true;
    }

    public void d(long positionUs, long nextRtpTimestamp) {
        this.i = positionUs;
        this.j = nextRtpTimestamp;
    }

    public void e(int sequenceNumber) {
        if (((b) Assertions.checkNotNull(this.g)).b()) {
            return;
        }
        this.g.d(sequenceNumber);
    }

    public void f(long timestamp) {
        if (timestamp == C.TIME_UNSET || ((b) Assertions.checkNotNull(this.g)).b()) {
            return;
        }
        this.g.e(timestamp);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public void load() throws IOException {
        final RtpDataChannel rtpDataChannelCreateAndOpenDataChannel = null;
        try {
            rtpDataChannelCreateAndOpenDataChannel = this.f.createAndOpenDataChannel(this.a);
            final String strA = rtpDataChannelCreateAndOpenDataChannel.a();
            this.e.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b(strA, rtpDataChannelCreateAndOpenDataChannel);
                }
            });
            DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput((DataReader) Assertions.checkNotNull(rtpDataChannelCreateAndOpenDataChannel), 0L, -1L);
            b bVar = new b(this.b.a, this.a);
            this.g = bVar;
            bVar.init(this.d);
            while (!this.h) {
                if (this.i != C.TIME_UNSET) {
                    this.g.seek(this.j, this.i);
                    this.i = C.TIME_UNSET;
                }
                if (this.g.read(defaultExtractorInput, new PositionHolder()) == -1) {
                    break;
                }
            }
        } finally {
            Util.closeQuietly(rtpDataChannelCreateAndOpenDataChannel);
        }
    }
}
