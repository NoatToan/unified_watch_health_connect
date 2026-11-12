package ui1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lui1/l;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lpc0/j;", "devicesRepository", "Ll80/a;", "deviceDelegate", "Lui1/k;", "inReachApi", "<init>", "(Lpc0/j;Ll80/a;Lui1/k;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements com.garmin.android.apps.connectmobile.f0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f171314e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pc0.j f171315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.a f171316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f171317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pc0.n0 f171318d;

    public /* synthetic */ l(pc0.j jVar, l80.a aVar, k kVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        this((i14 & 1) != 0 ? (pc0.j) KoinJavaComponent.get$default(pc0.j.class, null, null, 6, null) : jVar, (i14 & 2) != 0 ? (l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null) : aVar, (i14 & 4) != 0 ? (k) ez0.b.a(ez0.b.f67468a, ez0.c.INREACH, k.class, new c83.h.a[0], null, null, null, 120) : kVar);
    }

    public static e b(long j8, String str) {
        String strD0;
        rd2.f.a().f152045a.getClass();
        sd2.f fVarI = rd2.j.i(j8, null);
        if (fVarI == null || (strD0 = fVarI.d0()) == null) {
            String str2 = str + ": No MAC address found for unitId=" + j8;
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "InReachSubscriptionRepository", str2);
            return null;
        }
        e eVar = (e) da2.d.b().getCapability(strD0, e.class);
        if (eVar != null) {
            return eVar;
        }
        String str3 = str + ": InReachMessagingProtobufHandler not available for unitId=" + j8;
        i2.a aVar2 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var2, "InReachSubscriptionRepository", str3);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Serializable a(long j8, v13.c cVar) {
        m mVar;
        ArrayList arrayList;
        yx2.j jVar;
        List<yx2.i> list;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f171321c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f171321c = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        m mVar2 = mVar;
        Object objE = mVar2.f171319a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar2.f171321c;
        if (i15 == 0) {
            o13.r.b(objE);
            Locale locale = Locale.getDefault();
            String country = locale.getCountry();
            String strD = hb2.h.d(locale);
            String strValueOf = String.valueOf(j8);
            mVar2.f171321c = 1;
            objE = xx2.b.e(false, country, strD, strValueOf, mVar2, 5);
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE);
        }
        yx2.n nVar = (yx2.n) ((xx2.e) objE).f192598a;
        if (nVar == null || (jVar = nVar.f200129b) == null || (list = jVar.f200105a) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (p005kotlin.jvm.internal.s.g(((yx2.i) obj).f200089b, "OUT_INRSMP_C_META_P")) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList == null) {
            return p13.j0.f134944a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            yx2.i iVar = (yx2.i) obj2;
            w13.c cVar2 = k0.f171312k;
            ArrayList arrayList3 = new ArrayList(p13.y.r(cVar2, 10));
            p13.c.b bVar = new p13.c.b();
            while (bVar.hasNext()) {
                arrayList3.add(((k0) bVar.next()).f171313a);
            }
            if (arrayList3.contains(iVar.f200088a) && iVar.f200098k) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0240  */
    /* JADX WARN: Code duplicated, block: B:101:0x0242  */
    /* JADX WARN: Code duplicated, block: B:104:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[LOOP:0: B:62:0x017a->B:106:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:? A[LOOP:2: B:89:0x021c->B:113:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:49:0x0114  */
    /* JADX WARN: Code duplicated, block: B:52:0x0122  */
    /* JADX WARN: Code duplicated, block: B:53:0x0124  */
    /* JADX WARN: Code duplicated, block: B:56:0x0162  */
    /* JADX WARN: Code duplicated, block: B:61:0x0176  */
    /* JADX WARN: Code duplicated, block: B:64:0x0180  */
    /* JADX WARN: Code duplicated, block: B:70:0x0199 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x019b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:73:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:88:0x0218  */
    /* JADX WARN: Code duplicated, block: B:91:0x0222  */
    /* JADX WARN: Code duplicated, block: B:94:0x0232  */
    /* JADX WARN: Code duplicated, block: B:96:0x0237  */
    /* JADX WARN: Code duplicated, block: B:97:0x023a  */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x01a7, please report this as an issue */
    public final Object c(long j8, v13.c cVar) {
        n nVar;
        long j14;
        int i14;
        List list;
        boolean zBooleanValue;
        e eVarB;
        Object objD;
        boolean z14;
        int i15;
        boolean zBooleanValue2;
        Object objI;
        boolean z15;
        boolean z16;
        boolean zBooleanValue3;
        Object objH;
        boolean z17;
        boolean z18;
        int i16;
        List list2;
        long j15;
        boolean zBooleanValue4;
        boolean z19;
        a2 a2Var;
        pc0.n0 n0Var;
        Set<Long> setI;
        Iterator<T> it;
        j jVar;
        Iterator<T> it3;
        boolean zM;
        boolean z24;
        Set<Long> setI2;
        Iterator<T> it4;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i17 = nVar.f171330i;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                nVar.f171330i = i17 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object objS = nVar.f171328g;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i18 = nVar.f171330i;
        if (i18 == 0) {
            o13.r.b(objS);
            j14 = j8;
            nVar.f171322a = j14;
            nVar.f171330i = 1;
            objS = this.f171316b.s(false, nVar);
            if (objS != obj) {
            }
            return obj;
        }
        if (i18 == 1) {
            j14 = nVar.f171322a;
            o13.r.b(objS);
        } else {
            if (i18 == 2) {
                i14 = nVar.f171324c;
                j14 = nVar.f171322a;
                list = nVar.f171323b;
                o13.r.b(objS);
                zBooleanValue = ((Boolean) objS).booleanValue();
                nVar.f171323b = list;
                nVar.f171322a = j14;
                nVar.f171324c = i14;
                nVar.f171325d = zBooleanValue;
                nVar.f171330i = 3;
                eVarB = b(j14, "isInReachMessagingActivatedOnDevice");
                if (eVarB == null) {
                    objD = Boolean.FALSE;
                } else {
                    objD = eVarB.d(nVar);
                }
                if (objD != obj) {
                    int i19 = i14;
                    z14 = zBooleanValue;
                    objS = objD;
                    i15 = i19;
                    zBooleanValue2 = ((Boolean) objS).booleanValue();
                    nVar.f171323b = list;
                    nVar.f171322a = j14;
                    nVar.f171324c = i15;
                    nVar.f171325d = z14;
                    nVar.f171326e = zBooleanValue2;
                    nVar.f171330i = 4;
                    objI = i(j14, nVar);
                    if (objI != obj) {
                        boolean z25 = z14;
                        z15 = zBooleanValue2;
                        objS = objI;
                        z16 = z25;
                        zBooleanValue3 = ((Boolean) objS).booleanValue();
                        nVar.f171323b = list;
                        nVar.f171322a = j14;
                        nVar.f171324c = i15;
                        nVar.f171325d = z16;
                        nVar.f171326e = z15;
                        nVar.f171327f = zBooleanValue3;
                        nVar.f171330i = 5;
                        objH = h(j14, nVar);
                        if (objH != obj) {
                            z17 = zBooleanValue3;
                            objS = objH;
                            z18 = z16;
                            i16 = i15;
                            list2 = list;
                            j15 = j14;
                        }
                    }
                }
                return obj;
            }
            if (i18 == 3) {
                z14 = nVar.f171325d;
                i15 = nVar.f171324c;
                j14 = nVar.f171322a;
                list = nVar.f171323b;
                o13.r.b(objS);
                zBooleanValue2 = ((Boolean) objS).booleanValue();
                nVar.f171323b = list;
                nVar.f171322a = j14;
                nVar.f171324c = i15;
                nVar.f171325d = z14;
                nVar.f171326e = zBooleanValue2;
                nVar.f171330i = 4;
                objI = i(j14, nVar);
                if (objI != obj) {
                    boolean z26 = z14;
                    z15 = zBooleanValue2;
                    objS = objI;
                    z16 = z26;
                    zBooleanValue3 = ((Boolean) objS).booleanValue();
                    nVar.f171323b = list;
                    nVar.f171322a = j14;
                    nVar.f171324c = i15;
                    nVar.f171325d = z16;
                    nVar.f171326e = z15;
                    nVar.f171327f = zBooleanValue3;
                    nVar.f171330i = 5;
                    objH = h(j14, nVar);
                    if (objH != obj) {
                        z17 = zBooleanValue3;
                        objS = objH;
                        z18 = z16;
                        i16 = i15;
                        list2 = list;
                        j15 = j14;
                    }
                }
                return obj;
            }
            if (i18 == 4) {
                z15 = nVar.f171326e;
                z16 = nVar.f171325d;
                i15 = nVar.f171324c;
                j14 = nVar.f171322a;
                list = nVar.f171323b;
                o13.r.b(objS);
                zBooleanValue3 = ((Boolean) objS).booleanValue();
                nVar.f171323b = list;
                nVar.f171322a = j14;
                nVar.f171324c = i15;
                nVar.f171325d = z16;
                nVar.f171326e = z15;
                nVar.f171327f = zBooleanValue3;
                nVar.f171330i = 5;
                objH = h(j14, nVar);
                if (objH != obj) {
                    z17 = zBooleanValue3;
                    objS = objH;
                    z18 = z16;
                    i16 = i15;
                    list2 = list;
                    j15 = j14;
                }
                return obj;
            }
            if (i18 != 5) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z17 = nVar.f171327f;
            z15 = nVar.f171326e;
            z18 = nVar.f171325d;
            i16 = nVar.f171324c;
            j15 = nVar.f171322a;
            list2 = nVar.f171323b;
            o13.r.b(objS);
        }
        zBooleanValue4 = ((Boolean) objS).booleanValue();
        if (i16 != 0) {
            z19 = true;
        } else {
            z19 = false;
        }
        StringBuilder sb3 = new StringBuilder("getSubscriptionDestination: unitId=");
        sb3.append(j15);
        sb3.append(", hasActiveSubscription=");
        sb3.append(z19);
        com.airbnb.lottie.animation.keyframe.a.v(", isSubscriptionActiveForImei=", ", isInReachActiveOnDevice=", sb3, z18, z15);
        sb3.append(", isExistingUser=");
        sb3.append(z17);
        sb3.append(", directActivationCapableDevice=");
        sb3.append(zBooleanValue4);
        String string = sb3.toString();
        i2.a aVar = i2.f36769a;
        a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "InReachSubscriptionRepository", string);
        n0Var = this.f171318d;
        if (i16 != 0) {
            setI2 = n0Var.i();
            if ((setI2 instanceof Collection) || !setI2.isEmpty()) {
                it4 = setI2.iterator();
                while (it4.hasNext()) {
                    if (((Number) it4.next()).longValue() == j15) {
                        n0Var.g(j15, true);
                        break;
                    }
                }
            }
            if (!z18 && z15) {
                jVar = j.GO_TO_PLAN_MANAGEMENT;
            } else if (z18 || z15) {
                jVar = j.GO_TO_UAC;
            } else {
                jVar = j.GO_TO_PLAN_MANAGEMENT;
            }
        } else {
            if (list2 != null) {
                Set<Long> setI3 = n0Var.i();
                i2.a.b(a2Var, "InReachSubscriptionRepository", "refreshStoredDeviceSubscriptionStatuses: activeUnitIds=" + list2 + ", storedUnitIds=" + setI3);
                it3 = setI3.iterator();
                while (it3.hasNext()) {
                    long jLongValue = ((Number) it3.next()).longValue();
                    zM = n0Var.m(jLongValue);
                    boolean zContains = list2.contains(Long.valueOf(jLongValue));
                    n0Var.g(jLongValue, zContains);
                    if (!zM && !zContains) {
                        String strF = androidx.room.a0.f(jLongValue, "refreshStoredDeviceSubscriptionStatuses: removing device ", " from local cache because it no longer has an active subscription");
                        i2.a aVar2 = i2.f36769a;
                        a2 a2Var2 = a2.GENERAL;
                        aVar2.getClass();
                        i2.a.b(a2Var2, "InReachSubscriptionRepository", strF);
                        n0Var.b(jLongValue);
                    }
                }
            }
            setI = n0Var.i();
            if ((setI instanceof Collection) || !setI.isEmpty()) {
                it = setI.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((Number) it.next()).longValue() == j15) {
                            if (zBooleanValue4) {
                                jVar = j.GO_TO_PLAN_MANAGEMENT;
                            }
                        }
                    }
                    if (z17) {
                        jVar = j.GO_TO_MESSENGER;
                    } else {
                        jVar = j.GO_TO_UAC;
                    }
                }
            } else if (z17) {
                jVar = j.GO_TO_MESSENGER;
            } else {
                jVar = j.GO_TO_UAC;
            }
        }
        if (i16 != 0) {
            z24 = true;
        } else {
            z24 = false;
        }
        return new i0(jVar, zBooleanValue4, z24);
        List list3 = (List) objS;
        i14 = (list3 == null || !list3.contains(new Long(j14))) ? 0 : 1;
        nVar.f171323b = list3;
        nVar.f171322a = j14;
        nVar.f171324c = i14;
        nVar.f171330i = 2;
        Object objK = k(j14, nVar);
        if (objK != obj) {
            list = list3;
            objS = objK;
            zBooleanValue = ((Boolean) objS).booleanValue();
            nVar.f171323b = list;
            nVar.f171322a = j14;
            nVar.f171324c = i14;
            nVar.f171325d = zBooleanValue;
            nVar.f171330i = 3;
            eVarB = b(j14, "isInReachMessagingActivatedOnDevice");
            if (eVarB == null) {
                objD = Boolean.FALSE;
            } else {
                objD = eVarB.d(nVar);
            }
            if (objD != obj) {
                int i110 = i14;
                z14 = zBooleanValue;
                objS = objD;
                i15 = i110;
                zBooleanValue2 = ((Boolean) objS).booleanValue();
                nVar.f171323b = list;
                nVar.f171322a = j14;
                nVar.f171324c = i15;
                nVar.f171325d = z14;
                nVar.f171326e = zBooleanValue2;
                nVar.f171330i = 4;
                objI = i(j14, nVar);
                if (objI != obj) {
                    boolean z27 = z14;
                    z15 = zBooleanValue2;
                    objS = objI;
                    z16 = z27;
                    zBooleanValue3 = ((Boolean) objS).booleanValue();
                    nVar.f171323b = list;
                    nVar.f171322a = j14;
                    nVar.f171324c = i15;
                    nVar.f171325d = z16;
                    nVar.f171326e = z15;
                    nVar.f171327f = zBooleanValue3;
                    nVar.f171330i = 5;
                    objH = h(j14, nVar);
                    if (objH != obj) {
                        z17 = zBooleanValue3;
                        objS = objH;
                        z18 = z16;
                        i16 = i15;
                        list2 = list;
                        j15 = j14;
                        zBooleanValue4 = ((Boolean) objS).booleanValue();
                        if (i16 != 0) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        StringBuilder sb4 = new StringBuilder("getSubscriptionDestination: unitId=");
                        sb4.append(j15);
                        sb4.append(", hasActiveSubscription=");
                        sb4.append(z19);
                        com.airbnb.lottie.animation.keyframe.a.v(", isSubscriptionActiveForImei=", ", isInReachActiveOnDevice=", sb4, z18, z15);
                        sb4.append(", isExistingUser=");
                        sb4.append(z17);
                        sb4.append(", directActivationCapableDevice=");
                        sb4.append(zBooleanValue4);
                        String string2 = sb4.toString();
                        i2.a aVar3 = i2.f36769a;
                        a2Var = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.b(a2Var, "InReachSubscriptionRepository", string2);
                        n0Var = this.f171318d;
                        if (i16 != 0) {
                            setI2 = n0Var.i();
                            if (setI2 instanceof Collection) {
                                it4 = setI2.iterator();
                                while (it4.hasNext()) {
                                    if (((Number) it4.next()).longValue() == j15) {
                                        n0Var.g(j15, true);
                                        break;
                                    }
                                }
                            } else {
                                it4 = setI2.iterator();
                                while (it4.hasNext()) {
                                    if (((Number) it4.next()).longValue() == j15) {
                                        n0Var.g(j15, true);
                                        break;
                                    }
                                }
                            }
                            if (!z18) {
                                if (z18) {
                                    jVar = j.GO_TO_UAC;
                                } else {
                                    jVar = j.GO_TO_UAC;
                                }
                            } else if (z18) {
                                jVar = j.GO_TO_UAC;
                            } else {
                                jVar = j.GO_TO_UAC;
                            }
                        } else {
                            if (list2 != null) {
                                Set<Long> setI4 = n0Var.i();
                                i2.a.b(a2Var, "InReachSubscriptionRepository", "refreshStoredDeviceSubscriptionStatuses: activeUnitIds=" + list2 + ", storedUnitIds=" + setI4);
                                it3 = setI4.iterator();
                                while (it3.hasNext()) {
                                    long jLongValue2 = ((Number) it3.next()).longValue();
                                    zM = n0Var.m(jLongValue2);
                                    boolean zContains2 = list2.contains(Long.valueOf(jLongValue2));
                                    n0Var.g(jLongValue2, zContains2);
                                    if (!zM) {
                                    }
                                }
                            }
                            setI = n0Var.i();
                            if (setI instanceof Collection) {
                                it = setI.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((Number) it.next()).longValue() == j15) {
                                            if (zBooleanValue4) {
                                                jVar = j.GO_TO_PLAN_MANAGEMENT;
                                            }
                                        }
                                    }
                                    if (z17) {
                                        jVar = j.GO_TO_MESSENGER;
                                    } else {
                                        jVar = j.GO_TO_UAC;
                                    }
                                }
                            } else {
                                it = setI.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((Number) it.next()).longValue() == j15) {
                                            if (zBooleanValue4) {
                                                jVar = j.GO_TO_PLAN_MANAGEMENT;
                                            }
                                        }
                                    }
                                    if (z17) {
                                        jVar = j.GO_TO_MESSENGER;
                                    } else {
                                        jVar = j.GO_TO_UAC;
                                    }
                                }
                            }
                        }
                        if (i16 != 0) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        return new i0(jVar, zBooleanValue4, z24);
                    }
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object d(long j8, v13.c cVar) {
        o oVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f171345c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f171345c = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object objJ = oVar.f171343a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar.f171345c;
        if (i15 == 0) {
            o13.r.b(objJ);
            p pVar = new p(this, j8, null);
            oVar.f171345c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, pVar, oVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        v2.b bVar = v2Var instanceof v2.b ? (v2.b) v2Var : null;
        if (bVar != null) {
            return (j0) bVar.f47386a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(long j8, v13.c cVar) {
        q qVar;
        Long lJ;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i14 = qVar.f171360d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                qVar.f171360d = i14 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object objB = qVar.f171358b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = qVar.f171360d;
        boolean z14 = false;
        if (i15 == 0) {
            o13.r.b(objB);
            qVar.f171357a = j8;
            qVar.f171360d = 1;
            objB = xx2.b.b(false, qVar);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = qVar.f171357a;
            o13.r.b(objB);
        }
        List<yx2.c> list = (List) ((xx2.e) objB).f192598a;
        if (list != null && !list.isEmpty()) {
            for (yx2.c cVar2 : list) {
                List<yx2.d> list2 = cVar2.f200068w;
                if (list2 != null && !list2.isEmpty()) {
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        String str = ((yx2.d) it.next()).f200072c;
                        if (str != null && (lJ = d53.t.j(str)) != null && j8 == lJ.longValue()) {
                            if (!p005kotlin.jvm.internal.s.g(cVar2.f200057j, "OUT_INRSMP_C_META_P")) {
                                break;
                            }
                            z14 = true;
                            break;
                        }
                    }
                }
            }
        }
        return Boolean.valueOf(z14);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object g(long j8, v13.c cVar) {
        r rVar;
        List<b> listB;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i14 = rVar.f171366c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f171366c = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, cVar);
            }
        } else {
            rVar = new r(this, cVar);
        }
        Object objJ = rVar.f171364a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = rVar.f171366c;
        if (i15 == 0) {
            o13.r.b(objJ);
            s sVar = new s(this, j8, null);
            rVar.f171366c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, sVar, rVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        return Boolean.valueOf((v2Var instanceof v2.b) && (listB = ((d) ((v2.b) v2Var).f47386a).b()) != null && (listB.isEmpty() ^ true));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object h(long j8, v13.c cVar) {
        t tVar;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i14 = tVar.f171383c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                tVar.f171383c = i14 - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        Object objG = tVar.f171381a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = tVar.f171383c;
        if (i15 == 0) {
            o13.r.b(objG);
            String strValueOf = String.valueOf(j8);
            tVar.f171383c = 1;
            objG = this.f171315a.g(strValueOf, tVar);
            if (objG == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objG);
        }
        v2 v2Var = (v2) objG;
        boolean zBooleanValue = false;
        if (!(v2Var instanceof v2.a)) {
            if (!(v2Var instanceof v2.b)) {
                lc.u0.r();
                return null;
            }
            Boolean boolS = ((com.garmin.android.apps.connectmobile.devices.model.m) ((v2.b) v2Var).f47386a).getInReachServicesDirectActivationCapable();
            if (boolS != null) {
                zBooleanValue = boolS.booleanValue();
            }
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object i(long j8, v13.c cVar) {
        u uVar;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i14 = uVar.f171390c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                uVar.f171390c = i14 - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        Object objJ = uVar.f171388a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = uVar.f171390c;
        if (i15 == 0) {
            o13.r.b(objJ);
            v vVar = new v(this, j8, null);
            uVar.f171390c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, vVar, uVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        return Boolean.valueOf(v2Var instanceof v2.b ? ((a1) ((v2.b) v2Var).f47386a).getUseMessengerForActivation() : false);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0078 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (r9 == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(long j8, v13.c cVar) {
        w wVar;
        Object objK;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i14 = wVar.f171404d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                wVar.f171404d = i14 - Integer.MIN_VALUE;
            } else {
                wVar = new w(this, cVar);
            }
        } else {
            wVar = new w(this, cVar);
        }
        Object objF = wVar.f171402b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = wVar.f171404d;
        if (i15 == 0) {
            o13.r.b(objF);
            wVar.f171401a = j8;
            wVar.f171404d = 1;
            objF = f(j8, wVar);
            if (objF != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            j8 = wVar.f171401a;
            o13.r.b(objF);
        } else {
            if (i15 != 2) {
                if (i15 == 3) {
                    o13.r.b(objF);
                    return objF;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = wVar.f171401a;
            o13.r.b(objF);
        }
        if (!((Boolean) objF).booleanValue()) {
            return Boolean.FALSE;
        }
        wVar.f171401a = j8;
        wVar.f171404d = 3;
        objK = k(j8, wVar);
        if (objK != obj) {
            return obj;
        }
        return objK;
        if (((Boolean) objF).booleanValue()) {
            wVar.f171401a = j8;
            wVar.f171404d = 3;
            objK = k(j8, wVar);
            if (objK != obj) {
                return objK;
            }
        } else {
            wVar.f171401a = j8;
            wVar.f171404d = 2;
            objF = i(j8, wVar);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object k(long j8, v13.c cVar) {
        x xVar;
        boolean z14;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i14 = xVar.f171410c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                xVar.f171410c = i14 - Integer.MIN_VALUE;
            } else {
                xVar = new x(this, cVar);
            }
        } else {
            xVar = new x(this, cVar);
        }
        Object objJ = xVar.f171408a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = xVar.f171410c;
        if (i15 == 0) {
            o13.r.b(objJ);
            y yVar = new y(this, j8, null);
            xVar.f171410c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, yVar, xVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            b0 b0Var = (b0) ((v2.b) v2Var).f47386a;
            z14 = b0Var.getUserHasExploreAccount() && b0Var.getInReachActive() && b0Var.getInReachUnderExploreUserTenant() && b0Var.getInReachAssignedToExploreUser();
        }
        return Boolean.valueOf(z14);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum l(String str, v13.c cVar) {
        z zVar;
        boolean z14;
        boolean z15;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i14 = zVar.f171417d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                zVar.f171417d = i14 - Integer.MIN_VALUE;
            } else {
                zVar = new z(this, cVar);
            }
        } else {
            zVar = new z(this, cVar);
        }
        Object objJ = zVar.f171415b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = zVar.f171417d;
        boolean z16 = true;
        if (i15 == 0) {
            o13.r.b(objJ);
            if (str == null || str.length() == 0) {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "InReachSubscriptionRepository", "Reference ID is null or empty, cannot check subscription purchase status.");
                return com.garmin.android.apps.connectmobile.device.setup.domain.model.a.b.UNKNOWN;
            }
            a0 a0Var = new a0(this, str, null);
            zVar.f171414a = str;
            zVar.f171417d = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, a0Var, zVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = zVar.f171414a;
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        i2.a aVar3 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar3.getClass();
        i2.a.b(a2Var2, "InReachSubscriptionRepository", "Requested job status for referenceId[" + str + "], received " + v2Var);
        if (!(v2Var instanceof v2.b)) {
            return com.garmin.android.apps.connectmobile.device.setup.domain.model.a.b.UNKNOWN;
        }
        List list = (List) ((v2.b) v2Var).f47386a;
        if (list.isEmpty()) {
            return com.garmin.android.apps.connectmobile.device.setup.domain.model.a.b.UNKNOWN;
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z14 = false;
                    break;
                }
                if (((com.garmin.android.apps.connectmobile.device.setup.domain.model.a) it.next()).getJobStatus() == com.garmin.android.apps.connectmobile.device.setup.domain.model.a.b.PROCESSING) {
                    z14 = true;
                    break;
                }
            }
        } else {
            z14 = false;
            break;
        }
        if (!list.isEmpty()) {
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z15 = false;
                    break;
                }
                if (((com.garmin.android.apps.connectmobile.device.setup.domain.model.a) it3.next()).getJobStatus() == com.garmin.android.apps.connectmobile.device.setup.domain.model.a.b.FAILED) {
                    z15 = true;
                    break;
                }
            }
        } else {
            z15 = false;
            break;
        }
        if (!list.isEmpty()) {
            Iterator it4 = list.iterator();
            do {
                if (!it4.hasNext()) {
                    z16 = false;
                    break;
                }
            } while (((com.garmin.android.apps.connectmobile.device.setup.domain.model.a) it4.next()).getJobStatus() != com.garmin.android.apps.connectmobile.device.setup.domain.model.a.b.READY);
        } else {
            z16 = false;
            break;
        }
        if (z14) {
            return com.garmin.android.apps.connectmobile.device.setup.domain.model.a.b.PROCESSING;
        }
        if (z15) {
            return com.garmin.android.apps.connectmobile.device.setup.domain.model.a.b.FAILED;
        }
        return z16 ? com.garmin.android.apps.connectmobile.device.setup.domain.model.a.b.READY : com.garmin.android.apps.connectmobile.device.setup.domain.model.a.b.FINISHED;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lui1/l$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static l a() {
            return new l(null, null, null, 7, null);
        }

        private a() {
        }
    }

    public l(pc0.j jVar, l80.a aVar, k kVar) {
        jVar.getClass();
        aVar.getClass();
        kVar.getClass();
        this.f171315a = jVar;
        this.f171316b = aVar;
        this.f171317c = kVar;
        this.f171318d = (pc0.n0) KoinJavaComponent.get$default(pc0.n0.class, null, null, 6, null);
    }

    public l() {
        this(null, null, null, 7, null);
    }
}
