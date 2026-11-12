package com.garmin.android.apps.connectmobile.training.atp.dashboard;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.calendar.detail.model.CalendarDTO;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.s2;
import com.roomorama.caldroid.CaldroidGridAdapter;
import cu1.t;
import ey.h;
import g22.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import o13.l;
import o13.m;
import o13.n;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/dashboard/a;", "Lcom/garmin/android/apps/connectmobile/calendar/presentation/a;", "<init>", "()V", "b", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends com.garmin.android.apps.connectmobile.calendar.presentation.a {
    public static final C0872a L0 = new C0872a(null);
    public int E;
    public DateTime F;
    public final com.garmin.android.apps.connectmobile.calendar.presentation.b H0 = com.garmin.android.apps.connectmobile.calendar.presentation.b.f31134b.a();
    public DateTime I;
    public s2 I0;
    public b J0;
    public final w1 K0;
    public DateTime P;
    public DateTime T;
    public DateTime X;
    public CalendarDTO Y;
    public Long Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public CalendarItemDTO f45397k0;

    public interface b {
        void P8();

        void f9();

        void j8();
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f45398a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f45398a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f45398a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/ViewModelStoreOwner;", "invoke", "()Landroidx/lifecycle/ViewModelStoreOwner;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<ViewModelStoreOwner> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45399a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar) {
            super(0);
            this.f45399a = aVar;
        }

        @Override // e23.a
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f45399a.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f45400a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(l lVar) {
            super(0);
            this.f45400a = lVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return ((ViewModelStoreOwner) this.f45400a.getValue()).getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f45402b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, l lVar) {
            super(0);
            this.f45401a = aVar;
            this.f45402b = lVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f45401a;
            if (aVar != null && (creationExtras = (CreationExtras) aVar.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f45402b.getValue();
            y yVar = viewModelStoreOwner instanceof y ? (y) viewModelStoreOwner : null;
            return yVar != null ? yVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f45403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f45404b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment, l lVar) {
            super(0);
            this.f45403a = fragment;
            this.f45404b = lVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            x1.c defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f45404b.getValue();
            y yVar = viewModelStoreOwner instanceof y ? (y) viewModelStoreOwner : null;
            return (yVar == null || (defaultViewModelProviderFactory = yVar.getDefaultViewModelProviderFactory()) == null) ? this.f45403a.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public a() {
        l lVarA = m.a(n.NONE, new d(new c(this)));
        this.K0 = new w1(s0.f105811a.b(h.class), new e(lVarA), new g(this, lVarA), new f(null, lVarA));
    }

    public static CalendarItemDTO A6(com.garmin.android.apps.connectmobile.calendar.presentation.d dVar, DateTime dateTime) {
        Object obj = null;
        ArrayList arrayListE = dVar != null ? dVar.e(dateTime) : null;
        if (arrayListE == null) {
            return null;
        }
        for (Object obj2 : arrayListE) {
            if (((CalendarItemDTO) obj2).f30973d == CalendarItemDTO.b.WORKOUT) {
                obj = obj2;
                break;
            }
        }
        return (CalendarItemDTO) obj;
    }

    public static DateTime v6(int i14, int i15, DateTime dateTime, DateTime dateTime2) {
        DateTime dateTimeWithMaximumValue = DateTime.now().withYear(i14).withMonthOfYear(i15).dayOfMonth().withMaximumValue();
        dateTimeWithMaximumValue.getClass();
        DateTime dateTimeA = k.A(dateTimeWithMaximumValue);
        if (dateTime != null && dateTime2 != null) {
            DateTime dateTimeMinusDays = dateTime2.minusDays(1);
            if (!dateTimeA.isBefore(dateTime)) {
                if (dateTime.isBefore(dateTimeMinusDays)) {
                    return dateTime;
                }
                dateTimeMinusDays.getClass();
                return dateTimeMinusDays;
            }
            if (!dateTimeA.isBefore(dateTimeMinusDays)) {
                dateTimeMinusDays.getClass();
                return dateTimeMinusDays;
            }
        }
        return dateTimeA;
    }

    public static DateTime w6(int i14, DateTime dateTime, int i15) {
        DateTime dateTimeWithTimeAtStartOfDay = DateTime.now().withYear(i14).withMonthOfYear(i15).dayOfMonth().withMinimumValue().withTimeAtStartOfDay();
        if (dateTime != null) {
            return dateTimeWithTimeAtStartOfDay.isAfter(dateTime) ? dateTimeWithTimeAtStartOfDay : dateTime;
        }
        dateTimeWithTimeAtStartOfDay.getClass();
        return dateTimeWithTimeAtStartOfDay;
    }

    public static boolean y6(com.garmin.android.apps.connectmobile.calendar.presentation.d dVar, DateTime dateTime) {
        Object obj = null;
        ArrayList arrayListE = dVar != null ? dVar.e(dateTime) : null;
        if (arrayListE != null) {
            for (Object obj2 : arrayListE) {
                if (((CalendarItemDTO) obj2).f30973d == CalendarItemDTO.b.WORKOUT) {
                    obj = obj2;
                    break;
                }
            }
            obj = (CalendarItemDTO) obj;
        }
        return obj != null;
    }

    @Override // com.garmin.android.apps.connectmobile.calendar.presentation.a
    public final CaldroidGridAdapter getNewDatesGridAdapter(int i14, int i15) {
        h03.a aVarH;
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        com.garmin.android.apps.connectmobile.calendar.presentation.d dVar = new com.garmin.android.apps.connectmobile.calendar.presentation.d(mVarRequireActivity, i14, i15, getCaldroidData(), this.f31121p, (this.E - getResources().getDimension(R.dimen.calendar_month_view_height)) - getResources().getDimension(R.dimen.calendar_week_day_height), null, null, false);
        DateTime dateTime = this.I;
        if (dateTime != null) {
            com.garmin.android.apps.connectmobile.calendar.presentation.d.f31148r.getClass();
            aVarH = h03.a.h(dateTime.getMillis(), TimeZone.getDefault());
        } else {
            aVarH = null;
        }
        dVar.f31160i = aVarH;
        DateTime dateTimeW6 = w6(i15, this.T, i14);
        DateTime dateTimeV6 = v6(i15, i14, this.X, this.P);
        com.garmin.android.apps.connectmobile.calendar.presentation.d.f31148r.getClass();
        dVar.f31161j = h03.a.h(dateTimeW6.getMillis(), TimeZone.getDefault());
        dVar.f31162k = h03.a.h(dateTimeV6.getMillis(), TimeZone.getDefault());
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.I0 = (s2) context;
            this.J0 = (b) context;
        } catch (ClassCastException unused) {
            wr.g.u(context, " must implement ProgressOverlayListener and RescheduleWorkoutListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        DateTime dateTime;
        DateTime dateTime2;
        Object serializable;
        Object serializable2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.E = arguments != null ? arguments.getInt("CONTAINER_HEIGHT") : 0;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable2 = arguments2.getSerializable("WORKOUT_DATE", DateTime.class);
            } else {
                Object serializable3 = arguments2.getSerializable("WORKOUT_DATE");
                if (!(serializable3 instanceof DateTime)) {
                    serializable3 = null;
                }
                serializable2 = (DateTime) serializable3;
            }
            dateTime = (DateTime) serializable2;
        } else {
            dateTime = null;
        }
        this.I = dateTime;
        Bundle arguments3 = getArguments();
        this.Z = arguments3 != null ? Long.valueOf(arguments3.getLong("WORKOUT_SCHEDULE_ID")) : null;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = arguments4.getSerializable("RACE_DATE", DateTime.class);
            } else {
                Object serializable4 = arguments4.getSerializable("RACE_DATE");
                if (!(serializable4 instanceof DateTime)) {
                    serializable4 = null;
                }
                serializable = (DateTime) serializable4;
            }
            dateTime2 = (DateTime) serializable;
        } else {
            dateTime2 = null;
        }
        this.P = dateTime2;
        DateTime dateTime3 = this.I;
        if (dateTime3 != null) {
            this.T = DateTime.now().withTimeAtStartOfDay();
            this.X = dateTime3.plusDays(7);
            this.Y = null;
            h hVar = (h) this.K0.getValue();
            y0 y0Var = new y0();
            ge1.b.T(v1.a(hVar), null, null, new ey.f(y0Var, hVar, dateTime3, false, null), 3);
            y0Var.f(this, new t(this, dateTime3));
        }
    }

    public final com.garmin.android.apps.connectmobile.calendar.presentation.d u6(int i14, int i15) {
        Object next;
        Iterator<T> it = this.f31126w.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            CaldroidGridAdapter caldroidGridAdapter = (CaldroidGridAdapter) next;
            caldroidGridAdapter.getClass();
            com.garmin.android.apps.connectmobile.calendar.presentation.d dVar = (com.garmin.android.apps.connectmobile.calendar.presentation.d) caldroidGridAdapter;
            if (i14 == dVar.f() && i15 == dVar.g()) {
                break;
            }
        }
        CaldroidGridAdapter caldroidGridAdapter2 = (CaldroidGridAdapter) next;
        if (caldroidGridAdapter2 == null || !(caldroidGridAdapter2 instanceof com.garmin.android.apps.connectmobile.calendar.presentation.d)) {
            return null;
        }
        return (com.garmin.android.apps.connectmobile.calendar.presentation.d) caldroidGridAdapter2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public final void z6(DateTime dateTime) {
        Long lValueOf;
        DateTime dateTimePlusDays;
        Long lValueOf2;
        ArrayList arrayList;
        Object next;
        this.F = dateTime;
        com.garmin.android.apps.connectmobile.calendar.presentation.d dVarU6 = u6(dateTime.getMonthOfYear(), dateTime.getYear());
        DateTime dateTimeMinusDays = dateTime.minusDays(1);
        DateTime dateTimePlusDays2 = dateTime.plusDays(1);
        dateTimeMinusDays.getClass();
        boolean zY6 = y6(dVarU6, dateTimeMinusDays);
        dateTimePlusDays2.getClass();
        boolean zY7 = y6(dVarU6, dateTimePlusDays2);
        CalendarDTO calendarDTO = this.Y;
        if (calendarDTO == null || (arrayList = calendarDTO.f30966f) == null) {
            lValueOf = null;
        } else {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                long j8 = ((CalendarItemDTO) next).f30967a;
                Long l14 = this.Z;
                if (l14 != null && j8 == l14.longValue()) {
                    break;
                }
            }
            CalendarItemDTO calendarItemDTO = (CalendarItemDTO) next;
            if (calendarItemDTO != null) {
                lValueOf = Long.valueOf(calendarItemDTO.f30993m1);
            } else {
                lValueOf = null;
            }
        }
        CalendarItemDTO calendarItemDTOA6 = A6(dVarU6, dateTimeMinusDays);
        Long lValueOf3 = calendarItemDTOA6 != null ? Long.valueOf(calendarItemDTOA6.f30993m1) : null;
        CalendarItemDTO calendarItemDTOA7 = A6(dVarU6, dateTimePlusDays2);
        Long lValueOf4 = calendarItemDTOA7 != null ? Long.valueOf(calendarItemDTOA7.f30993m1) : null;
        if (zY6 && zY7) {
            if (s.g(lValueOf, lValueOf3) || s.g(lValueOf, lValueOf4)) {
                return;
            }
        } else {
            if (!zY6) {
                if (!zY7) {
                    dateTimePlusDays = dateTimePlusDays2.plusDays(1);
                    dateTimePlusDays.getClass();
                    if (!y6(dVarU6, dateTimePlusDays)) {
                        CalendarItemDTO calendarItemDTOA8 = A6(dVarU6, dateTimePlusDays);
                        if (calendarItemDTOA8 != null) {
                        }
                        if (s.g(lValueOf, lValueOf4)) {
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            DateTime dateTimeMinusDays2 = dateTimeMinusDays.minusDays(1);
            dateTimeMinusDays2.getClass();
            if (y6(dVarU6, dateTimeMinusDays2)) {
                CalendarItemDTO calendarItemDTOA9 = A6(dVarU6, dateTimeMinusDays2);
                lValueOf2 = calendarItemDTOA9 != null ? Long.valueOf(calendarItemDTOA9.f30993m1) : null;
                if (s.g(lValueOf, lValueOf3) || s.g(lValueOf, lValueOf2)) {
                    return;
                }
            } else {
                if (!zY7) {
                    return;
                }
                dateTimePlusDays = dateTimePlusDays2.plusDays(1);
                dateTimePlusDays.getClass();
                if (!y6(dVarU6, dateTimePlusDays)) {
                    return;
                }
                CalendarItemDTO calendarItemDTOA10 = A6(dVarU6, dateTimePlusDays);
                lValueOf2 = calendarItemDTOA10 != null ? Long.valueOf(calendarItemDTOA10.f30993m1) : null;
                if (s.g(lValueOf, lValueOf4) || s.g(lValueOf, lValueOf2)) {
                    return;
                }
            }
        }
        b bVar = this.J0;
        if (bVar != null) {
            bVar.f9();
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.training.atp.dashboard.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/dashboard/a$a;", "", "<init>", "()V", "", "WORKOUT_SCHEDULE_ID", "Ljava/lang/String;", "WORKOUT_DATE", "RACE_DATE", "CONTAINER_HEIGHT", "", "CONSECUTIVE_WORKOUTS_NUMBER", "I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0872a {
        public /* synthetic */ C0872a(j jVar) {
            this();
        }

        private C0872a() {
        }
    }
}
