package com.huami.reddot;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public class ConfigurationHolder {

    @SuppressLint({"StaticFieldLeak"})
    private static Context a;

    public static Context getContext() {
        return a;
    }

    public static void initContext(Context context) {
        a = context;
    }
}
