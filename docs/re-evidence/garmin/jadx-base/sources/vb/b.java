package vb;

import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.common.x;
import bb.y;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import ds.e0;
import fa.z;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f176657a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f176658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f176659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f176660c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f176661d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f176662e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final fa.r f176663f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final fa.r f176664g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f176665h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f176666i;

        public a(fa.r rVar, fa.r rVar2, boolean z14) throws ParserException {
            this.f176664g = rVar;
            this.f176663f = rVar2;
            this.f176662e = z14;
            rVar2.G(12);
            this.f176658a = rVar2.y();
            rVar.G(12);
            this.f176666i = rVar.y();
            bb.q.a(rVar.g() == 1, "first_chunk must be 1");
            this.f176659b = -1;
        }

        public final boolean a() {
            int i14 = this.f176659b + 1;
            this.f176659b = i14;
            if (i14 == this.f176658a) {
                return false;
            }
            boolean z14 = this.f176662e;
            fa.r rVar = this.f176663f;
            this.f176661d = z14 ? rVar.z() : rVar.w();
            if (this.f176659b == this.f176665h) {
                fa.r rVar2 = this.f176664g;
                this.f176660c = rVar2.y();
                rVar2.H(4);
                int i15 = this.f176666i - 1;
                this.f176666i = i15;
                this.f176665h = i15 > 0 ? rVar2.y() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: vb.b$b, reason: collision with other inner class name */
    public static final class C3299b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f176667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f176668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f176669c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f176670d;

        public C3299b(String str, byte[] bArr, long j8, long j14) {
            this.f176667a = str;
            this.f176668b = bArr;
            this.f176669c = j8;
            this.f176670d = j14;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f176671a;

        public c(f fVar) {
            this.f176671a = fVar;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f176672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f176673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f176674c;

        public d(long j8, long j14, String str) {
            this.f176672a = j8;
            this.f176673b = j14;
            this.f176674c = str;
        }
    }

    public interface e {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f176675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f176676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f176677c;

        public f(boolean z14, boolean z15, boolean z16, boolean z17) {
            this.f176675a = z14;
            this.f176676b = z15;
            this.f176677c = z16;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p[] f176678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.media3.common.q f176679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f176680c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f176681d = 0;

        public g(int i14) {
            this.f176678a = new p[i14];
        }
    }

    public static final class h implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f176682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f176683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final fa.r f176684c;

        public h(ga.b.c cVar, androidx.media3.common.q qVar) {
            fa.r rVar = cVar.f76508b;
            this.f176684c = rVar;
            rVar.G(12);
            int iY = rVar.y();
            if (MimeTypes.AUDIO_RAW.equals(qVar.f8386n)) {
                int iY2 = z.y(qVar.E, qVar.C);
                if (iY == 0 || iY % iY2 != 0) {
                    fa.k.g("Audio sample size mismatch. stsd sample size: " + iY2 + ", stsz sample size: " + iY);
                    iY = iY2;
                }
            }
            this.f176682a = iY == 0 ? -1 : iY;
            this.f176683b = rVar.y();
        }

        @Override // vb.b.e
        public final int getFixedSampleSize() {
            return this.f176682a;
        }

        @Override // vb.b.e
        public final int getSampleCount() {
            return this.f176683b;
        }

        @Override // vb.b.e
        public final int readNextSampleSize() {
            int i14 = this.f176682a;
            return i14 == -1 ? this.f176684c.y() : i14;
        }
    }

    public static final class i implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final fa.r f176685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f176686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f176687c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f176688d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f176689e;

        public i(ga.b.c cVar) {
            fa.r rVar = cVar.f76508b;
            this.f176685a = rVar;
            rVar.G(12);
            this.f176687c = rVar.y() & 255;
            this.f176686b = rVar.y();
        }

        @Override // vb.b.e
        public final int getFixedSampleSize() {
            return -1;
        }

        @Override // vb.b.e
        public final int getSampleCount() {
            return this.f176686b;
        }

        @Override // vb.b.e
        public final int readNextSampleSize() {
            fa.r rVar = this.f176685a;
            int i14 = this.f176687c;
            if (i14 == 8) {
                return rVar.u();
            }
            if (i14 == 16) {
                return rVar.A();
            }
            int i15 = this.f176688d;
            this.f176688d = i15 + 1;
            if (i15 % 2 != 0) {
                return this.f176689e & 15;
            }
            int iU = rVar.u();
            this.f176689e = iU;
            return (iU & PsExtractor.VIDEO_STREAM_MASK) >> 4;
        }
    }

    public static final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f176690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f176691b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f176692c;

        public j(int i14, long j8, int i15) {
            this.f176690a = i14;
            this.f176691b = j8;
            this.f176692c = i15;
        }
    }

    public static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f176693a;

        public k(c cVar) {
            this.f176693a = cVar;
        }
    }

    static {
        int i14 = z.f70071a;
        f176657a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    private b() {
    }

    public static C3299b a(int i14, fa.r rVar) {
        rVar.G(i14 + 12);
        rVar.H(1);
        b(rVar);
        rVar.H(2);
        int iU = rVar.u();
        if ((iU & 128) != 0) {
            rVar.H(2);
        }
        if ((iU & 64) != 0) {
            rVar.H(rVar.u());
        }
        if ((iU & 32) != 0) {
            rVar.H(2);
        }
        rVar.H(1);
        b(rVar);
        String strE = x.e(rVar.u());
        if (MimeTypes.AUDIO_MPEG.equals(strE) || MimeTypes.AUDIO_DTS.equals(strE) || MimeTypes.AUDIO_DTS_HD.equals(strE)) {
            return new C3299b(strE, null, -1L, -1L);
        }
        rVar.H(4);
        long jW = rVar.w();
        long jW2 = rVar.w();
        rVar.H(1);
        int iB = b(rVar);
        long j8 = jW2;
        byte[] bArr = new byte[iB];
        rVar.e(bArr, 0, iB);
        if (j8 <= 0) {
            j8 = -1;
        }
        return new C3299b(strE, bArr, j8, jW > 0 ? jW : -1L);
    }

    public static int b(fa.r rVar) {
        int iU = rVar.u();
        int i14 = iU & 127;
        while ((iU & 128) == 128) {
            iU = rVar.u();
            i14 = (i14 << 7) | (iU & 127);
        }
        return i14;
    }

    public static int c(int i14) {
        return (i14 >> 24) & 255;
    }

    public static ga.d d(fa.r rVar) {
        long jO;
        long jO2;
        rVar.G(8);
        if (c(rVar.g()) == 0) {
            jO = rVar.w();
            jO2 = rVar.w();
        } else {
            jO = rVar.o();
            jO2 = rVar.o();
        }
        return new ga.d(jO, jO2, rVar.w());
    }

    public static Pair<Integer, p> e(fa.r rVar, int i14, int i15) throws ParserException {
        p pVar;
        Pair<Integer, p> pairCreate;
        int i16;
        int i17;
        int i18 = rVar.f70055b;
        while (i18 - i14 < i15) {
            rVar.G(i18);
            int iG = rVar.g();
            bb.q.a(iG > 0, "childAtomSize must be positive");
            if (rVar.g() == 1936289382) {
                int i19 = i18 + 8;
                int i24 = 0;
                int i25 = -1;
                Integer numValueOf = null;
                String strS = null;
                while (i19 - i18 < iG) {
                    rVar.G(i19);
                    int iG2 = rVar.g();
                    int iG3 = rVar.g();
                    if (iG3 == 1718775137) {
                        numValueOf = Integer.valueOf(rVar.g());
                    } else if (iG3 == 1935894637) {
                        rVar.H(4);
                        strS = rVar.s(4, StandardCharsets.UTF_8);
                    } else if (iG3 == 1935894633) {
                        i25 = i19;
                        i24 = iG2;
                    }
                    i19 += iG2;
                }
                byte[] bArr = null;
                if (C.CENC_TYPE_cenc.equals(strS) || C.CENC_TYPE_cbc1.equals(strS) || C.CENC_TYPE_cens.equals(strS) || C.CENC_TYPE_cbcs.equals(strS)) {
                    bb.q.a(numValueOf != null, "frma atom is mandatory");
                    bb.q.a(i25 != -1, "schi atom is mandatory");
                    int i26 = i25 + 8;
                    while (true) {
                        if (i26 - i25 >= i24) {
                            pVar = null;
                            break;
                        }
                        rVar.G(i26);
                        int iG4 = rVar.g();
                        if (rVar.g() == 1952804451) {
                            int iC = c(rVar.g());
                            rVar.H(1);
                            if (iC == 0) {
                                rVar.H(1);
                                i17 = 0;
                                i16 = 0;
                            } else {
                                int iU = rVar.u();
                                i16 = iU & 15;
                                i17 = (iU & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                            }
                            boolean z14 = rVar.u() == 1;
                            int iU2 = rVar.u();
                            byte[] bArr2 = new byte[16];
                            rVar.e(bArr2, 0, 16);
                            if (z14 && iU2 == 0) {
                                int iU3 = rVar.u();
                                byte[] bArr3 = new byte[iU3];
                                rVar.e(bArr3, 0, iU3);
                                bArr = bArr3;
                            }
                            pVar = new p(z14, strS, iU2, bArr2, i17, i16, bArr);
                            break;
                        }
                        i26 += iG4;
                    }
                    bb.q.a(pVar != null, "tenc atom is mandatory");
                    int i27 = z.f70071a;
                    pairCreate = Pair.create(numValueOf, pVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i18 += iG;
        }
        return null;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because the return value of "jadx.core.dex.instructions.PhiInsn.getResult()" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:117)
        	at jadx.core.dex.visitors.InitCodeVariables.lambda$collectConnectedVars$0(InitCodeVariables.java:124)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:121)
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        */
    public static vb.b.g f(fa.r r53, int r54, int r55, java.lang.String r56, androidx.media3.common.l r57, boolean r58) {
        /*
            Method dump skipped, instruction units count: 3298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vb.b.f(fa.r, int, int, java.lang.String, androidx.media3.common.l, boolean):vb.b$g");
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01c8 A[EDGE_INSN: B:103:0x01c8->B:102:0x01c5 BREAK  A[LOOP:16: B:93:0x01a8->B:104:0x01d6]] */
    /* JADX WARN: Code duplicated, block: B:104:0x01d6 A[LOOP:16: B:93:0x01a8->B:104:0x01d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x0216  */
    /* JADX WARN: Code duplicated, block: B:133:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:136:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:137:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:156:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:309:0x07bc  */
    /* JADX WARN: Code duplicated, block: B:310:0x07be  */
    /* JADX WARN: Code duplicated, block: B:314:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:316:0x07de  */
    /* JADX WARN: Code duplicated, block: B:324:0x0816 A[LOOP:8: B:324:0x0816->B:328:0x0827, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:326:0x081f  */
    /* JADX WARN: Code duplicated, block: B:328:0x0827 A[LOOP:8: B:324:0x0816->B:328:0x0827, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:331:0x0834  */
    /* JADX WARN: Code duplicated, block: B:332:0x0836  */
    /* JADX WARN: Code duplicated, block: B:334:0x083d  */
    /* JADX WARN: Code duplicated, block: B:338:0x084e  */
    /* JADX WARN: Code duplicated, block: B:339:0x0850  */
    /* JADX WARN: Code duplicated, block: B:342:0x0856  */
    /* JADX WARN: Code duplicated, block: B:343:0x0859  */
    /* JADX WARN: Code duplicated, block: B:345:0x085c  */
    /* JADX WARN: Code duplicated, block: B:346:0x085f  */
    /* JADX WARN: Code duplicated, block: B:348:0x0863  */
    /* JADX WARN: Code duplicated, block: B:350:0x0867  */
    /* JADX WARN: Code duplicated, block: B:351:0x086a  */
    /* JADX WARN: Code duplicated, block: B:355:0x0878  */
    /* JADX WARN: Code duplicated, block: B:357:0x0882  */
    /* JADX WARN: Code duplicated, block: B:358:0x0892  */
    /* JADX WARN: Code duplicated, block: B:361:0x089a  */
    /* JADX WARN: Code duplicated, block: B:363:0x08c2  */
    /* JADX WARN: Code duplicated, block: B:373:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:374:0x093b  */
    /* JADX WARN: Code duplicated, block: B:385:0x0961 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:400:0x082b A[EDGE_INSN: B:400:0x082b->B:329:0x082b BREAK  A[LOOP:8: B:324:0x0816->B:328:0x0827], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x082b A[EDGE_INSN: B:401:0x082b->B:329:0x082b BREAK  A[LOOP:8: B:324:0x0816->B:328:0x0827], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0132  */
    /* JADX WARN: Code duplicated, block: B:77:0x013c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0141  */
    /* JADX WARN: Code duplicated, block: B:81:0x014f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0157  */
    /* JADX WARN: Code duplicated, block: B:86:0x0193  */
    /* JADX WARN: Code duplicated, block: B:87:0x0196  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:94:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:99:0x01bc  */
    public static ArrayList g(ga.b.C1537b c1537b, y yVar, long j8, androidx.media3.common.l lVar, boolean z14, boolean z15, Function function) {
        int i14;
        long jU;
        long jW;
        ArrayList arrayList;
        int i15;
        int i16;
        j jVar;
        long j14;
        long j15;
        long j16;
        long jU2;
        fa.r rVar;
        int iC;
        int i17;
        long jW2;
        int i18;
        int i19;
        int i24;
        d dVar;
        ga.b.c cVarC;
        g gVarF;
        long[] jArr;
        long[] jArr2;
        androidx.media3.common.q qVar;
        o oVar;
        ga.b.C1537b c1537bB;
        Pair pairCreate;
        long jZ;
        long j17;
        e iVar;
        boolean z16;
        int iY;
        int iY2;
        int i25;
        ArrayList arrayList2;
        int i26;
        long[] jArr3;
        int[] iArr;
        long[] jArr4;
        int[] iArr2;
        boolean z17;
        int i27;
        long j18;
        long[] jArr5;
        long[] jArr6;
        int[] iArr3;
        boolean z18;
        int[] iArr4;
        int[] iArr5;
        int i28;
        boolean z19;
        int i29;
        int i30;
        int[] iArr6;
        int[] iArr7;
        boolean z24;
        boolean z25;
        long[] jArr7;
        int[] iArr8;
        int[] iArr9;
        long[] jArr8;
        int i34;
        int i35;
        boolean z26;
        int i36;
        long j19;
        o oVar2;
        r rVar2;
        long j24;
        int i37;
        int i38;
        boolean z27;
        int[] iArr10;
        long jU3;
        int[] iArr11;
        int i39;
        long j25;
        int[] iArr12;
        int i44;
        long j26;
        int i45;
        boolean z28;
        int i46;
        int i47;
        r rVar3;
        ga.b.C1537b c1537b2 = c1537b;
        ArrayList arrayList3 = c1537b2.f76507d;
        ArrayList arrayList4 = new ArrayList();
        int i48 = 0;
        while (i48 < arrayList3.size()) {
            ga.b.C1537b c1537b3 = (ga.b.C1537b) arrayList3.get(i48);
            if (c1537b3.f76504a != 1953653099) {
                arrayList = arrayList3;
            } else {
                ga.b.c cVarC2 = c1537b2.c(Atom.TYPE_mvhd);
                cVarC2.getClass();
                ga.b.C1537b c1537bB2 = c1537b3.b(Atom.TYPE_mdia);
                c1537bB2.getClass();
                ga.b.c cVarC3 = c1537bB2.c(Atom.TYPE_hdlr);
                cVarC3.getClass();
                fa.r rVar4 = cVarC3.f76508b;
                rVar4.G(16);
                int iG = rVar4.g();
                if (iG == 1936684398) {
                    i14 = 1;
                } else if (iG == 1986618469) {
                    i14 = 2;
                } else if (iG == 1952807028 || iG == 1935832172 || iG == 1937072756 || iG == 1668047728) {
                    i14 = 3;
                } else {
                    i14 = iG == 1835365473 ? 5 : -1;
                }
                if (i14 == -1) {
                    arrayList = arrayList3;
                    oVar = null;
                } else {
                    ga.b.c cVarC4 = c1537b3.c(Atom.TYPE_tkhd);
                    cVarC4.getClass();
                    fa.r rVar5 = cVarC4.f76508b;
                    rVar5.G(8);
                    int iC2 = c(rVar5.g());
                    rVar5.H(iC2 != 0 ? 16 : 8);
                    int iG2 = rVar5.g();
                    rVar5.H(4);
                    int i49 = rVar5.f70055b;
                    int i54 = iC2 != 0 ? 8 : 4;
                    int i55 = 0;
                    while (true) {
                        jU = C.TIME_UNSET;
                        if (i55 >= i54) {
                            rVar5.H(i54);
                        } else {
                            if (rVar5.f70054a[i49 + i55] != -1) {
                                jW = iC2 == 0 ? rVar5.w() : rVar5.z();
                                if (jW != 0) {
                                    break;
                                }
                                break;
                            }
                            i55++;
                        }
                        jW = -9223372036854775807L;
                        break;
                    }
                    rVar5.H(16);
                    int iG3 = rVar5.g();
                    int iG4 = rVar5.g();
                    rVar5.H(4);
                    int iG5 = rVar5.g();
                    int iG6 = rVar5.g();
                    arrayList = arrayList3;
                    if (iG3 == 0 && iG4 == 65536) {
                        i15 = -65536;
                        if (iG5 == -65536 && iG6 == 0) {
                            i16 = 90;
                        }
                        jVar = new j(iG2, jW, i16);
                        if (j8 == C.TIME_UNSET) {
                            j14 = jVar.f176691b;
                        } else {
                            j14 = j8;
                        }
                        j15 = d(cVarC2.f76508b).f76513c;
                        if (j14 == C.TIME_UNSET) {
                            j16 = j15;
                            jU2 = -9223372036854775807L;
                        } else {
                            int i56 = z.f70071a;
                            j16 = j15;
                            jU2 = z.U(j14, 1000000L, j16, RoundingMode.DOWN);
                        }
                        ga.b.C1537b c1537bB3 = c1537bB2.b(Atom.TYPE_minf);
                        c1537bB3.getClass();
                        ga.b.C1537b c1537bB4 = c1537bB3.b(Atom.TYPE_stbl);
                        c1537bB4.getClass();
                        ga.b.c cVarC5 = c1537bB2.c(Atom.TYPE_mdhd);
                        cVarC5.getClass();
                        rVar = cVarC5.f76508b;
                        rVar.G(8);
                        iC = c(rVar.g());
                        if (iC == 0) {
                            i17 = 8;
                        } else {
                            i17 = 16;
                        }
                        rVar.H(i17);
                        jW2 = rVar.w();
                        i18 = rVar.f70055b;
                        if (iC == 0) {
                            i19 = 4;
                        } else {
                            i19 = 8;
                        }
                        i24 = 0;
                        while (true) {
                            if (i24 < i19) {
                                rVar.H(i19);
                                break;
                            }
                            if (rVar.f70054a[i18 + i24] != -1) {
                                if (iC == 0) {
                                    jZ = rVar.w();
                                } else {
                                    jZ = rVar.z();
                                }
                                j17 = jZ;
                                if (j17 != 0) {
                                    break;
                                }
                                int i57 = z.f70071a;
                                jU = z.U(j17, 1000000L, jW2, RoundingMode.DOWN);
                                break;
                            }
                            i24++;
                        }
                        long j27 = jU;
                        int iA = rVar.A();
                        dVar = new d(jW2, j27, "" + ((char) (((iA >> 10) & 31) + 96)) + ((char) (((iA >> 5) & 31) + 96)) + ((char) ((iA & 31) + 96)));
                        cVarC = c1537bB4.c(Atom.TYPE_stsd);
                        if (cVarC != null) {
                            throw ParserException.createForMalformedContainer("Malformed sample table (stbl) missing sample description (stsd)", null);
                        }
                        gVarF = f(cVarC.f76508b, jVar.f176690a, jVar.f176692c, dVar.f176674c, lVar, z15);
                        if (!z14 || (c1537bB = c1537b3.b(Atom.TYPE_edts)) == null) {
                            jArr = null;
                            jArr2 = null;
                        } else {
                            ga.b.c cVarC6 = c1537bB.c(Atom.TYPE_elst);
                            if (cVarC6 == null) {
                                pairCreate = null;
                            } else {
                                fa.r rVar6 = cVarC6.f76508b;
                                rVar6.G(8);
                                int iC3 = c(rVar6.g());
                                int iY3 = rVar6.y();
                                long[] jArr9 = new long[iY3];
                                long[] jArr10 = new long[iY3];
                                int i58 = 0;
                                while (i58 < iY3) {
                                    jArr9[i58] = iC3 == 1 ? rVar6.z() : rVar6.w();
                                    jArr10[i58] = iC3 == 1 ? rVar6.o() : rVar6.g();
                                    if (rVar6.r() != 1) {
                                        vb.h.s("Unsupported media rate.");
                                        return null;
                                    }
                                    rVar6.H(2);
                                    i58++;
                                    iC3 = iC3;
                                    iY3 = iY3;
                                }
                                pairCreate = Pair.create(jArr9, jArr10);
                            }
                            if (pairCreate != null) {
                                long[] jArr11 = (long[]) pairCreate.first;
                                jArr2 = (long[]) pairCreate.second;
                                jArr = jArr11;
                            } else {
                                jArr = null;
                                jArr2 = null;
                            }
                        }
                        qVar = gVarF.f176679b;
                        if (qVar == null) {
                            oVar = null;
                        } else {
                            oVar = new o(jVar.f176690a, i14, dVar.f176672a, j16, jU2, dVar.f176673b, qVar, gVarF.f176681d, gVarF.f176678a, gVarF.f176680c, jArr, jArr2);
                        }
                    } else {
                        i15 = -65536;
                    }
                    if (iG3 == 0 && iG4 == i15) {
                        if (iG5 == 65536 && iG6 == 0) {
                            i16 = 270;
                        } else {
                            i15 = -65536;
                            if (iG3 != i15) {
                                i16 = 0;
                            } else {
                                i16 = 0;
                            }
                        }
                    } else if (iG3 != i15 && iG4 == 0 && iG5 == 0 && iG6 == i15) {
                        i16 = 180;
                    } else {
                        i16 = 0;
                    }
                    jVar = new j(iG2, jW, i16);
                    if (j8 == C.TIME_UNSET) {
                        j14 = jVar.f176691b;
                    } else {
                        j14 = j8;
                    }
                    j15 = d(cVarC2.f76508b).f76513c;
                    if (j14 == C.TIME_UNSET) {
                        j16 = j15;
                        jU2 = -9223372036854775807L;
                    } else {
                        int i59 = z.f70071a;
                        j16 = j15;
                        jU2 = z.U(j14, 1000000L, j16, RoundingMode.DOWN);
                    }
                    ga.b.C1537b c1537bB5 = c1537bB2.b(Atom.TYPE_minf);
                    c1537bB5.getClass();
                    ga.b.C1537b c1537bB6 = c1537bB5.b(Atom.TYPE_stbl);
                    c1537bB6.getClass();
                    ga.b.c cVarC7 = c1537bB2.c(Atom.TYPE_mdhd);
                    cVarC7.getClass();
                    rVar = cVarC7.f76508b;
                    rVar.G(8);
                    iC = c(rVar.g());
                    if (iC == 0) {
                        i17 = 8;
                    } else {
                        i17 = 16;
                    }
                    rVar.H(i17);
                    jW2 = rVar.w();
                    i18 = rVar.f70055b;
                    if (iC == 0) {
                        i19 = 4;
                    } else {
                        i19 = 8;
                    }
                    i24 = 0;
                    while (true) {
                        if (i24 < i19) {
                            rVar.H(i19);
                            break;
                        }
                        if (rVar.f70054a[i18 + i24] != -1) {
                            if (iC == 0) {
                                jZ = rVar.w();
                            } else {
                                jZ = rVar.z();
                            }
                            j17 = jZ;
                            if (j17 != 0) {
                                break;
                            }
                            int i510 = z.f70071a;
                            jU = z.U(j17, 1000000L, jW2, RoundingMode.DOWN);
                            break;
                        }
                        i24++;
                    }
                    long j28 = jU;
                    int iA2 = rVar.A();
                    dVar = new d(jW2, j28, "" + ((char) (((iA2 >> 10) & 31) + 96)) + ((char) (((iA2 >> 5) & 31) + 96)) + ((char) ((iA2 & 31) + 96)));
                    cVarC = c1537bB6.c(Atom.TYPE_stsd);
                    if (cVarC != null) {
                        throw ParserException.createForMalformedContainer("Malformed sample table (stbl) missing sample description (stsd)", null);
                    }
                    gVarF = f(cVarC.f76508b, jVar.f176690a, jVar.f176692c, dVar.f176674c, lVar, z15);
                    if (z14) {
                        jArr = null;
                        jArr2 = null;
                    } else {
                        jArr = null;
                        jArr2 = null;
                    }
                    qVar = gVarF.f176679b;
                    if (qVar == null) {
                        oVar = null;
                    } else {
                        oVar = new o(jVar.f176690a, i14, dVar.f176672a, j16, jU2, dVar.f176673b, qVar, gVarF.f176681d, gVarF.f176678a, gVarF.f176680c, jArr, jArr2);
                    }
                }
                o oVar3 = (o) function.apply(oVar);
                if (oVar3 != null) {
                    androidx.media3.common.q qVar2 = oVar3.f176797g;
                    ga.b.C1537b c1537bB7 = c1537b3.b(Atom.TYPE_mdia);
                    c1537bB7.getClass();
                    ga.b.C1537b c1537bB8 = c1537bB7.b(Atom.TYPE_minf);
                    c1537bB8.getClass();
                    ga.b.C1537b c1537bB9 = c1537bB8.b(Atom.TYPE_stbl);
                    c1537bB9.getClass();
                    ga.b.c cVarC8 = c1537bB9.c(Atom.TYPE_stsz);
                    if (cVarC8 != null) {
                        iVar = new h(cVarC8, qVar2);
                    } else {
                        ga.b.c cVarC9 = c1537bB9.c(Atom.TYPE_stz2);
                        if (cVarC9 == null) {
                            throw ParserException.createForMalformedContainer("Track has no sample table size information", null);
                        }
                        iVar = new i(cVarC9);
                    }
                    int sampleCount = iVar.getSampleCount();
                    if (sampleCount == 0) {
                        rVar2 = new r(oVar3, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                        arrayList4 = arrayList4;
                        i48 = i48;
                    } else {
                        if (oVar3.f176792b == 2) {
                            long j29 = oVar3.f176796f;
                            if (j29 > 0) {
                                androidx.media3.common.q.b bVarA = qVar2.a();
                                bVarA.f8420v = sampleCount / (j29 / 1000000.0f);
                                oVar3 = new o(oVar3.f176791a, oVar3.f176792b, oVar3.f176793c, oVar3.f176794d, oVar3.f176795e, oVar3.f176796f, bVarA.a(), oVar3.f176798h, oVar3.f176802l, oVar3.f176801k, oVar3.f176799i, oVar3.f176800j);
                            }
                        }
                        long j34 = oVar3.f176793c;
                        int i64 = oVar3.f176792b;
                        long[] jArr12 = oVar3.f176800j;
                        androidx.media3.common.q qVar3 = oVar3.f176797g;
                        long[] jArr13 = oVar3.f176799i;
                        ga.b.c cVarC10 = c1537bB9.c(Atom.TYPE_stco);
                        if (cVarC10 == null) {
                            cVarC10 = c1537bB9.c(Atom.TYPE_co64);
                            cVarC10.getClass();
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        fa.r rVar7 = cVarC10.f76508b;
                        ga.b.c cVarC11 = c1537bB9.c(Atom.TYPE_stsc);
                        cVarC11.getClass();
                        fa.r rVar8 = cVarC11.f76508b;
                        e eVar = iVar;
                        ga.b.c cVarC12 = c1537bB9.c(Atom.TYPE_stts);
                        cVarC12.getClass();
                        fa.r rVar9 = cVarC12.f76508b;
                        i48 = i48;
                        ga.b.c cVarC13 = c1537bB9.c(Atom.TYPE_stss);
                        fa.r rVar10 = cVarC13 != null ? cVarC13.f76508b : null;
                        ga.b.c cVarC14 = c1537bB9.c(Atom.TYPE_ctts);
                        fa.r rVar11 = cVarC14 != null ? cVarC14.f76508b : null;
                        a aVar = new a(rVar8, rVar7, z16);
                        rVar9.G(12);
                        int iY4 = rVar9.y() - 1;
                        int iY5 = rVar9.y();
                        int iY6 = rVar9.y();
                        if (rVar11 != null) {
                            rVar11.G(12);
                            iY = rVar11.y();
                        } else {
                            iY = 0;
                        }
                        if (rVar10 != null) {
                            rVar10.G(12);
                            int iY7 = rVar10.y();
                            if (iY7 > 0) {
                                iY2 = rVar10.y() - 1;
                                i25 = iY7;
                            } else {
                                i25 = iY7;
                                rVar10 = null;
                                iY2 = -1;
                            }
                        } else {
                            iY2 = -1;
                            i25 = 0;
                        }
                        int fixedSampleSize = eVar.getFixedSampleSize();
                        fa.r rVar12 = rVar11;
                        String str = qVar3.f8386n;
                        int i65 = qVar3.D;
                        if (fixedSampleSize == -1 || !((MimeTypes.AUDIO_RAW.equals(str) || MimeTypes.AUDIO_MLAW.equals(str) || MimeTypes.AUDIO_ALAW.equals(str)) && iY4 == 0 && iY == 0 && i25 == 0)) {
                            arrayList2 = arrayList4;
                            long[] jArr14 = new long[sampleCount];
                            int[] iArr13 = new int[sampleCount];
                            long[] jArr15 = new long[sampleCount];
                            int[] iArr14 = new int[sampleCount];
                            int iY8 = iY2;
                            int iY9 = iY5;
                            int i66 = iY4;
                            long j35 = 0;
                            long j36 = 0;
                            int iY10 = 0;
                            int i67 = 0;
                            int iG7 = 0;
                            int i68 = 0;
                            fa.r rVar13 = rVar10;
                            int iG8 = iY6;
                            int i69 = i25;
                            int i74 = 0;
                            while (true) {
                                if (i74 >= sampleCount) {
                                    int[] iArr15 = iArr13;
                                    i26 = iY10;
                                    jArr3 = jArr14;
                                    iArr = iArr14;
                                    sampleCount = sampleCount;
                                    jArr4 = jArr15;
                                    iArr2 = iArr15;
                                    break;
                                }
                                boolean zA = true;
                                while (i68 == 0) {
                                    zA = aVar.a();
                                    if (!zA) {
                                        break;
                                    }
                                    j36 = aVar.f176661d;
                                    i68 = aVar.f176660c;
                                    sampleCount = sampleCount;
                                    iY10 = iY10;
                                }
                                int i75 = sampleCount;
                                i26 = iY10;
                                if (!zA) {
                                    fa.k.g("Unexpected end of chunk data");
                                    long[] jArrCopyOf = Arrays.copyOf(jArr14, i74);
                                    int[] iArrCopyOf = Arrays.copyOf(iArr13, i74);
                                    long[] jArrCopyOf2 = Arrays.copyOf(jArr15, i74);
                                    int[] iArrCopyOf2 = Arrays.copyOf(iArr14, i74);
                                    jArr4 = jArrCopyOf2;
                                    iArr = iArrCopyOf2;
                                    sampleCount = i74;
                                    iArr2 = iArrCopyOf;
                                    jArr3 = jArrCopyOf;
                                    break;
                                }
                                iY10 = i26;
                                if (rVar12 != null) {
                                    while (iY10 == 0 && iY > 0) {
                                        iY10 = rVar12.y();
                                        iG7 = rVar12.g();
                                        iY--;
                                    }
                                    iY10--;
                                }
                                jArr14[i74] = j36;
                                int nextSampleSize = eVar.readNextSampleSize();
                                iArr13[i74] = nextSampleSize;
                                if (nextSampleSize > i67) {
                                    i67 = nextSampleSize;
                                }
                                jArr15[i74] = j35 + ((long) iG7);
                                iArr14[i74] = rVar13 == null ? 1 : 0;
                                if (i74 == iY8) {
                                    iArr14[i74] = 1;
                                    i69--;
                                    if (i69 > 0) {
                                        rVar13.getClass();
                                        iY8 = rVar13.y() - 1;
                                    }
                                }
                                j35 += (long) iG8;
                                iY9--;
                                if (iY9 == 0 && i66 > 0) {
                                    iY9 = rVar9.y();
                                    i66--;
                                    iG8 = rVar9.g();
                                }
                                j36 += (long) iArr13[i74];
                                i68--;
                                i74++;
                                jArr14 = jArr14;
                                iArr13 = iArr13;
                                sampleCount = i75;
                            }
                            int i76 = i68;
                            long j37 = j35 + ((long) iG7);
                            if (rVar12 == null) {
                                z17 = true;
                                break;
                            }
                            while (true) {
                                if (iY <= 0) {
                                    z17 = true;
                                    break;
                                }
                                if (rVar12.y() != 0) {
                                    z17 = false;
                                    break;
                                }
                                rVar12.g();
                                iY--;
                            }
                            if (i69 != 0 || iY9 != 0 || i76 != 0 || i66 != 0 || i26 != 0 || !z17) {
                                StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                                boolean z29 = z17;
                                e0.m(oVar3.f176791a, i69, ": remainingSynchronizationSamples ", ", remainingSamplesAtTimestampDelta ", sb3);
                                e0.m(iY9, i76, ", remainingSamplesInChunk ", ", remainingTimestampDeltaChanges ", sb3);
                                sb3.append(i66);
                                sb3.append(", remainingSamplesAtTimestampOffset ");
                                sb3.append(i26);
                                sb3.append(!z29 ? ", ctts invalid" : "");
                                fa.k.g(sb3.toString());
                            }
                            i27 = i67;
                            j18 = j37;
                            jArr5 = jArr3;
                        } else {
                            int i77 = aVar.f176658a;
                            long[] jArr16 = new long[i77];
                            int[] iArr16 = new int[i77];
                            while (aVar.a()) {
                                int i78 = aVar.f176659b;
                                jArr16[i78] = aVar.f176661d;
                                iArr16[i78] = aVar.f176660c;
                                arrayList4 = arrayList4;
                                fixedSampleSize = fixedSampleSize;
                            }
                            int i79 = fixedSampleSize;
                            arrayList2 = arrayList4;
                            long j38 = iY6;
                            int i84 = 8192 / i79;
                            int i85 = 0;
                            int iF = 0;
                            while (i85 < i77) {
                                iF += z.f(iArr16[i85], i84);
                                i85++;
                                j38 = j38;
                            }
                            long j39 = j38;
                            long[] jArr17 = new long[iF];
                            int[] iArr17 = new int[iF];
                            long[] jArr18 = new long[iF];
                            int[] iArr18 = new int[iF];
                            int i86 = 0;
                            int i87 = 0;
                            int i88 = 0;
                            int i89 = 0;
                            while (i86 < i77) {
                                int i93 = iArr16[i86];
                                long j44 = jArr16[i86];
                                int i94 = i86;
                                int i95 = i93;
                                int i96 = i77;
                                int iMax = i89;
                                while (i95 > 0) {
                                    int iMin = Math.min(i84, i95);
                                    jArr17[i88] = j44;
                                    int i97 = i95;
                                    int i98 = i79 * iMin;
                                    iArr17[i88] = i98;
                                    iMax = Math.max(iMax, i98);
                                    jArr18[i88] = ((long) i87) * j39;
                                    iArr18[i88] = 1;
                                    j44 += (long) iArr17[i88];
                                    i87 += iMin;
                                    i88++;
                                    jArr16 = jArr16;
                                    i95 = i97 - iMin;
                                    i84 = i84;
                                }
                                i89 = iMax;
                                i86 = i94 + 1;
                                i77 = i96;
                                i84 = i84;
                            }
                            vb.e eVar2 = new vb.e(jArr17, iArr17, i89, jArr18, iArr18, j39 * ((long) i87));
                            long[] jArr19 = eVar2.f176698a;
                            iArr2 = eVar2.f176699b;
                            int i99 = eVar2.f176700c;
                            jArr4 = eVar2.f176701d;
                            iArr = eVar2.f176702e;
                            j18 = eVar2.f176703f;
                            i27 = i99;
                            jArr5 = jArr19;
                        }
                        int[] iArr19 = iArr2;
                        long j45 = oVar3.f176793c;
                        int i100 = z.f70071a;
                        RoundingMode roundingMode = RoundingMode.DOWN;
                        long jU4 = z.U(j18, 1000000L, j45, roundingMode);
                        if (jArr13 == 0) {
                            z.T(jArr4, j34);
                            rVar3 = new r(oVar3, jArr5, iArr19, i27, jArr4, iArr, jU4);
                        } else {
                            long[] jArr20 = jArr13;
                            int[] iArr20 = iArr;
                            if (jArr20.length == 1 && i64 == 1 && jArr4.length >= 2) {
                                jArr12.getClass();
                                long j46 = jArr12[0];
                                long jU5 = z.U(jArr20[0], oVar3.f176793c, oVar3.f176794d, roundingMode) + j46;
                                int length = jArr4.length - 1;
                                int i101 = z.i(4, 0, length);
                                int i102 = z.i(jArr4.length - 4, 0, length);
                                long j47 = jArr4[0];
                                if (j47 <= j46 && j46 < jArr4[i101] && jArr4[i102] < jU5 && jU5 <= j18) {
                                    long j48 = j46 - j47;
                                    long j49 = i65;
                                    long jU6 = z.U(j48, j49, oVar3.f176793c, roundingMode);
                                    long jU7 = z.U(j18 - jU5, j49, oVar3.f176793c, roundingMode);
                                    if ((jU6 != 0 || jU7 != 0) && jU6 <= 2147483647L && jU7 <= 2147483647L) {
                                        yVar.f17274a = (int) jU6;
                                        yVar.f17275b = (int) jU7;
                                        z.T(jArr4, j34);
                                        rVar3 = new r(oVar3, jArr5, iArr19, i27, jArr4, iArr20, z.U(jArr20[0], 1000000L, oVar3.f176794d, roundingMode));
                                    }
                                    arrayList4.add(rVar2);
                                }
                            }
                            int i103 = 1;
                            if (jArr20.length != 1) {
                                jArr6 = jArr5;
                                iArr3 = iArr19;
                                if (i64 == i103) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                iArr4 = new int[jArr20.length];
                                iArr5 = new int[jArr20.length];
                                jArr12.getClass();
                                i28 = 0;
                                z19 = false;
                                i29 = 0;
                                i30 = 0;
                                while (i28 < jArr20.length) {
                                    iArr11 = iArr5;
                                    i39 = i28;
                                    j25 = jArr12[i39];
                                    if (j25 != -1) {
                                        iArr12 = iArr11;
                                        long jU8 = z.U(jArr20[i39], oVar3.f176793c, oVar3.f176794d, RoundingMode.DOWN);
                                        iArr4[i39] = z.e(jArr4, j25, true);
                                        while (true) {
                                            i44 = iArr4[i39];
                                            if (i44 < 0 || (iArr20[i44] & 1) != 0) {
                                                break;
                                            }
                                            iArr4[i39] = i44 - 1;
                                        }
                                        j26 = j25 + jU8;
                                        iArr12[i39] = z.a(jArr4, j26, z18);
                                        if (i64 == 2) {
                                            while (true) {
                                                i46 = iArr12[i39];
                                                if (i46 < jArr4.length - 1) {
                                                    break;
                                                }
                                                i47 = i46 + 1;
                                                if (jArr4[i47] <= j26) {
                                                    break;
                                                }
                                                iArr12[i39] = i47;
                                            }
                                        }
                                        int i104 = iArr12[i39];
                                        i45 = iArr4[i39];
                                        int i105 = (i104 - i45) + i29;
                                        if (i30 != i45) {
                                            z28 = true;
                                        } else {
                                            z28 = false;
                                        }
                                        i30 = i104;
                                        z19 = z28 | z19;
                                        i29 = i105;
                                    } else {
                                        iArr12 = iArr11;
                                    }
                                    i28 = i39 + 1;
                                    iArr3 = iArr3;
                                    iArr5 = iArr12;
                                }
                                iArr6 = iArr3;
                                iArr7 = iArr5;
                                if (i29 != sampleCount) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                z25 = z19 | z24;
                                if (z25) {
                                    jArr7 = new long[i29];
                                } else {
                                    jArr7 = jArr6;
                                }
                                if (z25) {
                                    iArr8 = new int[i29];
                                } else {
                                    iArr8 = iArr6;
                                }
                                if (z25) {
                                    i27 = 0;
                                }
                                if (z25) {
                                    iArr9 = new int[i29];
                                } else {
                                    iArr9 = iArr20;
                                }
                                jArr8 = new long[i29];
                                i34 = i27;
                                i35 = 0;
                                z26 = false;
                                i36 = 0;
                                j19 = 0;
                                while (i35 < jArr20.length) {
                                    j24 = jArr12[i35];
                                    i37 = iArr4[i35];
                                    i38 = iArr7[i35];
                                    z27 = z25;
                                    if (z25) {
                                        int i106 = i38 - i37;
                                        System.arraycopy(jArr6, i37, jArr7, i36, i106);
                                        iArr10 = iArr6;
                                        System.arraycopy(iArr10, i37, iArr8, i36, i106);
                                        System.arraycopy(iArr20, i37, iArr9, i36, i106);
                                    } else {
                                        iArr10 = iArr6;
                                    }
                                    int i107 = i34;
                                    while (i37 < i38) {
                                        int[] iArr21 = iArr10;
                                        long[] jArr21 = jArr20;
                                        long j54 = oVar3.f176794d;
                                        RoundingMode roundingMode2 = RoundingMode.DOWN;
                                        long jU9 = z.U(j19, 1000000L, j54, roundingMode2);
                                        jU3 = z.U(jArr4[i37] - j24, 1000000L, oVar3.f176793c, roundingMode2);
                                        if (jU3 < 0) {
                                            z26 = true;
                                        }
                                        jArr8[i36] = jU9 + jU3;
                                        if (!z27 && iArr8[i36] > i107) {
                                            i107 = iArr21[i37];
                                        }
                                        i36++;
                                        i37++;
                                        iArr10 = iArr21;
                                        jArr20 = jArr21;
                                    }
                                    iArr6 = iArr10;
                                    long[] jArr22 = jArr20;
                                    j19 += jArr22[i35];
                                    i35++;
                                    i34 = i107;
                                    z25 = z27;
                                    jArr20 = jArr22;
                                    jArr7 = jArr7;
                                }
                                long[] jArr23 = jArr7;
                                long jU10 = z.U(j19, 1000000L, oVar3.f176794d, RoundingMode.DOWN);
                                if (z26) {
                                    androidx.media3.common.q.b bVarA2 = qVar3.a();
                                    bVarA2.f8417s = true;
                                    oVar2 = new o(oVar3.f176791a, oVar3.f176792b, oVar3.f176793c, oVar3.f176794d, oVar3.f176795e, oVar3.f176796f, bVarA2.a(), oVar3.f176798h, oVar3.f176802l, oVar3.f176801k, oVar3.f176799i, oVar3.f176800j);
                                } else {
                                    oVar2 = oVar3;
                                }
                                arrayList4 = arrayList2;
                                rVar2 = new r(oVar2, jArr23, iArr8, i34, jArr8, iArr9, jU10);
                            } else if (jArr20[0] == 0) {
                                jArr12.getClass();
                                long j55 = jArr12[0];
                                for (int i108 = 0; i108 < jArr4.length; i108++) {
                                    jArr4[i108] = z.U(jArr4[i108] - j55, 1000000L, oVar3.f176793c, RoundingMode.DOWN);
                                }
                                rVar2 = new r(oVar3, jArr5, iArr19, i27, jArr4, iArr20, z.U(j18 - j55, 1000000L, oVar3.f176793c, RoundingMode.DOWN));
                                arrayList4 = arrayList2;
                            } else {
                                i103 = 1;
                                jArr6 = jArr5;
                                iArr3 = iArr19;
                                if (i64 == i103) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                iArr4 = new int[jArr20.length];
                                iArr5 = new int[jArr20.length];
                                jArr12.getClass();
                                i28 = 0;
                                z19 = false;
                                i29 = 0;
                                i30 = 0;
                                while (i28 < jArr20.length) {
                                    iArr11 = iArr5;
                                    i39 = i28;
                                    j25 = jArr12[i39];
                                    if (j25 != -1) {
                                        iArr12 = iArr11;
                                        long jU11 = z.U(jArr20[i39], oVar3.f176793c, oVar3.f176794d, RoundingMode.DOWN);
                                        iArr4[i39] = z.e(jArr4, j25, true);
                                        while (true) {
                                            i44 = iArr4[i39];
                                            if (i44 < 0) {
                                                break;
                                            }
                                            break;
                                            break;
                                            iArr4[i39] = i44 - 1;
                                        }
                                        j26 = j25 + jU11;
                                        iArr12[i39] = z.a(jArr4, j26, z18);
                                        if (i64 == 2) {
                                            while (true) {
                                                i46 = iArr12[i39];
                                                if (i46 < jArr4.length - 1) {
                                                    break;
                                                    break;
                                                }
                                                i47 = i46 + 1;
                                                if (jArr4[i47] <= j26) {
                                                    break;
                                                    break;
                                                }
                                                iArr12[i39] = i47;
                                            }
                                        }
                                        int i109 = iArr12[i39];
                                        i45 = iArr4[i39];
                                        int i1010 = (i109 - i45) + i29;
                                        if (i30 != i45) {
                                            z28 = true;
                                        } else {
                                            z28 = false;
                                        }
                                        i30 = i109;
                                        z19 = z28 | z19;
                                        i29 = i1010;
                                    } else {
                                        iArr12 = iArr11;
                                    }
                                    i28 = i39 + 1;
                                    iArr3 = iArr3;
                                    iArr5 = iArr12;
                                }
                                iArr6 = iArr3;
                                iArr7 = iArr5;
                                if (i29 != sampleCount) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                z25 = z19 | z24;
                                if (z25) {
                                    jArr7 = new long[i29];
                                } else {
                                    jArr7 = jArr6;
                                }
                                if (z25) {
                                    iArr8 = new int[i29];
                                } else {
                                    iArr8 = iArr6;
                                }
                                if (z25) {
                                    i27 = 0;
                                }
                                if (z25) {
                                    iArr9 = new int[i29];
                                } else {
                                    iArr9 = iArr20;
                                }
                                jArr8 = new long[i29];
                                i34 = i27;
                                i35 = 0;
                                z26 = false;
                                i36 = 0;
                                j19 = 0;
                                while (i35 < jArr20.length) {
                                    j24 = jArr12[i35];
                                    i37 = iArr4[i35];
                                    i38 = iArr7[i35];
                                    z27 = z25;
                                    if (z25) {
                                        int i1011 = i38 - i37;
                                        System.arraycopy(jArr6, i37, jArr7, i36, i1011);
                                        iArr10 = iArr6;
                                        System.arraycopy(iArr10, i37, iArr8, i36, i1011);
                                        System.arraycopy(iArr20, i37, iArr9, i36, i1011);
                                    } else {
                                        iArr10 = iArr6;
                                    }
                                    int i1012 = i34;
                                    while (i37 < i38) {
                                        int[] iArr22 = iArr10;
                                        long[] jArr24 = jArr20;
                                        long j56 = oVar3.f176794d;
                                        RoundingMode roundingMode3 = RoundingMode.DOWN;
                                        long jU12 = z.U(j19, 1000000L, j56, roundingMode3);
                                        jU3 = z.U(jArr4[i37] - j24, 1000000L, oVar3.f176793c, roundingMode3);
                                        if (jU3 < 0) {
                                            z26 = true;
                                        }
                                        jArr8[i36] = jU12 + jU3;
                                        if (!z27) {
                                        }
                                        i36++;
                                        i37++;
                                        iArr10 = iArr22;
                                        jArr20 = jArr24;
                                    }
                                    iArr6 = iArr10;
                                    long[] jArr25 = jArr20;
                                    j19 += jArr25[i35];
                                    i35++;
                                    i34 = i1012;
                                    z25 = z27;
                                    jArr20 = jArr25;
                                    jArr7 = jArr7;
                                }
                                long[] jArr26 = jArr7;
                                long jU13 = z.U(j19, 1000000L, oVar3.f176794d, RoundingMode.DOWN);
                                if (z26) {
                                    androidx.media3.common.q.b bVarA3 = qVar3.a();
                                    bVarA3.f8417s = true;
                                    oVar2 = new o(oVar3.f176791a, oVar3.f176792b, oVar3.f176793c, oVar3.f176794d, oVar3.f176795e, oVar3.f176796f, bVarA3.a(), oVar3.f176798h, oVar3.f176802l, oVar3.f176801k, oVar3.f176799i, oVar3.f176800j);
                                } else {
                                    oVar2 = oVar3;
                                }
                                arrayList4 = arrayList2;
                                rVar2 = new r(oVar2, jArr26, iArr8, i34, jArr8, iArr9, jU13);
                            }
                            arrayList4.add(rVar2);
                        }
                        rVar2 = rVar3;
                        arrayList4 = arrayList2;
                    }
                    arrayList4.add(rVar2);
                }
                i48++;
                arrayList4 = arrayList4;
                arrayList3 = arrayList;
                c1537b2 = c1537b;
            }
            i48++;
            arrayList4 = arrayList4;
            arrayList3 = arrayList;
            c1537b2 = c1537b;
        }
        return arrayList4;
    }

    /* JADX WARN: Code duplicated, block: B:214:0x0471 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:215:0x0473  */
    /* JADX WARN: Code duplicated, block: B:216:0x0476  */
    /* JADX WARN: Code duplicated, block: B:219:0x047c  */
    /* JADX WARN: Code duplicated, block: B:220:0x047f  */
    /* JADX WARN: Code duplicated, block: B:289:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:290:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:351:0x077b  */
    public static void h(fa.r rVar, int i14, int i15, int i16, int i17, int i18, androidx.media3.common.l lVar, g gVar, int i19) throws ParserException {
        String str;
        int i24;
        String str2;
        int i25;
        androidx.media3.common.l lVar2;
        List<byte[]> list;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int iG;
        int i34;
        androidx.media3.common.i iVarA;
        int i35;
        int iG2;
        int i36;
        int i37;
        c cVar;
        String str3;
        c cVar2;
        int i38 = i15;
        int i39 = i16;
        androidx.media3.common.l lVarB = lVar;
        g gVar2 = gVar;
        rVar.G(i38 + 16);
        rVar.H(16);
        int iA = rVar.A();
        int iA2 = rVar.A();
        rVar.H(50);
        int i44 = rVar.f70055b;
        int iIntValue = i14;
        if (iIntValue == 1701733238) {
            Pair<Integer, p> pairE = e(rVar, i38, i39);
            if (pairE != null) {
                iIntValue = ((Integer) pairE.first).intValue();
                lVarB = lVarB == null ? null : lVarB.b(((p) pairE.second).f176804b);
                gVar2.f176678a[i19] = (p) pairE.second;
            }
            rVar.G(i44);
        }
        String str4 = MimeTypes.VIDEO_H263;
        if (iIntValue == 1831958048) {
            str = MimeTypes.VIDEO_MPEG;
        } else {
            str = iIntValue == 1211250227 ? MimeTypes.VIDEO_H263 : null;
        }
        float fY = 1.0f;
        List<byte[]> listOf = null;
        String str5 = null;
        byte[] bArrCopyOfRange = null;
        int i45 = -1;
        int i46 = -1;
        int iG3 = -1;
        int i47 = -1;
        int iH = -1;
        ByteBuffer byteBufferOrder = null;
        int i48 = 8;
        int i49 = 8;
        C3299b c3299b = null;
        ga.e.k kVar = null;
        boolean z14 = false;
        while (i44 - i38 < i39) {
            rVar.G(i44);
            int i54 = rVar.f70055b;
            int iG4 = rVar.g();
            if (iG4 == 0 && rVar.f70055b - i38 == i39) {
                break;
            }
            String str6 = "childAtomSize must be positive";
            bb.q.a(iG4 > 0, "childAtomSize must be positive");
            int iG5 = rVar.g();
            if (iG5 == 1635148611) {
                bb.q.a(str == null, null);
                rVar.G(i54 + 8);
                bb.d dVarA = bb.d.a(rVar);
                listOf = dVarA.f17132a;
                gVar2.f176680c = dVarA.f17133b;
                if (!z14) {
                    fY = dVarA.f17142k;
                }
                String str7 = dVarA.f17143l;
                int i55 = dVarA.f17141j;
                int i56 = dVarA.f17138g;
                int i57 = dVarA.f17139h;
                str5 = str7;
                int i58 = dVarA.f17140i;
                int i59 = dVarA.f17136e;
                i49 = dVarA.f17137f;
                i25 = i59;
                lVar2 = lVarB;
                i24 = i44;
                iIntValue = iIntValue;
                str2 = str4;
                i47 = i57;
                iH = i58;
                i46 = i55;
                str = MimeTypes.VIDEO_H264;
                iG3 = i56;
            } else {
                i24 = i44;
                if (iG5 == 1752589123) {
                    bb.q.a(str == null, null);
                    rVar.G(i54 + 8);
                    bb.z zVarA = bb.z.a(rVar, false, null);
                    listOf = zVarA.f17276a;
                    gVar2.f176680c = zVarA.f17277b;
                    if (!z14) {
                        fY = zVarA.f17284i;
                    }
                    int i64 = zVarA.f17285j;
                    String str8 = zVarA.f17286k;
                    int i65 = zVarA.f17283h;
                    if (i65 != -1) {
                        i45 = i65;
                    }
                    int i66 = zVarA.f17280e;
                    int i67 = zVarA.f17281f;
                    int i68 = zVarA.f17282g;
                    int i69 = zVarA.f17278c;
                    i49 = zVarA.f17279d;
                    lVar2 = lVarB;
                    kVar = zVarA.f17287l;
                    iIntValue = iIntValue;
                    str2 = str4;
                    i47 = i67;
                    iH = i68;
                    i25 = i69;
                    str = MimeTypes.VIDEO_H265;
                    iG3 = i66;
                    i46 = i64;
                    str5 = str8;
                } else {
                    str2 = str4;
                    if (iG5 == 1818785347) {
                        bb.q.a(MimeTypes.VIDEO_H265.equals(str), "lhvC must follow hvcC atom");
                        ga.e.k kVar2 = kVar;
                        bb.q.a(kVar2 != null && kVar2.f76553a.size() >= 2, "must have at least two layers");
                        rVar.G(i54 + 8);
                        kVar2.getClass();
                        bb.z zVarA2 = bb.z.a(rVar, true, kVar2);
                        bb.q.a(gVar2.f176680c == zVarA2.f17277b, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                        int i74 = zVarA2.f17280e;
                        int i75 = iG3;
                        if (i74 != -1) {
                            bb.q.a(i75 == i74, "colorSpace must be the same for both views");
                        }
                        int i76 = zVarA2.f17281f;
                        int i77 = i47;
                        if (i76 != -1) {
                            bb.q.a(i77 == i76, "colorRange must be the same for both views");
                        }
                        int i78 = zVarA2.f17282g;
                        int i79 = iH;
                        if (i78 != -1) {
                            bb.q.a(i79 == i78, "colorTransfer must be the same for both views");
                        }
                        int i84 = i48;
                        bb.q.a(i84 == zVarA2.f17278c, "bitdepthLuma must be the same for both views");
                        int i85 = i49;
                        bb.q.a(i85 == zVarA2.f17279d, "bitdepthChroma must be the same for both views");
                        if (listOf != null) {
                            listOf = ImmutableList.builder().addAll((Iterable) listOf).addAll((Iterable) zVarA2.f17276a).build();
                        } else {
                            bb.q.a(false, "initializationData must be already set from hvcC atom");
                        }
                        kVar = kVar2;
                        lVar2 = lVarB;
                        str = "video/mv-hevc";
                        i47 = i77;
                        iIntValue = iIntValue;
                        iH = i79;
                        i25 = i84;
                        i49 = i85;
                        iG3 = i75;
                        str5 = zVarA2.f17286k;
                    } else {
                        iG3 = iG3;
                        int i86 = i47;
                        int i87 = iH;
                        i25 = i48;
                        int i88 = i49;
                        kVar = kVar;
                        str = str;
                        if (iG5 == 1986361461) {
                            rVar.G(i54 + 8);
                            int i89 = rVar.f70055b;
                            c cVar3 = null;
                            while (i89 - i54 < iG4) {
                                rVar.G(i89);
                                int iG6 = rVar.g();
                                int i93 = i89;
                                bb.q.a(iG6 > 0, str6);
                                if (rVar.g() == 1702454643) {
                                    rVar.G(i93 + 8);
                                    int i94 = rVar.f70055b;
                                    while (true) {
                                        if (i94 - i93 >= iG6) {
                                            str3 = str6;
                                            cVar2 = null;
                                            break;
                                        }
                                        rVar.G(i94);
                                        int iG7 = rVar.g();
                                        bb.q.a(iG7 > 0, str6);
                                        str3 = str6;
                                        if (rVar.g() == 1937011305) {
                                            rVar.H(4);
                                            int iU = rVar.u();
                                            cVar2 = new c(new f((iU & 1) == 1, (iU & 2) == 2, (iU & 8) == 8, (iU & 4) == 4));
                                            break;
                                        }
                                        i94 += iG7;
                                        str6 = str3;
                                    }
                                    cVar3 = cVar2;
                                } else {
                                    str3 = str6;
                                    lVarB = lVarB;
                                    iG6 = iG6;
                                    listOf = listOf;
                                }
                                i89 = i93 + iG6;
                                str6 = str3;
                                listOf = listOf;
                                lVarB = lVarB;
                            }
                            lVar2 = lVarB;
                            list = listOf;
                            k kVar3 = cVar3 == null ? null : new k(cVar3);
                            if (kVar3 == null || (cVar = kVar3.f176693a) == null) {
                                i37 = i45;
                                i45 = i37;
                            } else {
                                f fVar = cVar.f176671a;
                                if (kVar == null || kVar.f76553a.size() < 2) {
                                    i37 = i45;
                                    if (i37 == -1) {
                                        i45 = fVar.f176677c ? 5 : 4;
                                    } else {
                                        i45 = i37;
                                    }
                                } else {
                                    bb.q.a(fVar.f176675a && fVar.f176676b, "both eye views must be marked as available");
                                    bb.q.a(!fVar.f176677c, "for MV-HEVC, eye_views_reversed must be set to false");
                                    i37 = i45;
                                    i45 = i37;
                                }
                            }
                        } else {
                            lVar2 = lVarB;
                            list = listOf;
                            int i95 = i45;
                            if (iG5 == 1685480259 || iG5 == 1685485123) {
                                i45 = i95;
                                iIntValue = iIntValue;
                                bb.l lVarA = bb.l.a(rVar);
                                if (lVarA != null) {
                                    String str9 = lVarA.f17214a;
                                    str = MimeTypes.VIDEO_DOLBY_VISION;
                                    str5 = str9;
                                } else {
                                    str = str;
                                }
                                iH = i87;
                                kVar = kVar;
                            } else {
                                int i96 = 12;
                                if (iG5 == 1987076931) {
                                    bb.q.a(str == null, null);
                                    String str10 = iIntValue == 1987063864 ? MimeTypes.VIDEO_VP8 : MimeTypes.VIDEO_VP9;
                                    rVar.G(i54 + 12);
                                    byte bU = (byte) rVar.u();
                                    byte bU2 = (byte) rVar.u();
                                    int iU2 = rVar.u();
                                    int i97 = iU2 >> 4;
                                    byte b14 = (byte) ((iU2 >> 1) & 7);
                                    if (str10.equals(MimeTypes.VIDEO_VP9)) {
                                        byte[] bArr = fa.d.f70005a;
                                        listOf = ImmutableList.of(new byte[]{1, 1, bU, 2, 1, bU2, 3, 1, (byte) i97, 4, 1, b14});
                                    } else {
                                        listOf = list;
                                    }
                                    boolean z15 = (iU2 & 1) != 0;
                                    int iU3 = rVar.u();
                                    int iU4 = rVar.u();
                                    int iG8 = androidx.media3.common.i.g(iU3);
                                    i47 = z15 ? 1 : 2;
                                    iH = androidx.media3.common.i.h(iU4);
                                    str = str10;
                                    kVar = kVar;
                                    i45 = i95;
                                    iG3 = iG8;
                                    iIntValue = iIntValue;
                                    i49 = i97;
                                    i25 = i49;
                                } else {
                                    int i98 = 7;
                                    if (iG5 == 1635135811) {
                                        int i99 = iG4 - 8;
                                        byte[] bArr2 = new byte[i99];
                                        rVar.e(bArr2, 0, i99);
                                        ImmutableList immutableListOf = ImmutableList.of(bArr2);
                                        rVar.G(i54 + 8);
                                        androidx.media3.common.i.b bVar = new androidx.media3.common.i.b();
                                        fa.q qVar = new fa.q(rVar.f70054a);
                                        qVar.m(rVar.f70055b * 8);
                                        qVar.p(1);
                                        int iG9 = qVar.g(3);
                                        qVar.o(6);
                                        boolean zF = qVar.f();
                                        boolean zF2 = qVar.f();
                                        int i100 = 2;
                                        if (iG9 != 2) {
                                            if (iG9 <= i100) {
                                                if (zF) {
                                                    i28 = 10;
                                                } else {
                                                    i28 = 8;
                                                }
                                                bVar.f8326e = i28;
                                                if (zF) {
                                                    i29 = 10;
                                                } else {
                                                    i29 = 8;
                                                }
                                                bVar.f8327f = i29;
                                            }
                                        } else if (zF) {
                                            bVar.f8326e = zF2 ? 12 : 10;
                                            bVar.f8327f = zF2 ? 12 : 10;
                                        } else {
                                            i100 = 2;
                                            if (iG9 <= i100) {
                                                if (zF) {
                                                    i28 = 10;
                                                } else {
                                                    i28 = 8;
                                                }
                                                bVar.f8326e = i28;
                                                if (zF) {
                                                    i29 = 10;
                                                } else {
                                                    i29 = 8;
                                                }
                                                bVar.f8327f = i29;
                                            }
                                        }
                                        qVar.o(13);
                                        qVar.n();
                                        int iG10 = qVar.g(4);
                                        if (iG10 != 1) {
                                            fa.k.f("Unsupported obu_type: " + iG10);
                                            iVarA = bVar.a();
                                        } else if (qVar.f()) {
                                            fa.k.f("Unsupported obu_extension_flag");
                                            iVarA = bVar.a();
                                        } else {
                                            boolean zF3 = qVar.f();
                                            qVar.n();
                                            if (!zF3 || qVar.g(8) <= 127) {
                                                int iG11 = qVar.g(3);
                                                qVar.n();
                                                if (qVar.f()) {
                                                    fa.k.f("Unsupported reduced_still_picture_header");
                                                    iVarA = bVar.a();
                                                } else if (qVar.f()) {
                                                    fa.k.f("Unsupported timing_info_present_flag");
                                                    iVarA = bVar.a();
                                                } else if (qVar.f()) {
                                                    fa.k.f("Unsupported initial_display_delay_present_flag");
                                                    iVarA = bVar.a();
                                                } else {
                                                    int i101 = 5;
                                                    int iG12 = qVar.g(5);
                                                    int i102 = 0;
                                                    while (i102 <= iG12) {
                                                        qVar.o(i96);
                                                        if (qVar.g(i101) > i98) {
                                                            qVar.n();
                                                        }
                                                        i102++;
                                                        i101 = 5;
                                                        i96 = 12;
                                                        i98 = 7;
                                                    }
                                                    int iG13 = qVar.g(4);
                                                    int iG14 = qVar.g(4);
                                                    qVar.o(iG13 + 1);
                                                    qVar.o(iG14 + 1);
                                                    if (qVar.f()) {
                                                        qVar.o(7);
                                                    }
                                                    qVar.o(7);
                                                    boolean zF4 = qVar.f();
                                                    if (zF4) {
                                                        qVar.o(2);
                                                    }
                                                    if (qVar.f()) {
                                                        i30 = 1;
                                                        iG = 2;
                                                    } else {
                                                        i30 = 1;
                                                        iG = qVar.g(1);
                                                    }
                                                    if (iG > 0 && !qVar.f()) {
                                                        qVar.o(i30);
                                                    }
                                                    if (zF4) {
                                                        i34 = 3;
                                                        qVar.o(3);
                                                    } else {
                                                        i34 = 3;
                                                    }
                                                    qVar.o(i34);
                                                    boolean zF5 = qVar.f();
                                                    if (iG11 == 2 && zF5) {
                                                        qVar.n();
                                                    }
                                                    boolean z16 = iG11 != 1 && qVar.f();
                                                    if (qVar.f()) {
                                                        int iG15 = qVar.g(8);
                                                        int iG16 = qVar.g(8);
                                                        int iG17 = qVar.g(8);
                                                        if (z16) {
                                                            i35 = 1;
                                                        } else {
                                                            i35 = 1;
                                                            if (iG15 == 1 && iG16 == 13 && iG17 == 0) {
                                                                iG2 = 1;
                                                            }
                                                            bVar.f8322a = androidx.media3.common.i.g(iG15);
                                                            if (iG2 == i35) {
                                                                i36 = 1;
                                                            } else {
                                                                i36 = 2;
                                                            }
                                                            bVar.f8323b = i36;
                                                            bVar.f8324c = androidx.media3.common.i.h(iG16);
                                                        }
                                                        iG2 = qVar.g(i35);
                                                        bVar.f8322a = androidx.media3.common.i.g(iG15);
                                                        if (iG2 == i35) {
                                                            i36 = 1;
                                                        } else {
                                                            i36 = 2;
                                                        }
                                                        bVar.f8323b = i36;
                                                        bVar.f8324c = androidx.media3.common.i.h(iG16);
                                                    }
                                                    iVarA = bVar.a();
                                                }
                                            } else {
                                                fa.k.f("Excessive obu_size");
                                                iVarA = bVar.a();
                                            }
                                        }
                                        int i103 = iVarA.f8319e;
                                        int i104 = iVarA.f8320f;
                                        int i105 = iVarA.f8315a;
                                        int i106 = iVarA.f8316b;
                                        listOf = immutableListOf;
                                        kVar = kVar;
                                        i45 = i95;
                                        iH = iVarA.f8317c;
                                        i25 = i103;
                                        i49 = i104;
                                        iG3 = i105;
                                        iIntValue = iIntValue;
                                        i47 = i106;
                                        str = MimeTypes.VIDEO_AV1;
                                    } else if (iG5 == 1668050025) {
                                        if (byteBufferOrder == null) {
                                            byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                        }
                                        ByteBuffer byteBuffer = byteBufferOrder;
                                        byteBuffer.position(21);
                                        byteBuffer.putShort(rVar.r());
                                        byteBuffer.putShort(rVar.r());
                                        byteBufferOrder = byteBuffer;
                                        i45 = i95;
                                    } else if (iG5 == 1835295606) {
                                        if (byteBufferOrder == null) {
                                            byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                        }
                                        ByteBuffer byteBuffer2 = byteBufferOrder;
                                        short sR = rVar.r();
                                        short sR2 = rVar.r();
                                        short sR3 = rVar.r();
                                        short sR4 = rVar.r();
                                        short sR5 = rVar.r();
                                        short sR6 = rVar.r();
                                        short sR7 = rVar.r();
                                        short sR8 = rVar.r();
                                        long jW = rVar.w();
                                        long jW2 = rVar.w();
                                        byteBuffer2.position(1);
                                        byteBuffer2.putShort(sR5);
                                        byteBuffer2.putShort(sR6);
                                        byteBuffer2.putShort(sR);
                                        byteBuffer2.putShort(sR2);
                                        byteBuffer2.putShort(sR3);
                                        byteBuffer2.putShort(sR4);
                                        byteBuffer2.putShort(sR7);
                                        byteBuffer2.putShort(sR8);
                                        byteBuffer2.putShort((short) (jW / AbstractComponentTracker.LINGERING_TIMEOUT));
                                        byteBuffer2.putShort((short) (jW2 / AbstractComponentTracker.LINGERING_TIMEOUT));
                                        byteBufferOrder = byteBuffer2;
                                        kVar = kVar;
                                        i45 = i95;
                                        i47 = i86;
                                        iH = i87;
                                        i49 = i88;
                                        listOf = list;
                                    } else {
                                        kVar = kVar;
                                        i45 = i95;
                                        iIntValue = iIntValue;
                                        if (iG5 == 1681012275) {
                                            bb.q.a(str == null, null);
                                            str = str2;
                                        } else if (iG5 == 1702061171) {
                                            bb.q.a(str == null, null);
                                            C3299b c3299bA = a(i54, rVar);
                                            String str11 = c3299bA.f176667a;
                                            byte[] bArr3 = c3299bA.f176668b;
                                            listOf = bArr3 != null ? ImmutableList.of(bArr3) : list;
                                            c3299b = c3299bA;
                                            str = str11;
                                            iG3 = iG3;
                                            kVar = kVar;
                                            i45 = i45;
                                            i47 = i86;
                                            iH = i87;
                                            i49 = i88;
                                        } else if (iG5 == 1885434736) {
                                            rVar.G(i54 + 8);
                                            fY = rVar.y() / rVar.y();
                                            iG3 = iG3;
                                            kVar = kVar;
                                            str = str;
                                            i45 = i45;
                                            i47 = i86;
                                            iH = i87;
                                            i49 = i88;
                                            listOf = list;
                                            z14 = true;
                                        } else if (iG5 == 1937126244) {
                                            int i107 = i54 + 8;
                                            while (true) {
                                                if (i107 - i54 >= iG4) {
                                                    bArrCopyOfRange = null;
                                                    break;
                                                }
                                                rVar.G(i107);
                                                int iG18 = rVar.g();
                                                if (rVar.g() == 1886547818) {
                                                    bArrCopyOfRange = Arrays.copyOfRange(rVar.f70054a, i107, iG18 + i107);
                                                    break;
                                                }
                                                i107 += iG18;
                                            }
                                            str = str;
                                        } else if (iG5 == 1936995172) {
                                            int iU5 = rVar.u();
                                            rVar.H(3);
                                            if (iU5 != 0) {
                                                i27 = i45;
                                            } else {
                                                int iU6 = rVar.u();
                                                if (iU6 != 0) {
                                                    i27 = 1;
                                                    if (iU6 != 1) {
                                                        if (iU6 == 2) {
                                                            i27 = 2;
                                                        } else if (iU6 != 3) {
                                                            i27 = i45;
                                                        } else {
                                                            i27 = 3;
                                                        }
                                                    }
                                                } else {
                                                    i27 = 0;
                                                }
                                            }
                                            iG3 = iG3;
                                            kVar = kVar;
                                            iH = i87;
                                            i49 = i88;
                                            listOf = list;
                                            i45 = i27;
                                            str = str;
                                            i47 = i86;
                                        } else {
                                            if (iG5 == 1668246642) {
                                                i26 = i87;
                                                if (iG3 == -1 && i26 == -1) {
                                                    int iG19 = rVar.g();
                                                    if (iG19 == 1852009592 || iG19 == 1852009571) {
                                                        int iA3 = rVar.A();
                                                        int iA4 = rVar.A();
                                                        rVar.H(2);
                                                        boolean z17 = iG4 == 19 && (rVar.u() & 128) != 0;
                                                        iG3 = androidx.media3.common.i.g(iA3);
                                                        int i108 = z17 ? 1 : 2;
                                                        iH = androidx.media3.common.i.h(iA4);
                                                        i47 = i108;
                                                        str = str;
                                                        kVar = kVar;
                                                        i45 = i45;
                                                    } else {
                                                        fa.k.g("Unsupported color type: ".concat(ga.b.a(iG19)));
                                                    }
                                                    i49 = i88;
                                                    listOf = list;
                                                }
                                            } else {
                                                i26 = i87;
                                            }
                                            iH = i26;
                                            kVar = kVar;
                                            str = str;
                                        }
                                        i47 = i86;
                                        iH = i87;
                                        i49 = i88;
                                        listOf = list;
                                    }
                                }
                            }
                            i45 = i45;
                            i47 = i86;
                            i49 = i88;
                            listOf = list;
                        }
                        i47 = i86;
                        iH = i87;
                        i49 = i88;
                        listOf = list;
                    }
                }
            }
            i44 = i24 + iG4;
            i38 = i15;
            i39 = i16;
            gVar2 = gVar;
            iIntValue = iIntValue;
            str4 = str2;
            i48 = i25;
            lVarB = lVar2;
        }
        androidx.media3.common.l lVar3 = lVarB;
        List<byte[]> list2 = listOf;
        int i109 = iG3;
        int i110 = i47;
        int i111 = iH;
        int i112 = i48;
        int i113 = i49;
        String str12 = str;
        int i114 = i45;
        if (str12 == null) {
            return;
        }
        androidx.media3.common.q.b bVar2 = new androidx.media3.common.q.b();
        bVar2.f8399a = Integer.toString(i17);
        bVar2.f8411m = x.n(str12);
        bVar2.f8408j = str5;
        bVar2.f8418t = iA;
        bVar2.f8419u = iA2;
        bVar2.f8422x = fY;
        bVar2.f8421w = i18;
        bVar2.f8423y = bArrCopyOfRange;
        bVar2.f8424z = i114;
        bVar2.f8414p = list2;
        bVar2.f8413o = i46;
        bVar2.f8415q = lVar3;
        androidx.media3.common.i.b bVar3 = new androidx.media3.common.i.b();
        bVar3.f8322a = i109;
        bVar3.f8323b = i110;
        bVar3.f8324c = i111;
        bVar3.f8325d = byteBufferOrder != null ? byteBufferOrder.array() : null;
        bVar3.f8326e = i112;
        bVar3.f8327f = i113;
        bVar2.A = bVar3.a();
        C3299b c3299b2 = c3299b;
        if (c3299b2 != null) {
            bVar2.f8406h = Ints.saturatedCast(c3299b2.f176669c);
            bVar2.f8407i = Ints.saturatedCast(c3299b2.f176670d);
        }
        gVar.f176679b = bVar2.a();
    }
}
