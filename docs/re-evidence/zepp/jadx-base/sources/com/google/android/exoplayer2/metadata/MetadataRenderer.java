package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.q0;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class MetadataRenderer extends BaseRenderer implements Handler.Callback {
    private static final String w = "MetadataRenderer";
    private static final int x = 0;
    private final MetadataDecoderFactory m;
    private final MetadataOutput n;

    @Nullable
    private final Handler o;
    private final MetadataInputBuffer p;

    @Nullable
    private MetadataDecoder q;
    private boolean r;
    private boolean s;
    private long t;
    private long u;

    @Nullable
    private Metadata v;

    public MetadataRenderer(MetadataOutput output, @Nullable Looper outputLooper) {
        this(output, outputLooper, MetadataDecoderFactory.DEFAULT);
    }

    private void a(Metadata metadata, List<Metadata.Entry> decodedEntries) {
        for (int i = 0; i < metadata.length(); i++) {
            Format wrappedMetadataFormat = metadata.get(i).getWrappedMetadataFormat();
            if (wrappedMetadataFormat == null || !this.m.supportsFormat(wrappedMetadataFormat)) {
                decodedEntries.add(metadata.get(i));
            } else {
                MetadataDecoder metadataDecoderCreateDecoder = this.m.createDecoder(wrappedMetadataFormat);
                byte[] bArr = (byte[]) Assertions.checkNotNull(metadata.get(i).getWrappedMetadataBytes());
                this.p.clear();
                this.p.ensureSpaceForWrite(bArr.length);
                ((ByteBuffer) Util.castNonNull(this.p.data)).put(bArr);
                this.p.flip();
                Metadata metadataDecode = metadataDecoderCreateDecoder.decode(this.p);
                if (metadataDecode != null) {
                    a(metadataDecode, decodedEntries);
                }
            }
        }
    }

    private void b(Metadata metadata) {
        Handler handler = this.o;
        if (handler != null) {
            handler.obtainMessage(0, metadata).sendToTarget();
        } else {
            c(metadata);
        }
    }

    private void c(Metadata metadata) {
        this.n.onMetadata(metadata);
    }

    private boolean d(long positionUs) {
        boolean z;
        Metadata metadata = this.v;
        if (metadata == null || this.u > positionUs) {
            z = false;
        } else {
            b(metadata);
            this.v = null;
            this.u = C.TIME_UNSET;
            z = true;
        }
        if (this.r && this.v == null) {
            this.s = true;
        }
        return z;
    }

    private void e() {
        if (this.r || this.v != null) {
            return;
        }
        this.p.clear();
        FormatHolder formatHolder = getFormatHolder();
        int source = readSource(formatHolder, this.p, 0);
        if (source != -4) {
            if (source == -5) {
                this.t = ((Format) Assertions.checkNotNull(formatHolder.format)).subsampleOffsetUs;
                return;
            }
            return;
        }
        if (this.p.isEndOfStream()) {
            this.r = true;
            return;
        }
        MetadataInputBuffer metadataInputBuffer = this.p;
        metadataInputBuffer.subsampleOffsetUs = this.t;
        metadataInputBuffer.flip();
        Metadata metadataDecode = ((MetadataDecoder) Util.castNonNull(this.q)).decode(this.p);
        if (metadataDecode != null) {
            ArrayList arrayList = new ArrayList(metadataDecode.length());
            a(metadataDecode, arrayList);
            if (arrayList.isEmpty()) {
                return;
            }
            this.v = new Metadata(arrayList);
            this.u = this.p.timeUs;
        }
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public String getName() {
        return w;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message msg) {
        if (msg.what != 0) {
            throw new IllegalStateException();
        }
        c((Metadata) msg.obj);
        return true;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
        return this.s;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onDisabled() {
        this.v = null;
        this.u = C.TIME_UNSET;
        this.q = null;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onPositionReset(long positionUs, boolean joining) {
        this.v = null;
        this.u = C.TIME_UNSET;
        this.r = false;
        this.s = false;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onStreamChanged(Format[] formats, long startPositionUs, long offsetUs) {
        this.q = this.m.createDecoder(formats[0]);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public void render(long positionUs, long elapsedRealtimeUs) {
        boolean zD = true;
        while (zD) {
            e();
            zD = d(positionUs);
        }
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public int supportsFormat(Format format) {
        if (this.m.supportsFormat(format)) {
            return q0.a(format.exoMediaCryptoType == null ? 4 : 2);
        }
        return q0.a(0);
    }

    public MetadataRenderer(MetadataOutput output, @Nullable Looper outputLooper, MetadataDecoderFactory decoderFactory) {
        super(5);
        this.n = (MetadataOutput) Assertions.checkNotNull(output);
        this.o = outputLooper == null ? null : Util.createHandler(outputLooper, this);
        this.m = (MetadataDecoderFactory) Assertions.checkNotNull(decoderFactory);
        this.p = new MetadataInputBuffer();
        this.u = C.TIME_UNSET;
    }
}
