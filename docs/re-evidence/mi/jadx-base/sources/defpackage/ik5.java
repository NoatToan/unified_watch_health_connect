package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import miuipub.hybrid.HybridFeature;
import miuipub.hybrid.Request;
import miuipub.hybrid.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ik5 implements HybridFeature {
    public final Response a(Request request) {
        Activity activity = request.getNativeInterface().getActivity();
        return e(activity, activity.getPackageName());
    }

    public final Response b(Request request) {
        return new Response(0, request.getNativeInterface().getActivity().getPackageName());
    }

    public final Response c(Request request) {
        return f(5L, "3.2.6.0.1");
    }

    public final Response d(Request request) {
        return e(request.getNativeInterface().getActivity(), "com.mipay.wallet");
    }

    public final Response e(Context context, String str) {
        String str2;
        int i = -1;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            i = packageInfo.versionCode;
            str2 = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            str2 = "";
        }
        return f(i, str2);
    }

    public final Response f(long j, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CommonConstants.KEY_VERSION_CODE, j);
            jSONObject.put(CommonConstants.KEY_VERSION_NAME, str);
        } catch (JSONException unused) {
        }
        return new Response(0, jSONObject.toString());
    }

    @Override // miuipub.hybrid.HybridFeature
    public HybridFeature.Mode getInvocationMode(Request request) {
        String action = request.getAction();
        if (TextUtils.equals(action, "sdkVersion") || TextUtils.equals(action, "WalletVersion") || TextUtils.equals(action, "AppVersion") || TextUtils.equals(action, "AppPackageName")) {
            return HybridFeature.Mode.SYNC;
        }
        return null;
    }

    @Override // miuipub.hybrid.HybridFeature
    public Response invoke(Request request) {
        String action = request.getAction();
        if (TextUtils.equals(action, "sdkVersion")) {
            return c(request);
        }
        if (TextUtils.equals(action, "WalletVersion")) {
            return d(request);
        }
        if (TextUtils.equals(action, "AppVersion")) {
            return a(request);
        }
        return TextUtils.equals(action, "AppPackageName") ? b(request) : new Response(200, "action not support");
    }
}
