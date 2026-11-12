package com.garmin.android.apps.connectmobile.traininginitiative.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import java.util.Calendar;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import sg0.w0;
import ty1.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/j;", "Lty1/h0;", "<init>", "()V", "a", "b", "c", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends h0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f46094h = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ry1.a f46095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f46096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f46097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f46098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MaterialCalendarView f46099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f46100g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/j$b;", "Lxz2/j;", "Lxz2/b;", "minimumDate", "maximumDate", "<init>", "(Lxz2/b;Lxz2/b;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements xz2.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xz2.b f46101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xz2.b f46102b;

        public b(xz2.b bVar, xz2.b bVar2) {
            bVar.getClass();
            bVar2.getClass();
            this.f46101a = bVar;
            this.f46102b = bVar2;
        }

        @Override // xz2.j
        public final boolean a(xz2.b bVar) {
            bVar.getClass();
            return bVar.i(this.f46101a) || bVar.h(this.f46102b);
        }

        @Override // xz2.j
        public final void b(xz2.k kVar) {
            kVar.a();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/j$c;", "Lxz2/j;", "<init>", "(Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/j;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c implements xz2.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable f46103a;

        public c() {
            Context context = j.this.getContext();
            if (context != null) {
                this.f46103a = a7.b.getDrawable(context, R.drawable.gcm4_calendar_selected_day_bck);
            }
        }

        @Override // xz2.j
        public final boolean a(xz2.b bVar) {
            bVar.getClass();
            MaterialCalendarView materialCalendarView = j.this.f46099f;
            if (materialCalendarView != null) {
                return p005kotlin.jvm.internal.s.g(materialCalendarView.getSelectedDate(), bVar);
            }
            p005kotlin.jvm.internal.s.m("calendar");
            throw null;
        }

        @Override // xz2.j
        public final void b(xz2.k kVar) {
            Drawable drawable = this.f46103a;
            if (drawable != null) {
                kVar.b(drawable);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/traininginitiative/ui/j$d", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends b.s {
        public d() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            j jVar = j.this;
            jVar.C6();
            jVar.f46098e.f(false);
            jVar.requireActivity().onBackPressed();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46106a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f46106a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f46106a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f46107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f46108b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f46107a = aVar;
            this.f46108b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f46107a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f46108b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46109a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f46109a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f46109a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public j() {
        super(R.layout.ti_add_event_date_fragment);
        this.f46096c = new w1(s0.f105811a.b(AddTIEventViewModel.class), new e(this), new g(this), new f(null, this));
        this.f46097d = o13.m.b(new w0(this, 27));
        this.f46098e = new d();
    }

    public final AddTIEventViewModel A6() {
        return (AddTIEventViewModel) this.f46096c.getValue();
    }

    public final void C6() {
        MaterialCalendarView materialCalendarView = this.f46099f;
        if (materialCalendarView == null) {
            p005kotlin.jvm.internal.s.m("calendar");
            throw null;
        }
        int i14 = materialCalendarView.getSelectedDate().f192861a;
        MaterialCalendarView materialCalendarView2 = this.f46099f;
        if (materialCalendarView2 == null) {
            p005kotlin.jvm.internal.s.m("calendar");
            throw null;
        }
        int i15 = materialCalendarView2.getSelectedDate().f192862b + 1;
        MaterialCalendarView materialCalendarView3 = this.f46099f;
        if (materialCalendarView3 == null) {
            p005kotlin.jvm.internal.s.m("calendar");
            throw null;
        }
        ((y0) A6().K0.getValue()).m(new LocalDate(i14, i15, materialCalendarView3.getSelectedDate().f192863c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f46095b = context instanceof ry1.a ? (ry1.a) context : null;
        } catch (ClassCastException unused) {
            a2 a2Var = a2.TRAINING_INITIATIVE;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "TIAddEventDateFragment", "Host activity must implement SetupFragmentListener.");
        }
    }

    @Override // ty1.h0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        DateTime dateTimeNow;
        DateTime dateTimePlusDays;
        DateTime dateTimeNow2;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ry1.a aVar = this.f46095b;
        if (aVar != null) {
            String string = getString(R.string.add_event);
            string.getClass();
            aVar.g(2, string);
        }
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f46098e, viewLifecycleOwner);
        View viewFindViewById = view2.findViewById(R.id.title_view);
        viewFindViewById.getClass();
        ((TextView) viewFindViewById).setText(getString(R.string.when_is_the_event, A6().x5().d()));
        View viewFindViewById2 = view2.findViewById(R.id.event_setup_date_calendar);
        viewFindViewById2.getClass();
        this.f46099f = (MaterialCalendarView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.fragment_next_button);
        viewFindViewById3.getClass();
        this.f46100g = (Button) viewFindViewById3;
        MaterialCalendarView materialCalendarView = this.f46099f;
        if (materialCalendarView == null) {
            p005kotlin.jvm.internal.s.m("calendar");
            throw null;
        }
        materialCalendarView.setOnDateChangedListener(new tr2.b(this, 9));
        Button button = this.f46100g;
        if (button == null) {
            p005kotlin.jvm.internal.s.m("nextButton");
            throw null;
        }
        button.setOnClickListener(new t61.m(this, 12));
        LocalDate localDateD = A6().u5().d();
        if (localDateD == null) {
            localDateD = new LocalDate();
        }
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        Calendar calendar3 = Calendar.getInstance();
        calendar.clear();
        calendar2.clear();
        calendar3.clear();
        Boolean bool = A6().f204393j;
        Boolean bool2 = Boolean.TRUE;
        if (p005kotlin.jvm.internal.s.g(bool, bool2) || A6().f204395l) {
            if (p005kotlin.jvm.internal.s.g(A6().f204393j, bool2)) {
                fg0.x xVar = A6().f204394k;
                if (xVar == null || (dateTimeNow = xVar.f71370f) == null) {
                    dateTimeNow = DateTime.now();
                    dateTimeNow.getClass();
                }
                fg0.x xVar2 = A6().f204394k;
                if (xVar2 == null || (dateTimePlusDays = xVar2.f71371g) == null) {
                    dateTimePlusDays = DateTime.now().plusDays(365);
                    dateTimePlusDays.getClass();
                }
            } else {
                fg0.u uVar = A6().f204397n;
                if (uVar == null || (dateTimeNow = uVar.f71352d) == null) {
                    dateTimeNow = DateTime.now();
                    dateTimeNow.getClass();
                }
                fg0.u uVar2 = A6().f204397n;
                if (uVar2 == null || (dateTimePlusDays = uVar2.f71353e) == null) {
                    dateTimePlusDays = DateTime.now().plusDays(365);
                    dateTimePlusDays.getClass();
                }
            }
            calendar.set(dateTimeNow.getYear(), dateTimeNow.getMonthOfYear(), dateTimeNow.getDayOfMonth());
            calendar.setTime(dateTimeNow.toDate());
            calendar2.set(dateTimePlusDays.getYear(), dateTimePlusDays.getMonthOfYear(), dateTimePlusDays.getDayOfMonth());
            calendar2.setTime(dateTimePlusDays.toDate());
            if (p005kotlin.jvm.internal.s.g(A6().f204393j, bool2)) {
                DateTime dateTimeWithDayOfWeek = dateTimeNow.withDayOfWeek(6);
                calendar3.set(dateTimeWithDayOfWeek.getYear(), dateTimeWithDayOfWeek.getMonthOfYear(), dateTimeWithDayOfWeek.getDayOfMonth());
                calendar3.setTime(dateTimeWithDayOfWeek.toDate());
            } else {
                fg0.u uVar3 = A6().f204397n;
                if (uVar3 == null || (dateTimeNow2 = uVar3.f71354f) == null) {
                    dateTimeNow2 = DateTime.now();
                }
                calendar3.set(dateTimeNow2.getYear(), dateTimeNow2.getMonthOfYear(), dateTimeNow2.getDayOfMonth());
                calendar3.setTime(dateTimeNow2.toDate());
            }
        } else {
            LocalDate localDate = new LocalDate();
            LocalDate localDatePlusDays = new LocalDate().plusDays(365);
            calendar.set(localDate.getYear(), localDate.getMonthOfYear(), localDate.getDayOfMonth());
            calendar.setTime(localDate.toDate());
            calendar2.set(localDatePlusDays.getYear(), localDatePlusDays.getMonthOfYear(), localDatePlusDays.getDayOfMonth());
            calendar2.setTime(localDatePlusDays.toDate());
            calendar3.set(localDateD.getYear(), localDateD.getMonthOfYear(), localDateD.getDayOfMonth());
            calendar3.setTime(localDateD.toDate());
        }
        MaterialCalendarView materialCalendarView2 = this.f46099f;
        if (materialCalendarView2 == null) {
            p005kotlin.jvm.internal.s.m("calendar");
            throw null;
        }
        materialCalendarView2.setSelectedDate(calendar3);
        MaterialCalendarView materialCalendarView3 = this.f46099f;
        if (materialCalendarView3 == null) {
            p005kotlin.jvm.internal.s.m("calendar");
            throw null;
        }
        xz2.b bVarB = xz2.b.b(calendar);
        bVarB.getClass();
        xz2.b bVarB2 = xz2.b.b(calendar2);
        bVarB2.getClass();
        materialCalendarView3.a(new b(bVarB, bVarB2), new c());
        calendar.set(5, calendar.getActualMinimum(5));
        MaterialCalendarView materialCalendarView4 = this.f46099f;
        if (materialCalendarView4 == null) {
            p005kotlin.jvm.internal.s.m("calendar");
            throw null;
        }
        MaterialCalendarView.h hVarA = materialCalendarView4.A.a();
        hVarA.f54798b = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).e1().a();
        hVarA.a();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/j$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
