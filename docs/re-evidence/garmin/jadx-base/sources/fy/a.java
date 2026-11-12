package fy;

import android.util.SparseArray;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c22.j0;
import com.garmin.android.apps.connectmobile.calendar.detail.model.CalendarDTO;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.v2;
import f32.l;
import g22.k;
import gs1.t;
import gs1.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import o13.r;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.x;
import p13.y;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lfy/a;", "Landroidx/lifecycle/u1;", "Lcom/garmin/android/apps/connectmobile/calendar/detail/model/CalendarDTO;", "calendarDTO", "", "groupId", "", "Lxx/d;", "filterItemsList", "<init>", "(Lcom/garmin/android/apps/connectmobile/calendar/detail/model/CalendarDTO;Ljava/lang/String;Ljava/util/List;)V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<xx.d> f73853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final is1.e f73854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zx.e f73855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vx.f f73856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseArray<CalendarDTO> f73857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f73858g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f73859h;

    /* JADX INFO: renamed from: fy.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1498a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f73860a;

        static {
            int[] iArr = new int[CalendarItemDTO.b.values().length];
            try {
                iArr[CalendarItemDTO.b.ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CalendarItemDTO.b.HEART_RATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CalendarItemDTO.b.WORKOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f73860a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"fy/a$b", "Lf32/e;", "Lxx/b;", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements f32.e<xx.b> {

        /* JADX INFO: renamed from: fy.a$b$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.calendar.presentation.detail.CalendarDetailsViewModel$detailsDataAdapter$1", f = "CalendarDetailsViewModel.kt", l = {63, 64}, m = "requestDetails", v = 2)
        public static final class C1499a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public DateTime f73862a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public v2 f73863b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f73864c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f73866e;

            public C1499a(t13.d<? super C1499a> dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f73864c = obj;
                this.f73866e |= Integer.MIN_VALUE;
                return b.this.a(null, this);
            }
        }

        public b() {
        }

        /* JADX WARN: Code duplicated, block: B:116:0x01cf  */
        /* JADX WARN: Code duplicated, block: B:135:0x022e  */
        /* JADX WARN: Code duplicated, block: B:139:0x023a  */
        /* JADX WARN: Code duplicated, block: B:142:0x024c  */
        /* JADX WARN: Code duplicated, block: B:144:0x0254  */
        /* JADX WARN: Code duplicated, block: B:146:0x025c  */
        /* JADX WARN: Code duplicated, block: B:149:0x0269  */
        /* JADX WARN: Code duplicated, block: B:156:0x0289  */
        /* JADX WARN: Code duplicated, block: B:161:0x01c1 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:187:0x0274 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:189:0x0272 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:25:0x006e  */
        /* JADX WARN: Code duplicated, block: B:27:0x0083  */
        /* JADX WARN: Code duplicated, block: B:29:0x0090  */
        /* JADX WARN: Code duplicated, block: B:30:0x0095  */
        /* JADX WARN: Code duplicated, block: B:34:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:37:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:39:0x00b6 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:64:0x0112  */
        /* JADX WARN: Code duplicated, block: B:66:0x0119  */
        /* JADX WARN: Code duplicated, block: B:67:0x011b  */
        /* JADX WARN: Code duplicated, block: B:69:0x0120  */
        /* JADX WARN: Code duplicated, block: B:74:0x013a  */
        /* JADX WARN: Code duplicated, block: B:77:0x0145  */
        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        /* JADX WARN: Code duplicated, block: B:96:0x017e  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Iterable, java.util.List] */
        /* JADX WARN: Type inference failed for: r2v11, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r2v15, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v9, types: [p13.j0] */
        @Override // f32.e
        public final Object a(DateTime dateTime, t13.d<? super xx.b> dVar) throws Exception {
            C1499a c1499a;
            DateTime dateTime2;
            v2 v2Var;
            CalendarDTO calendarDTO;
            t tVar;
            k1 k1Var;
            k1 k1Var2;
            Throwable th3;
            ?? arrayList;
            boolean zIsEmpty;
            ?? N0;
            LinkedHashMap linkedHashMap;
            int i14;
            int i15;
            xx.d dVar2;
            CalendarItemDTO.b bVar;
            ArrayList arrayList2;
            gs1.d allDayHeartRateDTO;
            gs1.d.c payload;
            CalendarItemDTO.b bVar2;
            int i16;
            k1 k1Var3;
            gs1.a activitiesForDayDTO;
            List<gs1.b> listB;
            DateTime dateTimeD;
            z userDailySummary;
            DateTime dateTimeO;
            z userDailySummary2;
            gs1.l payload2;
            Integer abnormalHeartRateAlertsCount;
            Integer maxHeartRate;
            int iIntValue;
            Integer restingHeartRate;
            int iIntValue2;
            gs1.l payload3;
            gs1.a activitiesForDayDTO2;
            gs1.b bVar3;
            boolean z14;
            List<gs1.b> listB2;
            Object next;
            DateTime dateTime3 = dateTime;
            if (dVar instanceof C1499a) {
                c1499a = (C1499a) dVar;
                int i17 = c1499a.f73866e;
                if ((i17 & Integer.MIN_VALUE) != 0) {
                    c1499a.f73866e = i17 - Integer.MIN_VALUE;
                } else {
                    c1499a = new C1499a(dVar);
                }
            } else {
                c1499a = new C1499a(dVar);
            }
            Object objA = c1499a.f73864c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i18 = c1499a.f73866e;
            int i19 = 2;
            int i24 = 1;
            a aVar2 = a.this;
            if (i18 == 0) {
                r.b(objA);
                is1.e eVar = aVar2.f73854c;
                c1499a.f73862a = dateTime3;
                c1499a.f73866e = 1;
                objA = eVar.a(dateTime3, c1499a);
                if (objA != aVar) {
                }
                return aVar;
            }
            if (i18 == 1) {
                dateTime3 = c1499a.f73862a;
                r.b(objA);
            } else {
                if (i18 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v2Var = c1499a.f73863b;
                dateTime2 = c1499a.f73862a;
                r.b(objA);
            }
            calendarDTO = (CalendarDTO) objA;
            if (!(v2Var instanceof v2.a)) {
                throw ((v2.a) v2Var).f47383a;
            }
            v2Var.getClass();
            tVar = (t) ((v2.b) v2Var).f47386a;
            bv.b.f21239a.getClass();
            bv.b.a();
            k1Var = k1.f37122a;
            if (calendarDTO != null) {
                ArrayList<CalendarItemDTO> arrayList3 = calendarDTO.f30966f;
                aVar2.getClass();
                allDayHeartRateDTO = tVar.getAllDayHeartRateDTO();
                if (allDayHeartRateDTO != null) {
                    payload = allDayHeartRateDTO.getPayload();
                } else {
                    payload = null;
                }
                for (CalendarItemDTO calendarItemDTO : arrayList3) {
                    bVar2 = calendarItemDTO.f30973d;
                    if (bVar2 == null) {
                        i16 = -1;
                    } else {
                        i16 = C1498a.f73860a[bVar2.ordinal()];
                    }
                    if (i16 != i24) {
                        k1Var3 = k1Var;
                        activitiesForDayDTO = tVar.getActivitiesForDayDTO();
                        if (activitiesForDayDTO == null && (listB = activitiesForDayDTO.b()) != null) {
                            Iterator it = listB.iterator();
                            while (it.hasNext()) {
                                gs1.b bVar4 = (gs1.b) it.next();
                                Long activityId = bVar4.getActivityId();
                                Iterator it3 = it;
                                long j8 = calendarItemDTO.f30967a;
                                if (activityId != null && activityId.longValue() == j8) {
                                    gs1.c activityType = bVar4.getActivityType();
                                    calendarItemDTO.R0 = activityType != null ? activityType.getTypeKey() : null;
                                }
                                it = it3;
                            }
                        }
                    } else if (i16 != i19) {
                        k1Var3 = k1Var;
                        j0 j0Var = j0.f23099a;
                        dateTimeD = calendarItemDTO.D();
                        userDailySummary = tVar.getUserDailySummary();
                        if (userDailySummary != null || (payload3 = userDailySummary.getPayload()) == null) {
                            dateTimeO = null;
                        } else {
                            dateTimeO = payload3.o();
                        }
                        j0Var.getClass();
                        if (!j0.F(dateTimeD, dateTimeO)) {
                            if (payload != null && (restingHeartRate = payload.getRestingHeartRate()) != null && (iIntValue2 = restingHeartRate.intValue()) > 0) {
                                calendarItemDTO.X = iIntValue2;
                            }
                            if (payload != null && (maxHeartRate = payload.getMaxHeartRate()) != null && (iIntValue = maxHeartRate.intValue()) > 0) {
                                calendarItemDTO.Y = iIntValue;
                            }
                            userDailySummary2 = tVar.getUserDailySummary();
                            if (userDailySummary2 == null && (payload2 = userDailySummary2.getPayload()) != null && (abnormalHeartRateAlertsCount = payload2.getAbnormalHeartRateAlertsCount()) != null) {
                                calendarItemDTO.f30988k0 = abnormalHeartRateAlertsCount.intValue();
                            }
                        }
                    } else if (i16 != 3 && calendarItemDTO.f30991l1 > 0) {
                        activitiesForDayDTO2 = tVar.getActivitiesForDayDTO();
                        if (activitiesForDayDTO2 != null || (listB2 = activitiesForDayDTO2.b()) == null) {
                            k1Var3 = k1Var;
                            bVar3 = null;
                        } else {
                            Iterator it4 = listB2.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    k1Var3 = k1Var;
                                    next = null;
                                    break;
                                }
                                next = it4.next();
                                gs1.b bVar5 = (gs1.b) next;
                                if (s.g(bVar5.getAtpActivity(), Boolean.TRUE)) {
                                    Long workoutId = bVar5.getWorkoutId();
                                    k1Var3 = k1Var;
                                    long j14 = calendarItemDTO.f30993m1;
                                    if (workoutId != null && workoutId.longValue() == j14) {
                                        break;
                                    }
                                } else {
                                    k1Var3 = k1Var;
                                }
                                k1Var = k1Var3;
                            }
                            bVar3 = (gs1.b) next;
                        }
                        if (bVar3 != null) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        calendarItemDTO.f30995n1 = z14;
                    } else {
                        k1Var3 = k1Var;
                    }
                    k1Var = k1Var3;
                    i19 = 2;
                    i24 = 1;
                }
                k1Var2 = k1Var;
                th3 = null;
                calendarDTO.f30966f = new ArrayList(arrayList3);
            } else {
                k1Var2 = k1Var;
                th3 = null;
            }
            if (calendarDTO != null || (arrayList2 = calendarDTO.f30966f) == null) {
                arrayList = p13.j0.f134944a;
            } else {
                ArrayList<CalendarItemDTO> arrayList4 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (k.f(((CalendarItemDTO) obj).D(), dateTime2)) {
                        arrayList4.add(obj);
                    }
                }
                arrayList = new ArrayList(y.r(arrayList4, 10));
                for (CalendarItemDTO calendarItemDTO2 : arrayList4) {
                    if (calendarItemDTO2.f30973d == CalendarItemDTO.b.SLEEP && k1Var2.o()) {
                        CalendarItemDTO.b bVar6 = CalendarItemDTO.b.SLEEP_AND_SCORE;
                        bVar6.getClass();
                        calendarItemDTO2.f30973d = bVar6;
                    }
                    arrayList.add(calendarItemDTO2);
                }
            }
            aVar2.getClass();
            zIsEmpty = arrayList.isEmpty();
            N0 = arrayList;
            if (!zIsEmpty) {
                List<xx.d> list = aVar2.f73853b;
                linkedHashMap = new LinkedHashMap();
                i14 = 0;
                for (Object obj2 : list) {
                    i15 = i14 + 1;
                    if (i14 >= 0) {
                        x.q();
                        throw th3;
                    }
                    dVar2 = (xx.d) obj2;
                    bVar = dVar2.f192473a.f192498d;
                    if (bVar != null) {
                        linkedHashMap.put(bVar, Integer.valueOf(i14));
                    }
                    if (dVar2.f192473a == xx.e.f192490v) {
                        linkedHashMap.put(CalendarItemDTO.b.FBT_ADAPTIVE_WORKOUT, Integer.valueOf(i14));
                    }
                    i14 = i15;
                }
                N0 = h0.N0(arrayList, new c(linkedHashMap));
            }
            return new xx.b(dateTime2, aVar2.f73852a, tVar, N0);
            v2 v2Var2 = (v2) objA;
            c1499a.f73862a = dateTime3;
            c1499a.f73863b = v2Var2;
            c1499a.f73866e = 2;
            Object objX4 = a.x4(aVar2, dateTime3, c1499a);
            if (objX4 != aVar) {
                dateTime2 = dateTime3;
                v2Var = v2Var2;
                objA = objX4;
                calendarDTO = (CalendarDTO) objA;
                if (!(v2Var instanceof v2.a)) {
                    throw ((v2.a) v2Var).f47383a;
                }
                v2Var.getClass();
                tVar = (t) ((v2.b) v2Var).f47386a;
                bv.b.f21239a.getClass();
                bv.b.a();
                k1Var = k1.f37122a;
                if (calendarDTO != null) {
                    ArrayList<CalendarItemDTO> arrayList5 = calendarDTO.f30966f;
                    aVar2.getClass();
                    allDayHeartRateDTO = tVar.getAllDayHeartRateDTO();
                    if (allDayHeartRateDTO != null) {
                        payload = allDayHeartRateDTO.getPayload();
                    } else {
                        payload = null;
                    }
                    while (r13.hasNext()) {
                        bVar2 = calendarItemDTO.f30973d;
                        if (bVar2 == null) {
                            i16 = -1;
                        } else {
                            i16 = C1498a.f73860a[bVar2.ordinal()];
                        }
                        if (i16 != i24) {
                            k1Var3 = k1Var;
                            activitiesForDayDTO = tVar.getActivitiesForDayDTO();
                            if (activitiesForDayDTO == null) {
                            }
                        } else if (i16 != i19) {
                            k1Var3 = k1Var;
                            j0 j0Var2 = j0.f23099a;
                            dateTimeD = calendarItemDTO.D();
                            userDailySummary = tVar.getUserDailySummary();
                            if (userDailySummary != null) {
                                dateTimeO = null;
                            } else {
                                dateTimeO = null;
                            }
                            j0Var2.getClass();
                            if (!j0.F(dateTimeD, dateTimeO)) {
                                if (payload != null) {
                                    calendarItemDTO.X = iIntValue2;
                                }
                                if (payload != null) {
                                    calendarItemDTO.Y = iIntValue;
                                }
                                userDailySummary2 = tVar.getUserDailySummary();
                                if (userDailySummary2 == null) {
                                }
                            }
                        } else if (i16 != 3) {
                            k1Var3 = k1Var;
                        } else {
                            activitiesForDayDTO2 = tVar.getActivitiesForDayDTO();
                            if (activitiesForDayDTO2 != null) {
                                k1Var3 = k1Var;
                                bVar3 = null;
                            } else {
                                k1Var3 = k1Var;
                                bVar3 = null;
                            }
                            if (bVar3 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            calendarItemDTO.f30995n1 = z14;
                        }
                        k1Var = k1Var3;
                        i19 = 2;
                        i24 = 1;
                    }
                    k1Var2 = k1Var;
                    th3 = null;
                    calendarDTO.f30966f = new ArrayList(arrayList5);
                } else {
                    k1Var2 = k1Var;
                    th3 = null;
                }
                if (calendarDTO != null) {
                    arrayList = p13.j0.f134944a;
                } else {
                    arrayList = p13.j0.f134944a;
                }
                aVar2.getClass();
                zIsEmpty = arrayList.isEmpty();
                N0 = arrayList;
                if (!zIsEmpty) {
                    List<xx.d> list2 = aVar2.f73853b;
                    linkedHashMap = new LinkedHashMap();
                    i14 = 0;
                    while (r4.hasNext()) {
                        i15 = i14 + 1;
                        if (i14 >= 0) {
                            x.q();
                            throw th3;
                        }
                        dVar2 = (xx.d) obj2;
                        bVar = dVar2.f192473a.f192498d;
                        if (bVar != null) {
                            linkedHashMap.put(bVar, Integer.valueOf(i14));
                        }
                        if (dVar2.f192473a == xx.e.f192490v) {
                            linkedHashMap.put(CalendarItemDTO.b.FBT_ADAPTIVE_WORKOUT, Integer.valueOf(i14));
                        }
                        i14 = i15;
                    }
                    N0 = h0.N0(arrayList, new c(linkedHashMap));
                }
                return new xx.b(dateTime2, aVar2.f73852a, tVar, N0);
            }
            return aVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(CalendarDTO calendarDTO, String str, List<xx.d> list) {
        list.getClass();
        this.f73852a = str;
        this.f73853b = list;
        this.f73854c = new is1.e(null, 1, 0 == true ? 1 : 0);
        this.f73855d = new zx.e(null, 1, null);
        this.f73856e = (vx.f) KoinJavaComponent.get$default(vx.f.class, null, null, 6, null);
        SparseArray<CalendarDTO> sparseArray = new SparseArray<>();
        if (calendarDTO != null) {
            sparseArray.put(calendarDTO.f30964d, calendarDTO);
        }
        this.f73857f = sparseArray;
        this.f73859h = new l(new f32.a(v1.a(this), new b(), null, 4, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object x4(a aVar, DateTime dateTime, v13.c cVar) throws Exception {
        fy.b bVar;
        Object objA;
        SparseArray<CalendarDTO> sparseArray = aVar.f73857f;
        if (cVar instanceof fy.b) {
            bVar = (fy.b) cVar;
            int i14 = bVar.f73869c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f73869c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new fy.b(aVar, cVar);
            }
        } else {
            bVar = new fy.b(aVar, cVar);
        }
        Object obj = bVar.f73867a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f73869c;
        if (i15 == 0) {
            r.b(obj);
            CalendarDTO calendarDTO = sparseArray.indexOfKey(dateTime.getMonthOfYear()) >= 0 ? sparseArray.get(dateTime.getMonthOfYear()) : null;
            if (calendarDTO != null && !aVar.f73858g) {
                return calendarDTO;
            }
            bVar.f73869c = 1;
            String str = aVar.f73852a;
            boolean z14 = str != null;
            zx.e eVar = aVar.f73855d;
            if (z14) {
                str.getClass();
                int year = dateTime.getYear();
                int monthOfYear = dateTime.getMonthOfYear() - 1;
                eVar.getClass();
                objA = f0.J(eVar, new zx.a(eVar, str, year, monthOfYear, null), bVar);
            } else {
                objA = eVar.a(dateTime, true, bVar);
            }
            obj = objA;
            if (obj == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.a) {
            throw ((v2.a) v2Var).f47383a;
        }
        v2Var.getClass();
        CalendarDTO calendarDTO2 = (CalendarDTO) ((v2.b) v2Var).f47386a;
        sparseArray.put(calendarDTO2.f30964d, calendarDTO2);
        aVar.f73858g = false;
        return calendarDTO2;
    }

    public /* synthetic */ a(CalendarDTO calendarDTO, String str, List list, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : calendarDTO, (i14 & 2) != 0 ? null : str, list);
    }
}
