package com.garmin.android.apps.connectmobile;

import android.content.Context;
import android.content.res.Resources;
import com.garmin.android.apps.connectmobile.persistence.GCMUserPersistenceDatabase;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/i;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f36758a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final GCMUserPersistenceDatabase f36759b = (GCMUserPersistenceDatabase) KoinJavaComponent.get$default(GCMUserPersistenceDatabase.class, null, null, 6, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f36760c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Map<to.o, ? extends am.x0> f36761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f36762e;

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/garmin/android/apps/connectmobile/i$a", "Lcom/google/gson/reflect/TypeToken;", "", "Lto/o;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends TypeToken<List<? extends to.o>> {
    }

    static {
        p13.k0 k0Var = p13.k0.f134949a;
        k0Var.getClass();
        f36761d = k0Var;
        f36762e = gt2.c.b(a2.GENERAL.f28756a);
    }

    private i() {
    }

    public static to.o b(am.x0 x0Var) throws IOException {
        Object next;
        Iterator it = c().keySet().iterator();
        while (it.hasNext()) {
            next = it.next();
            f36758a.getClass();
            if (c().get((to.o) next) == x0Var) {
                return (to.o) next;
            }
        }
        next = null;
        return (to.o) next;
    }

    public static Map c() throws IOException {
        Map linkedHashMap;
        if (f36761d.isEmpty()) {
            Logger logger = f36762e;
            logger.debug("ActivityTypeManager - activity type map field is empty, refreshing");
            GarminConnectMobileApp.f28685g.getClass();
            Resources resources = GarminConnectMobileApp.a.a().getResources();
            resources.getClass();
            Collection collectionJ = j(resources);
            if (collectionJ == null) {
                collectionJ = p13.j0.f134944a;
            }
            if (collectionJ.isEmpty()) {
                linkedHashMap = p13.k0.f134949a;
                linkedHashMap.getClass();
            } else {
                linkedHashMap = new LinkedHashMap();
                ArrayList<to.o> arrayList = new ArrayList();
                for (Object obj : collectionJ) {
                    to.o oVar = (to.o) obj;
                    for (am.x0 x0Var : am.x0.values()) {
                        if (p005kotlin.jvm.internal.s.g(x0Var.f4358a, oVar.j())) {
                            arrayList.add(obj);
                            break;
                        }
                    }
                }
                for (to.o oVar2 : arrayList) {
                    linkedHashMap.put(oVar2, am.z0.l(am.x0.f4346x, oVar2.j()));
                }
            }
            m(linkedHashMap);
            logger.debug("ActivityTypeManager - activity type map updated with raw res types");
            ge1.b.T(o53.e1.f129333a, null, null, new h(null), 3);
        }
        return f36761d;
    }

    public static int d(String str) {
        Object next;
        str.getClass();
        Iterator it = c().keySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p005kotlin.jvm.internal.s.g(((to.o) next).j(), str));
        to.o oVar = (to.o) next;
        if (oVar != null) {
            return oVar.getTypeId();
        }
        return -1;
    }

    public static int e(am.x0 x0Var) throws IOException {
        x0Var.getClass();
        to.o oVarB = b(x0Var);
        if (oVarB != null) {
            return oVarB.getTypeId();
        }
        return -1;
    }

    public static am.x0 f(am.x0 x0Var, am.x0 x0Var2) throws IOException {
        Object next;
        am.x0 x0Var3;
        x0Var2.getClass();
        to.o oVarB = b(x0Var);
        if (oVarB != null) {
            Iterator it = c().keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer parentTypeId = oVarB.getParentTypeId();
                int typeId = ((to.o) next).getTypeId();
                if (parentTypeId != null && parentTypeId.intValue() == typeId) {
                    break;
                }
            }
            to.o oVar = (to.o) next;
            if (oVar != null && (x0Var3 = (am.x0) c().get(oVar)) != null) {
                return x0Var3;
            }
        }
        return x0Var2;
    }

    public static List g(am.x0 x0Var, Map map) throws IOException {
        x0Var.getClass();
        map.getClass();
        to.o oVarB = b(x0Var);
        if (oVarB == null) {
            return p13.j0.f134944a;
        }
        bv.b.f21239a.getClass();
        bv.b.a();
        boolean zW = k1.f37122a.w();
        Set setKeySet = map.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            to.o oVar = (to.o) obj;
            if (am.z0.G(oVar.j())) {
                Integer parentTypeId = oVar.getParentTypeId();
                int typeId = oVarB.getTypeId();
                if (parentTypeId != null && parentTypeId.intValue() == typeId && zW) {
                    arrayList.add(obj);
                }
            } else {
                Integer parentTypeId2 = oVar.getParentTypeId();
                int typeId2 = oVarB.getTypeId();
                if (parentTypeId2 != null && parentTypeId2.intValue() == typeId2 && !oVar.getIsHidden()) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            am.x0 x0Var2 = (am.x0) map.get((to.o) it.next());
            if (x0Var2 != null) {
                arrayList2.add(x0Var2);
            }
        }
        return arrayList2;
    }

    public static am.x0 h(int i14) {
        Object next;
        Iterator it = c().keySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((to.o) next).getTypeId() != i14);
        to.o oVar = (to.o) next;
        if (oVar != null) {
            return (am.x0) c().get(oVar);
        }
        return null;
    }

    public static void i() {
        List<to.o> listC = f36759b.e().c();
        if (!listC.isEmpty()) {
            m(l(listC));
            return;
        }
        GarminConnectMobileApp.f28685g.getClass();
        Resources resources = GarminConnectMobileApp.a.a().getResources();
        resources.getClass();
        List listJ = j(resources);
        if (listJ == null) {
            listJ = p13.j0.f134944a;
        }
        if (listJ.isEmpty()) {
            return;
        }
        m(l(listJ));
    }

    public static List j(Resources resources) throws IOException {
        InputStream inputStreamOpenRawResource = resources.openRawResource(R.raw.activity_types);
        inputStreamOpenRawResource.getClass();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, d53.c.f57666b), 8192);
        try {
            String strE = lg.d.E(bufferedReader);
            bufferedReader.close();
            return (List) GsonUtil.f47253b.fromJson(strE, new a().getType());
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                jg.b.l(bufferedReader, th3);
                throw th4;
            }
        }
    }

    public static LinkedHashMap l(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            to.o oVar = (to.o) obj;
            w13.c cVar = am.x0.H3;
            if (cVar == null || !cVar.isEmpty()) {
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                while (bVarN.hasNext()) {
                    if (p005kotlin.jvm.internal.s.g(((am.x0) bVarN.next()).f4358a, oVar.j())) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        int iA = p13.t0.a(p13.y.r(arrayList, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj2 : arrayList) {
            linkedHashMap.put(obj2, am.z0.l(am.x0.f4346x, ((to.o) obj2).j()));
        }
        return linkedHashMap;
    }

    public static void m(Map map) {
        synchronized (f36760c) {
            f36761d = map;
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(v13.c cVar) {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f35284c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f35284c = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objAwait = gVar.f35282a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f35284c;
        Logger logger = f36762e;
        try {
            if (i15 == 0) {
                o13.r.b(objAwait);
                o53.i0<List<to.o>> i0VarI = ((am.b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, am.b2.class, new c83.h.a[0], null, null, null, 120)).I();
                gVar.f35284c = 1;
                objAwait = i0VarI.await(gVar);
                if (objAwait == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objAwait);
            }
            List<to.o> list = (List) objAwait;
            if (list == null || list.isEmpty()) {
                logger.debug("ActivityTypeManager - Empty response from API");
                return new androidx.work.d.a.c();
            }
            logger.debug("ActivityTypeManager - Retrieved activity type list from API, size " + list.size());
            GCMUserPersistenceDatabase gCMUserPersistenceDatabase = f36759b;
            gCMUserPersistenceDatabase.e().b();
            gCMUserPersistenceDatabase.e().a(list);
            logger.debug("ActivityTypeManager - Refreshed DB cache for activity type list");
            return new androidx.work.d.a.c();
        } catch (HttpException e4) {
            logger.error("ActivityTypeManager - failed to get type list from API =[" + e4 + "].");
            return new androidx.work.d.a.C0165a();
        } catch (Throwable th3) {
            logger.error("ActivityTypeManager - error in building activity type cache =[" + th3 + "].");
            return new androidx.work.d.a.C0165a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(Context context, v13.c cVar) throws IOException {
        j jVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f36944d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f36944d = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object obj = jVar.f36942b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f36944d;
        GCMUserPersistenceDatabase gCMUserPersistenceDatabase = f36759b;
        Logger logger = f36762e;
        if (i15 == 0) {
            o13.r.b(obj);
            if (gCMUserPersistenceDatabase.e().c().isEmpty()) {
                logger.debug("ActivityTypeManager - Cached types empty, going to API");
                jVar.f36941a = context;
                jVar.f36944d = 1;
                if (a(jVar) == obj2) {
                    return obj2;
                }
            } else {
                logger.debug("ActivityTypeManager - Cached types valid, constructing mapping");
                i();
            }
            logger.debug("ActivityTypeManager - Enqueuing fetch job...");
            ue.f.a aVar = new ue.f.a();
            aVar.b(ue.v.UNMETERED);
            ue.f fVarA = aVar.a();
            ue.c0.a aVarF = new ue.c0.a((Class<? extends androidx.work.d>) ActivityTypeWorker.class, 1L, TimeUnit.DAYS).f(androidx.work.c.f11465c);
            aVarF.f170098c.f26950j = fVarA;
            ue.c0 c0VarA = aVarF.d(ue.a.LINEAR, 900000L, TimeUnit.MILLISECONDS).a();
            ue.i0.f170088a.getClass();
            ue.i0.a.a(context).f("ActivityTypeFetch", ue.k.KEEP, c0VarA);
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        context = jVar.f36941a;
        o13.r.b(obj);
        List<to.o> listC = gCMUserPersistenceDatabase.e().c();
        if (listC.isEmpty()) {
            logger.debug("ActivityTypeManager - No types retrieved, falling back to raw json");
            Resources resources = context.getResources();
            resources.getClass();
            List listJ = j(resources);
            if (listJ != null && (!listJ.isEmpty())) {
                m(l(listJ));
            }
        } else {
            logger.debug("ActivityTypeManager - Types have been retrieved and cached, constructing type mapping");
            m(l(listC));
        }
        logger.debug("ActivityTypeManager - Enqueuing fetch job...");
        ue.f.a aVar2 = new ue.f.a();
        aVar2.b(ue.v.UNMETERED);
        ue.f fVarA2 = aVar2.a();
        ue.c0.a aVarF2 = new ue.c0.a((Class<? extends androidx.work.d>) ActivityTypeWorker.class, 1L, TimeUnit.DAYS).f(androidx.work.c.f11465c);
        aVarF2.f170098c.f26950j = fVarA2;
        ue.c0 c0VarA2 = aVarF2.d(ue.a.LINEAR, 900000L, TimeUnit.MILLISECONDS).a();
        ue.i0.f170088a.getClass();
        ue.i0.a.a(context).f("ActivityTypeFetch", ue.k.KEEP, c0VarA2);
        return Unit.INSTANCE;
    }
}
