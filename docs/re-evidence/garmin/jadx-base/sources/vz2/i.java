package vz2;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.myfitnesspal.android.sdk.MfpAuthError;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f180946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f180947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f180948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f180949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f180950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Activity f180951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f180952h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f180953i;

    public i(String str, String str2) {
        if (str == null) {
            vb.h.s("You must specify your application ID when instantiating a MyFitnessPal object. See README for details.");
            throw null;
        }
        this.f180945a = str;
        this.f180946b = str2;
    }

    public final void a(Activity activity, k kVar, j jVar, d dVar) {
        wz2.a.a("authorize", new Object[0]);
        Intent intent = null;
        this.f180947c = null;
        this.f180948d = null;
        this.f180949e = null;
        this.f180951g = activity;
        this.f180952h = 788;
        String str = this.f180945a;
        String str2 = this.f180946b;
        this.f180950f = new b(str, str2, kVar, jVar);
        this.f180953i = dVar;
        Intent intentPutExtras = new Intent().setPackage("com.myfitnesspal.android").setAction("com.myfitnesspal.android.login.AUTHORIZE").putExtras(this.f180950f.a());
        intentPutExtras.setFlags(intentPutExtras.getFlags() & (-268435457));
        wz2.a.a("SDK connect intent action = %s, flags = 0x%x", intentPutExtras.getAction(), Integer.valueOf(intentPutExtras.getFlags()));
        Activity activity2 = this.f180951g;
        ResolveInfo resolveInfoResolveActivity = activity2.getPackageManager().resolveActivity(intentPutExtras, 0);
        if (resolveInfoResolveActivity == null) {
            wz2.a.a("Could not get resolve info", new Object[0]);
        } else {
            try {
                for (Signature signature : activity2.getPackageManager().getPackageInfo(resolveInfoResolveActivity.activityInfo.packageName, 64).signatures) {
                    if (signature.toCharsString().equals("3082021930820182a00302010202044bd5ddbd300d06092a864886f70d01010505003051310b3009060355040613025553311330110603550408130a43616c69666f726e6961311230100603550407130953616e20446965676f31193017060355040313104d794669746e65737350616c204c4c43301e170d3130303432363138333835335a170d3335303432303138333835335a3051310b3009060355040613025553311330110603550408130a43616c69666f726e6961311230100603550407130953616e20446965676f31193017060355040313104d794669746e65737350616c204c4c4330819f300d06092a864886f70d010101050003818d00308189028181009c68d057f7f4d1544cc5a4c9a32a047c2cec9ed773a17830e91c462eb9dad832912dcdfce00cdf62c3276456d30053edaddeb7c326e75749a7569eb5031ebb60688959fcf27cac67364ee852c7a8ca99505e9c281bac69961d726ce0ba46dce798c6b43760a78560ab4c976f0bf38c6d7f43651929eba8ccef8f9961aa0d82870203010001300d06092a864886f70d01010505000381810086049aff894cb055b6d31357ab677491fc8650286dadc7588671a7be19a224b6bf9c1c3a1cb13c196e85bf0998e53e6f8af3b6312f87e1d062700d019facfd0b4efc87845b9971adf439bb1095accb4c015460db12e260f282120e5e7dd81075ebe0e80aeb468eb7477ce6891841cbcb2f6712dfa3ade3631a601e62d1b11ca6")) {
                        intent = intentPutExtras;
                        break;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (intent != null) {
            try {
                activity.startActivityForResult(intent, 788);
                return;
            } catch (ActivityNotFoundException unused2) {
            }
        }
        new c();
        String str3 = this.f180950f.f180931c;
        String str4 = Build.MANUFACTURER.contains("Amazon") ? "http://www.amazon.com/Calorie-Counter-Diet-Tracker-MyFitnessPal/dp/B004H6WTJI" : activity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.myfitnesspal.android&referrer=%s")), 0) != null ? "market://details?id=com.myfitnesspal.android&referrer=%s" : "https://play.google.com/store/apps/details?id=com.myfitnesspal.android&referrer=%s";
        Bundle bundleD = tn.k.d("utm_campaign", "mfpconnect", "utm_source", str);
        if (str2 == null) {
            str2 = "";
        }
        bundleD.putString("utm_medium", str2);
        bundleD.putString("utm_content", str3);
        String str5 = String.format(str4, URLEncoder.encode(wz2.b.b(bundleD)));
        wz2.a.a("app not on device, using download URL %s", str5);
        activity.startActivity(new Intent("android.intent.action.VIEW").addFlags(268435456).setData(Uri.parse(str5)));
    }

    public final void b(MfpAuthError mfpAuthError) {
        wz2.a.a(mfpAuthError.toString(), new Object[0]);
        this.f180953i.c(mfpAuthError);
    }

    public final void c(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("userCanceled", true);
        this.f180953i.b(bundle);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    public final void d(Bundle bundle) {
        boolean z14 = false;
        wz2.a.a(bundle.toString(), new Object[0]);
        String string = bundle.getString("redirect_uri");
        if (string == null) {
            wz2.a.a("setDataFromBundle: Response type = %s, code = %s, accessToken = %s, refreshToken = %s", this.f180950f.f180933e.toString(), this.f180949e, this.f180947c, this.f180948d);
            this.f180949e = bundle.getString("code");
            this.f180947c = bundle.getString("access_token");
            this.f180948d = bundle.getString("refresh_token");
        } else {
            String str = this.f180950f.f180931c;
            if (string == str ? true : string.equals(str)) {
                wz2.a.a("setDataFromBundle: Response type = %s, code = %s, accessToken = %s, refreshToken = %s", this.f180950f.f180933e.toString(), this.f180949e, this.f180947c, this.f180948d);
                this.f180949e = bundle.getString("code");
                this.f180947c = bundle.getString("access_token");
                this.f180948d = bundle.getString("refresh_token");
            } else {
                wz2.a.a("Got redirectUrl = %s but doesn't match %s", string, this.f180950f.f180931c);
            }
        }
        j jVar = this.f180950f.f180933e;
        j.a aVar = j.f180954a;
        Boolean boolValueOf = Boolean.valueOf(jVar == aVar || jVar == j.f180956c);
        String str2 = this.f180949e;
        j jVar2 = this.f180950f.f180933e;
        j.b bVar = j.f180955b;
        wz2.a.a("hasValidData: wantsCode = %s, code = %s, wantsTokens = %s, accessToken = %s, refreshToken = %s", boolValueOf, str2, Boolean.valueOf(jVar2 == bVar || jVar2 == j.f180956c), this.f180947c, this.f180948d);
        j jVar3 = this.f180950f.f180933e;
        if (!(jVar3 == bVar || jVar3 == j.f180956c) || (this.f180947c != null && this.f180948d != null)) {
            if (!(jVar3 == aVar || jVar3 == j.f180956c) || this.f180949e != null) {
                z14 = true;
            }
        }
        if (z14) {
            this.f180953i.a(bundle);
        } else {
            b(new MfpAuthError(am.j.m("Failed to receive ", jVar3.toString(), ".")));
        }
    }

    public i(String str) {
        this(str, null);
    }
}
