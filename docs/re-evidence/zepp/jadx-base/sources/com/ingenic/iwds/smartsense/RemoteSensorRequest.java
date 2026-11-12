package com.ingenic.iwds.smartsense;

import android.os.Parcel;
import android.os.Parcelable;
import com.ingenic.iwds.datatransactor.DataTransactor;

/* JADX INFO: loaded from: classes18.dex */
public class RemoteSensorRequest implements Parcelable {
    public static final Parcelable.Creator<RemoteSensorRequest> CREATOR = new Parcelable.Creator<RemoteSensorRequest>() { // from class: com.ingenic.iwds.smartsense.RemoteSensorRequest.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RemoteSensorRequest createFromParcel(Parcel parcel) {
            RemoteSensorRequest remoteSensorRequest = new RemoteSensorRequest();
            remoteSensorRequest.type = parcel.readInt();
            remoteSensorRequest.sensorRate = parcel.readInt();
            if (parcel.readInt() != 0) {
                remoteSensorRequest.sensor = (Sensor) parcel.readParcelable(Sensor.class.getClassLoader());
            }
            return remoteSensorRequest;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RemoteSensorRequest[] newArray(int i) {
            return new RemoteSensorRequest[i];
        }
    };
    public static final int TYPE_REGISTER_LISTENER = 1;
    public static final int TYPE_SENSOR_LIST = 0;
    public static final int TYPE_UNREGISTER_LISTENER = 2;
    private DataTransactor sender;
    public Sensor sensor;
    public int sensorRate;
    public int type;

    public static RemoteSensorRequest obtain() {
        return new RemoteSensorRequest();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DataTransactor getSender() {
        return this.sender;
    }

    public void sendToRemote() {
        this.sender.send(this);
    }

    public void setSender(DataTransactor dataTransactor) {
        this.sender = dataTransactor;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.type);
        parcel.writeInt(this.sensorRate);
        if (this.sensor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(this.sensor, i);
        }
    }

    public static RemoteSensorRequest obtain(DataTransactor dataTransactor) {
        RemoteSensorRequest remoteSensorRequestObtain = obtain();
        remoteSensorRequestObtain.sender = dataTransactor;
        return remoteSensorRequestObtain;
    }
}
