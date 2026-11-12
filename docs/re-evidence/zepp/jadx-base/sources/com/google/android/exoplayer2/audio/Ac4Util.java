package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class Ac4Util {
    public static final int AC40_SYNCWORD = 44096;
    public static final int AC41_SYNCWORD = 44097;
    public static final int HEADER_SIZE_FOR_PARSER = 16;
    public static final int MAX_RATE_BYTES_PER_SECOND = 336000;
    public static final int SAMPLE_HEADER_SIZE = 7;
    private static final int a = 2;
    private static final int[] b = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    public static final class SyncFrameInfo {
        public final int bitstreamVersion;
        public final int channelCount;
        public final int frameSize;
        public final int sampleCount;
        public final int sampleRate;

        private SyncFrameInfo(int bitstreamVersion, int channelCount, int sampleRate, int frameSize, int sampleCount) {
            this.bitstreamVersion = bitstreamVersion;
            this.channelCount = channelCount;
            this.sampleRate = sampleRate;
            this.frameSize = frameSize;
            this.sampleCount = sampleCount;
        }
    }

    private Ac4Util() {
    }

    private static int a(ParsableBitArray data, int bitsPerRead) {
        int i = 0;
        while (true) {
            int bits = i + data.readBits(bitsPerRead);
            if (!data.readBit()) {
                return bits;
            }
            i = (bits + 1) << bitsPerRead;
        }
    }

    public static void getAc4SampleHeader(int size, ParsableByteArray buffer) {
        buffer.reset(7);
        byte[] data = buffer.getData();
        data[0] = -84;
        data[1] = 64;
        data[2] = -1;
        data[3] = -1;
        data[4] = (byte) ((size >> 16) & 255);
        data[5] = (byte) ((size >> 8) & 255);
        data[6] = (byte) (size & 255);
    }

    public static Format parseAc4AnnexEFormat(ParsableByteArray data, String trackId, String language, @Nullable DrmInitData drmInitData) {
        data.skipBytes(1);
        return new Format.Builder().setId(trackId).setSampleMimeType(MimeTypes.AUDIO_AC4).setChannelCount(2).setSampleRate(((data.readUnsignedByte() & 32) >> 5) == 1 ? OpusUtil.SAMPLE_RATE : 44100).setDrmInitData(drmInitData).setLanguage(language).build();
    }

    public static int parseAc4SyncframeAudioSampleCount(ByteBuffer buffer) {
        byte[] bArr = new byte[16];
        int iPosition = buffer.position();
        buffer.get(bArr);
        buffer.position(iPosition);
        return parseAc4SyncframeInfo(new ParsableBitArray(bArr)).sampleCount;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    public static SyncFrameInfo parseAc4SyncframeInfo(ParsableBitArray data) {
        int i;
        int i2;
        int bits = data.readBits(16);
        int bits2 = data.readBits(16);
        if (bits2 == 65535) {
            bits2 = data.readBits(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = bits2 + i;
        if (bits == 44097) {
            i3 += 2;
        }
        int i4 = i3;
        int bits3 = data.readBits(2);
        if (bits3 == 3) {
            bits3 += a(data, 2);
        }
        int i5 = bits3;
        int bits4 = data.readBits(10);
        if (data.readBit() && data.readBits(3) > 0) {
            data.skipBits(2);
        }
        int i6 = data.readBit() ? OpusUtil.SAMPLE_RATE : 44100;
        int bits5 = data.readBits(4);
        if (i6 == 44100 && bits5 == 13) {
            i2 = b[bits5];
        } else if (i6 == 48000) {
            int[] iArr = b;
            if (bits5 < iArr.length) {
                int i7 = iArr[bits5];
                int i8 = bits4 % 5;
                if (i8 == 1) {
                    if (bits5 != 3 || bits5 == 8) {
                        i7++;
                    }
                } else if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 == 4 && (bits5 == 3 || bits5 == 8 || bits5 == 11)) {
                            i7++;
                        }
                    } else if (bits5 != 3) {
                        i7++;
                    } else {
                        i7++;
                    }
                } else if (bits5 == 8 || bits5 == 11) {
                    i7++;
                }
                i2 = i7;
            } else {
                i2 = 0;
            }
        } else {
            i2 = 0;
        }
        return new SyncFrameInfo(i5, 2, i6, i4, i2);
    }

    public static int parseAc4SyncframeSize(byte[] data, int syncword) {
        int i = 7;
        if (data.length < 7) {
            return -1;
        }
        int i2 = ((data[2] & 255) << 8) | (data[3] & 255);
        if (i2 == 65535) {
            i2 = ((data[4] & 255) << 16) | ((data[5] & 255) << 8) | (data[6] & 255);
        } else {
            i = 4;
        }
        if (syncword == 44097) {
            i += 2;
        }
        return i2 + i;
    }
}
