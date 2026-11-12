package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ReturnCardReasonResponseInfo extends CommonResponseInfo {

    @SerializedName("data")
    private List<ReturnCardReasonInfo> mReturnCardReasonInfoList;

    public static class ReturnCardReasonInfo implements Parcelable {
        public static final Parcelable.Creator<ReturnCardReasonInfo> CREATOR = new Parcelable.Creator<ReturnCardReasonInfo>() { // from class: com.miui.tsmclient.entity.ReturnCardReasonResponseInfo.ReturnCardReasonInfo.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ReturnCardReasonInfo createFromParcel(Parcel parcel) {
                return new ReturnCardReasonInfo(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ReturnCardReasonInfo[] newArray(int i) {
                return new ReturnCardReasonInfo[i];
            }
        };

        @SerializedName("code")
        private String mCode;

        @SerializedName("desc")
        private String mDesc;

        public ReturnCardReasonInfo(Parcel parcel) {
            this.mCode = parcel.readString();
            this.mDesc = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getCode() {
            return this.mCode;
        }

        public String getDesc() {
            return this.mDesc;
        }

        public void setCode(String str) {
            this.mCode = str;
        }

        public void setDesc(String str) {
            this.mDesc = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mCode);
            parcel.writeString(this.mDesc);
        }
    }

    public List<ReturnCardReasonInfo> getReturnCardReasonInfoList() {
        return this.mReturnCardReasonInfoList;
    }
}
