package com.huawei.hms.findnetwork.comm.request.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes33.dex */
public class NearLinkNavigationResult implements Parcelable {
    public static final Parcelable.Creator<NearLinkNavigationResult> CREATOR = new a();
    private float angle;
    private float angleAccuracy;
    private String deviceId;
    private float direction;
    private float distance;
    private float duration;
    private float stage;
    private float trackQuality;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NearLinkNavigationResult createFromParcel(Parcel parcel) {
            return new NearLinkNavigationResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NearLinkNavigationResult[] newArray(int i) {
            return new NearLinkNavigationResult[i];
        }
    }

    public NearLinkNavigationResult() {
        this.stage = -1.0f;
        this.distance = -1.0f;
        this.direction = -1.0f;
        this.angle = -1.0f;
        this.angleAccuracy = -1.0f;
        this.duration = -1.0f;
        this.trackQuality = -1.0f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public NearLinkNavigationResult(Parcel parcel) {
        this.stage = -1.0f;
        this.distance = -1.0f;
        this.direction = -1.0f;
        this.angle = -1.0f;
        this.angleAccuracy = -1.0f;
        this.duration = -1.0f;
        this.trackQuality = -1.0f;
        this.deviceId = parcel.readString();
        this.stage = parcel.readFloat();
        this.distance = parcel.readFloat();
        this.direction = parcel.readFloat();
        this.angle = parcel.readFloat();
        this.angleAccuracy = parcel.readFloat();
        this.duration = parcel.readFloat();
        this.trackQuality = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.deviceId);
        parcel.writeFloat(this.stage);
        parcel.writeFloat(this.distance);
        parcel.writeFloat(this.direction);
        parcel.writeFloat(this.angle);
        parcel.writeFloat(this.angleAccuracy);
        parcel.writeFloat(this.duration);
        parcel.writeFloat(this.trackQuality);
    }

    public String toString() {
        return "NearLinkNavigationResult{stage=" + this.stage + ", distance=" + this.distance + ", direction=" + this.direction + ", angle=" + this.angle + '}';
    }

    public void setTrackQuality(float f) {
        this.trackQuality = f;
    }

    public void setStage(float f) {
        this.stage = f;
    }

    public void setDuration(float f) {
        this.duration = f;
    }

    public void setDistance(float f) {
        this.distance = f;
    }

    public void setDirection(float f) {
        this.direction = f;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setAngleAccuracy(float f) {
        this.angleAccuracy = f;
    }

    public void setAngle(float f) {
        this.angle = f;
    }

    public void reset() {
        this.stage = -1.0f;
        this.distance = -1.0f;
        this.direction = -1.0f;
        this.angle = -1.0f;
        this.angleAccuracy = -1.0f;
        this.duration = -1.0f;
        this.trackQuality = -1.0f;
    }

    public float getTrackQuality() {
        return this.trackQuality;
    }

    public float getStage() {
        return this.stage;
    }

    public float getDuration() {
        return this.duration;
    }

    public float getDistance() {
        return this.distance;
    }

    public float getDirection() {
        return this.direction;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public float getAngleAccuracy() {
        return this.angleAccuracy;
    }

    public float getAngle() {
        return this.angle;
    }
}
