package rk0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.social.share.ShareImageActivity;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153231a;

    public /* synthetic */ n(int i14) {
        this.f153231a = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        String str;
        Object uVar = null;
        switch (this.f153231a) {
            case 0:
                o oVar = o.f153236a;
                ((f0) obj).getClass();
                return Unit.INSTANCE;
            case 1:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 2:
                wo0.a aVar = (wo0.a) obj;
                aVar.getClass();
                return Long.valueOf(aVar.f186415a);
            case 3:
                am.x0 x0Var = (am.x0) obj;
                return (x0Var == null || (str = x0Var.f4358a) == null) ? "all-parent-key" : str;
            case 4:
                Context context = (Context) obj;
                context.getClass();
                return LayoutInflater.from(context).inflate(R.layout.gcm_sleep_consistency_chart, (ViewGroup) null);
            case 5:
                Context context2 = (Context) obj;
                context2.getClass();
                return LayoutInflater.from(context2).inflate(R.layout.gcm_sleep_consistency_chart, (ViewGroup) null);
            case 6:
                Context context3 = (Context) obj;
                context3.getClass();
                return LayoutInflater.from(context3).inflate(R.layout.sleep_custom_bar_chart, (ViewGroup) null);
            case 7:
                Context context4 = (Context) obj;
                context4.getClass();
                return LayoutInflater.from(context4).inflate(R.layout.sleep_custom_bar_chart, (ViewGroup) null);
            case 8:
                Context context5 = (Context) obj;
                context5.getClass();
                return LayoutInflater.from(context5).inflate(R.layout.gcm_sleep_score_chart, (ViewGroup) null);
            case 9:
                Context context6 = (Context) obj;
                context6.getClass();
                return LayoutInflater.from(context6).inflate(R.layout.gcm_sleep_score_chart, (ViewGroup) null);
            case 10:
                ShareImageActivity.a aVar2 = ShareImageActivity.f44607f;
                if (((v2) obj) instanceof v2.b) {
                    f12.l.f68084a.getClass();
                    f12.l.a.a().Y2();
                }
                return Unit.INSTANCE;
            case 11:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 12:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 13:
                oi0.b bVar = (oi0.b) obj;
                bVar.getClass();
                bVar.a();
                bVar.J();
                return Unit.INSTANCE;
            case 14:
                oi0.b bVar2 = (oi0.b) obj;
                bVar2.getClass();
                bVar2.a();
                bVar2.J();
                return Unit.INSTANCE;
            case 15:
                oi0.b bVar3 = (oi0.b) obj;
                bVar3.getClass();
                bVar3.a();
                bVar3.J();
                return Unit.INSTANCE;
            case 16:
                oi0.b bVar4 = (oi0.b) obj;
                bVar4.getClass();
                bVar4.a();
                bVar4.J();
                return Unit.INSTANCE;
            case 17:
                oi0.b bVar5 = (oi0.b) obj;
                bVar5.getClass();
                bVar5.a();
                bVar5.J();
                return Unit.INSTANCE;
            case 18:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 19:
                oi0.b bVar6 = (oi0.b) obj;
                bVar6.getClass();
                bVar6.b();
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj).intValue();
                return Unit.INSTANCE;
            case 21:
                String str2 = (String) obj;
                int i14 = rt.b.f154490d;
                str2.getClass();
                tt.j.f166303a.getClass();
                return tt.j.a.a(str2);
            case 22:
                ud.a aVar3 = (ud.a) obj;
                ru.c.d dVar = ru.c.f154570e;
                aVar3.getClass();
                ud.c cVarM0 = aVar3.M0("DELETE FROM badges_unredeemed_rewards_table");
                try {
                    cVarM0.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM0.close();
                }
            case 23:
                ud.a aVar4 = (ud.a) obj;
                ru.c.d dVar2 = ru.c.f154570e;
                aVar4.getClass();
                ud.c cVarM1 = aVar4.M0("SELECT * FROM badges_unredeemed_rewards_table WHERE popupShown = 0 LIMIT 1");
                try {
                    int iB = ge1.b.B(cVarM1, "badgeChallengeUUID");
                    int iB2 = ge1.b.B(cVarM1, "badgeId");
                    int iB3 = ge1.b.B(cVarM1, "badgeKey");
                    int iB4 = ge1.b.B(cVarM1, "createdDate");
                    int iB5 = ge1.b.B(cVarM1, "badgeChallengeName");
                    int iB6 = ge1.b.B(cVarM1, "popupShown");
                    if (cVarM1.J0()) {
                        uVar = new com.garmin.android.apps.connectmobile.badges.service.model.u(cVarM1.M1(iB), cVarM1.getLong(iB2), cVarM1.M1(iB3), cVarM1.isNull(iB4) ? null : cVarM1.M1(iB4), cVarM1.isNull(iB5) ? null : cVarM1.M1(iB5), ((int) cVarM1.getLong(iB6)) != 0);
                    }
                    return uVar;
                } finally {
                    cVarM1.close();
                }
            case 24:
                ud.a aVar5 = (ud.a) obj;
                ru.c.d dVar3 = ru.c.f154570e;
                aVar5.getClass();
                ud.c cVarM2 = aVar5.M0("SELECT * FROM badges_unredeemed_rewards_table");
                try {
                    int iB7 = ge1.b.B(cVarM2, "badgeChallengeUUID");
                    int iB8 = ge1.b.B(cVarM2, "badgeId");
                    int iB9 = ge1.b.B(cVarM2, "badgeKey");
                    int iB10 = ge1.b.B(cVarM2, "createdDate");
                    int iB11 = ge1.b.B(cVarM2, "badgeChallengeName");
                    int iB12 = ge1.b.B(cVarM2, "popupShown");
                    ArrayList arrayList = new ArrayList();
                    while (cVarM2.J0()) {
                        arrayList.add(new com.garmin.android.apps.connectmobile.badges.service.model.u(cVarM2.M1(iB7), cVarM2.getLong(iB8), cVarM2.M1(iB9), cVarM2.isNull(iB10) ? null : cVarM2.M1(iB10), cVarM2.isNull(iB11) ? null : cVarM2.M1(iB11), ((int) cVarM2.getLong(iB12)) != 0));
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarM2.close();
                }
            case 25:
                oi0.b bVar7 = (oi0.b) obj;
                bVar7.getClass();
                bVar7.n();
                bVar7.J();
                return Unit.INSTANCE;
            case 26:
                oi0.b bVar8 = (oi0.b) obj;
                bVar8.getClass();
                bVar8.n();
                bVar8.J();
                return Unit.INSTANCE;
            case 27:
                ((View) obj).getClass();
                return Unit.INSTANCE;
            case 28:
                Context context7 = (Context) obj;
                context7.getClass();
                return LayoutInflater.from(context7).inflate(R.layout.gcm_training_acute_load_graph, (ViewGroup) null);
            default:
                ((Boolean) obj).booleanValue();
                rw0.a aVar6 = rw0.a.f154819a;
                return Unit.INSTANCE;
        }
    }
}
