package ub0;

import android.content.Intent;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f169729b;

    public /* synthetic */ h(e23.l lVar, int i14) {
        this.f169728a = i14;
        this.f169729b = lVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f169728a) {
            case 0:
                this.f169729b.invoke(a.PREVIOUS_STEP);
                break;
            case 1:
                this.f169729b.invoke(a.PREVIOUS_STEP);
                break;
            case 2:
                this.f169729b.invoke(Boolean.FALSE);
                break;
            case 3:
                this.f169729b.invoke(new Intent("android.intent.action.VIEW", Uri.parse("https://support.garmin.com/sas/gcapp/?productId=125677&contentId=1aLq0PzSib0C2TR9YAlLF9")));
                break;
            case 4:
                this.f169729b.invoke(Boolean.TRUE);
                break;
            case 5:
                this.f169729b.invoke(Boolean.FALSE);
                break;
            case 6:
                this.f169729b.invoke(Boolean.FALSE);
                break;
            case 7:
                this.f169729b.invoke("");
                break;
            case 8:
                this.f169729b.invoke(Boolean.TRUE);
                break;
            case 9:
                this.f169729b.invoke(Boolean.FALSE);
                break;
            case 10:
                this.f169729b.invoke(x50.b.g.f188981a);
                break;
            case 11:
                this.f169729b.invoke(x50.b.h.f188982a);
                break;
            case 12:
                this.f169729b.invoke(Boolean.FALSE);
                break;
            case 13:
                this.f169729b.invoke(DashboardRoute.EditEssentials.INSTANCE);
                break;
            case 14:
                this.f169729b.invoke(DashboardRoute.EditInFocus.INSTANCE);
                break;
            case 15:
                this.f169729b.invoke(DashboardRoute.EditSecondaryStats.INSTANCE);
                break;
            case 16:
                this.f169729b.invoke(new DashboardRoute.SelectHomeLayout("INTERACTIVE_DUAL"));
                break;
            case 17:
                this.f169729b.invoke(Boolean.FALSE);
                break;
            case 18:
                this.f169729b.invoke(Boolean.FALSE);
                break;
            case 19:
                this.f169729b.invoke("");
                break;
            case 20:
                this.f169729b.invoke(a50.c.a0.f1252a);
                break;
            case 21:
                this.f169729b.invoke(a50.c.o.f1294a);
                break;
            case 22:
                this.f169729b.invoke(a50.c.q.f1298a);
                break;
            case 23:
                this.f169729b.invoke(a50.c.n.f1292a);
                break;
            case 24:
                this.f169729b.invoke(a50.c.k.f1284a);
                break;
            case 25:
                this.f169729b.invoke(a50.c.s.f1302a);
                break;
            case 26:
                this.f169729b.invoke(null);
                break;
            case 27:
                this.f169729b.invoke(Boolean.TRUE);
                break;
            case 28:
                this.f169729b.invoke(Boolean.FALSE);
                break;
            default:
                this.f169729b.invoke(Boolean.TRUE);
                break;
        }
        return Unit.INSTANCE;
    }
}
