package com.huawei.operation.h5pro.jsmodules.dialog;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import defpackage.qpx;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class DialogApi extends JsBaseModule {
    private static final int BUTTON_LIMIT = 2;
    private static final String TAG = "H5PRO_DialogApi";

    @JavascriptInterface
    public void showAlertDialog(final long j, String str) {
        LogUtil.i(TAG, "showAlertDialog: " + str);
        try {
            final JSONObject jSONObject = new JSONObject(str);
            final String strOptString = jSONObject.optString("message");
            if (TextUtils.isEmpty(strOptString)) {
                LogUtil.e(TAG, "showAlertDialog params illegal: message is empty");
                onFailureCallback(j, "message is empty");
                return;
            }
            String strOptString2 = jSONObject.optString("buttons");
            if (TextUtils.isEmpty(strOptString2)) {
                LogUtil.e(TAG, "showAlertDialog params illegal: no buttons");
                onFailureCallback(j, "no buttons");
                return;
            }
            final String[] strArrSplit = !TextUtils.isEmpty(strOptString2) ? strOptString2.split(",") : new String[0];
            if (strArrSplit.length > 2) {
                LogUtil.e(TAG, "showAlertDialog params illegal: buttons limit 2");
                onFailureCallback(j, "no buttons");
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huawei.operation.h5pro.jsmodules.dialog.DialogApi$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m1603x7d9a05db(jSONObject, j, strOptString, strArrSplit);
                    }
                });
            }
        } catch (JSONException e) {
            LogUtil.e(TAG, "showAlertDialog JSONException: " + e.getMessage());
            onFailureCallback(j, "parse params exception");
        }
    }

    /* JADX INFO: renamed from: lambda$showAlertDialog$0$com-huawei-operation-h5pro-jsmodules-dialog-DialogApi, reason: not valid java name */
    /* synthetic */ void m1603x7d9a05db(JSONObject jSONObject, long j, String str, String[] strArr) {
        BaseDialog alertDialog;
        String strOptString = jSONObject.optString("title");
        if (TextUtils.isEmpty(strOptString)) {
            alertDialog = getNoTitleAlertDialog(j, str, strArr);
        } else {
            alertDialog = getAlertDialog(j, strOptString, str, strArr);
        }
        alertDialog.show();
    }

    private BaseDialog getNoTitleAlertDialog(final long j, String str, String[] strArr) {
        String str2;
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.mContext);
        if (!TextUtils.isEmpty(str)) {
            builder.a(str);
        }
        final int i = 0;
        final int i2 = strArr.length <= 1 ? 0 : 1;
        String str3 = strArr[i2];
        if (strArr.length != 2) {
            str2 = "";
        } else {
            str2 = strArr[0];
        }
        if (!TextUtils.isEmpty(str3)) {
            builder.a(str3, new View.OnClickListener() { // from class: com.huawei.operation.h5pro.jsmodules.dialog.DialogApi.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    DialogApi.this.onSuccessCallback(j, Integer.valueOf(i2));
                }
            });
        }
        if (!TextUtils.isEmpty(str2)) {
            builder.d(str2, new View.OnClickListener() { // from class: com.huawei.operation.h5pro.jsmodules.dialog.DialogApi.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    DialogApi.this.onSuccessCallback(j, Integer.valueOf(i));
                }
            });
        }
        return builder.c();
    }

    private BaseDialog getAlertDialog(final long j, String str, String str2, String[] strArr) {
        String str3;
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.mContext);
        if (!TextUtils.isEmpty(str)) {
            builder.e(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            builder.a(str2);
        }
        final int i = 0;
        final int i2 = strArr.length <= 1 ? 0 : 1;
        String str4 = strArr[i2];
        if (strArr.length != 2) {
            str3 = "";
        } else {
            str3 = strArr[0];
        }
        if (!TextUtils.isEmpty(str4)) {
            builder.b(str4, new View.OnClickListener() { // from class: com.huawei.operation.h5pro.jsmodules.dialog.DialogApi.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    DialogApi.this.onSuccessCallback(j, Integer.valueOf(i2));
                }
            });
        }
        if (!TextUtils.isEmpty(str3)) {
            builder.a(str3, new View.OnClickListener() { // from class: com.huawei.operation.h5pro.jsmodules.dialog.DialogApi.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    DialogApi.this.onSuccessCallback(j, Integer.valueOf(i));
                }
            });
        }
        return builder.b();
    }

    @JavascriptInterface
    public void showToast(long j, String str) {
        LogUtil.i(TAG, "showToast: " + str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("message");
            int iOptInt = jSONObject.optInt("duration", 0);
            if (TextUtils.isEmpty(strOptString)) {
                onFailureCallback(j, "message cannot be empty");
                return;
            }
            if (iOptInt == 1) {
                qpx.b(this.mContext, strOptString);
            } else {
                qpx.e(this.mContext, strOptString);
            }
            onSuccessCallback(j);
        } catch (JSONException unused) {
            onFailureCallback(j, "parse params exception");
        }
    }
}
