package gb1;

import com.garmin.android.apps.connectmobile.g1;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyDetailsActivity;
import java.util.List;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76677a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PregnancyDetailsActivity f76678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f76679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0 f76680d;

    public /* synthetic */ j(PregnancyDetailsActivity pregnancyDetailsActivity, m0 m0Var, m0 m0Var2) {
        this.f76678b = pregnancyDetailsActivity;
        this.f76679c = m0Var;
        this.f76680d = m0Var2;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f76677a;
        m0 m0Var = this.f76680d;
        m0 m0Var2 = this.f76679c;
        switch (i14) {
            case 0:
                fw.m mVar = (fw.m) obj;
                PregnancyDetailsActivity.a aVar = PregnancyDetailsActivity.f40489x;
                int i15 = PregnancyDetailsActivity.b.f40502a[mVar.f73769b.ordinal()];
                PregnancyDetailsActivity pregnancyDetailsActivity = this.f76678b;
                if (i15 == 1) {
                    m0Var2.f105804a = true;
                    pregnancyDetailsActivity.showProgressOverlay();
                } else if (i15 == 2) {
                    if (!m0Var.f105804a) {
                        pregnancyDetailsActivity.hideProgressOverlay();
                    }
                    List list = (List) mVar.f73770c;
                    if (list != null && list.size() < 2) {
                        pregnancyDetailsActivity.f40500v = true;
                    }
                    m0Var2.f105804a = false;
                    if (pregnancyDetailsActivity.sa().f76683a != null && !p005kotlin.jvm.internal.s.g(pregnancyDetailsActivity.sa().f76683a, pregnancyDetailsActivity.ta()) && !((Boolean) pregnancyDetailsActivity.f40496p.getValue()).booleanValue()) {
                        PregnancyDetailsActivity.a aVar2 = PregnancyDetailsActivity.f40489x;
                        boolean zIsTopNavigation = pregnancyDetailsActivity.isTopNavigation();
                        DateTime dateTime = (DateTime) pregnancyDetailsActivity.f40495o.getValue();
                        db1.m mVar2 = pregnancyDetailsActivity.sa().f76683a;
                        aVar2.getClass();
                        pregnancyDetailsActivity.setIntent(PregnancyDetailsActivity.a.a(pregnancyDetailsActivity, false, zIsTopNavigation, dateTime, false, mVar2, false));
                        pregnancyDetailsActivity.showProgressOverlay();
                        pregnancyDetailsActivity.recreate();
                    }
                } else {
                    if (i15 != 3) {
                        u0.r();
                        return null;
                    }
                    if (!m0Var.f105804a) {
                        pregnancyDetailsActivity.hideProgressOverlay();
                    }
                    m0Var2.f105804a = false;
                    g22.a.a(pregnancyDetailsActivity, mVar.f73771d);
                }
                return Unit.INSTANCE;
            default:
                cx0.a aVar3 = (cx0.a) obj;
                PregnancyDetailsActivity.a aVar4 = PregnancyDetailsActivity.f40489x;
                PregnancyDetailsActivity pregnancyDetailsActivity2 = this.f76678b;
                if (aVar3 == null) {
                    pregnancyDetailsActivity2.showProgressOverlay();
                    m0Var2.f105804a = true;
                } else {
                    m0Var2.f105804a = false;
                    if (!m0Var.f105804a) {
                        pregnancyDetailsActivity2.hideProgressOverlay();
                    }
                    com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.a aVar5 = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.a) pregnancyDetailsActivity2.f40501w.getValue();
                    boolean zG = p005kotlin.jvm.internal.s.g(aVar3.f56599a, Boolean.TRUE);
                    if (aVar5.f40536l != zG) {
                        aVar5.f40536l = zG;
                        aVar5.notifyDataSetChanged();
                    }
                    if (!aVar3.f56602d) {
                        g1.b(pregnancyDetailsActivity2, cx0.b.a(aVar3.f56600b));
                        aVar3.f56602d = true;
                    }
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ j(m0 m0Var, PregnancyDetailsActivity pregnancyDetailsActivity, m0 m0Var2) {
        this.f76679c = m0Var;
        this.f76678b = pregnancyDetailsActivity;
        this.f76680d = m0Var2;
    }
}
