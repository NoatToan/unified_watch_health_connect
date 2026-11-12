package xa2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.exportablereports.views.ReportsFetchActivity;
import java.sql.Date;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import sa2.h;
import sa2.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lxa2/a;", "Landroidx/fragment/app/Fragment;", "Lua2/b;", "<init>", "()V", "a", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment implements ua2.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C3531a f189829h = new C3531a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final wa2.b f189830i = new wa2.b("ConsultReportActivity", null, 2, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f189831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ProgressBar f189832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ua2.a f189833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f189834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f189835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f189836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f189837g;

    @Override // ua2.b
    public final void C4(androidx.appcompat.app.e eVar) {
        f189830i.getClass();
        ge1.b.T(f0.w(this), null, null, new b(this, eVar, null), 3);
    }

    @Override // ua2.b
    public final void E1() {
        f189830i.getClass();
        requireActivity().finish();
    }

    @Override // ua2.b
    public final void T1(androidx.appcompat.app.e eVar) {
        f189830i.getClass();
        ge1.b.T(f0.w(this), null, null, new c(this, eVar, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        f189830i.getClass();
        super.onAttach(context);
        pa2.b.f136781a.getClass();
        String string = pa2.b.a.a().f136780l;
        if (string == null) {
            string = getString(R.string.exporting_report);
            string.getClass();
        }
        a7.e eVarRequireActivity = requireActivity();
        eVarRequireActivity.getClass();
        this.f189833c = (ua2.a) eVarRequireActivity;
        m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        ((ReportsFetchActivity) mVarRequireActivity).P9(Integer.valueOf(android.R.drawable.ic_menu_close_clear_cancel), string);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        f189830i.getClass();
        super.onCreate(bundle);
        ua2.a aVar = this.f189833c;
        if (aVar == null) {
            s.m("reportsCoordinatorDelegate");
            throw null;
        }
        qa2.e eVarN0 = aVar.getF49845d();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        this.f189831a = new h(contextRequireContext, this, eVarN0);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.er_download_report, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        f189830i.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.report_download_status_indicator);
        viewFindViewById.getClass();
        this.f189832b = (ProgressBar) viewFindViewById;
        h hVar = this.f189831a;
        if (hVar == null) {
            s.m("reportsDownloadPresenter");
            throw null;
        }
        h.f158334i.getClass();
        hVar.f158338d = true;
        sa2.f fVar = new sa2.f(hVar, 0);
        h.h(hVar, 0, 25);
        qa2.e eVar = hVar.f158337c;
        Date date = eVar.f143901a;
        Date date2 = eVar.f143902b;
        if (date != null && date2 != null) {
            ge1.b.T(hVar.f158340f, null, null, new k(hVar, fVar, null), 3);
        } else {
            hVar.c();
            fVar.invoke(null);
        }
    }

    @Override // ua2.b
    public final void p3(int i14) {
        f189830i.getClass();
        ProgressBar progressBar = this.f189832b;
        if (progressBar != null) {
            progressBar.setProgress(i14);
        } else {
            s.m("progressBar");
            throw null;
        }
    }

    @Override // ua2.b
    public final void q2() {
        f189830i.getClass();
        this.f189834d = false;
    }

    @Override // ua2.b
    public final void v5(String str, String str2, String str3) {
        str3.getClass();
        f189830i.getClass();
        if (this.f189834d) {
            this.f189835e = str3;
            this.f189836f = str;
            this.f189837g = str2;
        } else {
            ua2.a aVar = this.f189833c;
            if (aVar != null) {
                aVar.I3(str, str2, str3);
            } else {
                s.m("reportsCoordinatorDelegate");
                throw null;
            }
        }
    }

    @Override // ua2.b
    public final void w0() {
        f189830i.getClass();
        this.f189834d = false;
        String str = this.f189835e;
        if (str != null) {
            ua2.a aVar = this.f189833c;
            if (aVar == null) {
                s.m("reportsCoordinatorDelegate");
                throw null;
            }
            String str2 = this.f189836f;
            if (str2 == null) {
                s.m("reportStartDate");
                throw null;
            }
            String str3 = this.f189837g;
            if (str3 != null) {
                aVar.I3(str2, str3, str);
            } else {
                s.m("reportEndDate");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: xa2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxa2/a$a;", "", "<init>", "()V", "Lwa2/b;", "logger", "Lwa2/b;", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3531a {
        public /* synthetic */ C3531a(j jVar) {
            this();
        }

        private C3531a() {
        }
    }
}
