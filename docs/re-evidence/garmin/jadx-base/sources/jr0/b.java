package jr0;

import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.android.apps.connectmobile.v2;
import gs1.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd0.n6;
import lc.u0;
import o13.r;
import org.joda.time.DateTime;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ljr0/b;", "Lcom/garmin/android/apps/connectmobile/f0;", "Ljr0/a;", "Lhr0/a;", "apiService", "Lis1/e;", "timelineRepository", "<init>", "(Lhr0/a;Lis1/e;)V", "a", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements f0, jr0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hr0.a f100509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final is1.e f100510b;

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b(hr0.a aVar, is1.e eVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? (hr0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, hr0.a.class, new c83.h.a[0], null, null, null, 88) : aVar, (i14 & 2) != 0 ? new is1.e(null, 1, 0 == true ? 1 : 0) : eVar);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00da  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00eb A[LOOP:0: B:42:0x00e9->B:43:0x00eb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x010c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0111  */
    /* JADX WARN: Code duplicated, block: B:50:0x011e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0123  */
    /* JADX WARN: Code duplicated, block: B:54:0x012a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0134 A[LOOP:1: B:55:0x012e->B:57:0x0134, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x0156 A[LOOP:2: B:62:0x0150->B:64:0x0156, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x018e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0196  */
    /* JADX WARN: Code duplicated, block: B:72:0x019d  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // jr0.a
    public final Object a(DateTime dateTime, v13.c cVar) throws JSONException {
        c cVar2;
        DateTime dateTime2;
        v2 v2Var;
        v2 v2Var2;
        ir0.a aVar;
        JSONObject jSONObjectOptJSONObject;
        o oVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3;
        String string;
        gs1.g gVar;
        List<gs1.f> listB;
        v2 v2Var3;
        ir0.a aVar2;
        Iterator<gs1.f> it;
        Iterator it3;
        int length;
        int i14;
        v2 v2Var4;
        List<gs1.k> list;
        DateTime dateTime3 = dateTime;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i15 = cVar2.f100516f;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                cVar2.f100516f = i15 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objJ = cVar2.f100514d;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = cVar2.f100516f;
        if (i16 == 0) {
            r.b(objJ);
            e eVar = new e(this, dateTime3, null);
            cVar2.f100511a = dateTime3;
            cVar2.f100516f = 1;
            objJ = f0.J(this, eVar, cVar2);
            if (objJ != aVar3) {
            }
            return aVar3;
        }
        if (i16 == 1) {
            dateTime3 = cVar2.f100511a;
            r.b(objJ);
        } else {
            if (i16 == 2) {
                v2Var = cVar2.f100512b;
                dateTime2 = cVar2.f100511a;
                r.b(objJ);
                v2Var2 = (v2) objJ;
                if (v2Var2 instanceof v2.b) {
                    return v2Var;
                }
                String str = (String) ((v2.b) v2Var2).f47386a;
                aVar = (ir0.a) ((v2.b) v2Var).f47386a;
                jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("SleepTimes");
                if (jSONObjectOptJSONObject != null) {
                    oVar = (o) GsonUtil.f47253b.fromJson(jSONObjectOptJSONObject.toString(), o.class);
                } else {
                    oVar = null;
                }
                aVar.f94778o = oVar;
                arrayList = new ArrayList();
                arrayList2 = new ArrayList();
                jSONObjectOptJSONObject2 = new JSONObject(str).optJSONObject("ActivitiesForDay");
                if (jSONObjectOptJSONObject2 != null) {
                    jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("payload");
                } else {
                    jSONArrayOptJSONArray = null;
                }
                if (jSONArrayOptJSONArray != null) {
                    length = jSONArrayOptJSONArray.length();
                    for (i14 = 0; i14 < length; i14++) {
                        ActivityListItemDTO activityListItemDTO = new ActivityListItemDTO();
                        activityListItemDTO.k(jSONArrayOptJSONArray.getJSONObject(i14));
                        arrayList2.add(activityListItemDTO);
                    }
                }
                jSONObjectOptJSONObject3 = new JSONObject(str).optJSONObject("AutoDetectedEvents");
                if (jSONObjectOptJSONObject3 != null) {
                    string = jSONObjectOptJSONObject3.toString();
                } else {
                    string = null;
                }
                gVar = (gs1.g) GsonUtil.f47253b.fromJson(string, gs1.g.class);
                if (gVar != null) {
                    listB = gVar.b();
                } else {
                    listB = null;
                }
                if (!arrayList2.isEmpty()) {
                    it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(new ir0.b(null, (ActivityListItemDTO) it3.next(), 1, null));
                    }
                }
                if (listB != null && (!listB.isEmpty())) {
                    it = listB.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new ir0.b(it.next(), null, 2, null));
                    }
                }
                List<ir0.b> listN0 = h0.N0(arrayList, new d());
                listN0.getClass();
                aVar.f94779p = listN0;
                cVar2.f100511a = null;
                cVar2.f100512b = v2Var;
                cVar2.f100513c = aVar;
                cVar2.f100516f = 3;
                is1.e eVar2 = this.f100510b;
                eVar2.getClass();
                objJ = f0.J(eVar2, new is1.d(eVar2, dateTime2, null), cVar2);
                if (objJ != aVar3) {
                    v2Var3 = v2Var;
                    aVar2 = aVar;
                }
                return aVar3;
            }
            if (i16 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar2 = cVar2.f100513c;
            v2Var3 = cVar2.f100512b;
            r.b(objJ);
        }
        v2Var4 = (v2) objJ;
        if (v2Var4 instanceof v2.b) {
            list = (List) ((v2.b) v2Var4).f47386a;
        } else {
            if (v2Var4 instanceof v2.a) {
                u0.r();
                return null;
            }
            list = j0.f134944a;
        }
        aVar2.getClass();
        list.getClass();
        aVar2.f94780q = list;
        return v2Var3;
        v2 v2Var5 = (v2) objJ;
        bv.b.f21239a.getClass();
        bv.b.a();
        if (!k1.f37122a.v() || !(v2Var5 instanceof v2.b)) {
            return v2Var5;
        }
        f fVar = new f(this, dateTime3, null);
        cVar2.f100511a = dateTime3;
        cVar2.f100512b = v2Var5;
        cVar2.f100516f = 2;
        Object objJ2 = f0.J(this, fVar, cVar2);
        if (objJ2 != aVar3) {
            dateTime2 = dateTime3;
            v2Var = v2Var5;
            objJ = objJ2;
            v2Var2 = (v2) objJ;
            if (v2Var2 instanceof v2.b) {
                return v2Var;
            }
            String str2 = (String) ((v2.b) v2Var2).f47386a;
            aVar = (ir0.a) ((v2.b) v2Var).f47386a;
            jSONObjectOptJSONObject = new JSONObject(str2).optJSONObject("SleepTimes");
            if (jSONObjectOptJSONObject != null) {
                oVar = (o) GsonUtil.f47253b.fromJson(jSONObjectOptJSONObject.toString(), o.class);
            } else {
                oVar = null;
            }
            aVar.f94778o = oVar;
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            jSONObjectOptJSONObject2 = new JSONObject(str2).optJSONObject("ActivitiesForDay");
            if (jSONObjectOptJSONObject2 != null) {
                jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("payload");
            } else {
                jSONArrayOptJSONArray = null;
            }
            if (jSONArrayOptJSONArray != null) {
                length = jSONArrayOptJSONArray.length();
                while (i14 < length) {
                    ActivityListItemDTO activityListItemDTO2 = new ActivityListItemDTO();
                    activityListItemDTO2.k(jSONArrayOptJSONArray.getJSONObject(i14));
                    arrayList2.add(activityListItemDTO2);
                }
            }
            jSONObjectOptJSONObject3 = new JSONObject(str2).optJSONObject("AutoDetectedEvents");
            if (jSONObjectOptJSONObject3 != null) {
                string = jSONObjectOptJSONObject3.toString();
            } else {
                string = null;
            }
            gVar = (gs1.g) GsonUtil.f47253b.fromJson(string, gs1.g.class);
            if (gVar != null) {
                listB = gVar.b();
            } else {
                listB = null;
            }
            if (!arrayList2.isEmpty()) {
                it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList.add(new ir0.b(null, (ActivityListItemDTO) it3.next(), 1, null));
                }
            }
            if (listB != null) {
                it = listB.iterator();
                while (it.hasNext()) {
                    arrayList.add(new ir0.b(it.next(), null, 2, null));
                }
            }
            List<ir0.b> listN1 = h0.N0(arrayList, new d());
            listN1.getClass();
            aVar.f94779p = listN1;
            cVar2.f100511a = null;
            cVar2.f100512b = v2Var;
            cVar2.f100513c = aVar;
            cVar2.f100516f = 3;
            is1.e eVar3 = this.f100510b;
            eVar3.getClass();
            objJ = f0.J(eVar3, new is1.d(eVar3, dateTime2, null), cVar2);
            if (objJ != aVar3) {
                v2Var3 = v2Var;
                aVar2 = aVar;
                v2Var4 = (v2) objJ;
                if (v2Var4 instanceof v2.b) {
                    list = (List) ((v2.b) v2Var4).f47386a;
                } else {
                    if (v2Var4 instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    list = j0.f134944a;
                }
                aVar2.getClass();
                list.getClass();
                aVar2.f94780q = list;
                return v2Var3;
            }
        }
        return aVar3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jr0.a
    public final Object b(DateTime dateTime, DateTime dateTime2, v13.c cVar) {
        l lVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f100543c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f100543c = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objJ = lVar.f100541a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f100543c;
        if (i15 == 0) {
            r.b(objJ);
            m mVar = new m(this, dateTime, dateTime2, null);
            lVar.f100543c = 1;
            objJ = f0.J(this, mVar, lVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            v2.b bVar = (v2.b) v2Var;
            if (!(bVar.f47386a instanceof List)) {
                return new v2.b(j0.f134944a, bVar.f47387b, null, null, 12, null);
            }
        }
        return v2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jr0.a
    public final Object c(DateTime dateTime, DateTime dateTime2, v13.c cVar) {
        h hVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f100529c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f100529c = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objJ = hVar.f100527a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f100529c;
        if (i15 == 0) {
            r.b(objJ);
            i iVar = new i(this, dateTime, dateTime2, null);
            hVar.f100529c = 1;
            objJ = f0.J(this, iVar, hVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            v2.b bVar = (v2.b) v2Var;
            if (!(bVar.f47386a instanceof List)) {
                return new v2.b(j0.f134944a, bVar.f47387b, null, null, 12, null);
            }
        }
        return v2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @Override // jr0.a
    public final Object d(DateTime dateTime, int i14, v13.c cVar) {
        j jVar;
        ?? arrayList;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i15 = jVar.f100536c;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                jVar.f100536c = i15 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objJ = jVar.f100534a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = jVar.f100536c;
        if (i16 == 0) {
            r.b(objJ);
            k kVar = new k(this, dateTime, i14, null);
            jVar.f100536c = 1;
            objJ = f0.J(this, kVar, jVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            v2Var.getClass();
            return (v2.a) v2Var;
        }
        v2.b bVar = (v2.b) v2Var;
        ir0.c cVar2 = (ir0.c) bVar.f47386a;
        int i17 = cVar2.f94785a;
        List<ir0.f> list = cVar2.f94786b;
        if (list != null) {
            arrayList = new ArrayList(y.r(list, 10));
            for (ir0.f fVar : list) {
                arrayList.add(new ir0.f(fVar.f94796a, i17, fVar.f94798c, fVar.f94799d, fVar.f94800e, fVar.f94801f, fVar.f94802g, fVar.f94803h, fVar.f94804i, fVar.f94805j));
            }
        } else {
            arrayList = j0.f134944a;
        }
        return new v2.b(arrayList, bVar.f47387b, null, null, 12, null);
    }

    @Override // jr0.a
    public final Object f(DateTime dateTime, DateTime dateTime2, n6 n6Var) {
        return f0.J(this, new g(this, dateTime, dateTime2, null), n6Var);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Ljr0/b$a;", "", "<init>", "()V", "", "KEY_SLEEP_TIMES", "Ljava/lang/String;", "KEY_ACTIVITIES", "KEY_EVENTS", "KEY_PAYLOAD", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public b(hr0.a aVar, is1.e eVar) {
        aVar.getClass();
        eVar.getClass();
        this.f100509a = aVar;
        this.f100510b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
