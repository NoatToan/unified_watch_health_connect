package defpackage;

import android.content.Context;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.model.AbstractTrackSummaryData;
import com.huawei.hihealth.data.model.RelativeSportData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes10.dex */
public class jbk extends AbstractTrackSummaryData {
    public jbk(MotionPathSimplify motionPathSimplify) {
        super(motionPathSimplify);
    }

    public jbk(RelativeSportData relativeSportData) {
        super(relativeSportData);
    }

    @Override // com.huawei.healthcloud.plugintrack.model.AbstractTrackSummaryData
    public int getSportTypeDrawableSource(boolean z) {
        if (z) {
            return R.drawable.ic_health_list_outdoor_colours_swim;
        }
        return R.drawable.ic_health_list_outdoor_swim;
    }

    @Override // com.huawei.healthcloud.plugintrack.model.AbstractTrackSummaryData
    public String getChiefDataString() {
        if (this.mChiefDataValue < 1) {
            return izn.e(BaseApplication.getContext());
        }
        return super.getChiefDataString();
    }

    @Override // com.huawei.healthcloud.plugintrack.model.AbstractTrackSummaryData
    public String getChiefDataUnitString() {
        Context context = BaseApplication.getContext();
        if (context == null) {
            return "";
        }
        if (UnitUtil.f()) {
            return context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_unit_yd, this.mChiefDataValue);
        }
        return context.getString(R.string.IDS_fitness_data_list_activity_meter_unit);
    }

    @Override // com.huawei.healthcloud.plugintrack.model.AbstractTrackSummaryData
    public String getDistanceString() {
        if (UnitUtil.f()) {
            return getNumberFormat(UnitUtil.e(this.mChiefDataValue, 2), 0);
        }
        return getNumberFormat(this.mChiefDataValue, 0);
    }

    @Override // com.huawei.healthcloud.plugintrack.model.AbstractTrackSummaryData
    public String getPaceString() {
        float fC = this.mAlterData / 10.0f;
        double d = fC;
        if (d > 360000.0d || d <= 3.6d) {
            return izn.e(BaseApplication.getContext());
        }
        if (UnitUtil.f()) {
            fC = (float) UnitUtil.c(d, 2);
        }
        return izn.a(fC);
    }

    @Override // com.huawei.healthcloud.plugintrack.model.AbstractTrackSummaryData
    public String getPaceUnitString() {
        Context context = BaseApplication.getContext();
        if (context == null) {
            return "";
        }
        if (UnitUtil.f()) {
            return context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit_mi, 100, 100);
        }
        return context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit, 100, 100);
    }
}
