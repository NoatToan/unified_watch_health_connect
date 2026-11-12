package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.airoha.android.lib.fota.fotaState.StageEnum;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.widget.wheelview.Constant;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class Ac3Util {
    public static final int AC3_MAX_RATE_BYTES_PER_SECOND = 80000;
    public static final String E_AC3_JOC_CODEC_STRING = "ec+3";
    public static final int E_AC3_MAX_RATE_BYTES_PER_SECOND = 768000;
    public static final int TRUEHD_MAX_RATE_BYTES_PER_SECOND = 3062500;
    public static final int TRUEHD_RECHUNK_SAMPLE_COUNT = 16;
    public static final int TRUEHD_SYNCFRAME_PREFIX_LENGTH = 10;
    private static final int a = 256;
    private static final int b = 1536;
    private static final int[] c = {1, 2, 3, 6};
    private static final int[] d = {OpusUtil.SAMPLE_RATE, 44100, 32000};
    private static final int[] e = {24000, 22050, 16000};
    private static final int[] f = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, GlMapUtil.DEVICE_DISPLAY_DPI_HIGH, 384, 448, 512, StageEnum.APP_RESULT_FOTA_NV_SUCCESS, 640};
    private static final int[] h = {69, 87, 104, 121, 139, DataTypeSource.SPORT_TYPE_CHECKERS, 208, Constant.HEIGHT_MAX, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static final class SyncFrameInfo {
        public static final int STREAM_TYPE_TYPE0 = 0;
        public static final int STREAM_TYPE_TYPE1 = 1;
        public static final int STREAM_TYPE_TYPE2 = 2;
        public static final int STREAM_TYPE_UNDEFINED = -1;
        public final int channelCount;
        public final int frameSize;

        @Nullable
        public final String mimeType;
        public final int sampleCount;
        public final int sampleRate;
        public final int streamType;

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface StreamType {
        }

        private SyncFrameInfo(@Nullable String mimeType, int streamType, int channelCount, int sampleRate, int frameSize, int sampleCount) {
            this.mimeType = mimeType;
            this.streamType = streamType;
            this.channelCount = channelCount;
            this.sampleRate = sampleRate;
            this.frameSize = frameSize;
            this.sampleCount = sampleCount;
        }
    }

    private Ac3Util() {
    }

    private static int a(int fscod, int frmsizecod) {
        int i = frmsizecod / 2;
        if (fscod < 0) {
            return -1;
        }
        int[] iArr = d;
        if (fscod >= iArr.length || frmsizecod < 0) {
            return -1;
        }
        int[] iArr2 = h;
        if (i >= iArr2.length) {
            return -1;
        }
        int i2 = iArr[fscod];
        if (i2 == 44100) {
            return (iArr2[i] + (frmsizecod % 2)) * 2;
        }
        int i3 = g[i];
        return i2 == 32000 ? i3 * 6 : i3 * 4;
    }

    public static int findTrueHdSyncframeOffset(ByteBuffer buffer) {
        int iPosition = buffer.position();
        int iLimit = buffer.limit() - 10;
        for (int i = iPosition; i <= iLimit; i++) {
            if ((Util.getBigEndianInt(buffer, i + 4) & (-2)) == -126718022) {
                return i - iPosition;
            }
        }
        return -1;
    }

    public static Format parseAc3AnnexFFormat(ParsableByteArray data, String trackId, String language, @Nullable DrmInitData drmInitData) {
        int i = d[(data.readUnsignedByte() & 192) >> 6];
        int unsignedByte = data.readUnsignedByte();
        int i2 = f[(unsignedByte & 56) >> 3];
        if ((unsignedByte & 4) != 0) {
            i2++;
        }
        return new Format.Builder().setId(trackId).setSampleMimeType(MimeTypes.AUDIO_AC3).setChannelCount(i2).setSampleRate(i).setDrmInitData(drmInitData).setLanguage(language).build();
    }

    public static int parseAc3SyncframeAudioSampleCount(ByteBuffer buffer) {
        if (((buffer.get(buffer.position() + 5) & 248) >> 3) > 10) {
            return c[((buffer.get(buffer.position() + 4) & 192) >> 6) != 3 ? (buffer.get(buffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static SyncFrameInfo parseAc3SyncframeInfo(ParsableBitArray parsableBitArray) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int bits;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int position = parsableBitArray.getPosition();
        parsableBitArray.skipBits(40);
        boolean z = parsableBitArray.readBits(5) > 10;
        parsableBitArray.setPosition(position);
        int i11 = -1;
        if (z) {
            parsableBitArray.skipBits(16);
            int bits2 = parsableBitArray.readBits(2);
            if (bits2 == 0) {
                i11 = 0;
            } else if (bits2 == 1) {
                i11 = 1;
            } else if (bits2 == 2) {
                i11 = 2;
            }
            parsableBitArray.skipBits(3);
            int bits3 = (parsableBitArray.readBits(11) + 1) * 2;
            int bits4 = parsableBitArray.readBits(2);
            if (bits4 == 3) {
                i7 = e[parsableBitArray.readBits(2)];
                bits = 3;
                i6 = 6;
            } else {
                bits = parsableBitArray.readBits(2);
                i6 = c[bits];
                i7 = d[bits4];
            }
            int i12 = i6 * 256;
            int bits5 = parsableBitArray.readBits(3);
            boolean bit = parsableBitArray.readBit();
            int i13 = f[bits5] + (bit ? 1 : 0);
            parsableBitArray.skipBits(10);
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(8);
            }
            if (bits5 == 0) {
                parsableBitArray.skipBits(5);
                if (parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(8);
                }
            }
            if (i11 == 1 && parsableBitArray.readBit()) {
                parsableBitArray.skipBits(16);
            }
            if (parsableBitArray.readBit()) {
                if (bits5 > 2) {
                    parsableBitArray.skipBits(2);
                }
                if ((bits5 & 1) == 0 || bits5 <= 2) {
                    i9 = 6;
                } else {
                    i9 = 6;
                    parsableBitArray.skipBits(6);
                }
                if ((bits5 & 4) != 0) {
                    parsableBitArray.skipBits(i9);
                }
                if (bit && parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(5);
                }
                if (i11 == 0) {
                    if (parsableBitArray.readBit()) {
                        i10 = 6;
                        parsableBitArray.skipBits(6);
                    } else {
                        i10 = 6;
                    }
                    if (bits5 == 0 && parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(i10);
                    }
                    if (parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(i10);
                    }
                    int bits6 = parsableBitArray.readBits(2);
                    if (bits6 == 1) {
                        parsableBitArray.skipBits(5);
                    } else if (bits6 == 2) {
                        parsableBitArray.skipBits(12);
                    } else if (bits6 == 3) {
                        int bits7 = parsableBitArray.readBits(5);
                        if (parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(5);
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(4);
                                }
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(4);
                                }
                            }
                        }
                        if (parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(5);
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(7);
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(8);
                                }
                            }
                        }
                        parsableBitArray.skipBits((bits7 + 2) * 8);
                        parsableBitArray.byteAlign();
                    }
                    if (bits5 < 2) {
                        if (parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(14);
                        }
                        if (bits5 == 0 && parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(14);
                        }
                    }
                    if (parsableBitArray.readBit()) {
                        if (bits == 0) {
                            parsableBitArray.skipBits(5);
                        } else {
                            for (int i14 = 0; i14 < i6; i14++) {
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(5);
                                }
                            }
                        }
                    }
                }
            }
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(5);
                if (bits5 == 2) {
                    parsableBitArray.skipBits(4);
                }
                if (bits5 >= 6) {
                    parsableBitArray.skipBits(2);
                }
                if (parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(8);
                }
                if (bits5 == 0 && parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(8);
                }
                if (bits4 < 3) {
                    parsableBitArray.skipBit();
                }
            }
            if (i11 == 0 && bits != 3) {
                parsableBitArray.skipBit();
            }
            if (i11 == 2 && (bits == 3 || parsableBitArray.readBit())) {
                i8 = 6;
                parsableBitArray.skipBits(6);
            } else {
                i8 = 6;
            }
            str = (parsableBitArray.readBit() && parsableBitArray.readBits(i8) == 1 && parsableBitArray.readBits(8) == 1) ? MimeTypes.AUDIO_E_AC3_JOC : MimeTypes.AUDIO_E_AC3;
            i4 = i11;
            i5 = i12;
            i = bits3;
            i2 = i7;
            i3 = i13;
        } else {
            parsableBitArray.skipBits(32);
            int bits8 = parsableBitArray.readBits(2);
            String str2 = bits8 == 3 ? null : MimeTypes.AUDIO_AC3;
            int iA = a(bits8, parsableBitArray.readBits(6));
            parsableBitArray.skipBits(8);
            int bits9 = parsableBitArray.readBits(3);
            if ((bits9 & 1) != 0 && bits9 != 1) {
                parsableBitArray.skipBits(2);
            }
            if ((bits9 & 4) != 0) {
                parsableBitArray.skipBits(2);
            }
            if (bits9 == 2) {
                parsableBitArray.skipBits(2);
            }
            int[] iArr = d;
            str = str2;
            i = iA;
            i2 = bits8 < iArr.length ? iArr[bits8] : -1;
            i3 = f[bits9] + (parsableBitArray.readBit() ? 1 : 0);
            i4 = -1;
            i5 = 1536;
        }
        return new SyncFrameInfo(str, i4, i3, i2, i, i5);
    }

    public static int parseAc3SyncframeSize(byte[] data) {
        if (data.length < 6) {
            return -1;
        }
        if (((data[5] & 248) >> 3) > 10) {
            return (((data[3] & 255) | ((data[2] & 7) << 8)) + 1) * 2;
        }
        return a((data[4] & 192) >> 6, data[4] & HMProSyncDataBaseProfile.DATA_TYPE_ACTIVITY_TODAY);
    }

    public static Format parseEAc3AnnexFFormat(ParsableByteArray data, String trackId, String language, @Nullable DrmInitData drmInitData) {
        data.skipBytes(2);
        int i = d[(data.readUnsignedByte() & 192) >> 6];
        int unsignedByte = data.readUnsignedByte();
        int i2 = f[(unsignedByte & 14) >> 1];
        if ((unsignedByte & 1) != 0) {
            i2++;
        }
        if (((data.readUnsignedByte() & 30) >> 1) > 0 && (2 & data.readUnsignedByte()) != 0) {
            i2 += 2;
        }
        return new Format.Builder().setId(trackId).setSampleMimeType((data.bytesLeft() <= 0 || (data.readUnsignedByte() & 1) == 0) ? MimeTypes.AUDIO_E_AC3 : MimeTypes.AUDIO_E_AC3_JOC).setChannelCount(i2).setSampleRate(i).setDrmInitData(drmInitData).setLanguage(language).build();
    }

    public static int parseTrueHdSyncframeAudioSampleCount(byte[] syncframe) {
        if (syncframe[4] == -8 && syncframe[5] == 114 && syncframe[6] == 111 && (syncframe[7] & 254) == 186) {
            return 40 << ((syncframe[(syncframe[7] & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
        }
        return 0;
    }

    public static int parseTrueHdSyncframeAudioSampleCount(ByteBuffer buffer, int offset) {
        return 40 << ((buffer.get((buffer.position() + offset) + ((buffer.get((buffer.position() + offset) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }
}
