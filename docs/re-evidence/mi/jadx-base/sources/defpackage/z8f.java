package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.common.collect.ImmutableList;
import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.miui.tsmclient.model.ErrorCode;
import com.tsmclient.smartcard.terminal.APDUConstants;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTAudioModuleCore;
import java.io.IOException;
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
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public class z8f implements il8 {
    public static final nl8 b0 = new nl8() { // from class: y8f
        @Override // defpackage.nl8
        public final il8[] c() {
            return z8f.A();
        }
    };
    public static final byte[] c0 = {49, 10, 48, 48, HMProSyncDataBaseProfile.DATA_TYPE_RESTING_HEART_RATE, 48, 48, HMProSyncDataBaseProfile.DATA_TYPE_RESTING_HEART_RATE, 48, 48, HMProSyncDataBaseProfile.DATA_STATISTIC_V2, 48, 48, 48, 32, 45, 45, HMProSyncDataBaseProfile.DATA_TYPE_SLEEPING_BLOOD_PRESSURE_RESULT, 32, 48, 48, HMProSyncDataBaseProfile.DATA_TYPE_RESTING_HEART_RATE, 48, 48, HMProSyncDataBaseProfile.DATA_TYPE_RESTING_HEART_RATE, 48, 48, HMProSyncDataBaseProfile.DATA_STATISTIC_V2, 48, 48, 48, 10};
    public static final byte[] d0 = wlq.i0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    public static final byte[] e0 = {68, 105, APDUConstants.TAG_MORE_DATA, 108, 111, 103, 117, 101, HMProSyncDataBaseProfile.DATA_TYPE_RESTING_HEART_RATE, 32, 48, HMProSyncDataBaseProfile.DATA_TYPE_RESTING_HEART_RATE, 48, 48, HMProSyncDataBaseProfile.DATA_TYPE_RESTING_HEART_RATE, 48, 48, HMProSyncDataBaseProfile.DATA_TYPE_RESTING_HEART_RATE, 48, 48, HMProSyncDataBaseProfile.DATA_STATISTIC_V2, 48, HMProSyncDataBaseProfile.DATA_TYPE_RESTING_HEART_RATE, 48, 48, HMProSyncDataBaseProfile.DATA_TYPE_RESTING_HEART_RATE, 48, 48, HMProSyncDataBaseProfile.DATA_TYPE_RESTING_HEART_RATE, 48, 48, HMProSyncDataBaseProfile.DATA_STATISTIC_V2};
    public static final UUID f0 = new UUID(72057594037932032L, -9223371306706625679L);
    public static final Map<String, Integer> g0;
    public long A;
    public long B;
    public rre C;
    public rre D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public byte Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ga7 f41015a;
    public kl8 a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wnq f41016b;
    public final SparseArray<c> c;
    public final boolean d;
    public final okh e;
    public final okh f;
    public final okh g;
    public final okh h;
    public final okh i;
    public final okh j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final okh f41017k;
    public final okh l;
    public final okh m;
    public final okh n;
    public ByteBuffer o;
    public long p;
    public long q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f41018r;
    public long s;
    public long t;
    public c u;
    public boolean v;
    public int w;
    public long x;
    public boolean y;
    public long z;

    public final class b implements fa7 {
        public b() {
        }

        @Override // defpackage.fa7
        public void a(int i) throws ParserException {
            z8f.this.o(i);
        }

        @Override // defpackage.fa7
        public void b(int i, double d) throws ParserException {
            z8f.this.r(i, d);
        }

        @Override // defpackage.fa7
        public void c(int i, long j) throws ParserException {
            z8f.this.x(i, j);
        }

        @Override // defpackage.fa7
        public void d(int i, String str) throws ParserException {
            z8f.this.H(i, str);
        }

        @Override // defpackage.fa7
        public void e(int i, long j, long j2) throws ParserException {
            z8f.this.G(i, j, j2);
        }

        @Override // defpackage.fa7
        public void f(int i, int i2, jl8 jl8Var) throws IOException {
            z8f.this.l(i, i2, jl8Var);
        }

        @Override // defpackage.fa7
        public int g(int i) {
            return z8f.this.u(i);
        }

        @Override // defpackage.fa7
        public boolean h(int i) {
            return z8f.this.z(i);
        }
    }

    public static final class c {
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
        public String W;
        public snp X;
        public int Y;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f41020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f41021b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public byte[] i;
        public snp.a j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public byte[] f41022k;
        public DrmInitData l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f41023r;
        public float s;
        public float t;
        public float u;
        public byte[] v;
        public int w;
        public boolean x;
        public int y;
        public int z;

        public c() {
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.f41023r = -1;
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

        public static Pair<String, List<byte[]>> j(okh okhVar) throws ParserException {
            try {
                okhVar.Q(16);
                long jT = okhVar.t();
                if (jT == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (jT == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (jT != 826496599) {
                    toe.h("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>("video/x-unknown", null);
                }
                byte[] bArrD = okhVar.d();
                for (int iE = okhVar.e() + 20; iE < bArrD.length - 4; iE++) {
                    if (bArrD[iE] == 0 && bArrD[iE + 1] == 0 && bArrD[iE + 2] == 1 && bArrD[iE + 3] == 15) {
                        return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrD, iE, bArrD.length)));
                    }
                }
                throw new ParserException("Failed to find FourCC VC1 initialization data");
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing FourCC private data");
            }
        }

        public static boolean k(okh okhVar) throws ParserException {
            try {
                int iV = okhVar.v();
                if (iV == 1) {
                    return true;
                }
                if (iV != 65534) {
                    return false;
                }
                okhVar.P(24);
                return okhVar.w() == z8f.f0.getMostSignificantBits() && okhVar.w() == z8f.f0.getLeastSignificantBits();
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing MS/ACM codec private");
            }
        }

        public static List<byte[]> l(byte[] bArr) throws ParserException {
            int i;
            int i2;
            try {
                if (bArr[0] != 2) {
                    throw new ParserException("Error parsing vorbis codec private");
                }
                int i3 = 0;
                int i4 = 1;
                while (true) {
                    i = bArr[i4];
                    if ((i & 255) != 255) {
                        break;
                    }
                    i3 += 255;
                    i4++;
                }
                int i5 = i4 + 1;
                int i6 = i3 + (i & 255);
                int i7 = 0;
                while (true) {
                    i2 = bArr[i5];
                    if ((i2 & 255) != 255) {
                        break;
                    }
                    i7 += 255;
                    i5++;
                }
                int i8 = i5 + 1;
                int i9 = i7 + (i2 & 255);
                if (bArr[i8] != 1) {
                    throw new ParserException("Error parsing vorbis codec private");
                }
                byte[] bArr2 = new byte[i6];
                System.arraycopy(bArr, i8, bArr2, 0, i6);
                int i10 = i8 + i6;
                if (bArr[i10] != 3) {
                    throw new ParserException("Error parsing vorbis codec private");
                }
                int i11 = i10 + i9;
                if (bArr[i11] != 5) {
                    throw new ParserException("Error parsing vorbis codec private");
                }
                byte[] bArr3 = new byte[bArr.length - i11];
                System.arraycopy(bArr, i11, bArr3, 0, bArr.length - i11);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing vorbis codec private");
            }
        }

        public final void e() {
            rk1.e(this.X);
        }

        public final byte[] f(String str) throws ParserException {
            byte[] bArr = this.f41022k;
            if (bArr != null) {
                return bArr;
            }
            String strValueOf = String.valueOf(str);
            throw new ParserException(strValueOf.length() != 0 ? "Missing CodecPrivate for codec ".concat(strValueOf) : new String("Missing CodecPrivate for codec "));
        }

        public final byte[] g() {
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

        /* JADX WARN: Code duplicated, block: B:154:0x02a2 A[PHI: r7
          0x02a2: PHI (r7v9 int) = (r7v1 int), (r7v0 int), (r7v7 int), (r7v8 int), (r7v10 int) binds: [B:186:0x03d4, B:162:0x02d4, B:159:0x02ac, B:157:0x02a8, B:151:0x027b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:200:0x0424  */
        /* JADX WARN: Code duplicated, block: B:205:0x043b  */
        /* JADX WARN: Code duplicated, block: B:206:0x043d  */
        /* JADX WARN: Code duplicated, block: B:209:0x044a  */
        /* JADX WARN: Code duplicated, block: B:210:0x045c  */
        /* JADX WARN: Code duplicated, block: B:212:0x0462  */
        /* JADX WARN: Code duplicated, block: B:214:0x0466  */
        /* JADX WARN: Code duplicated, block: B:216:0x046a  */
        /* JADX WARN: Code duplicated, block: B:219:0x0472  */
        /* JADX WARN: Code duplicated, block: B:223:0x047a  */
        /* JADX WARN: Code duplicated, block: B:226:0x0488  */
        /* JADX WARN: Code duplicated, block: B:229:0x048e  */
        /* JADX WARN: Code duplicated, block: B:230:0x049e  */
        /* JADX WARN: Code duplicated, block: B:233:0x04a4  */
        /* JADX WARN: Code duplicated, block: B:238:0x04c4  */
        /* JADX WARN: Code duplicated, block: B:257:0x0510  */
        /* JADX WARN: Code duplicated, block: B:259:0x0536  */
        /* JADX WARN: Code duplicated, block: B:261:0x053c  */
        /* JADX WARN: Code duplicated, block: B:274:0x0561  */
        public void h(kl8 kl8Var, int i) throws ParserException {
            byte b2;
            List<byte[]> listSingletonList;
            int i2;
            String str;
            int i3;
            List<byte[]> list;
            String str2;
            byte[] bArr;
            String str3;
            int i4;
            Format.b bVar;
            int i5;
            float f;
            ColorInfo colorInfo;
            int i6;
            int i7;
            int i8;
            b17 b17VarA;
            String str4 = this.f41021b;
            str4.hashCode();
            int iX = 4;
            int i9 = 3;
            int i10 = 0;
            int iIntValue = -1;
            switch (str4) {
                case "V_MPEG4/ISO/AP":
                    b2 = 0;
                    break;
                case "V_MPEG4/ISO/SP":
                    b2 = 1;
                    break;
                case "A_MS/ACM":
                    b2 = 2;
                    break;
                case "A_TRUEHD":
                    b2 = 3;
                    break;
                case "A_VORBIS":
                    b2 = 4;
                    break;
                case "A_MPEG/L2":
                    b2 = 5;
                    break;
                case "A_MPEG/L3":
                    b2 = 6;
                    break;
                case "V_MS/VFW/FOURCC":
                    b2 = 7;
                    break;
                case "S_DVBSUB":
                    b2 = 8;
                    break;
                case "V_MPEG4/ISO/ASP":
                    b2 = 9;
                    break;
                case "V_MPEG4/ISO/AVC":
                    b2 = 10;
                    break;
                case "S_VOBSUB":
                    b2 = 11;
                    break;
                case "A_DTS/LOSSLESS":
                    b2 = AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
                    break;
                case "A_AAC":
                    b2 = HMProSyncDataBaseProfile.DATA_TYPE_PAI;
                    break;
                case "A_AC3":
                    b2 = HMProSyncDataBaseProfile.DATA_TYPE_COACHING;
                    break;
                case "A_DTS":
                    b2 = 15;
                    break;
                case "V_AV1":
                    b2 = 16;
                    break;
                case "V_VP8":
                    b2 = 17;
                    break;
                case "V_VP9":
                    b2 = HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE;
                    break;
                case "S_HDMV/PGS":
                    b2 = HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY;
                    break;
                case "V_THEORA":
                    b2 = 20;
                    break;
                case "A_DTS/EXPRESS":
                    b2 = 21;
                    break;
                case "A_PCM/FLOAT/IEEE":
                    b2 = 22;
                    break;
                case "A_PCM/INT/BIG":
                    b2 = 23;
                    break;
                case "A_PCM/INT/LIT":
                    b2 = 24;
                    break;
                case "S_TEXT/ASS":
                    b2 = 25;
                    break;
                case "V_MPEGH/ISO/HEVC":
                    b2 = 26;
                    break;
                case "S_TEXT/UTF8":
                    b2 = 27;
                    break;
                case "V_MPEG2":
                    b2 = 28;
                    break;
                case "A_EAC3":
                    b2 = HMProSyncDataBaseProfile.DATA_TYPE_HEIGHT_LOW_HR;
                    break;
                case "A_FLAC":
                    b2 = HMProSyncDataBaseProfile.DATE_TYPE_AF_ACC;
                    break;
                case "A_OPUS":
                    b2 = 31;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            String str5 = "audio/raw";
            switch (b2) {
                case 0:
                case 1:
                case 9:
                    byte[] bArr2 = this.f41022k;
                    listSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                    str5 = "video/mp4v-es";
                    i3 = -1;
                    iX = -1;
                    str = null;
                    bArr = this.N;
                    if (bArr != null && (b17VarA = b17.a(new okh(bArr))) != null) {
                        str = b17VarA.c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i11 = (z ? 1 : 0) | i4;
                    bVar = new Format.b();
                    if (ayf.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iX);
                        i9 = 1;
                    } else if (ayf.s(str3)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        }
                        i5 = this.o;
                        if (i5 != -1 || (i6 = this.p) == -1) {
                            f = -1.0f;
                        } else {
                            f = (this.n * i5) / (this.m * i6);
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.f41020a != null && z8f.g0.containsKey(this.f41020a)) {
                            iIntValue = ((Integer) z8f.g0.get(this.f41020a)).intValue();
                        }
                        if (this.f41023r == 0 || Float.compare(this.s, 0.0f) != 0 || Float.compare(this.t, 0.0f) != 0) {
                            i10 = iIntValue;
                        } else if (Float.compare(this.u, 0.0f) != 0) {
                            if (Float.compare(this.t, 90.0f) == 0) {
                                i10 = 90;
                            } else if (Float.compare(this.t, -180.0f) == 0 || Float.compare(this.t, 180.0f) == 0) {
                                i10 = 180;
                            } else if (Float.compare(this.t, -90.0f) == 0) {
                                i10 = 270;
                            } else {
                                i10 = iIntValue;
                            }
                        }
                        bVar.j0(this.m).Q(this.n).a0(f).d0(i10).b0(this.v).h0(this.w).J(colorInfo);
                        i9 = 2;
                    } else if (!"application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                        throw new ParserException("Unexpected MIME type.");
                    }
                    if (this.f41020a != null && !z8f.g0.containsKey(this.f41020a)) {
                        bVar.U(this.f41020a);
                    }
                    Format formatE = bVar.R(i).e0(str3).W(i3).V(this.W).g0(i11).T(listSingletonList).I(str).L(this.l).E();
                    snp snpVarD = kl8Var.d(this.c, i9);
                    this.X = snpVarD;
                    snpVarD.b(formatE);
                    return;
                case 2:
                    if (k(new okh(f(this.f41021b)))) {
                        iX = wlq.X(this.P);
                        if (iX == 0) {
                            int i12 = this.P;
                            StringBuilder sb = new StringBuilder("audio/x-unknown".length() + 60);
                            sb.append("Unsupported PCM bit depth: ");
                            sb.append(i12);
                            sb.append(". Setting mimeType to ");
                            sb.append("audio/x-unknown");
                            toe.h("MatroskaExtractor", sb.toString());
                        } else {
                            i3 = -1;
                        }
                        listSingletonList = null;
                        str = null;
                        bArr = this.N;
                        if (bArr != null) {
                            str = b17VarA.c;
                            str5 = "video/dolby-vision";
                        }
                        str3 = str5;
                        boolean z2 = this.V;
                        if (this.U) {
                            i4 = 2;
                        } else {
                            i4 = 0;
                        }
                        int i13 = (z2 ? 1 : 0) | i4;
                        bVar = new Format.b();
                        if (ayf.p(str3)) {
                            bVar.H(this.O).f0(this.Q).Y(iX);
                            i9 = 1;
                        } else if (ayf.s(str3)) {
                            if (this.q == 0) {
                                i7 = this.o;
                                if (i7 == -1) {
                                    i7 = this.m;
                                }
                                this.o = i7;
                                i8 = this.p;
                                if (i8 == -1) {
                                    i8 = this.n;
                                }
                                this.p = i8;
                            }
                            i5 = this.o;
                            if (i5 != -1) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.x) {
                                colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                            } else {
                                colorInfo = null;
                            }
                            if (this.f41020a != null) {
                                iIntValue = ((Integer) z8f.g0.get(this.f41020a)).intValue();
                            }
                            if (this.f41023r == 0) {
                                i10 = iIntValue;
                            } else {
                                i10 = iIntValue;
                            }
                            bVar.j0(this.m).Q(this.n).a0(f).d0(i10).b0(this.v).h0(this.w).J(colorInfo);
                            i9 = 2;
                        } else if (!"application/x-subrip".equals(str3)) {
                            throw new ParserException("Unexpected MIME type.");
                        }
                        if (this.f41020a != null) {
                            bVar.U(this.f41020a);
                        }
                        Format formatE2 = bVar.R(i).e0(str3).W(i3).V(this.W).g0(i13).T(listSingletonList).I(str).L(this.l).E();
                        snp snpVarD2 = kl8Var.d(this.c, i9);
                        this.X = snpVarD2;
                        snpVarD2.b(formatE2);
                        return;
                    }
                    toe.h("MatroskaExtractor", "audio/x-unknown".length() != 0 ? "Non-PCM MS/ACM is unsupported. Setting mimeType to ".concat("audio/x-unknown") : new String("Non-PCM MS/ACM is unsupported. Setting mimeType to "));
                    str5 = "audio/x-unknown";
                    i3 = -1;
                    iX = -1;
                    listSingletonList = null;
                    str = null;
                    bArr = this.N;
                    if (bArr != null) {
                        str = b17VarA.c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z3 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i14 = (z3 ? 1 : 0) | i4;
                    bVar = new Format.b();
                    if (ayf.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iX);
                        i9 = 1;
                    } else if (ayf.s(str3)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        }
                        i5 = this.o;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.f41020a != null) {
                            iIntValue = ((Integer) z8f.g0.get(this.f41020a)).intValue();
                        }
                        if (this.f41023r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.j0(this.m).Q(this.n).a0(f).d0(i10).b0(this.v).h0(this.w).J(colorInfo);
                        i9 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw new ParserException("Unexpected MIME type.");
                    }
                    if (this.f41020a != null) {
                        bVar.U(this.f41020a);
                    }
                    Format formatE3 = bVar.R(i).e0(str3).W(i3).V(this.W).g0(i14).T(listSingletonList).I(str).L(this.l).E();
                    snp snpVarD3 = kl8Var.d(this.c, i9);
                    this.X = snpVarD3;
                    snpVarD3.b(formatE3);
                    return;
                case 3:
                    this.T = new d();
                    str5 = "audio/true-hd";
                    i3 = -1;
                    iX = -1;
                    listSingletonList = null;
                    str = null;
                    bArr = this.N;
                    if (bArr != null) {
                        str = b17VarA.c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z4 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i15 = (z4 ? 1 : 0) | i4;
                    bVar = new Format.b();
                    if (ayf.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iX);
                        i9 = 1;
                    } else if (ayf.s(str3)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        }
                        i5 = this.o;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.f41020a != null) {
                            iIntValue = ((Integer) z8f.g0.get(this.f41020a)).intValue();
                        }
                        if (this.f41023r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.j0(this.m).Q(this.n).a0(f).d0(i10).b0(this.v).h0(this.w).J(colorInfo);
                        i9 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw new ParserException("Unexpected MIME type.");
                    }
                    if (this.f41020a != null) {
                        bVar.U(this.f41020a);
                    }
                    Format formatE4 = bVar.R(i).e0(str3).W(i3).V(this.W).g0(i15).T(listSingletonList).I(str).L(this.l).E();
                    snp snpVarD4 = kl8Var.d(this.c, i9);
                    this.X = snpVarD4;
                    snpVarD4.b(formatE4);
                    return;
                case 4:
                    listSingletonList = l(f(this.f41021b));
                    str5 = "audio/vorbis";
                    i2 = 8192;
                    i3 = i2;
                    iX = -1;
                    str = null;
                    bArr = this.N;
                    if (bArr != null) {
                        str = b17VarA.c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z5 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i16 = (z5 ? 1 : 0) | i4;
                    bVar = new Format.b();
                    if (ayf.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iX);
                        i9 = 1;
                    } else if (ayf.s(str3)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        }
                        i5 = this.o;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.f41020a != null) {
                            iIntValue = ((Integer) z8f.g0.get(this.f41020a)).intValue();
                        }
                        if (this.f41023r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.j0(this.m).Q(this.n).a0(f).d0(i10).b0(this.v).h0(this.w).J(colorInfo);
                        i9 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw new ParserException("Unexpected MIME type.");
                    }
                    if (this.f41020a != null) {
                        bVar.U(this.f41020a);
                    }
                    Format formatE5 = bVar.R(i).e0(str3).W(i3).V(this.W).g0(i16).T(listSingletonList).I(str).L(this.l).E();
                    snp snpVarD5 = kl8Var.d(this.c, i9);
                    this.X = snpVarD5;
                    snpVarD5.b(formatE5);
                    return;
                case 5:
                    str5 = "audio/mpeg-L2";
                    iX = -1;
                    listSingletonList = null;
                    str = null;
                    i3 = 4096;
                    bArr = this.N;
                    if (bArr != null) {
                        str = b17VarA.c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z6 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i17 = (z6 ? 1 : 0) | i4;
                    bVar = new Format.b();
                    if (ayf.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iX);
                        i9 = 1;
                    } else if (ayf.s(str3)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        }
                        i5 = this.o;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.f41020a != null) {
                            iIntValue = ((Integer) z8f.g0.get(this.f41020a)).intValue();
                        }
                        if (this.f41023r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.j0(this.m).Q(this.n).a0(f).d0(i10).b0(this.v).h0(this.w).J(colorInfo);
                        i9 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw new ParserException("Unexpected MIME type.");
                    }
                    if (this.f41020a != null) {
                        bVar.U(this.f41020a);
                    }
                    Format formatE6 = bVar.R(i).e0(str3).W(i3).V(this.W).g0(i17).T(listSingletonList).I(str).L(this.l).E();
                    snp snpVarD6 = kl8Var.d(this.c, i9);
                    this.X = snpVarD6;
                    snpVarD6.b(formatE6);
                    return;
                case 6:
                    str5 = "audio/mpeg";
                    iX = -1;
                    listSingletonList = null;
                    str = null;
                    i3 = 4096;
                    bArr = this.N;
                    if (bArr != null) {
                        str = b17VarA.c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z7 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i18 = (z7 ? 1 : 0) | i4;
                    bVar = new Format.b();
                    if (ayf.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iX);
                        i9 = 1;
                    } else if (ayf.s(str3)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        }
                        i5 = this.o;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.f41020a != null) {
                            iIntValue = ((Integer) z8f.g0.get(this.f41020a)).intValue();
                        }
                        if (this.f41023r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.j0(this.m).Q(this.n).a0(f).d0(i10).b0(this.v).h0(this.w).J(colorInfo);
                        i9 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw new ParserException("Unexpected MIME type.");
                    }
                    if (this.f41020a != null) {
                        bVar.U(this.f41020a);
                    }
                    Format formatE7 = bVar.R(i).e0(str3).W(i3).V(this.W).g0(i18).T(listSingletonList).I(str).L(this.l).E();
                    snp snpVarD7 = kl8Var.d(this.c, i9);
                    this.X = snpVarD7;
                    snpVarD7.b(formatE7);
                    return;
                case 7:
                    Pair<String, List<byte[]>> pairJ = j(new okh(f(this.f41021b)));
                    str5 = (String) pairJ.first;
                    listSingletonList = (List) pairJ.second;
                    i3 = -1;
                    iX = -1;
                    str = null;
                    bArr = this.N;
                    if (bArr != null) {
                        str = b17VarA.c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z8 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i19 = (z8 ? 1 : 0) | i4;
                    bVar = new Format.b();
                    if (ayf.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iX);
                        i9 = 1;
                    } else if (ayf.s(str3)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        }
                        i5 = this.o;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.f41020a != null) {
                            iIntValue = ((Integer) z8f.g0.get(this.f41020a)).intValue();
                        }
                        if (this.f41023r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.j0(this.m).Q(this.n).a0(f).d0(i10).b0(this.v).h0(this.w).J(colorInfo);
                        i9 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw new ParserException("Unexpected MIME type.");
                    }
                    if (this.f41020a != null) {
                        bVar.U(this.f41020a);
                    }
                    Format formatE8 = bVar.R(i).e0(str3).W(i3).V(this.W).g0(i19).T(listSingletonList).I(str).L(this.l).E();
                    snp snpVarD8 = kl8Var.d(this.c, i9);
                    this.X = snpVarD8;
                    snpVarD8.b(formatE8);
                    return;
                case 8:
                    byte[] bArr3 = new byte[4];
                    System.arraycopy(f(this.f41021b), 0, bArr3, 0, 4);
                    listSingletonList = ImmutableList.of(bArr3);
                    i3 = -1;
                    iX = -1;
                    str5 = "application/dvbsubs";
                    str = null;
                    bArr = this.N;
                    if (bArr != null) {
                        str = b17VarA.c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z9 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i110 = (z9 ? 1 : 0) | i4;
                    bVar = new Format.b();
                    if (ayf.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iX);
                        i9 = 1;
                    } else if (ayf.s(str3)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        }
                        i5 = this.o;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.f41020a != null) {
                            iIntValue = ((Integer) z8f.g0.get(this.f41020a)).intValue();
                        }
                        if (this.f41023r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.j0(this.m).Q(this.n).a0(f).d0(i10).b0(this.v).h0(this.w).J(colorInfo);
                        i9 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw new ParserException("Unexpected MIME type.");
                    }
                    if (this.f41020a != null) {
                        bVar.U(this.f41020a);
                    }
                    Format formatE9 = bVar.R(i).e0(str3).W(i3).V(this.W).g0(i110).T(listSingletonList).I(str).L(this.l).E();
                    snp snpVarD9 = kl8Var.d(this.c, i9);
                    this.X = snpVarD9;
                    snpVarD9.b(formatE9);
                    return;
                case 10:
                    et1 et1VarB = et1.b(new okh(f(this.f41021b)));
                    list = et1VarB.f17036a;
                    this.Y = et1VarB.f17037b;
                    str2 = et1VarB.f;
                    str5 = "video/avc";
                    i3 = -1;
                    iX = -1;
                    List<byte[]> list2 = list;
                    str = str2;
                    listSingletonList = list2;
                    bArr = this.N;
                    if (bArr != null) {
                        str = b17VarA.c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z10 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i111 = (z10 ? 1 : 0) | i4;
                    bVar = new Format.b();
                    if (ayf.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iX);
                        i9 = 1;
                    } else if (ayf.s(str3)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        }
                        i5 = this.o;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.f41020a != null) {
                            iIntValue = ((Integer) z8f.g0.get(this.f41020a)).intValue();
                        }
                        if (this.f41023r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.j0(this.m).Q(this.n).a0(f).d0(i10).b0(this.v).h0(this.w).J(colorInfo);
                        i9 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw new ParserException("Unexpected MIME type.");
                    }
                    if (this.f41020a != null) {
                        bVar.U(this.f41020a);
                    }
                    Format formatE10 = bVar.R(i).e0(str3).W(i3).V(this.W).g0(i111).T(listSingletonList).I(str).L(this.l).E();
                    snp snpVarD10 = kl8Var.d(this.c, i9);
                    this.X = snpVarD10;
                    snpVarD10.b(formatE10);
                    return;
                case 11:
                    listSingletonList = ImmutableList.of(f(this.f41021b));
                    i3 = -1;
                    iX = -1;
                    str5 = "application/vobsub";
                    str = null;
                    bArr = this.N;
                    if (bArr != null) {
                        str = b17VarA.c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z11 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i112 = (z11 ? 1 : 0) | i4;
                    bVar = new Format.b();
                    if (ayf.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iX);
                        i9 = 1;
                    } else if (ayf.s(str3)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        }
                        i5 = this.o;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.f41020a != null) {
                            iIntValue = ((Integer) z8f.g0.get(this.f41020a)).intValue();
                        }
                        if (this.f41023r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.j0(this.m).Q(this.n).a0(f).d0(i10).b0(this.v).h0(this.w).J(colorInfo);
                        i9 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw new ParserException("Unexpected MIME type.");
                    }
                    if (this.f41020a != null) {
                        bVar.U(this.f41020a);
                    }
                    Format formatE11 = bVar.R(i).e0(str3).W(i3).V(this.W).g0(i112).T(listSingletonList).I(str).L(this.l).E();
                    snp snpVarD11 = kl8Var.d(this.c, i9);
                    this.X = snpVarD11;
                    snpVarD11.b(formatE11);
                    return;
                case 12:
                    str5 = "audio/vnd.dts.hd";
                    i3 = -1;
                    iX = -1;
                    listSingletonList = null;
                    str = null;
                    bArr = this.N;
                    if (bArr != null) {
                        str = b17VarA.c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z12 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i113 = (z12 ? 1 : 0) | i4;
                    bVar = new Format.b();
                    if (ayf.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iX);
                        i9 = 1;
                    } else if (ayf.s(str3)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        }
                        i5 = this.o;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.f41020a != null) {
                            iIntValue = ((Integer) z8f.g0.get(this.f41020a)).intValue();
                        }
                        if (this.f41023r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.j0(this.m).Q(this.n).a0(f).d0(i10).b0(this.v).h0(this.w).J(colorInfo);
                        i9 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw new ParserException("Unexpected MIME type.");
                    }
                    if (this.f41020a != null) {
                        bVar.U(this.f41020a);
                    }
                    Format formatE12 = bVar.R(i).e0(str3).W(i3).V(this.W).g0(i113).T(listSingletonList).I(str).L(this.l).E();
                    snp snpVarD12 = kl8Var.d(this.c, i9);
                    this.X = snpVarD12;
                    snpVarD12.b(formatE12);
                    return;
                case 13:
                    listSingletonList = Collections.singletonList(f(this.f41021b));
                    C3515if.b bVarG = C3515if.g(this.f41022k);
                    this.Q = bVarG.f21072a;
                    this.O = bVarG.f21073b;
                    str = bVarG.c;
                    str5 = MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_MIME_TYPE;
                    i3 = -1;
                    iX = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = b17VarA.c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z13 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i114 = (z13 ? 1 : 0) | i4;
                    bVar = new Format.b();
                    if (ayf.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iX);
                        i9 = 1;
                    } else if (ayf.s(str3)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        }
                        i5 = this.o;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.f41020a != null) {
                            iIntValue = ((Integer) z8f.g0.get(this.f41020a)).intValue();
                        }
                        if (this.f41023r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.j0(this.m).Q(this.n).a0(f).d0(i10).b0(this.v).h0(this.w).J(colorInfo);
                        i9 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw new ParserException("Unexpected MIME type.");
                    }
                    if (this.f41020a != null) {
                        bVar.U(this.f41020a);
                    }
                    Format formatE13 = bVar.R(i).e0(str3).W(i3).V(this.W).g0(i114).T(listSingletonList).I(str).L(this.l).E();
                    snp snpVarD13 = kl8Var.d(this.c, i9);
                    this.X = snpVarD13;
                    snpVarD13.b(formatE13);
                    return;
                case 14:
                    str5 = "audio/ac3";
                    i3 = -1;
                    iX = -1;
                    listSingletonList = null;
                    str = null;
                    bArr = this.N;
                    if (bArr != null) {
                        str = b17VarA.c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z14 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i115 = (z14 ? 1 : 0) | i4;
                    bVar = new Format.b();
                    if (ayf.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iX);
                        i9 = 1;
                    } else if (ayf.s(str3)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        }
                        i5 = this.o;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.f41020a != null) {
                            iIntValue = ((Integer) z8f.g0.get(this.f41020a)).intValue();
                        }
                        if (this.f41023r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.j0(this.m).Q(this.n).a0(f).d0(i10).b0(this.v).h0(this.w).J(colorInfo);
                        i9 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw new ParserException("Unexpected MIME type.");
                    }
                    if (this.f41020a != null) {
                        bVar.U(this.f41020a);
                    }
                    Format formatE14 = bVar.R(i).e0(str3).W(i3).V(this.W).g0(i115).T(listSingletonList).I(str).L(this.l).E();
                    snp snpVarD14 = kl8Var.d(this.c, i9);
                    this.X = snpVarD14;
                    snpVarD14.b(formatE14);
                    return;
                case 15:
                case 21:
                    str5 = "audio/vnd.dts";
                    i3 = -1;
                    iX = -1;
                    listSingletonList = null;
                    str = null;
                    bArr = this.N;
                    if (bArr != null) {
                        str = b17VarA.c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z15 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i116 = (z15 ? 1 : 0) | i4;
                    bVar = new Format.b();
                    if (ayf.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iX);
                        i9 = 1;
                    } else if (ayf.s(str3)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        }
                        i5 = this.o;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.f41020a != null) {
                            iIntValue = ((Integer) z8f.g0.get(this.f41020a)).intValue();
                        }
                        if (this.f41023r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.j0(this.m).Q(this.n).a0(f).d0(i10).b0(this.v).h0(this.w).J(colorInfo);
                        i9 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw new ParserException("Unexpected MIME type.");
                    }
                    if (this.f41020a != null) {
                        bVar.U(this.f41020a);
                    }
                    Format formatE15 = bVar.R(i).e0(str3).W(i3).V(this.W).g0(i116).T(listSingletonList).I(str).L(this.l).E();
                    snp snpVarD15 = kl8Var.d(this.c, i9);
                    this.X = snpVarD15;
                    snpVarD15.b(formatE15);
                    return;
                case 16:
                    str5 = "video/av01";
                    i3 = -1;
                    iX = -1;
                    listSingletonList = null;
                    str = null;
                    bArr = this.N;
                    if (bArr != null) {
                        str = b17VarA.c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z16 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i117 = (z16 ? 1 : 0) | i4;
                    bVar = new Format.b();
                    if (ayf.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iX);
                        i9 = 1;
                    } else if (ayf.s(str3)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        }
                        i5 = this.o;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.f41020a != null) {
                            iIntValue = ((Integer) z8f.g0.get(this.f41020a)).intValue();
                        }
                        if (this.f41023r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.j0(this.m).Q(this.n).a0(f).d0(i10).b0(this.v).h0(this.w).J(colorInfo);
                        i9 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw new ParserException("Unexpected MIME type.");
                    }
                    if (this.f41020a != null) {
                        bVar.U(this.f41020a);
                    }
                    Format formatE16 = bVar.R(i).e0(str3).W(i3).V(this.W).g0(i117).T(listSingletonList).I(str).L(this.l).E();
                    snp snpVarD16 = kl8Var.d(this.c, i9);
                    this.X = snpVarD16;
                    snpVarD16.b(formatE16);
                    return;
                case 17:
                    str5 = "video/x-vnd.on2.vp8";
                    i3 = -1;
                    iX = -1;
                    listSingletonList = null;
                    str = null;
                    bArr = this.N;
                    if (bArr != null) {
                        str = b17VarA.c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z17 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i118 = (z17 ? 1 : 0) | i4;
                    bVar = new Format.b();
                    if (ayf.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iX);
                        i9 = 1;
                    } else if (ayf.s(str3)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        }
                        i5 = this.o;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.f41020a != null) {
                            iIntValue = ((Integer) z8f.g0.get(this.f41020a)).intValue();
                        }
                        if (this.f41023r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.j0(this.m).Q(this.n).a0(f).d0(i10).b0(this.v).h0(this.w).J(colorInfo);
                        i9 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw new ParserException("Unexpected MIME type.");
                    }
                    if (this.f41020a != null) {
                        bVar.U(this.f41020a);
                    }
                    Format formatE17 = bVar.R(i).e0(str3).W(i3).V(this.W).g0(i118).T(listSingletonList).I(str).L(this.l).E();
                    snp snpVarD17 = kl8Var.d(this.c, i9);
                    this.X = snpVarD17;
                    snpVarD17.b(formatE17);
                    return;
                case 18:
                    str5 = "video/x-vnd.on2.vp9";
                    i3 = -1;
                    iX = -1;
                    listSingletonList = null;
                    str = null;
                    bArr = this.N;
                    if (bArr != null) {
                        str = b17VarA.c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z18 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i119 = (z18 ? 1 : 0) | i4;
                    bVar = new Format.b();
                    if (ayf.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iX);
                        i9 = 1;
                    } else if (ayf.s(str3)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        }
                        i5 = this.o;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.f41020a != null) {
                            iIntValue = ((Integer) z8f.g0.get(this.f41020a)).intValue();
                        }
                        if (this.f41023r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.j0(this.m).Q(this.n).a0(f).d0(i10).b0(this.v).h0(this.w).J(colorInfo);
                        i9 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw new ParserException("Unexpected MIME type.");
                    }
                    if (this.f41020a != null) {
                        bVar.U(this.f41020a);
                    }
                    Format formatE18 = bVar.R(i).e0(str3).W(i3).V(this.W).g0(i119).T(listSingletonList).I(str).L(this.l).E();
                    snp snpVarD18 = kl8Var.d(this.c, i9);
                    this.X = snpVarD18;
                    snpVarD18.b(formatE18);
                    return;
                case 19:
                    i3 = -1;
                    iX = -1;
                    str5 = "application/pgs";
                    listSingletonList = null;
                    str = null;
                    bArr = this.N;
                    if (bArr != null) {
                        str = b17VarA.c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z19 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i1110 = (z19 ? 1 : 0) | i4;
                    bVar = new Format.b();
                    if (ayf.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iX);
                        i9 = 1;
                    } else if (ayf.s(str3)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        }
                        i5 = this.o;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.f41020a != null) {
                            iIntValue = ((Integer) z8f.g0.get(this.f41020a)).intValue();
                        }
                        if (this.f41023r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.j0(this.m).Q(this.n).a0(f).d0(i10).b0(this.v).h0(this.w).J(colorInfo);
                        i9 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw new ParserException("Unexpected MIME type.");
                    }
                    if (this.f41020a != null) {
                        bVar.U(this.f41020a);
                    }
                    Format formatE19 = bVar.R(i).e0(str3).W(i3).V(this.W).g0(i1110).T(listSingletonList).I(str).L(this.l).E();
                    snp snpVarD19 = kl8Var.d(this.c, i9);
                    this.X = snpVarD19;
                    snpVarD19.b(formatE19);
                    return;
                case 20:
                    str5 = "video/x-unknown";
                    i3 = -1;
                    iX = -1;
                    listSingletonList = null;
                    str = null;
                    bArr = this.N;
                    if (bArr != null) {
                        str = b17VarA.c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z110 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i1111 = (z110 ? 1 : 0) | i4;
                    bVar = new Format.b();
                    if (ayf.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iX);
                        i9 = 1;
                    } else if (ayf.s(str3)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        }
                        i5 = this.o;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.f41020a != null) {
                            iIntValue = ((Integer) z8f.g0.get(this.f41020a)).intValue();
                        }
                        if (this.f41023r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.j0(this.m).Q(this.n).a0(f).d0(i10).b0(this.v).h0(this.w).J(colorInfo);
                        i9 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw new ParserException("Unexpected MIME type.");
                    }
                    if (this.f41020a != null) {
                        bVar.U(this.f41020a);
                    }
                    Format formatE110 = bVar.R(i).e0(str3).W(i3).V(this.W).g0(i1111).T(listSingletonList).I(str).L(this.l).E();
                    snp snpVarD110 = kl8Var.d(this.c, i9);
                    this.X = snpVarD110;
                    snpVarD110.b(formatE110);
                    return;
                case 22:
                    int i20 = this.P;
                    if (i20 == 32) {
                        i3 = -1;
                    } else {
                        StringBuilder sb2 = new StringBuilder("audio/x-unknown".length() + 75);
                        sb2.append("Unsupported floating point PCM bit depth: ");
                        sb2.append(i20);
                        sb2.append(". Setting mimeType to ");
                        sb2.append("audio/x-unknown");
                        toe.h("MatroskaExtractor", sb2.toString());
                        str5 = "audio/x-unknown";
                        i3 = -1;
                        iX = -1;
                    }
                    listSingletonList = null;
                    str = null;
                    bArr = this.N;
                    if (bArr != null) {
                        str = b17VarA.c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z111 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i1112 = (z111 ? 1 : 0) | i4;
                    bVar = new Format.b();
                    if (ayf.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iX);
                        i9 = 1;
                    } else if (ayf.s(str3)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        }
                        i5 = this.o;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.f41020a != null) {
                            iIntValue = ((Integer) z8f.g0.get(this.f41020a)).intValue();
                        }
                        if (this.f41023r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.j0(this.m).Q(this.n).a0(f).d0(i10).b0(this.v).h0(this.w).J(colorInfo);
                        i9 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw new ParserException("Unexpected MIME type.");
                    }
                    if (this.f41020a != null) {
                        bVar.U(this.f41020a);
                    }
                    Format formatE111 = bVar.R(i).e0(str3).W(i3).V(this.W).g0(i1112).T(listSingletonList).I(str).L(this.l).E();
                    snp snpVarD111 = kl8Var.d(this.c, i9);
                    this.X = snpVarD111;
                    snpVarD111.b(formatE111);
                    return;
                case 23:
                    int i21 = this.P;
                    if (i21 == 8) {
                        iX = 3;
                    } else {
                        if (i21 != 16) {
                            StringBuilder sb3 = new StringBuilder("audio/x-unknown".length() + 71);
                            sb3.append("Unsupported big endian PCM bit depth: ");
                            sb3.append(i21);
                            sb3.append(". Setting mimeType to ");
                            sb3.append("audio/x-unknown");
                            toe.h("MatroskaExtractor", sb3.toString());
                            str5 = "audio/x-unknown";
                            i3 = -1;
                            iX = -1;
                            listSingletonList = null;
                            str = null;
                            bArr = this.N;
                            if (bArr != null) {
                                str = b17VarA.c;
                                str5 = "video/dolby-vision";
                            }
                            str3 = str5;
                            boolean z112 = this.V;
                            if (this.U) {
                                i4 = 2;
                            } else {
                                i4 = 0;
                            }
                            int i1113 = (z112 ? 1 : 0) | i4;
                            bVar = new Format.b();
                            if (ayf.p(str3)) {
                                bVar.H(this.O).f0(this.Q).Y(iX);
                                i9 = 1;
                            } else if (ayf.s(str3)) {
                                if (this.q == 0) {
                                    i7 = this.o;
                                    if (i7 == -1) {
                                        i7 = this.m;
                                    }
                                    this.o = i7;
                                    i8 = this.p;
                                    if (i8 == -1) {
                                        i8 = this.n;
                                    }
                                    this.p = i8;
                                }
                                i5 = this.o;
                                if (i5 != -1) {
                                    f = -1.0f;
                                } else {
                                    f = -1.0f;
                                }
                                if (this.x) {
                                    colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                                } else {
                                    colorInfo = null;
                                }
                                if (this.f41020a != null) {
                                    iIntValue = ((Integer) z8f.g0.get(this.f41020a)).intValue();
                                }
                                if (this.f41023r == 0) {
                                    i10 = iIntValue;
                                } else {
                                    i10 = iIntValue;
                                }
                                bVar.j0(this.m).Q(this.n).a0(f).d0(i10).b0(this.v).h0(this.w).J(colorInfo);
                                i9 = 2;
                            } else if (!"application/x-subrip".equals(str3)) {
                                throw new ParserException("Unexpected MIME type.");
                            }
                            if (this.f41020a != null) {
                                bVar.U(this.f41020a);
                            }
                            Format formatE112 = bVar.R(i).e0(str3).W(i3).V(this.W).g0(i1113).T(listSingletonList).I(str).L(this.l).E();
                            snp snpVarD112 = kl8Var.d(this.c, i9);
                            this.X = snpVarD112;
                            snpVarD112.b(formatE112);
                            return;
                        }
                        iX = 268435456;
                    }
                    i3 = -1;
                    listSingletonList = null;
                    str = null;
                    bArr = this.N;
                    if (bArr != null) {
                        str = b17VarA.c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z113 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i1114 = (z113 ? 1 : 0) | i4;
                    bVar = new Format.b();
                    if (ayf.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iX);
                        i9 = 1;
                    } else if (ayf.s(str3)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        }
                        i5 = this.o;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.f41020a != null) {
                            iIntValue = ((Integer) z8f.g0.get(this.f41020a)).intValue();
                        }
                        if (this.f41023r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.j0(this.m).Q(this.n).a0(f).d0(i10).b0(this.v).h0(this.w).J(colorInfo);
                        i9 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw new ParserException("Unexpected MIME type.");
                    }
                    if (this.f41020a != null) {
                        bVar.U(this.f41020a);
                    }
                    Format formatE113 = bVar.R(i).e0(str3).W(i3).V(this.W).g0(i1114).T(listSingletonList).I(str).L(this.l).E();
                    snp snpVarD113 = kl8Var.d(this.c, i9);
                    this.X = snpVarD113;
                    snpVarD113.b(formatE113);
                    return;
                case 24:
                    iX = wlq.X(this.P);
                    if (iX == 0) {
                        int i22 = this.P;
                        StringBuilder sb4 = new StringBuilder("audio/x-unknown".length() + 74);
                        sb4.append("Unsupported little endian PCM bit depth: ");
                        sb4.append(i22);
                        sb4.append(". Setting mimeType to ");
                        sb4.append("audio/x-unknown");
                        toe.h("MatroskaExtractor", sb4.toString());
                        str5 = "audio/x-unknown";
                        i3 = -1;
                        iX = -1;
                    } else {
                        i3 = -1;
                    }
                    listSingletonList = null;
                    str = null;
                    bArr = this.N;
                    if (bArr != null) {
                        str = b17VarA.c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z114 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i1115 = (z114 ? 1 : 0) | i4;
                    bVar = new Format.b();
                    if (ayf.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iX);
                        i9 = 1;
                    } else if (ayf.s(str3)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        }
                        i5 = this.o;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.f41020a != null) {
                            iIntValue = ((Integer) z8f.g0.get(this.f41020a)).intValue();
                        }
                        if (this.f41023r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.j0(this.m).Q(this.n).a0(f).d0(i10).b0(this.v).h0(this.w).J(colorInfo);
                        i9 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw new ParserException("Unexpected MIME type.");
                    }
                    if (this.f41020a != null) {
                        bVar.U(this.f41020a);
                    }
                    Format formatE114 = bVar.R(i).e0(str3).W(i3).V(this.W).g0(i1115).T(listSingletonList).I(str).L(this.l).E();
                    snp snpVarD114 = kl8Var.d(this.c, i9);
                    this.X = snpVarD114;
                    snpVarD114.b(formatE114);
                    return;
                case 25:
                    listSingletonList = ImmutableList.of(z8f.d0, f(this.f41021b));
                    i3 = -1;
                    iX = -1;
                    str5 = "text/x-ssa";
                    str = null;
                    bArr = this.N;
                    if (bArr != null) {
                        str = b17VarA.c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z115 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i1116 = (z115 ? 1 : 0) | i4;
                    bVar = new Format.b();
                    if (ayf.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iX);
                        i9 = 1;
                    } else if (ayf.s(str3)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        }
                        i5 = this.o;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.f41020a != null) {
                            iIntValue = ((Integer) z8f.g0.get(this.f41020a)).intValue();
                        }
                        if (this.f41023r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.j0(this.m).Q(this.n).a0(f).d0(i10).b0(this.v).h0(this.w).J(colorInfo);
                        i9 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw new ParserException("Unexpected MIME type.");
                    }
                    if (this.f41020a != null) {
                        bVar.U(this.f41020a);
                    }
                    Format formatE115 = bVar.R(i).e0(str3).W(i3).V(this.W).g0(i1116).T(listSingletonList).I(str).L(this.l).E();
                    snp snpVarD115 = kl8Var.d(this.c, i9);
                    this.X = snpVarD115;
                    snpVarD115.b(formatE115);
                    return;
                case 26:
                    g7c g7cVarA = g7c.a(new okh(f(this.f41021b)));
                    list = g7cVarA.f18675a;
                    this.Y = g7cVarA.f18676b;
                    str2 = g7cVarA.c;
                    str5 = "video/hevc";
                    i3 = -1;
                    iX = -1;
                    List<byte[]> list3 = list;
                    str = str2;
                    listSingletonList = list3;
                    bArr = this.N;
                    if (bArr != null) {
                        str = b17VarA.c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z116 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i1117 = (z116 ? 1 : 0) | i4;
                    bVar = new Format.b();
                    if (ayf.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iX);
                        i9 = 1;
                    } else if (ayf.s(str3)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        }
                        i5 = this.o;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.f41020a != null) {
                            iIntValue = ((Integer) z8f.g0.get(this.f41020a)).intValue();
                        }
                        if (this.f41023r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.j0(this.m).Q(this.n).a0(f).d0(i10).b0(this.v).h0(this.w).J(colorInfo);
                        i9 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw new ParserException("Unexpected MIME type.");
                    }
                    if (this.f41020a != null) {
                        bVar.U(this.f41020a);
                    }
                    Format formatE116 = bVar.R(i).e0(str3).W(i3).V(this.W).g0(i1117).T(listSingletonList).I(str).L(this.l).E();
                    snp snpVarD116 = kl8Var.d(this.c, i9);
                    this.X = snpVarD116;
                    snpVarD116.b(formatE116);
                    return;
                case 27:
                    i3 = -1;
                    iX = -1;
                    str5 = "application/x-subrip";
                    listSingletonList = null;
                    str = null;
                    bArr = this.N;
                    if (bArr != null) {
                        str = b17VarA.c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z117 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i1118 = (z117 ? 1 : 0) | i4;
                    bVar = new Format.b();
                    if (ayf.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iX);
                        i9 = 1;
                    } else if (ayf.s(str3)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        }
                        i5 = this.o;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.f41020a != null) {
                            iIntValue = ((Integer) z8f.g0.get(this.f41020a)).intValue();
                        }
                        if (this.f41023r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.j0(this.m).Q(this.n).a0(f).d0(i10).b0(this.v).h0(this.w).J(colorInfo);
                        i9 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw new ParserException("Unexpected MIME type.");
                    }
                    if (this.f41020a != null) {
                        bVar.U(this.f41020a);
                    }
                    Format formatE117 = bVar.R(i).e0(str3).W(i3).V(this.W).g0(i1118).T(listSingletonList).I(str).L(this.l).E();
                    snp snpVarD117 = kl8Var.d(this.c, i9);
                    this.X = snpVarD117;
                    snpVarD117.b(formatE117);
                    return;
                case 28:
                    str5 = "video/mpeg2";
                    i3 = -1;
                    iX = -1;
                    listSingletonList = null;
                    str = null;
                    bArr = this.N;
                    if (bArr != null) {
                        str = b17VarA.c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z118 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i1119 = (z118 ? 1 : 0) | i4;
                    bVar = new Format.b();
                    if (ayf.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iX);
                        i9 = 1;
                    } else if (ayf.s(str3)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        }
                        i5 = this.o;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.f41020a != null) {
                            iIntValue = ((Integer) z8f.g0.get(this.f41020a)).intValue();
                        }
                        if (this.f41023r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.j0(this.m).Q(this.n).a0(f).d0(i10).b0(this.v).h0(this.w).J(colorInfo);
                        i9 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw new ParserException("Unexpected MIME type.");
                    }
                    if (this.f41020a != null) {
                        bVar.U(this.f41020a);
                    }
                    Format formatE118 = bVar.R(i).e0(str3).W(i3).V(this.W).g0(i1119).T(listSingletonList).I(str).L(this.l).E();
                    snp snpVarD118 = kl8Var.d(this.c, i9);
                    this.X = snpVarD118;
                    snpVarD118.b(formatE118);
                    return;
                case 29:
                    str5 = "audio/eac3";
                    i3 = -1;
                    iX = -1;
                    listSingletonList = null;
                    str = null;
                    bArr = this.N;
                    if (bArr != null) {
                        str = b17VarA.c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z119 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i11110 = (z119 ? 1 : 0) | i4;
                    bVar = new Format.b();
                    if (ayf.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iX);
                        i9 = 1;
                    } else if (ayf.s(str3)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        }
                        i5 = this.o;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.f41020a != null) {
                            iIntValue = ((Integer) z8f.g0.get(this.f41020a)).intValue();
                        }
                        if (this.f41023r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.j0(this.m).Q(this.n).a0(f).d0(i10).b0(this.v).h0(this.w).J(colorInfo);
                        i9 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw new ParserException("Unexpected MIME type.");
                    }
                    if (this.f41020a != null) {
                        bVar.U(this.f41020a);
                    }
                    Format formatE119 = bVar.R(i).e0(str3).W(i3).V(this.W).g0(i11110).T(listSingletonList).I(str).L(this.l).E();
                    snp snpVarD119 = kl8Var.d(this.c, i9);
                    this.X = snpVarD119;
                    snpVarD119.b(formatE119);
                    return;
                case 30:
                    listSingletonList = Collections.singletonList(f(this.f41021b));
                    str5 = "audio/flac";
                    i3 = -1;
                    iX = -1;
                    str = null;
                    bArr = this.N;
                    if (bArr != null) {
                        str = b17VarA.c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1110 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i11111 = (z1110 ? 1 : 0) | i4;
                    bVar = new Format.b();
                    if (ayf.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iX);
                        i9 = 1;
                    } else if (ayf.s(str3)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        }
                        i5 = this.o;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.f41020a != null) {
                            iIntValue = ((Integer) z8f.g0.get(this.f41020a)).intValue();
                        }
                        if (this.f41023r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.j0(this.m).Q(this.n).a0(f).d0(i10).b0(this.v).h0(this.w).J(colorInfo);
                        i9 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw new ParserException("Unexpected MIME type.");
                    }
                    if (this.f41020a != null) {
                        bVar.U(this.f41020a);
                    }
                    Format formatE1110 = bVar.R(i).e0(str3).W(i3).V(this.W).g0(i11111).T(listSingletonList).I(str).L(this.l).E();
                    snp snpVarD1110 = kl8Var.d(this.c, i9);
                    this.X = snpVarD1110;
                    snpVarD1110.b(formatE1110);
                    return;
                case 31:
                    listSingletonList = new ArrayList<>(3);
                    listSingletonList.add(f(this.f41021b));
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    listSingletonList.add(byteBufferAllocate.order(byteOrder).putLong(this.R).array());
                    listSingletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.S).array());
                    str5 = "audio/opus";
                    i2 = 5760;
                    i3 = i2;
                    iX = -1;
                    str = null;
                    bArr = this.N;
                    if (bArr != null) {
                        str = b17VarA.c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1111 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i11112 = (z1111 ? 1 : 0) | i4;
                    bVar = new Format.b();
                    if (ayf.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iX);
                        i9 = 1;
                    } else if (ayf.s(str3)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        }
                        i5 = this.o;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                            colorInfo = new ColorInfo(this.y, this.A, this.z, g());
                        } else {
                            colorInfo = null;
                        }
                        if (this.f41020a != null) {
                            iIntValue = ((Integer) z8f.g0.get(this.f41020a)).intValue();
                        }
                        if (this.f41023r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.j0(this.m).Q(this.n).a0(f).d0(i10).b0(this.v).h0(this.w).J(colorInfo);
                        i9 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw new ParserException("Unexpected MIME type.");
                    }
                    if (this.f41020a != null) {
                        bVar.U(this.f41020a);
                    }
                    Format formatE1111 = bVar.R(i).e0(str3).W(i3).V(this.W).g0(i11112).T(listSingletonList).I(str).L(this.l).E();
                    snp snpVarD1111 = kl8Var.d(this.c, i9);
                    this.X = snpVarD1111;
                    snpVarD1111.b(formatE1111);
                    return;
                default:
                    throw new ParserException("Unrecognized codec identifier.");
            }
        }

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

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f41024a = new byte[10];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f41025b;
        public int c;
        public long d;
        public int e;
        public int f;
        public int g;

        public void a(c cVar) {
            if (this.c > 0) {
                cVar.X.e(this.d, this.e, this.f, this.g, cVar.j);
                this.c = 0;
            }
        }

        public void b() {
            this.f41025b = false;
            this.c = 0;
        }

        public void c(c cVar, long j, int i, int i2, int i3) {
            if (this.f41025b) {
                int i4 = this.c;
                int i5 = i4 + 1;
                this.c = i5;
                if (i4 == 0) {
                    this.d = j;
                    this.e = i;
                    this.f = 0;
                }
                this.f += i2;
                this.g = i3;
                if (i5 >= 16) {
                    a(cVar);
                }
            }
        }

        public void d(jl8 jl8Var) throws IOException {
            if (this.f41025b) {
                return;
            }
            jl8Var.i(this.f41024a, 0, 10);
            jl8Var.l();
            if (e20.i(this.f41024a) == 0) {
                return;
            }
            this.f41025b = true;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        g0 = Collections.unmodifiableMap(map);
    }

    public z8f() {
        this(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ il8[] A() {
        return new il8[]{new z8f()};
    }

    public static void F(String str, long j, byte[] bArr) {
        byte[] bArrS;
        int i;
        str.hashCode();
        if (str.equals("S_TEXT/ASS")) {
            bArrS = s(j, "%01d:%02d:%02d:%02d", 10000L);
            i = 21;
        } else {
            if (!str.equals("S_TEXT/UTF8")) {
                throw new IllegalArgumentException();
            }
            bArrS = s(j, "%02d:%02d:%02d,%03d", 1000L);
            i = 19;
        }
        System.arraycopy(bArrS, 0, bArr, i, bArrS.length);
    }

    private void k() {
        rk1.i(this.a0);
    }

    public static int[] p(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        return iArr.length >= i ? iArr : new int[Math.max(iArr.length * 2, i)];
    }

    public static byte[] s(long j, String str, long j2) {
        rk1.a(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) (i * 3600)) * FolmeCore.NANOS_TO_MS);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) (i2 * 60)) * FolmeCore.NANOS_TO_MS);
        int i3 = (int) (j4 / FolmeCore.NANOS_TO_MS);
        return wlq.i0(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * FolmeCore.NANOS_TO_MS)) / j2))));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean y(String str) {
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    b2 = 0;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    b2 = 1;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    b2 = 2;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    b2 = 3;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    b2 = 4;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    b2 = 5;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    b2 = 6;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    b2 = 7;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    b2 = 8;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    b2 = 9;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    b2 = 10;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    b2 = 11;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    b2 = AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    b2 = HMProSyncDataBaseProfile.DATA_TYPE_PAI;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    b2 = HMProSyncDataBaseProfile.DATA_TYPE_COACHING;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    b2 = 15;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    b2 = 16;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    b2 = 17;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    b2 = HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    b2 = HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    b2 = 20;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    b2 = 21;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    b2 = 22;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    b2 = 23;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    b2 = 24;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    b2 = 25;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    b2 = 26;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    b2 = 27;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    b2 = 28;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    b2 = HMProSyncDataBaseProfile.DATA_TYPE_HEIGHT_LOW_HR;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    b2 = HMProSyncDataBaseProfile.DATE_TYPE_AF_ACC;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    b2 = 31;
                }
                break;
        }
        switch (b2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                return true;
            default:
                return false;
        }
    }

    public final boolean B(r4i r4iVar, long j) {
        if (this.y) {
            this.A = j;
            r4iVar.f32179a = this.z;
            this.y = false;
            return true;
        }
        if (this.v) {
            long j2 = this.A;
            if (j2 != -1) {
                r4iVar.f32179a = j2;
                this.A = -1L;
                return true;
            }
        }
        return false;
    }

    public final void C(jl8 jl8Var, int i) throws IOException {
        if (this.g.f() >= i) {
            return;
        }
        if (this.g.b() < i) {
            okh okhVar = this.g;
            okhVar.c(Math.max(okhVar.b() * 2, i));
        }
        jl8Var.readFully(this.g.d(), this.g.f(), i - this.g.f());
        this.g.O(i);
    }

    public final void D() {
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = 0;
        this.Y = (byte) 0;
        this.Z = false;
        this.j.L(0);
    }

    public final long E(long j) throws ParserException {
        long j2 = this.f41018r;
        if (j2 != -9223372036854775807L) {
            return wlq.H0(j, j2, 1000L);
        }
        throw new ParserException("Can't scale timecode prior to timecodeScale being set.");
    }

    public void G(int i, long j, long j2) throws ParserException {
        k();
        if (i == 160) {
            this.Q = false;
            return;
        }
        if (i == 174) {
            this.u = new c();
            return;
        }
        if (i == 187) {
            this.E = false;
            return;
        }
        if (i == 19899) {
            this.w = -1;
            this.x = -1L;
            return;
        }
        if (i == 20533) {
            t(i).h = true;
            return;
        }
        if (i == 21968) {
            t(i).x = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.q;
            if (j3 != -1 && j3 != j) {
                throw new ParserException("Multiple Segment elements not supported");
            }
            this.q = j;
            this.p = j2;
            return;
        }
        if (i == 475249515) {
            this.C = new rre();
            this.D = new rre();
        } else if (i == 524531317 && !this.v) {
            if (this.d && this.z != -1) {
                this.y = true;
            } else {
                this.a0.k(new arl.b(this.t));
                this.v = true;
            }
        }
    }

    public void H(int i, String str) throws ParserException {
        if (i == 134) {
            t(i).f41021b = str;
            return;
        }
        if (i != 17026) {
            if (i == 21358) {
                t(i).f41020a = str;
                return;
            } else {
                if (i != 2274716) {
                    return;
                }
                t(i).W = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
        sb.append("DocType ");
        sb.append(str);
        sb.append(" not supported");
        throw new ParserException(sb.toString());
    }

    public final int I(jl8 jl8Var, c cVar, int i) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(cVar.f41021b)) {
            J(jl8Var, c0, i);
            return q();
        }
        if ("S_TEXT/ASS".equals(cVar.f41021b)) {
            J(jl8Var, e0, i);
            return q();
        }
        snp snpVar = cVar.X;
        if (!this.U) {
            if (cVar.h) {
                this.O &= -1073741825;
                if (!this.V) {
                    jl8Var.readFully(this.g.d(), 0, 1);
                    this.R++;
                    if ((this.g.d()[0] & 128) == 128) {
                        throw new ParserException("Extension bit is set in signal byte");
                    }
                    this.Y = this.g.d()[0];
                    this.V = true;
                }
                byte b2 = this.Y;
                if ((b2 & 1) == 1) {
                    boolean z = (b2 & 2) == 2;
                    this.O |= 1073741824;
                    if (!this.Z) {
                        jl8Var.readFully(this.l.d(), 0, 8);
                        this.R += 8;
                        this.Z = true;
                        this.g.d()[0] = (byte) ((z ? 128 : 0) | 8);
                        this.g.P(0);
                        snpVar.a(this.g, 1, 1);
                        this.S++;
                        this.l.P(0);
                        snpVar.a(this.l, 8, 1);
                        this.S += 8;
                    }
                    if (z) {
                        if (!this.W) {
                            jl8Var.readFully(this.g.d(), 0, 1);
                            this.R++;
                            this.g.P(0);
                            this.X = this.g.D();
                            this.W = true;
                        }
                        int i3 = this.X * 4;
                        this.g.L(i3);
                        jl8Var.readFully(this.g.d(), 0, i3);
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
                            i2 = this.X;
                            if (i5 >= i2) {
                                break;
                            }
                            int iH = this.g.H();
                            if (i5 % 2 == 0) {
                                this.o.putShort((short) (iH - i6));
                            } else {
                                this.o.putInt(iH - i6);
                            }
                            i5++;
                            i6 = iH;
                        }
                        int i7 = (i - this.R) - i6;
                        if (i2 % 2 == 1) {
                            this.o.putInt(i7);
                        } else {
                            this.o.putShort((short) i7);
                            this.o.putInt(0);
                        }
                        this.m.N(this.o.array(), i4);
                        snpVar.a(this.m, i4, 1);
                        this.S += i4;
                    }
                }
            } else {
                byte[] bArr = cVar.i;
                if (bArr != null) {
                    this.j.N(bArr, bArr.length);
                }
            }
            if (cVar.f > 0) {
                this.O |= 268435456;
                this.n.L(0);
                this.g.L(4);
                this.g.d()[0] = (byte) ((i >> 24) & 255);
                this.g.d()[1] = (byte) ((i >> 16) & 255);
                this.g.d()[2] = (byte) ((i >> 8) & 255);
                this.g.d()[3] = (byte) (i & 255);
                snpVar.a(this.g, 4, 2);
                this.S += 4;
            }
            this.U = true;
        }
        int iF = i + this.j.f();
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f41021b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f41021b)) {
            if (cVar.T != null) {
                rk1.g(this.j.f() == 0);
                cVar.T.d(jl8Var);
            }
            while (true) {
                int i8 = this.R;
                if (i8 >= iF) {
                    break;
                }
                int iK = K(jl8Var, snpVar, iF - i8);
                this.R += iK;
                this.S += iK;
            }
        } else {
            byte[] bArrD = this.f.d();
            bArrD[0] = 0;
            bArrD[1] = 0;
            bArrD[2] = 0;
            int i9 = cVar.Y;
            int i10 = 4 - i9;
            while (this.R < iF) {
                int i11 = this.T;
                if (i11 == 0) {
                    L(jl8Var, bArrD, i10, i9);
                    this.R += i9;
                    this.f.P(0);
                    this.T = this.f.H();
                    this.e.P(0);
                    snpVar.d(this.e, 4);
                    this.S += 4;
                } else {
                    int iK2 = K(jl8Var, snpVar, i11);
                    this.R += iK2;
                    this.S += iK2;
                    this.T -= iK2;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f41021b)) {
            this.h.P(0);
            snpVar.d(this.h, 4);
            this.S += 4;
        }
        return q();
    }

    public final void J(jl8 jl8Var, byte[] bArr, int i) throws IOException {
        int length = bArr.length + i;
        if (this.f41017k.b() < length) {
            this.f41017k.M(Arrays.copyOf(bArr, length + i));
        } else {
            System.arraycopy(bArr, 0, this.f41017k.d(), 0, bArr.length);
        }
        jl8Var.readFully(this.f41017k.d(), bArr.length, i);
        this.f41017k.P(0);
        this.f41017k.O(length);
    }

    public final int K(jl8 jl8Var, snp snpVar, int i) throws IOException {
        int iA = this.j.a();
        if (iA <= 0) {
            return snpVar.c(jl8Var, i, false);
        }
        int iMin = Math.min(i, iA);
        snpVar.d(this.j, iMin);
        return iMin;
    }

    public final void L(jl8 jl8Var, byte[] bArr, int i, int i2) throws IOException {
        int iMin = Math.min(i2, this.j.a());
        jl8Var.readFully(bArr, i + iMin, i2 - iMin);
        if (iMin > 0) {
            this.j.j(bArr, i, iMin);
        }
    }

    @Override // defpackage.il8
    public void a(long j, long j2) {
        this.B = -9223372036854775807L;
        this.G = 0;
        this.f41015a.reset();
        this.f41016b.e();
        D();
        for (int i = 0; i < this.c.size(); i++) {
            this.c.valueAt(i).m();
        }
    }

    @Override // defpackage.il8
    public final void b(kl8 kl8Var) {
        this.a0 = kl8Var;
    }

    @Override // defpackage.il8
    public final int f(jl8 jl8Var, r4i r4iVar) throws IOException {
        this.F = false;
        boolean zA = true;
        while (zA && !this.F) {
            zA = this.f41015a.a(jl8Var);
            if (zA && B(r4iVar, jl8Var.getPosition())) {
                return 1;
            }
        }
        if (zA) {
            return 0;
        }
        for (int i = 0; i < this.c.size(); i++) {
            c cVarValueAt = this.c.valueAt(i);
            cVarValueAt.e();
            cVarValueAt.i();
        }
        return -1;
    }

    @Override // defpackage.il8
    public final boolean g(jl8 jl8Var) throws IOException {
        return new t3n().b(jl8Var);
    }

    public final void i(int i) throws ParserException {
        if (this.C == null || this.D == null) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Element ");
            sb.append(i);
            sb.append(" must be in a Cues");
            throw new ParserException(sb.toString());
        }
    }

    public final void j(int i) throws ParserException {
        if (this.u != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a TrackEntry");
        throw new ParserException(sb.toString());
    }

    public void l(int i, int i2, jl8 jl8Var) throws IOException {
        int i3;
        long j;
        int i4;
        int i5;
        int i6;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (this.G != 2) {
                    return;
                }
                w(this.c.get(this.M), this.P, jl8Var, i2);
                return;
            }
            if (i == 16877) {
                v(t(i), jl8Var, i2);
                return;
            }
            if (i == 16981) {
                j(i);
                byte[] bArr = new byte[i2];
                this.u.i = bArr;
                jl8Var.readFully(bArr, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr2 = new byte[i2];
                jl8Var.readFully(bArr2, 0, i2);
                t(i).j = new snp.a(1, bArr2, 0, 0);
                return;
            }
            if (i == 21419) {
                Arrays.fill(this.i.d(), (byte) 0);
                jl8Var.readFully(this.i.d(), 4 - i2, i2);
                this.i.P(0);
                this.w = (int) this.i.F();
                return;
            }
            if (i == 25506) {
                j(i);
                byte[] bArr3 = new byte[i2];
                this.u.f41022k = bArr3;
                jl8Var.readFully(bArr3, 0, i2);
                return;
            }
            if (i != 30322) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unexpected id: ");
                sb.append(i);
                throw new ParserException(sb.toString());
            }
            j(i);
            byte[] bArr4 = new byte[i2];
            this.u.v = bArr4;
            jl8Var.readFully(bArr4, 0, i2);
            return;
        }
        int i7 = 8;
        if (this.G == 0) {
            this.M = (int) this.f41016b.d(jl8Var, false, true, 8);
            this.N = this.f41016b.b();
            this.I = -9223372036854775807L;
            this.G = 1;
            this.g.L(0);
        }
        c cVar = this.c.get(this.M);
        if (cVar == null) {
            jl8Var.p(i2 - this.N);
            this.G = 0;
            return;
        }
        cVar.e();
        if (this.G == 1) {
            C(jl8Var, 3);
            int i8 = (this.g.d()[2] & 6) >> 1;
            byte b2 = 255;
            if (i8 == 0) {
                this.K = 1;
                int[] iArrP = p(this.L, 1);
                this.L = iArrP;
                iArrP[0] = (i2 - this.N) - 3;
            } else {
                int i9 = 4;
                C(jl8Var, 4);
                int i10 = (this.g.d()[3] & 255) + 1;
                this.K = i10;
                int[] iArrP2 = p(this.L, i10);
                this.L = iArrP2;
                if (i8 == 2) {
                    int i11 = (i2 - this.N) - 4;
                    int i12 = this.K;
                    Arrays.fill(iArrP2, 0, i12, i11 / i12);
                } else if (i8 == 1) {
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        i4 = this.K;
                        if (i13 >= i4 - 1) {
                            break;
                        }
                        this.L[i13] = 0;
                        while (true) {
                            i5 = i9 + 1;
                            C(jl8Var, i5);
                            int i15 = this.g.d()[i9] & 255;
                            int[] iArr = this.L;
                            i6 = iArr[i13] + i15;
                            iArr[i13] = i6;
                            if (i15 != 255) {
                                break;
                            } else {
                                i9 = i5;
                            }
                        }
                        i14 += i6;
                        i13++;
                        i9 = i5;
                    }
                    this.L[i4 - 1] = ((i2 - this.N) - i9) - i14;
                } else {
                    if (i8 != 3) {
                        StringBuilder sb2 = new StringBuilder(36);
                        sb2.append("Unexpected lacing value: ");
                        sb2.append(i8);
                        throw new ParserException(sb2.toString());
                    }
                    int i16 = 0;
                    int i17 = 0;
                    while (true) {
                        int i18 = this.K;
                        if (i16 >= i18 - 1) {
                            this.L[i18 - 1] = ((i2 - this.N) - i9) - i17;
                            break;
                        }
                        this.L[i16] = 0;
                        int i19 = i9 + 1;
                        C(jl8Var, i19);
                        if (this.g.d()[i9] == 0) {
                            throw new ParserException("No valid varint length mask found");
                        }
                        int i20 = 0;
                        while (true) {
                            if (i20 >= i7) {
                                j = 0;
                                break;
                            }
                            int i21 = 1 << (7 - i20);
                            if ((this.g.d()[i9] & i21) != 0) {
                                i19 += i20;
                                C(jl8Var, i19);
                                j = (~i21) & this.g.d()[i9] & b2;
                                int i22 = i9 + 1;
                                while (i22 < i19) {
                                    j = (j << i7) | ((long) (this.g.d()[i22] & b2));
                                    i22++;
                                    i7 = 8;
                                    b2 = 255;
                                }
                                if (i16 <= 0) {
                                    break;
                                }
                                j -= (1 << ((i20 * 7) + 6)) - 1;
                                break;
                            }
                            i20++;
                            i7 = 8;
                            b2 = 255;
                        }
                        i9 = i19;
                        if (j < -2147483648L || j > 2147483647L) {
                            throw new ParserException("EBML lacing sample size out of range.");
                        }
                        int i23 = (int) j;
                        int[] iArr2 = this.L;
                        if (i16 != 0) {
                            i23 += iArr2[i16 - 1];
                        }
                        iArr2[i16] = i23;
                        i17 += i23;
                        i16++;
                        i7 = 8;
                        b2 = 255;
                    }
                }
            }
            this.H = this.B + E((this.g.d()[0] << 8) | (this.g.d()[1] & 255));
            this.O = (cVar.d == 2 || (i == 163 && (this.g.d()[2] & 128) == 128)) ? 1 : 0;
            this.G = 2;
            this.J = 0;
            i3 = 163;
        } else {
            i3 = 163;
        }
        if (i == i3) {
            while (true) {
                int i24 = this.J;
                if (i24 >= this.K) {
                    this.G = 0;
                    return;
                } else {
                    n(cVar, ((long) ((this.J * cVar.e) / 1000)) + this.H, this.O, I(jl8Var, cVar, this.L[i24]), 0);
                    this.J++;
                }
            }
        } else {
            while (true) {
                int i25 = this.J;
                if (i25 >= this.K) {
                    return;
                }
                int[] iArr3 = this.L;
                iArr3[i25] = I(jl8Var, cVar, iArr3[i25]);
                this.J++;
            }
        }
    }

    public final arl m(rre rreVar, rre rreVar2) {
        int i;
        if (this.q == -1 || this.t == -9223372036854775807L || rreVar == null || rreVar.c() == 0 || rreVar2 == null || rreVar2.c() != rreVar.c()) {
            return new arl.b(this.t);
        }
        int iC = rreVar.c();
        int[] iArrCopyOf = new int[iC];
        long[] jArrCopyOf = new long[iC];
        long[] jArrCopyOf2 = new long[iC];
        long[] jArrCopyOf3 = new long[iC];
        int i2 = 0;
        for (int i3 = 0; i3 < iC; i3++) {
            jArrCopyOf3[i3] = rreVar.b(i3);
            jArrCopyOf[i3] = this.q + rreVar2.b(i3);
        }
        while (true) {
            i = iC - 1;
            if (i2 >= i) {
                break;
            }
            int i4 = i2 + 1;
            iArrCopyOf[i2] = (int) (jArrCopyOf[i4] - jArrCopyOf[i2]);
            jArrCopyOf2[i2] = jArrCopyOf3[i4] - jArrCopyOf3[i2];
            i2 = i4;
        }
        iArrCopyOf[i] = (int) ((this.q + this.p) - jArrCopyOf[i]);
        long j = this.t - jArrCopyOf3[i];
        jArrCopyOf2[i] = j;
        if (j <= 0) {
            StringBuilder sb = new StringBuilder(72);
            sb.append("Discarding last cue point with unexpected duration: ");
            sb.append(j);
            toe.h("MatroskaExtractor", sb.toString());
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i);
        }
        return new fw3(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    public final void n(c cVar, long j, int i, int i2, int i3) {
        d dVar = cVar.T;
        if (dVar != null) {
            dVar.c(cVar, j, i, i2, i3);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f41021b) || "S_TEXT/ASS".equals(cVar.f41021b)) {
                if (this.K > 1) {
                    toe.h("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.I;
                    if (j2 == -9223372036854775807L) {
                        toe.h("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        F(cVar.f41021b, j2, this.f41017k.d());
                        for (int iE = this.f41017k.e(); iE < this.f41017k.f(); iE++) {
                            if (this.f41017k.d()[iE] == 0) {
                                this.f41017k.O(iE);
                                break;
                            }
                        }
                        snp snpVar = cVar.X;
                        okh okhVar = this.f41017k;
                        snpVar.d(okhVar, okhVar.f());
                        i2 += this.f41017k.f();
                    }
                }
            }
            if ((268435456 & i) != 0) {
                if (this.K > 1) {
                    i &= -268435457;
                } else {
                    int iF = this.n.f();
                    cVar.X.a(this.n, iF, 2);
                    i2 += iF;
                }
            }
            cVar.X.e(j, i, i2, i3, cVar.j);
        }
        this.F = true;
    }

    public void o(int i) throws ParserException {
        k();
        if (i == 160) {
            if (this.G != 2) {
                return;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.K; i3++) {
                i2 += this.L[i3];
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
                i2 -= i6;
                n(cVar, j, i5, i6, i2);
            }
            this.G = 0;
            return;
        }
        if (i == 174) {
            c cVar2 = (c) rk1.i(this.u);
            String str = cVar2.f41021b;
            if (str == null) {
                throw new ParserException("CodecId is missing in TrackEntry element");
            }
            if (y(str)) {
                cVar2.h(this.a0, cVar2.c);
                this.c.put(cVar2.c, cVar2);
            }
            this.u = null;
            return;
        }
        if (i == 19899) {
            int i7 = this.w;
            if (i7 != -1) {
                long j2 = this.x;
                if (j2 != -1) {
                    if (i7 == 475249515) {
                        this.z = j2;
                        return;
                    }
                    return;
                }
            }
            throw new ParserException("Mandatory element SeekID or SeekPosition not found");
        }
        if (i == 25152) {
            j(i);
            c cVar3 = this.u;
            if (cVar3.h) {
                if (cVar3.j == null) {
                    throw new ParserException("Encrypted Track found but ContentEncKeyID was not found");
                }
                cVar3.l = new DrmInitData(new DrmInitData.SchemeData(g83.f18708a, "video/webm", this.u.j.f33824b));
                return;
            }
            return;
        }
        if (i == 28032) {
            j(i);
            c cVar4 = this.u;
            if (cVar4.h && cVar4.i != null) {
                throw new ParserException("Combining encryption and compression is not supported");
            }
            return;
        }
        if (i == 357149030) {
            if (this.f41018r == -9223372036854775807L) {
                this.f41018r = FolmeCore.NANOS_TO_MS;
            }
            long j3 = this.s;
            if (j3 != -9223372036854775807L) {
                this.t = E(j3);
                return;
            }
            return;
        }
        if (i == 374648427) {
            if (this.c.size() == 0) {
                throw new ParserException("No valid tracks were found");
            }
            this.a0.m();
        } else {
            if (i != 475249515) {
                return;
            }
            if (!this.v) {
                this.a0.k(m(this.C, this.D));
                this.v = true;
            }
            this.C = null;
            this.D = null;
        }
    }

    public final int q() {
        int i = this.S;
        D();
        return i;
    }

    public void r(int i, double d2) throws ParserException {
        if (i == 181) {
            t(i).Q = (int) d2;
        }
        if (i == 17545) {
            this.s = (long) d2;
            return;
        }
        switch (i) {
            case 21969:
                t(i).D = (float) d2;
                break;
            case 21970:
                t(i).E = (float) d2;
                break;
            case 21971:
                t(i).F = (float) d2;
                break;
            case 21972:
                t(i).G = (float) d2;
                break;
            case 21973:
                t(i).H = (float) d2;
                break;
            case 21974:
                t(i).I = (float) d2;
                break;
            case 21975:
                t(i).J = (float) d2;
                break;
            case 21976:
                t(i).K = (float) d2;
                break;
            case 21977:
                t(i).L = (float) d2;
                break;
            case 21978:
                t(i).M = (float) d2;
                break;
            default:
                switch (i) {
                    case 30323:
                        t(i).s = (float) d2;
                        break;
                    case 30324:
                        t(i).t = (float) d2;
                        break;
                    case 30325:
                        t(i).u = (float) d2;
                        break;
                }
                break;
        }
    }

    @Override // defpackage.il8
    public final void release() {
    }

    public final c t(int i) throws ParserException {
        j(i);
        return this.u;
    }

    public int u(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case SportReportBaseParser.ReportType.avgDivingDepth /* 186 */:
            case 215:
            case ErrorCode.ERROR_SP_NOTICE_NOT_READY /* 231 */:
            case 238:
            case 241:
            case VibrateModeSetViewModel.DEFAULT_BBJI /* 251 */:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case SportReportBaseParser.ReportType.entryTime /* 183 */:
            case SportReportBaseParser.ReportType.avgAscentRate /* 187 */:
            case SportReportBaseParser.ReportType.avgFreq /* 224 */:
            case SportReportBaseParser.ReportType.maxFreq /* 225 */:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    public void v(c cVar, jl8 jl8Var, int i) throws IOException {
        if (cVar.g != 1685485123 && cVar.g != 1685480259) {
            jl8Var.p(i);
            return;
        }
        byte[] bArr = new byte[i];
        cVar.N = bArr;
        jl8Var.readFully(bArr, 0, i);
    }

    public void w(c cVar, int i, jl8 jl8Var, int i2) throws IOException {
        if (i != 4 || !"V_VP9".equals(cVar.f41021b)) {
            jl8Var.p(i2);
        } else {
            this.n.L(i2);
            jl8Var.readFully(this.n.d(), 0, i2);
        }
    }

    public void x(int i, long j) throws ParserException {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("ContentEncodingOrder ");
            sb.append(j);
            sb.append(" not supported");
            throw new ParserException(sb.toString());
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ContentEncodingScope ");
            sb2.append(j);
            sb2.append(" not supported");
            throw new ParserException(sb2.toString());
        }
        switch (i) {
            case 131:
                t(i).d = (int) j;
                return;
            case 136:
                t(i).V = j == 1;
                return;
            case 155:
                this.I = E(j);
                return;
            case 159:
                t(i).O = (int) j;
                return;
            case 176:
                t(i).m = (int) j;
                return;
            case 179:
                i(i);
                this.C.a(E(j));
                return;
            case SportReportBaseParser.ReportType.avgDivingDepth /* 186 */:
                t(i).n = (int) j;
                return;
            case 215:
                t(i).c = (int) j;
                return;
            case ErrorCode.ERROR_SP_NOTICE_NOT_READY /* 231 */:
                this.B = E(j);
                return;
            case 238:
                this.P = (int) j;
                return;
            case 241:
                if (this.E) {
                    return;
                }
                i(i);
                this.D.a(j);
                this.E = true;
                return;
            case VibrateModeSetViewModel.DEFAULT_BBJI /* 251 */:
                this.Q = true;
                return;
            case 16871:
                t(i).g = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(50);
                sb3.append("ContentCompAlgo ");
                sb3.append(j);
                sb3.append(" not supported");
                throw new ParserException(sb3.toString());
            case 17029:
                if (j < 1 || j > 2) {
                    StringBuilder sb4 = new StringBuilder(53);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j);
                    sb4.append(" not supported");
                    throw new ParserException(sb4.toString());
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(50);
                sb5.append("EBMLReadVersion ");
                sb5.append(j);
                sb5.append(" not supported");
                throw new ParserException(sb5.toString());
            case 18401:
                if (j == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(49);
                sb6.append("ContentEncAlgo ");
                sb6.append(j);
                sb6.append(" not supported");
                throw new ParserException(sb6.toString());
            case 18408:
                if (j == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(56);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j);
                sb7.append(" not supported");
                throw new ParserException(sb7.toString());
            case 21420:
                this.x = j + this.q;
                return;
            case 21432:
                int i2 = (int) j;
                j(i);
                if (i2 == 0) {
                    this.u.w = 0;
                    return;
                }
                if (i2 == 1) {
                    this.u.w = 2;
                    return;
                } else if (i2 == 3) {
                    this.u.w = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.u.w = 3;
                    return;
                }
            case 21680:
                t(i).o = (int) j;
                return;
            case 21682:
                t(i).q = (int) j;
                return;
            case 21690:
                t(i).p = (int) j;
                return;
            case 21930:
                t(i).U = j == 1;
                return;
            case 21998:
                t(i).f = (int) j;
                return;
            case 22186:
                t(i).R = j;
                return;
            case 22203:
                t(i).S = j;
                return;
            case 25188:
                t(i).P = (int) j;
                return;
            case 30321:
                j(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    this.u.f41023r = 0;
                    return;
                }
                if (i3 == 1) {
                    this.u.f41023r = 1;
                    return;
                } else if (i3 == 2) {
                    this.u.f41023r = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.u.f41023r = 3;
                    return;
                }
            case 2352003:
                t(i).e = (int) j;
                return;
            case 2807729:
                this.f41018r = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        j(i);
                        int i4 = (int) j;
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
                    case 21946:
                        j(i);
                        int i5 = (int) j;
                        if (i5 != 1) {
                            if (i5 == 16) {
                                this.u.z = 6;
                                return;
                            } else if (i5 == 18) {
                                this.u.z = 7;
                                return;
                            } else if (i5 != 6 && i5 != 7) {
                                return;
                            }
                        }
                        this.u.z = 3;
                        return;
                    case 21947:
                        j(i);
                        c cVar = this.u;
                        cVar.x = true;
                        int i6 = (int) j;
                        if (i6 == 1) {
                            cVar.y = 1;
                            return;
                        }
                        if (i6 == 9) {
                            cVar.y = 6;
                            return;
                        } else {
                            if (i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) {
                                cVar.y = 2;
                                return;
                            }
                            return;
                        }
                    case 21948:
                        t(i).B = (int) j;
                        return;
                    case 21949:
                        t(i).C = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public boolean z(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    public z8f(int i) {
        this(new ru5(), i);
    }

    public z8f(ga7 ga7Var, int i) {
        this.q = -1L;
        this.f41018r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.f41015a = ga7Var;
        ga7Var.b(new b());
        this.d = (i & 1) == 0;
        this.f41016b = new wnq();
        this.c = new SparseArray<>();
        this.g = new okh(4);
        this.h = new okh(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new okh(4);
        this.e = new okh(kgg.f23821a);
        this.f = new okh(4);
        this.j = new okh();
        this.f41017k = new okh();
        this.l = new okh(8);
        this.m = new okh();
        this.n = new okh();
        this.L = new int[1];
    }
}
