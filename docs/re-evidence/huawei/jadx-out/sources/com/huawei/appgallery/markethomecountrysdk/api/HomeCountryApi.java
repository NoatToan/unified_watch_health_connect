package com.huawei.appgallery.markethomecountrysdk.api;

import android.content.Context;
import com.huawei.hmf.tasks.Task;
import defpackage.bht;

/* JADX INFO: loaded from: classes4.dex */
public class HomeCountryApi {
    public static Task<String> getHomeCountry(Context context, String str, boolean z) {
        return bht.c(context, str, z);
    }
}
