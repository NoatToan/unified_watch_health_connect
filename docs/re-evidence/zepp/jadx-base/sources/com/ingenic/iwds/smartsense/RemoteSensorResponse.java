package com.ingenic.iwds.smartsense;

import android.os.Parcel;
import android.os.Parcelable;
import com.ingenic.iwds.datatransactor.DataTransactor;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public class RemoteSensorResponse implements Parcelable {
    public static final Parcelable.Creator<RemoteSensorResponse> CREATOR = new Parcelable.Creator<RemoteSensorResponse>() { // from class: com.ingenic.iwds.smartsense.RemoteSensorResponse.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RemoteSensorResponse createFromParcel(Parcel parcel) {
            RemoteSensorResponse remoteSensorResponse = new RemoteSensorResponse();
            remoteSensorResponse.type = parcel.readInt();
            remoteSensorResponse.result = parcel.readInt();
            remoteSensorResponse.accuracy = parcel.readInt();
            if (parcel.readInt() != 0) {
                remoteSensorResponse.sensor = (Sensor) parcel.readParcelable(Sensor.class.getClassLoader());
            }
            if (parcel.readInt() != 0) {
                remoteSensorResponse.sensorEvent = (SensorEvent) parcel.readParcelable(SensorEvent.class.getClassLoader());
            }
            if (parcel.readInt() != 0) {
                remoteSensorResponse.sensorList = parcel.readArrayList(Sensor.class.getClassLoader());
            }
            return remoteSensorResponse;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RemoteSensorResponse[] newArray(int i) {
            return new RemoteSensorResponse[i];
        }
    };
    public static final int TYPE_SENSEOR_SERVICE_CONNECTED = 1;
    public static final int TYPE_SENSOR_ACCURACY_CHANGED = 3;
    public static final int TYPE_SENSOR_CHANGED = 2;
    public static final int TYPE_SENSOR_LIST = 0;
    public int accuracy;
    public int result;
    private DataTransactor sender;
    public Sensor sensor;
    public SensorEvent sensorEvent;
    public ArrayList<Sensor> sensorList;
    public int type;

    public static RemoteSensorResponse obtain() {
        return new RemoteSensorResponse();
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
        parcel.writeInt(this.result);
        parcel.writeInt(this.accuracy);
        if (this.sensor != null) {
            parcel.writeInt(1);
            parcel.writeParcelable(this.sensor, i);
        } else {
            parcel.writeInt(0);
        }
        if (this.sensorEvent != null) {
            parcel.writeInt(1);
            parcel.writeParcelable(this.sensorEvent, i);
        } else {
            parcel.writeInt(0);
        }
        if (this.sensorList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeList(this.sensorList);
        }
    }

    public static RemoteSensorResponse obtain(DataTransactor dataTransactor) {
        RemoteSensorResponse remoteSensorResponseObtain = obtain();
        remoteSensorResponseObtain.sender = dataTransactor;
        return remoteSensorResponseObtain;
    }
}
