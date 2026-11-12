package mh1;

import am.x0;
import am.z0;
import androidx.lifecycle.y0;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.settings.devices.index.InviteByEmailActivity;
import com.garmin.android.apps.connectmobile.settings.devices.index.ManagePeopleActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import java.util.ArrayList;
import java.util.Set;
import mm0.z;
import org.koin.java.KoinJavaComponent;
import org.slf4j.LoggerFactory;
import p005kotlin.Unit;
import p13.h0;
import p3.p0;
import z10.h2;
import z10.m3;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118496a;

    public /* synthetic */ q(int i14) {
        this.f118496a = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        Set set = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        switch (this.f118496a) {
            case 0:
                int i14 = r.f118497b;
                int i15 = gt2.c.f79010a;
                return gt2.b.f79005a.h("InviteStatusNotificationReceiver");
            case 1:
                InviteByEmailActivity.a aVar = InviteByEmailActivity.f43034c;
                int i16 = gt2.c.f79010a;
                return gt2.b.f79005a.h("InviteByEmailActivity");
            case 2:
                int i17 = gt2.c.f79010a;
                return gt2.b.f79005a.h("ConnectionsViewModel");
            case 3:
                ManagePeopleActivity.a aVar2 = ManagePeopleActivity.f43042n;
                int i18 = gt2.c.f79010a;
                return gt2.b.f79005a.h("ManagePeopleActivity");
            case 4:
                ml0.b bVar = ml0.b.f119197a;
                return Unit.INSTANCE;
            case 5:
                ml0.b bVar2 = ml0.b.f119197a;
                return Unit.INSTANCE;
            case 6:
                return p0.n(Boolean.FALSE);
            case 7:
                return p0.n(Boolean.FALSE);
            case 8:
                int i19 = z.f119597d;
                return new y0();
            case 9:
                return new mn2.a.c(SyslogConstants.LOG_LOCAL4, 100);
            case 10:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.b.a aVar3 = com.garmin.android.apps.connectmobile.leaderboard.challenges.b.f37321p;
                return (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
            case 11:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar4 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                return new m3();
            case 12:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.x xVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.x.f37955a;
                return Unit.INSTANCE;
            case 13:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.x xVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.x.f37955a;
                return Unit.INSTANCE;
            case 14:
                return ((bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null)).g();
            case 15:
                return p0.n(Boolean.FALSE);
            case 16:
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar5 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                return ht.a.f85464a;
            case 17:
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar6 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                return new h2(objArr2 == true ? 1 : 0, 1, objArr == true ? 1 : 0);
            case 18:
                return LoggerFactory.getLogger(mu2.a.C2294a.a(mu2.a.f121120a, "Helper"));
            case 19:
                com.garmin.android.apps.connectmobile.newsfeed.filter.a.b bVar3 = com.garmin.android.apps.connectmobile.newsfeed.filter.a.f39529d;
                ArrayList arrayListJ = z0.j();
                ArrayList arrayList = new ArrayList();
                for (Object obj : arrayListJ) {
                    if (((x0) obj) != x0.C) {
                        arrayList.add(obj);
                    }
                }
                return h0.N0(arrayList, new com.garmin.android.apps.connectmobile.newsfeed.filter.a.c());
            case 20:
                mz0.a aVar7 = mz0.a.f121640a;
                return new nz0.b(set, objArr4 == true ? 1 : 0, 3, objArr3 == true ? 1 : 0);
            case 21:
                String[] strArr = AddTIEventViewModel.V2;
                return new y0();
            case 22:
                String[] strArr2 = AddTIEventViewModel.V2;
                return new y0();
            case 23:
                String[] strArr3 = AddTIEventViewModel.V2;
                return new y0();
            case 24:
                String[] strArr4 = AddTIEventViewModel.V2;
                return new y0();
            case 25:
                String[] strArr5 = AddTIEventViewModel.V2;
                return new y0();
            case 26:
                String[] strArr6 = AddTIEventViewModel.V2;
                return new y0();
            case 27:
                String[] strArr7 = AddTIEventViewModel.V2;
                return new y0();
            case 28:
                String[] strArr8 = AddTIEventViewModel.V2;
                return new y0();
            default:
                String[] strArr9 = AddTIEventViewModel.V2;
                return new y0();
        }
    }
}
