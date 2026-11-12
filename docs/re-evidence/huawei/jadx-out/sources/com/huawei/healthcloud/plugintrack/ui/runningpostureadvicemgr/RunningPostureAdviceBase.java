package com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr;

import android.os.Parcelable;
import com.huawei.health.servicesapi.R;
import com.huawei.healthcloud.plugintrack.model.PostureJudgeBean;
import com.huawei.healthcloud.plugintrack.model.SportDetailChartDataType;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public abstract class RunningPostureAdviceBase implements Parcelable {
    public static final int COLOR_EXCELLENT = -10575361;
    public static final int COLOR_GOOD = -14445916;
    public static final int COLOR_NORMAL = -10175652;
    public static final int COLOR_POORER = -2539198;
    public static final int COLOR_SUBOPTIMAL = -26624;
    public static final int LEVEL_EXCELLENT = 3;
    public static final int LEVEL_GOOD = 2;
    public static final int LEVEL_NORMAL = 1;
    public static final int LEVEL_POORER = -1;
    public static final int LEVEL_SUBOPTIMAL = 0;
    protected List<String> mActionList;
    protected int mAdvice;
    protected int mDescription;
    protected int mLevel;
    protected int mLevelLongTip;
    protected int mLevelShortTip;
    protected int mPostureId;
    protected float mValue;

    protected int getColor(int i) {
        if (i == 0) {
            return COLOR_SUBOPTIMAL;
        }
        if (i == 1) {
            return COLOR_NORMAL;
        }
        if (i != 2) {
            return i != 3 ? COLOR_POORER : COLOR_EXCELLENT;
        }
        return COLOR_GOOD;
    }

    public abstract String getRunningPostureFragment();

    public abstract String getText();

    public abstract void initActionList();

    protected void initData(float f, int i, List<PostureJudgeBean> list, SportDetailChartDataType sportDetailChartDataType) {
    }

    public int judgeLevel(float f) {
        return 0;
    }

    protected void initData(float f) {
        this.mValue = f;
        this.mLevel = judgeLevel(f);
        initActionList();
        judgeAdvices(this.mLevel);
    }

    public int acquireLevel() {
        return this.mLevel;
    }

    public int acquireLevelShortTip() {
        return this.mLevelShortTip;
    }

    public int acquireLevelLongTip() {
        return this.mLevelLongTip;
    }

    public int acquireDescription() {
        return this.mDescription;
    }

    public int acquireAdvice() {
        return this.mAdvice;
    }

    public List<String> acquireActionList() {
        return this.mActionList;
    }

    public int[] acquireValueList() {
        return new int[]{(int) this.mValue};
    }

    public void judgeAdvices(int i) {
        if (i == -1) {
            this.mLevelShortTip = R.string.IDS_posture_range_description_poor;
            return;
        }
        if (i == 0) {
            this.mLevelShortTip = R.string.IDS_posture_range_description_suboptimal;
            return;
        }
        if (i == 1) {
            this.mLevelShortTip = R.string.IDS_posture_range_description_normal;
            return;
        }
        if (i == 2) {
            this.mLevelShortTip = R.string.IDS_posture_range_description_good;
        } else if (i == 3) {
            this.mLevelShortTip = R.string.IDS_posture_range_description_excellent;
        } else {
            this.mLevelShortTip = R.string.IDS_posture_range_description_normal;
        }
    }

    public void judgeAdvicesNewVersion(int i) {
        if (i == -1) {
            this.mLevelShortTip = R.string.IDS_posture_range_description_not_ideal;
            return;
        }
        if (i == 0) {
            this.mLevelShortTip = R.string.IDS_hw_health_blood_oxygen_normal;
            return;
        }
        if (i == 1) {
            this.mLevelShortTip = R.string.IDS_posture_range_description_good;
        } else if (i == 2) {
            this.mLevelShortTip = R.string.IDS_posture_range_description_excellent;
        } else {
            this.mLevelShortTip = R.string.IDS_posture_range_description_excellence;
        }
    }

    public float getValue() {
        return this.mValue;
    }

    public int getPostureId() {
        return this.mPostureId;
    }
}
