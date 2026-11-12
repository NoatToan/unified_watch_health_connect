package ep0;

import am.x0;
import am.z0;
import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.k1;
import f72.a2;
import g21.f0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements r53.i<z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f64881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f64882b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f64883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f64884b;

        /* JADX INFO: renamed from: ep0.g$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.home.yesterday.domain.dashboard.GetLastSevenDaysDataUseCase$invoke$$inlined$map$1$2", f = "GetLastSevenDaysDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C1379a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f64885a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f64886b;

            public C1379a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f64885a = obj;
                this.f64886b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, b bVar) {
            this.f64883a = jVar;
            this.f64884b = bVar;
        }

        /* JADX WARN: Code duplicated, block: B:274:0x079a  */
        /* JADX WARN: Code duplicated, block: B:284:0x07cf  */
        /* JADX WARN: Code duplicated, block: B:285:0x07d2  */
        /* JADX WARN: Code duplicated, block: B:287:0x07d5  */
        /* JADX WARN: Code duplicated, block: B:290:0x07eb A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C1379a c1379a;
            boolean z14;
            List<l42.b> listB;
            List<gf0.a> listA;
            List<gf0.a> list;
            List list2;
            b22.e eVar;
            Object obj2;
            List<pb2.a.d> list3;
            List<gf0.a> list4;
            u13.a aVar;
            Object obj3;
            boolean z15;
            int i14;
            boolean z16;
            int i15;
            Object objEmit;
            u13.a aVar2;
            String detailId;
            T next;
            String string;
            String string2;
            List<String> list5;
            List<pb2.a.d> list6;
            ArrayList arrayList;
            f0 f0Var;
            ArrayList arrayList2;
            List list7;
            y yVar;
            o70.t.b bVarC;
            y yVar2;
            boolean z17;
            List<pb2.e.h> list8;
            if (dVar instanceof C1379a) {
                c1379a = (C1379a) dVar;
                int i16 = c1379a.f64886b;
                if ((i16 & Integer.MIN_VALUE) != 0) {
                    c1379a.f64886b = i16 - Integer.MIN_VALUE;
                } else {
                    c1379a = new C1379a(dVar);
                }
            } else {
                c1379a = new C1379a(dVar);
            }
            Object obj4 = c1379a.f64885a;
            u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
            int i17 = c1379a.f64886b;
            if (i17 == 0) {
                o13.r.b(obj4);
                j70.d dVar2 = (j70.d) obj;
                b bVar = this.f64884b;
                ae0.b bVar2 = bVar.f64863c;
                Context context = bVar.f64861a;
                Data data = dVar2.f97521b;
                j70.s sVar = (j70.s) data;
                List listA2 = ae0.b.a(sVar != null ? sVar.f97644d : null, e32.o.f62807j);
                j70.s sVar2 = (j70.s) data;
                Iterable iterable = (List) bVar.a(sVar2 != null ? sVar2.f97647g : null, new p());
                if (iterable == null) {
                    iterable = j0.f134944a;
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it = iterable.iterator();
                while (true) {
                    z14 = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    T next2 = it.next();
                    LocalDate localDateS = ((km1.v) next2).s();
                    if (localDateS != null ? localDateS.isAfter(LocalDate.now().minusDays(e32.o.f62807j.f62819a)) : false) {
                        arrayList3.add(next2);
                    }
                }
                l42.k kVar = (l42.k) bVar.a(sVar2 != null ? sVar2.f97645e : null, new r());
                if (kVar == null || (listB = kVar.b()) == null) {
                    listB = j0.f134944a;
                }
                List<l42.b> list9 = listB;
                kw.h hVar = (kw.h) bVar.a(sVar2 != null ? sVar2.f97646f : null, new l());
                kw.k bloodPressureStats = hVar != null ? hVar.getBloodPressureStats() : null;
                List list10 = (List) bVar.a(sVar2 != null ? sVar2.f97648h : null, new n());
                if (list10 == null) {
                    list10 = j0.f134944a;
                }
                List list11 = (List) bVar.a(sVar2 != null ? sVar2.f97649i : null, new o());
                if (list11 == null) {
                    list11 = j0.f134944a;
                }
                ActivityListItemDTO[] activityListItemDTOArr = (ActivityListItemDTO[]) bVar.a(sVar2 != null ? sVar2.f97650j : null, new k());
                if (activityListItemDTOArr == null) {
                    activityListItemDTOArr = new ActivityListItemDTO[0];
                }
                ActivityListItemDTO[] activityListItemDTOArr2 = activityListItemDTOArr;
                ff0.g gVar = (ff0.g) bVar.a(sVar2 != null ? sVar2.f97651k : null, new m());
                if (gVar == null || (listA = gVar.a()) == null) {
                    listA = j0.f134944a;
                }
                b22.e eVar2 = (b22.e) bVar.a(sVar2 != null ? sVar2.f97652l : null, new q());
                pb2.e.c cVar = sVar2 != null ? sVar2.f97653m : null;
                if (cVar == null || (list8 = cVar.f136983e) == null) {
                    list = listA;
                    list2 = listA2;
                    eVar = eVar2;
                    obj2 = null;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator<T> it3 = list8.iterator();
                    while (it3.hasNext()) {
                        T next3 = it3.next();
                        Iterator<T> it4 = it3;
                        LocalDate localDate = ((pb2.e.h) next3).f136996a.toLocalDate();
                        localDate.getClass();
                        List<gf0.a> list12 = listA;
                        List list13 = listA2;
                        LocalDate localDateMinusDays = LocalDate.now().minusDays(6);
                        localDateMinusDays.getClass();
                        LocalDate localDateNow = LocalDate.now();
                        localDateNow.getClass();
                        b22.e eVar3 = eVar2;
                        if (jg.b.D(localDate, localDateMinusDays, localDateNow, false)) {
                            arrayList4.add(next3);
                        }
                        z14 = false;
                        it3 = it4;
                        listA = list12;
                        listA2 = list13;
                        eVar2 = eVar3;
                    }
                    list = listA;
                    list2 = listA2;
                    eVar = eVar2;
                    obj2 = arrayList4;
                }
                if (obj2 == null) {
                    obj2 = j0.f134944a;
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator<T> it5 = ((Iterable) obj2).iterator();
                while (it5.hasNext()) {
                    pb2.e.t tVar = ((pb2.e.h) it5.next()).f136997b;
                    if (tVar != null) {
                        arrayList5.add(tVar);
                    }
                }
                Double dK = b.k(arrayList5, new c(bVar), new ep0.a(0));
                ArrayList arrayList6 = arrayList3;
                f0 f0Var2 = new f0(dK != null ? Integer.valueOf((int) dK.doubleValue()) : null, b.k(arrayList5, new f(bVar), new ep0.a(3)), b.k(arrayList5, new e(bVar), new ep0.a(2)), b.k(arrayList5, new d(bVar), new ep0.a(1)));
                List<pb2.a.d> list14 = sVar2 != null ? sVar2.f97654n : null;
                if (list14 == null) {
                    list14 = j0.f134944a;
                }
                if (sVar2 == null || (list5 = sVar2.f97643c) == null) {
                    list3 = list14;
                    list4 = list;
                    aVar = aVar3;
                    obj3 = j0.f134944a;
                } else {
                    ArrayList arrayList7 = new ArrayList();
                    Iterator<T> it6 = list5.iterator();
                    ArrayList arrayList8 = arrayList7;
                    while (it6.hasNext()) {
                        String str = (String) it6.next();
                        o70.t.f130062f.getClass();
                        o70.t tVarA = o70.t.a.a(str);
                        if (tVarA != null) {
                            if (tVarA == o70.t.X) {
                                if (list2 != null && list2.isEmpty()) {
                                    list6 = list14;
                                    z17 = false;
                                    break;
                                }
                                Iterator<T> it7 = list2.iterator();
                                while (true) {
                                    if (!it7.hasNext()) {
                                        list6 = list14;
                                        z17 = false;
                                        break;
                                    }
                                    hs1.d dVar3 = (hs1.d) it7.next();
                                    list6 = list14;
                                    if ((dVar3.getPulseOx() != null ? fc1.i.a(dVar3) : null) == o70.t.b.f130090e) {
                                        z17 = true;
                                        break;
                                    }
                                    list14 = list6;
                                }
                                bVarC = z17 ? o70.t.b.f130090e : o70.t.b.f130089d;
                            } else {
                                list6 = list14;
                                bVarC = tVarA.c();
                            }
                            arrayList2 = arrayList6;
                            f0Var = f0Var2;
                            arrayList = arrayList8;
                            List list15 = list2;
                            eVar = eVar;
                            List listC = b.c(this.f64884b, tVarA, list15, eVar, arrayList2, list9, bloodPressureStats, f0Var, false);
                            List listC2 = b.c(this.f64884b, tVarA, list15, eVar, arrayList2, list9, bloodPressureStats, f0Var, true);
                            list7 = list15;
                            if (listC != null) {
                                b0 b0Var = new b0(tVarA.f130082a, bVarC != null ? bVarC.f130098a : null);
                                u4.d dVarB = o70.t.b(tVarA);
                                String strD = tVarA.d(new l22.a(context), bVarC);
                                String str2 = (String) h0.d0(listC);
                                if (str2 == null) {
                                    str2 = "";
                                }
                                yVar2 = new y(str2, listC2 != null ? (String) h0.d0(listC2) : null, (String) h0.e0(1, listC), listC2 != null ? (String) h0.e0(1, listC2) : null, strD, b0Var, 1, null, null, dVarB, 0, 384, null);
                            } else {
                                yVar2 = null;
                            }
                            yVar = yVar2;
                        } else {
                            list6 = list14;
                            arrayList = arrayList8;
                            f0Var = f0Var2;
                            arrayList2 = arrayList6;
                            list7 = list2;
                            yVar = null;
                        }
                        if (yVar != null) {
                            arrayList.add(yVar);
                        }
                        arrayList8 = arrayList;
                        f0Var2 = f0Var;
                        aVar3 = aVar3;
                        list = list;
                        list14 = list6;
                        it6 = it6;
                        list2 = list7;
                        arrayList6 = arrayList2;
                    }
                    list3 = list14;
                    list4 = list;
                    aVar = aVar3;
                    obj3 = arrayList8;
                }
                ArrayList arrayList9 = new ArrayList();
                List listI0 = p13.u.i0(activityListItemDTOArr2);
                ArrayList arrayList10 = new ArrayList();
                for (T t7 : listI0) {
                    if (!z0.R(((ActivityListItemDTO) t7).f29265g.f4358a)) {
                        arrayList10.add(t7);
                    }
                }
                bv.b.f21239a.getClass();
                bv.b.a();
                boolean zL0 = k1.f37122a.l0();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it8 = arrayList10.iterator();
                while (it8.hasNext()) {
                    ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) it8.next();
                    x0 x0Var = activityListItemDTO.f29265g;
                    ArrayList arrayListJ = z0.j();
                    z0.f4390a.getClass();
                    Iterator it9 = it8;
                    if (!h0.C0(arrayListJ, p13.w.c(x0.E2)).contains(x0Var)) {
                        x0Var.getClass();
                        x0 x0VarG = z0.g(x0Var);
                        if (x0VarG == x0.f4304m) {
                            x0VarG = null;
                        }
                        x0Var = x0VarG == null ? x0.f4346x : x0VarG;
                    }
                    String str3 = x0Var.f4358a;
                    Collection collection = (List) linkedHashMap.get(str3);
                    if (collection == null) {
                        collection = j0.f134944a;
                    }
                    ArrayList arrayListD1 = h0.d1(collection);
                    arrayListD1.add(activityListItemDTO);
                    linkedHashMap.put(str3, arrayListD1);
                    it8 = it9;
                }
                ArrayList arrayList11 = new ArrayList();
                Object obj5 = obj3;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str4 = (String) entry.getKey();
                    List<? extends ActivityListItemDTO> list16 = (List) entry.getValue();
                    Object obj6 = obj5;
                    x0 x0VarL = z0.l(x0.f4304m, str4);
                    u4.d dVarS = x0VarL.s(zL0);
                    boolean z18 = zL0;
                    b0 b0Var2 = new b0("ACTIVITY", x0VarL.f4358a);
                    int i18 = x0VarL.f4366i;
                    int size = list16.size();
                    boolean z19 = size != 1;
                    switch (b.a.f64866a[x0VarL.ordinal()]) {
                        case 1:
                            if (z19) {
                                string2 = context.getString(R.string.lbl_runs_multiple, Integer.valueOf(size));
                                string2.getClass();
                            } else {
                                string2 = context.getString(R.string.lbl_runs_single);
                                string2.getClass();
                            }
                            break;
                        case 2:
                            if (z19) {
                                string2 = context.getString(R.string.lbl_walks_multiple, Integer.valueOf(size));
                                string2.getClass();
                            } else {
                                string2 = context.getString(R.string.lbl_walks_single);
                                string2.getClass();
                            }
                            break;
                        case 3:
                        case 4:
                            if (z19) {
                                string2 = context.getString(R.string.lbl_rides_multiple, Integer.valueOf(size));
                                string2.getClass();
                            } else {
                                string2 = context.getString(R.string.lbl_rides_single);
                                string2.getClass();
                            }
                            break;
                        case 5:
                            if (z19) {
                                string2 = context.getString(R.string.lbl_parasports_multiple, Integer.valueOf(size));
                                string2.getClass();
                            } else {
                                string2 = context.getString(R.string.lbl_parasports_single);
                                string2.getClass();
                            }
                            break;
                        case 6:
                            string2 = context.getString(R.string.lbl_multisport_multiple, Integer.valueOf(size));
                            string2.getClass();
                            break;
                        case 7:
                            if (z19) {
                                string2 = context.getString(R.string.lbl_hikes_multiple, Integer.valueOf(size));
                                string2.getClass();
                            } else {
                                string2 = context.getString(R.string.lbl_hikes_singular);
                                string2.getClass();
                            }
                            break;
                        case 8:
                            if (z19) {
                                string2 = context.getString(R.string.lbl_swims_multiple, Integer.valueOf(size));
                                string2.getClass();
                            } else {
                                string2 = context.getString(R.string.lbl_swims_single);
                                string2.getClass();
                            }
                            break;
                        case 9:
                            if (z19) {
                                string2 = context.getString(R.string.workouts_lbl, Integer.valueOf(size));
                                string2.getClass();
                            } else {
                                string2 = context.getString(R.string.workouts_lbl_singular, Integer.valueOf(size));
                                string2.getClass();
                            }
                            break;
                        case 10:
                            if (z19) {
                                string2 = context.getString(R.string.lbl_dives, Integer.valueOf(size));
                                string2.getClass();
                            } else {
                                string2 = context.getString(R.string.lbl_dive);
                                string2.getClass();
                            }
                            break;
                        case 11:
                            string2 = context.getString(R.string.lbl_water_sports);
                            string2.getClass();
                            break;
                        case 12:
                            string2 = context.getString(R.string.lbl_winter_sports);
                            string2.getClass();
                            break;
                        case 13:
                            string2 = context.getString(R.string.lbl_racket_sports);
                            string2.getClass();
                            break;
                        case 14:
                            string2 = context.getString(R.string.lbl_team_sports);
                            string2.getClass();
                            break;
                        case 15:
                            string2 = context.getString(R.string.activity_type_gaming);
                            string2.getClass();
                            break;
                        default:
                            string2 = context.getString(R.string.lbl_other);
                            string2.getClass();
                            break;
                    }
                    arrayList11.add(new y(bVar.j(x0VarL, list16, false), bVar.j(x0VarL, list16, true), null, null, string2, b0Var2, list16.size(), x0VarL, null, dVarS, i18, 268, null));
                    obj5 = obj6;
                    zL0 = z18;
                }
                Object obj7 = obj5;
                arrayList9.addAll(arrayList11);
                p13.c0.u(arrayList9, new i(new j(new h()), bVar));
                if (!list3.isEmpty()) {
                    b0 b0Var3 = new b0("PENDING_ACTIVITIES", null);
                    u4.d dVar4 = x0.f4346x.f4362e;
                    String string3 = context.getString(R.string.lbl_auto_detected);
                    string3.getClass();
                    arrayList9.add(0, new y(String.valueOf(list3.size()), String.valueOf(list3.size()), null, null, string3, b0Var3, list3.size(), null, null, dVar4, R.color.gds_data_viz_blue_secondary, 396, null));
                }
                if (!list10.isEmpty()) {
                    x0 x0Var2 = x0.P1;
                    b0 b0Var4 = new b0("ACTIVITY", x0Var2.f4358a);
                    int i19 = x0Var2.f4366i;
                    u4.d dVar5 = x0Var2.f4362e;
                    int size2 = list10.size();
                    String string4 = context.getString(R.string.lbl_golf);
                    string4.getClass();
                    String string5 = context.getString(R.string.string_space_string_pattern, String.valueOf(size2), string4);
                    string5.getClass();
                    arrayList9.add(new y(b.e(bVar, list10, false), b.e(bVar, list10, true), null, null, string5, b0Var4, list10.size(), x0Var2, null, dVar5, i19, 268, null));
                }
                if (list11.isEmpty()) {
                    z15 = 0;
                } else {
                    b0 b0Var5 = new b0("HEALTH_SNAPSHOT", null);
                    s62.a.f157643a.getClass();
                    u4.d dVarA = a2.a(t62.c.f162799a);
                    int size3 = list11.size();
                    if (size3 != 1) {
                        string = context.getString(R.string.lbl_snapshot_plural, Integer.valueOf(size3));
                        string.getClass();
                    } else {
                        string = context.getString(R.string.lbl_snapshot_singular, Integer.valueOf(size3));
                        string.getClass();
                    }
                    z15 = 0;
                    arrayList9.add(new y(b.f(bVar, list11, false), b.f(bVar, list11, true), null, null, string, b0Var5, list11.size(), null, null, dVarA, R.color.gcm_health_snapshot_icon_color, 396, null));
                }
                if (!list4.isEmpty()) {
                    b0 b0Var6 = new b0("ECG_RECORDING", null);
                    u4.d dVar6 = c10.a.f22484y.f22489b;
                    String string6 = context.getString(R.string.lbl_ecg_recording);
                    string6.getClass();
                    List<gf0.a> list17 = list4;
                    String strD2 = b.d(bVar, list17);
                    String strD3 = b.d(bVar, list17);
                    int size4 = list17.size();
                    if (list17.size() == 1) {
                        Iterator<T> it10 = list17.iterator();
                        if (it10.hasNext()) {
                            next = it10.next();
                            if (it10.hasNext()) {
                                long startTime = ((gf0.a) next).getStartTime();
                                do {
                                    T next4 = it10.next();
                                    long startTime2 = ((gf0.a) next4).getStartTime();
                                    if (startTime < startTime2) {
                                        next = next4;
                                        startTime = startTime2;
                                    }
                                } while (it10.hasNext());
                            }
                        } else {
                            next = (T) null;
                        }
                        gf0.a aVar4 = next;
                        if (aVar4 != null) {
                            detailId = aVar4.getDetailId();
                        } else {
                            detailId = null;
                        }
                    } else {
                        detailId = null;
                    }
                    arrayList9.add(new y(strD2, strD3, null, null, string6, b0Var6, size4, null, detailId, dVar6, R.color.gcm_ecg_icon_color, 140, null));
                }
                arrayList9.addAll((Collection) obj7);
                if (sVar2 != null) {
                    i14 = 1;
                    if (sVar2.f97641a) {
                        z16 = true;
                    }
                    if (sVar2 != null) {
                        i15 = sVar2.f97642b;
                    } else {
                        i15 = z15 ? 1 : 0;
                    }
                    if (i15 > i14) {
                        z15 = i14;
                    }
                    z zVar = new z(z16, z15, i53.a.e(arrayList9), dVar2.f97520a);
                    c1379a.f64886b = i14;
                    objEmit = this.f64883a.emit(zVar, c1379a);
                    aVar2 = aVar;
                    if (objEmit == aVar2) {
                        return aVar2;
                    }
                } else {
                    i14 = 1;
                }
                z16 = z15 ? 1 : 0;
                if (sVar2 != null) {
                    i15 = sVar2.f97642b;
                } else {
                    i15 = z15 ? 1 : 0;
                }
                if (i15 > i14) {
                    z15 = i14;
                }
                z zVar2 = new z(z16, z15, i53.a.e(arrayList9), dVar2.f97520a);
                c1379a.f64886b = i14;
                objEmit = this.f64883a.emit(zVar2, c1379a);
                aVar2 = aVar;
                if (objEmit == aVar2) {
                    return aVar2;
                }
            } else {
                if (i17 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj4);
            }
            return Unit.INSTANCE;
        }
    }

    public g(r53.i iVar, b bVar) {
        this.f64881a = iVar;
        this.f64882b = bVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super z> jVar, t13.d dVar) {
        Object objCollect = this.f64881a.collect(new a(jVar, this.f64882b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
