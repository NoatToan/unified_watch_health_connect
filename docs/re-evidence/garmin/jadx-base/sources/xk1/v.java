package xk1;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.consent.ConsentDeleteDataActivity;
import com.garmin.android.apps.connectmobile.consent.ProductImprovementConsentActivity;
import com.garmin.android.apps.connectmobile.consent.UploadConsentRedirectActivity;
import com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.screen.CaloriesLinkAccountsActivity;
import com.garmin.android.apps.connectmobile.promotions.CampaignInfoFullScreenActivity;
import z10.d1;
import z10.m2;
import zb0.c1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class v implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191292a;

    public /* synthetic */ v(int i14) {
        this.f191292a = i14;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        switch (this.f191292a) {
            case 0:
                com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.d.a aVar = com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.d.N0;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 1:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 2:
                xn2.e.a aVar2 = xn2.e.f191693i;
                dialogInterface.dismiss();
                break;
            case 3:
                dialogInterface.dismiss();
                break;
            case 4:
                xn2.p.a aVar3 = xn2.p.f191723f;
                dialogInterface.dismiss();
                break;
            case 5:
                int i15 = xz0.o.f192801j;
                dialogInterface.dismiss();
                break;
            case 6:
                CampaignInfoFullScreenActivity.a aVar4 = CampaignInfoFullScreenActivity.f41033o;
                dialogInterface.dismiss();
                break;
            case 7:
                int i16 = yn2.b.G0;
                dialogInterface.dismiss();
                break;
            case 8:
                dialogInterface.dismiss();
                break;
            case 9:
                dialogInterface.dismiss();
                break;
            case 10:
                dialogInterface.dismiss();
                break;
            case 11:
                ConsentDeleteDataActivity.a aVar5 = ConsentDeleteDataActivity.f32160d;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 12:
                d1 d1Var = d1.f200951a;
                dialogInterface.dismiss();
                break;
            case 13:
                d1 d1Var2 = d1.f200951a;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 14:
                d1 d1Var3 = d1.f200951a;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                break;
            case 15:
                d1 d1Var4 = d1.f200951a;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 16:
                d1 d1Var5 = d1.f200951a;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 17:
                d1 d1Var6 = d1.f200951a;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 18:
                m2.a aVar6 = m2.f201155f;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 19:
                ProductImprovementConsentActivity.a aVar7 = ProductImprovementConsentActivity.f32230h;
                dialogInterface.dismiss();
                break;
            case 20:
                UploadConsentRedirectActivity.a aVar8 = UploadConsentRedirectActivity.f32243t;
                dialogInterface.dismiss();
                break;
            case 21:
                CaloriesLinkAccountsActivity.a aVar9 = CaloriesLinkAccountsActivity.f39595i;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 22:
                CaloriesLinkAccountsActivity.a aVar10 = CaloriesLinkAccountsActivity.f39595i;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 23:
                dialogInterface.dismiss();
                break;
            case 24:
                dialogInterface.dismiss();
                break;
            case 25:
                dialogInterface.cancel();
                break;
            case 26:
                int i17 = c1.f203441z;
                dialogInterface.dismiss();
                break;
            case 27:
                dialogInterface.dismiss();
                break;
            case 28:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.a aVar11 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.f43873n;
                dialogInterface.dismiss();
                break;
            default:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.a aVar12 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.f43873n;
                dialogInterface.dismiss();
                break;
        }
    }
}
