package com.huawei.hwarkuix.oHBrigdePlugin.healthBridge;

import android.content.Context;
import android.content.SharedPreferences;
import com.huawei.hwarkuix.oHProEngine.OHProBridgePlugin;
import health.compact.a.util.LogUtil;
import ohos.ace.adapter.capability.bridge.BridgeManager;

/* JADX INFO: loaded from: classes10.dex */
public class XStorageBridge extends OHProBridgePlugin {
    private static final String R_TAG = "R_ArkUIX_XStorageBridge";
    private static final String TAG = "ArkUIX_XStorageBridge";
    private Context mContext;

    public XStorageBridge(Context context, String str, int i) {
        super(context, str, i);
        this.mContext = context;
    }

    public XStorageBridge(Context context, String str, BridgeManager bridgeManager) {
        super(context, str, bridgeManager);
        this.mContext = context;
    }

    public void getAll(int i, String str) {
        LogUtil.a(TAG, "getAll enter, prefName: ", str);
        if (validatePrefName(i, str)) {
            ohProOnSuccess(i, this.mContext.getSharedPreferences(str, 0).getAll());
        }
    }

    public void get(int i, String str, String str2) {
        LogUtil.a(TAG, "get enter, prefName: ", str, ",key:", str2);
        if (validatePrefNameAndKey(i, str, str2)) {
            String string = this.mContext.getSharedPreferences(str, 0).getString(str2, "");
            LogUtil.a(TAG, "get result: ", string);
            ohProOnSuccess(i, string);
        }
    }

    public void put(int i, String str, String str2, String str3) {
        LogUtil.a(TAG, "put enter, prefName: ", str, ",key:", str2, ",data:", str3);
        if (validatePrefNameAndKey(i, str, str2)) {
            if (str3 == null) {
                str3 = "";
            }
            SharedPreferences.Editor editorEdit = this.mContext.getSharedPreferences(str, 0).edit();
            editorEdit.putString(str2, str3);
            editorEdit.apply();
            ohProOnSuccess(i, "");
        }
    }

    public void has(int i, String str, String str2) {
        LogUtil.a(TAG, "has enter, prefName: ", str, ",key:", str2);
        if (validatePrefNameAndKey(i, str, str2)) {
            ohProOnSuccess(i, Boolean.valueOf(this.mContext.getSharedPreferences(str, 0).contains(str2)));
        }
    }

    public void delete(int i, String str, String str2) {
        LogUtil.a(TAG, "delete enter, prefName: ", str, ",key:", str2);
        if (validatePrefNameAndKey(i, str, str2)) {
            SharedPreferences.Editor editorEdit = this.mContext.getSharedPreferences(str, 0).edit();
            editorEdit.remove(str2);
            editorEdit.apply();
            ohProOnSuccess(i, "");
        }
    }

    public void clear(int i, String str) {
        LogUtil.a(TAG, "clear enter, prefName: ", str);
        if (validatePrefName(i, str)) {
            SharedPreferences.Editor editorEdit = this.mContext.getSharedPreferences(str, 0).edit();
            editorEdit.clear();
            editorEdit.apply();
            ohProOnSuccess(i, "");
        }
    }

    private boolean validatePrefName(int i, String str) {
        if (str != null && !str.trim().isEmpty()) {
            return true;
        }
        LogUtil.c(TAG, "param error: prefName is null or empty");
        ohProOnFailure(i, "prefName cannot be null or empty");
        return false;
    }

    private boolean validatePrefNameAndKey(int i, String str, String str2) {
        if (!validatePrefName(i, str)) {
            return false;
        }
        if (str2 != null) {
            return true;
        }
        LogUtil.c(TAG, "param error: key is null");
        ohProOnFailure(i, "key cannot be null");
        return false;
    }
}
