package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.core.util.Pair;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.marketing.utils.EcgFilterManager;
import com.huawei.health.section.section.MeasureCardItemHolder;
import com.huawei.health.servicesui.R;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.model.EcgMetaData;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes8.dex */
public class gvv extends MeasureCardItemHolder {
    @Override // com.huawei.health.section.section.MeasureCardItemHolder
    public float getYMax() {
        return 1000000.0f;
    }

    @Override // com.huawei.health.section.section.MeasureCardItemHolder
    public float getYMin() {
        return -1000000.0f;
    }

    public gvv(View view) {
        super(view);
    }

    @Override // com.huawei.health.section.section.MeasureCardItemHolder
    public long getNewDataTimeStamp(gvl gvlVar) {
        if (gvlVar.g()) {
            HiHealthData hiHealthDataC = gvlVar.c();
            if (hiHealthDataC != null) {
                return hiHealthDataC.getStartTime();
            }
            return 0L;
        }
        HiHealthData hiHealthDataA = gvlVar.a();
        if (hiHealthDataA != null) {
            return hiHealthDataA.getStartTime();
        }
        return 0L;
    }

    @Override // com.huawei.health.section.section.MeasureCardItemHolder
    public void syncEcgData() {
        a();
        b();
    }

    @Override // com.huawei.health.section.section.MeasureCardItemHolder
    public void bindDesc(gvl gvlVar) {
        long startTime;
        int i;
        int i2;
        int averageHeartRate;
        EcgMetaData ecgMetaData;
        boolean zG = gvlVar.g();
        int ecgArrhyType = 0;
        if (zG) {
            HiHealthData hiHealthDataC = gvlVar.c();
            startTime = hiHealthDataC != null ? hiHealthDataC.getStartTime() : 0L;
            if (hiHealthDataC != null) {
                try {
                    ecgMetaData = (EcgMetaData) qqt.c(hiHealthDataC.getMetaData(), new TypeToken<EcgMetaData>() { // from class: com.huawei.health.section.section.NormalItemHolder$1
                    }.getType());
                } catch (JsonSyntaxException unused) {
                    LogUtil.e("NormalItemHolder", "JsonSyntaxException");
                    ecgMetaData = new EcgMetaData();
                }
                ecgArrhyType = (int) ecgMetaData.getEcgArrhyType();
                averageHeartRate = ecgMetaData.getAverageHeartRate();
            } else {
                averageHeartRate = 0;
            }
            i2 = averageHeartRate;
            i = ecgArrhyType;
        } else {
            HiHealthData hiHealthDataA = gvlVar.a();
            startTime = hiHealthDataA != null ? hiHealthDataA.getStartTime() : 0L;
            i = 0;
            i2 = 0;
        }
        e(startTime, i, i2, zG);
    }

    private void e(long j, int i, int i2, boolean z) {
        String string;
        Resources resources = BaseApplication.b().getResources();
        if (z) {
            string = resources.getString(R.string.IDS_quick_app_ecg_analysis);
        } else {
            string = resources.getString(R.string.IDS_quick_app_ecg);
        }
        this.mTitle = string;
        qsp.b(this.mTitleTextView, this.mTitle);
        if (j == 0) {
            this.mPrimaryTipTextView.setText(z ? R.string.IDS_heart_rate_no_data_tip : R.string.IDS_heart_rate_cllection_no_data_tip);
            this.mSecondaryTipTextView.setVisibility(8);
            this.mTimeTextView.setVisibility(8);
            onDataAvailable(false);
        } else {
            Pair<String, String> pairD = d(i, i2);
            if (pairD != null) {
                this.mPrimaryTipTextView.setVisibility(0);
                this.mPrimaryTipTextView.setText(z ? pairD.first : qre.f(R.string.IDS_heart_rate_collection_tip));
                this.mSecondaryTipTextView.setVisibility(0);
                if (z) {
                    this.mSecondaryTipTextView.setText(pairD.second);
                } else {
                    this.mSecondaryTipTextView.setText((CharSequence) null);
                    this.mSecondaryTipTextView.setVisibility(8);
                }
            } else {
                if (z) {
                    this.mPrimaryTipTextView.setVisibility(8);
                } else {
                    this.mPrimaryTipTextView.setVisibility(0);
                    this.mPrimaryTipTextView.setText(R.string.IDS_heart_rate_collection_tip);
                }
                this.mSecondaryTipTextView.setVisibility(8);
            }
            this.mTimeTextView.setVisibility(0);
            this.mTimeTextView.setText(DateFormatUtil.d(j, DateFormatUtil.DateFormatType.DATE_FORMAT_MONTH_DAY_HH_MM));
            onDataAvailable(true);
        }
        this.mIcon.setImageResource(z ? R.drawable.ic_ecg_diagram : R.drawable.ic_ecg_collection);
    }

