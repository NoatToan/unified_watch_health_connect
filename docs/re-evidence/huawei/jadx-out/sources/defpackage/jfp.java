package defpackage;

import com.huawei.healthcloud.plugintrack.trackanimation.preprocess.realtimedata.RealTimeDataParser;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class jfp extends RealTimeDataParser {
    @Override // com.huawei.healthcloud.plugintrack.trackanimation.preprocess.realtimedata.RealTimeDataParser
    public boolean init() {
        if (this.mMotionPath == null || this.mMotionPath.requestHeartRateList() == null || this.mMotionPath.requestHeartRateList().size() <= 0) {
            LogUtil.j("Track_HeartRateParser", "input data is null");
            return false;
        }
        if (this.mStartTime >= this.mEndTime) {
            LogUtil.j("Track_HeartRateParser", "timeStamp is error");
            return false;
        }
        if (this.mMotionPath.requestLbsDataMap() == null || this.mMotionPath.requestLbsDataMap().size() <= 0) {
            LogUtil.j("Track_HeartRateParser", "lbs data is null");
            return false;
        }
        this.mTargetSize = this.mMotionPath.requestLbsDataMap().size();
        CopyOnWriteArrayList<HeartRateData> copyOnWriteArrayList = new CopyOnWriteArrayList(this.mMotionPath.requestHeartRateList());
        this.mRealTimeData = new TreeMap();
        for (HeartRateData heartRateData : copyOnWriteArrayList) {
            if (heartRateData.acquireTime() > this.mEndTime || heartRateData.acquireTime() < this.mStartTime) {
                LogUtil.j("Track_HeartRateParser", "current stamp is error");
            } else {
                int iAcquireTime = (int) ((((heartRateData.acquireTime() - this.mStartTime) * 1.0d) / (this.mEndTime - this.mStartTime)) * ((double) (this.mTargetSize - 1)));
                this.mRealTimeData.put(Integer.valueOf(iAcquireTime), Double.valueOf(heartRateData.acquireHeartRate()));
                if (heartRateData.acquireHeartRate() > this.mMaxData.a().doubleValue()) {
                    this.mMaxData.d(Integer.valueOf(iAcquireTime));
                    this.mMaxData.e(Double.valueOf(heartRateData.acquireHeartRate()));
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
