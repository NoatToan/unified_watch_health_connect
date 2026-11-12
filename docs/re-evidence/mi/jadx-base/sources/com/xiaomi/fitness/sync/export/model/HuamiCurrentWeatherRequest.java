package com.xiaomi.fitness.sync.export.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes10.dex */
public class HuamiCurrentWeatherRequest implements Parcelable {
    public static final Parcelable.Creator<HuamiCurrentWeatherRequest> CREATOR = new Parcelable.Creator<HuamiCurrentWeatherRequest>() { // from class: com.xiaomi.fitness.sync.export.model.HuamiCurrentWeatherRequest.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HuamiCurrentWeatherRequest createFromParcel(Parcel parcel) {
            return new HuamiCurrentWeatherRequest(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HuamiCurrentWeatherRequest[] newArray(int i) {
            return new HuamiCurrentWeatherRequest[i];
        }
    };

    @SerializedName("locationKey")
    public String locationKey;

    public HuamiCurrentWeatherRequest() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.locationKey);
    }

    public HuamiCurrentWeatherRequest(String str) {
        this.locationKey = str;
    }

    public HuamiCurrentWeatherRequest(Parcel parcel) {
        this.locationKey = parcel.readString();
    }
}
