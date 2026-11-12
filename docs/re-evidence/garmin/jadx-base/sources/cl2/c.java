package cl2;

import bl2.d0;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import cz2.q;
import d53.u;
import i3.e5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import o13.r;
import o13.t;
import o53.b0;
import o53.c2;
import o53.j;
import o53.l1;
import o53.s;
import ok2.g0;
import ok2.v;
import ok2.w;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p13.a1;
import p13.h0;
import pk2.c0;
import pk2.e0;
import pk2.f0;
import pk2.x;
import pk2.y;
import pk2.z;
import wk2.i;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f27941b;

        static {
            int[] iArr = new int[ok2.e.values().length];
            try {
                iArr[ok2.e.f132635c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ok2.e.f132636d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ok2.e.I.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f27940a = iArr;
            int[] iArr2 = new int[g0.values().length];
            try {
                iArr2[g0.USER_INITIATED_HIGHEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[g0.USER_INITIATED_PREFERRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f27941b = iArr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(c0 c0Var, rs2.c cVar, i iVar, x xVar, Logger logger, v13.c cVar2) {
        d dVar;
        if (cVar2 instanceof d) {
            dVar = (d) cVar2;
            int i14 = dVar.f27946e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f27946e = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(cVar2);
            }
        } else {
            dVar = new d(cVar2);
        }
        Object obj = dVar.f27945d;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f27946e;
        try {
            if (i15 != 0) {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                x xVar2 = dVar.f27944c;
                Logger logger2 = dVar.f27943b;
                i iVar2 = dVar.f27942a;
                r.b(obj);
                return xVar2;
            }
            r.b(obj);
            if (c0Var.h(cVar, iVar.getF205152b())) {
                wk2.f metadata = iVar.getF205152b();
                CoreTransferException coreTransferException = xVar.f138497b;
                dVar.f27942a = iVar;
                dVar.f27943b = logger;
                dVar.f27944c = xVar;
                dVar.f27946e = 1;
                if (c0Var.d(cVar, metadata, coreTransferException, dVar) == obj2) {
                    return obj2;
                }
            }
            return xVar;
        } catch (Exception e4) {
            logger.warn("Unexpected agent ack failure " + iVar.getId(), (Throwable) e4);
            if (xVar.f138496a != y.SUCCESS || xVar.f138497b != null) {
                return xVar;
            }
            CoreTransferException coreTransferException2 = e4 instanceof CoreTransferException ? (CoreTransferException) e4 : new CoreTransferException(ok2.e.f132645m, e4);
            x.a aVar = x.f138495e;
            y yVar = y.TREAT_AS_SUCCESS;
            aVar.getClass();
            return x.a.a(yVar, coreTransferException2);
        }
    }

    public static final x b(z zVar, rs2.c cVar, i iVar, x xVar, Logger logger) {
        zVar.getClass();
        cVar.getClass();
        iVar.getClass();
        xVar.getClass();
        CoreTransferException coreTransferException = xVar.f138497b;
        if (coreTransferException == null) {
            return xVar;
        }
        if (coreTransferException.getFailure().a() && !(zVar instanceof qk2.a)) {
            return xVar;
        }
        x xVar2 = null;
        if (!l(zVar, cVar, iVar.getF205152b())) {
            return null;
        }
        if (iVar.getF205152b().a() && !(zVar instanceof qk2.a)) {
            logger.warn("Non-Ad Hoc agent " + zVar.A() + " may modify Ad Hoc result " + iVar.getId());
        }
        try {
            x xVarQ = zVar.q(cVar, iVar.getF205152b(), xVar);
            CoreTransferException coreTransferException2 = xVarQ != null ? xVarQ.f138497b : null;
            if (coreTransferException2 == null || h(coreTransferException2) || coreTransferException.getFailure() == coreTransferException2.getFailure()) {
                xVar2 = xVarQ;
            } else {
                logger.warn("Ignoring invalid modifyTransferError for " + iVar.getId() + " exception " + coreTransferException2);
                xVar2 = new x(xVarQ.f138496a, coreTransferException);
            }
        } catch (Exception unused) {
        }
        return xVar2 == null ? xVar : xVar2;
    }

    public static final HashMap c(nd2.a aVar, rs2.c cVar) {
        aVar.getClass();
        cVar.getClass();
        return nd2.a.a(Long.valueOf(cVar.getF92746j()), String.valueOf(cVar.getF92745i()), "006-B" + cVar.getF92744h() + "-00");
    }

    public static final x d(List list, x xVar) {
        Object obj;
        Object next;
        Object next2;
        list.getClass();
        xVar.getClass();
        List listN0 = h0.N0(h0.Z(list), new e());
        if (listN0.size() == 1) {
            return (x) h0.b0(listN0);
        }
        if (!listN0.isEmpty()) {
            Iterator it = listN0.iterator();
            do {
                obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((x) next).f138496a.f138508a);
            x xVar2 = (x) next;
            if (xVar2 == null) {
                Iterator it3 = listN0.iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                } while (((x) next2).f138498c == null);
                xVar2 = (x) next2;
                if (xVar2 == null) {
                    for (Object obj2 : listN0) {
                        if (((x) obj2).f138496a != y.SUCCESS) {
                            obj = obj2;
                            break;
                        }
                    }
                    x xVar3 = (x) obj;
                    if (xVar3 != null) {
                        return xVar3;
                    }
                    x xVar4 = (x) h0.d0(listN0);
                    if (xVar4 != null) {
                        return xVar4;
                    }
                }
            }
            return xVar2;
        }
        return xVar;
    }

    public static final g0 e(Collection<? extends z> collection, wk2.f fVar, rs2.c cVar) {
        Object next;
        Object next2;
        collection.getClass();
        fVar.getClass();
        cVar.getClass();
        wk2.h hVar = fVar.f185844c;
        if (hVar == wk2.h.PHONE_TO_DEVICE) {
            Collection<? extends z> collection2 = collection;
            if (!collection2.isEmpty()) {
                Iterator<T> it = collection2.iterator();
                while (it.hasNext()) {
                    if (!(((z) it.next()) instanceof c0)) {
                        vb.h.s("Download file priority requested from non-DownloadSourceAgent");
                        return null;
                    }
                }
            }
        }
        if (hVar == wk2.h.DEVICE_TO_PHONE) {
            Collection<? extends z> collection3 = collection;
            if (!collection3.isEmpty()) {
                Iterator<T> it3 = collection3.iterator();
                while (it3.hasNext()) {
                    if (!(((z) it3.next()) instanceof f0)) {
                        vb.h.s("Upload file priority requested from non-UploadDestinationAgent");
                        return null;
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (l((z) obj, cVar, fVar)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it4 = arrayList.iterator();
        while (true) {
            next = null;
            if (!it4.hasNext()) {
                break;
            }
            e0 e0Var = ((z) it4.next()).D().get(fVar.f185843b);
            next = e0Var != null ? e0Var.a() : null;
            if (next != null) {
                arrayList2.add(next);
            }
        }
        Iterator it5 = arrayList2.iterator();
        if (it5.hasNext()) {
            next2 = it5.next();
            if (it5.hasNext()) {
                int i14 = -((g0) next2).ordinal();
                do {
                    Object next3 = it5.next();
                    int i15 = -((g0) next3).ordinal();
                    if (i14 < i15) {
                        next2 = next3;
                        i14 = i15;
                    }
                } while (it5.hasNext());
            }
        } else {
            next2 = null;
        }
        g0 g0Var = (g0) next2;
        if (g0Var != null) {
            return g0Var;
        }
        ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList3.add(f((z) it6.next(), cVar, fVar));
        }
        Iterator it7 = arrayList3.iterator();
        if (it7.hasNext()) {
            next = it7.next();
            if (it7.hasNext()) {
                int i16 = -((g0) next).ordinal();
                do {
                    Object next4 = it7.next();
                    int i17 = -((g0) next4).ordinal();
                    if (i16 < i17) {
                        next = next4;
                        i16 = i17;
                    }
                } while (it7.hasNext());
            }
        }
        g0 g0Var2 = (g0) next;
        return g0Var2 == null ? g0.UTILITY_SILENT : g0Var2;
    }

    public static final g0 f(z zVar, rs2.c cVar, wk2.f fVar) {
        zVar.getClass();
        fVar.getClass();
        cVar.getClass();
        e0 e0VarK = zVar.D().get(fVar.f185843b);
        if (e0VarK == null) {
            e0VarK = zVar.getF72031b();
        }
        g0 g0VarA = e0VarK.a();
        Iterator it = zVar.t(cVar, fVar).iterator();
        while (it.hasNext()) {
            e0 e0VarK2 = zVar.D().get((String) it.next());
            if (e0VarK2 == null) {
                e0VarK2 = zVar.getF72031b();
            }
            g0 g0VarA2 = e0VarK2.a();
            if ((-g0VarA.ordinal()) < (-g0VarA2.ordinal())) {
                g0VarA = g0VarA2;
            }
        }
        return g0VarA;
    }

    public static final Collection<g0> g(ok2.b bVar, g0 g0Var) {
        Object next;
        bVar.getClass();
        g0Var.getClass();
        Iterator<T> it = bVar.getConfiguration().f132625e.f132629a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((Set) next).contains(g0Var));
        Set set = (Set) next;
        return set != null ? set : a1.b(g0Var);
    }

    public static final boolean h(CoreTransferException coreTransferException) {
        try {
            Class<ok2.e> declaringClass = coreTransferException.getFailure().getDeclaringClass();
            declaringClass.getClass();
            return !declaringClass.getField(coreTransferException.getFailure().name()).isAnnotationPresent(ok2.x.class);
        } catch (Throwable unused) {
            return true;
        }
    }

    public static final boolean i(al2.c cVar, v vVar) {
        al2.b bVar = cVar.f3777c;
        if (bVar == al2.b.STARTED) {
            return true;
        }
        if (bVar != al2.b.REJECTED) {
            return false;
        }
        if (vVar != null) {
            w wVarA = vVar.a(cVar.f3775a.getF92741e());
            return (wVarA != null ? wVarA.c() : null) != null;
        }
        CoreTransferException coreTransferException = cVar.f3778d;
        return (coreTransferException != null ? coreTransferException.getFailure() : null) == ok2.e.f132641i;
    }

    public static final Object j(wk2.e eVar, e23.a aVar, long j8, d0 d0Var) {
        q qVar = new q(aVar, j8, ((long) 1000) * j8);
        f fVar = new f(eVar, null);
        s sVar = qVar.f56963e;
        if (sVar.isActive()) {
            t tVar = qVar.f56962d;
            c2 c2VarT = ge1.b.T((b0) tVar.getValue(), null, o53.d0.LAZY, new cz2.s(qVar, fVar, null), 1);
            while (true) {
                AtomicReference<l1> atomicReference = qVar.f56965g;
                if (atomicReference.compareAndSet(null, c2VarT)) {
                    c2VarT.start();
                    if (qVar.f56960b <= 0) {
                        break;
                    }
                    ge1.b.T((b0) tVar.getValue(), null, null, new cz2.r(qVar, null), 3);
                    break;
                }
                if (atomicReference.get() != null) {
                    vb.h.z("run() already started");
                    return null;
                }
            }
        }
        Object objC = sVar.C(d0Var);
        return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
    }

    public static final void k(Object obj, t13.d dVar) {
        dVar.getClass();
        if (!(dVar instanceof j)) {
            try {
                int i14 = o13.q.f128596b;
                dVar.resumeWith(obj);
            } catch (IllegalStateException unused) {
            }
        } else if (((j) dVar).isActive()) {
            int i15 = o13.q.f128596b;
            dVar.resumeWith(obj);
        }
    }

    public static final boolean l(z zVar, rs2.c cVar, wk2.f fVar) {
        zVar.getClass();
        cVar.getClass();
        fVar.getClass();
        boolean zH = true;
        try {
            if (!(zVar instanceof f0)) {
                if (zVar instanceof c0) {
                    zH = ((c0) zVar).h(cVar, fVar);
                }
                return zH;
            }
            zH = ((f0) zVar).m(cVar, fVar);
        } catch (Throwable unused) {
        }
        return zH;
    }

    public static final boolean m(rs2.c cVar) {
        cVar.getClass();
        return cVar.getConfigurationFlags().contains(90);
    }

    public static final wk2.f n(lk2.a aVar) {
        aVar.getClass();
        return new wk2.f(aVar.f113152a, aVar.f113153b, wk2.h.DEVICE_TO_PHONE, aVar.f113154c, aVar.f113155d, null, aVar.f113156e, 32, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:58:0x00ba  */
    public static final String o(String str) {
        String str2;
        str.getClass();
        switch (str) {
            case "FIT_TYPE_11":
                str2 = "GOALS";
                break;
            case "FIT_TYPE_20":
                str2 = "ACTIVITY_SUMMARY";
                break;
            case "FIT_TYPE_32":
                str2 = "MONITORING_B";
                break;
            case "FIT_TYPE_34":
                str2 = "SEGMENTS";
                break;
            case "FIT_TYPE_39":
                str2 = "TRUE_UP";
                break;
            case "FIT_TYPE_41":
                str2 = "SETTINGS_CHANGE";
                break;
            case "FIT_TYPE_44":
                str2 = "BIOMETRIC";
                break;
            case "FIT_TYPE_49":
                str2 = "SLEEP_DATA";
                break;
            case "FIT_TYPE_57":
                str2 = "SPORT_BACKUPS";
                break;
            case "FIT_TYPE_2":
                str2 = "SETTINGS";
                break;
            case "FIT_TYPE_4":
                str2 = "ACTIVITY";
                break;
            case "FIT_TYPE_5":
                str2 = "WORKOUTS";
                break;
            case "FIT_TYPE_6":
                str2 = "COURSES";
                break;
            case "FIT_TYPE_7":
                str2 = "SCHEDULES";
                break;
            default:
                str2 = null;
                break;
        }
        return str2 != null ? com.nimbusds.jose.shaded.gson.internal.a.h(str2, "(", u.v(str, "FIT_TYPE_", "", false), ")") : str;
    }

    public static final String p(rs2.c cVar) {
        cVar.getClass();
        return e5.g(cVar.getF92742f(), "/", cVar.getF92741e());
    }

    public static final g0 q(g0 g0Var, g0 g0Var2, boolean z14) {
        g0Var.getClass();
        return (g0Var2 == null || (-g0Var2.ordinal()) <= (-g0Var.ordinal()) || (g0Var.a() <= 19 && (!z14 || (-g0Var2.ordinal()) < (-g0.USER_INITIATED_PREFERRED.ordinal())))) ? g0Var : g0Var2;
    }

    public static final g0 r(ok2.b bVar, i iVar, rs2.c cVar, g0 g0Var) {
        g0 g0VarQ;
        bVar.getClass();
        iVar.getClass();
        cVar.getClass();
        if (iVar.getF205152b().a()) {
            String str = iVar.getF205152b().f185847f.get("AD_HOC_LATENCY_PROPERTY_KEY");
            mk2.a aVarValueOf = null;
            if (str != null) {
                try {
                    aVarValueOf = mk2.a.valueOf(str);
                } catch (Exception unused) {
                }
            }
            if (aVarValueOf == null || (g0VarQ = ok2.h0.a(aVarValueOf, g0Var)) == null) {
                g0VarQ = iVar.getF205155e();
            }
        } else {
            g0VarQ = q(e(bVar.getConfiguration().k(iVar.getDirection()), iVar.getF205152b(), cVar), g0Var, false);
        }
        return (-g0VarQ.ordinal()) > (-iVar.getF205155e().ordinal()) ? g0VarQ : iVar.getF205155e();
    }
}
