package com.ximalaya.ting.android.opensdk.model.advertis;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.ximalaya.ting.android.opensdk.datatrasfer.XimalayaResponse;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class AdvertisList extends XimalayaResponse implements Parcelable {
    public static final Parcelable.Creator<AdvertisList> CREATOR = new Parcelable.Creator<AdvertisList>() { // from class: com.ximalaya.ting.android.opensdk.model.advertis.AdvertisList.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AdvertisList createFromParcel(Parcel parcel) {
            AdvertisList advertisList = new AdvertisList();
            advertisList.readFromParcel(parcel);
            return advertisList;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AdvertisList[] newArray(int i) {
            return new AdvertisList[i];
        }
    };

    @SerializedName("data")
    private List<Advertis> advertisList;
    private boolean duringPlay;
    private String msg;
    private long responseId;
    private int ret = -2;
    private int source;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<Advertis> getAdvertisList() {
        return this.advertisList;
    }

    public String getMsg() {
        return this.msg;
    }

    public long getResponseId() {
        return this.responseId;
    }

    public int getRet() {
        return this.ret;
    }

    public int getSource() {
        return this.source;
    }

    public boolean isDuringPlay() {
        return this.duringPlay;
    }

    public void readFromParcel(Parcel parcel) {
        setResponseId(parcel.readLong());
        setRet(parcel.readInt());
        setSource(parcel.readInt());
        setMsg(parcel.readString());
        if (parcel.readInt() > 0) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, Advertis.class.getClassLoader());
            setAdvertisList(arrayList);
        }
        setDuringPlay(parcel.readInt() == 1);
    }

    public void setAdvertisList(List<Advertis> list) {
        this.advertisList = list;
    }

    public void setDuringPlay(boolean z) {
        this.duringPlay = z;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setResponseId(long j) {
        this.responseId = j;
    }

    public void setRet(int i) {
        this.ret = i;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public String toString() {
        return "AdvertisList [advertisList=" + this.advertisList + ", ret=" + this.ret + ", msg=" + this.msg + ", source=" + this.source + ", responseId=" + this.responseId + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.responseId);
        parcel.writeInt(this.ret);
        parcel.writeInt(this.source);
        parcel.writeString(this.msg);
        List<Advertis> list = this.advertisList;
        int size = list == null ? 0 : list.size();
        parcel.writeInt(size);
        if (size > 0) {
            parcel.writeList(this.advertisList);
        }
        parcel.writeInt(this.duringPlay ? 1 : 0);
    }
}
