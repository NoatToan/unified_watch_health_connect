package xa2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import java.sql.Date;
import java.util.Calendar;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import sa2.o;
import vg1.z0;
import vn2.t0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lxa2/e;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends Fragment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f189849g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final wa2.b f189850h = new wa2.b("ReportsStartDateSelectionFragment", null, 2, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f189851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MaterialCalendarView f189852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AppCompatButton f189853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AppCompatTextView f189854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ua2.a f189855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ta2.b f189856f;

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        a7.e eVarRequireActivity = requireActivity();
        eVarRequireActivity.getClass();
        this.f189855e = (ua2.a) eVarRequireActivity;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ua2.a aVar = this.f189855e;
        if (aVar == null) {
            s.m("reportsCoordinatorDelegate");
            throw null;
        }
        this.f189851a = new o(aVar.getF49845d());
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        this.f189856f = new ta2.b(contextRequireContext);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.er_start_date_selection, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        MaterialCalendarView materialCalendarView = this.f189852b;
        if (materialCalendarView == null) {
            s.m("startDateCalendarView");
            throw null;
        }
        if (this.f189851a == null) {
            s.m("reportsSelectedStartDatesPresenter");
            throw null;
        }
        o.f158384b.getClass();
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, -28);
        wa2.a.f183799a.getClass();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Date date = new Date(calendar.getTimeInMillis());
        if (this.f189851a == null) {
            s.m("reportsSelectedStartDatesPresenter");
            throw null;
        }
        ta2.a aVar = new ta2.a(date, new Date(System.currentTimeMillis()));
        ta2.b bVar = this.f189856f;
        if (bVar == null) {
            s.m("selectedDayDecorator");
            throw null;
        }
        materialCalendarView.a(aVar, bVar);
        MaterialCalendarView materialCalendarView2 = this.f189852b;
        if (materialCalendarView2 == null) {
            s.m("startDateCalendarView");
            throw null;
        }
        o oVar = this.f189851a;
        if (oVar == null) {
            s.m("reportsSelectedStartDatesPresenter");
            throw null;
        }
        materialCalendarView2.setSelectedDate(oVar.a());
        MaterialCalendarView materialCalendarView3 = this.f189852b;
        if (materialCalendarView3 == null) {
            s.m("startDateCalendarView");
            throw null;
        }
        o oVar2 = this.f189851a;
        if (oVar2 == null) {
            s.m("reportsSelectedStartDatesPresenter");
            throw null;
        }
        materialCalendarView3.setCurrentDate(oVar2.a());
        ta2.b bVar2 = this.f189856f;
        if (bVar2 == null) {
            s.m("selectedDayDecorator");
            throw null;
        }
        o oVar3 = this.f189851a;
        if (oVar3 != null) {
            bVar2.f163508b = new xz2.b(oVar3.a());
        } else {
            s.m("reportsSelectedStartDatesPresenter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        f189850h.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.next);
        viewFindViewById.getClass();
        this.f189853c = (AppCompatButton) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.information_text);
        viewFindViewById2.getClass();
        this.f189854d = (AppCompatTextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.calendar_start_date);
        viewFindViewById3.getClass();
        this.f189852b = (MaterialCalendarView) viewFindViewById3;
        AppCompatTextView appCompatTextView = this.f189854d;
        if (appCompatTextView == null) {
            s.m("informationText");
            throw null;
        }
        pa2.b.f136781a.getClass();
        appCompatTextView.setText(getString(R.string.start_date_message, pa2.b.a.a().f136769a));
        MaterialCalendarView materialCalendarView = this.f189852b;
        if (materialCalendarView == null) {
            s.m("startDateCalendarView");
            throw null;
        }
        materialCalendarView.setOnDateChangedListener(new t0(this, 26));
        AppCompatButton appCompatButton = this.f189853c;
        if (appCompatButton != null) {
            appCompatButton.setOnClickListener(new z0(this, 17));
        } else {
            s.m("nextButton");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxa2/e$a;", "", "<init>", "()V", "Lwa2/b;", "logger", "Lwa2/b;", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
