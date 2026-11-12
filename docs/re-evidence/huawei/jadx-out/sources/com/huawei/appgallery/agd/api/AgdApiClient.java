package com.huawei.appgallery.agd.api;

import android.content.Context;
import com.huawei.appgallery.coreservice.api.ApiClient;
import defpackage.bgn;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public interface AgdApiClient extends ApiClient {

    public interface ConnectionCallbacks {
        void onConnected();

        void onConnectionFailed(ConnectionResult connectionResult);

        void onConnectionSuspended(int i);
    }

    @Override // com.huawei.appgallery.coreservice.api.ApiClient
    void connect();

    @Override // com.huawei.appgallery.coreservice.api.ApiClient
    void disconnect();

    @Override // com.huawei.appgallery.coreservice.api.ApiClient
    Context getContext();

    @Override // com.huawei.appgallery.coreservice.api.ApiClient
    boolean isConnected();

    @Override // com.huawei.appgallery.coreservice.api.ApiClient
    boolean isConnecting();

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f5188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set<ConnectionCallbacks> f5189b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f5190c;
        private String d;

        public Builder setHomeCountry(String str) {
            this.f5188a = str;
            return this;
        }

        @Deprecated
        public Builder setGrsAppName(String str) {
            this.d = str;
            return this;
        }

        public AgdApiClient build() {
            return new bgn(new ApiClient.Builder(this.f5190c).setHomeCountry(this.f5188a).setGrsAppName(this.d), this.f5190c, this.f5189b);
        }

        public Builder addConnectionCallbacks(ConnectionCallbacks connectionCallbacks) {
            this.f5189b.add(connectionCallbacks);
            return this;
        }

        public Builder(Context context) {
            this.f5190c = context.getApplicationContext();
        }
    }
}
