package com.huawei.ui.main.stories.health.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.wifi.control.claim.ClaimWeightDataManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.adapter.ClaimDataExpandableListViewAdapter;
import defpackage.dnj;
import defpackage.eau;
import defpackage.eav;
import defpackage.iov;
import defpackage.njy;
import defpackage.qpx;
import health.compact.a.GRSManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class ClaimDataFatRateFluctuationFragment extends ClaimMeasureDataFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ExpandableListView f27876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ClaimDataExpandableListViewAdapter f27877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27878c;
    private int d;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_claim_data_fatrate_fluctuation, viewGroup, false);
        c(viewInflate);
        b();
        return viewInflate;
    }

    private void b() {
        ClaimDataExpandableListViewAdapter claimDataExpandableListViewAdapter = new ClaimDataExpandableListViewAdapter(this.mSelectUserInterface);
        this.f27877b = claimDataExpandableListViewAdapter;
        this.f27876a.setAdapter(claimDataExpandableListViewAdapter);
        setList();
    }

    private void c(View view) {
        ExpandableListView expandableListView = (ExpandableListView) view.findViewById(R.id.hw_claim_data_expand_listview);
        this.f27876a = expandableListView;
        expandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() { // from class: com.huawei.ui.main.stories.health.fragment.ClaimDataFatRateFluctuationFragment.3
            @Override // android.widget.ExpandableListView.OnGroupClickListener
            public boolean onGroupClick(ExpandableListView expandableListView2, View view2, int i, long j) {
                return true;
            }
        });
        view.findViewById(R.id.hw_right_measure_method).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.fragment.ClaimDataFatRateFluctuationFragment.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                ClaimDataFatRateFluctuationFragment.this.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: uux
            @Override // java.lang.Runnable
            public final void run() {
                this.f50596a.d();
            }
        });
    }

    public /* synthetic */ void d() {
        final String strA = a();
        if (TextUtils.isEmpty(strA)) {
            LogUtil.j("HealthWeight_ClaimDataFatRateBigChangeFragment", "can not get CorrectMeasureMethod help url");
        } else if (e()) {
            this.mActivity.runOnUiThread(new Runnable() { // from class: uuu
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50592a.e(strA);
                }
            });
        }
    }

    private String a() {
        return GRSManager.c(BaseApplication.b()).getNoCheckUrl("domainTipsResDbankcdn", "SG") + "/handbook/SmartWear/Scale-eight/EMUI8.0/C001B001/zh-CN/index.html";
    }

    private boolean e() {
        return (this.mActivity == null || this.mActivity.isDestroyed() || this.mActivity.isFinishing()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HealthWeight_ClaimDataFatRateBigChangeFragment", "startWebViewActivity url is empty");
            return false;
        }
        Intent intent = new Intent(this.mActivity, (Class<?>) WebViewActivity.class);
        intent.putExtra("url", str);
        iov.d(this.mActivity, intent);
        return true;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.ClaimMeasureDataFragment
    public void setList() {
        ClaimDataExpandableListViewAdapter claimDataExpandableListViewAdapter = this.f27877b;
        if (claimDataExpandableListViewAdapter == null) {
            LogUtil.j("HealthWeight_ClaimDataFatRateBigChangeFragment", "setList mAdapter is null");
            return;
        }
        claimDataExpandableListViewAdapter.a();
        Map<dnj, ArrayList<eau>> fatRateFluctuationDataBean = ClaimWeightDataManager.INSTANCE.getFatRateFluctuationDataBean();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<dnj, ArrayList<eau>> entry : fatRateFluctuationDataBean.entrySet()) {
            dnj key = entry.getKey();
            if (key == null) {
                LogUtil.j("HealthWeight_ClaimDataFatRateBigChangeFragment", "setList user is null");
            } else {
                arrayList.add(key);
                ArrayList<eau> value = entry.getValue();
                d(value);
                arrayList2.add(value);
            }
        }
        if (njy.b(arrayList) && njy.b(arrayList2)) {
            LogUtil.a("HealthWeight_ClaimDataFatRateBigChangeFragment", "initData claimWeightDataBean not Empty size = ", Integer.valueOf(arrayList2.size()));
            this.f27877b.a(arrayList, arrayList2);
            for (int i = 0; i < arrayList.size(); i++) {
                this.f27876a.expandGroup(i);
            }
        }
    }

    @Override // com.huawei.ui.main.stories.health.fragment.ClaimMeasureDataFragment
    public int getListSize() {
        ClaimDataExpandableListViewAdapter claimDataExpandableListViewAdapter = this.f27877b;
        if (claimDataExpandableListViewAdapter != null) {
            return claimDataExpandableListViewAdapter.b();
        }
        return 0;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.ClaimMeasureDataFragment
    public void removeItem() {
        ClaimDataExpandableListViewAdapter claimDataExpandableListViewAdapter = this.f27877b;
        if (claimDataExpandableListViewAdapter != null) {
            claimDataExpandableListViewAdapter.e();
        }
    }

    @Override // com.huawei.ui.main.stories.health.fragment.ClaimMeasureDataFragment
    public void setAllChooseItem(boolean z) {
        ClaimDataExpandableListViewAdapter claimDataExpandableListViewAdapter = this.f27877b;
        if (claimDataExpandableListViewAdapter != null) {
            claimDataExpandableListViewAdapter.b(z);
        }
    }

    @Override // com.huawei.ui.main.stories.health.fragment.ClaimMeasureDataFragment
    public void claimMeasureData() {
        if (this.f27877b == null) {
            LogUtil.j("HealthWeight_ClaimDataFatRateBigChangeFragment", "claimMeasureData mAdapter is null");
        } else {
            sendClaimWeight();
        }
    }

    @Override // com.huawei.ui.main.stories.health.fragment.ClaimMeasureDataFragment
    public void sendStartClaimWeightData() {
        Message messageObtain = Message.obtain();
        messageObtain.what = 4;
        this.mClaimHandler.sendMessageDelayed(messageObtain, 200L);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.ClaimMeasureDataFragment
    public void deleteWeightData() {
        ClaimDataExpandableListViewAdapter claimDataExpandableListViewAdapter = this.f27877b;
        if (claimDataExpandableListViewAdapter == null) {
            LogUtil.j("HealthWeight_ClaimDataFatRateBigChangeFragment", "deleteWeightData mAdapter is null");
            return;
        }
        ArrayList<eau> arrayListC = claimDataExpandableListViewAdapter.c();
        if (njy.e(arrayListC)) {
            LogUtil.j("HealthWeight_ClaimDataFatRateBigChangeFragment", "deleteWeightData chooseClaimWeightDatas is empty");
        } else {
            deleteSelectedWeightData(arrayListC);
        }
    }

    @Override // com.huawei.ui.main.stories.health.fragment.ClaimMeasureDataFragment
    public boolean saveWeightData() {
        if (g()) {
            ReleaseLogUtil.a("HealthWeight_ClaimDataFatRateBigChangeFragment", "unable to save weight data, return");
            destroyLoadingDialog();
            return false;
        }
        Map<dnj, ArrayList<eau>> mapD = this.f27877b.d();
        this.d = mapD.size();
        for (Map.Entry<dnj, ArrayList<eau>> entry : mapD.entrySet()) {
            saveSingleUserWeightData(entry.getKey(), entry.getValue());
        }
        LogUtil.a("HealthWeight_ClaimDataFatRateBigChangeFragment", "saveWeightData chooseMapData size,", Integer.valueOf(mapD.size()));
        return true;
    }

    private boolean g() {
        if (!super.saveWeightData()) {
            LogUtil.j("HealthWeight_ClaimDataFatRateBigChangeFragment", "saveWeightData : Network is not Connected!");
            return true;
        }
        ClaimDataExpandableListViewAdapter claimDataExpandableListViewAdapter = this.f27877b;
        if (claimDataExpandableListViewAdapter == null) {
            LogUtil.j("HealthWeight_ClaimDataFatRateBigChangeFragment", "saveWeightData mAdapter is null");
            return true;
        }
        if (claimDataExpandableListViewAdapter.d().size() > 0) {
            return false;
        }
        LogUtil.j("HealthWeight_ClaimDataFatRateBigChangeFragment", "saveWeightData chooseMapData is empty");
        return true;
    }

    private void d(ArrayList<eau> arrayList) {
        for (eau eauVar : arrayList) {
            List<eav> listC = eauVar.c();
            if (njy.e(listC)) {
                LogUtil.j("HealthWeight_ClaimDataFatRateBigChangeFragment", "setClaimDataConflictUserInfo conflictUserInfoList is null or empty");
            } else {
                saveConflictUserInfo(eauVar, listC.get(0));
            }
        }
    }

    @Override // com.huawei.ui.main.stories.health.fragment.ClaimMeasureDataFragment
    public void claimFinishAndChangeUi(boolean z, String str) {
        int i = this.f27878c + 1;
        this.f27878c = i;
        if (i == this.d) {
            super.claimFinishAndChangeUi(z, str);
            if (z) {
                this.f27878c = 0;
                removeItem();
                qpx.e(this.mActivity, this.mActivity.getString(R.string.IDS_hw_claim_save_success));
            }
        }
        if (z) {
            return;
        }
        this.f27878c = 0;
        super.claimFinishAndChangeUi(z, str);
        qpx.e(this.mActivity, R.string.IDS_update_server_bussy);
    }
}
