package com.huawei.health.h5pro.jsbridge.system.permission;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.core.content.ContextCompat;
import com.huawei.health.h5pro.core.H5ProBundle;
import com.huawei.health.h5pro.core.R;
import com.huawei.health.h5pro.core.b;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import defpackage.exo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class PermissionEntry extends JsBaseModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IPermission f6868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f6869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f6870c;
    private boolean d = false;

    /* JADX INFO: loaded from: classes28.dex */
    public static class c implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<PermissionEntry> f6874b;
        private final boolean d;

        public c(PermissionEntry permissionEntry, boolean z) {
            this.f6874b = new WeakReference<>(permissionEntry);
            this.d = z;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            PermissionEntry permissionEntry = (PermissionEntry) GeneralUtil.getReferent(this.f6874b);
            if (permissionEntry == null) {
                LogUtil.w("H5PRO_PermissionEntry_OnGpsDialogClickListener", "permissionEntry is null");
                return;
            }
            if (!this.d) {
                permissionEntry.d = false;
                LogUtil.i("H5PRO_PermissionEntry_OnGpsDialogClickListener", "onClick NegativeButton");
                permissionEntry.onFailureCallback(permissionEntry.f6869b, "request location service fail: user canceled");
                return;
            }
            LogUtil.i("H5PRO_PermissionEntry_OnGpsDialogClickListener", "onClick PositiveButton");
            Activity activity = permissionEntry.f6870c;
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                LogUtil.w("H5PRO_PermissionEntry_OnGpsDialogClickListener", "invalid activity");
                permissionEntry.d = false;
                return;
            }
            Intent intent = new Intent();
            intent.setAction("android.settings.LOCATION_SOURCE_SETTINGS");
            try {
                exo.a(activity, intent, 1360);
            } catch (ActivityNotFoundException unused) {
                intent.setAction("android.settings.SETTINGS");
                try {
                    exo.a(activity, intent, 1360);
                } catch (ActivityNotFoundException unused2) {
                    permissionEntry.d = false;
                    permissionEntry.onFailureCallback(permissionEntry.f6869b, "request location service fail: activity not found");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        if (!exo.c(this.mContext)) {
            LogUtil.w(this.TAG, "openGeolocationForWebView: isGpsLocationEnable false");
            return false;
        }
        H5ProInstance h5ProInstance = this.mH5ProInstance;
        WebView webView = h5ProInstance == null ? null : h5ProInstance.getWebView();
        if (webView == null) {
            LogUtil.w(this.TAG, "openGeolocationForWebView: webView is null");
            return false;
        }
        webView.getSettings().setGeolocationEnabled(true);
        return true;
    }

    private List<String> e(JSONArray jSONArray) {
        boolean z = Build.VERSION.SDK_INT >= 33;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.get(i).toString();
            if (z && ("android.permission.READ_EXTERNAL_STORAGE".equalsIgnoreCase(string) || "android.permission.WRITE_EXTERNAL_STORAGE".equalsIgnoreCase(string))) {
                string = "android.permission.READ_MEDIA_IMAGES";
            }
            if (!arrayList.contains(string)) {
                arrayList.add(string);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(long j) {
        Activity activity = this.f6870c;
        if (activity == null || activity.isFinishing() || this.f6870c.isDestroyed()) {
            LogUtil.w(this.TAG, "showGpsDialog: invalid activity");
            return;
        }
        this.d = true;
        this.f6869b = j;
        LogUtil.i(this.TAG, "showGpsDialog() mIsGpsOpenDialog is open");
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f6870c);
        builder.setTitle(R.string.IDS_permission_open_gps_dialog_title);
        builder.setMessage(R.string.IDS_permission_open_gps_dialog_content);
        builder.setCancelable(false);
        builder.setPositiveButton(R.string.IDS_permission_open_gps_dialog_positive, new c(this, true));
        builder.setNegativeButton(R.string.IDS_permission_open_gps_dialog_negative, new c(this, false));
        builder.show();
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1360) {
            LogUtil.i(this.TAG, "Enter checkGpsPermission");
            this.d = false;
            if (c()) {
                onSuccessCallback(this.f6869b, "success");
            } else {
                onFailureCallback(this.f6869b, "user rejected!");
            }
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule
    public void onCreate(H5ProBundle h5ProBundle) {
        super.onCreate(h5ProBundle);
        Context context = this.mContext;
        if (context instanceof Activity) {
            this.f6870c = (Activity) context;
        }
        if (this.f6868a == null) {
            this.f6868a = new AndroidPermission();
        }
        this.f6868a.onMount(this.mContext);
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onDestroy() {
        super.onDestroy();
        this.f6870c = null;
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        IPermission iPermission = this.f6868a;
        if (iPermission != null) {
            iPermission.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @JavascriptInterface
    public void openGpsService(final long j, String str) {
        LogUtil.i(this.TAG, "openGpsService");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huawei.health.h5pro.jsbridge.system.permission.PermissionEntry.2
            @Override // java.lang.Runnable
            public void run() {
                if (PermissionEntry.this.c()) {
                    PermissionEntry.this.onSuccessCallback(j, "success");
                } else {
                    if (PermissionEntry.this.d) {
                        return;
                    }
                    PermissionEntry.this.e(j);
                }
            }
        });
    }

    @JavascriptInterface
    public void query(long j, String str) {
        if (TextUtils.isEmpty(str)) {
            onFailureCallback(j, "params is empty!");
            return;
        }
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("permissions");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    String string = jSONArrayOptJSONArray.getString(i);
                    if (TextUtils.isEmpty(string)) {
                        LogUtil.w(this.TAG, "query: permission is empty");
                    } else if (this.mContext == null) {
                        LogUtil.w(this.TAG, "query: context is null, permission -> " + string);
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("permission", string);
                        jSONObject.put("status", ContextCompat.checkSelfPermission(this.mContext, string));
                        jSONArray.put(jSONObject);
                    }
                }
                onSuccessCallback(j, jSONArray.toString());
                return;
            }
            onFailureCallback(j, "permissions is empty!");
        } catch (JSONException e) {
            LogUtil.e(this.TAG, b.a(e, new StringBuilder("query: exception -> ")));
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void request(final long j, String str) {
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("permissions");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                final List<String> listE = e(jSONArrayOptJSONArray);
                IPermission iPermission = this.f6868a;
                if (iPermission == null) {
                    LogUtil.w(this.TAG, "IPermission is null");
                    return;
                } else {
                    iPermission.requestPermissions((String[]) listE.toArray(new String[0]), new AndroidPermission.PermissionCallback() { // from class: com.huawei.health.h5pro.jsbridge.system.permission.PermissionEntry.5
                        @Override // com.huawei.health.h5pro.jsbridge.system.permission.AndroidPermission.PermissionCallback
                        public void onComplete(int[] iArr) {
                            JSONArray jSONArray = new JSONArray();
                            for (int i = 0; i < iArr.length; i++) {
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("permission", listE.get(i));
                                    jSONObject.put("result", iArr[i]);
                                    jSONArray.put(jSONObject);
                                } catch (JSONException e) {
                                    LogUtil.i(PermissionEntry.this.TAG, String.valueOf(e));
                                }
                            }
                            PermissionEntry.this.onSuccessCallback(j, jSONArray.toString());
                        }

                        @Override // com.huawei.health.h5pro.jsbridge.system.permission.AndroidPermission.PermissionCallback
                        public void onFailure(String str2) {
                            PermissionEntry.this.onFailureCallback(j, str2);
                        }
                    });
                    return;
                }
            }
            onFailureCallback(j, "permission list is empty!");
        } catch (JSONException unused) {
            onFailureCallback(j, "request permission fail:param invalid");
        }
    }
}
