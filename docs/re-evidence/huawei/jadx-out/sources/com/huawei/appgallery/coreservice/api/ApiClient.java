package com.huawei.appgallery.coreservice.api;

import android.content.Context;
import android.text.TextUtils;
import defpackage.bgm;
import defpackage.bhm;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public interface ApiClient {

    public interface ConnectionCallback {
        void onConnected();

        void onConnectionFailed(IConnectionResult iConnectionResult);

        void onConnectionSuspended(int i);
    }

    void connect();

    void disconnect();

    Context getContext();

    ApiClient getDelegate();

    boolean isConnected();

    boolean isConnecting();

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ConnectConfig f5199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set<ConnectionCallback> f5200b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f5201c;
        private String d;
        private String e;

        public Builder setVendorConnectInfo(ConnectConfig connectConfig) {
            if (connectConfig != null && !TextUtils.isEmpty(connectConfig.getConnectServiceAction()) && !TextUtils.isEmpty(connectConfig.getConnectAppPkg()) && !TextUtils.isEmpty(connectConfig.getInstallAppName()) && !TextUtils.isEmpty(connectConfig.getAppSignCertchain()) && !TextUtils.isEmpty(connectConfig.getAppFingerprintSignature())) {
                this.f5199a = connectConfig.m812clone();
            }
            return this;
        }

        public Builder setHomeCountry(String str) {
            this.e = str;
            return this;
        }

        @Deprecated
        public Builder setGrsAppName(String str) {
            this.d = str;
            return this;
        }

        public ApiClient build() {
            if (!TextUtils.isEmpty(this.d)) {
                bhm.d().d(this.f5201c, this.d);
            }
            if (!TextUtils.isEmpty(this.e)) {
                bhm.d().e(this.f5201c, this.e);
            }
            return new bgm(this.f5201c, this.f5200b, this.f5199a);
        }

        public Builder addConnectionCallbacks(ConnectionCallback connectionCallback) {
            this.f5200b.add(connectionCallback);
            return this;
        }

        public Builder(Context context) {
            this.f5201c = context.getApplicationContext();
        }
    }
}
