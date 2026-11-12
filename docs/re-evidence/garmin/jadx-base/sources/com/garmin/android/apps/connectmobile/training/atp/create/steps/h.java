package com.garmin.android.apps.connectmobile.training.atp.create.steps;

import am.a2;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.m;
import androidx.lifecycle.n0;
import b.u;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import java.util.ArrayList;
import java.util.Date;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import xw1.n;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/h;", "Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/b;", "<init>", "()V", "a", "b", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends com.garmin.android.apps.connectmobile.training.atp.create.steps.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f45276k = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MaterialCalendarView f45277h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LocalDate f45278i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f45279j = new c();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/h$b;", "Lxz2/j;", "<init>", "(Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/h;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b implements xz2.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable f45280a;

        public b() {
            Context context = h.this.getContext();
            if (context != null) {
                this.f45280a = a7.b.getDrawable(context, R.drawable.gcm4_calendar_selected_day_bck);
            }
        }

        @Override // xz2.j
        public final boolean a(xz2.b bVar) {
            bVar.getClass();
            MaterialCalendarView materialCalendarView = h.this.f45277h;
            if (materialCalendarView != null) {
                return s.g(materialCalendarView.getSelectedDate(), bVar);
            }
            s.m("calendarView");
            throw null;
        }

        @Override // xz2.j
        public final void b(xz2.k kVar) {
            Drawable drawable = this.f45280a;
            if (drawable != null) {
                kVar.b(drawable);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/create/steps/h$c", "Lb/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends b.s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            yt1.c cVar;
            h hVar = h.this;
            hVar.f45279j.f(false);
            LocalDate localDate = hVar.f45278i;
            if (localDate != null && (cVar = hVar.f45248a) != null) {
                cVar.e(localDate);
            }
            hVar.requireActivity().getOnBackPressedDispatcher().d();
        }
    }

    @Override // yt1.e
    public final int V5() {
        return R.string.set_schedule;
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.create.steps.b
    public final String b5() {
        return "RaceDateFragment";
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fbt_goal_date_selection_frag, viewGroup, false);
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.create.steps.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        Date date;
        Date date2;
        fg0.k kVar;
        LocalDate date3;
        u onBackPressedDispatcher;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        m activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            n0 viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            onBackPressedDispatcher.b(this.f45279j, viewLifecycleOwner);
        }
        View viewFindViewById = view2.findViewById(R.id.btn_next);
        viewFindViewById.getClass();
        viewFindViewById.setVisibility(8);
        a2 a2Var = a2.f3853a;
        Bundle arguments = getArguments();
        a2Var.getClass();
        DateTime dateTime = (DateTime) a2.e(arguments, "EXTRAS_RACE_START_DATE");
        DateTime dateTime2 = (DateTime) a2.e(getArguments(), "EXTRAS_RACE_END_DATE");
        if (dateTime == null || dateTime2 == null) {
            date = DateTime.now().toDate();
            date.getClass();
            date2 = DateTime.now().toDate();
            date2.getClass();
            i2.a aVar = i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var2, "CreateRaceFragment", "Wrong or no information about start or end date interval");
        } else {
            date = dateTime.toDate();
            date.getClass();
            date2 = dateTime2.toDate();
            date2.getClass();
        }
        View viewFindViewById2 = view2.findViewById(R.id.calendar_view);
        MaterialCalendarView materialCalendarView = (MaterialCalendarView) viewFindViewById2;
        materialCalendarView.setArrowColor(a7.b.getColor(requireContext(), R.color.default_text));
        materialCalendarView.setShowOtherDates(6);
        b bVar = new b();
        ArrayList<xz2.j> arrayList = materialCalendarView.f54756k;
        arrayList.add(bVar);
        xz2.e<?> eVar = materialCalendarView.f54751f;
        eVar.f192885o = arrayList;
        eVar.e();
        MaterialCalendarView.h hVarA = materialCalendarView.A.a();
        hVarA.f54800d = xz2.b.d(date);
        hVarA.f54801e = xz2.b.d(date2);
        hVarA.a();
        n tiEventDTO = w6().getTiEventDTO();
        if (tiEventDTO != null && (kVar = tiEventDTO.f192426b) != null && (date3 = kVar.getDate()) != null) {
            this.f45278i = date3;
            materialCalendarView.setSelectedDate(date3.toDate());
            materialCalendarView.setCurrentDate(date3.toDate());
        }
        materialCalendarView.setOnDateChangedListener(new a73.j(this, 24));
        viewFindViewById2.getClass();
        this.f45277h = (MaterialCalendarView) viewFindViewById2;
        TextView textView = (TextView) view2.findViewById(R.id.sub_header_view);
        Context context = view2.getContext();
        LocalDate localDateFromDateFields = LocalDate.fromDateFields(date);
        String string = localDateFromDateFields.toString(localDateFromDateFields.getYear() != LocalDate.now().getYear() ? "MMM d, yyyy" : "MMM d");
        string.getClass();
        LocalDate localDateFromDateFields2 = LocalDate.fromDateFields(date2);
        String string2 = localDateFromDateFields2.toString(localDateFromDateFields2.getYear() != LocalDate.now().getYear() ? "MMM d, yyyy" : "MMM d");
        textView.setText(context.getString(R.string.ideal_date_window_range, zl.a.c(string2, string, " - ", string2)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRAS_RACE_START_DATE", "EXTRAS_RACE_END_DATE", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
