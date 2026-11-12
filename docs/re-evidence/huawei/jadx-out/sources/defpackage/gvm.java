package defpackage;

import android.content.Context;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.util.Pair;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.section.section.MeasureCardItemHolder;
import com.huawei.health.servicesui.R;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes8.dex */
public class gvm extends MeasureCardItemHolder {
    public gvm(View view) {
        super(view);
        this.mTitle = BaseApplication.b().getResources().getString(R.string.IDS_arrhythmia_title_tl);
        qsp.b(this.mTitleTextView, this.mTitle);
    }

    @Override // com.huawei.health.section.section.MeasureCardItemHolder
    public long getNewDataTimeStamp(gvl gvlVar) {
        HiHealthData hiHealthDataA = gvlVar.a();
        if (hiHealthDataA != null) {
            return hiHealthDataA.getStartTime();
        }
        return 0L;
    }

    @Override // com.huawei.health.section.section.MeasureCardItemHolder
    public void syncEcgData() {
        LogUtil.a("ArrhythmiaItemHolder", "syncEcgData in ArrhythmiaItemHolder");
    }

    @Override // com.huawei.health.section.section.MeasureCardItemHolder
    public void bindDesc(gvl gvlVar) {
        this.mIcon.setImageResource(R.drawable.ic_ecg_ppg);
        HiHealthData hiHealthDataA = gvlVar.a();
        if (hiHealthDataA != null) {
            this.mTimeTextView.setText(DateFormatUtil.d(hiHealthDataA.getStartTime(), DateFormatUtil.DateFormatType.DATE_FORMAT_MONTH_DAY_HH_MM));
            Pair<Integer, Integer> pairE = e((int) hiHealthDataA.getValue(), fxn.e());
            if (pairE.first != null && pairE.first.intValue() != 0) {
                this.mPrimaryTipTextView.setText(pairE.first.intValue());
            } else {
                this.mPrimaryTipTextView.setText((CharSequence) null);
            }
            this.mSecondaryTipTextView.setVisibility(0);
            if (pairE.second != null && pairE.second.intValue() != 0) {
                this.mSecondaryTipTextView.setText(pairE.second.intValue());
            } else {
                this.mSecondaryTipTextView.setText((CharSequence) null);
            }
            onDataAvailable(true);
            return;
        }
        this.mPrimaryTipTextView.setText(R.string.IDS_arrhythmia_no_data_tip);
        this.mSecondaryTipTextView.setVisibility(8);
        onDataAvailable(false);
    }

    private Pair<Integer, Integer> e(int i, boolean z) {
        if (i == 1) {
            return new Pair<>(Integer.valueOf(R.string.IDS_arrhythmia_normal), Integer.valueOf(R.string.IDS_arrhythmia_normal_tip));
        }
        if (i == 2) {
            return new Pair<>(Integer.valueOf(R.string.IDS_arrhythmia_pc), Integer.valueOf(R.string.IDS_arrhythmia_pc_tip));
        }
        if (i == 3) {
            return new Pair<>(Integer.valueOf(R.string.IDS_arrhythmia_afib), Integer.valueOf(R.string.IDS_arrhythmia_afib_tip));
        }
        if (i == 4) {
            if (z) {
                return new Pair<>(Integer.valueOf(R.string.IDS_arrhythmia_afib), Integer.valueOf(R.string.IDS_arrhythmia_afib_tip));
            }
            return new Pair<>(Integer.valueOf(R.string.IDS_arrhythmia_afib_risk), Integer.valueOf(R.string.IDS_arrhythmia_afib_risk_tip));
        }
        if (i != 5) {
            ReleaseLogUtil.a(getTag(), "getDiagramDesc, unknown diagramType = ", Integer.valueOf(i));
            return new Pair<>(0, 0);
        }
        if (z) {
            return new Pair<>(Integer.valueOf(R.string.IDS_arrhythmia_pc), Integer.valueOf(R.string.IDS_arrhythmia_pc_tip));
        }
        return new Pair<>(Integer.valueOf(R.string.IDS_arrhythmia_pc_risk), Integer.valueOf(R.string.IDS_arrhythmia_pc_risk_tip));
    }

    @Override // com.huawei.health.section.section.MeasureCardItemHolder
    public int getChartLineColor(Context context) {
        return ContextCompat.getColor(this.mContext, R.color.ecg_arrhythmia_chart_line_color);
    }

    @Override // com.huawei.health.section.section.MeasureCardItemHolder
    public Pair<Integer, Integer> getChartGradientColors() {
        return new Pair<>(Integer.valueOf(ContextCompat.getColor(this.mContext, R.color.ecg_arrhythmia_chart_gradient_start_color)), Integer.valueOf(ContextCompat.getColor(this.mContext, R.color.ecg_arrhythmia_chart_gradient_end_color)));
    }

    @Override // com.huawei.health.section.section.MeasureCardItemHolder
    public String getTag() {
        return "ArrhythmiaItemHolder";
    }
}
