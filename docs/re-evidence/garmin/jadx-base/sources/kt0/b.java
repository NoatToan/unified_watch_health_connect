package kt0;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.v1;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.leaderboard.LeaderboardActivity;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.h0;
import e23.l;
import hc0.f;
import jx0.e;
import lc.u0;
import mt0.a3;
import p005kotlin.Unit;
import p92.o;
import pt0.f0;
import q92.x;
import r22.q0;
import v92.e0;
import z10.d1;
import z10.i3;
import z10.l3;
import z10.m0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LeaderboardActivity f106435b;

    public /* synthetic */ b(LeaderboardActivity leaderboardActivity, int i14) {
        this.f106434a = i14;
        this.f106435b = leaderboardActivity;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, o13.l] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f106434a;
        LeaderboardActivity leaderboardActivity = this.f106435b;
        switch (i14) {
            case 0:
                final LeaderboardActivity leaderboardActivity2 = this.f106435b;
                ?? r14 = leaderboardActivity2.f37148g;
                m0 m0Var = (m0) obj;
                LeaderboardActivity.a aVar = LeaderboardActivity.f37145i;
                if (m0Var == null) {
                    return Unit.INSTANCE;
                }
                switch (LeaderboardActivity.b.f37150a[m0Var.ordinal()]) {
                    case 1:
                    case 2:
                        leaderboardActivity2.showProgressOverlay();
                        break;
                    case 3:
                        leaderboardActivity2.hideProgressOverlay();
                        i2.a aVar2 = i2.f36769a;
                        a2 a2Var = a2.CONSENT;
                        aVar2.getClass();
                        i2.a.b(a2Var, "UploadConsentEnforcementActivity", "showConsentFragment()");
                        leaderboardActivity2.setTitle(leaderboardActivity2.getString(R.string.golf_lbl_storage_processing_consent_title));
                        o oVar = o.f136619a;
                        b bVar = new b(leaderboardActivity2, 2);
                        i3 i3VarMa = leaderboardActivity2.ma();
                        i3VarMa.getClass();
                        f fVar = new f(6, leaderboardActivity2, i3VarMa);
                        i3 i3VarMa2 = leaderboardActivity2.ma();
                        i3VarMa2.getClass();
                        o.x(oVar, leaderboardActivity2, leaderboardActivity2, bVar, fVar, new f(5, leaderboardActivity2, i3VarMa2), x.DI_CONNECT_UPLOAD, null, null, e0.NO_ACTION, s3.b(), false, 2496);
                        break;
                    case 4:
                        leaderboardActivity2.hideProgressOverlay();
                        final int i15 = 0;
                        final int i16 = 1;
                        d1.q(leaderboardActivity2, new DialogInterface.OnClickListener() { // from class: kt0.c
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i17) {
                                int i18 = i15;
                                LeaderboardActivity leaderboardActivity3 = leaderboardActivity2;
                                switch (i18) {
                                    case 0:
                                        LeaderboardActivity.a aVar3 = LeaderboardActivity.f37145i;
                                        i3 i3VarMa3 = leaderboardActivity3.ma();
                                        i3VarMa3.getClass();
                                        ge1.b.T(v1.a(i3VarMa3), null, null, new l3(i3VarMa3, true, false, null), 3);
                                        break;
                                    default:
                                        LeaderboardActivity.a aVar4 = LeaderboardActivity.f37145i;
                                        dialogInterface.getClass();
                                        leaderboardActivity3.ma().y4(m0.DEVICE_UPLOAD_CONSENT_REVOKED);
                                        break;
                                }
                            }
                        }, new DialogInterface.OnClickListener() { // from class: kt0.c
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i17) {
                                int i18 = i16;
                                LeaderboardActivity leaderboardActivity3 = leaderboardActivity2;
                                switch (i18) {
                                    case 0:
                                        LeaderboardActivity.a aVar3 = LeaderboardActivity.f37145i;
                                        i3 i3VarMa3 = leaderboardActivity3.ma();
                                        i3VarMa3.getClass();
                                        ge1.b.T(v1.a(i3VarMa3), null, null, new l3(i3VarMa3, true, false, null), 3);
                                        break;
                                    default:
                                        LeaderboardActivity.a aVar4 = LeaderboardActivity.f37145i;
                                        dialogInterface.getClass();
                                        leaderboardActivity3.ma().y4(m0.DEVICE_UPLOAD_CONSENT_REVOKED);
                                        break;
                                }
                            }
                        });
                        break;
                    case 5:
                    case 6:
                    case 7:
                        leaderboardActivity2.hideProgressOverlay();
                        leaderboardActivity2.na();
                        a3 a3Var = ((f0) r14.getValue()).f140668i;
                        if (a3Var != null) {
                            a3Var.invoke();
                        }
                        ((f0) r14.getValue()).f140668i = null;
                        break;
                    case 8:
                        leaderboardActivity2.hideProgressOverlay();
                        leaderboardActivity2.na();
                        break;
                    case 9:
                        leaderboardActivity2.hideProgressOverlay();
                        leaderboardActivity2.displayFailedMessage();
                        break;
                    case 10:
                        leaderboardActivity2.hideProgressOverlay();
                        d1.s(leaderboardActivity2);
                        break;
                    case 11:
                    case 12:
                        leaderboardActivity2.hideProgressOverlay();
                        leaderboardActivity2.na();
                        break;
                    case 13:
                    case 14:
                        leaderboardActivity2.hideProgressOverlay();
                        leaderboardActivity2.displayFailedMessage();
                        break;
                    case 15:
                        leaderboardActivity2.hideProgressOverlay();
                        d1 d1Var = d1.f200951a;
                        e eVar = new e(leaderboardActivity2, 25);
                        d1Var.getClass();
                        d1.v(eVar, leaderboardActivity2);
                        break;
                    case 16:
                        leaderboardActivity2.hideProgressOverlay();
                        d1.m(d1.f200951a, leaderboardActivity2);
                        break;
                    case 17:
                        leaderboardActivity2.hideProgressOverlay();
                        q0.b bVar2 = q0.f149800b;
                        View viewFindViewById = leaderboardActivity2.findViewById(R.id.content_frame);
                        viewFindViewById.getClass();
                        String string = leaderboardActivity2.getString(R.string.msg_request_sent);
                        string.getClass();
                        q0.b.c(bVar2, viewFindViewById, string, null, 4).show();
                        break;
                    default:
                        u0.r();
                        return null;
                }
                return Unit.INSTANCE;
            case 1:
                String str = (String) obj;
                LeaderboardActivity.a aVar3 = LeaderboardActivity.f37145i;
                h0.a aVar4 = h0.f37562o;
                str.getClass();
                aVar4.getClass();
                h0 h0Var = new h0();
                Bundle bundle = new Bundle();
                bundle.putString("GCM_userDisplayName", str);
                h0Var.setArguments(bundle);
                leaderboardActivity.f37147f = h0Var;
                v supportFragmentManager = leaderboardActivity.getSupportFragmentManager();
                androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
                h0 h0Var2 = leaderboardActivity.f37147f;
                h0Var2.getClass();
                aVarB.l(R.id.content_view, h0Var2, null);
                aVarB.e();
                return Unit.INSTANCE;
            default:
                Fragment fragment = (Fragment) obj;
                LeaderboardActivity.a aVar5 = LeaderboardActivity.f37145i;
                fragment.getClass();
                v supportFragmentManager2 = leaderboardActivity.getSupportFragmentManager();
                supportFragmentManager2.getClass();
                androidx.fragment.app.a aVar6 = new androidx.fragment.app.a(supportFragmentManager2);
                aVar6.l(R.id.content_view, fragment, null);
                aVar6.d("CONSENT_FRAGMENT");
                aVar6.e();
                return Unit.INSTANCE;
        }
    }
}
