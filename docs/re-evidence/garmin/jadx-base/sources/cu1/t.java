package cu1;

import com.garmin.android.apps.connectmobile.calendar.detail.model.CalendarDTO;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.s2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TimeZone;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p13.k0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"Lcu1/t;", "Le32/e;", "Lfw/m;", "Lcom/garmin/android/apps/connectmobile/calendar/detail/model/CalendarDTO;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t extends e32.e<fw.m<? extends CalendarDTO>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.training.atp.dashboard.a f55706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DateTime f55707b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f55708a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f55708a = iArr;
        }
    }

    public t(com.garmin.android.apps.connectmobile.training.atp.dashboard.a aVar, DateTime dateTime) {
        this.f55706a = aVar;
        this.f55707b = dateTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e32.e
    public final void a(fw.m<? extends CalendarDTO> mVar) {
        LinkedHashMap linkedHashMap;
        Object next;
        CalendarItemDTO calendarItemDTO;
        fw.m<? extends CalendarDTO> mVar2 = mVar;
        int i14 = a.f55708a[mVar2.f73769b.ordinal()];
        com.garmin.android.apps.connectmobile.training.atp.dashboard.a aVar = this.f55706a;
        if (i14 != 1) {
            if (i14 == 2) {
                s2 s2Var = aVar.I0;
                if (s2Var != null) {
                    s2Var.hideProgressOverlay();
                }
                g22.e.a(aVar, mVar2.f73771d);
                return;
            }
            if (i14 != 3) {
                u0.r();
                return;
            }
            s2 s2Var2 = aVar.I0;
            if (s2Var2 != null) {
                s2Var2.showProgressOverlay();
                return;
            }
            return;
        }
        s2 s2Var3 = aVar.I0;
        if (s2Var3 != null) {
            s2Var3.hideProgressOverlay();
        }
        CalendarDTO calendarDTO = (CalendarDTO) mVar2.f73770c;
        if (calendarDTO == null) {
            g22.e.a(aVar, null);
            return;
        }
        ArrayList arrayList = calendarDTO.f30966f;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            CalendarItemDTO calendarItemDTO2 = (CalendarItemDTO) obj;
            if (calendarItemDTO2.G() || (calendarItemDTO2.f30973d == CalendarItemDTO.b.ACTIVITY && calendarItemDTO2.f30991l1 > 0)) {
                if (g22.k.e(calendarItemDTO2.D(), DateTime.now().withDayOfMonth(1).withTimeAtStartOfDay(), aVar.X)) {
                    arrayList2.add(obj);
                }
            }
        }
        calendarDTO.f30966f = arrayList2;
        aVar.Y = calendarDTO;
        if (aVar.f45397k0 == null) {
            Long l14 = aVar.Z;
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                long j8 = ((CalendarItemDTO) next).f30967a;
                if (l14 != null && j8 == l14.longValue()) {
                    break;
                }
            }
            CalendarItemDTO calendarItemDTO3 = (CalendarItemDTO) next;
            if (calendarItemDTO3 != null) {
                calendarItemDTO = new CalendarItemDTO();
                calendarItemDTO.f30967a = (int) calendarItemDTO3.f30967a;
                calendarItemDTO.f30979g = calendarItemDTO3.f30979g;
                CalendarItemDTO.b bVar = CalendarItemDTO.b.WORKOUT;
                bVar.getClass();
                calendarItemDTO.f30973d = bVar;
                calendarItemDTO.f30991l1 = calendarItemDTO3.f30991l1;
            } else {
                calendarItemDTO = null;
            }
            if (calendarItemDTO != null) {
                aVar.f45397k0 = calendarItemDTO;
            }
        }
        DateTime dateTime = this.f55707b;
        int monthOfYear = dateTime.getMonthOfYear();
        int year = dateTime.getYear();
        com.garmin.android.apps.connectmobile.calendar.presentation.d dVarU6 = aVar.u6(monthOfYear, year);
        CalendarDTO calendarDTO2 = aVar.Y;
        ArrayList arrayList3 = calendarDTO2 != null ? calendarDTO2.f30966f : null;
        if (arrayList3 != null) {
            com.garmin.android.apps.connectmobile.calendar.presentation.b bVar2 = aVar.H0;
            HashMap mapB = bVar2 != null ? bVar2.b(arrayList3) : null;
            if (dVarU6 != null) {
                CalendarDTO calendarDTO3 = aVar.Y;
                if (mapB != null) {
                    linkedHashMap = new LinkedHashMap(mapB);
                } else {
                    k0 k0Var = k0.f134949a;
                    k0Var.getClass();
                    linkedHashMap = new LinkedHashMap(k0Var);
                }
                dVarU6.f31166o = linkedHashMap;
                dVarU6.f31157f = calendarDTO3;
                dVarU6.f31156e = null;
                dVarU6.notifyDataSetChanged();
                DateTime dateTimeW6 = com.garmin.android.apps.connectmobile.training.atp.dashboard.a.w6(year, aVar.T, monthOfYear);
                DateTime dateTimeV6 = com.garmin.android.apps.connectmobile.training.atp.dashboard.a.v6(year, monthOfYear, aVar.X, aVar.P);
                com.garmin.android.apps.connectmobile.calendar.presentation.d.f31148r.getClass();
                dVarU6.f31161j = h03.a.h(dateTimeW6.getMillis(), TimeZone.getDefault());
                dVarU6.f31162k = h03.a.h(dateTimeV6.getMillis(), TimeZone.getDefault());
            }
        }
        aVar.C = new com.garmin.android.apps.connectmobile.training.atp.dashboard.b(aVar);
    }
}
