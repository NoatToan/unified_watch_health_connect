package com.huawei.ui.main.stories.health.fragment;

import android.os.Bundle;
import android.os.Message;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.fitnessdatatype.Vo2maxDetail;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.indicator.HealthLevelIndicator;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.main.R;
import defpackage.qlj;
import defpackage.vds;
import defpackage.wka;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class Vo2maxDayDetailFragment extends BaseVo2maxDetailFragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27912c;
    private String d;

    @Override // com.huawei.ui.main.stories.health.fragment.BaseVo2maxDetailFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        isCurrentFragment(true);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    private int[] c(Integer[] numArr) {
        if (numArr != null) {
            if (numArr.length > 1) {
                int length = numArr.length - 1;
                int[] iArr = new int[length];
                int i = 0;
                int iIntValue = 0;
                for (int i2 = 1; i2 < numArr.length; i2++) {
                    iIntValue += numArr[i2].intValue() - numArr[i2 - 1].intValue();
                }
                while (i < length) {
                    int i3 = i + 1;
                    iArr[i] = (int) (((numArr[i3].intValue() - numArr[i].intValue()) * 270.0f) / iIntValue);
                    i = i3;
                }
                return iArr;
            }
        }
        return new int[]{(int) 270.0f};
    }

    @Override // com.huawei.ui.main.stories.health.fragment.BaseVo2maxDetailFragment
    protected void initFragmentView() {
        if (this.mView == null || this.mContext == null) {
            return;
        }
        if (this.mHealthLevelIndicator == null) {
            this.mHealthLevelIndicator = (HealthLevelIndicator) this.mView.findViewById(R.id.current_state_level_indicator);
        }
        List<qlj> listC = wka.c(this.mOxRange);
        int length = this.mOxRange.length - 2;
        Integer[] numArr = new Integer[length];
        System.arraycopy(this.mOxRange, 0, numArr, 0, length);
        this.mHealthLevelIndicator.setAllLevelsData(listC, c(numArr));
        if (this.mVo2maxValue <= 0) {
            this.mHealthLevelIndicator.setLevel(Float.NaN, "--");
            this.mDayViewData.setText("--");
        } else {
            a(this.mVo2maxValue);
            this.mDayViewData.setText(DateUtils.formatDateTime(this.mContext, this.mVo2maxTime, 4));
        }
        this.mHealthLevelIndicator.setLevelUnit(this.mContext.getString(R.string.IDS_hwh_health_vo2max_unit));
        int iD = vds.d(this.mVo2maxValue, this.mOxRange);
        this.f27912c = iD;
        this.d = b(iD);
        a(this.mGender);
    }

    private void a(float f) {
        this.mHealthLevelIndicator.setLevel(f, UnitUtil.e(f, 1, 0));
    }

    private void a(int i) {
        if (i == 0) {
            this.mCurrentRanking.setText(vds.c(this.f27912c));
            return;
        }
        if (i == 1) {
            this.mCurrentRanking.setText(vds.a(this.f27912c));
        } else {
            if (this.mContext == null || this.mContext.getResources() == null) {
                return;
            }
            this.mCurrentRanking.setText(this.mContext.getResources().getString(R.string.IDS_motiontrack_detail_ox_level, this.d));
        }
    }

    @Override // com.huawei.ui.main.stories.health.fragment.BaseVo2maxDetailFragment
    protected DataInfos getDataInfo() {
        return DataInfos.Vo2maxWeekDetail;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.BaseVo2maxDetailFragment
    public void requestData() {
        if (this.mVo2maxValue <= 0) {
            this.mIsLoadingState = true;
            this.mRequestHandler.sendEmptyMessage(3);
            this.mDataManager.e(new d(this));
        }
    }

    private String b(int i) {
        int i2;
        switch (i) {
            case 0:
                i2 = R.string.IDS_hwh_health_vo2max_level_verypoor;
                break;
            case 1:
                i2 = R.string.IDS_hwh_health_vo2max_level_poor;
                break;
            case 2:
                i2 = R.string.IDS_hwh_health_vo2max_level_fair;
                break;
            case 3:
                i2 = R.string.IDS_hwh_health_vo2max_level_average;
                break;
            case 4:
                i2 = R.string.IDS_hwh_health_vo2max_level_good;
                break;
            case 5:
                i2 = R.string.IDS_hwh_health_vo2max_level_verygood;
                break;
            case 6:
                i2 = R.string.IDS_hwh_health_vo2max_level_excellent;
                break;
            default:
                i2 = R.string.IDS_hwh_health_vo2max_level_average;
                break;
        }
        return this.mContext.getResources().getString(i2);
    }

    static class d implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<Vo2maxDayDetailFragment> f27913a;

        d(Vo2maxDayDetailFragment vo2maxDayDetailFragment) {
            this.f27913a = new WeakReference<>(vo2maxDayDetailFragment);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            Vo2maxDayDetailFragment vo2maxDayDetailFragment = this.f27913a.get();
            if (vo2maxDayDetailFragment == null) {
                LogUtil.j("Track_Vo2maxDayDetailFragment", "fragment is null");
                return;
            }
            vo2maxDayDetailFragment.mIsLoadingState = false;
            if (i == 0 && obj != null) {
                vo2maxDayDetailFragment.mDataMap = new HashMap<>();
                Message messageObtain = Message.obtain();
                messageObtain.obj = obj;
                messageObtain.what = 1;
                vo2maxDayDetailFragment.mRequestHandler.sendMessage(messageObtain);
                return;
            }
            vo2maxDayDetailFragment.mDataMap = null;
            vo2maxDayDetailFragment.mRequestHandler.sendEmptyMessage(2);
        }
    }

    @Override // com.huawei.ui.main.stories.health.fragment.BaseVo2maxDetailFragment
    public void updateLayout(Vo2maxDetail vo2maxDetail) {
        updateBar();
        this.mVo2maxValue = vo2maxDetail.getVo2maxValue();
        a(this.mVo2maxValue);
        this.mDayViewData.setText(DateUtils.formatDateTime(this.mContext, vo2maxDetail.getTimestamp(), 4));
        int iD = vds.d(this.mVo2maxValue, this.mOxRange);
        this.f27912c = iD;
        this.d = b(iD);
        a(this.mGender);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.BaseVo2maxDetailFragment
    protected void updateBar() {
        this.mProgressBar.setVisibility(8);
    }

    public void e(int i) {
        this.mGender = i;
        this.mOxRange = vds.a(this.mGender, this.mAge);
        initFragmentView();
    }
}
