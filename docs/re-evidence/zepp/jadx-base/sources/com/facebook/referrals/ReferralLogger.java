package com.facebook.referrals;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.appevents.InternalAppEventsLogger;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class ReferralLogger {
    public static final String d = "fb_mobile_referral_start";
    public static final String e = "fb_mobile_referral_success";
    public static final String f = "fb_mobile_referral_cancel";
    public static final String g = "fb_mobile_referral_error";
    public static final String h = "0_auth_logger_id";
    public static final String i = "1_timestamp_ms";
    public static final String j = "2_error_message";
    public static final String k = "3_extras";
    public static final String l = "facebookVersion";
    public static final String m = "request_code";
    public static final String n = "";
    public static final String o = "com.facebook.katana";
    private final InternalAppEventsLogger a;
    private String b = UUID.randomUUID().toString();
    private String c;

    public ReferralLogger(Context context, String str) {
        PackageInfo packageInfo;
        this.a = new InternalAppEventsLogger(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) == null) {
                return;
            }
            this.c = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("0_auth_logger_id", this.b);
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString(j, "");
        bundle.putString(k, "");
        return bundle;
    }

    public void logCancel() {
        this.a.logEventImplicitly(f, a());
    }

    public void logError(Exception exc) {
        Bundle bundleA = a();
        if (exc != null && exc.getMessage() != null) {
            bundleA.putString(j, exc.getMessage());
        }
        this.a.logEventImplicitly(g, bundleA);
    }

    public void logStartReferral() {
        Bundle bundleA = a();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("request_code", a.e());
            String str = this.c;
            if (str != null) {
                jSONObject.put("facebookVersion", str);
            }
            bundleA.putString(k, jSONObject.toString());
        } catch (JSONException unused) {
        }
        this.a.logEventImplicitly(d, bundleA);
    }

    public void logSuccess() {
        this.a.logEventImplicitly(e, a());
    }
}
