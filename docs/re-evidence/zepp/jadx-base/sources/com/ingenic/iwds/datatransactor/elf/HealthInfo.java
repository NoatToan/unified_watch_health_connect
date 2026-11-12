package com.ingenic.iwds.datatransactor.elf;

import android.os.Parcel;
import android.os.Parcelable;
import com.ingenic.iwds.utils.IwdsAssert;
import java.util.Arrays;

/* JADX INFO: loaded from: classes18.dex */
public class HealthInfo implements Parcelable {
    public static final Parcelable.Creator<HealthInfo> CREATOR = new Parcelable.Creator<HealthInfo>() { // from class: com.ingenic.iwds.datatransactor.elf.HealthInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HealthInfo createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            HealthInfo healthInfo = new HealthInfo(i);
            parcel.readStringArray(healthInfo.days);
            parcel.readStringArray(healthInfo.weeks);
            healthInfo.rates = parcel.readString();
            healthInfo.nowDate = parcel.readLong();
            healthInfo.temp = parcel.readInt();
            healthInfo.humidity = parcel.readInt();
            healthInfo.pressure = parcel.readInt();
            healthInfo.recordDate = parcel.readLong();
            healthInfo.sleepTime = parcel.readLong();
            healthInfo.deepSleepTime = parcel.readLong();
            healthInfo.lightSleepTime = parcel.readLong();
            healthInfo.sleepQuality = parcel.readInt();
            healthInfo.sleepRecordCount = i;
            Record[] recordArr = healthInfo.record;
            if (recordArr != null) {
                parcel.readTypedArray(recordArr, Record.CREATOR);
            }
            healthInfo.uitravioletIntensity = parcel.readInt();
            healthInfo.altitude = parcel.readString();
            return healthInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HealthInfo[] newArray(int i) {
            return new HealthInfo[i];
        }
    };
    public static final int MOTION_DEEP_SLEEP = 7;
    public static final int MOTION_FALL = 64;
    public static final int MOTION_MAX = 5;
    public static final int MOTION_RESET = 0;
    public static final int MOTION_RUN = 3;
    public static final int MOTION_SLEEP = 6;
    public static final int MOTION_STOP = 1;
    public static final int MOTION_VEHICLE = 4;
    public static final int MOTION_WALK = 2;
    public String altitude;
    public String[] days;
    public long deepSleepTime;
    public int humidity;
    public long lightSleepTime;
    public long nowDate;
    public int pressure;
    public String rates;
    public Record[] record;
    public long recordDate;
    public int sleepQuality;
    public int sleepRecordCount;
    public long sleepTime;
    public int temp;
    public int uitravioletIntensity;
    public String[] weeks;

    public static class Record implements Parcelable {
        public static final Parcelable.Creator<Record> CREATOR = new Parcelable.Creator<Record>() { // from class: com.ingenic.iwds.datatransactor.elf.HealthInfo.Record.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Record createFromParcel(Parcel parcel) {
                Record record = new Record();
                record.startTime = parcel.readLong();
                record.endTime = parcel.readLong();
                record.type = parcel.readInt();
                return record;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Record[] newArray(int i) {
                return new Record[i];
            }
        };
        public long endTime;
        public long startTime;
        public int type;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Record [startTime=" + this.startTime + ", endTime=" + this.endTime + ", type=" + this.type + "]";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.startTime);
            parcel.writeLong(this.endTime);
            parcel.writeInt(this.type);
        }
    }

    public HealthInfo() {
        this.sleepRecordCount = 0;
        this.days = new String[13];
        this.weeks = new String[7];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "HealthInfo [days=" + Arrays.toString(this.days) + ", weeks=" + Arrays.toString(this.weeks) + ", rates=[" + this.rates + "], nowDate =" + this.nowDate + ", temp=" + this.temp + ", humidity=" + this.humidity + ", pressure=" + this.pressure + ", recordDate=" + this.recordDate + ", sleepTime=" + this.sleepTime + ", deepSleepTime=" + this.deepSleepTime + ", lightSleepTime =" + this.lightSleepTime + ", sleepQuality=" + this.sleepQuality + ", sleepRecordCount=" + this.sleepRecordCount + ", record=" + Arrays.toString(this.record) + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.sleepRecordCount;
        if (i2 > 0) {
            parcel.writeInt(i2);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeStringArray(this.days);
        parcel.writeStringArray(this.weeks);
        parcel.writeString(this.rates);
        parcel.writeLong(this.nowDate);
        parcel.writeInt(this.temp);
        parcel.writeInt(this.humidity);
        parcel.writeInt(this.pressure);
        parcel.writeLong(this.recordDate);
        parcel.writeLong(this.sleepTime);
        parcel.writeLong(this.deepSleepTime);
        parcel.writeLong(this.lightSleepTime);
        parcel.writeInt(this.sleepQuality);
        Record[] recordArr = this.record;
        if (recordArr != null) {
            parcel.writeTypedArray(recordArr, i);
        }
        parcel.writeInt(this.uitravioletIntensity);
        parcel.writeString(this.altitude);
    }

    public HealthInfo(int i) {
        this.sleepRecordCount = 0;
        IwdsAssert.dieIf(this, i < 0, "monitor size < 0.");
        this.sleepRecordCount = i;
        if (i != 0) {
            this.record = new Record[i];
        }
        this.days = new String[13];
        this.weeks = new String[7];
    }
}
