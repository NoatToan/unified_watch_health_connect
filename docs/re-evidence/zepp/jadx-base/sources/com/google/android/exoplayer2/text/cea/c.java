package com.google.android.exoplayer2.text.cea;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.OutputBuffer;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoder;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.SubtitleInputBuffer;
import com.google.android.exoplayer2.text.SubtitleOutputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes3.dex */
abstract class c implements SubtitleDecoder {
    private static final int g = 10;
    private static final int h = 2;
    private final ArrayDeque<b> a = new ArrayDeque<>();
    private final ArrayDeque<SubtitleOutputBuffer> b;
    private final PriorityQueue<b> c;

    @Nullable
    private b d;
    private long e;
    private long f;

    public static final class b extends SubtitleInputBuffer implements Comparable<b> {
        private long d;

        private b() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(b other) {
            if (isEndOfStream() != other.isEndOfStream()) {
                return isEndOfStream() ? 1 : -1;
            }
            long j = this.timeUs - other.timeUs;
            if (j == 0) {
                j = this.d - other.d;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.cea.c$c, reason: collision with other inner class name */
    public static final class C0153c extends SubtitleOutputBuffer {
        private OutputBuffer.Owner<C0153c> d;

        public C0153c(OutputBuffer.Owner<C0153c> owner) {
            this.d = owner;
        }

        @Override // com.google.android.exoplayer2.decoder.OutputBuffer
        public final void release() {
            this.d.releaseOutputBuffer(this);
        }
    }

    public c() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new b());
        }
        this.b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.b.add(new C0153c(new OutputBuffer.Owner() { // from class: com.google.android.exoplayer2.text.cea.b
                @Override // com.google.android.exoplayer2.decoder.OutputBuffer.Owner
                public final void releaseOutputBuffer(OutputBuffer outputBuffer) {
                    this.a.releaseOutputBuffer((c.C0153c) outputBuffer);
                }
            }));
        }
        this.c = new PriorityQueue<>();
    }

    private void a(b inputBuffer) {
        inputBuffer.clear();
        this.a.add(inputBuffer);
    }

    public abstract Subtitle createSubtitle();

    public abstract void decode(SubtitleInputBuffer inputBuffer);

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void flush() {
        this.f = 0L;
        this.e = 0L;
        while (!this.c.isEmpty()) {
            a((b) Util.castNonNull(this.c.poll()));
        }
        b bVar = this.d;
        if (bVar != null) {
            a(bVar);
            this.d = null;
        }
    }

    @Nullable
    public final SubtitleOutputBuffer getAvailableOutputBuffer() {
        return this.b.pollFirst();
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public abstract String getName();

    public final long getPositionUs() {
        return this.e;
    }

    public abstract boolean isNewSubtitleDataAvailable();

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void release() {
    }

    public void releaseOutputBuffer(SubtitleOutputBuffer outputBuffer) {
        outputBuffer.clear();
        this.b.add(outputBuffer);
    }

    @Override // com.google.android.exoplayer2.text.SubtitleDecoder
    public void setPositionUs(long positionUs) {
        this.e = positionUs;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    public SubtitleInputBuffer dequeueInputBuffer() throws SubtitleDecoderException {
        Assertions.checkState(this.d == null);
        if (this.a.isEmpty()) {
            return null;
        }
        b bVarPollFirst = this.a.pollFirst();
        this.d = bVarPollFirst;
        return bVarPollFirst;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    public SubtitleOutputBuffer dequeueOutputBuffer() throws SubtitleDecoderException {
        if (this.b.isEmpty()) {
            return null;
        }
        while (!this.c.isEmpty() && ((b) Util.castNonNull(this.c.peek())).timeUs <= this.e) {
            b bVar = (b) Util.castNonNull(this.c.poll());
            if (bVar.isEndOfStream()) {
                SubtitleOutputBuffer subtitleOutputBuffer = (SubtitleOutputBuffer) Util.castNonNull(this.b.pollFirst());
                subtitleOutputBuffer.addFlag(4);
                a(bVar);
                return subtitleOutputBuffer;
            }
            decode(bVar);
            if (isNewSubtitleDataAvailable()) {
                Subtitle subtitleCreateSubtitle = createSubtitle();
                SubtitleOutputBuffer subtitleOutputBuffer2 = (SubtitleOutputBuffer) Util.castNonNull(this.b.pollFirst());
                subtitleOutputBuffer2.setContent(bVar.timeUs, subtitleCreateSubtitle, Long.MAX_VALUE);
                a(bVar);
                return subtitleOutputBuffer2;
            }
            a(bVar);
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void queueInputBuffer(SubtitleInputBuffer inputBuffer) throws SubtitleDecoderException {
        Assertions.checkArgument(inputBuffer == this.d);
        b bVar = (b) inputBuffer;
        if (bVar.isDecodeOnly()) {
            a(bVar);
        } else {
            long j = this.f;
            this.f = 1 + j;
            bVar.d = j;
            this.c.add(bVar);
        }
        this.d = null;
    }
}
