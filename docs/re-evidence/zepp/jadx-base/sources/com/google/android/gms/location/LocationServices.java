package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.location.zzaf;
import com.google.android.gms.internal.location.zzz;

/* JADX INFO: loaded from: classes3.dex */
public class LocationServices {

    @RecentlyNonNull
    public static final Api<Api.ApiOptions.NoOptions> API;

    @RecentlyNonNull
    @Deprecated
    public static final FusedLocationProviderApi FusedLocationApi;

    @RecentlyNonNull
    @Deprecated
    public static final GeofencingApi GeofencingApi;

    @RecentlyNonNull
    @Deprecated
    public static final SettingsApi SettingsApi;
    private static final Api.ClientKey<com.google.android.gms.internal.location.zzaz> a;
    private static final Api.AbstractClientBuilder<com.google.android.gms.internal.location.zzaz, Api.ApiOptions.NoOptions> b;

    static {
        Api.ClientKey<com.google.android.gms.internal.location.zzaz> clientKey = new Api.ClientKey<>();
        a = clientKey;
        w wVar = new w();
        b = wVar;
        API = new Api<>("LocationServices.API", wVar, clientKey);
        FusedLocationApi = new zzz();
        GeofencingApi = new zzaf();
        SettingsApi = new com.google.android.gms.internal.location.zzbi();
    }

    private LocationServices() {
    }

    @RecentlyNonNull
    public static FusedLocationProviderClient getFusedLocationProviderClient(@RecentlyNonNull Activity activity) {
        return new FusedLocationProviderClient(activity);
    }

    @RecentlyNonNull
    public static GeofencingClient getGeofencingClient(@RecentlyNonNull Activity activity) {
        return new GeofencingClient(activity);
    }

    @RecentlyNonNull
    public static SettingsClient getSettingsClient(@RecentlyNonNull Activity activity) {
        return new SettingsClient(activity);
    }

    public static com.google.android.gms.internal.location.zzaz zza(GoogleApiClient googleApiClient) {
        Preconditions.checkArgument(googleApiClient != null, "GoogleApiClient parameter is required.");
        com.google.android.gms.internal.location.zzaz zzazVar = (com.google.android.gms.internal.location.zzaz) googleApiClient.getClient(a);
        Preconditions.checkState(zzazVar != null, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return zzazVar;
    }

    @RecentlyNonNull
    public static FusedLocationProviderClient getFusedLocationProviderClient(@RecentlyNonNull Context context) {
        return new FusedLocationProviderClient(context);
    }

    @RecentlyNonNull
    public static GeofencingClient getGeofencingClient(@RecentlyNonNull Context context) {
        return new GeofencingClient(context);
    }

    @RecentlyNonNull
    public static SettingsClient getSettingsClient(@RecentlyNonNull Context context) {
        return new SettingsClient(context);
    }
}
