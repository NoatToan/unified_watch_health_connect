package vt;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.annual_report.preprocess.AnnualReportPreProcessWorker;
import com.garmin.android.apps.connectmobile.i2;
import o53.f0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lvt/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f179992d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ut.b f179993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f179994b = "Player Test";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f179995c = "⏳ Loading...";

    static {
        new a(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Uri data;
        if (i14 != 1001 || i15 != -1 || intent == null || (data = intent.getData()) == null) {
            return;
        }
        String strJ = am.j.j(data, "SELECT_LOCAL_FILE, uri = ");
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "FirstFragment", strJ);
        ut.b bVar = this.f179993a;
        bVar.getClass();
        bVar.f172553c.setEnabled(false);
        ut.b bVar2 = this.f179993a;
        bVar2.getClass();
        bVar2.f172553c.setText(this.f179995c);
        i0 i0VarW = f0.w(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(i0VarW, x53.b.f189152a, null, new c(this, data, null), 2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ut.b bVarA = ut.b.a(layoutInflater, viewGroup);
        this.f179993a = bVarA;
        return bVarA.f172551a;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f179993a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ut.b bVar = this.f179993a;
        bVar.getClass();
        final int i14 = 0;
        bVar.f172554d.setOnClickListener(new View.OnClickListener(this) { // from class: vt.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f179991b;

            {
                this.f179991b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                b bVar2 = this.f179991b;
                switch (i15) {
                    case 0:
                        int i16 = b.f179992d;
                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                        intent.addCategory("android.intent.category.OPENABLE");
                        intent.setType("application/json");
                        bVar2.startActivityForResult(intent, 1001);
                        break;
                    case 1:
                        int i17 = b.f179992d;
                        mt.a aVar = (mt.a) KoinJavaComponent.get$default(mt.a.class, null, null, 6, null);
                        Context contextRequireContext = bVar2.requireContext();
                        contextRequireContext.getClass();
                        Intent intentE = aVar.e(contextRequireContext);
                        Context contextRequireContext2 = bVar2.requireContext();
                        contextRequireContext2.getClass();
                        aVar.b(contextRequireContext2, intentE);
                        break;
                    case 2:
                        int i18 = b.f179992d;
                        AnnualReportPreProcessWorker.a aVar2 = AnnualReportPreProcessWorker.f30176j;
                        Context contextRequireContext3 = bVar2.requireContext();
                        contextRequireContext3.getClass();
                        aVar2.getClass();
                        AnnualReportPreProcessWorker.a.a(contextRequireContext3, false);
                        break;
                    default:
                        int i19 = b.f179992d;
                        ((xt.a) KoinJavaComponent.get$default(xt.a.class, null, null, 6, null)).f192134c.i();
                        ((com.garmin.android.apps.connectmobile.annual_report.preprocess.a) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.annual_report.preprocess.a.class, null, null, 6, null)).getClass();
                        com.garmin.android.apps.connectmobile.annual_report.preprocess.a.d(tt.j.IDLE);
                        bu.f fVar = bu.f.f21180a;
                        Context contextRequireContext4 = bVar2.requireContext();
                        contextRequireContext4.getClass();
                        fVar.getClass();
                        bu.f.k(contextRequireContext4);
                        ((rt.a) KoinJavaComponent.get$default(rt.a.class, null, null, 6, null)).a(false);
                        break;
                }
            }
        });
        ut.b bVar2 = this.f179993a;
        bVar2.getClass();
        final int i15 = 1;
        bVar2.f172553c.setOnClickListener(new View.OnClickListener(this) { // from class: vt.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f179991b;

            {
                this.f179991b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i16 = i15;
                b bVar3 = this.f179991b;
                switch (i16) {
                    case 0:
                        int i17 = b.f179992d;
                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                        intent.addCategory("android.intent.category.OPENABLE");
                        intent.setType("application/json");
                        bVar3.startActivityForResult(intent, 1001);
                        break;
                    case 1:
                        int i18 = b.f179992d;
                        mt.a aVar = (mt.a) KoinJavaComponent.get$default(mt.a.class, null, null, 6, null);
                        Context contextRequireContext = bVar3.requireContext();
                        contextRequireContext.getClass();
                        Intent intentE = aVar.e(contextRequireContext);
                        Context contextRequireContext2 = bVar3.requireContext();
                        contextRequireContext2.getClass();
                        aVar.b(contextRequireContext2, intentE);
                        break;
                    case 2:
                        int i19 = b.f179992d;
                        AnnualReportPreProcessWorker.a aVar2 = AnnualReportPreProcessWorker.f30176j;
                        Context contextRequireContext3 = bVar3.requireContext();
                        contextRequireContext3.getClass();
                        aVar2.getClass();
                        AnnualReportPreProcessWorker.a.a(contextRequireContext3, false);
                        break;
                    default:
                        int i110 = b.f179992d;
                        ((xt.a) KoinJavaComponent.get$default(xt.a.class, null, null, 6, null)).f192134c.i();
                        ((com.garmin.android.apps.connectmobile.annual_report.preprocess.a) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.annual_report.preprocess.a.class, null, null, 6, null)).getClass();
                        com.garmin.android.apps.connectmobile.annual_report.preprocess.a.d(tt.j.IDLE);
                        bu.f fVar = bu.f.f21180a;
                        Context contextRequireContext4 = bVar3.requireContext();
                        contextRequireContext4.getClass();
                        fVar.getClass();
                        bu.f.k(contextRequireContext4);
                        ((rt.a) KoinJavaComponent.get$default(rt.a.class, null, null, 6, null)).a(false);
                        break;
                }
            }
        });
        ut.b bVar3 = this.f179993a;
        bVar3.getClass();
        final int i16 = 2;
        bVar3.f172552b.setOnClickListener(new View.OnClickListener(this) { // from class: vt.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f179991b;

            {
                this.f179991b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i17 = i16;
                b bVar4 = this.f179991b;
                switch (i17) {
                    case 0:
                        int i18 = b.f179992d;
                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                        intent.addCategory("android.intent.category.OPENABLE");
                        intent.setType("application/json");
                        bVar4.startActivityForResult(intent, 1001);
                        break;
                    case 1:
                        int i19 = b.f179992d;
                        mt.a aVar = (mt.a) KoinJavaComponent.get$default(mt.a.class, null, null, 6, null);
                        Context contextRequireContext = bVar4.requireContext();
                        contextRequireContext.getClass();
                        Intent intentE = aVar.e(contextRequireContext);
                        Context contextRequireContext2 = bVar4.requireContext();
                        contextRequireContext2.getClass();
                        aVar.b(contextRequireContext2, intentE);
                        break;
                    case 2:
                        int i110 = b.f179992d;
                        AnnualReportPreProcessWorker.a aVar2 = AnnualReportPreProcessWorker.f30176j;
                        Context contextRequireContext3 = bVar4.requireContext();
                        contextRequireContext3.getClass();
                        aVar2.getClass();
                        AnnualReportPreProcessWorker.a.a(contextRequireContext3, false);
                        break;
                    default:
                        int i111 = b.f179992d;
                        ((xt.a) KoinJavaComponent.get$default(xt.a.class, null, null, 6, null)).f192134c.i();
                        ((com.garmin.android.apps.connectmobile.annual_report.preprocess.a) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.annual_report.preprocess.a.class, null, null, 6, null)).getClass();
                        com.garmin.android.apps.connectmobile.annual_report.preprocess.a.d(tt.j.IDLE);
                        bu.f fVar = bu.f.f21180a;
                        Context contextRequireContext4 = bVar4.requireContext();
                        contextRequireContext4.getClass();
                        fVar.getClass();
                        bu.f.k(contextRequireContext4);
                        ((rt.a) KoinJavaComponent.get$default(rt.a.class, null, null, 6, null)).a(false);
                        break;
                }
            }
        });
        ut.b bVar4 = this.f179993a;
        bVar4.getClass();
        final int i17 = 3;
        bVar4.f172555e.setOnClickListener(new View.OnClickListener(this) { // from class: vt.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f179991b;

            {
                this.f179991b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i18 = i17;
                b bVar5 = this.f179991b;
                switch (i18) {
                    case 0:
                        int i19 = b.f179992d;
                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                        intent.addCategory("android.intent.category.OPENABLE");
                        intent.setType("application/json");
                        bVar5.startActivityForResult(intent, 1001);
                        break;
                    case 1:
                        int i110 = b.f179992d;
                        mt.a aVar = (mt.a) KoinJavaComponent.get$default(mt.a.class, null, null, 6, null);
                        Context contextRequireContext = bVar5.requireContext();
                        contextRequireContext.getClass();
                        Intent intentE = aVar.e(contextRequireContext);
                        Context contextRequireContext2 = bVar5.requireContext();
                        contextRequireContext2.getClass();
                        aVar.b(contextRequireContext2, intentE);
                        break;
                    case 2:
                        int i111 = b.f179992d;
                        AnnualReportPreProcessWorker.a aVar2 = AnnualReportPreProcessWorker.f30176j;
                        Context contextRequireContext3 = bVar5.requireContext();
                        contextRequireContext3.getClass();
                        aVar2.getClass();
                        AnnualReportPreProcessWorker.a.a(contextRequireContext3, false);
                        break;
                    default:
                        int i112 = b.f179992d;
                        ((xt.a) KoinJavaComponent.get$default(xt.a.class, null, null, 6, null)).f192134c.i();
                        ((com.garmin.android.apps.connectmobile.annual_report.preprocess.a) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.annual_report.preprocess.a.class, null, null, 6, null)).getClass();
                        com.garmin.android.apps.connectmobile.annual_report.preprocess.a.d(tt.j.IDLE);
                        bu.f fVar = bu.f.f21180a;
                        Context contextRequireContext4 = bVar5.requireContext();
                        contextRequireContext4.getClass();
                        fVar.getClass();
                        bu.f.k(contextRequireContext4);
                        ((rt.a) KoinJavaComponent.get$default(rt.a.class, null, null, 6, null)).a(false);
                        break;
                }
            }
        });
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lvt/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "SELECT_LOCAL_FILE", "I", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
