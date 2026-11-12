package x63;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import java.io.EOFException;
import java.util.ArrayList;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.d0;
import p13.h0;
import w63.y;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w63.h f189312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w63.h f189313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w63.h f189314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w63.h f189315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w63.h f189316e;

    static {
        w63.h.f183361d.getClass();
        f189312a = w63.h.a.c("/");
        f189313b = w63.h.a.c("\\");
        f189314c = w63.h.a.c("/\\");
        f189315d = w63.h.a.c(".");
        f189316e = w63.h.a.c(CallerDataConverter.DEFAULT_RANGE_DELIMITER);
    }

    public static final int a(y yVar) {
        w63.h hVar = yVar.f183410a;
        if (hVar.d() != 0) {
            if (hVar.i(0) != 47) {
                if (hVar.i(0) == 92) {
                    if (hVar.d() > 2 && hVar.i(1) == 92) {
                        w63.h hVar2 = f189313b;
                        hVar2.getClass();
                        int iF = hVar.f(2, hVar2.getF183363a());
                        return iF == -1 ? hVar.d() : iF;
                    }
                } else if (hVar.d() > 2 && hVar.i(1) == 58 && hVar.i(2) == 92) {
                    char cI = (char) hVar.i(0);
                    if ('a' <= cI && cI < '{') {
                        return 3;
                    }
                    if ('A' <= cI && cI < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final y b(y yVar, y yVar2, boolean z14) {
        yVar2.getClass();
        if (a(yVar2) != -1 || yVar2.f() != null) {
            return yVar2;
        }
        w63.h hVarC = c(yVar);
        if (hVarC == null && (hVarC = c(yVar2)) == null) {
            hVarC = f(y.f183409c);
        }
        w63.e eVar = new w63.e();
        eVar.E(yVar.f183410a);
        if (eVar.f183349b > 0) {
            eVar.E(hVarC);
        }
        eVar.E(yVar2.f183410a);
        return d(eVar, z14);
    }

    public static final w63.h c(y yVar) {
        w63.h hVar = yVar.f183410a;
        w63.h hVar2 = f189312a;
        if (w63.h.g(hVar, hVar2) != -1) {
            return hVar2;
        }
        w63.h hVar3 = yVar.f183410a;
        w63.h hVar4 = f189313b;
        if (w63.h.g(hVar3, hVar4) != -1) {
            return hVar4;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0113 A[EDGE_INSN: B:100:0x0113->B:82:0x0113 BREAK  A[LOOP:1: B:54:0x00ae->B:113:0x00ae], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00be  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:84:0x011a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x011c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0131  */
    public static final y d(w63.e eVar, boolean z14) throws EOFException {
        w63.h hVar;
        long j8;
        char cJ;
        boolean z15;
        ArrayList arrayList;
        boolean zF1;
        w63.h hVar2;
        int size;
        int i14;
        long jT1;
        w63.h hVarH0;
        w63.h hVar3;
        w63.e eVar2 = new w63.e();
        w63.h hVarE = null;
        int i15 = 0;
        while (true) {
            if (!eVar.F3(0L, f189312a)) {
                hVar = f189313b;
                if (!eVar.F3(0L, hVar)) {
                    break;
                }
            }
            byte b14 = eVar.readByte();
            if (hVarE == null) {
                hVarE = e(b14);
            }
            i15++;
        }
        boolean z16 = i15 >= 2 && s.g(hVarE, hVar);
        w63.h hVar4 = f189314c;
        if (!z16) {
            if (i15 > 0) {
                hVarE.getClass();
                eVar2.E(hVarE);
            } else {
                long jT2 = eVar.t1(hVar4);
                if (hVarE == null) {
                    hVarE = jT2 == -1 ? f(y.f183409c) : e(eVar.j(jT2));
                }
                if (s.g(hVarE, hVar) && eVar.f183349b >= 2) {
                    j8 = -1;
                    if (eVar.j(1L) == 58 && (('a' <= (cJ = (char) eVar.j(0L)) && cJ < '{') || ('A' <= cJ && cJ < '['))) {
                        if (jT2 == 2) {
                            eVar2.write(eVar, 3L);
                        } else {
                            eVar2.write(eVar, 2L);
                        }
                    }
                } else {
                    j8 = -1;
                }
                Unit unit = Unit.INSTANCE;
            }
            if (eVar2.f183349b > 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            arrayList = new ArrayList();
            while (true) {
                zF1 = eVar.F1();
                hVar2 = f189315d;
                if (!zF1) {
                    break;
                }
                jT1 = eVar.t1(hVar4);
                if (jT1 == j8) {
                    hVarH0 = eVar.h0(eVar.f183349b);
                } else {
                    hVarH0 = eVar.h0(jT1);
                    eVar.readByte();
                }
                hVar3 = f189316e;
                if (s.g(hVarH0, hVar3)) {
                    if (z15 || !arrayList.isEmpty()) {
                        if (z14 || (!z15 && (arrayList.isEmpty() || s.g(h0.m0(arrayList), hVar3)))) {
                            arrayList.add(hVarH0);
                        } else if (!z16 || arrayList.size() != 1) {
                            d0.G(arrayList);
                        }
                    }
                } else if (s.g(hVarH0, hVar2) && !s.g(hVarH0, w63.h.f183362e)) {
                    arrayList.add(hVarH0);
                }
            }
            size = arrayList.size();
            for (i14 = 0; i14 < size; i14++) {
                if (i14 > 0) {
                    eVar2.E(hVarE);
                }
                eVar2.E((w63.h) arrayList.get(i14));
            }
            if (eVar2.f183349b == 0) {
                eVar2.E(hVar2);
            }
            return new y(eVar2.h0(eVar2.f183349b));
        }
        hVarE.getClass();
        eVar2.E(hVarE);
        eVar2.E(hVarE);
        j8 = -1;
        if (eVar2.f183349b > 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        arrayList = new ArrayList();
        while (true) {
            zF1 = eVar.F1();
            hVar2 = f189315d;
            if (!zF1) {
                break;
                break;
            }
            jT1 = eVar.t1(hVar4);
            if (jT1 == j8) {
                hVarH0 = eVar.h0(eVar.f183349b);
            } else {
                hVarH0 = eVar.h0(jT1);
                eVar.readByte();
            }
            hVar3 = f189316e;
            if (s.g(hVarH0, hVar3)) {
                if (z15) {
                }
                if (z14) {
                }
                arrayList.add(hVarH0);
            } else if (s.g(hVarH0, hVar2)) {
            }
        }
        size = arrayList.size();
        while (i14 < size) {
            if (i14 > 0) {
                eVar2.E(hVarE);
            }
            eVar2.E((w63.h) arrayList.get(i14));
        }
        if (eVar2.f183349b == 0) {
            eVar2.E(hVar2);
        }
        return new y(eVar2.h0(eVar2.f183349b));
    }

    public static final w63.h e(byte b14) {
        if (b14 == 47) {
            return f189312a;
        }
        if (b14 == 92) {
            return f189313b;
        }
        vb.h.s(am.j.h(b14, "not a directory separator: "));
        return null;
    }

    public static final w63.h f(String str) {
        if (s.g(str, "/")) {
            return f189312a;
        }
        if (s.g(str, "\\")) {
            return f189313b;
        }
        vb.h.s(fb1.c.n("not a directory separator: ", str));
        return null;
    }
}
