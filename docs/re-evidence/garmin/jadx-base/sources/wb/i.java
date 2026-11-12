package wb;

import androidx.media3.common.ParserException;
import androidx.media3.common.q;
import androidx.media3.common.w;
import androidx.media3.common.x;
import bb.n0;
import bb.o0;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.collect.ImmutableList;
import fa.k;
import fa.r;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i extends h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a f183857n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f183858o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f183859p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public o0.c f183860q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public o0.a f183861r;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o0.c f183862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o0.a f183863b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f183864c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final o0.b[] f183865d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f183866e;

        public a(o0.c cVar, o0.a aVar, byte[] bArr, o0.b[] bVarArr, int i14) {
            this.f183862a = cVar;
            this.f183863b = aVar;
            this.f183864c = bArr;
            this.f183865d = bVarArr;
            this.f183866e = i14;
        }
    }

    @Override // wb.h
    public final void a(long j8) {
        this.f183848g = j8;
        this.f183859p = j8 != 0;
        o0.c cVar = this.f183860q;
        this.f183858o = cVar != null ? cVar.f17250e : 0;
    }

    @Override // wb.h
    public final long b(r rVar) {
        byte b14 = rVar.f70054a[0];
        if ((b14 & 1) == 1) {
            return -1L;
        }
        a aVar = this.f183857n;
        fa.a.f(aVar);
        boolean z14 = aVar.f183865d[(b14 >> 1) & (255 >>> (8 - aVar.f183866e))].f17245a;
        o0.c cVar = aVar.f183862a;
        int i14 = !z14 ? cVar.f17250e : cVar.f17251f;
        long j8 = this.f183859p ? (this.f183858o + i14) / 4 : 0;
        byte[] bArr = rVar.f70054a;
        int length = bArr.length;
        int i15 = rVar.f70056c + 4;
        if (length < i15) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i15);
            rVar.E(bArrCopyOf, bArrCopyOf.length);
        } else {
            rVar.F(i15);
        }
        byte[] bArr2 = rVar.f70054a;
        int i16 = rVar.f70056c;
        bArr2[i16 - 4] = (byte) (j8 & 255);
        bArr2[i16 - 3] = (byte) ((j8 >>> 8) & 255);
        bArr2[i16 - 2] = (byte) ((j8 >>> 16) & 255);
        bArr2[i16 - 1] = (byte) ((j8 >>> 24) & 255);
        this.f183859p = true;
        this.f183858o = i14;
        return j8;
    }

    /* JADX WARN: Code duplicated, block: B:178:0x03c9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:180:0x03cc  */
    @Override // wb.h
    public final boolean c(r rVar, long j8, h.b bVar) throws ParserException {
        a aVar;
        if (this.f183857n != null) {
            bVar.f183855a.getClass();
            return false;
        }
        o0.c cVar = this.f183860q;
        int i14 = 1;
        if (cVar != null) {
            int i15 = 4;
            o0.a aVar2 = this.f183861r;
            if (aVar2 == null) {
                this.f183861r = o0.b(rVar, true, true);
            } else {
                int i16 = rVar.f70056c;
                byte[] bArr = new byte[i16];
                System.arraycopy(rVar.f70054a, 0, bArr, 0, i16);
                int i17 = cVar.f17246a;
                int i18 = 5;
                o0.c(5, rVar, false);
                int iU = rVar.u() + 1;
                n0 n0Var = new n0(rVar.f70054a);
                int i19 = 8;
                n0Var.c(rVar.f70055b * 8);
                int i24 = 0;
                while (true) {
                    int i25 = 16;
                    if (i24 < iU) {
                        int i26 = i19;
                        if (n0Var.b(24) != 5653314) {
                            throw ParserException.createForMalformedContainer("expected code book to start with [0x56, 0x43, 0x42] at " + ((n0Var.f17242c * 8) + n0Var.f17243d), null);
                        }
                        int iB = n0Var.b(16);
                        int iB2 = n0Var.b(24);
                        if (n0Var.a()) {
                            n0Var.c(i18);
                            int iB3 = 0;
                            while (iB3 < iB2) {
                                int i27 = 0;
                                for (int i28 = iB2 - iB3; i28 > 0; i28 >>>= 1) {
                                    i27++;
                                }
                                iB3 += n0Var.b(i27);
                            }
                        } else {
                            boolean zA = n0Var.a();
                            for (int i29 = 0; i29 < iB2; i29++) {
                                if (!zA) {
                                    n0Var.c(i18);
                                } else if (n0Var.a()) {
                                    n0Var.c(i18);
                                }
                            }
                        }
                        int i30 = i15;
                        int iB4 = n0Var.b(i30);
                        if (iB4 > 2) {
                            throw ParserException.createForMalformedContainer("lookup type greater than 2 not decodable: " + iB4, null);
                        }
                        if (iB4 == i14 || iB4 == 2) {
                            n0Var.c(32);
                            n0Var.c(32);
                            int iB5 = n0Var.b(i30) + i14;
                            n0Var.c(i14);
                            n0Var.c((int) ((iB4 == i14 ? iB != 0 ? (long) Math.floor(Math.pow(iB2, 1.0d / ((double) iB))) : 0L : ((long) iB) * ((long) iB2)) * ((long) iB5)));
                        } else {
                            i14 = i14;
                        }
                        i24++;
                        i19 = i26;
                        i14 = i14;
                        i18 = 5;
                        i15 = 4;
                    } else {
                        int i34 = i14;
                        int i35 = i19;
                        int i36 = 6;
                        int iB6 = n0Var.b(6) + 1;
                        for (int i37 = 0; i37 < iB6; i37++) {
                            if (n0Var.b(16) != 0) {
                                throw ParserException.createForMalformedContainer("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int iB7 = n0Var.b(6) + 1;
                        int i38 = 0;
                        while (true) {
                            int i39 = 3;
                            if (i38 >= iB7) {
                                int iB8 = n0Var.b(i36) + 1;
                                int i44 = 0;
                                while (i44 < iB8) {
                                    if (n0Var.b(16) > 2) {
                                        throw ParserException.createForMalformedContainer("residueType greater than 2 is not decodable", null);
                                    }
                                    n0Var.c(24);
                                    n0Var.c(24);
                                    n0Var.c(24);
                                    int iB9 = n0Var.b(i36) + 1;
                                    int i45 = 8;
                                    n0Var.c(8);
                                    int[] iArr = new int[iB9];
                                    for (int i46 = 0; i46 < iB9; i46++) {
                                        iArr[i46] = ((n0Var.a() ? n0Var.b(5) : 0) * 8) + n0Var.b(3);
                                    }
                                    int i47 = 0;
                                    while (i47 < iB9) {
                                        int i48 = 0;
                                        while (i48 < i45) {
                                            if ((iArr[i47] & (1 << i48)) != 0) {
                                                n0Var.c(i45);
                                            }
                                            i48++;
                                            i45 = 8;
                                        }
                                        i47++;
                                        i45 = 8;
                                    }
                                    i44++;
                                    i36 = 6;
                                }
                                int iB10 = n0Var.b(i36) + 1;
                                for (int i49 = 0; i49 < iB10; i49++) {
                                    int iB11 = n0Var.b(16);
                                    if (iB11 != 0) {
                                        k.c("mapping type other than 0 not supported: " + iB11);
                                    } else {
                                        int iB12 = n0Var.a() ? n0Var.b(4) + 1 : 1;
                                        if (n0Var.a()) {
                                            int iB13 = n0Var.b(8) + 1;
                                            for (int i54 = 0; i54 < iB13; i54++) {
                                                int i55 = i17 - 1;
                                                int i56 = 0;
                                                for (int i57 = i55; i57 > 0; i57 >>>= 1) {
                                                    i56++;
                                                }
                                                n0Var.c(i56);
                                                int i58 = 0;
                                                while (i55 > 0) {
                                                    i58++;
                                                    i55 >>>= 1;
                                                }
                                                n0Var.c(i58);
                                            }
                                        }
                                        if (n0Var.b(2) != 0) {
                                            throw ParserException.createForMalformedContainer("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iB12 > 1) {
                                            for (int i59 = 0; i59 < i17; i59++) {
                                                n0Var.c(4);
                                            }
                                        }
                                        for (int i64 = 0; i64 < iB12; i64++) {
                                            n0Var.c(8);
                                            n0Var.c(8);
                                            n0Var.c(8);
                                        }
                                    }
                                }
                                int iB14 = n0Var.b(6);
                                int i65 = iB14 + 1;
                                o0.b[] bVarArr = new o0.b[i65];
                                for (int i66 = 0; i66 < i65; i66++) {
                                    bVarArr[i66] = new o0.b(n0Var.a(), n0Var.b(16), n0Var.b(16), n0Var.b(8));
                                }
                                if (!n0Var.a()) {
                                    throw ParserException.createForMalformedContainer("framing bit after modes not set as expected", null);
                                }
                                int i67 = 0;
                                while (iB14 > 0) {
                                    i67++;
                                    iB14 >>>= 1;
                                }
                                aVar = new a(cVar, aVar2, bArr, bVarArr, i67);
                                break;
                            }
                            int iB15 = n0Var.b(i25);
                            if (iB15 == 0) {
                                int i68 = i35;
                                n0Var.c(i68);
                                n0Var.c(16);
                                n0Var.c(16);
                                n0Var.c(6);
                                n0Var.c(i68);
                                int iB16 = n0Var.b(4) + 1;
                                int i69 = 0;
                                while (i69 < iB16) {
                                    n0Var.c(i68);
                                    i69++;
                                    i68 = 8;
                                }
                            } else {
                                if (iB15 != i34) {
                                    throw ParserException.createForMalformedContainer("floor type greater than 1 not decodable: " + iB15, null);
                                }
                                int iB17 = n0Var.b(5);
                                int[] iArr2 = new int[iB17];
                                int i74 = -1;
                                for (int i75 = 0; i75 < iB17; i75++) {
                                    int iB18 = n0Var.b(4);
                                    iArr2[i75] = iB18;
                                    if (iB18 > i74) {
                                        i74 = iB18;
                                    }
                                }
                                int i76 = i74 + 1;
                                int[] iArr3 = new int[i76];
                                int i77 = 0;
                                while (i77 < i76) {
                                    iArr3[i77] = n0Var.b(i39) + 1;
                                    int iB19 = n0Var.b(2);
                                    int i78 = i35;
                                    if (iB19 > 0) {
                                        n0Var.c(i78);
                                    }
                                    int i79 = i76;
                                    int i84 = 0;
                                    for (int i85 = 1; i84 < (i85 << iB19); i85 = 1) {
                                        n0Var.c(i78);
                                        i84++;
                                        i78 = 8;
                                    }
                                    i77++;
                                    i76 = i79;
                                    i35 = 8;
                                    i39 = 3;
                                }
                                n0Var.c(2);
                                int iB20 = n0Var.b(4);
                                int i86 = 0;
                                int i87 = 0;
                                for (int i88 = 0; i88 < iB17; i88++) {
                                    i86 += iArr3[iArr2[i88]];
                                    while (i87 < i86) {
                                        n0Var.c(iB20);
                                        i87++;
                                    }
                                }
                            }
                            i38++;
                            i35 = 8;
                            i36 = 6;
                            i25 = 16;
                            i34 = 1;
                        }
                    }
                }
            }
            this.f183857n = aVar;
            if (aVar == null) {
                return true;
            }
            o0.c cVar2 = aVar.f183862a;
            ArrayList arrayList = new ArrayList();
            arrayList.add(cVar2.f17252g);
            arrayList.add(aVar.f183864c);
            w wVarA = o0.a(ImmutableList.copyOf(aVar.f183863b.f17244a));
            q.b bVar2 = new q.b();
            bVar2.f8411m = x.n(MimeTypes.AUDIO_VORBIS);
            bVar2.f8406h = cVar2.f17249d;
            bVar2.f8407i = cVar2.f17248c;
            bVar2.B = cVar2.f17246a;
            bVar2.C = cVar2.f17247b;
            bVar2.f8414p = arrayList;
            bVar2.f8409k = wVarA;
            bVar.f183855a = bVar2.a();
            return true;
        }
        o0.c(1, rVar, false);
        int iM = rVar.m();
        int iU2 = rVar.u();
        int iM2 = rVar.m();
        int i89 = rVar.i();
        int i93 = i89 <= 0 ? -1 : i89;
        int i94 = rVar.i();
        int i95 = i94 <= 0 ? -1 : i94;
        int i96 = rVar.i();
        int i97 = i96 <= 0 ? -1 : i96;
        int iU3 = rVar.u();
        this.f183860q = new o0.c(iM, iU2, iM2, i93, i95, i97, (int) Math.pow(2.0d, iU3 & 15), (int) Math.pow(2.0d, (iU3 & PsExtractor.VIDEO_STREAM_MASK) >> 4), (rVar.u() & 1) > 0, Arrays.copyOf(rVar.f70054a, rVar.f70056c));
        aVar = null;
        this.f183857n = aVar;
        if (aVar == null) {
            return true;
        }
        o0.c cVar3 = aVar.f183862a;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(cVar3.f17252g);
        arrayList2.add(aVar.f183864c);
        w wVarA2 = o0.a(ImmutableList.copyOf(aVar.f183863b.f17244a));
        q.b bVar3 = new q.b();
        bVar3.f8411m = x.n(MimeTypes.AUDIO_VORBIS);
        bVar3.f8406h = cVar3.f17249d;
        bVar3.f8407i = cVar3.f17248c;
        bVar3.B = cVar3.f17246a;
        bVar3.C = cVar3.f17247b;
        bVar3.f8414p = arrayList2;
        bVar3.f8409k = wVarA2;
        bVar.f183855a = bVar3.a();
        return true;
    }

    @Override // wb.h
    public final void d(boolean z14) {
        super.d(z14);
        if (z14) {
            this.f183857n = null;
            this.f183860q = null;
            this.f183861r = null;
        }
        this.f183858o = 0;
        this.f183859p = false;
    }
}
