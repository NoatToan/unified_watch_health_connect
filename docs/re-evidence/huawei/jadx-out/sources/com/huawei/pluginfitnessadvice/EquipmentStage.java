package com.huawei.pluginfitnessadvice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class EquipmentStage implements Parcelable {
    public static final Parcelable.Creator<EquipmentStage> CREATOR = new Parcelable.Creator<EquipmentStage>() { // from class: com.huawei.pluginfitnessadvice.EquipmentStage.5
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public EquipmentStage createFromParcel(Parcel parcel) {
            return new EquipmentStage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public EquipmentStage[] newArray(int i) {
            return new EquipmentStage[i];
        }
    };
    private static final String TAG = "Fitness_EquipmentStage";

    @SerializedName("actionList")
    private List<EquipmentAction> mActionList;

    @SerializedName("stageName")
    private String mStageName;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected EquipmentStage(Parcel parcel) {
        if (parcel == null) {
            LogUtil.j(TAG, "EquipmentStage in == null");
        } else {
            this.mStageName = parcel.readString();
            this.mActionList = parcel.createTypedArrayList(EquipmentAction.CREATOR);
        }
    }

    private EquipmentStage(c cVar) {
        this.mStageName = cVar.e;
        this.mActionList = cVar.f22319c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            LogUtil.j(TAG, "writeToParcel dest == null");
        } else {
            parcel.writeString(this.mStageName);
            parcel.writeTypedList(this.mActionList);
        }
    }

    /* JADX INFO: loaded from: classes41.dex */
    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<EquipmentAction> f22319c;
        private String e;
    }

    public String getStageName() {
        return this.mStageName;
    }

    public List<EquipmentAction> getActionList() {
        return this.mActionList;
    }
}
