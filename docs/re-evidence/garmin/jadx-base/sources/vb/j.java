package vb;

import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.common.ParserException;
import androidx.media3.common.w;
import bb.f0;
import bb.g0;
import bb.h0;
import bb.k0;
import bb.l0;
import bb.m0;
import bb.y;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.collect.ImmutableList;
import fa.z;
import i3.e5;
import j20.x;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j implements bb.n, g0 {
    public static final /* synthetic */ int G = 0;
    public a[] A;
    public long[][] B;
    public int C;
    public long D;
    public int E;
    public qb.a F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yb.n.a f176748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f176749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fa.r f176750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fa.r f176751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fa.r f176752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fa.r f176753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque<ga.b.C1537b> f176754g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f176755h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f176756i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImmutableList<k0> f176757j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f176758k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f176759l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f176760m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f176761n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public fa.r f176762o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f176763p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f176764q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f176765r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f176766s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f176767t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f176768u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f176769v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f176770w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f176771x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f176772y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public bb.p f176773z;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f176774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r f176775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l0 f176776c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final m0 f176777d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f176778e;

        public a(o oVar, r rVar, l0 l0Var) {
            this.f176774a = oVar;
            this.f176775b = rVar;
            this.f176776c = l0Var;
            this.f176777d = MimeTypes.AUDIO_TRUEHD.equals(oVar.f176797g.f8386n) ? new m0() : null;
        }
    }

    public j(yb.n.a aVar, int i14) {
        this.f176748a = aVar;
        this.f176749b = i14;
        this.f176757j = ImmutableList.of();
        this.f176758k = (i14 & 4) != 0 ? 3 : 0;
        this.f176755h = new m();
        this.f176756i = new ArrayList();
        this.f176753f = new fa.r(16);
        this.f176754g = new ArrayDeque<>();
        this.f176750c = new fa.r(ga.e.f76514a);
        this.f176751d = new fa.r(5);
        this.f176752e = new fa.r();
        this.f176763p = -1;
        this.f176773z = bb.p.M;
        this.A = new a[0];
        this.f176767t = (i14 & 32) == 0;
    }

    @Override // bb.n
    public final ImmutableList a() {
        return this.f176757j;
    }

    /* JADX WARN: Code duplicated, block: B:251:0x04db  */
    /* JADX WARN: Code duplicated, block: B:256:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:277:0x056a  */
    /* JADX WARN: Code duplicated, block: B:278:0x057d  */
    /* JADX WARN: Code duplicated, block: B:280:0x0583  */
    /* JADX WARN: Code duplicated, block: B:287:0x0599  */
    /* JADX WARN: Code duplicated, block: B:290:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:305:0x05da  */
    /* JADX WARN: Code duplicated, block: B:356:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:360:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:364:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:365:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:374:0x04f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:0x06f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:394:0x0161 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:62:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:65:0x0102  */
    /* JADX WARN: Code duplicated, block: B:67:0x0116  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // bb.n
    public final int b(bb.o oVar, f0 f0Var) throws ParserException {
        char c14;
        int i14;
        long j8;
        fa.r rVar;
        int i15;
        char c15;
        int i16;
        ArrayList arrayList;
        List<String> listSplitToList;
        int i17;
        List<String> listSplitToList2;
        boolean z14;
        boolean z15;
        int i18;
        long j14;
        long length;
        ga.b.C1537b c1537bPeek;
        long j15;
        int i19;
        int i24;
        boolean z16;
        long j16;
        long j17;
        long j18;
        int i25;
        boolean z17;
        while (true) {
            int i26 = this.f176758k;
            ArrayDeque<ga.b.C1537b> arrayDeque = this.f176754g;
            int i27 = this.f176749b;
            fa.r rVar2 = this.f176752e;
            int i28 = 4;
            int i29 = 0;
            char c16 = 2;
            if (i26 == 0) {
                int i30 = this.f176761n;
                fa.r rVar3 = this.f176753f;
                if (i30 != 0) {
                    j14 = this.f176760m;
                    if (j14 == 1) {
                        oVar.readFully(rVar3.f70054a, 8, 8);
                        this.f176761n += 8;
                        this.f176760m = rVar3.z();
                    } else if (j14 == 0) {
                        length = oVar.getLength();
                        if (length == -1 && (c1537bPeek = arrayDeque.peek()) != null) {
                            length = c1537bPeek.f76505b;
                        }
                        if (length != -1) {
                            this.f176760m = (length - oVar.getPosition()) + ((long) this.f176761n);
                        }
                    }
                    j15 = this.f176760m;
                    i19 = this.f176761n;
                    if (j15 >= i19) {
                        throw ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
                    }
                    i24 = this.f176759l;
                    if (i24 != 1836019574 || i24 == 1953653099 || i24 == 1835297121 || i24 == 1835626086 || i24 == 1937007212 || i24 == 1701082227 || i24 == 1835365473 || i24 == 1701082724) {
                        z16 = true;
                        long position = oVar.getPosition();
                        j16 = this.f176760m;
                        j17 = this.f176761n;
                        j18 = (position + j16) - j17;
                        if (j16 != j17 && this.f176759l == 1835365473) {
                            rVar2.D(8);
                            oVar.peekFully(rVar2.f70054a, 0, 8);
                            byte[] bArr = b.f176657a;
                            i25 = rVar2.f70055b;
                            rVar2.H(4);
                            if (rVar2.g() != 1751411826) {
                                i25 += 4;
                            }
                            rVar2.G(i25);
                            oVar.skipFully(rVar2.f70055b);
                            oVar.resetPeekPosition();
                        }
                        arrayDeque.push(new ga.b.C1537b(this.f176759l, j18));
                        if (this.f176760m == this.f176761n) {
                            g(j18);
                        } else {
                            this.f176758k = 0;
                            this.f176761n = 0;
                        }
                    } else if (i24 == 1835296868 || i24 == 1836476516 || i24 == 1751411826 || i24 == 1937011556 || i24 == 1937011827 || i24 == 1937011571 || i24 == 1668576371 || i24 == 1701606260 || i24 == 1937011555 || i24 == 1937011578 || i24 == 1937013298 || i24 == 1937007471 || i24 == 1668232756 || i24 == 1953196132 || i24 == 1718909296 || i24 == 1969517665 || i24 == 1801812339 || i24 == 1768715124) {
                        fa.a.d(i19 == 8);
                        fa.a.d(this.f176760m <= 2147483647L);
                        fa.r rVar4 = new fa.r((int) this.f176760m);
                        System.arraycopy(rVar3.f70054a, 0, rVar4.f70054a, 0, 8);
                        this.f176762o = rVar4;
                        z16 = true;
                        this.f176758k = 1;
                    } else {
                        long position2 = oVar.getPosition() - ((long) this.f176761n);
                        if (this.f176759l == 1836086884) {
                            long j19 = this.f176761n;
                            this.F = new qb.a(0L, position2, C.TIME_UNSET, position2 + j19, this.f176760m - j19);
                        }
                        this.f176762o = null;
                        z16 = true;
                        this.f176758k = 1;
                    }
                    z17 = z16;
                } else if (oVar.readFully(rVar3.f70054a, 0, 8, true)) {
                    this.f176761n = 8;
                    rVar3.G(0);
                    this.f176760m = rVar3.w();
                    this.f176759l = rVar3.g();
                    j14 = this.f176760m;
                    if (j14 == 1) {
                        oVar.readFully(rVar3.f70054a, 8, 8);
                        this.f176761n += 8;
                        this.f176760m = rVar3.z();
                    } else if (j14 == 0) {
                        length = oVar.getLength();
                        if (length == -1) {
                            length = c1537bPeek.f76505b;
                        }
                        if (length != -1) {
                            this.f176760m = (length - oVar.getPosition()) + ((long) this.f176761n);
                        }
                    }
                    j15 = this.f176760m;
                    i19 = this.f176761n;
                    if (j15 >= i19) {
                        throw ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
                    }
                    i24 = this.f176759l;
                    if (i24 != 1836019574) {
                        z16 = true;
                        long position3 = oVar.getPosition();
                        j16 = this.f176760m;
                        j17 = this.f176761n;
                        j18 = (position3 + j16) - j17;
                        if (j16 != j17) {
                            rVar2.D(8);
                            oVar.peekFully(rVar2.f70054a, 0, 8);
                            byte[] bArr2 = b.f176657a;
                            i25 = rVar2.f70055b;
                            rVar2.H(4);
                            if (rVar2.g() != 1751411826) {
                                i25 += 4;
                            }
                            rVar2.G(i25);
                            oVar.skipFully(rVar2.f70055b);
                            oVar.resetPeekPosition();
                        }
                        arrayDeque.push(new ga.b.C1537b(this.f176759l, j18));
                        if (this.f176760m == this.f176761n) {
                            g(j18);
                        } else {
                            this.f176758k = 0;
                            this.f176761n = 0;
                        }
                    } else {
                        z16 = true;
                        long position4 = oVar.getPosition();
                        j16 = this.f176760m;
                        j17 = this.f176761n;
                        j18 = (position4 + j16) - j17;
                        if (j16 != j17) {
                            rVar2.D(8);
                            oVar.peekFully(rVar2.f70054a, 0, 8);
                            byte[] bArr3 = b.f176657a;
                            i25 = rVar2.f70055b;
                            rVar2.H(4);
                            if (rVar2.g() != 1751411826) {
                                i25 += 4;
                            }
                            rVar2.G(i25);
                            oVar.skipFully(rVar2.f70055b);
                            oVar.resetPeekPosition();
                        }
                        arrayDeque.push(new ga.b.C1537b(this.f176759l, j18));
                        if (this.f176760m == this.f176761n) {
                            g(j18);
                        } else {
                            this.f176758k = 0;
                            this.f176761n = 0;
                        }
                    }
                    z17 = z16;
                } else {
                    if (this.E == 2 && (i27 & 2) != 0) {
                        l0 l0VarTrack = this.f176773z.track(0, 4);
                        w wVar = this.F == null ? null : new w(this.F);
                        androidx.media3.common.q.b bVar = new androidx.media3.common.q.b();
                        bVar.f8409k = wVar;
                        l0VarTrack.d(bVar.a());
                        this.f176773z.endTracks();
                        this.f176773z.a(new g0.b(C.TIME_UNSET));
                    }
                    z17 = false;
                }
                if (!z17) {
                    return -1;
                }
            } else {
                if (i26 != 1) {
                    if (i26 == 2) {
                        int i34 = 4;
                        long position5 = oVar.getPosition();
                        if (this.f176763p == -1) {
                            int i35 = 0;
                            int i36 = -1;
                            int i37 = -1;
                            boolean z18 = true;
                            boolean z19 = true;
                            long j24 = Long.MAX_VALUE;
                            long j25 = Long.MAX_VALUE;
                            long j26 = Long.MAX_VALUE;
                            while (true) {
                                a[] aVarArr = this.A;
                                if (i35 >= aVarArr.length) {
                                    break;
                                }
                                a aVar = aVarArr[i35];
                                int i38 = aVar.f176778e;
                                r rVar5 = aVar.f176775b;
                                char c17 = c16;
                                if (i38 != rVar5.f176826b) {
                                    long j27 = rVar5.f176827c[i38];
                                    long[][] jArr = this.B;
                                    int i39 = z.f70071a;
                                    long j28 = jArr[i35][i38];
                                    long j29 = j27 - position5;
                                    boolean z24 = j29 < 0 || j29 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                                    if ((!z24 && z18) || (z24 == z18 && j29 < j26)) {
                                        i37 = i35;
                                        z18 = z24;
                                        j25 = j28;
                                        j26 = j29;
                                    }
                                    if (j28 < j24) {
                                        i36 = i35;
                                        z19 = z24;
                                        j24 = j28;
                                    }
                                }
                                i35++;
                                c16 = c17;
                            }
                            c14 = c16;
                            if (j24 == Long.MAX_VALUE || !z19 || j25 < j24 + SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE) {
                                i36 = i37;
                            }
                            this.f176763p = i36;
                            if (i36 == -1) {
                                return -1;
                            }
                        } else {
                            c14 = 2;
                        }
                        a aVar2 = this.A[this.f176763p];
                        l0 l0Var = aVar2.f176776c;
                        o oVar2 = aVar2.f176774a;
                        r rVar6 = aVar2.f176775b;
                        int i44 = aVar2.f176778e;
                        long j34 = rVar6.f176827c[i44] + this.f176772y;
                        int i45 = rVar6.f176828d[i44];
                        m0 m0Var = aVar2.f176777d;
                        long j35 = (j34 - position5) + ((long) this.f176764q);
                        if (j35 < 0 || j35 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                            f0Var.f17167a = j34;
                            return 1;
                        }
                        int i46 = oVar2.f176798h;
                        androidx.media3.common.q qVar = oVar2.f176797g;
                        if (i46 == 1) {
                            j35 += 8;
                            i45 -= 8;
                        }
                        oVar.skipFully((int) j35);
                        if (!Objects.equals(qVar.f8386n, MimeTypes.VIDEO_H264)) {
                            this.f176767t = true;
                        }
                        int i47 = oVar2.f176801k;
                        if (i47 == 0) {
                            if (MimeTypes.AUDIO_AC4.equals(qVar.f8386n)) {
                                if (this.f176765r == 0) {
                                    bb.c.a(i45, rVar2);
                                    l0Var.f(7, rVar2);
                                    this.f176765r += 7;
                                }
                                i45 += 7;
                            } else if (m0Var != null) {
                                m0Var.c(oVar);
                            }
                            while (true) {
                                int i48 = this.f176765r;
                                if (i48 >= i45) {
                                    break;
                                }
                                int iB = l0Var.b(oVar, i45 - i48, false);
                                this.f176764q += iB;
                                this.f176765r += iB;
                                this.f176766s -= iB;
                            }
                        } else {
                            fa.r rVar7 = this.f176751d;
                            byte[] bArr4 = rVar7.f70054a;
                            bArr4[0] = 0;
                            bArr4[1] = 0;
                            bArr4[c14] = 0;
                            int i49 = i47 + 1;
                            int i54 = 4 - i47;
                            while (this.f176765r < i45) {
                                int i55 = this.f176766s;
                                if (i55 == 0) {
                                    oVar.readFully(bArr4, i54, i49);
                                    this.f176764q += i49;
                                    rVar7.G(0);
                                    int iG = rVar7.g();
                                    if (iG < 1) {
                                        throw ParserException.createForMalformedContainer("Invalid NAL length", null);
                                    }
                                    this.f176766s = iG - 1;
                                    fa.r rVar8 = this.f176750c;
                                    rVar8.G(0);
                                    int i56 = i34;
                                    l0Var.f(i56, rVar8);
                                    l0Var.f(1, rVar7);
                                    this.f176765r += 5;
                                    i45 += i54;
                                    if (!this.f176767t && ga.e.c(bArr4[i56])) {
                                        this.f176767t = true;
                                    }
                                } else {
                                    int iB2 = l0Var.b(oVar, i55, false);
                                    this.f176764q += iB2;
                                    this.f176765r += iB2;
                                    this.f176766s -= iB2;
                                }
                                i34 = 4;
                            }
                        }
                        int i57 = i45;
                        long j36 = rVar6.f176830f[i44];
                        int i58 = rVar6.f176831g[i44];
                        if (!this.f176767t) {
                            i58 |= 67108864;
                        }
                        int i59 = i58;
                        if (m0Var != null) {
                            m0Var.b(l0Var, j36, i59, i57, 0, null);
                            if (i44 + 1 == rVar6.f176826b) {
                                m0Var.a(l0Var, null);
                            }
                        } else {
                            l0Var.c(j36, i59, i57, 0, null);
                        }
                        aVar2.f176778e++;
                        this.f176763p = -1;
                        this.f176764q = 0;
                        this.f176765r = 0;
                        this.f176766s = 0;
                        this.f176767t = (i27 & 32) == 0;
                        return 0;
                    }
                    if (i26 != 3) {
                        x.h();
                        return 0;
                    }
                    m mVar = this.f176755h;
                    ArrayList arrayList2 = mVar.f176785a;
                    int i64 = mVar.f176786b;
                    if (i64 != 0) {
                        if (i64 != 1) {
                            short s8 = 2817;
                            short s14 = 2816;
                            short s15 = 2192;
                            if (i64 == 2) {
                                long length2 = oVar.getLength();
                                int i65 = mVar.f176787c - 20;
                                fa.r rVar9 = new fa.r(i65);
                                oVar.readFully(rVar9.f70054a, 0, i65);
                                int i66 = 0;
                                while (i66 < i65 / 12) {
                                    rVar9.H(2);
                                    short sK = rVar9.k();
                                    if (sK == s15 || sK == s14 || sK == s8 || sK == 2819 || sK == 2820) {
                                        j8 = length2;
                                        rVar = rVar9;
                                        arrayList2.add(new m.a(sK, (j8 - ((long) mVar.f176787c)) - ((long) rVar9.i()), rVar.i()));
                                    } else {
                                        rVar9.H(8);
                                        j8 = length2;
                                        rVar = rVar9;
                                    }
                                    i66++;
                                    rVar9 = rVar;
                                    length2 = j8;
                                    s15 = 2192;
                                    s8 = 2817;
                                    s14 = 2816;
                                }
                                if (arrayList2.isEmpty()) {
                                    f0Var.f17167a = 0L;
                                } else {
                                    mVar.f176786b = 3;
                                    f0Var.f17167a = ((m.a) arrayList2.get(0)).f176788a;
                                }
                            } else {
                                if (i64 != 3) {
                                    x.h();
                                    return 0;
                                }
                                long position6 = oVar.getPosition();
                                int length3 = (int) ((oVar.getLength() - oVar.getPosition()) - ((long) mVar.f176787c));
                                fa.r rVar10 = new fa.r(length3);
                                oVar.readFully(rVar10.f70054a, 0, length3);
                                int i67 = 0;
                                while (i67 < arrayList2.size()) {
                                    m.a aVar3 = (m.a) arrayList2.get(i67);
                                    int i68 = i29;
                                    rVar10.G((int) (aVar3.f176788a - position6));
                                    rVar10.H(i28);
                                    int i69 = rVar10.i();
                                    Charset charset = StandardCharsets.UTF_8;
                                    int i74 = i68;
                                    String strS = rVar10.s(i69, charset);
                                    int i75 = i28;
                                    switch (strS.hashCode()) {
                                        case -1711564334:
                                            if (strS.equals("SlowMotion_Data")) {
                                                i15 = i74;
                                            }
                                            switch (i15) {
                                                case 0:
                                                    c15 = 2192;
                                                    break;
                                                case 1:
                                                    c15 = 2819;
                                                    break;
                                                case 2:
                                                    c15 = 2816;
                                                    break;
                                                case 3:
                                                    c15 = 2820;
                                                    break;
                                                case 4:
                                                    c15 = 2817;
                                                    break;
                                                default:
                                                    throw ParserException.createForMalformedContainer("Invalid SEF name", null);
                                            }
                                            i16 = aVar3.f176789b - (i69 + 8);
                                            if (c15 != 2192) {
                                                arrayList = new ArrayList();
                                                listSplitToList = m.f176784e.splitToList(rVar10.s(i16, charset));
                                                i17 = i74;
                                                while (i17 < listSplitToList.size()) {
                                                    listSplitToList2 = m.f176783d.splitToList(listSplitToList.get(i17));
                                                    if (listSplitToList2.size() == 3) {
                                                        throw ParserException.createForMalformedContainer(null, null);
                                                    }
                                                    try {
                                                        arrayList.add(new qb.b.C2716b(Long.parseLong(listSplitToList2.get(i74)), Long.parseLong(listSplitToList2.get(1)), 1 << (Integer.parseInt(listSplitToList2.get(2)) - 1)));
                                                        i17++;
                                                        i74 = 0;
                                                    } catch (NumberFormatException e4) {
                                                        throw ParserException.createForMalformedContainer(null, e4);
                                                    }
                                                }
                                                this.f176756i.add(new qb.b(arrayList));
                                            } else if (c15 != 2816 && c15 != 2817 && c15 != 2819 && c15 != 2820) {
                                                x.h();
                                                return i74;
                                            }
                                            i67++;
                                            i28 = i75;
                                            i29 = 0;
                                            break;
                                        case -1332107749:
                                            if (strS.equals("Super_SlowMotion_Edit_Data")) {
                                                i15 = 1;
                                            }
                                            switch (i15) {
                                                case 0:
                                                    c15 = 2192;
                                                    break;
                                                case 1:
                                                    c15 = 2819;
                                                    break;
                                                case 2:
                                                    c15 = 2816;
                                                    break;
                                                case 3:
                                                    c15 = 2820;
                                                    break;
                                                case 4:
                                                    c15 = 2817;
                                                    break;
                                                default:
                                                    throw ParserException.createForMalformedContainer("Invalid SEF name", null);
                                            }
                                            i16 = aVar3.f176789b - (i69 + 8);
                                            if (c15 != 2192) {
                                                arrayList = new ArrayList();
                                                listSplitToList = m.f176784e.splitToList(rVar10.s(i16, charset));
                                                i17 = i74;
                                                while (i17 < listSplitToList.size()) {
                                                    listSplitToList2 = m.f176783d.splitToList(listSplitToList.get(i17));
                                                    if (listSplitToList2.size() == 3) {
                                                        throw ParserException.createForMalformedContainer(null, null);
                                                    }
                                                    arrayList.add(new qb.b.C2716b(Long.parseLong(listSplitToList2.get(i74)), Long.parseLong(listSplitToList2.get(1)), 1 << (Integer.parseInt(listSplitToList2.get(2)) - 1)));
                                                    i17++;
                                                    i74 = 0;
                                                }
                                                this.f176756i.add(new qb.b(arrayList));
                                            } else if (c15 != 2816) {
                                                continue;
                                            }
                                            i67++;
                                            i28 = i75;
                                            i29 = 0;
                                            break;
                                        case -1251387154:
                                            if (strS.equals("Super_SlowMotion_Data")) {
                                                i15 = 2;
                                            }
                                            switch (i15) {
                                                case 0:
                                                    c15 = 2192;
                                                    break;
                                                case 1:
                                                    c15 = 2819;
                                                    break;
                                                case 2:
                                                    c15 = 2816;
                                                    break;
                                                case 3:
                                                    c15 = 2820;
                                                    break;
                                                case 4:
                                                    c15 = 2817;
                                                    break;
                                                default:
                                                    throw ParserException.createForMalformedContainer("Invalid SEF name", null);
                                            }
                                            i16 = aVar3.f176789b - (i69 + 8);
                                            if (c15 != 2192) {
                                                arrayList = new ArrayList();
                                                listSplitToList = m.f176784e.splitToList(rVar10.s(i16, charset));
                                                i17 = i74;
                                                while (i17 < listSplitToList.size()) {
                                                    listSplitToList2 = m.f176783d.splitToList(listSplitToList.get(i17));
                                                    if (listSplitToList2.size() == 3) {
                                                        throw ParserException.createForMalformedContainer(null, null);
                                                    }
                                                    arrayList.add(new qb.b.C2716b(Long.parseLong(listSplitToList2.get(i74)), Long.parseLong(listSplitToList2.get(1)), 1 << (Integer.parseInt(listSplitToList2.get(2)) - 1)));
                                                    i17++;
                                                    i74 = 0;
                                                }
                                                this.f176756i.add(new qb.b(arrayList));
                                            } else if (c15 != 2816) {
                                                continue;
                                            }
                                            i67++;
                                            i28 = i75;
                                            i29 = 0;
                                            break;
                                        case -830665521:
                                            if (strS.equals("Super_SlowMotion_Deflickering_On")) {
                                                i15 = 3;
                                            }
                                            switch (i15) {
                                                case 0:
                                                    c15 = 2192;
                                                    break;
                                                case 1:
                                                    c15 = 2819;
                                                    break;
                                                case 2:
                                                    c15 = 2816;
                                                    break;
                                                case 3:
                                                    c15 = 2820;
                                                    break;
                                                case 4:
                                                    c15 = 2817;
                                                    break;
                                                default:
                                                    throw ParserException.createForMalformedContainer("Invalid SEF name", null);
                                            }
                                            i16 = aVar3.f176789b - (i69 + 8);
                                            if (c15 != 2192) {
                                                arrayList = new ArrayList();
                                                listSplitToList = m.f176784e.splitToList(rVar10.s(i16, charset));
                                                i17 = i74;
                                                while (i17 < listSplitToList.size()) {
                                                    listSplitToList2 = m.f176783d.splitToList(listSplitToList.get(i17));
                                                    if (listSplitToList2.size() == 3) {
                                                        throw ParserException.createForMalformedContainer(null, null);
                                                    }
                                                    arrayList.add(new qb.b.C2716b(Long.parseLong(listSplitToList2.get(i74)), Long.parseLong(listSplitToList2.get(1)), 1 << (Integer.parseInt(listSplitToList2.get(2)) - 1)));
                                                    i17++;
                                                    i74 = 0;
                                                }
                                                this.f176756i.add(new qb.b(arrayList));
                                            } else if (c15 != 2816) {
                                                continue;
                                            }
                                            i67++;
                                            i28 = i75;
                                            i29 = 0;
                                            break;
                                        case 1760745220:
                                            if (strS.equals("Super_SlowMotion_BGM")) {
                                                i15 = i75;
                                            }
                                            switch (i15) {
                                                case 0:
                                                    c15 = 2192;
                                                    break;
                                                case 1:
                                                    c15 = 2819;
                                                    break;
                                                case 2:
                                                    c15 = 2816;
                                                    break;
                                                case 3:
                                                    c15 = 2820;
                                                    break;
                                                case 4:
                                                    c15 = 2817;
                                                    break;
                                                default:
                                                    throw ParserException.createForMalformedContainer("Invalid SEF name", null);
                                            }
                                            i16 = aVar3.f176789b - (i69 + 8);
                                            if (c15 != 2192) {
                                                arrayList = new ArrayList();
                                                listSplitToList = m.f176784e.splitToList(rVar10.s(i16, charset));
                                                i17 = i74;
                                                while (i17 < listSplitToList.size()) {
                                                    listSplitToList2 = m.f176783d.splitToList(listSplitToList.get(i17));
                                                    if (listSplitToList2.size() == 3) {
                                                        throw ParserException.createForMalformedContainer(null, null);
                                                    }
                                                    arrayList.add(new qb.b.C2716b(Long.parseLong(listSplitToList2.get(i74)), Long.parseLong(listSplitToList2.get(1)), 1 << (Integer.parseInt(listSplitToList2.get(2)) - 1)));
                                                    i17++;
                                                    i74 = 0;
                                                }
                                                this.f176756i.add(new qb.b(arrayList));
                                            } else if (c15 != 2816) {
                                                continue;
                                            }
                                            i67++;
                                            i28 = i75;
                                            i29 = 0;
                                            break;
                                    }
                                    i15 = -1;
                                    switch (i15) {
                                        case 0:
                                            c15 = 2192;
                                            break;
                                        case 1:
                                            c15 = 2819;
                                            break;
                                        case 2:
                                            c15 = 2816;
                                            break;
                                        case 3:
                                            c15 = 2820;
                                            break;
                                        case 4:
                                            c15 = 2817;
                                            break;
                                        default:
                                            throw ParserException.createForMalformedContainer("Invalid SEF name", null);
                                    }
                                    i16 = aVar3.f176789b - (i69 + 8);
                                    if (c15 != 2192) {
                                        arrayList = new ArrayList();
                                        listSplitToList = m.f176784e.splitToList(rVar10.s(i16, charset));
                                        i17 = i74;
                                        while (i17 < listSplitToList.size()) {
                                            listSplitToList2 = m.f176783d.splitToList(listSplitToList.get(i17));
                                            if (listSplitToList2.size() == 3) {
                                                throw ParserException.createForMalformedContainer(null, null);
                                            }
                                            arrayList.add(new qb.b.C2716b(Long.parseLong(listSplitToList2.get(i74)), Long.parseLong(listSplitToList2.get(1)), 1 << (Integer.parseInt(listSplitToList2.get(2)) - 1)));
                                            i17++;
                                            i74 = 0;
                                        }
                                        this.f176756i.add(new qb.b(arrayList));
                                    } else if (c15 != 2816) {
                                        continue;
                                    }
                                    i67++;
                                    i28 = i75;
                                    i29 = 0;
                                }
                                f0Var.f17167a = 0L;
                            }
                        } else {
                            fa.r rVar11 = new fa.r(8);
                            oVar.readFully(rVar11.f70054a, 0, 8);
                            mVar.f176787c = rVar11.i() + 8;
                            if (rVar11.g() != 1397048916) {
                                f0Var.f17167a = 0L;
                            } else {
                                f0Var.f17167a = oVar.getPosition() - ((long) (mVar.f176787c - 12));
                                mVar.f176786b = 2;
                            }
                        }
                        i14 = 1;
                    } else {
                        long length4 = oVar.getLength();
                        f0Var.f17167a = (length4 == -1 || length4 < 8) ? 0L : length4 - 8;
                        i14 = 1;
                        mVar.f176786b = 1;
                    }
                    if (f0Var.f17167a != 0) {
                        return i14;
                    }
                    this.f176758k = 0;
                    this.f176761n = 0;
                    return i14;
                }
                long j37 = this.f176760m - ((long) this.f176761n);
                long position7 = oVar.getPosition() + j37;
                fa.r rVar12 = this.f176762o;
                if (rVar12 != null) {
                    oVar.readFully(rVar12.f70054a, this.f176761n, (int) j37);
                    if (this.f176759l == 1718909296) {
                        this.f176768u = true;
                        rVar12.G(8);
                        int iG2 = rVar12.g();
                        if (iG2 != 1751476579) {
                            i18 = iG2 != 1903435808 ? 0 : 1;
                        } else {
                            i18 = 2;
                        }
                        if (i18 == 0) {
                            rVar12.H(4);
                            do {
                                if (rVar12.a() <= 0) {
                                    i18 = 0;
                                    break;
                                }
                                int iG3 = rVar12.g();
                                if (iG3 != 1751476579) {
                                    i18 = iG3 != 1903435808 ? 0 : 1;
                                } else {
                                    i18 = 2;
                                }
                            } while (i18 == 0);
                        }
                        this.E = i18;
                    } else if (!arrayDeque.isEmpty()) {
                        arrayDeque.peek().f76506c.add(new ga.b.c(this.f176759l, rVar12));
                    }
                } else {
                    if (!this.f176768u && this.f176759l == 1835295092) {
                        this.E = 1;
                    }
                    if (j37 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        oVar.skipFully((int) j37);
                    } else {
                        f0Var.f17167a = oVar.getPosition() + j37;
                        z14 = true;
                    }
                    g(position7);
                    if (this.f176769v) {
                        this.f176771x = true;
                        f0Var.f17167a = this.f176770w;
                        this.f176769v = false;
                        z14 = true;
                    }
                    if (z14 || this.f176758k == 2) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    if (z15) {
                        return 1;
                    }
                }
                z14 = false;
                g(position7);
                if (this.f176769v) {
                    this.f176771x = true;
                    f0Var.f17167a = this.f176770w;
                    this.f176769v = false;
                    z14 = true;
                }
                if (z14) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                if (z15) {
                    return 1;
                }
            }
        }
    }

    @Override // bb.n
    public final void c(bb.p pVar) {
        if ((this.f176749b & 16) == 0) {
            pVar = new yb.o(pVar, this.f176748a);
        }
        this.f176773z = pVar;
    }

    @Override // bb.n
    public final boolean d(bb.o oVar) {
        k0 k0VarB = n.b(oVar, false, (this.f176749b & 2) != 0);
        this.f176757j = k0VarB != null ? ImmutableList.of(k0VarB) : ImmutableList.of();
        return k0VarB == null;
    }

    /* JADX WARN: Code duplicated, block: B:287:0x0555 A[EDGE_INSN: B:287:0x0555->B:290:0x0579 BREAK  A[LOOP:9: B:246:0x04d0->B:288:0x0568]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0104  */
    /* JADX WARN: Code duplicated, block: B:426:0x084a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:432:0x0002 A[SYNTHETIC] */
    public final void g(long j8) {
        ArrayList arrayList;
        w wVar;
        ArrayDeque<ga.b.C1537b> arrayDeque;
        boolean z14;
        w wVar2;
        w wVar3;
        w wVar4;
        int i14;
        int i15;
        int i16;
        ArrayDeque<ga.b.C1537b> arrayDeque2;
        boolean z15;
        int i17;
        w wVar5;
        char c14;
        w wVar6;
        int iV;
        w wVar7;
        Parcelable parcelableF;
        ga.a aVarA;
        int i18;
        ga.a aVar;
        while (true) {
            ArrayDeque<ga.b.C1537b> arrayDeque3 = this.f176754g;
            if (arrayDeque3.isEmpty() || arrayDeque3.peek().f76505b != j8) {
                break;
            }
            ga.b.C1537b c1537bPop = arrayDeque3.pop();
            if (c1537bPop.f76504a == 1836019574) {
                ga.b.C1537b c1537bB = c1537bPop.b(Atom.TYPE_meta);
                ArrayList arrayList2 = new ArrayList();
                boolean z16 = true;
                int i19 = 4;
                int i24 = 1684108385;
                long j14 = 0;
                int i25 = this.f176749b;
                int i26 = 8;
                if (c1537bB != null) {
                    byte[] bArr = b.f176657a;
                    ga.b.c cVarC = c1537bB.c(Atom.TYPE_hdlr);
                    ga.b.c cVarC2 = c1537bB.c(Atom.TYPE_keys);
                    ga.b.c cVarC3 = c1537bB.c(Atom.TYPE_ilst);
                    if (cVarC == null || cVarC2 == null || cVarC3 == null) {
                        wVar = null;
                    } else {
                        fa.r rVar = cVarC.f76508b;
                        rVar.G(16);
                        if (rVar.g() != 1835299937) {
                            wVar = null;
                        } else {
                            fa.r rVar2 = cVarC2.f76508b;
                            rVar2.G(12);
                            int iG = rVar2.g();
                            String[] strArr = new String[iG];
                            int i27 = 0;
                            while (i27 < iG) {
                                int iG2 = rVar2.g();
                                rVar2.H(i19);
                                strArr[i27] = rVar2.s(iG2 - 8, StandardCharsets.UTF_8);
                                i27++;
                                i19 = 4;
                            }
                            fa.r rVar3 = cVarC3.f76508b;
                            rVar3.G(8);
                            ArrayList arrayList3 = new ArrayList();
                            while (rVar3.a() > i26) {
                                int i28 = rVar3.f70055b;
                                int iG3 = rVar3.g();
                                int iG4 = rVar3.g() - 1;
                                if (iG4 < 0 || iG4 >= iG) {
                                    fb1.c.r(iG4, "Skipped metadata with unknown key index: ");
                                } else {
                                    String str = strArr[iG4];
                                    int i29 = i28 + iG3;
                                    while (true) {
                                        int i30 = rVar3.f70055b;
                                        if (i30 >= i29) {
                                            aVar = null;
                                            break;
                                        }
                                        int iG5 = rVar3.g();
                                        if (rVar3.g() == i24) {
                                            int iG6 = rVar3.g();
                                            int iG7 = rVar3.g();
                                            int i34 = iG5 - 16;
                                            byte[] bArr2 = new byte[i34];
                                            rVar3.e(bArr2, 0, i34);
                                            aVar = new ga.a(str, bArr2, iG7, iG6);
                                            break;
                                        }
                                        rVar3.G(i30 + iG5);
                                        i24 = 1684108385;
                                    }
                                    if (aVar != null) {
                                        arrayList3.add(aVar);
                                    }
                                }
                                rVar3.G(i28 + iG3);
                                i26 = 8;
                                i24 = 1684108385;
                            }
                            if (arrayList3.isEmpty()) {
                                wVar = null;
                            } else {
                                wVar = new w(arrayList3);
                            }
                        }
                    }
                    if (this.f176771x) {
                        fa.a.f(wVar);
                        ga.a aVarA2 = i.a(wVar, "editable.tracks.samples.location");
                        if (aVarA2 != null && aVarA2.f76501b[0] == 0) {
                            this.f176772y = this.f176770w + 16;
                        }
                        ga.a aVarA3 = i.a(wVar, "editable.tracks.map");
                        fa.a.f(aVarA3);
                        ArrayList arrayListB = aVarA3.b();
                        ArrayList arrayList4 = new ArrayList(arrayListB.size());
                        int iD = 0;
                        while (iD < arrayListB.size()) {
                            int iIntValue = ((Integer) arrayListB.get(iD)).intValue();
                            if (iIntValue == 0) {
                                i18 = 1;
                            } else if (iIntValue == 1) {
                                i18 = 2;
                            } else if (iIntValue != 2) {
                                i18 = iIntValue != 3 ? 0 : 4;
                            } else {
                                i18 = 3;
                            }
                            iD = e5.d(i18, iD, arrayList4, 1);
                        }
                        arrayList = arrayList4;
                    } else {
                        if (wVar != null && (i25 & 64) != 0 && (aVarA = i.a(wVar, "editable.tracks.offset")) != null) {
                            long jZ = new fa.r(aVarA.f76501b).z();
                            if (jZ > 0) {
                                this.f176770w = jZ;
                                this.f176769v = true;
                                arrayDeque = arrayDeque3;
                            }
                            arrayDeque.clear();
                            if (!this.f176769v) {
                                this.f176758k = 2;
                            }
                        }
                        arrayList = arrayList2;
                    }
                } else {
                    arrayList = arrayList2;
                    wVar = null;
                }
                ArrayList arrayList5 = new ArrayList();
                boolean z17 = this.E == 1;
                y yVar = new y();
                ga.b.c cVarC4 = c1537bPop.c(Atom.TYPE_udta);
                if (cVarC4 != null) {
                    byte[] bArr3 = b.f176657a;
                    fa.r rVar4 = cVarC4.f76508b;
                    int i35 = 8;
                    rVar4.G(8);
                    w wVar8 = new w(new w.b[0]);
                    while (rVar4.a() >= i35) {
                        int i36 = rVar4.f70055b;
                        int iG8 = rVar4.g();
                        int iG9 = rVar4.g();
                        if (iG9 == 1835365473) {
                            rVar4.G(i36);
                            int i37 = i36 + iG8;
                            rVar4.H(i35);
                            int i38 = rVar4.f70055b;
                            rVar4.H(4);
                            boolean z18 = z16;
                            if (rVar4.g() != 1751411826) {
                                i38 += 4;
                            }
                            rVar4.G(i38);
                            while (true) {
                                int i39 = rVar4.f70055b;
                                if (i39 < i37) {
                                    int iG10 = rVar4.g();
                                    arrayDeque2 = arrayDeque3;
                                    if (rVar4.g() == 1768715124) {
                                        rVar4.G(i39);
                                        int i44 = i39 + iG10;
                                        rVar4.H(8);
                                        ArrayList arrayList6 = new ArrayList();
                                        while (true) {
                                            int i45 = rVar4.f70055b;
                                            if (i45 >= i44) {
                                                break;
                                            }
                                            int iG11 = rVar4.g() + i45;
                                            int iG12 = rVar4.g();
                                            int i46 = i44;
                                            int i47 = (iG12 >> 24) & 255;
                                            boolean z19 = z17;
                                            int i48 = iG8;
                                            if (i47 == 169 || i47 == 253) {
                                                int i49 = 16777215 & iG12;
                                                if (i49 == 6516084) {
                                                    int iG13 = rVar4.g();
                                                    if (rVar4.g() == 1684108385) {
                                                        rVar4.H(8);
                                                        String strQ = rVar4.q(iG13 - 16);
                                                        parcelableF = new pb.e(C.LANGUAGE_UNDETERMINED, strQ, strQ);
                                                    } else {
                                                        fa.k.g("Failed to parse comment attribute: ".concat(ga.b.a(iG12)));
                                                        parcelableF = null;
                                                    }
                                                    rVar4.G(iG11);
                                                } else {
                                                    if (i49 == 7233901 || i49 == 7631467) {
                                                        parcelableF = i.f(iG12, rVar4, "TIT2");
                                                    } else if (i49 == 6516589 || i49 == 7828084) {
                                                        parcelableF = i.f(iG12, rVar4, "TCOM");
                                                    } else if (i49 == 6578553) {
                                                        parcelableF = i.f(iG12, rVar4, "TDRC");
                                                    } else if (i49 == 4280916) {
                                                        parcelableF = i.f(iG12, rVar4, "TPE1");
                                                    } else if (i49 == 7630703) {
                                                        parcelableF = i.f(iG12, rVar4, "TSSE");
                                                    } else if (i49 == 6384738) {
                                                        parcelableF = i.f(iG12, rVar4, "TALB");
                                                    } else if (i49 == 7108978) {
                                                        parcelableF = i.f(iG12, rVar4, "USLT");
                                                    } else if (i49 == 6776174) {
                                                        parcelableF = i.f(iG12, rVar4, "TCON");
                                                    } else if (i49 == 6779504) {
                                                        parcelableF = i.f(iG12, rVar4, "TIT1");
                                                    } else {
                                                        fa.k.b("Skipped unknown metadata entry: ".concat(ga.b.a(iG12)));
                                                        rVar4.G(iG11);
                                                        parcelableF = null;
                                                    }
                                                    rVar4.G(iG11);
                                                }
                                            } else {
                                                if (iG12 == 1735291493) {
                                                    try {
                                                        String strA = pb.i.a(i.d(rVar4) - 1);
                                                        if (strA != null) {
                                                            parcelableF = new pb.m("TCON", (String) null, ImmutableList.of(strA));
                                                        } else {
                                                            fa.k.g("Failed to parse standard genre code");
                                                            parcelableF = null;
                                                        }
                                                    } catch (Throwable th3) {
                                                        rVar4.G(iG11);
                                                        throw th3;
                                                    }
                                                } else if (iG12 == 1684632427) {
                                                    parcelableF = i.c(iG12, rVar4, "TPOS");
                                                } else if (iG12 == 1953655662) {
                                                    parcelableF = i.c(iG12, rVar4, "TRCK");
                                                } else if (iG12 == 1953329263) {
                                                    parcelableF = i.e(iG12, "TBPM", rVar4, z18, false);
                                                } else if (iG12 == 1668311404) {
                                                    parcelableF = i.e(iG12, "TCMP", rVar4, true, true);
                                                } else if (iG12 == 1668249202) {
                                                    parcelableF = i.b(rVar4);
                                                } else if (iG12 == 1631670868) {
                                                    parcelableF = i.f(iG12, rVar4, "TPE2");
                                                } else if (iG12 == 1936682605) {
                                                    parcelableF = i.f(iG12, rVar4, "TSOT");
                                                } else if (iG12 == 1936679276) {
                                                    parcelableF = i.f(iG12, rVar4, "TSOA");
                                                } else if (iG12 == 1936679282) {
                                                    parcelableF = i.f(iG12, rVar4, "TSOP");
                                                } else if (iG12 == 1936679265) {
                                                    parcelableF = i.f(iG12, rVar4, "TSO2");
                                                } else if (iG12 == 1936679791) {
                                                    parcelableF = i.f(iG12, rVar4, "TSOC");
                                                } else if (iG12 == 1920233063) {
                                                    parcelableF = i.e(iG12, "ITUNESADVISORY", rVar4, false, false);
                                                } else if (iG12 == 1885823344) {
                                                    parcelableF = i.e(iG12, "ITUNESGAPLESS", rVar4, false, true);
                                                } else if (iG12 == 1936683886) {
                                                    parcelableF = i.f(iG12, rVar4, "TVSHOWSORT");
                                                } else if (iG12 == 1953919848) {
                                                    parcelableF = i.f(iG12, rVar4, "TVSHOW");
                                                } else if (iG12 == 757935405) {
                                                    String strQ2 = null;
                                                    String strQ3 = null;
                                                    int i54 = -1;
                                                    int i55 = -1;
                                                    while (true) {
                                                        int i56 = rVar4.f70055b;
                                                        if (i56 >= iG11) {
                                                            break;
                                                        }
                                                        int iG14 = rVar4.g();
                                                        int i57 = i55;
                                                        int iG15 = rVar4.g();
                                                        rVar4.H(4);
                                                        if (iG15 == 1835360622) {
                                                            strQ2 = rVar4.q(iG14 - 12);
                                                        } else if (iG15 == 1851878757) {
                                                            strQ3 = rVar4.q(iG14 - 12);
                                                        } else {
                                                            if (iG15 == 1684108385) {
                                                                i55 = iG14;
                                                                i54 = i56;
                                                            } else {
                                                                i55 = i57;
                                                            }
                                                            rVar4.H(iG14 - 12);
                                                        }
                                                        i55 = i57;
                                                    }
                                                    int i58 = i55;
                                                    if (strQ2 == null || strQ3 == null || i54 == -1) {
                                                        parcelableF = null;
                                                    } else {
                                                        rVar4.G(i54);
                                                        rVar4.H(16);
                                                        parcelableF = new pb.j(strQ2, strQ3, rVar4.q(i58 - 16));
                                                    }
                                                } else {
                                                    fa.k.b("Skipped unknown metadata entry: ".concat(ga.b.a(iG12)));
                                                    rVar4.G(iG11);
                                                    parcelableF = null;
                                                }
                                                rVar4.G(iG11);
                                            }
                                            if (parcelableF != null) {
                                                arrayList6.add(parcelableF);
                                            }
                                            i44 = i46;
                                            z17 = z19;
                                            iG8 = i48;
                                            z18 = true;
                                        }
                                        z15 = z17;
                                        i17 = iG8;
                                        if (!arrayList6.isEmpty()) {
                                            wVar7 = new w(arrayList6);
                                            break;
                                        }
                                        break;
                                    }
                                    rVar4.G(i39 + iG10);
                                    arrayDeque3 = arrayDeque2;
                                    z18 = true;
                                } else {
                                    arrayDeque2 = arrayDeque3;
                                    z15 = z17;
                                    i17 = iG8;
                                }
                                wVar7 = null;
                                break;
                            }
                            wVar8 = wVar8.d(wVar7);
                            i35 = 8;
                        } else {
                            arrayDeque2 = arrayDeque3;
                            z15 = z17;
                            i17 = iG8;
                            if (iG9 == 1936553057) {
                                rVar4.G(i36);
                                int i59 = i36 + i17;
                                rVar4.H(12);
                                while (true) {
                                    int i64 = rVar4.f70055b;
                                    if (i64 < i59) {
                                        int iG16 = rVar4.g();
                                        if (rVar4.g() == 1935766900) {
                                            if (iG16 >= 16) {
                                                rVar4.H(4);
                                                int i65 = -1;
                                                int i66 = 0;
                                                for (int i67 = 0; i67 < 2; i67++) {
                                                    int iU = rVar4.u();
                                                    int iU2 = rVar4.u();
                                                    if (iU == 0) {
                                                        i65 = iU2;
                                                    } else if (iU == 1) {
                                                        i66 = iU2;
                                                    }
                                                }
                                                if (i65 != 12) {
                                                    if (i65 != 13) {
                                                        if (i65 != 21) {
                                                            iV = -2147483647;
                                                        } else {
                                                            i35 = 8;
                                                            if (rVar4.a() < 8 || rVar4.f70055b + 8 > i59) {
                                                                c14 = '\f';
                                                            } else {
                                                                int iG17 = rVar4.g();
                                                                int iG18 = rVar4.g();
                                                                c14 = '\f';
                                                                if (iG17 >= 12 && iG18 == 1936877170) {
                                                                    iV = rVar4.v();
                                                                }
                                                            }
                                                            iV = -2147483647;
                                                        }
                                                        if (iV == -2147483647) {
                                                            wVar6 = new w(new qb.c(iV, i66));
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    iV = 120;
                                                } else {
                                                    iV = PsExtractor.VIDEO_STREAM_MASK;
                                                }
                                                i35 = 8;
                                                c14 = '\f';
                                                if (iV == -2147483647) {
                                                    wVar6 = new w(new qb.c(iV, i66));
                                                    break;
                                                }
                                                break;
                                            }
                                            wVar6 = null;
                                            i35 = 8;
                                            c14 = '\f';
                                            break;
                                        }
                                        rVar4.G(i64 + iG16);
                                    } else {
                                        i35 = 8;
                                        c14 = '\f';
                                    }
                                    wVar6 = null;
                                    break;
                                }
                                wVar8 = wVar8.d(wVar6);
                            } else {
                                i35 = 8;
                                if (iG9 == -1451722374) {
                                    short sR = rVar4.r();
                                    rVar4.H(2);
                                    String strS = rVar4.s(sR, StandardCharsets.UTF_8);
                                    int iMax = Math.max(strS.lastIndexOf(43), strS.lastIndexOf(45));
                                    try {
                                        wVar5 = new w(new ga.c(Float.parseFloat(strS.substring(0, iMax)), Float.parseFloat(strS.substring(iMax, strS.length() - 1))));
                                    } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                        wVar5 = null;
                                    }
                                    wVar8 = wVar8.d(wVar5);
                                }
                            }
                        }
                        rVar4.G(i36 + i17);
                        arrayDeque3 = arrayDeque2;
                        z17 = z15;
                        z16 = true;
                    }
                    arrayDeque = arrayDeque3;
                    z14 = z17;
                    yVar.b(wVar8);
                    wVar2 = wVar8;
                } else {
                    arrayDeque = arrayDeque3;
                    z14 = z17;
                    wVar2 = null;
                }
                ga.b.c cVarC5 = c1537bPop.c(Atom.TYPE_mvhd);
                cVarC5.getClass();
                w wVar9 = new w(b.d(cVarC5.f76508b));
                ArrayList arrayListG = b.g(c1537bPop, yVar, C.TIME_UNSET, null, (i25 & 1) != 0, z14, new androidx.media3.common.p(18));
                if (this.f176771x) {
                    boolean z24 = arrayList.size() == arrayListG.size();
                    Locale locale = Locale.US;
                    fa.a.e(z24, am.j.g(arrayList.size(), arrayListG.size(), "The number of auxiliary track types from metadata (", ") is not same as the number of editable video tracks (", ")"));
                }
                int size = -1;
                int i68 = 0;
                int i69 = 0;
                long j15 = C.TIME_UNSET;
                while (i68 < arrayListG.size()) {
                    r rVar5 = (r) arrayListG.get(i68);
                    if (rVar5.f176826b == 0) {
                        wVar4 = wVar;
                        wVar3 = wVar9;
                        arrayListG = arrayListG;
                    } else {
                        o oVar = rVar5.f176825a;
                        w wVar10 = wVar;
                        w wVar11 = wVar9;
                        long j16 = oVar.f176795e;
                        androidx.media3.common.q qVar = oVar.f176797g;
                        int i74 = oVar.f176792b;
                        long j17 = j16 != C.TIME_UNSET ? j16 : rVar5.f176832h;
                        long jMax = Math.max(j15, j17);
                        int i75 = i69 + 1;
                        a aVar2 = new a(oVar, rVar5, this.f176773z.track(i69, i74));
                        boolean zEquals = MimeTypes.AUDIO_TRUEHD.equals(qVar.f8386n);
                        int i76 = rVar5.f176829e;
                        int i77 = zEquals ? i76 * 16 : i76 + 30;
                        androidx.media3.common.q.b bVarA = qVar.a();
                        bVarA.f8412n = i77;
                        if (i74 == 2) {
                            int i78 = qVar.f8378f;
                            if ((i25 & 8) != 0) {
                                i78 |= size == -1 ? 1 : 2;
                            }
                            if (qVar.f8395w == -1.0f && j17 > 0 && (i16 = rVar5.f176826b) > 0) {
                                bVarA.f8420v = i16 / (j17 / 1000000.0f);
                            }
                            if (this.f176771x) {
                                i78 |= 32768;
                                bVarA.f8405g = ((Integer) arrayList.get(i68)).intValue();
                            }
                            bVarA.f8404f = i78;
                        }
                        yVar = yVar;
                        if (i74 == 1 && (i14 = yVar.f17274a) != -1 && (i15 = yVar.f17275b) != -1) {
                            bVarA.E = i14;
                            bVarA.F = i15;
                        }
                        ArrayList arrayList7 = this.f176756i;
                        w wVar12 = arrayList7.isEmpty() ? null : new w(arrayList7);
                        w wVar13 = wVar11;
                        w[] wVarArr = {wVar12, wVar2, wVar13};
                        w wVar14 = new w(new w.b[0]);
                        if (wVar10 != null) {
                            wVar4 = wVar10;
                            int i79 = 0;
                            while (true) {
                                w.b[] bVarArr = wVar4.f8574a;
                                wVar3 = wVar13;
                                if (i79 >= bVarArr.length) {
                                    break;
                                }
                                w.b bVar = bVarArr[i79];
                                if (bVar instanceof ga.a) {
                                    ga.a aVar3 = (ga.a) bVar;
                                    if (!aVar3.f76500a.equals(MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS)) {
                                        wVar14 = wVar14.b(aVar3);
                                    } else if (i74 == 2) {
                                        wVar14 = wVar14.b(aVar3);
                                    }
                                }
                                i79++;
                                wVar13 = wVar3;
                            }
                        } else {
                            wVar3 = wVar13;
                            wVar4 = wVar10;
                        }
                        for (int i84 = 0; i84 < 3; i84++) {
                            wVar14 = wVar14.d(wVarArr[i84]);
                        }
                        if (wVar14.f8574a.length > 0) {
                            bVarA.f8409k = wVar14;
                        }
                        aVar2.f176776c.d(bVarA.a());
                        if (i74 == 2 && size == -1) {
                            size = arrayList5.size();
                        }
                        arrayList5.add(aVar2);
                        i69 = i75;
                        j15 = jMax;
                    }
                    i68++;
                    wVar = wVar4;
                    wVar2 = wVar2;
                    arrayListG = arrayListG;
                    wVar9 = wVar3;
                }
                this.C = size;
                this.D = j15;
                a[] aVarArr = (a[]) arrayList5.toArray(new a[0]);
                this.A = aVarArr;
                long[][] jArr = new long[aVarArr.length][];
                int[] iArr = new int[aVarArr.length];
                long[] jArr2 = new long[aVarArr.length];
                boolean[] zArr = new boolean[aVarArr.length];
                for (int i85 = 0; i85 < aVarArr.length; i85++) {
                    jArr[i85] = new long[aVarArr[i85].f176775b.f176826b];
                    jArr2[i85] = aVarArr[i85].f176775b.f176830f[0];
                }
                int i86 = 0;
                while (i86 < aVarArr.length) {
                    long j18 = Long.MAX_VALUE;
                    int i87 = -1;
                    for (int i88 = 0; i88 < aVarArr.length; i88++) {
                        if (!zArr[i88]) {
                            long j19 = jArr2[i88];
                            if (j19 <= j18) {
                                i87 = i88;
                                j18 = j19;
                            }
                        }
                    }
                    int i89 = iArr[i87];
                    long[] jArr3 = jArr[i87];
                    jArr3[i89] = j14;
                    r rVar6 = aVarArr[i87].f176775b;
                    j14 += (long) rVar6.f176828d[i89];
                    int i93 = i89 + 1;
                    iArr[i87] = i93;
                    if (i93 < jArr3.length) {
                        jArr2[i87] = rVar6.f176830f[i93];
                    } else {
                        zArr[i87] = true;
                        i86++;
                    }
                }
                this.B = jArr;
                this.f176773z.endTracks();
                this.f176773z.a(this);
                arrayDeque.clear();
                if (!this.f176769v) {
                    this.f176758k = 2;
                }
            } else if (!arrayDeque3.isEmpty()) {
                arrayDeque3.peek().f76507d.add(c1537bPop);
            }
        }
        if (this.f176758k != 2) {
            this.f176758k = 0;
            this.f176761n = 0;
        }
    }

    @Override // bb.g0
    public final long getDurationUs() {
        return this.D;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0080  */
    /* JADX WARN: Code duplicated, block: B:37:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x0094  */
    /* JADX WARN: Code duplicated, block: B:42:0x009b A[LOOP:2: B:38:0x0092->B:42:0x009b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00be  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c6 A[LOOP:3: B:52:0x00bc->B:56:0x00c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:72:0x0105  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f4 A[EDGE_INSN: B:76:0x00f4->B:68:0x00f4 BREAK  A[LOOP:1: B:33:0x007b->B:67:0x00ee], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x009f A[EDGE_INSN: B:80:0x009f->B:44:0x009f BREAK  A[LOOP:2: B:38:0x0092->B:42:0x009b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00c4 A[EDGE_INSN: B:82:0x00c4->B:55:0x00c4 BREAK  A[LOOP:3: B:52:0x00bc->B:56:0x00c6], SYNTHETIC] */
    @Override // bb.g0
    public final g0.a getSeekPoints(long j8) {
        long j14;
        long j15;
        long j16;
        long j17;
        int i14;
        long jMin;
        a[] aVarArr;
        int i15;
        long j18;
        r rVar;
        long[] jArr;
        int[] iArr;
        int iE;
        long jMin2;
        int iE2;
        int iA;
        a[] aVarArr2 = this.A;
        if (aVarArr2.length == 0) {
            return new g0.a(h0.f17185c);
        }
        int i16 = this.C;
        boolean z14 = false;
        int i17 = -1;
        long j19 = -1;
        if (i16 != -1) {
            r rVar2 = aVarArr2[i16].f176775b;
            int iE3 = z.e(rVar2.f176830f, j8, false);
            while (true) {
                if (iE3 < 0) {
                    iE3 = -1;
                    break;
                }
                if ((rVar2.f176831g[iE3] & 1) != 0) {
                    break;
                }
                iE3--;
            }
            if (iE3 == -1) {
                iE3 = rVar2.a(j8);
            }
            long[] jArr2 = rVar2.f176827c;
            long[] jArr3 = rVar2.f176830f;
            if (iE3 == -1) {
                return new g0.a(h0.f17185c);
            }
            j16 = jArr3[iE3];
            j15 = jArr2[iE3];
            if (j16 < j8) {
                j14 = C.TIME_UNSET;
                if (iE3 < rVar2.f176826b - 1 && (iA = rVar2.a(j8)) != -1 && iA != iE3) {
                    j17 = jArr3[iA];
                    j19 = jArr2[iA];
                }
                i14 = 0;
                jMin = j15;
                while (true) {
                    aVarArr = this.A;
                    if (i14 < aVarArr.length) {
                        break;
                    }
                    if (i14 != this.C) {
                        rVar = aVarArr[i14].f176775b;
                        long[] jArr4 = rVar.f176830f;
                        jArr = rVar.f176827c;
                        iArr = rVar.f176831g;
                        iE = z.e(jArr4, j16, z14);
                        while (true) {
                            if (iE >= 0) {
                                iE = i17;
                                break;
                            }
                            if ((iArr[iE] & 1) != 0) {
                                break;
                            }
                            iE--;
                        }
                        if (iE == i17) {
                            iE = rVar.a(j16);
                        }
                        if (iE == i17) {
                            jMin = Math.min(jArr[iE], jMin);
                        }
                        if (j17 != j14) {
                            iE2 = z.e(rVar.f176830f, j17, z14);
                            while (true) {
                                if (iE2 >= 0) {
                                    iE2 = -1;
                                    break;
                                }
                                if ((iArr[iE2] & 1) != 0) {
                                    break;
                                }
                                iE2--;
                            }
                            i15 = -1;
                            if (iE2 == -1) {
                                iE2 = rVar.a(j17);
                            }
                            if (iE2 == -1) {
                                jMin = jMin;
                                jMin2 = Math.min(jArr[iE2], j19);
                            }
                            j18 = jMin2;
                            jMin = jMin;
                        } else {
                            i15 = -1;
                        }
                        jMin2 = j19;
                        j18 = jMin2;
                        jMin = jMin;
                    } else {
                        long j24 = j19;
                        i15 = i17;
                        j18 = j24;
                        jMin = jMin;
                    }
                    i14++;
                    i17 = i15;
                    j19 = j18;
                    z14 = false;
                }
                long j25 = j19;
                h0 h0Var = new h0(j16, jMin);
                return j17 == j14 ? new g0.a(h0Var) : new g0.a(h0Var, new h0(j17, j25));
            }
            j14 = C.TIME_UNSET;
        } else {
            j14 = C.TIME_UNSET;
            j15 = Long.MAX_VALUE;
            j16 = j8;
        }
        j17 = j14;
        i14 = 0;
        jMin = j15;
        while (true) {
            aVarArr = this.A;
            if (i14 < aVarArr.length) {
                break;
                break;
            }
            if (i14 != this.C) {
                rVar = aVarArr[i14].f176775b;
                long[] jArr5 = rVar.f176830f;
                jArr = rVar.f176827c;
                iArr = rVar.f176831g;
                iE = z.e(jArr5, j16, z14);
                while (true) {
                    if (iE >= 0) {
                        iE = i17;
                        break;
                    }
                    if ((iArr[iE] & 1) != 0) {
                        break;
                        break;
                    }
                    iE--;
                }
                if (iE == i17) {
                    iE = rVar.a(j16);
                }
                if (iE == i17) {
                    jMin = Math.min(jArr[iE], jMin);
                }
                if (j17 != j14) {
                    iE2 = z.e(rVar.f176830f, j17, z14);
                    while (true) {
                        if (iE2 >= 0) {
                            iE2 = -1;
                            break;
                        }
                        if ((iArr[iE2] & 1) != 0) {
                            break;
                            break;
                        }
                        iE2--;
                    }
                    i15 = -1;
                    if (iE2 == -1) {
                        iE2 = rVar.a(j17);
                    }
                    if (iE2 == -1) {
                        jMin = jMin;
                        jMin2 = Math.min(jArr[iE2], j19);
                    }
                    j18 = jMin2;
                    jMin = jMin;
                } else {
                    i15 = -1;
                }
                jMin2 = j19;
                j18 = jMin2;
                jMin = jMin;
            } else {
                long j26 = j19;
                i15 = i17;
                j18 = j26;
                jMin = jMin;
            }
            i14++;
            i17 = i15;
            j19 = j18;
            z14 = false;
        }
        long j27 = j19;
        h0 h0Var2 = new h0(j16, jMin);
        if (j17 == j14) {
        }
    }

    @Override // bb.g0
    public final boolean isSeekable() {
        return true;
    }

    @Override // bb.n
    public final void release() {
    }

    @Override // bb.n
    public final void seek(long j8, long j14) {
        this.f176754g.clear();
        this.f176761n = 0;
        this.f176763p = -1;
        this.f176764q = 0;
        this.f176765r = 0;
        this.f176766s = 0;
        this.f176767t = (this.f176749b & 32) == 0;
        if (j8 == 0) {
            if (this.f176758k != 3) {
                this.f176758k = 0;
                this.f176761n = 0;
                return;
            } else {
                m mVar = this.f176755h;
                mVar.f176785a.clear();
                mVar.f176786b = 0;
                this.f176756i.clear();
                return;
            }
        }
        for (a aVar : this.A) {
            r rVar = aVar.f176775b;
            int iE = z.e(rVar.f176830f, j14, false);
            while (true) {
                if (iE < 0) {
                    iE = -1;
                    break;
                } else if ((rVar.f176831g[iE] & 1) != 0) {
                    break;
                } else {
                    iE--;
                }
            }
            if (iE == -1) {
                iE = rVar.a(j14);
            }
            aVar.f176778e = iE;
            m0 m0Var = aVar.f176777d;
            if (m0Var != null) {
                m0Var.f17234b = false;
                m0Var.f17235c = 0;
            }
        }
    }

    public j(yb.n.a aVar) {
        this(aVar, 0);
    }

    @Deprecated
    public j(int i14) {
        this(yb.n.a.f195662a, i14);
    }

    @Deprecated
    public j() {
        this(yb.n.a.f195662a, 16);
    }
}
