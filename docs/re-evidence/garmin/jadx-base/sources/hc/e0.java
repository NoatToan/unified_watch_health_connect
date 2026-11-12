package hc;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.ParserException;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements bb.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f82871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f82872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f82873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<fa.w> f82874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fa.r f82875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseIntArray f82876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f0.c f82877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yb.n.a f82878h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseArray<f0> f82879i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SparseBooleanArray f82880j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SparseBooleanArray f82881k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d0 f82882l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c0 f82883m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public bb.p f82884n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f82885o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f82886p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f82887q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f82888r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public f0 f82889s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f82890t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f82891u;

    public class a implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final fa.q f82892a = new fa.q(new byte[4]);

        public a() {
        }

        @Override // hc.z
        public final void a(fa.w wVar, bb.p pVar, f0.d dVar) {
        }

        @Override // hc.z
        public final void b(fa.r rVar) {
            e0 e0Var;
            if (rVar.u() == 0 && (rVar.u() & 128) != 0) {
                rVar.H(6);
                int iA = rVar.a() / 4;
                int i14 = 0;
                while (true) {
                    e0Var = e0.this;
                    if (i14 >= iA) {
                        break;
                    }
                    fa.q qVar = this.f82892a;
                    rVar.e(qVar.f70047a, 0, 4);
                    qVar.m(0);
                    int iG = qVar.g(16);
                    qVar.o(3);
                    if (iG == 0) {
                        qVar.o(13);
                    } else {
                        int iG2 = qVar.g(13);
                        if (e0Var.f82879i.get(iG2) == null) {
                            e0Var.f82879i.put(iG2, new a0(e0Var.new b(iG2)));
                            e0Var.f82885o++;
                        }
                    }
                    i14++;
                }
                if (e0Var.f82871a != 2) {
                    e0Var.f82879i.remove(0);
                }
            }
        }
    }

    public class b implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final fa.q f82894a = new fa.q(new byte[5]);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseArray<f0> f82895b = new SparseArray<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseIntArray f82896c = new SparseIntArray();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f82897d;

        public b(int i14) {
            this.f82897d = i14;
        }

        @Override // hc.z
        public final void a(fa.w wVar, bb.p pVar, f0.d dVar) {
        }

        /* JADX WARN: Code duplicated, block: B:41:0x0139  */
        @Override // hc.z
        public final void b(fa.r rVar) {
            fa.w wVar;
            int i14;
            SparseArray<f0> sparseArray;
            fa.w wVar2;
            char c14;
            if (rVar.u() != 2) {
                return;
            }
            e0 e0Var = e0.this;
            int i15 = e0Var.f82871a;
            SparseArray<f0> sparseArray2 = e0Var.f82879i;
            SparseBooleanArray sparseBooleanArray = e0Var.f82880j;
            f0.c cVar = e0Var.f82877g;
            List<fa.w> list = e0Var.f82874d;
            int i16 = e0Var.f82871a;
            int i17 = 0;
            if (i15 == 1 || i15 == 2 || e0Var.f82885o == 1) {
                wVar = list.get(0);
            } else {
                wVar = new fa.w(list.get(0).d());
                list.add(wVar);
            }
            if ((rVar.u() & 128) == 0) {
                return;
            }
            rVar.H(1);
            int iA = rVar.A();
            rVar.H(3);
            fa.q qVar = this.f82894a;
            rVar.e(qVar.f70047a, 0, 2);
            qVar.m(0);
            qVar.o(3);
            e0Var.f82891u = qVar.g(13);
            rVar.e(qVar.f70047a, 0, 2);
            qVar.m(0);
            qVar.o(4);
            rVar.H(qVar.g(12));
            if (i16 == 2 && e0Var.f82889s == null) {
                f0 f0VarA = cVar.a(21, new f0.b(21, null, 0, null, fa.z.f70076f));
                e0Var.f82889s = f0VarA;
                if (f0VarA != null) {
                    f0VarA.a(wVar, e0Var.f82884n, new f0.d(iA, 21, 8192));
                }
            }
            SparseArray<f0> sparseArray3 = this.f82895b;
            sparseArray3.clear();
            SparseIntArray sparseIntArray = this.f82896c;
            sparseIntArray.clear();
            int iA2 = rVar.a();
            while (iA2 > 0) {
                rVar.e(qVar.f70047a, i17, 5);
                qVar.m(i17);
                int iG = qVar.g(8);
                qVar.o(3);
                int iG2 = qVar.g(13);
                qVar.o(4);
                int iG3 = qVar.g(12);
                int i18 = rVar.f70055b;
                fa.q qVar2 = qVar;
                int i19 = i18 + iG3;
                int i24 = -1;
                String str = null;
                ArrayList arrayList = null;
                int iU = 0;
                int i25 = iA2;
                while (rVar.f70055b < i19) {
                    int iU2 = rVar.u();
                    int iU3 = rVar.f70055b + rVar.u();
                    if (iU3 > i19) {
                        break;
                    }
                    SparseArray<f0> sparseArray4 = sparseArray2;
                    if (iU2 == 5) {
                        long jW = rVar.w();
                        if (jW == 1094921523) {
                            i24 = 129;
                        } else if (jW == 1161904947) {
                            i24 = 135;
                        } else if (jW == 1094921524) {
                            i24 = 172;
                        } else if (jW == 1212503619) {
                            i24 = 36;
                        }
                    } else if (iU2 == 106) {
                        iU3 = iU3;
                        sparseArray3 = sparseArray3;
                        wVar = wVar;
                        i24 = 129;
                    } else if (iU2 == 122) {
                        sparseArray3 = sparseArray3;
                        wVar = wVar;
                        iA = iA;
                        i24 = 135;
                        iU3 = iU3;
                    } else if (iU2 == 127) {
                        int iU4 = rVar.u();
                        if (iU4 == 21) {
                            i24 = 172;
                        } else if (iU4 == 14) {
                            i24 = SyslogConstants.LOG_LOCAL1;
                        } else if (iU4 == 33) {
                            i24 = 139;
                        }
                    } else if (iU2 == 123) {
                        i24 = 138;
                    } else if (iU2 == 10) {
                        String strTrim = rVar.s(3, StandardCharsets.UTF_8).trim();
                        iU = rVar.u();
                        str = strTrim;
                    } else if (iU2 == 89) {
                        ArrayList arrayList2 = new ArrayList();
                        while (rVar.f70055b < iU3) {
                            int i26 = iU3;
                            String strTrim2 = rVar.s(3, StandardCharsets.UTF_8).trim();
                            int iU5 = rVar.u();
                            int i27 = iA;
                            byte[] bArr = new byte[4];
                            rVar.e(bArr, 0, 4);
                            arrayList2.add(new f0.a(strTrim2, iU5, bArr));
                            iA = i27;
                            iU3 = i26;
                            wVar = wVar;
                            sparseArray3 = sparseArray3;
                        }
                        iU3 = iU3;
                        sparseArray3 = sparseArray3;
                        wVar = wVar;
                        iA = iA;
                        arrayList = arrayList2;
                        i24 = 89;
                    } else {
                        iU3 = iU3;
                        sparseArray3 = sparseArray3;
                        wVar = wVar;
                        iA = iA;
                        if (iU2 == 111) {
                            i24 = 257;
                        }
                    }
                    rVar.H(iU3 - rVar.f70055b);
                    iA = iA;
                    sparseArray2 = sparseArray4;
                    wVar = wVar;
                    sparseArray3 = sparseArray3;
                }
                SparseArray<f0> sparseArray5 = sparseArray3;
                fa.w wVar3 = wVar;
                SparseArray<f0> sparseArray6 = sparseArray2;
                int i28 = iA;
                rVar.G(i19);
                f0.b bVar = new f0.b(i24, str, iU, arrayList, Arrays.copyOfRange(rVar.f70054a, i18, i19));
                if (iG == 6 || iG == 5) {
                    iG = bVar.f82924a;
                }
                iA2 = i25 - (iG3 + 5);
                int i29 = i16 == 2 ? iG : iG2;
                if (sparseBooleanArray.get(i29)) {
                    sparseArray3 = sparseArray5;
                    c14 = 21;
                } else {
                    c14 = 21;
                    f0 f0VarA2 = (i16 == 2 && iG == 21) ? e0Var.f82889s : cVar.a(iG, bVar);
                    if (i16 != 2 || iG2 < sparseIntArray.get(i29, 8192)) {
                        sparseIntArray.put(i29, iG2);
                        sparseArray3 = sparseArray5;
                        sparseArray3.put(i29, f0VarA2);
                    } else {
                        sparseArray3 = sparseArray5;
                    }
                }
                iA = i28;
                qVar = qVar2;
                sparseArray2 = sparseArray6;
                wVar = wVar3;
                i17 = 0;
            }
            fa.w wVar4 = wVar;
            SparseArray<f0> sparseArray7 = sparseArray2;
            int i30 = iA;
            int size = sparseIntArray.size();
            int i34 = 0;
            while (i34 < size) {
                int iKeyAt = sparseIntArray.keyAt(i34);
                int iValueAt = sparseIntArray.valueAt(i34);
                sparseBooleanArray.put(iKeyAt, true);
                e0Var.f82881k.put(iValueAt, true);
                f0 f0VarValueAt = sparseArray3.valueAt(i34);
                if (f0VarValueAt != null) {
                    if (f0VarValueAt != e0Var.f82889s) {
                        bb.p pVar = e0Var.f82884n;
                        i14 = i30;
                        f0.d dVar = new f0.d(i14, iKeyAt, 8192);
                        wVar2 = wVar4;
                        f0VarValueAt.a(wVar2, pVar, dVar);
                    } else {
                        i14 = i30;
                        wVar2 = wVar4;
                    }
                    sparseArray = sparseArray7;
                    sparseArray.put(iValueAt, f0VarValueAt);
                } else {
                    i14 = i30;
                    sparseArray = sparseArray7;
                    wVar2 = wVar4;
                }
                i34++;
                wVar4 = wVar2;
                sparseArray7 = sparseArray;
                i30 = i14;
            }
            SparseArray<f0> sparseArray8 = sparseArray7;
            if (i16 == 2) {
                if (e0Var.f82886p) {
                    return;
                }
                e0Var.f82884n.endTracks();
                e0Var.f82885o = 0;
                e0Var.f82886p = true;
                return;
            }
            sparseArray8.remove(this.f82897d);
            int i35 = i16 == 1 ? 0 : e0Var.f82885o - 1;
            e0Var.f82885o = i35;
            if (i35 == 0) {
                e0Var.f82884n.endTracks();
                e0Var.f82886p = true;
            }
        }
    }

    public e0(int i14, int i15, yb.n.a aVar, fa.w wVar, f0.c cVar, int i16) {
        cVar.getClass();
        this.f82877g = cVar;
        this.f82873c = i16;
        this.f82871a = i14;
        this.f82872b = i15;
        this.f82878h = aVar;
        if (i14 == 1 || i14 == 2) {
            this.f82874d = Collections.singletonList(wVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f82874d = arrayList;
            arrayList.add(wVar);
        }
        this.f82875e = new fa.r(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f82880j = sparseBooleanArray;
        this.f82881k = new SparseBooleanArray();
        SparseArray<f0> sparseArray = new SparseArray<>();
        this.f82879i = sparseArray;
        this.f82876f = new SparseIntArray();
        this.f82882l = new d0(i16);
        this.f82884n = bb.p.M;
        this.f82891u = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray<f0> sparseArrayCreateInitialPayloadReaders = cVar.createInitialPayloadReaders();
        int size = sparseArrayCreateInitialPayloadReaders.size();
        for (int i17 = 0; i17 < size; i17++) {
            sparseArray.put(sparseArrayCreateInitialPayloadReaders.keyAt(i17), sparseArrayCreateInitialPayloadReaders.valueAt(i17));
        }
        sparseArray.put(0, new a0(new a()));
        this.f82889s = null;
    }

    @Override // bb.n
    public final int b(bb.o oVar, bb.f0 f0Var) throws ParserException {
        byte b14;
        long jA;
        long j8;
        long length = oVar.getLength();
        int i14 = this.f82871a;
        boolean z14 = i14 == 2;
        if (this.f82886p) {
            d0 d0Var = this.f82882l;
            if (length != -1 && !z14 && !d0Var.f82853d) {
                int i15 = this.f82891u;
                fa.w wVar = d0Var.f82851b;
                int i16 = d0Var.f82850a;
                fa.r rVar = d0Var.f82852c;
                if (i15 <= 0) {
                    d0Var.a(oVar);
                    return 0;
                }
                if (d0Var.f82855f) {
                    if (d0Var.f82857h == C.TIME_UNSET) {
                        d0Var.a(oVar);
                        return 0;
                    }
                    if (d0Var.f82854e) {
                        long j14 = d0Var.f82856g;
                        if (j14 == C.TIME_UNSET) {
                            d0Var.a(oVar);
                            return 0;
                        }
                        d0Var.f82858i = wVar.c(d0Var.f82857h) - wVar.b(j14);
                        d0Var.a(oVar);
                        return 0;
                    }
                    int iMin = (int) Math.min(i16, oVar.getLength());
                    long j15 = 0;
                    if (oVar.getPosition() != j15) {
                        f0Var.f17167a = j15;
                        return 1;
                    }
                    rVar.D(iMin);
                    oVar.resetPeekPosition();
                    oVar.peekFully(rVar.f70054a, 0, iMin);
                    int i17 = rVar.f70056c;
                    for (int i18 = rVar.f70055b; i18 < i17; i18++) {
                        if (rVar.f70054a[i18] == 71) {
                            jA = g0.a(rVar, i18, i15);
                            if (jA != C.TIME_UNSET) {
                                d0Var.f82856g = jA;
                                d0Var.f82854e = true;
                                return 0;
                            }
                        }
                    }
                    jA = -9223372036854775807L;
                    d0Var.f82856g = jA;
                    d0Var.f82854e = true;
                    return 0;
                }
                long length2 = oVar.getLength();
                int iMin2 = (int) Math.min(i16, length2);
                long j16 = length2 - ((long) iMin2);
                if (oVar.getPosition() != j16) {
                    f0Var.f17167a = j16;
                    return 1;
                }
                rVar.D(iMin2);
                oVar.resetPeekPosition();
                oVar.peekFully(rVar.f70054a, 0, iMin2);
                int i19 = rVar.f70055b;
                int i24 = rVar.f70056c;
                for (int i25 = i24 - 188; i25 >= i19; i25--) {
                    byte[] bArr = rVar.f70054a;
                    int i26 = 0;
                    for (int i27 = -4; i27 <= 4; i27++) {
                        int i28 = (i27 * TsExtractor.TS_PACKET_SIZE) + i25;
                        if (i28 < i19 || i28 >= i24 || bArr[i28] != 71) {
                            i26 = 0;
                        } else {
                            i26++;
                            if (i26 == 5) {
                                long jA2 = g0.a(rVar, i25, i15);
                                if (jA2 == C.TIME_UNSET) {
                                    break;
                                }
                                j8 = jA2;
                                d0Var.f82857h = j8;
                                d0Var.f82855f = true;
                                return 0;
                            }
                        }
                    }
                }
                j8 = -9223372036854775807L;
                d0Var.f82857h = j8;
                d0Var.f82855f = true;
                return 0;
            }
            if (this.f82887q) {
                b14 = 71;
            } else {
                this.f82887q = true;
                long j17 = d0Var.f82858i;
                if (j17 != C.TIME_UNSET) {
                    b14 = 71;
                    c0 c0Var = new c0(d0Var.f82851b, j17, length, this.f82891u, this.f82873c);
                    this.f82883m = c0Var;
                    this.f82884n.a(c0Var.f17144a);
                } else {
                    b14 = 71;
                    this.f82884n.a(new bb.g0.b(j17));
                }
            }
            if (this.f82888r) {
                this.f82888r = false;
                seek(0L, 0L);
                if (oVar.getPosition() != 0) {
                    f0Var.f17167a = 0L;
                    return 1;
                }
            }
            c0 c0Var2 = this.f82883m;
            if (c0Var2 != null && c0Var2.f17146c != null) {
                return c0Var2.a(oVar, f0Var);
            }
        } else {
            b14 = 71;
        }
        fa.r rVar2 = this.f82875e;
        byte[] bArr2 = rVar2.f70054a;
        if (9400 - rVar2.f70055b < 188) {
            int iA = rVar2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, rVar2.f70055b, bArr2, 0, iA);
            }
            rVar2.E(bArr2, iA);
        }
        while (true) {
            int iA2 = rVar2.a();
            SparseArray<f0> sparseArray = this.f82879i;
            if (iA2 >= 188) {
                int i29 = rVar2.f70055b;
                int i30 = rVar2.f70056c;
                byte[] bArr3 = rVar2.f70054a;
                int i34 = i29;
                while (i34 < i30 && bArr3[i34] != b14) {
                    i34++;
                }
                rVar2.G(i34);
                int i35 = i34 + TsExtractor.TS_PACKET_SIZE;
                if (i35 > i30) {
                    int i36 = (i34 - i29) + this.f82890t;
                    this.f82890t = i36;
                    if (i14 == 2 && i36 > 376) {
                        throw ParserException.createForMalformedContainer("Cannot find sync byte. Most likely not a Transport Stream.", null);
                    }
                } else {
                    this.f82890t = 0;
                }
                int i37 = rVar2.f70056c;
                if (i35 > i37) {
                    return 0;
                }
                int iG = rVar2.g();
                if ((8388608 & iG) != 0) {
                    rVar2.G(i35);
                    return 0;
                }
                int i38 = (4194304 & iG) != 0 ? 1 : 0;
                int i39 = (2096896 & iG) >> 8;
                boolean z15 = (iG & 32) != 0;
                f0 f0Var2 = (iG & 16) != 0 ? sparseArray.get(i39) : null;
                if (f0Var2 == null) {
                    rVar2.G(i35);
                    return 0;
                }
                if (i14 != 2) {
                    int i44 = iG & 15;
                    SparseIntArray sparseIntArray = this.f82876f;
                    int i45 = sparseIntArray.get(i39, i44 - 1);
                    sparseIntArray.put(i39, i44);
                    if (i45 == i44) {
                        rVar2.G(i35);
                        return 0;
                    }
                    if (i44 != ((i45 + 1) & 15)) {
                        f0Var2.seek();
                    }
                }
                if (z15) {
                    int iU = rVar2.u();
                    i38 |= (rVar2.u() & 64) != 0 ? 2 : 0;
                    rVar2.H(iU - 1);
                }
                boolean z16 = this.f82886p;
                if (i14 == 2 || z16 || !this.f82881k.get(i39, false)) {
                    rVar2.F(i35);
                    f0Var2.b(i38, rVar2);
                    rVar2.F(i37);
                }
                if (i14 != 2 && !z16 && this.f82886p && length != -1) {
                    this.f82888r = true;
                }
                rVar2.G(i35);
                return 0;
            }
            int i46 = rVar2.f70056c;
            int i47 = oVar.read(bArr2, i46, 9400 - i46);
            if (i47 == -1) {
                for (int i48 = 0; i48 < sparseArray.size(); i48++) {
                    f0 f0VarValueAt = sparseArray.valueAt(i48);
                    if (f0VarValueAt instanceof v) {
                        v vVar = (v) f0VarValueAt;
                        if (vVar.f83164c == 3 && vVar.f83171j == -1 && (!z14 || !(vVar.f83162a instanceof k))) {
                            vVar.b(1, new fa.r());
                        }
                    }
                }
                return -1;
            }
            rVar2.F(i46 + i47);
        }
    }

    @Override // bb.n
    public final void c(bb.p pVar) {
        if ((this.f82872b & 1) == 0) {
            pVar = new yb.o(pVar, this.f82878h);
        }
        this.f82884n = pVar;
    }

    @Override // bb.n
    public final boolean d(bb.o oVar) throws EOFException, InterruptedIOException {
        byte[] bArr = this.f82875e.f70054a;
        bb.i iVar = (bb.i) oVar;
        iVar.peekFully(bArr, 0, 940, false);
        for (int i14 = 0; i14 < 188; i14++) {
            int i15 = 0;
            while (true) {
                if (i15 >= 5) {
                    iVar.skipFully(i14);
                    return true;
                }
                if (bArr[(i15 * TsExtractor.TS_PACKET_SIZE) + i14] != 71) {
                    break;
                }
                i15++;
            }
        }
        return false;
    }

    @Override // bb.n
    public final void release() {
    }

    @Override // bb.n
    public final void seek(long j8, long j14) {
        c0 c0Var;
        long j15;
        SparseArray<f0> sparseArray = this.f82879i;
        List<fa.w> list = this.f82874d;
        fa.a.d(this.f82871a != 2);
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            fa.w wVar = list.get(i14);
            synchronized (wVar) {
                j15 = wVar.f70068b;
            }
            boolean z14 = j15 == C.TIME_UNSET;
            if (!z14) {
                long jD = wVar.d();
                z14 = (jD == C.TIME_UNSET || jD == 0 || jD == j14) ? false : true;
            }
            if (z14) {
                wVar.f(j14);
            }
        }
        if (j14 != 0 && (c0Var = this.f82883m) != null) {
            c0Var.c(j14);
        }
        this.f82875e.D(0);
        this.f82876f.clear();
        for (int i15 = 0; i15 < sparseArray.size(); i15++) {
            sparseArray.valueAt(i15).seek();
        }
        this.f82890t = 0;
    }

    public e0(yb.n.a aVar) {
        this(1, 0, aVar, new fa.w(0L), new g(0), TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    public e0(int i14, yb.n.a aVar) {
        this(1, i14, aVar, new fa.w(0L), new g(0), TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    @Deprecated
    public e0(int i14) {
        this(1, 1, yb.n.a.f195662a, new fa.w(0L), new g(i14), TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    @Deprecated
    public e0(int i14, int i15, int i16) {
        this(i14, 1, yb.n.a.f195662a, new fa.w(0L), new g(i15), i16);
    }

    @Deprecated
    public e0(int i14, fa.w wVar, f0.c cVar) {
        this(i14, 1, yb.n.a.f195662a, wVar, cVar, TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    @Deprecated
    public e0(int i14, fa.w wVar, f0.c cVar, int i15) {
        this(i14, 1, yb.n.a.f195662a, wVar, cVar, i15);
    }

    @Deprecated
    public e0() {
        this(1, 1, yb.n.a.f195662a, new fa.w(0L), new g(0), TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }
}
