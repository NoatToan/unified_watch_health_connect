package javazoom.jl.decoder;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import io.netty.util.internal.StringUtil;

/* JADX INFO: loaded from: classes23.dex */
public final class Header {
    public static final int DUAL_CHANNEL = 2;
    public static final int FOURTYEIGHT = 1;
    public static final int FOURTYFOUR_POINT_ONE = 0;
    public static final int JOINT_STEREO = 1;
    public static final int MPEG1 = 1;
    public static final int MPEG25_LSF = 2;
    public static final int MPEG2_LSF = 0;
    public static final int SINGLE_CHANNEL = 3;
    public static final int STEREO = 0;
    public static final int THIRTYTWO = 2;
    private int a;
    private int b;
    private int c;
    public short checksum;
    private int d;
    private int e;
    private int f;
    public int framesize;
    private int g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean n;
    public int nSlots;
    private int o;
    private int p;
    private int q;
    private byte[] r;
    private Crc16 t;
    public static final int[][] frequencies = {new int[]{22050, 24000, 16000, 1}, new int[]{44100, OpusUtil.SAMPLE_RATE, 32000, 1}, new int[]{11025, 12000, 8000, 1}};
    public static final int[][][] bitrates = {new int[][]{new int[]{0, 32000, OpusUtil.SAMPLE_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, 256000, 0}, new int[]{0, 8000, 16000, 24000, 32000, 40000, OpusUtil.SAMPLE_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 0}, new int[]{0, 8000, 16000, 24000, 32000, 40000, OpusUtil.SAMPLE_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 0}}, new int[][]{new int[]{0, 32000, 64000, 96000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000, 0}, new int[]{0, 32000, OpusUtil.SAMPLE_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, 256000, 320000, 384000, 0}, new int[]{0, 32000, 40000, OpusUtil.SAMPLE_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, 256000, 320000, 0}}, new int[][]{new int[]{0, 32000, OpusUtil.SAMPLE_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, 256000, 0}, new int[]{0, 8000, 16000, 24000, 32000, 40000, OpusUtil.SAMPLE_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 0}, new int[]{0, 8000, 16000, 24000, 32000, 40000, OpusUtil.SAMPLE_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 0}}};
    public static final String[][][] bitrate_str = {new String[][]{new String[]{"free format", "32 kbit/s", "48 kbit/s", "56 kbit/s", "64 kbit/s", "80 kbit/s", "96 kbit/s", "112 kbit/s", "128 kbit/s", "144 kbit/s", "160 kbit/s", "176 kbit/s", "192 kbit/s", "224 kbit/s", "256 kbit/s", "forbidden"}, new String[]{"free format", "8 kbit/s", "16 kbit/s", "24 kbit/s", "32 kbit/s", "40 kbit/s", "48 kbit/s", "56 kbit/s", "64 kbit/s", "80 kbit/s", "96 kbit/s", "112 kbit/s", "128 kbit/s", "144 kbit/s", "160 kbit/s", "forbidden"}, new String[]{"free format", "8 kbit/s", "16 kbit/s", "24 kbit/s", "32 kbit/s", "40 kbit/s", "48 kbit/s", "56 kbit/s", "64 kbit/s", "80 kbit/s", "96 kbit/s", "112 kbit/s", "128 kbit/s", "144 kbit/s", "160 kbit/s", "forbidden"}}, new String[][]{new String[]{"free format", "32 kbit/s", "64 kbit/s", "96 kbit/s", "128 kbit/s", "160 kbit/s", "192 kbit/s", "224 kbit/s", "256 kbit/s", "288 kbit/s", "320 kbit/s", "352 kbit/s", "384 kbit/s", "416 kbit/s", "448 kbit/s", "forbidden"}, new String[]{"free format", "32 kbit/s", "48 kbit/s", "56 kbit/s", "64 kbit/s", "80 kbit/s", "96 kbit/s", "112 kbit/s", "128 kbit/s", "160 kbit/s", "192 kbit/s", "224 kbit/s", "256 kbit/s", "320 kbit/s", "384 kbit/s", "forbidden"}, new String[]{"free format", "32 kbit/s", "40 kbit/s", "48 kbit/s", "56 kbit/s", "64 kbit/s", "80 kbit/s", "96 kbit/s", "112 kbit/s", "128 kbit/s", "160 kbit/s", "192 kbit/s", "224 kbit/s", "256 kbit/s", "320 kbit/s", "forbidden"}}, new String[][]{new String[]{"free format", "32 kbit/s", "48 kbit/s", "56 kbit/s", "64 kbit/s", "80 kbit/s", "96 kbit/s", "112 kbit/s", "128 kbit/s", "144 kbit/s", "160 kbit/s", "176 kbit/s", "192 kbit/s", "224 kbit/s", "256 kbit/s", "forbidden"}, new String[]{"free format", "8 kbit/s", "16 kbit/s", "24 kbit/s", "32 kbit/s", "40 kbit/s", "48 kbit/s", "56 kbit/s", "64 kbit/s", "80 kbit/s", "96 kbit/s", "112 kbit/s", "128 kbit/s", "144 kbit/s", "160 kbit/s", "forbidden"}, new String[]{"free format", "8 kbit/s", "16 kbit/s", "24 kbit/s", "32 kbit/s", "40 kbit/s", "48 kbit/s", "56 kbit/s", "64 kbit/s", "80 kbit/s", "96 kbit/s", "112 kbit/s", "128 kbit/s", "144 kbit/s", "160 kbit/s", "forbidden"}}};
    private double[] m = {-1.0d, 384.0d, 1152.0d, 1152.0d};
    private byte s = Bitstream.p;
    private int u = -1;

