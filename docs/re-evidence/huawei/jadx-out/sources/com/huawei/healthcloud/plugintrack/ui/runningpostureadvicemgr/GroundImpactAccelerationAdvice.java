package com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class GroundImpactAccelerationAdvice extends RunningPostureAdviceBase {
    public static final Parcelable.Creator<GroundImpactAccelerationAdvice> CREATOR = new Parcelable.Creator<GroundImpactAccelerationAdvice>() { // from class: com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.GroundImpactAccelerationAdvice.3
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public GroundImpactAccelerationAdvice createFromParcel(Parcel parcel) {
            return new GroundImpactAccelerationAdvice(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public GroundImpactAccelerationAdvice[] newArray(int i) {
            return new GroundImpactAccelerationAdvice[i];
        }
    };
    private static final int GROUND_IMPACT_ACCELERATION_LEVEL_NORMAL = 20;
    private static final String RUNNING_POSTURE_LANDING_FRAGMENT = "com.huawei.health.suggestion.ui.fragment.LandingImpactFragment";

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase
    public int judgeLevel(float f) {
        return f <= 20.0f ? 1 : 3;
    }

    public GroundImpactAccelerationAdvice(int i) {
        this.mPostureId = 11;
        initData(i);
    }

    protected GroundImpactAccelerationAdvice(Parcel parcel) {
        if (parcel == null) {
            throw new RuntimeException("Invaild input");
        }
        this.mValue = parcel.readFloat();
        this.mLevel = parcel.readInt();
        this.mLevelShortTip = parcel.readInt();
        this.mLevelLongTip = parcel.readInt();
        this.mAdvice = parcel.readInt();
        this.mActionList = parcel.createStringArrayList();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase
    public void initActionList() {
        this.mActionList = new ArrayList(2);
        this.mActionList.add("018B");
        this.mActionList.add("001B");
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase
    public String getText() {
        return BaseApplication.getContext().getResources().getString(R.string.IDS_running_posture_ground_impact_acceleration);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase
    public String getRunningPostureFragment() {
        return RUNNING_POSTURE_LANDING_FRAGMENT;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase
    public void judgeAdvices(int i) {
        super.judgeAdvices(i);
        if (i == 1) {
            this.mLevelShortTip = R.string.IDS_details_sleep_grade_normal;
            this.mLevelLongTip = R.string.IDS_hwh_landing_impact_improve;
            this.mAdvice = R.string.IDS_hwh_lower_limb_training_recommendation;
        } else {
            this.mLevelShortTip = R.string.IDS_hwh_runningstyle_larger;
            this.mLevelLongTip = R.string.IDS_sport_noun_explain_paobuzhitai_zhuodichongji_greater_title;
            this.mAdvice = R.string.IDS_hwh_move_softly_recommendation;
        }
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
        parcel.writeStringList(this.mActionList);
    }
}
