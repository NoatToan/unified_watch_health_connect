package com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class SwingAngleAdvice extends RunningPostureAdviceBase {
    public static final Parcelable.Creator<SwingAngleAdvice> CREATOR = new Parcelable.Creator<SwingAngleAdvice>() { // from class: com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.SwingAngleAdvice.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SwingAngleAdvice createFromParcel(Parcel parcel) {
            return new SwingAngleAdvice(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SwingAngleAdvice[] newArray(int i) {
            return new SwingAngleAdvice[i];
        }
    };
    private static final int MAX_SMALL_SWING_ANGLE = 70;
    private static final int MAX_SMALL_SWING_ANGLE_SPEED = 10;
    private static final int MIN_LARGE_SWING_ANGLE = 140;
    private static final int MIN_LARGE_SWING_ANGLE_SPEED = 14;
    private static final String RUNNING_POSTURE_SWING_FRAGMENT = "com.huawei.health.suggestion.ui.fragment.SwingAngleFragment";

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase
    public int judgeLevel(float f) {
        return 1;
    }

    public SwingAngleAdvice(int i, float f) {
        initData(i, f);
    }

    protected SwingAngleAdvice(Parcel parcel) {
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

    private void initData(int i, float f) {
        this.mPostureId = 9;
        this.mValue = i;
        if (i < 70 && f > 10.0f) {
            this.mLevel = 0;
        } else if (i > MIN_LARGE_SWING_ANGLE && f < 14.0f) {
            this.mLevel = 3;
        } else {
            this.mLevel = 1;
        }
        initActionList();
        judgeAdvices(this.mLevel);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase
    public void initActionList() {
        this.mActionList = new ArrayList(2);
        this.mActionList.add("028B");
        this.mActionList.add("127B");
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase
    public String getText() {
        return BaseApplication.getContext().getResources().getString(R.string.IDS_sport_noun_explain_paobuzhitai_baidongjiaodu_title);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase
    public String getRunningPostureFragment() {
        return RUNNING_POSTURE_SWING_FRAGMENT;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase
    public void judgeAdvices(int i) {
        super.judgeAdvices(i);
        this.mLevelLongTip = R.string.IDS_hwh_swing_angle_normal;
        if (i == 0) {
            this.mLevelShortTip = R.string.IDS_hwh_runningstyle_smaller;
            this.mAdvice = R.string.IDS_hwh_leg_folding_recommendation;
        } else if (i == 1) {
            this.mLevelShortTip = R.string.IDS_details_sleep_grade_normal;
            this.mAdvice = R.string.IDS_hwh_running_leg_folding;
        } else {
            this.mLevelShortTip = R.string.IDS_hwh_runningstyle_larger;
            this.mAdvice = R.string.IDS_hwh_swing_angle_recommendation;
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
