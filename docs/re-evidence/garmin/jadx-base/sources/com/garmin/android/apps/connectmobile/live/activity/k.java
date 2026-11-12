package com.garmin.android.apps.connectmobile.live.activity;

import am.x0;
import au0.h0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import o53.c0;
import o53.s0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p13.j0;
import r53.c2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/live/activity/k;", "Lvf2/m;", "Lou1/d;", "getExerciseListWithTranslationUseCase", "Lcom/garmin/android/apps/connectmobile/live/activity/i;", "cacheManager", "<init>", "(Lou1/d;Lcom/garmin/android/apps/connectmobile/live/activity/i;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k implements vf2.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f38433c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ou1.d f38434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f38435b;

    static {
        new a(null);
    }

    public k(ou1.d dVar, i iVar) {
        dVar.getClass();
        iVar.getClass();
        this.f38434a = dVar;
        this.f38435b = iVar;
        x53.c cVar = s0.f129406a;
        ge1.b.T(c0.a(x53.b.f189152a), null, null, new p(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0139  */
    /* JADX WARN: Code duplicated, block: B:63:0x0143  */
    /* JADX WARN: Code duplicated, block: B:66:0x0149  */
    /* JADX WARN: Code duplicated, block: B:69:0x014f  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    @Override // vf2.m
    public final Object a(String str, String str2, String str3, v13.c cVar) {
        l lVar;
        com.garmin.android.apps.connectmobile.repcounting.model.d dVar;
        Object next;
        com.garmin.android.apps.connectmobile.repcounting.model.d dVarD;
        com.garmin.android.apps.connectmobile.repcounting.model.c cVar2;
        List list;
        List list2;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f38441f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f38441f = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objC = lVar.f38439d;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f38441f;
        if (i15 == 0) {
            o13.r.b(objC);
            h0.f12930a.getClass();
            x0 x0VarA = h0.a.a(str4);
            if (x0VarA == null) {
                String strM = am.j.m("getExerciseData Error: conversion activityTypeKey:", str4, " to ActivityType result null");
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.f(a2Var, "LiveActivityExerciseProviderImpl", strM);
                return null;
            }
            LinkedHashMap linkedHashMap = this.f38435b.f38426b;
            ArrayList arrayList = new ArrayList();
            i.a aVarB = i.b(x0VarA);
            com.garmin.android.apps.connectmobile.repcounting.model.c cVar3 = linkedHashMap.containsKey(aVarB) ? (com.garmin.android.apps.connectmobile.repcounting.model.c) linkedHashMap.get(aVarB) : null;
            if (cVar3 != null) {
                arrayList.add(cVar3);
            }
            i.a aVarB2 = i.b(x0VarA);
            w13.c cVar4 = i.a.f38431e;
            dVar = null;
            ArrayList<i.a> arrayList2 = new ArrayList();
            Iterator it = cVar4.iterator();
            while (it.hasNext()) {
                Object next2 = it.next();
                Iterator it3 = it;
                if (((i.a) next2) != aVarB2) {
                    arrayList2.add(next2);
                }
                it = it3;
            }
            for (i.a aVar2 : arrayList2) {
                if (linkedHashMap.containsKey(aVar2) && linkedHashMap.get(aVar2) != null && (cVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.c) linkedHashMap.get(aVar2)) != null) {
                    arrayList.add(cVar2);
                }
            }
            Iterator it4 = arrayList.iterator();
            do {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
            } while (((com.garmin.android.apps.connectmobile.repcounting.model.c) next).D(str5, str6) == null);
            com.garmin.android.apps.connectmobile.repcounting.model.c cVar5 = (com.garmin.android.apps.connectmobile.repcounting.model.c) next;
            if (cVar5 == null || (dVarD = cVar5.D(str5, str6)) == null) {
                StringBuilder sbI = p6.b.i("Exercise not found in cache getPriorityExerciseList for activityTypeKey:", str4, ", category:", str5, ", name:");
                sbI.append(str6);
                String string = sbI.toString();
                i2.a aVar3 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar3.getClass();
                i2.a.p(a2Var2, "LiveActivityExerciseProviderImpl", string);
                lVar.f38436a = str4;
                lVar.f38437b = str5;
                lVar.f38438c = str6;
                lVar.f38441f = 1;
                objC = c(x0VarA, lVar);
                if (objC == obj) {
                    return obj;
                }
            }
            if (dVarD != null) {
                StringBuilder sbI2 = p6.b.i("Exercise not found via getExerciseList for activityTypeKey:", str4, ", category:", str5, ", name:");
                sbI2.append(str6);
                String string2 = sbI2.toString();
                i2.a aVar4 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar4.getClass();
                i2.a.p(a2Var3, "LiveActivityExerciseProviderImpl", string2);
                return dVar;
            }
            String str7 = dVarD.f41107f;
            String str8 = dVarD.f41103b;
            list = dVarD.f41108g;
            if (list == null) {
                list = j0.f134944a;
            }
            list2 = dVarD.f41109h;
            if (list2 == null) {
                list2 = j0.f134944a;
            }
            return new vf2.c(str7, str8, list, list2);
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        String str9 = lVar.f38438c;
        str5 = lVar.f38437b;
        String str10 = lVar.f38436a;
        o13.r.b(objC);
        str6 = str9;
        str4 = str10;
        dVar = null;
        com.garmin.android.apps.connectmobile.repcounting.model.c cVar6 = (com.garmin.android.apps.connectmobile.repcounting.model.c) objC;
        dVarD = cVar6 != null ? cVar6.D(str5, str6) : dVar;
        if (dVarD != null) {
            StringBuilder sbI3 = p6.b.i("Exercise not found via getExerciseList for activityTypeKey:", str4, ", category:", str5, ", name:");
            sbI3.append(str6);
            String string3 = sbI3.toString();
            i2.a aVar5 = i2.f36769a;
            a2 a2Var4 = a2.GENERAL;
            aVar5.getClass();
            i2.a.p(a2Var4, "LiveActivityExerciseProviderImpl", string3);
            return dVar;
        }
        String str11 = dVarD.f41107f;
        String str12 = dVarD.f41103b;
        list = dVarD.f41108g;
        if (list == null) {
            list = j0.f134944a;
        }
        list2 = dVarD.f41109h;
        if (list2 == null) {
            list2 = j0.f134944a;
        }
        return new vf2.c(str11, str12, list, list2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // vf2.m
    public final Serializable b(String str, v13.c cVar) {
        o oVar;
        com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArrF;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f38449c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f38449c = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object objC = oVar.f38447a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar.f38449c;
        if (i15 == 0) {
            o13.r.b(objC);
            h0.f12930a.getClass();
            x0 x0VarA = h0.a.a(str);
            if (x0VarA == null) {
                String strN = fb1.c.n("No GCMActivityType found for key ", str);
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "LiveActivityExerciseProviderImpl", strN);
                return j0.f134944a;
            }
            oVar.f38449c = 1;
            objC = c(x0VarA, oVar);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
        }
        com.garmin.android.apps.connectmobile.repcounting.model.c cVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.c) objC;
        if (cVar2 == null || (dVarArrF = cVar2.F()) == null) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(dVarArrF.length);
        for (com.garmin.android.apps.connectmobile.repcounting.model.d dVar : dVarArrF) {
            arrayList.add(new vf2.e(dVar.f41102a, dVar.f41103b, dVar.f41105d, dVar.f41106e, dVar.f41107f));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object c(x0 x0Var, v13.c cVar) {
        m mVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f38445d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f38445d = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objW = mVar.f38443b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f38445d;
        i iVar = this.f38435b;
        try {
            if (i15 == 0) {
                o13.r.b(objW);
                LinkedHashMap linkedHashMap = iVar.f38426b;
                i.a aVarB = x0Var != null ? i.b(x0Var) : null;
                com.garmin.android.apps.connectmobile.repcounting.model.c cVar2 = linkedHashMap.containsKey(aVarB) ? (com.garmin.android.apps.connectmobile.repcounting.model.c) linkedHashMap.get(aVarB) : null;
                if (cVar2 != null) {
                    String str = "Returning cached exercises for " + x0Var + StringUtils.SPACE + cVar2.M();
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.b(a2Var, "LiveActivityExerciseProviderImpl", str);
                    return cVar2;
                }
                bv.b.f21239a.getClass();
                bv.b.a();
                c2 c2VarB = this.f38434a.b(x0Var, k1.f37122a.F());
                n nVar = new n(null);
                mVar.f38442a = x0Var;
                mVar.f38445d = 1;
                objW = r53.s.w(c2VarB, nVar, mVar);
                if (objW == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                x0Var = mVar.f38442a;
                o13.r.b(objW);
            }
            com.garmin.android.apps.connectmobile.repcounting.model.c cVar3 = (com.garmin.android.apps.connectmobile.repcounting.model.c) objW;
            if (cVar3 == null) {
                return null;
            }
            iVar.a(x0Var, cVar3);
            String str2 = "Returning newly fetched exercises for " + x0Var + StringUtils.SPACE + cVar3.M();
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var2, "LiveActivityExerciseProviderImpl", str2);
            return cVar3;
        } catch (Exception e4) {
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "Error fetching exercises list: ");
            i2.a aVar4 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var3, "LiveActivityExerciseProviderImpl", strD);
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/live/activity/k$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
