package te2;

import android.content.Context;
import com.garmin.android.lib.networking.authentication.ratelimit.RateLimitException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lte2/s;", "Lte2/u;", "", "logTag", "", "isRefreshFlow", "Landroid/content/Context;", "appContext", "Lve2/d;", "account", "Lve2/l;", "mobileAuthConfig", "Lre2/b$c;", "mode", "Lve2/c;", "credentialUpdateDelegate", "<init>", "(Ljava/lang/String;ZLandroid/content/Context;Lve2/d;Lve2/l;Lre2/b$c;Lve2/c;)V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class s extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f164284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f164285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ve2.d f164286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ve2.l f164287h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String str, boolean z14, Context context, ve2.d dVar, ve2.l lVar, re2.b.c cVar, ve2.c cVar2) {
        super(str, cVar, context);
        str.getClass();
        context.getClass();
        dVar.getClass();
        lVar.getClass();
        cVar.getClass();
        this.f164284e = z14;
        this.f164285f = context;
        this.f164286g = dVar;
        this.f164287h = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object d(s sVar, v13.c cVar) throws Exception {
        n nVar;
        sVar.getClass();
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f164194c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f164194c = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(sVar, cVar);
            }
        } else {
            nVar = new n(sVar, cVar);
        }
        Object objJ = nVar.f164192a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f164194c;
        try {
            if (i15 == 0) {
                o13.r.b(objJ);
                dd2.a aVar = sVar.f164286g.f177695f;
                if (aVar == null) {
                    return null;
                }
                sc2.o oVar = aVar.f59205b;
                nVar.f164194c = 1;
                objJ = sVar.j(oVar, nVar);
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
            return (sc2.o) objJ;
        } catch (Exception e4) {
            if ((e4 instanceof RateLimitException) || (e4 instanceof UnknownHostException)) {
                throw e4;
            }
            sVar.f164316c.error("callGetOrRefresh", (Throwable) e4);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:45|115|46|(1:142)(2:49|50)) */
    /* JADX WARN: Code duplicated, block: B:103:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:126:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:71:0x012a  */
    /* JADX WARN: Code duplicated, block: B:74:0x013e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code duplicated, block: B:84:0x014f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0162  */
    /* JADX WARN: Code duplicated, block: B:92:0x0184  */
    /* JADX WARN: Code duplicated, block: B:95:0x0192  */
    /* JADX WARN: Code duplicated, block: B:99:0x01af  */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01c5, code lost:
    
        if (r13 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:?, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d5, code lost:
    
        if (r13 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00da, code lost:
    
        r13 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00dc, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00dd, code lost:
    
        r2 = r13;
        r13 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0142, code lost:
    
        if (r13 != null) goto L52;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x01c2 -> B:104:0x01c3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x01cf -> B:93:0x018c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00d0 -> B:50:0x00d3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00e6 -> B:53:0x00da). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x013c -> B:75:0x0140). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(s sVar, HashMap map, v13.c cVar) throws Exception {
        o oVar;
        Iterator it;
        Map map2;
        Iterator it3;
        Map map3;
        sc2.o oVar2;
        LinkedHashMap linkedHashMap;
        Iterator it4;
        Iterator it5;
        s sVar2;
        sc2.j jVar;
        sVar.getClass();
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f164211f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f164211f = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(sVar, cVar);
            }
        } else {
            oVar = new o(sVar, cVar);
        }
        Object objI = oVar.f164209d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar.f164211f;
        if (i15 == 0) {
            o13.r.b(objI);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (((dd2.a) entry.getValue()).f59206c != null) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it6 = linkedHashMap2.values().iterator();
            Map map4 = map;
            it = it6;
            if (it.hasNext()) {
                sc2.m mVar = ((dd2.a) it.next()).f59206c;
                oVar.f164206a = map4;
                oVar.f164207b = it;
                oVar.f164211f = 1;
                Object objG = sVar.g(mVar, oVar);
                if (objG == aVar) {
                    return aVar;
                }
                map2 = map4;
                objI = objG;
                oVar2 = (sc2.o) objI;
            } else {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry2 : map4.entrySet()) {
                    if (((dd2.a) entry2.getValue()).f59205b != null) {
                        linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                    }
                }
                it3 = linkedHashMap3.values().iterator();
                map3 = map4;
            }
            if (it3.hasNext()) {
                sc2.o oVar3 = ((dd2.a) it3.next()).f59205b;
                oVar.f164206a = map3;
                oVar.f164207b = it3;
                oVar.f164211f = 2;
                objI = sVar.i(oVar3, oVar);
                if (objI == aVar) {
                    return aVar;
                }
                oVar2 = (sc2.o) objI;
            } else {
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry3 : map3.entrySet()) {
                    if (((dd2.a) entry3.getValue()).f59204a != null) {
                        linkedHashMap.put(entry3.getKey(), entry3.getValue());
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    it4 = linkedHashMap.entrySet().iterator();
                    if (it4.hasNext()) {
                        jVar = ((dd2.a) ((Map.Entry) it4.next()).getValue()).f59204a;
                        oVar.f164206a = it4;
                        oVar.f164207b = jVar;
                        oVar.f164208c = sVar;
                        oVar.f164211f = 3;
                        objI = sVar.a(oVar);
                        if (objI == aVar) {
                            return aVar;
                        }
                        it5 = it4;
                        sVar2 = sVar;
                        oVar.f164206a = it5;
                        oVar.f164207b = null;
                        oVar.f164208c = null;
                        oVar.f164211f = 4;
                        objI = sVar2.h(jVar, (String) objI, oVar);
                        if (objI == aVar) {
                            return aVar;
                        }
                        it4 = it5;
                    }
                }
            }
            return null;
        }
        if (i15 == 1) {
            it = (Iterator) oVar.f164207b;
            map2 = (Map) oVar.f164206a;
            try {
                o13.r.b(objI);
            } catch (Exception e4) {
                e = e4;
                if (!(e instanceof RateLimitException)) {
                }
                throw e;
            }
            oVar2 = (sc2.o) objI;
        } else if (i15 == 2) {
            it3 = (Iterator) oVar.f164207b;
            map3 = (Map) oVar.f164206a;
            try {
                o13.r.b(objI);
            } catch (Exception e14) {
                if ((e14 instanceof RateLimitException) || (e14 instanceof UnknownHostException)) {
                    throw e14;
                }
                if (it3.hasNext()) {
                    sc2.o oVar4 = ((dd2.a) it3.next()).f59205b;
                    oVar.f164206a = map3;
                    oVar.f164207b = it3;
                    oVar.f164211f = 2;
                    objI = sVar.i(oVar4, oVar);
                    if (objI == aVar) {
                        return aVar;
                    }
                } else {
                    linkedHashMap = new LinkedHashMap();
                    while (r13.hasNext()) {
                        if (((dd2.a) entry3.getValue()).f59204a != null) {
                            linkedHashMap.put(entry3.getKey(), entry3.getValue());
                        }
                    }
                    if (!linkedHashMap.isEmpty()) {
                        it4 = linkedHashMap.entrySet().iterator();
                        if (it4.hasNext()) {
                            jVar = ((dd2.a) ((Map.Entry) it4.next()).getValue()).f59204a;
                            oVar.f164206a = it4;
                            oVar.f164207b = jVar;
                            oVar.f164208c = sVar;
                            oVar.f164211f = 3;
                            objI = sVar.a(oVar);
                            if (objI == aVar) {
                                return aVar;
                            }
                            it5 = it4;
                            sVar2 = sVar;
                            oVar.f164206a = it5;
                            oVar.f164207b = null;
                            oVar.f164208c = null;
                            oVar.f164211f = 4;
                            objI = sVar2.h(jVar, (String) objI, oVar);
                            if (objI == aVar) {
                                return aVar;
                            }
                            it4 = it5;
                            oVar2 = (sc2.o) objI;
                        }
                    }
                }
                return null;
            }
            oVar2 = (sc2.o) objI;
        } else if (i15 == 3) {
            sVar2 = oVar.f164208c;
            jVar = (sc2.j) oVar.f164207b;
            it5 = (Iterator) oVar.f164206a;
            try {
                o13.r.b(objI);
            } catch (Exception e15) {
                e = e15;
                it4 = it5;
                if (!(e instanceof RateLimitException)) {
                }
                throw e;
            }
            oVar.f164206a = it5;
            oVar.f164207b = null;
            oVar.f164208c = null;
            oVar.f164211f = 4;
            objI = sVar2.h(jVar, (String) objI, oVar);
            if (objI == aVar) {
                return aVar;
            }
            it4 = it5;
        } else {
            if (i15 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it4 = (Iterator) oVar.f164206a;
            try {
                o13.r.b(objI);
            } catch (Exception e16) {
                e = e16;
                if (!(e instanceof RateLimitException) || (e instanceof UnknownHostException)) {
                    throw e;
                }
                if (it4.hasNext()) {
                    jVar = ((dd2.a) ((Map.Entry) it4.next()).getValue()).f59204a;
                    oVar.f164206a = it4;
                    oVar.f164207b = jVar;
                    oVar.f164208c = sVar;
                    oVar.f164211f = 3;
                    objI = sVar.a(oVar);
                    if (objI == aVar) {
                        return aVar;
                    }
                    it5 = it4;
                    sVar2 = sVar;
                    oVar.f164206a = it5;
                    oVar.f164207b = null;
                    oVar.f164208c = null;
                    oVar.f164211f = 4;
                    objI = sVar2.h(jVar, (String) objI, oVar);
                    if (objI == aVar) {
                        return aVar;
                    }
                    it4 = it5;
                }
                return null;
            }
        }
        oVar2 = (sc2.o) objI;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x0147 A[Catch: Exception -> 0x0042, TRY_ENTER, TryCatch #4 {Exception -> 0x0042, blocks: (B:15:0x003d, B:64:0x0147, B:66:0x014d), top: B:73:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:66:0x014d A[Catch: Exception -> 0x0042, TRY_LEAVE, TryCatch #4 {Exception -> 0x0042, blocks: (B:15:0x003d, B:64:0x0147, B:66:0x014d), top: B:73:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [te2.s, te2.u] */
    /* JADX WARN: Type inference failed for: r1v1, types: [te2.u] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [sc2.m] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [sc2.m] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r9v8 */
    public static final Object f(s sVar, sc2.j jVar, sc2.m mVar, v13.c cVar) throws Throwable {
        p pVar;
        sc2.o oVar;
        ?? r14;
        ?? r15;
        j2 j2VarB;
        Object objY;
        ve2.e eVar;
        String str;
        String str2;
        String str3;
        Context context;
        ?? r16;
        ?? r17 = sVar;
        ve2.d dVar = r17.f164286g;
        Context context2 = r17.f164285f;
        ve2.l lVar = r17.f164287h;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f164228i;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f164228i = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(r17, cVar);
            }
        } else {
            pVar = new p(r17, cVar);
        }
        Object objE0 = pVar.f164226g;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar.f164228i;
        ?? r18 = 4;
        sc2.o oVar2 = null;
        try {
            try {
                try {
                    if (i15 != 0) {
                        if (i15 == 1) {
                            String str4 = pVar.f164225f;
                            str = pVar.f164224e;
                            String str5 = pVar.f164223d;
                            eVar = pVar.f164222c;
                            context = pVar.f164221b;
                            sc2.m mVar2 = (sc2.m) pVar.f164220a;
                            o13.r.b(objE0);
                            str3 = str4;
                            str2 = str5;
                            r18 = mVar2;
                        } else {
                            if (i15 == 2) {
                                r16 = (sc2.m) pVar.f164220a;
                                try {
                                    o13.r.b(objE0);
                                    r16 = r16;
                                    oVar = ((sc2.c) wc2.b.a((wc2.a) objE0)).f158488a;
                                    r15 = r16;
                                } catch (Exception e4) {
                                    e = e4;
                                    r18 = r16;
                                    r17.c("exchangeWithThisAppCredential(GC1)", e);
                                    r14 = r18;
                                    r15 = r14;
                                    oVar = null;
                                }
                                if (oVar != null && r15 != 0) {
                                    Context context3 = r17.f164285f;
                                    ve2.e eVar2 = dVar.f177690a;
                                    String str6 = r15.f158528b;
                                    sc2.l lVarC = lVar.c(eVar2);
                                    lVarC.getClass();
                                    rc2.a aVar2 = new rc2.a(context3, eVar2, str6, lVarC.f158524a, lVar.d());
                                    pVar.f164220a = null;
                                    pVar.f164221b = null;
                                    pVar.f164222c = null;
                                    pVar.f164223d = null;
                                    pVar.f164224e = null;
                                    pVar.f164225f = null;
                                    pVar.f164228i = 3;
                                    x53.c cVar2 = o53.s0.f129406a;
                                    objE0 = ge1.b.e0(x53.b.f189152a, new rc2.b(aVar2, null), pVar);
                                    if (objE0 == aVar) {
                                        return aVar;
                                    }
                                    oVar = ((sc2.c) wc2.b.a((wc2.a) objE0)).f158488a;
                                    if (oVar != null) {
                                        j2VarB = r17.b();
                                        if (j2VarB != null) {
                                            pVar.f164220a = oVar;
                                            pVar.f164221b = null;
                                            pVar.f164222c = null;
                                            pVar.f164223d = null;
                                            pVar.f164224e = null;
                                            pVar.f164225f = null;
                                            pVar.f164228i = 4;
                                            objY = j2VarB.y(context2, oVar, pVar);
                                            if (objY == aVar) {
                                                r17 = r17;
                                                r17 = objY;
                                                return aVar;
                                            }
                                        }
                                    }
                                } else if (oVar != null) {
                                    j2VarB = r17.b();
                                    if (j2VarB != null) {
                                        pVar.f164220a = oVar;
                                        pVar.f164221b = null;
                                        pVar.f164222c = null;
                                        pVar.f164223d = null;
                                        pVar.f164224e = null;
                                        pVar.f164225f = null;
                                        pVar.f164228i = 4;
                                        objY = j2VarB.y(context2, oVar, pVar);
                                        if (objY == aVar) {
                                            r17 = r17;
                                            r17 = objY;
                                            return aVar;
                                        }
                                    }
                                }
                                return oVar2;
                            }
                            if (i15 == 3) {
                                o13.r.b(objE0);
                                oVar = ((sc2.c) wc2.b.a((wc2.a) objE0)).f158488a;
                                if (oVar != null) {
                                    j2VarB = r17.b();
                                    if (j2VarB != null) {
                                        pVar.f164220a = oVar;
                                        pVar.f164221b = null;
                                        pVar.f164222c = null;
                                        pVar.f164223d = null;
                                        pVar.f164224e = null;
                                        pVar.f164225f = null;
                                        pVar.f164228i = 4;
                                        objY = j2VarB.y(context2, oVar, pVar);
                                        if (objY == aVar) {
                                            r17 = r17;
                                            r17 = objY;
                                            return aVar;
                                        }
                                    }
                                }
                                return oVar2;
                            }
                            if (i15 != 4) {
                                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oVar = (sc2.o) pVar.f164220a;
                            o13.r.b(objE0);
                            r17 = r17;
                        }
                        r17 = r17;
                        r17 = objY;
                        r17 = r17;
                        oVar2 = oVar;
                        return oVar2;
                    }
                    o13.r.b(objE0);
                    if (jVar == null) {
                        r14 = mVar;
                        r15 = r14;
                        oVar = null;
                        if (oVar != null) {
                        }
                        if (oVar != null) {
                            j2VarB = r17.b();
                            if (j2VarB != null) {
                                pVar.f164220a = oVar;
                                pVar.f164221b = null;
                                pVar.f164222c = null;
                                pVar.f164223d = null;
                                pVar.f164224e = null;
                                pVar.f164225f = null;
                                pVar.f164228i = 4;
                                objY = j2VarB.y(context2, oVar, pVar);
                                if (objY == aVar) {
                                    r17 = r17;
                                    r17 = objY;
                                    return aVar;
                                }
                            }
                            r17 = r17;
                            r17 = objY;
                            r17 = r17;
                            oVar2 = oVar;
                        }
                        return oVar2;
                    }
                    try {
                        eVar = dVar.f177690a;
                        String str7 = jVar.f158514a;
                        sc2.l lVarC2 = lVar.c(eVar);
                        lVarC2.getClass();
                        str = lVarC2.f158524a;
                        String strD = lVar.d();
                        sc2.m mVar3 = mVar;
                        pVar.f164220a = mVar3;
                        pVar.f164221b = context2;
                        pVar.f164222c = eVar;
                        pVar.f164223d = str7;
                        pVar.f164224e = str;
                        pVar.f164225f = strD;
                        pVar.f164228i = 1;
                        Object objA = r17.a(pVar);
                        if (objA == aVar) {
                            return aVar;
                        }
                        str2 = str7;
                        str3 = strD;
                        context = context2;
                        objE0 = objA;
                        r18 = mVar3;
                    } catch (Exception e14) {
                        e = e14;
                        r18 = mVar;
                        r17.c("exchangeWithThisAppCredential(GC1)", e);
                        r14 = r18;
                        r15 = r14;
                        oVar = null;
                    }
                    rc2.c cVar3 = new rc2.c(context, eVar, str2, str, str3, (String) objE0);
                    pVar.f164220a = r18;
                    pVar.f164221b = null;
                    pVar.f164222c = null;
                    pVar.f164223d = null;
                    pVar.f164224e = null;
                    pVar.f164225f = null;
                    pVar.f164228i = 2;
                    x53.c cVar4 = o53.s0.f129406a;
                    objE0 = ge1.b.e0(x53.b.f189152a, new rc2.d(cVar3, null), pVar);
                    if (objE0 == aVar) {
                        return aVar;
                    }
                    r16 = r18;
                    oVar = ((sc2.c) wc2.b.a((wc2.a) objE0)).f158488a;
                    r15 = r16;
                    if (oVar != null) {
                    }
                    if (oVar != null) {
                        j2VarB = r17.b();
                        if (j2VarB != null) {
                            pVar.f164220a = oVar;
                            pVar.f164221b = null;
                            pVar.f164222c = null;
                            pVar.f164223d = null;
                            pVar.f164224e = null;
                            pVar.f164225f = null;
                            pVar.f164228i = 4;
                            objY = j2VarB.y(context2, oVar, pVar);
                            if (objY == aVar) {
                                r17 = r17;
                                r17 = objY;
                                return aVar;
                            }
                        }
                        r17 = r17;
                        r17 = objY;
                        r17 = r17;
                        oVar2 = oVar;
                    }
                    return oVar2;
                } catch (Exception e15) {
                    r17.c("exchangeWithThisAppCredential(DI2)", e15);
                    oVar = null;
                }
            } catch (Exception e16) {
                e = e16;
            }
        } catch (Exception e17) {
            r17.f164316c.error("exchangeWithThisAppCredential: update system account", (Throwable) e17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object g(sc2.m mVar, v13.c cVar) throws Throwable {
        k kVar;
        ve2.l lVar = this.f164287h;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f164136d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f164136d = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objE0 = kVar.f164134b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f164136d;
        try {
            if (i15 == 0) {
                o13.r.b(objE0);
                if (mVar != null) {
                    this.f164316c.debug("attemptDI2ForIT2");
                    Context context = this.f164285f;
                    ve2.e eVar = this.f164286g.f177690a;
                    String str = mVar.f158528b;
                    sc2.l lVarC = lVar.c(eVar);
                    lVarC.getClass();
                    rc2.a aVar2 = new rc2.a(context, eVar, str, lVarC.f158524a, lVar.d());
                    kVar.f164136d = 1;
                    x53.c cVar2 = o53.s0.f129406a;
                    objE0 = ge1.b.e0(x53.b.f189152a, new rc2.b(aVar2, null), kVar);
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
                sc2.o oVar = kVar.f164133a;
                o13.r.b(objE0);
                return oVar;
            }
            o13.r.b(objE0);
            sc2.o oVar2 = ((sc2.c) wc2.b.a((wc2.a) objE0)).f158488a;
            j2 j2VarB = b();
            if (j2VarB != null) {
                Context context2 = this.f164285f;
                kVar.f164133a = oVar2;
                kVar.f164136d = 2;
                if (j2VarB.y(context2, oVar2, kVar) == aVar) {
                    return aVar;
                }
            }
            return oVar2;
        } catch (Throwable th3) {
            c("attemptDI2ForIT2", th3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object h(sc2.j jVar, String str, v13.c cVar) throws Throwable {
        l lVar;
        ve2.l lVar2 = this.f164287h;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f164157d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f164157d = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objE0 = lVar.f164155b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f164157d;
        try {
            if (i15 == 0) {
                o13.r.b(objE0);
                if (jVar != null) {
                    this.f164316c.debug("attemptGC1ForIT2");
                    Context context = this.f164285f;
                    ve2.e eVar = this.f164286g.f177690a;
                    String str2 = jVar.f158514a;
                    sc2.l lVarC = lVar2.c(eVar);
                    lVarC.getClass();
                    rc2.c cVar2 = new rc2.c(context, eVar, str2, lVarC.f158524a, lVar2.d(), str);
                    lVar.f164157d = 1;
                    x53.c cVar3 = o53.s0.f129406a;
                    objE0 = ge1.b.e0(x53.b.f189152a, new rc2.d(cVar2, null), lVar);
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
                sc2.o oVar = lVar.f164154a;
                o13.r.b(objE0);
                return oVar;
            }
            o13.r.b(objE0);
            sc2.o oVar2 = ((sc2.c) wc2.b.a((wc2.a) objE0)).f158488a;
            j2 j2VarB = b();
            if (j2VarB != null) {
                Context context2 = this.f164285f;
                lVar.f164154a = oVar2;
                lVar.f164157d = 2;
                if (j2VarB.y(context2, oVar2, lVar) == aVar) {
                    return aVar;
                }
            }
            return oVar2;
        } catch (Throwable th3) {
            c("attemptGC1ForIT2", th3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object i(sc2.o oVar, v13.c cVar) throws Throwable {
        m mVar;
        ve2.l lVar = this.f164287h;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f164171d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f164171d = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objH = mVar.f164169b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f164171d;
        try {
            if (i15 == 0) {
                o13.r.b(objH);
                if (oVar != null) {
                    this.f164316c.debug("attemptIT2ForIT2");
                    Context context = this.f164285f;
                    ve2.e eVar = this.f164286g.f177690a;
                    sc2.l lVarC = lVar.c(eVar);
                    lVarC.getClass();
                    rc2.e eVar2 = new rc2.e(context, eVar, lVarC.f158524a, oVar.f158544a, lVar.d());
                    mVar.f164171d = 1;
                    objH = eVar2.h(mVar);
                    if (objH == aVar) {
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
                sc2.o oVar2 = mVar.f164168a;
                o13.r.b(objH);
                return oVar2;
            }
            o13.r.b(objH);
            sc2.o oVar3 = ((sc2.c) wc2.b.a((wc2.a) objH)).f158488a;
            j2 j2VarB = b();
            if (j2VarB != null) {
                Context context2 = this.f164285f;
                mVar.f164168a = oVar3;
                mVar.f164171d = 2;
                if (j2VarB.y(context2, oVar3, mVar) == aVar) {
                    return aVar;
                }
            }
            return oVar3;
        } catch (Throwable th3) {
            c("attemptIT2ForIT2", th3);
        }
    }

    public abstract Object j(sc2.o oVar, t13.d<? super sc2.o> dVar);
}
