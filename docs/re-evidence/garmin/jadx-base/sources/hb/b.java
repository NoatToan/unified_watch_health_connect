package hb;

import am.j;
import androidx.media3.common.ParserException;
import androidx.media3.common.q;
import androidx.media3.extractor.flv.TagPayloadReader;
import bb.b0;
import bb.d;
import bb.f0;
import bb.g0;
import bb.i;
import bb.l0;
import bb.n;
import bb.o;
import bb.p;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.primitives.UnsignedBytes;
import fa.r;
import j20.x;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b implements n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p f82727f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f82729h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f82730i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f82731j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f82732k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f82733l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f82734m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f82735n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public androidx.media3.extractor.flv.a f82736o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public androidx.media3.extractor.flv.b f82737p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f82722a = new r(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f82723b = new r(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f82724c = new r(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f82725d = new r();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f82726e = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f82728g = 1;

    /* JADX WARN: Code duplicated, block: B:101:0x0299  */
    /* JADX WARN: Code duplicated, block: B:144:0x038d  */
    /* JADX WARN: Code duplicated, block: B:145:0x0391  */
    /* JADX WARN: Code duplicated, block: B:183:0x039c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0164 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0166  */
    /* JADX WARN: Code duplicated, block: B:99:0x0291  */
    @Override // bb.n
    public final int b(o oVar, f0 f0Var) throws ParserException {
        long j8;
        long j14;
        int i14;
        long j15;
        int i15;
        boolean z14;
        int i16;
        long j16;
        fa.a.f(this.f82727f);
        while (true) {
            int i17 = this.f82728g;
            if (i17 == 1) {
                r rVar = this.f82723b;
                if (!oVar.readFully(rVar.f70054a, 0, 9, true)) {
                    return -1;
                }
                rVar.G(0);
                rVar.H(4);
                int iU = rVar.u();
                boolean z15 = (iU & 4) != 0;
                boolean z16 = (iU & 1) != 0;
                if (z15 && this.f82736o == null) {
                    this.f82736o = new androidx.media3.extractor.flv.a(this.f82727f.track(8, 1));
                }
                if (z16 && this.f82737p == null) {
                    this.f82737p = new androidx.media3.extractor.flv.b(this.f82727f.track(9, 2));
                }
                this.f82727f.endTracks();
                this.f82731j = rVar.g() - 5;
                this.f82728g = 2;
            } else if (i17 == 2) {
                oVar.skipFully(this.f82731j);
                this.f82731j = 0;
                this.f82728g = 3;
            } else if (i17 == 3) {
                r rVar2 = this.f82724c;
                if (!oVar.readFully(rVar2.f70054a, 0, 11, true)) {
                    return -1;
                }
                rVar2.G(0);
                this.f82732k = rVar2.u();
                this.f82733l = rVar2.x();
                this.f82734m = rVar2.x();
                this.f82734m = (((long) (rVar2.u() << 24)) | this.f82734m) * 1000;
                rVar2.H(3);
                this.f82728g = 4;
            } else {
                if (i17 != 4) {
                    x.h();
                    return 0;
                }
                boolean z17 = this.f82729h;
                c cVar = this.f82726e;
                if (z17) {
                    j8 = this.f82730i + this.f82734m;
                } else {
                    if (cVar.f82738b == C.TIME_UNSET) {
                        j14 = 0;
                    } else {
                        j8 = this.f82734m;
                    }
                    i14 = this.f82732k;
                    if (i14 == 8 || this.f82736o == null) {
                        if (i14 == 9 || this.f82737p == null) {
                            j15 = -9223372036854775807L;
                            i15 = 0;
                            if (i14 == 18 || this.f82735n) {
                                oVar.skipFully(this.f82733l);
                                z14 = false;
                                i16 = 0;
                            } else {
                                r rVarF = f(oVar);
                                cVar.getClass();
                                cVar.getClass();
                                if (rVarF.u() == 2 && "onMetaData".equals(c.c(rVarF)) && rVarF.a() != 0 && rVarF.u() == 8) {
                                    HashMap<String, Object> mapB = c.b(rVarF);
                                    Object obj = mapB.get("duration");
                                    double d14 = 1000000.0d;
                                    if (obj instanceof Double) {
                                        double dDoubleValue = ((Double) obj).doubleValue();
                                        if (dDoubleValue > 0.0d) {
                                            cVar.f82738b = (long) (dDoubleValue * 1000000.0d);
                                        }
                                    }
                                    Object obj2 = mapB.get("keyframes");
                                    if (obj2 instanceof Map) {
                                        Map map = (Map) obj2;
                                        Object obj3 = map.get("filepositions");
                                        Object obj4 = map.get("times");
                                        if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                            List list = (List) obj3;
                                            List list2 = (List) obj4;
                                            int size = list2.size();
                                            cVar.f82739c = new long[size];
                                            cVar.f82740d = new long[size];
                                            int i18 = 0;
                                            while (i18 < size) {
                                                Object obj5 = list.get(i18);
                                                Object obj6 = list2.get(i18);
                                                if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                    cVar.f82739c = new long[0];
                                                    cVar.f82740d = new long[0];
                                                    break;
                                                }
                                                double d15 = d14;
                                                cVar.f82739c[i18] = (long) (((Double) obj6).doubleValue() * d15);
                                                cVar.f82740d[i18] = ((Double) obj5).longValue();
                                                i18++;
                                                d14 = d15;
                                            }
                                        }
                                    }
                                }
                                long j17 = cVar.f82738b;
                                if (j17 != C.TIME_UNSET) {
                                    this.f82727f.a(new b0(cVar.f82740d, cVar.f82739c, j17));
                                    this.f82735n = true;
                                }
                            }
                        } else {
                            if (!this.f82735n) {
                                this.f82727f.a(new g0.b(C.TIME_UNSET));
                                this.f82735n = true;
                            }
                            androidx.media3.extractor.flv.b bVar = this.f82737p;
                            r rVarF2 = f(oVar);
                            bVar.getClass();
                            int iU2 = rVarF2.u();
                            int i19 = (iU2 >> 4) & 15;
                            int i24 = iU2 & 15;
                            if (i24 != 7) {
                                throw new TagPayloadReader.UnsupportedFormatException(j.h(i24, "Video format not supported: "));
                            }
                            bVar.f9946g = i19;
                            if (i19 != 5) {
                                r rVar3 = bVar.f9941b;
                                l0 l0Var = bVar.f9936a;
                                r rVar4 = bVar.f9942c;
                                int iU3 = rVarF2.u();
                                byte[] bArr = rVarF2.f70054a;
                                j15 = -9223372036854775807L;
                                int i25 = rVarF2.f70055b;
                                int i26 = i25 + 1;
                                rVarF2.f70055b = i26;
                                i15 = 0;
                                int i27 = ((bArr[i25] & UnsignedBytes.MAX_VALUE) << 24) >> 8;
                                int i28 = i25 + 2;
                                rVarF2.f70055b = i28;
                                int i29 = i27 | ((bArr[i26] & UnsignedBytes.MAX_VALUE) << 8);
                                rVarF2.f70055b = i25 + 3;
                                long j18 = (((long) ((bArr[i28] & UnsignedBytes.MAX_VALUE) | i29)) * 1000) + j14;
                                boolean z18 = false;
                                if (iU3 == 0 && !bVar.f9944e) {
                                    r rVar5 = new r(new byte[rVarF2.a()]);
                                    rVarF2.e(rVar5.f70054a, 0, rVarF2.a());
                                    d dVarA = d.a(rVar5);
                                    bVar.f9943d = dVarA.f17133b;
                                    q.b bVar2 = new q.b();
                                    bVar2.f8411m = androidx.media3.common.x.n(MimeTypes.VIDEO_H264);
                                    bVar2.f8408j = dVarA.f17143l;
                                    bVar2.f8418t = dVarA.f17134c;
                                    bVar2.f8419u = dVarA.f17135d;
                                    bVar2.f8422x = dVarA.f17142k;
                                    bVar2.f8414p = dVarA.f17132a;
                                    l0Var.d(bVar2.a());
                                    bVar.f9944e = true;
                                } else if (iU3 == 1 && bVar.f9944e) {
                                    int i30 = bVar.f9946g == 1 ? 1 : 0;
                                    if (bVar.f9945f || i30 != 0) {
                                        byte[] bArr2 = rVar4.f70054a;
                                        bArr2[0] = 0;
                                        bArr2[1] = 0;
                                        bArr2[2] = 0;
                                        int i34 = 4 - bVar.f9943d;
                                        int i35 = 0;
                                        while (rVarF2.a() > 0) {
                                            rVarF2.e(rVar4.f70054a, i34, bVar.f9943d);
                                            rVar4.G(0);
                                            int iY = rVar4.y();
                                            rVar3.G(0);
                                            l0Var.f(4, rVar3);
                                            l0Var.f(iY, rVarF2);
                                            i35 = i35 + 4 + iY;
                                        }
                                        bVar.f9936a.c(j18, i30, i35, 0, null);
                                        bVar.f9945f = true;
                                        z18 = true;
                                    }
                                }
                                if (z18) {
                                    i16 = 1;
                                }
                                z14 = true;
                            } else {
                                j15 = -9223372036854775807L;
                                i15 = 0;
                            }
                        }
                        i16 = i15;
                        z14 = true;
                    } else {
                        if (!this.f82735n) {
                            this.f82727f.a(new g0.b(C.TIME_UNSET));
                            this.f82735n = true;
                        }
                        androidx.media3.extractor.flv.a aVar = this.f82736o;
                        r rVarF3 = f(oVar);
                        l0 l0Var2 = aVar.f9936a;
                        if (aVar.f9938b) {
                            rVarF3.H(1);
                        } else {
                            int iU4 = rVarF3.u();
                            int i36 = (iU4 >> 4) & 15;
                            aVar.f9940d = i36;
                            if (i36 == 2) {
                                int i37 = androidx.media3.extractor.flv.a.f9937e[(iU4 >> 2) & 3];
                                q.b bVar3 = new q.b();
                                bVar3.f8411m = androidx.media3.common.x.n(MimeTypes.AUDIO_MPEG);
                                bVar3.B = 1;
                                bVar3.C = i37;
                                l0Var2.d(bVar3.a());
                                aVar.f9939c = true;
                            } else if (i36 == 7 || i36 == 8) {
                                String str = i36 == 7 ? MimeTypes.AUDIO_ALAW : MimeTypes.AUDIO_MLAW;
                                q.b bVar4 = new q.b();
                                bVar4.f8411m = androidx.media3.common.x.n(str);
                                bVar4.B = 1;
                                bVar4.C = 8000;
                                l0Var2.d(bVar4.a());
                                aVar.f9939c = true;
                            } else if (i36 != 10) {
                                throw new TagPayloadReader.UnsupportedFormatException("Audio format not supported: " + aVar.f9940d);
                            }
                            aVar.f9938b = true;
                        }
                        l0 l0Var3 = aVar.f9936a;
                        i16 = 1;
                        if (aVar.f9940d == 2) {
                            int iA = rVarF3.a();
                            l0Var3.f(iA, rVarF3);
                            aVar.f9936a.c(j14, 1, iA, 0, null);
                        } else {
                            int iU5 = rVarF3.u();
                            if (iU5 == 0 && !aVar.f9939c) {
                                int iA2 = rVarF3.a();
                                byte[] bArr3 = new byte[iA2];
                                rVarF3.e(bArr3, 0, iA2);
                                bb.a.b bVarB = bb.a.b(new fa.q(bArr3), false);
                                q.b bVar5 = new q.b();
                                bVar5.f8411m = androidx.media3.common.x.n(MimeTypes.AUDIO_AAC);
                                bVar5.f8408j = bVarB.f17090c;
                                bVar5.B = bVarB.f17089b;
                                bVar5.C = bVarB.f17088a;
                                bVar5.f8414p = Collections.singletonList(bArr3);
                                l0Var3.d(bVar5.a());
                                aVar.f9939c = true;
                            } else if (aVar.f9940d != 10 || iU5 == 1) {
                                int iA3 = rVarF3.a();
                                l0Var3.f(iA3, rVarF3);
                                aVar.f9936a.c(j14, 1, iA3, 0, null);
                            }
                            i16 = 0;
                        }
                        z14 = true;
                        j15 = -9223372036854775807L;
                        i15 = 0;
                    }
                    if (!this.f82729h && i16 != 0) {
                        this.f82729h = true;
                        if (cVar.f82738b == j15) {
                            j16 = -this.f82734m;
                        } else {
                            j16 = 0;
                        }
                        this.f82730i = j16;
                    }
                    this.f82731j = 4;
                    this.f82728g = 2;
                    if (z14) {
                        return i15;
                    }
                }
                j14 = j8;
                i14 = this.f82732k;
                if (i14 == 8) {
                    if (i14 == 9) {
                        j15 = -9223372036854775807L;
                        i15 = 0;
                        if (i14 == 18) {
                        }
                        oVar.skipFully(this.f82733l);
                        z14 = false;
                        i16 = 0;
                    } else {
                        j15 = -9223372036854775807L;
                        i15 = 0;
                        if (i14 == 18) {
                        }
                        oVar.skipFully(this.f82733l);
                        z14 = false;
                        i16 = 0;
                    }
                } else if (i14 == 9) {
                    j15 = -9223372036854775807L;
                    i15 = 0;
                    if (i14 == 18) {
                    }
                    oVar.skipFully(this.f82733l);
                    z14 = false;
                    i16 = 0;
                } else {
                    j15 = -9223372036854775807L;
                    i15 = 0;
                    if (i14 == 18) {
                    }
                    oVar.skipFully(this.f82733l);
                    z14 = false;
                    i16 = 0;
                }
                if (!this.f82729h) {
                    this.f82729h = true;
                    if (cVar.f82738b == j15) {
                        j16 = -this.f82734m;
                    } else {
                        j16 = 0;
                    }
                    this.f82730i = j16;
                }
                this.f82731j = 4;
                this.f82728g = 2;
                if (z14) {
                    return i15;
                }
            }
        }
    }

    @Override // bb.n
    public final void c(p pVar) {
        this.f82727f = pVar;
    }

    @Override // bb.n
    public final boolean d(o oVar) throws EOFException, InterruptedIOException {
        r rVar = this.f82722a;
        i iVar = (i) oVar;
        iVar.peekFully(rVar.f70054a, 0, 3, false);
        rVar.G(0);
        if (rVar.x() == 4607062) {
            iVar.peekFully(rVar.f70054a, 0, 2, false);
            rVar.G(0);
            if ((rVar.A() & 250) == 0) {
                iVar.peekFully(rVar.f70054a, 0, 4, false);
                rVar.G(0);
                int iG = rVar.g();
                iVar.f17193f = 0;
                iVar.advancePeekPosition(iG, false);
                iVar.peekFully(rVar.f70054a, 0, 4, false);
                rVar.G(0);
                if (rVar.g() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final r f(o oVar) {
        int i14 = this.f82733l;
        r rVar = this.f82725d;
        byte[] bArr = rVar.f70054a;
        if (i14 > bArr.length) {
            rVar.E(new byte[Math.max(bArr.length * 2, i14)], 0);
        } else {
            rVar.G(0);
        }
        rVar.F(this.f82733l);
        oVar.readFully(rVar.f70054a, 0, this.f82733l);
        return rVar;
    }

    @Override // bb.n
    public final void release() {
    }

    @Override // bb.n
    public final void seek(long j8, long j14) {
        if (j8 == 0) {
            this.f82728g = 1;
            this.f82729h = false;
        } else {
            this.f82728g = 3;
        }
        this.f82731j = 0;
    }
}
