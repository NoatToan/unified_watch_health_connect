package gw;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import lc.u0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lgw/p;", "", "", "Lnb2/a;", "liveTrackAddresses", "", "", "incidentDetectionContactLookupKeys", "<init>", "([Lnb2/a;Ljava/util/Set;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f79527d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nb2.a[] f79528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<String> f79529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m20.z f79530c;

    static {
        new a(null);
    }

    public p(nb2.a[] aVarArr, Set<String> set) {
        aVarArr.getClass();
        set.getClass();
        this.f79528a = aVarArr;
        this.f79529b = set;
        this.f79530c = (m20.z) KoinJavaComponent.get$default(m20.z.class, null, null, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0390  */
    /* JADX WARN: Code duplicated, block: B:103:0x0395  */
    /* JADX WARN: Code duplicated, block: B:106:0x039d  */
    /* JADX WARN: Code duplicated, block: B:108:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:110:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:115:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:117:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:122:0x019f A[EDGE_INSN: B:122:0x019f->B:60:0x019f BREAK  A[LOOP:1: B:47:0x0134->B:125:0x0134], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x01ed A[EDGE_INSN: B:136:0x01ed->B:77:0x01ed BREAK  A[LOOP:4: B:63:0x01ad->B:75:0x01e5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x01e2 A[EDGE_INSN: B:138:0x01e2->B:73:0x01e2 BREAK  A[LOOP:5: B:66:0x01c2->B:71:0x01db], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:42:0x00be  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d9 A[LOOP:0: B:43:0x00d3->B:45:0x00d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x0140  */
    /* JADX WARN: Code duplicated, block: B:52:0x0150  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x01db A[LOOP:5: B:66:0x01c2->B:71:0x01db, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x01e5 A[LOOP:4: B:63:0x01ad->B:75:0x01e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:91:0x0260  */
    /* JADX WARN: Code duplicated, block: B:93:0x026c  */
    /* JADX WARN: Code duplicated, block: B:94:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:95:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:99:0x0387  */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x03cb, code lost:
    
        if (r1 == r3) goto L112;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x026c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:94:0x02a7, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v13.c cVar) throws Throwable {
        q qVar;
        l20.r rVar;
        v2 v2Var;
        ArrayList arrayList;
        String str;
        o oVar;
        LinkedHashMap linkedHashMap;
        Iterator<T> it;
        boolean zHasNext;
        List<l20.n> list;
        nb2.a[] aVarArr;
        int length;
        int i14;
        List listB1;
        ArrayList arrayList2;
        List<l20.a> listF;
        Integer contactLimit;
        int iIntValue;
        String str2;
        Iterator<T> it3;
        nb2.a[] aVarArr2;
        Object next;
        l20.n nVar;
        char c14;
        long j8;
        l20.a aVar;
        ArrayList arrayList3;
        List<l20.c> listR;
        Iterator<T> it4;
        Object next2;
        String str3;
        Iterator<T> it5;
        Object next3;
        l20.n nVar2;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i15 = qVar.f79534d;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                qVar.f79534d = i15 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object objG = qVar.f79532b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i16 = qVar.f79534d;
        m20.z zVar = this.f79530c;
        int i17 = 5;
        Set<String> set = this.f79529b;
        nb2.a[] aVarArr3 = this.f79528a;
        String str4 = "MigrationLT&IDUseCase";
        if (i16 == 0) {
            o13.r.b(objG);
            if (aVarArr3.length != 0 || !set.isEmpty()) {
                qVar.f79534d = 1;
                objG = zVar.g(qVar);
                if (objG != obj) {
                }
                return obj;
            }
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "MigrationLT&IDUseCase", "No LT / ID data, nothing to migrate.");
            return null;
        }
        if (i16 == 1) {
            o13.r.b(objG);
        } else if (i16 == 2) {
            rVar = qVar.f79531a;
            o13.r.b(objG);
            v2Var = (v2) objG;
            if (v2Var instanceof v2.a) {
                i2.a aVar3 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var2, "MigrationLT&IDUseCase", "Failed to fetch phone contacts.");
                return null;
            }
            if (v2Var instanceof v2.b) {
                u0.r();
                return null;
            }
            Iterable<l20.n> iterable = (Iterable) ((v2.b) v2Var).f47386a;
            arrayList = new ArrayList(p13.y.r(iterable, 10));
            for (l20.n nVar3 : iterable) {
                Set setF1 = p13.h0.f1(p13.h0.S0(nVar3.f109031e, i17));
                Set setF2 = p13.h0.f1(p13.h0.S0(nVar3.f109032f, i17));
                long j14 = nVar3.f109027a;
                String str5 = nVar3.f109028b;
                String str6 = nVar3.f109029c;
                String str7 = nVar3.f109030d;
                str5.getClass();
                str6.getClass();
                str7.getClass();
                arrayList.add(new l20.n(j14, str5, str6, str7, setF1, setF2));
                str4 = str4;
                i17 = 5;
            }
            str = str4;
            oVar = new o(aVarArr3, set, arrayList);
            linkedHashMap = new LinkedHashMap();
            it = oVar.f79525b.iterator();
            while (true) {
                zHasNext = it.hasNext();
                list = oVar.f79526c;
                if (zHasNext) {
                    break;
                }
                str3 = (String) it.next();
                it5 = list.iterator();
                do {
                    if (it5.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it5.next();
                } while (!p005kotlin.jvm.internal.s.g(((l20.n) next3).f109028b, str3));
                nVar2 = (l20.n) next3;
                if (nVar2 != null) {
                    i2.a aVar4 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar4.getClass();
                    i2.a.b(a2Var3, "MigrationLT&IDMergeTask", "Found ID contact: " + nVar2 + ".");
                    linkedHashMap.put(Long.valueOf(nVar2.f109027a), com.garmin.android.apps.connectmobile.contacts.b.m(nVar2, 2));
                } else {
                    String strN = fb1.c.n("Cannot find ID contact with lookupKey = ", str3);
                    i2.a aVar5 = i2.f36769a;
                    a2 a2Var4 = a2.GENERAL;
                    aVar5.getClass();
                    i2.a.f(a2Var4, "MigrationLT&IDMergeTask", strN);
                }
            }
            aVarArr = oVar.f79524a;
            length = aVarArr.length;
            i14 = 0;
            while (i14 < length) {
                str2 = aVarArr[i14].f125255a;
                it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        aVarArr2 = aVarArr;
                        next = null;
                        break;
                    }
                    next = it3.next();
                    it4 = ((l20.n) next).f109032f.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            aVarArr2 = aVarArr;
                            next2 = null;
                            break;
                        }
                        next2 = it4.next();
                        aVarArr2 = aVarArr;
                        if (((l20.j) next2).f109005a.equals(str2)) {
                            break;
                        }
                        aVarArr = aVarArr2;
                    }
                    if (next2 != null) {
                        break;
                    }
                    aVarArr = aVarArr2;
                }
                nVar = (l20.n) next;
                if (nVar != null) {
                    j8 = nVar.f109027a;
                    aVar = (l20.a) linkedHashMap.get(Long.valueOf(j8));
                    if (aVar != null || (listR = aVar.r()) == null) {
                        c14 = '\n';
                        arrayList3 = null;
                    } else {
                        c14 = '\n';
                        ArrayList arrayList4 = new ArrayList(p13.y.r(listR, 10));
                        for (l20.c cVarB : listR) {
                            if (p005kotlin.jvm.internal.s.g(cVarB.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), str2)) {
                                cVarB = l20.c.b(cVarB, null, null, Integer.valueOf(l20.m.AUTO_LIVE_TRACK.f109026a), null, null, null, null, null, null, null, 0, 1048567);
                            }
                            arrayList4.add(cVarB);
                        }
                        arrayList3 = arrayList4;
                    }
                    if (aVar != null) {
                        i2.a aVar6 = i2.f36769a;
                        a2 a2Var5 = a2.GENERAL;
                        aVar6.getClass();
                        i2.a.b(a2Var5, "MigrationLT&IDMergeTask", "Found LT contact which also matches ID contact: " + nVar + ".");
                        linkedHashMap.put(Long.valueOf(j8), l20.a.g(aVar, null, null, null, null, Boolean.TRUE, null, arrayList3, null, null, 8111));
                    } else {
                        i2.a aVar7 = i2.f36769a;
                        a2 a2Var6 = a2.GENERAL;
                        aVar7.getClass();
                        i2.a.b(a2Var6, "MigrationLT&IDMergeTask", "Found LT contact: " + nVar + ".");
                        linkedHashMap.put(Long.valueOf(j8), l20.a.g(com.garmin.android.apps.connectmobile.contacts.b.m(nVar, 1), null, null, null, null, null, null, arrayList3, null, null, 8127));
                    }
                } else {
                    rVar = rVar;
                    length = length;
                    i14 = i14;
                    c14 = '\n';
                    String strM = am.j.m("Creating 'headless' LT contact for email address: ", str2, ".");
                    i2.a aVar8 = i2.f36769a;
                    a2 a2Var7 = a2.GENERAL;
                    aVar8.getClass();
                    i2.a.b(a2Var7, "MigrationLT&IDMergeTask", strM);
                    linkedHashMap.put(Long.valueOf(str2.hashCode()), new l20.a(null, str2, null, null, Boolean.TRUE, null, p13.x.m(new l20.c(null, str2, null, Integer.valueOf(l20.m.AUTO_LIVE_TRACK.f109026a), Integer.valueOf(l20.k.OTHER.f109012a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048549, null)), null, null, null, null, null, null, 8109, null));
                }
                i14++;
                rVar = rVar;
                aVarArr = aVarArr2;
                length = length;
            }
            l20.r rVar2 = rVar;
            listB1 = p13.h0.b1(linkedHashMap.values());
            arrayList2 = new ArrayList();
            arrayList2.addAll(listB1);
            listF = rVar2.f();
            if (listF != null) {
                arrayList2.addAll(listF);
            }
            contactLimit = rVar2.getContactLimit();
            if (contactLimit != null) {
                iIntValue = contactLimit.intValue();
            } else {
                iIntValue = 50;
            }
            if (arrayList2.size() > iIntValue) {
                String strG = am.j.g(arrayList2.size(), iIntValue, "GC contact limit exceeded: num contacts = ", ", contact limit = ", ". Cannot perform migration.");
                i2.a aVar9 = i2.f36769a;
                a2 a2Var8 = a2.GENERAL;
                aVar9.getClass();
                i2.a.b(a2Var8, str, strG);
                return new l20.h.a(arrayList2, iIntValue);
            }
            if (!listB1.isEmpty()) {
                i2.a aVar10 = i2.f36769a;
                a2 a2Var9 = a2.GENERAL;
                aVar10.getClass();
                i2.a.f(a2Var9, str, "Migration failed, no data after LT and ID contact merging.");
                return new l20.h.b();
            }
            qVar.f79531a = null;
            qVar.f79534d = 3;
            objG = b(listB1, arrayList2, qVar);
        } else {
            if (i16 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objG);
        }
        return (l20.h) objG;
        v2 v2Var2 = (v2) objG;
        if (v2Var2 instanceof v2.a) {
            i2.a aVar11 = i2.f36769a;
            a2 a2Var10 = a2.GENERAL;
            aVar11.getClass();
            i2.a.f(a2Var10, "MigrationLT&IDUseCase", "Failed to fetch GC contacts.");
            return null;
        }
        if (!(v2Var2 instanceof v2.b)) {
            u0.r();
            return null;
        }
        rVar = (l20.r) ((v2.b) v2Var2).f47386a;
        qVar.f79531a = rVar;
        qVar.f79534d = 2;
        int i18 = m20.z.f116054f;
        zVar.getClass();
        x53.c cVar2 = s0.f129406a;
        objG = ge1.b.e0(x53.b.f189152a, new m20.q(zVar, 5, 5, null), qVar);
        if (objG != obj) {
            v2Var = (v2) objG;
            if (v2Var instanceof v2.a) {
                i2.a aVar12 = i2.f36769a;
                a2 a2Var11 = a2.GENERAL;
                aVar12.getClass();
                i2.a.f(a2Var11, "MigrationLT&IDUseCase", "Failed to fetch phone contacts.");
                return null;
            }
            if (v2Var instanceof v2.b) {
                u0.r();
                return null;
            }
            Iterable<l20.n> iterable2 = (Iterable) ((v2.b) v2Var).f47386a;
            arrayList = new ArrayList(p13.y.r(iterable2, 10));
            while (r1.hasNext()) {
                Set setF3 = p13.h0.f1(p13.h0.S0(nVar3.f109031e, i17));
                Set setF4 = p13.h0.f1(p13.h0.S0(nVar3.f109032f, i17));
                long j15 = nVar3.f109027a;
                String str8 = nVar3.f109028b;
                String str9 = nVar3.f109029c;
                String str10 = nVar3.f109030d;
                str8.getClass();
                str9.getClass();
                str10.getClass();
                arrayList.add(new l20.n(j15, str8, str9, str10, setF3, setF4));
                str4 = str4;
                i17 = 5;
            }
            str = str4;
            oVar = new o(aVarArr3, set, arrayList);
            linkedHashMap = new LinkedHashMap();
            it = oVar.f79525b.iterator();
            while (true) {
                zHasNext = it.hasNext();
                list = oVar.f79526c;
                if (zHasNext) {
                    break;
                    break;
                }
                str3 = (String) it.next();
                it5 = list.iterator();
                do {
                    if (it5.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it5.next();
                } while (!p005kotlin.jvm.internal.s.g(((l20.n) next3).f109028b, str3));
                nVar2 = (l20.n) next3;
                if (nVar2 != null) {
                    i2.a aVar13 = i2.f36769a;
                    a2 a2Var12 = a2.GENERAL;
                    aVar13.getClass();
                    i2.a.b(a2Var12, "MigrationLT&IDMergeTask", "Found ID contact: " + nVar2 + ".");
                    linkedHashMap.put(Long.valueOf(nVar2.f109027a), com.garmin.android.apps.connectmobile.contacts.b.m(nVar2, 2));
                } else {
                    String strN2 = fb1.c.n("Cannot find ID contact with lookupKey = ", str3);
                    i2.a aVar14 = i2.f36769a;
                    a2 a2Var13 = a2.GENERAL;
                    aVar14.getClass();
                    i2.a.f(a2Var13, "MigrationLT&IDMergeTask", strN2);
                }
            }
            aVarArr = oVar.f79524a;
            length = aVarArr.length;
            i14 = 0;
            while (i14 < length) {
                str2 = aVarArr[i14].f125255a;
                it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        aVarArr2 = aVarArr;
                        next = null;
                        break;
                    }
                    next = it3.next();
                    it4 = ((l20.n) next).f109032f.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            aVarArr2 = aVarArr;
                            next2 = null;
                            break;
                        }
                        next2 = it4.next();
                        aVarArr2 = aVarArr;
                        if (((l20.j) next2).f109005a.equals(str2)) {
                            break;
                            break;
                        }
                        aVarArr = aVarArr2;
                    }
                    if (next2 != null) {
                        break;
                        break;
                    }
                    aVarArr = aVarArr2;
                }
                nVar = (l20.n) next;
                if (nVar != null) {
                    j8 = nVar.f109027a;
                    aVar = (l20.a) linkedHashMap.get(Long.valueOf(j8));
                    if (aVar != null) {
                        c14 = '\n';
                        arrayList3 = null;
                    } else {
                        c14 = '\n';
                        arrayList3 = null;
                    }
                    if (aVar != null) {
                        i2.a aVar15 = i2.f36769a;
                        a2 a2Var14 = a2.GENERAL;
                        aVar15.getClass();
                        i2.a.b(a2Var14, "MigrationLT&IDMergeTask", "Found LT contact which also matches ID contact: " + nVar + ".");
                        linkedHashMap.put(Long.valueOf(j8), l20.a.g(aVar, null, null, null, null, Boolean.TRUE, null, arrayList3, null, null, 8111));
                    } else {
                        i2.a aVar16 = i2.f36769a;
                        a2 a2Var15 = a2.GENERAL;
                        aVar16.getClass();
                        i2.a.b(a2Var15, "MigrationLT&IDMergeTask", "Found LT contact: " + nVar + ".");
                        linkedHashMap.put(Long.valueOf(j8), l20.a.g(com.garmin.android.apps.connectmobile.contacts.b.m(nVar, 1), null, null, null, null, null, null, arrayList3, null, null, 8127));
                    }
                } else {
                    rVar = rVar;
                    length = length;
                    i14 = i14;
                    c14 = '\n';
                    String strM2 = am.j.m("Creating 'headless' LT contact for email address: ", str2, ".");
                    i2.a aVar17 = i2.f36769a;
                    a2 a2Var16 = a2.GENERAL;
                    aVar17.getClass();
                    i2.a.b(a2Var16, "MigrationLT&IDMergeTask", strM2);
                    linkedHashMap.put(Long.valueOf(str2.hashCode()), new l20.a(null, str2, null, null, Boolean.TRUE, null, p13.x.m(new l20.c(null, str2, null, Integer.valueOf(l20.m.AUTO_LIVE_TRACK.f109026a), Integer.valueOf(l20.k.OTHER.f109012a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048549, null)), null, null, null, null, null, null, 8109, null));
                }
                i14++;
                rVar = rVar;
                aVarArr = aVarArr2;
                length = length;
            }
            l20.r rVar3 = rVar;
            listB1 = p13.h0.b1(linkedHashMap.values());
            arrayList2 = new ArrayList();
            arrayList2.addAll(listB1);
            listF = rVar3.f();
            if (listF != null) {
                arrayList2.addAll(listF);
            }
            contactLimit = rVar3.getContactLimit();
            if (contactLimit != null) {
                iIntValue = contactLimit.intValue();
            } else {
                iIntValue = 50;
            }
            if (arrayList2.size() > iIntValue) {
                String strG2 = am.j.g(arrayList2.size(), iIntValue, "GC contact limit exceeded: num contacts = ", ", contact limit = ", ". Cannot perform migration.");
                i2.a aVar18 = i2.f36769a;
                a2 a2Var17 = a2.GENERAL;
                aVar18.getClass();
                i2.a.b(a2Var17, str, strG2);
                return new l20.h.a(arrayList2, iIntValue);
            }
            if (!listB1.isEmpty()) {
                i2.a aVar19 = i2.f36769a;
                a2 a2Var18 = a2.GENERAL;
                aVar19.getClass();
                i2.a.f(a2Var18, str, "Migration failed, no data after LT and ID contact merging.");
                return new l20.h.b();
            }
            qVar.f79531a = null;
            qVar.f79534d = 3;
            objG = b(listB1, arrayList2, qVar);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(List list, ArrayList arrayList, v13.c cVar) {
        r rVar;
        ArrayList arrayList2;
        Object objI;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i14 = rVar.f79538d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f79538d = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, cVar);
            }
        } else {
            rVar = new r(this, cVar);
        }
        Object obj = rVar.f79536b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = rVar.f79538d;
        if (i15 == 0) {
            o13.r.b(obj);
            l20.r rVar2 = new l20.r(list, null, null, null, null, null, 62, null);
            arrayList2 = arrayList;
            rVar.f79535a = arrayList2;
            rVar.f79538d = 1;
            objI = this.f79530c.i(rVar2, rVar);
            if (objI == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ArrayList arrayList3 = rVar.f79535a;
            o13.r.b(obj);
            objI = obj;
            arrayList2 = arrayList3;
        }
        v2 v2Var = (v2) objI;
        if (v2Var instanceof v2.a) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "MigrationLT&IDUseCase", "Failed to save merged contacts.");
            return null;
        }
        if (!(v2Var instanceof v2.b)) {
            u0.r();
            return null;
        }
        f12.l.f68084a.getClass();
        f12.l.a.a().o3(cw.j.b(arrayList2));
        i2.a aVar3 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar3.getClass();
        i2.a.b(a2Var2, "MigrationLT&IDUseCase", "Migration successful: contacts saved.");
        GCMSettingManager.D();
        eq0.a.f65038b.a().N();
        i2.a.b(a2Var2, "MigrationLT&IDUseCase", "Deleted local ID and LT data.");
        return new l20.h.c();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgw/p$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
