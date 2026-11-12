package com.google.android.exoplayer2.text;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.q0;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class TextRenderer extends BaseRenderer implements Handler.Callback {
    private static final String B = "TextRenderer";
    private static final int C = 0;
    private static final int D = 1;
    private static final int E = 2;
    private static final int F = 0;
    private long A;

    @Nullable
    private final Handler m;
    private final TextOutput n;
    private final SubtitleDecoderFactory o;
    private final FormatHolder p;
    private boolean q;
    private boolean r;
    private boolean s;
    private int t;

    @Nullable
    private Format u;

    @Nullable
    private SubtitleDecoder v;

    @Nullable
    private SubtitleInputBuffer w;

    @Nullable
    private SubtitleOutputBuffer x;

    @Nullable
    private SubtitleOutputBuffer y;
    private int z;

    public TextRenderer(TextOutput output, @Nullable Looper outputLooper) {
        this(output, outputLooper, SubtitleDecoderFactory.DEFAULT);
    }

    private void a() {
        h(Collections.emptyList());
    }

    private long b() {
        if (this.z == -1) {
            return Long.MAX_VALUE;
        }
        Assertions.checkNotNull(this.x);
        if (this.z >= this.x.getEventTimeCount()) {
            return Long.MAX_VALUE;
        }
        return this.x.getEventTime(this.z);
    }

    private void c(SubtitleDecoderException e) {
        String strValueOf = String.valueOf(this.u);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 39);
        sb.append("Subtitle decoding failed. streamFormat=");
        sb.append(strValueOf);
        Log.e(B, sb.toString(), e);
        a();
        g();
    }

    private void d() {
        this.s = true;
        this.v = this.o.createDecoder((Format) Assertions.checkNotNull(this.u));
    }

    private void e(List<Cue> cues) {
        this.n.onCues(cues);
    }

    private void f() {
        this.w = null;
        this.z = -1;
        SubtitleOutputBuffer subtitleOutputBuffer = this.x;
        if (subtitleOutputBuffer != null) {
            subtitleOutputBuffer.release();
            this.x = null;
        }
        SubtitleOutputBuffer subtitleOutputBuffer2 = this.y;
        if (subtitleOutputBuffer2 != null) {
            subtitleOutputBuffer2.release();
            this.y = null;
        }
    }

    private void g() {
        releaseDecoder();
        d();
    }

    private void h(List<Cue> cues) {
        Handler handler = this.m;
        if (handler != null) {
            handler.obtainMessage(0, cues).sendToTarget();
        } else {
            e(cues);
        }
    }

    private void releaseDecoder() {
        f();
        ((SubtitleDecoder) Assertions.checkNotNull(this.v)).release();
        this.v = null;
        this.t = 0;
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public String getName() {
        return B;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message msg) {
        if (msg.what != 0) {
            throw new IllegalStateException();
        }
        e((List) msg.obj);
        return true;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
        return this.r;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onDisabled() {
        this.u = null;
        this.A = C.TIME_UNSET;
        a();
        releaseDecoder();
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onPositionReset(long positionUs, boolean joining) {
        a();
        this.q = false;
        this.r = false;
        this.A = C.TIME_UNSET;
        if (this.t != 0) {
            g();
        } else {
            f();
            ((SubtitleDecoder) Assertions.checkNotNull(this.v)).flush();
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onStreamChanged(Format[] formats, long startPositionUs, long offsetUs) {
        this.u = formats[0];
        if (this.v != null) {
            this.t = 1;
        } else {
            d();
        }
    }

    @Override // com.google.android.exoplayer2.Renderer
    public void render(long positionUs, long elapsedRealtimeUs) throws DecoderException {
        boolean z;
        if (isCurrentStreamFinal()) {
            long j = this.A;
            if (j != C.TIME_UNSET && positionUs >= j) {
                f();
                this.r = true;
            }
        }
        if (this.r) {
            return;
        }
        if (this.y == null) {
            ((SubtitleDecoder) Assertions.checkNotNull(this.v)).setPositionUs(positionUs);
            try {
                this.y = ((SubtitleDecoder) Assertions.checkNotNull(this.v)).dequeueOutputBuffer();
            } catch (SubtitleDecoderException e) {
                c(e);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.x != null) {
            long jB = b();
            z = false;
            while (jB <= positionUs) {
                this.z++;
                jB = b();
                z = true;
            }
        } else {
            z = false;
        }
        SubtitleOutputBuffer subtitleOutputBuffer = this.y;
        if (subtitleOutputBuffer != null) {
            if (subtitleOutputBuffer.isEndOfStream()) {
                if (!z && b() == Long.MAX_VALUE) {
                    if (this.t == 2) {
                        g();
                    } else {
                        f();
                        this.r = true;
                    }
                }
            } else if (subtitleOutputBuffer.timeUs <= positionUs) {
                SubtitleOutputBuffer subtitleOutputBuffer2 = this.x;
                if (subtitleOutputBuffer2 != null) {
                    subtitleOutputBuffer2.release();
                }
                this.z = subtitleOutputBuffer.getNextEventTimeIndex(positionUs);
                this.x = subtitleOutputBuffer;
                this.y = null;
                z = true;
            }
        }
        if (z) {
            Assertions.checkNotNull(this.x);
            h(this.x.getCues(positionUs));
        }
        if (this.t == 2) {
            return;
        }
        while (!this.q) {
            try {
                SubtitleInputBuffer subtitleInputBufferDequeueInputBuffer = this.w;
                if (subtitleInputBufferDequeueInputBuffer == null) {
                    subtitleInputBufferDequeueInputBuffer = ((SubtitleDecoder) Assertions.checkNotNull(this.v)).dequeueInputBuffer();
                    if (subtitleInputBufferDequeueInputBuffer == null) {
                        return;
                    } else {
                        this.w = subtitleInputBufferDequeueInputBuffer;
                    }
                }
                if (this.t == 1) {
                    subtitleInputBufferDequeueInputBuffer.setFlags(4);
                    ((SubtitleDecoder) Assertions.checkNotNull(this.v)).queueInputBuffer(subtitleInputBufferDequeueInputBuffer);
                    this.w = null;
                    this.t = 2;
                    return;
                }
                int source = readSource(this.p, subtitleInputBufferDequeueInputBuffer, 0);
                if (source == -4) {
                    if (subtitleInputBufferDequeueInputBuffer.isEndOfStream()) {
                        this.q = true;
                        this.s = false;
                    } else {
                        Format format = this.p.format;
                        if (format == null) {
                            return;
                        }
                        subtitleInputBufferDequeueInputBuffer.subsampleOffsetUs = format.subsampleOffsetUs;
                        subtitleInputBufferDequeueInputBuffer.flip();
                        this.s &= !subtitleInputBufferDequeueInputBuffer.isKeyFrame();
                    }
                    if (!this.s) {
                        ((SubtitleDecoder) Assertions.checkNotNull(this.v)).queueInputBuffer(subtitleInputBufferDequeueInputBuffer);
                        this.w = null;
                    }
                } else if (source == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e2) {
                c(e2);
                return;
            }
        }
    }

    public void setFinalStreamEndPositionUs(long streamEndPositionUs) {
        Assertions.checkState(isCurrentStreamFinal());
        this.A = streamEndPositionUs;
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public int supportsFormat(Format format) {
        if (this.o.supportsFormat(format)) {
            return q0.a(format.exoMediaCryptoType == null ? 4 : 2);
        }
        return MimeTypes.isText(format.sampleMimeType) ? q0.a(1) : q0.a(0);
    }

    public TextRenderer(TextOutput output, @Nullable Looper outputLooper, SubtitleDecoderFactory decoderFactory) {
        super(3);
        this.n = (TextOutput) Assertions.checkNotNull(output);
        this.m = outputLooper == null ? null : Util.createHandler(outputLooper, this);
        this.o = decoderFactory;
        this.p = new FormatHolder();
        this.A = C.TIME_UNSET;
    }
}
