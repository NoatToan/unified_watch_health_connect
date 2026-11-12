package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class Ac4Util {
    public static final int AC40_SYNCWORD = 44096;
    public static final int AC41_SYNCWORD = 44097;
    private static final int CHANNEL_COUNT_2 = 2;
    public static final int HEADER_SIZE_FOR_PARSER = 16;
    public static final int MAX_RATE_BYTES_PER_SECOND = 336000;
    private static final int[] SAMPLE_COUNT = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
    public static final int SAMPLE_HEADER_SIZE = 7;

    public static final class SyncFrameInfo {
        public final int bitstreamVersion;
        public final int channelCount;
        public final int frameSize;
        public final int sampleCount;
        public final int sampleRate;

        private SyncFrameInfo(int i14, int i15, int i16, int i17, int i18) {
            this.bitstreamVersion = i14;
            this.channelCount = i15;
            this.sampleRate = i16;
            this.frameSize = i17;
            this.sampleCount = i18;
        }
    }

    private Ac4Util() {
    }

    public static void getAc4SampleHeader(int i14, ParsableByteArray parsableByteArray) {
        parsableByteArray.reset(7);
        byte[] data = parsableByteArray.getData();
        data[0] = -84;
        data[1] = SignedBytes.MAX_POWER_OF_TWO;
        data[2] = -1;
        data[3] = -1;
        data[4] = (byte) ((i14 >> 16) & 255);
        data[5] = (byte) ((i14 >> 8) & 255);
        data[6] = (byte) (i14 & 255);
    }

    public static Format parseAc4AnnexEFormat(ParsableByteArray parsableByteArray, String str, String str2, DrmInitData drmInitData) {
        parsableByteArray.skipBytes(1);
        return new Format.Builder().setId(str).setSampleMimeType(MimeTypes.AUDIO_AC4).setChannelCount(2).setSampleRate(((parsableByteArray.readUnsignedByte() & 32) >> 5) == 1 ? OpusUtil.SAMPLE_RATE : 44100).setDrmInitData(drmInitData).setLanguage(str2).build();
    }

    public static int parseAc4SyncframeAudioSampleCount(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return parseAc4SyncframeInfo(new ParsableBitArray(bArr)).sampleCount;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093  */
    public static SyncFrameInfo parseAc4SyncframeInfo(ParsableBitArray parsableBitArray) {
        int i14;
        int i15;
        int i16;
        int bits = parsableBitArray.readBits(16);
        int bits2 = parsableBitArray.readBits(16);
        if (bits2 == 65535) {
            bits2 = parsableBitArray.readBits(24);
            i14 = 7;
        } else {
            i14 = 4;
        }
        int i17 = bits2 + i14;
        if (bits == 44097) {
            i17 += 2;
        }
        int i18 = i17;
        int bits3 = parsableBitArray.readBits(2);
        if (bits3 == 3) {
            bits3 += readVariableBits(parsableBitArray, 2);
        }
        int i19 = bits3;
        int bits4 = parsableBitArray.readBits(10);
        if (parsableBitArray.readBit() && parsableBitArray.readBits(3) > 0) {
            parsableBitArray.skipBits(2);
        }
        boolean bit = parsableBitArray.readBit();
        int i24 = OpusUtil.SAMPLE_RATE;
        if (!bit) {
            i24 = 44100;
        }
        int bits5 = parsableBitArray.readBits(4);
        if (i24 != 44100 || bits5 != 13) {
            if (i24 == 48000) {
                int[] iArr = SAMPLE_COUNT;
                if (bits5 < iArr.length) {
                    int i25 = iArr[bits5];
                    int i26 = bits4 % 5;
                    if (i26 == 1) {
                        if (bits5 != 3 || bits5 == 8) {
                            i15 = i25 + 1;
                        } else {
                            i16 = i25;
                        }
                    } else if (i26 != 2) {
                        if (i26 == 3) {
                            if (bits5 != 3) {
                            }
                            i15 = i25 + 1;
                        } else if (i26 == 4 && (bits5 == 3 || bits5 == 8 || bits5 == 11)) {
                            i15 = i25 + 1;
                        } else {
                            i16 = i25;
                        }
                    } else if (bits5 == 8 || bits5 == 11) {
                        i15 = i25 + 1;
                    } else {
                        i16 = i25;
                    }
                } else {
                    i15 = 0;
                }
            } else {
                i15 = 0;
            }
            return new SyncFrameInfo(i19, 2, i24, i18, i16);
        }
        i15 = SAMPLE_COUNT[bits5];
        i16 = i15;
        return new SyncFrameInfo(i19, 2, i24, i18, i16);
    }

    public static int parseAc4SyncframeSize(byte[] bArr, int i14) {
        int i15 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i16 = ((bArr[2] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[3] & UnsignedBytes.MAX_VALUE);
        if (i16 == 65535) {
            i16 = ((bArr[4] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[5] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[6] & UnsignedBytes.MAX_VALUE);
        } else {
            i15 = 4;
        }
        if (i14 == 44097) {
            i15 += 2;
        }
        return i16 + i15;
    }

    private static int readVariableBits(ParsableBitArray parsableBitArray, int i14) {
        int i15 = 0;
        while (true) {
            int bits = parsableBitArray.readBits(i14) + i15;
            if (!parsableBitArray.readBit()) {
                return bits;
            }
            i15 = (bits + 1) << i14;
        }
    }
}
