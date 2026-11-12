package com.huami.watch.transport;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes5.dex */
public class HmApiClient {
    private final DataTransportManager a;
    private Context b;
    private ConnectionCallbacks c;
    private OnConnectionFailedListener d;
    private String e;

    public static final class Builder {
        private Context a;
        private ConnectionCallbacks b;
        private OnConnectionFailedListener c;
        private String d;

        public Builder(Context context) {
            this(context, null, null);
        }

        public Builder addConnectionCallbacks(ConnectionCallbacks connectionCallbacks) {
            this.b = connectionCallbacks;
            return this;
        }

        public Builder addOnConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
            this.c = onConnectionFailedListener;
            return this;
        }

        public HmApiClient build() {
            return new HmApiClient(this.a, this.d, this.b, this.c);
        }

        public Builder setModuleName(String str) {
            this.d = str;
            return this;
        }

        public Builder(Context context, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            this.a = context;
            this.d = context.getPackageName();
            this.b = connectionCallbacks;
            this.c = onConnectionFailedListener;
        }
    }

    public interface ConnectionCallbacks {
        void onServicesConnected(Bundle bundle);

        void onServicesDisConnected(ConnectionResult connectionResult);
    }

    public interface OnConnectionFailedListener {
        void onServicesConnectionFailed(ConnectionResult connectionResult);
    }

    public HmApiClient(Context context, String str, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        this.b = context;
        this.e = str;
        this.c = connectionCallbacks;
        this.d = onConnectionFailedListener;
        this.a = DataTransportManager.getInstance(context, str, connectionCallbacks, onConnectionFailedListener);
    }

    public void connect() {
        this.a.connect();
    }

    public void disconnect() {
        this.a.disconnect();
    }

    public DataTransportManager getManager() {
        return this.a;
    }

    public String getModuleName() {
        return this.e;
    }

    public boolean isConnected() {
        return this.a.isConnected();
    }
}
