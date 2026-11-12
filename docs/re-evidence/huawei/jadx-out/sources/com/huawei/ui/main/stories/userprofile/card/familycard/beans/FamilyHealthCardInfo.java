package com.huawei.ui.main.stories.userprofile.card.familycard.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.qqt;
import defpackage.vof;
import health.compact.a.LogAnonymous;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class FamilyHealthCardInfo implements Parcelable {
    public static final Parcelable.Creator<FamilyHealthCardInfo> CREATOR = new Parcelable.Creator<FamilyHealthCardInfo>() { // from class: com.huawei.ui.main.stories.userprofile.card.familycard.beans.FamilyHealthCardInfo.5
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public FamilyHealthCardInfo createFromParcel(Parcel parcel) {
            return new FamilyHealthCardInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FamilyHealthCardInfo[] newArray(int i) {
            return new FamilyHealthCardInfo[i];
        }
    };
    private static final String TAG = "FamilyHealthCardInfo";

    @SerializedName("agreeCount")
    private int mAgreeCount;

    @SerializedName("imageMap")
    private String mImageMap;

    @SerializedName("showType")
    private int mShowType;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public FamilyHealthCardInfo() {
        LogUtil.a(TAG, "FamilyHealthCardInfo create");
    }

    protected FamilyHealthCardInfo(Parcel parcel) {
        this.mImageMap = parcel.readString();
        this.mAgreeCount = parcel.readInt();
        this.mShowType = parcel.readInt();
    }

    public String getImageMap() {
        return this.mImageMap;
    }

    public LinkedHashMap<Long, vof> getImageLinkedMap() {
        if (TextUtils.isEmpty(getImageMap()) || "{}".equals(getImageMap())) {
            return new LinkedHashMap<>();
        }
        try {
            return (LinkedHashMap) qqt.c(getImageMap(), new TypeToken<Map<Long, vof>>() { // from class: com.huawei.ui.main.stories.userprofile.card.familycard.beans.FamilyHealthCardInfo.2
            }.getType());
        } catch (JsonSyntaxException | NumberFormatException e) {
            LogUtil.e(TAG, LogAnonymous.b(e));
            return new LinkedHashMap<>();
        }
    }

    public void setImageMap(Map<Long, vof> map) {
        String strB = "";
        if (map == null || map.size() <= 0) {
            setImageMap("");
            return;
        }
        try {
            strB = qqt.b(map);
        } catch (JsonIOException | NullPointerException e) {
            LogUtil.e(TAG, "setImageMap exception ", ExceptionUtils.c(e));
        }
        setImageMap(strB);
    }

    public void setImageMap(String str) {
        this.mImageMap = str;
    }

    public int getShowType() {
        return this.mShowType;
    }

    public void setShowType(int i) {
        this.mShowType = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mImageMap);
        parcel.writeInt(this.mAgreeCount);
        parcel.writeInt(this.mShowType);
    }
}
