package defpackage;

import com.huawei.ui.homehealth.runcard.operation.recommendalgo.sportlevelmapping.SportLevelByVo2Max;

/* JADX INFO: loaded from: classes43.dex */
public class sxs extends SportLevelByVo2Max {
    public sxs(int i) {
        if (i == 1) {
            this.mVeryPoorLimit = 17;
            this.mPoorHigherLimit = 20;
            this.mFairHigherLimit = 23;
            this.mAverageHigherLimit = 27;
            this.mGoodHigherLimit = 30;
            this.mIsInit = true;
            return;
        }
        if (i == 0) {
            this.mVeryPoorLimit = 21;
            this.mPoorHigherLimit = 26;
            this.mFairHigherLimit = 30;
            this.mAverageHigherLimit = 34;
            this.mGoodHigherLimit = 39;
            this.mIsInit = true;
            return;
        }
        this.mIsInit = false;
    }
}
