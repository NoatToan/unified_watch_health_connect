package com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class GroundImpactLoadRateAdvice extends RunningPostureAdviceBase {
    public static final Parcelable.Creator<GroundImpactLoadRateAdvice> CREATOR = new Parcelable.Creator<GroundImpactLoadRateAdvice>() { // from class: com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.GroundImpactLoadRateAdvice.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public GroundImpactLoadRateAdvice createFromParcel(Parcel parcel) {
            return new GroundImpactLoadRateAdvice(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GroundImpactLoadRateAdvice[] newArray(int i) {
            return new GroundImpactLoadRateAdvice[i];
        }
    };
    public static final int GROUND_IMPACT_LOAD_RATE_LEVEL_EXCELLENT = 50;
    public static final int GROUND_IMPACT_LOAD_RATE_LEVEL_NORMAL = 150;
    private static final String RUNNING_POSTURE_LOADING_FRAGMENT = "com.huawei.health.suggestion.ui.fragment.VerticalLoadingRateFragment";

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase
    protected int getColor(int i) {
        if (i != 1) {
            return i != 3 ? RunningPostureAdviceBase.COLOR_SUBOPTIMAL : RunningPostureAdviceBase.COLOR_EXCELLENT;
        }
        return RunningPostureAdviceBase.COLOR_NORMAL;
    }

    public GroundImpactLoadRateAdvice(float f) {
        this.mPostureId = 7;
        initData(f);
    }

    protected GroundImpactLoadRateAdvice(Parcel parcel) {
        if (parcel != null) {
            this.mValue = parcel.readFloat();
            this.mLevel = parcel.readInt();
            this.mLevelShortTip = parcel.readInt();
            this.mLevelLongTip = parcel.readInt();
            this.mAdvice = parcel.readInt();
            this.mDescription = parcel.readInt();
            this.mActionList = parcel.createStringArrayList();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase
    public void judgeAdvices(int i) {
        super.judgeAdvices(i);
        this.mLevelLongTip = R.string.IDS_bolt_peak_impact_rate_level_normal;
        this.mAdvice = R.string.IDS_bolt_average_peak_impact_rate_recommendation;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase
    public int judgeLevel(float f) {
        if (f < 50.0f) {
            return 3;
        }
        return Float.compare(f, 150.0f) <= 0 ? 1 : 0;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase
    public void initActionList() {
        this.mActionList = new ArrayList(3);
        this.mActionList.add("118B");
        this.mActionList.add("117B");
        this.mActionList.add("001B");
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase
    public String getText() {
        return BaseApplication.getContext().getResources().getString(R.string.IDS_bolt_peak_impact_rate);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase
    public String getRunningPostureFragment() {
        return RUNNING_POSTURE_LOADING_FRAGMENT;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            return;
        }
        parcel.writeFloat(this.mValue);
        parcel.writeInt(this.mLevel);
        parcel.writeInt(this.mLevelShortTip);
        parcel.writeInt(this.mLevelLongTip);
        parcel.writeInt(this.mAdvice);
        parcel.writeInt(this.mDescription);
        parcel.writeStringList(this.mActionList);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase
    public float getValue() {
        return this.mValue;
    }
}
