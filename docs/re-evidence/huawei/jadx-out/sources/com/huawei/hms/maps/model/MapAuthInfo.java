package com.huawei.hms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;

/* JADX INFO: loaded from: classes34.dex */
public class MapAuthInfo implements Parcelable {
    public static final Parcelable.Creator<MapAuthInfo> CREATOR = new maa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f14258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f14259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f14260c;
    private int d;
    private int e;
    private String f;
    private String g;
    private String h;
    private boolean i;
    private String j;

    class maa implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MapAuthInfo createFromParcel(Parcel parcel) {
            return new MapAuthInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MapAuthInfo[] newArray(int i) {
            return new MapAuthInfo[i];
        }

        maa() {
        }
    }

    public MapAuthInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected MapAuthInfo(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.f14259b = parcelReader.createString(2, "");
        this.f14260c = parcelReader.createString(3, "");
        this.d = parcelReader.readInt(4, 10);
        this.e = parcelReader.readInt(5, 60);
        this.f14258a = parcelReader.readLong(6, 0L);
        this.f = parcelReader.createString(7, "");
        this.g = parcelReader.createString(8, "");
        this.h = parcelReader.createString(9, "");
        this.i = parcelReader.readBoolean(10, true);
        this.j = parcelReader.createString(11, "");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int iBeginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeString(2, this.f14259b, false);
        parcelWrite.writeString(3, this.f14260c, false);
        parcelWrite.writeInt(4, this.d);
        parcelWrite.writeInt(5, this.e);
        parcelWrite.writeLong(6, this.f14258a);
        parcelWrite.writeString(7, this.f, false);
        parcelWrite.writeString(8, this.g, false);
        parcelWrite.writeString(9, this.h, false);
        parcelWrite.writeBoolean(10, this.i);
        parcelWrite.writeString(11, this.j, false);
        parcelWrite.finishObjectHeader(iBeginObjectHeader);
    }

    public MapAuthInfo tomApikey(String str) {
        this.f14260c = str;
        return this;
    }

    public MapAuthInfo startAuthTime(Long l) {
        this.f14258a = l.longValue();
        return this;
    }

    public MapAuthInfo sdkVersion(String str) {
        this.h = str;
        return this;
    }

    public MapAuthInfo requestId(String str) {
        this.g = str;
        return this;
    }

    public MapAuthInfo providerType(String str) {
        this.j = str;
        return this;
    }

    public MapAuthInfo politicalView(String str) {
        this.f = str;
        return this;
    }

    public MapAuthInfo packageFingerprint(int i) {
        this.e = i;
        return this;
    }

    public MapAuthInfo mapApiUsageWaitDuration(int i) {
        this.e = i;
        return this;
    }

    public MapAuthInfo mapApiUsageBatchNum(int i) {
        this.d = i;
        return this;
    }

    public MapAuthInfo isSyncAuth(boolean z) {
        this.i = z;
        return this;
    }

    public MapAuthInfo identifyResult(String str) {
        this.f14259b = str;
        return this;
    }

    public String getTomApikey() {
        return this.f14260c;
    }

    public long getStartAuthTime() {
        return this.f14258a;
    }

    public String getSdkVersion() {
        return this.h;
    }

    public String getRequestId() {
        return this.g;
    }

    public String getProviderType() {
        return this.j;
    }

    public String getPoliticalView() {
        return this.f;
    }

    public boolean getIsSyncAuth() {
        return this.i;
    }

    public String getIidentifyResult() {
        return this.f14259b;
    }

    public int getApiUsageWaitDuration() {
        return this.e;
    }

    public int getApiUsageBatchNum() {
        return this.d;
    }
}
