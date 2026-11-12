package com.google.android.exoplayer2.source;

import android.os.Looper;
import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Consumer;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class SampleQueue implements TrackOutput {

    @VisibleForTesting
    public static final int I = 1000;
    private static final String J = "SampleQueue";
    private boolean A;

    @Nullable
    private Format B;

    @Nullable
    private Format C;
    private int D;
    private boolean E;
    private boolean F;
    private long G;
    private boolean H;
    private final i a;

    @Nullable
    private final DrmSessionManager d;

    @Nullable
    private final DrmSessionEventListener.EventDispatcher e;

    @Nullable
    private final Looper f;

    @Nullable
    private UpstreamFormatChangedListener g;

    @Nullable
    private Format h;

    @Nullable
    private DrmSession i;
    private int q;
    private int r;
    private int s;
    private int t;
    private boolean x;
    private final b b = new b();
    private int j = 1000;
    private int[] k = new int[1000];
    private long[] l = new long[1000];
    private long[] o = new long[1000];
    private int[] n = new int[1000];
    private int[] m = new int[1000];
    private TrackOutput.CryptoData[] p = new TrackOutput.CryptoData[1000];
    private final m<c> c = new m<>(new Consumer() { // from class: com.google.android.exoplayer2.source.j
        @Override // com.google.android.exoplayer2.util.Consumer
        public final void accept(Object obj) {
            SampleQueue.m((SampleQueue.c) obj);
        }
    });
    private long u = Long.MIN_VALUE;
    private long v = Long.MIN_VALUE;
    private long w = Long.MIN_VALUE;
    private boolean z = true;
    private boolean y = true;

    public interface UpstreamFormatChangedListener {
        void onUpstreamFormatChanged(Format format);
    }

    public static final class b {
        public int a;
        public long b;

        @Nullable
        public TrackOutput.CryptoData c;
    }

    public static final class c {
        public final Format a;
        public final DrmSessionManager.DrmSessionReference b;

        private c(Format format, DrmSessionManager.DrmSessionReference drmSessionReference) {
            this.a = format;
            this.b = drmSessionReference;
        }
    }

    public SampleQueue(Allocator allocator, @Nullable Looper playbackLooper, @Nullable DrmSessionManager drmSessionManager, @Nullable DrmSessionEventListener.EventDispatcher drmEventDispatcher) {
        this.f = playbackLooper;
        this.d = drmSessionManager;
        this.e = drmEventDispatcher;
        this.a = new i(allocator);
    }

    private synchronized boolean b(long timeUs) {
        if (this.q == 0) {
            return timeUs > this.v;
        }
        if (getLargestReadTimestampUs() >= timeUs) {
            return false;
        }
        h(this.r + d(timeUs));
        return true;
    }

    private synchronized void c(long timeUs, int sampleFlags, long offset, int size, @Nullable TrackOutput.CryptoData cryptoData) {
        int i = this.q;
        if (i > 0) {
            int iK = k(i - 1);
            Assertions.checkArgument(this.l[iK] + ((long) this.m[iK]) <= offset);
        }
        this.x = (536870912 & sampleFlags) != 0;
        this.w = Math.max(this.w, timeUs);
        int iK2 = k(this.q);
        this.o[iK2] = timeUs;
        this.l[iK2] = offset;
        this.m[iK2] = size;
        this.n[iK2] = sampleFlags;
        this.p[iK2] = cryptoData;
        this.k[iK2] = this.D;
        if (this.c.h() || !this.c.g().a.equals(this.C)) {
            DrmSessionManager drmSessionManager = this.d;
            this.c.b(getWriteIndex(), new c((Format) Assertions.checkNotNull(this.C), drmSessionManager != null ? drmSessionManager.preacquireSession((Looper) Assertions.checkNotNull(this.f), this.e, this.C) : DrmSessionManager.DrmSessionReference.EMPTY));
        }
        int i2 = this.q + 1;
        this.q = i2;
        int i3 = this.j;
        if (i2 == i3) {
            int i4 = i3 + 1000;
            int[] iArr = new int[i4];
            long[] jArr = new long[i4];
            long[] jArr2 = new long[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            TrackOutput.CryptoData[] cryptoDataArr = new TrackOutput.CryptoData[i4];
            int i5 = this.s;
            int i6 = i3 - i5;
            System.arraycopy(this.l, i5, jArr, 0, i6);
            System.arraycopy(this.o, this.s, jArr2, 0, i6);
            System.arraycopy(this.n, this.s, iArr2, 0, i6);
            System.arraycopy(this.m, this.s, iArr3, 0, i6);
            System.arraycopy(this.p, this.s, cryptoDataArr, 0, i6);
            System.arraycopy(this.k, this.s, iArr, 0, i6);
            int i7 = this.s;
            System.arraycopy(this.l, 0, jArr, i6, i7);
            System.arraycopy(this.o, 0, jArr2, i6, i7);
            System.arraycopy(this.n, 0, iArr2, i6, i7);
            System.arraycopy(this.m, 0, iArr3, i6, i7);
            System.arraycopy(this.p, 0, cryptoDataArr, i6, i7);
            System.arraycopy(this.k, 0, iArr, i6, i7);
            this.l = jArr;
            this.o = jArr2;
            this.n = iArr2;
            this.m = iArr3;
            this.p = cryptoDataArr;
            this.k = iArr;
            this.s = 0;
            this.j = i4;
        }
    }

    public static SampleQueue createWithDrm(Allocator allocator, Looper playbackLooper, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher drmEventDispatcher) {
        return new SampleQueue(allocator, (Looper) Assertions.checkNotNull(playbackLooper), (DrmSessionManager) Assertions.checkNotNull(drmSessionManager), (DrmSessionEventListener.EventDispatcher) Assertions.checkNotNull(drmEventDispatcher));
    }

    public static SampleQueue createWithoutDrm(Allocator allocator) {
        return new SampleQueue(allocator, null, null, null);
    }

    private int d(long timeUs) {
        int i = this.q;
        int iK = k(i - 1);
        while (i > this.t && this.o[iK] >= timeUs) {
            i--;
            iK--;
            if (iK == -1) {
                iK = this.j - 1;
            }
        }
        return i;
    }

    private synchronized long e(long timeUs, boolean toKeyframe, boolean stopAtReadPosition) {
        int i;
        int i2 = this.q;
        if (i2 != 0) {
            long[] jArr = this.o;
            int i3 = this.s;
            if (timeUs >= jArr[i3]) {
                if (stopAtReadPosition && (i = this.t) != i2) {
                    i2 = i + 1;
                }
                int i4 = i(i3, i2, timeUs, toKeyframe);
                if (i4 == -1) {
                    return -1L;
                }
                return g(i4);
            }
        }
        return -1L;
    }

    private synchronized long f() {
        int i = this.q;
        if (i == 0) {
            return -1L;
        }
        return g(i);
    }

    @GuardedBy("this")
    private long g(int discardCount) {
        this.v = Math.max(this.v, j(discardCount));
        this.q -= discardCount;
        int i = this.r + discardCount;
        this.r = i;
        int i2 = this.s + discardCount;
        this.s = i2;
        int i3 = this.j;
        if (i2 >= i3) {
            this.s = i2 - i3;
        }
        int i4 = this.t - discardCount;
        this.t = i4;
        if (i4 < 0) {
            this.t = 0;
        }
        this.c.e(i);
        if (this.q != 0) {
            return this.l[this.s];
        }
        int i5 = this.s;
        if (i5 == 0) {
            i5 = this.j;
        }
        int i6 = i5 - 1;
        return this.l[i6] + ((long) this.m[i6]);
    }

    private long h(int discardFromIndex) {
        int writeIndex = getWriteIndex() - discardFromIndex;
        boolean z = false;
        Assertions.checkArgument(writeIndex >= 0 && writeIndex <= this.q - this.t);
        int i = this.q - writeIndex;
        this.q = i;
        this.w = Math.max(this.v, j(i));
        if (writeIndex == 0 && this.x) {
            z = true;
        }
        this.x = z;
        this.c.d(discardFromIndex);
        int i2 = this.q;
        if (i2 == 0) {
            return 0L;
        }
        int iK = k(i2 - 1);
        return this.l[iK] + ((long) this.m[iK]);
    }

    private int i(int relativeStartIndex, int length, long timeUs, boolean keyframe) {
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            long[] jArr = this.o;
            if (jArr[relativeStartIndex] > timeUs) {
                return i;
            }
            if (!keyframe || (this.n[relativeStartIndex] & 1) != 0) {
                if (jArr[relativeStartIndex] == timeUs) {
                    return i2;
                }
                i = i2;
            }
            relativeStartIndex++;
            if (relativeStartIndex == this.j) {
                relativeStartIndex = 0;
            }
        }
        return i;
    }

    private long j(int length) {
        long jMax = Long.MIN_VALUE;
        if (length == 0) {
            return Long.MIN_VALUE;
        }
        int iK = k(length - 1);
        for (int i = 0; i < length; i++) {
            jMax = Math.max(jMax, this.o[iK]);
            if ((this.n[iK] & 1) != 0) {
                break;
            }
            iK--;
            if (iK == -1) {
                iK = this.j - 1;
            }
        }
        return jMax;
    }

    private int k(int offset) {
        int i = this.s + offset;
        int i2 = this.j;
        return i < i2 ? i : i - i2;
    }

    private boolean l() {
        return this.t != this.q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(c cVar) {
        cVar.b.release();
    }

    private boolean n(int relativeReadIndex) {
        DrmSession drmSession = this.i;
        return drmSession == null || drmSession.getState() == 4 || ((this.n[relativeReadIndex] & 1073741824) == 0 && this.i.playClearSamplesWithoutKeys());
    }

    private void o(Format newFormat, FormatHolder outputFormatHolder) {
        Format format = this.h;
        boolean z = format == null;
        DrmInitData drmInitData = z ? null : format.drmInitData;
        this.h = newFormat;
        DrmInitData drmInitData2 = newFormat.drmInitData;
        DrmSessionManager drmSessionManager = this.d;
        outputFormatHolder.format = drmSessionManager != null ? newFormat.copyWithExoMediaCryptoType(drmSessionManager.getExoMediaCryptoType(newFormat)) : newFormat;
        outputFormatHolder.drmSession = this.i;
        if (this.d == null) {
            return;
        }
        if (z || !Util.areEqual(drmInitData, drmInitData2)) {
            DrmSession drmSession = this.i;
            DrmSession drmSessionAcquireSession = this.d.acquireSession((Looper) Assertions.checkNotNull(this.f), this.e, newFormat);
            this.i = drmSessionAcquireSession;
            outputFormatHolder.drmSession = drmSessionAcquireSession;
            if (drmSession != null) {
                drmSession.release(this.e);
            }
        }
    }

    private synchronized int p(FormatHolder formatHolder, DecoderInputBuffer buffer, boolean formatRequired, boolean loadingFinished, b extrasHolder) {
        buffer.waitingForKeys = false;
        if (!l()) {
            if (!loadingFinished && !this.x) {
                Format format = this.C;
                if (format == null || (!formatRequired && format == this.h)) {
                    return -3;
                }
                o((Format) Assertions.checkNotNull(format), formatHolder);
                return -5;
            }
            buffer.setFlags(4);
            return -4;
        }
        Format format2 = this.c.f(getReadIndex()).a;
        if (!formatRequired && format2 == this.h) {
            int iK = k(this.t);
            if (!n(iK)) {
                buffer.waitingForKeys = true;
                return -3;
            }
            buffer.setFlags(this.n[iK]);
            long j = this.o[iK];
            buffer.timeUs = j;
            if (j < this.u) {
                buffer.addFlag(Integer.MIN_VALUE);
            }
            extrasHolder.a = this.m[iK];
            extrasHolder.b = this.l[iK];
            extrasHolder.c = this.p[iK];
            return -4;
        }
        o(format2, formatHolder);
        return -5;
    }

    private void q() {
        DrmSession drmSession = this.i;
        if (drmSession != null) {
            drmSession.release(this.e);
            this.i = null;
            this.h = null;
        }
    }

    private synchronized void r() {
        this.t = 0;
        this.a.o();
    }

    private synchronized boolean s(Format format) {
        this.z = false;
        if (Util.areEqual(format, this.C)) {
            return false;
        }
        if (this.c.h() || !this.c.g().a.equals(format)) {
            this.C = format;
        } else {
            this.C = this.c.g().a;
        }
        Format format2 = this.C;
        this.E = MimeTypes.allSamplesAreSyncSamples(format2.sampleMimeType, format2.codecs);
        this.F = false;
        return true;
    }

    public synchronized long discardSampleMetadataToRead() {
        int i = this.t;
        if (i == 0) {
            return -1L;
        }
        return g(i);
    }

    public final void discardTo(long timeUs, boolean toKeyframe, boolean stopAtReadPosition) {
        this.a.b(e(timeUs, toKeyframe, stopAtReadPosition));
    }

    public final void discardToEnd() {
        this.a.b(f());
    }

    public final void discardToRead() {
        this.a.b(discardSampleMetadataToRead());
    }

    public final void discardUpstreamFrom(long timeUs) {
        if (this.q == 0) {
            return;
        }
        Assertions.checkArgument(timeUs > getLargestReadTimestampUs());
        discardUpstreamSamples(this.r + d(timeUs));
    }

    public final void discardUpstreamSamples(int discardFromIndex) {
        this.a.c(h(discardFromIndex));
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void format(Format unadjustedUpstreamFormat) {
        Format adjustedUpstreamFormat = getAdjustedUpstreamFormat(unadjustedUpstreamFormat);
        this.A = false;
        this.B = unadjustedUpstreamFormat;
        boolean zS = s(adjustedUpstreamFormat);
        UpstreamFormatChangedListener upstreamFormatChangedListener = this.g;
        if (upstreamFormatChangedListener == null || !zS) {
            return;
        }
        upstreamFormatChangedListener.onUpstreamFormatChanged(adjustedUpstreamFormat);
    }

    @CallSuper
    public Format getAdjustedUpstreamFormat(Format format) {
        return (this.G == 0 || format.subsampleOffsetUs == Long.MAX_VALUE) ? format : format.buildUpon().setSubsampleOffsetUs(format.subsampleOffsetUs + this.G).build();
    }

    public final int getFirstIndex() {
        return this.r;
    }

    public final synchronized long getFirstTimestampUs() {
        return this.q == 0 ? Long.MIN_VALUE : this.o[this.s];
    }

    public final synchronized long getLargestQueuedTimestampUs() {
        return this.w;
    }

    public final synchronized long getLargestReadTimestampUs() {
        return Math.max(this.v, j(this.t));
    }

    public final int getReadIndex() {
        return this.r + this.t;
    }

    public final synchronized int getSkipCount(long timeUs, boolean allowEndOfQueue) {
        int iK = k(this.t);
        if (l() && timeUs >= this.o[iK]) {
            if (timeUs > this.w && allowEndOfQueue) {
                return this.q - this.t;
            }
            int i = i(iK, this.q - this.t, timeUs, true);
            if (i == -1) {
                return 0;
            }
            return i;
        }
        return 0;
    }

    @Nullable
    public final synchronized Format getUpstreamFormat() {
        return this.z ? null : this.C;
    }

    public final int getWriteIndex() {
        return this.r + this.q;
    }

    public final void invalidateUpstreamFormatAdjustment() {
        this.A = true;
    }

    public final synchronized boolean isLastSampleQueued() {
        return this.x;
    }

    @CallSuper
    public synchronized boolean isReady(boolean loadingFinished) {
        Format format;
        boolean z = true;
        if (l()) {
            if (this.c.f(getReadIndex()).a != this.h) {
                return true;
            }
            return n(k(this.t));
        }
        if (!loadingFinished && !this.x && ((format = this.C) == null || format == this.h)) {
            z = false;
        }
        return z;
    }

    @CallSuper
    public void maybeThrowError() throws IOException {
        DrmSession drmSession = this.i;
        if (drmSession != null && drmSession.getState() == 1) {
            throw ((DrmSession.DrmSessionException) Assertions.checkNotNull(this.i.getError()));
        }
    }

    public final synchronized int peekSourceId() {
        return l() ? this.k[k(this.t)] : this.D;
    }

    @CallSuper
    public void preRelease() {
        discardToEnd();
        q();
    }

    @CallSuper
    public int read(FormatHolder formatHolder, DecoderInputBuffer buffer, int readFlags, boolean loadingFinished) {
        int iP = p(formatHolder, buffer, (readFlags & 2) != 0, loadingFinished, this.b);
        if (iP == -4 && !buffer.isEndOfStream()) {
            boolean z = (readFlags & 1) != 0;
            if ((readFlags & 4) == 0) {
                if (z) {
                    this.a.f(buffer, this.b);
                } else {
                    this.a.m(buffer, this.b);
                }
            }
            if (!z) {
                this.t++;
            }
        }
        return iP;
    }

    @CallSuper
    public void release() {
        reset(true);
        q();
    }

    public final void reset() {
        reset(false);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public /* synthetic */ int sampleData(DataReader dataReader, int i, boolean z) {
        return com.google.android.exoplayer2.extractor.b.a(this, dataReader, i, z);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final int sampleData(DataReader input, int length, boolean allowEndOfInput, int sampleDataPart) throws IOException {
        return this.a.p(input, length, allowEndOfInput);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public /* synthetic */ void sampleData(ParsableByteArray parsableByteArray, int i) {
        com.google.android.exoplayer2.extractor.b.b(this, parsableByteArray, i);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public void sampleMetadata(long timeUs, int flags, int size, int offset, @Nullable TrackOutput.CryptoData cryptoData) {
        int i;
        if (this.A) {
            format((Format) Assertions.checkStateNotNull(this.B));
        }
        int i2 = flags & 1;
        boolean z = i2 != 0;
        if (this.y) {
            if (!z) {
                return;
            } else {
                this.y = false;
            }
        }
        long j = this.G + timeUs;
        if (!this.E) {
            i = flags;
        } else {
            if (j < this.u) {
                return;
            }
            if (i2 == 0) {
                if (!this.F) {
                    String strValueOf = String.valueOf(this.C);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 50);
                    sb.append("Overriding unexpected non-sync sample for format: ");
                    sb.append(strValueOf);
                    Log.w(J, sb.toString());
                    this.F = true;
                }
                i = flags | 1;
            } else {
                i = flags;
            }
        }
        if (this.H) {
            if (!z || !b(j)) {
                return;
            } else {
                this.H = false;
            }
        }
        c(j, i, (this.a.e() - ((long) size)) - ((long) offset), size, cryptoData);
    }

    public final synchronized boolean seekTo(int sampleIndex) {
        r();
        int i = this.r;
        if (sampleIndex >= i && sampleIndex <= this.q + i) {
            this.u = Long.MIN_VALUE;
            this.t = sampleIndex - i;
            return true;
        }
        return false;
    }

    public final void setSampleOffsetUs(long sampleOffsetUs) {
        if (this.G != sampleOffsetUs) {
            this.G = sampleOffsetUs;
            invalidateUpstreamFormatAdjustment();
        }
    }

    public final void setStartTimeUs(long startTimeUs) {
        this.u = startTimeUs;
    }

    public final void setUpstreamFormatChangeListener(@Nullable UpstreamFormatChangedListener listener) {
        this.g = listener;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    public final synchronized void skip(int count) {
        boolean z;
        if (count >= 0) {
            try {
                if (this.t + count <= this.q) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        this.t += count;
    }

    public final void sourceId(int sourceId) {
        this.D = sourceId;
    }

    public final void splice() {
        this.H = true;
    }

    @CallSuper
    public void reset(boolean resetUpstreamFormat) {
        this.a.n();
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.y = true;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = Long.MIN_VALUE;
        this.x = false;
        this.c.c();
        if (resetUpstreamFormat) {
            this.B = null;
            this.C = null;
            this.z = true;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void sampleData(ParsableByteArray data, int length, int sampleDataPart) {
        this.a.q(data, length);
    }

    public final synchronized boolean seekTo(long timeUs, boolean allowTimeBeyondBuffer) {
        r();
        int iK = k(this.t);
        if (l() && timeUs >= this.o[iK] && (timeUs <= this.w || allowTimeBeyondBuffer)) {
            int i = i(iK, this.q - this.t, timeUs, true);
            if (i == -1) {
                return false;
            }
            this.u = timeUs;
            this.t += i;
            return true;
        }
        return false;
    }
}
