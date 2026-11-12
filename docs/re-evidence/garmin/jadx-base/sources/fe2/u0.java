package fe2;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import wd2.i2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lfe2/u0;", "", "", "deviceUnitId", "", "sessionName", "Lfe2/r1;", "startDetails", "Lxd2/a1;", "repository", "Lde2/g0;", "deviceManager", "<init>", "(JLjava/lang/String;Lfe2/r1;Lxd2/a1;Lde2/g0;)V", "a", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f70945g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f70946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1 f70948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xd2.a1 f70949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final de2.g0 f70950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Logger f70951f;

    static {
        new a(null);
    }

    public u0(long j8, String str, r1 r1Var, xd2.a1 a1Var, de2.g0 g0Var) {
        str.getClass();
        r1Var.getClass();
        a1Var.getClass();
        g0Var.getClass();
        this.f70946a = j8;
        this.f70947b = str;
        this.f70948c = r1Var;
        this.f70949d = a1Var;
        this.f70950e = g0Var;
        this.f70951f = i2.a("DeviceDrivenSessionCreator");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0107  */
    /* JADX WARN: Code duplicated, block: B:51:0x0116  */
    /* JADX WARN: Code duplicated, block: B:53:0x011b  */
    /* JADX WARN: Code duplicated, block: B:55:0x011f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0127  */
    /* JADX WARN: Code duplicated, block: B:58:0x0137  */
    /* JADX WARN: Code duplicated, block: B:61:0x0141  */
    /* JADX WARN: Code duplicated, block: B:63:0x0145  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17, types: [T, fe2.u1$b] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, fe2.u1$b] */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, fe2.u1$b] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.lang.String, java.util.List, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final Object a(v13.c cVar) {
        v0 v0Var;
        p005kotlin.jvm.internal.r0 r0Var;
        p005kotlin.jvm.internal.r0 r0Var2;
        p005kotlin.jvm.internal.r0 r0Var3;
        Object obj;
        int i14;
        int i15;
        p005kotlin.jvm.internal.r0 r0Var4;
        ?? r14;
        Object objQ;
        v0 v0Var2;
        xd2.g1 g1Var;
        ae2.o.b bVarC;
        u1.b bVar;
        p005kotlin.jvm.internal.r0 r0Var5;
        T t7;
        r1 r1Var = this.f70948c;
        wd2.g2 g2Var = r1Var.f70911f;
        boolean z14 = r1Var.f70907b;
        if (cVar instanceof v0) {
            v0Var = (v0) cVar;
            int i16 = v0Var.f70964e;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                v0Var.f70964e = i16 - Integer.MIN_VALUE;
            } else {
                v0Var = new v0(this, cVar);
            }
        } else {
            v0Var = new v0(this, cVar);
        }
        Object objY = v0Var.f70962c;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i17 = v0Var.f70964e;
        xd2.a1 a1Var = this.f70949d;
        Logger logger = this.f70951f;
        if (i17 != 0) {
            if (i17 == 1) {
                r0Var = v0Var.f70960a;
                o13.r.b(objY);
            } else {
                if (i17 == 2) {
                    r0Var4 = v0Var.f70960a;
                    o13.r.b(objY);
                    v0Var2 = v0Var;
                    obj = obj2;
                    i15 = 2;
                    r14 = 0;
                    objQ = objY;
                    i14 = 3;
                    g1Var = (xd2.g1) objQ;
                    if (g1Var instanceof xd2.g1.b) {
                        v0Var2.f70960a = r0Var4;
                        v0Var2.f70961b = r0Var4;
                        v0Var2.f70964e = i14;
                        objY = b((xd2.g1.b) g1Var, v0Var2);
                        if (objY == obj) {
                            return obj;
                        }
                        r0Var5 = r0Var4;
                    } else {
                        if (g1Var instanceof xd2.g1.a) {
                            lc.u0.r();
                            return r14;
                        }
                        bVarC = w1.c((xd2.g1.a) g1Var);
                        if (bVarC != null) {
                            bVar = new u1.b(p13.w.c(new t1(bVarC, r14, i15, r14)));
                        } else {
                            bVar = new u1.b(r14, 1, r14);
                        }
                        r0Var3 = r0Var4;
                        t7 = bVar;
                    }
                    r0Var4.f105810a = t7;
                    return r0Var3.f105810a;
                }
                if (i17 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r0Var4 = v0Var.f70961b;
                r0Var5 = v0Var.f70960a;
                o13.r.b(objY);
            }
            r0Var3 = r0Var5;
            t7 = (u1) objY;
            r0Var4.f105810a = t7;
            return r0Var3.f105810a;
        }
        o13.r.b(objY);
        long j8 = this.f70946a;
        if (j8 == -1) {
            logger.error("Invalid unit id " + j8);
            return new u1.b(p13.w.c(new t1(ae2.o.a.C0046a.f2950c, null, 2, null)));
        }
        r0Var = new p005kotlin.jvm.internal.r0();
        r0Var.f105810a = new u1.b(null, 1, null);
        v0Var.f70960a = r0Var;
        v0Var.f70964e = 1;
        objY = a1Var.y(j8, v0Var, true);
        if (objY == obj2) {
            return obj2;
        }
        xd2.g1 g1Var2 = (xd2.g1) objY;
        if (g1Var2 instanceof xd2.g1.b) {
            be2.f fVar = (be2.f) ((xd2.g1.b) g1Var2).f190167a;
            if (z14) {
                Boolean bool = fVar.f17752b;
                Boolean bool2 = Boolean.TRUE;
                if (!p005kotlin.jvm.internal.s.g(bool, bool2) && !p005kotlin.jvm.internal.s.g(fVar.f17755e, bool2) && !p005kotlin.jvm.internal.s.g(g2Var, wd2.g2.b.f184481a)) {
                    if (z14) {
                        r0Var2 = r0Var;
                        logger.debug("No sharing method enabled");
                        r0Var2.f105810a = new u1.b(p13.w.c(new t1(ae2.o.b.m.f2965d, null, 2, null)));
                    }
                }
            } else if (z14) {
                r0Var2 = r0Var;
                logger.debug("No sharing method enabled");
                r0Var2.f105810a = new u1.b(p13.w.c(new t1(ae2.o.b.m.f2965d, null, 2, null)));
            }
            logger.debug("At least one sharing method is enabled or is manual start: create sessions");
            ae2.e0 e0Var = r1Var.f70906a;
            Boolean bool3 = fVar.f17755e;
            Boolean bool4 = Boolean.TRUE;
            ae2.l lVar = p005kotlin.jvm.internal.s.g(bool3, bool4) ? new ae2.l(bool4, Boolean.valueOf(r1Var.f70909d)) : null;
            boolean z15 = r1Var.f70910e;
            if (!p005kotlin.jvm.internal.s.g(g2Var, wd2.g2.b.f184481a)) {
                bool4 = null;
            }
            boolean z16 = r1Var.f70908c;
            Boolean boolValueOf = Boolean.valueOf(z15);
            v0Var.f70960a = r0Var;
            v0Var.f70964e = 2;
            int i18 = xd2.a1.f190042a;
            obj = obj2;
            ae2.l lVar2 = lVar;
            i14 = 3;
            v0 v0Var3 = v0Var;
            i15 = 2;
            r0Var4 = r0Var;
            r14 = 0;
            objQ = a1Var.q(e0Var, this.f70946a, this.f70947b, 24, lVar2, bool4, boolValueOf, z16, v0Var3);
            v0Var2 = v0Var3;
            if (objQ == obj) {
                return obj;
            }
            g1Var = (xd2.g1) objQ;
            if (g1Var instanceof xd2.g1.b) {
                v0Var2.f70960a = r0Var4;
                v0Var2.f70961b = r0Var4;
                v0Var2.f70964e = i14;
                objY = b((xd2.g1.b) g1Var, v0Var2);
                if (objY == obj) {
                    return obj;
                }
                r0Var5 = r0Var4;
                r0Var3 = r0Var5;
                t7 = (u1) objY;
            } else {
                if (g1Var instanceof xd2.g1.a) {
                    lc.u0.r();
                    return r14;
                }
                bVarC = w1.c((xd2.g1.a) g1Var);
                if (bVarC != null) {
                    bVar = new u1.b(p13.w.c(new t1(bVarC, r14, i15, r14)));
                } else {
                    bVar = new u1.b(r14, 1, r14);
                }
                r0Var3 = r0Var4;
                t7 = bVar;
            }
            r0Var4.f105810a = t7;
            return r0Var3.f105810a;
        }
        r0Var2 = r0Var;
        if (!(g1Var2 instanceof xd2.g1.a)) {
            lc.u0.r();
            return null;
        }
        ae2.o.b bVarC2 = w1.c((xd2.g1.a) g1Var2);
        if (bVarC2 != null) {
            r0Var2.f105810a = new u1.b(p13.w.c(new t1(bVarC2, null, 2, null)));
        }
        r0Var3 = r0Var2;
        return r0Var3.f105810a;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x011f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(xd2.g1.b bVar, v13.c cVar) {
        w0 w0Var;
        ArrayList arrayList;
        ae2.b bVar2;
        List list;
        List list2;
        List list3;
        ae2.b bVar3;
        if (cVar instanceof w0) {
            w0Var = (w0) cVar;
            int i14 = w0Var.f70993f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                w0Var.f70993f = i14 - Integer.MIN_VALUE;
            } else {
                w0Var = new w0(this, cVar);
            }
        } else {
            w0Var = new w0(this, cVar);
        }
        w0 w0Var2 = w0Var;
        Object obj = w0Var2.f70991d;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = w0Var2.f70993f;
        Logger logger = this.f70951f;
        if (i15 != 0) {
            if (i15 == 1) {
                list = w0Var2.f70990c;
                List list4 = w0Var2.f70989b;
                ae2.b bVar4 = w0Var2.f70988a;
                o13.r.b(obj);
                bVar2 = bVar4;
                list2 = list4;
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = w0Var2.f70990c;
                List list5 = w0Var2.f70989b;
                bVar3 = w0Var2.f70988a;
                o13.r.b(obj);
                list3 = list5;
            }
            return new u1.a(bVar3.getStart(), bVar3.getEnd(), list, list3.isEmpty() ? null : list3);
        }
        o13.r.b(obj);
        logger.debug("Livetrack created success");
        ae2.b bVar5 = (ae2.b) bVar.f190167a;
        List<ae2.d> listC = bVar5.c();
        if (listC != null) {
            arrayList = new ArrayList();
            for (ae2.d dVar : listC) {
                dVar.getClass();
                ae2.o.b.c cVar2 = ae2.o.b.f2953c;
                String name = dVar.getName();
                String str = dVar.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String();
                cVar2.getClass();
                arrayList.add(new t1(ae2.o.b.c.a(name, str), dVar.getValue()));
            }
        } else {
            arrayList = new ArrayList();
        }
        ArrayList arrayListA = ae2.i0.a(bVar5);
        if (arrayListA.isEmpty()) {
            arrayList.add(new t1(ae2.o.b.l.f2964d, null, 2, null));
            return new u1.b(arrayList);
        }
        DateTime start = bVar5.getStart();
        ae2.e0 publisher = bVar5.getPublisher();
        w0Var2.f70988a = bVar5;
        w0Var2.f70989b = arrayList;
        w0Var2.f70990c = arrayListA;
        w0Var2.f70993f = 1;
        Object objC = c(start, publisher, arrayListA, w0Var2);
        if (objC != obj2) {
            bVar2 = bVar5;
            list = arrayListA;
            obj = objC;
            list2 = arrayList;
        }
        return obj2;
        List<t1> list6 = list2;
        ae2.o.a aVar = (ae2.o.a) obj;
        if (aVar != null) {
            list6.add(new t1(aVar, null, 2, null));
        }
        u62.z.i("Sessions created ", list.size(), logger);
        ArrayList arrayList2 = new ArrayList();
        for (t1 t1Var : list6) {
            t1Var.getClass();
            ae2.o oVar = t1Var.f70934a;
            arrayList2.add(new be2.g.a(oVar.f2948a, oVar.f2949b, t1Var.f70935b));
        }
        w0Var2.f70988a = bVar2;
        w0Var2.f70989b = list6;
        w0Var2.f70990c = list;
        w0Var2.f70993f = 2;
        if (xd2.a1.m(this.f70949d, this.f70946a, null, null, arrayList2, w0Var2, 14) != obj2) {
            list3 = list6;
            bVar3 = bVar2;
            return new u1.a(bVar3.getStart(), bVar3.getEnd(), list, list3.isEmpty() ? null : list3);
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object c(DateTime dateTime, ae2.e0 e0Var, ArrayList arrayList, v13.c cVar) {
        x0 x0Var;
        if (cVar instanceof x0) {
            x0Var = (x0) cVar;
            int i14 = x0Var.f71000c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                x0Var.f71000c = i14 - Integer.MIN_VALUE;
            } else {
                x0Var = new x0(this, cVar);
            }
        } else {
            x0Var = new x0(this, cVar);
        }
        x0 x0Var2 = x0Var;
        Object objB = x0Var2.f70998a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = x0Var2.f71000c;
        if (i15 == 0) {
            o13.r.b(objB);
            r1 r1Var = this.f70948c;
            de2.h0 h0Var = new de2.h0(e0Var == null ? r1Var.f70906a : e0Var, dateTime != null ? dateTime.getMillis() : System.currentTimeMillis(), this.f70947b, 86400L, arrayList);
            boolean z14 = r1Var.f70908c;
            x0Var2.f71000c = 1;
            objB = this.f70950e.b(this.f70946a, z14, h0Var, x0Var2);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB);
        }
        de2.g0.b bVar = (de2.g0.b) objB;
        bVar.getClass();
        if (bVar instanceof de2.g0.b.d) {
            return null;
        }
        return bVar instanceof de2.g0.b.a ? ae2.o.a.b.f2951c : ae2.o.a.c.f2952c;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfe2/u0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
