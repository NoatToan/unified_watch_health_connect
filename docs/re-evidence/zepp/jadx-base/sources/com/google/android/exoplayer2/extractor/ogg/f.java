package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes2.dex */
final class f extends g {
    private static final int s = 1332770163;
    private static final byte[] t = {79, 112, 117, 115, 72, 101, 97, 100};
    private boolean r;

    private long n(byte[] packet) {
        int i;
        int i2 = packet[0] & 255;
        int i3 = i2 & 3;
        int i4 = 2;
        if (i3 == 0) {
            i4 = 1;
        } else if (i3 != 1 && i3 != 2) {
            i4 = packet[1] & HMProSyncDataBaseProfile.DATA_TYPE_ACTIVITY_TODAY;
        }
        int i5 = i2 >> 3;
        int i6 = i5 & 3;
        if (i5 >= 16) {
            i = 2500 << i6;
        } else if (i5 >= 12) {
            i = 10000 << (i6 & 1);
        } else {
            i = i6 == 3 ? 60000 : 10000 << i6;
        }
        return ((long) i4) * ((long) i);
    }

    public static boolean o(ParsableByteArray data) {
        int iBytesLeft = data.bytesLeft();
        byte[] bArr = t;
        if (iBytesLeft < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        data.readBytes(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.g
    public long f(ParsableByteArray packet) {
        return c(n(packet.getData()));
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.g
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public boolean i(ParsableByteArray packet, long position, g.b setupData) {
        if (this.r) {
            Assertions.checkNotNull(setupData.a);
            boolean z = packet.readInt() == 1332770163;
            packet.setPosition(0);
            return z;
        }
        byte[] bArrCopyOf = Arrays.copyOf(packet.getData(), packet.limit());
        setupData.a = new Format.Builder().setSampleMimeType(MimeTypes.AUDIO_OPUS).setChannelCount(OpusUtil.getChannelCount(bArrCopyOf)).setSampleRate(OpusUtil.SAMPLE_RATE).setInitializationData(OpusUtil.buildInitializationData(bArrCopyOf)).build();
        this.r = true;
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.g
    public void l(boolean headerData) {
        super.l(headerData);
        if (headerData) {
            this.r = false;
        }
    }
}
