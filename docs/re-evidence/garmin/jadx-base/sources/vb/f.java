package vb;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import androidx.media3.common.x;
import bb.f0;
import bb.g0;
import bb.k0;
import bb.l0;
import bb.y;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.UnsignedBytes;
import fa.w;
import fa.z;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class f implements bb.n {
    public static final byte[] M = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final androidx.media3.common.q N;
    public long A;
    public long B;
    public b C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public bb.p I;
    public l0[] J;
    public l0[] K;
    public boolean L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yb.n.a f176704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f176705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f176706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<androidx.media3.common.q> f176707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray<b> f176708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fa.r f176709f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fa.r f176710g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fa.r f176711h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f176712i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fa.r f176713j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w f176714k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final mb.c f176715l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fa.r f176716m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayDeque<ga.b.C1537b> f176717n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayDeque<a> f176718o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ga.g f176719p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l0 f176720q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ImmutableList<k0> f176721r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f176722s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f176723t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f176724u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f176725v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public fa.r f176726w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f176727x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f176728y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f176729z;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f176730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f176731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f176732c;

        public a(long j8, boolean z14, int i14) {
            this.f176730a = j8;
            this.f176731b = z14;
            this.f176732c = i14;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l0 f176733a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public r f176736d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f176737e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f176738f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f176739g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f176740h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f176741i;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f176744l;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q f176734b = new q();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final fa.r f176735c = new fa.r();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final fa.r f176742j = new fa.r(1);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final fa.r f176743k = new fa.r();

        public b(l0 l0Var, r rVar, c cVar) {
            this.f176733a = l0Var;
            this.f176736d = rVar;
            this.f176737e = cVar;
            this.f176736d = rVar;
            this.f176737e = cVar;
            l0Var.d(rVar.f176825a.f176797g);
            e();
        }

        public final int a() {
            int i14;
            if (this.f176744l) {
                i14 = this.f176734b.f176817j[this.f176738f] ? 1 : 0;
            } else {
                i14 = this.f176736d.f176831g[this.f176738f];
            }
            return b() != null ? i14 | 1073741824 : i14;
        }

        public final p b() {
            if (this.f176744l) {
                q qVar = this.f176734b;
                c cVar = qVar.f176808a;
                int i14 = z.f70071a;
                int i15 = cVar.f176694a;
                p pVar = qVar.f176820m;
                if (pVar == null) {
                    p[] pVarArr = this.f176736d.f176825a.f176802l;
                    pVar = pVarArr == null ? null : pVarArr[i15];
                }
                if (pVar != null && pVar.f176803a) {
                    return pVar;
                }
            }
            return null;
        }

        public final boolean c() {
            this.f176738f++;
            if (!this.f176744l) {
                return false;
            }
            int i14 = this.f176739g + 1;
            this.f176739g = i14;
            int[] iArr = this.f176734b.f176814g;
            int i15 = this.f176740h;
            if (i14 != iArr[i15]) {
                return true;
            }
            this.f176740h = i15 + 1;
            this.f176739g = 0;
            return false;
        }

        public final int d(int i14, int i15) {
            fa.r rVar;
            p pVarB = b();
            if (pVarB == null) {
                return 0;
            }
            int length = pVarB.f176806d;
            q qVar = this.f176734b;
            if (length != 0) {
                rVar = qVar.f176821n;
            } else {
                byte[] bArr = pVarB.f176807e;
                int i16 = z.f70071a;
                int length2 = bArr.length;
                fa.r rVar2 = this.f176743k;
                rVar2.E(bArr, length2);
                length = bArr.length;
                rVar = rVar2;
            }
            boolean z14 = qVar.f176818k && qVar.f176819l[this.f176738f];
            boolean z15 = z14 || i15 != 0;
            fa.r rVar3 = this.f176742j;
            rVar3.f70054a[0] = (byte) ((z15 ? 128 : 0) | length);
            rVar3.G(0);
            l0 l0Var = this.f176733a;
            l0Var.a(rVar3, 1, 1);
            l0Var.a(rVar, length, 1);
            if (!z15) {
                return length + 1;
            }
            fa.r rVar4 = this.f176735c;
            if (!z14) {
                rVar4.D(8);
                byte[] bArr2 = rVar4.f70054a;
                bArr2[0] = 0;
                bArr2[1] = 1;
                bArr2[2] = (byte) 0;
                bArr2[3] = (byte) (i15 & 255);
                bArr2[4] = (byte) ((i14 >> 24) & 255);
                bArr2[5] = (byte) ((i14 >> 16) & 255);
                bArr2[6] = (byte) ((i14 >> 8) & 255);
                bArr2[7] = (byte) (i14 & 255);
                l0Var.a(rVar4, 8, 1);
                return length + 9;
            }
            fa.r rVar5 = qVar.f176821n;
            int iA = rVar5.A();
            rVar5.H(-2);
            int i17 = (iA * 6) + 2;
            if (i15 != 0) {
                rVar4.D(i17);
                byte[] bArr3 = rVar4.f70054a;
                rVar5.e(bArr3, 0, i17);
                int i18 = (((bArr3[2] & UnsignedBytes.MAX_VALUE) << 8) | (bArr3[3] & UnsignedBytes.MAX_VALUE)) + i15;
                bArr3[2] = (byte) ((i18 >> 8) & 255);
                bArr3[3] = (byte) (i18 & 255);
            } else {
                rVar4 = rVar5;
            }
            l0Var.a(rVar4, i17, 1);
            return length + 1 + i17;
        }

        public final void e() {
            q qVar = this.f176734b;
            qVar.f176811d = 0;
            qVar.f176823p = 0L;
            qVar.f176824q = false;
            qVar.f176818k = false;
            qVar.f176822o = false;
            qVar.f176820m = null;
            this.f176738f = 0;
            this.f176740h = 0;
            this.f176739g = 0;
            this.f176741i = 0;
            this.f176744l = false;
        }
    }

    static {
        androidx.media3.common.q.b bVar = new androidx.media3.common.q.b();
        bVar.f8411m = x.n(MimeTypes.APPLICATION_EMSG);
        N = bVar.a();
    }

    public f(yb.n.a aVar, int i14, w wVar, o oVar, List<androidx.media3.common.q> list, l0 l0Var) {
        this.f176704a = aVar;
        this.f176705b = i14;
        this.f176714k = wVar;
        this.f176706c = oVar;
        this.f176707d = Collections.unmodifiableList(list);
        this.f176720q = l0Var;
        this.f176715l = new mb.c();
        this.f176716m = new fa.r(16);
        this.f176709f = new fa.r(ga.e.f76514a);
        this.f176710g = new fa.r(5);
        this.f176711h = new fa.r();
        byte[] bArr = new byte[16];
        this.f176712i = bArr;
        this.f176713j = new fa.r(bArr);
        this.f176717n = new ArrayDeque<>();
        this.f176718o = new ArrayDeque<>();
        this.f176708e = new SparseArray<>();
        this.f176721r = ImmutableList.of();
        this.A = C.TIME_UNSET;
        this.f176729z = C.TIME_UNSET;
        this.B = C.TIME_UNSET;
        this.I = bb.p.M;
        this.J = new l0[0];
        this.K = new l0[0];
        this.f176719p = new ga.g(new tr2.b(this, 22));
    }

    public static androidx.media3.common.l f(List<ga.b.c> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i14 = 0; i14 < size; i14++) {
            ga.b.c cVar = list.get(i14);
            if (cVar.f76504a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = cVar.f76508b.f70054a;
                l.a aVarB = l.b(bArr);
                UUID uuid = aVarB == null ? null : aVarB.f176780a;
                if (uuid == null) {
                    fa.k.g("Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new androidx.media3.common.l.b(uuid, MimeTypes.VIDEO_MP4, bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new androidx.media3.common.l(arrayList);
    }

    public static void g(fa.r rVar, int i14, q qVar) throws ParserException {
        rVar.G(i14 + 8);
        int iG = rVar.g();
        byte[] bArr = vb.b.f176657a;
        if ((iG & 1) != 0) {
            throw ParserException.createForUnsupportedContainerFeature("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z14 = (iG & 2) != 0;
        int iY = rVar.y();
        if (iY == 0) {
            Arrays.fill(qVar.f176819l, 0, qVar.f176812e, false);
            return;
        }
        int i15 = qVar.f176812e;
        fa.r rVar2 = qVar.f176821n;
        if (iY != i15) {
            StringBuilder sbI = b71.i.i(iY, "Senc sample count ", " is different from fragment sample count");
            sbI.append(qVar.f176812e);
            throw ParserException.createForMalformedContainer(sbI.toString(), null);
        }
        Arrays.fill(qVar.f176819l, 0, iY, z14);
        rVar2.D(rVar.a());
        qVar.f176818k = true;
        qVar.f176822o = true;
        rVar.e(rVar2.f70054a, 0, rVar2.f70056c);
        rVar2.G(0);
        qVar.f176822o = false;
    }

    @Override // bb.n
    public final ImmutableList a() {
        return this.f176721r;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0238  */
    @Override // bb.n
    public final int b(bb.o oVar, f0 f0Var) throws ParserException {
        ga.g gVar;
        ArrayDeque<a> arrayDeque;
        w wVar;
        b bVar;
        int i14;
        b bVar2;
        fa.r rVar;
        b bVar3;
        int iB;
        String strP;
        String strP2;
        long jU;
        long jU2;
        long jW;
        long jA;
        long jZ;
        long jZ2;
        while (true) {
            int i15 = this.f176722s;
            ArrayDeque<ga.b.C1537b> arrayDeque2 = this.f176717n;
            gVar = this.f176719p;
            SparseArray<b> sparseArray = this.f176708e;
            if (i15 != 0) {
                arrayDeque = this.f176718o;
                wVar = this.f176714k;
                if (i15 == 1) {
                    int i16 = ((int) this.f176724u) - this.f176725v;
                    fa.r rVar2 = this.f176726w;
                    if (rVar2 != null) {
                        oVar.readFully(rVar2.f70054a, 8, i16);
                        ga.b.c cVar = new ga.b.c(this.f176723t, rVar2);
                        long position = oVar.getPosition();
                        if (arrayDeque2.isEmpty()) {
                            int i17 = cVar.f76504a;
                            fa.r rVar3 = cVar.f76508b;
                            if (i17 == 1936286840) {
                                rVar3.G(8);
                                int iC = vb.b.c(rVar3.g());
                                rVar3.H(4);
                                long jW2 = rVar3.w();
                                if (iC == 0) {
                                    jZ = rVar3.w();
                                    jZ2 = rVar3.w();
                                } else {
                                    jZ = rVar3.z();
                                    jZ2 = rVar3.z();
                                }
                                long j8 = jZ2 + position;
                                long j14 = jZ;
                                long j15 = j8;
                                int i18 = z.f70071a;
                                long jU3 = z.U(j14, 1000000L, jW2, RoundingMode.DOWN);
                                rVar3.H(2);
                                int iA = rVar3.A();
                                int[] iArr = new int[iA];
                                long[] jArr = new long[iA];
                                long[] jArr2 = new long[iA];
                                long j16 = jU3;
                                long[] jArr3 = new long[iA];
                                int i19 = 0;
                                while (i19 < iA) {
                                    int iG = rVar3.g();
                                    if ((iG & Integer.MIN_VALUE) != 0) {
                                        throw ParserException.createForMalformedContainer("Unhandled indirect reference", null);
                                    }
                                    long jW3 = rVar3.w();
                                    iArr[i19] = iG & Integer.MAX_VALUE;
                                    jArr3[i19] = j15;
                                    jArr2[i19] = j16;
                                    j14 += jW3;
                                    int i24 = i19;
                                    long[] jArr4 = jArr;
                                    long[] jArr5 = jArr2;
                                    long jU4 = z.U(j14, 1000000L, jW2, RoundingMode.DOWN);
                                    jArr4[i24] = jU4 - jArr5[i24];
                                    rVar3.H(4);
                                    iA = iA;
                                    jArr3 = jArr3;
                                    j16 = jU4;
                                    i19 = i24 + 1;
                                    jArr = jArr4;
                                    jArr2 = jArr5;
                                    j15 += (long) iArr[i24];
                                    jU3 = jU3;
                                }
                                Pair pairCreate = Pair.create(Long.valueOf(jU3), new bb.g(iArr, jArr3, jArr, jArr2));
                                this.B = ((Long) pairCreate.first).longValue();
                                this.I.a((g0) pairCreate.second);
                                this.L = true;
                            } else if (i17 == 1701671783 && this.J.length != 0) {
                                rVar3.G(8);
                                int iC2 = vb.b.c(rVar3.g());
                                if (iC2 == 0) {
                                    strP = rVar3.p();
                                    strP.getClass();
                                    strP2 = rVar3.p();
                                    strP2.getClass();
                                    long jW4 = rVar3.w();
                                    long jW5 = rVar3.w();
                                    int i25 = z.f70071a;
                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                    jU = z.U(jW5, 1000000L, jW4, roundingMode);
                                    long j17 = this.B;
                                    long j18 = j17 != C.TIME_UNSET ? j17 + jU : -9223372036854775807L;
                                    jU2 = z.U(rVar3.w(), 1000L, jW4, roundingMode);
                                    jW = rVar3.w();
                                    jA = j18;
                                } else if (iC2 != 1) {
                                    fb1.c.r(iC2, "Skipping unsupported emsg version: ");
                                } else {
                                    long jW6 = rVar3.w();
                                    long jZ3 = rVar3.z();
                                    int i26 = z.f70071a;
                                    RoundingMode roundingMode2 = RoundingMode.DOWN;
                                    jA = z.U(jZ3, 1000000L, jW6, roundingMode2);
                                    long jU5 = z.U(rVar3.w(), 1000L, jW6, roundingMode2);
                                    long jW7 = rVar3.w();
                                    strP = rVar3.p();
                                    strP.getClass();
                                    strP2 = rVar3.p();
                                    strP2.getClass();
                                    jU2 = jU5;
                                    jW = jW7;
                                    jU = -9223372036854775807L;
                                }
                                String str = strP;
                                String str2 = strP2;
                                byte[] bArr = new byte[rVar3.a()];
                                rVar3.e(bArr, 0, rVar3.a());
                                mb.a aVar = new mb.a(str, str2, jU2, jW, bArr);
                                mb.c cVar2 = this.f176715l;
                                DataOutputStream dataOutputStream = cVar2.f117709b;
                                ByteArrayOutputStream byteArrayOutputStream = cVar2.f117708a;
                                byteArrayOutputStream.reset();
                                try {
                                    dataOutputStream.writeBytes(aVar.f117702a);
                                    dataOutputStream.writeByte(0);
                                    String str3 = aVar.f117703b;
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    dataOutputStream.writeBytes(str3);
                                    dataOutputStream.writeByte(0);
                                    dataOutputStream.writeLong(aVar.f117704c);
                                    dataOutputStream.writeLong(aVar.f117705d);
                                    dataOutputStream.write(aVar.f117706e);
                                    dataOutputStream.flush();
                                    fa.r rVar4 = new fa.r(byteArrayOutputStream.toByteArray());
                                    int iA2 = rVar4.a();
                                    for (l0 l0Var : this.J) {
                                        rVar4.G(0);
                                        l0Var.f(iA2, rVar4);
                                    }
                                    if (jA == C.TIME_UNSET) {
                                        arrayDeque.addLast(new a(jU, true, iA2));
                                        this.f176728y += iA2;
                                    } else if (!arrayDeque.isEmpty()) {
                                        arrayDeque.addLast(new a(jA, false, iA2));
                                        this.f176728y += iA2;
                                    } else if (wVar == null || wVar.e()) {
                                        if (wVar != null) {
                                            jA = wVar.a(jA);
                                        }
                                        long j19 = jA;
                                        for (l0 l0Var2 : this.J) {
                                            l0Var2.c(j19, 1, iA2, 0, null);
                                        }
                                    } else {
                                        arrayDeque.addLast(new a(jA, false, iA2));
                                        this.f176728y += iA2;
                                    }
                                } catch (IOException e4) {
                                    o2.c.p(e4);
                                    return 0;
                                }
                            }
                        } else {
                            arrayDeque2.peek().f76506c.add(cVar);
                        }
                    } else {
                        oVar.skipFully(i16);
                    }
                    h(oVar.getPosition());
                } else if (i15 != 2) {
                    bVar = this.C;
                    if (bVar != null) {
                        i14 = 8;
                        break;
                    }
                    int size = sparseArray.size();
                    b bVar4 = null;
                    long j24 = Long.MAX_VALUE;
                    for (int i27 = 0; i27 < size; i27++) {
                        b bVarValueAt = sparseArray.valueAt(i27);
                        boolean z14 = bVarValueAt.f176744l;
                        q qVar = bVarValueAt.f176734b;
                        if ((z14 || bVarValueAt.f176738f != bVarValueAt.f176736d.f176826b) && (!z14 || bVarValueAt.f176740h != qVar.f176811d)) {
                            long j25 = !z14 ? bVarValueAt.f176736d.f176827c[bVarValueAt.f176738f] : qVar.f176813f[bVarValueAt.f176740h];
                            if (j25 < j24) {
                                bVar4 = bVarValueAt;
                                j24 = j25;
                            }
                        }
                    }
                    i14 = 8;
                    if (bVar4 != null) {
                        int position2 = (int) ((!bVar4.f176744l ? bVar4.f176736d.f176827c[bVar4.f176738f] : bVar4.f176734b.f176813f[bVar4.f176740h]) - oVar.getPosition());
                        if (position2 < 0) {
                            fa.k.g("Ignoring negative offset to sample data.");
                            position2 = 0;
                        }
                        oVar.skipFully(position2);
                        this.C = bVar4;
                        bVar = bVar4;
                        break;
                    }
                    int position3 = (int) (this.f176727x - oVar.getPosition());
                    if (position3 < 0) {
                        throw ParserException.createForMalformedContainer("Offset to end of mdat was negative.", null);
                    }
                    oVar.skipFully(position3);
                    this.f176722s = 0;
                    this.f176725v = 0;
                } else {
                    int size2 = sparseArray.size();
                    b bVarValueAt2 = null;
                    long j26 = Long.MAX_VALUE;
                    for (int i28 = 0; i28 < size2; i28++) {
                        q qVar2 = sparseArray.valueAt(i28).f176734b;
                        if (qVar2.f176822o) {
                            long j27 = qVar2.f176810c;
                            if (j27 < j26) {
                                bVarValueAt2 = sparseArray.valueAt(i28);
                                j26 = j27;
                            }
                        }
                    }
                    if (bVarValueAt2 == null) {
                        this.f176722s = 3;
                    } else {
                        int position4 = (int) (j26 - oVar.getPosition());
                        if (position4 < 0) {
                            throw ParserException.createForMalformedContainer("Offset to encryption data was negative.", null);
                        }
                        oVar.skipFully(position4);
                        q qVar3 = bVarValueAt2.f176734b;
                        fa.r rVar5 = qVar3.f176821n;
                        oVar.readFully(rVar5.f70054a, 0, rVar5.f70056c);
                        rVar5.G(0);
                        qVar3.f176822o = false;
                    }
                }
            } else {
                int i29 = this.f176725v;
                fa.r rVar6 = this.f176716m;
                if (i29 == 0) {
                    if (!oVar.readFully(rVar6.f70054a, 0, 8, true)) {
                        gVar.b(0);
                        return -1;
                    }
                    this.f176725v = 8;
                    rVar6.G(0);
                    this.f176724u = rVar6.w();
                    this.f176723t = rVar6.g();
                }
                long j28 = this.f176724u;
                if (j28 == 1) {
                    oVar.readFully(rVar6.f70054a, 8, 8);
                    this.f176725v += 8;
                    this.f176724u = rVar6.z();
                } else if (j28 == 0) {
                    long length = oVar.getLength();
                    if (length == -1 && !arrayDeque2.isEmpty()) {
                        length = arrayDeque2.peek().f76505b;
                    }
                    if (length != -1) {
                        this.f176724u = (length - oVar.getPosition()) + ((long) this.f176725v);
                    }
                }
                if (this.f176724u < this.f176725v) {
                    throw ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
                }
                long position5 = oVar.getPosition() - ((long) this.f176725v);
                int i30 = this.f176723t;
                if ((i30 == 1836019558 || i30 == 1835295092) && !this.L) {
                    this.I.a(new g0.b(this.A, position5));
                    this.L = true;
                }
                if (this.f176723t == 1836019558) {
                    int size3 = sparseArray.size();
                    for (int i34 = 0; i34 < size3; i34++) {
                        q qVar4 = sparseArray.valueAt(i34).f176734b;
                        qVar4.getClass();
                        qVar4.f176810c = position5;
                        qVar4.f176809b = position5;
                    }
                }
                int i35 = this.f176723t;
                if (i35 == 1835295092) {
                    this.C = null;
                    this.f176727x = position5 + this.f176724u;
                    this.f176722s = 2;
                } else if (i35 == 1836019574 || i35 == 1953653099 || i35 == 1835297121 || i35 == 1835626086 || i35 == 1937007212 || i35 == 1836019558 || i35 == 1953653094 || i35 == 1836475768 || i35 == 1701082227) {
                    long position6 = (oVar.getPosition() + this.f176724u) - 8;
                    arrayDeque2.push(new ga.b.C1537b(this.f176723t, position6));
                    if (this.f176724u == this.f176725v) {
                        h(position6);
                    } else {
                        this.f176722s = 0;
                        this.f176725v = 0;
                    }
                } else if (i35 == 1751411826 || i35 == 1835296868 || i35 == 1836476516 || i35 == 1936286840 || i35 == 1937011556 || i35 == 1937011827 || i35 == 1668576371 || i35 == 1937011555 || i35 == 1937011578 || i35 == 1937013298 || i35 == 1937007471 || i35 == 1668232756 || i35 == 1937011571 || i35 == 1952867444 || i35 == 1952868452 || i35 == 1953196132 || i35 == 1953654136 || i35 == 1953658222 || i35 == 1886614376 || i35 == 1935763834 || i35 == 1935763823 || i35 == 1936027235 || i35 == 1970628964 || i35 == 1935828848 || i35 == 1936158820 || i35 == 1701606260 || i35 == 1835362404 || i35 == 1701671783) {
                    if (this.f176725v != 8) {
                        throw ParserException.createForUnsupportedContainerFeature("Leaf atom defines extended atom size (unsupported).");
                    }
                    if (this.f176724u > 2147483647L) {
                        throw ParserException.createForUnsupportedContainerFeature("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    fa.r rVar7 = new fa.r((int) this.f176724u);
                    System.arraycopy(rVar6.f70054a, 0, rVar7.f70054a, 0, 8);
                    this.f176726w = rVar7;
                    this.f176722s = 1;
                } else {
                    if (this.f176724u > 2147483647L) {
                        throw ParserException.createForUnsupportedContainerFeature("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.f176726w = null;
                    this.f176722s = 1;
                }
            }
        }
        q qVar5 = bVar.f176734b;
        int i36 = this.f176722s;
        int i37 = this.f176705b;
        if (i36 == 3) {
            this.D = !bVar.f176744l ? bVar.f176736d.f176828d[bVar.f176738f] : qVar5.f176815h[bVar.f176738f];
            this.G = (i37 & 64) == 0 || !Objects.equals(bVar.f176736d.f176825a.f176797g.f8386n, MimeTypes.VIDEO_H264);
            if (bVar.f176738f < bVar.f176741i) {
                oVar.skipFully(this.D);
                p pVarB = bVar.b();
                if (pVarB != null) {
                    fa.r rVar8 = qVar5.f176821n;
                    int i38 = pVarB.f176806d;
                    if (i38 != 0) {
                        rVar8.H(i38);
                    }
                    int i39 = bVar.f176738f;
                    if (qVar5.f176818k && qVar5.f176819l[i39]) {
                        rVar8.H(rVar8.A() * 6);
                    }
                }
                if (!bVar.c()) {
                    this.C = null;
                }
                this.f176722s = 3;
                return 0;
            }
            if (bVar.f176736d.f176825a.f176798h == 1) {
                this.D -= 8;
                oVar.skipFully(i14);
            }
            boolean zEquals = MimeTypes.AUDIO_AC4.equals(bVar.f176736d.f176825a.f176797g.f8386n);
            int i44 = this.D;
            if (zEquals) {
                this.E = bVar.d(i44, 7);
                int i45 = this.D;
                fa.r rVar9 = this.f176713j;
                bb.c.a(i45, rVar9);
                bVar.f176733a.f(7, rVar9);
                this.E += 7;
            } else {
                this.E = bVar.d(i44, 0);
            }
            this.D += this.E;
            this.f176722s = 4;
            this.F = 0;
        }
        r rVar10 = bVar.f176736d;
        o oVar2 = rVar10.f176825a;
        l0 l0Var3 = bVar.f176733a;
        long jA2 = bVar.f176744l ? qVar5.f176816i[bVar.f176738f] : rVar10.f176830f[bVar.f176738f];
        if (wVar != null) {
            jA2 = wVar.a(jA2);
        }
        int i46 = oVar2.f176801k;
        androidx.media3.common.q qVar6 = oVar2.f176797g;
        if (i46 == 0) {
            bVar2 = bVar;
            arrayDeque = arrayDeque;
            while (true) {
                int i47 = this.E;
                int i48 = this.D;
                if (i47 >= i48) {
                    break;
                }
                this.E += l0Var3.b(oVar, i48 - i47, false);
            }
        } else {
            fa.r rVar11 = this.f176710g;
            byte[] bArr2 = rVar11.f70054a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i49 = i46 + 1;
            int i54 = 4 - i46;
            while (true) {
                arrayDeque = arrayDeque;
                if (this.E >= this.D) {
                    bVar2 = bVar;
                    break;
                }
                int i55 = this.F;
                if (i55 == 0) {
                    oVar.readFully(bArr2, i54, i49);
                    rVar11.G(0);
                    int iG2 = rVar11.g();
                    byte[] bArr3 = bArr2;
                    if (iG2 < 1) {
                        throw ParserException.createForMalformedContainer("Invalid NAL length", null);
                    }
                    this.F = iG2 - 1;
                    fa.r rVar12 = this.f176709f;
                    rVar12.G(0);
                    l0Var3.f(4, rVar12);
                    l0Var3.f(1, rVar11);
                    if (this.K.length > 0) {
                        byte b14 = bArr3[4];
                        String str4 = qVar6.f8386n;
                        String str5 = qVar6.f8383k;
                        if (Objects.equals(str4, MimeTypes.VIDEO_H264) || x.b(str5, MimeTypes.VIDEO_H264) != null) {
                            rVar = rVar11;
                            if ((b14 & Ascii.US) != 6) {
                            }
                            this.H = z;
                            this.E += 5;
                            this.D += i54;
                            if (!this.G && Objects.equals(bVar.f176736d.f176825a.f176797g.f8386n, MimeTypes.VIDEO_H264) && ga.e.c(bArr3[4])) {
                                this.G = true;
                            }
                            bArr2 = bArr3;
                            rVar11 = rVar;
                        } else {
                            rVar = rVar11;
                        }
                        boolean z15 = (Objects.equals(qVar6.f8386n, MimeTypes.VIDEO_H265) || x.b(str5, MimeTypes.VIDEO_H265) != null) && ((b14 & 126) >> 1) == 39;
                        this.H = z15;
                        this.E += 5;
                        this.D += i54;
                        if (!this.G) {
                            this.G = true;
                        }
                        bArr2 = bArr3;
                        rVar11 = rVar;
                    } else {
                        rVar = rVar11;
                    }
                    this.H = z15;
                    this.E += 5;
                    this.D += i54;
                    if (!this.G) {
                        this.G = true;
                    }
                    bArr2 = bArr3;
                    rVar11 = rVar;
                } else {
                    byte[] bArr4 = bArr2;
                    fa.r rVar13 = rVar11;
                    if (this.H) {
                        fa.r rVar14 = this.f176711h;
                        rVar14.D(i55);
                        bVar3 = bVar;
                        oVar.readFully(rVar14.f70054a, 0, this.F);
                        l0Var3.f(this.F, rVar14);
                        iB = this.F;
                        int iK = ga.e.k(rVar14.f70054a, rVar14.f70056c);
                        rVar14.G((Objects.equals(qVar6.f8386n, MimeTypes.VIDEO_H265) || x.b(qVar6.f8383k, MimeTypes.VIDEO_H265) != null) ? 1 : 0);
                        rVar14.F(iK);
                        int i56 = qVar6.f8388p;
                        if (i56 == -1) {
                            if (gVar.f76587e != 0) {
                                gVar.f76587e = 0;
                                gVar.b(0);
                            }
                        } else if (gVar.f76587e != i56) {
                            fa.a.d(i56 >= 0);
                            gVar.f76587e = i56;
                            gVar.b(i56);
                        }
                        gVar.a(jA2, rVar14);
                        if ((bVar3.a() & 4) != 0) {
                            gVar.b(0);
                        }
                    } else {
                        bVar3 = bVar;
                        iB = l0Var3.b(oVar, i55, false);
                    }
                    this.E += iB;
                    this.F -= iB;
                    bArr2 = bArr4;
                    rVar11 = rVar13;
                    bVar = bVar3;
                }
            }
        }
        int iA3 = bVar2.a();
        if ((i37 & 64) != 0 && !this.G) {
            iA3 |= 67108864;
        }
        int i57 = iA3;
        p pVarB2 = bVar2.b();
        long j29 = jA2;
        l0Var3.c(j29, i57, this.D, 0, pVarB2 != null ? pVarB2.f176805c : null);
        while (!arrayDeque.isEmpty()) {
            a aVarRemoveFirst = arrayDeque.removeFirst();
            this.f176728y -= aVarRemoveFirst.f176732c;
            long jA3 = aVarRemoveFirst.f176730a;
            if (aVarRemoveFirst.f176731b) {
                jA3 += j29;
            }
            if (wVar != null) {
                jA3 = wVar.a(jA3);
            }
            long j34 = jA3;
            for (l0 l0Var4 : this.J) {
                l0Var4.c(j34, 1, aVarRemoveFirst.f176732c, this.f176728y, null);
            }
        }
        if (!bVar2.c()) {
            this.C = null;
        }
        this.f176722s = 3;
        return 0;
    }

    @Override // bb.n
    public final void c(bb.p pVar) {
        int i14;
        int i15 = this.f176705b;
        if ((i15 & 32) == 0) {
            pVar = new yb.o(pVar, this.f176704a);
        }
        this.I = pVar;
        this.f176722s = 0;
        this.f176725v = 0;
        l0[] l0VarArr = new l0[2];
        this.J = l0VarArr;
        l0 l0Var = this.f176720q;
        if (l0Var != null) {
            l0VarArr[0] = l0Var;
            i14 = 1;
        } else {
            i14 = 0;
        }
        int i16 = 100;
        if ((i15 & 4) != 0) {
            l0VarArr[i14] = pVar.track(100, 5);
            i16 = 101;
            i14++;
        }
        l0[] l0VarArr2 = (l0[]) z.Q(this.J, i14);
        this.J = l0VarArr2;
        for (l0 l0Var2 : l0VarArr2) {
            l0Var2.d(N);
        }
        List<androidx.media3.common.q> list = this.f176707d;
        this.K = new l0[list.size()];
        int i17 = 0;
        while (i17 < this.K.length) {
            l0 l0VarTrack = this.I.track(i16, 3);
            l0VarTrack.d(list.get(i17));
            this.K[i17] = l0VarTrack;
            i17++;
            i16++;
        }
        o oVar = this.f176706c;
        if (oVar != null) {
            this.f176708e.put(0, new b(this.I.track(0, oVar.f176792b), new r(this.f176706c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new c(0, 0, 0, 0)));
            this.I.endTracks();
        }
    }

    @Override // bb.n
    public final boolean d(bb.o oVar) {
        k0 k0VarB = n.b(oVar, true, false);
        this.f176721r = k0VarB != null ? ImmutableList.of(k0VarB) : ImmutableList.of();
        return k0VarB == null;
    }

    /* JADX WARN: Code duplicated, block: B:157:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:270:0x05f2  */
    public final void h(long j8) throws ParserException {
        c cVar;
        c cVar2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i14;
        int i15;
        byte[] bArr;
        int i16;
        boolean z14;
        while (true) {
            ArrayDeque<ga.b.C1537b> arrayDeque = this.f176717n;
            if (arrayDeque.isEmpty() || arrayDeque.peek().f76505b != j8) {
                break;
            }
            ga.b.C1537b c1537bPop = arrayDeque.pop();
            int i17 = c1537bPop.f76504a;
            ArrayList arrayList4 = c1537bPop.f76507d;
            ArrayList arrayList5 = c1537bPop.f76506c;
            int i18 = this.f176705b;
            int i19 = 12;
            o oVar = this.f176706c;
            SparseArray<b> sparseArray = this.f176708e;
            if (i17 == 1836019574) {
                fa.a.e(oVar == null, "Unexpected moov box.");
                androidx.media3.common.l lVarF = f(arrayList5);
                ga.b.C1537b c1537bB = c1537bPop.b(Atom.TYPE_mvex);
                c1537bB.getClass();
                ArrayList arrayList6 = c1537bB.f76506c;
                SparseArray sparseArray2 = new SparseArray();
                int size = arrayList6.size();
                int i24 = 0;
                long jW = C.TIME_UNSET;
                while (i24 < size) {
                    ga.b.c cVar3 = (ga.b.c) arrayList6.get(i24);
                    int i25 = cVar3.f76504a;
                    fa.r rVar = cVar3.f76508b;
                    if (i25 == 1953654136) {
                        rVar.G(i19);
                        arrayList = arrayList6;
                        Pair pairCreate = Pair.create(Integer.valueOf(rVar.g()), new c(rVar.g() - 1, rVar.g(), rVar.g(), rVar.g()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (c) pairCreate.second);
                    } else {
                        arrayList = arrayList6;
                        if (i25 == 1835362404) {
                            rVar.G(8);
                            jW = vb.b.c(rVar.g()) == 0 ? rVar.w() : rVar.z();
                        }
                    }
                    i24++;
                    arrayList6 = arrayList;
                    i19 = 12;
                }
                int i26 = 1;
                ArrayList arrayListG = vb.b.g(c1537bPop, new y(), jW, lVarF, (i18 & 16) != 0, false, new androidx.media3.common.p(this));
                int size2 = arrayListG.size();
                if (sparseArray.size() == 0) {
                    int i27 = 0;
                    while (i27 < size2) {
                        r rVar2 = (r) arrayListG.get(i27);
                        o oVar2 = rVar2.f176825a;
                        bb.p pVar = this.I;
                        int i28 = oVar2.f176792b;
                        int i29 = oVar2.f176791a;
                        l0 l0VarTrack = pVar.track(i27, i28);
                        if (sparseArray2.size() == i26) {
                            cVar = (c) sparseArray2.valueAt(0);
                        } else {
                            cVar = (c) sparseArray2.get(i29);
                            cVar.getClass();
                        }
                        sparseArray.put(i29, new b(l0VarTrack, rVar2, cVar));
                        this.A = Math.max(this.A, oVar2.f176795e);
                        i27++;
                        i26 = 1;
                    }
                    this.I.endTracks();
                } else {
                    fa.a.d(sparseArray.size() == size2);
                    for (int i30 = 0; i30 < size2; i30++) {
                        r rVar3 = (r) arrayListG.get(i30);
                        o oVar3 = rVar3.f176825a;
                        b bVar = sparseArray.get(oVar3.f176791a);
                        int i34 = oVar3.f176791a;
                        if (sparseArray2.size() == 1) {
                            cVar2 = (c) sparseArray2.valueAt(0);
                        } else {
                            cVar2 = (c) sparseArray2.get(i34);
                            cVar2.getClass();
                        }
                        bVar.f176736d = rVar3;
                        bVar.f176737e = cVar2;
                        bVar.f176733a.d(rVar3.f176825a.f176797g);
                        bVar.e();
                    }
                }
            } else {
                int i35 = i18;
                if (i17 == 1836019558) {
                    boolean z15 = oVar != null;
                    int size3 = arrayList4.size();
                    int i36 = 0;
                    while (i36 < size3) {
                        ga.b.C1537b c1537b = (ga.b.C1537b) arrayList4.get(i36);
                        if (c1537b.f76504a == 1953653094) {
                            ga.b.c cVarC = c1537b.c(Atom.TYPE_tfhd);
                            ArrayList arrayList7 = c1537b.f76506c;
                            cVarC.getClass();
                            fa.r rVar4 = cVarC.f76508b;
                            rVar4.G(8);
                            int iG = rVar4.g();
                            byte[] bArr2 = vb.b.f176657a;
                            b bVarValueAt = z15 ? sparseArray.valueAt(0) : sparseArray.get(rVar4.g());
                            if (bVarValueAt == null) {
                                size3 = size3;
                                bVarValueAt = null;
                            } else {
                                q qVar = bVarValueAt.f176734b;
                                if ((iG & 1) != 0) {
                                    long jZ = rVar4.z();
                                    qVar.f176809b = jZ;
                                    qVar.f176810c = jZ;
                                }
                                c cVar4 = bVarValueAt.f176737e;
                                qVar.f176808a = new c((iG & 2) != 0 ? rVar4.g() - 1 : cVar4.f176694a, (iG & 8) != 0 ? rVar4.g() : cVar4.f176695b, (iG & 16) != 0 ? rVar4.g() : cVar4.f176696c, (iG & 32) != 0 ? rVar4.g() : cVar4.f176697d);
                            }
                            if (bVarValueAt != null) {
                                q qVar2 = bVarValueAt.f176734b;
                                long j14 = qVar2.f176823p;
                                boolean z16 = qVar2.f176824q;
                                bVarValueAt.e();
                                bVarValueAt.f176744l = true;
                                ga.b.C1537b c1537b2 = c1537b;
                                ga.b.c cVarC2 = c1537b2.c(Atom.TYPE_tfdt);
                                if (cVarC2 == null || (i35 & 2) != 0) {
                                    qVar2.f176823p = j14;
                                    qVar2.f176824q = z16;
                                } else {
                                    fa.r rVar5 = cVarC2.f76508b;
                                    rVar5.G(8);
                                    qVar2.f176823p = vb.b.c(rVar5.g()) == 1 ? rVar5.z() : rVar5.w();
                                    qVar2.f176824q = true;
                                }
                                int size4 = arrayList7.size();
                                int i37 = 0;
                                int i38 = 0;
                                int i39 = 0;
                                while (true) {
                                    i15 = Atom.TYPE_trun;
                                    if (i37 >= size4) {
                                        break;
                                    }
                                    int i44 = i37;
                                    ga.b.c cVar5 = (ga.b.c) arrayList7.get(i37);
                                    ArrayList arrayList8 = arrayList4;
                                    if (cVar5.f76504a == 1953658222) {
                                        fa.r rVar6 = cVar5.f76508b;
                                        rVar6.G(12);
                                        int iY = rVar6.y();
                                        if (iY > 0) {
                                            i39 += iY;
                                            i38++;
                                        }
                                    }
                                    i37 = i44 + 1;
                                    arrayList4 = arrayList8;
                                }
                                arrayList2 = arrayList4;
                                bVarValueAt.f176740h = 0;
                                bVarValueAt.f176739g = 0;
                                bVarValueAt.f176738f = 0;
                                qVar2.f176811d = i38;
                                qVar2.f176812e = i39;
                                if (qVar2.f176814g.length < i38) {
                                    qVar2.f176813f = new long[i38];
                                    qVar2.f176814g = new int[i38];
                                }
                                if (qVar2.f176815h.length < i39) {
                                    int i45 = (i39 * 125) / 100;
                                    qVar2.f176815h = new int[i45];
                                    qVar2.f176816i = new long[i45];
                                    qVar2.f176817j = new boolean[i45];
                                    qVar2.f176819l = new boolean[i45];
                                }
                                int i46 = 0;
                                int i47 = 0;
                                int i48 = 0;
                                while (true) {
                                    long j15 = 0;
                                    if (i46 >= size4) {
                                        arrayList3 = arrayList5;
                                        i14 = i35;
                                        ga.b.C1537b c1537b3 = c1537b2;
                                        o oVar4 = bVarValueAt.f176736d.f176825a;
                                        c cVar6 = qVar2.f176808a;
                                        cVar6.getClass();
                                        int i49 = cVar6.f176694a;
                                        p[] pVarArr = oVar4.f176802l;
                                        p pVar2 = pVarArr == null ? null : pVarArr[i49];
                                        ga.b.c cVarC3 = c1537b3.c(Atom.TYPE_saiz);
                                        if (cVarC3 != null) {
                                            pVar2.getClass();
                                            fa.r rVar7 = cVarC3.f76508b;
                                            int i54 = pVar2.f176806d;
                                            rVar7.G(8);
                                            int iG2 = rVar7.g();
                                            byte[] bArr3 = vb.b.f176657a;
                                            if ((iG2 & 1) == 1) {
                                                rVar7.H(8);
                                            }
                                            int iU = rVar7.u();
                                            int iY2 = rVar7.y();
                                            if (iY2 > qVar2.f176812e) {
                                                StringBuilder sbI = b71.i.i(iY2, "Saiz sample count ", " is greater than fragment sample count");
                                                sbI.append(qVar2.f176812e);
                                                throw ParserException.createForMalformedContainer(sbI.toString(), null);
                                            }
                                            if (iU == 0) {
                                                boolean[] zArr = qVar2.f176819l;
                                                i16 = 0;
                                                for (int i55 = 0; i55 < iY2; i55++) {
                                                    int iU2 = rVar7.u();
                                                    i16 += iU2;
                                                    zArr[i55] = iU2 > i54;
                                                }
                                                z14 = false;
                                            } else {
                                                i16 = iU * iY2;
                                                z14 = false;
                                                Arrays.fill(qVar2.f176819l, 0, iY2, iU > i54);
                                            }
                                            Arrays.fill(qVar2.f176819l, iY2, qVar2.f176812e, z14);
                                            if (i16 > 0) {
                                                qVar2.f176821n.D(i16);
                                                qVar2.f176818k = true;
                                                qVar2.f176822o = true;
                                            }
                                        }
                                        ga.b.c cVarC4 = c1537b3.c(Atom.TYPE_saio);
                                        if (cVarC4 != null) {
                                            fa.r rVar8 = cVarC4.f76508b;
                                            rVar8.G(8);
                                            int iG3 = rVar8.g();
                                            byte[] bArr4 = vb.b.f176657a;
                                            if ((iG3 & 1) == 1) {
                                                rVar8.H(8);
                                            }
                                            int iY3 = rVar8.y();
                                            if (iY3 != 1) {
                                                throw ParserException.createForMalformedContainer("Unexpected saio entry count: " + iY3, null);
                                            }
                                            qVar2.f176810c += vb.b.c(iG3) == 0 ? rVar8.w() : rVar8.z();
                                        }
                                        ga.b.c cVarC5 = c1537b3.c(Atom.TYPE_senc);
                                        if (cVarC5 != null) {
                                            g(cVarC5.f76508b, 0, qVar2);
                                        }
                                        String str = pVar2 != null ? pVar2.f176804b : null;
                                        fa.r rVar9 = null;
                                        fa.r rVar10 = null;
                                        for (int i56 = 0; i56 < arrayList7.size(); i56++) {
                                            ga.b.c cVar7 = (ga.b.c) arrayList7.get(i56);
                                            fa.r rVar11 = cVar7.f76508b;
                                            int i57 = cVar7.f76504a;
                                            if (i57 == 1935828848) {
                                                rVar11.G(12);
                                                if (rVar11.g() == 1936025959) {
                                                    rVar9 = rVar11;
                                                }
                                            } else if (i57 == 1936158820) {
                                                rVar11.G(12);
                                                if (rVar11.g() == 1936025959) {
                                                    rVar10 = rVar11;
                                                }
                                            }
                                        }
                                        if (rVar9 != null && rVar10 != null) {
                                            rVar9.G(8);
                                            int iC = vb.b.c(rVar9.g());
                                            rVar9.H(4);
                                            if (iC == 1) {
                                                rVar9.H(4);
                                            }
                                            if (rVar9.g() != 1) {
                                                throw ParserException.createForUnsupportedContainerFeature("Entry count in sbgp != 1 (unsupported).");
                                            }
                                            rVar10.G(8);
                                            int iC2 = vb.b.c(rVar10.g());
                                            rVar10.H(4);
                                            if (iC2 == 1) {
                                                if (rVar10.w() == 0) {
                                                    throw ParserException.createForUnsupportedContainerFeature("Variable length description in sgpd found (unsupported)");
                                                }
                                            } else if (iC2 >= 2) {
                                                rVar10.H(4);
                                            }
                                            if (rVar10.w() != 1) {
                                                throw ParserException.createForUnsupportedContainerFeature("Entry count in sgpd != 1 (unsupported).");
                                            }
                                            rVar10.H(1);
                                            int iU3 = rVar10.u();
                                            int i58 = (iU3 & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                                            int i59 = iU3 & 15;
                                            boolean z17 = rVar10.u() == 1;
                                            if (z17) {
                                                int iU4 = rVar10.u();
                                                byte[] bArr5 = new byte[16];
                                                rVar10.e(bArr5, 0, 16);
                                                if (iU4 == 0) {
                                                    int iU5 = rVar10.u();
                                                    byte[] bArr6 = new byte[iU5];
                                                    rVar10.e(bArr6, 0, iU5);
                                                    bArr = bArr6;
                                                } else {
                                                    bArr = null;
                                                }
                                                qVar2.f176818k = true;
                                                qVar2.f176820m = new p(z17, str, iU4, bArr5, i58, i59, bArr);
                                            }
                                        }
                                        int size5 = arrayList7.size();
                                        for (int i64 = 0; i64 < size5; i64++) {
                                            ga.b.c cVar8 = (ga.b.c) arrayList7.get(i64);
                                            if (cVar8.f76504a == 1970628964) {
                                                fa.r rVar12 = cVar8.f76508b;
                                                rVar12.G(8);
                                                byte[] bArr7 = this.f176712i;
                                                rVar12.e(bArr7, 0, 16);
                                                if (Arrays.equals(bArr7, M)) {
                                                    g(rVar12, 16, qVar2);
                                                }
                                            }
                                        }
                                        break;
                                    }
                                    ga.b.c cVar9 = (ga.b.c) arrayList7.get(i46);
                                    int i65 = size4;
                                    if (cVar9.f76504a == i15) {
                                        int i66 = i47 + 1;
                                        fa.r rVar13 = cVar9.f76508b;
                                        rVar13.G(8);
                                        int iG4 = rVar13.g();
                                        byte[] bArr8 = vb.b.f176657a;
                                        o oVar5 = bVarValueAt.f176736d.f176825a;
                                        c cVar10 = qVar2.f176808a;
                                        int i67 = z.f70071a;
                                        int i68 = i47;
                                        qVar2.f176814g[i68] = rVar13.y();
                                        long[] jArr = qVar2.f176813f;
                                        int i69 = i48;
                                        long j16 = qVar2.f176809b;
                                        jArr[i68] = j16;
                                        if ((iG4 & 1) != 0) {
                                            jArr[i68] = j16 + ((long) rVar13.g());
                                        }
                                        boolean z18 = (iG4 & 4) != 0;
                                        int iG5 = cVar10.f176697d;
                                        if (z18) {
                                            iG5 = rVar13.g();
                                        }
                                        boolean z19 = z18;
                                        boolean z24 = (iG4 & 256) != 0;
                                        boolean z25 = (iG4 & 512) != 0;
                                        boolean z26 = (iG4 & 1024) != 0;
                                        boolean z27 = (iG4 & 2048) != 0;
                                        boolean z28 = z26;
                                        long[] jArr2 = oVar5.f176799i;
                                        int i74 = iG5;
                                        long[] jArr3 = oVar5.f176800j;
                                        if (jArr2 != null && jArr2.length == 1 && jArr3 != null) {
                                            long j17 = jArr2[0];
                                            if (j17 == 0) {
                                                j15 = jArr3[0];
                                            } else {
                                                long j18 = oVar5.f176794d;
                                                RoundingMode roundingMode = RoundingMode.DOWN;
                                                if (z.U(j17, 1000000L, j18, roundingMode) + z.U(jArr3[0], 1000000L, oVar5.f176793c, roundingMode) >= oVar5.f176795e) {
                                                    j15 = jArr3[0];
                                                }
                                            }
                                        }
                                        int[] iArr = qVar2.f176815h;
                                        long[] jArr4 = qVar2.f176816i;
                                        boolean[] zArr2 = qVar2.f176817j;
                                        boolean z29 = oVar5.f176792b == 2 && (i35 & 1) != 0;
                                        i48 = i69 + qVar2.f176814g[i68];
                                        long j19 = oVar5.f176793c;
                                        long j24 = qVar2.f176823p;
                                        int i75 = i69;
                                        while (i75 < i48) {
                                            int iG6 = z24 ? rVar13.g() : cVar10.f176695b;
                                            boolean z34 = z29;
                                            if (iG6 < 0) {
                                                throw ParserException.createForMalformedContainer("Unexpected negative value: " + iG6, null);
                                            }
                                            int iG7 = z25 ? rVar13.g() : cVar10.f176696c;
                                            if (iG7 < 0) {
                                                throw ParserException.createForMalformedContainer("Unexpected negative value: " + iG7, null);
                                            }
                                            int iG8 = z28 ? rVar13.g() : (i75 == 0 && z19) ? i74 : cVar10.f176697d;
                                            long jU = z.U((((long) (z27 ? rVar13.g() : 0)) + j24) - j15, 1000000L, j19, RoundingMode.DOWN);
                                            jArr4[i75] = jU;
                                            if (!qVar2.f176824q) {
                                                jArr4[i75] = jU + bVarValueAt.f176736d.f176832h;
                                            }
                                            iArr[i75] = iG7;
                                            zArr2[i75] = ((iG8 >> 16) & 1) == 0 && (!z34 || i75 == 0);
                                            j24 += (long) iG6;
                                            i75++;
                                            i48 = i48;
                                            z29 = z34;
                                            cVar10 = cVar10;
                                        }
                                        qVar2.f176823p = j24;
                                        i47 = i66;
                                    }
                                    c1537b2 = c1537b2;
                                    arrayList5 = arrayList5;
                                    i35 = i35;
                                    i15 = Atom.TYPE_trun;
                                    i46++;
                                    size4 = i65;
                                }
                            } else {
                                arrayList2 = arrayList4;
                                arrayList3 = arrayList5;
                                i14 = i35;
                            }
                        } else {
                            size3 = size3;
                            arrayList2 = arrayList4;
                            arrayList3 = arrayList5;
                            i14 = i35;
                        }
                        i36++;
                        arrayList4 = arrayList2;
                        size3 = size3;
                        arrayList5 = arrayList3;
                        i35 = i14;
                    }
                    androidx.media3.common.l lVarF2 = f(arrayList5);
                    if (lVarF2 != null) {
                        int size6 = sparseArray.size();
                        for (int i76 = 0; i76 < size6; i76++) {
                            b bVarValueAt2 = sparseArray.valueAt(i76);
                            o oVar6 = bVarValueAt2.f176736d.f176825a;
                            c cVar11 = bVarValueAt2.f176734b.f176808a;
                            int i77 = z.f70071a;
                            int i78 = cVar11.f176694a;
                            p[] pVarArr2 = oVar6.f176802l;
                            p pVar3 = pVarArr2 == null ? null : pVarArr2[i78];
                            androidx.media3.common.l lVarB = lVarF2.b(pVar3 != null ? pVar3.f176804b : null);
                            androidx.media3.common.q.b bVarA = bVarValueAt2.f176736d.f176825a.f176797g.a();
                            bVarA.f8415q = lVarB;
                            bVarValueAt2.f176733a.d(bVarA.a());
                        }
                    }
                    if (this.f176729z != C.TIME_UNSET) {
                        int size7 = sparseArray.size();
                        for (int i79 = 0; i79 < size7; i79++) {
                            b bVarValueAt3 = sparseArray.valueAt(i79);
                            long j25 = this.f176729z;
                            int i84 = bVarValueAt3.f176738f;
                            while (true) {
                                q qVar3 = bVarValueAt3.f176734b;
                                if (i84 >= qVar3.f176812e || qVar3.f176816i[i84] > j25) {
                                    break;
                                }
                                if (qVar3.f176817j[i84]) {
                                    bVarValueAt3.f176741i = i84;
                                }
                                i84++;
                            }
                        }
                        this.f176729z = C.TIME_UNSET;
                    }
                } else if (!arrayDeque.isEmpty()) {
                    arrayDeque.peek().f76507d.add(c1537bPop);
                }
            }
        }
        this.f176722s = 0;
        this.f176725v = 0;
    }

    @Override // bb.n
    public final void release() {
    }

    @Override // bb.n
    public final void seek(long j8, long j14) {
        SparseArray<b> sparseArray = this.f176708e;
        int size = sparseArray.size();
        for (int i14 = 0; i14 < size; i14++) {
            sparseArray.valueAt(i14).e();
        }
        this.f176718o.clear();
        this.f176728y = 0;
        this.f176719p.b(0);
        this.f176729z = j14;
        this.f176717n.clear();
        this.f176722s = 0;
        this.f176725v = 0;
    }

    public f(yb.n.a aVar) {
        this(aVar, 0, null, null, ImmutableList.of(), null);
    }

    @Deprecated
    public f(int i14) {
        this(yb.n.a.f195662a, i14 | 32, null, null, ImmutableList.of(), null);
    }

    public f(yb.n.a aVar, int i14) {
        this(aVar, i14, null, null, ImmutableList.of(), null);
    }

    @Deprecated
    public f(int i14, w wVar) {
        this(yb.n.a.f195662a, i14 | 32, wVar, null, ImmutableList.of(), null);
    }

    @Deprecated
    public f(int i14, w wVar, o oVar) {
        this(yb.n.a.f195662a, i14 | 32, wVar, oVar, ImmutableList.of(), null);
    }

    @Deprecated
    public f(int i14, w wVar, o oVar, List<androidx.media3.common.q> list) {
        this(yb.n.a.f195662a, i14 | 32, wVar, oVar, list, null);
    }

    @Deprecated
    public f(int i14, w wVar, o oVar, List<androidx.media3.common.q> list, l0 l0Var) {
        this(yb.n.a.f195662a, i14 | 32, wVar, oVar, list, l0Var);
    }

    @Deprecated
    public f() {
        this(yb.n.a.f195662a, 32, null, null, ImmutableList.of(), null);
    }
}
