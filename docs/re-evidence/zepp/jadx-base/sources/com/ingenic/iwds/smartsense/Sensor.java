package com.ingenic.iwds.smartsense;

import android.os.Parcel;
import android.os.Parcelable;
import com.alipay.sdk.m.u.i;

/* JADX INFO: loaded from: classes18.dex */
public class Sensor implements Parcelable {
    public static final Parcelable.Creator<Sensor> CREATOR = new Parcelable.Creator<Sensor>() { // from class: com.ingenic.iwds.smartsense.Sensor.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Sensor createFromParcel(Parcel parcel) {
            Sensor sensor = new Sensor();
            sensor.m_type = parcel.readInt();
            sensor.m_maxRange = parcel.readFloat();
            sensor.m_resolution = parcel.readFloat();
            sensor.m_minDelay = parcel.readInt();
            return sensor;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Sensor[] newArray(int i) {
            return new Sensor[i];
        }
    };
    private static final int SMART_SENSE_TYPE_BASE = 100;
    public static final int TYPE_ALL = -1;
    public static final int TYPE_AMBIENT_TEMPERATURE = 13;
    public static final int TYPE_GESTURE = 103;
    public static final int TYPE_HEART_RATE = 21;
    public static final int TYPE_MOTION = 104;
    public static final int TYPE_PRESSURE = 6;
    public static final int TYPE_PROXIMITY = 8;
    public static final int TYPE_RELATIVE_HUMIDITY = 12;
    public static final int TYPE_STEP_COUNTER = 19;
    public static final int TYPE_UV = 102;
    public static final int TYPE_VOICE_TRIGGER = 105;
    private float m_maxRange;
    private int m_minDelay;
    private float m_resolution;
    private int m_type;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getMaximumRange() {
        return this.m_maxRange;
    }

    public int getMinDelay() {
        return this.m_minDelay;
    }

    public float getResolution() {
        return this.m_resolution;
    }

    public int getType() {
        return this.m_type;
    }

    public String toString() {
        return "{type=" + this.m_type + ", maxRange=" + this.m_maxRange + ", resolution=" + this.m_resolution + ",minDelay=" + this.m_minDelay + i.d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.m_type);
        parcel.writeFloat(this.m_maxRange);
        parcel.writeFloat(this.m_resolution);
        parcel.writeInt(this.m_minDelay);
    }
}
