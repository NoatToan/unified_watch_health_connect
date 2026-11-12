package com.google.android.exoplayer2.extractor.mkv;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.a;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.LongArray;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.AvcConfig;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.exoplayer2.video.DolbyVisionConfig;
import com.google.android.exoplayer2.video.HevcConfig;
import com.google.common.collect.ImmutableList;
import com.huami.nfc.applet.ISeCommandKt;
import com.xiaomi.hm.health.bt.model.HMDisplaySetting;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public class MatroskaExtractor implements Extractor {
    private static final String A0 = "A_TRUEHD";
    private static final int A1 = 16877;
    private static final int A2 = 21973;
    private static final String B0 = "A_DTS";
    private static final int B1 = 21358;
    private static final int B2 = 21974;
    private static final String C0 = "A_DTS/EXPRESS";
    private static final int C1 = 134;
    private static final int C2 = 21975;
    private static final String D0 = "A_DTS/LOSSLESS";
    private static final int D1 = 25506;
    private static final int D2 = 21976;
    private static final String E0 = "A_FLAC";
    private static final int E1 = 22186;
    private static final int E2 = 21977;
    private static final String F0 = "A_MS/ACM";
    private static final int F1 = 22203;
    private static final int F2 = 21978;
    public static final int FLAG_DISABLE_SEEK_FOR_CUES = 1;
    private static final String G0 = "A_PCM/INT/LIT";
    private static final int G1 = 224;
    private static final int G2 = 4;
    private static final String H0 = "A_PCM/INT/BIG";
    private static final int H1 = 176;
    private static final int H2 = 1685480259;
    private static final String I0 = "A_PCM/FLOAT/IEEE";
    private static final int I1 = 186;
    private static final int I2 = 1685485123;
    private static final String J0 = "S_TEXT/UTF8";
    private static final int J1 = 21680;
    private static final int J2 = 0;
    private static final String K0 = "S_TEXT/ASS";
    private static final int K1 = 21690;
    private static final int K2 = 1;
    private static final String L0 = "S_VOBSUB";
    private static final int L1 = 21682;
    private static final int L2 = 2;
    private static final String M0 = "S_HDMV/PGS";
    private static final int M1 = 225;
    private static final int M2 = 3;
    private static final String N0 = "S_DVBSUB";
    private static final int N1 = 159;
    private static final int N2 = 1482049860;
    private static final int O0 = 8192;
    private static final int O1 = 25188;
    private static final int O2 = 859189832;
    private static final int P0 = 5760;
    private static final int P1 = 181;
    private static final int P2 = 826496599;
    private static final int Q0 = 8;
    private static final int Q1 = 28032;
    private static final int R0 = 2;
    private static final int R1 = 25152;
    private static final int R2 = 19;
    private static final int S0 = 440786851;
    private static final int S1 = 20529;
    private static final long S2 = 1000;
    private static final int T0 = 17143;
    private static final int T1 = 20530;
    private static final String T2 = "%02d:%02d:%02d,%03d";
    private static final int U0 = 17026;
    private static final int U1 = 20532;
    private static final int V0 = 17029;
    private static final int V1 = 16980;
    private static final int W0 = 408125543;
    private static final int W1 = 16981;
    private static final int W2 = 21;
    private static final int X0 = 357149030;
    private static final int X1 = 20533;
    private static final long X2 = 10000;
    private static final int Y0 = 290298740;
    private static final int Y1 = 18401;
    private static final String Y2 = "%01d:%02d:%02d:%02d";
    private static final int Z0 = 19899;
    private static final int Z1 = 18402;
    private static final int Z2 = 18;
    private static final int a1 = 21419;
    private static final int a2 = 18407;
    private static final int a3 = 65534;
    private static final String b0 = "MatroskaExtractor";
    private static final int b1 = 21420;
    private static final int b2 = 18408;
    private static final int b3 = 1;
    private static final int c0 = -1;
    private static final int c1 = 357149030;
    private static final int c2 = 475249515;
    private static final int d0 = 0;
    private static final int d1 = 2807729;
    private static final int d2 = 187;
    private static final Map<String, Integer> d3;
    private static final int e0 = 1;
    private static final int e1 = 17545;
    private static final int e2 = 179;
    private static final int f0 = 2;
    private static final int f1 = 524531317;
    private static final int f2 = 183;
    private static final String g0 = "matroska";
    private static final int g1 = 231;
    private static final int g2 = 241;
    private static final String h0 = "webm";
    private static final int h1 = 163;
    private static final int h2 = 2274716;
    private static final String i0 = "V_VP8";
    private static final int i1 = 160;
    private static final int i2 = 30320;
    private static final String j0 = "V_VP9";
    private static final int j1 = 161;
    private static final int j2 = 30321;
    private static final String k0 = "V_AV1";
    private static final int k1 = 155;
    private static final int k2 = 30322;
    private static final String l0 = "V_MPEG2";
    private static final int l1 = 30113;
    private static final int l2 = 30323;
    private static final String m0 = "V_MPEG4/ISO/SP";
    private static final int m1 = 166;
    private static final int m2 = 30324;
    private static final String n0 = "V_MPEG4/ISO/ASP";
    private static final int n1 = 238;
    private static final int n2 = 30325;
    private static final String o0 = "V_MPEG4/ISO/AP";
    private static final int o1 = 165;
    private static final int o2 = 21432;
    private static final String p0 = "V_MPEG4/ISO/AVC";
    private static final int p1 = 251;
    private static final int p2 = 21936;
    private static final String q0 = "V_MPEGH/ISO/HEVC";
    private static final int q1 = 374648427;
    private static final int q2 = 21945;
    private static final String r0 = "V_MS/VFW/FOURCC";
    private static final int r1 = 174;
    private static final int r2 = 21946;
    private static final String s0 = "V_THEORA";
    private static final int s1 = 215;
    private static final int s2 = 21947;
    private static final String t0 = "A_VORBIS";
    private static final int t1 = 131;
    private static final int t2 = 21948;
    private static final String u0 = "A_OPUS";
    private static final int u1 = 136;
    private static final int u2 = 21949;
    private static final String v0 = "A_AAC";
    private static final int v1 = 21930;
    private static final int v2 = 21968;
    private static final String w0 = "A_MPEG/L2";
    private static final int w1 = 2352003;
    private static final int w2 = 21969;
    private static final String x0 = "A_MPEG/L3";
    private static final int x1 = 21998;
    private static final int x2 = 21970;
    private static final String y0 = "A_AC3";
    private static final int y1 = 16868;
    private static final int y2 = 21971;
    private static final String z0 = "A_EAC3";
    private static final int z1 = 16871;
    private static final int z2 = 21972;
    private long A;
    private long B;

    @Nullable
    private LongArray C;

    @Nullable
    private LongArray D;
    private boolean E;
    private boolean F;
    private int G;
    private long H;
    private long I;
    private int J;
    private int K;
    private int[] L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private int R;
    private int S;
    private int T;
    private boolean U;
    private boolean V;
    private boolean W;
    private int X;
    private byte Y;
    private boolean Z;
    private final com.google.android.exoplayer2.extractor.mkv.b a;
    private ExtractorOutput a0;
    private final com.google.android.exoplayer2.extractor.mkv.d b;
    private final SparseArray<c> c;
    private final boolean d;
    private final ParsableByteArray e;
    private final ParsableByteArray f;
    private final ParsableByteArray g;
    private final ParsableByteArray h;
    private final ParsableByteArray i;
    private final ParsableByteArray j;
    private final ParsableByteArray k;
    private final ParsableByteArray l;
    private final ParsableByteArray m;
    private final ParsableByteArray n;
    private ByteBuffer o;
    private long p;
    private long q;
    private long r;
    private long s;
    private long t;

    @Nullable
    private c u;
    private boolean v;
    private int w;
    private long x;
    private boolean y;
    private long z;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: lv4
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return MatroskaExtractor.o();
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
            return a.a(this, uri, map);
        }
    };
    private static final byte[] Q2 = {HMDisplaySetting.TYPE_OSPREY_W, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, HMProSyncDataBaseProfile.DATA_TYPE_SLEEPING_BLOOD_PRESSURE_RESULT, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] U2 = Util.getUtf8Bytes("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] V2 = {org.threeten.bp.a.n, 105, 97, ISeCommandKt.RPDU_NEED_JUDGE, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final UUID c3 = new UUID(72057594037932032L, -9223371306706625679L);

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public final class b implements EbmlProcessor {
        private b() {
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void binaryElement(int id, int contentsSize, ExtractorInput input) throws IOException {
            MatroskaExtractor.this.binaryElement(id, contentsSize, input);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void endMasterElement(int id) throws ParserException {
            MatroskaExtractor.this.endMasterElement(id);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void floatElement(int id, double value) throws ParserException {
            MatroskaExtractor.this.floatElement(id, value);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public int getElementType(int id) {
            return MatroskaExtractor.this.getElementType(id);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void integerElement(int id, long value) throws ParserException {
            MatroskaExtractor.this.integerElement(id, value);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public boolean isLevel1Element(int id) {
            return MatroskaExtractor.this.isLevel1Element(id);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void startMasterElement(int id, long contentPosition, long contentSize) throws ParserException {
            MatroskaExtractor.this.startMasterElement(id, contentPosition, contentSize);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void stringElement(int id, String value) throws ParserException {
            MatroskaExtractor.this.stringElement(id, value);
        }
    }

    public static final class c {
        private static final int Z = 0;
        private static final int a0 = 50000;
        private static final int b0 = 1000;
        private static final int c0 = 200;
        public int A;
        public int B;
        public int C;
        public float D;
        public float E;
        public float F;
        public float G;
        public float H;
        public float I;
        public float J;
        public float K;
        public float L;
        public float M;
        public byte[] N;
        public int O;
        public int P;
        public int Q;
        public long R;
        public long S;
        public d T;
        public boolean U;
        public boolean V;
        private String W;
        public TrackOutput X;
        public int Y;
        public String a;
        public String b;
        public int c;
        public int d;
        public int e;
        public int f;
        private int g;
        public boolean h;
        public byte[] i;
        public TrackOutput.CryptoData j;
        public byte[] k;
        public DrmInitData l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public int r;
        public float s;
        public float t;
        public float u;
        public byte[] v;
        public int w;
        public boolean x;
        public int y;
        public int z;

        private c() {
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = -1;
            this.s = 0.0f;
            this.t = 0.0f;
            this.u = 0.0f;
            this.v = null;
            this.w = -1;
            this.x = false;
            this.y = -1;
            this.z = -1;
            this.A = -1;
            this.B = 1000;
            this.C = 200;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = -1.0f;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = -1.0f;
            this.K = -1.0f;
            this.L = -1.0f;
            this.M = -1.0f;
            this.O = 1;
            this.P = -1;
            this.Q = 8000;
            this.R = 0L;
            this.S = 0L;
            this.V = true;
            this.W = "eng";
        }

        /* JADX INFO: Access modifiers changed from: private */
        @EnsuresNonNull({"output"})
        public void e() {
            Assertions.checkNotNull(this.X);
        }

        @EnsuresNonNull({"codecPrivate"})
        private byte[] f(String codecId) throws ParserException {
            byte[] bArr = this.k;
            if (bArr != null) {
                return bArr;
            }
            String strValueOf = String.valueOf(codecId);
            throw ParserException.createForMalformedContainer(strValueOf.length() != 0 ? "Missing CodecPrivate for codec ".concat(strValueOf) : new String("Missing CodecPrivate for codec "), null);
        }

        @Nullable
        private byte[] g() {
            if (this.D == -1.0f || this.E == -1.0f || this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f || this.M == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.D * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.E * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.F * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.G * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.H * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.I * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.J * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.K * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.L + 0.5f));
            byteBufferOrder.putShort((short) (this.M + 0.5f));
            byteBufferOrder.putShort((short) this.B);
            byteBufferOrder.putShort((short) this.C);
            return bArr;
        }

        private static Pair<String, List<byte[]>> j(ParsableByteArray buffer) throws ParserException {
            try {
                buffer.skipBytes(16);
                long littleEndianUnsignedInt = buffer.readLittleEndianUnsignedInt();
                if (littleEndianUnsignedInt == 1482049860) {
                    return new Pair<>(MimeTypes.VIDEO_DIVX, null);
                }
                if (littleEndianUnsignedInt == 859189832) {
                    return new Pair<>(MimeTypes.VIDEO_H263, null);
                }
                if (littleEndianUnsignedInt != 826496599) {
                    Log.w(MatroskaExtractor.b0, "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>(MimeTypes.VIDEO_UNKNOWN, null);
                }
                byte[] data = buffer.getData();
                for (int position = buffer.getPosition() + 20; position < data.length - 4; position++) {
                    if (data[position] == 0 && data[position + 1] == 0 && data[position + 2] == 1 && data[position + 3] == 15) {
                        return new Pair<>(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(data, position, data.length)));
                    }
                }
                throw ParserException.createForMalformedContainer("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing FourCC private data", null);
            }
        }

        private static boolean k(ParsableByteArray buffer) throws ParserException {
            try {
                int littleEndianUnsignedShort = buffer.readLittleEndianUnsignedShort();
                if (littleEndianUnsignedShort == 1) {
                    return true;
                }
                if (littleEndianUnsignedShort != 65534) {
                    return false;
                }
                buffer.setPosition(24);
                return buffer.readLong() == MatroskaExtractor.c3.getMostSignificantBits() && buffer.readLong() == MatroskaExtractor.c3.getLeastSignificantBits();
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing MS/ACM codec private", null);
            }
        }

        private static List<byte[]> l(byte[] codecPrivate) throws ParserException {
            try {
                if (codecPrivate[0] != 2) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i = 1;
                int i2 = 0;
                while ((codecPrivate[i] & 255) == 255) {
                    i2 += 255;
                    i++;
                }
                int i3 = i + 1;
                int i4 = i2 + (codecPrivate[i] & 255);
                int i5 = 0;
                while ((codecPrivate[i3] & 255) == 255) {
                    i5 += 255;
                    i3++;
                }
                int i6 = i3 + 1;
                int i7 = i5 + (codecPrivate[i3] & 255);
                if (codecPrivate[i6] != 1) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr = new byte[i4];
                System.arraycopy(codecPrivate, i6, bArr, 0, i4);
                int i8 = i6 + i4;
                if (codecPrivate[i8] != 3) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i9 = i8 + i7;
                if (codecPrivate[i9] != 5) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[codecPrivate.length - i9];
                System.arraycopy(codecPrivate, i9, bArr2, 0, codecPrivate.length - i9);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr);
                arrayList.add(bArr2);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:148:0x02a2 A[PHI: r7 r17
          0x02a2: PHI (r7v5 int) = (r7v1 int), (r7v0 int), (r7v3 int), (r7v6 int) binds: [B:186:0x03ff, B:156:0x02dc, B:153:0x02b2, B:145:0x027a] A[DONT_GENERATE, DONT_INLINE]
          0x02a2: PHI (r17v22 java.lang.String) = (r17v1 java.lang.String), (r17v20 java.lang.String), (r17v21 java.lang.String), (r17v24 java.lang.String) binds: [B:186:0x03ff, B:156:0x02dc, B:153:0x02b2, B:145:0x027a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:200:0x0452  */
        /* JADX WARN: Code duplicated, block: B:205:0x046b  */
        /* JADX WARN: Code duplicated, block: B:206:0x046d  */
        /* JADX WARN: Code duplicated, block: B:209:0x047a  */
        /* JADX WARN: Code duplicated, block: B:210:0x048c  */
        /* JADX WARN: Code duplicated, block: B:212:0x0492  */
        /* JADX WARN: Code duplicated, block: B:214:0x0496  */
        /* JADX WARN: Code duplicated, block: B:216:0x049b  */
        /* JADX WARN: Code duplicated, block: B:219:0x04a3  */
        /* JADX WARN: Code duplicated, block: B:221:0x04a8  */
        /* JADX WARN: Code duplicated, block: B:224:0x04af  */
        /* JADX WARN: Code duplicated, block: B:229:0x04c2  */
        /* JADX WARN: Code duplicated, block: B:230:0x04d2  */
        /* JADX WARN: Code duplicated, block: B:233:0x04d7  */
        /* JADX WARN: Code duplicated, block: B:238:0x04f7  */
        /* JADX WARN: Code duplicated, block: B:257:0x0543  */
        /* JADX WARN: Code duplicated, block: B:259:0x0569  */
        /* JADX WARN: Code duplicated, block: B:261:0x056f  */
        /* JADX WARN: Code duplicated, block: B:274:0x0596  */
        /* JADX WARN: Code duplicated, block: B:4:0x0015  */
        @EnsuresNonNull({"this.output"})
        @RequiresNonNull({"codecId"})
        public void h(ExtractorOutput extractorOutput, int i) throws ParserException {
            byte b;
            List<byte[]> listSingletonList;
            int i2;
            String str;
            List<byte[]> list;
            String str2;
            byte[] bArr;
            String str3;
            int i3;
            Format.Builder builder;
            int iIntValue;
            float f;
            int i4;
            ColorInfo colorInfo;
            int i5;
            int i6;
            int i7;
            DolbyVisionConfig dolbyVisionConfig;
            String str4 = this.b;
            str4.hashCode();
            int pcmEncoding = 4;
            int i8 = 3;
            int i9 = 0;
            switch (str4) {
                case "V_MPEG4/ISO/AP":
                    b = 0;
                    break;
                case "V_MPEG4/ISO/SP":
                    b = 1;
                    break;
                case "A_MS/ACM":
                    b = 2;
                    break;
                case "A_TRUEHD":
                    b = 3;
                    break;
                case "A_VORBIS":
                    b = 4;
                    break;
                case "A_MPEG/L2":
                    b = 5;
                    break;
                case "A_MPEG/L3":
                    b = 6;
                    break;
                case "V_MS/VFW/FOURCC":
                    b = 7;
                    break;
                case "S_DVBSUB":
                    b = 8;
                    break;
                case "V_MPEG4/ISO/ASP":
                    b = 9;
                    break;
                case "V_MPEG4/ISO/AVC":
                    b = 10;
                    break;
                case "S_VOBSUB":
                    b = 11;
                    break;
                case "A_DTS/LOSSLESS":
                    b = 12;
                    break;
                case "A_AAC":
                    b = 13;
                    break;
                case "A_AC3":
                    b = 14;
                    break;
                case "A_DTS":
                    b = 15;
                    break;
                case "V_AV1":
                    b = 16;
                    break;
                case "V_VP8":
                    b = 17;
                    break;
                case "V_VP9":
                    b = 18;
                    break;
                case "S_HDMV/PGS":
                    b = 19;
                    break;
                case "V_THEORA":
                    b = 20;
                    break;
                case "A_DTS/EXPRESS":
                    b = 21;
                    break;
                case "A_PCM/FLOAT/IEEE":
                    b = 22;
                    break;
                case "A_PCM/INT/BIG":
                    b = 23;
                    break;
                case "A_PCM/INT/LIT":
                    b = 24;
                    break;
                case "S_TEXT/ASS":
                    b = 25;
                    break;
                case "V_MPEGH/ISO/HEVC":
                    b = 26;
                    break;
                case "S_TEXT/UTF8":
                    b = 27;
                    break;
                case "V_MPEG2":
                    b = 28;
                    break;
                case "A_EAC3":
                    b = 29;
                    break;
                case "A_FLAC":
                    b = 30;
                    break;
                case "A_OPUS":
                    b = 31;
                    break;
                default:
                    b = -1;
                    break;
            }
            String str5 = MimeTypes.APPLICATION_PGS;
            String str6 = MimeTypes.AUDIO_RAW;
            switch (b) {
                case 0:
                case 1:
                case 9:
                    str5 = MimeTypes.APPLICATION_PGS;
                    byte[] bArr2 = this.k;
                    listSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                    str6 = MimeTypes.VIDEO_MP4V;
                    str = null;
                    pcmEncoding = -1;
                    i2 = -1;
                    bArr = this.N;
                    if (bArr != null && (dolbyVisionConfig = DolbyVisionConfig.parse(new ParsableByteArray(bArr))) != null) {
                        str = dolbyVisionConfig.codecs;
                        str6 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str6;
                    int i10 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i11 = i10 | i3;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.O).setSampleRate(this.Q).setPcmEncoding(pcmEncoding);
                        i8 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.q == 0) {
                            i6 = this.o;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.m;
                            }
                            this.o = i6;
                            i7 = this.p;
                            if (i7 == -1) {
                                i7 = this.n;
                            }
                            this.p = i7;
                        } else {
                            iIntValue = -1;
                        }
                        f = -1.0f;
                        i4 = this.o;
                        if (i4 != iIntValue && (i5 = this.p) != iIntValue) {
                            f = (this.n * i4) / (this.m * i5);
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.a != null && MatroskaExtractor.d3.containsKey(this.a)) {
                            iIntValue = ((Integer) MatroskaExtractor.d3.get(this.a)).intValue();
                        }
                        if (this.r == 0 || Float.compare(this.s, 0.0f) != 0 || Float.compare(this.t, 0.0f) != 0) {
                            i9 = iIntValue;
                        } else if (Float.compare(this.u, 0.0f) != 0) {
                            if (Float.compare(this.t, 90.0f) == 0) {
                                i9 = 90;
                            } else if (Float.compare(this.t, -180.0f) == 0 || Float.compare(this.t, 180.0f) == 0) {
                                i9 = 180;
                            } else if (Float.compare(this.t, -90.0f) == 0) {
                                i9 = 270;
                            } else {
                                i9 = iIntValue;
                            }
                        }
                        builder.setWidth(this.m).setHeight(this.n).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.v).setStereoMode(this.w).setColorInfo(colorInfo);
                        i8 = 2;
                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str3) && !MimeTypes.TEXT_SSA.equals(str3) && !MimeTypes.APPLICATION_VOBSUB.equals(str3) && !str5.equals(str3) && !MimeTypes.APPLICATION_DVBSUBS.equals(str3)) {
                        throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                    }
                    if (this.a != null && !MatroskaExtractor.d3.containsKey(this.a)) {
                        builder.setLabel(this.a);
                    }
                    Format formatBuild = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.W).setSelectionFlags(i11).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.l).build();
                    TrackOutput trackOutputTrack = extractorOutput.track(this.c, i8);
                    this.X = trackOutputTrack;
                    trackOutputTrack.format(formatBuild);
                    return;
                case 2:
                    str5 = MimeTypes.APPLICATION_PGS;
                    if (k(new ParsableByteArray(f(this.b)))) {
                        pcmEncoding = Util.getPcmEncoding(this.P);
                        if (pcmEncoding == 0) {
                            int i12 = this.P;
                            StringBuilder sb = new StringBuilder(MimeTypes.AUDIO_UNKNOWN.length() + 60);
                            sb.append("Unsupported PCM bit depth: ");
                            sb.append(i12);
                            sb.append(". Setting mimeType to ");
                            sb.append(MimeTypes.AUDIO_UNKNOWN);
                            Log.w(MatroskaExtractor.b0, sb.toString());
                        } else {
                            listSingletonList = null;
                            str = null;
                        }
                        i2 = -1;
                        bArr = this.N;
                        if (bArr != null) {
                            str = dolbyVisionConfig.codecs;
                            str6 = MimeTypes.VIDEO_DOLBY_VISION;
                        }
                        str3 = str6;
                        int i13 = (this.V ? 1 : 0) | 0;
                        if (this.U) {
                            i3 = 2;
                        } else {
                            i3 = 0;
                        }
                        int i14 = i13 | i3;
                        builder = new Format.Builder();
                        if (MimeTypes.isAudio(str3)) {
                            builder.setChannelCount(this.O).setSampleRate(this.Q).setPcmEncoding(pcmEncoding);
                            i8 = 1;
                        } else if (MimeTypes.isVideo(str3)) {
                            if (this.q == 0) {
                                i6 = this.o;
                                iIntValue = -1;
                                if (i6 == -1) {
                                    i6 = this.m;
                                }
                                this.o = i6;
                                i7 = this.p;
                                if (i7 == -1) {
                                    i7 = this.n;
                                }
                                this.p = i7;
                            } else {
                                iIntValue = -1;
                            }
                            f = -1.0f;
                            i4 = this.o;
                            if (i4 != iIntValue) {
                                f = (this.n * i4) / (this.m * i5);
                            }
                            if (this.x) {
                                colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                            } else {
                                colorInfo = null;
                            }
                            if (this.a != null) {
                                iIntValue = ((Integer) MatroskaExtractor.d3.get(this.a)).intValue();
                            }
                            if (this.r == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            builder.setWidth(this.m).setHeight(this.n).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.v).setStereoMode(this.w).setColorInfo(colorInfo);
                            i8 = 2;
                        } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                        }
                        if (this.a != null) {
                            builder.setLabel(this.a);
                        }
                        Format formatBuild2 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.W).setSelectionFlags(i14).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.l).build();
                        TrackOutput trackOutputTrack2 = extractorOutput.track(this.c, i8);
                        this.X = trackOutputTrack2;
                        trackOutputTrack2.format(formatBuild2);
                        return;
                    }
                    Log.w(MatroskaExtractor.b0, MimeTypes.AUDIO_UNKNOWN.length() != 0 ? "Non-PCM MS/ACM is unsupported. Setting mimeType to ".concat(MimeTypes.AUDIO_UNKNOWN) : new String("Non-PCM MS/ACM is unsupported. Setting mimeType to "));
                    str6 = MimeTypes.AUDIO_UNKNOWN;
                    listSingletonList = null;
                    str = null;
                    pcmEncoding = -1;
                    i2 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str6 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str6;
                    int i15 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i16 = i15 | i3;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.O).setSampleRate(this.Q).setPcmEncoding(pcmEncoding);
                        i8 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.q == 0) {
                            i6 = this.o;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.m;
                            }
                            this.o = i6;
                            i7 = this.p;
                            if (i7 == -1) {
                                i7 = this.n;
                            }
                            this.p = i7;
                        } else {
                            iIntValue = -1;
                        }
                        f = -1.0f;
                        i4 = this.o;
                        if (i4 != iIntValue) {
                            f = (this.n * i4) / (this.m * i5);
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.a != null) {
                            iIntValue = ((Integer) MatroskaExtractor.d3.get(this.a)).intValue();
                        }
                        if (this.r == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        builder.setWidth(this.m).setHeight(this.n).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.v).setStereoMode(this.w).setColorInfo(colorInfo);
                        i8 = 2;
                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                    }
                    if (this.a != null) {
                        builder.setLabel(this.a);
                    }
                    Format formatBuild3 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.W).setSelectionFlags(i16).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.l).build();
                    TrackOutput trackOutputTrack3 = extractorOutput.track(this.c, i8);
                    this.X = trackOutputTrack3;
                    trackOutputTrack3.format(formatBuild3);
                    return;
                case 3:
                    str5 = MimeTypes.APPLICATION_PGS;
                    this.T = new d();
                    str6 = MimeTypes.AUDIO_TRUEHD;
                    listSingletonList = null;
                    str = null;
                    pcmEncoding = -1;
                    i2 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str6 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str6;
                    int i17 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i18 = i17 | i3;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.O).setSampleRate(this.Q).setPcmEncoding(pcmEncoding);
                        i8 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.q == 0) {
                            i6 = this.o;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.m;
                            }
                            this.o = i6;
                            i7 = this.p;
                            if (i7 == -1) {
                                i7 = this.n;
                            }
                            this.p = i7;
                        } else {
                            iIntValue = -1;
                        }
                        f = -1.0f;
                        i4 = this.o;
                        if (i4 != iIntValue) {
                            f = (this.n * i4) / (this.m * i5);
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.a != null) {
                            iIntValue = ((Integer) MatroskaExtractor.d3.get(this.a)).intValue();
                        }
                        if (this.r == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        builder.setWidth(this.m).setHeight(this.n).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.v).setStereoMode(this.w).setColorInfo(colorInfo);
                        i8 = 2;
                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                    }
                    if (this.a != null) {
                        builder.setLabel(this.a);
                    }
                    Format formatBuild4 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.W).setSelectionFlags(i18).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.l).build();
                    TrackOutput trackOutputTrack4 = extractorOutput.track(this.c, i8);
                    this.X = trackOutputTrack4;
                    trackOutputTrack4.format(formatBuild4);
                    return;
                case 4:
                    i2 = 8192;
                    listSingletonList = l(f(this.b));
                    str6 = MimeTypes.AUDIO_VORBIS;
                    str = null;
                    pcmEncoding = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str6 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str6;
                    int i19 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i110 = i19 | i3;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.O).setSampleRate(this.Q).setPcmEncoding(pcmEncoding);
                        i8 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.q == 0) {
                            i6 = this.o;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.m;
                            }
                            this.o = i6;
                            i7 = this.p;
                            if (i7 == -1) {
                                i7 = this.n;
                            }
                            this.p = i7;
                        } else {
                            iIntValue = -1;
                        }
                        f = -1.0f;
                        i4 = this.o;
                        if (i4 != iIntValue) {
                            f = (this.n * i4) / (this.m * i5);
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.a != null) {
                            iIntValue = ((Integer) MatroskaExtractor.d3.get(this.a)).intValue();
                        }
                        if (this.r == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        builder.setWidth(this.m).setHeight(this.n).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.v).setStereoMode(this.w).setColorInfo(colorInfo);
                        i8 = 2;
                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                    }
                    if (this.a != null) {
                        builder.setLabel(this.a);
                    }
                    Format formatBuild5 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.W).setSelectionFlags(i110).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.l).build();
                    TrackOutput trackOutputTrack5 = extractorOutput.track(this.c, i8);
                    this.X = trackOutputTrack5;
                    trackOutputTrack5.format(formatBuild5);
                    return;
                case 5:
                    str6 = MimeTypes.AUDIO_MPEG_L2;
                    listSingletonList = null;
                    str = null;
                    pcmEncoding = -1;
                    i2 = 4096;
                    bArr = this.N;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str6 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str6;
                    int i111 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i112 = i111 | i3;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.O).setSampleRate(this.Q).setPcmEncoding(pcmEncoding);
                        i8 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.q == 0) {
                            i6 = this.o;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.m;
                            }
                            this.o = i6;
                            i7 = this.p;
                            if (i7 == -1) {
                                i7 = this.n;
                            }
                            this.p = i7;
                        } else {
                            iIntValue = -1;
                        }
                        f = -1.0f;
                        i4 = this.o;
                        if (i4 != iIntValue) {
                            f = (this.n * i4) / (this.m * i5);
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.a != null) {
                            iIntValue = ((Integer) MatroskaExtractor.d3.get(this.a)).intValue();
                        }
                        if (this.r == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        builder.setWidth(this.m).setHeight(this.n).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.v).setStereoMode(this.w).setColorInfo(colorInfo);
                        i8 = 2;
                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                    }
                    if (this.a != null) {
                        builder.setLabel(this.a);
                    }
                    Format formatBuild6 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.W).setSelectionFlags(i112).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.l).build();
                    TrackOutput trackOutputTrack6 = extractorOutput.track(this.c, i8);
                    this.X = trackOutputTrack6;
                    trackOutputTrack6.format(formatBuild6);
                    return;
                case 6:
                    str6 = MimeTypes.AUDIO_MPEG;
                    listSingletonList = null;
                    str = null;
                    pcmEncoding = -1;
                    i2 = 4096;
                    bArr = this.N;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str6 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str6;
                    int i113 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i114 = i113 | i3;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.O).setSampleRate(this.Q).setPcmEncoding(pcmEncoding);
                        i8 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.q == 0) {
                            i6 = this.o;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.m;
                            }
                            this.o = i6;
                            i7 = this.p;
                            if (i7 == -1) {
                                i7 = this.n;
                            }
                            this.p = i7;
                        } else {
                            iIntValue = -1;
                        }
                        f = -1.0f;
                        i4 = this.o;
                        if (i4 != iIntValue) {
                            f = (this.n * i4) / (this.m * i5);
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.a != null) {
                            iIntValue = ((Integer) MatroskaExtractor.d3.get(this.a)).intValue();
                        }
                        if (this.r == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        builder.setWidth(this.m).setHeight(this.n).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.v).setStereoMode(this.w).setColorInfo(colorInfo);
                        i8 = 2;
                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                    }
                    if (this.a != null) {
                        builder.setLabel(this.a);
                    }
                    Format formatBuild7 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.W).setSelectionFlags(i114).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.l).build();
                    TrackOutput trackOutputTrack7 = extractorOutput.track(this.c, i8);
                    this.X = trackOutputTrack7;
                    trackOutputTrack7.format(formatBuild7);
                    return;
                case 7:
                    str5 = MimeTypes.APPLICATION_PGS;
                    Pair<String, List<byte[]>> pairJ = j(new ParsableByteArray(f(this.b)));
                    str6 = (String) pairJ.first;
                    listSingletonList = (List) pairJ.second;
                    str = null;
                    pcmEncoding = -1;
                    i2 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str6 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str6;
                    int i115 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i116 = i115 | i3;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.O).setSampleRate(this.Q).setPcmEncoding(pcmEncoding);
                        i8 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.q == 0) {
                            i6 = this.o;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.m;
                            }
                            this.o = i6;
                            i7 = this.p;
                            if (i7 == -1) {
                                i7 = this.n;
                            }
                            this.p = i7;
                        } else {
                            iIntValue = -1;
                        }
                        f = -1.0f;
                        i4 = this.o;
                        if (i4 != iIntValue) {
                            f = (this.n * i4) / (this.m * i5);
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.a != null) {
                            iIntValue = ((Integer) MatroskaExtractor.d3.get(this.a)).intValue();
                        }
                        if (this.r == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        builder.setWidth(this.m).setHeight(this.n).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.v).setStereoMode(this.w).setColorInfo(colorInfo);
                        i8 = 2;
                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                    }
                    if (this.a != null) {
                        builder.setLabel(this.a);
                    }
                    Format formatBuild8 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.W).setSelectionFlags(i116).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.l).build();
                    TrackOutput trackOutputTrack8 = extractorOutput.track(this.c, i8);
                    this.X = trackOutputTrack8;
                    trackOutputTrack8.format(formatBuild8);
                    return;
                case 8:
                    str5 = MimeTypes.APPLICATION_PGS;
                    byte[] bArr3 = new byte[4];
                    System.arraycopy(f(this.b), 0, bArr3, 0, 4);
                    listSingletonList = ImmutableList.of(bArr3);
                    str6 = MimeTypes.APPLICATION_DVBSUBS;
                    str = null;
                    pcmEncoding = -1;
                    i2 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str6 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str6;
                    int i117 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i118 = i117 | i3;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.O).setSampleRate(this.Q).setPcmEncoding(pcmEncoding);
                        i8 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.q == 0) {
                            i6 = this.o;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.m;
                            }
                            this.o = i6;
                            i7 = this.p;
                            if (i7 == -1) {
                                i7 = this.n;
                            }
                            this.p = i7;
                        } else {
                            iIntValue = -1;
                        }
                        f = -1.0f;
                        i4 = this.o;
                        if (i4 != iIntValue) {
                            f = (this.n * i4) / (this.m * i5);
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.a != null) {
                            iIntValue = ((Integer) MatroskaExtractor.d3.get(this.a)).intValue();
                        }
                        if (this.r == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        builder.setWidth(this.m).setHeight(this.n).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.v).setStereoMode(this.w).setColorInfo(colorInfo);
                        i8 = 2;
                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                    }
                    if (this.a != null) {
                        builder.setLabel(this.a);
                    }
                    Format formatBuild9 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.W).setSelectionFlags(i118).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.l).build();
                    TrackOutput trackOutputTrack9 = extractorOutput.track(this.c, i8);
                    this.X = trackOutputTrack9;
                    trackOutputTrack9.format(formatBuild9);
                    return;
                case 10:
                    AvcConfig avcConfig = AvcConfig.parse(new ParsableByteArray(f(this.b)));
                    list = avcConfig.initializationData;
                    this.Y = avcConfig.nalUnitLengthFieldLength;
                    str2 = avcConfig.codecs;
                    str6 = MimeTypes.VIDEO_H264;
                    pcmEncoding = -1;
                    i2 = -1;
                    List<byte[]> list2 = list;
                    str = str2;
                    listSingletonList = list2;
                    bArr = this.N;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str6 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str6;
                    int i119 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1110 = i119 | i3;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.O).setSampleRate(this.Q).setPcmEncoding(pcmEncoding);
                        i8 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.q == 0) {
                            i6 = this.o;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.m;
                            }
                            this.o = i6;
                            i7 = this.p;
                            if (i7 == -1) {
                                i7 = this.n;
                            }
                            this.p = i7;
                        } else {
                            iIntValue = -1;
                        }
                        f = -1.0f;
                        i4 = this.o;
                        if (i4 != iIntValue) {
                            f = (this.n * i4) / (this.m * i5);
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.a != null) {
                            iIntValue = ((Integer) MatroskaExtractor.d3.get(this.a)).intValue();
                        }
                        if (this.r == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        builder.setWidth(this.m).setHeight(this.n).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.v).setStereoMode(this.w).setColorInfo(colorInfo);
                        i8 = 2;
                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                    }
                    if (this.a != null) {
                        builder.setLabel(this.a);
                    }
                    Format formatBuild10 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.W).setSelectionFlags(i1110).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.l).build();
                    TrackOutput trackOutputTrack10 = extractorOutput.track(this.c, i8);
                    this.X = trackOutputTrack10;
                    trackOutputTrack10.format(formatBuild10);
                    return;
                case 11:
                    str5 = MimeTypes.APPLICATION_PGS;
                    listSingletonList = ImmutableList.of(f(this.b));
                    str6 = MimeTypes.APPLICATION_VOBSUB;
                    str = null;
                    pcmEncoding = -1;
                    i2 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str6 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str6;
                    int i1111 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1112 = i1111 | i3;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.O).setSampleRate(this.Q).setPcmEncoding(pcmEncoding);
                        i8 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.q == 0) {
                            i6 = this.o;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.m;
                            }
                            this.o = i6;
                            i7 = this.p;
                            if (i7 == -1) {
                                i7 = this.n;
                            }
                            this.p = i7;
                        } else {
                            iIntValue = -1;
                        }
                        f = -1.0f;
                        i4 = this.o;
                        if (i4 != iIntValue) {
                            f = (this.n * i4) / (this.m * i5);
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.a != null) {
                            iIntValue = ((Integer) MatroskaExtractor.d3.get(this.a)).intValue();
                        }
                        if (this.r == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        builder.setWidth(this.m).setHeight(this.n).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.v).setStereoMode(this.w).setColorInfo(colorInfo);
                        i8 = 2;
                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                    }
                    if (this.a != null) {
                        builder.setLabel(this.a);
                    }
                    Format formatBuild11 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.W).setSelectionFlags(i1112).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.l).build();
                    TrackOutput trackOutputTrack11 = extractorOutput.track(this.c, i8);
                    this.X = trackOutputTrack11;
                    trackOutputTrack11.format(formatBuild11);
                    return;
                case 12:
                    str5 = MimeTypes.APPLICATION_PGS;
                    str6 = MimeTypes.AUDIO_DTS_HD;
                    listSingletonList = null;
                    str = null;
                    pcmEncoding = -1;
                    i2 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str6 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str6;
                    int i1113 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1114 = i1113 | i3;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.O).setSampleRate(this.Q).setPcmEncoding(pcmEncoding);
                        i8 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.q == 0) {
                            i6 = this.o;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.m;
                            }
                            this.o = i6;
                            i7 = this.p;
                            if (i7 == -1) {
                                i7 = this.n;
                            }
                            this.p = i7;
                        } else {
                            iIntValue = -1;
                        }
                        f = -1.0f;
                        i4 = this.o;
                        if (i4 != iIntValue) {
                            f = (this.n * i4) / (this.m * i5);
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.a != null) {
                            iIntValue = ((Integer) MatroskaExtractor.d3.get(this.a)).intValue();
                        }
                        if (this.r == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        builder.setWidth(this.m).setHeight(this.n).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.v).setStereoMode(this.w).setColorInfo(colorInfo);
                        i8 = 2;
                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                    }
                    if (this.a != null) {
                        builder.setLabel(this.a);
                    }
                    Format formatBuild12 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.W).setSelectionFlags(i1114).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.l).build();
                    TrackOutput trackOutputTrack12 = extractorOutput.track(this.c, i8);
                    this.X = trackOutputTrack12;
                    trackOutputTrack12.format(formatBuild12);
                    return;
                case 13:
                    str5 = MimeTypes.APPLICATION_PGS;
                    listSingletonList = Collections.singletonList(f(this.b));
                    AacUtil.Config audioSpecificConfig = AacUtil.parseAudioSpecificConfig(this.k);
                    this.Q = audioSpecificConfig.sampleRateHz;
                    this.O = audioSpecificConfig.channelCount;
                    str = audioSpecificConfig.codecs;
                    str6 = MimeTypes.AUDIO_AAC;
                    pcmEncoding = -1;
                    i2 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str6 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str6;
                    int i1115 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1116 = i1115 | i3;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.O).setSampleRate(this.Q).setPcmEncoding(pcmEncoding);
                        i8 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.q == 0) {
                            i6 = this.o;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.m;
                            }
                            this.o = i6;
                            i7 = this.p;
                            if (i7 == -1) {
                                i7 = this.n;
                            }
                            this.p = i7;
                        } else {
                            iIntValue = -1;
                        }
                        f = -1.0f;
                        i4 = this.o;
                        if (i4 != iIntValue) {
                            f = (this.n * i4) / (this.m * i5);
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.a != null) {
                            iIntValue = ((Integer) MatroskaExtractor.d3.get(this.a)).intValue();
                        }
                        if (this.r == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        builder.setWidth(this.m).setHeight(this.n).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.v).setStereoMode(this.w).setColorInfo(colorInfo);
                        i8 = 2;
                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                    }
                    if (this.a != null) {
                        builder.setLabel(this.a);
                    }
                    Format formatBuild13 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.W).setSelectionFlags(i1116).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.l).build();
                    TrackOutput trackOutputTrack13 = extractorOutput.track(this.c, i8);
                    this.X = trackOutputTrack13;
                    trackOutputTrack13.format(formatBuild13);
                    return;
                case 14:
                    str5 = MimeTypes.APPLICATION_PGS;
                    str6 = MimeTypes.AUDIO_AC3;
                    listSingletonList = null;
                    str = null;
                    pcmEncoding = -1;
                    i2 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str6 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str6;
                    int i1117 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1118 = i1117 | i3;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.O).setSampleRate(this.Q).setPcmEncoding(pcmEncoding);
                        i8 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.q == 0) {
                            i6 = this.o;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.m;
                            }
                            this.o = i6;
                            i7 = this.p;
                            if (i7 == -1) {
                                i7 = this.n;
                            }
                            this.p = i7;
                        } else {
                            iIntValue = -1;
                        }
                        f = -1.0f;
                        i4 = this.o;
                        if (i4 != iIntValue) {
                            f = (this.n * i4) / (this.m * i5);
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.a != null) {
                            iIntValue = ((Integer) MatroskaExtractor.d3.get(this.a)).intValue();
                        }
                        if (this.r == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        builder.setWidth(this.m).setHeight(this.n).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.v).setStereoMode(this.w).setColorInfo(colorInfo);
                        i8 = 2;
                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                    }
                    if (this.a != null) {
                        builder.setLabel(this.a);
                    }
                    Format formatBuild14 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.W).setSelectionFlags(i1118).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.l).build();
                    TrackOutput trackOutputTrack14 = extractorOutput.track(this.c, i8);
                    this.X = trackOutputTrack14;
                    trackOutputTrack14.format(formatBuild14);
                    return;
                case 15:
                case 21:
                    str5 = MimeTypes.APPLICATION_PGS;
                    str6 = MimeTypes.AUDIO_DTS;
                    listSingletonList = null;
                    str = null;
                    pcmEncoding = -1;
                    i2 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str6 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str6;
                    int i1119 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i11110 = i1119 | i3;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.O).setSampleRate(this.Q).setPcmEncoding(pcmEncoding);
                        i8 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.q == 0) {
                            i6 = this.o;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.m;
                            }
                            this.o = i6;
                            i7 = this.p;
                            if (i7 == -1) {
                                i7 = this.n;
                            }
                            this.p = i7;
                        } else {
                            iIntValue = -1;
                        }
                        f = -1.0f;
                        i4 = this.o;
                        if (i4 != iIntValue) {
                            f = (this.n * i4) / (this.m * i5);
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.a != null) {
                            iIntValue = ((Integer) MatroskaExtractor.d3.get(this.a)).intValue();
                        }
                        if (this.r == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        builder.setWidth(this.m).setHeight(this.n).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.v).setStereoMode(this.w).setColorInfo(colorInfo);
                        i8 = 2;
                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                    }
                    if (this.a != null) {
                        builder.setLabel(this.a);
                    }
                    Format formatBuild15 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.W).setSelectionFlags(i11110).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.l).build();
                    TrackOutput trackOutputTrack15 = extractorOutput.track(this.c, i8);
                    this.X = trackOutputTrack15;
                    trackOutputTrack15.format(formatBuild15);
                    return;
                case 16:
                    str5 = MimeTypes.APPLICATION_PGS;
                    str6 = MimeTypes.VIDEO_AV1;
                    listSingletonList = null;
                    str = null;
                    pcmEncoding = -1;
                    i2 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str6 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str6;
                    int i11111 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i11112 = i11111 | i3;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.O).setSampleRate(this.Q).setPcmEncoding(pcmEncoding);
                        i8 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.q == 0) {
                            i6 = this.o;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.m;
                            }
                            this.o = i6;
                            i7 = this.p;
                            if (i7 == -1) {
                                i7 = this.n;
                            }
                            this.p = i7;
                        } else {
                            iIntValue = -1;
                        }
                        f = -1.0f;
                        i4 = this.o;
                        if (i4 != iIntValue) {
                            f = (this.n * i4) / (this.m * i5);
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.a != null) {
                            iIntValue = ((Integer) MatroskaExtractor.d3.get(this.a)).intValue();
                        }
                        if (this.r == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        builder.setWidth(this.m).setHeight(this.n).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.v).setStereoMode(this.w).setColorInfo(colorInfo);
                        i8 = 2;
                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                    }
                    if (this.a != null) {
                        builder.setLabel(this.a);
                    }
                    Format formatBuild16 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.W).setSelectionFlags(i11112).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.l).build();
                    TrackOutput trackOutputTrack16 = extractorOutput.track(this.c, i8);
                    this.X = trackOutputTrack16;
                    trackOutputTrack16.format(formatBuild16);
                    return;
                case 17:
                    str5 = MimeTypes.APPLICATION_PGS;
                    str6 = MimeTypes.VIDEO_VP8;
                    listSingletonList = null;
                    str = null;
                    pcmEncoding = -1;
                    i2 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str6 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str6;
                    int i11113 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i11114 = i11113 | i3;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.O).setSampleRate(this.Q).setPcmEncoding(pcmEncoding);
                        i8 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.q == 0) {
                            i6 = this.o;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.m;
                            }
                            this.o = i6;
                            i7 = this.p;
                            if (i7 == -1) {
                                i7 = this.n;
                            }
                            this.p = i7;
                        } else {
                            iIntValue = -1;
                        }
                        f = -1.0f;
                        i4 = this.o;
                        if (i4 != iIntValue) {
                            f = (this.n * i4) / (this.m * i5);
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.a != null) {
                            iIntValue = ((Integer) MatroskaExtractor.d3.get(this.a)).intValue();
                        }
                        if (this.r == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        builder.setWidth(this.m).setHeight(this.n).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.v).setStereoMode(this.w).setColorInfo(colorInfo);
                        i8 = 2;
                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                    }
                    if (this.a != null) {
                        builder.setLabel(this.a);
                    }
                    Format formatBuild17 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.W).setSelectionFlags(i11114).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.l).build();
                    TrackOutput trackOutputTrack17 = extractorOutput.track(this.c, i8);
                    this.X = trackOutputTrack17;
                    trackOutputTrack17.format(formatBuild17);
                    return;
                case 18:
                    str5 = MimeTypes.APPLICATION_PGS;
                    str6 = MimeTypes.VIDEO_VP9;
                    listSingletonList = null;
                    str = null;
                    pcmEncoding = -1;
                    i2 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str6 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str6;
                    int i11115 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i11116 = i11115 | i3;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.O).setSampleRate(this.Q).setPcmEncoding(pcmEncoding);
                        i8 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.q == 0) {
                            i6 = this.o;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.m;
                            }
                            this.o = i6;
                            i7 = this.p;
                            if (i7 == -1) {
                                i7 = this.n;
                            }
                            this.p = i7;
                        } else {
                            iIntValue = -1;
                        }
                        f = -1.0f;
                        i4 = this.o;
                        if (i4 != iIntValue) {
                            f = (this.n * i4) / (this.m * i5);
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.a != null) {
                            iIntValue = ((Integer) MatroskaExtractor.d3.get(this.a)).intValue();
                        }
                        if (this.r == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        builder.setWidth(this.m).setHeight(this.n).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.v).setStereoMode(this.w).setColorInfo(colorInfo);
                        i8 = 2;
                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                    }
                    if (this.a != null) {
                        builder.setLabel(this.a);
                    }
                    Format formatBuild18 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.W).setSelectionFlags(i11116).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.l).build();
                    TrackOutput trackOutputTrack18 = extractorOutput.track(this.c, i8);
                    this.X = trackOutputTrack18;
                    trackOutputTrack18.format(formatBuild18);
                    return;
                case 19:
                    str5 = MimeTypes.APPLICATION_PGS;
                    str6 = str5;
                    listSingletonList = null;
                    str = null;
                    pcmEncoding = -1;
                    i2 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str6 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str6;
                    int i11117 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i11118 = i11117 | i3;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.O).setSampleRate(this.Q).setPcmEncoding(pcmEncoding);
                        i8 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.q == 0) {
                            i6 = this.o;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.m;
                            }
                            this.o = i6;
                            i7 = this.p;
                            if (i7 == -1) {
                                i7 = this.n;
                            }
                            this.p = i7;
                        } else {
                            iIntValue = -1;
                        }
                        f = -1.0f;
                        i4 = this.o;
                        if (i4 != iIntValue) {
                            f = (this.n * i4) / (this.m * i5);
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.a != null) {
                            iIntValue = ((Integer) MatroskaExtractor.d3.get(this.a)).intValue();
                        }
                        if (this.r == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        builder.setWidth(this.m).setHeight(this.n).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.v).setStereoMode(this.w).setColorInfo(colorInfo);
                        i8 = 2;
                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                    }
                    if (this.a != null) {
                        builder.setLabel(this.a);
                    }
                    Format formatBuild19 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.W).setSelectionFlags(i11118).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.l).build();
                    TrackOutput trackOutputTrack19 = extractorOutput.track(this.c, i8);
                    this.X = trackOutputTrack19;
                    trackOutputTrack19.format(formatBuild19);
                    return;
                case 20:
                    str5 = MimeTypes.APPLICATION_PGS;
                    str6 = MimeTypes.VIDEO_UNKNOWN;
                    listSingletonList = null;
                    str = null;
                    pcmEncoding = -1;
                    i2 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str6 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str6;
                    int i11119 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i111110 = i11119 | i3;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.O).setSampleRate(this.Q).setPcmEncoding(pcmEncoding);
                        i8 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.q == 0) {
                            i6 = this.o;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.m;
                            }
                            this.o = i6;
                            i7 = this.p;
                            if (i7 == -1) {
                                i7 = this.n;
                            }
                            this.p = i7;
                        } else {
                            iIntValue = -1;
                        }
                        f = -1.0f;
                        i4 = this.o;
                        if (i4 != iIntValue) {
                            f = (this.n * i4) / (this.m * i5);
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.a != null) {
                            iIntValue = ((Integer) MatroskaExtractor.d3.get(this.a)).intValue();
                        }
                        if (this.r == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        builder.setWidth(this.m).setHeight(this.n).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.v).setStereoMode(this.w).setColorInfo(colorInfo);
                        i8 = 2;
                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                    }
                    if (this.a != null) {
                        builder.setLabel(this.a);
                    }
                    Format formatBuild110 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.W).setSelectionFlags(i111110).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.l).build();
                    TrackOutput trackOutputTrack110 = extractorOutput.track(this.c, i8);
                    this.X = trackOutputTrack110;
                    trackOutputTrack110.format(formatBuild110);
                    return;
                case 22:
                    str5 = MimeTypes.APPLICATION_PGS;
                    int i20 = this.P;
                    if (i20 == 32) {
                        listSingletonList = null;
                        str = null;
                    } else {
                        StringBuilder sb2 = new StringBuilder(MimeTypes.AUDIO_UNKNOWN.length() + 75);
                        sb2.append("Unsupported floating point PCM bit depth: ");
                        sb2.append(i20);
                        sb2.append(". Setting mimeType to ");
                        sb2.append(MimeTypes.AUDIO_UNKNOWN);
                        Log.w(MatroskaExtractor.b0, sb2.toString());
                        str6 = MimeTypes.AUDIO_UNKNOWN;
                        listSingletonList = null;
                        str = null;
                        pcmEncoding = -1;
                    }
                    i2 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str6 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str6;
                    int i111111 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i111112 = i111111 | i3;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.O).setSampleRate(this.Q).setPcmEncoding(pcmEncoding);
                        i8 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.q == 0) {
                            i6 = this.o;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.m;
                            }
                            this.o = i6;
                            i7 = this.p;
                            if (i7 == -1) {
                                i7 = this.n;
                            }
                            this.p = i7;
                        } else {
                            iIntValue = -1;
                        }
                        f = -1.0f;
                        i4 = this.o;
                        if (i4 != iIntValue) {
                            f = (this.n * i4) / (this.m * i5);
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.a != null) {
                            iIntValue = ((Integer) MatroskaExtractor.d3.get(this.a)).intValue();
                        }
                        if (this.r == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        builder.setWidth(this.m).setHeight(this.n).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.v).setStereoMode(this.w).setColorInfo(colorInfo);
                        i8 = 2;
                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                    }
                    if (this.a != null) {
                        builder.setLabel(this.a);
                    }
                    Format formatBuild111 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.W).setSelectionFlags(i111112).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.l).build();
                    TrackOutput trackOutputTrack111 = extractorOutput.track(this.c, i8);
                    this.X = trackOutputTrack111;
                    trackOutputTrack111.format(formatBuild111);
                    return;
                case 23:
                    str5 = MimeTypes.APPLICATION_PGS;
                    int i21 = this.P;
                    if (i21 == 8) {
                        listSingletonList = null;
                        str = null;
                        pcmEncoding = 3;
                    } else if (i21 == 16) {
                        pcmEncoding = 268435456;
                        listSingletonList = null;
                        str = null;
                    } else {
                        StringBuilder sb3 = new StringBuilder(MimeTypes.AUDIO_UNKNOWN.length() + 71);
                        sb3.append("Unsupported big endian PCM bit depth: ");
                        sb3.append(i21);
                        sb3.append(". Setting mimeType to ");
                        sb3.append(MimeTypes.AUDIO_UNKNOWN);
                        Log.w(MatroskaExtractor.b0, sb3.toString());
                        str6 = MimeTypes.AUDIO_UNKNOWN;
                        listSingletonList = null;
                        str = null;
                        pcmEncoding = -1;
                    }
                    i2 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str6 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str6;
                    int i111113 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i111114 = i111113 | i3;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.O).setSampleRate(this.Q).setPcmEncoding(pcmEncoding);
                        i8 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.q == 0) {
                            i6 = this.o;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.m;
                            }
                            this.o = i6;
                            i7 = this.p;
                            if (i7 == -1) {
                                i7 = this.n;
                            }
                            this.p = i7;
                        } else {
                            iIntValue = -1;
                        }
                        f = -1.0f;
                        i4 = this.o;
                        if (i4 != iIntValue) {
                            f = (this.n * i4) / (this.m * i5);
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.a != null) {
                            iIntValue = ((Integer) MatroskaExtractor.d3.get(this.a)).intValue();
                        }
                        if (this.r == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        builder.setWidth(this.m).setHeight(this.n).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.v).setStereoMode(this.w).setColorInfo(colorInfo);
                        i8 = 2;
                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                    }
                    if (this.a != null) {
                        builder.setLabel(this.a);
                    }
                    Format formatBuild112 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.W).setSelectionFlags(i111114).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.l).build();
                    TrackOutput trackOutputTrack112 = extractorOutput.track(this.c, i8);
                    this.X = trackOutputTrack112;
                    trackOutputTrack112.format(formatBuild112);
                    return;
                case 24:
                    str5 = MimeTypes.APPLICATION_PGS;
                    pcmEncoding = Util.getPcmEncoding(this.P);
                    if (pcmEncoding == 0) {
                        int i22 = this.P;
                        StringBuilder sb4 = new StringBuilder(MimeTypes.AUDIO_UNKNOWN.length() + 74);
                        sb4.append("Unsupported little endian PCM bit depth: ");
                        sb4.append(i22);
                        sb4.append(". Setting mimeType to ");
                        sb4.append(MimeTypes.AUDIO_UNKNOWN);
                        Log.w(MatroskaExtractor.b0, sb4.toString());
                        str6 = MimeTypes.AUDIO_UNKNOWN;
                        listSingletonList = null;
                        str = null;
                        pcmEncoding = -1;
                    } else {
                        listSingletonList = null;
                        str = null;
                    }
                    i2 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str6 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str6;
                    int i111115 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i111116 = i111115 | i3;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.O).setSampleRate(this.Q).setPcmEncoding(pcmEncoding);
                        i8 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.q == 0) {
                            i6 = this.o;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.m;
                            }
                            this.o = i6;
                            i7 = this.p;
                            if (i7 == -1) {
                                i7 = this.n;
                            }
                            this.p = i7;
                        } else {
                            iIntValue = -1;
                        }
                        f = -1.0f;
                        i4 = this.o;
                        if (i4 != iIntValue) {
                            f = (this.n * i4) / (this.m * i5);
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.a != null) {
                            iIntValue = ((Integer) MatroskaExtractor.d3.get(this.a)).intValue();
                        }
                        if (this.r == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        builder.setWidth(this.m).setHeight(this.n).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.v).setStereoMode(this.w).setColorInfo(colorInfo);
                        i8 = 2;
                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                    }
                    if (this.a != null) {
                        builder.setLabel(this.a);
                    }
                    Format formatBuild113 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.W).setSelectionFlags(i111116).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.l).build();
                    TrackOutput trackOutputTrack113 = extractorOutput.track(this.c, i8);
                    this.X = trackOutputTrack113;
                    trackOutputTrack113.format(formatBuild113);
                    return;
                case 25:
                    str5 = MimeTypes.APPLICATION_PGS;
                    listSingletonList = ImmutableList.of(MatroskaExtractor.U2, f(this.b));
                    str6 = MimeTypes.TEXT_SSA;
                    str = null;
                    pcmEncoding = -1;
                    i2 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str6 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str6;
                    int i111117 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i111118 = i111117 | i3;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.O).setSampleRate(this.Q).setPcmEncoding(pcmEncoding);
                        i8 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.q == 0) {
                            i6 = this.o;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.m;
                            }
                            this.o = i6;
                            i7 = this.p;
                            if (i7 == -1) {
                                i7 = this.n;
                            }
                            this.p = i7;
                        } else {
                            iIntValue = -1;
                        }
                        f = -1.0f;
                        i4 = this.o;
                        if (i4 != iIntValue) {
                            f = (this.n * i4) / (this.m * i5);
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.a != null) {
                            iIntValue = ((Integer) MatroskaExtractor.d3.get(this.a)).intValue();
                        }
                        if (this.r == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        builder.setWidth(this.m).setHeight(this.n).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.v).setStereoMode(this.w).setColorInfo(colorInfo);
                        i8 = 2;
                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                    }
                    if (this.a != null) {
                        builder.setLabel(this.a);
                    }
                    Format formatBuild114 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.W).setSelectionFlags(i111118).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.l).build();
                    TrackOutput trackOutputTrack114 = extractorOutput.track(this.c, i8);
                    this.X = trackOutputTrack114;
                    trackOutputTrack114.format(formatBuild114);
                    return;
                case 26:
                    HevcConfig hevcConfig = HevcConfig.parse(new ParsableByteArray(f(this.b)));
                    list = hevcConfig.initializationData;
                    this.Y = hevcConfig.nalUnitLengthFieldLength;
                    str2 = hevcConfig.codecs;
                    str6 = MimeTypes.VIDEO_H265;
                    pcmEncoding = -1;
                    i2 = -1;
                    List<byte[]> list3 = list;
                    str = str2;
                    listSingletonList = list3;
                    bArr = this.N;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str6 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str6;
                    int i111119 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1111110 = i111119 | i3;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.O).setSampleRate(this.Q).setPcmEncoding(pcmEncoding);
                        i8 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.q == 0) {
                            i6 = this.o;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.m;
                            }
                            this.o = i6;
                            i7 = this.p;
                            if (i7 == -1) {
                                i7 = this.n;
                            }
                            this.p = i7;
                        } else {
                            iIntValue = -1;
                        }
                        f = -1.0f;
                        i4 = this.o;
                        if (i4 != iIntValue) {
                            f = (this.n * i4) / (this.m * i5);
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.a != null) {
                            iIntValue = ((Integer) MatroskaExtractor.d3.get(this.a)).intValue();
                        }
                        if (this.r == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        builder.setWidth(this.m).setHeight(this.n).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.v).setStereoMode(this.w).setColorInfo(colorInfo);
                        i8 = 2;
                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                    }
                    if (this.a != null) {
                        builder.setLabel(this.a);
                    }
                    Format formatBuild115 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.W).setSelectionFlags(i1111110).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.l).build();
                    TrackOutput trackOutputTrack115 = extractorOutput.track(this.c, i8);
                    this.X = trackOutputTrack115;
                    trackOutputTrack115.format(formatBuild115);
                    return;
                case 27:
                    str5 = MimeTypes.APPLICATION_PGS;
                    str6 = MimeTypes.APPLICATION_SUBRIP;
                    listSingletonList = null;
                    str = null;
                    pcmEncoding = -1;
                    i2 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str6 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str6;
                    int i1111111 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1111112 = i1111111 | i3;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.O).setSampleRate(this.Q).setPcmEncoding(pcmEncoding);
                        i8 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.q == 0) {
                            i6 = this.o;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.m;
                            }
                            this.o = i6;
                            i7 = this.p;
                            if (i7 == -1) {
                                i7 = this.n;
                            }
                            this.p = i7;
                        } else {
                            iIntValue = -1;
                        }
                        f = -1.0f;
                        i4 = this.o;
                        if (i4 != iIntValue) {
                            f = (this.n * i4) / (this.m * i5);
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.a != null) {
                            iIntValue = ((Integer) MatroskaExtractor.d3.get(this.a)).intValue();
                        }
                        if (this.r == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        builder.setWidth(this.m).setHeight(this.n).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.v).setStereoMode(this.w).setColorInfo(colorInfo);
                        i8 = 2;
                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                    }
                    if (this.a != null) {
                        builder.setLabel(this.a);
                    }
                    Format formatBuild116 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.W).setSelectionFlags(i1111112).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.l).build();
                    TrackOutput trackOutputTrack116 = extractorOutput.track(this.c, i8);
                    this.X = trackOutputTrack116;
                    trackOutputTrack116.format(formatBuild116);
                    return;
                case 28:
                    str5 = MimeTypes.APPLICATION_PGS;
                    str6 = MimeTypes.VIDEO_MPEG2;
                    listSingletonList = null;
                    str = null;
                    pcmEncoding = -1;
                    i2 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str6 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str6;
                    int i1111113 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1111114 = i1111113 | i3;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.O).setSampleRate(this.Q).setPcmEncoding(pcmEncoding);
                        i8 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.q == 0) {
                            i6 = this.o;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.m;
                            }
                            this.o = i6;
                            i7 = this.p;
                            if (i7 == -1) {
                                i7 = this.n;
                            }
                            this.p = i7;
                        } else {
                            iIntValue = -1;
                        }
                        f = -1.0f;
                        i4 = this.o;
                        if (i4 != iIntValue) {
                            f = (this.n * i4) / (this.m * i5);
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.a != null) {
                            iIntValue = ((Integer) MatroskaExtractor.d3.get(this.a)).intValue();
                        }
                        if (this.r == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        builder.setWidth(this.m).setHeight(this.n).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.v).setStereoMode(this.w).setColorInfo(colorInfo);
                        i8 = 2;
                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                    }
                    if (this.a != null) {
                        builder.setLabel(this.a);
                    }
                    Format formatBuild117 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.W).setSelectionFlags(i1111114).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.l).build();
                    TrackOutput trackOutputTrack117 = extractorOutput.track(this.c, i8);
                    this.X = trackOutputTrack117;
                    trackOutputTrack117.format(formatBuild117);
                    return;
                case 29:
                    str5 = MimeTypes.APPLICATION_PGS;
                    str6 = MimeTypes.AUDIO_E_AC3;
                    listSingletonList = null;
                    str = null;
                    pcmEncoding = -1;
                    i2 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str6 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str6;
                    int i1111115 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1111116 = i1111115 | i3;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.O).setSampleRate(this.Q).setPcmEncoding(pcmEncoding);
                        i8 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.q == 0) {
                            i6 = this.o;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.m;
                            }
                            this.o = i6;
                            i7 = this.p;
                            if (i7 == -1) {
                                i7 = this.n;
                            }
                            this.p = i7;
                        } else {
                            iIntValue = -1;
                        }
                        f = -1.0f;
                        i4 = this.o;
                        if (i4 != iIntValue) {
                            f = (this.n * i4) / (this.m * i5);
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.a != null) {
                            iIntValue = ((Integer) MatroskaExtractor.d3.get(this.a)).intValue();
                        }
                        if (this.r == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        builder.setWidth(this.m).setHeight(this.n).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.v).setStereoMode(this.w).setColorInfo(colorInfo);
                        i8 = 2;
                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                    }
                    if (this.a != null) {
                        builder.setLabel(this.a);
                    }
                    Format formatBuild118 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.W).setSelectionFlags(i1111116).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.l).build();
                    TrackOutput trackOutputTrack118 = extractorOutput.track(this.c, i8);
                    this.X = trackOutputTrack118;
                    trackOutputTrack118.format(formatBuild118);
                    return;
                case 30:
                    str5 = MimeTypes.APPLICATION_PGS;
                    listSingletonList = Collections.singletonList(f(this.b));
                    str6 = MimeTypes.AUDIO_FLAC;
                    str = null;
                    pcmEncoding = -1;
                    i2 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str6 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str6;
                    int i1111117 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1111118 = i1111117 | i3;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.O).setSampleRate(this.Q).setPcmEncoding(pcmEncoding);
                        i8 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.q == 0) {
                            i6 = this.o;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.m;
                            }
                            this.o = i6;
                            i7 = this.p;
                            if (i7 == -1) {
                                i7 = this.n;
                            }
                            this.p = i7;
                        } else {
                            iIntValue = -1;
                        }
                        f = -1.0f;
                        i4 = this.o;
                        if (i4 != iIntValue) {
                            f = (this.n * i4) / (this.m * i5);
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.a != null) {
                            iIntValue = ((Integer) MatroskaExtractor.d3.get(this.a)).intValue();
                        }
                        if (this.r == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        builder.setWidth(this.m).setHeight(this.n).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.v).setStereoMode(this.w).setColorInfo(colorInfo);
                        i8 = 2;
                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                    }
                    if (this.a != null) {
                        builder.setLabel(this.a);
                    }
                    Format formatBuild119 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.W).setSelectionFlags(i1111118).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.l).build();
                    TrackOutput trackOutputTrack119 = extractorOutput.track(this.c, i8);
                    this.X = trackOutputTrack119;
                    trackOutputTrack119.format(formatBuild119);
                    return;
                case 31:
                    i2 = MatroskaExtractor.P0;
                    listSingletonList = new ArrayList<>(3);
                    listSingletonList.add(f(this.b));
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    listSingletonList.add(byteBufferAllocate.order(byteOrder).putLong(this.R).array());
                    listSingletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.S).array());
                    str6 = MimeTypes.AUDIO_OPUS;
                    str = null;
                    pcmEncoding = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str6 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str6;
                    int i1111119 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i11111110 = i1111119 | i3;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.O).setSampleRate(this.Q).setPcmEncoding(pcmEncoding);
                        i8 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.q == 0) {
                            i6 = this.o;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.m;
                            }
                            this.o = i6;
                            i7 = this.p;
                            if (i7 == -1) {
                                i7 = this.n;
                            }
                            this.p = i7;
                        } else {
                            iIntValue = -1;
                        }
                        f = -1.0f;
                        i4 = this.o;
                        if (i4 != iIntValue) {
                            f = (this.n * i4) / (this.m * i5);
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.a != null) {
                            iIntValue = ((Integer) MatroskaExtractor.d3.get(this.a)).intValue();
                        }
                        if (this.r == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        builder.setWidth(this.m).setHeight(this.n).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.v).setStereoMode(this.w).setColorInfo(colorInfo);
                        i8 = 2;
                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                    }
                    if (this.a != null) {
                        builder.setLabel(this.a);
                    }
                    Format formatBuild1110 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.W).setSelectionFlags(i11111110).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.l).build();
                    TrackOutput trackOutputTrack1110 = extractorOutput.track(this.c, i8);
                    this.X = trackOutputTrack1110;
                    trackOutputTrack1110.format(formatBuild1110);
                    return;
                default:
                    throw ParserException.createForMalformedContainer("Unrecognized codec identifier.", null);
            }
        }

        @RequiresNonNull({"output"})
        public void i() {
            d dVar = this.T;
            if (dVar != null) {
                dVar.a(this);
            }
        }

        public void m() {
            d dVar = this.T;
            if (dVar != null) {
                dVar.b();
            }
        }
    }

    public static final class d {
        private final byte[] a = new byte[10];
        private boolean b;
        private int c;
        private long d;
        private int e;
        private int f;
        private int g;

        @RequiresNonNull({"#1.output"})
        public void a(c track) {
            if (this.c > 0) {
                track.X.sampleMetadata(this.d, this.e, this.f, this.g, track.j);
                this.c = 0;
            }
        }

        public void b() {
            this.b = false;
            this.c = 0;
        }

        @RequiresNonNull({"#1.output"})
        public void c(c track, long timeUs, int flags, int size, int offset) {
            if (this.b) {
                int i = this.c;
                int i2 = i + 1;
                this.c = i2;
                if (i == 0) {
                    this.d = timeUs;
                    this.e = flags;
                    this.f = 0;
                }
                this.f += size;
                this.g = offset;
                if (i2 >= 16) {
                    a(track);
                }
            }
        }

        public void d(ExtractorInput input) throws IOException {
            if (this.b) {
                return;
            }
            input.peekFully(this.a, 0, 10);
            input.resetPeekPosition();
            if (Ac3Util.parseTrueHdSyncframeAudioSampleCount(this.a) == 0) {
                return;
            }
            this.b = true;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        d3 = Collections.unmodifiableMap(map);
    }

    public MatroskaExtractor() {
        this(0);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private void e(int id) throws ParserException {
        if (this.C == null || this.D == null) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Element ");
            sb.append(id);
            sb.append(" must be in a Cues");
            throw ParserException.createForMalformedContainer(sb.toString(), null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private void f(int id) throws ParserException {
        if (this.u != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("Element ");
        sb.append(id);
        sb.append(" must be in a TrackEntry");
        throw ParserException.createForMalformedContainer(sb.toString(), null);
    }

    @EnsuresNonNull({"extractorOutput"})
    private void g() {
        Assertions.checkStateNotNull(this.a0);
    }

    private SeekMap h(@Nullable LongArray cueTimesUs, @Nullable LongArray cueClusterPositions) {
        int i;
        if (this.q == -1 || this.t == C.TIME_UNSET || cueTimesUs == null || cueTimesUs.size() == 0 || cueClusterPositions == null || cueClusterPositions.size() != cueTimesUs.size()) {
            return new SeekMap.Unseekable(this.t);
        }
        int size = cueTimesUs.size();
        int[] iArrCopyOf = new int[size];
        long[] jArrCopyOf = new long[size];
        long[] jArrCopyOf2 = new long[size];
        long[] jArrCopyOf3 = new long[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            jArrCopyOf3[i4] = cueTimesUs.get(i4);
            jArrCopyOf[i4] = this.q + cueClusterPositions.get(i4);
        }
        while (true) {
            i = size - 1;
            if (i3 >= i) {
                break;
            }
            int i5 = i3 + 1;
            iArrCopyOf[i3] = (int) (jArrCopyOf[i5] - jArrCopyOf[i3]);
            jArrCopyOf2[i3] = jArrCopyOf3[i5] - jArrCopyOf3[i3];
            i3 = i5;
        }
        iArrCopyOf[i] = (int) ((this.q + this.p) - jArrCopyOf[i]);
        jArrCopyOf2[i] = this.t - jArrCopyOf3[i];
        long j = jArrCopyOf2[i];
        if (j <= 0) {
            StringBuilder sb = new StringBuilder(72);
            sb.append("Discarding last cue point with unexpected duration: ");
            sb.append(j);
            Log.w(b0, sb.toString());
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i);
        }
        return new ChunkIndex(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    @RequiresNonNull({"#1.output"})
    private void i(c track, long timeUs, int flags, int size, int offset) {
        d dVar = track.T;
        if (dVar != null) {
            dVar.c(track, timeUs, flags, size, offset);
        } else {
            if (J0.equals(track.b) || K0.equals(track.b)) {
                if (this.K > 1) {
                    Log.w(b0, "Skipping subtitle sample in laced block.");
                } else {
                    long j = this.I;
                    if (j == C.TIME_UNSET) {
                        Log.w(b0, "Skipping subtitle sample with no duration.");
                    } else {
                        t(track.b, j, this.k.getData());
                        for (int position = this.k.getPosition(); position < this.k.limit(); position++) {
                            if (this.k.getData()[position] == 0) {
                                this.k.setLimit(position);
                                break;
                            }
                        }
                        TrackOutput trackOutput = track.X;
                        ParsableByteArray parsableByteArray = this.k;
                        trackOutput.sampleData(parsableByteArray, parsableByteArray.limit());
                        size += this.k.limit();
                    }
                }
            }
            if ((268435456 & flags) != 0) {
                if (this.K > 1) {
                    flags &= -268435457;
                } else {
                    int iLimit = this.n.limit();
                    track.X.sampleData(this.n, iLimit, 2);
                    size += iLimit;
                }
            }
            track.X.sampleMetadata(timeUs, flags, size, offset, track.j);
        }
        this.F = true;
    }

    private static int[] j(@Nullable int[] array, int length) {
        if (array == null) {
            return new int[length];
        }
        return array.length >= length ? array : new int[Math.max(array.length * 2, length)];
    }

    private int k() {
        int i = this.S;
        r();
        return i;
    }

    private static byte[] l(long timeUs, String timecodeFormat, long lastTimecodeValueScalingFactor) {
        Assertions.checkArgument(timeUs != C.TIME_UNSET);
        int i = (int) (timeUs / 3600000000L);
        long j = timeUs - (((long) (i * 3600)) * 1000000);
        int i3 = (int) (j / 60000000);
        long j3 = j - (((long) (i3 * 60)) * 1000000);
        int i4 = (int) (j3 / 1000000);
        return Util.getUtf8Bytes(String.format(Locale.US, timecodeFormat, Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf((int) ((j3 - (((long) i4) * 1000000)) / lastTimecodeValueScalingFactor))));
    }

    private c m(int currentElementId) throws ParserException {
        f(currentElementId);
        return this.u;
    }

    private static boolean n(String codecId) {
        codecId.hashCode();
        switch (codecId) {
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/SP":
            case "A_MS/ACM":
            case "A_TRUEHD":
            case "A_VORBIS":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "V_MS/VFW/FOURCC":
            case "S_DVBSUB":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AVC":
            case "S_VOBSUB":
            case "A_DTS/LOSSLESS":
            case "A_AAC":
            case "A_AC3":
            case "A_DTS":
            case "V_AV1":
            case "V_VP8":
            case "V_VP9":
            case "S_HDMV/PGS":
            case "V_THEORA":
            case "A_DTS/EXPRESS":
            case "A_PCM/FLOAT/IEEE":
            case "A_PCM/INT/BIG":
            case "A_PCM/INT/LIT":
            case "S_TEXT/ASS":
            case "V_MPEGH/ISO/HEVC":
            case "S_TEXT/UTF8":
            case "V_MPEG2":
            case "A_EAC3":
            case "A_FLAC":
            case "A_OPUS":
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] o() {
        return new Extractor[]{new MatroskaExtractor()};
    }

    private boolean p(PositionHolder seekPosition, long currentPosition) {
        if (this.y) {
            this.A = currentPosition;
            seekPosition.position = this.z;
            this.y = false;
            return true;
        }
        if (this.v) {
            long j = this.A;
            if (j != -1) {
                seekPosition.position = j;
                this.A = -1L;
                return true;
            }
        }
        return false;
    }

    private void q(ExtractorInput input, int requiredLength) throws IOException {
        if (this.g.limit() >= requiredLength) {
            return;
        }
        if (this.g.capacity() < requiredLength) {
            ParsableByteArray parsableByteArray = this.g;
            parsableByteArray.ensureCapacity(Math.max(parsableByteArray.capacity() * 2, requiredLength));
        }
        input.readFully(this.g.getData(), this.g.limit(), requiredLength - this.g.limit());
        this.g.setLimit(requiredLength);
    }

    private void r() {
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = 0;
        this.Y = (byte) 0;
        this.Z = false;
        this.j.reset(0);
    }

    private long s(long unscaledTimecode) throws ParserException {
        long j = this.r;
        if (j != C.TIME_UNSET) {
            return Util.scaleLargeTimestamp(unscaledTimecode, j, 1000L);
        }
        throw ParserException.createForMalformedContainer("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static void t(String codecId, long durationUs, byte[] subtitleData) {
        byte[] bArrL;
        int i;
        codecId.hashCode();
        if (codecId.equals(K0)) {
            bArrL = l(durationUs, Y2, 10000L);
            i = 21;
        } else {
            if (!codecId.equals(J0)) {
                throw new IllegalArgumentException();
            }
            bArrL = l(durationUs, T2, 1000L);
            i = 19;
        }
        System.arraycopy(bArrL, 0, subtitleData, i, bArrL.length);
    }

    @RequiresNonNull({"#2.output"})
    private int u(ExtractorInput input, c track, int size) throws IOException {
        int i;
        if (J0.equals(track.b)) {
            v(input, Q2, size);
            return k();
        }
        if (K0.equals(track.b)) {
            v(input, V2, size);
            return k();
        }
        TrackOutput trackOutput = track.X;
        if (!this.U) {
            if (track.h) {
                this.O &= -1073741825;
                if (!this.V) {
                    input.readFully(this.g.getData(), 0, 1);
                    this.R++;
                    if ((this.g.getData()[0] & 128) == 128) {
                        throw ParserException.createForMalformedContainer("Extension bit is set in signal byte", null);
                    }
                    this.Y = this.g.getData()[0];
                    this.V = true;
                }
                byte b4 = this.Y;
                if ((b4 & 1) == 1) {
                    boolean z = (b4 & 2) == 2;
                    this.O |= 1073741824;
                    if (!this.Z) {
                        input.readFully(this.l.getData(), 0, 8);
                        this.R += 8;
                        this.Z = true;
                        this.g.getData()[0] = (byte) ((z ? 128 : 0) | 8);
                        this.g.setPosition(0);
                        trackOutput.sampleData(this.g, 1, 1);
                        this.S++;
                        this.l.setPosition(0);
                        trackOutput.sampleData(this.l, 8, 1);
                        this.S += 8;
                    }
                    if (z) {
                        if (!this.W) {
                            input.readFully(this.g.getData(), 0, 1);
                            this.R++;
                            this.g.setPosition(0);
                            this.X = this.g.readUnsignedByte();
                            this.W = true;
                        }
                        int i3 = this.X * 4;
                        this.g.reset(i3);
                        input.readFully(this.g.getData(), 0, i3);
                        this.R += i3;
                        short s = (short) ((this.X / 2) + 1);
                        int i4 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.o;
                        if (byteBuffer == null || byteBuffer.capacity() < i4) {
                            this.o = ByteBuffer.allocate(i4);
                        }
                        this.o.position(0);
                        this.o.putShort(s);
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            i = this.X;
                            if (i5 >= i) {
                                break;
                            }
                            int unsignedIntToInt = this.g.readUnsignedIntToInt();
                            if (i5 % 2 == 0) {
                                this.o.putShort((short) (unsignedIntToInt - i6));
                            } else {
                                this.o.putInt(unsignedIntToInt - i6);
                            }
                            i5++;
                            i6 = unsignedIntToInt;
                        }
                        int i7 = (size - this.R) - i6;
                        if (i % 2 == 1) {
                            this.o.putInt(i7);
                        } else {
                            this.o.putShort((short) i7);
                            this.o.putInt(0);
                        }
                        this.m.reset(this.o.array(), i4);
                        trackOutput.sampleData(this.m, i4, 1);
                        this.S += i4;
                    }
                }
            } else {
                byte[] bArr = track.i;
                if (bArr != null) {
                    this.j.reset(bArr, bArr.length);
                }
            }
            if (track.f > 0) {
                this.O |= 268435456;
                this.n.reset(0);
                this.g.reset(4);
                this.g.getData()[0] = (byte) ((size >> 24) & 255);
                this.g.getData()[1] = (byte) ((size >> 16) & 255);
                this.g.getData()[2] = (byte) ((size >> 8) & 255);
                this.g.getData()[3] = (byte) (size & 255);
                trackOutput.sampleData(this.g, 4, 2);
                this.S += 4;
            }
            this.U = true;
        }
        int iLimit = size + this.j.limit();
        if (!p0.equals(track.b) && !q0.equals(track.b)) {
            if (track.T != null) {
                Assertions.checkState(this.j.limit() == 0);
                track.T.d(input);
            }
            while (true) {
                int i8 = this.R;
                if (i8 >= iLimit) {
                    break;
                }
                int iW = w(input, trackOutput, iLimit - i8);
                this.R += iW;
                this.S += iW;
            }
        } else {
            byte[] data = this.f.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i9 = track.Y;
            int i10 = 4 - i9;
            while (this.R < iLimit) {
                int i11 = this.T;
                if (i11 == 0) {
                    x(input, data, i10, i9);
                    this.R += i9;
                    this.f.setPosition(0);
                    this.T = this.f.readUnsignedIntToInt();
                    this.e.setPosition(0);
                    trackOutput.sampleData(this.e, 4);
                    this.S += 4;
                } else {
                    int iW2 = w(input, trackOutput, i11);
                    this.R += iW2;
                    this.S += iW2;
                    this.T -= iW2;
                }
            }
        }
        if (t0.equals(track.b)) {
            this.h.setPosition(0);
            trackOutput.sampleData(this.h, 4);
            this.S += 4;
        }
        return k();
    }

    private void v(ExtractorInput input, byte[] samplePrefix, int size) throws IOException {
        int length = samplePrefix.length + size;
        if (this.k.capacity() < length) {
            this.k.reset(Arrays.copyOf(samplePrefix, length + size));
        } else {
            System.arraycopy(samplePrefix, 0, this.k.getData(), 0, samplePrefix.length);
        }
        input.readFully(this.k.getData(), samplePrefix.length, size);
        this.k.setPosition(0);
        this.k.setLimit(length);
    }

    private int w(ExtractorInput input, TrackOutput output, int length) throws IOException {
        int iBytesLeft = this.j.bytesLeft();
        if (iBytesLeft <= 0) {
            return output.sampleData((DataReader) input, length, false);
        }
        int iMin = Math.min(length, iBytesLeft);
        output.sampleData(this.j, iMin);
        return iMin;
    }

    private void x(ExtractorInput input, byte[] target, int offset, int length) throws IOException {
        int iMin = Math.min(length, this.j.bytesLeft());
        input.readFully(target, offset + iMin, length - iMin);
        if (iMin > 0) {
            this.j.readBytes(target, offset, iMin);
        }
    }

    /* JADX WARN: Code duplicated, block: B:98:0x0294  */
    @CallSuper
    public void binaryElement(int id, int contentSize, ExtractorInput input) throws IOException {
        c cVar;
        c cVar2;
        long j;
        long j3;
        int i;
        int i3;
        int[] iArr;
        int i4;
        int i5 = 0;
        int i6 = 1;
        if (id != 161 && id != 163) {
            if (id == 165) {
                if (this.G != 2) {
                    return;
                }
                handleBlockAdditionalData(this.c.get(this.M), this.P, input, contentSize);
                return;
            }
            if (id == A1) {
                handleBlockAddIDExtraData(m(id), input, contentSize);
                return;
            }
            if (id == W1) {
                f(id);
                byte[] bArr = new byte[contentSize];
                this.u.i = bArr;
                input.readFully(bArr, 0, contentSize);
                return;
            }
            if (id == Z1) {
                byte[] bArr2 = new byte[contentSize];
                input.readFully(bArr2, 0, contentSize);
                m(id).j = new TrackOutput.CryptoData(1, bArr2, 0, 0);
                return;
            }
            if (id == a1) {
                Arrays.fill(this.i.getData(), (byte) 0);
                input.readFully(this.i.getData(), 4 - contentSize, contentSize);
                this.i.setPosition(0);
                this.w = (int) this.i.readUnsignedInt();
                return;
            }
            if (id == D1) {
                f(id);
                byte[] bArr3 = new byte[contentSize];
                this.u.k = bArr3;
                input.readFully(bArr3, 0, contentSize);
                return;
            }
            if (id != k2) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unexpected id: ");
                sb.append(id);
                throw ParserException.createForMalformedContainer(sb.toString(), null);
            }
            f(id);
            byte[] bArr4 = new byte[contentSize];
            this.u.v = bArr4;
            input.readFully(bArr4, 0, contentSize);
            return;
        }
        if (this.G == 0) {
            this.M = (int) this.b.d(input, false, true, 8);
            this.N = this.b.b();
            this.I = C.TIME_UNSET;
            this.G = 1;
            this.g.reset(0);
        }
        c cVar3 = this.c.get(this.M);
        if (cVar3 == null) {
            input.skipFully(contentSize - this.N);
            this.G = 0;
            return;
        }
        cVar3.e();
        if (this.G == 1) {
            q(input, 3);
            int i7 = (this.g.getData()[2] & 6) >> 1;
            byte b4 = 255;
            if (i7 == 0) {
                this.K = 1;
                int[] iArrJ = j(this.L, 1);
                this.L = iArrJ;
                iArrJ[0] = (contentSize - this.N) - 3;
            } else {
                int i8 = 4;
                q(input, 4);
                int i9 = (this.g.getData()[3] & 255) + 1;
                this.K = i9;
                int[] iArrJ2 = j(this.L, i9);
                this.L = iArrJ2;
                if (i7 == 2) {
                    int i10 = (contentSize - this.N) - 4;
                    int i11 = this.K;
                    Arrays.fill(iArrJ2, 0, i11, i10 / i11);
                } else {
                    if (i7 == 1) {
                        int i12 = 0;
                        int i13 = 0;
                        while (true) {
                            i = this.K;
                            if (i12 >= i - 1) {
                                break;
                            }
                            this.L[i12] = 0;
                            do {
                                i8++;
                                q(input, i8);
                                i3 = this.g.getData()[i8 - 1] & 255;
                                iArr = this.L;
                                iArr[i12] = iArr[i12] + i3;
                            } while (i3 == 255);
                            i13 += iArr[i12];
                            i12++;
                        }
                        this.L[i - 1] = ((contentSize - this.N) - i8) - i13;
                    } else {
                        if (i7 != 3) {
                            StringBuilder sb2 = new StringBuilder(36);
                            sb2.append("Unexpected lacing value: ");
                            sb2.append(i7);
                            throw ParserException.createForMalformedContainer(sb2.toString(), null);
                        }
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            int i16 = this.K;
                            if (i14 >= i16 - 1) {
                                cVar2 = cVar3;
                                this.L[i16 - 1] = ((contentSize - this.N) - i8) - i15;
                                break;
                            }
                            this.L[i14] = i5;
                            i8++;
                            q(input, i8);
                            int i17 = i8 - 1;
                            if (this.g.getData()[i17] == 0) {
                                throw ParserException.createForMalformedContainer("No valid varint length mask found", null);
                            }
                            int i18 = 0;
                            while (true) {
                                if (i18 >= 8) {
                                    j = 0;
                                    break;
                                }
                                int i19 = i6 << (7 - i18);
                                if ((this.g.getData()[i17] & i19) != 0) {
                                    int i20 = i8 + i18;
                                    q(input, i20);
                                    long j4 = (~i19) & this.g.getData()[i17] & b4;
                                    int i21 = i17 + 1;
                                    while (true) {
                                        j3 = j4;
                                        if (i21 >= i20) {
                                            break;
                                        }
                                        j4 = (j3 << 8) | ((long) (this.g.getData()[i21] & b4));
                                        i21++;
                                        i20 = i20;
                                        b4 = 255;
                                    }
                                    int i22 = i20;
                                    if (i14 > 0) {
                                        j3 -= (1 << ((i18 * 7) + 6)) - 1;
                                    }
                                    j = j3;
                                    i8 = i22;
                                    break;
                                }
                                i18++;
                                i6 = 1;
                                b4 = 255;
                            }
                            if (j < ParserMinimalBase.MIN_INT_L || j > ParserMinimalBase.MAX_INT_L) {
                                throw ParserException.createForMalformedContainer("EBML lacing sample size out of range.", null);
                            }
                            int i23 = (int) j;
                            int[] iArr2 = this.L;
                            if (i14 != 0) {
                                i23 += iArr2[i14 - 1];
                            }
                            iArr2[i14] = i23;
                            i15 += iArr2[i14];
                            i14++;
                            cVar3 = cVar3;
                            i5 = 0;
                            i6 = 1;
                            b4 = 255;
                        }
                    }
                    this.H = this.B + s((this.g.getData()[0] << 8) | (this.g.getData()[1] & 255));
                    cVar = cVar2;
                    if (cVar.d != 2 || (id == 163 && (this.g.getData()[2] & 128) == 128)) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    this.O = i4;
                    this.G = 2;
                    this.J = 0;
                }
            }
            cVar2 = cVar3;
            this.H = this.B + s((this.g.getData()[0] << 8) | (this.g.getData()[1] & 255));
            cVar = cVar2;
            if (cVar.d != 2) {
                i4 = 1;
            } else {
                i4 = 1;
            }
            this.O = i4;
            this.G = 2;
            this.J = 0;
        } else {
            cVar = cVar3;
        }
        if (id == 163) {
            while (true) {
                int i24 = this.J;
                if (i24 >= this.K) {
                    this.G = 0;
                    return;
                }
                i(cVar, ((long) ((this.J * cVar.e) / 1000)) + this.H, this.O, u(input, cVar, this.L[i24]), 0);
                this.J++;
            }
        } else {
            while (true) {
                int i25 = this.J;
                if (i25 >= this.K) {
                    return;
                }
                int[] iArr3 = this.L;
                iArr3[i25] = u(input, cVar, iArr3[i25]);
                this.J++;
            }
        }
    }

    @CallSuper
    public void endMasterElement(int id) throws ParserException {
        g();
        if (id == 160) {
            if (this.G != 2) {
                return;
            }
            int i = 0;
            for (int i3 = 0; i3 < this.K; i3++) {
                i += this.L[i3];
            }
            c cVar = this.c.get(this.M);
            cVar.e();
            for (int i4 = 0; i4 < this.K; i4++) {
                long j = ((long) ((cVar.e * i4) / 1000)) + this.H;
                int i5 = this.O;
                if (i4 == 0 && !this.Q) {
                    i5 |= 1;
                }
                int i6 = this.L[i4];
                i -= i6;
                i(cVar, j, i5, i6, i);
            }
            this.G = 0;
            return;
        }
        if (id == 174) {
            c cVar2 = (c) Assertions.checkStateNotNull(this.u);
            String str = cVar2.b;
            if (str == null) {
                throw ParserException.createForMalformedContainer("CodecId is missing in TrackEntry element", null);
            }
            if (n(str)) {
                cVar2.h(this.a0, cVar2.c);
                this.c.put(cVar2.c, cVar2);
            }
            this.u = null;
            return;
        }
        if (id == Z0) {
            int i7 = this.w;
            if (i7 != -1) {
                long j3 = this.x;
                if (j3 != -1) {
                    if (i7 == c2) {
                        this.z = j3;
                        return;
                    }
                    return;
                }
            }
            throw ParserException.createForMalformedContainer("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (id == R1) {
            f(id);
            c cVar3 = this.u;
            if (cVar3.h) {
                if (cVar3.j == null) {
                    throw ParserException.createForMalformedContainer("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                cVar3.l = new DrmInitData(new DrmInitData.SchemeData(C.UUID_NIL, MimeTypes.VIDEO_WEBM, this.u.j.encryptionKey));
                return;
            }
            return;
        }
        if (id == Q1) {
            f(id);
            c cVar4 = this.u;
            if (cVar4.h && cVar4.i != null) {
                throw ParserException.createForMalformedContainer("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (id == 357149030) {
            if (this.r == C.TIME_UNSET) {
                this.r = 1000000L;
            }
            long j4 = this.s;
            if (j4 != C.TIME_UNSET) {
                this.t = s(j4);
                return;
            }
            return;
        }
        if (id == q1) {
            if (this.c.size() == 0) {
                throw ParserException.createForMalformedContainer("No valid tracks were found", null);
            }
            this.a0.endTracks();
        } else {
            if (id != c2) {
                return;
            }
            if (!this.v) {
                this.a0.seekMap(h(this.C, this.D));
                this.v = true;
            }
            this.C = null;
            this.D = null;
        }
    }

    @CallSuper
    public void floatElement(int id, double value) throws ParserException {
        if (id == 181) {
            m(id).Q = (int) value;
        }
        if (id == e1) {
            this.s = (long) value;
            return;
        }
        switch (id) {
            case w2 /* 21969 */:
                m(id).D = (float) value;
                break;
            case x2 /* 21970 */:
                m(id).E = (float) value;
                break;
            case y2 /* 21971 */:
                m(id).F = (float) value;
                break;
            case z2 /* 21972 */:
                m(id).G = (float) value;
                break;
            case A2 /* 21973 */:
                m(id).H = (float) value;
                break;
            case B2 /* 21974 */:
                m(id).I = (float) value;
                break;
            case C2 /* 21975 */:
                m(id).J = (float) value;
                break;
            case D2 /* 21976 */:
                m(id).K = (float) value;
                break;
            case E2 /* 21977 */:
                m(id).L = (float) value;
                break;
            case F2 /* 21978 */:
                m(id).M = (float) value;
                break;
            default:
                switch (id) {
                    case l2 /* 30323 */:
                        m(id).s = (float) value;
                        break;
                    case m2 /* 30324 */:
                        m(id).t = (float) value;
                        break;
                    case n2 /* 30325 */:
                        m(id).u = (float) value;
                        break;
                }
                break;
        }
    }

    @CallSuper
    public int getElementType(int id) {
        switch (id) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case g1 /* 231 */:
            case n1 /* 238 */:
            case g2 /* 241 */:
            case p1 /* 251 */:
            case z1 /* 16871 */:
            case V1 /* 16980 */:
            case V0 /* 17029 */:
            case T0 /* 17143 */:
            case Y1 /* 18401 */:
            case b2 /* 18408 */:
            case S1 /* 20529 */:
            case T1 /* 20530 */:
            case b1 /* 21420 */:
            case o2 /* 21432 */:
            case J1 /* 21680 */:
            case L1 /* 21682 */:
            case K1 /* 21690 */:
            case v1 /* 21930 */:
            case q2 /* 21945 */:
            case r2 /* 21946 */:
            case s2 /* 21947 */:
            case t2 /* 21948 */:
            case u2 /* 21949 */:
            case x1 /* 21998 */:
            case E1 /* 22186 */:
            case F1 /* 22203 */:
            case O1 /* 25188 */:
            case j2 /* 30321 */:
            case w1 /* 2352003 */:
            case d1 /* 2807729 */:
                return 2;
            case 134:
            case 17026:
            case B1 /* 21358 */:
            case h2 /* 2274716 */:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case y1 /* 16868 */:
            case a2 /* 18407 */:
            case Z0 /* 19899 */:
            case U1 /* 20532 */:
            case X1 /* 20533 */:
            case p2 /* 21936 */:
            case v2 /* 21968 */:
            case R1 /* 25152 */:
            case Q1 /* 28032 */:
            case l1 /* 30113 */:
            case i2 /* 30320 */:
            case Y0 /* 290298740 */:
            case 357149030:
            case q1 /* 374648427 */:
            case W0 /* 408125543 */:
            case S0 /* 440786851 */:
            case c2 /* 475249515 */:
            case f1 /* 524531317 */:
                return 1;
            case 161:
            case 163:
            case 165:
            case A1 /* 16877 */:
            case W1 /* 16981 */:
            case Z1 /* 18402 */:
            case a1 /* 21419 */:
            case D1 /* 25506 */:
            case k2 /* 30322 */:
                return 4;
            case 181:
            case e1 /* 17545 */:
            case w2 /* 21969 */:
            case x2 /* 21970 */:
            case y2 /* 21971 */:
            case z2 /* 21972 */:
            case A2 /* 21973 */:
            case B2 /* 21974 */:
            case C2 /* 21975 */:
            case D2 /* 21976 */:
            case E2 /* 21977 */:
            case F2 /* 21978 */:
            case l2 /* 30323 */:
            case m2 /* 30324 */:
            case n2 /* 30325 */:
                return 5;
            default:
                return 0;
        }
    }

    public void handleBlockAddIDExtraData(c track, ExtractorInput input, int contentSize) throws IOException {
        if (track.g != 1685485123 && track.g != 1685480259) {
            input.skipFully(contentSize);
            return;
        }
        byte[] bArr = new byte[contentSize];
        track.N = bArr;
        input.readFully(bArr, 0, contentSize);
    }

    public void handleBlockAdditionalData(c track, int blockAdditionalId, ExtractorInput input, int contentSize) throws IOException {
        if (blockAdditionalId != 4 || !j0.equals(track.b)) {
            input.skipFully(contentSize);
        } else {
            this.n.reset(contentSize);
            input.readFully(this.n.getData(), 0, contentSize);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void init(ExtractorOutput output) {
        this.a0 = output;
    }

    @CallSuper
    public void integerElement(int id, long value) throws ParserException {
        if (id == S1) {
            if (value == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("ContentEncodingOrder ");
            sb.append(value);
            sb.append(" not supported");
            throw ParserException.createForMalformedContainer(sb.toString(), null);
        }
        if (id == T1) {
            if (value == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ContentEncodingScope ");
            sb2.append(value);
            sb2.append(" not supported");
            throw ParserException.createForMalformedContainer(sb2.toString(), null);
        }
        switch (id) {
            case 131:
                m(id).d = (int) value;
                return;
            case 136:
                m(id).V = value == 1;
                return;
            case 155:
                this.I = s(value);
                return;
            case 159:
                m(id).O = (int) value;
                return;
            case 176:
                m(id).m = (int) value;
                return;
            case 179:
                e(id);
                this.C.add(s(value));
                return;
            case 186:
                m(id).n = (int) value;
                return;
            case 215:
                m(id).c = (int) value;
                return;
            case g1 /* 231 */:
                this.B = s(value);
                return;
            case n1 /* 238 */:
                this.P = (int) value;
                return;
            case g2 /* 241 */:
                if (this.E) {
                    return;
                }
                e(id);
                this.D.add(value);
                this.E = true;
                return;
            case p1 /* 251 */:
                this.Q = true;
                return;
            case z1 /* 16871 */:
                m(id).g = (int) value;
                return;
            case V1 /* 16980 */:
                if (value == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(50);
                sb3.append("ContentCompAlgo ");
                sb3.append(value);
                sb3.append(" not supported");
                throw ParserException.createForMalformedContainer(sb3.toString(), null);
            case V0 /* 17029 */:
                if (value < 1 || value > 2) {
                    StringBuilder sb4 = new StringBuilder(53);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(value);
                    sb4.append(" not supported");
                    throw ParserException.createForMalformedContainer(sb4.toString(), null);
                }
                return;
            case T0 /* 17143 */:
                if (value == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(50);
                sb5.append("EBMLReadVersion ");
                sb5.append(value);
                sb5.append(" not supported");
                throw ParserException.createForMalformedContainer(sb5.toString(), null);
            case Y1 /* 18401 */:
                if (value == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(49);
                sb6.append("ContentEncAlgo ");
                sb6.append(value);
                sb6.append(" not supported");
                throw ParserException.createForMalformedContainer(sb6.toString(), null);
            case b2 /* 18408 */:
                if (value == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(56);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(value);
                sb7.append(" not supported");
                throw ParserException.createForMalformedContainer(sb7.toString(), null);
            case b1 /* 21420 */:
                this.x = value + this.q;
                return;
            case o2 /* 21432 */:
                int i = (int) value;
                f(id);
                if (i == 0) {
                    this.u.w = 0;
                    return;
                }
                if (i == 1) {
                    this.u.w = 2;
                    return;
                } else if (i == 3) {
                    this.u.w = 1;
                    return;
                } else {
                    if (i != 15) {
                        return;
                    }
                    this.u.w = 3;
                    return;
                }
            case J1 /* 21680 */:
                m(id).o = (int) value;
                return;
            case L1 /* 21682 */:
                m(id).q = (int) value;
                return;
            case K1 /* 21690 */:
                m(id).p = (int) value;
                return;
            case v1 /* 21930 */:
                m(id).U = value == 1;
                return;
            case x1 /* 21998 */:
                m(id).f = (int) value;
                return;
            case E1 /* 22186 */:
                m(id).R = value;
                return;
            case F1 /* 22203 */:
                m(id).S = value;
                return;
            case O1 /* 25188 */:
                m(id).P = (int) value;
                return;
            case j2 /* 30321 */:
                f(id);
                int i3 = (int) value;
                if (i3 == 0) {
                    this.u.r = 0;
                    return;
                }
                if (i3 == 1) {
                    this.u.r = 1;
                    return;
                } else if (i3 == 2) {
                    this.u.r = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.u.r = 3;
                    return;
                }
            case w1 /* 2352003 */:
                m(id).e = (int) value;
                return;
            case d1 /* 2807729 */:
                this.r = value;
                return;
            default:
                switch (id) {
                    case q2 /* 21945 */:
                        f(id);
                        int i4 = (int) value;
                        if (i4 == 1) {
                            this.u.A = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.u.A = 1;
                            return;
                        }
                    case r2 /* 21946 */:
                        f(id);
                        int iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer((int) value);
                        if (iIsoTransferCharacteristicsToColorTransfer != -1) {
                            this.u.z = iIsoTransferCharacteristicsToColorTransfer;
                            return;
                        }
                        return;
                    case s2 /* 21947 */:
                        f(id);
                        this.u.x = true;
                        int iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace((int) value);
                        if (iIsoColorPrimariesToColorSpace != -1) {
                            this.u.y = iIsoColorPrimariesToColorSpace;
                            return;
                        }
                        return;
                    case t2 /* 21948 */:
                        m(id).B = (int) value;
                        return;
                    case u2 /* 21949 */:
                        m(id).C = (int) value;
                        return;
                    default:
                        return;
                }
        }
    }

    @CallSuper
    public boolean isLevel1Element(int id) {
        return id == 357149030 || id == f1 || id == c2 || id == q1;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int read(ExtractorInput input, PositionHolder seekPosition) throws IOException {
        this.F = false;
        boolean z = true;
        while (z && !this.F) {
            z = this.a.read(input);
            if (z && p(seekPosition, input.getPosition())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < this.c.size(); i++) {
            c cVarValueAt = this.c.valueAt(i);
            cVarValueAt.e();
            cVarValueAt.i();
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    @CallSuper
    public void seek(long position, long timeUs) {
        this.B = C.TIME_UNSET;
        this.G = 0;
        this.a.reset();
        this.b.e();
        r();
        for (int i = 0; i < this.c.size(); i++) {
            this.c.valueAt(i).m();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean sniff(ExtractorInput input) throws IOException {
        return new com.google.android.exoplayer2.extractor.mkv.c().b(input);
    }

    @CallSuper
    public void startMasterElement(int id, long contentPosition, long contentSize) throws ParserException {
        g();
        if (id == 160) {
            this.Q = false;
            return;
        }
        if (id == 174) {
            this.u = new c();
            return;
        }
        if (id == 187) {
            this.E = false;
            return;
        }
        if (id == Z0) {
            this.w = -1;
            this.x = -1L;
            return;
        }
        if (id == X1) {
            m(id).h = true;
            return;
        }
        if (id == v2) {
            m(id).x = true;
            return;
        }
        if (id == W0) {
            long j = this.q;
            if (j != -1 && j != contentPosition) {
                throw ParserException.createForMalformedContainer("Multiple Segment elements not supported", null);
            }
            this.q = contentPosition;
            this.p = contentSize;
            return;
        }
        if (id == c2) {
            this.C = new LongArray();
            this.D = new LongArray();
        } else if (id == f1 && !this.v) {
            if (this.d && this.z != -1) {
                this.y = true;
            } else {
                this.a0.seekMap(new SeekMap.Unseekable(this.t));
                this.v = true;
            }
        }
    }

    @CallSuper
    public void stringElement(int id, String value) throws ParserException {
        if (id == 134) {
            m(id).b = value;
            return;
        }
        if (id != 17026) {
            if (id == B1) {
                m(id).a = value;
                return;
            } else {
                if (id != h2) {
                    return;
                }
                m(id).W = value;
                return;
            }
        }
        if (h0.equals(value) || g0.equals(value)) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 22);
        sb.append("DocType ");
        sb.append(value);
        sb.append(" not supported");
        throw ParserException.createForMalformedContainer(sb.toString(), null);
    }

    public MatroskaExtractor(int flags) {
        this(new com.google.android.exoplayer2.extractor.mkv.a(), flags);
    }

    public MatroskaExtractor(com.google.android.exoplayer2.extractor.mkv.b reader, int flags) {
        this.q = -1L;
        this.r = C.TIME_UNSET;
        this.s = C.TIME_UNSET;
        this.t = C.TIME_UNSET;
        this.z = -1L;
        this.A = -1L;
        this.B = C.TIME_UNSET;
        this.a = reader;
        reader.a(new b());
        this.d = (flags & 1) == 0;
        this.b = new com.google.android.exoplayer2.extractor.mkv.d();
        this.c = new SparseArray<>();
        this.g = new ParsableByteArray(4);
        this.h = new ParsableByteArray(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new ParsableByteArray(4);
        this.e = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.f = new ParsableByteArray(4);
        this.j = new ParsableByteArray();
        this.k = new ParsableByteArray();
        this.l = new ParsableByteArray(8);
        this.m = new ParsableByteArray();
        this.n = new ParsableByteArray();
        this.L = new int[1];
    }
}
