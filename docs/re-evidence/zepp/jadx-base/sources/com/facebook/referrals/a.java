package com.facebook.referrals;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookSdk;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CustomTab;
import com.facebook.internal.CustomTabUtils;
import com.facebook.internal.Utility;
import com.facebook.login.CustomTabPrefetchHelper;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
class a {
    public static final String d = "fb_referral_codes";
    public static final String e = "error_message";
    private static final String f = "share_referral";
    private static final int g = 1;
    private static final int h = 20;
    private Fragment a;
    private String b;
    public String c;

    public a(Fragment fragment) {
        this.a = fragment;
    }

    private void a(int i, Intent intent) {
        FragmentActivity activity;
        if (!this.a.isAdded() || (activity = this.a.getActivity()) == null) {
            return;
        }
        activity.setResult(i, intent);
        activity.finish();
    }

    private String b() {
        if (this.b == null) {
            this.b = CustomTabUtils.getChromePackage();
        }
        return this.b;
    }

    public static String c() {
        return "fb" + FacebookSdk.getApplicationId() + "://authorize";
    }

    private Bundle d() {
        Bundle bundle = new Bundle();
        this.c = Utility.generateRandomString(20);
        bundle.putString("redirect_uri", CustomTabUtils.getValidRedirectURI(c()));
        bundle.putString("app_id", FacebookSdk.getApplicationId());
        bundle.putString("state", this.c);
        return bundle;
    }

    public static int e() {
        return CallbackManagerImpl.RequestCodeOffset.Referral.toRequestCode();
    }

    private boolean f() {
        return b() != null;
    }

    private boolean i() {
        if (this.a.getActivity() == null || this.a.getActivity().checkCallingOrSelfPermission("android.permission.INTERNET") != 0 || !f()) {
            return false;
        }
        Bundle bundleD = d();
        if (FacebookSdk.hasCustomTabsPrefetching) {
            CustomTabPrefetchHelper.mayLaunchUrl(CustomTab.getURIForAction(f, bundleD));
        }
        Intent intent = new Intent(this.a.getActivity(), (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.EXTRA_ACTION, f);
        intent.putExtra(CustomTabMainActivity.EXTRA_PARAMS, bundleD);
        intent.putExtra(CustomTabMainActivity.EXTRA_CHROME_PACKAGE, b());
        this.a.startActivityForResult(intent, 1);
        return true;
    }

    private boolean j(Bundle bundle) {
        if (this.c == null) {
            return true;
        }
        boolean zEquals = this.c.equals(bundle.getString("state"));
        this.c = null;
        return zEquals;
    }

    public void g(int i, int i2, Intent intent) {
        String stringExtra;
        if (i != 1) {
            return;
        }
        if (intent != null && (stringExtra = intent.getStringExtra(CustomTabMainActivity.EXTRA_URL)) != null && stringExtra.startsWith(CustomTabUtils.getValidRedirectURI(c()))) {
            Bundle urlQueryString = Utility.parseUrlQueryString(Uri.parse(stringExtra).getQuery());
            if (j(urlQueryString)) {
                intent.putExtras(urlQueryString);
            } else {
                i2 = 0;
                intent.putExtra("error_message", "The referral response was missing a valid challenge string.");
            }
        }
        a(i2, intent);
    }

    public void h() {
        if (i()) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("error_message", "Failed to open Referral dialog: Chrome custom tab could not be started. Please make sure internet permission is granted and Chrome is installed");
        a(0, intent);
    }
}
