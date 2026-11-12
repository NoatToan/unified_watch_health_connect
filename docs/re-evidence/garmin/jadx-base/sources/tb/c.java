package tb;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import androidx.media3.common.h;
import androidx.media3.common.i;
import androidx.media3.common.q;
import androidx.media3.common.x;
import bb.f0;
import bb.g;
import bb.g0;
import bb.l0;
import bb.m0;
import bb.n;
import bb.o;
import bb.p;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.FirebaseError;
import fa.k;
import fa.l;
import fa.r;
import fa.z;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import q6.f;

/* JADX INFO: loaded from: classes.dex */
public class c implements n {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final byte[] f163518e0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final byte[] f163519f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final byte[] f163520g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final byte[] f163521h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final UUID f163522i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final Map<String, Integer> f163523j0;
    public boolean A;
    public long B;
    public long C;
    public long D;
    public l E;
    public l F;
    public boolean G;
    public boolean H;
    public int I;
    public long J;
    public long K;
    public int L;
    public int M;
    public int[] N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public long T;
    public int U;
    public int V;
    public int W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tb.b f163524a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f163525a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f163526b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public byte f163527b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray<C3079c> f163528c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f163529c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f163530d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public p f163531d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f163532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yb.n.a f163533f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f163534g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f163535h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r f163536i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r f163537j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r f163538k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r f163539l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r f163540m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r f163541n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r f163542o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r f163543p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ByteBuffer f163544q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f163545r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f163546s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f163547t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f163548u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f163549v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C3079c f163550w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f163551x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f163552y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f163553z;

    public final class b {
        private b() {
        }

