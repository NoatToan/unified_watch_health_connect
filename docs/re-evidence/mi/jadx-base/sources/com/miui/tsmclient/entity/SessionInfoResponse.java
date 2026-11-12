package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class SessionInfoResponse implements Parcelable {
    public static final Parcelable.Creator<SessionInfoResponse> CREATOR = new Parcelable.Creator<SessionInfoResponse>() { // from class: com.miui.tsmclient.entity.SessionInfoResponse.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SessionInfoResponse createFromParcel(Parcel parcel) {
            return new SessionInfoResponse(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SessionInfoResponse[] newArray(int i) {
            return new SessionInfoResponse[i];
        }
    };

    @SerializedName("sessionId")
    private String mSessionId;

    public SessionInfoResponse() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getSessionId() {
        return this.mSessionId;
    }

    public void setSessionId(String str) {
        this.mSessionId = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mSessionId);
    }

    public SessionInfoResponse(Parcel parcel) {
        this.mSessionId = parcel.readString();
    }
}
