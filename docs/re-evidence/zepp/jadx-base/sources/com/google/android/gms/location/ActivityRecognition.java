package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.location.zzg;

/* JADX INFO: loaded from: classes3.dex */
public class ActivityRecognition {

    @RecentlyNonNull
    public static final Api<Api.ApiOptions.NoOptions> API;

    @RecentlyNonNull
    @Deprecated
    public static final ActivityRecognitionApi ActivityRecognitionApi;

    @RecentlyNonNull
    public static final String CLIENT_NAME = "activity_recognition";
    private static final Api.ClientKey<com.google.android.gms.internal.location.zzaz> a;
    private static final Api.AbstractClientBuilder<com.google.android.gms.internal.location.zzaz, Api.ApiOptions.NoOptions> b;

    static {
        Api.ClientKey<com.google.android.gms.internal.location.zzaz> clientKey = new Api.ClientKey<>();
        a = clientKey;
        a aVar = new a();
        b = aVar;
        API = new Api<>("ActivityRecognition.API", aVar, clientKey);
        ActivityRecognitionApi = new zzg();
    }

    private ActivityRecognition() {
    }

    @RecentlyNonNull
    public static ActivityRecognitionClient getClient(@RecentlyNonNull Activity activity) {
        return new ActivityRecognitionClient(activity);
    }

    @RecentlyNonNull
    public static ActivityRecognitionClient getClient(@RecentlyNonNull Context context) {
        return new ActivityRecognitionClient(context);
    }
}
