package com.huawei.pluginfitnessadvice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class EquipmentActionVideo implements Parcelable {
    public static final Parcelable.Creator<EquipmentActionVideo> CREATOR = new Parcelable.Creator<EquipmentActionVideo>() { // from class: com.huawei.pluginfitnessadvice.EquipmentActionVideo.5
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EquipmentActionVideo createFromParcel(Parcel parcel) {
            return new EquipmentActionVideo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public EquipmentActionVideo[] newArray(int i) {
            return new EquipmentActionVideo[i];
        }
    };
    private static final String TAG = "Fitness_EquipmentActionVideo";

    @SerializedName(RecommendConstants.FILE_ID)
    private String mFieldId;

    @SerializedName("smartScreenImgUrl")
    private String mSmartScreenImgUrl;

    @SerializedName("videoSegmentList")
    private List<VideoSegment> mVideoSegmentList;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private EquipmentActionVideo(e eVar) {
        this.mFieldId = eVar.f22317b;
        this.mVideoSegmentList = eVar.f22316a;
        this.mSmartScreenImgUrl = eVar.f22318c;
    }

    protected EquipmentActionVideo(Parcel parcel) {
        if (parcel == null) {
            LogUtil.j(TAG, "EquipmentActionVideo in == null");
            return;
        }
        this.mFieldId = parcel.readString();
        this.mVideoSegmentList = parcel.createTypedArrayList(VideoSegment.CREATOR);
        this.mSmartScreenImgUrl = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            LogUtil.j(TAG, "writeToParcel dest == null");
            return;
        }
        parcel.writeString(this.mFieldId);
        parcel.writeTypedList(this.mVideoSegmentList);
        parcel.writeString(this.mSmartScreenImgUrl);
    }

    /* JADX INFO: loaded from: classes41.dex */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<VideoSegment> f22316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f22317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f22318c;
    }

    public String getFieldId() {
        return this.mFieldId;
    }

    public List<VideoSegment> getVideoSegmentList() {
        return this.mVideoSegmentList;
    }

    public String getSmartScreenImgUrl() {
        return this.mSmartScreenImgUrl;
    }
}
