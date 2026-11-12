package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.mipay.sdk.Mipay;
import java.io.Serializable;
import java.net.URISyntaxException;
import java.util.Iterator;
import miuipub.hybrid.HybridFeature;
import miuipub.hybrid.Request;
import miuipub.hybrid.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class tig implements HybridFeature {
    public final Response a(Request request) {
        Activity activity = request.getNativeInterface().getActivity();
        if (activity == null) {
            return new Response(200, "activity is null");
        }
        activity.finish();
        return new Response(0);
    }

    public final Bundle b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof Integer) {
                    bundle.putString(next, obj.toString());
                } else if (obj instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                } else if (obj instanceof String) {
                    bundle.putString(next, (String) obj);
                }
            }
            return bundle;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final Response c(Request request) {
        String rawParams = request.getRawParams();
        if (TextUtils.isEmpty(rawParams)) {
            return new Response(200, "request param is empty");
        }
        try {
            JSONObject jSONObject = new JSONObject(rawParams);
            String string = jSONObject.getString("url");
            if (TextUtils.isEmpty(string)) {
                return new Response(200, "url is empty");
            }
            Intent intentG = g(string, jSONObject);
            Activity activity = request.getNativeInterface().getActivity();
            if (activity.getPackageManager().resolveActivity(intentG, 0) == null) {
                return new Response(200, "can not resolve intent");
            }
            activity.startActivity(intentG);
            return new Response(0);
        } catch (Exception unused) {
            return new Response(200, "occur error when open page");
        }
    }

    public final Response d(Request request) {
        String rawParams = request.getRawParams();
        if (TextUtils.isEmpty(rawParams)) {
            return new Response(200, "packageName param is null");
        }
        Activity activity = request.getNativeInterface().getActivity();
        if (activity == null) {
            return new Response(200, "activity is null");
        }
        try {
            if (activity.getPackageManager().getPackageInfo(rawParams, 0) != null) {
                return new Response(0);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("packageName not found: ");
            sb.append(rawParams);
        }
        return new Response(200, "app not exist");
    }

    public final Response e(Request request) {
        String rawParams = request.getRawParams();
        if (TextUtils.isEmpty(rawParams)) {
            return new Response(200, "packageName param is null");
        }
        Activity activity = request.getNativeInterface().getActivity();
        if (activity == null) {
            return new Response(200, "activity is null");
        }
        Intent launchIntentForPackage = activity.getPackageManager().getLaunchIntentForPackage(rawParams);
        if (launchIntentForPackage == null) {
            return new Response(200, "parsed intent is null");
        }
        activity.startActivity(launchIntentForPackage);
        return new Response(0);
    }

    public final Intent f(int i, String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("code", i);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("message", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                intent.putExtra("result", b(new JSONObject(str2)));
            } catch (JSONException unused) {
                intent.putExtra("result", str2);
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", i);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("message", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("result", str2);
            }
        } catch (JSONException unused2) {
        }
        intent.putExtra(Mipay.KEY_FULL_RESULT, jSONObject.toString());
        return intent;
    }

    public final Intent g(String str, JSONObject jSONObject) throws URISyntaxException {
        Intent uri = str.startsWith("intent:") ? Intent.parseUri(str, 1) : new Intent("android.intent.action.VIEW", Uri.parse(str));
        uri.putExtras(h(jSONObject));
        return uri;
    }

    @Override // miuipub.hybrid.HybridFeature
    public HybridFeature.Mode getInvocationMode(Request request) {
        String action = request.getAction();
        if (TextUtils.equals(action, "openPage") || TextUtils.equals(action, "finish") || TextUtils.equals(action, "setResult") || TextUtils.equals(action, "finishAndSetResult") || TextUtils.equals(action, "appExist") || TextUtils.equals(action, "launchApp")) {
            return HybridFeature.Mode.SYNC;
        }
        return null;
    }

    public final Bundle h(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extra");
        Bundle bundle = new Bundle();
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    bundle.putSerializable(next, (Serializable) jSONObjectOptJSONObject.get(next));
                } catch (Exception unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("parse extra param failed, key: ");
                    sb.append(next);
                }
            }
        }
        return bundle;
    }

    public final Response i(Request request, boolean z) {
        String strOptString;
        String strOptString2 = "user canceled";
        int i = 2;
        try {
            JSONObject jSONObject = new JSONObject(request.getRawParams());
            i = jSONObject.getInt("code");
            strOptString2 = jSONObject.optString("message");
            strOptString = jSONObject.optString("result");
        } catch (JSONException unused) {
            strOptString = null;
        }
        Intent intentF = f(i, strOptString2, strOptString);
        Activity activity = request.getNativeInterface().getActivity();
        if (activity == null) {
            return new Response(200, "activity is null");
        }
        if (i == 0) {
            activity.setResult(-1, intentF);
        } else {
            activity.setResult(0, intentF);
        }
        if (z) {
            activity.finish();
        }
        return new Response(0);
    }

    @Override // miuipub.hybrid.HybridFeature
    public Response invoke(Request request) {
        String action = request.getAction();
        if ("openPage".equals(action)) {
            return c(request);
        }
        if ("finish".equals(action)) {
            return a(request);
        }
        if ("setResult".equals(action)) {
            return i(request, false);
        }
        if ("finishAndSetResult".equals(action)) {
            return i(request, true);
        }
        if ("appExist".equals(action)) {
            return d(request);
        }
        return "launchApp".equals(action) ? e(request) : new Response(200, "param invalid");
    }
}
