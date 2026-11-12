package com.huawei.ui.main.stories.health.fragment;

import android.os.Bundle;
import android.os.Message;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.model.unite.GetRunLevelRsp;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.main.R;
import defpackage.ieg;
import defpackage.jyd;
import defpackage.wka;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes19.dex */
public class RunningDayDetailFragment extends BaseRunningDetailFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f27900b = new Object();
    private static final int[] e = {63, 48, 60, 36, 24, 24, 15};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27901a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f27902c;
    private int d;

    @Override // com.huawei.ui.main.stories.health.fragment.BaseRunningDetailFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        isCurrentFragment(true);
        d();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.BaseRunningDetailFragment
    protected void initFragmentView() {
        String strA;
        this.mCurrentFragmentTopText = (HealthTextView) this.mView.findViewById(R.id.current_fragment_top_text);
        this.mCurrentFragmentTopText.setText(DateUtils.formatDateTime(this.mContext, ieg.e(this.mRunningStateIndexData.getRunningLevelCurrentData().getLastRecordDay()), 4));
        this.mRateCurrentText = (HealthTextView) this.mView.findViewById(R.id.current_fragment_bottom_text);
        this.mHealthLevelIndicator.setVisibility(0);
        c();
        float lastCurrentRunLevel = this.mRunningStateIndexData.getRunningLevelCurrentData().getLastCurrentRunLevel();
        if (lastCurrentRunLevel > 0.0f) {
            strA = wka.a(lastCurrentRunLevel);
        } else {
            strA = "--";
            lastCurrentRunLevel = Float.NaN;
        }
        float f = this.f27902c;
        if (lastCurrentRunLevel > f) {
            lastCurrentRunLevel = f - 1.0f;
        }
        this.mHealthLevelIndicator.setLevel(lastCurrentRunLevel, strA);
    }

    private void c() {
        if (this.mGender == 0) {
            this.mHealthLevelIndicator.setAllLevelsData(wka.b(), e);
            this.f27902c = 90.0f;
        } else {
            this.mHealthLevelIndicator.setAllLevelsData(wka.d(), e);
            this.f27902c = 90.0f;
        }
        a(this.mRunningStateIndexData.getRunningLevelCurrentData().getLastRanking());
    }

    private void a(float f) {
        if (this.mContext == null || this.mContext.getResources() == null) {
            LogUtil.e("RunningDayDetailFragment", "context is null");
            return;
        }
        if (f <= 0.0f) {
            this.mRateCurrentText.setVisibility(8);
            return;
        }
        double d2 = f;
        String strE = UnitUtil.e(d2, 2, 1);
        if (LanguageUtil.br(this.mContext)) {
            strE = "%" + UnitUtil.e(d2, 1, 1);
        }
        if (this.mGender != 0 && this.mGender != 1) {
            this.mRateCurrentText.setText(this.mContext.getResources().getString(R.string.IDS_data_rate_current_txt, strE));
        } else if (this.mGender == 0) {
            this.mRateCurrentText.setText(this.mContext.getResources().getString(R.string.IDS_data_rate_current_male_txt, strE));
        } else {
            this.mRateCurrentText.setText(this.mContext.getResources().getString(R.string.IDS_data_rate_current_female_txt, strE));
        }
    }

    private void d() {
        int iJ = CommonUtil.j(new SimpleDateFormat("yyyyMMdd").format(new Date(System.currentTimeMillis())));
        this.f27901a = iJ;
        this.d = iJ;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.BaseRunningDetailFragment
    public void requestData() {
        if (this.mRunningStateIndexData.getRunningLevelCurrentData().getLastCurrentRunLevel() < 0.0f) {
            e();
        }
    }

    private void e() {
        d dVar = new d(this);
        this.mRequestHandler.sendEmptyMessage(3);
        new jyd().c(getContext(), this.f27901a, this.d, 0, (IBaseResponseCallback) dVar);
    }

    static class d implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<RunningDayDetailFragment> f27903c;

        d(RunningDayDetailFragment runningDayDetailFragment) {
            this.f27903c = new WeakReference<>(runningDayDetailFragment);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            RunningDayDetailFragment runningDayDetailFragment = this.f27903c.get();
            if (runningDayDetailFragment == null) {
                LogUtil.j("RunningDayDetailFragment", "fragment is null");
                return;
            }
            if (i == 200) {
                synchronized (RunningDayDetailFragment.f27900b) {
                    if (obj instanceof GetRunLevelRsp) {
                        Message messageObtainMessage = runningDayDetailFragment.mRequestHandler.obtainMessage(1);
                        messageObtainMessage.obj = obj;
                        runningDayDetailFragment.mRequestHandler.sendMessage(messageObtainMessage);
                    } else {
                        runningDayDetailFragment.mRequestHandler.sendEmptyMessage(2);
                    }
                }
            }
        }
    }

    @Override // com.huawei.ui.main.stories.health.fragment.BaseRunningDetailFragment
    public void updateLayout(GetRunLevelRsp getRunLevelRsp) {
        updateBar();
        c();
        if (getRunLevelRsp == null || getRunLevelRsp.getUserRunLevelData() == null) {
            return;
        }
        a(getRunLevelRsp.getUserRunLevelData().getLastRanking());
        float lastCurrentRunLevel = getRunLevelRsp.getUserRunLevelData().getLastCurrentRunLevel();
        String strA = wka.a(lastCurrentRunLevel);
        float f = this.f27902c;
        if (lastCurrentRunLevel > f) {
            lastCurrentRunLevel = f - 1.0f;
        }
        this.mHealthLevelIndicator.setLevel(lastCurrentRunLevel, strA);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.BaseRunningDetailFragment
    protected void updateBar() {
        this.mProgressBar.setVisibility(8);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.BaseRunningDetailFragment
    public DataInfos getDataInfo() {
        return DataInfos.RunningWeekDetail;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.BaseRunningDetailFragment
    public void updateGenderView(int i) {
        if (this.mGender != i) {
            this.mGender = i;
            e();
        }
    }
}
