package com.huawei.watchface.mvp.model.datatype;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.utils.HwLog;

/* JADX INFO: loaded from: classes20.dex */
public class WatchResourcesInfo implements Parcelable {
    public static final Parcelable.Creator<WatchResourcesInfo> CREATOR = new Parcelable.Creator<WatchResourcesInfo>() { // from class: com.huawei.watchface.mvp.model.datatype.WatchResourcesInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WatchResourcesInfo createFromParcel(Parcel parcel) {
            return new WatchResourcesInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WatchResourcesInfo[] newArray(int i) {
            return new WatchResourcesInfo[i];
        }
    };
    private static final String TAG = "WatchResourcesInfo";
    public static final int VIP_FREE_MARKER = 5;
    private int mFailedNum;
    private boolean mIsVipFreeWatchFace = false;
    private String mMemberSignature;
    private String mWatchBrief;
    private int mWatchExpandType;
    private String mWatchId;
    private String mWatchName;
    private String mWatchScreen;
    private int mWatchSize;
    private int mWatchType;
    private String mWatchVersion;
    private String mWatchfaceSignature;
    private int mWatchfaceTag;

    public WatchResourcesInfo() {
    }

    public static boolean isNumeric(String str) {
        return str != null && str.matches("[0-9.]+");
    }

    public static String markDownHiTopId(String str) {
        int i;
        if (str == null || str.isEmpty()) {
            return str;
        }
        String strSubstring = SafeString.substring(str, 0, 1);
        if (!isNumeric(strSubstring) || (i = Integer.parseInt(strSubstring)) <= 5) {
            return str;
        }
        return (i - 5) + SafeString.substring(str, 1);
    }

    public static String markUpHiTopId(String str) {
        int i;
        if (str == null || str.isEmpty()) {
            return str;
        }
        if (!HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).memberSignatureIsNeedMarkUp(str)) {
            HwLog.e(TAG, "markUpHiTopId -- isSupportMemberSignature true");
            return str;
        }
        String strSubstring = SafeString.substring(str, 0, 1);
        if (!isNumeric(strSubstring) || (i = Integer.parseInt(strSubstring)) >= 5) {
            return str;
        }
        return (i + 5) + SafeString.substring(str, 1);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getFailedNum() {
        return this.mFailedNum;
    }

    public String getMemberSignature() {
        return this.mMemberSignature;
    }

    public int getWatchExpandType() {
        return this.mWatchExpandType;
    }

    public String getWatchInfoBrief() {
        return this.mWatchBrief;
    }

    public String getWatchInfoId() {
        return this.mWatchId;
    }

    public String getWatchInfoName() {
        return this.mWatchName;
    }

    public int getWatchInfoSize() {
        return this.mWatchSize;
    }

    public int getWatchInfoType() {
        return this.mWatchType;
    }

    public String getWatchInfoVersion() {
        return this.mWatchVersion;
    }

    public String getWatchScreen() {
        return this.mWatchScreen;
    }

    public String getWatchfaceSignature() {
        return this.mWatchfaceSignature;
    }

    public int getWatchfaceTag() {
        return this.mWatchfaceTag;
    }

    public boolean isVipFreeWatchFace() {
        return this.mIsVipFreeWatchFace;
    }

    public String markDownVipFreeWatchFace(String str) {
        String strMarkDownHiTopId = markDownHiTopId(str);
        setVipFreeWatchFace(!strMarkDownHiTopId.equals(str));
        return strMarkDownHiTopId;
    }

    public String markUpVipFreeWatchFace(String str) {
        return !this.mIsVipFreeWatchFace ? str : markUpHiTopId(str);
    }

    public void setFailedNum(int i) {
        this.mFailedNum = i;
    }

    public void setMemberSignature(String str) {
        this.mMemberSignature = str;
    }

    public void setVipFreeWatchFace(boolean z) {
        this.mIsVipFreeWatchFace = z;
    }

    public void setWatchExpandType(int i) {
        this.mWatchExpandType = i;
    }

    public void setWatchInfoBrief(String str) {
        this.mWatchBrief = str;
    }

    public void setWatchInfoId(String str) {
        this.mWatchId = str;
    }

    public void setWatchInfoName(String str) {
        this.mWatchName = str;
    }

    public void setWatchInfoSize(int i) {
        this.mWatchSize = i;
    }

    public void setWatchInfoType(int i) {
        this.mWatchType = i;
    }

    public void setWatchInfoVersion(String str) {
        this.mWatchVersion = str;
    }

    public void setWatchScreen(String str) {
        this.mWatchScreen = str;
    }

    public void setWatchfaceSignature(String str) {
        this.mWatchfaceSignature = str;
    }

    public void setWatchfaceTag(int i) {
        this.mWatchfaceTag = i;
        if (!this.mIsVipFreeWatchFace && HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).isSupportMemberSignature()) {
            boolean z = true;
            if (i != 1 && i != 2) {
                z = false;
            }
            setVipFreeWatchFace(z);
        }
    }

    public String toString() {
        return "WatchResourcesInfo{WatchInfo_Id=" + this.mWatchId + ", WatchInfo_Version=" + this.mWatchVersion + ", WatchInfo_Type=" + this.mWatchType + ", WatchInfo_Name=" + this.mWatchName + ", WatchInfo_Brief=" + this.mWatchBrief + ", WatchInfo_Size=" + this.mWatchSize + ", mFailedNum=" + this.mFailedNum + ", mWatchScreen=" + this.mWatchScreen + ", mWatchExpandType=" + this.mWatchExpandType + ", mWatchfaceTag=" + this.mWatchfaceTag + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mWatchId);
        parcel.writeString(this.mWatchVersion);
        parcel.writeInt(this.mWatchType);
        parcel.writeString(this.mWatchName);
        parcel.writeString(this.mWatchBrief);
        parcel.writeInt(this.mWatchSize);
        parcel.writeInt(this.mFailedNum);
        parcel.writeString(this.mWatchScreen);
        parcel.writeInt(this.mWatchExpandType);
        parcel.writeString(this.mWatchfaceSignature);
        parcel.writeInt(this.mWatchfaceTag);
    }

    public WatchResourcesInfo(Parcel parcel) {
        this.mWatchId = parcel.readString();
        this.mWatchVersion = parcel.readString();
        this.mWatchType = parcel.readInt();
        this.mWatchName = parcel.readString();
        this.mWatchBrief = parcel.readString();
        this.mWatchSize = parcel.readInt();
        this.mFailedNum = parcel.readInt();
        this.mWatchScreen = parcel.readString();
        this.mWatchExpandType = parcel.readInt();
        this.mWatchfaceSignature = parcel.readString();
        this.mWatchfaceTag = parcel.readInt();
    }
}
