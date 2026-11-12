package com.beaglebuddy.mpeg;

import com.airoha.android.lib.fota.fotaState.StageEnum;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.beaglebuddy.exception.ParseException;
import com.beaglebuddy.mpeg.enums.ChannelMode;
import com.beaglebuddy.mpeg.enums.Emphasis;
import com.beaglebuddy.mpeg.enums.Layer;
import com.beaglebuddy.mpeg.enums.MPEGVersion;
import com.beaglebuddy.util.Utility;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.xiaomi.hm.health.bt.profile.milipro.MiLiProProfile;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class MPEGFrameHeader {
    public static final int FRAME_HEADER_SIZE = 4;
    private static final int t = 6;
    private byte[] a;
    private MPEGVersion b;
    private Layer c;
    private boolean d;
    private byte e;
    private byte f;
    private boolean g;
    private boolean h;
    private ChannelMode i;
    private byte j;
    private boolean k;
    private boolean l;
    private Emphasis m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private byte[] s;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[MPEGVersion.values().length];
            b = iArr;
            try {
                iArr[MPEGVersion.MPEG_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[MPEGVersion.MPEG_2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[MPEGVersion.MPEG_25.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[MPEGVersion.MPEG_RESERVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Layer.values().length];
            a = iArr2;
            try {
                iArr2[Layer.I.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[Layer.II.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[Layer.III.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[Layer.RESERVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public MPEGFrameHeader() {
        this.a = new byte[4];
        this.b = MPEGVersion.MPEG_2;
        this.c = Layer.III;
        this.d = false;
        this.e = (byte) 0;
        this.f = (byte) 0;
        this.g = false;
        this.h = false;
        this.i = ChannelMode.STEREO;
        this.j = (byte) 0;
        this.k = true;
        this.l = true;
        this.m = Emphasis.NONE;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = null;
    }

    private static byte[] a(InputStream inputStream) throws ParseException, IOException {
        byte[] bArr = new byte[4];
        int i = inputStream.read(bArr);
        if (i == 4) {
            return bArr;
        }
        if (i == -1) {
            throw new ParseException("EOF");
        }
        if (inputStream.read() == -1) {
            throw new ParseException("EOF", bArr);
        }
        throw new IOException("Unable to read mpeg audio frame header.");
    }

    private void b() {
        int[] iArr = {0, 32, 64, 96, 128, 160, 192, 224, 256, 288, GlMapUtil.DEVICE_DISPLAY_DPI_HIGH, 352, 384, 416, 448, -1};
        int[] iArr2 = {0, 32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, GlMapUtil.DEVICE_DISPLAY_DPI_HIGH, 384, -1};
        int[] iArr3 = {0, 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, GlMapUtil.DEVICE_DISPLAY_DPI_HIGH, -1};
        int[] iArr4 = {0, 32, 48, 56, 64, 80, 96, 112, 128, 144, 160, DataTypeSource.SPORT_TYPE_BRIDGE, 192, 224, 256, -1};
        int[] iArr5 = {0, 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160, -1};
        int[] iArr6 = {0, 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160, -1};
        int i = a.b[this.b.ordinal()];
        if (i == 1) {
            int i2 = a.a[this.c.ordinal()];
            if (i2 == 1) {
                this.n = iArr[this.e];
                return;
            }
            if (i2 == 2) {
                this.n = iArr2[this.e];
                return;
            } else if (i2 == 3) {
                this.n = iArr3[this.e];
                return;
            } else {
                if (i2 != 4) {
                    return;
                }
                this.n = -1;
                return;
            }
        }
        if (i != 2 && i != 3) {
            if (i != 4) {
                return;
            }
            this.n = -1;
            return;
        }
        int i3 = a.a[this.c.ordinal()];
        if (i3 == 1) {
            this.n = iArr4[this.e];
            return;
        }
        if (i3 == 2) {
            this.n = iArr5[this.e];
        } else if (i3 == 3) {
            this.n = iArr6[this.e];
        } else {
            if (i3 != 4) {
                return;
            }
            this.n = -1;
        }
    }

    private void c(byte b, byte b2) {
        this.s = new byte[]{b, b2};
    }

    private void d(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[2];
        this.s = bArr;
        if (inputStream.read(bArr) != this.s.length) {
            throw new IOException("Error reading the CRC following the mpeg audio frame header.");
        }
    }

    private void e() {
        int bitrate = getBitrate();
        boolean z = this.g;
        int frequency = getFrequency();
        int i = a.a[this.c.ordinal()];
        if (i == 1) {
            this.p = ((((bitrate * 12) * 1000) / frequency) + (z ? 1 : 0)) * 4;
            return;
        }
        if (i == 2 || i == 3) {
            this.p = (((bitrate * 144) * 1000) / frequency) + (z ? 1 : 0);
        } else {
            if (i != 4) {
                return;
            }
            this.p = (((bitrate * 72) * 1000) / frequency) + (z ? 1 : 0);
        }
    }

    private void f() {
        int[] iArr = {44100, OpusUtil.SAMPLE_RATE, 32000, -1};
        int[] iArr2 = {22050, 24000, 16000, -1};
        int[] iArr3 = {11025, 12000, 8000, -1};
        int i = a.b[this.b.ordinal()];
        if (i == 1) {
            this.o = iArr[this.f];
            return;
        }
        if (i == 2) {
            this.o = iArr2[this.f];
        } else if (i == 3) {
            this.o = iArr3[this.f];
        } else {
            if (i != 4) {
                return;
            }
            this.o = -1;
        }
    }

    private void g() {
        Layer layer = this.c;
        if (layer == Layer.I) {
            this.q = 384;
            return;
        }
        if (layer == Layer.II) {
            this.q = 1152;
        } else if (layer == Layer.III) {
            this.q = this.b != MPEGVersion.MPEG_1 ? StageEnum.APP_RESULT_FOTA_NV_SUCCESS : 1152;
        }
    }

    private void h() {
        if (this.b == MPEGVersion.MPEG_1) {
            this.r = this.i != ChannelMode.SINGLE_CHANNEL ? 32 : 17;
        } else {
            this.r = this.i == ChannelMode.SINGLE_CHANNEL ? 9 : 17;
        }
    }

    public int getBitrate() {
        return this.n;
    }

    public byte[] getCRC() {
        return this.s;
    }

    public ChannelMode getChannelMode() {
        return this.i;
    }

    public String getCodec() {
        return this.b + " " + this.c;
    }

    public int getFrameSize() {
        return this.p;
    }

    public int getFrequency() {
        return this.o;
    }

    public Layer getLayer() {
        return this.c;
    }

    public MPEGVersion getMPEGVersion() {
        return this.b;
    }

    public String getModeExtension() {
        String[] strArr = {"bands 4 - 31", "bands 8 - 31", "bands 12 - 31", "bands 16 - 31"};
        String[] strArr2 = {"intensity stereo: off, MS stereo: off", "intensity stereo: on, MS stereo: off", "intensity stereo: off, MS stereo: on", "intensity stereo: on, MS stereo: on"};
        int i = a.a[this.c.ordinal()];
        if (i == 1 || i == 2) {
            return strArr[this.j];
        }
        if (i != 3) {
            return null;
        }
        return strArr2[this.j];
    }

    public int getNumSamples() {
        return this.q;
    }

    public int getSideInfoSize() {
        return this.r;
    }

    public int getSize() {
        return (isProtectedByCRC() ? getCRC().length : 0) + 4;
    }

    public boolean isCopyrighted() {
        return this.k;
    }

    public boolean isOriginalMedia() {
        return this.l;
    }

    public boolean isProtectedByCRC() {
        return this.d;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("mpeg audio frame header\n");
        stringBuffer.append("   size............: " + this.a.length + "\n");
        stringBuffer.append("   bytes...........: " + Utility.hex(this.a, 17) + "\n");
        stringBuffer.append("   MPEG version....: " + this.b + "\n");
        stringBuffer.append("   MPEG layer......: " + this.c + "\n");
        stringBuffer.append("   protected.by CRC: " + this.d + "\n");
        stringBuffer.append("   bit rate........: " + this.n + " kbit/s\n");
        stringBuffer.append("   frequency.......: " + this.o + " hz\n");
        stringBuffer.append("   frame is padded.: " + this.g + "\n");
        stringBuffer.append("   private bit.....: " + this.h + "\n");
        stringBuffer.append("   channel mode....: " + this.i + "\n");
        stringBuffer.append("   mode extension..: " + getModeExtension() + "\n");
        stringBuffer.append("   copyrighted.....: " + this.k + "\n");
        stringBuffer.append("   original media..: " + this.l + "\n");
        stringBuffer.append("   emphasis........: " + this.m + "\n");
        stringBuffer.append("   frame size......: " + this.p + " bytes\n");
        stringBuffer.append("   num samples.....: " + this.q + "\n");
        stringBuffer.append("   side info size..: " + this.r + " bytes");
        return stringBuffer.toString();
    }

    public MPEGFrameHeader(InputStream inputStream) throws ParseException, IOException {
        this(a(inputStream), inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MPEGFrameHeader(byte[] bArr, InputStream inputStream) throws ParseException, IOException {
        if (bArr != null && (bArr.length == 4 || bArr.length == 6)) {
            if (bArr[0] == -1 && (bArr[1] & MiLiProProfile.ECF_COMMAND_SET_SPORT_TYPE_SORT) == -32) {
                byte[] bArr2 = {bArr[0], bArr[1], bArr[2], bArr[3]};
                this.a = bArr2;
                this.b = MPEGVersion.valueOf((byte) ((bArr2[1] & 24) >> 3));
                this.c = Layer.valueOf((byte) ((this.a[1] & 6) >> 1));
                byte[] bArr3 = this.a;
                this.d = ((byte) (bArr3[1] & 1)) == 0;
                this.e = (byte) ((bArr3[2] & 240) >> 4);
                this.f = (byte) ((bArr3[2] & 12) >> 2);
                this.g = ((byte) (bArr3[2] & 2)) != 0;
                this.h = ((byte) (bArr3[2] & 1)) != 0;
                this.i = ChannelMode.valueOf((byte) ((bArr3[3] & 192) >> 6));
                byte[] bArr4 = this.a;
                this.j = (byte) ((bArr4[3] & 48) >> 4);
                this.k = ((byte) (bArr4[3] & 8)) != 0;
                this.l = ((byte) (bArr4[3] & 4)) != 0;
                Emphasis emphasisValueOf = Emphasis.valueOf((byte) (bArr4[3] & 3));
                this.m = emphasisValueOf;
                if (this.b != MPEGVersion.MPEG_RESERVED) {
                    if (this.c != Layer.RESERVED) {
                        if (emphasisValueOf != Emphasis.RESERVED) {
                            b();
                            f();
                            if (getBitrate() != 0 && getBitrate() != -1) {
                                if (getFrequency() != -1) {
                                    e();
                                    g();
                                    h();
                                    if (isProtectedByCRC()) {
                                        if (bArr.length == 4) {
                                            d(inputStream);
                                            return;
                                        } else {
                                            c(bArr[4], bArr[5]);
                                            return;
                                        }
                                    }
                                    return;
                                }
                                throw new ParseException("Invalid frequency " + getFrequency() + ", found in the mpeg audio frame header.", bArr);
                            }
                            throw new ParseException("Invalid bit rate " + getBitrate() + ", found in the mpeg audio frame header.", bArr);
                        }
                        throw new ParseException("Invalid emphasis, " + this.m + ", found in the mpeg audio frame header.", bArr);
                    }
                    throw new ParseException("Invalid layer, " + this.c + ", found in the mpeg audio frame header.", bArr);
                }
                throw new ParseException("Invalid MPEG version, " + this.b + ", found in the mpeg audio frame header.", bArr);
            }
            throw new ParseException("Invalid synch bytes in mpeg audio frame header", bArr);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid number of bytes, ");
        sb.append(bArr != null ? bArr.length : 0);
        sb.append(", passed in to MPEGFrameHeader().");
        throw new IllegalArgumentException(sb.toString());
    }
}
