package defpackage;

import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hihealth.data.model.RelativeSportData;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;

/* JADX INFO: loaded from: classes10.dex */
public class jbe extends jbi {
    public jbe(MotionPathSimplify motionPathSimplify) {
        super(motionPathSimplify);
    }

    public jbe(RelativeSportData relativeSportData) {
        super(relativeSportData);
    }

    @Override // com.huawei.healthcloud.plugintrack.model.AbstractTrackSummaryData
    public int getSportTypeDrawableSource(boolean z) {
        if (z) {
            return 0;
        }
        return R.drawable.ic_health_indoorrunning;
    }
}
