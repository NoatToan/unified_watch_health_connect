package com.garmin.android.apps.connectmobile.calendar.presentation;

import c22.j0;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import lj0.k;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.json.JSONArray;
import org.json.JSONException;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/presentation/b;", "", "<init>", "()V", "b", "a", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f31134b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static b f31135c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<CalendarItemDTO.b> f31136a;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.calendar.presentation.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/presentation/b$b;", "Llj0/k;", "Ld80/b;", "callback", "<init>", "(Lcom/garmin/android/apps/connectmobile/calendar/presentation/b;Ld80/b;)V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class C0498b implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d80.b f31138a;

        public C0498b(b bVar, d80.b bVar2) {
            this.f31138a = bVar2;
        }

        @Override // lj0.k
        public final void a(lj0.b bVar) {
            bVar.getClass();
            i2.a.j(i2.f36769a, "CalendarDataManager", bVar.toString());
            d80.b bVar2 = this.f31138a;
            if (bVar2 != null) {
                bVar2.a(bVar);
            }
        }

        @Override // lj0.k
        public final void b(lj0.e.a aVar) {
            d80.b bVar = this.f31138a;
            aVar.getClass();
            try {
                Object obj = aVar.f112977a;
                obj.getClass();
                bm2.c[] cVarArrF = bm2.c.f(new JSONArray((String) obj));
                if (bVar != null) {
                    bVar.b(cVarArrF, d80.b.a.GARMIN_CONNECT);
                }
            } catch (JSONException e4) {
                i2.a.j(i2.f36769a, "CalendarDataManager", "Registered devices bad json: " + e4.getMessage());
                if (bVar != null) {
                    bVar.a(lj0.b.f112956j);
                }
            }
        }
    }

    public /* synthetic */ b(j jVar) {
        this();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0057  */
    public static ArrayList a(List list) {
        boolean z14;
        boolean z15;
        boolean z16;
        DateTime dateTimeK;
        List list2 = list;
        if (list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListC = c(list2, CalendarItemDTO.b.ACTIVITY);
        int size = list2.size();
        int i14 = 0;
        while (i14 < size) {
            CalendarItemDTO calendarItemDTO = (CalendarItemDTO) list2.get(i14);
            if (calendarItemDTO.f30973d == CalendarItemDTO.b.STEPS) {
                bv.b.f21239a.getClass();
                bv.b.a();
                if (!k1.f37122a.l0() || calendarItemDTO.f31016z > 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
            if (calendarItemDTO.f30973d == CalendarItemDTO.b.PUSHES) {
                bv.b.f21239a.getClass();
                bv.b.a();
                if (k1.f37122a.l0() || calendarItemDTO.B > 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            } else {
                z15 = false;
            }
            CalendarItemDTO.b bVar = calendarItemDTO.f30973d;
            boolean z17 = bVar == CalendarItemDTO.b.STRESS && calendarItemDTO.O0 > -1;
            if (bVar == CalendarItemDTO.b.MOVE_IQ_EVENT) {
                String str = "yyyy-MM-dd'T'HH:mm:ss.SSS";
                DateTime dateTimeK2 = j0.K(calendarItemDTO.X0, "yyyy-MM-dd'T'HH:mm:ss.SSS");
                if (dateTimeK2 != null) {
                    DateTime dateTimePlusSeconds = dateTimeK2.plusSeconds((int) calendarItemDTO.F());
                    dateTimePlusSeconds.getClass();
                    Iterator it = arrayListC.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            CalendarItemDTO calendarItemDTO2 = (CalendarItemDTO) it.next();
                            if (calendarItemDTO2 != null && (dateTimeK = j0.K(calendarItemDTO2.X0, str)) != null) {
                                String str2 = str;
                                if (dateTimeK2.getMillis() >= dateTimeK.plusSeconds((int) calendarItemDTO2.F()).getMillis() || dateTimePlusSeconds.getMillis() <= dateTimeK.getMillis()) {
                                    str = str2;
                                } else {
                                    z16 = false;
                                }
                            }
                        }
                    }
                }
                z16 = true;
            } else {
                z16 = false;
            }
            CalendarItemDTO.b bVar2 = calendarItemDTO.f30973d;
            CalendarItemDTO.b bVar3 = CalendarItemDTO.b.BODY_BATTERY;
            boolean z18 = bVar2 == bVar3 && (calendarItemDTO.f30986j1 > -1 || calendarItemDTO.f30989k1 > -1);
            CalendarItemDTO.b bVar4 = CalendarItemDTO.b.FBT_ADAPTIVE_WORKOUT;
            boolean z19 = bVar2 == bVar4 && calendarItemDTO.f30977f != null;
            CalendarItemDTO.b bVar5 = CalendarItemDTO.b.HRV_STATUS;
            boolean z24 = bVar2 == bVar5 && calendarItemDTO.I0 > 0;
            boolean z25 = (bVar2 == CalendarItemDTO.b.STEPS || bVar2 == CalendarItemDTO.b.PUSHES || bVar2 == CalendarItemDTO.b.STRESS || bVar2 == CalendarItemDTO.b.MOVE_IQ_EVENT || bVar2 == CalendarItemDTO.b.NOTE || bVar2 == CalendarItemDTO.b.UNKNOWN || bVar2 == bVar3 || bVar2 == bVar4 || bVar2 == bVar5) ? false : true;
            if (z14 || z15 || z17 || z24 || z16 || z18 || z19 || z25) {
                if (bVar2 == CalendarItemDTO.b.EVENT) {
                    arrayList.add(0, calendarItemDTO);
                } else {
                    arrayList.add(calendarItemDTO);
                }
            }
            i14++;
            list2 = list;
        }
        return arrayList;
    }

    public static ArrayList c(List list, CalendarItemDTO.b bVar) {
        list.getClass();
        bVar.getClass();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            CalendarItemDTO calendarItemDTO = (CalendarItemDTO) list.get(i14);
            if (calendarItemDTO.f30973d == bVar) {
                arrayList.add(calendarItemDTO);
            }
        }
        return arrayList;
    }

    public final HashMap b(List list) {
        list.getClass();
        HashMap map = new HashMap();
        List<CalendarItemDTO.b> listD = d();
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            CalendarItemDTO calendarItemDTO = (CalendarItemDTO) list.get(i14);
            if (calendarItemDTO != null) {
                f31134b.getClass();
                if (!a.b(calendarItemDTO)) {
                    CalendarItemDTO.b bVar = calendarItemDTO.f30973d;
                    if (!ey.b.a(bVar) || listD.contains(bVar)) {
                        Object arrayList = map.get(calendarItemDTO.f30979g);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        ((List) arrayList).add(calendarItemDTO);
                        String str = calendarItemDTO.f30979g;
                        if (str != null) {
                            map.put(str, arrayList);
                        }
                    }
                }
            }
        }
        return map;
    }

    public final List<CalendarItemDTO.b> d() {
        if (this.f31136a == null) {
            xx.c cVar = new xx.c();
            ArrayList<CalendarItemDTO.b> arrayList = new ArrayList<>();
            int size = cVar.b().size();
            for (int i14 = 0; i14 < size; i14++) {
                xx.d dVar = cVar.b().get(i14);
                dVar.getClass();
                xx.d dVar2 = dVar;
                xx.e eVar = dVar2.f192473a;
                if (dVar2.a()) {
                    arrayList.add(eVar.f192498d);
                    if (eVar == xx.e.f192490v) {
                        arrayList.add(CalendarItemDTO.b.FBT_ADAPTIVE_WORKOUT);
                    }
                }
            }
            this.f31136a = arrayList;
        }
        ArrayList<CalendarItemDTO.b> arrayList2 = this.f31136a;
        return arrayList2 != null ? arrayList2 : p13.j0.f134944a;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/presentation/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lcom/garmin/android/apps/connectmobile/calendar/presentation/b;", "_instance", "Lcom/garmin/android/apps/connectmobile/calendar/presentation/b;", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.calendar.presentation.b$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0497a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f31137a;

            static {
                int[] iArr = new int[CalendarItemDTO.b.values().length];
                try {
                    iArr[CalendarItemDTO.b.SLEEP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CalendarItemDTO.b.SLEEP_AND_SCORE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CalendarItemDTO.b.SLEEP_COACH.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CalendarItemDTO.b.STEPS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CalendarItemDTO.b.HEART_RATE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[CalendarItemDTO.b.BLOOD_PRESSURE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[CalendarItemDTO.b.MENSTRUAL_CYCLE.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f31137a = iArr;
            }
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:21:0x0042 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:22:0x0043 A[RETURN] */
        public static boolean b(CalendarItemDTO calendarItemDTO) {
            CalendarItemDTO.b bVar = calendarItemDTO.f30973d;
            switch (bVar == null ? -1 : C0497a.f31137a[bVar.ordinal()]) {
                case 1:
                case 2:
                    return c(calendarItemDTO.D);
                case 3:
                    return c(g22.k.g(calendarItemDTO.D().toLocalDate(), LocalDate.now()) ? calendarItemDTO.P : calendarItemDTO.I);
                case 4:
                    double d14 = calendarItemDTO.f31016z;
                    if (!Double.isNaN(d14) && d14 != -1.0d) {
                        double d15 = calendarItemDTO.A;
                        if (!Double.isNaN(d15) && d15 != -1.0d) {
                            return false;
                        }
                    }
                    return true;
                case 5:
                    if (c(calendarItemDTO.X) || c(calendarItemDTO.Y)) {
                        return true;
                    }
                    return false;
                case 6:
                    if (c(calendarItemDTO.K0) || c(calendarItemDTO.L0)) {
                        return true;
                    }
                    return false;
                case 7:
                    return c(calendarItemDTO.f31001q1);
                default:
                    return false;
            }
        }

        public static boolean c(double d14) {
            return Double.isNaN(d14) || d14 == 0.0d;
        }

        public final synchronized b a() {
            try {
                if (b.f31135c == null) {
                    b.f31135c = new b(null);
                }
            } catch (Throwable th3) {
                throw th3;
            }
            return b.f31135c;
        }

        private a() {
        }
    }

    private b() {
    }
}
