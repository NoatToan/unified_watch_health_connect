package jr2;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersActivity;
import com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.LivetrackGroupRideConsentActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.a0;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.garmin.feature.garminpay.ui.developer.DeveloperSettingsActivity;
import i3.e5;
import java.util.Arrays;
import java.util.Locale;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;
import rg0.w;
import zf0.k0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f100562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f100563c;

    public /* synthetic */ e(long j8, androidx.appcompat.app.e.a aVar) {
        this.f100561a = 5;
        this.f100562b = j8;
        this.f100563c = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0036 A[PHI: r1
      0x0036: PHI (r1v8 java.lang.String) = (r1v5 java.lang.String), (r1v9 java.lang.String) binds: [B:13:0x0049, B:7:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        String str;
        int i15 = this.f100561a;
        int i16 = 2;
        long j8 = this.f100562b;
        Object obj = this.f100563c;
        switch (i15) {
            case 0:
                DeveloperSettingsActivity developerSettingsActivity = (DeveloperSettingsActivity) obj;
                kr2.h hVar = developerSettingsActivity.f51955g;
                if (hVar == null) {
                    s.m("viewModel");
                    throw null;
                }
                y0 y0Var = new y0();
                ge1.b.T(v1.a(hVar), null, null, new kr2.i(y0Var, j8, null), 3);
                y0Var.f(developerSettingsActivity, new DeveloperSettingsActivity.d(new c(developerSettingsActivity, i16)));
                return;
            case 1:
                Activity activity = (Activity) obj;
                int i17 = kd0.m.f104216a;
                LivetrackGroupRideConsentActivity.f38667k.getClass();
                activity.startActivity(LivetrackGroupRideConsentActivity.a.a(activity, j8, false));
                return;
            case 2:
                com.garmin.android.apps.connectmobile.powercurve.view.a aVar = (com.garmin.android.apps.connectmobile.powercurve.view.a) obj;
                aVar.f40345b.b(j8, new qa1.d(aVar));
                return;
            case 3:
                AuthorizedViewersActivity.a aVar2 = AuthorizedViewersActivity.f34974m;
                ht.a.f85464a.getClass();
                ht.a.a(null, "AuthorizedViewersInviteAccepted");
                com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.h hVarIa = ((AuthorizedViewersActivity) obj).ia();
                hVarIa.f35094j = ge1.b.T(v1.a(hVarIa), hVarIa.f35088d.f22991c, null, new w(hVarIa, this.f100562b, hVarIa.f35094j, null), 2);
                return;
            case 4:
                a0.a aVar3 = a0.I1;
                AddTIEventViewModel addTIEventViewModelF6 = ((a0) obj).F6();
                ge1.b.T(v1.a(addTIEventViewModelF6), null, null, new k0(addTIEventViewModelF6, j8, null), 3);
                dialogInterface.dismiss();
                return;
            default:
                androidx.appcompat.app.e.a aVar4 = (androidx.appcompat.app.e.a) obj;
                int i18 = vq2.b.f179457y0;
                wr2.i.f186861a.getClass();
                Locale locale = Locale.getDefault();
                x0 x0Var = x0.f105818a;
                locale.getClass();
                String language = locale.getLanguage();
                String country = locale.getCountry();
                if (s.g(language, "pt")) {
                    str = "BR";
                    if (s.g(country, "BR")) {
                        country = str;
                    } else {
                        country = "PT";
                    }
                } else if (s.g(language, "zh")) {
                    str = "CN";
                    if (s.g(country, "CN")) {
                        country = str;
                    } else {
                        country = "TW";
                    }
                }
                Uri uri = Uri.parse(String.format("https://support.garmin.com/%1$s/sas/gcm/?productId=%2$s", Arrays.copyOf(new Object[]{e5.g(language, "-", country), Long.valueOf(j8)}, 2)));
                uri.getClass();
                aVar4.getContext().startActivity(new Intent("android.intent.action.VIEW", uri));
                dialogInterface.dismiss();
                return;
        }
    }

    public /* synthetic */ e(Object obj, long j8, int i14) {
        this.f100561a = i14;
        this.f100563c = obj;
        this.f100562b = j8;
    }
}
