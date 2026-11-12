package com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class GroundShockPeakAdvice extends RunningPostureAdviceBase {
    public static final Parcelable.Creator<GroundShockPeakAdvice> CREATOR = new Parcelable.Creator<GroundShockPeakAdvice>() { // from class: com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.GroundShockPeakAdvice.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GroundShockPeakAdvice createFromParcel(Parcel parcel) {
            return new GroundShockPeakAdvice(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GroundShockPeakAdvice[] newArray(int i) {
            return new GroundShockPeakAdvice[i];
        }
    };
    public static final float GROUND_SHOCK_PEAK_LEVEL_EXCELLENT = 2.0f;
    public static final float GROUND_SHOCK_PEAK_LEVEL_NORMAL = 3.0f;
    private static final String RUNNING_POSTURE_ACTIVE_FRAGMENT = "com.huawei.health.suggestion.ui.fragment.ActivePeakFragment";

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

    public GroundShockPeakAdvice(float f) {
        this.mPostureId = 6;
        initData(f);
    }

    protected GroundShockPeakAdvice(Parcel parcel) {
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
    public int judgeLevel(float f) {
        if (f < 2.0f) {
            return 3;
        }
        return Float.compare(f, 3.0f) <= 0 ? 1 : 0;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase
    public void initActionList() {
        this.mActionList = new ArrayList(3);
        this.mActionList.add("018B");
        this.mActionList.add("001B");
        this.mActionList.add("030B");
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase
    public String getText() {
        return BaseApplication.getContext().getResources().getString(R.string.IDS_bolt_shock_peak);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase
    public String getRunningPostureFragment() {
        return RUNNING_POSTURE_ACTIVE_FRAGMENT;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase
    public void judgeAdvices(int i) {
        super.judgeAdvices(i);
        this.mAdvice = R.string.IDS_hwh_shock_peak_recommendation;
        this.mLevelLongTip = R.string.IDS_bolt_shock_peak_level_normal;
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
