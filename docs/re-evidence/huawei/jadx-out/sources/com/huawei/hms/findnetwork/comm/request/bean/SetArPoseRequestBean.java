package com.huawei.hms.findnetwork.comm.request.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes33.dex */
public class SetArPoseRequestBean extends BaseRequestBean implements Parcelable {
    public static final Parcelable.Creator<SetArPoseRequestBean> CREATOR = new a();
    private String deviceId;
    private float outQw;
    private float outQx;
    private float outQy;
    private float outQz;
    private float outTx;
    private float outTy;
    private float outTz;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SetArPoseRequestBean createFromParcel(Parcel parcel) {
            return new SetArPoseRequestBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SetArPoseRequestBean[] newArray(int i) {
            return new SetArPoseRequestBean[i];
        }
    }

    public SetArPoseRequestBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SetArPoseRequestBean(Parcel parcel) {
        this.deviceId = parcel.readString();
        this.outTx = parcel.readFloat();
        this.outTy = parcel.readFloat();
        this.outTz = parcel.readFloat();
        this.outQx = parcel.readFloat();
        this.outQy = parcel.readFloat();
        this.outQz = parcel.readFloat();
        this.outQw = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.deviceId);
        parcel.writeFloat(this.outTx);
        parcel.writeFloat(this.outTy);
        parcel.writeFloat(this.outTz);
        parcel.writeFloat(this.outQx);
        parcel.writeFloat(this.outQy);
        parcel.writeFloat(this.outQz);
        parcel.writeFloat(this.outQw);
    }

    public String toString() {
        return "ArPose{outTx=" + this.outTx + ", outTy=" + this.outTy + ", outTz=" + this.outTz + ", outQx=" + this.outQx + ", outQy=" + this.outQy + ", outQz=" + this.outQz + ", outQw=" + this.outQw + '}';
    }

    public void setOutTz(float f) {
        this.outTz = f;
    }

    public void setOutTy(float f) {
        this.outTy = f;
    }

    public void setOutTx(float f) {
        this.outTx = f;
    }

    public void setOutQz(float f) {
        this.outQz = f;
    }

    public void setOutQy(float f) {
        this.outQy = f;
    }

    public void setOutQx(float f) {
        this.outQx = f;
    }

    public void setOutQw(float f) {
        this.outQw = f;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public float getOutTz() {
        return this.outTz;
    }

    public float getOutTy() {
        return this.outTy;
    }

    public float getOutTx() {
        return this.outTx;
    }

    public float getOutQz() {
        return this.outQz;
    }

    public float getOutQy() {
        return this.outQy;
    }

    public float getOutQx() {
        return this.outQx;
    }

    public float getOutQw() {
        return this.outQw;
    }

    public String getDeviceId() {
        return this.deviceId;
    }
}
