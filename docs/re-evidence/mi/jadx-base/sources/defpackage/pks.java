package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class pks {
    public static final pbt d = new pbt("ExtractorTaskFinder");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eks f30510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tbs f30511b;
    public final jds c;

    public pks(eks eksVar, tbs tbsVar, jds jdsVar) {
        this.f30510a = eksVar;
        this.f30511b = tbsVar;
        this.c = jdsVar;
    }

    public static boolean c(vjs vjsVar) {
        int i = vjsVar.f;
        return i == 1 || i == 2;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x03e4 A[PHI: r0
      0x03e4: PHI (r0v11 mks) = (r0v10 mks), (r0v14 mks), (r0v17 mks), (r0v20 mks) binds: [B:23:0x00a4, B:35:0x011b, B:49:0x01a4, B:64:0x0232] A[DONT_GENERATE, DONT_INLINE]] */
    public final mks a() {
        mks npsVar;
        mks xfsVar;
        kos kosVar;
        int iA;
        try {
            this.f30510a.h();
            ArrayList arrayList = new ArrayList();
            for (sjs sjsVar : this.f30510a.f().values()) {
                if (rbs.b(sjsVar.c.d)) {
                    arrayList.add(sjsVar);
                }
            }
            if (arrayList.isEmpty()) {
                xfsVar = null;
            } else {
                Map mapE = this.f30511b.E();
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        npsVar = null;
                        break;
                    }
                    sjs sjsVar2 = (sjs) it.next();
                    Long l = (Long) mapE.get(sjsVar2.c.f31580a);
                    if (l != null && sjsVar2.c.f31581b == l.longValue()) {
                        d.a("Found promote pack task for session %s with pack %s.", Integer.valueOf(sjsVar2.f33718a), sjsVar2.c.f31580a);
                        int i = sjsVar2.f33718a;
                        String str = sjsVar2.c.f31580a;
                        npsVar = new vos(i, str, this.f30511b.o(str), sjsVar2.f33719b, sjsVar2.c.f31581b);
                        break;
                    }
                }
                if (npsVar == null) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            npsVar = null;
                            break;
                        }
                        sjs sjsVar3 = (sjs) it2.next();
                        try {
                            tbs tbsVar = this.f30511b;
                            qjs qjsVar = sjsVar3.c;
                            if (tbsVar.p(qjsVar.f31580a, sjsVar3.f33719b, qjsVar.f31581b) == sjsVar3.c.f.size()) {
                                d.a("Found final move task for session %s with pack %s.", Integer.valueOf(sjsVar3.f33718a), sjsVar3.c.f31580a);
                                int i2 = sjsVar3.f33718a;
                                qjs qjsVar2 = sjsVar3.c;
                                npsVar = new dms(i2, qjsVar2.f31580a, sjsVar3.f33719b, qjsVar2.f31581b, qjsVar2.c);
                                break;
                            }
                        } catch (IOException e) {
                            throw new ugs(String.format("Failed to check number of completed merges for session %s, pack %s", Integer.valueOf(sjsVar3.f33718a), sjsVar3.c.f31580a), e, sjsVar3.f33718a);
                        }
                    }
                    if (npsVar == null) {
                        Iterator it3 = arrayList.iterator();
                        loop3: while (true) {
                            if (!it3.hasNext()) {
                                npsVar = null;
                                break;
                            }
                            sjs sjsVar4 = (sjs) it3.next();
                            qjs qjsVar3 = sjsVar4.c;
                            if (rbs.b(qjsVar3.d)) {
                                for (vjs vjsVar : qjsVar3.f) {
                                    tbs tbsVar2 = this.f30511b;
                                    qjs qjsVar4 = sjsVar4.c;
                                    if (tbsVar2.C(qjsVar4.f31580a, sjsVar4.f33719b, qjsVar4.f31581b, vjsVar.f36964a).exists()) {
                                        d.a("Found merge task for session %s with pack %s and slice %s.", Integer.valueOf(sjsVar4.f33718a), sjsVar4.c.f31580a, vjsVar.f36964a);
                                        int i3 = sjsVar4.f33718a;
                                        qjs qjsVar5 = sjsVar4.c;
                                        npsVar = new uls(i3, qjsVar5.f31580a, sjsVar4.f33719b, qjsVar5.f31581b, vjsVar.f36964a);
                                        break loop3;
                                    }
                                }
                            }
                        }
                        if (npsVar == null) {
                            Iterator it4 = arrayList.iterator();
                            loop5: while (true) {
                                if (!it4.hasNext()) {
                                    npsVar = null;
                                    break;
                                }
                                sjs sjsVar5 = (sjs) it4.next();
                                qjs qjsVar6 = sjsVar5.c;
                                if (rbs.b(qjsVar6.d)) {
                                    for (vjs vjsVar2 : qjsVar6.f) {
                                        if (b(sjsVar5, vjsVar2)) {
                                            tbs tbsVar3 = this.f30511b;
                                            qjs qjsVar7 = sjsVar5.c;
                                            if (tbsVar3.B(qjsVar7.f31580a, sjsVar5.f33719b, qjsVar7.f31581b, vjsVar2.f36964a).exists()) {
                                                d.a("Found verify task for session %s with pack %s and slice %s.", Integer.valueOf(sjsVar5.f33718a), sjsVar5.c.f31580a, vjsVar2.f36964a);
                                                int i4 = sjsVar5.f33718a;
                                                qjs qjsVar8 = sjsVar5.c;
                                                npsVar = new nps(i4, qjsVar8.f31580a, sjsVar5.f33719b, qjsVar8.f31581b, vjsVar2.f36964a, vjsVar2.f36965b, vjsVar2.c);
                                                break loop5;
                                            }
                                        }
                                    }
                                }
                            }
                            if (npsVar == null) {
                                Iterator it5 = arrayList.iterator();
                                loop7: while (true) {
                                    if (!it5.hasNext()) {
                                        xfsVar = null;
                                        break;
                                    }
                                    sjs sjsVar6 = (sjs) it5.next();
                                    qjs qjsVar9 = sjsVar6.c;
                                    if (rbs.b(qjsVar9.d)) {
                                        for (vjs vjsVar3 : qjsVar9.f) {
                                            if (!c(vjsVar3)) {
                                                tbs tbsVar4 = this.f30511b;
                                                qjs qjsVar10 = sjsVar6.c;
                                                Iterator it6 = it5;
                                                try {
                                                    iA = new gps(tbsVar4, qjsVar10.f31580a, sjsVar6.f33719b, qjsVar10.f31581b, vjsVar3.f36964a).a();
                                                } catch (IOException e2) {
                                                    d.b("Slice checkpoint corrupt, restarting extraction. %s", e2);
                                                    iA = 0;
                                                }
                                                if (iA != -1 && ((ois) vjsVar3.d.get(iA)).f29210a) {
                                                    d.a("Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s.", Integer.valueOf(vjsVar3.e), Integer.valueOf(sjsVar6.f33718a), sjsVar6.c.f31580a, vjsVar3.f36964a, Integer.valueOf(iA));
                                                    InputStream inputStreamA = this.c.a(sjsVar6.f33718a, sjsVar6.c.f31580a, vjsVar3.f36964a, iA);
                                                    int i5 = sjsVar6.f33718a;
                                                    qjs qjsVar11 = sjsVar6.c;
                                                    String str2 = qjsVar11.f31580a;
                                                    int i6 = sjsVar6.f33719b;
                                                    long j = qjsVar11.f31581b;
                                                    String str3 = qjsVar11.c;
                                                    String str4 = vjsVar3.f36964a;
                                                    int i7 = vjsVar3.e;
                                                    int size = vjsVar3.d.size();
                                                    qjs qjsVar12 = sjsVar6.c;
                                                    xfsVar = new xfs(i5, str2, i6, j, str3, str4, i7, iA, size, qjsVar12.e, qjsVar12.d, inputStreamA);
                                                    break loop7;
                                                }
                                                it5 = it6;
                                            }
                                        }
                                    }
                                }
                                if (xfsVar == null) {
                                    Iterator it7 = arrayList.iterator();
                                    loop9: while (true) {
                                        if (!it7.hasNext()) {
                                            kosVar = null;
                                            break;
                                        }
                                        sjs sjsVar7 = (sjs) it7.next();
                                        qjs qjsVar13 = sjsVar7.c;
                                        if (rbs.b(qjsVar13.d)) {
                                            for (vjs vjsVar4 : qjsVar13.f) {
                                                if (c(vjsVar4) && ((ois) vjsVar4.d.get(0)).f29210a && !b(sjsVar7, vjsVar4)) {
                                                    d.a("Found patch slice task using patch format %s for session %s, pack %s, slice %s.", Integer.valueOf(vjsVar4.f), Integer.valueOf(sjsVar7.f33718a), sjsVar7.c.f31580a, vjsVar4.f36964a);
                                                    InputStream inputStreamA2 = this.c.a(sjsVar7.f33718a, sjsVar7.c.f31580a, vjsVar4.f36964a, 0);
                                                    int i8 = sjsVar7.f33718a;
                                                    String str5 = sjsVar7.c.f31580a;
                                                    kosVar = new kos(i8, str5, this.f30511b.o(str5), this.f30511b.q(sjsVar7.c.f31580a), sjsVar7.f33719b, sjsVar7.c.f31581b, vjsVar4.f, vjsVar4.f36964a, vjsVar4.c, inputStreamA2);
                                                    break loop9;
                                                }
                                            }
                                        }
                                    }
                                    if (kosVar != null) {
                                        this.f30510a.j();
                                        return kosVar;
                                    }
                                    xfsVar = null;
                                }
                            } else {
                                xfsVar = npsVar;
                            }
                        } else {
                            xfsVar = npsVar;
                        }
                    } else {
                        xfsVar = npsVar;
                    }
                } else {
                    xfsVar = npsVar;
                }
            }
            this.f30510a.j();
            return xfsVar;
        } catch (Throwable th) {
            this.f30510a.j();
            throw th;
        }
    }

    public final boolean b(sjs sjsVar, vjs vjsVar) {
        qjs qjsVar = sjsVar.c;
        String str = qjsVar.f31580a;
        long j = qjsVar.f31581b;
        return new gps(this.f30511b, str, sjsVar.f33719b, j, vjsVar.f36964a).m();
    }
}
