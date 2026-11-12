package db;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.common.ParserException;
import androidx.media3.common.q;
import androidx.media3.common.x;
import bb.d0;
import bb.f0;
import bb.g0;
import bb.l0;
import bb.n;
import bb.o;
import bb.p;
import com.google.android.exoplayer2.C;
import com.google.common.collect.UnmodifiableIterator;
import fa.k;
import fa.r;
import fa.z;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import v.e0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f58913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f58914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f58915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yb.n.a f58916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f58917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p f58918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public db.c f58919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f58920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e[] f58921i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f58922j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f58923k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f58924l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f58925m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f58926n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f58927o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f58928p;

    /* JADX INFO: renamed from: db.b$b, reason: collision with other inner class name */
    public class C1253b implements g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f58929a;

        public C1253b(long j8) {
            this.f58929a = j8;
        }

        @Override // bb.g0
        public final long getDurationUs() {
            return this.f58929a;
        }

        @Override // bb.g0
        public final g0.a getSeekPoints(long j8) {
            b bVar = b.this;
            g0.a aVarB = bVar.f58921i[0].b(j8);
            int i14 = 1;
            while (true) {
                e[] eVarArr = bVar.f58921i;
                if (i14 >= eVarArr.length) {
                    return aVarB;
                }
                g0.a aVarB2 = eVarArr[i14].b(j8);
                if (aVarB2.f17174a.f17187b < aVarB.f17174a.f17187b) {
                    aVarB = aVarB2;
                }
                i14++;
            }
        }

        @Override // bb.g0
        public final boolean isSeekable() {
            return true;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f58931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f58932b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f58933c;

        private c() {
        }
    }

    public b(int i14, yb.n.a aVar) {
        this.f58916d = aVar;
        this.f58915c = (i14 & 1) == 0;
        this.f58913a = new r(12);
        this.f58914b = new c();
        this.f58918f = new d0();
        this.f58921i = new e[0];
        this.f58925m = -1L;
        this.f58926n = -1L;
        this.f58924l = -1;
        this.f58920h = C.TIME_UNSET;
    }

    /* JADX WARN: Code duplicated, block: B:165:0x0392  */
    /* JADX WARN: Code duplicated, block: B:65:0x0105  */
    /* JADX WARN: Code duplicated, block: B:67:0x010e  */
    @Override // bb.n
    public final int b(o oVar, f0 f0Var) throws ParserException {
        boolean z14;
        e eVar;
        int i14;
        e eVar2;
        int i15 = 0;
        if (this.f58922j != -1) {
            long position = oVar.getPosition();
            long j8 = this.f58922j;
            if (j8 < position || j8 > PlaybackStateCompat.ACTION_SET_REPEAT_MODE + position) {
                f0Var.f17167a = j8;
                z14 = true;
            } else {
                oVar.skipFully((int) (j8 - position));
                z14 = false;
            }
        } else {
            z14 = false;
        }
        this.f58922j = -1L;
        if (z14) {
            return 1;
        }
        int i16 = this.f58917e;
        e eVar3 = null;
        c cVar = this.f58914b;
        int i17 = 2;
        r rVar = this.f58913a;
        switch (i16) {
            case 0:
                if (!d(oVar)) {
                    throw ParserException.createForMalformedContainer("AVI Header List not found", null);
                }
                oVar.skipFully(12);
                this.f58917e = 1;
                return 0;
            case 1:
                oVar.readFully(rVar.f70054a, 0, 12);
                rVar.G(0);
                cVar.getClass();
                cVar.f58931a = rVar.i();
                cVar.f58932b = rVar.i();
                cVar.f58933c = 0;
                if (cVar.f58931a != 1414744396) {
                    throw ParserException.createForMalformedContainer("LIST expected, found: " + cVar.f58931a, null);
                }
                int i18 = rVar.i();
                cVar.f58933c = i18;
                if (i18 == 1819436136) {
                    this.f58924l = cVar.f58932b;
                    this.f58917e = 2;
                    return 0;
                }
                throw ParserException.createForMalformedContainer("hdrl expected, found: " + cVar.f58933c, null);
            case 2:
                int i19 = this.f58924l - 4;
                r rVar2 = new r(i19);
                oVar.readFully(rVar2.f70054a, 0, i19);
                f fVarB = f.b(1819436136, rVar2);
                int i24 = fVarB.f58956b;
                if (i24 != 1819436136) {
                    throw ParserException.createForMalformedContainer("Unexpected header list type " + i24, null);
                }
                db.c cVar2 = (db.c) fVarB.a(db.c.class);
                if (cVar2 == null) {
                    throw ParserException.createForMalformedContainer("AviHeader not found", null);
                }
                this.f58919g = cVar2;
                this.f58920h = ((long) cVar2.f58936c) * ((long) cVar2.f58934a);
                ArrayList arrayList = new ArrayList();
                UnmodifiableIterator<db.a> it = fVarB.f58955a.iterator();
                int i25 = 0;
                while (it.hasNext()) {
                    db.a next = it.next();
                    if (next.getType() == 1819440243) {
                        f fVar = (f) next;
                        int i26 = i25 + 1;
                        d dVar = (d) fVar.a(d.class);
                        g gVar = (g) fVar.a(g.class);
                        if (dVar == null) {
                            k.g("Missing Stream Header");
                        } else if (gVar == null) {
                            k.g("Missing Stream Format");
                        } else {
                            long j14 = dVar.f58940d;
                            long j15 = 1000000 * ((long) dVar.f58938b);
                            long j16 = dVar.f58939c;
                            int i27 = z.f70071a;
                            long jU = z.U(j14, j15, j16, RoundingMode.DOWN);
                            q qVar = gVar.f58957a;
                            q.b bVarA = qVar.a();
                            bVarA.f8399a = Integer.toString(i25);
                            int i28 = dVar.f58941e;
                            if (i28 != 0) {
                                bVarA.f8412n = i28;
                            }
                            h hVar = (h) fVar.a(h.class);
                            if (hVar != null) {
                                bVarA.f8400b = hVar.f58958a;
                            }
                            int iH = x.h(qVar.f8386n);
                            if (iH == 1 || iH == i17) {
                                l0 l0VarTrack = this.f58918f.track(i25, iH);
                                l0VarTrack.d(bVarA.a());
                                eVar = new e(i25, iH, jU, dVar.f58940d, l0VarTrack);
                                this.f58920h = Math.max(this.f58920h, jU);
                            }
                            if (eVar != null) {
                                arrayList.add(eVar);
                            }
                            i25 = i26;
                        }
                        eVar = null;
                        if (eVar != null) {
                            arrayList.add(eVar);
                        }
                        i25 = i26;
                    }
                    i17 = 2;
                }
                this.f58921i = (e[]) arrayList.toArray(new e[0]);
                this.f58918f.endTracks();
                this.f58917e = 3;
                return 0;
            case 3:
                if (this.f58925m != -1) {
                    long position2 = oVar.getPosition();
                    long j17 = this.f58925m;
                    if (position2 != j17) {
                        this.f58922j = j17;
                        return 0;
                    }
                }
                oVar.peekFully(rVar.f70054a, 0, 12);
                oVar.resetPeekPosition();
                rVar.G(0);
                cVar.getClass();
                cVar.f58931a = rVar.i();
                cVar.f58932b = rVar.i();
                cVar.f58933c = 0;
                int i29 = rVar.i();
                int i30 = cVar.f58931a;
                if (i30 == 1179011410) {
                    oVar.skipFully(12);
                    return 0;
                }
                if (i30 != 1414744396 || i29 != 1769369453) {
                    this.f58922j = oVar.getPosition() + ((long) cVar.f58932b) + 8;
                    return 0;
                }
                long position3 = oVar.getPosition();
                this.f58925m = position3;
                this.f58926n = position3 + ((long) cVar.f58932b) + 8;
                if (!this.f58928p) {
                    db.c cVar3 = this.f58919g;
                    cVar3.getClass();
                    if ((cVar3.f58935b & 16) == 16) {
                        this.f58917e = 4;
                        this.f58922j = this.f58926n;
                        return 0;
                    }
                    this.f58918f.a(new g0.b(this.f58920h));
                    this.f58928p = true;
                }
                this.f58922j = oVar.getPosition() + 12;
                this.f58917e = 6;
                return 0;
            case 4:
                oVar.readFully(rVar.f70054a, 0, 8);
                rVar.G(0);
                int i34 = rVar.i();
                int i35 = rVar.i();
                if (i34 != 829973609) {
                    this.f58922j = oVar.getPosition() + ((long) i35);
                    return 0;
                }
                this.f58917e = 5;
                this.f58927o = i35;
                return 0;
            case 5:
                r rVar3 = new r(this.f58927o);
                oVar.readFully(rVar3.f70054a, 0, this.f58927o);
                long j18 = 0;
                if (rVar3.a() >= 16) {
                    int i36 = rVar3.f70055b;
                    rVar3.H(8);
                    long jI = rVar3.i();
                    long j19 = this.f58925m;
                    j18 = jI <= j19 ? j19 + 8 : 0L;
                    rVar3.G(i36);
                }
                while (rVar3.a() >= 16) {
                    int i37 = rVar3.i();
                    int i38 = rVar3.i();
                    long jI2 = ((long) rVar3.i()) + j18;
                    rVar3.i();
                    e[] eVarArr = this.f58921i;
                    int length = eVarArr.length;
                    int i39 = i15;
                    while (true) {
                        if (i39 < length) {
                            eVar2 = eVarArr[i39];
                            i14 = i15;
                            if (eVar2.f58943b != i37 && eVar2.f58944c != i37) {
                                i39++;
                                i15 = i14;
                            }
                        } else {
                            i14 = i15;
                            eVar2 = null;
                        }
                    }
                    if (eVar2 != null) {
                        int i44 = (i38 & 16) == 16 ? 1 : i14;
                        if (eVar2.f58952k == -1) {
                            eVar2.f58952k = jI2;
                        }
                        if (i44 != 0) {
                            if (eVar2.f58951j == eVar2.f58954m.length) {
                                long[] jArr = eVar2.f58953l;
                                eVar2.f58953l = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr = eVar2.f58954m;
                                eVar2.f58954m = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                            }
                            long[] jArr2 = eVar2.f58953l;
                            int i45 = eVar2.f58951j;
                            jArr2[i45] = jI2;
                            eVar2.f58954m[i45] = eVar2.f58950i;
                            eVar2.f58951j = i45 + 1;
                        }
                        eVar2.f58950i++;
                    }
                    i15 = i14;
                }
                int i46 = i15;
                e[] eVarArr2 = this.f58921i;
                int length2 = eVarArr2.length;
                for (int i47 = i46; i47 < length2; i47++) {
                    e eVar4 = eVarArr2[i47];
                    eVar4.f58953l = Arrays.copyOf(eVar4.f58953l, eVar4.f58951j);
                    eVar4.f58954m = Arrays.copyOf(eVar4.f58954m, eVar4.f58951j);
                }
                this.f58928p = true;
                this.f58918f.a(new C1253b(this.f58920h));
                this.f58917e = 6;
                this.f58922j = this.f58925m;
                return i46;
            case 6:
                if (oVar.getPosition() >= this.f58926n) {
                    return -1;
                }
                e eVar5 = this.f58923k;
                if (eVar5 != null) {
                    int i48 = eVar5.f58948g;
                    int iB = i48 - eVar5.f58942a.b(oVar, i48, false);
                    eVar5.f58948g = iB;
                    boolean z15 = iB == 0;
                    if (z15) {
                        if (eVar5.f58947f > 0) {
                            l0 l0Var = eVar5.f58942a;
                            int i49 = eVar5.f58949h;
                            l0Var.c((eVar5.f58945d * ((long) i49)) / ((long) eVar5.f58946e), Arrays.binarySearch(eVar5.f58954m, i49) >= 0 ? 1 : 0, eVar5.f58947f, 0, null);
                        }
                        eVar5.f58949h++;
                    }
                    if (z15) {
                        this.f58923k = null;
                    }
                    return 0;
                }
                if ((oVar.getPosition() & 1) == 1) {
                    oVar.skipFully(1);
                }
                oVar.peekFully(rVar.f70054a, 0, 12);
                rVar.G(0);
                int i54 = rVar.i();
                if (i54 == 1414744396) {
                    rVar.G(8);
                    oVar.skipFully(rVar.i() == 1769369453 ? 12 : 8);
                    oVar.resetPeekPosition();
                    return 0;
                }
                int i55 = rVar.i();
                if (i54 == 1263424842) {
                    this.f58922j = oVar.getPosition() + ((long) i55) + 8;
                    return 0;
                }
                oVar.skipFully(8);
                oVar.resetPeekPosition();
                for (e eVar6 : this.f58921i) {
                    if (eVar6.f58943b == i54 || eVar6.f58944c == i54) {
                        eVar3 = eVar6;
                        if (eVar3 == null) {
                            this.f58922j = oVar.getPosition() + ((long) i55);
                            return 0;
                        }
                        eVar3.f58947f = i55;
                        eVar3.f58948g = i55;
                        this.f58923k = eVar3;
                        return 0;
                    }
                }
                if (eVar3 == null) {
                    this.f58922j = oVar.getPosition() + ((long) i55);
                    return 0;
                }
                eVar3.f58947f = i55;
                eVar3.f58948g = i55;
                this.f58923k = eVar3;
                return 0;
            default:
                e0.l();
                return 0;
        }
    }

    @Override // bb.n
    public final void c(p pVar) {
        this.f58917e = 0;
        if (this.f58915c) {
            pVar = new yb.o(pVar, this.f58916d);
        }
        this.f58918f = pVar;
        this.f58922j = -1L;
    }

    @Override // bb.n
    public final boolean d(o oVar) {
        r rVar = this.f58913a;
        oVar.peekFully(rVar.f70054a, 0, 12);
        rVar.G(0);
        if (rVar.i() == 1179011410) {
            rVar.H(4);
            if (rVar.i() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // bb.n
    public final void release() {
    }

    @Override // bb.n
    public final void seek(long j8, long j14) {
        this.f58922j = -1L;
        this.f58923k = null;
        for (e eVar : this.f58921i) {
            if (eVar.f58951j == 0) {
                eVar.f58949h = 0;
            } else {
                eVar.f58949h = eVar.f58954m[z.e(eVar.f58953l, j8, true)];
            }
        }
        if (j8 != 0) {
            this.f58917e = 6;
        } else if (this.f58921i.length == 0) {
            this.f58917e = 0;
        } else {
            this.f58917e = 3;
        }
    }

    @Deprecated
    public b() {
        this(1, yb.n.a.f195662a);
    }
}
