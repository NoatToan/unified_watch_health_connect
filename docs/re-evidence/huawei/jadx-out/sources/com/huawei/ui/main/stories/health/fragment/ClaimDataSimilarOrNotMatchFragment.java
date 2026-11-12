package com.huawei.ui.main.stories.health.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.wifi.control.claim.ClaimWeightDataManager;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.activity.healthdata.AddOrEditWeightUserActivity;
import com.huawei.ui.main.stories.health.activity.healthdata.ClaimMeasureDataActivity;
import com.huawei.ui.main.stories.health.adapter.ClaimMeasureDataAdapter;
import com.huawei.ui.main.stories.health.adapter.SelectUserAdapter;
import com.huawei.ui.main.stories.health.interactors.healthdata.SelectUserInterface;
import com.huawei.up.api.UpApi;
import defpackage.dnj;
import defpackage.eau;
import defpackage.eav;
import defpackage.era;
import defpackage.njy;
import defpackage.qpx;
import defpackage.vdo;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ClaimDataSimilarOrNotMatchFragment extends ClaimMeasureDataFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f27881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f27882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ClaimMeasureDataAdapter f27883c;
    private LinearLayout d;
    private View e;
    private String f = "";
    private int g;
    private ListView h;
    private HealthRecycleView i;
    private String j;
    private List<dnj> k;
    private dnj l;
    private LinearLayout m;
    private CustomViewDialog n;
    private SelectUserAdapter o;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_claim_data_similar_or_notmatch, viewGroup, false);
        a(viewInflate);
        b();
        return viewInflate;
    }

    private void b() {
        this.g = getArguments().getInt("pagetype");
        this.j = getArguments().getString("productId");
        if (this.g == 1) {
            this.f27881a.setText(this.mActivity.getString(R.string.IDS_hw_weight_similar_hint));
        } else {
            this.f27881a.setText(this.mActivity.getString(R.string.IDS_hw_claim_notmatch_hint, new Object[]{7}));
        }
        if (this.f27883c == null) {
            ClaimMeasureDataAdapter claimMeasureDataAdapter = new ClaimMeasureDataAdapter(getActivity(), this.mSelectUserInterface);
            this.f27883c = claimMeasureDataAdapter;
            this.i.setAdapter(claimMeasureDataAdapter);
        }
        setList();
    }

    private void a(View view) {
        this.i = (HealthRecycleView) view.findViewById(R.id.claim_weight_data_recycler_view);
        this.f27881a = (HealthTextView) view.findViewById(R.id.hw_health_data_claim_hint);
        this.f27882b = (LinearLayout) view.findViewById(R.id.hw_health_data_claim_layout);
        this.d = (LinearLayout) view.findViewById(R.id.hw_health_data_claim_empty_layout);
        this.i.b(false);
        this.i.e(false);
        this.i.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    @Override // com.huawei.ui.main.stories.health.fragment.ClaimMeasureDataFragment
    public void setUserInterfaceAndHandler(SelectUserInterface selectUserInterface, ClaimMeasureDataActivity.c cVar) {
        this.mSelectUserInterface = selectUserInterface;
        this.mClaimHandler = cVar;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.ClaimMeasureDataFragment
    public void setList() {
        ArrayList<eau> notMatchDataBean;
        ClaimMeasureDataAdapter claimMeasureDataAdapter = this.f27883c;
        if (claimMeasureDataAdapter != null) {
            claimMeasureDataAdapter.d();
            if (this.g == 1) {
                notMatchDataBean = ClaimWeightDataManager.INSTANCE.getSimilarWeightDataBean();
            } else {
                notMatchDataBean = ClaimWeightDataManager.INSTANCE.getNotMatchDataBean();
            }
            if (njy.b(notMatchDataBean)) {
                LogUtil.a("HealthWeight_ClaimDataSimilarOrNotMatchFragment", "initData claimWeightDataBean not Empty size = ", Integer.valueOf(notMatchDataBean.size()));
                f();
                this.f27883c.e(notMatchDataBean);
                return;
            }
            j();
            return;
        }
        j();
    }

    private void f() {
        this.f27882b.setVisibility(0);
        this.d.setVisibility(8);
    }

    private void j() {
        LinearLayout linearLayout = this.f27882b;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.d;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
    }

    @Override // com.huawei.ui.main.stories.health.fragment.ClaimMeasureDataFragment
    public int getListSize() {
        ClaimMeasureDataAdapter claimMeasureDataAdapter = this.f27883c;
        if (claimMeasureDataAdapter != null) {
            return claimMeasureDataAdapter.c();
        }
        return 0;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.ClaimMeasureDataFragment
    public void removeItem() {
        ClaimMeasureDataAdapter claimMeasureDataAdapter = this.f27883c;
        if (claimMeasureDataAdapter != null) {
            claimMeasureDataAdapter.e();
        }
    }

    @Override // com.huawei.ui.main.stories.health.fragment.ClaimMeasureDataFragment
    public void setAllChooseItem(boolean z) {
        ClaimMeasureDataAdapter claimMeasureDataAdapter = this.f27883c;
        if (claimMeasureDataAdapter != null) {
            claimMeasureDataAdapter.e(z);
        }
    }

    @Override // com.huawei.ui.main.stories.health.fragment.ClaimMeasureDataFragment
    public void claimMeasureData() {
        this.f = "";
        a();
    }

    @Override // com.huawei.ui.main.stories.health.fragment.ClaimMeasureDataFragment
    public void sendStartClaimWeightData() {
        Message messageObtain = Message.obtain();
        messageObtain.what = 4;
        int iD = this.o.d();
        if (njy.c(this.k, iD)) {
            this.l = this.k.get(iD);
            this.mClaimHandler.sendMessageDelayed(messageObtain, 200L);
        } else {
            LogUtil.e("HealthWeight_ClaimDataSimilarOrNotMatchFragment", "sendClaimWeight out of userList bound:", Integer.valueOf(iD));
        }
    }

    @Override // com.huawei.ui.main.stories.health.fragment.ClaimMeasureDataFragment
    public boolean saveWeightData() {
        if (g()) {
            ReleaseLogUtil.a("HealthWeight_ClaimDataSimilarOrNotMatchFragment", "unable to save weight data, return ");
            destroyLoadingDialog();
            return false;
        }
        ArrayList<eau> arrayListB = this.f27883c.b();
        LogUtil.a("HealthWeight_ClaimDataSimilarOrNotMatchFragment", "saveWeightData mBean size,", Integer.valueOf(arrayListB.size()));
        a(this.l, arrayListB);
        saveSingleUserWeightData(this.l, arrayListB);
        return true;
    }

    private boolean g() {
        if (!super.saveWeightData()) {
            LogUtil.j("HealthWeight_ClaimDataSimilarOrNotMatchFragment", "saveWeightData : Network is not Connected!");
            return true;
        }
        ClaimMeasureDataAdapter claimMeasureDataAdapter = this.f27883c;
        if (claimMeasureDataAdapter == null) {
            LogUtil.j("HealthWeight_ClaimDataSimilarOrNotMatchFragment", "saveWeightData mAdapter is null");
            return true;
        }
        if (!njy.e(claimMeasureDataAdapter.b())) {
            return false;
        }
        LogUtil.j("HealthWeight_ClaimDataSimilarOrNotMatchFragment", "selectedDatas is null or empty");
        return true;
    }

    private void a(dnj dnjVar, List<eau> list) {
        if (dnjVar == null || njy.e(list)) {
            return;
        }
        for (eau eauVar : list) {
            double dMin = Math.min(eauVar.d(), dnjVar.r());
            if (dMin != 0.0d && Math.abs(eauVar.d() - ((double) dnjVar.r())) / dMin >= 0.4d) {
                ReleaseLogUtil.e("HealthWeight_ClaimDataSimilarOrNotMatchFragment", "claim weight data may be wrong, diff = ", Double.valueOf(eauVar.d() - ((double) dnjVar.r())));
            }
        }
    }

    @Override // com.huawei.ui.main.stories.health.fragment.ClaimMeasureDataFragment
    public void deleteWeightData() {
        ClaimMeasureDataAdapter claimMeasureDataAdapter = this.f27883c;
        if (claimMeasureDataAdapter == null) {
            LogUtil.j("HealthWeight_ClaimDataSimilarOrNotMatchFragment", "deleteWeightData mAdapter is null");
            return;
        }
        ArrayList<eau> arrayListB = claimMeasureDataAdapter.b();
        if (njy.e(arrayListB)) {
            LogUtil.j("HealthWeight_ClaimDataSimilarOrNotMatchFragment", "deleteWeightData chooseDatas is null or empty");
        } else {
            deleteSelectedWeightData(arrayListB);
        }
    }

    @Override // com.huawei.ui.main.stories.health.fragment.ClaimMeasureDataFragment
    public void claimFinishAndChangeUi(boolean z, String str) {
        super.claimFinishAndChangeUi(z, str);
        if (z) {
            removeItem();
            String str2 = this.f;
            if (str2 == null || str2.equals(str)) {
                return;
            }
            this.f = str;
            qpx.e(this.mActivity, this.mActivity.getString(R.string.IDS_hw_weight_claim_data_add_data, new Object[]{str}));
            return;
        }
        qpx.e(this.mActivity, R.string.IDS_update_server_bussy);
    }

    private void e() {
        CustomViewDialog customViewDialog = this.n;
        if (customViewDialog != null) {
            customViewDialog.dismiss();
        }
    }

    private void a() {
        d();
        this.e = View.inflate(getActivity(), R.layout.select_user, null);
        c();
        CustomViewDialog customViewDialogD = new CustomViewDialog.Builder(getActivity()).b(R.string.IDS_hw_weight_claim_data_select_user).d(this.e).d(R.string.IDS_hw_common_ui_dialog_confirm, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.fragment.ClaimDataSimilarOrNotMatchFragment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ClaimDataSimilarOrNotMatchFragment.this.n.dismiss();
                int iD = ClaimDataSimilarOrNotMatchFragment.this.o.d();
                if (njy.c(ClaimDataSimilarOrNotMatchFragment.this.k, iD)) {
                    dnj dnjVar = (dnj) ClaimDataSimilarOrNotMatchFragment.this.k.get(iD);
                    if (dnjVar != null) {
                        ClaimDataSimilarOrNotMatchFragment.this.e(dnjVar);
                        return;
                    }
                    return;
                }
                LogUtil.e("HealthWeight_ClaimDataSimilarOrNotMatchFragment", "initDialog out of userList bound:", Integer.valueOf(iD));
            }
        }).c(R.string.IDS_hw_common_ui_dialog_cancel, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.fragment.ClaimDataSimilarOrNotMatchFragment.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ClaimDataSimilarOrNotMatchFragment.this.n.dismiss();
            }
        }).d();
        this.n = customViewDialogD;
        customViewDialogD.setCancelable(false);
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(dnj dnjVar) {
        ArrayList<eau> arrayListB = this.f27883c.b();
        if (njy.e(arrayListB)) {
            LogUtil.j("HealthWeight_ClaimDataSimilarOrNotMatchFragment", "deleteWeightData chooseDatas is null or empty");
            return;
        }
        String strD = d(dnjVar);
        boolean z = true;
        for (eau eauVar : arrayListB) {
            List<eav> listC = eauVar.c();
            if (njy.e(listC)) {
                LogUtil.j("HealthWeight_ClaimDataSimilarOrNotMatchFragment", "compareWeightDataUser conflictUserInfoList is empty");
            } else {
                LogUtil.a("HealthWeight_ClaimDataSimilarOrNotMatchFragment", "compareWeightDataUser conflictUserInfoList size is ", Integer.valueOf(listC.size()));
                Iterator<eav> it = listC.iterator();
                while (true) {
                    if (it.hasNext()) {
                        eav next = it.next();
                        if (TextUtils.equals(strD, next.r())) {
                            saveConflictUserInfo(eauVar, next);
                            break;
                        }
                    }
                }
            }
            z = false;
        }
        if (z) {
            LogUtil.a("HealthWeight_ClaimDataSimilarOrNotMatchFragment", "compareWeightDataUser isAllMatchUser = true");
            sendClaimWeight();
        } else {
            a(dnjVar);
        }
    }

    private void a(final dnj dnjVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeRange(0L, jCurrentTimeMillis);
        hiAggregateOption.setType(new int[]{10006});
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setSortOrder(1);
        LogUtil.a("HealthWeight_ClaimDataSimilarOrNotMatchFragment", "getChooseUserLastWeight userId:", CommonUtil.n(d(dnjVar)));
        hiAggregateOption.setFilter(d(dnjVar));
        hiAggregateOption.setCount(1);
        hiAggregateOption.setConstantsKey(new String[]{BleConstants.WEIGHT_KEY});
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: com.huawei.ui.main.stories.health.fragment.ClaimDataSimilarOrNotMatchFragment.2
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                LogUtil.a("HealthWeight_ClaimDataSimilarOrNotMatchFragment", "getChooseUserLastWeight onResult called");
                if (!njy.e(list)) {
                    ClaimDataSimilarOrNotMatchFragment.this.b(list, dnjVar);
                } else {
                    LogUtil.a("HealthWeight_ClaimDataSimilarOrNotMatchFragment", "getChooseUserLastWeight getWeight no data");
                    ClaimDataSimilarOrNotMatchFragment.this.b(null, dnjVar);
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
                LogUtil.a("HealthWeight_ClaimDataSimilarOrNotMatchFragment", "getChooseUserLastWeight onResultIntent called");
            }
        });
    }

    private String d(dnj dnjVar) {
        if (c(dnjVar)) {
            return "0";
        }
        return dnjVar.i();
    }

    private boolean c(dnj dnjVar) {
        String strI = dnjVar.i();
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (strI == null || "0".equals(strI) || "".equals(strI)) {
            LogUtil.a("HealthWeight_ClaimDataSimilarOrNotMatchFragment", "isMainUser");
            return true;
        }
        if (!Constants.NULL.equalsIgnoreCase(strI) && !strI.equals(accountInfo)) {
            return false;
        }
        LogUtil.a("HealthWeight_ClaimDataSimilarOrNotMatchFragment", "isMainUser");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<HiHealthData> list, dnj dnjVar) {
        if (njy.e(list)) {
            this.mClaimHandler.sendEmptyMessage(8);
            return;
        }
        double d = list.get(0).getDouble("bodyWeight");
        if (((int) d) == 0) {
            LogUtil.e("HealthWeight_ClaimDataSimilarOrNotMatchFragment", "comparisonWeightClaim weight : 0");
            this.mClaimHandler.sendEmptyMessage(8);
            return;
        }
        ClaimMeasureDataAdapter claimMeasureDataAdapter = this.f27883c;
        if (claimMeasureDataAdapter == null) {
            LogUtil.j("HealthWeight_ClaimDataSimilarOrNotMatchFragment", "compareWeightClaim mAdapter is null");
            return;
        }
        ArrayList<eau> arrayListB = claimMeasureDataAdapter.b();
        if (njy.e(arrayListB)) {
            LogUtil.j("HealthWeight_ClaimDataSimilarOrNotMatchFragment", "chooseDatas is null or empty");
            return;
        }
        Iterator<eau> it = arrayListB.iterator();
        while (it.hasNext()) {
            if (Math.abs(UnitUtil.c(d) - UnitUtil.c(it.next().d())) >= UnitUtil.a(5.0f)) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 7;
                messageObtain.obj = dnjVar;
                this.mClaimHandler.sendMessage(messageObtain);
                return;
            }
        }
        this.mClaimHandler.sendEmptyMessage(8);
    }

    private void c() {
        HealthTextView healthTextView = (HealthTextView) this.e.findViewById(R.id.tv_claim_weight_data_creat_user_info);
        this.h = (ListView) this.e.findViewById(R.id.lv_claim_weight_data_select_user);
        this.m = (LinearLayout) this.e.findViewById(R.id.ll_claim_weight_data_select_user);
        this.h.setAdapter((ListAdapter) this.o);
        if (this.o.getCount() >= 10) {
            healthTextView.setVisibility(8);
        }
        if (e(this.j)) {
            healthTextView.setVisibility(8);
        }
        healthTextView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.tv_claim_weight_data_creat_user_info) {
            Intent intent = new Intent(getActivity(), (Class<?>) AddOrEditWeightUserActivity.class);
            intent.putExtra("weight_user_id_key", "");
            intent.putExtra("claimWeightData", true);
            startActivityForResult(intent, 0);
        }
    }

    private void h() {
        CustomViewDialog customViewDialog = this.n;
        if (customViewDialog == null || customViewDialog.isShowing()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.m.getLayoutParams();
        layoutParams.height = a(this.h, this.o);
        layoutParams.width = -1;
        this.m.setLayoutParams(layoutParams);
        this.n.show();
    }

    private int a(ListView listView, BaseAdapter baseAdapter) {
        int iE = era.e(listView);
        Object systemService = getActivity().getSystemService(com.huawei.openalliance.ad.constant.Constants.NATIVE_WINDOW_SUB_DIR);
        if (!(systemService instanceof WindowManager)) {
            LogUtil.j("HealthWeight_ClaimDataSimilarOrNotMatchFragment", "calculateDialogHeight systemService is not WindowManager");
            return 0;
        }
        int height = (((WindowManager) systemService).getDefaultDisplay().getHeight() / 2) - vdo.b(getActivity(), 60.0f);
        if (iE >= height) {
            iE = height;
        }
        return iE + (baseAdapter.getCount() - 1);
    }

    private void d() {
        if (e(this.j)) {
            LogUtil.a("HealthWeight_ClaimDataSimilarOrNotMatchFragment", "herms only show main user");
            this.k = new ArrayList(16);
            dnj mainUser = MultiUsersManager.INSTANCE.getMainUser();
            if (mainUser == null) {
                LogUtil.j("HealthWeight_ClaimDataSimilarOrNotMatchFragment", "herms user is null");
                return;
            }
            if (TextUtils.isEmpty(mainUser.h())) {
                LogUtil.j("HealthWeight_ClaimDataSimilarOrNotMatchFragment", "herms user name is null");
                mainUser.e(new UpApi(getActivity()).getAccountName());
            }
            this.k.add(mainUser);
        } else {
            this.k = MultiUsersManager.INSTANCE.getMainAllUser();
        }
        this.o = new SelectUserAdapter(getActivity(), this.k);
        dnj currentUser = MultiUsersManager.INSTANCE.getCurrentUser();
        if (currentUser == null || TextUtils.isEmpty(currentUser.i())) {
            LogUtil.e("HealthWeight_ClaimDataSimilarOrNotMatchFragment", "user.getUUIDOfUser() or user is null");
            return;
        }
        for (int i = 0; i < this.k.size(); i++) {
            if (currentUser.i().equals(this.k.get(i).i())) {
                this.o.e(i);
                return;
            }
        }
    }

    private boolean e(String str) {
        return !TextUtils.isEmpty(str) && "e835d102-af95-48a6-ae13-2983bc06f5c0".equals(str);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 1) {
            if (intent == null) {
                LogUtil.a("HealthWeight_ClaimDataSimilarOrNotMatchFragment", "onActivityResult mCurrentClaimMeasureData is null or data is null");
                return;
            }
            e();
            String stringExtra = intent.getStringExtra(HwPayConstant.KEY_USER_ID);
            if (TextUtils.isEmpty(stringExtra)) {
                LogUtil.a("HealthWeight_ClaimDataSimilarOrNotMatchFragment", "onActivityResult userId is null");
                return;
            }
            dnj singleUserById = MultiUsersManager.INSTANCE.getSingleUserById(stringExtra);
            if (singleUserById == null) {
                LogUtil.a("HealthWeight_ClaimDataSimilarOrNotMatchFragment", "onActivityResult user is null");
                return;
            }
            if (isConnectNetWork()) {
                this.l = singleUserById;
                Message messageObtain = Message.obtain();
                messageObtain.what = 5;
                messageObtain.arg1 = 0;
                this.mClaimHandler.sendMessage(messageObtain);
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 4;
                messageObtain2.obj = singleUserById;
                this.mClaimHandler.sendMessageDelayed(messageObtain2, 200L);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.f27883c != null) {
            this.f27883c = null;
        }
        if (this.k != null) {
            this.k = null;
        }
        if (this.o != null) {
            this.o = null;
        }
    }
}
