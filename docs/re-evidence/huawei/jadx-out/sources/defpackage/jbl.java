package defpackage;

import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.model.AbstractTrackSummaryData;
import com.huawei.hihealth.data.model.RelativeSportData;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;

/* JADX INFO: loaded from: classes10.dex */
public class jbl extends AbstractTrackSummaryData {
    public jbl(MotionPathSimplify motionPathSimplify) {
        super(motionPathSimplify);
    }

    public jbl(RelativeSportData relativeSportData) {
        super(relativeSportData);
    }

    @Override // com.huawei.healthcloud.plugintrack.model.AbstractTrackSummaryData
    public int getSportTypeDrawableSource(boolean z) {
        if (z) {
            return R.drawable.ic_health_list_colours_bike;
        }
        return R.drawable.ic_health_list_bike;
    }

    @Override // com.huawei.healthcloud.plugintrack.model.AbstractTrackSummaryData
    public String getAlterDataString() {
        return getSpeedString();
    }

    @Override // com.huawei.healthcloud.plugintrack.model.AbstractTrackSummaryData
    public String getAlterUnitString() {
        return getSpeedUnitString();
    }
}
