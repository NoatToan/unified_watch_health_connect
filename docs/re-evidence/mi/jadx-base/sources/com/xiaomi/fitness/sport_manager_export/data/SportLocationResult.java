package com.xiaomi.fitness.sport_manager_export.data;

import android.os.Parcel;
import com.xiaomi.fit.data.common.data.sport.Location;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public class SportLocationResult implements Serializable {
    public int accuracyStatus;
    private final int errorCode;
    private final String errorMsg;
    private final Location location;
    private final int satelliteCount;
    private final long timeStamp;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f13211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Location f13212b;
        public int c;
        public int d;
        public int e;
        public String f;

        public a(long j) {
            this.f13211a = j;
        }

        public SportLocationResult g() {
            return new SportLocationResult(this);
        }

        public a h(int i, String str) {
            this.e = i;
            this.f = str;
            return this;
        }

        public a i(int i) {
            this.c = i;
            return this;
        }

        public a j(Location location) {
            this.f13212b = location;
            return this;
        }

        public a k(int i) {
            this.d = i;
            return this;
        }
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public int getGpsAccuracyStatus() {
        return this.accuracyStatus;
    }

    public Location getLocation() {
        return this.location;
    }

    public int getSatelliteCount() {
        return this.satelliteCount;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public boolean isSuccessful() {
        return this.errorCode == 0;
    }

    public String toString() {
        return "timeStamp = " + this.timeStamp + ", accuracyStatus = " + this.accuracyStatus + ", satelliteCount = " + this.satelliteCount + ", location = " + this.location + ", errorCode = " + this.errorCode + ", errorMsg = " + this.errorMsg;
    }

    private SportLocationResult(a aVar) {
        this.timeStamp = aVar.f13211a;
        this.location = aVar.f13212b;
        this.accuracyStatus = aVar.c;
        this.satelliteCount = aVar.d;
        this.errorCode = aVar.e;
        this.errorMsg = aVar.f;
    }

    private SportLocationResult(Parcel parcel) {
        this.timeStamp = parcel.readLong();
        this.location = (Location) parcel.readSerializable();
        this.accuracyStatus = parcel.readInt();
        this.satelliteCount = parcel.readInt();
        this.errorCode = parcel.readInt();
        this.errorMsg = parcel.readString();
    }
}