        /* JADX WARN: Code duplicated, block: B:131:0x0294  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void a(int i14, int i15, o oVar) throws ParserException {
            int i16;
            int i17;
            int i18;
            long j8;
            int i19;
            int i24;
            int[] iArr;
            int i25;
            int i26;
            int i27;
            c cVar = c.this;
            e eVar = cVar.f163526b;
            SparseArray<C3079c> sparseArray = cVar.f163528c;
            r rVar = cVar.f163538k;
            r rVar2 = cVar.f163536i;
            int i28 = 1;
            int i29 = 0;
            if (i14 != 161 && i14 != 163) {
                if (i14 == 165) {
                    if (cVar.I != 2) {
                        return;
                    }
                    C3079c c3079c = sparseArray.get(cVar.O);
                    int i30 = cVar.R;
                    r rVar3 = cVar.f163543p;
                    if (i30 != 4 || !"V_VP9".equals(c3079c.f163556b)) {
                        oVar.skipFully(i15);
                        return;
                    } else {
                        rVar3.D(i15);
                        oVar.readFully(rVar3.f70054a, 0, i15);
                        return;
                    }
                }
                if (i14 == 16877) {
                    cVar.g(i14);
                    C3079c c3079c2 = cVar.f163550w;
                    int i34 = c3079c2.f163561g;
                    if (i34 != 1685485123 && i34 != 1685480259) {
                        oVar.skipFully(i15);
                        return;
                    }
                    byte[] bArr = new byte[i15];
                    c3079c2.O = bArr;
                    oVar.readFully(bArr, 0, i15);
                    return;
                }
                if (i14 == 16981) {
                    cVar.g(i14);
                    C3079c c3079c3 = cVar.f163550w;
                    byte[] bArr2 = new byte[i15];
                    c3079c3.f163563i = bArr2;
                    oVar.readFully(bArr2, 0, i15);
                    return;
                }
                if (i14 == 18402) {
                    byte[] bArr3 = new byte[i15];
                    oVar.readFully(bArr3, 0, i15);
                    cVar.g(i14);
                    cVar.f163550w.f163564j = new l0.a(1, bArr3, 0, 0);
                    return;
                }
                if (i14 == 21419) {
                    Arrays.fill(rVar.f70054a, (byte) 0);
                    oVar.readFully(rVar.f70054a, 4 - i15, i15);
                    rVar.G(0);
                    cVar.f163552y = (int) rVar.w();
                    return;
                }
                if (i14 == 25506) {
                    cVar.g(i14);
                    C3079c c3079c4 = cVar.f163550w;
                    byte[] bArr4 = new byte[i15];
                    c3079c4.f163565k = bArr4;
                    oVar.readFully(bArr4, 0, i15);
                    return;
                }
                if (i14 != 30322) {
                    throw ParserException.createForMalformedContainer("Unexpected id: " + i14, null);
                }
                cVar.g(i14);
                C3079c c3079c5 = cVar.f163550w;
                byte[] bArr5 = new byte[i15];
                c3079c5.f163577w = bArr5;
                oVar.readFully(bArr5, 0, i15);
                return;
            }
            if (cVar.I == 0) {
                cVar.O = (int) eVar.b(oVar, false, true, 8);
                cVar.P = eVar.f163586c;
                cVar.K = C.TIME_UNSET;
                cVar.I = 1;
                rVar2.D(0);
            }
            C3079c c3079c6 = sparseArray.get(cVar.O);
            if (c3079c6 == null) {
                oVar.skipFully(i15 - cVar.P);
                cVar.I = 0;
                return;
            }
            c3079c6.Y.getClass();
            if (cVar.I == 1) {
                cVar.j(oVar, 3);
                int i35 = (rVar2.f70054a[2] & 6) >> 1;
                int i36 = 255;
                if (i35 == 0) {
                    cVar.M = 1;
                    int[] iArr2 = cVar.N;
                    if (iArr2 == null) {
                        iArr2 = new int[1];
                    } else if (iArr2.length < 1) {
                        iArr2 = new int[Math.max(iArr2.length * 2, 1)];
                    }
                    cVar.N = iArr2;
                    iArr2[0] = (i15 - cVar.P) - 3;
                } else {
                    cVar.j(oVar, 4);
                    int i37 = (rVar2.f70054a[3] & 255) + 1;
                    cVar.M = i37;
                    int[] iArr3 = cVar.N;
                    if (iArr3 == null) {
                        iArr3 = new int[i37];
                    } else if (iArr3.length < i37) {
                        iArr3 = new int[Math.max(iArr3.length * 2, i37)];
                    }
                    cVar.N = iArr3;
                    if (i35 == 2) {
                        int i38 = (i15 - cVar.P) - 4;
                        int i39 = cVar.M;
                        Arrays.fill(iArr3, 0, i39, i38 / i39);
                    } else {
                        if (i35 == 1) {
                            int i44 = 0;
                            int i45 = 0;
                            int i46 = 4;
                            while (true) {
                                i24 = cVar.M - 1;
                                iArr = cVar.N;
                                if (i44 >= i24) {
                                    break;
                                }
                                iArr[i44] = 0;
                                while (true) {
                                    i25 = i46 + 1;
                                    cVar.j(oVar, i25);
                                    int i47 = rVar2.f70054a[i46] & 255;
                                    int[] iArr4 = cVar.N;
                                    i26 = iArr4[i44] + i47;
                                    iArr4[i44] = i26;
                                    if (i47 != 255) {
                                        break;
                                    } else {
                                        i46 = i25;
                                    }
                                }
                                i45 += i26;
                                i44++;
                                i46 = i25;
                            }
                            iArr[i24] = ((i15 - cVar.P) - i46) - i45;
                        } else {
                            if (i35 != 3) {
                                throw ParserException.createForMalformedContainer("Unexpected lacing value: " + i35, null);
                            }
                            int i48 = 0;
                            int i49 = 0;
                            int i54 = 4;
                            while (true) {
                                int i55 = cVar.M - i28;
                                int[] iArr5 = cVar.N;
                                if (i48 >= i55) {
                                    i16 = i28;
                                    i17 = i29;
                                    iArr5[i55] = ((i15 - cVar.P) - i54) - i49;
                                    break;
                                }
                                iArr5[i48] = i29;
                                int i56 = i54 + 1;
                                cVar.j(oVar, i56);
                                if (rVar2.f70054a[i54] == 0) {
                                    throw ParserException.createForMalformedContainer("No valid varint length mask found", null);
                                }
                                int i57 = i28;
                                int i58 = i29;
                                while (true) {
                                    if (i58 >= 8) {
                                        i18 = i29;
                                        j8 = 0;
                                        i19 = i56;
                                        break;
                                    }
                                    int i59 = i57 << (7 - i58);
                                    i18 = i29;
                                    if ((rVar2.f70054a[i54] & i59) != 0) {
                                        i19 = i56 + i58;
                                        cVar.j(oVar, i19);
                                        j8 = rVar2.f70054a[i54] & i36 & (~i59);
                                        while (i56 < i19) {
                                            j8 = (j8 << 8) | ((long) (rVar2.f70054a[i56] & i36));
                                            i56++;
                                            i36 = 255;
                                        }
                                        if (i48 <= 0) {
                                            break;
                                        }
                                        j8 -= (1 << ((i58 * 7) + 6)) - 1;
                                        break;
                                    }
                                    i58++;
                                    i29 = i18;
                                    i36 = 255;
                                }
                                if (j8 < -2147483648L || j8 > 2147483647L) {
                                    throw ParserException.createForMalformedContainer("EBML lacing sample size out of range.", null);
                                }
                                int i64 = (int) j8;
                                int[] iArr6 = cVar.N;
                                if (i48 != 0) {
                                    i64 += iArr6[i48 - 1];
                                }
                                iArr6[i48] = i64;
                                i49 += i64;
                                i48++;
                                i54 = i19;
                                i28 = i57;
                                i29 = i18;
                                i36 = 255;
                            }
                        }
                        byte[] bArr6 = rVar2.f70054a;
                        cVar.J = cVar.l((bArr6[i16] & UnsignedBytes.MAX_VALUE) | (bArr6[i17] << 8)) + cVar.D;
                        if (c3079c6.f163558d != 2 || (i14 == 163 && (rVar2.f70054a[2] & UnsignedBytes.MAX_POWER_OF_TWO) == 128)) {
                            i27 = i16;
                        } else {
                            i27 = i17;
                        }
                        cVar.Q = i27;
                        cVar.I = 2;
                        cVar.L = i17;
                    }
                }
                i16 = 1;
                i17 = 0;
                byte[] bArr7 = rVar2.f70054a;
                cVar.J = cVar.l((bArr7[i16] & UnsignedBytes.MAX_VALUE) | (bArr7[i17] << 8)) + cVar.D;
                if (c3079c6.f163558d != 2) {
                    i27 = i16;
                } else {
                    i27 = i16;
                }
                cVar.Q = i27;
                cVar.I = 2;
                cVar.L = i17;
            } else {
                i16 = 1;
            }
            if (i14 == 163) {
                while (true) {
                    int i65 = cVar.L;
                    if (i65 >= cVar.M) {
                        cVar.I = 0;
                        return;
                    }
                    cVar.h(c3079c6, ((long) ((cVar.L * c3079c6.f163559e) / 1000)) + cVar.J, cVar.Q, cVar.m(oVar, c3079c6, cVar.N[i65], false), 0);
                    cVar.L++;
                }
            } else {
                while (true) {
                    int i66 = cVar.L;
                    if (i66 >= cVar.M) {
                        return;
                    }
                    int[] iArr7 = cVar.N;
                    boolean z14 = i16;
                    iArr7[i66] = cVar.m(oVar, c3079c6, iArr7[i66], z14);
                    cVar.L += z14 ? 1 : 0;
                }
            }
        }

        public final void b(int i14, long j8) throws ParserException {
            c cVar = c.this;
            cVar.getClass();
            if (i14 == 20529) {
                if (j8 == 0) {
                    return;
                }
                throw ParserException.createForMalformedContainer("ContentEncodingOrder " + j8 + " not supported", null);
            }
            if (i14 == 20530) {
                if (j8 == 1) {
                    return;
                }
                throw ParserException.createForMalformedContainer("ContentEncodingScope " + j8 + " not supported", null);
            }
            switch (i14) {
                case 131:
                    cVar.g(i14);
                    cVar.f163550w.f163558d = (int) j8;
                    return;
                case SyslogConstants.LOG_LOCAL1 /* 136 */:
                    cVar.g(i14);
                    cVar.f163550w.W = j8 == 1;
                    return;
                case ModuleDescriptor.MODULE_VERSION /* 155 */:
                    cVar.K = cVar.l(j8);
                    return;
                case 159:
                    cVar.g(i14);
                    cVar.f163550w.P = (int) j8;
                    return;
                case SyslogConstants.LOG_LOCAL6 /* 176 */:
                    cVar.g(i14);
                    cVar.f163550w.f163567m = (int) j8;
                    return;
                case 179:
                    cVar.f(i14);
                    cVar.E.a(cVar.l(j8));
                    return;
                case 186:
                    cVar.g(i14);
                    cVar.f163550w.f163568n = (int) j8;
                    return;
                case 215:
                    cVar.g(i14);
                    cVar.f163550w.f163557c = (int) j8;
                    return;
                case 231:
                    cVar.D = cVar.l(j8);
                    return;
                case 238:
                    cVar.R = (int) j8;
                    return;
                case 241:
                    if (cVar.G) {
                        return;
                    }
                    cVar.f(i14);
                    cVar.F.a(j8);
                    cVar.G = true;
                    return;
                case 251:
                    cVar.S = true;
                    return;
                case 16871:
                    cVar.g(i14);
                    cVar.f163550w.f163561g = (int) j8;
                    return;
                case 16980:
                    if (j8 == 3) {
                        return;
                    }
                    throw ParserException.createForMalformedContainer("ContentCompAlgo " + j8 + " not supported", null);
                case 17029:
                    if (j8 < 1 || j8 > 2) {
                        throw ParserException.createForMalformedContainer("DocTypeReadVersion " + j8 + " not supported", null);
                    }
                    return;
                case 17143:
                    if (j8 == 1) {
                        return;
                    }
                    throw ParserException.createForMalformedContainer("EBMLReadVersion " + j8 + " not supported", null);
                case 18401:
                    if (j8 == 5) {
                        return;
                    }
                    throw ParserException.createForMalformedContainer("ContentEncAlgo " + j8 + " not supported", null);
                case 18408:
                    if (j8 == 1) {
                        return;
                    }
                    throw ParserException.createForMalformedContainer("AESSettingsCipherMode " + j8 + " not supported", null);
                case 21420:
                    cVar.f163553z = j8 + cVar.f163546s;
                    return;
                case 21432:
                    int i15 = (int) j8;
                    cVar.g(i14);
                    if (i15 == 0) {
                        cVar.f163550w.f163578x = 0;
                        return;
                    }
                    if (i15 == 1) {
                        cVar.f163550w.f163578x = 2;
                        return;
                    } else if (i15 == 3) {
                        cVar.f163550w.f163578x = 1;
                        return;
                    } else {
                        if (i15 != 15) {
                            return;
                        }
                        cVar.f163550w.f163578x = 3;
                        return;
                    }
                case 21680:
                    cVar.g(i14);
                    cVar.f163550w.f163570p = (int) j8;
                    return;
                case 21682:
                    cVar.g(i14);
                    cVar.f163550w.f163572r = (int) j8;
                    return;
                case 21690:
                    cVar.g(i14);
                    cVar.f163550w.f163571q = (int) j8;
                    return;
                case 21930:
                    cVar.g(i14);
                    cVar.f163550w.V = j8 == 1;
                    return;
                case 21938:
                    cVar.g(i14);
                    C3079c c3079c = cVar.f163550w;
                    c3079c.f163579y = true;
                    c3079c.f163569o = (int) j8;
                    return;
                case 21998:
                    cVar.g(i14);
                    cVar.f163550w.f163560f = (int) j8;
                    return;
                case 22186:
                    cVar.g(i14);
                    cVar.f163550w.S = j8;
                    return;
                case 22203:
                    cVar.g(i14);
                    cVar.f163550w.T = j8;
                    return;
                case 25188:
                    cVar.g(i14);
                    cVar.f163550w.Q = (int) j8;
                    return;
                case 30114:
                    cVar.T = j8;
                    return;
                case 30321:
                    cVar.g(i14);
                    int i16 = (int) j8;
                    if (i16 == 0) {
                        cVar.f163550w.f163573s = 0;
                        return;
                    }
                    if (i16 == 1) {
                        cVar.f163550w.f163573s = 1;
                        return;
                    } else if (i16 == 2) {
                        cVar.f163550w.f163573s = 2;
                        return;
                    } else {
                        if (i16 != 3) {
                            return;
                        }
                        cVar.f163550w.f163573s = 3;
                        return;
                    }
                case 2352003:
                    cVar.g(i14);
                    cVar.f163550w.f163559e = (int) j8;
                    return;
                case 2807729:
                    cVar.f163547t = j8;
                    return;
                default:
                    switch (i14) {
                        case 21945:
                            cVar.g(i14);
                            int i17 = (int) j8;
                            if (i17 == 1) {
                                cVar.f163550w.B = 2;
                                return;
                            } else {
                                if (i17 != 2) {
                                    return;
                                }
                                cVar.f163550w.B = 1;
                                return;
                            }
                        case 21946:
                            cVar.g(i14);
                            int iH = i.h((int) j8);
                            if (iH != -1) {
                                cVar.f163550w.A = iH;
                                return;
                            }
                            return;
                        case 21947:
                            cVar.g(i14);
                            cVar.f163550w.f163579y = true;
                            int iG = i.g((int) j8);
                            if (iG != -1) {
                                cVar.f163550w.f163580z = iG;
                                return;
                            }
                            return;
                        case 21948:
                            cVar.g(i14);
                            cVar.f163550w.C = (int) j8;
                            return;
                        case 21949:
                            cVar.g(i14);
                            cVar.f163550w.D = (int) j8;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    /* JADX INFO: renamed from: tb.c$c, reason: collision with other inner class name */
    public static final class C3079c {
        public byte[] O;
        public m0 U;
        public boolean V;
        public l0 Y;
        public int Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f163555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f163556b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f163557c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f163558d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f163559e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f163560f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f163561g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f163562h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public byte[] f163563i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public l0.a f163564j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public byte[] f163565k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public androidx.media3.common.l f163566l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f163567m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f163568n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f163569o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f163570p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f163571q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f163572r = 0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f163573s = -1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float f163574t = 0.0f;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float f163575u = 0.0f;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public float f163576v = 0.0f;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public byte[] f163577w = null;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f163578x = -1;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public boolean f163579y = false;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f163580z = -1;
        public int A = -1;
        public int B = -1;
        public int C = 1000;
        public int D = 200;
        public float E = -1.0f;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public float M = -1.0f;
        public float N = -1.0f;
        public int P = 1;
        public int Q = -1;
        public int R = 8000;
        public long S = 0;
        public long T = 0;
        public boolean W = true;
        public String X = "eng";

        public final byte[] a(String str) throws ParserException {
            byte[] bArr = this.f163565k;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.createForMalformedContainer("Missing CodecPrivate for codec " + str, null);
        }
    }

    static {
        int i14 = z.f70071a;
        f163519f0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f163520g0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f163521h0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f163522i0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        f.r(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        f.r(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f163523j0 = Collections.unmodifiableMap(map);
    }

    public c(tb.b bVar, int i14, yb.n.a aVar) {
        this.f163546s = -1L;
        this.f163547t = C.TIME_UNSET;
        this.f163548u = C.TIME_UNSET;
        this.f163549v = C.TIME_UNSET;
        this.B = -1L;
        this.C = -1L;
        this.D = C.TIME_UNSET;
        this.f163524a = bVar;
        ((tb.a) bVar).f163512d = new b();
        this.f163533f = aVar;
        this.f163530d = (i14 & 1) == 0;
        this.f163532e = (i14 & 2) == 0;
        this.f163526b = new e();
        this.f163528c = new SparseArray<>();
        this.f163536i = new r(4);
        this.f163537j = new r(ByteBuffer.allocate(4).putInt(-1).array());
        this.f163538k = new r(4);
        this.f163534g = new r(ga.e.f76514a);
        this.f163535h = new r(4);
        this.f163539l = new r();
        this.f163540m = new r();
        this.f163541n = new r(8);
        this.f163542o = new r();
        this.f163543p = new r();
        this.N = new int[1];
    }

    public static byte[] i(long j8, String str, long j14) {
        fa.a.a(j8 != C.TIME_UNSET);
        int i14 = (int) (j8 / 3600000000L);
        long j15 = j8 - (((long) i14) * 3600000000L);
        int i15 = (int) (j15 / 60000000);
        long j16 = j15 - (((long) i15) * 60000000);
        int i16 = (int) (j16 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf((int) ((j16 - (((long) i16) * 1000000)) / j14)));
        int i17 = z.f70071a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:233:0x0385  */
    /* JADX WARN: Code duplicated, block: B:521:0x08c8  */
    /* JADX WARN: Code duplicated, block: B:526:0x08df  */
    /* JADX WARN: Code duplicated, block: B:527:0x08e1  */
    /* JADX WARN: Code duplicated, block: B:530:0x08f2  */
    /* JADX WARN: Code duplicated, block: B:531:0x08ff  */
    /* JADX WARN: Code duplicated, block: B:533:0x0905  */
    /* JADX WARN: Code duplicated, block: B:535:0x0909  */
    /* JADX WARN: Code duplicated, block: B:537:0x090e  */
    /* JADX WARN: Code duplicated, block: B:540:0x0916  */
    /* JADX WARN: Code duplicated, block: B:542:0x091b  */
    /* JADX WARN: Code duplicated, block: B:545:0x0922  */
    /* JADX WARN: Code duplicated, block: B:548:0x0930  */
    /* JADX WARN: Code duplicated, block: B:551:0x0935  */
    /* JADX WARN: Code duplicated, block: B:553:0x093b  */
    /* JADX WARN: Code duplicated, block: B:573:0x09ef  */
    /* JADX WARN: Code duplicated, block: B:575:0x0a0e  */
    /* JADX WARN: Code duplicated, block: B:578:0x0a13  */
    /* JADX WARN: Code duplicated, block: B:581:0x0a26  */
    /* JADX WARN: Code duplicated, block: B:584:0x0a2b  */
    /* JADX WARN: Code duplicated, block: B:590:0x0a44  */
    /* JADX WARN: Code duplicated, block: B:591:0x0a46  */
    /* JADX WARN: Code duplicated, block: B:593:0x0a50  */
    /* JADX WARN: Code duplicated, block: B:594:0x0a53  */
    /* JADX WARN: Code duplicated, block: B:596:0x0a5d  */
    /* JADX WARN: Code duplicated, block: B:602:0x0a75  */
    /* JADX WARN: Code duplicated, block: B:604:0x0a8f  */
    /* JADX WARN: Code duplicated, block: B:606:0x0a95  */
    /* JADX WARN: Code duplicated, block: B:622:0x0ac1  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ce  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v53, types: [java.lang.Object, tb.c$c] */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v45, types: [boolean] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // bb.n
    public final int b(o oVar, f0 f0Var) throws ParserException {
        o oVar2;
        boolean z14;
        int i14;
        boolean z15;
        String str;
        long j8;
        int i15;
        int iA;
        c cVar;
        boolean z16;
        byte b14;
        byte b15;
        c cVar2;
        List<byte[]> listOf;
        int iX;
        int i16;
        List<byte[]> list;
        Throwable th3;
        Pair pair;
        String str2;
        List<byte[]> list2;
        String str3;
        List<byte[]> list3;
        c cVar3;
        List<byte[]> list4;
        List<byte[]> list5;
        int i17;
        q.b bVar;
        boolean zJ;
        int i18;
        int i19;
        int i24;
        float f14;
        i iVarA;
        String str4;
        int iIntValue;
        byte[] bArr;
        int i25;
        int i26;
        int i27;
        String str5;
        c cVar4;
        bb.l lVarA;
        g0 bVar2;
        int i28;
        c cVar5 = this;
        cVar5.H = false;
        boolean z17 = true;
        while (true) {
            int i29 = -1;
            if (z17 && !cVar5.H) {
                tb.a aVar = (tb.a) cVar5.f163524a;
                e eVar = aVar.f163511c;
                ArrayDeque<tb.a.b> arrayDeque = aVar.f163510b;
                fa.a.f(aVar.f163512d);
                while (true) {
                    tb.a.b bVarPeek = arrayDeque.peek();
                    if (bVarPeek == null || oVar.getPosition() < bVarPeek.f163517b) {
                        int i30 = 0;
                        if (aVar.f163513e == 0) {
                            oVar2 = oVar;
                            int i34 = 4;
                            long jB = eVar.b(oVar2, true, false, 4);
                            if (jB == -2) {
                                byte[] bArr2 = aVar.f163509a;
                                oVar2.resetPeekPosition();
                                while (true) {
                                    oVar2.peekFully(bArr2, i30, i34);
                                    byte b16 = bArr2[i30];
                                    int i35 = 0;
                                    while (true) {
                                        if (i35 >= 8) {
                                            i15 = -1;
                                        } else if ((e.f163583d[i35] & ((long) b16)) != 0) {
                                            i15 = i35 + 1;
                                        } else {
                                            i35++;
                                        }
                                    }
                                    if (i15 != -1 && i15 <= 4) {
                                        iA = (int) e.a(bArr2, i15, false);
                                        c.this.getClass();
                                        if (iA == 357149030 || iA == 524531317 || iA == 475249515 || iA == 374648427) {
                                        }
                                    }
                                    oVar2.skipFully(1);
                                    i30 = 0;
                                    i34 = 4;
                                }
                                oVar2.skipFully(i15);
                                j8 = iA;
                            } else {
                                j8 = jB;
                            }
                            z14 = true;
                            if (j8 == -1) {
                                z17 = false;
                                z15 = false;
                            } else {
                                aVar.f163514f = (int) j8;
                                aVar.f163513e = 1;
                            }
                        } else {
                            oVar2 = oVar;
                            z14 = true;
                        }
                        if (aVar.f163513e == z14) {
                            aVar.f163515g = eVar.b(oVar2, false, z14, 8);
                            aVar.f163513e = 2;
                        }
                        b bVar3 = aVar.f163512d;
                        int i36 = aVar.f163514f;
                        c.this.getClass();
                        switch (i36) {
                            case 131:
                            case SyslogConstants.LOG_LOCAL1 /* 136 */:
                            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                            case 159:
                            case SyslogConstants.LOG_LOCAL6 /* 176 */:
                            case 179:
                            case 186:
                            case 215:
                            case 231:
                            case 238:
                            case 241:
                            case 251:
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
                            case 21938:
                            case 21945:
                            case 21946:
                            case 21947:
                            case 21948:
                            case 21949:
                            case 21998:
                            case 22186:
                            case 22203:
                            case 25188:
                            case 30114:
                            case 30321:
                            case 2352003:
                            case 2807729:
                                i14 = 2;
                                break;
                            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                            case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
                            case 21358:
                            case 2274716:
                                i14 = 3;
                                break;
                            case SyslogConstants.LOG_LOCAL4 /* 160 */:
                            case 166:
                            case 174:
                            case 183:
                            case 187:
                            case 224:
                            case 225:
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
                                i14 = 1;
                                break;
                            case 161:
                            case 163:
                            case 165:
                            case 16877:
                            case 16981:
                            case 18402:
                            case 21419:
                            case 25506:
                            case 30322:
                                i14 = 4;
                                break;
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
                                i14 = 5;
                                break;
                            default:
                                i14 = 0;
                                break;
                        }
                        if (i14 == 0) {
                            oVar2.skipFully((int) aVar.f163515g);
                            aVar.f163513e = 0;
                            i29 = -1;
                        } else if (i14 == 1) {
                            long position = oVar2.getPosition();
                            arrayDeque.push(new tb.a.b(aVar.f163514f, aVar.f163515g + position));
                            b bVar4 = aVar.f163512d;
                            int i37 = aVar.f163514f;
                            long j14 = aVar.f163515g;
                            c cVar6 = c.this;
                            fa.a.f(cVar6.f163531d0);
                            if (i37 == 160) {
                                z15 = false;
                                cVar6.S = false;
                                cVar6.T = 0L;
                            } else if (i37 == 174) {
                                z15 = false;
                                cVar6.f163550w = new C3079c();
                            } else if (i37 != 187) {
                                if (i37 == 19899) {
                                    cVar6.f163552y = -1;
                                    cVar6.f163553z = -1L;
                                } else if (i37 == 20533) {
                                    cVar6.g(i37);
                                    cVar6.f163550w.f163562h = true;
                                } else if (i37 == 21968) {
                                    cVar6.g(i37);
                                    cVar6.f163550w.f163579y = true;
                                } else if (i37 == 408125543) {
                                    long j15 = cVar6.f163546s;
                                    if (j15 != -1 && j15 != position) {
                                        throw ParserException.createForMalformedContainer("Multiple Segment elements not supported", null);
                                    }
                                    cVar6.f163546s = position;
                                    cVar6.f163545r = j14;
                                } else if (i37 == 475249515) {
                                    cVar6.E = new l();
                                    cVar6.F = new l();
                                } else if (i37 == 524531317 && !cVar6.f163551x) {
                                    if (!cVar6.f163530d || cVar6.B == -1) {
                                        cVar6.f163531d0.a(new g0.b(cVar6.f163549v));
                                        cVar6.f163551x = true;
                                    } else {
                                        cVar6.A = true;
                                    }
                                }
                                z15 = false;
                            } else {
                                z15 = false;
                                cVar6.G = false;
                            }
                            aVar.f163513e = z15 ? 1 : 0;
                        } else if (i14 == 2) {
                            long j16 = aVar.f163515g;
                            if (j16 > 8) {
                                throw ParserException.createForMalformedContainer("Invalid integer size: " + aVar.f163515g, null);
                            }
                            aVar.f163512d.b(aVar.f163514f, aVar.a(oVar2, (int) j16));
                            z15 = false;
                            aVar.f163513e = 0;
                        } else if (i14 == 3) {
                            long j17 = aVar.f163515g;
                            if (j17 > 2147483647L) {
                                throw ParserException.createForMalformedContainer("String element size: " + aVar.f163515g, null);
                            }
                            b bVar5 = aVar.f163512d;
                            int i38 = aVar.f163514f;
                            int i39 = (int) j17;
                            if (i39 == 0) {
                                str = "";
                            } else {
                                byte[] bArr3 = new byte[i39];
                                oVar2.readFully(bArr3, 0, i39);
                                while (i39 > 0 && bArr3[i39 - 1] == 0) {
                                    i39--;
                                }
                                str = new String(bArr3, 0, i39);
                            }
                            c cVar7 = c.this;
                            cVar7.getClass();
                            if (i38 == 134) {
                                cVar7.g(i38);
                                cVar7.f163550w.f163556b = str;
                            } else if (i38 != 17026) {
                                if (i38 == 21358) {
                                    cVar7.g(i38);
                                    cVar7.f163550w.f163555a = str;
                                } else if (i38 == 2274716) {
                                    cVar7.g(i38);
                                    cVar7.f163550w.X = str;
                                }
                            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                                throw ParserException.createForMalformedContainer("DocType " + str + " not supported", null);
                            }
                            z15 = false;
                            aVar.f163513e = 0;
                        } else if (i14 == 4) {
                            aVar.f163512d.a(aVar.f163514f, (int) aVar.f163515g, oVar2);
                            z15 = false;
                            aVar.f163513e = 0;
                        } else {
                            if (i14 != 5) {
                                throw ParserException.createForMalformedContainer("Invalid element type " + i14, null);
                            }
                            long j18 = aVar.f163515g;
                            if (j18 != 4 && j18 != 8) {
                                throw ParserException.createForMalformedContainer("Invalid float size: " + aVar.f163515g, null);
                            }
                            b bVar6 = aVar.f163512d;
                            int i44 = aVar.f163514f;
                            int i45 = (int) j18;
                            long jA = aVar.a(oVar2, i45);
                            double dIntBitsToFloat = i45 == 4 ? Float.intBitsToFloat((int) jA) : Double.longBitsToDouble(jA);
                            c cVar8 = c.this;
                            if (i44 == 181) {
                                cVar8.g(i44);
                                cVar8.f163550w.R = (int) dIntBitsToFloat;
                            } else if (i44 != 17545) {
                                switch (i44) {
                                    case 21969:
                                        cVar8.g(i44);
                                        cVar8.f163550w.E = (float) dIntBitsToFloat;
                                        break;
                                    case 21970:
                                        cVar8.g(i44);
                                        cVar8.f163550w.F = (float) dIntBitsToFloat;
                                        break;
                                    case 21971:
                                        cVar8.g(i44);
                                        cVar8.f163550w.G = (float) dIntBitsToFloat;
                                        break;
                                    case 21972:
                                        cVar8.g(i44);
                                        cVar8.f163550w.H = (float) dIntBitsToFloat;
                                        break;
                                    case 21973:
                                        cVar8.g(i44);
                                        cVar8.f163550w.I = (float) dIntBitsToFloat;
                                        break;
                                    case 21974:
                                        cVar8.g(i44);
                                        cVar8.f163550w.J = (float) dIntBitsToFloat;
                                        break;
                                    case 21975:
                                        cVar8.g(i44);
                                        cVar8.f163550w.K = (float) dIntBitsToFloat;
                                        break;
                                    case 21976:
                                        cVar8.g(i44);
                                        cVar8.f163550w.L = (float) dIntBitsToFloat;
                                        break;
                                    case 21977:
                                        cVar8.g(i44);
                                        cVar8.f163550w.M = (float) dIntBitsToFloat;
                                        break;
                                    case 21978:
                                        cVar8.g(i44);
                                        cVar8.f163550w.N = (float) dIntBitsToFloat;
                                        break;
                                    default:
                                        switch (i44) {
                                            case 30323:
                                                cVar8.g(i44);
                                                cVar8.f163550w.f163574t = (float) dIntBitsToFloat;
                                                break;
                                            case 30324:
                                                cVar8.g(i44);
                                                cVar8.f163550w.f163575u = (float) dIntBitsToFloat;
                                                break;
                                            case 30325:
                                                cVar8.g(i44);
                                                cVar8.f163550w.f163576v = (float) dIntBitsToFloat;
                                                break;
                                            default:
                                                cVar8.getClass();
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                cVar8.f163548u = (long) dIntBitsToFloat;
                            }
                            z15 = false;
                            aVar.f163513e = 0;
                        }
                    } else {
                        b bVar7 = aVar.f163512d;
                        int i46 = arrayDeque.pop().f163516a;
                        c cVar9 = c.this;
                        SparseArray<C3079c> sparseArray = cVar9.f163528c;
                        fa.a.f(cVar9.f163531d0);
                        if (i46 == 160) {
                            if (cVar9.I == 2) {
                                C3079c c3079c = sparseArray.get(cVar9.O);
                                c3079c.Y.getClass();
                                if (cVar9.T > 0 && "A_OPUS".equals(c3079c.f163556b)) {
                                    r rVar = cVar9.f163543p;
                                    byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(cVar9.T).array();
                                    rVar.getClass();
                                    rVar.E(bArrArray, bArrArray.length);
                                }
                                int i47 = 0;
                                for (int i48 = 0; i48 < cVar9.M; i48++) {
                                    i47 += cVar9.N[i48];
                                }
                                int i49 = 0;
                                while (i49 < cVar9.M) {
                                    long j19 = cVar9.J + ((long) ((c3079c.f163559e * i49) / 1000));
                                    int i54 = cVar9.Q;
                                    if (i49 == 0 && !cVar9.S) {
                                        i54 |= 1;
                                    }
                                    int i55 = cVar9.N[i49];
                                    int i56 = i47 - i55;
                                    cVar9.h(c3079c, j19, i54, i55, i56);
                                    i49++;
                                    i47 = i56;
                                }
                                z16 = false;
                                cVar9.I = 0;
                            }
                            oVar2 = oVar;
                            z15 = z16;
                        } else if (i46 == 174) {
                            ?? r14 = cVar9.f163550w;
                            fa.a.f(r14);
                            String str6 = r14.f163556b;
                            if (str6 == null) {
                                throw ParserException.createForMalformedContainer("CodecId is missing in TrackEntry element", null);
                            }
                            switch (str6.hashCode()) {
                                case -2095576542:
                                    if (str6.equals("V_MPEG4/ISO/AP")) {
                                        b14 = 0;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                case -2095575984:
                                    if (str6.equals("V_MPEG4/ISO/SP")) {
                                        b14 = 1;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                case -1985379776:
                                    if (str6.equals("A_MS/ACM")) {
                                        b14 = 2;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                case -1784763192:
                                    if (str6.equals("A_TRUEHD")) {
                                        b14 = 3;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                case -1730367663:
                                    if (str6.equals("A_VORBIS")) {
                                        b14 = 4;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                case -1482641358:
                                    if (str6.equals("A_MPEG/L2")) {
                                        b14 = 5;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                case -1482641357:
                                    if (str6.equals("A_MPEG/L3")) {
                                        b14 = 6;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                case -1373388978:
                                    if (str6.equals("V_MS/VFW/FOURCC")) {
                                        b14 = 7;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                case -933872740:
                                    if (str6.equals("S_DVBSUB")) {
                                        b14 = 8;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                case -538363189:
                                    if (str6.equals("V_MPEG4/ISO/ASP")) {
                                        b14 = 9;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                case -538363109:
                                    if (str6.equals("V_MPEG4/ISO/AVC")) {
                                        b14 = 10;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                case -425012669:
                                    if (str6.equals("S_VOBSUB")) {
                                        b14 = Ascii.VT;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                case -356037306:
                                    if (str6.equals("A_DTS/LOSSLESS")) {
                                        b14 = Ascii.FF;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                case 62923557:
                                    if (str6.equals("A_AAC")) {
                                        b14 = Ascii.CR;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                case 62923603:
                                    if (str6.equals("A_AC3")) {
                                        b14 = Ascii.SO;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                case 62927045:
                                    if (str6.equals("A_DTS")) {
                                        b14 = Ascii.SI;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                case 82318131:
                                    if (str6.equals("V_AV1")) {
                                        b14 = Ascii.DLE;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                case 82338133:
                                    if (str6.equals("V_VP8")) {
                                        b14 = 17;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                case 82338134:
                                    if (str6.equals("V_VP9")) {
                                        b14 = Ascii.DC2;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                case 99146302:
                                    if (str6.equals("S_HDMV/PGS")) {
                                        b14 = 19;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                case 444813526:
                                    if (str6.equals("V_THEORA")) {
                                        b14 = 20;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                case 542569478:
                                    if (str6.equals("A_DTS/EXPRESS")) {
                                        b14 = Ascii.NAK;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                case 635596514:
                                    if (str6.equals("A_PCM/FLOAT/IEEE")) {
                                        b14 = Ascii.SYN;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                case 725948237:
                                    if (str6.equals("A_PCM/INT/BIG")) {
                                        b14 = Ascii.ETB;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                case 725957860:
                                    if (str6.equals("A_PCM/INT/LIT")) {
                                        b14 = Ascii.CAN;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                case 738597099:
                                    if (str6.equals("S_TEXT/ASS")) {
                                        b14 = Ascii.EM;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                case 855502857:
                                    if (str6.equals("V_MPEGH/ISO/HEVC")) {
                                        b14 = Ascii.SUB;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                case 1045209816:
                                    if (str6.equals("S_TEXT/WEBVTT")) {
                                        b14 = Ascii.ESC;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                case 1422270023:
                                    if (str6.equals("S_TEXT/UTF8")) {
                                        b14 = Ascii.FS;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                case 1809237540:
                                    if (str6.equals("V_MPEG2")) {
                                        b14 = Ascii.GS;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                case 1950749482:
                                    if (str6.equals("A_EAC3")) {
                                        b14 = Ascii.RS;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                case 1950789798:
                                    if (str6.equals("A_FLAC")) {
                                        b14 = Ascii.US;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                case 1951062397:
                                    if (str6.equals("A_OPUS")) {
                                        b14 = 32;
                                    } else {
                                        b14 = -1;
                                    }
                                    break;
                                default:
                                    b14 = -1;
                                    break;
                            }
                            switch (b14) {
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
                                case 32:
                                    p pVar = cVar9.f163531d0;
                                    int i57 = r14.f163557c;
                                    switch (str6) {
                                        case "V_MPEG4/ISO/AP":
                                            b15 = 0;
                                            break;
                                        case "V_MPEG4/ISO/SP":
                                            b15 = 1;
                                            break;
                                        case "A_MS/ACM":
                                            b15 = 2;
                                            break;
                                        case "A_TRUEHD":
                                            b15 = 3;
                                            break;
                                        case "A_VORBIS":
                                            b15 = 4;
                                            break;
                                        case "A_MPEG/L2":
                                            b15 = 5;
                                            break;
                                        case "A_MPEG/L3":
                                            b15 = 6;
                                            break;
                                        case "V_MS/VFW/FOURCC":
                                            b15 = 7;
                                            break;
                                        case "S_DVBSUB":
                                            b15 = 8;
                                            break;
                                        case "V_MPEG4/ISO/ASP":
                                            b15 = 9;
                                            break;
                                        case "V_MPEG4/ISO/AVC":
                                            b15 = 10;
                                            break;
                                        case "S_VOBSUB":
                                            b15 = Ascii.VT;
                                            break;
                                        case "A_DTS/LOSSLESS":
                                            b15 = Ascii.FF;
                                            break;
                                        case "A_AAC":
                                            b15 = Ascii.CR;
                                            break;
                                        case "A_AC3":
                                            b15 = Ascii.SO;
                                            break;
                                        case "A_DTS":
                                            b15 = Ascii.SI;
                                            break;
                                        case "V_AV1":
                                            b15 = Ascii.DLE;
                                            break;
                                        case "V_VP8":
                                            b15 = 17;
                                            break;
                                        case "V_VP9":
                                            b15 = Ascii.DC2;
                                            break;
                                        case "S_HDMV/PGS":
                                            b15 = 19;
                                            break;
                                        case "V_THEORA":
                                            b15 = 20;
                                            break;
                                        case "A_DTS/EXPRESS":
                                            b15 = Ascii.NAK;
                                            break;
                                        case "A_PCM/FLOAT/IEEE":
                                            b15 = Ascii.SYN;
                                            break;
                                        case "A_PCM/INT/BIG":
                                            b15 = Ascii.ETB;
                                            break;
                                        case "A_PCM/INT/LIT":
                                            b15 = Ascii.CAN;
                                            break;
                                        case "S_TEXT/ASS":
                                            b15 = Ascii.EM;
                                            break;
                                        case "V_MPEGH/ISO/HEVC":
                                            b15 = Ascii.SUB;
                                            break;
                                        case "S_TEXT/WEBVTT":
                                            b15 = Ascii.ESC;
                                            break;
                                        case "S_TEXT/UTF8":
                                            b15 = Ascii.FS;
                                            break;
                                        case "V_MPEG2":
                                            b15 = Ascii.GS;
                                            break;
                                        case "A_EAC3":
                                            b15 = Ascii.RS;
                                            break;
                                        case "A_FLAC":
                                            b15 = Ascii.US;
                                            break;
                                        case "A_OPUS":
                                            b15 = 32;
                                            break;
                                        default:
                                            b15 = -1;
                                            break;
                                    }
                                    String str7 = MimeTypes.VIDEO_UNKNOWN;
                                    switch (b15) {
                                        case 0:
                                        case 1:
                                        case 9:
                                            cVar2 = cVar9;
                                            byte[] bArr4 = r14.f163565k;
                                            List<byte[]> listSingletonList = bArr4 == null ? null : Collections.singletonList(bArr4);
                                            str7 = MimeTypes.VIDEO_MP4V;
                                            listOf = listSingletonList;
                                            iX = -1;
                                            i16 = -1;
                                            list = listOf;
                                            str2 = null;
                                            list5 = list;
                                            if (r14.O != null && (lVarA = bb.l.a(new r(r14.O))) != null) {
                                                str2 = lVarA.f17214a;
                                                str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                            }
                                            ?? r15 = r14.W;
                                            if (r14.V) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i58 = r15 | i17;
                                            bVar = new q.b();
                                            zJ = x.j(str7);
                                            Map<String, Integer> map = f163523j0;
                                            if (zJ) {
                                                bVar.B = r14.P;
                                                bVar.C = r14.R;
                                                bVar.D = iX;
                                                i18 = 1;
                                            } else if (x.m(str7)) {
                                                if (r14.f163572r == 0) {
                                                    i26 = r14.f163570p;
                                                    i19 = -1;
                                                    if (i26 == -1) {
                                                        i26 = r14.f163567m;
                                                    }
                                                    r14.f163570p = i26;
                                                    i27 = r14.f163571q;
                                                    if (i27 == -1) {
                                                        i27 = r14.f163568n;
                                                    }
                                                    r14.f163571q = i27;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r14.f163570p;
                                                if (i24 != i19 || (i25 = r14.f163571q) == i19) {
                                                    f14 = -1.0f;
                                                } else {
                                                    f14 = (r14.f163568n * i24) / (r14.f163567m * i25);
                                                }
                                                if (r14.f163579y) {
                                                    if (r14.E != -1.0f || r14.F == -1.0f || r14.G == -1.0f || r14.H == -1.0f || r14.I == -1.0f || r14.J == -1.0f || r14.K == -1.0f || r14.L == -1.0f || r14.M == -1.0f || r14.N == -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = new byte[25];
                                                        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                                        byteBufferOrder.put((byte) 0);
                                                        byteBufferOrder.putShort((short) ((r14.E * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r14.F * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r14.G * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r14.H * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r14.I * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r14.J * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r14.K * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r14.L * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) (r14.M + 0.5f));
                                                        byteBufferOrder.putShort((short) (r14.N + 0.5f));
                                                        byteBufferOrder.putShort((short) r14.C);
                                                        byteBufferOrder.putShort((short) r14.D);
                                                    }
                                                    i.b bVar8 = new i.b();
                                                    bVar8.f8322a = r14.f163580z;
                                                    bVar8.f8323b = r14.B;
                                                    bVar8.f8324c = r14.A;
                                                    bVar8.f8325d = bArr;
                                                    int i59 = r14.f163569o;
                                                    bVar8.f8326e = i59;
                                                    bVar8.f8327f = i59;
                                                    iVarA = bVar8.a();
                                                } else {
                                                    iVarA = null;
                                                }
                                                str4 = r14.f163555a;
                                                if (str4 == null && map.containsKey(str4)) {
                                                    iIntValue = map.get(r14.f163555a).intValue();
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r14.f163573s == 0 && Float.compare(r14.f163574t, 0.0f) == 0 && Float.compare(r14.f163575u, 0.0f) == 0) {
                                                    if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r14.f163576v, -180.0f) != 0 || Float.compare(r14.f163576v, 180.0f) == 0) {
                                                        iIntValue = 180;
                                                    } else if (Float.compare(r14.f163576v, -90.0f) == 0) {
                                                        iIntValue = 270;
                                                    }
                                                }
                                                bVar.f8418t = r14.f163567m;
                                                bVar.f8419u = r14.f163568n;
                                                bVar.f8422x = f14;
                                                bVar.f8421w = iIntValue;
                                                bVar.f8423y = r14.f163577w;
                                                bVar.f8424z = r14.f163578x;
                                                bVar.A = iVarA;
                                                i18 = 2;
                                            } else {
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str7) && !MimeTypes.TEXT_SSA.equals(str7) && !MimeTypes.TEXT_VTT.equals(str7) && !MimeTypes.APPLICATION_VOBSUB.equals(str7) && !MimeTypes.APPLICATION_PGS.equals(str7) && !MimeTypes.APPLICATION_DVBSUBS.equals(str7)) {
                                                    throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                                                }
                                                i18 = 3;
                                            }
                                            str5 = r14.f163555a;
                                            if (str5 != null && !map.containsKey(str5)) {
                                                bVar.f8400b = r14.f163555a;
                                            }
                                            bVar.f8399a = Integer.toString(i57);
                                            bVar.f8411m = x.n(str7);
                                            bVar.f8412n = i16;
                                            bVar.f8402d = r14.X;
                                            bVar.f8403e = i58;
                                            bVar.f8414p = list5;
                                            bVar.f8408j = str2;
                                            bVar.f8415q = r14.f163566l;
                                            q qVarA = bVar.a();
                                            l0 l0VarTrack = pVar.track(r14.f163557c, i18);
                                            r14.Y = l0VarTrack;
                                            l0VarTrack.d(qVarA);
                                            sparseArray.put(r14.f163557c, (C3079c) r14);
                                            cVar4 = cVar2;
                                            break;
                                        case 2:
                                            cVar2 = cVar9;
                                            r rVar2 = new r(r14.a(r14.f163556b));
                                            try {
                                                int iN = rVar2.n();
                                                if (iN != 1) {
                                                    if (iN == 65534) {
                                                        rVar2.G(24);
                                                        long jO = rVar2.o();
                                                        UUID uuid = f163522i0;
                                                        if (jO != uuid.getMostSignificantBits() || rVar2.o() != uuid.getLeastSignificantBits()) {
                                                        }
                                                        str7 = MimeTypes.AUDIO_UNKNOWN;
                                                        iX = -1;
                                                        i16 = -1;
                                                        list = null;
                                                        str2 = null;
                                                        list5 = list;
                                                        if (r14.O != null) {
                                                            str2 = lVarA.f17214a;
                                                            str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                                        }
                                                        ?? r16 = r14.W;
                                                        if (r14.V) {
                                                            i17 = 2;
                                                        } else {
                                                            i17 = 0;
                                                        }
                                                        int i510 = r16 | i17;
                                                        bVar = new q.b();
                                                        zJ = x.j(str7);
                                                        Map<String, Integer> map2 = f163523j0;
                                                        if (zJ) {
                                                            bVar.B = r14.P;
                                                            bVar.C = r14.R;
                                                            bVar.D = iX;
                                                            i18 = 1;
                                                        } else if (x.m(str7)) {
                                                            if (r14.f163572r == 0) {
                                                                i26 = r14.f163570p;
                                                                i19 = -1;
                                                                if (i26 == -1) {
                                                                    i26 = r14.f163567m;
                                                                }
                                                                r14.f163570p = i26;
                                                                i27 = r14.f163571q;
                                                                if (i27 == -1) {
                                                                    i27 = r14.f163568n;
                                                                }
                                                                r14.f163571q = i27;
                                                            } else {
                                                                i19 = -1;
                                                            }
                                                            i24 = r14.f163570p;
                                                            if (i24 != i19) {
                                                                f14 = -1.0f;
                                                            } else {
                                                                f14 = -1.0f;
                                                            }
                                                            if (r14.f163579y) {
                                                                if (r14.E != -1.0f) {
                                                                    bArr = null;
                                                                } else {
                                                                    bArr = null;
                                                                }
                                                                i.b bVar9 = new i.b();
                                                                bVar9.f8322a = r14.f163580z;
                                                                bVar9.f8323b = r14.B;
                                                                bVar9.f8324c = r14.A;
                                                                bVar9.f8325d = bArr;
                                                                int i511 = r14.f163569o;
                                                                bVar9.f8326e = i511;
                                                                bVar9.f8327f = i511;
                                                                iVarA = bVar9.a();
                                                            } else {
                                                                iVarA = null;
                                                            }
                                                            str4 = r14.f163555a;
                                                            if (str4 == null) {
                                                                iIntValue = -1;
                                                            } else {
                                                                iIntValue = -1;
                                                            }
                                                            if (r14.f163573s == 0) {
                                                                if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                                    iIntValue = 0;
                                                                } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                                    iIntValue = 90;
                                                                } else if (Float.compare(r14.f163576v, -180.0f) != 0) {
                                                                    iIntValue = 180;
                                                                } else {
                                                                    iIntValue = 180;
                                                                }
                                                            }
                                                            bVar.f8418t = r14.f163567m;
                                                            bVar.f8419u = r14.f163568n;
                                                            bVar.f8422x = f14;
                                                            bVar.f8421w = iIntValue;
                                                            bVar.f8423y = r14.f163577w;
                                                            bVar.f8424z = r14.f163578x;
                                                            bVar.A = iVarA;
                                                            i18 = 2;
                                                        } else {
                                                            if (MimeTypes.APPLICATION_SUBRIP.equals(str7)) {
                                                            }
                                                            i18 = 3;
                                                        }
                                                        str5 = r14.f163555a;
                                                        if (str5 != null) {
                                                            bVar.f8400b = r14.f163555a;
                                                        }
                                                        bVar.f8399a = Integer.toString(i57);
                                                        bVar.f8411m = x.n(str7);
                                                        bVar.f8412n = i16;
                                                        bVar.f8402d = r14.X;
                                                        bVar.f8403e = i510;
                                                        bVar.f8414p = list5;
                                                        bVar.f8408j = str2;
                                                        bVar.f8415q = r14.f163566l;
                                                        q qVarA2 = bVar.a();
                                                        l0 l0VarTrack2 = pVar.track(r14.f163557c, i18);
                                                        r14.Y = l0VarTrack2;
                                                        l0VarTrack2.d(qVarA2);
                                                        sparseArray.put(r14.f163557c, (C3079c) r14);
                                                        cVar4 = cVar2;
                                                    }
                                                    k.g("Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                    str7 = MimeTypes.AUDIO_UNKNOWN;
                                                    iX = -1;
                                                    i16 = -1;
                                                    list = null;
                                                    str2 = null;
                                                    list5 = list;
                                                    if (r14.O != null) {
                                                        str2 = lVarA.f17214a;
                                                        str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                                    }
                                                    ?? r17 = r14.W;
                                                    if (r14.V) {
                                                        i17 = 2;
                                                    } else {
                                                        i17 = 0;
                                                    }
                                                    int i512 = r17 | i17;
                                                    bVar = new q.b();
                                                    zJ = x.j(str7);
                                                    Map<String, Integer> map3 = f163523j0;
                                                    if (zJ) {
                                                        bVar.B = r14.P;
                                                        bVar.C = r14.R;
                                                        bVar.D = iX;
                                                        i18 = 1;
                                                    } else if (x.m(str7)) {
                                                        if (r14.f163572r == 0) {
                                                            i26 = r14.f163570p;
                                                            i19 = -1;
                                                            if (i26 == -1) {
                                                                i26 = r14.f163567m;
                                                            }
                                                            r14.f163570p = i26;
                                                            i27 = r14.f163571q;
                                                            if (i27 == -1) {
                                                                i27 = r14.f163568n;
                                                            }
                                                            r14.f163571q = i27;
                                                        } else {
                                                            i19 = -1;
                                                        }
                                                        i24 = r14.f163570p;
                                                        if (i24 != i19) {
                                                            f14 = -1.0f;
                                                        } else {
                                                            f14 = -1.0f;
                                                        }
                                                        if (r14.f163579y) {
                                                            if (r14.E != -1.0f) {
                                                                bArr = null;
                                                            } else {
                                                                bArr = null;
                                                            }
                                                            i.b bVar10 = new i.b();
                                                            bVar10.f8322a = r14.f163580z;
                                                            bVar10.f8323b = r14.B;
                                                            bVar10.f8324c = r14.A;
                                                            bVar10.f8325d = bArr;
                                                            int i513 = r14.f163569o;
                                                            bVar10.f8326e = i513;
                                                            bVar10.f8327f = i513;
                                                            iVarA = bVar10.a();
                                                        } else {
                                                            iVarA = null;
                                                        }
                                                        str4 = r14.f163555a;
                                                        if (str4 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (r14.f163573s == 0) {
                                                            if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(r14.f163576v, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        bVar.f8418t = r14.f163567m;
                                                        bVar.f8419u = r14.f163568n;
                                                        bVar.f8422x = f14;
                                                        bVar.f8421w = iIntValue;
                                                        bVar.f8423y = r14.f163577w;
                                                        bVar.f8424z = r14.f163578x;
                                                        bVar.A = iVarA;
                                                        i18 = 2;
                                                    } else {
                                                        if (MimeTypes.APPLICATION_SUBRIP.equals(str7)) {
                                                        }
                                                        i18 = 3;
                                                    }
                                                    str5 = r14.f163555a;
                                                    if (str5 != null) {
                                                        bVar.f8400b = r14.f163555a;
                                                    }
                                                    bVar.f8399a = Integer.toString(i57);
                                                    bVar.f8411m = x.n(str7);
                                                    bVar.f8412n = i16;
                                                    bVar.f8402d = r14.X;
                                                    bVar.f8403e = i512;
                                                    bVar.f8414p = list5;
                                                    bVar.f8408j = str2;
                                                    bVar.f8415q = r14.f163566l;
                                                    q qVarA3 = bVar.a();
                                                    l0 l0VarTrack3 = pVar.track(r14.f163557c, i18);
                                                    r14.Y = l0VarTrack3;
                                                    l0VarTrack3.d(qVarA3);
                                                    sparseArray.put(r14.f163557c, (C3079c) r14);
                                                    cVar4 = cVar2;
                                                    break;
                                                }
                                                iX = z.x(r14.Q);
                                                if (iX == 0) {
                                                    k.g("Unsupported PCM bit depth: " + r14.Q + ". Setting mimeType to audio/x-unknown");
                                                    str7 = MimeTypes.AUDIO_UNKNOWN;
                                                    iX = -1;
                                                } else {
                                                    str7 = MimeTypes.AUDIO_RAW;
                                                }
                                                i16 = -1;
                                                list = null;
                                                str2 = null;
                                                list5 = list;
                                                if (r14.O != null) {
                                                    str2 = lVarA.f17214a;
                                                    str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                                }
                                                ?? r18 = r14.W;
                                                if (r14.V) {
                                                    i17 = 2;
                                                } else {
                                                    i17 = 0;
                                                }
                                                int i514 = r18 | i17;
                                                bVar = new q.b();
                                                zJ = x.j(str7);
                                                Map<String, Integer> map4 = f163523j0;
                                                if (zJ) {
                                                    bVar.B = r14.P;
                                                    bVar.C = r14.R;
                                                    bVar.D = iX;
                                                    i18 = 1;
                                                } else if (x.m(str7)) {
                                                    if (r14.f163572r == 0) {
                                                        i26 = r14.f163570p;
                                                        i19 = -1;
                                                        if (i26 == -1) {
                                                            i26 = r14.f163567m;
                                                        }
                                                        r14.f163570p = i26;
                                                        i27 = r14.f163571q;
                                                        if (i27 == -1) {
                                                            i27 = r14.f163568n;
                                                        }
                                                        r14.f163571q = i27;
                                                    } else {
                                                        i19 = -1;
                                                    }
                                                    i24 = r14.f163570p;
                                                    if (i24 != i19) {
                                                        f14 = -1.0f;
                                                    } else {
                                                        f14 = -1.0f;
                                                    }
                                                    if (r14.f163579y) {
                                                        if (r14.E != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        i.b bVar11 = new i.b();
                                                        bVar11.f8322a = r14.f163580z;
                                                        bVar11.f8323b = r14.B;
                                                        bVar11.f8324c = r14.A;
                                                        bVar11.f8325d = bArr;
                                                        int i515 = r14.f163569o;
                                                        bVar11.f8326e = i515;
                                                        bVar11.f8327f = i515;
                                                        iVarA = bVar11.a();
                                                    } else {
                                                        iVarA = null;
                                                    }
                                                    str4 = r14.f163555a;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r14.f163573s == 0) {
                                                        if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (Float.compare(r14.f163576v, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    bVar.f8418t = r14.f163567m;
                                                    bVar.f8419u = r14.f163568n;
                                                    bVar.f8422x = f14;
                                                    bVar.f8421w = iIntValue;
                                                    bVar.f8423y = r14.f163577w;
                                                    bVar.f8424z = r14.f163578x;
                                                    bVar.A = iVarA;
                                                    i18 = 2;
                                                } else {
                                                    if (MimeTypes.APPLICATION_SUBRIP.equals(str7)) {
                                                    }
                                                    i18 = 3;
                                                }
                                                str5 = r14.f163555a;
                                                if (str5 != null) {
                                                    bVar.f8400b = r14.f163555a;
                                                }
                                                bVar.f8399a = Integer.toString(i57);
                                                bVar.f8411m = x.n(str7);
                                                bVar.f8412n = i16;
                                                bVar.f8402d = r14.X;
                                                bVar.f8403e = i514;
                                                bVar.f8414p = list5;
                                                bVar.f8408j = str2;
                                                bVar.f8415q = r14.f163566l;
                                                q qVarA4 = bVar.a();
                                                l0 l0VarTrack4 = pVar.track(r14.f163557c, i18);
                                                r14.Y = l0VarTrack4;
                                                l0VarTrack4.d(qVarA4);
                                                sparseArray.put(r14.f163557c, (C3079c) r14);
                                                cVar4 = cVar2;
                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                throw ParserException.createForMalformedContainer("Error parsing MS/ACM codec private", null);
                                            }
                                            break;
                                        case 3:
                                            cVar2 = cVar9;
                                            r14.U = new m0();
                                            str7 = MimeTypes.AUDIO_TRUEHD;
                                            iX = -1;
                                            i16 = -1;
                                            list = null;
                                            str2 = null;
                                            list5 = list;
                                            if (r14.O != null) {
                                                str2 = lVarA.f17214a;
                                                str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                            }
                                            ?? r19 = r14.W;
                                            if (r14.V) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i516 = r19 | i17;
                                            bVar = new q.b();
                                            zJ = x.j(str7);
                                            Map<String, Integer> map5 = f163523j0;
                                            if (zJ) {
                                                bVar.B = r14.P;
                                                bVar.C = r14.R;
                                                bVar.D = iX;
                                                i18 = 1;
                                            } else if (x.m(str7)) {
                                                if (r14.f163572r == 0) {
                                                    i26 = r14.f163570p;
                                                    i19 = -1;
                                                    if (i26 == -1) {
                                                        i26 = r14.f163567m;
                                                    }
                                                    r14.f163570p = i26;
                                                    i27 = r14.f163571q;
                                                    if (i27 == -1) {
                                                        i27 = r14.f163568n;
                                                    }
                                                    r14.f163571q = i27;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r14.f163570p;
                                                if (i24 != i19) {
                                                    f14 = -1.0f;
                                                } else {
                                                    f14 = -1.0f;
                                                }
                                                if (r14.f163579y) {
                                                    if (r14.E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    i.b bVar12 = new i.b();
                                                    bVar12.f8322a = r14.f163580z;
                                                    bVar12.f8323b = r14.B;
                                                    bVar12.f8324c = r14.A;
                                                    bVar12.f8325d = bArr;
                                                    int i517 = r14.f163569o;
                                                    bVar12.f8326e = i517;
                                                    bVar12.f8327f = i517;
                                                    iVarA = bVar12.a();
                                                } else {
                                                    iVarA = null;
                                                }
                                                str4 = r14.f163555a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r14.f163573s == 0) {
                                                    if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r14.f163576v, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                bVar.f8418t = r14.f163567m;
                                                bVar.f8419u = r14.f163568n;
                                                bVar.f8422x = f14;
                                                bVar.f8421w = iIntValue;
                                                bVar.f8423y = r14.f163577w;
                                                bVar.f8424z = r14.f163578x;
                                                bVar.A = iVarA;
                                                i18 = 2;
                                            } else {
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str7)) {
                                                }
                                                i18 = 3;
                                            }
                                            str5 = r14.f163555a;
                                            if (str5 != null) {
                                                bVar.f8400b = r14.f163555a;
                                            }
                                            bVar.f8399a = Integer.toString(i57);
                                            bVar.f8411m = x.n(str7);
                                            bVar.f8412n = i16;
                                            bVar.f8402d = r14.X;
                                            bVar.f8403e = i516;
                                            bVar.f8414p = list5;
                                            bVar.f8408j = str2;
                                            bVar.f8415q = r14.f163566l;
                                            q qVarA5 = bVar.a();
                                            l0 l0VarTrack5 = pVar.track(r14.f163557c, i18);
                                            r14.Y = l0VarTrack5;
                                            l0VarTrack5.d(qVarA5);
                                            sparseArray.put(r14.f163557c, (C3079c) r14);
                                            cVar4 = cVar2;
                                            break;
                                        case 4:
                                            byte[] bArrA = r14.a(str6);
                                            try {
                                                try {
                                                    if (bArrA[0] != 2) {
                                                        throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                                                    }
                                                    int i64 = 0;
                                                    int i65 = 1;
                                                    while (true) {
                                                        int i66 = bArrA[i65] & 255;
                                                        if (i66 != 255) {
                                                            int i67 = i65 + 1;
                                                            int i68 = i64 + i66;
                                                            cVar2 = cVar9;
                                                            int i69 = 0;
                                                            while (true) {
                                                                int i74 = bArrA[i67] & 255;
                                                                if (i74 != 255) {
                                                                    int i75 = i67 + 1;
                                                                    int i76 = i69 + i74;
                                                                    if (bArrA[i75] != 1) {
                                                                        throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                                                                    }
                                                                    byte[] bArr5 = new byte[i68];
                                                                    System.arraycopy(bArrA, i75, bArr5, 0, i68);
                                                                    int i77 = i75 + i68;
                                                                    if (bArrA[i77] != 3) {
                                                                        throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                                                                    }
                                                                    int i78 = i77 + i76;
                                                                    if (bArrA[i78] != 5) {
                                                                        throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                                                                    }
                                                                    byte[] bArr6 = new byte[bArrA.length - i78];
                                                                    System.arraycopy(bArrA, i78, bArr6, 0, bArrA.length - i78);
                                                                    ArrayList arrayList = new ArrayList(2);
                                                                    arrayList.add(bArr5);
                                                                    arrayList.add(bArr6);
                                                                    str7 = MimeTypes.AUDIO_VORBIS;
                                                                    i16 = 8192;
                                                                    list = arrayList;
                                                                    iX = -1;
                                                                    str2 = null;
                                                                    list5 = list;
                                                                    if (r14.O != null) {
                                                                        str2 = lVarA.f17214a;
                                                                        str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                                                    }
                                                                    ?? r110 = r14.W;
                                                                    if (r14.V) {
                                                                        i17 = 2;
                                                                    } else {
                                                                        i17 = 0;
                                                                    }
                                                                    int i518 = r110 | i17;
                                                                    bVar = new q.b();
                                                                    zJ = x.j(str7);
                                                                    Map<String, Integer> map6 = f163523j0;
                                                                    if (zJ) {
                                                                        bVar.B = r14.P;
                                                                        bVar.C = r14.R;
                                                                        bVar.D = iX;
                                                                        i18 = 1;
                                                                    } else if (x.m(str7)) {
                                                                        if (r14.f163572r == 0) {
                                                                            i26 = r14.f163570p;
                                                                            i19 = -1;
                                                                            if (i26 == -1) {
                                                                                i26 = r14.f163567m;
                                                                            }
                                                                            r14.f163570p = i26;
                                                                            i27 = r14.f163571q;
                                                                            if (i27 == -1) {
                                                                                i27 = r14.f163568n;
                                                                            }
                                                                            r14.f163571q = i27;
                                                                        } else {
                                                                            i19 = -1;
                                                                        }
                                                                        i24 = r14.f163570p;
                                                                        if (i24 != i19) {
                                                                            f14 = -1.0f;
                                                                        } else {
                                                                            f14 = -1.0f;
                                                                        }
                                                                        if (r14.f163579y) {
                                                                            if (r14.E != -1.0f) {
                                                                                bArr = null;
                                                                            } else {
                                                                                bArr = null;
                                                                            }
                                                                            i.b bVar13 = new i.b();
                                                                            bVar13.f8322a = r14.f163580z;
                                                                            bVar13.f8323b = r14.B;
                                                                            bVar13.f8324c = r14.A;
                                                                            bVar13.f8325d = bArr;
                                                                            int i519 = r14.f163569o;
                                                                            bVar13.f8326e = i519;
                                                                            bVar13.f8327f = i519;
                                                                            iVarA = bVar13.a();
                                                                        } else {
                                                                            iVarA = null;
                                                                        }
                                                                        str4 = r14.f163555a;
                                                                        if (str4 == null) {
                                                                            iIntValue = -1;
                                                                        } else {
                                                                            iIntValue = -1;
                                                                        }
                                                                        if (r14.f163573s == 0) {
                                                                            if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                                                iIntValue = 0;
                                                                            } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                                                iIntValue = 90;
                                                                            } else if (Float.compare(r14.f163576v, -180.0f) != 0) {
                                                                                iIntValue = 180;
                                                                            } else {
                                                                                iIntValue = 180;
                                                                            }
                                                                        }
                                                                        bVar.f8418t = r14.f163567m;
                                                                        bVar.f8419u = r14.f163568n;
                                                                        bVar.f8422x = f14;
                                                                        bVar.f8421w = iIntValue;
                                                                        bVar.f8423y = r14.f163577w;
                                                                        bVar.f8424z = r14.f163578x;
                                                                        bVar.A = iVarA;
                                                                        i18 = 2;
                                                                    } else {
                                                                        if (MimeTypes.APPLICATION_SUBRIP.equals(str7)) {
                                                                        }
                                                                        i18 = 3;
                                                                    }
                                                                    str5 = r14.f163555a;
                                                                    if (str5 != null) {
                                                                        bVar.f8400b = r14.f163555a;
                                                                    }
                                                                    bVar.f8399a = Integer.toString(i57);
                                                                    bVar.f8411m = x.n(str7);
                                                                    bVar.f8412n = i16;
                                                                    bVar.f8402d = r14.X;
                                                                    bVar.f8403e = i518;
                                                                    bVar.f8414p = list5;
                                                                    bVar.f8408j = str2;
                                                                    bVar.f8415q = r14.f163566l;
                                                                    q qVarA6 = bVar.a();
                                                                    l0 l0VarTrack6 = pVar.track(r14.f163557c, i18);
                                                                    r14.Y = l0VarTrack6;
                                                                    l0VarTrack6.d(qVarA6);
                                                                    sparseArray.put(r14.f163557c, (C3079c) r14);
                                                                    cVar4 = cVar2;
                                                                } else {
                                                                    i69 += 255;
                                                                    i67++;
                                                                }
                                                            }
                                                        } else {
                                                            i64 += 255;
                                                            i65++;
                                                        }
                                                    }
                                                } catch (ArrayIndexOutOfBoundsException unused2) {
                                                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", r14);
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                                r14 = 0;
                                            }
                                            break;
                                        case 5:
                                            str7 = MimeTypes.AUDIO_MPEG_L2;
                                            cVar2 = cVar9;
                                            iX = -1;
                                            i16 = 4096;
                                            list = null;
                                            str2 = null;
                                            list5 = list;
                                            if (r14.O != null) {
                                                str2 = lVarA.f17214a;
                                                str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                            }
                                            ?? r111 = r14.W;
                                            if (r14.V) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i5110 = r111 | i17;
                                            bVar = new q.b();
                                            zJ = x.j(str7);
                                            Map<String, Integer> map7 = f163523j0;
                                            if (zJ) {
                                                bVar.B = r14.P;
                                                bVar.C = r14.R;
                                                bVar.D = iX;
                                                i18 = 1;
                                            } else if (x.m(str7)) {
                                                if (r14.f163572r == 0) {
                                                    i26 = r14.f163570p;
                                                    i19 = -1;
                                                    if (i26 == -1) {
                                                        i26 = r14.f163567m;
                                                    }
                                                    r14.f163570p = i26;
                                                    i27 = r14.f163571q;
                                                    if (i27 == -1) {
                                                        i27 = r14.f163568n;
                                                    }
                                                    r14.f163571q = i27;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r14.f163570p;
                                                if (i24 != i19) {
                                                    f14 = -1.0f;
                                                } else {
                                                    f14 = -1.0f;
                                                }
                                                if (r14.f163579y) {
                                                    if (r14.E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    i.b bVar14 = new i.b();
                                                    bVar14.f8322a = r14.f163580z;
                                                    bVar14.f8323b = r14.B;
                                                    bVar14.f8324c = r14.A;
                                                    bVar14.f8325d = bArr;
                                                    int i5111 = r14.f163569o;
                                                    bVar14.f8326e = i5111;
                                                    bVar14.f8327f = i5111;
                                                    iVarA = bVar14.a();
                                                } else {
                                                    iVarA = null;
                                                }
                                                str4 = r14.f163555a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r14.f163573s == 0) {
                                                    if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r14.f163576v, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                bVar.f8418t = r14.f163567m;
                                                bVar.f8419u = r14.f163568n;
                                                bVar.f8422x = f14;
                                                bVar.f8421w = iIntValue;
                                                bVar.f8423y = r14.f163577w;
                                                bVar.f8424z = r14.f163578x;
                                                bVar.A = iVarA;
                                                i18 = 2;
                                            } else {
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str7)) {
                                                }
                                                i18 = 3;
                                            }
                                            str5 = r14.f163555a;
                                            if (str5 != null) {
                                                bVar.f8400b = r14.f163555a;
                                            }
                                            bVar.f8399a = Integer.toString(i57);
                                            bVar.f8411m = x.n(str7);
                                            bVar.f8412n = i16;
                                            bVar.f8402d = r14.X;
                                            bVar.f8403e = i5110;
                                            bVar.f8414p = list5;
                                            bVar.f8408j = str2;
                                            bVar.f8415q = r14.f163566l;
                                            q qVarA7 = bVar.a();
                                            l0 l0VarTrack7 = pVar.track(r14.f163557c, i18);
                                            r14.Y = l0VarTrack7;
                                            l0VarTrack7.d(qVarA7);
                                            sparseArray.put(r14.f163557c, (C3079c) r14);
                                            cVar4 = cVar2;
                                            break;
                                        case 6:
                                            str7 = MimeTypes.AUDIO_MPEG;
                                            cVar2 = cVar9;
                                            iX = -1;
                                            i16 = 4096;
                                            list = null;
                                            str2 = null;
                                            list5 = list;
                                            if (r14.O != null) {
                                                str2 = lVarA.f17214a;
                                                str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                            }
                                            ?? r112 = r14.W;
                                            if (r14.V) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i5112 = r112 | i17;
                                            bVar = new q.b();
                                            zJ = x.j(str7);
                                            Map<String, Integer> map8 = f163523j0;
                                            if (zJ) {
                                                bVar.B = r14.P;
                                                bVar.C = r14.R;
                                                bVar.D = iX;
                                                i18 = 1;
                                            } else if (x.m(str7)) {
                                                if (r14.f163572r == 0) {
                                                    i26 = r14.f163570p;
                                                    i19 = -1;
                                                    if (i26 == -1) {
                                                        i26 = r14.f163567m;
                                                    }
                                                    r14.f163570p = i26;
                                                    i27 = r14.f163571q;
                                                    if (i27 == -1) {
                                                        i27 = r14.f163568n;
                                                    }
                                                    r14.f163571q = i27;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r14.f163570p;
                                                if (i24 != i19) {
                                                    f14 = -1.0f;
                                                } else {
                                                    f14 = -1.0f;
                                                }
                                                if (r14.f163579y) {
                                                    if (r14.E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    i.b bVar15 = new i.b();
                                                    bVar15.f8322a = r14.f163580z;
                                                    bVar15.f8323b = r14.B;
                                                    bVar15.f8324c = r14.A;
                                                    bVar15.f8325d = bArr;
                                                    int i5113 = r14.f163569o;
                                                    bVar15.f8326e = i5113;
                                                    bVar15.f8327f = i5113;
                                                    iVarA = bVar15.a();
                                                } else {
                                                    iVarA = null;
                                                }
                                                str4 = r14.f163555a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r14.f163573s == 0) {
                                                    if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r14.f163576v, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                bVar.f8418t = r14.f163567m;
                                                bVar.f8419u = r14.f163568n;
                                                bVar.f8422x = f14;
                                                bVar.f8421w = iIntValue;
                                                bVar.f8423y = r14.f163577w;
                                                bVar.f8424z = r14.f163578x;
                                                bVar.A = iVarA;
                                                i18 = 2;
                                            } else {
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str7)) {
                                                }
                                                i18 = 3;
                                            }
                                            str5 = r14.f163555a;
                                            if (str5 != null) {
                                                bVar.f8400b = r14.f163555a;
                                            }
                                            bVar.f8399a = Integer.toString(i57);
                                            bVar.f8411m = x.n(str7);
                                            bVar.f8412n = i16;
                                            bVar.f8402d = r14.X;
                                            bVar.f8403e = i5112;
                                            bVar.f8414p = list5;
                                            bVar.f8408j = str2;
                                            bVar.f8415q = r14.f163566l;
                                            q qVarA8 = bVar.a();
                                            l0 l0VarTrack8 = pVar.track(r14.f163557c, i18);
                                            r14.Y = l0VarTrack8;
                                            l0VarTrack8.d(qVarA8);
                                            sparseArray.put(r14.f163557c, (C3079c) r14);
                                            cVar4 = cVar2;
                                            break;
                                        case 7:
                                            r rVar3 = new r(r14.a(r14.f163556b));
                                            try {
                                                rVar3.H(16);
                                                long jL = rVar3.l();
                                                if (jL == 1482049860) {
                                                    th3 = null;
                                                    try {
                                                        pair = new Pair(MimeTypes.VIDEO_DIVX, null);
                                                        str2 = null;
                                                    } catch (ArrayIndexOutOfBoundsException unused4) {
                                                    }
                                                } else {
                                                    if (jL == 859189832) {
                                                        pair = new Pair(MimeTypes.VIDEO_H263, null);
                                                    } else {
                                                        if (jL == 826496599) {
                                                            int i79 = rVar3.f70055b + 20;
                                                            byte[] bArr7 = rVar3.f70054a;
                                                            while (true) {
                                                                if (i79 < bArr7.length - 4) {
                                                                    if (bArr7[i79] == 0 && bArr7[i79 + 1] == 0 && bArr7[i79 + 2] == 1) {
                                                                        if (bArr7[i79 + 3] == 15) {
                                                                            pair = new Pair(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(bArr7, i79, bArr7.length)));
                                                                        }
                                                                    }
                                                                    i79++;
                                                                } else {
                                                                    try {
                                                                        throw ParserException.createForMalformedContainer("Failed to find FourCC VC1 initialization data", null);
                                                                    } catch (ArrayIndexOutOfBoundsException unused5) {
                                                                        th3 = null;
                                                                    }
                                                                }
                                                                throw ParserException.createForMalformedContainer("Error parsing FourCC private data", th3);
                                                            }
                                                        }
                                                        k.g("Unknown FourCC. Setting mimeType to video/x-unknown");
                                                        str2 = null;
                                                        pair = new Pair(MimeTypes.VIDEO_UNKNOWN, null);
                                                    }
                                                    str2 = null;
                                                }
                                                str7 = (String) pair.first;
                                                cVar2 = cVar9;
                                                list2 = (List) pair.second;
                                                iX = -1;
                                                i16 = -1;
                                                list5 = list2;
                                                if (r14.O != null) {
                                                    str2 = lVarA.f17214a;
                                                    str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                                }
                                                ?? r113 = r14.W;
                                                if (r14.V) {
                                                    i17 = 2;
                                                } else {
                                                    i17 = 0;
                                                }
                                                int i5114 = r113 | i17;
                                                bVar = new q.b();
                                                zJ = x.j(str7);
                                                Map<String, Integer> map9 = f163523j0;
                                                if (zJ) {
                                                    bVar.B = r14.P;
                                                    bVar.C = r14.R;
                                                    bVar.D = iX;
                                                    i18 = 1;
                                                } else if (x.m(str7)) {
                                                    if (r14.f163572r == 0) {
                                                        i26 = r14.f163570p;
                                                        i19 = -1;
                                                        if (i26 == -1) {
                                                            i26 = r14.f163567m;
                                                        }
                                                        r14.f163570p = i26;
                                                        i27 = r14.f163571q;
                                                        if (i27 == -1) {
                                                            i27 = r14.f163568n;
                                                        }
                                                        r14.f163571q = i27;
                                                    } else {
                                                        i19 = -1;
                                                    }
                                                    i24 = r14.f163570p;
                                                    if (i24 != i19) {
                                                        f14 = -1.0f;
                                                    } else {
                                                        f14 = -1.0f;
                                                    }
                                                    if (r14.f163579y) {
                                                        if (r14.E != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        i.b bVar16 = new i.b();
                                                        bVar16.f8322a = r14.f163580z;
                                                        bVar16.f8323b = r14.B;
                                                        bVar16.f8324c = r14.A;
                                                        bVar16.f8325d = bArr;
                                                        int i5115 = r14.f163569o;
                                                        bVar16.f8326e = i5115;
                                                        bVar16.f8327f = i5115;
                                                        iVarA = bVar16.a();
                                                    } else {
                                                        iVarA = null;
                                                    }
                                                    str4 = r14.f163555a;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r14.f163573s == 0) {
                                                        if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (Float.compare(r14.f163576v, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    bVar.f8418t = r14.f163567m;
                                                    bVar.f8419u = r14.f163568n;
                                                    bVar.f8422x = f14;
                                                    bVar.f8421w = iIntValue;
                                                    bVar.f8423y = r14.f163577w;
                                                    bVar.f8424z = r14.f163578x;
                                                    bVar.A = iVarA;
                                                    i18 = 2;
                                                } else {
                                                    if (MimeTypes.APPLICATION_SUBRIP.equals(str7)) {
                                                    }
                                                    i18 = 3;
                                                }
                                                str5 = r14.f163555a;
                                                if (str5 != null) {
                                                    bVar.f8400b = r14.f163555a;
                                                }
                                                bVar.f8399a = Integer.toString(i57);
                                                bVar.f8411m = x.n(str7);
                                                bVar.f8412n = i16;
                                                bVar.f8402d = r14.X;
                                                bVar.f8403e = i5114;
                                                bVar.f8414p = list5;
                                                bVar.f8408j = str2;
                                                bVar.f8415q = r14.f163566l;
                                                q qVarA9 = bVar.a();
                                                l0 l0VarTrack9 = pVar.track(r14.f163557c, i18);
                                                r14.Y = l0VarTrack9;
                                                l0VarTrack9.d(qVarA9);
                                                sparseArray.put(r14.f163557c, (C3079c) r14);
                                                cVar4 = cVar2;
                                            } catch (ArrayIndexOutOfBoundsException unused6) {
                                                th3 = null;
                                            }
                                            break;
                                        case 8:
                                            byte[] bArr8 = new byte[4];
                                            System.arraycopy(r14.a(str6), 0, bArr8, 0, 4);
                                            listOf = ImmutableList.of(bArr8);
                                            cVar2 = cVar9;
                                            str7 = MimeTypes.APPLICATION_DVBSUBS;
                                            iX = -1;
                                            i16 = -1;
                                            list = listOf;
                                            str2 = null;
                                            list5 = list;
                                            if (r14.O != null) {
                                                str2 = lVarA.f17214a;
                                                str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                            }
                                            ?? r114 = r14.W;
                                            if (r14.V) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i5116 = r114 | i17;
                                            bVar = new q.b();
                                            zJ = x.j(str7);
                                            Map<String, Integer> map10 = f163523j0;
                                            if (zJ) {
                                                bVar.B = r14.P;
                                                bVar.C = r14.R;
                                                bVar.D = iX;
                                                i18 = 1;
                                            } else if (x.m(str7)) {
                                                if (r14.f163572r == 0) {
                                                    i26 = r14.f163570p;
                                                    i19 = -1;
                                                    if (i26 == -1) {
                                                        i26 = r14.f163567m;
                                                    }
                                                    r14.f163570p = i26;
                                                    i27 = r14.f163571q;
                                                    if (i27 == -1) {
                                                        i27 = r14.f163568n;
                                                    }
                                                    r14.f163571q = i27;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r14.f163570p;
                                                if (i24 != i19) {
                                                    f14 = -1.0f;
                                                } else {
                                                    f14 = -1.0f;
                                                }
                                                if (r14.f163579y) {
                                                    if (r14.E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    i.b bVar17 = new i.b();
                                                    bVar17.f8322a = r14.f163580z;
                                                    bVar17.f8323b = r14.B;
                                                    bVar17.f8324c = r14.A;
                                                    bVar17.f8325d = bArr;
                                                    int i5117 = r14.f163569o;
                                                    bVar17.f8326e = i5117;
                                                    bVar17.f8327f = i5117;
                                                    iVarA = bVar17.a();
                                                } else {
                                                    iVarA = null;
                                                }
                                                str4 = r14.f163555a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r14.f163573s == 0) {
                                                    if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r14.f163576v, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                bVar.f8418t = r14.f163567m;
                                                bVar.f8419u = r14.f163568n;
                                                bVar.f8422x = f14;
                                                bVar.f8421w = iIntValue;
                                                bVar.f8423y = r14.f163577w;
                                                bVar.f8424z = r14.f163578x;
                                                bVar.A = iVarA;
                                                i18 = 2;
                                            } else {
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str7)) {
                                                }
                                                i18 = 3;
                                            }
                                            str5 = r14.f163555a;
                                            if (str5 != null) {
                                                bVar.f8400b = r14.f163555a;
                                            }
                                            bVar.f8399a = Integer.toString(i57);
                                            bVar.f8411m = x.n(str7);
                                            bVar.f8412n = i16;
                                            bVar.f8402d = r14.X;
                                            bVar.f8403e = i5116;
                                            bVar.f8414p = list5;
                                            bVar.f8408j = str2;
                                            bVar.f8415q = r14.f163566l;
                                            q qVarA10 = bVar.a();
                                            l0 l0VarTrack10 = pVar.track(r14.f163557c, i18);
                                            r14.Y = l0VarTrack10;
                                            l0VarTrack10.d(qVarA10);
                                            sparseArray.put(r14.f163557c, (C3079c) r14);
                                            cVar4 = cVar2;
                                            break;
                                        case 10:
                                            bb.d dVarA = bb.d.a(new r(r14.a(r14.f163556b)));
                                            List<byte[]> list6 = dVarA.f17132a;
                                            r14.Z = dVarA.f17133b;
                                            str3 = dVarA.f17143l;
                                            str7 = MimeTypes.VIDEO_H264;
                                            list4 = list6;
                                            str2 = str3;
                                            cVar2 = cVar9;
                                            list2 = list4;
                                            iX = -1;
                                            i16 = -1;
                                            list5 = list2;
                                            if (r14.O != null) {
                                                str2 = lVarA.f17214a;
                                                str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                            }
                                            ?? r115 = r14.W;
                                            if (r14.V) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i5118 = r115 | i17;
                                            bVar = new q.b();
                                            zJ = x.j(str7);
                                            Map<String, Integer> map11 = f163523j0;
                                            if (zJ) {
                                                bVar.B = r14.P;
                                                bVar.C = r14.R;
                                                bVar.D = iX;
                                                i18 = 1;
                                            } else if (x.m(str7)) {
                                                if (r14.f163572r == 0) {
                                                    i26 = r14.f163570p;
                                                    i19 = -1;
                                                    if (i26 == -1) {
                                                        i26 = r14.f163567m;
                                                    }
                                                    r14.f163570p = i26;
                                                    i27 = r14.f163571q;
                                                    if (i27 == -1) {
                                                        i27 = r14.f163568n;
                                                    }
                                                    r14.f163571q = i27;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r14.f163570p;
                                                if (i24 != i19) {
                                                    f14 = -1.0f;
                                                } else {
                                                    f14 = -1.0f;
                                                }
                                                if (r14.f163579y) {
                                                    if (r14.E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    i.b bVar18 = new i.b();
                                                    bVar18.f8322a = r14.f163580z;
                                                    bVar18.f8323b = r14.B;
                                                    bVar18.f8324c = r14.A;
                                                    bVar18.f8325d = bArr;
                                                    int i5119 = r14.f163569o;
                                                    bVar18.f8326e = i5119;
                                                    bVar18.f8327f = i5119;
                                                    iVarA = bVar18.a();
                                                } else {
                                                    iVarA = null;
                                                }
                                                str4 = r14.f163555a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r14.f163573s == 0) {
                                                    if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r14.f163576v, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                bVar.f8418t = r14.f163567m;
                                                bVar.f8419u = r14.f163568n;
                                                bVar.f8422x = f14;
                                                bVar.f8421w = iIntValue;
                                                bVar.f8423y = r14.f163577w;
                                                bVar.f8424z = r14.f163578x;
                                                bVar.A = iVarA;
                                                i18 = 2;
                                            } else {
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str7)) {
                                                }
                                                i18 = 3;
                                            }
                                            str5 = r14.f163555a;
                                            if (str5 != null) {
                                                bVar.f8400b = r14.f163555a;
                                            }
                                            bVar.f8399a = Integer.toString(i57);
                                            bVar.f8411m = x.n(str7);
                                            bVar.f8412n = i16;
                                            bVar.f8402d = r14.X;
                                            bVar.f8403e = i5118;
                                            bVar.f8414p = list5;
                                            bVar.f8408j = str2;
                                            bVar.f8415q = r14.f163566l;
                                            q qVarA11 = bVar.a();
                                            l0 l0VarTrack11 = pVar.track(r14.f163557c, i18);
                                            r14.Y = l0VarTrack11;
                                            l0VarTrack11.d(qVarA11);
                                            sparseArray.put(r14.f163557c, (C3079c) r14);
                                            cVar4 = cVar2;
                                            break;
                                        case 11:
                                            listOf = ImmutableList.of(r14.a(str6));
                                            cVar2 = cVar9;
                                            str7 = MimeTypes.APPLICATION_VOBSUB;
                                            iX = -1;
                                            i16 = -1;
                                            list = listOf;
                                            str2 = null;
                                            list5 = list;
                                            if (r14.O != null) {
                                                str2 = lVarA.f17214a;
                                                str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                            }
                                            ?? r116 = r14.W;
                                            if (r14.V) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i51110 = r116 | i17;
                                            bVar = new q.b();
                                            zJ = x.j(str7);
                                            Map<String, Integer> map12 = f163523j0;
                                            if (zJ) {
                                                bVar.B = r14.P;
                                                bVar.C = r14.R;
                                                bVar.D = iX;
                                                i18 = 1;
                                            } else if (x.m(str7)) {
                                                if (r14.f163572r == 0) {
                                                    i26 = r14.f163570p;
                                                    i19 = -1;
                                                    if (i26 == -1) {
                                                        i26 = r14.f163567m;
                                                    }
                                                    r14.f163570p = i26;
                                                    i27 = r14.f163571q;
                                                    if (i27 == -1) {
                                                        i27 = r14.f163568n;
                                                    }
                                                    r14.f163571q = i27;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r14.f163570p;
                                                if (i24 != i19) {
                                                    f14 = -1.0f;
                                                } else {
                                                    f14 = -1.0f;
                                                }
                                                if (r14.f163579y) {
                                                    if (r14.E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    i.b bVar19 = new i.b();
                                                    bVar19.f8322a = r14.f163580z;
                                                    bVar19.f8323b = r14.B;
                                                    bVar19.f8324c = r14.A;
                                                    bVar19.f8325d = bArr;
                                                    int i51111 = r14.f163569o;
                                                    bVar19.f8326e = i51111;
                                                    bVar19.f8327f = i51111;
                                                    iVarA = bVar19.a();
                                                } else {
                                                    iVarA = null;
                                                }
                                                str4 = r14.f163555a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r14.f163573s == 0) {
                                                    if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r14.f163576v, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                bVar.f8418t = r14.f163567m;
                                                bVar.f8419u = r14.f163568n;
                                                bVar.f8422x = f14;
                                                bVar.f8421w = iIntValue;
                                                bVar.f8423y = r14.f163577w;
                                                bVar.f8424z = r14.f163578x;
                                                bVar.A = iVarA;
                                                i18 = 2;
                                            } else {
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str7)) {
                                                }
                                                i18 = 3;
                                            }
                                            str5 = r14.f163555a;
                                            if (str5 != null) {
                                                bVar.f8400b = r14.f163555a;
                                            }
                                            bVar.f8399a = Integer.toString(i57);
                                            bVar.f8411m = x.n(str7);
                                            bVar.f8412n = i16;
                                            bVar.f8402d = r14.X;
                                            bVar.f8403e = i51110;
                                            bVar.f8414p = list5;
                                            bVar.f8408j = str2;
                                            bVar.f8415q = r14.f163566l;
                                            q qVarA12 = bVar.a();
                                            l0 l0VarTrack12 = pVar.track(r14.f163557c, i18);
                                            r14.Y = l0VarTrack12;
                                            l0VarTrack12.d(qVarA12);
                                            sparseArray.put(r14.f163557c, (C3079c) r14);
                                            cVar4 = cVar2;
                                            break;
                                        case 12:
                                            str7 = MimeTypes.AUDIO_DTS_HD;
                                            cVar2 = cVar9;
                                            iX = -1;
                                            i16 = -1;
                                            list = null;
                                            str2 = null;
                                            list5 = list;
                                            if (r14.O != null) {
                                                str2 = lVarA.f17214a;
                                                str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                            }
                                            ?? r117 = r14.W;
                                            if (r14.V) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i51112 = r117 | i17;
                                            bVar = new q.b();
                                            zJ = x.j(str7);
                                            Map<String, Integer> map13 = f163523j0;
                                            if (zJ) {
                                                bVar.B = r14.P;
                                                bVar.C = r14.R;
                                                bVar.D = iX;
                                                i18 = 1;
                                            } else if (x.m(str7)) {
                                                if (r14.f163572r == 0) {
                                                    i26 = r14.f163570p;
                                                    i19 = -1;
                                                    if (i26 == -1) {
                                                        i26 = r14.f163567m;
                                                    }
                                                    r14.f163570p = i26;
                                                    i27 = r14.f163571q;
                                                    if (i27 == -1) {
                                                        i27 = r14.f163568n;
                                                    }
                                                    r14.f163571q = i27;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r14.f163570p;
                                                if (i24 != i19) {
                                                    f14 = -1.0f;
                                                } else {
                                                    f14 = -1.0f;
                                                }
                                                if (r14.f163579y) {
                                                    if (r14.E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    i.b bVar110 = new i.b();
                                                    bVar110.f8322a = r14.f163580z;
                                                    bVar110.f8323b = r14.B;
                                                    bVar110.f8324c = r14.A;
                                                    bVar110.f8325d = bArr;
                                                    int i51113 = r14.f163569o;
                                                    bVar110.f8326e = i51113;
                                                    bVar110.f8327f = i51113;
                                                    iVarA = bVar110.a();
                                                } else {
                                                    iVarA = null;
                                                }
                                                str4 = r14.f163555a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r14.f163573s == 0) {
                                                    if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r14.f163576v, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                bVar.f8418t = r14.f163567m;
                                                bVar.f8419u = r14.f163568n;
                                                bVar.f8422x = f14;
                                                bVar.f8421w = iIntValue;
                                                bVar.f8423y = r14.f163577w;
                                                bVar.f8424z = r14.f163578x;
                                                bVar.A = iVarA;
                                                i18 = 2;
                                            } else {
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str7)) {
                                                }
                                                i18 = 3;
                                            }
                                            str5 = r14.f163555a;
                                            if (str5 != null) {
                                                bVar.f8400b = r14.f163555a;
                                            }
                                            bVar.f8399a = Integer.toString(i57);
                                            bVar.f8411m = x.n(str7);
                                            bVar.f8412n = i16;
                                            bVar.f8402d = r14.X;
                                            bVar.f8403e = i51112;
                                            bVar.f8414p = list5;
                                            bVar.f8408j = str2;
                                            bVar.f8415q = r14.f163566l;
                                            q qVarA13 = bVar.a();
                                            l0 l0VarTrack13 = pVar.track(r14.f163557c, i18);
                                            r14.Y = l0VarTrack13;
                                            l0VarTrack13.d(qVarA13);
                                            sparseArray.put(r14.f163557c, (C3079c) r14);
                                            cVar4 = cVar2;
                                            break;
                                        case 13:
                                            List<byte[]> listSingletonList2 = Collections.singletonList(r14.a(str6));
                                            bb.a.b bVarB = bb.a.b(new fa.q(r14.f163565k), false);
                                            r14.R = bVarB.f17088a;
                                            r14.P = bVarB.f17089b;
                                            String str8 = bVarB.f17090c;
                                            str7 = MimeTypes.AUDIO_AAC;
                                            cVar2 = cVar9;
                                            str2 = str8;
                                            i16 = -1;
                                            list3 = listSingletonList2;
                                            iX = -1;
                                            list5 = list3;
                                            if (r14.O != null) {
                                                str2 = lVarA.f17214a;
                                                str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                            }
                                            ?? r118 = r14.W;
                                            if (r14.V) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i51114 = r118 | i17;
                                            bVar = new q.b();
                                            zJ = x.j(str7);
                                            Map<String, Integer> map14 = f163523j0;
                                            if (zJ) {
                                                bVar.B = r14.P;
                                                bVar.C = r14.R;
                                                bVar.D = iX;
                                                i18 = 1;
                                            } else if (x.m(str7)) {
                                                if (r14.f163572r == 0) {
                                                    i26 = r14.f163570p;
                                                    i19 = -1;
                                                    if (i26 == -1) {
                                                        i26 = r14.f163567m;
                                                    }
                                                    r14.f163570p = i26;
                                                    i27 = r14.f163571q;
                                                    if (i27 == -1) {
                                                        i27 = r14.f163568n;
                                                    }
                                                    r14.f163571q = i27;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r14.f163570p;
                                                if (i24 != i19) {
                                                    f14 = -1.0f;
                                                } else {
                                                    f14 = -1.0f;
                                                }
                                                if (r14.f163579y) {
                                                    if (r14.E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    i.b bVar111 = new i.b();
                                                    bVar111.f8322a = r14.f163580z;
                                                    bVar111.f8323b = r14.B;
                                                    bVar111.f8324c = r14.A;
                                                    bVar111.f8325d = bArr;
                                                    int i51115 = r14.f163569o;
                                                    bVar111.f8326e = i51115;
                                                    bVar111.f8327f = i51115;
                                                    iVarA = bVar111.a();
                                                } else {
                                                    iVarA = null;
                                                }
                                                str4 = r14.f163555a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r14.f163573s == 0) {
                                                    if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r14.f163576v, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                bVar.f8418t = r14.f163567m;
                                                bVar.f8419u = r14.f163568n;
                                                bVar.f8422x = f14;
                                                bVar.f8421w = iIntValue;
                                                bVar.f8423y = r14.f163577w;
                                                bVar.f8424z = r14.f163578x;
                                                bVar.A = iVarA;
                                                i18 = 2;
                                            } else {
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str7)) {
                                                }
                                                i18 = 3;
                                            }
                                            str5 = r14.f163555a;
                                            if (str5 != null) {
                                                bVar.f8400b = r14.f163555a;
                                            }
                                            bVar.f8399a = Integer.toString(i57);
                                            bVar.f8411m = x.n(str7);
                                            bVar.f8412n = i16;
                                            bVar.f8402d = r14.X;
                                            bVar.f8403e = i51114;
                                            bVar.f8414p = list5;
                                            bVar.f8408j = str2;
                                            bVar.f8415q = r14.f163566l;
                                            q qVarA14 = bVar.a();
                                            l0 l0VarTrack14 = pVar.track(r14.f163557c, i18);
                                            r14.Y = l0VarTrack14;
                                            l0VarTrack14.d(qVarA14);
                                            sparseArray.put(r14.f163557c, (C3079c) r14);
                                            cVar4 = cVar2;
                                            break;
                                        case 14:
                                            str7 = MimeTypes.AUDIO_AC3;
                                            cVar2 = cVar9;
                                            iX = -1;
                                            i16 = -1;
                                            list = null;
                                            str2 = null;
                                            list5 = list;
                                            if (r14.O != null) {
                                                str2 = lVarA.f17214a;
                                                str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                            }
                                            ?? r119 = r14.W;
                                            if (r14.V) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i51116 = r119 | i17;
                                            bVar = new q.b();
                                            zJ = x.j(str7);
                                            Map<String, Integer> map15 = f163523j0;
                                            if (zJ) {
                                                bVar.B = r14.P;
                                                bVar.C = r14.R;
                                                bVar.D = iX;
                                                i18 = 1;
                                            } else if (x.m(str7)) {
                                                if (r14.f163572r == 0) {
                                                    i26 = r14.f163570p;
                                                    i19 = -1;
                                                    if (i26 == -1) {
                                                        i26 = r14.f163567m;
                                                    }
                                                    r14.f163570p = i26;
                                                    i27 = r14.f163571q;
                                                    if (i27 == -1) {
                                                        i27 = r14.f163568n;
                                                    }
                                                    r14.f163571q = i27;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r14.f163570p;
                                                if (i24 != i19) {
                                                    f14 = -1.0f;
                                                } else {
                                                    f14 = -1.0f;
                                                }
                                                if (r14.f163579y) {
                                                    if (r14.E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    i.b bVar112 = new i.b();
                                                    bVar112.f8322a = r14.f163580z;
                                                    bVar112.f8323b = r14.B;
                                                    bVar112.f8324c = r14.A;
                                                    bVar112.f8325d = bArr;
                                                    int i51117 = r14.f163569o;
                                                    bVar112.f8326e = i51117;
                                                    bVar112.f8327f = i51117;
                                                    iVarA = bVar112.a();
                                                } else {
                                                    iVarA = null;
                                                }
                                                str4 = r14.f163555a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r14.f163573s == 0) {
                                                    if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r14.f163576v, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                bVar.f8418t = r14.f163567m;
                                                bVar.f8419u = r14.f163568n;
                                                bVar.f8422x = f14;
                                                bVar.f8421w = iIntValue;
                                                bVar.f8423y = r14.f163577w;
                                                bVar.f8424z = r14.f163578x;
                                                bVar.A = iVarA;
                                                i18 = 2;
                                            } else {
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str7)) {
                                                }
                                                i18 = 3;
                                            }
                                            str5 = r14.f163555a;
                                            if (str5 != null) {
                                                bVar.f8400b = r14.f163555a;
                                            }
                                            bVar.f8399a = Integer.toString(i57);
                                            bVar.f8411m = x.n(str7);
                                            bVar.f8412n = i16;
                                            bVar.f8402d = r14.X;
                                            bVar.f8403e = i51116;
                                            bVar.f8414p = list5;
                                            bVar.f8408j = str2;
                                            bVar.f8415q = r14.f163566l;
                                            q qVarA15 = bVar.a();
                                            l0 l0VarTrack15 = pVar.track(r14.f163557c, i18);
                                            r14.Y = l0VarTrack15;
                                            l0VarTrack15.d(qVarA15);
                                            sparseArray.put(r14.f163557c, (C3079c) r14);
                                            cVar4 = cVar2;
                                            break;
                                        case 15:
                                        case 21:
                                            str7 = MimeTypes.AUDIO_DTS;
                                            cVar2 = cVar9;
                                            iX = -1;
                                            i16 = -1;
                                            list = null;
                                            str2 = null;
                                            list5 = list;
                                            if (r14.O != null) {
                                                str2 = lVarA.f17214a;
                                                str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                            }
                                            ?? r1110 = r14.W;
                                            if (r14.V) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i51118 = r1110 | i17;
                                            bVar = new q.b();
                                            zJ = x.j(str7);
                                            Map<String, Integer> map16 = f163523j0;
                                            if (zJ) {
                                                bVar.B = r14.P;
                                                bVar.C = r14.R;
                                                bVar.D = iX;
                                                i18 = 1;
                                            } else if (x.m(str7)) {
                                                if (r14.f163572r == 0) {
                                                    i26 = r14.f163570p;
                                                    i19 = -1;
                                                    if (i26 == -1) {
                                                        i26 = r14.f163567m;
                                                    }
                                                    r14.f163570p = i26;
                                                    i27 = r14.f163571q;
                                                    if (i27 == -1) {
                                                        i27 = r14.f163568n;
                                                    }
                                                    r14.f163571q = i27;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r14.f163570p;
                                                if (i24 != i19) {
                                                    f14 = -1.0f;
                                                } else {
                                                    f14 = -1.0f;
                                                }
                                                if (r14.f163579y) {
                                                    if (r14.E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    i.b bVar113 = new i.b();
                                                    bVar113.f8322a = r14.f163580z;
                                                    bVar113.f8323b = r14.B;
                                                    bVar113.f8324c = r14.A;
                                                    bVar113.f8325d = bArr;
                                                    int i51119 = r14.f163569o;
                                                    bVar113.f8326e = i51119;
                                                    bVar113.f8327f = i51119;
                                                    iVarA = bVar113.a();
                                                } else {
                                                    iVarA = null;
                                                }
                                                str4 = r14.f163555a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r14.f163573s == 0) {
                                                    if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r14.f163576v, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                bVar.f8418t = r14.f163567m;
                                                bVar.f8419u = r14.f163568n;
                                                bVar.f8422x = f14;
                                                bVar.f8421w = iIntValue;
                                                bVar.f8423y = r14.f163577w;
                                                bVar.f8424z = r14.f163578x;
                                                bVar.A = iVarA;
                                                i18 = 2;
                                            } else {
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str7)) {
                                                }
                                                i18 = 3;
                                            }
                                            str5 = r14.f163555a;
                                            if (str5 != null) {
                                                bVar.f8400b = r14.f163555a;
                                            }
                                            bVar.f8399a = Integer.toString(i57);
                                            bVar.f8411m = x.n(str7);
                                            bVar.f8412n = i16;
                                            bVar.f8402d = r14.X;
                                            bVar.f8403e = i51118;
                                            bVar.f8414p = list5;
                                            bVar.f8408j = str2;
                                            bVar.f8415q = r14.f163566l;
                                            q qVarA16 = bVar.a();
                                            l0 l0VarTrack16 = pVar.track(r14.f163557c, i18);
                                            r14.Y = l0VarTrack16;
                                            l0VarTrack16.d(qVarA16);
                                            sparseArray.put(r14.f163557c, (C3079c) r14);
                                            cVar4 = cVar2;
                                            break;
                                        case 16:
                                            str7 = MimeTypes.VIDEO_AV1;
                                            cVar2 = cVar9;
                                            iX = -1;
                                            i16 = -1;
                                            list = null;
                                            str2 = null;
                                            list5 = list;
                                            if (r14.O != null) {
                                                str2 = lVarA.f17214a;
                                                str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                            }
                                            ?? r1111 = r14.W;
                                            if (r14.V) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i511110 = r1111 | i17;
                                            bVar = new q.b();
                                            zJ = x.j(str7);
                                            Map<String, Integer> map17 = f163523j0;
                                            if (zJ) {
                                                bVar.B = r14.P;
                                                bVar.C = r14.R;
                                                bVar.D = iX;
                                                i18 = 1;
                                            } else if (x.m(str7)) {
                                                if (r14.f163572r == 0) {
                                                    i26 = r14.f163570p;
                                                    i19 = -1;
                                                    if (i26 == -1) {
                                                        i26 = r14.f163567m;
                                                    }
                                                    r14.f163570p = i26;
                                                    i27 = r14.f163571q;
                                                    if (i27 == -1) {
                                                        i27 = r14.f163568n;
                                                    }
                                                    r14.f163571q = i27;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r14.f163570p;
                                                if (i24 != i19) {
                                                    f14 = -1.0f;
                                                } else {
                                                    f14 = -1.0f;
                                                }
                                                if (r14.f163579y) {
                                                    if (r14.E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    i.b bVar114 = new i.b();
                                                    bVar114.f8322a = r14.f163580z;
                                                    bVar114.f8323b = r14.B;
                                                    bVar114.f8324c = r14.A;
                                                    bVar114.f8325d = bArr;
                                                    int i511111 = r14.f163569o;
                                                    bVar114.f8326e = i511111;
                                                    bVar114.f8327f = i511111;
                                                    iVarA = bVar114.a();
                                                } else {
                                                    iVarA = null;
                                                }
                                                str4 = r14.f163555a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r14.f163573s == 0) {
                                                    if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r14.f163576v, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                bVar.f8418t = r14.f163567m;
                                                bVar.f8419u = r14.f163568n;
                                                bVar.f8422x = f14;
                                                bVar.f8421w = iIntValue;
                                                bVar.f8423y = r14.f163577w;
                                                bVar.f8424z = r14.f163578x;
                                                bVar.A = iVarA;
                                                i18 = 2;
                                            } else {
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str7)) {
                                                }
                                                i18 = 3;
                                            }
                                            str5 = r14.f163555a;
                                            if (str5 != null) {
                                                bVar.f8400b = r14.f163555a;
                                            }
                                            bVar.f8399a = Integer.toString(i57);
                                            bVar.f8411m = x.n(str7);
                                            bVar.f8412n = i16;
                                            bVar.f8402d = r14.X;
                                            bVar.f8403e = i511110;
                                            bVar.f8414p = list5;
                                            bVar.f8408j = str2;
                                            bVar.f8415q = r14.f163566l;
                                            q qVarA17 = bVar.a();
                                            l0 l0VarTrack17 = pVar.track(r14.f163557c, i18);
                                            r14.Y = l0VarTrack17;
                                            l0VarTrack17.d(qVarA17);
                                            sparseArray.put(r14.f163557c, (C3079c) r14);
                                            cVar4 = cVar2;
                                            break;
                                        case 17:
                                            str7 = MimeTypes.VIDEO_VP8;
                                            cVar2 = cVar9;
                                            iX = -1;
                                            i16 = -1;
                                            list = null;
                                            str2 = null;
                                            list5 = list;
                                            if (r14.O != null) {
                                                str2 = lVarA.f17214a;
                                                str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                            }
                                            ?? r1112 = r14.W;
                                            if (r14.V) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i511112 = r1112 | i17;
                                            bVar = new q.b();
                                            zJ = x.j(str7);
                                            Map<String, Integer> map18 = f163523j0;
                                            if (zJ) {
                                                bVar.B = r14.P;
                                                bVar.C = r14.R;
                                                bVar.D = iX;
                                                i18 = 1;
                                            } else if (x.m(str7)) {
                                                if (r14.f163572r == 0) {
                                                    i26 = r14.f163570p;
                                                    i19 = -1;
                                                    if (i26 == -1) {
                                                        i26 = r14.f163567m;
                                                    }
                                                    r14.f163570p = i26;
                                                    i27 = r14.f163571q;
                                                    if (i27 == -1) {
                                                        i27 = r14.f163568n;
                                                    }
                                                    r14.f163571q = i27;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r14.f163570p;
                                                if (i24 != i19) {
                                                    f14 = -1.0f;
                                                } else {
                                                    f14 = -1.0f;
                                                }
                                                if (r14.f163579y) {
                                                    if (r14.E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    i.b bVar115 = new i.b();
                                                    bVar115.f8322a = r14.f163580z;
                                                    bVar115.f8323b = r14.B;
                                                    bVar115.f8324c = r14.A;
                                                    bVar115.f8325d = bArr;
                                                    int i511113 = r14.f163569o;
                                                    bVar115.f8326e = i511113;
                                                    bVar115.f8327f = i511113;
                                                    iVarA = bVar115.a();
                                                } else {
                                                    iVarA = null;
                                                }
                                                str4 = r14.f163555a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r14.f163573s == 0) {
                                                    if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r14.f163576v, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                bVar.f8418t = r14.f163567m;
                                                bVar.f8419u = r14.f163568n;
                                                bVar.f8422x = f14;
                                                bVar.f8421w = iIntValue;
                                                bVar.f8423y = r14.f163577w;
                                                bVar.f8424z = r14.f163578x;
                                                bVar.A = iVarA;
                                                i18 = 2;
                                            } else {
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str7)) {
                                                }
                                                i18 = 3;
                                            }
                                            str5 = r14.f163555a;
                                            if (str5 != null) {
                                                bVar.f8400b = r14.f163555a;
                                            }
                                            bVar.f8399a = Integer.toString(i57);
                                            bVar.f8411m = x.n(str7);
                                            bVar.f8412n = i16;
                                            bVar.f8402d = r14.X;
                                            bVar.f8403e = i511112;
                                            bVar.f8414p = list5;
                                            bVar.f8408j = str2;
                                            bVar.f8415q = r14.f163566l;
                                            q qVarA18 = bVar.a();
                                            l0 l0VarTrack18 = pVar.track(r14.f163557c, i18);
                                            r14.Y = l0VarTrack18;
                                            l0VarTrack18.d(qVarA18);
                                            sparseArray.put(r14.f163557c, (C3079c) r14);
                                            cVar4 = cVar2;
                                            break;
                                        case 18:
                                            str7 = MimeTypes.VIDEO_VP9;
                                            cVar2 = cVar9;
                                            iX = -1;
                                            i16 = -1;
                                            list = null;
                                            str2 = null;
                                            list5 = list;
                                            if (r14.O != null) {
                                                str2 = lVarA.f17214a;
                                                str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                            }
                                            ?? r1113 = r14.W;
                                            if (r14.V) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i511114 = r1113 | i17;
                                            bVar = new q.b();
                                            zJ = x.j(str7);
                                            Map<String, Integer> map19 = f163523j0;
                                            if (zJ) {
                                                bVar.B = r14.P;
                                                bVar.C = r14.R;
                                                bVar.D = iX;
                                                i18 = 1;
                                            } else if (x.m(str7)) {
                                                if (r14.f163572r == 0) {
                                                    i26 = r14.f163570p;
                                                    i19 = -1;
                                                    if (i26 == -1) {
                                                        i26 = r14.f163567m;
                                                    }
                                                    r14.f163570p = i26;
                                                    i27 = r14.f163571q;
                                                    if (i27 == -1) {
                                                        i27 = r14.f163568n;
                                                    }
                                                    r14.f163571q = i27;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r14.f163570p;
                                                if (i24 != i19) {
                                                    f14 = -1.0f;
                                                } else {
                                                    f14 = -1.0f;
                                                }
                                                if (r14.f163579y) {
                                                    if (r14.E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    i.b bVar116 = new i.b();
                                                    bVar116.f8322a = r14.f163580z;
                                                    bVar116.f8323b = r14.B;
                                                    bVar116.f8324c = r14.A;
                                                    bVar116.f8325d = bArr;
                                                    int i511115 = r14.f163569o;
                                                    bVar116.f8326e = i511115;
                                                    bVar116.f8327f = i511115;
                                                    iVarA = bVar116.a();
                                                } else {
                                                    iVarA = null;
                                                }
                                                str4 = r14.f163555a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r14.f163573s == 0) {
                                                    if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r14.f163576v, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                bVar.f8418t = r14.f163567m;
                                                bVar.f8419u = r14.f163568n;
                                                bVar.f8422x = f14;
                                                bVar.f8421w = iIntValue;
                                                bVar.f8423y = r14.f163577w;
                                                bVar.f8424z = r14.f163578x;
                                                bVar.A = iVarA;
                                                i18 = 2;
                                            } else {
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str7)) {
                                                }
                                                i18 = 3;
                                            }
                                            str5 = r14.f163555a;
                                            if (str5 != null) {
                                                bVar.f8400b = r14.f163555a;
                                            }
                                            bVar.f8399a = Integer.toString(i57);
                                            bVar.f8411m = x.n(str7);
                                            bVar.f8412n = i16;
                                            bVar.f8402d = r14.X;
                                            bVar.f8403e = i511114;
                                            bVar.f8414p = list5;
                                            bVar.f8408j = str2;
                                            bVar.f8415q = r14.f163566l;
                                            q qVarA19 = bVar.a();
                                            l0 l0VarTrack19 = pVar.track(r14.f163557c, i18);
                                            r14.Y = l0VarTrack19;
                                            l0VarTrack19.d(qVarA19);
                                            sparseArray.put(r14.f163557c, (C3079c) r14);
                                            cVar4 = cVar2;
                                            break;
                                        case 19:
                                            cVar2 = cVar9;
                                            str7 = MimeTypes.APPLICATION_PGS;
                                            iX = -1;
                                            i16 = -1;
                                            list = null;
                                            str2 = null;
                                            list5 = list;
                                            if (r14.O != null) {
                                                str2 = lVarA.f17214a;
                                                str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                            }
                                            ?? r1114 = r14.W;
                                            if (r14.V) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i511116 = r1114 | i17;
                                            bVar = new q.b();
                                            zJ = x.j(str7);
                                            Map<String, Integer> map110 = f163523j0;
                                            if (zJ) {
                                                bVar.B = r14.P;
                                                bVar.C = r14.R;
                                                bVar.D = iX;
                                                i18 = 1;
                                            } else if (x.m(str7)) {
                                                if (r14.f163572r == 0) {
                                                    i26 = r14.f163570p;
                                                    i19 = -1;
                                                    if (i26 == -1) {
                                                        i26 = r14.f163567m;
                                                    }
                                                    r14.f163570p = i26;
                                                    i27 = r14.f163571q;
                                                    if (i27 == -1) {
                                                        i27 = r14.f163568n;
                                                    }
                                                    r14.f163571q = i27;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r14.f163570p;
                                                if (i24 != i19) {
                                                    f14 = -1.0f;
                                                } else {
                                                    f14 = -1.0f;
                                                }
                                                if (r14.f163579y) {
                                                    if (r14.E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    i.b bVar117 = new i.b();
                                                    bVar117.f8322a = r14.f163580z;
                                                    bVar117.f8323b = r14.B;
                                                    bVar117.f8324c = r14.A;
                                                    bVar117.f8325d = bArr;
                                                    int i511117 = r14.f163569o;
                                                    bVar117.f8326e = i511117;
                                                    bVar117.f8327f = i511117;
                                                    iVarA = bVar117.a();
                                                } else {
                                                    iVarA = null;
                                                }
                                                str4 = r14.f163555a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r14.f163573s == 0) {
                                                    if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r14.f163576v, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                bVar.f8418t = r14.f163567m;
                                                bVar.f8419u = r14.f163568n;
                                                bVar.f8422x = f14;
                                                bVar.f8421w = iIntValue;
                                                bVar.f8423y = r14.f163577w;
                                                bVar.f8424z = r14.f163578x;
                                                bVar.A = iVarA;
                                                i18 = 2;
                                            } else {
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str7)) {
                                                }
                                                i18 = 3;
                                            }
                                            str5 = r14.f163555a;
                                            if (str5 != null) {
                                                bVar.f8400b = r14.f163555a;
                                            }
                                            bVar.f8399a = Integer.toString(i57);
                                            bVar.f8411m = x.n(str7);
                                            bVar.f8412n = i16;
                                            bVar.f8402d = r14.X;
                                            bVar.f8403e = i511116;
                                            bVar.f8414p = list5;
                                            bVar.f8408j = str2;
                                            bVar.f8415q = r14.f163566l;
                                            q qVarA110 = bVar.a();
                                            l0 l0VarTrack110 = pVar.track(r14.f163557c, i18);
                                            r14.Y = l0VarTrack110;
                                            l0VarTrack110.d(qVarA110);
                                            sparseArray.put(r14.f163557c, (C3079c) r14);
                                            cVar4 = cVar2;
                                            break;
                                        case 20:
                                            cVar2 = cVar9;
                                            iX = -1;
                                            i16 = -1;
                                            list = null;
                                            str2 = null;
                                            list5 = list;
                                            if (r14.O != null) {
                                                str2 = lVarA.f17214a;
                                                str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                            }
                                            ?? r1115 = r14.W;
                                            if (r14.V) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i511118 = r1115 | i17;
                                            bVar = new q.b();
                                            zJ = x.j(str7);
                                            Map<String, Integer> map111 = f163523j0;
                                            if (zJ) {
                                                bVar.B = r14.P;
                                                bVar.C = r14.R;
                                                bVar.D = iX;
                                                i18 = 1;
                                            } else if (x.m(str7)) {
                                                if (r14.f163572r == 0) {
                                                    i26 = r14.f163570p;
                                                    i19 = -1;
                                                    if (i26 == -1) {
                                                        i26 = r14.f163567m;
                                                    }
                                                    r14.f163570p = i26;
                                                    i27 = r14.f163571q;
                                                    if (i27 == -1) {
                                                        i27 = r14.f163568n;
                                                    }
                                                    r14.f163571q = i27;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r14.f163570p;
                                                if (i24 != i19) {
                                                    f14 = -1.0f;
                                                } else {
                                                    f14 = -1.0f;
                                                }
                                                if (r14.f163579y) {
                                                    if (r14.E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    i.b bVar118 = new i.b();
                                                    bVar118.f8322a = r14.f163580z;
                                                    bVar118.f8323b = r14.B;
                                                    bVar118.f8324c = r14.A;
                                                    bVar118.f8325d = bArr;
                                                    int i511119 = r14.f163569o;
                                                    bVar118.f8326e = i511119;
                                                    bVar118.f8327f = i511119;
                                                    iVarA = bVar118.a();
                                                } else {
                                                    iVarA = null;
                                                }
                                                str4 = r14.f163555a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r14.f163573s == 0) {
                                                    if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r14.f163576v, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                bVar.f8418t = r14.f163567m;
                                                bVar.f8419u = r14.f163568n;
                                                bVar.f8422x = f14;
                                                bVar.f8421w = iIntValue;
                                                bVar.f8423y = r14.f163577w;
                                                bVar.f8424z = r14.f163578x;
                                                bVar.A = iVarA;
                                                i18 = 2;
                                            } else {
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str7)) {
                                                }
                                                i18 = 3;
                                            }
                                            str5 = r14.f163555a;
                                            if (str5 != null) {
                                                bVar.f8400b = r14.f163555a;
                                            }
                                            bVar.f8399a = Integer.toString(i57);
                                            bVar.f8411m = x.n(str7);
                                            bVar.f8412n = i16;
                                            bVar.f8402d = r14.X;
                                            bVar.f8403e = i511118;
                                            bVar.f8414p = list5;
                                            bVar.f8408j = str2;
                                            bVar.f8415q = r14.f163566l;
                                            q qVarA111 = bVar.a();
                                            l0 l0VarTrack111 = pVar.track(r14.f163557c, i18);
                                            r14.Y = l0VarTrack111;
                                            l0VarTrack111.d(qVarA111);
                                            sparseArray.put(r14.f163557c, (C3079c) r14);
                                            cVar4 = cVar2;
                                            break;
                                        case 22:
                                            cVar3 = cVar9;
                                            if (r14.Q == 32) {
                                                cVar2 = cVar3;
                                                str7 = MimeTypes.AUDIO_RAW;
                                                iX = 4;
                                            } else {
                                                k.g("Unsupported floating point PCM bit depth: " + r14.Q + ". Setting mimeType to audio/x-unknown");
                                                cVar2 = cVar3;
                                                str7 = MimeTypes.AUDIO_UNKNOWN;
                                                iX = -1;
                                            }
                                            i16 = -1;
                                            list = null;
                                            str2 = null;
                                            list5 = list;
                                            if (r14.O != null) {
                                                str2 = lVarA.f17214a;
                                                str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                            }
                                            ?? r1116 = r14.W;
                                            if (r14.V) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i5111110 = r1116 | i17;
                                            bVar = new q.b();
                                            zJ = x.j(str7);
                                            Map<String, Integer> map112 = f163523j0;
                                            if (zJ) {
                                                bVar.B = r14.P;
                                                bVar.C = r14.R;
                                                bVar.D = iX;
                                                i18 = 1;
                                            } else if (x.m(str7)) {
                                                if (r14.f163572r == 0) {
                                                    i26 = r14.f163570p;
                                                    i19 = -1;
                                                    if (i26 == -1) {
                                                        i26 = r14.f163567m;
                                                    }
                                                    r14.f163570p = i26;
                                                    i27 = r14.f163571q;
                                                    if (i27 == -1) {
                                                        i27 = r14.f163568n;
                                                    }
                                                    r14.f163571q = i27;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r14.f163570p;
                                                if (i24 != i19) {
                                                    f14 = -1.0f;
                                                } else {
                                                    f14 = -1.0f;
                                                }
                                                if (r14.f163579y) {
                                                    if (r14.E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    i.b bVar119 = new i.b();
                                                    bVar119.f8322a = r14.f163580z;
                                                    bVar119.f8323b = r14.B;
                                                    bVar119.f8324c = r14.A;
                                                    bVar119.f8325d = bArr;
                                                    int i5111111 = r14.f163569o;
                                                    bVar119.f8326e = i5111111;
                                                    bVar119.f8327f = i5111111;
                                                    iVarA = bVar119.a();
                                                } else {
                                                    iVarA = null;
                                                }
                                                str4 = r14.f163555a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r14.f163573s == 0) {
                                                    if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r14.f163576v, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                bVar.f8418t = r14.f163567m;
                                                bVar.f8419u = r14.f163568n;
                                                bVar.f8422x = f14;
                                                bVar.f8421w = iIntValue;
                                                bVar.f8423y = r14.f163577w;
                                                bVar.f8424z = r14.f163578x;
                                                bVar.A = iVarA;
                                                i18 = 2;
                                            } else {
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str7)) {
                                                }
                                                i18 = 3;
                                            }
                                            str5 = r14.f163555a;
                                            if (str5 != null) {
                                                bVar.f8400b = r14.f163555a;
                                            }
                                            bVar.f8399a = Integer.toString(i57);
                                            bVar.f8411m = x.n(str7);
                                            bVar.f8412n = i16;
                                            bVar.f8402d = r14.X;
                                            bVar.f8403e = i5111110;
                                            bVar.f8414p = list5;
                                            bVar.f8408j = str2;
                                            bVar.f8415q = r14.f163566l;
                                            q qVarA112 = bVar.a();
                                            l0 l0VarTrack112 = pVar.track(r14.f163557c, i18);
                                            r14.Y = l0VarTrack112;
                                            l0VarTrack112.d(qVarA112);
                                            sparseArray.put(r14.f163557c, (C3079c) r14);
                                            cVar4 = cVar2;
                                            break;
                                        case 23:
                                            cVar3 = cVar9;
                                            int i84 = r14.Q;
                                            if (i84 == 8) {
                                                cVar2 = cVar3;
                                                str7 = MimeTypes.AUDIO_RAW;
                                                iX = 3;
                                            } else {
                                                if (i84 == 16) {
                                                    iX = 268435456;
                                                } else if (i84 == 24) {
                                                    iX = 1342177280;
                                                } else if (i84 == 32) {
                                                    iX = 1610612736;
                                                } else {
                                                    k.g("Unsupported big endian PCM bit depth: " + r14.Q + ". Setting mimeType to audio/x-unknown");
                                                    cVar2 = cVar3;
                                                    str7 = MimeTypes.AUDIO_UNKNOWN;
                                                    iX = -1;
                                                }
                                                cVar2 = cVar3;
                                                str7 = MimeTypes.AUDIO_RAW;
                                            }
                                            i16 = -1;
                                            list = null;
                                            str2 = null;
                                            list5 = list;
                                            if (r14.O != null) {
                                                str2 = lVarA.f17214a;
                                                str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                            }
                                            ?? r1117 = r14.W;
                                            if (r14.V) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i5111112 = r1117 | i17;
                                            bVar = new q.b();
                                            zJ = x.j(str7);
                                            Map<String, Integer> map113 = f163523j0;
                                            if (zJ) {
                                                bVar.B = r14.P;
                                                bVar.C = r14.R;
                                                bVar.D = iX;
                                                i18 = 1;
                                            } else if (x.m(str7)) {
                                                if (r14.f163572r == 0) {
                                                    i26 = r14.f163570p;
                                                    i19 = -1;
                                                    if (i26 == -1) {
                                                        i26 = r14.f163567m;
                                                    }
                                                    r14.f163570p = i26;
                                                    i27 = r14.f163571q;
                                                    if (i27 == -1) {
                                                        i27 = r14.f163568n;
                                                    }
                                                    r14.f163571q = i27;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r14.f163570p;
                                                if (i24 != i19) {
                                                    f14 = -1.0f;
                                                } else {
                                                    f14 = -1.0f;
                                                }
                                                if (r14.f163579y) {
                                                    if (r14.E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    i.b bVar1110 = new i.b();
                                                    bVar1110.f8322a = r14.f163580z;
                                                    bVar1110.f8323b = r14.B;
                                                    bVar1110.f8324c = r14.A;
                                                    bVar1110.f8325d = bArr;
                                                    int i5111113 = r14.f163569o;
                                                    bVar1110.f8326e = i5111113;
                                                    bVar1110.f8327f = i5111113;
                                                    iVarA = bVar1110.a();
                                                } else {
                                                    iVarA = null;
                                                }
                                                str4 = r14.f163555a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r14.f163573s == 0) {
                                                    if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r14.f163576v, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                bVar.f8418t = r14.f163567m;
                                                bVar.f8419u = r14.f163568n;
                                                bVar.f8422x = f14;
                                                bVar.f8421w = iIntValue;
                                                bVar.f8423y = r14.f163577w;
                                                bVar.f8424z = r14.f163578x;
                                                bVar.A = iVarA;
                                                i18 = 2;
                                            } else {
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str7)) {
                                                }
                                                i18 = 3;
                                            }
                                            str5 = r14.f163555a;
                                            if (str5 != null) {
                                                bVar.f8400b = r14.f163555a;
                                            }
                                            bVar.f8399a = Integer.toString(i57);
                                            bVar.f8411m = x.n(str7);
                                            bVar.f8412n = i16;
                                            bVar.f8402d = r14.X;
                                            bVar.f8403e = i5111112;
                                            bVar.f8414p = list5;
                                            bVar.f8408j = str2;
                                            bVar.f8415q = r14.f163566l;
                                            q qVarA113 = bVar.a();
                                            l0 l0VarTrack113 = pVar.track(r14.f163557c, i18);
                                            r14.Y = l0VarTrack113;
                                            l0VarTrack113.d(qVarA113);
                                            sparseArray.put(r14.f163557c, (C3079c) r14);
                                            cVar4 = cVar2;
                                            break;
                                        case 24:
                                            cVar3 = cVar9;
                                            iX = z.x(r14.Q);
                                            if (iX == 0) {
                                                k.g("Unsupported little endian PCM bit depth: " + r14.Q + ". Setting mimeType to audio/x-unknown");
                                                cVar2 = cVar3;
                                                str7 = MimeTypes.AUDIO_UNKNOWN;
                                                iX = -1;
                                                i16 = -1;
                                                list = null;
                                                str2 = null;
                                                list5 = list;
                                                if (r14.O != null) {
                                                    str2 = lVarA.f17214a;
                                                    str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                                }
                                                ?? r1118 = r14.W;
                                                if (r14.V) {
                                                    i17 = 2;
                                                } else {
                                                    i17 = 0;
                                                }
                                                int i5111114 = r1118 | i17;
                                                bVar = new q.b();
                                                zJ = x.j(str7);
                                                Map<String, Integer> map114 = f163523j0;
                                                if (zJ) {
                                                    bVar.B = r14.P;
                                                    bVar.C = r14.R;
                                                    bVar.D = iX;
                                                    i18 = 1;
                                                } else if (x.m(str7)) {
                                                    if (r14.f163572r == 0) {
                                                        i26 = r14.f163570p;
                                                        i19 = -1;
                                                        if (i26 == -1) {
                                                            i26 = r14.f163567m;
                                                        }
                                                        r14.f163570p = i26;
                                                        i27 = r14.f163571q;
                                                        if (i27 == -1) {
                                                            i27 = r14.f163568n;
                                                        }
                                                        r14.f163571q = i27;
                                                    } else {
                                                        i19 = -1;
                                                    }
                                                    i24 = r14.f163570p;
                                                    if (i24 != i19) {
                                                        f14 = -1.0f;
                                                    } else {
                                                        f14 = -1.0f;
                                                    }
                                                    if (r14.f163579y) {
                                                        if (r14.E != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        i.b bVar1111 = new i.b();
                                                        bVar1111.f8322a = r14.f163580z;
                                                        bVar1111.f8323b = r14.B;
                                                        bVar1111.f8324c = r14.A;
                                                        bVar1111.f8325d = bArr;
                                                        int i5111115 = r14.f163569o;
                                                        bVar1111.f8326e = i5111115;
                                                        bVar1111.f8327f = i5111115;
                                                        iVarA = bVar1111.a();
                                                    } else {
                                                        iVarA = null;
                                                    }
                                                    str4 = r14.f163555a;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r14.f163573s == 0) {
                                                        if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (Float.compare(r14.f163576v, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    bVar.f8418t = r14.f163567m;
                                                    bVar.f8419u = r14.f163568n;
                                                    bVar.f8422x = f14;
                                                    bVar.f8421w = iIntValue;
                                                    bVar.f8423y = r14.f163577w;
                                                    bVar.f8424z = r14.f163578x;
                                                    bVar.A = iVarA;
                                                    i18 = 2;
                                                } else {
                                                    if (MimeTypes.APPLICATION_SUBRIP.equals(str7)) {
                                                    }
                                                    i18 = 3;
                                                }
                                                str5 = r14.f163555a;
                                                if (str5 != null) {
                                                    bVar.f8400b = r14.f163555a;
                                                }
                                                bVar.f8399a = Integer.toString(i57);
                                                bVar.f8411m = x.n(str7);
                                                bVar.f8412n = i16;
                                                bVar.f8402d = r14.X;
                                                bVar.f8403e = i5111114;
                                                bVar.f8414p = list5;
                                                bVar.f8408j = str2;
                                                bVar.f8415q = r14.f163566l;
                                                q qVarA114 = bVar.a();
                                                l0 l0VarTrack114 = pVar.track(r14.f163557c, i18);
                                                r14.Y = l0VarTrack114;
                                                l0VarTrack114.d(qVarA114);
                                                sparseArray.put(r14.f163557c, (C3079c) r14);
                                                cVar4 = cVar2;
                                            }
                                            cVar2 = cVar3;
                                            str7 = MimeTypes.AUDIO_RAW;
                                            i16 = -1;
                                            list = null;
                                            str2 = null;
                                            list5 = list;
                                            if (r14.O != null) {
                                                str2 = lVarA.f17214a;
                                                str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                            }
                                            ?? r1119 = r14.W;
                                            if (r14.V) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i5111116 = r1119 | i17;
                                            bVar = new q.b();
                                            zJ = x.j(str7);
                                            Map<String, Integer> map115 = f163523j0;
                                            if (zJ) {
                                                bVar.B = r14.P;
                                                bVar.C = r14.R;
                                                bVar.D = iX;
                                                i18 = 1;
                                            } else if (x.m(str7)) {
                                                if (r14.f163572r == 0) {
                                                    i26 = r14.f163570p;
                                                    i19 = -1;
                                                    if (i26 == -1) {
                                                        i26 = r14.f163567m;
                                                    }
                                                    r14.f163570p = i26;
                                                    i27 = r14.f163571q;
                                                    if (i27 == -1) {
                                                        i27 = r14.f163568n;
                                                    }
                                                    r14.f163571q = i27;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r14.f163570p;
                                                if (i24 != i19) {
                                                    f14 = -1.0f;
                                                } else {
                                                    f14 = -1.0f;
                                                }
                                                if (r14.f163579y) {
                                                    if (r14.E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    i.b bVar1112 = new i.b();
                                                    bVar1112.f8322a = r14.f163580z;
                                                    bVar1112.f8323b = r14.B;
                                                    bVar1112.f8324c = r14.A;
                                                    bVar1112.f8325d = bArr;
                                                    int i5111117 = r14.f163569o;
                                                    bVar1112.f8326e = i5111117;
                                                    bVar1112.f8327f = i5111117;
                                                    iVarA = bVar1112.a();
                                                } else {
                                                    iVarA = null;
                                                }
                                                str4 = r14.f163555a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r14.f163573s == 0) {
                                                    if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r14.f163576v, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                bVar.f8418t = r14.f163567m;
                                                bVar.f8419u = r14.f163568n;
                                                bVar.f8422x = f14;
                                                bVar.f8421w = iIntValue;
                                                bVar.f8423y = r14.f163577w;
                                                bVar.f8424z = r14.f163578x;
                                                bVar.A = iVarA;
                                                i18 = 2;
                                            } else {
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str7)) {
                                                }
                                                i18 = 3;
                                            }
                                            str5 = r14.f163555a;
                                            if (str5 != null) {
                                                bVar.f8400b = r14.f163555a;
                                            }
                                            bVar.f8399a = Integer.toString(i57);
                                            bVar.f8411m = x.n(str7);
                                            bVar.f8412n = i16;
                                            bVar.f8402d = r14.X;
                                            bVar.f8403e = i5111116;
                                            bVar.f8414p = list5;
                                            bVar.f8408j = str2;
                                            bVar.f8415q = r14.f163566l;
                                            q qVarA115 = bVar.a();
                                            l0 l0VarTrack115 = pVar.track(r14.f163557c, i18);
                                            r14.Y = l0VarTrack115;
                                            l0VarTrack115.d(qVarA115);
                                            sparseArray.put(r14.f163557c, (C3079c) r14);
                                            cVar4 = cVar2;
                                            break;
                                        case 25:
                                            listOf = ImmutableList.of(f163519f0, r14.a(str6));
                                            cVar2 = cVar9;
                                            str7 = MimeTypes.TEXT_SSA;
                                            iX = -1;
                                            i16 = -1;
                                            list = listOf;
                                            str2 = null;
                                            list5 = list;
                                            if (r14.O != null) {
                                                str2 = lVarA.f17214a;
                                                str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                            }
                                            ?? r11110 = r14.W;
                                            if (r14.V) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i5111118 = r11110 | i17;
                                            bVar = new q.b();
                                            zJ = x.j(str7);
                                            Map<String, Integer> map116 = f163523j0;
                                            if (zJ) {
                                                bVar.B = r14.P;
                                                bVar.C = r14.R;
                                                bVar.D = iX;
                                                i18 = 1;
                                            } else if (x.m(str7)) {
                                                if (r14.f163572r == 0) {
                                                    i26 = r14.f163570p;
                                                    i19 = -1;
                                                    if (i26 == -1) {
                                                        i26 = r14.f163567m;
                                                    }
                                                    r14.f163570p = i26;
                                                    i27 = r14.f163571q;
                                                    if (i27 == -1) {
                                                        i27 = r14.f163568n;
                                                    }
                                                    r14.f163571q = i27;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r14.f163570p;
                                                if (i24 != i19) {
                                                    f14 = -1.0f;
                                                } else {
                                                    f14 = -1.0f;
                                                }
                                                if (r14.f163579y) {
                                                    if (r14.E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    i.b bVar1113 = new i.b();
                                                    bVar1113.f8322a = r14.f163580z;
                                                    bVar1113.f8323b = r14.B;
                                                    bVar1113.f8324c = r14.A;
                                                    bVar1113.f8325d = bArr;
                                                    int i5111119 = r14.f163569o;
                                                    bVar1113.f8326e = i5111119;
                                                    bVar1113.f8327f = i5111119;
                                                    iVarA = bVar1113.a();
                                                } else {
                                                    iVarA = null;
                                                }
                                                str4 = r14.f163555a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r14.f163573s == 0) {
                                                    if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r14.f163576v, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                bVar.f8418t = r14.f163567m;
                                                bVar.f8419u = r14.f163568n;
                                                bVar.f8422x = f14;
                                                bVar.f8421w = iIntValue;
                                                bVar.f8423y = r14.f163577w;
                                                bVar.f8424z = r14.f163578x;
                                                bVar.A = iVarA;
                                                i18 = 2;
                                            } else {
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str7)) {
                                                }
                                                i18 = 3;
                                            }
                                            str5 = r14.f163555a;
                                            if (str5 != null) {
                                                bVar.f8400b = r14.f163555a;
                                            }
                                            bVar.f8399a = Integer.toString(i57);
                                            bVar.f8411m = x.n(str7);
                                            bVar.f8412n = i16;
                                            bVar.f8402d = r14.X;
                                            bVar.f8403e = i5111118;
                                            bVar.f8414p = list5;
                                            bVar.f8408j = str2;
                                            bVar.f8415q = r14.f163566l;
                                            q qVarA116 = bVar.a();
                                            l0 l0VarTrack116 = pVar.track(r14.f163557c, i18);
                                            r14.Y = l0VarTrack116;
                                            l0VarTrack116.d(qVarA116);
                                            sparseArray.put(r14.f163557c, (C3079c) r14);
                                            cVar4 = cVar2;
                                            break;
                                        case 26:
                                            bb.z zVarA = bb.z.a(new r(r14.a(r14.f163556b)), false, null);
                                            List<byte[]> list7 = zVarA.f17276a;
                                            r14.Z = zVarA.f17277b;
                                            str3 = zVarA.f17286k;
                                            str7 = MimeTypes.VIDEO_H265;
                                            list4 = list7;
                                            str2 = str3;
                                            cVar2 = cVar9;
                                            list2 = list4;
                                            iX = -1;
                                            i16 = -1;
                                            list5 = list2;
                                            if (r14.O != null) {
                                                str2 = lVarA.f17214a;
                                                str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                            }
                                            ?? r11111 = r14.W;
                                            if (r14.V) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i51111110 = r11111 | i17;
                                            bVar = new q.b();
                                            zJ = x.j(str7);
                                            Map<String, Integer> map117 = f163523j0;
                                            if (zJ) {
                                                bVar.B = r14.P;
                                                bVar.C = r14.R;
                                                bVar.D = iX;
                                                i18 = 1;
                                            } else if (x.m(str7)) {
                                                if (r14.f163572r == 0) {
                                                    i26 = r14.f163570p;
                                                    i19 = -1;
                                                    if (i26 == -1) {
                                                        i26 = r14.f163567m;
                                                    }
                                                    r14.f163570p = i26;
                                                    i27 = r14.f163571q;
                                                    if (i27 == -1) {
                                                        i27 = r14.f163568n;
                                                    }
                                                    r14.f163571q = i27;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r14.f163570p;
                                                if (i24 != i19) {
                                                    f14 = -1.0f;
                                                } else {
                                                    f14 = -1.0f;
                                                }
                                                if (r14.f163579y) {
                                                    if (r14.E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    i.b bVar1114 = new i.b();
                                                    bVar1114.f8322a = r14.f163580z;
                                                    bVar1114.f8323b = r14.B;
                                                    bVar1114.f8324c = r14.A;
                                                    bVar1114.f8325d = bArr;
                                                    int i51111111 = r14.f163569o;
                                                    bVar1114.f8326e = i51111111;
                                                    bVar1114.f8327f = i51111111;
                                                    iVarA = bVar1114.a();
                                                } else {
                                                    iVarA = null;
                                                }
                                                str4 = r14.f163555a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r14.f163573s == 0) {
                                                    if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r14.f163576v, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                bVar.f8418t = r14.f163567m;
                                                bVar.f8419u = r14.f163568n;
                                                bVar.f8422x = f14;
                                                bVar.f8421w = iIntValue;
                                                bVar.f8423y = r14.f163577w;
                                                bVar.f8424z = r14.f163578x;
                                                bVar.A = iVarA;
                                                i18 = 2;
                                            } else {
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str7)) {
                                                }
                                                i18 = 3;
                                            }
                                            str5 = r14.f163555a;
                                            if (str5 != null) {
                                                bVar.f8400b = r14.f163555a;
                                            }
                                            bVar.f8399a = Integer.toString(i57);
                                            bVar.f8411m = x.n(str7);
                                            bVar.f8412n = i16;
                                            bVar.f8402d = r14.X;
                                            bVar.f8403e = i51111110;
                                            bVar.f8414p = list5;
                                            bVar.f8408j = str2;
                                            bVar.f8415q = r14.f163566l;
                                            q qVarA117 = bVar.a();
                                            l0 l0VarTrack117 = pVar.track(r14.f163557c, i18);
                                            r14.Y = l0VarTrack117;
                                            l0VarTrack117.d(qVarA117);
                                            sparseArray.put(r14.f163557c, (C3079c) r14);
                                            cVar4 = cVar2;
                                            break;
                                        case 27:
                                            cVar2 = cVar9;
                                            str7 = MimeTypes.TEXT_VTT;
                                            iX = -1;
                                            i16 = -1;
                                            list = null;
                                            str2 = null;
                                            list5 = list;
                                            if (r14.O != null) {
                                                str2 = lVarA.f17214a;
                                                str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                            }
                                            ?? r11112 = r14.W;
                                            if (r14.V) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i51111112 = r11112 | i17;
                                            bVar = new q.b();
                                            zJ = x.j(str7);
                                            Map<String, Integer> map118 = f163523j0;
                                            if (zJ) {
                                                bVar.B = r14.P;
                                                bVar.C = r14.R;
                                                bVar.D = iX;
                                                i18 = 1;
                                            } else if (x.m(str7)) {
                                                if (r14.f163572r == 0) {
                                                    i26 = r14.f163570p;
                                                    i19 = -1;
                                                    if (i26 == -1) {
                                                        i26 = r14.f163567m;
                                                    }
                                                    r14.f163570p = i26;
                                                    i27 = r14.f163571q;
                                                    if (i27 == -1) {
                                                        i27 = r14.f163568n;
                                                    }
                                                    r14.f163571q = i27;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r14.f163570p;
                                                if (i24 != i19) {
                                                    f14 = -1.0f;
                                                } else {
                                                    f14 = -1.0f;
                                                }
                                                if (r14.f163579y) {
                                                    if (r14.E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    i.b bVar1115 = new i.b();
                                                    bVar1115.f8322a = r14.f163580z;
                                                    bVar1115.f8323b = r14.B;
                                                    bVar1115.f8324c = r14.A;
                                                    bVar1115.f8325d = bArr;
                                                    int i51111113 = r14.f163569o;
                                                    bVar1115.f8326e = i51111113;
                                                    bVar1115.f8327f = i51111113;
                                                    iVarA = bVar1115.a();
                                                } else {
                                                    iVarA = null;
                                                }
                                                str4 = r14.f163555a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r14.f163573s == 0) {
                                                    if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r14.f163576v, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                bVar.f8418t = r14.f163567m;
                                                bVar.f8419u = r14.f163568n;
                                                bVar.f8422x = f14;
                                                bVar.f8421w = iIntValue;
                                                bVar.f8423y = r14.f163577w;
                                                bVar.f8424z = r14.f163578x;
                                                bVar.A = iVarA;
                                                i18 = 2;
                                            } else {
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str7)) {
                                                }
                                                i18 = 3;
                                            }
                                            str5 = r14.f163555a;
                                            if (str5 != null) {
                                                bVar.f8400b = r14.f163555a;
                                            }
                                            bVar.f8399a = Integer.toString(i57);
                                            bVar.f8411m = x.n(str7);
                                            bVar.f8412n = i16;
                                            bVar.f8402d = r14.X;
                                            bVar.f8403e = i51111112;
                                            bVar.f8414p = list5;
                                            bVar.f8408j = str2;
                                            bVar.f8415q = r14.f163566l;
                                            q qVarA118 = bVar.a();
                                            l0 l0VarTrack118 = pVar.track(r14.f163557c, i18);
                                            r14.Y = l0VarTrack118;
                                            l0VarTrack118.d(qVarA118);
                                            sparseArray.put(r14.f163557c, (C3079c) r14);
                                            cVar4 = cVar2;
                                            break;
                                        case 28:
                                            cVar2 = cVar9;
                                            str7 = MimeTypes.APPLICATION_SUBRIP;
                                            iX = -1;
                                            i16 = -1;
                                            list = null;
                                            str2 = null;
                                            list5 = list;
                                            if (r14.O != null) {
                                                str2 = lVarA.f17214a;
                                                str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                            }
                                            ?? r11113 = r14.W;
                                            if (r14.V) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i51111114 = r11113 | i17;
                                            bVar = new q.b();
                                            zJ = x.j(str7);
                                            Map<String, Integer> map119 = f163523j0;
                                            if (zJ) {
                                                bVar.B = r14.P;
                                                bVar.C = r14.R;
                                                bVar.D = iX;
                                                i18 = 1;
                                            } else if (x.m(str7)) {
                                                if (r14.f163572r == 0) {
                                                    i26 = r14.f163570p;
                                                    i19 = -1;
                                                    if (i26 == -1) {
                                                        i26 = r14.f163567m;
                                                    }
                                                    r14.f163570p = i26;
                                                    i27 = r14.f163571q;
                                                    if (i27 == -1) {
                                                        i27 = r14.f163568n;
                                                    }
                                                    r14.f163571q = i27;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r14.f163570p;
                                                if (i24 != i19) {
                                                    f14 = -1.0f;
                                                } else {
                                                    f14 = -1.0f;
                                                }
                                                if (r14.f163579y) {
                                                    if (r14.E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    i.b bVar1116 = new i.b();
                                                    bVar1116.f8322a = r14.f163580z;
                                                    bVar1116.f8323b = r14.B;
                                                    bVar1116.f8324c = r14.A;
                                                    bVar1116.f8325d = bArr;
                                                    int i51111115 = r14.f163569o;
                                                    bVar1116.f8326e = i51111115;
                                                    bVar1116.f8327f = i51111115;
                                                    iVarA = bVar1116.a();
                                                } else {
                                                    iVarA = null;
                                                }
                                                str4 = r14.f163555a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r14.f163573s == 0) {
                                                    if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r14.f163576v, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                bVar.f8418t = r14.f163567m;
                                                bVar.f8419u = r14.f163568n;
                                                bVar.f8422x = f14;
                                                bVar.f8421w = iIntValue;
                                                bVar.f8423y = r14.f163577w;
                                                bVar.f8424z = r14.f163578x;
                                                bVar.A = iVarA;
                                                i18 = 2;
                                            } else {
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str7)) {
                                                }
                                                i18 = 3;
                                            }
                                            str5 = r14.f163555a;
                                            if (str5 != null) {
                                                bVar.f8400b = r14.f163555a;
                                            }
                                            bVar.f8399a = Integer.toString(i57);
                                            bVar.f8411m = x.n(str7);
                                            bVar.f8412n = i16;
                                            bVar.f8402d = r14.X;
                                            bVar.f8403e = i51111114;
                                            bVar.f8414p = list5;
                                            bVar.f8408j = str2;
                                            bVar.f8415q = r14.f163566l;
                                            q qVarA119 = bVar.a();
                                            l0 l0VarTrack119 = pVar.track(r14.f163557c, i18);
                                            r14.Y = l0VarTrack119;
                                            l0VarTrack119.d(qVarA119);
                                            sparseArray.put(r14.f163557c, (C3079c) r14);
                                            cVar4 = cVar2;
                                            break;
                                        case 29:
                                            str7 = MimeTypes.VIDEO_MPEG2;
                                            cVar2 = cVar9;
                                            iX = -1;
                                            i16 = -1;
                                            list = null;
                                            str2 = null;
                                            list5 = list;
                                            if (r14.O != null) {
                                                str2 = lVarA.f17214a;
                                                str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                            }
                                            ?? r11114 = r14.W;
                                            if (r14.V) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i51111116 = r11114 | i17;
                                            bVar = new q.b();
                                            zJ = x.j(str7);
                                            Map<String, Integer> map1110 = f163523j0;
                                            if (zJ) {
                                                bVar.B = r14.P;
                                                bVar.C = r14.R;
                                                bVar.D = iX;
                                                i18 = 1;
                                            } else if (x.m(str7)) {
                                                if (r14.f163572r == 0) {
                                                    i26 = r14.f163570p;
                                                    i19 = -1;
                                                    if (i26 == -1) {
                                                        i26 = r14.f163567m;
                                                    }
                                                    r14.f163570p = i26;
                                                    i27 = r14.f163571q;
                                                    if (i27 == -1) {
                                                        i27 = r14.f163568n;
                                                    }
                                                    r14.f163571q = i27;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r14.f163570p;
                                                if (i24 != i19) {
                                                    f14 = -1.0f;
                                                } else {
                                                    f14 = -1.0f;
                                                }
                                                if (r14.f163579y) {
                                                    if (r14.E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    i.b bVar1117 = new i.b();
                                                    bVar1117.f8322a = r14.f163580z;
                                                    bVar1117.f8323b = r14.B;
                                                    bVar1117.f8324c = r14.A;
                                                    bVar1117.f8325d = bArr;
                                                    int i51111117 = r14.f163569o;
                                                    bVar1117.f8326e = i51111117;
                                                    bVar1117.f8327f = i51111117;
                                                    iVarA = bVar1117.a();
                                                } else {
                                                    iVarA = null;
                                                }
                                                str4 = r14.f163555a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r14.f163573s == 0) {
                                                    if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r14.f163576v, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                bVar.f8418t = r14.f163567m;
                                                bVar.f8419u = r14.f163568n;
                                                bVar.f8422x = f14;
                                                bVar.f8421w = iIntValue;
                                                bVar.f8423y = r14.f163577w;
                                                bVar.f8424z = r14.f163578x;
                                                bVar.A = iVarA;
                                                i18 = 2;
                                            } else {
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str7)) {
                                                }
                                                i18 = 3;
                                            }
                                            str5 = r14.f163555a;
                                            if (str5 != null) {
                                                bVar.f8400b = r14.f163555a;
                                            }
                                            bVar.f8399a = Integer.toString(i57);
                                            bVar.f8411m = x.n(str7);
                                            bVar.f8412n = i16;
                                            bVar.f8402d = r14.X;
                                            bVar.f8403e = i51111116;
                                            bVar.f8414p = list5;
                                            bVar.f8408j = str2;
                                            bVar.f8415q = r14.f163566l;
                                            q qVarA1110 = bVar.a();
                                            l0 l0VarTrack1110 = pVar.track(r14.f163557c, i18);
                                            r14.Y = l0VarTrack1110;
                                            l0VarTrack1110.d(qVarA1110);
                                            sparseArray.put(r14.f163557c, (C3079c) r14);
                                            cVar4 = cVar2;
                                            break;
                                        case 30:
                                            str7 = MimeTypes.AUDIO_E_AC3;
                                            cVar2 = cVar9;
                                            iX = -1;
                                            i16 = -1;
                                            list = null;
                                            str2 = null;
                                            list5 = list;
                                            if (r14.O != null) {
                                                str2 = lVarA.f17214a;
                                                str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                            }
                                            ?? r11115 = r14.W;
                                            if (r14.V) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i51111118 = r11115 | i17;
                                            bVar = new q.b();
                                            zJ = x.j(str7);
                                            Map<String, Integer> map1111 = f163523j0;
                                            if (zJ) {
                                                bVar.B = r14.P;
                                                bVar.C = r14.R;
                                                bVar.D = iX;
                                                i18 = 1;
                                            } else if (x.m(str7)) {
                                                if (r14.f163572r == 0) {
                                                    i26 = r14.f163570p;
                                                    i19 = -1;
                                                    if (i26 == -1) {
                                                        i26 = r14.f163567m;
                                                    }
                                                    r14.f163570p = i26;
                                                    i27 = r14.f163571q;
                                                    if (i27 == -1) {
                                                        i27 = r14.f163568n;
                                                    }
                                                    r14.f163571q = i27;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r14.f163570p;
                                                if (i24 != i19) {
                                                    f14 = -1.0f;
                                                } else {
                                                    f14 = -1.0f;
                                                }
                                                if (r14.f163579y) {
                                                    if (r14.E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    i.b bVar1118 = new i.b();
                                                    bVar1118.f8322a = r14.f163580z;
                                                    bVar1118.f8323b = r14.B;
                                                    bVar1118.f8324c = r14.A;
                                                    bVar1118.f8325d = bArr;
                                                    int i51111119 = r14.f163569o;
                                                    bVar1118.f8326e = i51111119;
                                                    bVar1118.f8327f = i51111119;
                                                    iVarA = bVar1118.a();
                                                } else {
                                                    iVarA = null;
                                                }
                                                str4 = r14.f163555a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r14.f163573s == 0) {
                                                    if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r14.f163576v, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                bVar.f8418t = r14.f163567m;
                                                bVar.f8419u = r14.f163568n;
                                                bVar.f8422x = f14;
                                                bVar.f8421w = iIntValue;
                                                bVar.f8423y = r14.f163577w;
                                                bVar.f8424z = r14.f163578x;
                                                bVar.A = iVarA;
                                                i18 = 2;
                                            } else {
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str7)) {
                                                }
                                                i18 = 3;
                                            }
                                            str5 = r14.f163555a;
                                            if (str5 != null) {
                                                bVar.f8400b = r14.f163555a;
                                            }
                                            bVar.f8399a = Integer.toString(i57);
                                            bVar.f8411m = x.n(str7);
                                            bVar.f8412n = i16;
                                            bVar.f8402d = r14.X;
                                            bVar.f8403e = i51111118;
                                            bVar.f8414p = list5;
                                            bVar.f8408j = str2;
                                            bVar.f8415q = r14.f163566l;
                                            q qVarA1111 = bVar.a();
                                            l0 l0VarTrack1111 = pVar.track(r14.f163557c, i18);
                                            r14.Y = l0VarTrack1111;
                                            l0VarTrack1111.d(qVarA1111);
                                            sparseArray.put(r14.f163557c, (C3079c) r14);
                                            cVar4 = cVar2;
                                            break;
                                        case 31:
                                            List<byte[]> listSingletonList3 = Collections.singletonList(r14.a(str6));
                                            str7 = MimeTypes.AUDIO_FLAC;
                                            listOf = listSingletonList3;
                                            cVar2 = cVar9;
                                            iX = -1;
                                            i16 = -1;
                                            list = listOf;
                                            str2 = null;
                                            list5 = list;
                                            if (r14.O != null) {
                                                str2 = lVarA.f17214a;
                                                str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                            }
                                            ?? r11116 = r14.W;
                                            if (r14.V) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i511111110 = r11116 | i17;
                                            bVar = new q.b();
                                            zJ = x.j(str7);
                                            Map<String, Integer> map1112 = f163523j0;
                                            if (zJ) {
                                                bVar.B = r14.P;
                                                bVar.C = r14.R;
                                                bVar.D = iX;
                                                i18 = 1;
                                            } else if (x.m(str7)) {
                                                if (r14.f163572r == 0) {
                                                    i26 = r14.f163570p;
                                                    i19 = -1;
                                                    if (i26 == -1) {
                                                        i26 = r14.f163567m;
                                                    }
                                                    r14.f163570p = i26;
                                                    i27 = r14.f163571q;
                                                    if (i27 == -1) {
                                                        i27 = r14.f163568n;
                                                    }
                                                    r14.f163571q = i27;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r14.f163570p;
                                                if (i24 != i19) {
                                                    f14 = -1.0f;
                                                } else {
                                                    f14 = -1.0f;
                                                }
                                                if (r14.f163579y) {
                                                    if (r14.E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    i.b bVar1119 = new i.b();
                                                    bVar1119.f8322a = r14.f163580z;
                                                    bVar1119.f8323b = r14.B;
                                                    bVar1119.f8324c = r14.A;
                                                    bVar1119.f8325d = bArr;
                                                    int i511111111 = r14.f163569o;
                                                    bVar1119.f8326e = i511111111;
                                                    bVar1119.f8327f = i511111111;
                                                    iVarA = bVar1119.a();
                                                } else {
                                                    iVarA = null;
                                                }
                                                str4 = r14.f163555a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r14.f163573s == 0) {
                                                    if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r14.f163576v, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                bVar.f8418t = r14.f163567m;
                                                bVar.f8419u = r14.f163568n;
                                                bVar.f8422x = f14;
                                                bVar.f8421w = iIntValue;
                                                bVar.f8423y = r14.f163577w;
                                                bVar.f8424z = r14.f163578x;
                                                bVar.A = iVarA;
                                                i18 = 2;
                                            } else {
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str7)) {
                                                }
                                                i18 = 3;
                                            }
                                            str5 = r14.f163555a;
                                            if (str5 != null) {
                                                bVar.f8400b = r14.f163555a;
                                            }
                                            bVar.f8399a = Integer.toString(i57);
                                            bVar.f8411m = x.n(str7);
                                            bVar.f8412n = i16;
                                            bVar.f8402d = r14.X;
                                            bVar.f8403e = i511111110;
                                            bVar.f8414p = list5;
                                            bVar.f8408j = str2;
                                            bVar.f8415q = r14.f163566l;
                                            q qVarA1112 = bVar.a();
                                            l0 l0VarTrack1112 = pVar.track(r14.f163557c, i18);
                                            r14.Y = l0VarTrack1112;
                                            l0VarTrack1112.d(qVarA1112);
                                            sparseArray.put(r14.f163557c, (C3079c) r14);
                                            cVar4 = cVar2;
                                            break;
                                        case 32:
                                            ArrayList arrayList2 = new ArrayList(3);
                                            arrayList2.add(r14.a(r14.f163556b));
                                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                            arrayList2.add(byteBufferAllocate.order(byteOrder).putLong(r14.S).array());
                                            arrayList2.add(ByteBuffer.allocate(8).order(byteOrder).putLong(r14.T).array());
                                            str7 = MimeTypes.AUDIO_OPUS;
                                            cVar2 = cVar9;
                                            str2 = null;
                                            i16 = 5760;
                                            list3 = arrayList2;
                                            iX = -1;
                                            list5 = list3;
                                            if (r14.O != null) {
                                                str2 = lVarA.f17214a;
                                                str7 = MimeTypes.VIDEO_DOLBY_VISION;
                                            }
                                            ?? r11117 = r14.W;
                                            if (r14.V) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i511111112 = r11117 | i17;
                                            bVar = new q.b();
                                            zJ = x.j(str7);
                                            Map<String, Integer> map1113 = f163523j0;
                                            if (zJ) {
                                                bVar.B = r14.P;
                                                bVar.C = r14.R;
                                                bVar.D = iX;
                                                i18 = 1;
                                            } else if (x.m(str7)) {
                                                if (r14.f163572r == 0) {
                                                    i26 = r14.f163570p;
                                                    i19 = -1;
                                                    if (i26 == -1) {
                                                        i26 = r14.f163567m;
                                                    }
                                                    r14.f163570p = i26;
                                                    i27 = r14.f163571q;
                                                    if (i27 == -1) {
                                                        i27 = r14.f163568n;
                                                    }
                                                    r14.f163571q = i27;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r14.f163570p;
                                                if (i24 != i19) {
                                                    f14 = -1.0f;
                                                } else {
                                                    f14 = -1.0f;
                                                }
                                                if (r14.f163579y) {
                                                    if (r14.E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    i.b bVar11110 = new i.b();
                                                    bVar11110.f8322a = r14.f163580z;
                                                    bVar11110.f8323b = r14.B;
                                                    bVar11110.f8324c = r14.A;
                                                    bVar11110.f8325d = bArr;
                                                    int i511111113 = r14.f163569o;
                                                    bVar11110.f8326e = i511111113;
                                                    bVar11110.f8327f = i511111113;
                                                    iVarA = bVar11110.a();
                                                } else {
                                                    iVarA = null;
                                                }
                                                str4 = r14.f163555a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r14.f163573s == 0) {
                                                    if (Float.compare(r14.f163576v, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r14.f163576v, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r14.f163576v, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                bVar.f8418t = r14.f163567m;
                                                bVar.f8419u = r14.f163568n;
                                                bVar.f8422x = f14;
                                                bVar.f8421w = iIntValue;
                                                bVar.f8423y = r14.f163577w;
                                                bVar.f8424z = r14.f163578x;
                                                bVar.A = iVarA;
                                                i18 = 2;
                                            } else {
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str7)) {
                                                }
                                                i18 = 3;
                                            }
                                            str5 = r14.f163555a;
                                            if (str5 != null) {
                                                bVar.f8400b = r14.f163555a;
                                            }
                                            bVar.f8399a = Integer.toString(i57);
                                            bVar.f8411m = x.n(str7);
                                            bVar.f8412n = i16;
                                            bVar.f8402d = r14.X;
                                            bVar.f8403e = i511111112;
                                            bVar.f8414p = list5;
                                            bVar.f8408j = str2;
                                            bVar.f8415q = r14.f163566l;
                                            q qVarA1113 = bVar.a();
                                            l0 l0VarTrack1113 = pVar.track(r14.f163557c, i18);
                                            r14.Y = l0VarTrack1113;
                                            l0VarTrack1113.d(qVarA1113);
                                            sparseArray.put(r14.f163557c, (C3079c) r14);
                                            cVar4 = cVar2;
                                            break;
                                        default:
                                            throw ParserException.createForMalformedContainer("Unrecognized codec identifier.", null);
                                    }
                                    break;
                                default:
                                    cVar4 = cVar9;
                                    break;
                            }
                            cVar4.f163550w = null;
                        } else {
                            if (i46 == 19899) {
                                int i85 = cVar9.f163552y;
                                if (i85 != i29) {
                                    long j24 = cVar9.f163553z;
                                    if (j24 != -1) {
                                        if (i85 == 475249515) {
                                            cVar9.B = j24;
                                        }
                                    }
                                }
                                throw ParserException.createForMalformedContainer("Mandatory element SeekID or SeekPosition not found", null);
                            }
                            if (i46 == 25152) {
                                cVar9.g(i46);
                                C3079c c3079c2 = cVar9.f163550w;
                                if (c3079c2.f163562h) {
                                    if (c3079c2.f163564j == null) {
                                        throw ParserException.createForMalformedContainer("Encrypted Track found but ContentEncKeyID was not found", null);
                                    }
                                    c3079c2.f163566l = new androidx.media3.common.l(new androidx.media3.common.l.b(h.f8296a, MimeTypes.VIDEO_WEBM, cVar9.f163550w.f163564j.f17216b));
                                }
                            } else if (i46 == 28032) {
                                cVar9.g(i46);
                                C3079c c3079c3 = cVar9.f163550w;
                                if (c3079c3.f163562h && c3079c3.f163563i != null) {
                                    throw ParserException.createForMalformedContainer("Combining encryption and compression is not supported", null);
                                }
                            } else if (i46 == 357149030) {
                                if (cVar9.f163547t == C.TIME_UNSET) {
                                    cVar9.f163547t = 1000000L;
                                }
                                long j25 = cVar9.f163548u;
                                if (j25 != C.TIME_UNSET) {
                                    cVar9.f163549v = cVar9.l(j25);
                                }
                            } else if (i46 == 374648427) {
                                if (sparseArray.size() == 0) {
                                    throw ParserException.createForMalformedContainer("No valid tracks were found", null);
                                }
                                cVar9.f163531d0.endTracks();
                            } else if (i46 == 475249515) {
                                if (!cVar9.f163551x) {
                                    p pVar2 = cVar9.f163531d0;
                                    l lVar = cVar9.E;
                                    l lVar2 = cVar9.F;
                                    if (cVar9.f163546s == -1 || cVar9.f163549v == C.TIME_UNSET || lVar == null || (i28 = lVar.f70034a) == 0 || lVar2 == null || lVar2.f70034a != i28) {
                                        bVar2 = new g0.b(cVar9.f163549v);
                                    } else {
                                        int[] iArrCopyOf = new int[i28];
                                        long[] jArrCopyOf = new long[i28];
                                        long[] jArrCopyOf2 = new long[i28];
                                        long[] jArrCopyOf3 = new long[i28];
                                        for (int i86 = 0; i86 < i28; i86++) {
                                            jArrCopyOf3[i86] = lVar.c(i86);
                                            jArrCopyOf[i86] = lVar2.c(i86) + cVar9.f163546s;
                                        }
                                        int i87 = 0;
                                        while (true) {
                                            int i88 = i28 - 1;
                                            if (i87 < i88) {
                                                int i89 = i87 + 1;
                                                iArrCopyOf[i87] = (int) (jArrCopyOf[i89] - jArrCopyOf[i87]);
                                                jArrCopyOf2[i87] = jArrCopyOf3[i89] - jArrCopyOf3[i87];
                                                i87 = i89;
                                            } else {
                                                int i93 = i88;
                                                while (i93 > 0 && jArrCopyOf3[i93] > cVar9.f163549v) {
                                                    i93--;
                                                }
                                                iArrCopyOf[i93] = (int) ((cVar9.f163546s + cVar9.f163545r) - jArrCopyOf[i93]);
                                                jArrCopyOf2[i93] = cVar9.f163549v - jArrCopyOf3[i93];
                                                if (i93 < i88) {
                                                    k.g("Discarding trailing cue points with timestamps greater than total duration");
                                                    int i94 = i93 + 1;
                                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i94);
                                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i94);
                                                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i94);
                                                    jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i94);
                                                }
                                                bVar2 = new g(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                                            }
                                        }
                                    }
                                    pVar2.a(bVar2);
                                    cVar9.f163551x = true;
                                }
                                cVar9.E = null;
                                cVar9.F = null;
                            }
                        }
                        z16 = false;
                        oVar2 = oVar;
                        z15 = z16;
                    }
                    z17 = true;
                }
                if (z17) {
                    long position2 = oVar2.getPosition();
                    cVar = this;
                    if (cVar.A) {
                        cVar.C = position2;
                        f0Var.f17167a = cVar.B;
                        cVar.A = z15;
                        return 1;
                    }
                    if (cVar.f163551x) {
                        long j26 = cVar.C;
                        if (j26 != -1) {
                            f0Var.f17167a = j26;
                            cVar.C = -1L;
                            return 1;
                        }
                    } else {
                        continue;
                    }
                } else {
                    cVar = this;
                }
                cVar5 = cVar;
            }
        }
        c cVar10 = cVar5;
        if (z17) {
            return 0;
        }
        int i95 = 0;
        while (true) {
            SparseArray<C3079c> sparseArray2 = cVar10.f163528c;
            if (i95 >= sparseArray2.size()) {
                return -1;
            }
            C3079c c3079cValueAt = sparseArray2.valueAt(i95);
            c3079cValueAt.Y.getClass();
            m0 m0Var = c3079cValueAt.U;
            if (m0Var != null) {
                m0Var.a(c3079cValueAt.Y, c3079cValueAt.f163564j);
            }
            i95++;
        }
    }

    @Override // bb.n
    public final void c(p pVar) {
        if (this.f163532e) {
            pVar = new yb.o(pVar, this.f163533f);
        }
        this.f163531d0 = pVar;
    }

    @Override // bb.n
    public final boolean d(o oVar) throws EOFException, InterruptedIOException {
        d dVar = new d();
        bb.i iVar = (bb.i) oVar;
        long j8 = iVar.f17190c;
        long j14 = 1024;
        if (j8 != -1 && j8 <= 1024) {
            j14 = j8;
        }
        int i14 = (int) j14;
        r rVar = dVar.f163581a;
        iVar.peekFully(rVar.f70054a, 0, 4, false);
        dVar.f163582b = 4;
        for (long jW = rVar.w(); jW != 440786851; jW = ((jW << 8) & (-256)) | ((long) (rVar.f70054a[0] & UnsignedBytes.MAX_VALUE))) {
            int i15 = dVar.f163582b + 1;
            dVar.f163582b = i15;
            if (i15 == i14) {
                return false;
            }
            iVar.peekFully(rVar.f70054a, 0, 1, false);
        }
        long jA = dVar.a(iVar);
        long j15 = dVar.f163582b;
        if (jA != Long.MIN_VALUE && (j8 == -1 || j15 + jA < j8)) {
            while (true) {
                long j16 = dVar.f163582b;
                long j17 = j15 + jA;
                if (j16 < j17) {
                    if (dVar.a(iVar) == Long.MIN_VALUE) {
                        break;
                    }
                    long jA2 = dVar.a(iVar);
                    if (jA2 < 0 || jA2 > 2147483647L) {
                        break;
                    }
                    if (jA2 != 0) {
                        int i16 = (int) jA2;
                        iVar.advancePeekPosition(i16, false);
                        dVar.f163582b += i16;
                    }
                } else if (j16 == j17) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(int i14) throws ParserException {
        if (this.E == null || this.F == null) {
            throw ParserException.createForMalformedContainer("Element " + i14 + " must be in a Cues", null);
        }
    }

    public final void g(int i14) throws ParserException {
        if (this.f163550w != null) {
            return;
        }
        throw ParserException.createForMalformedContainer("Element " + i14 + " must be in a TrackEntry", null);
    }

    public final void h(C3079c c3079c, long j8, int i14, int i15, int i16) {
        byte[] bArrI;
        int i17;
        int i18;
        m0 m0Var = c3079c.U;
        if (m0Var != null) {
            m0Var.b(c3079c.Y, j8, i14, i15, i16, c3079c.f163564j);
        } else {
            if ("S_TEXT/UTF8".equals(c3079c.f163556b) || "S_TEXT/ASS".equals(c3079c.f163556b) || "S_TEXT/WEBVTT".equals(c3079c.f163556b)) {
                if (this.M > 1) {
                    k.g("Skipping subtitle sample in laced block.");
                } else {
                    long j14 = this.K;
                    if (j14 == C.TIME_UNSET) {
                        k.g("Skipping subtitle sample with no duration.");
                    } else {
                        String str = c3079c.f163556b;
                        r rVar = this.f163540m;
                        byte[] bArr = rVar.f70054a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                                bArrI = i(j14, "%01d:%02d:%02d:%02d", AbstractComponentTracker.LINGERING_TIMEOUT);
                                i17 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                bArrI = i(j14, "%02d:%02d:%02d.%03d", 1000L);
                                i17 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                bArrI = i(j14, "%02d:%02d:%02d,%03d", 1000L);
                                i17 = 19;
                                break;
                            default:
                                vb.h.w();
                                return;
                        }
                        System.arraycopy(bArrI, 0, bArr, i17, bArrI.length);
                        for (int i19 = rVar.f70055b; i19 < rVar.f70056c; i19++) {
                            if (rVar.f70054a[i19] == 0) {
                                rVar.F(i19);
                                c3079c.Y.f(rVar.f70056c, rVar);
                                i18 = i15 + rVar.f70056c;
                            }
                        }
                        c3079c.Y.f(rVar.f70056c, rVar);
                        i18 = i15 + rVar.f70056c;
                    }
                }
                i18 = i15;
            } else {
                i18 = i15;
            }
            if ((i14 & 268435456) != 0) {
                int i24 = this.M;
                r rVar2 = this.f163543p;
                if (i24 > 1) {
                    rVar2.D(0);
                } else {
                    int i25 = rVar2.f70056c;
                    c3079c.Y.a(rVar2, i25, 2);
                    i18 += i25;
                }
            }
            c3079c.Y.c(j8, i14, i18, i16, c3079c.f163564j);
        }
        this.H = true;
    }

    public final void j(o oVar, int i14) {
        r rVar = this.f163536i;
        if (rVar.f70056c >= i14) {
            return;
        }
        byte[] bArr = rVar.f70054a;
        if (bArr.length < i14) {
            rVar.b(Math.max(bArr.length * 2, i14));
        }
        byte[] bArr2 = rVar.f70054a;
        int i15 = rVar.f70056c;
        oVar.readFully(bArr2, i15, i14 - i15);
        rVar.F(i14);
    }

    public final void k() {
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f163525a0 = 0;
        this.f163527b0 = (byte) 0;
        this.f163529c0 = false;
        this.f163539l.D(0);
    }

    public final long l(long j8) throws ParserException {
        long j14 = this.f163547t;
        if (j14 == C.TIME_UNSET) {
            throw ParserException.createForMalformedContainer("Can't scale timecode prior to timecodeScale being set.", null);
        }
        int i14 = z.f70071a;
        return z.U(j8, j14, 1000L, RoundingMode.DOWN);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x016c  */
    public final int m(o oVar, C3079c c3079c, int i14, boolean z14) throws ParserException {
        int iB;
        int iB2;
        int i15;
        boolean z15;
        int i16;
        if ("S_TEXT/UTF8".equals(c3079c.f163556b)) {
            n(oVar, f163518e0, i14);
            int i17 = this.V;
            k();
            return i17;
        }
        if ("S_TEXT/ASS".equals(c3079c.f163556b)) {
            n(oVar, f163520g0, i14);
            int i18 = this.V;
            k();
            return i18;
        }
        if ("S_TEXT/WEBVTT".equals(c3079c.f163556b)) {
            n(oVar, f163521h0, i14);
            int i19 = this.V;
            k();
            return i19;
        }
        l0 l0Var = c3079c.Y;
        boolean z16 = this.X;
        r rVar = this.f163539l;
        int i24 = 2;
        if (!z16) {
            boolean z17 = c3079c.f163562h;
            r rVar2 = this.f163536i;
            if (z17) {
                this.Q &= -1073741825;
                if (!this.Y) {
                    oVar.readFully(rVar2.f70054a, 0, 1);
                    this.U++;
                    byte b14 = rVar2.f70054a[0];
                    if ((b14 & UnsignedBytes.MAX_POWER_OF_TWO) == 128) {
                        throw ParserException.createForMalformedContainer("Extension bit is set in signal byte", null);
                    }
                    this.f163527b0 = b14;
                    this.Y = true;
                }
                byte b15 = this.f163527b0;
                if ((b15 & 1) != 1) {
                    i15 = 2;
                } else {
                    boolean z18 = (b15 & 2) == 2;
                    this.Q |= 1073741824;
                    if (!this.f163529c0) {
                        r rVar3 = this.f163541n;
                        oVar.readFully(rVar3.f70054a, 0, 8);
                        this.U += 8;
                        this.f163529c0 = true;
                        rVar2.f70054a[0] = (byte) ((z18 ? 128 : 0) | 8);
                        rVar2.G(0);
                        l0Var.a(rVar2, 1, 1);
                        this.V++;
                        rVar3.G(0);
                        l0Var.a(rVar3, 8, 1);
                        this.V += 8;
                    }
                    if (z18) {
                        if (!this.Z) {
                            oVar.readFully(rVar2.f70054a, 0, 1);
                            this.U++;
                            rVar2.G(0);
                            this.f163525a0 = rVar2.u();
                            this.Z = true;
                        }
                        int i25 = this.f163525a0 * 4;
                        rVar2.D(i25);
                        oVar.readFully(rVar2.f70054a, 0, i25);
                        this.U += i25;
                        short s8 = (short) ((this.f163525a0 / 2) + 1);
                        int i26 = (s8 * 6) + 2;
                        ByteBuffer byteBuffer = this.f163544q;
                        if (byteBuffer == null || byteBuffer.capacity() < i26) {
                            this.f163544q = ByteBuffer.allocate(i26);
                        }
                        this.f163544q.position(0);
                        this.f163544q.putShort(s8);
                        int i27 = 0;
                        int i28 = 0;
                        while (true) {
                            i16 = this.f163525a0;
                            if (i27 >= i16) {
                                break;
                            }
                            int iY = rVar2.y();
                            int i29 = i27 % 2;
                            int i30 = i24;
                            ByteBuffer byteBuffer2 = this.f163544q;
                            if (i29 == 0) {
                                byteBuffer2.putShort((short) (iY - i28));
                            } else {
                                byteBuffer2.putInt(iY - i28);
                            }
                            i27++;
                            i28 = iY;
                            i24 = i30;
                        }
                        i15 = i24;
                        int i34 = (i14 - this.U) - i28;
                        int i35 = i16 % 2;
                        ByteBuffer byteBuffer3 = this.f163544q;
                        if (i35 == 1) {
                            byteBuffer3.putInt(i34);
                        } else {
                            byteBuffer3.putShort((short) i34);
                            this.f163544q.putInt(0);
                        }
                        byte[] bArrArray = this.f163544q.array();
                        r rVar4 = this.f163542o;
                        rVar4.E(bArrArray, i26);
                        l0Var.a(rVar4, i26, 1);
                        this.V += i26;
                    } else {
                        i15 = 2;
                    }
                }
            } else {
                i15 = 2;
                byte[] bArr = c3079c.f163563i;
                if (bArr != null) {
                    rVar.E(bArr, bArr.length);
                }
            }
            if ("A_OPUS".equals(c3079c.f163556b)) {
                z15 = z14;
            } else {
                z15 = c3079c.f163560f > 0;
            }
            if (z15) {
                this.Q |= 268435456;
                this.f163543p.D(0);
                int i36 = (rVar.f70056c + i14) - this.U;
                rVar2.D(4);
                byte[] bArr2 = rVar2.f70054a;
                bArr2[0] = (byte) ((i36 >> 24) & 255);
                bArr2[1] = (byte) ((i36 >> 16) & 255);
                bArr2[i15] = (byte) ((i36 >> 8) & 255);
                bArr2[3] = (byte) (i36 & 255);
                l0Var.a(rVar2, 4, i15);
                this.V += 4;
            }
            this.X = true;
        }
        int i37 = i14 + rVar.f70056c;
        if (!"V_MPEG4/ISO/AVC".equals(c3079c.f163556b) && !"V_MPEGH/ISO/HEVC".equals(c3079c.f163556b)) {
            if (c3079c.U != null) {
                fa.a.d(rVar.f70056c == 0);
                c3079c.U.c(oVar);
            }
            while (true) {
                int i38 = this.U;
                if (i38 >= i37) {
                    break;
                }
                int i39 = i37 - i38;
                int iA = rVar.a();
                if (iA > 0) {
                    iB2 = Math.min(i39, iA);
                    l0Var.f(iB2, rVar);
                } else {
                    iB2 = l0Var.b(oVar, i39, false);
                }
                this.U += iB2;
                this.V += iB2;
            }
        } else {
            r rVar5 = this.f163535h;
            byte[] bArr3 = rVar5.f70054a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i44 = c3079c.Z;
            int i45 = 4 - i44;
            while (this.U < i37) {
                int i46 = this.W;
                if (i46 == 0) {
                    int iMin = Math.min(i44, rVar.a());
                    oVar.readFully(bArr3, i45 + iMin, i44 - iMin);
                    if (iMin > 0) {
                        rVar.e(bArr3, i45, iMin);
                    }
                    this.U += i44;
                    rVar5.G(0);
                    this.W = rVar5.y();
                    r rVar6 = this.f163534g;
                    rVar6.G(0);
                    l0Var.f(4, rVar6);
                    this.V += 4;
                } else {
                    int iA2 = rVar.a();
                    if (iA2 > 0) {
                        iB = Math.min(i46, iA2);
                        l0Var.f(iB, rVar);
                    } else {
                        iB = l0Var.b(oVar, i46, false);
                    }
                    this.U += iB;
                    this.V += iB;
                    this.W -= iB;
                }
            }
        }
        if ("A_VORBIS".equals(c3079c.f163556b)) {
            r rVar7 = this.f163537j;
            rVar7.G(0);
            l0Var.f(4, rVar7);
            this.V += 4;
        }
        int i47 = this.V;
        k();
        return i47;
    }

    public final void n(o oVar, byte[] bArr, int i14) {
        int length = bArr.length + i14;
        r rVar = this.f163540m;
        byte[] bArr2 = rVar.f70054a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i14);
            rVar.getClass();
            rVar.E(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        oVar.readFully(rVar.f70054a, bArr.length, i14);
        rVar.G(0);
        rVar.F(length);
    }

    @Override // bb.n
    public final void release() {
    }

    @Override // bb.n
    public final void seek(long j8, long j14) {
        this.D = C.TIME_UNSET;
        this.I = 0;
        tb.a aVar = (tb.a) this.f163524a;
        aVar.f163513e = 0;
        aVar.f163510b.clear();
        e eVar = aVar.f163511c;
        eVar.f163585b = 0;
        eVar.f163586c = 0;
        e eVar2 = this.f163526b;
        eVar2.f163585b = 0;
        eVar2.f163586c = 0;
        k();
        int i14 = 0;
        while (true) {
            SparseArray<C3079c> sparseArray = this.f163528c;
            if (i14 >= sparseArray.size()) {
                return;
            }
            m0 m0Var = sparseArray.valueAt(i14).U;
            if (m0Var != null) {
                m0Var.f17234b = false;
                m0Var.f17235c = 0;
            }
            i14++;
        }
    }

    @Deprecated
    public c(int i14) {
        this(new tb.a(), i14 | 2, yb.n.a.f195662a);
    }

    public c(yb.n.a aVar) {
        this(new tb.a(), 0, aVar);
    }

    public c(yb.n.a aVar, int i14) {
        this(new tb.a(), i14, aVar);
    }

    @Deprecated
    public c() {
        this(new tb.a(), 2, yb.n.a.f195662a);
    }
}
