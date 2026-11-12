package te2;

import android.content.Context;
import com.garmin.android.lib.networking.authentication.ratelimit.RateLimitException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lte2/j;", "Lte2/u;", "", "logTag", "", "isRefreshFlow", "Landroid/content/Context;", "appContext", "Ldd2/a;", "credentials", "Lve2/l;", "mobileAuthConfig", "Lve2/e;", "environment", "customerGUID", "skipUsingOtherAppsCredentials", "Lve2/k;", "mfaTokenData", "Lre2/b$c;", "mode", "Lve2/c;", "credentialUpdateDelegate", "<init>", "(Ljava/lang/String;ZLandroid/content/Context;Ldd2/a;Lve2/l;Lve2/e;Ljava/lang/String;ZLve2/k;Lre2/b$c;Lve2/c;)V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class j extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f164100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f164101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dd2.a f164102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ve2.l f164103h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ve2.e f164104i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f164105j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f164106k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ve2.k f164107l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, boolean z14, Context context, dd2.a aVar, ve2.l lVar, ve2.e eVar, String str2, boolean z15, ve2.k kVar, re2.b.c cVar, ve2.c cVar2) {
        super(str, cVar, context);
        str.getClass();
        context.getClass();
        aVar.getClass();
        lVar.getClass();
        eVar.getClass();
        str2.getClass();
        cVar.getClass();
        this.f164100e = z14;
        this.f164101f = context;
        this.f164102g = aVar;
        this.f164103h = lVar;
        this.f164104i = eVar;
        this.f164105j = str2;
        this.f164106k = z15;
        this.f164107l = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object d(j jVar, v13.c cVar) throws Exception {
        d dVar;
        jVar.getClass();
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f164001c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f164001c = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(jVar, cVar);
            }
        } else {
            dVar = new d(jVar, cVar);
        }
        Object objJ = dVar.f163999a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f164001c;
        try {
            if (i15 == 0) {
                o13.r.b(objJ);
                sc2.m mVar = jVar.f164102g.f59206c;
                dVar.f164001c = 1;
                objJ = jVar.j(mVar, dVar);
                if (objJ == obj) {
                    return obj;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objJ);
            }
            return (sc2.m) objJ;
        } catch (Exception e4) {
            if ((e4 instanceof RateLimitException) || (e4 instanceof UnknownHostException)) {
                throw e4;
            }
            jVar.f164316c.error("callGetOrRefresh", (Throwable) e4);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:39|108|40|(1:128)(1:43)) */
    /* JADX WARN: Code duplicated, block: B:100:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:111:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x009f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:65:0x010f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0123  */
    /* JADX WARN: Code duplicated, block: B:78:0x0134  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code duplicated, block: B:81:0x0147  */
    /* JADX WARN: Code duplicated, block: B:87:0x0172  */
    /* JADX WARN: Code duplicated, block: B:90:0x0192  */
    /* JADX WARN: Code restructure failed: missing block: B:125:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ba, code lost:
    
        if (r11 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c1, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c2, code lost:
    
        r2 = r11;
        r11 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0127, code lost:
    
        if (r11 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0195, code lost:
    
        if (r11 != null) goto L46;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00b5 -> B:44:0x00b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00cb -> B:47:0x00bf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0121 -> B:69:0x0125). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0190 -> B:91:0x0193). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(j jVar, HashMap map, v13.c cVar) throws Exception {
        e eVar;
        Map map2;
        Iterator it;
        Map map3;
        LinkedHashMap linkedHashMap;
        Iterator it3;
        Map map4;
        Object objG;
        sc2.m mVar;
        LinkedHashMap linkedHashMap2;
        Iterator it4;
        jVar.getClass();
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f164014e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f164014e = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(jVar, cVar);
            }
        } else {
            eVar = new e(jVar, cVar);
        }
        Object objI = eVar.f164012c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f164014e;
        if (i15 == 0) {
            o13.r.b(objI);
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (((dd2.a) entry.getValue()).f59206c != null) {
                    linkedHashMap3.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it5 = linkedHashMap3.values().iterator();
            map2 = map;
            it = it5;
            if (it.hasNext()) {
                sc2.m mVar2 = ((dd2.a) it.next()).f59206c;
                eVar.f164010a = map2;
                eVar.f164011b = it;
                eVar.f164014e = 1;
                objG = jVar.g(mVar2, eVar);
                if (objG == obj) {
                    return obj;
                }
                map3 = map2;
                objI = objG;
                mVar = (sc2.m) objI;
            } else {
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry2 : map2.entrySet()) {
                    if (((dd2.a) entry2.getValue()).f59205b != null) {
                        linkedHashMap.put(entry2.getKey(), entry2.getValue());
                    }
                }
                it3 = linkedHashMap.values().iterator();
                map4 = map2;
            }
            if (it3.hasNext()) {
                sc2.o oVar = ((dd2.a) it3.next()).f59205b;
                eVar.f164010a = map4;
                eVar.f164011b = it3;
                eVar.f164014e = 2;
                objI = jVar.i(oVar, eVar);
                if (objI == obj) {
                    return obj;
                }
                mVar = (sc2.m) objI;
            } else {
                linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry3 : map4.entrySet()) {
                    if (((dd2.a) entry3.getValue()).f59204a != null) {
                        linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                    }
                }
                it4 = linkedHashMap2.entrySet().iterator();
            }
            if (it4.hasNext()) {
                return null;
            }
            Map.Entry entry4 = (Map.Entry) it4.next();
            sc2.j jVar2 = ((dd2.a) entry4.getValue()).f59204a;
            String str = (String) entry4.getKey();
            eVar.f164010a = it4;
            eVar.f164011b = null;
            eVar.f164014e = 3;
            objI = jVar.h(jVar2, str, eVar);
            if (objI == obj) {
                return obj;
            }
        } else if (i15 == 1) {
            it = eVar.f164011b;
            map3 = (Map) eVar.f164010a;
            try {
                o13.r.b(objI);
            } catch (Exception e4) {
                e = e4;
                if (!(e instanceof RateLimitException) || (e instanceof UnknownHostException)) {
                    throw e;
                }
                map2 = map3;
                if (it.hasNext()) {
                    sc2.m mVar3 = ((dd2.a) it.next()).f59206c;
                    eVar.f164010a = map2;
                    eVar.f164011b = it;
                    eVar.f164014e = 1;
                    objG = jVar.g(mVar3, eVar);
                    if (objG == obj) {
                        return obj;
                    }
                    map3 = map2;
                    objI = objG;
                } else {
                    linkedHashMap = new LinkedHashMap();
                    while (r2.hasNext()) {
                        if (((dd2.a) entry2.getValue()).f59205b != null) {
                            linkedHashMap.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    it3 = linkedHashMap.values().iterator();
                    map4 = map2;
                }
                if (it3.hasNext()) {
                    sc2.o oVar2 = ((dd2.a) it3.next()).f59205b;
                    eVar.f164010a = map4;
                    eVar.f164011b = it3;
                    eVar.f164014e = 2;
                    objI = jVar.i(oVar2, eVar);
                    if (objI == obj) {
                        return obj;
                    }
                    mVar = (sc2.m) objI;
                } else {
                    linkedHashMap2 = new LinkedHashMap();
                    while (r11.hasNext()) {
                        if (((dd2.a) entry3.getValue()).f59204a != null) {
                            linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                        }
                    }
                    it4 = linkedHashMap2.entrySet().iterator();
                }
                if (it4.hasNext()) {
                    return null;
                }
                Map.Entry entry5 = (Map.Entry) it4.next();
                sc2.j jVar3 = ((dd2.a) entry5.getValue()).f59204a;
                String str2 = (String) entry5.getKey();
                eVar.f164010a = it4;
                eVar.f164011b = null;
                eVar.f164014e = 3;
                objI = jVar.h(jVar3, str2, eVar);
                if (objI == obj) {
                    return obj;
                }
                mVar = (sc2.m) objI;
            }
            mVar = (sc2.m) objI;
        } else if (i15 == 2) {
            it3 = eVar.f164011b;
            map4 = (Map) eVar.f164010a;
            try {
                o13.r.b(objI);
            } catch (Exception e14) {
                if ((e14 instanceof RateLimitException) || (e14 instanceof UnknownHostException)) {
                    throw e14;
                }
                if (it3.hasNext()) {
                    sc2.o oVar3 = ((dd2.a) it3.next()).f59205b;
                    eVar.f164010a = map4;
                    eVar.f164011b = it3;
                    eVar.f164014e = 2;
                    objI = jVar.i(oVar3, eVar);
                    if (objI == obj) {
                        return obj;
                    }
                } else {
                    linkedHashMap2 = new LinkedHashMap();
                    while (r11.hasNext()) {
                        if (((dd2.a) entry3.getValue()).f59204a != null) {
                            linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                        }
                    }
                    it4 = linkedHashMap2.entrySet().iterator();
                }
                if (it4.hasNext()) {
                    return null;
                }
                Map.Entry entry6 = (Map.Entry) it4.next();
                sc2.j jVar4 = ((dd2.a) entry6.getValue()).f59204a;
                String str3 = (String) entry6.getKey();
                eVar.f164010a = it4;
                eVar.f164011b = null;
                eVar.f164014e = 3;
                objI = jVar.h(jVar4, str3, eVar);
                if (objI == obj) {
                    return obj;
                }
                mVar = (sc2.m) objI;
            }
            mVar = (sc2.m) objI;
        } else {
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it4 = (Iterator) eVar.f164010a;
            try {
                o13.r.b(objI);
            } catch (Exception e15) {
                if ((e15 instanceof RateLimitException) || (e15 instanceof UnknownHostException)) {
                    throw e15;
                }
                if (it4.hasNext()) {
                    return null;
                }
                Map.Entry entry7 = (Map.Entry) it4.next();
                sc2.j jVar5 = ((dd2.a) entry7.getValue()).f59204a;
                String str4 = (String) entry7.getKey();
                eVar.f164010a = it4;
                eVar.f164011b = null;
                eVar.f164014e = 3;
                objI = jVar.h(jVar5, str4, eVar);
                if (objI == obj) {
                    return obj;
                }
            }
        }
        mVar = (sc2.m) objI;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x014d A[Catch: Exception -> 0x0041, TRY_ENTER, TryCatch #5 {Exception -> 0x0041, blocks: (B:14:0x003c, B:71:0x014d, B:73:0x0153), top: B:87:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0153 A[Catch: Exception -> 0x0041, TRY_LEAVE, TryCatch #5 {Exception -> 0x0041, blocks: (B:14:0x003c, B:71:0x014d, B:73:0x0153), top: B:87:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [te2.j, te2.u] */
    /* JADX WARN: Type inference failed for: r1v1, types: [te2.u] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v5, types: [sc2.o] */
    public static final Object f(j jVar, sc2.j jVar2, sc2.o oVar, v13.c cVar) throws Throwable {
        f fVar;
        Object obj;
        sc2.m mVar;
        Object obj2;
        ?? r14;
        sc2.m mVar2;
        sc2.m mVar3;
        j2 j2VarB;
        Object objW;
        Object obj3;
        sc2.o oVar2;
        Object obj4;
        ?? r15 = jVar;
        ve2.e eVar = r15.f164104i;
        ve2.l lVar = r15.f164103h;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f164022d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f164022d = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(r15, cVar);
            }
        } else {
            fVar = new f(r15, cVar);
        }
        Object obj5 = fVar.f164020b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f164022d;
        sc2.m mVar4 = null;
        try {
            try {
                if (i15 == 0) {
                    o13.r.b(obj5);
                    if (jVar2 == null) {
                        obj = oVar;
                        mVar = null;
                        r14 = obj;
                        if (mVar == null) {
                        }
                        mVar2 = mVar;
                        if (mVar2 != null) {
                            j2VarB = r15.b();
                            if (j2VarB != null) {
                                Context context = r15.f164101f;
                                fVar.f164019a = mVar2;
                                fVar.f164022d = 3;
                                objW = j2VarB.w(context, mVar2, fVar);
                                if (objW == aVar) {
                                    r15 = r15;
                                    r15 = objW;
                                    return aVar;
                                }
                            }
                        }
                        return mVar4;
                    }
                    try {
                        dd2.b bVarA = lVar.a(eVar);
                        if (bVarA == null) {
                            throw new IllegalStateException("this app GC1 consumer is null for environment " + eVar.name());
                        }
                        Context context2 = r15.f164101f;
                        ve2.e eVar2 = r15.f164104i;
                        dd2.c cVar2 = new dd2.c(jVar2.f158514a, jVar2.f158515b, bVarA.f59210a, bVarA.f59211b);
                        ve2.k kVar = r15.f164107l;
                        qc2.j jVar3 = new qc2.j(context2, eVar2, cVar2, kVar != null ? kVar.f177753a : null, lVar.f177765f);
                        sc2.o oVar3 = oVar;
                        fVar.f164019a = oVar3;
                        fVar.f164022d = 1;
                        x53.c cVar3 = o53.s0.f129406a;
                        Object objE0 = ge1.b.e0(x53.b.f189152a, new qc2.i(jVar3, null), fVar);
                        obj4 = objE0;
                        oVar2 = oVar3;
                        if (objE0 == aVar) {
                            return aVar;
                        }
                        mVar = ((sc2.n) wc2.b.a((wc2.a) obj4)).f158542b;
                        r14 = oVar2;
                    } catch (Exception e4) {
                        e = e4;
                        obj2 = oVar;
                        r15.c("exchangeWithThisAppCredential(GC1)", e);
                        obj = obj2;
                        mVar = null;
                        r14 = obj;
                    }
                    if (mVar == null) {
                    }
                    mVar2 = mVar;
                    if (mVar2 != null) {
                        j2VarB = r15.b();
                        if (j2VarB != null) {
                            Context context3 = r15.f164101f;
                            fVar.f164019a = mVar2;
                            fVar.f164022d = 3;
                            objW = j2VarB.w(context3, mVar2, fVar);
                            if (objW == aVar) {
                                r15 = r15;
                                r15 = objW;
                                return aVar;
                            }
                        }
                    }
                    return mVar4;
                }
                if (i15 == 1) {
                    sc2.o oVar4 = (sc2.o) fVar.f164019a;
                    try {
                        o13.r.b(obj5);
                        obj4 = obj5;
                        oVar2 = oVar4;
                        mVar = ((sc2.n) wc2.b.a((wc2.a) obj4)).f158542b;
                        r14 = oVar2;
                    } catch (Exception e14) {
                        e = e14;
                        obj2 = oVar4;
                        r15.c("exchangeWithThisAppCredential(GC1)", e);
                        obj = obj2;
                        mVar = null;
                        r14 = obj;
                    }
                    if (mVar == null || r14 == 0) {
                        mVar2 = mVar;
                    } else {
                        try {
                            sc2.l lVarB = lVar.b(eVar);
                            if (lVarB == null) {
                                throw new IllegalStateException("this app DI2 client is null for environment " + eVar.name());
                            }
                            pc2.n nVar = new pc2.n(r15.f164101f, r15.f164104i, r14.f158544a, lVarB, lVar.f177765f, false);
                            fVar.f164019a = mVar;
                            fVar.f164022d = 2;
                            x53.c cVar4 = o53.s0.f129406a;
                            Object objE1 = ge1.b.e0(x53.b.f189152a, new pc2.m(nVar, null), fVar);
                            if (objE1 == aVar) {
                                return aVar;
                            }
                            mVar3 = mVar;
                            obj3 = objE1;
                            mVar2 = ((sc2.n) wc2.b.a((wc2.a) obj3)).f158542b;
                        } catch (Exception e15) {
                            e = e15;
                            mVar3 = mVar;
                            r15.c("exchangeWithThisAppCredential(IT2)", e);
                            mVar2 = mVar3;
                        }
                    }
                    if (mVar2 != null) {
                        j2VarB = r15.b();
                        if (j2VarB != null) {
                            Context context4 = r15.f164101f;
                            fVar.f164019a = mVar2;
                            fVar.f164022d = 3;
                            objW = j2VarB.w(context4, mVar2, fVar);
                            if (objW == aVar) {
                                r15 = r15;
                                r15 = objW;
                                return aVar;
                            }
                        }
                    }
                    return mVar4;
                }
                if (i15 == 2) {
                    mVar3 = (sc2.m) fVar.f164019a;
                    try {
                        o13.r.b(obj5);
                        obj3 = obj5;
                        mVar2 = ((sc2.n) wc2.b.a((wc2.a) obj3)).f158542b;
                    } catch (Exception e16) {
                        e = e16;
                        r15.c("exchangeWithThisAppCredential(IT2)", e);
                        mVar2 = mVar3;
                    }
                    if (mVar2 != null) {
                        j2VarB = r15.b();
                        if (j2VarB != null) {
                            Context context5 = r15.f164101f;
                            fVar.f164019a = mVar2;
                            fVar.f164022d = 3;
                            objW = j2VarB.w(context5, mVar2, fVar);
                            if (objW == aVar) {
                                r15 = r15;
                                r15 = objW;
                                return aVar;
                            }
                        }
                    }
                    return mVar4;
                }
                if (i15 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mVar2 = (sc2.m) fVar.f164019a;
                o13.r.b(obj5);
                r15 = r15;
            } catch (Exception e17) {
                e = e17;
                obj2 = obj5;
            }
            r15 = r15;
            r15 = objW;
            r15 = r15;
            mVar4 = mVar2;
        } catch (Exception e18) {
            r15.f164316c.error("exchangeWithThisAppCredential: update system account", (Throwable) e18);
        }
        return mVar4;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00cc A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:14:0x0042, B:21:0x0059, B:43:0x00cc, B:22:0x005e, B:36:0x00a6, B:38:0x00b8, B:27:0x0069, B:29:0x006f, B:31:0x007e, B:33:0x0085, B:47:0x00e0, B:48:0x00f5), top: B:57:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final Object g(sc2.m mVar, v13.c cVar) throws Throwable {
        a aVar;
        sc2.m mVar2;
        ve2.k kVar;
        j2 j2VarB;
        j2 j2Var;
        ve2.e eVar = this.f164104i;
        ve2.l lVar = this.f164103h;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i14 = aVar.f163949g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f163949g = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objE0 = aVar.f163947e;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f163949g;
        Context context = this.f164101f;
        Logger logger = this.f164316c;
        try {
            if (i15 == 0) {
                o13.r.b(objE0);
                if (mVar != null) {
                    sc2.l lVarB = lVar.b(eVar);
                    if (lVarB == null) {
                        throw new IllegalStateException("thisAppDI2Client is null for environment " + eVar.name());
                    }
                    logger.debug("attemptDI2ForDI2");
                    Context context2 = this.f164101f;
                    ve2.e eVar2 = this.f164104i;
                    String str = mVar.f158528b;
                    ve2.k kVar2 = this.f164107l;
                    pc2.d dVar = new pc2.d(context2, eVar2, str, lVarB, kVar2 != null ? kVar2.f177753a : null, lVar.f177765f);
                    aVar.f163949g = 1;
                    x53.c cVar2 = o53.s0.f129406a;
                    objE0 = ge1.b.e0(x53.b.f189152a, new pc2.c(dVar, null), aVar);
                    if (objE0 == aVar2) {
                    }
                    return aVar2;
                }
                return null;
            }
            if (i15 == 1) {
                o13.r.b(objE0);
            } else {
                if (i15 != 2) {
                    if (i15 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sc2.m mVar3 = aVar.f163943a;
                    o13.r.b(objE0);
                    return mVar3;
                }
                j2VarB = aVar.f163946d;
                j2Var = aVar.f163945c;
                kVar = (ve2.k) aVar.f163944b;
                mVar2 = aVar.f163943a;
                o13.r.b(objE0);
            }
            if (kVar != null) {
                aVar.f163943a = mVar2;
                aVar.f163944b = j2Var;
                aVar.f163945c = null;
                aVar.f163946d = null;
                aVar.f163949g = 3;
                j2 j2Var2 = j2.f164115a;
                if (j2VarB.z(context, kVar, true, aVar) == aVar2) {
                    return aVar2;
                }
            }
            return mVar2;
            sc2.n nVar = (sc2.n) wc2.b.a((wc2.a) objE0);
            mVar2 = nVar.f158542b;
            kVar = nVar.f158541a;
            j2VarB = b();
            if (j2VarB != null) {
                aVar.f163943a = mVar2;
                aVar.f163944b = kVar;
                aVar.f163945c = j2VarB;
                aVar.f163946d = j2VarB;
                aVar.f163949g = 2;
                if (j2VarB.w(context, mVar2, aVar) != aVar2) {
                    j2Var = j2VarB;
                    if (kVar != null) {
                        aVar.f163943a = mVar2;
                        aVar.f163944b = j2Var;
                        aVar.f163945c = null;
                        aVar.f163946d = null;
                        aVar.f163949g = 3;
                        j2 j2Var3 = j2.f164115a;
                        if (j2VarB.z(context, kVar, true, aVar) == aVar2) {
                        }
                    }
                }
                return aVar2;
            }
            return mVar2;
        } catch (Throwable th3) {
            if (th3 instanceof IllegalStateException) {
                String message = th3.getMessage();
                if (message == null) {
                    message = "";
                }
                logger.error("attemptDI2ForDI2: {}", message);
            } else {
                c("attemptDI2ForDI2", th3);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        if (r0.w(r3, r4, r6) == r7) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(sc2.j jVar, String str, v13.c cVar) {
        b bVar;
        sc2.n nVar;
        ve2.l lVar = this.f164103h;
        ve2.e eVar = this.f164104i;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f163968d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f163968d = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objE0 = bVar.f163966b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f163968d;
        Logger logger = this.f164316c;
        try {
            if (i15 != 0) {
                if (i15 == 1) {
                    o13.r.b(objE0);
                } else {
                    if (i15 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nVar = bVar.f163965a;
                    o13.r.b(objE0);
                }
                return nVar.f158542b;
            }
            o13.r.b(objE0);
            if (jVar != null) {
                dd2.b bVarA = lVar.a(eVar);
                if (bVarA == null) {
                    throw new IllegalStateException("GC1 consumer key is null for environment " + eVar.name());
                }
                String str2 = bVarA.f59210a;
                dd2.b bVarA2 = lVar.a(eVar);
                if (bVarA2 == null) {
                    throw new IllegalStateException("GC1 consumer secret is null for environment " + eVar.name());
                }
                String str3 = bVarA2.f59211b;
                logger.debug("attemptGC1OtherAppForDI2");
                qc2.h hVar = new qc2.h(this.f164101f, this.f164104i, str, jVar, str2, str3, lVar.f177765f, this.f164107l);
                bVar.f163968d = 1;
                x53.c cVar2 = o53.s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new qc2.g(hVar, null), bVar);
                if (objE0 == aVar) {
                }
                return aVar;
            }
            return null;
            nVar = (sc2.n) objE0;
            j2 j2VarB = b();
            if (j2VarB != null) {
                Context context = this.f164101f;
                sc2.m mVar = nVar.f158542b;
                bVar.f163965a = nVar;
                bVar.f163968d = 2;
            }
            return nVar.f158542b;
        } catch (Throwable th3) {
            if ((th3 instanceof RateLimitException) || (th3 instanceof UnknownHostException)) {
                String message = th3.getMessage();
                logger.warn("attemptGC1OtherAppForDI2: {}", message != null ? message : "");
                throw th3;
            }
            if (th3 instanceof IllegalStateException) {
                String message2 = th3.getMessage();
                logger.error("attemptGC1OtherAppForDI2: {}", message2 != null ? message2 : "");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final Object i(sc2.o oVar, v13.c cVar) {
        c cVar2;
        String str;
        ve2.e eVar = this.f164104i;
        ve2.l lVar = this.f164103h;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f163982d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f163982d = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objE0 = cVar2.f163980b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f163982d;
        Logger logger = this.f164316c;
        try {
            if (i15 == 0) {
                o13.r.b(objE0);
                if (oVar != null) {
                    sc2.l lVarC = lVar.c(eVar);
                    if (lVarC == null || (str = lVarC.f158524a) == null) {
                        throw new IllegalStateException("thisAppIT2ClientId is null for environment " + eVar + ".name");
                    }
                    sc2.l lVarB = lVar.b(eVar);
                    if (lVarB == null) {
                        throw new IllegalStateException("thisAppDI2Client is null for environment " + eVar + ".name");
                    }
                    logger.debug("attemptIT2OtherAppForDI2");
                    pc2.l lVar2 = new pc2.l(this.f164101f, this.f164104i, oVar.f158544a, str, lVar.d(), lVarB, lVar.f177765f, false);
                    cVar2.f163982d = 1;
                    x53.c cVar3 = o53.s0.f129406a;
                    objE0 = ge1.b.e0(x53.b.f189152a, new pc2.k(lVar2, null), cVar2);
                    if (objE0 == aVar) {
                    }
                    return aVar;
                }
                return null;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sc2.m mVar = cVar2.f163979a;
                o13.r.b(objE0);
                return mVar;
            }
            o13.r.b(objE0);
            sc2.m mVar2 = (sc2.m) objE0;
            j2 j2VarB = b();
            if (j2VarB != null) {
                Context context = this.f164101f;
                cVar2.f163979a = mVar2;
                cVar2.f163982d = 2;
                if (j2VarB.w(context, mVar2, cVar2) == aVar) {
                    return aVar;
                }
            }
            return mVar2;
        } catch (Throwable th3) {
            if ((th3 instanceof RateLimitException) || (th3 instanceof UnknownHostException)) {
                String message = th3.getMessage();
                logger.warn("attemptIT2OtherAppForDI2: {}", message != null ? message : "");
                throw th3;
            }
            if (th3 instanceof IllegalStateException) {
                String message2 = th3.getMessage();
                logger.error("attemptIT2OtherAppForDI2: {}", message2 != null ? message2 : "");
            }
        }
    }

    public abstract Object j(sc2.m mVar, t13.d<? super sc2.m> dVar);
}
