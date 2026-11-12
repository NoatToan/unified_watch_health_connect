package defpackage;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.Window;
import com.mipay.sdk.MipaySdkConfig;
import com.mipay.sdk.app.MipayWebActivity;
import com.mipay.sdk.util.MipayWebSdkUtils;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import miuipub.hybrid.HybridFeature;
import miuipub.hybrid.Request;
import miuipub.hybrid.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class o7q implements HybridFeature {

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f28832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28833b;

        public a(Activity activity, String str) {
            this.f28832a = activity;
            this.f28833b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Window window = this.f28832a.getWindow();
            if ("true".equalsIgnoreCase(this.f28833b)) {
                window.addFlags(8192);
            } else {
                window.clearFlags(8192);
            }
        }
    }

    public final Response b(Request request) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uiMode", (MipayWebSdkUtils.isNightMode(request.getNativeInterface().getActivity()) ? MipaySdkConfig.UI_MODE.DARK : MipaySdkConfig.UI_MODE.LIGHT).name().toLowerCase());
        } catch (JSONException unused) {
        }
        return new Response(0, jSONObject);
    }

    public final Response d(Request request) {
        final MipayWebActivity mipayWebActivity = (MipayWebActivity) request.getNativeInterface().getActivity();
        String rawParams = request.getRawParams();
        if (TextUtils.isEmpty(rawParams)) {
            return new Response(204, "invalid color");
        }
        if (!rawParams.startsWith(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX)) {
            rawParams = PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + rawParams;
        }
        try {
            final int color = Color.parseColor(rawParams);
            mipayWebActivity.runOnUiThread(new Runnable() { // from class: n7q
                @Override // java.lang.Runnable
                public final void run() {
                    mipayWebActivity.setActionBarBg(color);
                }
            });
            return new Response(0);
        } catch (Exception unused) {
            return new Response(204, "invalid color");
        }
    }

    public final Response e(Request request) {
        Activity activity = request.getNativeInterface().getActivity();
        activity.runOnUiThread(new a(activity, request.getRawParams()));
        return new Response(0);
    }

    @Override // miuipub.hybrid.HybridFeature
    public HybridFeature.Mode getInvocationMode(Request request) {
        String action = request.getAction();
        if (TextUtils.equals(action, "setPageSecure") || TextUtils.equals(action, "setActionBarBackground") || TextUtils.equals(action, "getUiMode")) {
            return HybridFeature.Mode.SYNC;
        }
        return null;
    }

    @Override // miuipub.hybrid.HybridFeature
    public Response invoke(Request request) {
        String action = request.getAction();
        if (TextUtils.equals(action, "setPageSecure")) {
            return e(request);
        }
        if (TextUtils.equals(action, "setActionBarBackground")) {
            return d(request);
        }
        if (TextUtils.equals(action, "getUiMode")) {
            return b(request);
        }
        return new Response(200, "action not support: " + action);
    }
}
