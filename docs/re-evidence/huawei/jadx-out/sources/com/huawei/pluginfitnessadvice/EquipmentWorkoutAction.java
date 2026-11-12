package com.huawei.pluginfitnessadvice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class EquipmentWorkoutAction implements Parcelable {
    public static final Parcelable.Creator<EquipmentWorkoutAction> CREATOR = new Parcelable.Creator<EquipmentWorkoutAction>() { // from class: com.huawei.pluginfitnessadvice.EquipmentWorkoutAction.5
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public EquipmentWorkoutAction createFromParcel(Parcel parcel) {
            return new EquipmentWorkoutAction(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EquipmentWorkoutAction[] newArray(int i) {
            return new EquipmentWorkoutAction[i];
        }
    };
    private static final String TAG = "Fitness_EquipmentWorkoutAction";

    @SerializedName("equipmentType")
    private int mEquipmentType;

    @SerializedName("stageList")
    private List<EquipmentStage> mStageList;

    @SerializedName("videos")
    private List<EquipmentActionVideo> mVideoList;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected EquipmentWorkoutAction(Parcel parcel) {
        if (parcel == null) {
            LogUtil.j(TAG, "EquipmentWorkoutAction in == null");
            return;
        }
        this.mEquipmentType = parcel.readInt();
        this.mVideoList = parcel.createTypedArrayList(EquipmentActionVideo.CREATOR);
        this.mStageList = parcel.createTypedArrayList(EquipmentStage.CREATOR);
    }

    private EquipmentWorkoutAction(a aVar) {
        this.mEquipmentType = aVar.f22320a;
        this.mVideoList = aVar.e;
        this.mStageList = aVar.d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            LogUtil.j(TAG, "writeToParcel dest == null");
            return;
        }
        parcel.writeInt(this.mEquipmentType);
        parcel.writeTypedList(this.mVideoList);
        parcel.writeTypedList(this.mStageList);
    }

    /* JADX INFO: loaded from: classes41.dex */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f22320a;
        private List<EquipmentStage> d;
        private List<EquipmentActionVideo> e;
    }

    public int getEquipmentType() {
        return this.mEquipmentType;
    }

    public List<EquipmentActionVideo> getVideoList() {
        return this.mVideoList;
    }

    public List<EquipmentStage> getStageList() {
        return this.mStageList;
    }
}
