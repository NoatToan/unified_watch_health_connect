package qb1;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import java.util.Calendar;
import java.util.LinkedHashSet;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lqb1/e;", "Landroidx/fragment/app/Fragment;", "Lqb1/b0;", "<init>", "()V", "b", "c", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends Fragment implements b0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f144043e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MaterialCalendarView f144044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f144045b = new w1(s0.f105811a.b(qb1.f.class), new d(this), new f(this), new C2719e(null, this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a0 f144046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f144047d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqb1/e$b;", "Lxz2/j;", "Lxz2/b;", "minimumDate", "maximumDate", "<init>", "(Lxz2/b;Lxz2/b;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements xz2.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xz2.b f144048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xz2.b f144049b;

        public b(xz2.b bVar, xz2.b bVar2) {
            bVar.getClass();
            bVar2.getClass();
            this.f144048a = bVar;
            this.f144049b = bVar2;
        }

        @Override // xz2.j
        public final boolean a(xz2.b bVar) {
            bVar.getClass();
            return bVar.i(this.f144048a) || bVar.h(this.f144049b);
        }

        @Override // xz2.j
        public final void b(xz2.k kVar) {
            kVar.a();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqb1/e$c;", "Lxz2/j;", "<init>", "(Lqb1/e;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c implements xz2.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable f144050a;

        public c() {
            Context context = e.this.getContext();
            if (context != null) {
                this.f144050a = a7.b.getDrawable(context, R.drawable.gcm4_calendar_selected_day_bck);
            }
        }

        @Override // xz2.j
        public final boolean a(xz2.b bVar) {
            bVar.getClass();
            MaterialCalendarView materialCalendarView = e.this.f144044a;
            if (materialCalendarView != null) {
                return p005kotlin.jvm.internal.s.g(materialCalendarView.getSelectedDate(), bVar);
            }
            p005kotlin.jvm.internal.s.m("mCalendar");
            throw null;
        }

        @Override // xz2.j
        public final void b(xz2.k kVar) {
            Drawable drawable = this.f144050a;
            if (drawable != null) {
                kVar.b(drawable);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f144052a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f144052a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f144052a.requireActivity().getF189591b();
        }
    }

    /* JADX INFO: renamed from: qb1.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C2719e extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f144053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f144054b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2719e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f144053a = aVar;
            this.f144054b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f144053a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f144054b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f144055a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f144055a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f144055a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    static {
        new a(null);
    }

    @Override // qb1.b0
    public final void i0() {
        MaterialCalendarView materialCalendarView = this.f144044a;
        if (materialCalendarView == null) {
            p005kotlin.jvm.internal.s.m("mCalendar");
            throw null;
        }
        if (materialCalendarView.getSelectedDate() == null) {
            Context context = getContext();
            if (context != null) {
                MaterialCalendarView materialCalendarView2 = this.f144044a;
                if (materialCalendarView2 == null) {
                    p005kotlin.jvm.internal.s.m("mCalendar");
                    throw null;
                }
                if (materialCalendarView2.getSelectedDate() == null) {
                    MaterialCalendarView materialCalendarView3 = this.f144044a;
                    if (materialCalendarView3 == null) {
                        p005kotlin.jvm.internal.s.m("mCalendar");
                        throw null;
                    }
                    LocalDate localDatePlusDays = new LocalDate().plusDays(279);
                    Calendar calendar = Calendar.getInstance();
                    calendar.clear();
                    calendar.set(localDatePlusDays.getYear(), localDatePlusDays.getMonthOfYear(), localDatePlusDays.getDayOfMonth());
                    calendar.setTime(localDatePlusDays.toDate());
                    materialCalendarView3.setSelectedDate(calendar);
                }
                c22.f.d(c22.f.f23050a, context, getString(R.string.pregnancy_invalid_due_date), getString(R.string.pregnancy_setup_conflict_message), new o13.p(getString(R.string.lbl_common_continue), new ov1.q(this, 20)), new o13.p(getString(R.string.lbl_cancel), new q51.a(10)), null, false, 96).show();
                return;
            }
            return;
        }
        qb1.f fVarU6 = u6();
        MaterialCalendarView materialCalendarView4 = this.f144044a;
        if (materialCalendarView4 == null) {
            p005kotlin.jvm.internal.s.m("mCalendar");
            throw null;
        }
        xz2.b selectedDate = materialCalendarView4.getSelectedDate();
        selectedDate.getClass();
        Calendar calendarF = selectedDate.f();
        calendarF.getClass();
        calendarF.add(5, -279);
        ww0.j jVar = fVarU6.f144067k;
        if (jVar != null) {
            LocalDate periodStartDate = jVar.getPeriodStartDate();
            Integer periodLength = jVar.getPeriodLength();
            if (periodStartDate != null && periodLength != null) {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTime(periodStartDate.toDate());
                calendar2.add(5, periodLength.intValue());
            }
        }
        qb1.f fVarU7 = u6();
        MaterialCalendarView materialCalendarView5 = this.f144044a;
        if (materialCalendarView5 == null) {
            p005kotlin.jvm.internal.s.m("mCalendar");
            throw null;
        }
        xz2.b selectedDate2 = materialCalendarView5.getSelectedDate();
        selectedDate2.getClass();
        if (fVarU7.f144069m.contains(new LocalDate(selectedDate2.f192861a, selectedDate2.f192862b + 1, selectedDate2.f192863c))) {
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(requireContext());
            aVar.setTitle(R.string.pregnancy_conflicting_dates);
            aVar.setMessage(getString(R.string.pregnancy_selected_date_conflict));
            aVar.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
            androidx.appcompat.app.e eVarCreate = aVar.create();
            eVarCreate.getClass();
            eVarCreate.show();
            return;
        }
        qb1.f fVarU8 = u6();
        MaterialCalendarView materialCalendarView6 = this.f144044a;
        if (materialCalendarView6 == null) {
            p005kotlin.jvm.internal.s.m("mCalendar");
            throw null;
        }
        xz2.b selectedDate3 = materialCalendarView6.getSelectedDate();
        selectedDate3.getClass();
        fVarU8.C.d(new LocalDate(selectedDate3.f192861a, selectedDate3.f192862b + 1, selectedDate3.f192863c));
        a0 a0Var = this.f144046c;
        if (a0Var != null) {
            a0Var.E8();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (getActivity() instanceof a0) {
            a7.e activity = getActivity();
            activity.getClass();
            this.f144046c = (a0) activity;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_setup_due_date, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        Comparable comparableD;
        LocalDate periodStartDate;
        ww0.j jVar;
        ww0.a cycleType;
        LocalDate periodStartDate2;
        int iMax;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.pregnancy_setup_due_date_calendar);
        viewFindViewById.getClass();
        this.f144044a = (MaterialCalendarView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.pregnancy_setup_due_date_bottom_description);
        viewFindViewById2.getClass();
        this.f144047d = (TextView) viewFindViewById2;
        qb1.f fVarU6 = u6();
        LinkedHashSet linkedHashSet = fVarU6.f144070n;
        db1.i iVar = new db1.i(null, null, null, 7, null);
        ww0.j jVar2 = fVarU6.f144067k;
        if (jVar2 == null || (periodStartDate2 = jVar2.getPeriodStartDate()) == null || Days.daysBetween(periodStartDate2, new LocalDate()).getDays() >= 279) {
            LocalDate localDate = new LocalDate();
            LocalDate localDate2 = (LocalDate) h0.o0(linkedHashSet);
            LocalDate localDatePlusDays = localDate2 != null ? localDate2.plusDays(1) : null;
            if (localDatePlusDays != null) {
                LocalDate localDatePlusDays2 = localDatePlusDays.plusDays(279);
                localDatePlusDays2.getClass();
                comparableD = r13.b.d(localDate, localDatePlusDays2);
            } else {
                comparableD = localDate;
            }
            LocalDate localDatePlusMonths = localDate.plusMonths(8);
            localDatePlusMonths.getClass();
            LocalDate localDate3 = (LocalDate) r13.b.d(comparableD, localDatePlusMonths);
            LocalDate localDatePlusDays3 = localDate.plusDays(279);
            iVar.f59020a = (LocalDate) comparableD;
            iVar.f59021b = localDatePlusDays3;
            iVar.f59022c = localDate3;
        } else {
            ww0.j jVar3 = fVarU6.f144067k;
            if (jVar3 != null) {
                LocalDate periodStartDate3 = jVar3.getPeriodStartDate();
                periodStartDate3.getClass();
                ww0.a cycleType2 = jVar3.getCycleType();
                if (cycleType2 == null) {
                    cycleType2 = ww0.a.REGULAR;
                }
                ww0.a aVar = ww0.a.PREGNANT;
                if (cycleType2 == aVar) {
                    Integer cycleLength = jVar3.getCycleLength();
                    iMax = Math.max(cycleLength != null ? cycleLength.intValue() : 0, 279);
                } else {
                    iMax = -10;
                }
                LocalDate localDate4 = new LocalDate();
                LocalDate localDatePlusDays4 = periodStartDate3.plusDays(iMax);
                LocalDate localDatePlusDays5 = cycleType2 == aVar ? localDate4.plusDays(279) : localDatePlusDays4.plusDays(279);
                LocalDate localDate5 = (LocalDate) h0.o0(linkedHashSet);
                LocalDate localDatePlusDays6 = localDate5 != null ? localDate5.plusDays(1) : null;
                if (localDatePlusDays6 == null) {
                    localDatePlusDays6 = localDatePlusDays4;
                }
                LocalDate localDatePlusDays7 = localDatePlusDays6.plusDays(279);
                localDatePlusDays7.getClass();
                LocalDate localDatePlusDays8 = localDatePlusDays4.plusDays(279);
                localDatePlusDays8.getClass();
                LocalDate localDate6 = (LocalDate) r13.b.d(localDatePlusDays7, localDatePlusDays8);
                LocalDate localDatePlusDays9 = localDate4.plusDays(279);
                localDatePlusDays9.getClass();
                iVar.f59020a = (LocalDate) r13.b.e(localDate6, localDatePlusDays9);
                iVar.f59021b = localDatePlusDays9;
                localDatePlusDays5.getClass();
                iVar.f59022c = (LocalDate) r13.b.e(localDatePlusDays9, r13.b.d(localDate6, localDatePlusDays5));
            }
        }
        LocalDate localDate7 = iVar.f59020a;
        if (localDate7 == null) {
            localDate7 = new LocalDate();
        }
        LocalDate localDatePlusDays10 = iVar.f59021b;
        if (localDatePlusDays10 == null) {
            localDatePlusDays10 = new LocalDate().plusDays(280);
        }
        LocalDate localDatePlusDays11 = iVar.f59022c;
        if (localDatePlusDays11 == null) {
            localDatePlusDays11 = new LocalDate().plusDays(279);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(localDate7.getYear(), localDate7.getMonthOfYear(), localDate7.getDayOfMonth());
        calendar.setTime(localDate7.toDate());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.clear();
        calendar2.set(localDatePlusDays10.getYear(), localDatePlusDays10.getMonthOfYear(), localDatePlusDays10.getDayOfMonth());
        calendar2.setTime(localDatePlusDays10.toDate());
        Calendar calendar3 = Calendar.getInstance();
        calendar3.clear();
        calendar3.set(localDatePlusDays11.getYear(), localDatePlusDays11.getMonthOfYear(), localDatePlusDays11.getDayOfMonth());
        calendar3.setTime(localDatePlusDays11.toDate());
        MaterialCalendarView materialCalendarView = this.f144044a;
        if (materialCalendarView == null) {
            p005kotlin.jvm.internal.s.m("mCalendar");
            throw null;
        }
        materialCalendarView.setSelectedDate(calendar3);
        TextView textView = this.f144047d;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("mDueDateSummaryTextView");
            throw null;
        }
        textView.setVisibility(8);
        ww0.j jVar4 = u6().f144067k;
        if (jVar4 != null && (periodStartDate = jVar4.getPeriodStartDate()) != null && Days.daysBetween(periodStartDate, new LocalDate()).getDays() < 279 && (jVar = u6().f144067k) != null && (cycleType = jVar.getCycleType()) != null && cycleType != ww0.a.PREGNANT) {
            LocalDate periodStartDate4 = jVar.getPeriodStartDate();
            periodStartDate4.getClass();
            LocalDate localDatePlusDays12 = periodStartDate4.plusDays(279);
            if (Days.daysBetween(localDatePlusDays12, new LocalDate()).getDays() <= 279) {
                j0 j0Var = j0.f23099a;
                DateTime dateTimeAtStartOfDay = localDatePlusDays12.toDateTimeAtStartOfDay();
                j0Var.getClass();
                String strK = j0.k(dateTimeAtStartOfDay, 'M');
                Calendar calendar4 = Calendar.getInstance();
                calendar4.clear();
                calendar4.set(localDatePlusDays12.getYear(), localDatePlusDays12.getMonthOfYear(), localDatePlusDays12.getDayOfMonth());
                calendar4.setTime(localDatePlusDays12.toDate());
                MaterialCalendarView materialCalendarView2 = this.f144044a;
                if (materialCalendarView2 == null) {
                    p005kotlin.jvm.internal.s.m("mCalendar");
                    throw null;
                }
                materialCalendarView2.setSelectedDate(calendar4);
                TextView textView2 = this.f144047d;
                if (textView2 == null) {
                    p005kotlin.jvm.internal.s.m("mDueDateSummaryTextView");
                    throw null;
                }
                textView2.setText(getString(R.string.pregnancy_due_date_selection_tip, strK));
                TextView textView3 = this.f144047d;
                if (textView3 == null) {
                    p005kotlin.jvm.internal.s.m("mDueDateSummaryTextView");
                    throw null;
                }
                textView3.setVisibility(0);
            }
        }
        MaterialCalendarView materialCalendarView3 = this.f144044a;
        if (materialCalendarView3 == null) {
            p005kotlin.jvm.internal.s.m("mCalendar");
            throw null;
        }
        xz2.b bVarB = xz2.b.b(calendar);
        bVarB.getClass();
        xz2.b bVarB2 = xz2.b.b(calendar2);
        bVarB2.getClass();
        materialCalendarView3.a(new b(bVarB, bVarB2), new c());
        calendar.set(5, calendar.getActualMinimum(5));
        calendar2.set(5, calendar2.getActualMaximum(5));
        MaterialCalendarView materialCalendarView4 = this.f144044a;
        if (materialCalendarView4 == null) {
            p005kotlin.jvm.internal.s.m("mCalendar");
            throw null;
        }
        MaterialCalendarView.h hVarA = materialCalendarView4.A.a();
        hVarA.f54800d = xz2.b.b(calendar);
        hVarA.f54801e = xz2.b.b(calendar2);
        hVarA.f54798b = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).e1().a();
        hVarA.a();
        MaterialCalendarView materialCalendarView5 = this.f144044a;
        if (materialCalendarView5 != null) {
            materialCalendarView5.setOnDateChangedListener(new q6.f(3));
        } else {
            p005kotlin.jvm.internal.s.m("mCalendar");
            throw null;
        }
    }

    @Override // qb1.b0
    public final void r0() {
    }

    public final qb1.f u6() {
        return (qb1.f) this.f144045b.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqb1/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
