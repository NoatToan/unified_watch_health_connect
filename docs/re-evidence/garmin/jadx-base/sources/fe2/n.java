package fe2;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import wd2.i2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lfe2/n;", "", "", "deviceUnitId", "", "sessionName", "Lfe2/r1;", "startDetails", "Lxd2/a1;", "repository", "Lde2/g0;", "deviceManager", "<init>", "(JLjava/lang/String;Lfe2/r1;Lxd2/a1;Lde2/g0;)V", "a", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f70853g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f70854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1 f70856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xd2.a1 f70857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final de2.g0 f70858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Logger f70859f;

    static {
        new a(null);
    }

    public n(long j8, String str, r1 r1Var, xd2.a1 a1Var, de2.g0 g0Var) {
        str.getClass();
        r1Var.getClass();
        a1Var.getClass();
        g0Var.getClass();
        this.f70854a = j8;
        this.f70855b = str;
        this.f70856c = r1Var;
        this.f70857d = a1Var;
        this.f70858e = g0Var;
        this.f70859f = i2.a("ClassicSessionCreator");
    }

    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0132  */
    /* JADX WARN: Code duplicated, block: B:54:0x0143  */
    /* JADX WARN: Code duplicated, block: B:57:0x0152 A[LOOP:0: B:55:0x014c->B:57:0x0152, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x017b  */
    /* JADX WARN: Code duplicated, block: B:62:0x018b  */
    /* JADX WARN: Code duplicated, block: B:65:0x01af  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x01de  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:79:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x018b, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r18v0, types: [fe2.n] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, fe2.u1$b] */
    /* JADX WARN: Type inference failed for: r3v15, types: [T] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.String, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.String, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [ae2.o$b, java.lang.Object, java.lang.String, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r4v16, types: [T, fe2.u1$b] */
    /* JADX WARN: Type inference failed for: r5v16, types: [T, fe2.u1$b] */
    public final Object a(v13.c cVar) {
        o oVar;
        p005kotlin.jvm.internal.r0 r0Var;
        p005kotlin.jvm.internal.r0 r0Var2;
        ?? r14;
        p005kotlin.jvm.internal.r0 r0Var3;
        ae2.o.b bVar;
        ?? r15;
        o oVar2;
        ae2.a.e eVar;
        p005kotlin.jvm.internal.r0 r0Var4;
        u13.a aVar;
        Logger logger;
        ?? r16;
        Object objQ;
        o oVar3;
        xd2.g1 g1Var;
        p005kotlin.jvm.internal.r0 r0Var5;
        ae2.b bVar2;
        List<ae2.d> listC;
        ArrayList arrayList;
        ArrayList arrayListA;
        Object bVar3;
        p005kotlin.jvm.internal.r0 r0Var6;
        ?? r17;
        ArrayList arrayList2;
        ?? r18;
        r1 r1Var = this.f70856c;
        wd2.g2 g2Var = r1Var.f70911f;
        boolean z14 = r1Var.f70907b;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f70874f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f70874f = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object objY = oVar.f70872d;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar.f70874f;
        xd2.a1 a1Var = this.f70857d;
        Logger logger2 = this.f70859f;
        if (i15 == 0) {
            o13.r.b(objY);
            long j8 = this.f70854a;
            if (j8 == -1) {
                logger2.error("Invalid unit id " + j8);
                return new u1.b(p13.w.c(new t1(ae2.o.a.C0046a.f2950c, null, 2, null)));
            }
            r0Var = new p005kotlin.jvm.internal.r0();
            r0Var.f105810a = new u1.b(null, 1, null);
            oVar.f70869a = r0Var;
            oVar.f70874f = 1;
            objY = a1Var.y(j8, oVar, true);
            if (objY == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                if (i15 == 2) {
                    r0Var4 = oVar.f70869a;
                    o13.r.b(objY);
                    oVar3 = oVar;
                    aVar = aVar2;
                    logger = logger2;
                    r16 = 0;
                    objQ = objY;
                    g1Var = (xd2.g1) objQ;
                    if (g1Var instanceof xd2.g1.b) {
                        logger.debug("Livetrack created success");
                        bVar2 = (ae2.b) ((xd2.g1.b) g1Var).f190167a;
                        listC = bVar2.c();
                        if (listC != null) {
                            arrayList2 = new ArrayList();
                            for (ae2.d dVar : listC) {
                                dVar.getClass();
                                ae2.o.b.c cVar2 = ae2.o.b.f2953c;
                                String name = dVar.getName();
                                String str = dVar.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String();
                                cVar2.getClass();
                                arrayList2.add(new t1(ae2.o.b.c.a(name, str), dVar.getValue()));
                            }
                            arrayList = arrayList2;
                        } else {
                            arrayList = new ArrayList();
                        }
                        arrayListA = ae2.i0.a(bVar2);
                        if (arrayListA.isEmpty()) {
                            arrayList.add(new t1(ae2.o.b.l.f2964d, r16, 2, r16));
                            bVar3 = new u1.b(arrayList);
                        } else {
                            logger.debug("Sessions created " + arrayListA.size());
                            DateTime start = bVar2.getStart();
                            DateTime end = bVar2.getEnd();
                            if (arrayList.isEmpty()) {
                                r17 = arrayList;
                                r17 = r16;
                            }
                            r17 = arrayList;
                            bVar3 = new u1.a(start, end, arrayListA, r17);
                        }
                        r0Var6 = r0Var4;
                        r18 = bVar3;
                    } else {
                        if (g1Var instanceof xd2.g1.a) {
                            lc.u0.r();
                            return r16;
                        }
                        oVar3.f70869a = r0Var4;
                        oVar3.f70870b = r16;
                        oVar3.f70871c = r0Var4;
                        oVar3.f70874f = 3;
                        objY = b((xd2.g1.a) g1Var, oVar3);
                        if (objY == aVar) {
                            return aVar;
                        }
                        r0Var5 = r0Var4;
                    }
                    r0Var4.f105810a = r18;
                    return r0Var6.f105810a;
                }
                if (i15 != 3) {
                    if (i15 == 4) {
                        r0Var2 = oVar.f70869a;
                        o13.r.b(objY);
                        r15 = 0;
                        r0Var2.f105810a = new u1.b(p13.w.c(new t1(ae2.o.b.m.f2965d, r15, 2, r15)));
                        r0Var6 = r0Var2;
                        return r0Var6.f105810a;
                    }
                    if (i15 != 5) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bVar = oVar.f70870b;
                    p005kotlin.jvm.internal.r0 r0Var7 = oVar.f70869a;
                    o13.r.b(objY);
                    r0Var3 = r0Var7;
                    r14 = 0;
                    r0Var3.f105810a = new u1.b(p13.w.c(new t1(bVar, r14, 2, r14)));
                    r0Var6 = r0Var3;
                    return r0Var6.f105810a;
                }
                r0Var4 = oVar.f70871c;
                r0Var5 = oVar.f70869a;
                o13.r.b(objY);
                r0Var6 = r0Var5;
                r18 = (u1) objY;
                r0Var4.f105810a = r18;
                return r0Var6.f105810a;
            }
            r0Var = oVar.f70869a;
            o13.r.b(objY);
        }
        xd2.g1 g1Var2 = (xd2.g1) objY;
        if (!(g1Var2 instanceof xd2.g1.b)) {
            r0Var2 = r0Var;
            r14 = 0;
            o oVar4 = oVar;
            if (!(g1Var2 instanceof xd2.g1.a)) {
                lc.u0.r();
                return null;
            }
            ae2.o.b bVarC = w1.c((xd2.g1.a) g1Var2);
            if (bVarC != null) {
                ae2.a aVarA = w1.a(bVarC);
                oVar4.f70869a = r0Var2;
                oVar4.f70870b = bVarC;
                oVar4.f70874f = 5;
                if (c(aVarA, oVar4) == aVar2) {
                    return aVar2;
                }
                r0Var3 = r0Var2;
                bVar = bVarC;
                r0Var3.f105810a = new u1.b(p13.w.c(new t1(bVar, r14, 2, r14)));
                r0Var6 = r0Var3;
            }
            return r0Var6.f105810a;
        }
        be2.f fVar = (be2.f) ((xd2.g1.b) g1Var2).f190167a;
        if (z14) {
            Boolean bool = fVar.f17752b;
            Boolean bool2 = Boolean.TRUE;
            if (!p005kotlin.jvm.internal.s.g(bool, bool2) && !p005kotlin.jvm.internal.s.g(fVar.f17755e, bool2) && !p005kotlin.jvm.internal.s.g(g2Var, wd2.g2.b.f184481a)) {
                if (z14) {
                    r0Var2 = r0Var;
                    r15 = 0;
                    oVar2 = oVar;
                    logger2.debug("No sharing method enabled");
                    eVar = new ae2.a.e();
                    oVar2.f70869a = r0Var2;
                    oVar2.f70870b = null;
                    oVar2.f70874f = 4;
                    if (c(eVar, oVar2) == aVar2) {
                        return aVar2;
                    }
                    r0Var2.f105810a = new u1.b(p13.w.c(new t1(ae2.o.b.m.f2965d, r15, 2, r15)));
                }
            }
        } else if (z14) {
            r0Var2 = r0Var;
            r15 = 0;
            oVar2 = oVar;
            logger2.debug("No sharing method enabled");
            eVar = new ae2.a.e();
            oVar2.f70869a = r0Var2;
            oVar2.f70870b = null;
            oVar2.f70874f = 4;
            if (c(eVar, oVar2) == aVar2) {
                return aVar2;
            }
            r0Var2.f105810a = new u1.b(p13.w.c(new t1(ae2.o.b.m.f2965d, r15, 2, r15)));
        }
        logger2.debug("At least one sharing method is enabled or is manual start: create sessions");
        ae2.e0 e0Var = r1Var.f70906a;
        Boolean bool3 = fVar.f17755e;
        Boolean bool4 = Boolean.TRUE;
        ae2.l lVar = p005kotlin.jvm.internal.s.g(bool3, bool4) ? new ae2.l(bool4, Boolean.valueOf(r1Var.f70909d)) : null;
        boolean z15 = r1Var.f70910e;
        Boolean bool5 = p005kotlin.jvm.internal.s.g(g2Var, wd2.g2.b.f184481a) ? bool4 : null;
        Boolean boolValueOf = Boolean.valueOf(z15);
        oVar.f70869a = r0Var;
        oVar.f70870b = null;
        oVar.f70874f = 2;
        int i16 = xd2.a1.f190042a;
        r0Var4 = r0Var;
        aVar = aVar2;
        o oVar5 = oVar;
        logger = logger2;
        r16 = 0;
        objQ = a1Var.q(e0Var, this.f70854a, this.f70855b, 24, lVar, bool5, boolValueOf, false, oVar5);
        oVar3 = oVar5;
        if (objQ == aVar) {
            return aVar;
        }
        g1Var = (xd2.g1) objQ;
        if (g1Var instanceof xd2.g1.b) {
            logger.debug("Livetrack created success");
            bVar2 = (ae2.b) ((xd2.g1.b) g1Var).f190167a;
            listC = bVar2.c();
            if (listC != null) {
                arrayList2 = new ArrayList();
                while (r6.hasNext()) {
                    dVar.getClass();
                    ae2.o.b.c cVar3 = ae2.o.b.f2953c;
                    String name2 = dVar.getName();
                    String str2 = dVar.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String();
                    cVar3.getClass();
                    arrayList2.add(new t1(ae2.o.b.c.a(name2, str2), dVar.getValue()));
                }
                arrayList = arrayList2;
            } else {
                arrayList = new ArrayList();
            }
            arrayListA = ae2.i0.a(bVar2);
            if (arrayListA.isEmpty()) {
                logger.debug("Sessions created " + arrayListA.size());
                DateTime start2 = bVar2.getStart();
                DateTime end2 = bVar2.getEnd();
                if (arrayList.isEmpty()) {
                    r17 = arrayList;
                    r17 = r16;
                }
                r17 = arrayList;
                bVar3 = new u1.a(start2, end2, arrayListA, r17);
            } else {
                arrayList.add(new t1(ae2.o.b.l.f2964d, r16, 2, r16));
                bVar3 = new u1.b(arrayList);
            }
            r0Var6 = r0Var4;
            r18 = bVar3;
        } else {
            if (g1Var instanceof xd2.g1.a) {
                lc.u0.r();
                return r16;
            }
            oVar3.f70869a = r0Var4;
            oVar3.f70870b = r16;
            oVar3.f70871c = r0Var4;
            oVar3.f70874f = 3;
            objY = b((xd2.g1.a) g1Var, oVar3);
            if (objY == aVar) {
                return aVar;
            }
            r0Var5 = r0Var4;
            r0Var6 = r0Var5;
            r18 = (u1) objY;
        }
        r0Var4.f105810a = r18;
        return r0Var6.f105810a;
        r0Var6 = r0Var2;
        return r0Var6.f105810a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(xd2.g1.a aVar, v13.c cVar) {
        p pVar;
        ae2.o.b bVarC;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f70881d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f70881d = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object obj = pVar.f70879b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar.f70881d;
        if (i15 == 0) {
            o13.r.b(obj);
            bVarC = w1.c(aVar);
            ae2.a aVarA = bVarC != null ? w1.a(bVarC) : new ae2.a.b();
            pVar.f70878a = bVarC;
            pVar.f70881d = 1;
            if (c(aVarA, pVar) == obj2) {
                return obj2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVarC = pVar.f70878a;
            o13.r.b(obj);
        }
        return bVarC != null ? new u1.b(p13.w.c(new t1(bVarC, null, 2, null))) : new u1.b(null, 1, null);
    }

    public final Object c(ae2.a aVar, v13.c cVar) {
        Object objD;
        return (this.f70856c.f70907b && (objD = this.f70858e.d(this.f70854a, aVar, cVar)) == u13.a.COROUTINE_SUSPENDED) ? objD : Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfe2/n$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
