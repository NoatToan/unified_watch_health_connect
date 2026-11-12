package com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class GroundTouchdownBalanceAdvice extends RunningPostureAdviceBase {
    public static final Parcelable.Creator<GroundTouchdownBalanceAdvice> CREATOR = new Parcelable.Creator<GroundTouchdownBalanceAdvice>() { // from class: com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.GroundTouchdownBalanceAdvice.5
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public GroundTouchdownBalanceAdvice createFromParcel(Parcel parcel) {
            return new GroundTouchdownBalanceAdvice(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public GroundTouchdownBalanceAdvice[] newArray(int i) {
            return new GroundTouchdownBalanceAdvice[i];
        }
    };
    public static final float GROUND_TOUCHDOWN_BALANCE_LEVEL_LEFT_LITTLE_LONG = 50.5f;
    public static final float GROUND_TOUCHDOWN_BALANCE_LEVEL_LEFT_LONG = 51.5f;
    public static final float GROUND_TOUCHDOWN_BALANCE_LEVEL_RIGHT_LITTLE_LONG = 49.5f;
    public static final float GROUND_TOUCHDOWN_BALANCE_LEVEL_RIGHT_LONG = 48.5f;
    private static final String RUNNING_POSTURE_GCTIME_FRAGMENT = "com.huawei.health.suggestion.ui.fragment.GCTimeBalanceFragment";

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public GroundTouchdownBalanceAdvice(float f) {
        this.mPostureId = 3;
        initData(f);
    }

    protected GroundTouchdownBalanceAdvice(Parcel parcel) {
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
        if (f > 51.5f || f < 48.5f) {
            return -1;
        }
        return (Float.compare(f, 49.5f) < 0 || Float.compare(f, 50.5f) >= 0) ? 0 : 1;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase
    public void initActionList() {
        this.mActionList = new ArrayList(3);
        this.mActionList.add("030B");
        this.mActionList.add("025B");
        this.mActionList.add("023B");
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase
    public String getText() {
        return BaseApplication.getContext().getResources().getString(R.string.IDS_bolt_balance_left_right_touches);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase
    public String getRunningPostureFragment() {
        return RUNNING_POSTURE_GCTIME_FRAGMENT;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase
    public void judgeAdvices(int i) {
        super.judgeAdvices(i);
        this.mAdvice = R.string.IDS_hwh_touch_down_balance_recommendation;
        this.mDescription = R.string.IDS_hwh_touch_down_balance_description;
        this.mLevelLongTip = R.string.IDS_bolt_balance_touches_left_and_right;
        if (this.mValue > 51.5f) {
            this.mLevelShortTip = R.string.IDS_bolt_balance_severely_long_left_side;
            return;
        }
        if (Float.compare(this.mValue, 50.5f) >= 0) {
            this.mLevelShortTip = R.string.IDS_bolt_balance_slightly_long_on_the_left;
            return;
        }
        if (Float.compare(this.mValue, 49.5f) >= 0) {
            this.mLevelShortTip = R.string.IDS_bolt_balance_left_and_right;
        } else if (Float.compare(this.mValue, 48.5f) >= 0) {
            this.mLevelShortTip = R.string.IDS_bolt_balance_slightly_long_on_the_right;
        } else {
            this.mLevelShortTip = R.string.IDS_bolt_balance_severely_long_right_side;
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
        parcel.writeInt(this.mDescription);
        parcel.writeStringList(this.mActionList);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase
    public float getValue() {
        return this.mValue;
    }
}
