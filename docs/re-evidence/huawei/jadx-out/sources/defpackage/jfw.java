package defpackage;

import com.huawei.healthcloud.plugintrack.trackanimation.preprocess.realtimedata.RealTimeDataParser;
import com.huawei.hwfoundationmodel.trackmodel.StepRateData;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes10.dex */
public class jfw extends RealTimeDataParser {
    @Override // com.huawei.healthcloud.plugintrack.trackanimation.preprocess.realtimedata.RealTimeDataParser
    public boolean init() {
        if (this.mMotionPath == null || this.mMotionPath.requestStepRateList() == null || this.mMotionPath.requestStepRateList().size() <= 0) {
            LogUtil.j("Track_StepRateParser", "input data is null");
            return false;
        }
        if (this.mStartTime >= this.mEndTime) {
            LogUtil.j("Track_StepRateParser", "timeStamp is error");
            return false;
        }
        if (this.mMotionPath.requestLbsDataMap() == null || this.mMotionPath.requestLbsDataMap().size() <= 0) {
            LogUtil.j("Track_StepRateParser", "lbs data is null");
            return false;
        }
        this.mTargetSize = this.mMotionPath.requestLbsDataMap().size();
        ArrayList<StepRateData> arrayListRequestStepRateList = this.mMotionPath.requestStepRateList();
        this.mRealTimeData = new TreeMap();
        for (StepRateData stepRateData : arrayListRequestStepRateList) {
            if (stepRateData.acquireTime() > this.mEndTime || stepRateData.acquireTime() < this.mStartTime) {
                LogUtil.j("Track_StepRateParser", "current stamp is error");
            } else {
                int iAcquireTime = (int) ((((stepRateData.acquireTime() - this.mStartTime) * 1.0d) / (this.mEndTime - this.mStartTime)) * ((double) (this.mTargetSize - 1)));
                this.mRealTimeData.put(Integer.valueOf(iAcquireTime), Double.valueOf(stepRateData.acquireStepRate()));
                if (stepRateData.acquireStepRate() > this.mMaxData.a().doubleValue()) {
                    this.mMaxData.d(Integer.valueOf(iAcquireTime));
                    this.mMaxData.e(Double.valueOf(stepRateData.acquireStepRate()));
                }
            }
        }
        if (this.mRealTimeData.size() <= 0) {
            return false;
        }
        this.mTargetIndex = 0;
        return true;
    }
}
