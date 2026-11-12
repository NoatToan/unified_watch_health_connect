package y80;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Laa0/d;", "<anonymous>", "(Lo53/b0;)Laa0/d;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.data.DeviceStorageRepository$getDeviceLottieTutorials$2", f = "DeviceStorageRepository.kt", l = {93, 107, 114}, m = "invokeSuspend", v = 2)
public final class i0 extends v13.i implements e23.p<o53.b0, t13.d<? super aa0.d>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f195147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f195148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f195149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f195150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public dr1.a f195151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f195152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f195153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zb0.u0 f195154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f195155i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b0 f195156j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f195157k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o90.a f195158l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k22.a f195159m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(zb0.u0 u0Var, String str, b0 b0Var, String str2, o90.a aVar, k22.a aVar2, t13.d<? super i0> dVar) {
        super(2, dVar);
        this.f195154h = u0Var;
        this.f195155i = str;
        this.f195156j = b0Var;
        this.f195157k = str2;
        this.f195158l = aVar;
        this.f195159m = aVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i0 i0Var = new i0(this.f195154h, this.f195155i, this.f195156j, this.f195157k, this.f195158l, this.f195159m, dVar);
        i0Var.f195153g = obj;
        return i0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super aa0.d> dVar) {
        return ((i0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0225  */
    /* JADX WARN: Code duplicated, block: B:67:0x0236  */
    /* JADX WARN: Code duplicated, block: B:70:0x025e  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws IOException {
        LinkedHashMap linkedHashMap;
        Object next;
        String str;
        Object objD;
        String str2;
        Map map;
        String str3;
        Object next2;
        String str4;
        Object objF;
        Map map2;
        String str5;
        dr1.a aVar;
        Object objA;
        String str6;
        o53.b0 b0Var = (o53.b0) this.f195153g;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f195152f;
        String str7 = this.f195155i;
        zb0.u0 u0Var = this.f195154h;
        b0 b0Var2 = this.f195156j;
        if (i14 != 0) {
            if (i14 == 1) {
                str = this.f195148b;
                Map map3 = this.f195147a;
                o13.r.b(obj);
                objD = obj;
                map = map3;
            } else {
                if (i14 == 2) {
                    String str8 = this.f195150d;
                    String str9 = this.f195149c;
                    Map map4 = this.f195147a;
                    o13.r.b(obj);
                    str3 = str9;
                    str4 = str8;
                    objF = obj;
                    map2 = map4;
                    aVar = (dr1.a) objF;
                    if (aVar == null) {
                        String strN = fb1.c.n("getDeviceLottieTutorials: Failed to download Lottie setup ", str4);
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.f(a2Var, "DeviceStorageRepository", strN);
                        return null;
                    }
                    String strN2 = fb1.c.n("getDeviceLottieTutorials -> Lottie animation SETUP file downloaded ", str4);
                    i2.a aVar4 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar4.getClass();
                    i2.a.b(a2Var2, "DeviceStorageRepository", strN2);
                    this.f195153g = null;
                    this.f195147a = null;
                    this.f195148b = null;
                    this.f195149c = str3;
                    this.f195150d = null;
                    this.f195151e = aVar;
                    this.f195152f = 3;
                    objA = b0.a(b0Var2, map2, u0Var, this.f195158l, this);
                    if (objA != aVar2) {
                        str6 = str3;
                    }
                    map = linkedHashMap;
                    return aVar2;
                }
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = this.f195151e;
                str6 = this.f195149c;
                o13.r.b(obj);
                objA = obj;
            }
            a0 a0Var = b0Var2.f195093d;
            return a0.a(str6, aVar, (Map) objA, this.f195159m, str7);
        }
        o13.r.b(obj);
        i2.a aVar5 = i2.f36769a;
        a2 a2Var3 = a2.GENERAL;
        aVar5.getClass();
        i2.a.b(a2Var3, "DeviceStorageRepository", "getDeviceLottieTutorials for " + u0Var + " device=[" + str7 + "] ");
        br1.a aVarB = b0Var2.b(u0Var, this.f195157k, str7);
        if (aVarB == null) {
            i2.a.f(a2Var3, "DeviceStorageRepository", "getDeviceLottieTutorials: No manifest found for " + u0Var);
            return null;
        }
        i2.a.b(a2Var3, "DeviceStorageRepository", "getDeviceLottieTutorials -> Manifest " + aVarB);
        cr1.a aVar6 = cr1.a.f55353b;
        int i15 = a0.f195083b;
        aVar6.getClass();
        String str10 = aVar6.f55356a;
        ArrayList<String> arrayList = aVarB.f19575b;
        ArrayList<String> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (d53.w.z((String) obj2, str10, false)) {
                arrayList2.add(obj2);
            }
        }
        int iA = p13.t0.a(p13.y.r(arrayList2, 10));
        if (iA < 16) {
            iA = 16;
        }
        linkedHashMap = new LinkedHashMap(iA);
        for (String str11 : arrayList2) {
            o13.p pVar = new o13.p(d53.w.e0(str11, str10), aVarB.f19574a.concat(str11));
            linkedHashMap.put(pVar.f128594a, pVar.f128595b);
        }
        i2.a aVar7 = i2.f36769a;
        a2 a2Var4 = a2.GENERAL;
        aVar7.getClass();
        i2.a.b(a2Var4, "DeviceStorageRepository", "getDeviceLottieTutorials -> Tutorials urlMap=[" + linkedHashMap + "]");
        Iterator it = linkedHashMap.keySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            str2 = (String) next;
            str2.getClass();
        } while (!d53.w.z(str2, "lottie.json", true));
        str = (String) next;
        if (str == null) {
            i2.a aVar8 = i2.f36769a;
            a2 a2Var5 = a2.GENERAL;
            aVar8.getClass();
            i2.a.f(a2Var5, "DeviceStorageRepository", "getDeviceLottieTutorials: No Lottie animation file found for " + u0Var);
            return null;
        }
        String strConcat = "getDeviceLottieTutorials -> Lottie animation file found ".concat(str);
        i2.a aVar9 = i2.f36769a;
        a2 a2Var6 = a2.GENERAL;
        aVar9.getClass();
        i2.a.b(a2Var6, "DeviceStorageRepository", strConcat);
        String str12 = (String) p13.u0.c(str, linkedHashMap);
        this.f195153g = b0Var;
        this.f195147a = linkedHashMap;
        this.f195148b = str;
        this.f195152f = 1;
        objD = b0Var2.d(str12, this);
        if (objD != aVar2) {
        }
        map = linkedHashMap;
        return aVar2;
        map = linkedHashMap;
        str3 = (String) objD;
        if (str3 == null) {
            String strN3 = fb1.c.n("getDeviceLottieTutorials: Failed to download Lottie asset ", str);
            i2.a aVar10 = i2.f36769a;
            a2 a2Var7 = a2.GENERAL;
            aVar10.getClass();
            i2.a.f(a2Var7, "DeviceStorageRepository", strN3);
            return null;
        }
        String strN4 = fb1.c.n("getDeviceLottieTutorials -> Lottie animation file downloaded ", str);
        i2.a aVar11 = i2.f36769a;
        a2 a2Var8 = a2.GENERAL;
        aVar11.getClass();
        i2.a.b(a2Var8, "DeviceStorageRepository", strN4);
        Iterator it3 = map.keySet().iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
            str5 = (String) next2;
            a0 a0Var2 = b0Var2.f195093d;
            int i16 = a0.f195083b;
            str5.getClass();
        } while (!d53.w.z(str5, "lottie_tutorials_setup.json", true));
        str4 = (String) next2;
        if (str4 == null) {
            i2.a aVar12 = i2.f36769a;
            a2 a2Var9 = a2.GENERAL;
            aVar12.getClass();
            i2.a.f(a2Var9, "DeviceStorageRepository", "getDeviceLottieTutorials: No Lottie setup file found for " + u0Var);
            return null;
        }
        String strConcat2 = "getDeviceLottieTutorials -> Lottie animation SETUP file found ".concat(str4);
        i2.a aVar13 = i2.f36769a;
        a2 a2Var10 = a2.GENERAL;
        aVar13.getClass();
        i2.a.b(a2Var10, "DeviceStorageRepository", strConcat2);
        String str13 = (String) p13.u0.c(str4, map);
        this.f195153g = b0Var;
        this.f195147a = map;
        this.f195148b = null;
        this.f195149c = str3;
        this.f195150d = str4;
        this.f195152f = 2;
        objF = b0Var2.f(str13, this);
        if (objF != aVar2) {
            map2 = map;
            aVar = (dr1.a) objF;
            if (aVar == null) {
                String strN5 = fb1.c.n("getDeviceLottieTutorials: Failed to download Lottie setup ", str4);
                i2.a aVar14 = i2.f36769a;
                a2 a2Var11 = a2.GENERAL;
                aVar14.getClass();
                i2.a.f(a2Var11, "DeviceStorageRepository", strN5);
                return null;
            }
            String strN6 = fb1.c.n("getDeviceLottieTutorials -> Lottie animation SETUP file downloaded ", str4);
            i2.a aVar15 = i2.f36769a;
            a2 a2Var12 = a2.GENERAL;
            aVar15.getClass();
            i2.a.b(a2Var12, "DeviceStorageRepository", strN6);
            this.f195153g = null;
            this.f195147a = null;
            this.f195148b = null;
            this.f195149c = str3;
            this.f195150d = null;
            this.f195151e = aVar;
            this.f195152f = 3;
            objA = b0.a(b0Var2, map2, u0Var, this.f195158l, this);
            if (objA != aVar2) {
                str6 = str3;
                a0 a0Var3 = b0Var2.f195093d;
                return a0.a(str6, aVar, (Map) objA, this.f195159m, str7);
            }
        }
        map = linkedHashMap;
        return aVar2;
    }
}
