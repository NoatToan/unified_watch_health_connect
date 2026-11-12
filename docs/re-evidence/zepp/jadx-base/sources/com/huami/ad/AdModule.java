package com.huami.ad;

import android.content.Context;
import com.huami.ad.db.AdKeeper;

/* JADX INFO: loaded from: classes4.dex */
public class AdModule {
    public static Context appContext;

    public static void initialize(Context context, AdRequestParamsDelegate adRequestParamsDelegate) {
        appContext = context.getApplicationContext();
        AdKeeper.init();
    }
}
