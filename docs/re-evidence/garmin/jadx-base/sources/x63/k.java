package x63;

import android.support.v4.media.session.PlaybackStateCompat;
import d53.u;
import d53.w;
import i3.u3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import o13.p;
import okhttp3.internal.ws.WebSocketProtocol;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.q0;
import p005kotlin.jvm.internal.r0;
import p13.h0;
import p13.u0;
import w63.b0;
import w63.i0;
import w63.y;

/* JADX INFO: loaded from: classes3.dex */
public final class k {
    public static final LinkedHashMap a(ArrayList arrayList) {
        y.f183408b.getClass();
        y yVarA = y.a.a("/");
        LinkedHashMap linkedHashMapF = u0.f(new p(yVarA, new h(yVarA, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null)));
        for (h hVar : h0.N0(arrayList, new j())) {
            if (((h) linkedHashMapF.put(hVar.f189329a, hVar)) == null) {
                while (true) {
                    y yVar = hVar.f189329a;
                    y yVarC = yVar.c();
                    if (yVarC == null) {
                        break;
                    }
                    h hVar2 = (h) linkedHashMapF.get(yVarC);
                    if (hVar2 != null) {
                        hVar2.f189345q.add(yVar);
                        break;
                    }
                    h hVar3 = new h(yVarC, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null);
                    linkedHashMapF.put(yVarC, hVar3);
                    hVar3.f189345q.add(yVar);
                    hVar = hVar3;
                }
            }
        }
        return linkedHashMapF;
    }

    public static final String b(int i14) {
        d53.a.a(16);
        String string = Integer.toString(i14, 16);
        string.getClass();
        return "0x".concat(string);
    }