    public void a(byte[] bArr) throws BitstreamException {
        int length;
        byte[] bArr2 = new byte[4];
        int i = 17;
        if (this.f == 1) {
            if (this.g != 3) {
                i = 32;
            }
        } else if (this.g == 3) {
            i = 9;
        }
        try {
            System.arraycopy(bArr, i, bArr2, 0, 4);
            if ("Xing".equals(new String(bArr2))) {
                this.n = true;
                this.o = -1;
                this.q = -1;
                this.p = -1;
                this.r = new byte[100];
                byte[] bArr3 = new byte[4];
                System.arraycopy(bArr, i + 4, bArr3, 0, 4);
                if ((bArr3[3] & 1) != 0) {
                    System.arraycopy(bArr, i + 8, bArr2, 0, 4);
                    this.o = ((bArr2[0] << 24) & (-16777216)) | ((bArr2[1] << 16) & ItemTouchHelper.ACTION_MODE_DRAG_MASK) | ((bArr2[2] << 8) & 65280) | (bArr2[3] & 255);
                    length = 12;
                } else {
                    length = 8;
                }
                if ((bArr3[3] & 2) != 0) {
                    System.arraycopy(bArr, i + length, bArr2, 0, 4);
                    this.q = (bArr2[3] & 255) | ((bArr2[0] << 24) & (-16777216)) | ((bArr2[1] << 16) & ItemTouchHelper.ACTION_MODE_DRAG_MASK) | ((bArr2[2] << 8) & 65280);
                    length += 4;
                }
                if ((bArr3[3] & 4) != 0) {
                    byte[] bArr4 = this.r;
                    System.arraycopy(bArr, i + length, bArr4, 0, bArr4.length);
                    length += this.r.length;
                }
                if ((bArr3[3] & 8) != 0) {
                    System.arraycopy(bArr, i + length, bArr2, 0, 4);
                    this.p = ((bArr2[0] << 24) & (-16777216)) | ((bArr2[1] << 16) & ItemTouchHelper.ACTION_MODE_DRAG_MASK) | ((bArr2[2] << 8) & 65280) | (bArr2[3] & 255);
                }
            }
            try {
                System.arraycopy(bArr, 32, bArr2, 0, 4);
                if ("VBRI".equals(new String(bArr2))) {
                    this.n = true;
                    this.o = -1;
                    this.q = -1;
                    this.p = -1;
                    this.r = new byte[100];
                    System.arraycopy(bArr, 42, bArr2, 0, 4);
                    this.q = ((bArr2[0] << 24) & (-16777216)) | ((bArr2[1] << 16) & ItemTouchHelper.ACTION_MODE_DRAG_MASK) | ((bArr2[2] << 8) & 65280) | (bArr2[3] & 255);
                    System.arraycopy(bArr, 46, bArr2, 0, 4);
                    this.o = ((bArr2[0] << 24) & (-16777216)) | ((bArr2[1] << 16) & ItemTouchHelper.ACTION_MODE_DRAG_MASK) | ((bArr2[2] << 8) & 65280) | (bArr2[3] & 255);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new BitstreamException("VBRIVBRHeader Corrupted", e);
            }
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new BitstreamException("XingVBRHeader Corrupted", e2);
        }
    }

    public void b(Bitstream bitstream, Crc16[] crc16Arr) throws BitstreamException {
        int iJ;
        boolean z = false;
        do {
            iJ = bitstream.j(this.s);
            this.u = iJ;
            if (this.s == Bitstream.p) {
                int i = (iJ >>> 19) & 1;
                this.f = i;
                if (((iJ >>> 20) & 1) == 0) {
                    if (i != 0) {
                        throw bitstream.newBitstreamException(256);
                    }
                    this.f = 2;
                }
                int i2 = (iJ >>> 10) & 3;
                this.h = i2;
                if (i2 == 3) {
                    throw bitstream.newBitstreamException(256);
                }
            }
            int i3 = (4 - (iJ >>> 17)) & 3;
            this.a = i3;
            this.b = (iJ >>> 16) & 1;
            int i4 = (iJ >>> 12) & 15;
            this.c = i4;
            this.d = (iJ >>> 9) & 1;
            int i5 = (iJ >>> 6) & 3;
            this.g = i5;
            int i6 = (iJ >>> 4) & 3;
            this.e = i6;
            if (i5 == 1) {
                this.j = (i6 << 2) + 4;
            } else {
                this.j = 0;
            }
            if (((iJ >>> 3) & 1) == 1) {
                this.k = true;
            }
            if (((iJ >>> 2) & 1) == 1) {
                this.l = true;
            }
            if (i3 == 1) {
                this.i = 32;
            } else {
                if (i5 != 3) {
                    i4 = i4 == 4 ? 1 : i4 - 4;
                }
                if (i4 == 1 || i4 == 2) {
                    if (this.h == 2) {
                        this.i = 12;
                    } else {
                        this.i = 8;
                    }
                } else if (this.h == 1 || (i4 >= 3 && i4 <= 5)) {
                    this.i = 27;
                } else {
                    this.i = 30;
                }
            }
            int i7 = this.j;
            int i8 = this.i;
            if (i7 > i8) {
                this.j = i8;
            }
            calculate_framesize();
            int iH = bitstream.h(this.framesize);
            int i9 = this.framesize;
            if (i9 >= 0 && iH != i9) {
                throw bitstream.newBitstreamException(261);
            }
            if (bitstream.isSyncCurrentPosition(this.s)) {
                if (this.s == Bitstream.p) {
                    this.s = Bitstream.q;
                    bitstream.i((-521024) & iJ);
                }
                z = true;
            } else {
                bitstream.unreadFrame();
            }
        } while (!z);
        bitstream.c();
        if (this.b != 0) {
            crc16Arr[0] = null;
            return;
        }
        this.checksum = (short) bitstream.get_bits(16);
        if (this.t == null) {
            this.t = new Crc16();
        }
        this.t.add_bits(iJ, 16);
        crc16Arr[0] = this.t;
    }

    public int bitrate() {
        return this.n ? ((int) ((this.q * 8) / (ms_per_frame() * this.o))) * 1000 : bitrates[this.f][this.a - 1][this.c];
    }

    public int bitrate_index() {
        return this.c;
    }

    public int bitrate_instant() {
        return bitrates[this.f][this.a - 1][this.c];
    }

    public String bitrate_string() {
        if (!this.n) {
            return bitrate_str[this.f][this.a - 1][this.c];
        }
        return Integer.toString(bitrate() / 1000) + " kb/s";
    }

    public int calculate_framesize() {
        int i = this.a;
        if (i == 1) {
            int[][][] iArr = bitrates;
            int i2 = this.f;
            int i3 = (iArr[i2][0][this.c] * 12) / frequencies[i2][this.h];
            this.framesize = i3;
            if (this.d != 0) {
                this.framesize = i3 + 1;
            }
            this.framesize <<= 2;
            this.nSlots = 0;
        } else {
            int[][][] iArr2 = bitrates;
            int i4 = this.f;
            int i5 = (iArr2[i4][i - 1][this.c] * 144) / frequencies[i4][this.h];
            this.framesize = i5;
            if (i4 == 0 || i4 == 2) {
                this.framesize = i5 >> 1;
            }
            if (this.d != 0) {
                this.framesize++;
            }
            if (i == 3) {
                if (i4 == 1) {
                    this.nSlots = ((this.framesize - (this.g != 3 ? 32 : 17)) - (this.b != 0 ? 0 : 2)) - 4;
                } else {
                    this.nSlots = ((this.framesize - (this.g == 3 ? 9 : 17)) - (this.b != 0 ? 0 : 2)) - 4;
                }
            } else {
                this.nSlots = 0;
            }
        }
        int i6 = this.framesize - 4;
        this.framesize = i6;
        return i6;
    }

    public boolean checksum_ok() {
        return this.checksum == this.t.checksum();
    }

    public boolean checksums() {
        return this.b == 0;
    }

    public boolean copyright() {
        return this.k;
    }

    public int frequency() {
        return frequencies[this.f][this.h];
    }

    public int getSyncHeader() {
        return this.u;
    }

    public int intensity_stereo_bound() {
        return this.j;
    }

    public int layer() {
        return this.a;
    }

    public String layer_string() {
        int i = this.a;
        if (i == 1) {
            return LogUtil.I;
        }
        if (i == 2) {
            return "II";
        }
        if (i != 3) {
            return null;
        }
        return "III";
    }

    public int max_number_of_frames(int i) {
        if (this.n) {
            return this.o;
        }
        int i2 = this.framesize;
        int i3 = this.d;
        if ((i2 + 4) - i3 == 0) {
            return 0;
        }
        return i / ((i2 + 4) - i3);
    }

    public int min_number_of_frames(int i) {
        if (this.n) {
            return this.o;
        }
        int i2 = this.framesize;
        int i3 = this.d;
        if ((i2 + 5) - i3 == 0) {
            return 0;
        }
        return i / ((i2 + 5) - i3);
    }

    public int mode() {
        return this.g;
    }

    public int mode_extension() {
        return this.e;
    }

    public String mode_string() {
        int i = this.g;
        if (i == 0) {
            return "Stereo";
        }
        if (i == 1) {
            return "Joint stereo";
        }
        if (i == 2) {
            return "Dual channel";
        }
        if (i != 3) {
            return null;
        }
        return "Single channel";
    }

    public float ms_per_frame() {
        if (!this.n) {
            return new float[][]{new float[]{8.707483f, 8.0f, 12.0f}, new float[]{26.12245f, 24.0f, 36.0f}, new float[]{26.12245f, 24.0f, 36.0f}}[this.a - 1][this.h];
        }
        double dFrequency = this.m[layer()] / ((double) frequency());
        int i = this.f;
        if (i == 0 || i == 2) {
            dFrequency /= 2.0d;
        }
        return (float) (dFrequency * 1000.0d);
    }

    public int number_of_subbands() {
        return this.i;
    }

    public boolean original() {
        return this.l;
    }

    public boolean padding() {
        return this.d != 0;
    }

    public int sample_frequency() {
        return this.h;
    }

    public String sample_frequency_string() {
        int i = this.h;
        if (i == 0) {
            int i2 = this.f;
            if (i2 == 1) {
                return "44.1 kHz";
            }
            return i2 == 0 ? "22.05 kHz" : "11.025 kHz";
        }
        if (i == 1) {
            int i3 = this.f;
            if (i3 == 1) {
                return "48 kHz";
            }
            return i3 == 0 ? "24 kHz" : "12 kHz";
        }
        if (i != 2) {
            return null;
        }
        int i4 = this.f;
        if (i4 == 1) {
            return "32 kHz";
        }
        return i4 == 0 ? "16 kHz" : "8 kHz";
    }

    public int slots() {
        return this.nSlots;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(200);
        stringBuffer.append("Layer ");
        stringBuffer.append(layer_string());
        stringBuffer.append(" frame ");
        stringBuffer.append(mode_string());
        stringBuffer.append(StringUtil.SPACE);
        stringBuffer.append(version_string());
        if (!checksums()) {
            stringBuffer.append(" no");
        }
        stringBuffer.append(" checksums");
        stringBuffer.append(StringUtil.SPACE);
        stringBuffer.append(sample_frequency_string());
        stringBuffer.append(',');
        stringBuffer.append(StringUtil.SPACE);
        stringBuffer.append(bitrate_string());
        return stringBuffer.toString();
    }

    public float total_ms(int i) {
        return max_number_of_frames(i) * ms_per_frame();
    }

    public boolean vbr() {
        return this.n;
    }

    public int vbr_scale() {
        return this.p;
    }

    public byte[] vbr_toc() {
        return this.r;
    }

    public int version() {
        return this.f;
    }

    public String version_string() {
        int i = this.f;
        if (i == 0) {
            return "MPEG-2 LSF";
        }
        if (i == 1) {
            return "MPEG-1";
        }
        if (i != 2) {
            return null;
        }
        return "MPEG-2.5 LSF";
    }
}
