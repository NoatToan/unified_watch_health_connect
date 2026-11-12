package com.ximalaya.ting.android.opensdk.util;

import android.content.Context;
import com.ximalaya.ting.android.opensdk.constants.PreferenceConstantsInOpenSdk;

/* JADX INFO: loaded from: classes22.dex */
public class SharedPreferencesUtil extends BaseSharedPreferencesUtil {
    private static SharedPreferencesUtil instance;

    public SharedPreferencesUtil(Context context, String str) {
        super(context, str);
    }

    public static SharedPreferencesUtil getInstance(Context context) {
        if (instance == null) {
            instance = new SharedPreferencesUtil(context, PreferenceConstantsInOpenSdk.OPENSDK_FILENAME_TING_DATA);
        }
        return instance;
    }

    public static SharedPreferencesUtil getInstanceForPlayer(Context context) {
        SharedPreferencesUtil sharedPreferencesUtil = new SharedPreferencesUtil(context, PreferenceConstantsInOpenSdk.OPENSDK_FILENAME_TING_DATA);
        instance = sharedPreferencesUtil;
        return sharedPreferencesUtil;
    }

    public SharedPreferencesUtil(Context context, String str, int i) {
        super(context, str, i);
    }
}
