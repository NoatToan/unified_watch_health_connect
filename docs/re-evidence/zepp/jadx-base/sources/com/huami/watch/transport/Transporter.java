package com.huami.watch.transport;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Transporter {

    public interface ChannelListener extends b {
        void onChannelChanged(boolean z);
    }

    public static class ConnectionResult implements Parcelable {
        public static final Parcelable.Creator<ConnectionResult> CREATOR = new a();
        public static final int R_SERVICE_AUTH_FALIED = 2;
        public static final int R_SERVICE_CONNECTING = 4;
        public static final int R_SERVICE_DISCONNECTED = 3;
        public static final int R_SERVICE_UNAVAILABLE = 1;
        public static final int R_SUCCESS = 0;
        private int a;

        public class a implements Parcelable.Creator<ConnectionResult> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ConnectionResult createFromParcel(Parcel parcel) {
                return new ConnectionResult(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public ConnectionResult[] newArray(int i) {
                return new ConnectionResult[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public int getResultCode() {
            return this.a;
        }

        public String toString() {
            int i = this.a;
            if (i == 0) {
                return "success";
            }
            if (i != 1) {
                return i != 2 ? "Assert" : "service authentication failure";
            }
            return "service is unavailable";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
        }

        public ConnectionResult(int i) {
            this.a = i;
        }

        private ConnectionResult(Parcel parcel) {
            this.a = parcel.readInt();
        }
    }

    public interface DataListener extends c {
        void onDataReceived(TransportDataItem transportDataItem);
    }

    public interface DataSendResultCallback extends d {
        void onResultBack(DataTransportResult dataTransportResult);
    }

    public interface ServiceConnectionListener {
        void onServiceConnected(Bundle bundle);

        void onServiceConnectionFailed(ConnectionResult connectionResult);

        void onServiceDisconnected(ConnectionResult connectionResult);
    }

    public interface b {
    }

    public interface c {
    }

    public interface d {
    }

    public static Transporter get(@NonNull Context context, @NonNull String str) {
        return TransporterClassic.get(context, str);
    }

    public static Transporter getBLE(@NonNull Context context, @NonNull String str) {
        return TransporterBLE.get(context, str);
    }

    public void addChannelListener(ChannelListener channelListener) {
    }

    public abstract void addDataListener(DataListener dataListener);

    public void addServiceConnectionListener(ServiceConnectionListener serviceConnectionListener) {
    }

    public void connectTransportService() {
    }

    public void disconnectTransportService() {
    }

    public abstract boolean isAvailable();

    public boolean isTransportServiceConnected() {
        return true;
    }

    public void removeChannelListener(ChannelListener channelListener) {
    }

    public abstract void removeDataListener(DataListener dataListener);

    public void removeServiceConnectionListener(ServiceConnectionListener serviceConnectionListener) {
    }

    public abstract void send(@NonNull String str, DataBundle dataBundle, DataSendResultCallback dataSendResultCallback);

    public void send(@NonNull String str, DataSendResultCallback dataSendResultCallback) {
        send(str, null, dataSendResultCallback);
    }

    public abstract void sendTo(@NonNull String str, @NonNull String str2, DataBundle dataBundle, DataSendResultCallback dataSendResultCallback);

    public void send(@NonNull String str, DataBundle dataBundle) {
        send(str, dataBundle, null);
    }

    public void send(@NonNull String str) {
        send(str, null, null);
    }
}
