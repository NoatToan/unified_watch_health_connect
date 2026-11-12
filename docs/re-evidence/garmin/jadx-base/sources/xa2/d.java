package xa2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import java.sql.Date;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import sa2.n;
import vg1.z0;
import vn2.t0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lxa2/d;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends Fragment {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f189842f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wa2.b f189843g = new wa2.b("ReportsEndDateSelectionFragment", null, 2, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f189844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MaterialCalendarView f189845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AppCompatButton f189846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ua2.a f189847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ta2.b f189848e;

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        a7.e eVarRequireActivity = requireActivity();
        eVarRequireActivity.getClass();
        this.f189847d = (ua2.a) eVarRequireActivity;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ua2.a aVar = this.f189847d;
        if (aVar == null) {
            s.m("reportsCoordinatorDelegate");
            throw null;
        }
        this.f189844a = new n(aVar.getF49845d());
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        this.f189848e = new ta2.b(contextRequireContext);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.er_end_date_selection, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        v supportFragmentManager;
        super.onResume();
        n nVar = this.f189844a;
        if (nVar == null) {
            s.m("reportsSelectedEndDatesPresenter");
            throw null;
        }
        Date date = nVar.f158383a.f143901a;
        if (date == null) {
            Toast.makeText(requireContext(), getString(R.string.dates_invalid), 0).show();
            m activity = getActivity();
            if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                return;
            }
            supportFragmentManager.Z();
            return;
        }
        MaterialCalendarView materialCalendarView = this.f189845b;
        if (materialCalendarView == null) {
            s.m("endDateCalendarView");
            throw null;
        }
        n.f158382b.getClass();
        ta2.a aVar = new ta2.a(date, new Date(System.currentTimeMillis()));
        ta2.b bVar = this.f189848e;
        if (bVar == null) {
            s.m("selectedDayDecorator");
            throw null;
        }
        materialCalendarView.a(aVar, bVar);
        MaterialCalendarView materialCalendarView2 = this.f189845b;
        if (materialCalendarView2 == null) {
            s.m("endDateCalendarView");
            throw null;
        }
        n nVar2 = this.f189844a;
        if (nVar2 == null) {
            s.m("reportsSelectedEndDatesPresenter");
            throw null;
        }
        materialCalendarView2.setSelectedDate(nVar2.a());
        MaterialCalendarView materialCalendarView3 = this.f189845b;
        if (materialCalendarView3 == null) {
            s.m("endDateCalendarView");
            throw null;
        }
        n nVar3 = this.f189844a;
        if (nVar3 == null) {
            s.m("reportsSelectedEndDatesPresenter");
            throw null;
        }
        materialCalendarView3.setCurrentDate(nVar3.a());
        ta2.b bVar2 = this.f189848e;
        if (bVar2 == null) {
            s.m("selectedDayDecorator");
            throw null;
        }
        n nVar4 = this.f189844a;
        if (nVar4 != null) {
            bVar2.f163508b = new xz2.b(nVar4.a());
        } else {
            s.m("reportsSelectedEndDatesPresenter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        f189843g.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.export_report);
        viewFindViewById.getClass();
        this.f189846c = (AppCompatButton) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.calendar_end_date);
        viewFindViewById2.getClass();
        this.f189845b = (MaterialCalendarView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.information_text);
        viewFindViewById3.getClass();
        pa2.b.f136781a.getClass();
        ((AppCompatTextView) viewFindViewById3).setText(getString(R.string.end_date_message, pa2.b.a.a().f136769a));
        MaterialCalendarView materialCalendarView = this.f189845b;
        if (materialCalendarView == null) {
            s.m("endDateCalendarView");
            throw null;
        }
        materialCalendarView.setOnDateChangedListener(new t0(this, 25));
        AppCompatButton appCompatButton = this.f189846c;
        if (appCompatButton != null) {
            appCompatButton.setOnClickListener(new z0(this, 16));
        } else {
            s.m("exportReport");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxa2/d$a;", "", "<init>", "()V", "Lwa2/b;", "logger", "Lwa2/b;", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