    private Pair<String, String> d(int i, int i2) {
        String strF;
        String strF2;
        EcgFilterManager ecgFilterManagerB = EcgFilterManager.b();
        if (ecgFilterManagerB.h() && (i == 2 || i == 4)) {
            i = 1;
        }
        if (i == 1) {
            strF = qre.f(R.string.IDS_heart_rate_sinus);
            strF2 = qre.f(ecgFilterManagerB.i() ? R.string.ecg_sinus_rhythm_result : R.string.IDS_heart_rate_sinus_tip);
        } else if (i == 2) {
            strF = qre.f(R.string.IDS_heart_rate_pac);
            strF2 = qre.f(R.string.IDS_heart_rate_pac_tip);
        } else if (i == 4) {
            strF = qre.f(R.string.IDS_heart_rate_pvc);
            strF2 = qre.f(R.string.IDS_heart_rate_pvc_tip);
        } else if (i == 8) {
            strF = qre.f(R.string.IDS_heart_rate_afib);
            strF2 = qre.f(R.string.IDS_heart_rate_afib_tip);
        } else if (i != 16) {
            if (i != 32) {
                if (i == 64) {
                    strF = qre.f(R.string.IDS_heart_rate_ambiguous);
                    strF2 = qre.f(R.string.IDS_heart_rate_ambiguous_no_exact);
                } else if (i == 128) {
                    strF = qre.f(R.string.IDS_heart_rate_ambiguous);
                    strF2 = qre.f(R.string.IDS_heart_rate_ambiguous_low_signal);
                } else {
                    ReleaseLogUtil.a(getTag(), "getDiagramDesc, unknown diagramType = ", Integer.valueOf(i));
                    return null;
                }
            } else if (ecgFilterManagerB.m() && ecgFilterManagerB.g()) {
                strF = qre.a(R.string.IDS_ecg_jp_low_rate, d(50));
                strF2 = qre.a(R.string.IDS_ecg_jp_low_rate_tip1, d(50));
            } else {
                strF = qre.f(R.string.IDS_heart_rate_ambiguous);
                strF2 = qre.a(R.string.IDS_heart_rate_ambiguous_lowerthan_fifty, d(50));
            }
        } else if (ecgFilterManagerB.m() && ecgFilterManagerB.g()) {
            strF = qre.a(R.string.IDS_ecg_jp_high_rate, d(110));
            strF2 = qre.a(R.string.IDS_ecg_jp_high_rate_tip1, d(110));
        } else {
            strF = qre.f(R.string.IDS_heart_rate_ambiguous);
            strF2 = qre.a(R.string.IDS_heart_rate_ambiguous_higherthan_onehundred, d(110), d(30));
        }
        return new Pair<>(strF, strF2);
    }

    private String d(int i) {
        return UnitUtil.e(i, 1, 0);
    }

    private void b() {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(15);
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncScope(1);
        HiHealthNativeApi.a(this.mContext).synCloud(hiSyncOption, null);
    }

    private void a() {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(DicDataTypeUtil.DataType.ELECTROCARDIOGRAM.value());
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncScope(1);
        HiHealthNativeApi.a(this.mContext).synCloud(hiSyncOption, null);
    }

    @Override // com.huawei.health.section.section.MeasureCardItemHolder
    public int getChartLineColor(Context context) {
        return qre.e(R.color.ecg_diagram_chart_line_color);
    }

    @Override // com.huawei.health.section.section.MeasureCardItemHolder
    public String getTag() {
        return "NormalItemHolder";
    }
}
