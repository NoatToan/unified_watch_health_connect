package ub;

import androidx.media3.common.q;
import androidx.media3.common.w;
import androidx.media3.common.x;
import bb.a0;
import bb.b0;
import bb.c0;
import bb.f0;
import bb.g0;
import bb.k;
import bb.l0;
import bb.n;
import bb.o;
import bb.p;
import bb.y;
import com.google.android.exoplayer2.C;
import com.google.common.math.LongMath;
import com.google.common.primitives.Ints;
import fa.l;
import fa.r;
import java.io.EOFException;
import java.math.RoundingMode;
import pb.m;
import u62.z;

/* JADX INFO: loaded from: classes.dex */
public final class d implements n {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final z f169673v = new z(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f169674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f169675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f169676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c0.a f169677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y f169678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a0 f169679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f169680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p f169681h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public l0 f169682i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l0 f169683j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f169684k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public w f169685l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f169686m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f169687n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f169688o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f169689p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f169690q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public e f169691r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f169692s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f169693t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f169694u;

    public d(int i14, long j8) {
        this.f169674a = (i14 & 2) != 0 ? i14 | 1 : i14;
        this.f169675b = j8;
        this.f169676c = new r(10);
        this.f169677d = new c0.a();
        this.f169678e = new y();
        this.f169686m = C.TIME_UNSET;
        this.f169679f = new a0();
        k kVar = new k();
        this.f169680g = kVar;
        this.f169683j = kVar;
        this.f169689p = -1L;
    }

    public static long f(w wVar) {
        if (wVar == null) {
            return C.TIME_UNSET;
        }
        for (w.b bVar : wVar.f8574a) {
            if (bVar instanceof m) {
                m mVar = (m) bVar;
                if (mVar.f136812a.equals("TLEN")) {
                    return fa.z.O(Long.parseLong(mVar.f136825c.get(0)));
                }
            }
        }
        return C.TIME_UNSET;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:104:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:109:0x023e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0240  */
    /* JADX WARN: Code duplicated, block: B:113:0x024f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0267  */
    /* JADX WARN: Code duplicated, block: B:117:0x0279  */
    /* JADX WARN: Code duplicated, block: B:119:0x0283  */
    /* JADX WARN: Code duplicated, block: B:11:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x028c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0297  */
    /* JADX WARN: Code duplicated, block: B:12:0x0043  */
    /* JADX WARN: Code duplicated, block: B:14:0x0048 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x0344  */
    /* JADX WARN: Code duplicated, block: B:153:0x0347  */
    /* JADX WARN: Code duplicated, block: B:156:0x0351  */
    /* JADX WARN: Code duplicated, block: B:159:0x035f  */
    /* JADX WARN: Code duplicated, block: B:160:0x0362  */
    /* JADX WARN: Code duplicated, block: B:163:0x036a  */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:173:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x006d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:27:0x007f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0081  */
    /* JADX WARN: Code duplicated, block: B:31:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:36:0x0097  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00da  */
    /* JADX WARN: Code duplicated, block: B:54:0x010d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0119  */
    /* JADX WARN: Code duplicated, block: B:58:0x011e  */
    /* JADX WARN: Code duplicated, block: B:61:0x012d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0131  */
    /* JADX WARN: Code duplicated, block: B:65:0x013d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0141  */
    /* JADX WARN: Code duplicated, block: B:69:0x0173  */
    /* JADX WARN: Code duplicated, block: B:72:0x017c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0182  */
    /* JADX WARN: Code duplicated, block: B:77:0x0193 A[LOOP:0: B:73:0x0180->B:77:0x0193, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x0196 A[EDGE_INSN: B:78:0x0196->B:79:0x0197 BREAK  A[LOOP:0: B:73:0x0180->B:77:0x0193]] */
    /* JADX WARN: Code duplicated, block: B:81:0x019d  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:90:0x01be  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:98:0x01db  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
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
    @Override // bb.n
    public final int b(o oVar, f0 f0Var) {
        int i14;
        int i15;
        long j8;
        e eVar;
        r rVar;
        int i16;
        long j14;
        long j15;
        long position;
        long j16;
        int iB;
        int i17;
        int iG;
        r rVar2;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int iG2;
        y yVar;
        long dataEndPosition;
        g gVarB;
        long j17;
        int i28;
        int i29;
        long position2;
        long length;
        long jA;
        c0.a aVar;
        e aVar2;
        long j18;
        w wVar;
        long position3;
        c cVarA;
        boolean z14;
        int i30;
        boolean z15;
        long jF;
        long j19;
        q.b bVar;
        w wVar2;
        w.b[] bVarArr;
        int length2;
        int i34;
        w.b bVar2;
        fa.a.f(this.f169682i);
        int i35 = fa.z.f70071a;
        int i36 = this.f169684k;
        c0.a aVar3 = this.f169677d;
        if (i36 == 0) {
            try {
                i(oVar, false);
                eVar = this.f169691r;
                rVar = this.f169676c;
                if (eVar == null) {
                    rVar2 = new r(aVar3.f17127c);
                    oVar.peekFully(rVar2.f70054a, 0, aVar3.f17127c);
                    i18 = aVar3.f17125a & 1;
                    i19 = aVar3.f17129e;
                    i24 = 21;
                    j8 = 1000000;
                    if (i18 != 0) {
                        if (i19 != 1) {
                            i25 = 36;
                        }
                        i26 = rVar2.f70056c;
                        i27 = i25 + 4;
                        j15 = C.TIME_UNSET;
                        i16 = 1;
                        if (i26 >= i27) {
                            rVar2.G(i25);
                            iG2 = rVar2.g();
                            if (iG2 != 1483304551 && iG2 != 1231971951) {
                                if (rVar2.f70056c >= 40) {
                                    rVar2.G(36);
                                    if (rVar2.g() == 1447187017) {
                                        iG2 = 1447187017;
                                    } else {
                                        iG2 = 0;
                                    }
                                } else {
                                    iG2 = 0;
                                }
                            }
                        } else if (rVar2.f70056c >= 40) {
                            rVar2.G(36);
                            if (rVar2.g() == 1447187017) {
                                iG2 = 1447187017;
                            } else {
                                iG2 = 0;
                            }
                        } else {
                            iG2 = 0;
                        }
                        yVar = this.f169678e;
                        dataEndPosition = -1;
                        if (iG2 == 1231971951) {
                            yVar = yVar;
                            gVarB = g.b(aVar3, rVar2);
                            j17 = gVarB.f169702c;
                            if ((yVar.f17274a != -1 || yVar.f17275b == -1) && (i28 = gVarB.f169703d) != -1 && (i29 = gVarB.f169704e) != -1) {
                                yVar.f17274a = i28;
                                yVar.f17275b = i29;
                            }
                            j14 = 0;
                            position2 = oVar.getPosition();
                            if (oVar.getLength() == -1 && j17 != -1) {
                                long j24 = position2 + j17;
                                if (oVar.getLength() != j24) {
                                    fa.k.f("Data size mismatch between stream (" + oVar.getLength() + ") and Xing frame (" + j24 + "), using Xing value.");
                                }
                            }
                            oVar.skipFully(aVar3.f17127c);
                            if (iG2 == 1483304551) {
                                aVar2 = h.a(gVarB, position2);
                            } else {
                                length = oVar.getLength();
                                jA = gVarB.a();
                                aVar = gVarB.f169700a;
                                if (jA != C.TIME_UNSET) {
                                    if (j17 != -1) {
                                        length = position2 + j17;
                                        j18 = j17 - ((long) aVar.f17127c);
                                    } else if (length != -1) {
                                        j18 = (length - position2) - ((long) aVar.f17127c);
                                    } else {
                                        aVar2 = null;
                                    }
                                    long j25 = length;
                                    long j26 = j18;
                                    RoundingMode roundingMode = RoundingMode.HALF_UP;
                                    aVar2 = new a(j25, position2 + ((long) aVar.f17127c), Ints.checkedCast(fa.z.U(j26, 8000000L, jA, roundingMode)), Ints.checkedCast(LongMath.divide(j26, gVarB.f169701b, roundingMode)), false);
                                } else {
                                    aVar2 = null;
                                }
                            }
                        } else {
                            if (iG2 != 1447187017) {
                                aVar2 = f.a(oVar.getLength(), oVar.getPosition(), this.f169677d, rVar2);
                                oVar.skipFully(aVar3.f17127c);
                            } else if (iG2 != 1483304551) {
                                oVar.resetPeekPosition();
                                aVar2 = null;
                            } else {
                                yVar = yVar;
                                gVarB = g.b(aVar3, rVar2);
                                j17 = gVarB.f169702c;
                                if (yVar.f17274a != -1) {
                                    yVar.f17274a = i28;
                                    yVar.f17275b = i29;
                                } else {
                                    yVar.f17274a = i28;
                                    yVar.f17275b = i29;
                                }
                                j14 = 0;
                                position2 = oVar.getPosition();
                                if (oVar.getLength() == -1) {
                                }
                                oVar.skipFully(aVar3.f17127c);
                                if (iG2 == 1483304551) {
                                    aVar2 = h.a(gVarB, position2);
                                } else {
                                    length = oVar.getLength();
                                    jA = gVarB.a();
                                    aVar = gVarB.f169700a;
                                    if (jA != C.TIME_UNSET) {
                                        if (j17 != -1) {
                                            length = position2 + j17;
                                            j18 = j17 - ((long) aVar.f17127c);
                                        } else if (length != -1) {
                                            j18 = (length - position2) - ((long) aVar.f17127c);
                                        } else {
                                            aVar2 = null;
                                        }
                                        long j27 = length;
                                        long j28 = j18;
                                        RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                                        aVar2 = new a(j27, position2 + ((long) aVar.f17127c), Ints.checkedCast(fa.z.U(j28, 8000000L, jA, roundingMode2)), Ints.checkedCast(LongMath.divide(j28, gVarB.f169701b, roundingMode2)), false);
                                    } else {
                                        aVar2 = null;
                                    }
                                }
                            }
                            j14 = 0;
                        }
                        wVar = this.f169685l;
                        position3 = oVar.getPosition();
                        if (wVar != null) {
                            cVarA = null;
                            break;
                        }
                        bVarArr = wVar.f8574a;
                        length2 = bVarArr.length;
                        i34 = 0;
                        while (true) {
                            if (i34 < length2) {
                                cVarA = null;
                                break;
                            }
                            bVar2 = bVarArr[i34];
                            if (bVar2 instanceof pb.k) {
                                cVarA = c.a(position3, (pb.k) bVar2, f(wVar));
                                break;
                            }
                            i34++;
                        }
                        z14 = this.f169692s;
                        i30 = this.f169674a;
                        if (z14) {
                            aVar2 = new e.a();
                        } else {
                            if ((i30 & 4) != 0) {
                                if (cVarA != null) {
                                    jF = cVarA.f169672c;
                                } else {
                                    if (aVar2 != null) {
                                        long durationUs = aVar2.getDurationUs();
                                        dataEndPosition = aVar2.getDataEndPosition();
                                        j19 = durationUs;
                                    } else {
                                        jF = f(this.f169685l);
                                    }
                                    aVar2 = new b(j19, oVar.getPosition(), dataEndPosition);
                                }
                                j19 = jF;
                                aVar2 = new b(j19, oVar.getPosition(), dataEndPosition);
                            } else if (cVarA != null) {
                                aVar2 = cVarA;
                            } else if (aVar2 == null) {
                                aVar2 = null;
                            }
                            if (aVar2 != null || (!aVar2.isSeekable() && (i30 & 1) != 0)) {
                                if ((i30 & 2) != 0) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                oVar.peekFully(rVar.f70054a, 0, 4);
                                rVar.G(0);
                                aVar3.a(rVar.g());
                                aVar2 = new a(oVar.getLength(), oVar.getPosition(), this.f169677d, z15);
                            }
                        }
                        this.f169691r = aVar2;
                        this.f169681h.a(aVar2);
                        bVar = new q.b();
                        bVar.f8411m = x.n(aVar3.f17126b);
                        bVar.f8412n = 4096;
                        bVar.B = aVar3.f17129e;
                        bVar.C = aVar3.f17128d;
                        bVar.E = yVar.f17274a;
                        bVar.F = yVar.f17275b;
                        if ((i30 & 8) != 0) {
                            wVar2 = null;
                        } else {
                            wVar2 = this.f169685l;
                        }
                        bVar.f8409k = wVar2;
                        if (this.f169691r.f() != -2147483647) {
                            bVar.f8406h = this.f169691r.f();
                        }
                        this.f169683j.d(bVar.a());
                        this.f169688o = oVar.getPosition();
                    } else if (i19 == 1) {
                        i24 = 13;
                    }
                    i25 = i24;
                    i26 = rVar2.f70056c;
                    i27 = i25 + 4;
                    j15 = C.TIME_UNSET;
                    i16 = 1;
                    if (i26 >= i27) {
                        rVar2.G(i25);
                        iG2 = rVar2.g();
                        if (iG2 != 1483304551) {
                            if (rVar2.f70056c >= 40) {
                                rVar2.G(36);
                                if (rVar2.g() == 1447187017) {
                                    iG2 = 1447187017;
                                } else {
                                    iG2 = 0;
                                }
                            } else {
                                iG2 = 0;
                            }
                        }
                    } else if (rVar2.f70056c >= 40) {
                        rVar2.G(36);
                        if (rVar2.g() == 1447187017) {
                            iG2 = 1447187017;
                        } else {
                            iG2 = 0;
                        }
                    } else {
                        iG2 = 0;
                    }
                    yVar = this.f169678e;
                    dataEndPosition = -1;
                    if (iG2 == 1231971951) {
                        yVar = yVar;
                        gVarB = g.b(aVar3, rVar2);
                        j17 = gVarB.f169702c;
                        if (yVar.f17274a != -1) {
                            yVar.f17274a = i28;
                            yVar.f17275b = i29;
                        } else {
                            yVar.f17274a = i28;
                            yVar.f17275b = i29;
                        }
                        j14 = 0;
                        position2 = oVar.getPosition();
                        if (oVar.getLength() == -1) {
                        }
                        oVar.skipFully(aVar3.f17127c);
                        if (iG2 == 1483304551) {
                            aVar2 = h.a(gVarB, position2);
                        } else {
                            length = oVar.getLength();
                            jA = gVarB.a();
                            aVar = gVarB.f169700a;
                            if (jA != C.TIME_UNSET) {
                                if (j17 != -1) {
                                    length = position2 + j17;
                                    j18 = j17 - ((long) aVar.f17127c);
                                } else if (length != -1) {
                                    j18 = (length - position2) - ((long) aVar.f17127c);
                                } else {
                                    aVar2 = null;
                                }
                                long j29 = length;
                                long j210 = j18;
                                RoundingMode roundingMode3 = RoundingMode.HALF_UP;
                                aVar2 = new a(j29, position2 + ((long) aVar.f17127c), Ints.checkedCast(fa.z.U(j210, 8000000L, jA, roundingMode3)), Ints.checkedCast(LongMath.divide(j210, gVarB.f169701b, roundingMode3)), false);
                            } else {
                                aVar2 = null;
                            }
                        }
                    } else {
                        if (iG2 != 1447187017) {
                            aVar2 = f.a(oVar.getLength(), oVar.getPosition(), this.f169677d, rVar2);
                            oVar.skipFully(aVar3.f17127c);
                        } else if (iG2 != 1483304551) {
                            oVar.resetPeekPosition();
                            aVar2 = null;
                        } else {
                            yVar = yVar;
                            gVarB = g.b(aVar3, rVar2);
                            j17 = gVarB.f169702c;
                            if (yVar.f17274a != -1) {
                                yVar.f17274a = i28;
                                yVar.f17275b = i29;
                            } else {
                                yVar.f17274a = i28;
                                yVar.f17275b = i29;
                            }
                            j14 = 0;
                            position2 = oVar.getPosition();
                            if (oVar.getLength() == -1) {
                            }
                            oVar.skipFully(aVar3.f17127c);
                            if (iG2 == 1483304551) {
                                aVar2 = h.a(gVarB, position2);
                            } else {
                                length = oVar.getLength();
                                jA = gVarB.a();
                                aVar = gVarB.f169700a;
                                if (jA != C.TIME_UNSET) {
                                    if (j17 != -1) {
                                        length = position2 + j17;
                                        j18 = j17 - ((long) aVar.f17127c);
                                    } else if (length != -1) {
                                        j18 = (length - position2) - ((long) aVar.f17127c);
                                    } else {
                                        aVar2 = null;
                                    }
                                    long j211 = length;
                                    long j212 = j18;
                                    RoundingMode roundingMode4 = RoundingMode.HALF_UP;
                                    aVar2 = new a(j211, position2 + ((long) aVar.f17127c), Ints.checkedCast(fa.z.U(j212, 8000000L, jA, roundingMode4)), Ints.checkedCast(LongMath.divide(j212, gVarB.f169701b, roundingMode4)), false);
                                } else {
                                    aVar2 = null;
                                }
                            }
                        }
                        j14 = 0;
                    }
                    wVar = this.f169685l;
                    position3 = oVar.getPosition();
                    if (wVar != null) {
                        cVarA = null;
                        break;
                    }
                    bVarArr = wVar.f8574a;
                    length2 = bVarArr.length;
                    i34 = 0;
                    while (true) {
                        if (i34 < length2) {
                            cVarA = null;
                            break;
                        }
                        bVar2 = bVarArr[i34];
                        if (bVar2 instanceof pb.k) {
                            cVarA = c.a(position3, (pb.k) bVar2, f(wVar));
                            break;
                        }
                        i34++;
                    }
                    z14 = this.f169692s;
                    i30 = this.f169674a;
                    if (z14) {
                        aVar2 = new e.a();
                    } else {
                        if ((i30 & 4) != 0) {
                            if (cVarA != null) {
                                jF = cVarA.f169672c;
                            } else {
                                if (aVar2 != null) {
                                    long durationUs2 = aVar2.getDurationUs();
                                    dataEndPosition = aVar2.getDataEndPosition();
                                    j19 = durationUs2;
                                } else {
                                    jF = f(this.f169685l);
                                }
                                aVar2 = new b(j19, oVar.getPosition(), dataEndPosition);
                            }
                            j19 = jF;
                            aVar2 = new b(j19, oVar.getPosition(), dataEndPosition);
                        } else if (cVarA != null) {
                            aVar2 = cVarA;
                        } else if (aVar2 == null) {
                            aVar2 = null;
                        }
                        if (aVar2 != null) {
                            if ((i30 & 2) != 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            oVar.peekFully(rVar.f70054a, 0, 4);
                            rVar.G(0);
                            aVar3.a(rVar.g());
                            aVar2 = new a(oVar.getLength(), oVar.getPosition(), this.f169677d, z15);
                        } else {
                            if ((i30 & 2) != 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            oVar.peekFully(rVar.f70054a, 0, 4);
                            rVar.G(0);
                            aVar3.a(rVar.g());
                            aVar2 = new a(oVar.getLength(), oVar.getPosition(), this.f169677d, z15);
                        }
                    }
                    this.f169691r = aVar2;
                    this.f169681h.a(aVar2);
                    bVar = new q.b();
                    bVar.f8411m = x.n(aVar3.f17126b);
                    bVar.f8412n = 4096;
                    bVar.B = aVar3.f17129e;
                    bVar.C = aVar3.f17128d;
                    bVar.E = yVar.f17274a;
                    bVar.F = yVar.f17275b;
                    if ((i30 & 8) != 0) {
                        wVar2 = null;
                    } else {
                        wVar2 = this.f169685l;
                    }
                    bVar.f8409k = wVar2;
                    if (this.f169691r.f() != -2147483647) {
                        bVar.f8406h = this.f169691r.f();
                    }
                    this.f169683j.d(bVar.a());
                    this.f169688o = oVar.getPosition();
                } else {
                    i16 = 1;
                    j14 = 0;
                    j8 = 1000000;
                    j15 = C.TIME_UNSET;
                    if (this.f169688o != 0) {
                        position = oVar.getPosition();
                        j16 = this.f169688o;
                        if (position < j16) {
                            oVar.skipFully((int) (j16 - position));
                        }
                    }
                }
                if (this.f169690q == 0) {
                    oVar.resetPeekPosition();
                    if (h(oVar)) {
                        i14 = -1;
                        i15 = -1;
                    } else {
                        rVar.G(0);
                        iG = rVar.g();
                        if (((long) ((-128000) & iG)) == (((long) this.f169684k) & (-128000)) || c0.a(iG) == -1) {
                            oVar.skipFully(i16);
                            this.f169684k = i;
                            i14 = -1;
                            i15 = 0;
                        } else {
                            aVar3.a(iG);
                            if (this.f169686m == j15) {
                                this.f169686m = this.f169691r.getTimeUs(oVar.getPosition());
                                long j34 = this.f169675b;
                                if (j34 != j15) {
                                    this.f169686m = (j34 - this.f169691r.getTimeUs(j14)) + this.f169686m;
                                }
                            }
                            this.f169690q = aVar3.f17127c;
                            long position4 = oVar.getPosition() + ((long) aVar3.f17127c);
                            this.f169689p = position4;
                            e eVar2 = this.f169691r;
                            if (eVar2 instanceof b) {
                                b0 b0Var = ((b) eVar2).f169669c;
                                long j35 = (((this.f169687n + ((long) aVar3.f17131g)) * j8) / ((long) aVar3.f17128d)) + this.f169686m;
                                l lVar = b0Var.f17105b;
                                int i37 = lVar.f70034a;
                                if (i37 == 0 || j35 - lVar.c(i37 - 1) >= 100000) {
                                    b0Var.a(j35, position4);
                                }
                                if (this.f169693t) {
                                    long j36 = this.f169694u;
                                    l lVar2 = b0Var.f17105b;
                                    int i38 = lVar2.f70034a;
                                    if (i38 != 0 && j36 - lVar2.c(i38 - 1) < 100000) {
                                        this.f169693t = false;
                                        this.f169683j = this.f169682i;
                                    }
                                }
                            }
                            iB = this.f169683j.b(oVar, this.f169690q, i16);
                            if (iB == -1) {
                                i14 = -1;
                                i15 = -1;
                            } else {
                                i17 = this.f169690q - iB;
                                this.f169690q = i17;
                                if (i17 > 0) {
                                    i14 = -1;
                                    i15 = 0;
                                } else {
                                    this.f169683j.c(((this.f169687n * j8) / ((long) aVar3.f17128d)) + this.f169686m, 1, aVar3.f17127c, 0, null);
                                    this.f169687n += (long) aVar3.f17131g;
                                    this.f169690q = 0;
                                    i15 = 0;
                                    i14 = -1;
                                }
                            }
                        }
                    }
                } else {
                    iB = this.f169683j.b(oVar, this.f169690q, i16);
                    if (iB == -1) {
                        i14 = -1;
                        i15 = -1;
                    } else {
                        i17 = this.f169690q - iB;
                        this.f169690q = i17;
                        if (i17 > 0) {
                            i14 = -1;
                            i15 = 0;
                        } else {
                            this.f169683j.c(((this.f169687n * j8) / ((long) aVar3.f17128d)) + this.f169686m, 1, aVar3.f17127c, 0, null);
                            this.f169687n += (long) aVar3.f17131g;
                            this.f169690q = 0;
                            i15 = 0;
                            i14 = -1;
                        }
                    }
                }
            } catch (EOFException unused) {
                i14 = -1;
                i15 = -1;
                j8 = 1000000;
            }
        } else {
            eVar = this.f169691r;
            rVar = this.f169676c;
            if (eVar == null) {
                rVar2 = new r(aVar3.f17127c);
                oVar.peekFully(rVar2.f70054a, 0, aVar3.f17127c);
                i18 = aVar3.f17125a & 1;
                i19 = aVar3.f17129e;
                i24 = 21;
                j8 = 1000000;
                if (i18 != 0) {
                    if (i19 != 1) {
                        i25 = 36;
                    }
                    i26 = rVar2.f70056c;
                    i27 = i25 + 4;
                    j15 = C.TIME_UNSET;
                    i16 = 1;
                    if (i26 >= i27) {
                        rVar2.G(i25);
                        iG2 = rVar2.g();
                        if (iG2 != 1483304551) {
                            if (rVar2.f70056c >= 40) {
                                rVar2.G(36);
                                if (rVar2.g() == 1447187017) {
                                    iG2 = 1447187017;
                                } else {
                                    iG2 = 0;
                                }
                            } else {
                                iG2 = 0;
                            }
                        }
                    } else if (rVar2.f70056c >= 40) {
                        rVar2.G(36);
                        if (rVar2.g() == 1447187017) {
                            iG2 = 1447187017;
                        } else {
                            iG2 = 0;
                        }
                    } else {
                        iG2 = 0;
                    }
                    yVar = this.f169678e;
                    dataEndPosition = -1;
                    if (iG2 == 1231971951) {
                        yVar = yVar;
                        gVarB = g.b(aVar3, rVar2);
                        j17 = gVarB.f169702c;
                        if (yVar.f17274a != -1) {
                            yVar.f17274a = i28;
                            yVar.f17275b = i29;
                        } else {
                            yVar.f17274a = i28;
                            yVar.f17275b = i29;
                        }
                        j14 = 0;
                        position2 = oVar.getPosition();
                        if (oVar.getLength() == -1) {
                        }
                        oVar.skipFully(aVar3.f17127c);
                        if (iG2 == 1483304551) {
                            aVar2 = h.a(gVarB, position2);
                        } else {
                            length = oVar.getLength();
                            jA = gVarB.a();
                            aVar = gVarB.f169700a;
                            if (jA != C.TIME_UNSET) {
                                if (j17 != -1) {
                                    length = position2 + j17;
                                    j18 = j17 - ((long) aVar.f17127c);
                                } else if (length != -1) {
                                    j18 = (length - position2) - ((long) aVar.f17127c);
                                } else {
                                    aVar2 = null;
                                }
                                long j213 = length;
                                long j214 = j18;
                                RoundingMode roundingMode5 = RoundingMode.HALF_UP;
                                aVar2 = new a(j213, position2 + ((long) aVar.f17127c), Ints.checkedCast(fa.z.U(j214, 8000000L, jA, roundingMode5)), Ints.checkedCast(LongMath.divide(j214, gVarB.f169701b, roundingMode5)), false);
                            } else {
                                aVar2 = null;
                            }
                        }
                    } else {
                        if (iG2 != 1447187017) {
                            aVar2 = f.a(oVar.getLength(), oVar.getPosition(), this.f169677d, rVar2);
                            oVar.skipFully(aVar3.f17127c);
                        } else if (iG2 != 1483304551) {
                            oVar.resetPeekPosition();
                            aVar2 = null;
                        } else {
                            yVar = yVar;
                            gVarB = g.b(aVar3, rVar2);
                            j17 = gVarB.f169702c;
                            if (yVar.f17274a != -1) {
                                yVar.f17274a = i28;
                                yVar.f17275b = i29;
                            } else {
                                yVar.f17274a = i28;
                                yVar.f17275b = i29;
                            }
                            j14 = 0;
                            position2 = oVar.getPosition();
                            if (oVar.getLength() == -1) {
                            }
                            oVar.skipFully(aVar3.f17127c);
                            if (iG2 == 1483304551) {
                                aVar2 = h.a(gVarB, position2);
                            } else {
                                length = oVar.getLength();
                                jA = gVarB.a();
                                aVar = gVarB.f169700a;
                                if (jA != C.TIME_UNSET) {
                                    if (j17 != -1) {
                                        length = position2 + j17;
                                        j18 = j17 - ((long) aVar.f17127c);
                                    } else if (length != -1) {
                                        j18 = (length - position2) - ((long) aVar.f17127c);
                                    } else {
                                        aVar2 = null;
                                    }
                                    long j215 = length;
                                    long j216 = j18;
                                    RoundingMode roundingMode6 = RoundingMode.HALF_UP;
                                    aVar2 = new a(j215, position2 + ((long) aVar.f17127c), Ints.checkedCast(fa.z.U(j216, 8000000L, jA, roundingMode6)), Ints.checkedCast(LongMath.divide(j216, gVarB.f169701b, roundingMode6)), false);
                                } else {
                                    aVar2 = null;
                                }
                            }
                        }
                        j14 = 0;
                    }
                    wVar = this.f169685l;
                    position3 = oVar.getPosition();
                    if (wVar != null) {
                        cVarA = null;
                        break;
                    }
                    bVarArr = wVar.f8574a;
                    length2 = bVarArr.length;
                    i34 = 0;
                    while (true) {
                        if (i34 < length2) {
                            cVarA = null;
                            break;
                        }
                        bVar2 = bVarArr[i34];
                        if (bVar2 instanceof pb.k) {
                            cVarA = c.a(position3, (pb.k) bVar2, f(wVar));
                            break;
                        }
                        i34++;
                    }
                    z14 = this.f169692s;
                    i30 = this.f169674a;
                    if (z14) {
                        aVar2 = new e.a();
                    } else {
                        if ((i30 & 4) != 0) {
                            if (cVarA != null) {
                                jF = cVarA.f169672c;
                            } else {
                                if (aVar2 != null) {
                                    long durationUs3 = aVar2.getDurationUs();
                                    dataEndPosition = aVar2.getDataEndPosition();
                                    j19 = durationUs3;
                                } else {
                                    jF = f(this.f169685l);
                                }
                                aVar2 = new b(j19, oVar.getPosition(), dataEndPosition);
                            }
                            j19 = jF;
                            aVar2 = new b(j19, oVar.getPosition(), dataEndPosition);
                        } else if (cVarA != null) {
                            aVar2 = cVarA;
                        } else if (aVar2 == null) {
                            aVar2 = null;
                        }
                        if (aVar2 != null) {
                            if ((i30 & 2) != 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            oVar.peekFully(rVar.f70054a, 0, 4);
                            rVar.G(0);
                            aVar3.a(rVar.g());
                            aVar2 = new a(oVar.getLength(), oVar.getPosition(), this.f169677d, z15);
                        } else {
                            if ((i30 & 2) != 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            oVar.peekFully(rVar.f70054a, 0, 4);
                            rVar.G(0);
                            aVar3.a(rVar.g());
                            aVar2 = new a(oVar.getLength(), oVar.getPosition(), this.f169677d, z15);
                        }
                    }
                    this.f169691r = aVar2;
                    this.f169681h.a(aVar2);
                    bVar = new q.b();
                    bVar.f8411m = x.n(aVar3.f17126b);
                    bVar.f8412n = 4096;
                    bVar.B = aVar3.f17129e;
                    bVar.C = aVar3.f17128d;
                    bVar.E = yVar.f17274a;
                    bVar.F = yVar.f17275b;
                    if ((i30 & 8) != 0) {
                        wVar2 = null;
                    } else {
                        wVar2 = this.f169685l;
                    }
                    bVar.f8409k = wVar2;
                    if (this.f169691r.f() != -2147483647) {
                        bVar.f8406h = this.f169691r.f();
                    }
                    this.f169683j.d(bVar.a());
                    this.f169688o = oVar.getPosition();
                } else if (i19 == 1) {
                    i24 = 13;
                }
                i25 = i24;
                i26 = rVar2.f70056c;
                i27 = i25 + 4;
                j15 = C.TIME_UNSET;
                i16 = 1;
                if (i26 >= i27) {
                    rVar2.G(i25);
                    iG2 = rVar2.g();
                    if (iG2 != 1483304551) {
                        if (rVar2.f70056c >= 40) {
                            rVar2.G(36);
                            if (rVar2.g() == 1447187017) {
                                iG2 = 1447187017;
                            } else {
                                iG2 = 0;
                            }
                        } else {
                            iG2 = 0;
                        }
                    }
                } else if (rVar2.f70056c >= 40) {
                    rVar2.G(36);
                    if (rVar2.g() == 1447187017) {
                        iG2 = 1447187017;
                    } else {
                        iG2 = 0;
                    }
                } else {
                    iG2 = 0;
                }
                yVar = this.f169678e;
                dataEndPosition = -1;
                if (iG2 == 1231971951) {
                    yVar = yVar;
                    gVarB = g.b(aVar3, rVar2);
                    j17 = gVarB.f169702c;
                    if (yVar.f17274a != -1) {
                        yVar.f17274a = i28;
                        yVar.f17275b = i29;
                    } else {
                        yVar.f17274a = i28;
                        yVar.f17275b = i29;
                    }
                    j14 = 0;
                    position2 = oVar.getPosition();
                    if (oVar.getLength() == -1) {
                    }
                    oVar.skipFully(aVar3.f17127c);
                    if (iG2 == 1483304551) {
                        aVar2 = h.a(gVarB, position2);
                    } else {
                        length = oVar.getLength();
                        jA = gVarB.a();
                        aVar = gVarB.f169700a;
                        if (jA != C.TIME_UNSET) {
                            if (j17 != -1) {
                                length = position2 + j17;
                                j18 = j17 - ((long) aVar.f17127c);
                            } else if (length != -1) {
                                j18 = (length - position2) - ((long) aVar.f17127c);
                            } else {
                                aVar2 = null;
                            }
                            long j217 = length;
                            long j218 = j18;
                            RoundingMode roundingMode7 = RoundingMode.HALF_UP;
                            aVar2 = new a(j217, position2 + ((long) aVar.f17127c), Ints.checkedCast(fa.z.U(j218, 8000000L, jA, roundingMode7)), Ints.checkedCast(LongMath.divide(j218, gVarB.f169701b, roundingMode7)), false);
                        } else {
                            aVar2 = null;
                        }
                    }
                } else {
                    if (iG2 != 1447187017) {
                        aVar2 = f.a(oVar.getLength(), oVar.getPosition(), this.f169677d, rVar2);
                        oVar.skipFully(aVar3.f17127c);
                    } else if (iG2 != 1483304551) {
                        oVar.resetPeekPosition();
                        aVar2 = null;
                    } else {
                        yVar = yVar;
                        gVarB = g.b(aVar3, rVar2);
                        j17 = gVarB.f169702c;
                        if (yVar.f17274a != -1) {
                            yVar.f17274a = i28;
                            yVar.f17275b = i29;
                        } else {
                            yVar.f17274a = i28;
                            yVar.f17275b = i29;
                        }
                        j14 = 0;
                        position2 = oVar.getPosition();
                        if (oVar.getLength() == -1) {
                        }
                        oVar.skipFully(aVar3.f17127c);
                        if (iG2 == 1483304551) {
                            aVar2 = h.a(gVarB, position2);
                        } else {
                            length = oVar.getLength();
                            jA = gVarB.a();
                            aVar = gVarB.f169700a;
                            if (jA != C.TIME_UNSET) {
                                if (j17 != -1) {
                                    length = position2 + j17;
                                    j18 = j17 - ((long) aVar.f17127c);
                                } else if (length != -1) {
                                    j18 = (length - position2) - ((long) aVar.f17127c);
                                } else {
                                    aVar2 = null;
                                }
                                long j219 = length;
                                long j2110 = j18;
                                RoundingMode roundingMode8 = RoundingMode.HALF_UP;
                                aVar2 = new a(j219, position2 + ((long) aVar.f17127c), Ints.checkedCast(fa.z.U(j2110, 8000000L, jA, roundingMode8)), Ints.checkedCast(LongMath.divide(j2110, gVarB.f169701b, roundingMode8)), false);
                            } else {
                                aVar2 = null;
                            }
                        }
                    }
                    j14 = 0;
                }
                wVar = this.f169685l;
                position3 = oVar.getPosition();
                if (wVar != null) {
                    cVarA = null;
                    break;
                }
                bVarArr = wVar.f8574a;
                length2 = bVarArr.length;
                i34 = 0;
                while (true) {
                    if (i34 < length2) {
                        cVarA = null;
                        break;
                    }
                    bVar2 = bVarArr[i34];
                    if (bVar2 instanceof pb.k) {
                        cVarA = c.a(position3, (pb.k) bVar2, f(wVar));
                        break;
                    }
                    i34++;
                }
                z14 = this.f169692s;
                i30 = this.f169674a;
                if (z14) {
                    aVar2 = new e.a();
                } else {
                    if ((i30 & 4) != 0) {
                        if (cVarA != null) {
                            jF = cVarA.f169672c;
                        } else {
                            if (aVar2 != null) {
                                long durationUs4 = aVar2.getDurationUs();
                                dataEndPosition = aVar2.getDataEndPosition();
                                j19 = durationUs4;
                            } else {
                                jF = f(this.f169685l);
                            }
                            aVar2 = new b(j19, oVar.getPosition(), dataEndPosition);
                        }
                        j19 = jF;
                        aVar2 = new b(j19, oVar.getPosition(), dataEndPosition);
                    } else if (cVarA != null) {
                        aVar2 = cVarA;
                    } else if (aVar2 == null) {
                        aVar2 = null;
                    }
                    if (aVar2 != null) {
                        if ((i30 & 2) != 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        oVar.peekFully(rVar.f70054a, 0, 4);
                        rVar.G(0);
                        aVar3.a(rVar.g());
                        aVar2 = new a(oVar.getLength(), oVar.getPosition(), this.f169677d, z15);
                    } else {
                        if ((i30 & 2) != 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        oVar.peekFully(rVar.f70054a, 0, 4);
                        rVar.G(0);
                        aVar3.a(rVar.g());
                        aVar2 = new a(oVar.getLength(), oVar.getPosition(), this.f169677d, z15);
                    }
                }
                this.f169691r = aVar2;
                this.f169681h.a(aVar2);
                bVar = new q.b();
                bVar.f8411m = x.n(aVar3.f17126b);
                bVar.f8412n = 4096;
                bVar.B = aVar3.f17129e;
                bVar.C = aVar3.f17128d;
                bVar.E = yVar.f17274a;
                bVar.F = yVar.f17275b;
                if ((i30 & 8) != 0) {
                    wVar2 = null;
                } else {
                    wVar2 = this.f169685l;
                }
                bVar.f8409k = wVar2;
                if (this.f169691r.f() != -2147483647) {
                    bVar.f8406h = this.f169691r.f();
                }
                this.f169683j.d(bVar.a());
                this.f169688o = oVar.getPosition();
            } else {
                i16 = 1;
                j14 = 0;
                j8 = 1000000;
                j15 = C.TIME_UNSET;
                if (this.f169688o != 0) {
                    position = oVar.getPosition();
                    j16 = this.f169688o;
                    if (position < j16) {
                        oVar.skipFully((int) (j16 - position));
                    }
                }
            }
            if (this.f169690q == 0) {
                oVar.resetPeekPosition();
                if (h(oVar)) {
                    i14 = -1;
                    i15 = -1;
                } else {
                    rVar.G(0);
                    iG = rVar.g();
                    int i39 = ((long) ((-128000) & iG)) == (((long) this.f169684k) & (-128000)) ? 0 : 0;
                    oVar.skipFully(i16);
                    this.f169684k = i39;
                    i14 = -1;
                    i15 = 0;
                }
            } else {
                iB = this.f169683j.b(oVar, this.f169690q, i16);
                if (iB == -1) {
                    i14 = -1;
                    i15 = -1;
                } else {
                    i17 = this.f169690q - iB;
                    this.f169690q = i17;
                    if (i17 > 0) {
                        i14 = -1;
                        i15 = 0;
                    } else {
                        this.f169683j.c(((this.f169687n * j8) / ((long) aVar3.f17128d)) + this.f169686m, 1, aVar3.f17127c, 0, null);
                        this.f169687n += (long) aVar3.f17131g;
                        this.f169690q = 0;
                        i15 = 0;
                        i14 = -1;
                    }
                }
            }
        }
        if (i15 == i14) {
            e eVar3 = this.f169691r;
            if (eVar3 instanceof b) {
                long j37 = ((this.f169687n * j8) / ((long) aVar3.f17128d)) + this.f169686m;
                if (eVar3.getDurationUs() != j37) {
                    e eVar4 = this.f169691r;
                    ((b) eVar4).f169669c.f17106c = j37;
                    this.f169681h.a(eVar4);
                }
            }
        }
        return i15;
    }

    @Override // bb.n
    public final void c(p pVar) {
        this.f169681h = pVar;
        l0 l0VarTrack = pVar.track(0, 1);
        this.f169682i = l0VarTrack;
        this.f169683j = l0VarTrack;
        this.f169681h.endTracks();
    }

    @Override // bb.n
    public final boolean d(o oVar) {
        return i(oVar, true);
    }

    public final void g() {
        g0 g0Var = this.f169691r;
        if ((g0Var instanceof a) && ((bb.h) g0Var).isSeekable()) {
            long j8 = this.f169689p;
            if (j8 == -1 || j8 == this.f169691r.getDataEndPosition()) {
                return;
            }
            a aVar = (a) this.f169691r;
            this.f169691r = new a(this.f169689p, aVar.f169662h, aVar.f169663i, aVar.f169664j, aVar.f169665k);
            p pVar = this.f169681h;
            pVar.getClass();
            pVar.a(this.f169691r);
        }
    }

    public final boolean h(o oVar) {
        e eVar = this.f169691r;
        if (eVar != null) {
            long dataEndPosition = eVar.getDataEndPosition();
            if (dataEndPosition == -1 || oVar.getPeekPosition() <= dataEndPosition - 4) {
            }
            return true;
        }
        try {
            return !oVar.peekFully(this.f169676c.f70054a, 0, 4, true);
        } catch (EOFException unused) {
        }
    }

    public final boolean i(o oVar, boolean z14) throws EOFException {
        int peekPosition;
        int i14;
        int iA;
        int i15 = z14 ? 32768 : 131072;
        oVar.resetPeekPosition();
        if (oVar.getPosition() == 0) {
            w wVarA = this.f169679f.a(oVar, (this.f169674a & 8) == 0 ? null : f169673v);
            this.f169685l = wVarA;
            if (wVarA != null) {
                this.f169678e.b(wVarA);
            }
            peekPosition = (int) oVar.getPeekPosition();
            if (!z14) {
                oVar.skipFully(peekPosition);
            }
            i14 = 0;
        } else {
            peekPosition = 0;
            i14 = 0;
        }
        int i16 = i14;
        int i17 = i16;
        while (true) {
            if (h(oVar)) {
                if (i16 > 0) {
                    break;
                }
                g();
                vb.h.m();
                return false;
            }
            r rVar = this.f169676c;
            rVar.G(0);
            int iG = rVar.g();
            if ((i14 == 0 || ((-128000) & iG) == (((long) i14) & (-128000))) && (iA = c0.a(iG)) != -1) {
                i16++;
                if (i16 != 1) {
                    if (i16 == 4) {
                        break;
                    }
                } else {
                    this.f169677d.a(iG);
                    i14 = iG;
                }
                oVar.advancePeekPosition(iA - 4);
            } else {
                int i18 = i17 + 1;
                if (i17 == i15) {
                    if (z14) {
                        return false;
                    }
                    g();
                    vb.h.m();
                    return false;
                }
                if (z14) {
                    oVar.resetPeekPosition();
                    oVar.advancePeekPosition(peekPosition + i18);
                } else {
                    oVar.skipFully(1);
                }
                i16 = 0;
                i17 = i18;
                i14 = 0;
            }
        }
        if (z14) {
            oVar.skipFully(peekPosition + i17);
        } else {
            oVar.resetPeekPosition();
        }
        this.f169684k = i14;
        return true;
    }

    @Override // bb.n
    public final void release() {
    }

    @Override // bb.n
    public final void seek(long j8, long j14) {
        this.f169684k = 0;
        this.f169686m = C.TIME_UNSET;
        this.f169687n = 0L;
        this.f169690q = 0;
        this.f169694u = j14;
        e eVar = this.f169691r;
        if (eVar instanceof b) {
            l lVar = ((b) eVar).f169669c.f17105b;
            int i14 = lVar.f70034a;
            if (i14 != 0 && j14 - lVar.c(i14 - 1) < 100000) {
                return;
            }
            this.f169693t = true;
            this.f169683j = this.f169680g;
        }
    }

    public d(int i14) {
        this(i14, C.TIME_UNSET);
    }

    public d() {
        this(0);
    }
}
