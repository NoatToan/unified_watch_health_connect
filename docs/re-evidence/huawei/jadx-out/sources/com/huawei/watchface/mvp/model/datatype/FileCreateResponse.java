package com.huawei.watchface.mvp.model.datatype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.healthcloud.plugintrack.offlinemap.ui.view.CityListBean;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class FileCreateResponse implements Parcelable {
    public static final Parcelable.Creator<FileCreateResponse> CREATOR = new Parcelable.Creator<FileCreateResponse>() { // from class: com.huawei.watchface.mvp.model.datatype.FileCreateResponse.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FileCreateResponse createFromParcel(Parcel parcel) {
            return new FileCreateResponse(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FileCreateResponse[] newArray(int i) {
            return new FileCreateResponse[i];
        }
    };
    private String createdNums;
    private List<MaterialFileUploadInfo> materialFileUploadInfo;
    private String maxNums;

    @SerializedName("resultcode")
    private int resultCode;

    @SerializedName("resultinfo")
    private String resultInfo;

    public FileCreateResponse(Parcel parcel) {
        this.resultInfo = parcel.readString();
        this.resultCode = parcel.readInt();
        this.createdNums = parcel.readString();
        this.maxNums = parcel.readString();
        this.materialFileUploadInfo = createTypedArrayList(MaterialFileUploadInfo.CREATOR, parcel);
    }

    private final <T> ArrayList<T> createTypedArrayList(Parcelable.Creator<T> creator, Parcel parcel) {
        int i = parcel.readInt();
        if (i < 0) {
            return null;
        }
        if (i >= 1024) {
            i = 1024;
        }
        CityListBean cityListBean = (ArrayList<T>) new ArrayList(i);
        while (i > 0) {
            cityListBean.add(parcel.readTypedObject(creator));
            i--;
        }
        return cityListBean;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCreatedNums() {
        return this.createdNums;
    }

    public List<MaterialFileUploadInfo> getMaterialFileUploadInfo() {
        return this.materialFileUploadInfo;
    }

    public String getMaxNums() {
        return this.maxNums;
    }

    public int getResultCode() {
        return this.resultCode;
    }

    public String getResultInfo() {
        return this.resultInfo;
    }

    public void setCreatedNums(String str) {
        this.createdNums = str;
    }

    public void setMaterialFileUploadInfo(List<MaterialFileUploadInfo> list) {
        this.materialFileUploadInfo = list;
    }

    public void setMaxNums(String str) {
        this.maxNums = str;
    }

    public void setResultCode(int i) {
        this.resultCode = i;
    }

    public void setResultInfo(String str) {
        this.resultInfo = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.resultInfo);
        parcel.writeInt(this.resultCode);
        parcel.writeString(this.createdNums);
        parcel.writeString(this.maxNums);
        List<MaterialFileUploadInfo> list = this.materialFileUploadInfo;
        if (list != null) {
            parcel.writeTypedList(list.size() <= 1024 ? this.materialFileUploadInfo : null);
        } else {
            parcel.writeTypedList(null);
        }
    }
}
