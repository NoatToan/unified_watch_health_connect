package com.ingenic.iwds.smartsense;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class SensorEvent implements Parcelable {
    public static final int ACCURACY_HEART_RATE_AVALIABLE = 2;
    public static final int ACCURACY_HEART_RATE_UNAVALIABLE = 1;
    public static final Parcelable.Creator<SensorEvent> CREATOR = new Parcelable.Creator<SensorEvent>() { // from class: com.ingenic.iwds.smartsense.SensorEvent.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SensorEvent createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            SensorEvent sensorEvent = new SensorEvent(i);
            for (int i2 = 0; i2 < i; i2++) {
                sensorEvent.values[i2] = parcel.readFloat();
            }
            sensorEvent.accuracy = parcel.readInt();
            sensorEvent.sensorType = parcel.readInt();
            return sensorEvent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SensorEvent[] newArray(int i) {
            return new SensorEvent[i];
        }
    };
    public static final int EVENT_WAKE_UP = 1;
    public static final int GESTURE_LET_HAND_DOWN_AFTER_LOOK = 3;
    public static final int GESTURE_RAISE_HAND_AND_LOOK = 2;
    public static final int GESTURE_SHAKE_HAND = 1;
    public static final int GESTURE_TURN_WRIST = 4;
    public static final int MOTION_DEEP_SLEEP = 7;
    public static final int MOTION_FALL = 64;
    public static final int MOTION_MAX = 5;
    public static final int MOTION_RESET = 0;
    public static final int MOTION_RUN = 3;
    public static final int MOTION_SLEEP = 6;
    public static final int MOTION_STOP = 1;
    public static final int MOTION_VEHICLE = 4;
    public static final int MOTION_WALK = 2;
    public int accuracy;
    public int sensorType;
    public final float[] values;
    private final int valuesSize;

    public SensorEvent(int i) {
        this.valuesSize = i;
        this.values = new float[i];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.valuesSize);
        for (int i2 = 0; i2 < this.valuesSize; i2++) {
            parcel.writeFloat(this.values[i2]);
        }
        parcel.writeInt(this.accuracy);
        parcel.writeInt(this.sensorType);
    }
}
