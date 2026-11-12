package com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class EversionExcursionAngleAdvice extends RunningPostureAdviceBase {
    public static final Parcelable.Creator<EversionExcursionAngleAdvice> CREATOR = new Parcelable.Creator<EversionExcursionAngleAdvice>() { // from class: com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.EversionExcursionAngleAdvice.5
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public EversionExcursionAngleAdvice createFromParcel(Parcel parcel) {
            return new EversionExcursionAngleAdvice(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EversionExcursionAngleAdvice[] newArray(int i) {
            return new EversionExcursionAngleAdvice[i];
        }
    };
    private static final int LEVEL_NORMAL_END_NUMBER = 25;
    private static final int LEVEL_NORMAL_START_NUMBER = 5;
    private static final String RUNNING_POSTURE_EVERSION_FRAGMENT = "com.huawei.health.suggestion.ui.fragment.EversionExcursionFragment";

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase
    public int judgeLevel(float f) {
        if (f < 5.0f) {
            return 0;
        }
        return f > 25.0f ? 3 : 1;
    }

    public EversionExcursionAngleAdvice(int i) {
        this.mPostureId = 8;
        initData(i);
    }

    protected EversionExcursionAngleAdvice(Parcel parcel) {
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
        this.mActionList.add("117B");
        this.mActionList.add("118B");
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase
    public String getText() {
        return BaseApplication.getContext().getResources().getString(R.string.IDS_sport_noun_explain_paobuzhitai_waifanfudu_title);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase
    public String getRunningPostureFragment() {
        return RUNNING_POSTURE_EVERSION_FRAGMENT;
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

    @Override // com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase
    public void judgeAdvices(int i) {
        super.judgeAdvices(i);
        this.mLevelLongTip = R.string.IDS_hwh_eversion_excursion_normal;
        if (i == 0) {
            this.mLevelShortTip = R.string.IDS_hwh_runningstyle_smaller;
            this.mAdvice = R.string.IDS_hwh_ankle_recommendation;
        } else if (i == 1) {
            this.mLevelShortTip = R.string.IDS_hw_health_blood_oxygen_normal;
            this.mAdvice = R.string.IDS_hwh_eversion_recommendation;
        } else {
            this.mLevelShortTip = R.string.IDS_hwh_runningstyle_larger;
            this.mAdvice = R.string.IDS_hwh_stable_sneakers_recommendation;
        }
    }
}
