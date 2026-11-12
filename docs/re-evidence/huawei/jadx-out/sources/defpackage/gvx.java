package defpackage;

import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.section.section.MeasureCardItemHolder;
import com.huawei.health.section.section.MeasureIndicator;
import com.huawei.health.servicesui.R;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class gvx extends MeasureCardItemHolder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f36108c;
    private MeasureIndicator e;

    public gvx(View view) {
        super(view);
        this.f36108c = -1.0d;
        this.mIcon.setImageResource(R.drawable.ic_ecg_vascular);
        this.mTitle = a();
        qsp.b(this.mTitleTextView, this.mTitle);
    }

    private String a() {
        return BaseApplication.b().getResources().getString(R.string.IDS_vascular_elasticity_test).replace("\n", "");
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
        LogUtil.a("VascularItemHolder", "syncEcgData in VascularItemHolder");
    }

    @Override // com.huawei.health.section.section.MeasureCardItemHolder
    public void bindDesc(gvl gvlVar) {
        HiHealthData hiHealthDataA = gvlVar.a();
        if (hiHealthDataA == null) {
            this.mPrimaryTipTextView.setText(R.string.IDS_vascular_no_data_tip);
            this.mSecondaryTipTextView.setVisibility(8);
            this.mTimeTextView.setText((CharSequence) null);
            this.f36108c = -1.0d;
            onDataAvailable(false);
            return;
        }
        this.mTimeTextView.setText(DateFormatUtil.d(hiHealthDataA.getStartTime(), DateFormatUtil.DateFormatType.DATE_FORMAT_MONTH_DAY_HH_MM));
        List<gvh> listJ = gvlVar.j();
        double dB = njy.b(listJ) ? listJ.get(0).b() : -1.0d;
        this.f36108c = dB;
        Pair<Integer, Integer> pairE = e(dB);
        this.mPrimaryTipTextView.setText(((Integer) pairE.first).intValue());
        this.mSecondaryTipTextView.setVisibility(0);
        this.mSecondaryTipTextView.setText(((Integer) pairE.second).intValue());
        onDataAvailable(true);
    }

    private Pair<Integer, Integer> e(double d) {
        if (d < 8.0d) {
            return new Pair<>(Integer.valueOf(R.string.IDS_vascular_good), Integer.valueOf(R.string.IDS_vascular_good_tip));
        }
        if (d >= 8.0d && d <= 10.0d) {
            return new Pair<>(Integer.valueOf(R.string.IDS_vascular_less_good), Integer.valueOf(R.string.IDS_vascular_less_good_tip));
        }
        return new Pair<>(Integer.valueOf(R.string.IDS_vascular_bad), Integer.valueOf(R.string.IDS_vascular_bad_tip));
    }

    @Override // com.huawei.health.section.section.MeasureCardItemHolder
    public void bindChart(gvl gvlVar) {
        boolean z = this.f36108c != -1.0d;
        if (this.e == null && z) {
            this.e = new MeasureIndicator(this.mContext);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            this.mChartContainer.addView(this.e, layoutParams);
        }
        MeasureIndicator measureIndicator = this.e;
        if (measureIndicator != null) {
            measureIndicator.setVisibility(z ? 0 : 8);
            if (z) {
                this.e.setIndicatorLevel(this.f36108c);
            }
        }
    }

    @Override // com.huawei.health.section.section.MeasureCardItemHolder
    public String getTag() {
        return "VascularItemHolder";
    }
}
