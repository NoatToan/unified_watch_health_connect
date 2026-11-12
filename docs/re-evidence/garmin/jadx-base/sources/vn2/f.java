package vn2;

import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.felica.ui.FelicaAddCardActivity;
import com.garmin.feature.garminpay.providers.felica.ui.FelicaAddCardActivity.b;
import com.garmin.feature.garminpay.providers.felica.ui.FelicaAddCardActivity.c;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FelicaAddCardActivity f178874b;

    public /* synthetic */ f(FelicaAddCardActivity felicaAddCardActivity, int i14) {
        this.f178873a = i14;
        this.f178874b = felicaAddCardActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f178873a;
        FelicaAddCardActivity felicaAddCardActivity = this.f178874b;
        switch (i14) {
            case 0:
                FelicaAddCardActivity.a aVar = FelicaAddCardActivity.f50949l;
                androidx.fragment.app.v supportFragmentManager = felicaAddCardActivity.getSupportFragmentManager();
                androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
                br2.j.a aVar2 = br2.j.f19631f;
                wr2.v.a aVar3 = wr2.v.C0;
                pn2.a.f138690a.getClass();
                String strF = pn2.a.f();
                aVar3.getClass();
                wr2.w wVar = new wr2.w(strF, 30);
                wr2.x xVar = new wr2.x(R.string.wallet_suica_message_set_as_rapid_pass_card);
                wr2.x xVar2 = new wr2.x(R.string.wallet_can_change_setting_in_gp);
                FelicaAddCardActivity.d dVar = (FelicaAddCardActivity.d) felicaAddCardActivity.f50955k.getValue();
                aVar2.getClass();
                dVar.getClass();
                br2.j jVar = new br2.j(wVar, xVar, xVar2, dVar);
                jVar.f19637e = felicaAddCardActivity.new c();
                Unit unit = Unit.INSTANCE;
                aVarB.l(R.id.content_frame, jVar, "PAY#RapidPassSetupFrag");
                aVarB.s(true, true);
                break;
            case 1:
                FelicaAddCardActivity.a aVar4 = FelicaAddCardActivity.f50949l;
                androidx.fragment.app.v supportFragmentManager2 = felicaAddCardActivity.getSupportFragmentManager();
                androidx.fragment.app.a aVarB2 = androidx.core.view.j.b(supportFragmentManager2, supportFragmentManager2);
                xn2.l.f191717b.getClass();
                aVarB2.l(R.id.content_frame, new xn2.l(), "PAY#FN#GarminT&CFrag");
                aVarB2.e();
                break;
            case 2:
                FelicaAddCardActivity.a aVar5 = FelicaAddCardActivity.f50949l;
                androidx.fragment.app.v supportFragmentManager3 = felicaAddCardActivity.getSupportFragmentManager();
                androidx.fragment.app.a aVarB3 = androidx.core.view.j.b(supportFragmentManager3, supportFragmentManager3);
                xn2.n.f191720b.getClass();
                aVarB3.l(R.id.content_frame, new xn2.n(), "PAY#FN#JRT&CFrag");
                aVarB3.e();
                break;
            case 3:
                FelicaAddCardActivity.a aVar6 = FelicaAddCardActivity.f50949l;
                androidx.fragment.app.v supportFragmentManager4 = felicaAddCardActivity.getSupportFragmentManager();
                supportFragmentManager4.getClass();
                androidx.fragment.app.a aVar7 = new androidx.fragment.app.a(supportFragmentManager4);
                aVar7.d("PAY#FN#JRT&CFrag");
                xn2.u.f191736k.getClass();
                aVar7.l(R.id.content_frame, new xn2.u(), "PAY#FN#ProvisionInfoFrag");
                aVar7.e();
                break;
            case 4:
                FelicaAddCardActivity.a aVar8 = FelicaAddCardActivity.f50949l;
                hn2.c.U9(felicaAddCardActivity, felicaAddCardActivity, null, 12);
                felicaAddCardActivity.finish();
                break;
            case 5:
                FelicaAddCardActivity.a aVar9 = FelicaAddCardActivity.f50949l;
                Fragment fragmentG = felicaAddCardActivity.getSupportFragmentManager().G("PAY#FN#ProvisionInfoFrag");
                xn2.u uVar = fragmentG instanceof xn2.u ? (xn2.u) fragmentG : null;
                if (uVar != null) {
                    uVar.k0();
                }
                break;
            case 6:
                FelicaAddCardActivity.a aVar10 = FelicaAddCardActivity.f50949l;
                androidx.fragment.app.v supportFragmentManager5 = felicaAddCardActivity.getSupportFragmentManager();
                androidx.fragment.app.a aVarB4 = androidx.core.view.j.b(supportFragmentManager5, supportFragmentManager5);
                br2.i.a aVar11 = br2.i.f19623g;
                hn2.c.a aVar12 = hn2.c.a.NONE;
                aVar11.getClass();
                br2.i iVarA = br2.i.a.a(R.string.wallet_downloading_card, aVar12, R.string.wallet_syncing_your_wallet);
                iVarA.f19625a = felicaAddCardActivity.new b();
                Unit unit2 = Unit.INSTANCE;
                aVarB4.l(R.id.content_frame, iVarA, "PAY#DownloadCardFrag");
                aVarB4.s(true, true);
                break;
            default:
                FelicaAddCardActivity.a aVar13 = FelicaAddCardActivity.f50949l;
                androidx.fragment.app.v supportFragmentManager6 = felicaAddCardActivity.getSupportFragmentManager();
                androidx.fragment.app.a aVarB5 = androidx.core.view.j.b(supportFragmentManager6, supportFragmentManager6);
                xn2.s.f191732b.getClass();
                aVarB5.l(R.id.content_frame, new xn2.s(), "PAY#FN#ProvisionIntroductionFrag");
                aVarB5.e();
                break;
        }
    }
}
