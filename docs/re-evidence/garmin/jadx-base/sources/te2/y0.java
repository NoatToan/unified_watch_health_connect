package te2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lsc2/j;", "<anonymous>", "(Lo53/b0;)Lsc2/j;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.GetOAuth1GCCredentials$attemptWithOtherAppCredential$2", f = "GetOAuth1GCCredentials.kt", l = {254, 268, 286}, m = "invokeSuspend")
public final class y0 extends v13.i implements e23.p<o53.b0, t13.d<? super sc2.j>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f164393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u0 f164394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f164395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f164396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u0 f164397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Map<String, dd2.a> f164398f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(u0 u0Var, Map<String, dd2.a> map, t13.d<? super y0> dVar) {
        super(2, dVar);
        this.f164397e = u0Var;
        this.f164398f = map;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y0(this.f164397e, this.f164398f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super sc2.j> dVar) {
        return ((y0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:37:0x0106  */
    /* JADX WARN: Code duplicated, block: B:45:0x013a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0178  */
    /* JADX WARN: Code duplicated, block: B:53:0x0180  */
    /* JADX WARN: Code duplicated, block: B:55:0x018a  */
    /* JADX WARN: Code duplicated, block: B:57:0x018e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0198  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:70:0x01df  */
    /* JADX WARN: Code duplicated, block: B:76:0x021f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:78:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e5, code lost:
    
        if (r5 == r1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x016f, code lost:
    
        if (r5 == r1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0217, code lost:
    
        if (r4 == r1) goto L72;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00e5 -> B:30:0x00e9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x016f -> B:48:0x0173). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0217 -> B:73:0x021a). Please report as a decompilation issue!!! */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        u0 u0Var;
        Iterator it;
        Object obj2;
        Iterator it3;
        u0 u0Var2;
        String str2;
        sc2.m mVar;
        Object obj3;
        Object objE0;
        sc2.l lVar;
        ve2.e eVar;
        Logger logger;
        Iterator it4;
        u0 u0Var3;
        String str3;
        sc2.o oVar;
        Object objE1;
        Object objE2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f164396d;
        Object obj4 = null;
        Map<String, dd2.a> map = this.f164398f;
        u0 u0Var4 = this.f164397e;
        if (i14 == 0) {
            o13.r.b(obj);
            dd2.b bVar = u0Var4.f164324j;
            if (bVar == null) {
                com.airbnb.lottie.animation.keyframe.a.A("attemptWithOtherAppCredential: 'thisAppGC1Consumer' is null for environment ", u0Var4.f164321g.name(), u0Var4.f164316c);
                return null;
            }
            String str4 = bVar.f59210a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, dd2.a> entry : map.entrySet()) {
                sc2.j jVar = entry.getValue().f59204a;
                if (jVar != null && sc2.j.b(jVar)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            str = str4;
            u0Var = u0Var4;
            it = linkedHashMap.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                String str5 = (String) entry2.getKey();
                sc2.j jVar2 = ((dd2.a) entry2.getValue()).f59204a;
                jVar2.getClass();
                String str6 = u0Var.f164324j.f59211b;
                this.f164393a = str;
                this.f164394b = u0Var;
                this.f164395c = it;
                this.f164396d = 1;
                x53.c cVar = o53.s0.f129406a;
                obj3 = obj4;
                objE0 = ge1.b.e0(x53.b.f189152a, new v0(u0Var, jVar2, str5, str, str6, null), this);
            } else {
                obj2 = obj4;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (r5.hasNext()) {
                    mVar = entry.getValue().f59206c;
                    if (mVar == null) {
                    }
                }
                it3 = linkedHashMap2.entrySet().iterator();
                u0Var2 = u0Var4;
                str2 = str;
                if (it3.hasNext()) {
                    Map.Entry entry3 = (Map.Entry) it3.next();
                    String str7 = (String) entry3.getKey();
                    sc2.m mVar2 = ((dd2.a) entry3.getValue()).f59206c;
                    mVar2.getClass();
                    String str8 = mVar2.f158528b;
                    this.f164393a = str2;
                    this.f164394b = u0Var2;
                    this.f164395c = it3;
                    this.f164396d = 2;
                    int i15 = u0.f164318q;
                    u0Var2.getClass();
                    x53.c cVar2 = o53.s0.f129406a;
                    objE1 = ge1.b.e0(x53.b.f189152a, new w0(u0Var2, str8, str2, str7, null), this);
                } else {
                    lVar = u0Var4.f164327m;
                    eVar = u0Var4.f164321g;
                    logger = u0Var4.f164316c;
                    if (lVar == null) {
                        com.airbnb.lottie.animation.keyframe.a.A("attemptWithOtherAppCredential: 'thisAppDI2Client' is null for environment ", eVar.name(), logger);
                        return obj2;
                    }
                    if (u0Var4.f164328n == null) {
                        com.airbnb.lottie.animation.keyframe.a.A("attemptWithOtherAppCredential: 'thisAppIT2Client' is null for environment ", eVar.name(), logger);
                        return obj2;
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    while (r4.hasNext()) {
                        oVar = entry.getValue().f59205b;
                        if (oVar == null) {
                        }
                    }
                    it4 = linkedHashMap3.entrySet().iterator();
                    u0Var3 = u0Var4;
                    str3 = str2;
                    if (it4.hasNext()) {
                        return obj2;
                    }
                    Map.Entry entry4 = (Map.Entry) it4.next();
                    String str9 = (String) entry4.getKey();
                    sc2.o oVar2 = ((dd2.a) entry4.getValue()).f59205b;
                    oVar2.getClass();
                    String str10 = oVar2.f158544a;
                    String str11 = u0Var3.f164328n.f158524a;
                    String str12 = u0Var3.f164329o;
                    sc2.l lVar2 = u0Var3.f164327m;
                    this.f164393a = str3;
                    this.f164394b = u0Var3;
                    this.f164395c = it4;
                    this.f164396d = 3;
                    x53.c cVar3 = o53.s0.f129406a;
                    objE2 = ge1.b.e0(x53.b.f189152a, new x0(u0Var3, str10, str11, str12, lVar2, str3, str9, null), this);
                }
            }
            return aVar;
        }
        if (i14 == 1) {
            it = this.f164395c;
            u0 u0Var5 = this.f164394b;
            String str13 = this.f164393a;
            o13.r.b(obj);
            obj3 = null;
            str = str13;
            objE0 = obj;
            u0Var = u0Var5;
            sc2.j jVar3 = (sc2.j) objE0;
            if (jVar3 != null) {
                return jVar3;
            }
            obj4 = obj3;
            if (it.hasNext()) {
                Map.Entry entry5 = (Map.Entry) it.next();
                String str14 = (String) entry5.getKey();
                sc2.j jVar4 = ((dd2.a) entry5.getValue()).f59204a;
                jVar4.getClass();
                String str15 = u0Var.f164324j.f59211b;
                this.f164393a = str;
                this.f164394b = u0Var;
                this.f164395c = it;
                this.f164396d = 1;
                x53.c cVar4 = o53.s0.f129406a;
                obj3 = obj4;
                objE0 = ge1.b.e0(x53.b.f189152a, new v0(u0Var, jVar4, str14, str, str15, null), this);
            } else {
                obj2 = obj4;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Map.Entry<String, dd2.a> entry6 : map.entrySet()) {
                    mVar = entry6.getValue().f59206c;
                    if (mVar == null && !d53.w.J(mVar.f158528b)) {
                        linkedHashMap4.put(entry6.getKey(), entry6.getValue());
                    }
                }
                it3 = linkedHashMap4.entrySet().iterator();
                u0Var2 = u0Var4;
                str2 = str;
                if (it3.hasNext()) {
                    Map.Entry entry7 = (Map.Entry) it3.next();
                    String str16 = (String) entry7.getKey();
                    sc2.m mVar3 = ((dd2.a) entry7.getValue()).f59206c;
                    mVar3.getClass();
                    String str17 = mVar3.f158528b;
                    this.f164393a = str2;
                    this.f164394b = u0Var2;
                    this.f164395c = it3;
                    this.f164396d = 2;
                    int i16 = u0.f164318q;
                    u0Var2.getClass();
                    x53.c cVar5 = o53.s0.f129406a;
                    objE1 = ge1.b.e0(x53.b.f189152a, new w0(u0Var2, str17, str2, str16, null), this);
                } else {
                    lVar = u0Var4.f164327m;
                    eVar = u0Var4.f164321g;
                    logger = u0Var4.f164316c;
                    if (lVar == null) {
                        com.airbnb.lottie.animation.keyframe.a.A("attemptWithOtherAppCredential: 'thisAppDI2Client' is null for environment ", eVar.name(), logger);
                        return obj2;
                    }
                    if (u0Var4.f164328n == null) {
                        com.airbnb.lottie.animation.keyframe.a.A("attemptWithOtherAppCredential: 'thisAppIT2Client' is null for environment ", eVar.name(), logger);
                        return obj2;
                    }
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                    while (r4.hasNext()) {
                        oVar = entry.getValue().f59205b;
                        if (oVar == null) {
                        }
                    }
                    it4 = linkedHashMap5.entrySet().iterator();
                    u0Var3 = u0Var4;
                    str3 = str2;
                    if (it4.hasNext()) {
                        return obj2;
                    }
                    Map.Entry entry8 = (Map.Entry) it4.next();
                    String str18 = (String) entry8.getKey();
                    sc2.o oVar3 = ((dd2.a) entry8.getValue()).f59205b;
                    oVar3.getClass();
                    String str19 = oVar3.f158544a;
                    String str110 = u0Var3.f164328n.f158524a;
                    String str111 = u0Var3.f164329o;
                    sc2.l lVar3 = u0Var3.f164327m;
                    this.f164393a = str3;
                    this.f164394b = u0Var3;
                    this.f164395c = it4;
                    this.f164396d = 3;
                    x53.c cVar6 = o53.s0.f129406a;
                    objE2 = ge1.b.e0(x53.b.f189152a, new x0(u0Var3, str19, str110, str111, lVar3, str3, str18, null), this);
                }
            }
            return aVar;
        }
        if (i14 == 2) {
            it3 = this.f164395c;
            u0 u0Var6 = this.f164394b;
            String str20 = this.f164393a;
            o13.r.b(obj);
            obj2 = null;
            u0Var2 = u0Var6;
            str2 = str20;
            objE1 = obj;
            sc2.j jVar5 = (sc2.j) objE1;
            if (jVar5 != null) {
                return jVar5;
            }
            if (it3.hasNext()) {
                Map.Entry entry9 = (Map.Entry) it3.next();
                String str112 = (String) entry9.getKey();
                sc2.m mVar4 = ((dd2.a) entry9.getValue()).f59206c;
                mVar4.getClass();
                String str113 = mVar4.f158528b;
                this.f164393a = str2;
                this.f164394b = u0Var2;
                this.f164395c = it3;
                this.f164396d = 2;
                int i17 = u0.f164318q;
                u0Var2.getClass();
                x53.c cVar7 = o53.s0.f129406a;
                objE1 = ge1.b.e0(x53.b.f189152a, new w0(u0Var2, str113, str2, str112, null), this);
            } else {
                lVar = u0Var4.f164327m;
                eVar = u0Var4.f164321g;
                logger = u0Var4.f164316c;
                if (lVar == null) {
                    com.airbnb.lottie.animation.keyframe.a.A("attemptWithOtherAppCredential: 'thisAppDI2Client' is null for environment ", eVar.name(), logger);
                    return obj2;
                }
                if (u0Var4.f164328n == null) {
                    com.airbnb.lottie.animation.keyframe.a.A("attemptWithOtherAppCredential: 'thisAppIT2Client' is null for environment ", eVar.name(), logger);
                    return obj2;
                }
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                for (Map.Entry<String, dd2.a> entry10 : map.entrySet()) {
                    oVar = entry10.getValue().f59205b;
                    if (oVar == null && !d53.w.J(oVar.f158544a)) {
                        linkedHashMap6.put(entry10.getKey(), entry10.getValue());
                    }
                }
                it4 = linkedHashMap6.entrySet().iterator();
                u0Var3 = u0Var4;
                str3 = str2;
                if (it4.hasNext()) {
                    return obj2;
                }
                Map.Entry entry11 = (Map.Entry) it4.next();
                String str114 = (String) entry11.getKey();
                sc2.o oVar4 = ((dd2.a) entry11.getValue()).f59205b;
                oVar4.getClass();
                String str115 = oVar4.f158544a;
                String str116 = u0Var3.f164328n.f158524a;
                String str117 = u0Var3.f164329o;
                sc2.l lVar4 = u0Var3.f164327m;
                this.f164393a = str3;
                this.f164394b = u0Var3;
                this.f164395c = it4;
                this.f164396d = 3;
                x53.c cVar8 = o53.s0.f129406a;
                objE2 = ge1.b.e0(x53.b.f189152a, new x0(u0Var3, str115, str116, str117, lVar4, str3, str114, null), this);
            }
            return aVar;
        }
        if (i14 != 3) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        it4 = this.f164395c;
        u0 u0Var7 = this.f164394b;
        String str21 = this.f164393a;
        o13.r.b(obj);
        obj2 = null;
        str3 = str21;
        u0Var3 = u0Var7;
        objE2 = obj;
        sc2.j jVar6 = (sc2.j) objE2;
        if (jVar6 != null) {
            return jVar6;
        }
        if (it4.hasNext()) {
            return obj2;
        }
        Map.Entry entry12 = (Map.Entry) it4.next();
        String str118 = (String) entry12.getKey();
        sc2.o oVar5 = ((dd2.a) entry12.getValue()).f59205b;
        oVar5.getClass();
        String str119 = oVar5.f158544a;
        String str1110 = u0Var3.f164328n.f158524a;
        String str1111 = u0Var3.f164329o;
        sc2.l lVar5 = u0Var3.f164327m;
        this.f164393a = str3;
        this.f164394b = u0Var3;
        this.f164395c = it4;
        this.f164396d = 3;
        x53.c cVar9 = o53.s0.f129406a;
        objE2 = ge1.b.e0(x53.b.f189152a, new x0(u0Var3, str119, str1110, str1111, lVar5, str3, str118, null), this);
    }
}
