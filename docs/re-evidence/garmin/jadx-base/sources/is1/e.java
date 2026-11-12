package is1;

import c83.h;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.v2;
import gs1.a0;
import gs1.i;
import gs1.t;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import o13.r;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lis1/e;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lfs1/a;", "timelineApiService", "<init>", "(Lfs1/a;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fs1.a f94959a;

    public /* synthetic */ e(fs1.a aVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? (fs1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, fs1.a.class, new h.a[0], null, null, null, 120) : aVar);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    /* JADX WARN: Code duplicated, block: B:32:0x008e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:59:0x0107  */
    /* JADX WARN: Code duplicated, block: B:63:0x0118  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(DateTime dateTime, v13.c cVar) {
        b bVar;
        DateTime dateTime2;
        v2 v2Var;
        v2 v2Var2;
        v2.b bVar2;
        List list;
        i currentDayDailySleepDTO;
        i iVar;
        t tVarB;
        a0 wellnessActivitySummaries;
        List<sn.h> listB;
        ArrayList arrayList;
        Serializable serializableA;
        t tVar;
        v2.b bVar3;
        ArrayList arrayList2;
        i.b payload;
        i.b bVarB;
        List list2;
        a0 wellnessActivitySummaries2;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f94952h;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f94952h = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objJ = bVar.f94950f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f94952h;
        if (i15 == 0) {
            r.b(objJ);
            c cVar2 = new c(this, dateTime, null);
            bVar.f94945a = dateTime;
            bVar.f94952h = 1;
            objJ = f0.J(this, cVar2, bVar);
            if (objJ != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            dateTime = bVar.f94945a;
            r.b(objJ);
        } else {
            if (i15 == 2) {
                v2Var = bVar.f94946b;
                dateTime2 = bVar.f94945a;
                r.b(objJ);
                v2Var2 = (v2) objJ;
                v2Var.getClass();
                bVar2 = (v2.b) v2Var;
                if (v2Var2 instanceof v2.b) {
                    list = (List) ((v2.b) v2Var2).f47386a;
                } else {
                    if (v2Var2 instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    list = j0.f134944a;
                }
                t tVar2 = (t) bVar2.f47386a;
                currentDayDailySleepDTO = tVar2.getCurrentDayDailySleepDTO();
                if (currentDayDailySleepDTO != null) {
                    payload = currentDayDailySleepDTO.getPayload();
                    if (payload != null) {
                        bVarB = i.b.b(payload, list);
                    } else {
                        bVarB = null;
                    }
                    iVar = new i(bVarB);
                } else {
                    iVar = null;
                }
                tVarB = t.b(tVar2, iVar, null, 2039);
                bv.b.f21239a.getClass();
                bv.b.a();
                if (k1.f37122a.W()) {
                    wellnessActivitySummaries = tVarB.getWellnessActivitySummaries();
                    if (wellnessActivitySummaries != null || (listB = wellnessActivitySummaries.b()) == null) {
                        listB = j0.f134944a;
                    }
                    arrayList = new ArrayList(listB);
                    a aVar2 = (a) KoinJavaComponent.get$default(a.class, null, null, 6, null);
                    bVar.f94945a = null;
                    bVar.f94946b = null;
                    bVar.f94947c = bVar2;
                    bVar.f94948d = tVarB;
                    bVar.f94949e = arrayList;
                    bVar.f94952h = 3;
                    serializableA = aVar2.a(dateTime2, bVar);
                    if (serializableA != aVar) {
                        tVar = tVarB;
                        objJ = serializableA;
                        bVar3 = bVar2;
                        arrayList2 = arrayList;
                    }
                    return aVar;
                }
                return new v2.b(tVarB, bVar2.f47387b, bVar2.f47388c, bVar2.f47389d);
            }
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList2 = bVar.f94949e;
            tVar = bVar.f94948d;
            bVar3 = bVar.f94947c;
            r.b(objJ);
        }
        list2 = (List) objJ;
        if (list2 != null) {
            arrayList2.addAll(list2);
        }
        wellnessActivitySummaries2 = tVar.getWellnessActivitySummaries();
        if (wellnessActivitySummaries2 != null) {
            wellnessActivitySummaries2.d(arrayList2);
        }
        bVar2 = bVar3;
        tVarB = tVar;
        return new v2.b(tVarB, bVar2.f47387b, bVar2.f47388c, bVar2.f47389d);
        v2 v2Var3 = (v2) objJ;
        if (v2Var3 instanceof v2.a) {
            return v2Var3;
        }
        bVar.f94945a = dateTime;
        bVar.f94946b = v2Var3;
        bVar.f94952h = 2;
        Object objJ2 = f0.J(this, new d(this, dateTime, null), bVar);
        if (objJ2 != aVar) {
            dateTime2 = dateTime;
            v2Var = v2Var3;
            objJ = objJ2;
            v2Var2 = (v2) objJ;
            v2Var.getClass();
            bVar2 = (v2.b) v2Var;
            if (v2Var2 instanceof v2.b) {
                list = (List) ((v2.b) v2Var2).f47386a;
            } else {
                if (v2Var2 instanceof v2.a) {
                    u0.r();
                    return null;
                }
                list = j0.f134944a;
            }
            t tVar3 = (t) bVar2.f47386a;
            currentDayDailySleepDTO = tVar3.getCurrentDayDailySleepDTO();
            if (currentDayDailySleepDTO != null) {
                payload = currentDayDailySleepDTO.getPayload();
                if (payload != null) {
                    bVarB = i.b.b(payload, list);
                } else {
                    bVarB = null;
                }
                iVar = new i(bVarB);
            } else {
                iVar = null;
            }
            tVarB = t.b(tVar3, iVar, null, 2039);
            bv.b.f21239a.getClass();
            bv.b.a();
            if (k1.f37122a.W()) {
                wellnessActivitySummaries = tVarB.getWellnessActivitySummaries();
                if (wellnessActivitySummaries != null) {
                    listB = j0.f134944a;
                } else {
                    listB = j0.f134944a;
                }
                arrayList = new ArrayList(listB);
                a aVar3 = (a) KoinJavaComponent.get$default(a.class, null, null, 6, null);
                bVar.f94945a = null;
                bVar.f94946b = null;
                bVar.f94947c = bVar2;
                bVar.f94948d = tVarB;
                bVar.f94949e = arrayList;
                bVar.f94952h = 3;
                serializableA = aVar3.a(dateTime2, bVar);
                if (serializableA != aVar) {
                    tVar = tVarB;
                    objJ = serializableA;
                    bVar3 = bVar2;
                    arrayList2 = arrayList;
                    list2 = (List) objJ;
                    if (list2 != null) {
                        arrayList2.addAll(list2);
                    }
                    wellnessActivitySummaries2 = tVar.getWellnessActivitySummaries();
                    if (wellnessActivitySummaries2 != null) {
                        wellnessActivitySummaries2.d(arrayList2);
                    }
                    bVar2 = bVar3;
                    tVarB = tVar;
                }
            }
            return new v2.b(tVarB, bVar2.f47387b, bVar2.f47388c, bVar2.f47389d);
        }
        return aVar;
    }

    public e(fs1.a aVar) {
        aVar.getClass();
        this.f94959a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
