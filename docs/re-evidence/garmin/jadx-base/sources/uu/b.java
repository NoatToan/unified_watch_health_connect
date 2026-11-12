package uu;

import com.garmin.android.apps.connectmobile.badges.redesign.BadgeDetailsActivity;
import com.garmin.android.apps.connectmobile.g3;
import lc.u0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BadgeDetailsActivity f172654b;

    public /* synthetic */ b(BadgeDetailsActivity badgeDetailsActivity, int i14) {
        this.f172653a = i14;
        this.f172654b = badgeDetailsActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f172653a;
        BadgeDetailsActivity badgeDetailsActivity = this.f172654b;
        g3 g3Var = (g3) obj;
        switch (i14) {
            case 0:
                BadgeDetailsActivity.a aVar = BadgeDetailsActivity.f30322l;
                g3Var.getClass();
                fw.p pVar = g3Var.f35300a;
                com.garmin.android.apps.connectmobile.badges.service.model.m mVar = (com.garmin.android.apps.connectmobile.badges.service.model.m) g3Var.f35301b;
                int i15 = BadgeDetailsActivity.b.f30330a[pVar.ordinal()];
                if (i15 == 1) {
                    badgeDetailsActivity.f37120c.postDelayed(badgeDetailsActivity.f37118a, 100L);
                } else if (i15 == 2) {
                    badgeDetailsActivity.ca();
                    badgeDetailsActivity.f30325g = mVar;
                    com.garmin.android.apps.connectmobile.badges.redesign.b bVar = badgeDetailsActivity.f30326h;
                    if (bVar != null) {
                        if (mVar == null) {
                            return Unit.INSTANCE;
                        }
                        ge1.b.T(g22.f.b(bVar), null, null, new g(mVar, bVar, null), 3);
                    }
                } else {
                    if (i15 != 3) {
                        u0.r();
                        return null;
                    }
                    badgeDetailsActivity.ca();
                    badgeDetailsActivity.displayFailedMessage();
                }
                return Unit.INSTANCE;
            default:
                BadgeDetailsActivity.a aVar2 = BadgeDetailsActivity.f30322l;
                g3Var.getClass();
                int i16 = BadgeDetailsActivity.b.f30330a[g3Var.f35300a.ordinal()];
                if (i16 == 1) {
                    badgeDetailsActivity.f37120c.postDelayed(badgeDetailsActivity.f37118a, 100L);
                } else if (i16 == 2) {
                    badgeDetailsActivity.ca();
                    badgeDetailsActivity.f30327i = false;
                } else {
                    if (i16 != 3) {
                        u0.r();
                        return null;
                    }
                    badgeDetailsActivity.ca();
                    badgeDetailsActivity.displayFailedMessage();
                }
                return Unit.INSTANCE;
        }
    }
}
