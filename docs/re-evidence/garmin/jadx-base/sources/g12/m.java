package g12;

import android.os.Bundle;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.follow.domain.OthersFriendListActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyDetailsActivity;
import com.garmin.android.apps.connectmobile.settings.thirdparty.google.GoogleHealthConnectActivity;
import com.garmin.proto.generated.WifiSetup;
import g2.v;
import gl1.t;
import java.lang.annotation.Annotation;
import java.util.List;
import m63.f1;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p3.y3;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74901a;

    public /* synthetic */ m(int i14) {
        this.f74901a = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f74901a) {
            case 0:
                int i14 = com.garmin.android.apps.connectmobile.userprofile.i.I;
                return (m12.e) KoinJavaComponent.get$default(m12.e.class, null, null, 6, null);
            case 1:
                v.a aVar = v.f75250s;
                return Unit.INSTANCE;
            case 2:
                return Unit.INSTANCE;
            case 3:
                g31.c.b bVar = g31.c.Companion;
                return new m63.e(g31.b.a.f75690a);
            case 4:
                y3 y3Var = g4.j.f75742a;
                return null;
            case 5:
                y3 y3Var2 = g4.l.f75743a;
                return null;
            case 6:
                com.garmin.android.apps.connectmobile.weather.defaultlocation.c.a aVar2 = com.garmin.android.apps.connectmobile.weather.defaultlocation.c.f47939y;
                int i15 = gt2.c.f79010a;
                return gt2.b.f79005a.h("WeatherLocationSelectionFragment");
            case 7:
                g50.a aVar3 = g50.a.f75882a;
                return Unit.INSTANCE;
            case 8:
                Bundle bundleD = tn.k.d("Screen", "PUSHES_REPORTS", "Action", "PUSHES_REPORTS_MONTHLY_LIST_ITEM_CLICKED");
                ht.a.f85464a.getClass();
                ht.a.a(bundleD, "UserAction");
                return Unit.INSTANCE;
            case 9:
                g63.v.a aVar4 = g63.v.f76173b;
                return "Invalid timezone format";
            case 10:
                g90.a.b bVar2 = g90.a.Companion;
                return new m63.e(g90.b.a.f76467a);
            case 11:
                g90.a.b bVar3 = g90.a.Companion;
                return new m63.e(g90.c.a.f76470a);
            case 12:
                gb0.a.C1541a c1541a = gb0.a.Companion;
                t0 t0Var = s0.f105811a;
                return new i63.g("com.garmin.android.apps.connectmobile.device.setup.presentation.profile.height.model.HeightData", t0Var.b(gb0.a.class), new k23.d[]{t0Var.b(gb0.a.b.class), t0Var.b(gb0.a.c.class)}, new i63.c[]{gb0.a.b.C1542a.f76638a, gb0.a.c.C1544a.f76641a}, new Annotation[0]);
            case 13:
                PregnancyDetailsActivity.a aVar5 = PregnancyDetailsActivity.f40489x;
                int i16 = gt2.c.f79010a;
                return gt2.b.f79005a.h("PregnancyDetailsActivity");
            case 14:
                PregnancyDetailsActivity.a aVar6 = PregnancyDetailsActivity.f40489x;
                i52.a.f91796a.getClass();
                i52.a.f91797b.edit().putBoolean(i52.a.c(R.string.key_has_user_seen_what_to_expect_banner), true).apply();
                return Unit.INSTANCE;
            case 15:
                PregnancyDetailsActivity.a aVar7 = PregnancyDetailsActivity.f40489x;
                bv.b.f21239a.getClass();
                ((kd0.m) bv.b.a()).o("PREGNANCY");
                return Unit.INSTANCE;
            case 16:
                return new y0();
            case 17:
                return new y0();
            case 18:
                return new y0();
            case 19:
                return new y0();
            case 20:
                return new y0();
            case 21:
                int i17 = gh2.c.f77429k;
                Logger loggerA = gh2.m.a("GCRemoteConfiguration");
                loggerA.getClass();
                return loggerA;
            case 22:
                OthersFriendListActivity.a aVar8 = OthersFriendListActivity.f35271a;
                mi0.j.f118892t.getClass();
                return mi0.j.f118896y;
            case 23:
                GoogleHealthConnectActivity.a aVar9 = GoogleHealthConnectActivity.f43979c;
                return (com.garmin.android.apps.connectmobile.googlehealthconnect.a) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.googlehealthconnect.a.class, null, null, 6, null);
            case 24:
                return gl.d.a();
            case 25:
                return new f1("com.garmin.android.apps.connectmobile.setup.presentation.RecordActivityNavigation.InitialStateCheck", gl1.h.INSTANCE, new Annotation[0]);
            case 26:
                return new f1("com.garmin.android.apps.connectmobile.setup.presentation.RecordActivityNavigation.SelectDevice", gl1.j.INSTANCE, new Annotation[0]);
            case 27:
                return new f1("com.garmin.android.apps.connectmobile.setup.presentation.RecordActivityOnboardingNavigation.Genesis", gl1.r.INSTANCE, new Annotation[0]);
            case 28:
                return new f1("com.garmin.android.apps.connectmobile.setup.presentation.RecordActivityOnboardingNavigation.SelectFavoriteActivities", t.INSTANCE, new Annotation[0]);
            default:
                List<WifiSetup.ServerCredentialType> list = gn2.c.f78093q;
                return zy2.c.f207527a.a("WifiDataHandler");
        }
    }
}
