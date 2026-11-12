package com.huawei.ui.main.stories.health.fragment;

import android.os.Bundle;
import android.os.Handler;
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
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.interactors.healthdata.RunningStateIndexData;
import defpackage.ieg;
import defpackage.jyd;
import defpackage.lsy;
import defpackage.qlj;
import defpackage.wka;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class StateDayDetailFragment extends BaseStateIndexDetailFragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f27907c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f27909b;
    private int d;
    private Handler e = new Handler() { // from class: com.huawei.ui.main.stories.health.fragment.StateDayDetailFragment.5
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                if (message.obj instanceof RunningStateIndexData) {
                    StateDayDetailFragment.this.e((RunningStateIndexData) message.obj);
                    return;
                }
                return;
            }
            if (i == 2) {
                StateDayDetailFragment.this.d();
            } else if (i == 3 && StateDayDetailFragment.this.mIsLoadingState && StateDayDetailFragment.this.mProgressBar != null) {
                StateDayDetailFragment.this.mProgressBar.setVisibility(0);
            }
        }
    };
    private float f;

    @Override // com.huawei.ui.main.stories.health.fragment.BaseStateIndexDetailFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        c();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.BaseStateIndexDetailFragment
    protected void initView() {
        super.initView();
        this.mFitnessIndexText = (HealthTextView) this.mView.findViewById(R.id.fitness_index_num);
        this.mFatigueIndexText = (HealthTextView) this.mView.findViewById(R.id.fatigue_index_num);
        this.mCurrentLevelText = (HealthTextView) this.mView.findViewById(R.id.current_fragment_bottom_text);
        this.mProgressBar = (HealthProgressBar) this.mView.findViewById(R.id.loading_iv);
        this.mHealthLevelIndicator.setVisibility(0);
        this.mCurrentRawLayout.setVisibility(0);
        this.mPolyLineDetailLayout.setVisibility(8);
    }

    private int[] c(int i) {
        int[] iArr = new int[i];
        int i2 = (int) (270.0f / i);
        for (int i3 = 0; i3 < i; i3++) {
            iArr[i3] = i2;
        }
        return iArr;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.BaseStateIndexDetailFragment
    protected void initFragmentView(View view, int i) {
        this.mCurrentFragmentTopText = (HealthTextView) view.findViewById(R.id.current_fragment_top_text);
        this.mHealthRecyclerView.setVisibility(8);
        this.mDayViewLinearLayout.setVisibility(0);
        this.mStateIndexDayTextView.setVisibility(0);
        List<qlj> listA = wka.a();
        this.mHealthLevelIndicator.setAllLevelsData(listA, c(listA.size()));
        if (this.mRunningStateIndexData != null && this.mRunningStateIndexData.getRunningLevelCurrentData() != null) {
            this.mCurrentFragmentTopText.setText(DateUtils.formatDateTime(this.mContext, ieg.e(this.mRunningStateIndexData.getRunningLevelCurrentData().getLastRecordDay()), 4));
            float lastCondition = this.mRunningStateIndexData.getRunningLevelCurrentData().getLastCondition();
            this.f = lastCondition;
            this.mFitnessIndexText.setText(UnitUtil.e(this.mRunningStateIndexData.getRunningLevelCurrentData().getLastFitness(), 1, 1));
            this.mFatigueIndexText.setText(UnitUtil.e(this.mRunningStateIndexData.getRunningLevelCurrentData().getLastFatigue(), 1, 1));
            this.mHealthLevelIndicator.setLevel(lastCondition, wka.d(lastCondition));
            this.f27909b = wka.j(lastCondition);
            this.mCurrentLevelText.setText(this.f27909b);
        } else {
            this.f = -20.0f;
            this.mHealthLevelIndicator.setLevel(Float.NaN, "--");
            this.mFitnessIndexText.setText("--");
            this.mFatigueIndexText.setText("--");
            this.mCurrentLevelText.setVisibility(8);
        }
        if (this.f == -20.0f) {
            lsy.a(new Runnable() { // from class: com.huawei.ui.main.stories.health.fragment.StateDayDetailFragment.1
                @Override // java.lang.Runnable
                public void run() {
                    StateDayDetailFragment.this.b();
                }
            });
        }
    }

    private void c() {
        int iB = ieg.b(new Date(System.currentTimeMillis()));
        this.f27908a = iB;
        this.d = iB;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.BaseStateIndexDetailFragment
    protected DataInfos getDataInfo() {
        return DataInfos.StateIndexWeekDetail;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        new jyd().c(getContext(), this.f27908a, this.d, 0, (IBaseResponseCallback) new e(this));
    }

    static class e implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<StateDayDetailFragment> f27910a;

        e(StateDayDetailFragment stateDayDetailFragment) {
            this.f27910a = new WeakReference<>(stateDayDetailFragment);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            StateDayDetailFragment stateDayDetailFragment = this.f27910a.get();
            if (stateDayDetailFragment == null) {
                LogUtil.j("Track_StateDayDetailFragment", "fragment is null");
                return;
            }
            if (i == 200) {
                synchronized (StateDayDetailFragment.f27907c) {
                    if (!(obj instanceof GetRunLevelRsp)) {
                        stateDayDetailFragment.e.removeMessages(2);
                    } else {
                        RunningStateIndexData runningStateIndexDataC = wka.c((GetRunLevelRsp) obj);
                        Message messageObtain = Message.obtain();
                        messageObtain.obj = runningStateIndexDataC;
                        messageObtain.what = 1;
                        stateDayDetailFragment.e.sendMessage(messageObtain);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.mProgressBar.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(RunningStateIndexData runningStateIndexData) {
        d();
        if (runningStateIndexData == null || runningStateIndexData.getRunningLevelCurrentData() == null) {
            return;
        }
        float lastCondition = runningStateIndexData.getRunningLevelCurrentData().getLastCondition();
        this.mHealthLevelIndicator.setLevel(lastCondition, wka.d(lastCondition));
        this.mFitnessIndexText.setText(UnitUtil.e(runningStateIndexData.getRunningLevelCurrentData().getLastFitness(), 1, 1));
        this.mFatigueIndexText.setText(UnitUtil.e(runningStateIndexData.getRunningLevelCurrentData().getLastFatigue(), 1, 1));
        this.f27909b = wka.j(lastCondition);
        this.mCurrentLevelText.setText(this.f27909b);
    }
}
