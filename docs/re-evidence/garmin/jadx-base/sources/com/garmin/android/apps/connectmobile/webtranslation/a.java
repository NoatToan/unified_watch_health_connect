package com.garmin.android.apps.connectmobile.webtranslation;

import c22.u0;
import c22.x;
import i3.bf;
import i42.e;
import i42.h;
import i42.l;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kg.f;
import o13.p;
import o13.r;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.l0;
import p13.u;
import p13.y;
import t13.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/webtranslation/a;", "Lc22/x;", "Lorg/koin/core/component/KoinComponent;", "Li42/h;", "dao", "<init>", "(Li42/h;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements x, KoinComponent {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f47968e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f47969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap<String, String> f47970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap<c, Set<u0>> f47971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z53.b f47972d;

    static {
        new C0935a(null);
        int i14 = gt2.c.f79010a;
        f47968e = gt2.b.f79005a.h("ConnectWebTranslationOnDemandResourcesRepositoryImpl");
    }

    public a(h hVar) {
        hVar.getClass();
        this.f47969a = hVar;
        this.f47970b = new ConcurrentHashMap<>();
        this.f47971c = new ConcurrentHashMap<>();
        this.f47972d = z53.c.a();
    }

    public static ArrayList g(List list, List list2) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((e) it.next()).f90992b);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (!hashSet.contains(((e) obj).f90992b)) {
                arrayList.add(obj);
            }
        }
        return h0.C0(list, arrayList);
    }

    @Override // c22.x
    public final Object a(d<? super Unit> dVar) {
        this.f47970b.clear();
        this.f47971c.clear();
        Object objI = this.f47969a.i(dVar);
        return objI == u13.a.COROUTINE_SUSPENDED ? objI : Unit.INSTANCE;
    }

    @Override // c22.x
    public final boolean b(u0 u0Var) {
        u0Var.getClass();
        c.f47979b.getClass();
        Set<u0> set = this.f47971c.get(c.a(c.a.a()));
        if (set == null) {
            set = l0.f134950a;
        }
        return set.contains(u0Var);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0152 A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:63:0x016f, B:57:0x012f, B:59:0x0152, B:43:0x00d8, B:45:0x00ed, B:48:0x00f4, B:50:0x00fa, B:53:0x0101), top: B:111:0x00d8 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x016b  */
    /* JADX WARN: Code duplicated, block: B:62:0x016d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0190  */
    /* JADX WARN: Code duplicated, block: B:70:0x019f  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a2 A[Catch: all -> 0x02b4, TRY_LEAVE, TryCatch #2 {all -> 0x02b4, blocks: (B:66:0x0192, B:68:0x0199, B:71:0x01a2), top: B:114:0x0192 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f1 A[Catch: all -> 0x006e, TRY_LEAVE, TryCatch #7 {all -> 0x006e, blocks: (B:23:0x0065, B:77:0x01cf, B:79:0x01f1), top: B:124:0x0065 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x0215  */
    /* JADX WARN: Code duplicated, block: B:84:0x0235  */
    /* JADX WARN: Code duplicated, block: B:89:0x0252 A[Catch: all -> 0x004b, LOOP:0: B:87:0x024c->B:89:0x0252, LOOP_END, TryCatch #6 {all -> 0x004b, blocks: (B:16:0x0044, B:83:0x0217, B:85:0x0236, B:86:0x023d, B:87:0x024c, B:89:0x0252, B:90:0x0265, B:92:0x027d, B:96:0x0289), top: B:122:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x027d A[Catch: all -> 0x004b, TryCatch #6 {all -> 0x004b, blocks: (B:16:0x0044, B:83:0x0217, B:85:0x0236, B:86:0x023d, B:87:0x024c, B:89:0x0252, B:90:0x0265, B:92:0x027d, B:96:0x0289), top: B:122:0x0044 }] */
    @Override // c22.x
    public final Object c(u0 u0Var, v13.c cVar) {
        i42.b bVar;
        u0 u0Var2;
        z53.a aVar;
        int i14;
        String str;
        Object obj;
        int i15;
        String str2;
        a aVar2;
        int i16;
        int i17;
        ConcurrentHashMap<c, Set<u0>> concurrentHashMap;
        List<e> listG;
        int i18;
        int i19;
        u0 u0Var3;
        z53.a aVar3;
        String str3;
        Object objB;
        u0 u0Var4;
        int i24;
        int i25;
        a aVar4;
        List list;
        List list2;
        List list3;
        ArrayList arrayList;
        Set<u0> setNewKeySet;
        Set<u0> setPutIfAbsent;
        z53.a aVar5;
        ConcurrentHashMap<String, String> concurrentHashMap2 = this.f47970b;
        if (cVar instanceof i42.b) {
            bVar = (i42.b) cVar;
            int i26 = bVar.f90977l;
            if ((i26 & Integer.MIN_VALUE) != 0) {
                bVar.f90977l = i26 - Integer.MIN_VALUE;
            } else {
                bVar = new i42.b(this, cVar);
            }
        } else {
            bVar = new i42.b(this, cVar);
        }
        Object objF = bVar.f90975j;
        u13.a aVar6 = u13.a.COROUTINE_SUSPENDED;
        int i27 = bVar.f90977l;
        ConcurrentHashMap<c, Set<u0>> concurrentHashMap3 = this.f47971c;
        Logger logger = f47968e;
        try {
            if (i27 == 0) {
                r.b(objF);
                bVar.f90966a = u0Var;
                z53.b bVar2 = this.f47972d;
                bVar.f90967b = bVar2;
                bVar.f90972g = 0;
                bVar.f90977l = 1;
                if (bVar2.c(bVar) != aVar6) {
                    u0Var2 = u0Var;
                    aVar = bVar2;
                    i14 = 0;
                }
                return aVar6;
            }
            if (i27 != 1) {
                if (i27 == 2) {
                    int i28 = bVar.f90974i;
                    i17 = bVar.f90973h;
                    int i29 = bVar.f90972g;
                    a aVar7 = bVar.f90970e;
                    String str4 = bVar.f90969d;
                    String str5 = bVar.f90968c;
                    aVar5 = bVar.f90967b;
                    u0 u0Var5 = bVar.f90966a;
                    try {
                        r.b(objF);
                        i16 = i29;
                        aVar = aVar5;
                        i15 = i28;
                        str2 = str5;
                        str = str4;
                        aVar2 = aVar7;
                        u0Var2 = u0Var5;
                        obj = objF;
                        StringBuilder sb3 = new StringBuilder("loadTranslations(");
                        sb3.append(u0Var2);
                        concurrentHashMap = concurrentHashMap3;
                        sb3.append("): installed localized strings=");
                        sb3.append((List) obj);
                        logger.debug(sb3.toString());
                        listG = (List) obj;
                        if (listG == null) {
                            i18 = i17;
                            i19 = i15;
                            c.f47979b.getClass();
                            str3 = c.f47980c;
                            if (!s.g(str, str3)) {
                                u0Var3 = u0Var2;
                            } else {
                                h hVar = aVar2.f47969a;
                                String strName = u0Var2.name();
                                bVar.f90966a = u0Var2;
                                bVar.f90967b = aVar;
                                bVar.f90968c = str2;
                                aVar3 = aVar;
                                bVar.f90969d = null;
                                bVar.f90970e = aVar2;
                                bVar.f90971f = listG;
                                bVar.f90972g = i16;
                                bVar.f90973h = i18;
                                bVar.f90974i = i19;
                                bVar.f90977l = 4;
                                objB = hVar.b(str2, str3, strName, bVar);
                                if (objB != aVar6) {
                                    u0Var4 = u0Var2;
                                    aVar = aVar3;
                                    i24 = i18;
                                    i25 = i19;
                                    aVar4 = aVar2;
                                    list = listG;
                                    objF = objB;
                                    logger.debug("loadTranslations(" + u0Var4 + "): installed fallback strings=" + ((List) objF));
                                    list2 = (List) objF;
                                    if (list2 == null) {
                                        c.f47979b.getClass();
                                        String str6 = c.f47980c;
                                        bVar.f90966a = u0Var4;
                                        bVar.f90967b = aVar;
                                        bVar.f90968c = null;
                                        bVar.f90969d = null;
                                        bVar.f90970e = aVar4;
                                        bVar.f90971f = list;
                                        bVar.f90972g = i16;
                                        bVar.f90973h = i24;
                                        bVar.f90974i = i25;
                                        bVar.f90977l = 5;
                                        objF = aVar4.f(u0Var4, str6, str2, bVar);
                                        if (objF != aVar6) {
                                            list3 = list;
                                            u0Var3 = u0Var4;
                                            logger.debug("loadTranslations(" + u0Var3 + "): fallback strings from cloud=" + ((List) objF));
                                            list2 = (List) objF;
                                            list = list3;
                                        }
                                    } else {
                                        u0Var3 = u0Var4;
                                    }
                                    aVar4.getClass();
                                    listG = g(list, list2);
                                }
                            }
                            arrayList = new ArrayList(y.r(listG, 10));
                            for (e eVar : listG) {
                                arrayList.add(new p(eVar.f90994d, eVar.f90993c));
                            }
                            p13.u0.j(concurrentHashMap2, arrayList);
                            c.f47979b.getClass();
                            c cVarA = c.a(c.a.a());
                            ConcurrentHashMap<c, Set<u0>> concurrentHashMap4 = concurrentHashMap;
                            setNewKeySet = concurrentHashMap4.get(cVarA);
                            if (setNewKeySet == null) {
                                setNewKeySet = setPutIfAbsent;
                            }
                            setNewKeySet.add(u0Var3);
                            Boolean bool = Boolean.TRUE;
                            logger.debug("loadTranslations(" + u0Var3 + "): cache=" + concurrentHashMap2);
                            aVar.e(null);
                            return bool;
                        }
                        bVar.f90966a = u0Var2;
                        bVar.f90967b = aVar;
                        bVar.f90968c = str2;
                        bVar.f90969d = str;
                        bVar.f90970e = aVar2;
                        bVar.f90972g = i16;
                        bVar.f90973h = i17;
                        bVar.f90974i = i15;
                        bVar.f90977l = 3;
                        objF = aVar2.f(u0Var2, str, str2, bVar);
                        if (objF == aVar6) {
                            i18 = i17;
                            i19 = i15;
                            logger.debug("loadTranslations(" + u0Var2 + "): localized strings from cloud=" + ((List) objF));
                            listG = (List) objF;
                            c.f47979b.getClass();
                            str3 = c.f47980c;
                            if (!s.g(str, str3)) {
                                u0Var3 = u0Var2;
                            } else {
                                h hVar2 = aVar2.f47969a;
                                String strName2 = u0Var2.name();
                                bVar.f90966a = u0Var2;
                                bVar.f90967b = aVar;
                                bVar.f90968c = str2;
                                aVar3 = aVar;
                                bVar.f90969d = null;
                                bVar.f90970e = aVar2;
                                bVar.f90971f = listG;
                                bVar.f90972g = i16;
                                bVar.f90973h = i18;
                                bVar.f90974i = i19;
                                bVar.f90977l = 4;
                                objB = hVar2.b(str2, str3, strName2, bVar);
                                if (objB != aVar6) {
                                    u0Var4 = u0Var2;
                                    aVar = aVar3;
                                    i24 = i18;
                                    i25 = i19;
                                    aVar4 = aVar2;
                                    list = listG;
                                    objF = objB;
                                    logger.debug("loadTranslations(" + u0Var4 + "): installed fallback strings=" + ((List) objF));
                                    list2 = (List) objF;
                                    if (list2 == null) {
                                        c.f47979b.getClass();
                                        String str7 = c.f47980c;
                                        bVar.f90966a = u0Var4;
                                        bVar.f90967b = aVar;
                                        bVar.f90968c = null;
                                        bVar.f90969d = null;
                                        bVar.f90970e = aVar4;
                                        bVar.f90971f = list;
                                        bVar.f90972g = i16;
                                        bVar.f90973h = i24;
                                        bVar.f90974i = i25;
                                        bVar.f90977l = 5;
                                        objF = aVar4.f(u0Var4, str7, str2, bVar);
                                        if (objF != aVar6) {
                                            list3 = list;
                                            u0Var3 = u0Var4;
                                            logger.debug("loadTranslations(" + u0Var3 + "): fallback strings from cloud=" + ((List) objF));
                                            list2 = (List) objF;
                                            list = list3;
                                        }
                                    } else {
                                        u0Var3 = u0Var4;
                                    }
                                    aVar4.getClass();
                                    listG = g(list, list2);
                                }
                            }
                            arrayList = new ArrayList(y.r(listG, 10));
                            while (r0.hasNext()) {
                                arrayList.add(new p(eVar.f90994d, eVar.f90993c));
                            }
                            p13.u0.j(concurrentHashMap2, arrayList);
                            c.f47979b.getClass();
                            c cVarA2 = c.a(c.a.a());
                            ConcurrentHashMap<c, Set<u0>> concurrentHashMap5 = concurrentHashMap;
                            setNewKeySet = concurrentHashMap5.get(cVarA2);
                            if (setNewKeySet == null) {
                                setNewKeySet = setPutIfAbsent;
                            }
                            setNewKeySet.add(u0Var3);
                            Boolean bool2 = Boolean.TRUE;
                            logger.debug("loadTranslations(" + u0Var3 + "): cache=" + concurrentHashMap2);
                            aVar.e(null);
                            return bool2;
                        }
                        return aVar6;
                    } catch (Throwable th3) {
                        th = th3;
                        u0Var3 = u0Var5;
                        aVar = aVar5;
                    }
                } else if (i27 == 3) {
                    i19 = bVar.f90974i;
                    int i30 = bVar.f90973h;
                    i16 = bVar.f90972g;
                    aVar2 = bVar.f90970e;
                    str = bVar.f90969d;
                    str2 = bVar.f90968c;
                    aVar5 = bVar.f90967b;
                    u0Var2 = bVar.f90966a;
                    try {
                        r.b(objF);
                        concurrentHashMap = concurrentHashMap3;
                        i18 = i30;
                        aVar = aVar5;
                        logger.debug("loadTranslations(" + u0Var2 + "): localized strings from cloud=" + ((List) objF));
                        listG = (List) objF;
                        try {
                            try {
                                c.f47979b.getClass();
                                str3 = c.f47980c;
                                if (!s.g(str, str3)) {
                                    h hVar3 = aVar2.f47969a;
                                    String strName3 = u0Var2.name();
                                    bVar.f90966a = u0Var2;
                                    bVar.f90967b = aVar;
                                    bVar.f90968c = str2;
                                    aVar3 = aVar;
                                    try {
                                        bVar.f90969d = null;
                                        bVar.f90970e = aVar2;
                                        bVar.f90971f = listG;
                                        bVar.f90972g = i16;
                                        bVar.f90973h = i18;
                                        bVar.f90974i = i19;
                                        bVar.f90977l = 4;
                                        objB = hVar3.b(str2, str3, strName3, bVar);
                                        if (objB != aVar6) {
                                            u0Var4 = u0Var2;
                                            aVar = aVar3;
                                            i24 = i18;
                                            i25 = i19;
                                            aVar4 = aVar2;
                                            list = listG;
                                            objF = objB;
                                            logger.debug("loadTranslations(" + u0Var4 + "): installed fallback strings=" + ((List) objF));
                                            list2 = (List) objF;
                                            if (list2 == null) {
                                                c.f47979b.getClass();
                                                String str8 = c.f47980c;
                                                bVar.f90966a = u0Var4;
                                                bVar.f90967b = aVar;
                                                bVar.f90968c = null;
                                                bVar.f90969d = null;
                                                bVar.f90970e = aVar4;
                                                bVar.f90971f = list;
                                                bVar.f90972g = i16;
                                                bVar.f90973h = i24;
                                                bVar.f90974i = i25;
                                                bVar.f90977l = 5;
                                                objF = aVar4.f(u0Var4, str8, str2, bVar);
                                                if (objF != aVar6) {
                                                    list3 = list;
                                                    u0Var3 = u0Var4;
                                                    logger.debug("loadTranslations(" + u0Var3 + "): fallback strings from cloud=" + ((List) objF));
                                                    list2 = (List) objF;
                                                    list = list3;
                                                }
                                            } else {
                                                u0Var3 = u0Var4;
                                            }
                                            aVar4.getClass();
                                            listG = g(list, list2);
                                        }
                                        return aVar6;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        u0Var3 = u0Var2;
                                        aVar = aVar3;
                                        logger.warn("Failed to install resources for " + u0Var3, th);
                                        return Boolean.FALSE;
                                    }
                                }
                                u0Var3 = u0Var2;
                                arrayList = new ArrayList(y.r(listG, 10));
                                while (r0.hasNext()) {
                                    arrayList.add(new p(eVar.f90994d, eVar.f90993c));
                                }
                                p13.u0.j(concurrentHashMap2, arrayList);
                                c.f47979b.getClass();
                                c cVarA3 = c.a(c.a.a());
                                ConcurrentHashMap<c, Set<u0>> concurrentHashMap6 = concurrentHashMap;
                                setNewKeySet = concurrentHashMap6.get(cVarA3);
                                if (setNewKeySet == null) {
                                    setNewKeySet = setPutIfAbsent;
                                }
                                setNewKeySet.add(u0Var3);
                                Boolean bool3 = Boolean.TRUE;
                                logger.debug("loadTranslations(" + u0Var3 + "): cache=" + concurrentHashMap2);
                                aVar.e(null);
                                return bool3;
                            } catch (Throwable th5) {
                                th = th5;
                                aVar3 = aVar;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            u0Var3 = u0Var2;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        u0Var3 = u0Var2;
                        aVar = aVar5;
                    }
                } else if (i27 == 4) {
                    int i34 = bVar.f90974i;
                    i24 = bVar.f90973h;
                    i16 = bVar.f90972g;
                    list = bVar.f90971f;
                    a aVar8 = bVar.f90970e;
                    str2 = bVar.f90968c;
                    aVar = bVar.f90967b;
                    u0Var4 = bVar.f90966a;
                    try {
                        r.b(objF);
                        i25 = i34;
                        concurrentHashMap = concurrentHashMap3;
                        aVar4 = aVar8;
                        logger.debug("loadTranslations(" + u0Var4 + "): installed fallback strings=" + ((List) objF));
                        list2 = (List) objF;
                        if (list2 == null) {
                            c.f47979b.getClass();
                            String str9 = c.f47980c;
                            bVar.f90966a = u0Var4;
                            bVar.f90967b = aVar;
                            bVar.f90968c = null;
                            bVar.f90969d = null;
                            bVar.f90970e = aVar4;
                            bVar.f90971f = list;
                            bVar.f90972g = i16;
                            bVar.f90973h = i24;
                            bVar.f90974i = i25;
                            bVar.f90977l = 5;
                            objF = aVar4.f(u0Var4, str9, str2, bVar);
                            if (objF != aVar6) {
                                list3 = list;
                                u0Var3 = u0Var4;
                                logger.debug("loadTranslations(" + u0Var3 + "): fallback strings from cloud=" + ((List) objF));
                                list2 = (List) objF;
                                list = list3;
                            }
                            return aVar6;
                        }
                        u0Var3 = u0Var4;
                        aVar4.getClass();
                        listG = g(list, list2);
                        arrayList = new ArrayList(y.r(listG, 10));
                        while (r0.hasNext()) {
                            arrayList.add(new p(eVar.f90994d, eVar.f90993c));
                        }
                        p13.u0.j(concurrentHashMap2, arrayList);
                        c.f47979b.getClass();
                        c cVarA4 = c.a(c.a.a());
                        ConcurrentHashMap<c, Set<u0>> concurrentHashMap7 = concurrentHashMap;
                        setNewKeySet = concurrentHashMap7.get(cVarA4);
                        if (setNewKeySet == null) {
                            setNewKeySet = setPutIfAbsent;
                        }
                        setNewKeySet.add(u0Var3);
                        Boolean bool4 = Boolean.TRUE;
                        logger.debug("loadTranslations(" + u0Var3 + "): cache=" + concurrentHashMap2);
                        aVar.e(null);
                        return bool4;
                    } catch (Throwable th8) {
                        th = th8;
                        u0Var3 = u0Var4;
                    }
                } else {
                    if (i27 != 5) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list3 = bVar.f90971f;
                    aVar4 = bVar.f90970e;
                    aVar = bVar.f90967b;
                    u0Var3 = bVar.f90966a;
                    try {
                        r.b(objF);
                        concurrentHashMap = concurrentHashMap3;
                        logger.debug("loadTranslations(" + u0Var3 + "): fallback strings from cloud=" + ((List) objF));
                        list2 = (List) objF;
                        list = list3;
                        aVar4.getClass();
                        listG = g(list, list2);
                        arrayList = new ArrayList(y.r(listG, 10));
                        while (r0.hasNext()) {
                            arrayList.add(new p(eVar.f90994d, eVar.f90993c));
                        }
                        p13.u0.j(concurrentHashMap2, arrayList);
                        c.f47979b.getClass();
                        c cVarA5 = c.a(c.a.a());
                        ConcurrentHashMap<c, Set<u0>> concurrentHashMap8 = concurrentHashMap;
                        setNewKeySet = concurrentHashMap8.get(cVarA5);
                        if (setNewKeySet == null && (setPutIfAbsent = concurrentHashMap8.putIfAbsent(cVarA5, (setNewKeySet = ConcurrentHashMap.newKeySet()))) != null) {
                            setNewKeySet = setPutIfAbsent;
                        }
                        setNewKeySet.add(u0Var3);
                        Boolean bool5 = Boolean.TRUE;
                        logger.debug("loadTranslations(" + u0Var3 + "): cache=" + concurrentHashMap2);
                        aVar.e(null);
                        return bool5;
                    } catch (Throwable th9) {
                        th = th9;
                    }
                }
                aVar = aVar5;
                try {
                    logger.warn("Failed to install resources for " + u0Var3, th);
                    return Boolean.FALSE;
                } finally {
                    aVar.e(null);
                }
            }
            i14 = bVar.f90972g;
            aVar = bVar.f90967b;
            u0Var2 = bVar.f90966a;
            r.b(objF);
            c.f47979b.getClass();
            Set<u0> set = concurrentHashMap3.get(c.a(c.a.a()));
            if (set == null) {
                set = l0.f134950a;
            }
            if (set.contains(u0Var2)) {
                Boolean bool6 = Boolean.TRUE;
                aVar.e(null);
                return bool6;
            }
            String strA = c.a.a();
            h hVar4 = this.f47969a;
            String strName4 = u0Var2.name();
            bVar.f90966a = u0Var2;
            bVar.f90967b = aVar;
            bVar.f90968c = "5.30.1";
            bVar.f90969d = strA;
            bVar.f90970e = this;
            bVar.f90972g = i14;
            bVar.f90973h = 0;
            bVar.f90974i = 0;
            bVar.f90977l = 2;
            Object objB2 = hVar4.b("5.30.1", strA, strName4, bVar);
            if (objB2 != aVar6) {
                str = strA;
                obj = objB2;
                i15 = 0;
                str2 = "5.30.1";
                aVar2 = this;
                i16 = i14;
                i17 = 0;
                StringBuilder sb4 = new StringBuilder("loadTranslations(");
                sb4.append(u0Var2);
                concurrentHashMap = concurrentHashMap3;
                sb4.append("): installed localized strings=");
                sb4.append((List) obj);
                logger.debug(sb4.toString());
                listG = (List) obj;
                if (listG == null) {
                    i18 = i17;
                    i19 = i15;
                    c.f47979b.getClass();
                    str3 = c.f47980c;
                    if (!s.g(str, str3)) {
                        u0Var3 = u0Var2;
                    } else {
                        h hVar5 = aVar2.f47969a;
                        String strName5 = u0Var2.name();
                        bVar.f90966a = u0Var2;
                        bVar.f90967b = aVar;
                        bVar.f90968c = str2;
                        aVar3 = aVar;
                        bVar.f90969d = null;
                        bVar.f90970e = aVar2;
                        bVar.f90971f = listG;
                        bVar.f90972g = i16;
                        bVar.f90973h = i18;
                        bVar.f90974i = i19;
                        bVar.f90977l = 4;
                        objB = hVar5.b(str2, str3, strName5, bVar);
                        if (objB != aVar6) {
                            u0Var4 = u0Var2;
                            aVar = aVar3;
                            i24 = i18;
                            i25 = i19;
                            aVar4 = aVar2;
                            list = listG;
                            objF = objB;
                            logger.debug("loadTranslations(" + u0Var4 + "): installed fallback strings=" + ((List) objF));
                            list2 = (List) objF;
                            if (list2 == null) {
                                c.f47979b.getClass();
                                String str10 = c.f47980c;
                                bVar.f90966a = u0Var4;
                                bVar.f90967b = aVar;
                                bVar.f90968c = null;
                                bVar.f90969d = null;
                                bVar.f90970e = aVar4;
                                bVar.f90971f = list;
                                bVar.f90972g = i16;
                                bVar.f90973h = i24;
                                bVar.f90974i = i25;
                                bVar.f90977l = 5;
                                objF = aVar4.f(u0Var4, str10, str2, bVar);
                                if (objF != aVar6) {
                                    list3 = list;
                                    u0Var3 = u0Var4;
                                    logger.debug("loadTranslations(" + u0Var3 + "): fallback strings from cloud=" + ((List) objF));
                                    list2 = (List) objF;
                                    list = list3;
                                }
                            } else {
                                u0Var3 = u0Var4;
                            }
                            aVar4.getClass();
                            listG = g(list, list2);
                        }
                    }
                    arrayList = new ArrayList(y.r(listG, 10));
                    while (r0.hasNext()) {
                        arrayList.add(new p(eVar.f90994d, eVar.f90993c));
                    }
                    p13.u0.j(concurrentHashMap2, arrayList);
                    c.f47979b.getClass();
                    c cVarA6 = c.a(c.a.a());
                    ConcurrentHashMap<c, Set<u0>> concurrentHashMap9 = concurrentHashMap;
                    setNewKeySet = concurrentHashMap9.get(cVarA6);
                    if (setNewKeySet == null) {
                        setNewKeySet = setPutIfAbsent;
                    }
                    setNewKeySet.add(u0Var3);
                    Boolean bool7 = Boolean.TRUE;
                    logger.debug("loadTranslations(" + u0Var3 + "): cache=" + concurrentHashMap2);
                    aVar.e(null);
                    return bool7;
                }
                bVar.f90966a = u0Var2;
                bVar.f90967b = aVar;
                bVar.f90968c = str2;
                bVar.f90969d = str;
                bVar.f90970e = aVar2;
                bVar.f90972g = i16;
                bVar.f90973h = i17;
                bVar.f90974i = i15;
                bVar.f90977l = 3;
                objF = aVar2.f(u0Var2, str, str2, bVar);
                if (objF == aVar6) {
                    i18 = i17;
                    i19 = i15;
                    logger.debug("loadTranslations(" + u0Var2 + "): localized strings from cloud=" + ((List) objF));
                    listG = (List) objF;
                    c.f47979b.getClass();
                    str3 = c.f47980c;
                    if (!s.g(str, str3)) {
                        u0Var3 = u0Var2;
                    } else {
                        h hVar6 = aVar2.f47969a;
                        String strName6 = u0Var2.name();
                        bVar.f90966a = u0Var2;
                        bVar.f90967b = aVar;
                        bVar.f90968c = str2;
                        aVar3 = aVar;
                        bVar.f90969d = null;
                        bVar.f90970e = aVar2;
                        bVar.f90971f = listG;
                        bVar.f90972g = i16;
                        bVar.f90973h = i18;
                        bVar.f90974i = i19;
                        bVar.f90977l = 4;
                        objB = hVar6.b(str2, str3, strName6, bVar);
                        if (objB != aVar6) {
                            u0Var4 = u0Var2;
                            aVar = aVar3;
                            i24 = i18;
                            i25 = i19;
                            aVar4 = aVar2;
                            list = listG;
                            objF = objB;
                            logger.debug("loadTranslations(" + u0Var4 + "): installed fallback strings=" + ((List) objF));
                            list2 = (List) objF;
                            if (list2 == null) {
                                c.f47979b.getClass();
                                String str11 = c.f47980c;
                                bVar.f90966a = u0Var4;
                                bVar.f90967b = aVar;
                                bVar.f90968c = null;
                                bVar.f90969d = null;
                                bVar.f90970e = aVar4;
                                bVar.f90971f = list;
                                bVar.f90972g = i16;
                                bVar.f90973h = i24;
                                bVar.f90974i = i25;
                                bVar.f90977l = 5;
                                objF = aVar4.f(u0Var4, str11, str2, bVar);
                                if (objF != aVar6) {
                                    list3 = list;
                                    u0Var3 = u0Var4;
                                    logger.debug("loadTranslations(" + u0Var3 + "): fallback strings from cloud=" + ((List) objF));
                                    list2 = (List) objF;
                                    list = list3;
                                }
                            } else {
                                u0Var3 = u0Var4;
                            }
                            aVar4.getClass();
                            listG = g(list, list2);
                        }
                    }
                    arrayList = new ArrayList(y.r(listG, 10));
                    while (r0.hasNext()) {
                        arrayList.add(new p(eVar.f90994d, eVar.f90993c));
                    }
                    p13.u0.j(concurrentHashMap2, arrayList);
                    c.f47979b.getClass();
                    c cVarA7 = c.a(c.a.a());
                    ConcurrentHashMap<c, Set<u0>> concurrentHashMap10 = concurrentHashMap;
                    setNewKeySet = concurrentHashMap10.get(cVarA7);
                    if (setNewKeySet == null) {
                        setNewKeySet = setPutIfAbsent;
                    }
                    setNewKeySet.add(u0Var3);
                    Boolean bool8 = Boolean.TRUE;
                    logger.debug("loadTranslations(" + u0Var3 + "): cache=" + concurrentHashMap2);
                    aVar.e(null);
                    return bool8;
                }
            }
            return aVar6;
        } catch (Throwable th10) {
            th = th10;
            u0Var3 = u0Var2;
            logger.warn("Failed to install resources for " + u0Var3, th);
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c9 A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:27:0x0068, B:43:0x00b8, B:46:0x00c9, B:37:0x0092, B:39:0x0098), top: B:76:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00de  */
    /* JADX WARN: Code duplicated, block: B:54:0x0102 A[Catch: all -> 0x005c, LOOP:1: B:52:0x00fc->B:54:0x0102, LOOP_END, TryCatch #2 {all -> 0x005c, blocks: (B:22:0x0057, B:50:0x00e4, B:51:0x00ef, B:52:0x00fc, B:54:0x0102, B:55:0x0117), top: B:80:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x012f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0148 A[Catch: all -> 0x0041, LOOP:0: B:60:0x0142->B:62:0x0148, LOOP_END, TryCatch #1 {all -> 0x0041, blocks: (B:15:0x003c, B:59:0x0131, B:60:0x0142, B:62:0x0148, B:63:0x0158, B:65:0x0164, B:69:0x0170, B:71:0x0195), top: B:78:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0164 A[Catch: all -> 0x0041, TryCatch #1 {all -> 0x0041, blocks: (B:15:0x003c, B:59:0x0131, B:60:0x0142, B:62:0x0148, B:63:0x0158, B:65:0x0164, B:69:0x0170, B:71:0x0195), top: B:78:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v4, types: [z53.a] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [z53.a] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [z53.a] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [z53.a] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [z53.a] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [z53.a] */
    @Override // c22.x
    public final Object d(v13.c cVar) throws Throwable {
        i42.c cVar2;
        ?? r14;
        z53.a aVar;
        int i14;
        int i15;
        String str;
        int i16;
        List<e> listG;
        String str2;
        Object objA;
        ?? r15;
        List list;
        int i17;
        int i18;
        a aVar2;
        ?? r16;
        ArrayList arrayList;
        String str3;
        ?? r17;
        ArrayList arrayList2;
        Iterator it;
        Set<u0> setNewKeySet;
        Set<u0> setPutIfAbsent;
        if (cVar instanceof i42.c) {
            cVar2 = (i42.c) cVar;
            int i19 = cVar2.f90986i;
            if ((i19 & Integer.MIN_VALUE) != 0) {
                cVar2.f90986i = i19 - Integer.MIN_VALUE;
            } else {
                cVar2 = new i42.c(this, cVar);
            }
        } else {
            cVar2 = new i42.c(this, cVar);
        }
        Object objC = cVar2.f90984g;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i24 = cVar2.f90986i;
        ConcurrentHashMap<String, String> concurrentHashMap = this.f47970b;
        ?? r18 = 1;
        h hVar = this.f47969a;
        try {
            if (i24 == 0) {
                r.b(objC);
                z53.b bVar = this.f47972d;
                cVar2.f90978a = bVar;
                cVar2.f90982e = 0;
                cVar2.f90986i = 1;
                if (bVar.c(cVar2) != aVar3) {
                    aVar = bVar;
                    i14 = 0;
                }
                return aVar3;
            }
            if (i24 != 1) {
                if (i24 != 2) {
                    if (i24 != 3) {
                        if (i24 != 4) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str3 = cVar2.f90979b;
                        r14 = cVar2.f90978a;
                        try {
                            r.b(objC);
                            r17 = r14;
                            List list2 = (List) objC;
                            arrayList2 = new ArrayList(y.r(list2, 10));
                            it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(u0.valueOf(((i42.d) it.next()).f90990d));
                            }
                            ConcurrentHashMap<c, Set<u0>> concurrentHashMap2 = this.f47971c;
                            c cVarA = c.a(str3);
                            setNewKeySet = concurrentHashMap2.get(cVarA);
                            if (setNewKeySet == null && (setPutIfAbsent = concurrentHashMap2.putIfAbsent(cVarA, (setNewKeySet = ConcurrentHashMap.newKeySet()))) != null) {
                                setNewKeySet = setPutIfAbsent;
                            }
                            setNewKeySet.addAll(arrayList2);
                            f47968e.trace("Load Web translation strings for " + arrayList2 + ": " + concurrentHashMap);
                            r14 = r17;
                            Unit unit = Unit.INSTANCE;
                            r14.e(null);
                            return unit;
                        } catch (Throwable th3) {
                            th = th3;
                            r14.e(null);
                            throw th;
                        }
                    }
                    i18 = cVar2.f90983f;
                    i17 = cVar2.f90982e;
                    aVar2 = cVar2.f90981d;
                    list = cVar2.f90980c;
                    str = cVar2.f90979b;
                    r16 = cVar2.f90978a;
                    try {
                        r.b(objC);
                        r15 = r16;
                        aVar2.getClass();
                        listG = g(list, (List) objC);
                        i16 = i18;
                        i14 = i17;
                        r16 = r15;
                        arrayList = new ArrayList(y.r(listG, 10));
                        for (e eVar : listG) {
                            arrayList.add(new p(eVar.f90994d, eVar.f90993c));
                        }
                        p13.u0.j(concurrentHashMap, arrayList);
                        cVar2.f90978a = r16;
                        cVar2.f90979b = str;
                        cVar2.f90980c = null;
                        cVar2.f90981d = null;
                        cVar2.f90982e = i14;
                        cVar2.f90983f = i16;
                        cVar2.f90986i = 4;
                        objC = hVar.c(str, cVar2);
                        if (objC != aVar3) {
                            str3 = str;
                            r17 = r16;
                            List list3 = (List) objC;
                            arrayList2 = new ArrayList(y.r(list3, 10));
                            it = list3.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(u0.valueOf(((i42.d) it.next()).f90990d));
                            }
                            ConcurrentHashMap<c, Set<u0>> concurrentHashMap3 = this.f47971c;
                            c cVarA2 = c.a(str3);
                            setNewKeySet = concurrentHashMap3.get(cVarA2);
                            if (setNewKeySet == null) {
                                setNewKeySet = setPutIfAbsent;
                            }
                            setNewKeySet.addAll(arrayList2);
                            f47968e.trace("Load Web translation strings for " + arrayList2 + ": " + concurrentHashMap);
                            r14 = r17;
                            Unit unit2 = Unit.INSTANCE;
                            r14.e(null);
                            return unit2;
                        }
                        return aVar3;
                    } catch (Throwable th4) {
                        th = th4;
                        r14 = r16;
                        r14.e(null);
                        throw th;
                    }
                }
                int i25 = cVar2.f90983f;
                i14 = cVar2.f90982e;
                String str4 = cVar2.f90979b;
                z53.a aVar4 = cVar2.f90978a;
                r.b(objC);
                i15 = i25;
                str = str4;
                r18 = aVar4;
                i16 = i15;
                listG = (List) objC;
                c.f47979b.getClass();
                str2 = c.f47980c;
                if (s.g(str, str2)) {
                    r16 = r18;
                    arrayList = new ArrayList(y.r(listG, 10));
                    while (r0.hasNext()) {
                        arrayList.add(new p(eVar.f90994d, eVar.f90993c));
                    }
                    p13.u0.j(concurrentHashMap, arrayList);
                    cVar2.f90978a = r16;
                    cVar2.f90979b = str;
                    cVar2.f90980c = null;
                    cVar2.f90981d = null;
                    cVar2.f90982e = i14;
                    cVar2.f90983f = i16;
                    cVar2.f90986i = 4;
                    objC = hVar.c(str, cVar2);
                    if (objC != aVar3) {
                        str3 = str;
                        r17 = r16;
                        List list4 = (List) objC;
                        arrayList2 = new ArrayList(y.r(list4, 10));
                        it = list4.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(u0.valueOf(((i42.d) it.next()).f90990d));
                        }
                        ConcurrentHashMap<c, Set<u0>> concurrentHashMap4 = this.f47971c;
                        c cVarA3 = c.a(str3);
                        setNewKeySet = concurrentHashMap4.get(cVarA3);
                        if (setNewKeySet == null) {
                            setNewKeySet = setPutIfAbsent;
                        }
                        setNewKeySet.addAll(arrayList2);
                        f47968e.trace("Load Web translation strings for " + arrayList2 + ": " + concurrentHashMap);
                        r14 = r17;
                        Unit unit3 = Unit.INSTANCE;
                        r14.e(null);
                        return unit3;
                    }
                } else {
                    cVar2.f90978a = r18;
                    cVar2.f90979b = str;
                    cVar2.f90980c = listG;
                    cVar2.f90981d = this;
                    cVar2.f90982e = i14;
                    cVar2.f90983f = i16;
                    cVar2.f90986i = 3;
                    objA = hVar.a(str2, cVar2);
                    if (objA != aVar3) {
                        r15 = r18;
                        list = listG;
                        objC = objA;
                        i17 = i14;
                        i18 = i16;
                        aVar2 = this;
                        aVar2.getClass();
                        listG = g(list, (List) objC);
                        i16 = i18;
                        i14 = i17;
                        r16 = r15;
                        arrayList = new ArrayList(y.r(listG, 10));
                        while (r0.hasNext()) {
                            arrayList.add(new p(eVar.f90994d, eVar.f90993c));
                        }
                        p13.u0.j(concurrentHashMap, arrayList);
                        cVar2.f90978a = r16;
                        cVar2.f90979b = str;
                        cVar2.f90980c = null;
                        cVar2.f90981d = null;
                        cVar2.f90982e = i14;
                        cVar2.f90983f = i16;
                        cVar2.f90986i = 4;
                        objC = hVar.c(str, cVar2);
                        if (objC != aVar3) {
                            str3 = str;
                            r17 = r16;
                            List list5 = (List) objC;
                            arrayList2 = new ArrayList(y.r(list5, 10));
                            it = list5.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(u0.valueOf(((i42.d) it.next()).f90990d));
                            }
                            ConcurrentHashMap<c, Set<u0>> concurrentHashMap5 = this.f47971c;
                            c cVarA4 = c.a(str3);
                            setNewKeySet = concurrentHashMap5.get(cVarA4);
                            if (setNewKeySet == null) {
                                setNewKeySet = setPutIfAbsent;
                            }
                            setNewKeySet.addAll(arrayList2);
                            f47968e.trace("Load Web translation strings for " + arrayList2 + ": " + concurrentHashMap);
                            r14 = r17;
                            Unit unit4 = Unit.INSTANCE;
                            r14.e(null);
                            return unit4;
                        }
                    }
                }
                return aVar3;
            }
            i14 = cVar2.f90982e;
            z53.a aVar5 = cVar2.f90978a;
            r.b(objC);
            aVar = aVar5;
            if (!e()) {
                c.f47979b.getClass();
                String strA = c.a.a();
                cVar2.f90978a = aVar;
                cVar2.f90979b = strA;
                cVar2.f90982e = i14;
                cVar2.f90983f = 0;
                cVar2.f90986i = 2;
                Object objA2 = hVar.a(strA, cVar2);
                if (objA2 != aVar3) {
                    i15 = 0;
                    str = strA;
                    objC = objA2;
                    r18 = aVar;
                    i16 = i15;
                    listG = (List) objC;
                    c.f47979b.getClass();
                    str2 = c.f47980c;
                    if (s.g(str, str2)) {
                        r16 = r18;
                        arrayList = new ArrayList(y.r(listG, 10));
                        while (r0.hasNext()) {
                            arrayList.add(new p(eVar.f90994d, eVar.f90993c));
                        }
                        p13.u0.j(concurrentHashMap, arrayList);
                        cVar2.f90978a = r16;
                        cVar2.f90979b = str;
                        cVar2.f90980c = null;
                        cVar2.f90981d = null;
                        cVar2.f90982e = i14;
                        cVar2.f90983f = i16;
                        cVar2.f90986i = 4;
                        objC = hVar.c(str, cVar2);
                        if (objC != aVar3) {
                            str3 = str;
                            r17 = r16;
                            List list6 = (List) objC;
                            arrayList2 = new ArrayList(y.r(list6, 10));
                            it = list6.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(u0.valueOf(((i42.d) it.next()).f90990d));
                            }
                            ConcurrentHashMap<c, Set<u0>> concurrentHashMap6 = this.f47971c;
                            c cVarA5 = c.a(str3);
                            setNewKeySet = concurrentHashMap6.get(cVarA5);
                            if (setNewKeySet == null) {
                                setNewKeySet = setPutIfAbsent;
                            }
                            setNewKeySet.addAll(arrayList2);
                            f47968e.trace("Load Web translation strings for " + arrayList2 + ": " + concurrentHashMap);
                            r14 = r17;
                        }
                    } else {
                        cVar2.f90978a = r18;
                        cVar2.f90979b = str;
                        cVar2.f90980c = listG;
                        cVar2.f90981d = this;
                        cVar2.f90982e = i14;
                        cVar2.f90983f = i16;
                        cVar2.f90986i = 3;
                        objA = hVar.a(str2, cVar2);
                        if (objA != aVar3) {
                            r15 = r18;
                            list = listG;
                            objC = objA;
                            i17 = i14;
                            i18 = i16;
                            aVar2 = this;
                            aVar2.getClass();
                            listG = g(list, (List) objC);
                            i16 = i18;
                            i14 = i17;
                            r16 = r15;
                            arrayList = new ArrayList(y.r(listG, 10));
                            while (r0.hasNext()) {
                                arrayList.add(new p(eVar.f90994d, eVar.f90993c));
                            }
                            p13.u0.j(concurrentHashMap, arrayList);
                            cVar2.f90978a = r16;
                            cVar2.f90979b = str;
                            cVar2.f90980c = null;
                            cVar2.f90981d = null;
                            cVar2.f90982e = i14;
                            cVar2.f90983f = i16;
                            cVar2.f90986i = 4;
                            objC = hVar.c(str, cVar2);
                            if (objC != aVar3) {
                                str3 = str;
                                r17 = r16;
                                List list7 = (List) objC;
                                arrayList2 = new ArrayList(y.r(list7, 10));
                                it = list7.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(u0.valueOf(((i42.d) it.next()).f90990d));
                                }
                                ConcurrentHashMap<c, Set<u0>> concurrentHashMap7 = this.f47971c;
                                c cVarA6 = c.a(str3);
                                setNewKeySet = concurrentHashMap7.get(cVarA6);
                                if (setNewKeySet == null) {
                                    setNewKeySet = setPutIfAbsent;
                                }
                                setNewKeySet.addAll(arrayList2);
                                f47968e.trace("Load Web translation strings for " + arrayList2 + ": " + concurrentHashMap);
                                r14 = r17;
                            }
                        }
                    }
                }
                return aVar3;
            }
            r14 = aVar;
            Unit unit5 = Unit.INSTANCE;
            r14.e(null);
            return unit5;
        } catch (Throwable th5) {
            th = th5;
            r14 = r18;
        }
    }

    @Override // c22.x
    public final boolean e() {
        c.f47979b.getClass();
        return this.f47971c.containsKey(c.a(c.a.a()));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object f(u0 u0Var, String str, String str2, v13.c cVar) throws NoSuchAlgorithmException {
        i42.a aVar;
        String str3;
        u0 u0Var2;
        String str4 = str;
        if (cVar instanceof i42.a) {
            aVar = (i42.a) cVar;
            int i14 = aVar.f90965g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f90965g = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new i42.a(this, cVar);
            }
        } else {
            aVar = new i42.a(this, cVar);
        }
        i42.a aVar2 = aVar;
        Object objA = aVar2.f90963e;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar2.f90965g;
        if (i15 == 0) {
            r.b(objA);
            l lVar = (l) (this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getScope() : KoinComponent.DefaultImpls.getKoin(this).getScopeRegistry().getRootScope()).get((k23.d<?>) s0.f105811a.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
            String lowerCase = u0Var.name().toLowerCase(Locale.ROOT);
            String strC = zl.a.c(lowerCase, str2, "_", lowerCase);
            aVar2.f90959a = u0Var;
            aVar2.f90960b = str4;
            aVar2.f90961c = str2;
            aVar2.f90965g = 1;
            objA = lVar.a(strC, str4, aVar2);
            if (objA != aVar3) {
                str3 = str2;
                u0Var2 = u0Var;
            }
        }
        if (i15 != 1) {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ArrayList arrayList = aVar2.f90962d;
            r.b(objA);
            return arrayList;
        }
        String str5 = aVar2.f90961c;
        String str6 = aVar2.f90960b;
        u0Var2 = aVar2.f90959a;
        r.b(objA);
        str3 = str5;
        str4 = str6;
        Map map = (Map) objA;
        if (map.isEmpty()) {
            f.n("No strings found, treat it as a failure");
            return null;
        }
        ArrayList arrayList2 = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str7 = (String) entry.getKey();
            String str8 = (String) entry.getValue();
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
            byte[] bytes = str7.getBytes(d53.c.f57666b);
            bytes.getClass();
            byte[] bArrDigest = messageDigest.digest(bytes);
            bArrDigest.getClass();
            arrayList2.add(new e(0L, str7, str8, h0.k0(u.Z(8, bArrDigest), "", null, null, new bf(11), 30), 1, null));
        }
        String strName = u0Var2.name();
        aVar2.f90959a = null;
        aVar2.f90960b = null;
        aVar2.f90961c = null;
        aVar2.f90962d = arrayList2;
        aVar2.f90965g = 2;
        return this.f47969a.k(str4, str3, strName, arrayList2, aVar2) == aVar3 ? aVar3 : arrayList2;
    }

    @Override // org.koin.core.component.KoinComponent
    public final /* bridge */ Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.webtranslation.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/webtranslation/a$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0935a {
        public /* synthetic */ C0935a(j jVar) {
            this();
        }

        private C0935a() {
        }
    }
}
