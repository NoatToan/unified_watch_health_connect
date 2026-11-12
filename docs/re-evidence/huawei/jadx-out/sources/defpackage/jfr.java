package defpackage;

import com.huawei.healthcloud.plugintrack.trackanimation.preprocess.realtimedata.RealTimeDataParser;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes10.dex */
public class jfr extends RealTimeDataParser {
    @Override // com.huawei.healthcloud.plugintrack.trackanimation.preprocess.realtimedata.RealTimeDataParser
    public boolean init() {
        if (this.mMotionPath == null || this.mMotionPath.requestAltitudeList() == null || this.mMotionPath.requestAltitudeList().size() <= 0) {
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
        ArrayList<njm> arrayListRequestAltitudeList = this.mMotionPath.requestAltitudeList();
        this.mRealTimeData = new TreeMap();
        for (njm njmVar : arrayListRequestAltitudeList) {
            if (njmVar.acquireTime() > this.mEndTime || njmVar.acquireTime() < this.mStartTime) {
                LogUtil.j("Track_HeartRateParser", "current stamp is error");
            } else {
                int iAcquireTime = (int) ((((njmVar.acquireTime() - this.mStartTime) * 1.0d) / (this.mEndTime - this.mStartTime)) * ((double) (this.mTargetSize - 1)));
                this.mRealTimeData.put(Integer.valueOf(iAcquireTime), Double.valueOf(njmVar.a()));
                if (njmVar.a() > this.mMaxData.a().doubleValue()) {
                    this.mMaxData.d(Integer.valueOf(iAcquireTime));
                    this.mMaxData.e(Double.valueOf(njmVar.a()));
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
