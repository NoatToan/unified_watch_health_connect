package com.huami.mifit.sportlib.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class RouteLineInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<RouteLineInfo> CREATOR = new a();
    private static final long serialVersionUID = 1;
    public boolean mIsMarkEnd;
    public boolean mIsMarkStart;
    public boolean mIsResore;
    public boolean mIsRevised;
    public int mLineColor;
    public int mSportType;
    public int mType;

    public static final class LineType {
        public static final int NONE = -1;
        public static final int STABLE = 0;
        public static final int UNSTABLE = 1;
    }

    public class a implements Parcelable.Creator<RouteLineInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RouteLineInfo createFromParcel(Parcel parcel) {
            return new RouteLineInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RouteLineInfo[] newArray(int i) {
            return new RouteLineInfo[i];
        }
    }

    public RouteLineInfo() {
        this.mIsRevised = false;
        this.mIsMarkStart = false;
        this.mIsMarkEnd = false;
        this.mIsResore = false;
        this.mType = 1;
    }

    public static RouteLineInfo createMarkSEInfo(boolean z, boolean z2, boolean z3) {
        RouteLineInfo routeLineInfo = new RouteLineInfo(z);
        routeLineInfo.mIsMarkStart = z2;
        routeLineInfo.mIsMarkEnd = z3;
        return routeLineInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.mIsRevised ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mIsMarkStart ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mIsMarkEnd ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mIsResore ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mType);
        parcel.writeInt(this.mLineColor);
        parcel.writeInt(this.mSportType);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public RouteLineInfo m3385clone() {
        RouteLineInfo routeLineInfo = new RouteLineInfo();
        routeLineInfo.mIsRevised = this.mIsRevised;
        routeLineInfo.mIsMarkStart = this.mIsMarkStart;
        routeLineInfo.mIsMarkEnd = this.mIsMarkEnd;
        routeLineInfo.mIsResore = this.mIsResore;
        routeLineInfo.mLineColor = this.mLineColor;
        routeLineInfo.mSportType = this.mSportType;
        return routeLineInfo;
    }

    public static RouteLineInfo createMarkSEInfo(boolean z, boolean z2, boolean z3, int i) {
        RouteLineInfo routeLineInfoCreateMarkSEInfo = createMarkSEInfo(z, z2, z3);
        routeLineInfoCreateMarkSEInfo.mLineColor = i;
        return routeLineInfoCreateMarkSEInfo;
    }

    public static RouteLineInfo createMarkSEInfo(boolean z, boolean z2, boolean z3, int i, int i2) {
        RouteLineInfo routeLineInfoCreateMarkSEInfo = createMarkSEInfo(z, z2, z3, i);
        routeLineInfoCreateMarkSEInfo.mSportType = i2;
        return routeLineInfoCreateMarkSEInfo;
    }

    public RouteLineInfo(boolean z) {
        this.mIsRevised = false;
        this.mIsMarkStart = false;
        this.mIsMarkEnd = false;
        this.mIsResore = false;
        this.mType = 1;
        this.mIsRevised = z;
    }

    public RouteLineInfo(boolean z, boolean z2) {
        this.mIsRevised = false;
        this.mIsMarkStart = false;
        this.mIsMarkEnd = false;
        this.mIsResore = false;
        this.mType = 1;
        this.mIsRevised = z;
        this.mIsResore = z2;
    }

    public RouteLineInfo(Parcel parcel) {
        this.mIsRevised = false;
        this.mIsMarkStart = false;
        this.mIsMarkEnd = false;
        this.mIsResore = false;
        this.mType = 1;
        this.mIsRevised = parcel.readByte() != 0;
        this.mIsMarkStart = parcel.readByte() != 0;
        this.mIsMarkEnd = parcel.readByte() != 0;
        this.mIsResore = parcel.readByte() != 0;
        this.mType = parcel.readInt();
        this.mLineColor = parcel.readInt();
        this.mSportType = parcel.readInt();
    }
}
