package com.google.android.exoplayer2.extractor.ogg;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.VorbisUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes2.dex */
final class h extends g {

    @Nullable
    private a r;
    private int s;
    private boolean t;

    @Nullable
    private VorbisUtil.VorbisIdHeader u;

    @Nullable
    private VorbisUtil.CommentHeader v;

    public static final class a {
        public final VorbisUtil.VorbisIdHeader a;
        public final VorbisUtil.CommentHeader b;
        public final byte[] c;
        public final VorbisUtil.Mode[] d;
        public final int e;

        public a(VorbisUtil.VorbisIdHeader idHeader, VorbisUtil.CommentHeader commentHeader, byte[] setupHeaderData, VorbisUtil.Mode[] modes, int iLogModes) {
            this.a = idHeader;
            this.b = commentHeader;
            this.c = setupHeaderData;
            this.d = modes;
            this.e = iLogModes;
        }
    }

    @VisibleForTesting
    public static void n(ParsableByteArray buffer, long packetSampleCount) {
        if (buffer.capacity() < buffer.limit() + 4) {
            buffer.reset(Arrays.copyOf(buffer.getData(), buffer.limit() + 4));
        } else {
            buffer.setLimit(buffer.limit() + 4);
        }
        byte[] data = buffer.getData();
        data[buffer.limit() - 4] = (byte) (packetSampleCount & 255);
        data[buffer.limit() - 3] = (byte) ((packetSampleCount >>> 8) & 255);
        data[buffer.limit() - 2] = (byte) ((packetSampleCount >>> 16) & 255);
        data[buffer.limit() - 1] = (byte) ((packetSampleCount >>> 24) & 255);
    }

    private static int o(byte firstByteOfAudioPacket, a vorbisSetup) {
        return !vorbisSetup.d[p(firstByteOfAudioPacket, vorbisSetup.e, 1)].blockFlag ? vorbisSetup.a.blockSize0 : vorbisSetup.a.blockSize1;
    }

    @VisibleForTesting
    public static int p(byte src, int length, int leastSignificantBitIndex) {
        return (src >> leastSignificantBitIndex) & (255 >>> (8 - length));
    }

    public static boolean r(ParsableByteArray data) {
        try {
            return VorbisUtil.verifyVorbisHeaderCapturePattern(1, data, true);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.g
    public void e(long currentGranule) {
        super.e(currentGranule);
        this.t = currentGranule != 0;
        VorbisUtil.VorbisIdHeader vorbisIdHeader = this.u;
        this.s = vorbisIdHeader != null ? vorbisIdHeader.blockSize0 : 0;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.g
    public long f(ParsableByteArray packet) {
        if ((packet.getData()[0] & 1) == 1) {
            return -1L;
        }
        int iO = o(packet.getData()[0], (a) Assertions.checkStateNotNull(this.r));
        long j = this.t ? (this.s + iO) / 4 : 0;
        n(packet, j);
        this.t = true;
        this.s = iO;
        return j;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.g
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public boolean i(ParsableByteArray packet, long position, g.b setupData) throws IOException {
        if (this.r != null) {
            Assertions.checkNotNull(setupData.a);
            return false;
        }
        a aVarQ = q(packet);
        this.r = aVarQ;
        if (aVarQ == null) {
            return true;
        }
        VorbisUtil.VorbisIdHeader vorbisIdHeader = aVarQ.a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(vorbisIdHeader.data);
        arrayList.add(aVarQ.c);
        setupData.a = new Format.Builder().setSampleMimeType(MimeTypes.AUDIO_VORBIS).setAverageBitrate(vorbisIdHeader.bitrateNominal).setPeakBitrate(vorbisIdHeader.bitrateMaximum).setChannelCount(vorbisIdHeader.channels).setSampleRate(vorbisIdHeader.sampleRate).setInitializationData(arrayList).build();
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.g
    public void l(boolean headerData) {
        super.l(headerData);
        if (headerData) {
            this.r = null;
            this.u = null;
            this.v = null;
        }
        this.s = 0;
        this.t = false;
    }

    @Nullable
    @VisibleForTesting
    public a q(ParsableByteArray scratch) throws IOException {
        VorbisUtil.VorbisIdHeader vorbisIdHeader = this.u;
        if (vorbisIdHeader == null) {
            this.u = VorbisUtil.readVorbisIdentificationHeader(scratch);
            return null;
        }
        VorbisUtil.CommentHeader commentHeader = this.v;
        if (commentHeader == null) {
            this.v = VorbisUtil.readVorbisCommentHeader(scratch);
            return null;
        }
        byte[] bArr = new byte[scratch.limit()];
        System.arraycopy(scratch.getData(), 0, bArr, 0, scratch.limit());
        VorbisUtil.Mode[] vorbisModes = VorbisUtil.readVorbisModes(scratch, vorbisIdHeader.channels);
        return new a(vorbisIdHeader, commentHeader, bArr, vorbisModes, VorbisUtil.iLog(vorbisModes.length - 1));
    }
}