    public static final i0 c(y yVar, w63.l lVar, e23.l<? super h, Boolean> lVar2) {
        Throwable th3;
        Throwable th4;
        Throwable th5;
        Throwable th6;
        lVar.getClass();
        w63.j jVarS = lVar.s(yVar);
        try {
            long size = jVarS.size() - ((long) 22);
            long j8 = 0;
            if (size < 0) {
                throw new IOException("not a zip: size=" + jVarS.size());
            }
            long jMax = Math.max(size - PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH, 0L);
            while (true) {
                b0 b0Var = new b0(jVarS.f(size));
                try {
                    if (b0Var.c() == 101010256) {
                        int iF = b0Var.f() & 65535;
                        int iF2 = b0Var.f() & 65535;
                        long jF = b0Var.f() & 65535;
                        if (jF != (b0Var.f() & 65535) || iF != 0 || iF2 != 0) {
                            throw new IOException("unsupported zip: spanned");
                        }
                        long j14 = j8;
                        b0Var.skip(4L);
                        d dVar = new d(jF, 4294967295L & ((long) b0Var.c()), b0Var.f() & 65535);
                        String strJ = b0Var.j(dVar.f189319c);
                        b0Var.close();
                        long j15 = size - ((long) 20);
                        if (j15 > j14) {
                            b0 b0Var2 = new b0(jVarS.f(j15));
                            try {
                                if (b0Var2.c() == 117853008) {
                                    int iC = b0Var2.c();
                                    long jE = b0Var2.e();
                                    if (b0Var2.c() != 1 || iC != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    b0 b0Var3 = new b0(jVarS.f(jE));
                                    try {
                                        int iC2 = b0Var3.c();
                                        if (iC2 != 101075792) {
                                            throw new IOException("bad zip: expected " + b(101075792) + " but was " + b(iC2));
                                        }
                                        b0Var3.skip(12L);
                                        int iC3 = b0Var3.c();
                                        int iC4 = b0Var3.c();
                                        long jE2 = b0Var3.e();
                                        if (jE2 != b0Var3.e() || iC3 != 0 || iC4 != 0) {
                                            throw new IOException("unsupported zip: spanned");
                                        }
                                        b0Var3.skip(8L);
                                        d dVar2 = new d(jE2, b0Var3.e(), dVar.f189319c);
                                        try {
                                            Unit unit = Unit.INSTANCE;
                                            try {
                                                b0Var3.close();
                                                th6 = null;
                                            } catch (Throwable th7) {
                                                th6 = th7;
                                            }
                                            dVar = dVar2;
                                        } catch (Throwable th8) {
                                            th5 = th8;
                                            dVar = dVar2;
                                            try {
                                                b0Var3.close();
                                                Unit unit2 = Unit.INSTANCE;
                                            } catch (Throwable th9) {
                                                o13.g.a(th5, th9);
                                            }
                                            th6 = th5;
                                        }
                                        if (th6 != null) {
                                            throw th6;
                                        }
                                    } catch (Throwable th10) {
                                        th5 = th10;
                                    }
                                }
                                Unit unit3 = Unit.INSTANCE;
                                try {
                                    b0Var2.close();
                                    th4 = null;
                                } catch (Throwable th11) {
                                    th4 = th11;
                                }
                            } catch (Throwable th12) {
                                try {
                                    b0Var2.close();
                                    Unit unit4 = Unit.INSTANCE;
                                } catch (Throwable th13) {
                                    o13.g.a(th12, th13);
                                }
                                th4 = th12;
                            }
                            if (th4 != null) {
                                throw th4;
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        b0 b0Var4 = new b0(jVarS.f(dVar.f189318b));
                        try {
                            long j16 = dVar.f189317a;
                            while (j14 < j16) {
                                h hVarD = d(b0Var4);
                                long j17 = j16;
                                if (hVarD.f189336h >= dVar.f189318b) {
                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                }
                                if (lVar2.invoke(hVarD).booleanValue()) {
                                    arrayList.add(hVarD);
                                }
                                j14++;
                                j16 = j17;
                            }
                            Unit unit5 = Unit.INSTANCE;
                            try {
                                b0Var4.close();
                                th3 = null;
                            } catch (Throwable th14) {
                                th3 = th14;
                            }
                        } catch (Throwable th15) {
                            try {
                                b0Var4.close();
                                Unit unit6 = Unit.INSTANCE;
                            } catch (Throwable th16) {
                                o13.g.a(th15, th16);
                            }
                            th3 = th15;
                        }
                        if (th3 != null) {
                            throw th3;
                        }
                        i0 i0Var = new i0(yVar, lVar, a(arrayList), strJ);
                        try {
                            jVarS.close();
                            Unit unit7 = Unit.INSTANCE;
                        } catch (Throwable unused) {
                        }
                        return i0Var;
                    }
                    long j18 = j8;
                    b0Var.close();
                    size--;
                    if (size < jMax) {
                        throw new IOException("not a zip: end of central directory signature not found");
                    }
                    j8 = j18;
                } catch (Throwable th17) {
                    b0Var.close();
                    throw th17;
                }
            }
        } catch (Throwable th18) {
            if (jVarS == null) {
                throw th18;
            }
            try {
                jVarS.close();
                Unit unit8 = Unit.INSTANCE;
                throw th18;
            } catch (Throwable th19) {
                o13.g.a(th18, th19);
                throw th18;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final h d(b0 b0Var) throws IOException {
        int iC = b0Var.c();
        if (iC != 33639248) {
            throw new IOException("bad zip: expected " + b(33639248) + " but was " + b(iC));
        }
        b0Var.skip(4L);
        short sF = b0Var.f();
        int i14 = sF & 65535;
        if ((sF & 1) != 0) {
            vb.h.C("unsupported zip: general purpose bit flag=".concat(b(i14)));
            return null;
        }
        int iF = b0Var.f() & 65535;
        int iF2 = b0Var.f() & 65535;
        int iF3 = b0Var.f() & 65535;
        long jC = ((long) b0Var.c()) & 4294967295L;
        q0 q0Var = new q0();
        q0Var.f105808a = ((long) b0Var.c()) & 4294967295L;
        q0 q0Var2 = new q0();
        q0Var2.f105808a = ((long) b0Var.c()) & 4294967295L;
        int iF4 = b0Var.f() & 65535;
        int iF5 = b0Var.f() & 65535;
        int iF6 = 65535 & b0Var.f();
        b0Var.skip(8L);
        q0 q0Var3 = new q0();
        q0Var3.f105808a = ((long) b0Var.c()) & 4294967295L;
        String strJ = b0Var.j(iF4);
        if (w.A(strJ, (char) 0)) {
            vb.h.C("bad zip: filename contains 0x00");
            return null;
        }
        long j8 = q0Var2.f105808a == 4294967295L ? 8 : 0L;
        if (q0Var.f105808a == 4294967295L) {
            j8 += (long) 8;
        }
        if (q0Var3.f105808a == 4294967295L) {
            j8 += (long) 8;
        }
        r0 r0Var = new r0();
        r0 r0Var2 = new r0();
        r0 r0Var3 = new r0();
        m0 m0Var = new m0();
        e(b0Var, iF5, new u3(m0Var, j8, q0Var2, b0Var, q0Var, q0Var3, r0Var, r0Var2, r0Var3));
        if (j8 > 0 && !m0Var.f105804a) {
            vb.h.C("bad zip: zip64 extra required but absent");
            return null;
        }
        String strJ2 = b0Var.j(iF6);
        y.f183408b.getClass();
        return new h(y.a.a("/").e(strJ), u.p(strJ, "/", false), strJ2, jC, q0Var.f105808a, q0Var2.f105808a, iF, q0Var3.f105808a, iF3, iF2, (Long) r0Var.f105810a, (Long) r0Var2.f105810a, (Long) r0Var3.f105810a, null, null, null, 57344, null);
    }

    public static final void e(b0 b0Var, int i14, e23.p pVar) throws IOException {
        w63.e eVar = b0Var.f183329b;
        long j8 = i14;
        while (j8 != 0) {
            if (j8 < 4) {
                vb.h.C("bad zip: truncated header in extra field");
                return;
            }
            int iF = b0Var.f() & 65535;
            long jF = ((long) b0Var.f()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
            long j14 = j8 - ((long) 4);
            if (j14 < jF) {
                vb.h.C("bad zip: truncated value in extra field");
                return;
            }
            b0Var.E3(jF);
            long j15 = eVar.f183349b;
            pVar.invoke(Integer.valueOf(iF), Long.valueOf(jF));
            long j16 = (eVar.f183349b + jF) - j15;
            if (j16 < 0) {
                vb.h.C(am.j.h(iF, "unsupported zip: too many bytes processed for "));
                return;
            } else {
                if (j16 > 0) {
                    eVar.skip(j16);
                }
                j8 = j14 - jF;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final h f(b0 b0Var, h hVar) {
        int iC = b0Var.c();
        if (iC != 67324752) {
            throw new IOException("bad zip: expected " + b(67324752) + " but was " + b(iC));
        }
        b0Var.skip(2L);
        short sF = b0Var.f();
        int i14 = sF & 65535;
        if ((sF & 1) != 0) {
            vb.h.C("unsupported zip: general purpose bit flag=".concat(b(i14)));
            return null;
        }
        b0Var.skip(18L);
        long jF = ((long) b0Var.f()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        int iF = b0Var.f() & 65535;
        b0Var.skip(jF);
        if (hVar == null) {
            b0Var.skip(iF);
            return null;
        }
        r0 r0Var = new r0();
        r0 r0Var2 = new r0();
        r0 r0Var3 = new r0();
        e(b0Var, iF, new i(b0Var, r0Var, r0Var2, r0Var3));
        return new h(hVar.f189329a, hVar.f189330b, hVar.f189331c, hVar.f189332d, hVar.f189333e, hVar.f189334f, hVar.f189335g, hVar.f189336h, hVar.f189337i, hVar.f189338j, hVar.f189339k, hVar.f189340l, hVar.f189341m, (Integer) r0Var.f105810a, (Integer) r0Var2.f105810a, (Integer) r0Var3.f105810a);
    }
}
