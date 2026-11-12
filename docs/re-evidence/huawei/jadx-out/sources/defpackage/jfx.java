package defpackage;

import com.huawei.healthcloud.plugintrack.trackanimation.preprocess.realtimedata.RealTimeDataParser;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes10.dex */
public class jfx extends RealTimeDataParser {
    private long d = 0;

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.preprocess.realtimedata.RealTimeDataParser
    public boolean init() {
        if (this.mMotionPath == null || this.mMotionPath.requestRealTimeSpeedList() == null || this.mMotionPath.requestRealTimeSpeedList().size() <= 0) {
            LogUtil.j("Track_SpeedParser", "input data is null");
            return false;
        }
        if (this.mStartTime >= this.mEndTime) {
            LogUtil.j("Track_SpeedParser", "timeStamp is error");
            return false;
        }
        if (this.mMotionPath.requestLbsDataMap() == null || this.mMotionPath.requestLbsDataMap().size() <= 0) {
            LogUtil.j("Track_SpeedParser", "lbs data is null");
            return false;
        }
        this.mTargetSize = this.mMotionPath.requestLbsDataMap().size();
        List<njr> listRequestRealTimeSpeedList = this.mMotionPath.requestRealTimeSpeedList();
        this.mRealTimeData = new TreeMap();
        this.d = (this.mTotalTime / 1000) + 1;
        for (njr njrVar : listRequestRealTimeSpeedList) {
            if (njrVar.acquireTime() > this.d) {
                LogUtil.j("Track_SpeedParser", "current stamp is error");
            } else {
                int iAcquireTime = (int) (((njrVar.acquireTime() * 1.0d) / this.d) * ((double) (this.mTargetSize - 1)));
                this.mRealTimeData.put(Integer.valueOf(iAcquireTime), Double.valueOf(njrVar.c()));
                if (njrVar.c() > this.mMaxData.a().doubleValue()) {
                    this.mMaxData.d(Integer.valueOf(iAcquireTime));
                    this.mMaxData.e(Double.valueOf(njrVar.c()));
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
