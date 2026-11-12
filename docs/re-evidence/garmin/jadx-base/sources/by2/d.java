package by2;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import b21.s4;
import com.garmin.subscriptions.retrofit.g;
import j23.l;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import o13.m;
import o13.r;
import o13.t;
import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import vb.h;
import ve2.e;
import yx2.i;
import yx2.j;
import yx2.k;
import yx2.n;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B+\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lby2/d;", "", "Lby2/a;", "delegate", "Lyx2/a;", "singleUserCustomer", "Lkotlin/Function0;", "Ldy2/b;", "cacheManagerFun", "<init>", "(Lby2/a;Lyx2/a;Le23/a;)V", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yx2.a f22254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<dy2.b> f22255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f22256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f22259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f22260g;

    public d(a aVar, yx2.a aVar2, e23.a<dy2.b> aVar3) throws PackageManager.NameNotFoundException {
        String str;
        aVar.getClass();
        aVar3.getClass();
        this.f22254a = aVar2;
        this.f22255b = aVar3;
        Logger logger = LoggerFactory.getLogger("SUB#Manager");
        logger.getClass();
        this.f22256c = logger;
        String packageName = aVar.getContext().getPackageName();
        this.f22257d = packageName;
        PackageInfo packageInfo = aVar.getContext().getPackageManager().getPackageInfo(packageName, 0);
        this.f22258e = (packageInfo == null || (str = packageInfo.versionName) == null) ? "" : str;
        this.f22259f = new g(aVar, aVar2 != null ? aVar2.f200044b : null);
        this.f22260g = m.b(new s4(this, 29));
        if (aVar2 != null) {
            logger.debug("Initialized as single user instance for {}", aVar2);
        } else {
            logger.debug("Initialized as multi user instance.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0277  */
    /* JADX WARN: Code duplicated, block: B:105:0x0284  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:116:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:117:0x0211 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x01db  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:88:0x0224  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0259  */
    /* JADX WARN: Code duplicated, block: B:96:0x025d  */
    /* JADX WARN: Code duplicated, block: B:98:0x026b  */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02b1, code lost:
    
        if (r5.b(r6, r2, r13) == r3) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02b4, code lost:
    
        r4 = r0;
        r0 = r4;
        r3 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02e4, code lost:
    
        if (r2.a(r13) == r3) goto L113;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:111:0x02b9, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, e eVar, String str2, boolean z14, String str3, String str4, String str5, v13.c cVar) {
        b bVar;
        int i14;
        boolean z15;
        Object objD;
        String str6;
        String str7;
        String str8;
        String str9;
        e eVar2;
        List<yx2.c> list;
        String str10;
        j jVar;
        List<String> list2;
        List<i> list3;
        int i15;
        Object objC;
        List<String> list4;
        String str11;
        j jVar2;
        List<i> list5;
        wc2.a aVar;
        wc2.a.C3415a c3415a;
        Integer num;
        Integer num2;
        com.garmin.subscriptions.retrofit.e eVar3;
        wc2.a aVar2;
        List<String> list6;
        String str12;
        j jVar3;
        dy2.b bVarF;
        List<yx2.c> list7;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i16 = bVar.f22243n;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                bVar.f22243n = i16 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        b bVar2 = bVar;
        Object obj = bVar2.f22241l;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i17 = bVar2.f22243n;
        if (i17 == 0) {
            r.b(obj);
            dy2.a aVar4 = f().d().get(str);
            j jVar4 = aVar4 != null ? aVar4.f61648b : null;
            dy2.a aVar5 = f().d().get(str);
            List<yx2.c> list8 = aVar5 != null ? aVar5.f61647a : null;
            i14 = (jVar4 == null || DateTime.parse(jVar4.f200108d, ISODateTimeFormat.dateTimeParser()).getMillis() <= System.currentTimeMillis() || (list3 = jVar4.f200105a) == null || list3.isEmpty()) ? 1 : 0;
            com.garmin.subscriptions.retrofit.e eVar4 = com.garmin.subscriptions.retrofit.e.f52691a;
            bVar2.f22230a = str;
            bVar2.f22231b = eVar;
            bVar2.f22232c = null;
            bVar2.f22233d = str2;
            bVar2.f22234e = str3;
            bVar2.f22235f = str4;
            bVar2.f22236g = str5;
            bVar2.f22237h = jVar4;
            bVar2.f22238i = list8;
            z15 = z14;
            bVar2.f22239j = z15;
            bVar2.f22240k = i14;
            bVar2.f22243n = 1;
            objD = eVar4.d(bVar2);
            if (objD != aVar3) {
                str6 = str;
                str7 = str5;
                str8 = str3;
                str9 = str2;
                eVar2 = eVar;
                list = list8;
                str10 = str4;
                jVar = jVar4;
                list2 = null;
            }
            return aVar3;
        }
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 != 3) {
                    if (i17 != 4 && i17 != 5) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wc2.a aVar6 = (wc2.a) bVar2.f22232c;
                    List<yx2.c> list9 = (List) bVar2.f22231b;
                    j jVar5 = (j) bVar2.f22230a;
                    r.b(obj);
                    return new xx2.e(new n(list9, jVar5), ((wc2.a.C3415a) aVar6).f184312a);
                }
                aVar2 = (wc2.a) bVar2.f22232c;
                list6 = (List) bVar2.f22231b;
                str12 = (String) bVar2.f22230a;
                r.b(obj);
                wc2.a.b bVar3 = (wc2.a.b) aVar2;
                k kVar = (k) bVar3.f184316a;
                jVar3 = new j(kVar.f200111a, kVar.f200112b, kVar.f200113c, kVar.f200114d);
                bVarF = f();
                synchronized (bVarF) {
                    str12.getClass();
                    bVarF.h(bVarF.e(), str12, jVar3);
                }
                list7 = ((k) bVar3.f184316a).f200115e;
                if (list7 != null) {
                    f().a(str12, list7);
                }
                List<i> listD = d(((k) bVar3.f184316a).f200111a, list6);
                List<yx2.c> list10 = ((k) bVar3.f184316a).f200115e;
                k kVar2 = (k) bVar3.f184316a;
                return new xx2.e(new n(list10, new j(listD, kVar2.f200112b, kVar2.f200113c, kVar2.f200114d)), null, 2, null);
            }
            List<yx2.c> list11 = (List) bVar2.f22233d;
            j jVar6 = (j) bVar2.f22232c;
            list4 = (List) bVar2.f22231b;
            str11 = (String) bVar2.f22230a;
            r.b(obj);
            list = list11;
            jVar2 = jVar6;
            objC = obj;
            i15 = 3;
            aVar = (wc2.a) objC;
            if (aVar instanceof wc2.a.b) {
                if (aVar instanceof wc2.a.C3415a) {
                    u0.r();
                    return null;
                }
                this.f22256c.debug("fetchCachedOrNewPurchasableSubscriptions: Didn't get purchasable subscriptions correctly. Using cached purchasable subscriptions along with the network error that was thrown.");
                c3415a = (wc2.a.C3415a) aVar;
                num = c3415a.f184313b;
                if (num == null) {
                    this.f22256c.debug("fetchCachedOrNewPurchasableSubscriptions: Got an error response code " + c3415a.f184313b + ". Disabling back off.");
                    com.garmin.subscriptions.retrofit.e eVar5 = com.garmin.subscriptions.retrofit.e.f52691a;
                    bVar2.f22230a = jVar2;
                    bVar2.f22231b = list;
                    bVar2.f22232c = aVar;
                    bVar2.f22233d = null;
                    bVar2.f22243n = 5;
                } else {
                    if (num != null || num.intValue() != 429) {
                        l lVar = new l(500, 599);
                        num2 = c3415a.f184313b;
                        if (num2 != null || !lVar.d(num2.intValue())) {
                            this.f22256c.debug("fetchCachedOrNewPurchasableSubscriptions: Got an error response code " + c3415a.f184313b + ". Disabling back off.");
                            com.garmin.subscriptions.retrofit.e eVar6 = com.garmin.subscriptions.retrofit.e.f52691a;
                            bVar2.f22230a = jVar2;
                            bVar2.f22231b = list;
                            bVar2.f22232c = aVar;
                            bVar2.f22233d = null;
                            bVar2.f22243n = 5;
                        }
                    }
                    this.f22256c.debug("fetchCachedOrNewPurchasableSubscriptions: Got a 429 or 500-599 response code. Setting back off.");
                    com.garmin.subscriptions.retrofit.e eVar7 = com.garmin.subscriptions.retrofit.e.f52691a;
                    Integer num3 = c3415a.f184313b;
                    num3.getClass();
                    int iIntValue = num3.intValue();
                    Integer num4 = c3415a.f184315d;
                    bVar2.f22230a = jVar2;
                    bVar2.f22231b = list;
                    bVar2.f22232c = aVar;
                    bVar2.f22233d = null;
                    bVar2.f22243n = 4;
                }
                return new xx2.e(new n(list9, jVar5), ((wc2.a.C3415a) aVar6).f184312a);
            }
            this.f22256c.debug("fetchCachedOrNewPurchasableSubscriptions: Caching and returning new purchasable subscriptions.");
            eVar3 = com.garmin.subscriptions.retrofit.e.f52691a;
            bVar2.f22230a = str11;
            bVar2.f22231b = list4;
            bVar2.f22232c = aVar;
            bVar2.f22233d = null;
            bVar2.f22243n = i15;
            if (eVar3.a(bVar2) != aVar3) {
                aVar2 = aVar;
                list6 = list4;
                str12 = str11;
                wc2.a.b bVar4 = (wc2.a.b) aVar2;
                k kVar3 = (k) bVar4.f184316a;
                jVar3 = new j(kVar3.f200111a, kVar3.f200112b, kVar3.f200113c, kVar3.f200114d);
                bVarF = f();
                synchronized (bVarF) {
                    str12.getClass();
                    bVarF.h(bVarF.e(), str12, jVar3);
                    list7 = ((k) bVar4.f184316a).f200115e;
                    if (list7 != null) {
                        f().a(str12, list7);
                    }
                    List<i> listD2 = d(((k) bVar4.f184316a).f200111a, list6);
                    List<yx2.c> list12 = ((k) bVar4.f184316a).f200115e;
                    k kVar4 = (k) bVar4.f184316a;
                    return new xx2.e(new n(list12, new j(listD2, kVar4.f200112b, kVar4.f200113c, kVar4.f200114d)), null, 2, null);
                }
            }
            return aVar3;
        }
        int i18 = bVar2.f22240k;
        boolean z16 = bVar2.f22239j;
        List<yx2.c> list13 = bVar2.f22238i;
        j jVar7 = bVar2.f22237h;
        String str13 = bVar2.f22236g;
        String str14 = bVar2.f22235f;
        String str15 = bVar2.f22234e;
        str9 = (String) bVar2.f22233d;
        List<String> list14 = (List) bVar2.f22232c;
        e eVar8 = (e) bVar2.f22231b;
        String str16 = (String) bVar2.f22230a;
        r.b(obj);
        i14 = i18;
        str7 = str13;
        z15 = z16;
        objD = obj;
        str10 = str14;
        str6 = str16;
        str8 = str15;
        eVar2 = eVar8;
        jVar = jVar7;
        list2 = list14;
        list = list13;
        boolean z17 = objD != null;
        if (z15 && (z17 || i14 == 0)) {
            this.f22256c.debug("fetchCachedOrNewPurchasableSubscriptions: Using cached purchasable subscriptions due to preferCache == true, shouldBackOff == " + z17 + ", and shouldFetchAgain == " + (i14 != 0));
            if (jVar == null || (list5 = jVar.f200105a) == null) {
                list5 = null;
            }
            return (list5 == null || list5.isEmpty()) ? new xx2.e(new n(list, jVar), null, 2, null) : new xx2.e(new n(list, new j(d(list5, list2), jVar.f200106b, jVar.f200107c, jVar.f200108d)), null, 2, null);
        }
        this.f22256c.debug("fetchCachedOrNewPurchasableSubscriptions: Using OMT subscription gateway to fetch purchasable subscription information.");
        g gVar = this.f22259f;
        boolean z18 = !z15;
        bVar2.f22230a = str6;
        bVar2.f22231b = list2;
        bVar2.f22232c = jVar;
        bVar2.f22233d = list;
        bVar2.f22234e = null;
        bVar2.f22235f = null;
        bVar2.f22236g = null;
        bVar2.f22237h = null;
        bVar2.f22238i = null;
        bVar2.f22243n = 2;
        j jVar8 = jVar;
        String str17 = str7;
        List<String> list15 = list2;
        i15 = 3;
        objC = gVar.c(str6, eVar2, str9, null, str8, str10, z18, str17, bVar2);
        if (objC != aVar3) {
            list4 = list15;
            str11 = str6;
            jVar2 = jVar8;
            aVar = (wc2.a) objC;
            if (aVar instanceof wc2.a.b) {
                if (aVar instanceof wc2.a.C3415a) {
                    u0.r();
                    return null;
                }
                this.f22256c.debug("fetchCachedOrNewPurchasableSubscriptions: Didn't get purchasable subscriptions correctly. Using cached purchasable subscriptions along with the network error that was thrown.");
                c3415a = (wc2.a.C3415a) aVar;
                num = c3415a.f184313b;
                if (num == null) {
                    this.f22256c.debug("fetchCachedOrNewPurchasableSubscriptions: Got an error response code " + c3415a.f184313b + ". Disabling back off.");
                    com.garmin.subscriptions.retrofit.e eVar9 = com.garmin.subscriptions.retrofit.e.f52691a;
                    bVar2.f22230a = jVar2;
                    bVar2.f22231b = list;
                    bVar2.f22232c = aVar;
                    bVar2.f22233d = null;
                    bVar2.f22243n = 5;
                } else if (num != null) {
                    l lVar2 = new l(500, 599);
                    num2 = c3415a.f184313b;
                    if (num2 != null) {
                    }
                    this.f22256c.debug("fetchCachedOrNewPurchasableSubscriptions: Got an error response code " + c3415a.f184313b + ". Disabling back off.");
                    com.garmin.subscriptions.retrofit.e eVar10 = com.garmin.subscriptions.retrofit.e.f52691a;
                    bVar2.f22230a = jVar2;
                    bVar2.f22231b = list;
                    bVar2.f22232c = aVar;
                    bVar2.f22233d = null;
                    bVar2.f22243n = 5;
                } else {
                    l lVar3 = new l(500, 599);
                    num2 = c3415a.f184313b;
                    if (num2 != null) {
                    }
                    this.f22256c.debug("fetchCachedOrNewPurchasableSubscriptions: Got an error response code " + c3415a.f184313b + ". Disabling back off.");
                    com.garmin.subscriptions.retrofit.e eVar11 = com.garmin.subscriptions.retrofit.e.f52691a;
                    bVar2.f22230a = jVar2;
                    bVar2.f22231b = list;
                    bVar2.f22232c = aVar;
                    bVar2.f22233d = null;
                    bVar2.f22243n = 5;
                }
                return new xx2.e(new n(list9, jVar5), ((wc2.a.C3415a) aVar6).f184312a);
            }
            this.f22256c.debug("fetchCachedOrNewPurchasableSubscriptions: Caching and returning new purchasable subscriptions.");
            eVar3 = com.garmin.subscriptions.retrofit.e.f52691a;
            bVar2.f22230a = str11;
            bVar2.f22231b = list4;
            bVar2.f22232c = aVar;
            bVar2.f22233d = null;
            bVar2.f22243n = i15;
            if (eVar3.a(bVar2) != aVar3) {
                aVar2 = aVar;
                list6 = list4;
                str12 = str11;
                wc2.a.b bVar5 = (wc2.a.b) aVar2;
                k kVar5 = (k) bVar5.f184316a;
                jVar3 = new j(kVar5.f200111a, kVar5.f200112b, kVar5.f200113c, kVar5.f200114d);
                bVarF = f();
                synchronized (bVarF) {
                    str12.getClass();
                    bVarF.h(bVarF.e(), str12, jVar3);
                    list7 = ((k) bVar5.f184316a).f200115e;
                    if (list7 != null) {
                        f().a(str12, list7);
                    }
                    List<i> listD3 = d(((k) bVar5.f184316a).f200111a, list6);
                    List<yx2.c> list16 = ((k) bVar5.f184316a).f200115e;
                    k kVar6 = (k) bVar5.f184316a;
                    return new xx2.e(new n(list16, new j(listD3, kVar6.f200112b, kVar6.f200113c, kVar6.f200114d)), null, 2, null);
                }
            }
        }
        return aVar3;
    }

    /* JADX WARN: Failed to calculate best type for var: r11v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v1 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v1 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v5 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v5 ??, new type: java.lang.StringBuilder
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r21v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v0 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v11 ??, new type: com.garmin.subscriptions.retrofit.g
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v26 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v3 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v4 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v5 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v3 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r21v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v0 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v1 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public final java.lang.Object b(java.lang.String r18, ve2.e r19, java.lang.String r20, boolean r21, v13.c r22) {
        /*
            Method dump skipped, instruction units count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: by2.d.b(java.lang.String, ve2.e, java.lang.String, boolean, v13.c):java.lang.Object");
    }

    public final List<yx2.c> c(List<yx2.c> list, List<String> list2) {
        if (list2 == null || list2.isEmpty()) {
            return list;
        }
        this.f22256c.debug("Filtering active subscriptions by {}", list2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (list2.contains(((yx2.c) obj).f200048a)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List<i> d(List<i> list, List<String> list2) {
        if (list2 == null || list2.isEmpty()) {
            return list;
        }
        this.f22256c.debug("Filtering purchasable subscriptions by {}", list2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (list2.contains(((i) obj).f200088a)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final Object e(boolean z14, v13.c cVar) {
        Logger logger = this.f22256c;
        logger.debug(":: getActiveSubscriptions ");
        yx2.a aVar = this.f22254a;
        if (aVar == null) {
            h.s("Minimum required parameters not set to make this call");
            return null;
        }
        String str = aVar.f200043a;
        logger.debug("Fetching active subscriptions for ".concat(str));
        return b(str, aVar.f200044b, null, z14, cVar);
    }

    public final dy2.b f() {
        return (dy2.b) this.f22260g.getValue();
    }

    public final ArrayList g() {
        Logger logger = this.f22256c;
        logger.debug(":: getCachedActiveSubscriptions ");
        yx2.a aVar = this.f22254a;
        if (aVar == null) {
            h.s("Minimum required parameters not set to make this call");
            return null;
        }
        String str = aVar.f200043a;
        logger.debug("Fetching cached active subscriptions for ".concat(str));
        dy2.a aVar2 = f().d().get(str);
        List<yx2.c> list = aVar2 != null ? aVar2.f61647a : null;
        if (list != null) {
            return h(list);
        }
        return null;
    }

    public final ArrayList h(List list) {
        this.f22256c.debug("Filtering subscriptions to only those currently active");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((yx2.c) obj).f()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public /* synthetic */ d(a aVar, yx2.a aVar2, e23.a aVar3, int i14, p005kotlin.jvm.internal.j jVar) {
        this(aVar, aVar2, (i14 & 4) != 0 ? new bb0.d(14, aVar, aVar2) : aVar3);
    }
}
